package v92;

import androidx.lifecycle.y0;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$revokeConsent$1", f = "ConsentViewModel.kt", l = {309, 317}, m = "invokeSuspend")
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f176546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f176548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f176549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q92.x f176550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s92.g f176551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f176552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r rVar, q92.x xVar, s92.g gVar, String str, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f176549d = rVar;
        this.f176550e = xVar;
        this.f176551f = gVar;
        this.f176552g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f176549d, this.f176550e, this.f176551f, this.f176552g, dVar);
        zVar.f176548c = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        y0<d0> y0Var;
        d0 aVar;
        d0 bVar;
        y0<d0> y0Var2;
        q92.a0 a0Var;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176547b;
        r rVar = this.f176549d;
        q92.x xVar = this.f176550e;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f176548c;
            y0Var = rVar.f176472g;
            q92.f fVar = rVar.f176466a;
            s92.l lVar = rVar.f176469d;
            this.f176548c = b0Var;
            this.f176546a = y0Var;
            this.f176547b = 1;
            obj = ge1.b.e0(fVar.f143631d.f143828c, new q92.q(this.f176550e, fVar, this.f176551f, this.f176552g, lVar, null), this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            y0Var = this.f176546a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var2 = (y0) this.f176548c;
            o13.r.b(obj);
        }
        a0Var = (q92.a0) obj;
        if (a0Var instanceof q92.a0.b) {
            bVar = new d0.b(xVar, q92.y.OPT_OUT, f0.DISABLED);
        } else {
            if (a0Var instanceof q92.a0.a) {
                u0.r();
                return null;
            }
            bVar = new d0.b(xVar, q92.y.OPT_OUT, f0.UPDATE_FAILED);
        }
        y0Var = y0Var2;
        y0Var.m(bVar);
        return Unit.INSTANCE;
        q92.a0 a0Var2 = (q92.a0) obj;
        if (a0Var2 instanceof q92.a0.b) {
            q92.y yVar = q92.y.OPT_OUT;
            r.A4(rVar, xVar, yVar);
            if (xVar == q92.x.DI_CONNECT_UPLOAD && rVar.f176469d == null) {
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentFeatureViewModel", "Update device upload consent, alongside " + xVar + ", new value = false");
                q92.f fVar2 = rVar.f176466a;
                this.f176548c = y0Var;
                this.f176546a = null;
                this.f176547b = 2;
                obj = fVar2.f(false, true, this);
                if (obj != aVar2) {
                    y0Var2 = y0Var;
                    a0Var = (q92.a0) obj;
                    if (a0Var instanceof q92.a0.b) {
                        bVar = new d0.b(xVar, q92.y.OPT_OUT, f0.DISABLED);
                    } else {
                        if (a0Var instanceof q92.a0.a) {
                            u0.r();
                            return null;
                        }
                        bVar = new d0.b(xVar, q92.y.OPT_OUT, f0.UPDATE_FAILED);
                    }
                    y0Var = y0Var2;
                    y0Var.m(bVar);
                    return Unit.INSTANCE;
                }
                return aVar2;
            }
            aVar = new d0.b(xVar, yVar, f0.NO_UPDATE);
        } else {
            if (!(a0Var2 instanceof q92.a0.a)) {
                u0.r();
                return null;
            }
            aVar = new d0.a(new e.b(xVar, ((q92.a0.a) a0Var2).f143608a), new ug2.k(rVar, xVar, this.f176551f, this.f176552g, 3));
        }
        bVar = aVar;
        y0Var.m(bVar);
        return Unit.INSTANCE;
    }
}
