package ru.tinkoff.commons.util.syntax

import java.io.CharArrayReader

import javax.xml.parsers.DocumentBuilderFactory
import org.xml.sax.InputSource

import scala.xml.{Node, Utility}

final class ScalaNodeOps(val n: Node) extends AnyVal {
  def toJavaDocument: org.w3c.dom.Document = {
    val dbf = DocumentBuilderFactory.newInstance()
    dbf.setNamespaceAware(true)

    val stringBuilder = Utility.serialize(n, preserveWhitespace = true)

    dbf.newDocumentBuilder().parse(new InputSource(new CharArrayReader(stringBuilder.toArray)))
  }
}
