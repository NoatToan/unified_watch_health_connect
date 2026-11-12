package z10;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Ld20/f;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ThirdPartyAccountConsentViewModel$getThirdPartyConsentText$1", f = "ThirdPartyAccountConsentViewModel.kt", l = {41, 43, 48}, m = "invokeSuspend", v = 2)
public final class c3 extends v13.i implements e23.p<androidx.lifecycle.t0<d20.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d20.f f200939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f200940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d20.f f200941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d20.f f200942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f200943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f200944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f200945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q92.x f200946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f200947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(q92.x xVar, String str, t13.d<? super c3> dVar) {
        super(2, dVar);
        this.f200946h = xVar;
        this.f200947i = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c3 c3Var = new c3(this.f200946h, this.f200947i, dVar);
        c3Var.f200945g = obj;
        return c3Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<d20.f> t0Var, t13.d<? super Unit> dVar) {
        return ((c3) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r0.emit(r3, r11) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i14;
        d20.f fVar;
        d20.f fVar2;
        d20.f fVar3;
        d20.f fVar4;
        com.garmin.android.apps.connectmobile.v2 v2Var;
        d20.d dVar;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f200945g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f200944f;
        if (i15 == 0) {
            o13.r.b(obj);
            d20.f fVar5 = new d20.f(null, null, 3, null);
            p92.o oVar = p92.o.f136619a;
            this.f200945g = t0Var;
            this.f200939a = fVar5;
            str = this.f200947i;
            this.f200940b = str;
            this.f200941c = fVar5;
            this.f200942d = fVar5;
            i14 = 0;
            this.f200943e = 0;
            this.f200944f = 1;
            Object objF = oVar.f(this.f200946h, Locale.getDefault(), this);
            if (objF != aVar) {
                fVar = fVar5;
                fVar2 = fVar;
                obj = objF;
                fVar3 = fVar2;
            }
            return aVar;
        }
        if (i15 == 1) {
            int i16 = this.f200943e;
            fVar = this.f200942d;
            d20.f fVar6 = this.f200941c;
            str = this.f200940b;
            fVar2 = this.f200939a;
            o13.r.b(obj);
            i14 = i16;
            fVar3 = fVar6;
        } else if (i15 == 2) {
            fVar3 = this.f200941c;
            fVar4 = this.f200939a;
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                dVar = (d20.d) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            } else {
                dVar = null;
            }
            fVar3.f57284b = dVar;
            this.f200945g = null;
            this.f200939a = null;
            this.f200940b = null;
            this.f200941c = null;
            this.f200944f = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        fVar.f57283a = (s92.g) obj;
        e20.a aVarA = e20.a.C1315a.a(e20.a.f62587b);
        this.f200945g = t0Var;
        this.f200939a = fVar2;
        this.f200940b = null;
        this.f200941c = fVar3;
        this.f200942d = null;
        this.f200943e = i14;
        this.f200944f = 2;
        obj = aVarA.b(str, this);
        if (obj != aVar) {
            fVar4 = fVar2;
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                dVar = (d20.d) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            } else {
                dVar = null;
            }
            fVar3.f57284b = dVar;
            this.f200945g = null;
            this.f200939a = null;
            this.f200940b = null;
            this.f200941c = null;
            this.f200944f = 3;
        }
        return aVar;
    }
}
