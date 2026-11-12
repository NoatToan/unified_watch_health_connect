package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class yds extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40082a;

    public yds(Context context) {
        this.f40082a = context;
    }

    private boolean b() {
        return h3s.e(this.f40082a).c().h();
    }

    @Override // k5s.a
    public String a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (b()) {
                h3s.e(this.f40082a).w();
                x9s.B(this.f40082a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            x9s.D("fail to send perf data. " + e);
        }
    }
}
