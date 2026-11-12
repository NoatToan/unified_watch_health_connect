package defpackage;

import android.emcom.IOneHopAppCallback;
import android.emcom.IOneHopAuthReqCallback;

/* JADX INFO: loaded from: classes12.dex */
public class ohc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ohc f44307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ogy f44308c;

    private ohc() {
        if (f44308c == null) {
            f44308c = ogy.e();
        }
    }

    public static ohc d() {
        ohc ohcVar;
        synchronized (ohc.class) {
            if (f44307b == null) {
                f44307b = new ohc();
            }
            ohcVar = f44307b;
        }
        return ohcVar;
    }

    public int c(String str, int i, IOneHopAppCallback.Stub stub) {
        return f44308c.c(str, i, stub);
    }

    public String a() {
        return f44308c.a();
    }

    public int b(String str, IOneHopAuthReqCallback.Stub stub) {
        return f44308c.c(str, stub);
    }
}
