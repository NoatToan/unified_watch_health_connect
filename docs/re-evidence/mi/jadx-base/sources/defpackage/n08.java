package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class n08 {
    private String appId;
    private String appName;
    private String deviceId;
    private String requestId;
    private long timestamp;
    private String userAgent;
    private p08 userInfo = new p08();
    private m08 device = new m08();
    private l08 context = new l08();
    private o08 session = new o08();

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public l08 getContext() {
        return this.context;
    }

    public m08 getDevice() {
        return this.device;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public o08 getSession() {
        return this.session;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public p08 getUserInfo() {
        return this.userInfo;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
