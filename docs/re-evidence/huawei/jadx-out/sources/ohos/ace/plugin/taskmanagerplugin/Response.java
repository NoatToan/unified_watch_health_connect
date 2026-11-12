package ohos.ace.plugin.taskmanagerplugin;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class Response {
    private Map<String, List<String>> headers;
    private String reason;
    private int statusCode;
    private String version;

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }
}
