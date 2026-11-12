package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum wt {
    UNKNOWN,
    SCANNING,
    SCAN_SUCCESS,
    SCAN_FAIL,
    GATT_CONNECTING,
    GATT_CONNECT_FAILED,
    GATT_DISCONNECT,
    GATT_CONNECTED,
    DISCOVERY_START,
    DISCOVERY_SUCCESS,
    DISCOVERY_FAILED,
    INIT_START,
    INIT_FAILED,
    INIT_SUCCESS,
    AUTH_START,
    AUTH_PROTOCOL_SUCCESS,
    SET_TIME_SUCCESS,
    GET_DEVICE_INFO_SUCCESS,
    AUTH_FAILED,
    AUTH_SUCCESS_WITHOUT_DEVICE_INFO,
    AUTH_SUCCESS,
    DISCONNECTED,
    CONNECTING_TIMEOUT;

    public int t = 0;
    public AuthResult u = null;
    public gr v = gr.NORMAL;
    public boolean w = true;
    public String x = "default";

    wt() {
    }

    public wt a(String str) {
        this.x = str;
        return this;
    }

    public boolean b() {
        return this == AUTH_PROTOCOL_SUCCESS || this == SET_TIME_SUCCESS || this == GET_DEVICE_INFO_SUCCESS;
    }

    public wt a(AuthResult authResult) {
        this.u = authResult;
        return this;
    }

    public wt a(gr grVar) {
        this.v = grVar;
        return this;
    }

    public int a() {
        return this.t;
    }

    public wt a(int i) {
        this.t = i;
        return this;
    }

    public wt a(boolean z) {
        this.w = z;
        return this;
    }
}
