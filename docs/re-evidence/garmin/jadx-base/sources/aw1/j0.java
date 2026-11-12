package aw1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$handleEventReturnedFromEventSearchOrCreate$2", f = "FBTPlanWizardViewModel.kt", l = {2701, 2706}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h hVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f13442b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f13442b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        if (r14 == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fg0.p pVar;
        fg0.p pVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13441a;
        h hVar = this.f13442b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                if (hVar.e7()) {
                    hVar.R7((fg0.k) ((v2.b) v2Var).f47386a);
                } else {
                    hVar.K7((fg0.k) ((v2.b) v2Var).f47386a);
                }
                return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
            }
            if (v2Var instanceof v2.a) {
                return new v2.a(new IllegalStateException("Error updating primary event"), null, null, 6, null);
            }
            u0.r();
            return null;
        }
        o13.r.b(obj);
        int i15 = h.S1;
        jv1.s sVarI6 = hVar.i6();
        if ((sVarI6 != null ? sVarI6.f101145x : null) == null) {
            jv1.s sVarI7 = hVar.i6();
            if ((sVarI7 != null ? sVarI7.f101146y : null) == null) {
                return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
            }
        }
        this.f13441a = 1;
        Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
        jv1.s sVarI8 = hVar.i6();
        if (((sVarI8 == null || (pVar2 = sVarI8.f101145x) == null) ? null : pVar2.getSig()) != null) {
            jv1.s sVarI9 = hVar.i6();
            fg0.p pVar3 = sVarI9 != null ? sVarI9.f101145x : null;
            pVar3.getClass();
            jv1.s sVarI10 = hVar.i6();
            String sig = (sVarI10 == null || (pVar = sVarI10.f101145x) == null) ? null : pVar.getSig();
            sig.getClass();
            obj = hVar.Z7(pVar3, sig, this);
        } else {
            jv1.s sVarI11 = hVar.i6();
            fg0.k kVar = sVarI11 != null ? sVarI11.f101146y : null;
            kVar.getClass();
            obj = hVar.m5(contextB, kVar, this);
        }
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var2 = (v2) obj;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(new IllegalStateException("Error adding event to user's calendar"), null, null, 6, null);
            }
            u0.r();
            return null;
        }
        fg0.k kVar2 = (fg0.k) ((v2.b) v2Var2).f47386a;
        this.f13441a = 2;
        int i16 = h.S1;
        hVar.getClass();
        obj = o53.c0.e(new l0(hVar, kVar2, null), this);
    }
}
