package ji2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/d0;", "Lc83/f;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 implements c83.f<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f98847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ni2.a<Unit> f98848b;

    public d0(a0 a0Var, ni2.a<Unit> aVar) {
        this.f98847a = a0Var;
        this.f98848b = aVar;
    }

    @Override // c83.f
    public final void a(c83.d<Unit> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        this.f98847a.f98831c.b("saveUserCriticalSwimSpeed: Failed to save data with status .");
        this.f98848b.b("Error in saving user critical swim speed!", new Throwable("Operation failed"));
    }

    @Override // c83.f
    public final void c(c83.d<Unit> dVar, c83.a0<Unit> a0Var) {
        dVar.getClass();
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        ni2.a<Unit> aVar = this.f98848b;
        a0 a0Var2 = this.f98847a;
        if (zIsSuccessful) {
            a0Var2.f98831c.getClass();
            aVar.onSuccess(Unit.INSTANCE);
        } else {
            a0Var2.f98831c.b("saveUserCriticalSwimSpeed: Failed to save data with status .");
            aVar.b("Error in saving user critical swim speed!", new Throwable("Operation failed"));
        }
    }
}
