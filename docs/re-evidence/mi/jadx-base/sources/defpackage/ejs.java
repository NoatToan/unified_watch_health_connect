package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class ejs extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h3s f16717a;

    public ejs(h3s h3sVar) {
        this.f16717a = h3sVar;
    }

    @Override // k5s.a
    public String a() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f16717a.a() > 0) {
            this.f16717a.f19662a.execute(new nns(this));
        }
    }
}
