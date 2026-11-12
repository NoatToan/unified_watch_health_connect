package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$initializeViewModelData$1", f = "FBTPlanWizardViewModel.kt", l = {592, 593}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f13446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f13447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13450e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$initializeViewModelData$1$trainingPlansCall$1", f = "FBTPlanWizardViewModel.kt", l = {580}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends tw1.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13452b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f13452b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends tw1.o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13451a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f13452b.I;
            fy1.i.f73924a.getClass();
            String strF = fy1.i.a.f();
            List listC = p13.w.c("FBT_ADAPTIVE");
            this.f13451a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.m(bVar, strF, listC, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$initializeViewModelData$1$triathlonTypesCall$1", f = "FBTPlanWizardViewModel.kt", l = {587}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f13454b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f13454b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13453a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            d60.b bVarF4 = this.f13454b.F4();
            this.f13453a = 1;
            bVarF4.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVarF4, new d60.e0(bVarF4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h hVar, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f13450e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f13450e, dVar);
        k0Var.f13449d = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        v2 v2Var;
        v2 v2Var2;
        List<tw1.m> listA;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list;
        o53.b0 b0Var = (o53.b0) this.f13449d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13448c;
        h hVar = this.f13450e;
        v2 v2Var3 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(hVar, null), 3);
            fy1.i.f73924a.getClass();
            j0VarJ = fy1.i.a.r() ? ge1.b.j(b0Var, null, null, new b(hVar, null), 3) : null;
            this.f13449d = b0Var;
            this.f13446a = j0VarJ;
            this.f13448c = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f13446a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var2 = this.f13447b;
            o13.r.b(obj);
        }
        v2Var3 = (v2) obj;
        v2Var = v2Var2;
        if (v2Var instanceof v2.b) {
            listA = ((tw1.o) ((v2.b) v2Var).f47386a).a();
            if (listA == null) {
                listA = p13.j0.f134944a;
            }
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Exception getting FBT training plans=");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
            listA = p13.j0.f134944a;
        }
        hVar.f13388u1 = listA;
        if (v2Var3 instanceof v2.b) {
            list = (List) ((v2.b) v2Var3).f47386a;
            if (list == null) {
                list = p13.j0.f134944a;
            }
        } else if (v2Var3 instanceof v2.a) {
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Exception getting triathlon types=");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "FBTPlanWizardViewModel", strD2);
            list = p13.j0.f134944a;
        } else {
            list = p13.j0.f134944a;
        }
        list.getClass();
        hVar.f13389v1 = list;
        ((y0) hVar.A1.getValue()).j(g3.a.e(g3.f35298f));
        return Unit.INSTANCE;
        v2Var = (v2) obj;
        if (j0VarJ != null) {
            this.f13449d = b0Var;
            this.f13446a = null;
            this.f13447b = v2Var;
            this.f13448c = 2;
            Object objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                v2Var2 = v2Var;
                obj = objAwait;
                v2Var3 = (v2) obj;
                v2Var = v2Var2;
            }
            return aVar;
        }
        if (v2Var instanceof v2.b) {
            listA = ((tw1.o) ((v2.b) v2Var).f47386a).a();
            if (listA == null) {
                listA = p13.j0.f134944a;
            }
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Exception getting FBT training plans=");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "FBTPlanWizardViewModel", strD3);
            listA = p13.j0.f134944a;
        }
        hVar.f13388u1 = listA;
        if (v2Var3 instanceof v2.b) {
            list = (List) ((v2.b) v2Var3).f47386a;
            if (list == null) {
                list = p13.j0.f134944a;
            }
        } else if (v2Var3 instanceof v2.a) {
            String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Exception getting triathlon types=");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD4);
            list = p13.j0.f134944a;
        } else {
            list = p13.j0.f134944a;
        }
        list.getClass();
        hVar.f13389v1 = list;
        ((y0) hVar.A1.getValue()).j(g3.a.e(g3.f35298f));
        return Unit.INSTANCE;
    }
}
