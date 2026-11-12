package zn2;

import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s0 implements e23.l<c83.a0<Unit>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f205805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.j<Boolean> f205806b;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(long j8, o53.j<? super Boolean> jVar) {
        this.f205805a = j8;
        this.f205806b = jVar;
    }

    @Override // e23.l
    public final Unit invoke(c83.a0<Unit> a0Var) {
        c83.a0<Unit> a0Var2 = a0Var;
        u0.f205864a.getClass();
        u0.i().debug("removeDeviceFromUser: unitId " + this.f205805a + ", server response " + a0Var2.f25745a.code());
        Response response = a0Var2.f25745a;
        boolean zIsSuccessful = response.isSuccessful();
        o53.j<Boolean> jVar = this.f205806b;
        if (zIsSuccessful || response.code() == 400) {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(Boolean.TRUE);
        } else {
            int i15 = o13.q.f128596b;
            jVar.resumeWith(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
