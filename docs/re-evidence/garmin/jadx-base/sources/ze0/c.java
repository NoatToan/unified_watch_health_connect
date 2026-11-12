package ze0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lp.k;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.domainfeedback.domain.GetFeedbackSnackbarMessageUseCase$invoke$1", f = "GetFeedbackSnackbarMessageUseCase.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<t<? super String>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f204264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f204264c = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f204264c, dVar);
        cVar.f204263b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super String> tVar, d<? super Unit> dVar) {
        return ((c) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f204263b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204262a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = this.f204264c;
            String strA4 = bVar.f204261a.A4("FEEDBACK_SNACKBAR_MESSAGE", null);
            a2 a2Var = a2.DASHBOARD;
            String strN = fb1.c.n("feedback snackbar message: ", strA4);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GetFeedbackSnackbarMessageUseCase", strN);
            tVar.i(strA4);
            k kVar = new k(bVar, tVar, 9);
            bVar.f204261a.u3(kVar);
            z10.d dVar = new z10.d(13, bVar, kVar);
            this.f204263b = null;
            this.f204262a = 1;
            if (q53.r.a(tVar, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
