package f11;

import b63.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import r53.p2;
import v01.k1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$logFood$1", f = "QuickAddViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f68010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f68011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b11.i.c f68012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b11.i.c f68013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, b11.i.c cVar, b11.i.c cVar2, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f68011c = jVar;
        this.f68012d = cVar;
        this.f68013e = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f68011c, this.f68012d, this.f68013e, dVar);
        lVar.f68010b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        j.b bVar;
        b0 b0Var = (b0) this.f68010b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68009a;
        b11.i.c cVar = this.f68012d;
        j jVar = this.f68011c;
        if (i14 == 0) {
            r.b(obj);
            jVar.f67974k.setValue(j.c.LOADING);
            i01.e eVar = jVar.f67966c != null ? i01.e.UPDATE : i01.e.ADD;
            n1 n1Var = jVar.f67969f;
            o oVar = jVar.f67964a;
            List listC = w.c(cVar);
            this.f68010b = b0Var;
            this.f68009a = 1;
            obj = ge1.b.e0(n1Var.f174480c, new k1(listC, n1Var, oVar, eVar, null), this);
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "QuickAddViewModel", strD);
            jVar.f67974k.setValue(j.c.ERROR);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            if (!s.g(cVar, this.f68013e)) {
                p2 p2Var = jVar.f67972i;
                do {
                    value = p2Var.getValue();
                    bVar = (j.b) value;
                } while (!p2Var.b(value, bVar != null ? j.b.a(bVar, cVar, false, 62) : null));
            }
            jVar.f67974k.setValue(j.c.SAVED);
        }
        return Unit.INSTANCE;
    }
}
