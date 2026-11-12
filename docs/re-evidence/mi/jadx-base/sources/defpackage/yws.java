package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class yws implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sws f40652b;

    public yws(sws swsVar, String str) {
        this.f40652b = swsVar;
        this.f40651a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        wjs.c().b(this.f40651a, true);
    }
}
