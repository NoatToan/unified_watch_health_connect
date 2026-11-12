package iy1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.l;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Liy1/a;", "Lew/a;", "", "workoutId", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Liy1/c;", "workoutRepo", "<init>", "(JLcom/garmin/android/library/backgroundtaskmanagement/b;Le23/l;Liy1/c;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f95826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<WorkoutDTO, Unit> f95827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f95828l;

    /* JADX INFO: renamed from: iy1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.workouts.biz.GetWorkoutTask", f = "GetWorkoutTask.kt", l = {16}, m = "executeBackgroundWork", v = 2)
    public static final class C1834a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f95829a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f95831c;

        public C1834a(t13.d<? super C1834a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f95829a = obj;
            this.f95831c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, l<? super WorkoutDTO, Unit> lVar, c cVar) {
        super(bVar);
        bVar.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f95826j = j8;
        this.f95827k = lVar;
        this.f95828l = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        C1834a c1834a;
        if (dVar instanceof C1834a) {
            c1834a = (C1834a) dVar;
            int i14 = c1834a.f95831c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1834a.f95831c = i14 - Integer.MIN_VALUE;
            } else {
                c1834a = new C1834a(dVar);
            }
        } else {
            c1834a = new C1834a(dVar);
        }
        Object objJ = c1834a.f95829a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1834a.f95831c;
        if (i15 == 0) {
            r.b(objJ);
            c1834a.f95831c = 1;
            c cVar = this.f95828l;
            cVar.getClass();
            objJ = f0.J(cVar, new d(cVar, this.f95826j, null), c1834a);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f95827k.invoke(((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    public /* synthetic */ a(long j8, com.garmin.android.library.backgroundtaskmanagement.b bVar, l lVar, c cVar, int i14, j jVar) {
        this(j8, bVar, lVar, (i14 & 8) != 0 ? c.a.a(c.f95832b) : cVar);
    }
}
