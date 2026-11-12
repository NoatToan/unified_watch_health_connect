package ch.qos.logback.classic.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.CssBuilder;
import sn.a;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultCssBuilder implements CssBuilder {
    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb3) {
        sb3.append("<style  type=\"text/css\">");
        String str = CoreConstants.LINE_SEPARATOR;
        a.t(sb3, str, "table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }", str, "TR.even { background: #FFFFFF; }");
        a.t(sb3, str, "TR.odd { background: #EAEAEA; }", str, "TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }");
        a.t(sb3, str, "TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }", str, "TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }");
        a.t(sb3, str, "TD.Thread { text-align: left; }", str, "TD.Level { text-align: right; }");
        a.t(sb3, str, "TD.Logger { text-align: left; }", str, "TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }");
        a.t(sb3, str, "TD.Exception { background: #A2AEE8; font-family: courier, monospace;}", str, "</style>");
        sb3.append(str);
    }
}
