package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

/* JADX INFO: loaded from: classes7.dex */
public class UrlCssBuilder implements CssBuilder {
    String url = "http://logback.qos.ch/css/classic.css";

    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb3) {
        sb3.append("<link REL=StyleSheet HREF=\"");
        sb3.append(this.url);
        sb3.append("\" TITLE=\"Basic\" />");
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
