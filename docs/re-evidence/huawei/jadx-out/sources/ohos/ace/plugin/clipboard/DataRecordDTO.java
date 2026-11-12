package ohos.ace.plugin.clipboard;

/* JADX INFO: loaded from: classes46.dex */
public class DataRecordDTO {
    private String mimeType = null;
    private String htmlText = null;
    private String jsonWant = null;
    private String plainText = null;
    private String uri = null;

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setHtmlText(String str) {
        this.htmlText = str;
    }

    public void setJsonWant(String str) {
        this.jsonWant = str;
    }

    public void setPlainText(String str) {
        this.plainText = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getHtmlText() {
        return this.htmlText;
    }

    public String getJsonWant() {
        return this.jsonWant;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getUri() {
        return this.uri;
    }
}
