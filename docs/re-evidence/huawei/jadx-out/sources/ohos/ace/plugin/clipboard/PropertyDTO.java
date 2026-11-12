package ohos.ace.plugin.clipboard;

/* JADX INFO: loaded from: classes46.dex */
public class PropertyDTO {
    private String[] mimeTypes = null;
    private String tag = null;
    private long timeStamp = 0;
    private String jsonAdditions = null;

    public void setMimeTypes(String[] strArr) {
        this.mimeTypes = strArr;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTimestamp(long j) {
        this.timeStamp = j;
    }

    public void setJsonAdditions(String str) {
        this.jsonAdditions = str;
    }

    public String[] getMimeTypes() {
        return this.mimeTypes;
    }

    public String getTag() {
        return this.tag;
    }

    public long getTimestamp() {
        return this.timeStamp;
    }

    public String getJsonAdditions() {
        return this.jsonAdditions;
    }
}
