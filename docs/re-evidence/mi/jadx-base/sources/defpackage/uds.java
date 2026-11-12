package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class uds extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f35668a;

    public uds(Context context) {
        this.f35668a = context;
    }

    private boolean b() {
        return h3s.e(this.f35668a).c().g();
    }

    @Override // k5s.a
    public String a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (b()) {
                x9s.B(this.f35668a.getPackageName() + " begin upload event");
                h3s.e(this.f35668a).s();
            }
        } catch (Exception e) {
            x9s.s(e);
        }
    }
}
