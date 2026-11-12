package uw1;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import tw1.m;
import tw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luw1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f172999a = new a(null);

    /* JADX INFO: renamed from: uw1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.network.TrainingPlansRepo$deleteTrainingPlan$2", f = "TrainingPlansRepo.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class C3239b extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f173000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f173001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3239b(long j8, t13.d<? super C3239b> dVar) {
            super(1, dVar);
            this.f173001b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new C3239b(this.f173001b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((C3239b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f173000a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<Unit>> i0VarB = a.a(b.f172999a).b(this.f173001b);
            this.f173000a = 1;
            Object objAwait = i0VarB.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public final Object a(long j8, t13.d<? super v2<Unit>> dVar) {
        return f0.J(this, new C3239b(j8, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public final Object b(t13.d<? super v2<o>> dVar) {
        h hVar;
        ?? arrayList;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i14 = hVar.f173014c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f173014c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object objJ = hVar.f173012a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f173014c;
        if (i15 == 0) {
            r.b(objJ);
            i iVar = new i(null);
            hVar.f173014c = 1;
            objJ = f0.J(this, iVar, hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            List<m> listA = ((o) ((v2.b) v2Var).f47386a).a();
            if (listA != null) {
                arrayList = new ArrayList();
                for (Object obj : listA) {
                    m mVar = (m) obj;
                    if (mVar.n0() || mVar.c0()) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = j0.f134944a;
            }
            a2 a2Var = a2.ONBOARDING;
            String strF = e5.f(arrayList, "Get training plans task succeeded. Found ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TrainingPlansRepo", strF);
            if (!((Collection) arrayList).isEmpty()) {
                ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.ENTERED_TRAINING_PLANS);
            }
        }
        return objJ;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luw1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final uw1.a a(a aVar) {
            aVar.getClass();
            return (uw1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, uw1.a.class, new c83.h.a[0], null, null, null, 120);
        }

        private a() {
        }
    }
}
