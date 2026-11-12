package wb2;

/* JADX INFO: loaded from: classes11.dex */
public class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f183989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f183990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f183991c;

    public e0(d0 d0Var, v vVar, String str) {
        this.f183991c = d0Var;
        this.f183989a = vVar;
        this.f183990b = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        d0 d0Var = this.f183991c;
        q0 q0Var = d0Var.f183976q;
        v vVar = this.f183989a;
        boolean zC = q0Var.c(vVar.j());
        d0Var.f183902a.debug("get response :" + zC);
        q0 q0Var2 = d0Var.f183976q;
        if (zC) {
            q0Var2.e(vVar.j(), this.f183990b);
        } else {
            q0Var2.getClass();
        }
        ic2.a.b().a();
        p0.b().a();
    }
}
