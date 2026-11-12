package mz1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$updateCoursePrivacy$1", f = "AddTIEventViewModel.kt", l = {1478}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f121993d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$updateCoursePrivacy$1$1", f = "AddTIEventViewModel.kt", l = {1479}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f121995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f121996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f121997d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AddTIEventViewModel addTIEventViewModel, String str, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121995b = addTIEventViewModel;
            this.f121996c = str;
            this.f121997d = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f121995b, this.f121996c, this.f121997d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121994a;
            AddTIEventViewModel addTIEventViewModel = this.f121995b;
            if (i14 == 0) {
                o13.r.b(obj);
                d60.b bVar = addTIEventViewModel.f46429p2;
                this.f121994a = 1;
                obj = bVar.i(this.f121996c, this.f121997d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                String[] strArr = AddTIEventViewModel.V2;
                ((androidx.lifecycle.y0) addTIEventViewModel.W0.getValue()).j(Boolean.TRUE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String[] strArr2 = AddTIEventViewModel.V2;
                ((androidx.lifecycle.y0) addTIEventViewModel.W0.getValue()).j(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AddTIEventViewModel addTIEventViewModel, String str, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f121991b = addTIEventViewModel;
        this.f121992c = str;
        this.f121993d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f121991b, this.f121992c, this.f121993d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121990a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f121991b, this.f121992c, this.f121993d, null);
            this.f121990a = 1;
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
