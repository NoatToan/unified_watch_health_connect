package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class hgs extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yfs f20060a;

    public hgs(yfs yfsVar) {
        this.f20060a = yfsVar;
    }

    @Override // k5s.a
    public String a() {
        return "10054";
    }

    @Override // java.lang.Runnable
    public void run() {
        x9s.B("exec== DbSizeControlJob");
        ths.b(this.f20060a.e).e(new sgs(this.f20060a.n(), new WeakReference(this.f20060a.e)));
        this.f20060a.m("check_time");
    }
}
