package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getMyCoursesList$1", f = "AddTIEventViewModel.kt", l = {1443}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> f121848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Double> f121850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Double> f121851e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getMyCoursesList$1$1", f = "AddTIEventViewModel.kt", l = {1444}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f121853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f121854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Double> f121855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Double> f121856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> f121857f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AddTIEventViewModel addTIEventViewModel, p005kotlin.jvm.internal.r0<Double> r0Var, p005kotlin.jvm.internal.r0<Double> r0Var2, androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121854c = addTIEventViewModel;
            this.f121855d = r0Var;
            this.f121856e = r0Var2;
            this.f121857f = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f121854c, this.f121855d, this.f121856e, this.f121857f, dVar);
            aVar.f121853b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            o53.b0 b0Var = (o53.b0) this.f121853b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121852a;
            if (i14 == 0) {
                o13.r.b(obj);
                d60.b bVar = this.f121854c.f46429p2;
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                Double d14 = this.f121855d.f105810a;
                Double d15 = this.f121856e.f105810a;
                Boolean bool = Boolean.TRUE;
                this.f121853b = b0Var;
                this.f121852a = 1;
                aVar = this;
                obj = d60.b.f(bVar, userDisplayName, userProfilePk, d14, d15, bool, aVar, 16);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
            }
            List list = (List) obj;
            androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var = aVar.f121857f;
            if (list != null) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, list, 1));
            } else {
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.lifecycle.y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var, AddTIEventViewModel addTIEventViewModel, p005kotlin.jvm.internal.r0<Double> r0Var, p005kotlin.jvm.internal.r0<Double> r0Var2, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f121848b = y0Var;
        this.f121849c = addTIEventViewModel;
        this.f121850d = r0Var;
        this.f121851e = r0Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f121848b, this.f121849c, this.f121850d, this.f121851e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121847a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f121848b.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f121849c, this.f121850d, this.f121851e, this.f121848b, null);
            this.f121847a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
