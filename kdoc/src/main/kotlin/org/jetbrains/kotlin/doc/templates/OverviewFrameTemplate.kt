package org.jetbrains.kotlin.doc.templates

import std.*
import org.jetbrains.kotlin.template.*
import std.io.*
import std.util.*
import java.util.*
import org.jetbrains.kotlin.model.KModel

class OverviewFrameTemplate(val model: KModel) : KDocTemplate() {
    override fun render() {
        // TODO could really do with templates in multi-line strings :)
        println("""<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--NewPage-->
<HTML>
<HEAD>""")
        println("<!-- Generated by kdoc (${model.version}) on ${Date()} -->")
        println("""<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>""")
        println("Overview List (${model.title})")
        print("""</TITLE>

<META NAME="date" CONTENT="2012-01-09">
<LINK REL ="stylesheet" TYPE="text/css" HREF="stylesheet.css" TITLE="Style">
</HEAD>

<BODY BGCOLOR="white">

<TABLE BORDER="0" WIDTH="100%" SUMMARY="">
<TR>
<TH ALIGN="left" NOWRAP><FONT size="+1" CLASS="FrameTitleFont">
<B></B></FONT></TH>
</TR>
</TABLE>

<TABLE BORDER="0" WIDTH="100%" SUMMARY="">
<TR>
<TD NOWRAP><FONT CLASS="FrameItemFont"><A HREF="allclasses-frame.html" target="packageFrame">All Classes</A></FONT>
<P>
<FONT size="+1" CLASS="FrameHeadingFont">
Packages</FONT>
<BR>""")
        for (p in model.packages) {
            println("<FONT CLASS=\"FrameItemFont\"><A HREF=\"${p.nameAsPath}/package-frame.html\" target=\"packageFrame\">${p.name}</A></FONT>")
            println("<BR>")
        }
        println("""</TD>
</TR>
</TABLE>

<P>
&nbsp;
</BODY>
</HTML>
""")
    }
}
