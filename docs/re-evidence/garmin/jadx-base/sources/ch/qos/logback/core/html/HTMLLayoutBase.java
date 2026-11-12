package ch.qos.logback.core.html;

import am.j;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ScanException;
import i3.e5;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import sn.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    protected CssBuilder cssBuilder;
    protected Converter<E> head;
    protected String pattern;
    protected String title = "Logback Log Messages";
    protected long counter = 0;

    private void buildHeaderRowForTable(StringBuilder sb3) {
        sb3.append("<tr class=\"header\">");
        sb3.append(CoreConstants.LINE_SEPARATOR);
        for (Converter<E> next = this.head; next != null; next = next.getNext()) {
            if (computeConverterName(next) != null) {
                sb3.append("<td class=\"");
                sb3.append(computeConverterName(next));
                sb3.append("\">");
                sb3.append(computeConverterName(next));
                sb3.append("</td>");
                sb3.append(CoreConstants.LINE_SEPARATOR);
            }
        }
        sb3.append("</tr>");
        sb3.append(CoreConstants.LINE_SEPARATOR);
    }

    public String computeConverterName(Converter<E> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int iIndexOf = simpleName.indexOf("Converter");
        return iIndexOf == -1 ? simpleName : simpleName.substring(0, iIndexOf);
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/html";
    }

    public CssBuilder getCssBuilder() {
        return this.cssBuilder;
    }

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap map2 = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            map2.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject(CoreConstants.PATTERN_RULE_REGISTRY)) != null) {
            map2.putAll(map);
        }
        return map2;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileFooter() {
        return j.o(CoreConstants.LINE_SEPARATOR, "</body></html>", new StringBuilder());
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileHeader() {
        StringBuilder sbK = e5.k("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        String str = CoreConstants.LINE_SEPARATOR;
        a.t(sbK, str, "<html>", str, "  <head>");
        sbK.append(str);
        sbK.append("    <title>");
        j.y(sbK, this.title, "</title>", str);
        this.cssBuilder.addCss(sbK);
        sbK.append(str);
        sbK.append("  </head>");
        sbK.append(str);
        return j.o("<body>", str, sbK);
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return "</table>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        StringBuilder sbK = e5.k("<hr/>");
        String str = CoreConstants.LINE_SEPARATOR;
        sbK.append(str);
        sbK.append("<p>Log session start time ");
        sbK.append(new Date());
        sbK.append("</p><p></p>");
        sbK.append(str);
        j.y(sbK, str, "<table cellspacing=\"0\">", str);
        buildHeaderRowForTable(sbK);
        return sbK.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setCssBuilder(CssBuilder cssBuilder) {
        this.cssBuilder = cssBuilder;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            Parser parser = new Parser(this.pattern);
            parser.setContext(getContext());
            Converter<E> converterCompile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = converterCompile;
            ConverterUtil.startConverters(converterCompile);
            this.started = true;
        } catch (ScanException e4) {
            addError("Incorrect pattern found", e4);
        }
    }

    public void startNewTableIfLimitReached(StringBuilder sb3) {
        if (this.counter >= AbstractComponentTracker.LINGERING_TIMEOUT) {
            this.counter = 0L;
            sb3.append("</table>");
            String str = CoreConstants.LINE_SEPARATOR;
            a.t(sb3, str, "<p></p>", "<table cellspacing=\"0\">", str);
            buildHeaderRowForTable(sb3);
        }
    }
}
