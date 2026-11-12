package com.dianping.logan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class CLoganProtocol implements LoganProtocolHandler {
    private static final String e = "logan";
    private static CLoganProtocol f;
    private static boolean g;
    private boolean a;
    private boolean b;
    private OnLoganProtocolStatus c;
    private Set<Integer> d = Collections.synchronizedSet(new HashSet());

    static {
        try {
            if (!Util.loadLibrary(e, CLoganProtocol.class)) {
                System.loadLibrary(e);
            }
            g = true;
        } catch (Throwable th) {
            th.printStackTrace();
            g = false;
        }
    }

    public static boolean a() {
        return g;
    }

    private void b(String str, int i) {
        if (i < 0) {
            if (ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS.endsWith(str) && i != -4060) {
                if (this.d.contains(Integer.valueOf(i))) {
                    return;
                } else {
                    this.d.add(Integer.valueOf(i));
                }
            }
            OnLoganProtocolStatus onLoganProtocolStatus = this.c;
            if (onLoganProtocolStatus != null) {
                onLoganProtocolStatus.loganProtocolStatus(str, i);
            }
        }
    }

    public static CLoganProtocol c() {
        if (f == null) {
            synchronized (CLoganProtocol.class) {
                if (f == null) {
                    f = new CLoganProtocol();
                }
            }
        }
        return f;
    }

    private native void clogan_debug(boolean z);

    private native void clogan_flush();

    private native int clogan_init(String str, String str2, int i, String str3, String str4);

    private native int clogan_open(String str);

    private native int clogan_write(int i, String str, long j, String str2, long j2, int i2);

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_debug(boolean z) {
        if (this.a && g) {
            try {
                clogan_debug(z);
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_flush() {
        if (this.b && g) {
            try {
                clogan_flush();
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_init(String str, String str2, int i, String str3, String str4) {
        if (this.a) {
            return;
        }
        if (!g) {
            b(ConstantCode.CloganStatus.CLOGAN_LOAD_SO, ConstantCode.CloganStatus.CLOGAN_LOAD_SO_FAIL);
            return;
        }
        try {
            int iClogan_init = clogan_init(str, str2, i, str3, str4);
            this.a = true;
            b(ConstantCode.CloganStatus.CLGOAN_INIT_STATUS, iClogan_init);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            b(ConstantCode.CloganStatus.CLGOAN_INIT_STATUS, ConstantCode.CloganStatus.CLOGAN_INIT_FAIL_JNI);
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_open(String str) {
        if (this.a && g) {
            try {
                int iClogan_open = clogan_open(str);
                this.b = true;
                b(ConstantCode.CloganStatus.CLOGAN_OPEN_STATUS, iClogan_open);
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                b(ConstantCode.CloganStatus.CLOGAN_OPEN_STATUS, ConstantCode.CloganStatus.CLOGAN_OPEN_FAIL_JNI);
            }
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void logan_write(int i, String str, long j, String str2, long j2, boolean z) {
        if (this.b && g) {
            try {
                int iClogan_write = clogan_write(i, str, j, str2, j2, z ? 1 : 0);
                if (iClogan_write != -4010 || Logan.c) {
                    b(ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS, iClogan_write);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                b(ConstantCode.CloganStatus.CLOGAN_WRITE_STATUS, ConstantCode.CloganStatus.CLOGAN_WRITE_FAIL_JNI);
            }
        }
    }

    @Override // com.dianping.logan.LoganProtocolHandler
    public void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.c = onLoganProtocolStatus;
    }
}
