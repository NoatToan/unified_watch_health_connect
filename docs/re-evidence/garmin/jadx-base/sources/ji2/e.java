package ji2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/e;", "Lc83/f;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements c83.f<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<Unit> f98849a;

    public e(ni2.a<Unit> aVar) {
        this.f98849a = aVar;
    }

    @Override // c83.f
    public final void a(c83.d<Unit> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        c.f98838d.b("Step Length is mandatory. No Step Length to save, so not saving.");
        this.f98849a.a();
    }

    @Override // c83.f
    public final void c(c83.d<Unit> dVar, c83.a0<Unit> a0Var) {
        dVar.getClass();
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        ni2.a<Unit> aVar = this.f98849a;
        if (zIsSuccessful) {
            aVar.onSuccess(Unit.INSTANCE);
        } else {
            c.f98838d.b("Step Length is mandatory. No Step Length to save, so not saving.");
            aVar.a();
        }
    }
}
