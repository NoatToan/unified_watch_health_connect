package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class aws extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zvs f3527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aws(zvs zvsVar, String str) {
        super(str);
        this.f3527a = zvsVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f3527a.E.c();
        } catch (Exception e) {
            this.f3527a.Q(9, e);
        }
    }
}
