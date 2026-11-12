package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public class bbx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static bbx f956c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bci f958b = new bci();
    private bco e = new bco();

    private bbx(Context context) {
        this.f957a = context;
    }

    public static bbx e(Context context) {
        bbx bbxVar;
        synchronized (d) {
            if (f956c == null) {
                f956c = new bbx(context);
            }
            bbxVar = f956c;
        }
        return bbxVar;
    }

    public void a() {
        bcw.c("PreReportHelper", "clearAll");
        if (this.f958b == null) {
            this.f958b = new bci();
        }
        this.f958b.e();
        bdc.e(this.f957a).e();
    }
}
