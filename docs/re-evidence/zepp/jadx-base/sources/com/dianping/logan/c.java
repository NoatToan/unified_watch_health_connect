package com.dianping.logan;

/* JADX INFO: loaded from: classes2.dex */
class c implements LoganProtocolHandler {
    private static c d;
    private LoganProtocolHandler a;
    private boolean b;
    private OnLoganProtocolStatus c;

    private c() {
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                d = new c();
            }
        }
        return d;
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_debug(boolean z) {
        LoganProtocolHandler loganProtocolHandler = this.a;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_debug(z);
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_flush() {
        LoganProtocolHandler loganProtocolHandler = this.a;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_flush();
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_init(String str, String str2, int i, String str3, String str4) {
        if (this.b) {
            return;
        }
        if (!CLoganProtocol.a()) {
            this.a = null;
            return;
        }
        CLoganProtocol cLoganProtocolC = CLoganProtocol.c();
        this.a = cLoganProtocolC;
        cLoganProtocolC.setOnLoganProtocolStatus(this.c);
        this.a.logan_init(str, str2, i, str3, str4);
        this.b = true;
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_open(String str) {
        LoganProtocolHandler loganProtocolHandler = this.a;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_open(str);
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_write(int i, String str, long j, String str2, long j2, boolean z) {
        LoganProtocolHandler loganProtocolHandler = this.a;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_write(i, str, j, str2, j2, z);
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.c = onLoganProtocolStatus;
    }
}
