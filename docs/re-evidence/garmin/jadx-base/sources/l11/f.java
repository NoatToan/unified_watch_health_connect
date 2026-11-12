package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import g01.d0;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$refreshCustomFoodDetails$1", f = "FoodDetailsViewModel.kt", l = {290}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f108152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.i.a f108153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, b11.i.a aVar2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f108152c = aVar;
        this.f108153d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f108152c, this.f108153d, dVar);
        fVar.f108151b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objY;
        i53.c cVarB;
        g01.i iVar;
        b0 b0Var = (b0) this.f108151b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108150a;
        a aVar2 = this.f108152c;
        if (i14 == 0) {
            o13.r.b(obj);
            aVar2.f108073x.setValue(a.d.i.f108105a);
            m01.g gVar = aVar2.f108061j;
            a.c.C2073a c2073a = (a.c.C2073a) aVar2.f108055d;
            d0 d0Var = new d0(p13.w.c(new g01.m(c2073a.f108081a, c2073a.f108084d, c2073a.f108085e, c2073a.f108086f)));
            this.f108151b = b0Var;
            this.f108150a = 1;
            objY = gVar.y(d0Var, this);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objY = obj;
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to load food details. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            aVar2.f108073x.setValue(a.d.g.f108103a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            List<g01.i> list = ((g01.p) ((v2.b) v2Var).f47386a).f74238a;
            b11.e eVarA = (list == null || (iVar = (g01.i) h0.d0(list)) == null) ? null : iVar.a();
            if (eVarA != null) {
                i53.c<b11.s> cVar = eVarA.f14262b;
                b11.i.a aVarI = b11.i.a.i(this.f108153d, null, 0.0d, false, 0L, eVarA.f14261a, (b11.s) h0.b0(cVar), eVarA.f14263c, 319);
                p2 p2Var = aVar2.f108066o;
                p2 p2Var2 = aVar2.f108064m;
                a.b bVar = (a.b) p2Var2.getValue();
                if (bVar == null || (cVarB = bVar.f108078d) == null) {
                    cVarB = j53.l.b();
                }
                p2Var.setValue(oc.b.E(aVarI, cVarB, aVar2.f108053b.f14338a, aVar2.f108062k.a()));
                a.b bVar2 = (a.b) p2Var2.getValue();
                p2Var2.setValue(bVar2 != null ? a.b.a(bVar2, aVarI, cVar, false, 60) : null);
                aVar2.f108073x.setValue(a.d.h.f108104a);
            } else {
                aVar2.f108073x.setValue(a.d.g.f108103a);
            }
        }
        return Unit.INSTANCE;
    }
}
