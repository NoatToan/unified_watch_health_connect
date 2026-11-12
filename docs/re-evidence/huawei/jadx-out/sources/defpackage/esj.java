package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class esj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static esj f33412c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33413a = false;
    private boolean e;

    public static esj c() {
        esj esjVar;
        synchronized (d) {
            if (f33412c == null) {
                f33412c = new esj();
            }
            esjVar = f33412c;
        }
        return esjVar;
    }

    public void a(boolean z) {
        LogUtil.a("TransferParamsHelper", " setJumpVibrantLifePage isJumpVibrantLifePage：", Boolean.valueOf(z));
        this.f33413a = z;
    }

    public boolean a() {
        return this.f33413a;
    }

    public boolean b() {
        return this.e;
    }

    public static void d() {
        synchronized (d) {
            f33412c = null;
        }
    }
}
