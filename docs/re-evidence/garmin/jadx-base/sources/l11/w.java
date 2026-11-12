package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.e1;
import v01.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$fetchDetails$1", f = "RecipeDetailsViewModel.kt", l = {269}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f108310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f108311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f108311c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f108311c, dVar);
        wVar.f108310b = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        b0 b0Var = (b0) this.f108310b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108309a;
        t tVar = this.f108311c;
        if (i14 == 0) {
            o13.r.b(obj);
            tVar.f108268p.setValue(t.c.i.f108288a);
            f1 f1Var = tVar.f108259g;
            String str = tVar.f108253a;
            b63.u uVar = tVar.f108257e;
            b11.m mVar = tVar.f108258f;
            b11.k kVar = mVar.f14339b;
            boolean z14 = mVar.f14338a;
            t.b bVar = tVar.f108254b;
            i01.i iVar = tVar.f108255c;
            this.f108310b = b0Var;
            this.f108309a = 1;
            objE0 = ge1.b.e0(f1Var.f174360e, new e1(bVar, z14, uVar, kVar, f1Var, iVar, str, true, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            if (tVar.f108254b instanceof t.b.c) {
                tVar.f108266n.setValue(((r) ((v2.b) v2Var).f47386a).f108230a);
            }
            p2 p2Var = tVar.f108270r;
            T t7 = ((v2.b) v2Var).f47386a;
            r rVar = (r) t7;
            p2Var.setValue(oc.b.E(rVar.f108230a, rVar.f108233d, rVar.f108234e, tVar.f108264l.a()));
            tVar.f108267o.setValue(t7);
            tVar.f108268p.setValue(t.c.h.f108287a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to load recipe details. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RecipeDetailsViewModel", strD);
            tVar.f108268p.setValue(t.c.g.f108286a);
        }
        return Unit.INSTANCE;
    }
}
