package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class lk implements Runnable {
    public final /* synthetic */ li d;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.d.e();
        } catch (Exception e) {
            ln.c(e);
        }
    }

    public lk(li liVar) {
        this.d = liVar;
    }
}
