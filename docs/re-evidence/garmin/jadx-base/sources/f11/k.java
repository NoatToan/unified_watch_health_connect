package f11;

import b63.o;
import b63.v;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.c1;
import v01.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$load$1", f = "QuickAddViewModel.kt", l = {153}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f68007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f68008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f68008c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f68008c, dVar);
        kVar.f68007b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f68007b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68006a;
        j jVar = this.f68008c;
        if (i14 == 0) {
            r.b(obj);
            jVar.f67974k.setValue(j.c.LOADING);
            d1 d1Var = jVar.f67968e;
            o oVar = jVar.f67964a;
            v vVar = jVar.f67967d;
            b11.m mVar = jVar.f67965b;
            b11.k kVar = mVar.f14339b;
            boolean z14 = mVar.f14338a;
            String str = jVar.f67966c;
            this.f68007b = b0Var;
            this.f68006a = 1;
            obj = ge1.b.e0(d1Var.f174307d, new c1(z14, vVar, kVar, d1Var, str, oVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get quick add data. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "QuickAddViewModel", strD);
            jVar.f67974k.setValue(j.c.LOAD_FAILED);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            if (jVar.f67966c != null) {
                jVar.f67971h.setValue(((j.b) ((v2.b) v2Var).f47386a).f67982a);
            }
            p2 p2Var = jVar.f67976m;
            T t7 = ((v2.b) v2Var).f47386a;
            j.b bVar = (j.b) t7;
            p2Var.setValue(oc.b.E(bVar.f67982a, bVar.f67984c, bVar.f67985d, jVar.f67970g.a()));
            jVar.f67972i.setValue(t7);
            jVar.f67974k.setValue(j.c.LOADED);
        }
        return Unit.INSTANCE;
    }
}
