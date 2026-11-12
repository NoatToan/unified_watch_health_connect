package jj;

/* JADX INFO: loaded from: classes7.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f98944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.c.a f98945b;

    public t(s.c.a aVar, boolean z14) {
        this.f98945b = aVar;
        this.f98944a = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s.c.a aVar = this.f98945b;
        aVar.getClass();
        qj.m.a();
        s.c cVar = s.c.this;
        boolean z14 = cVar.f98939a;
        boolean z15 = this.f98944a;
        cVar.f98939a = z15;
        if (z14 != z15) {
            cVar.f98940b.a(z15);
        }
    }
}
