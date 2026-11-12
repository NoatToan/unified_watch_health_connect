package ua1;

import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ty1.f1;
import va1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$updateFTP$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f169636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f169637c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ua1/h$a", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f169638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f169639b;

        /* JADX INFO: renamed from: ua1.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$updateFTP$1$1$2$onComplete$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {171}, m = "invokeSuspend", v = 2)
        public static final class C3173a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f169640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f169641b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3173a(c cVar, t13.d<? super C3173a> dVar) {
                super(2, dVar);
                this.f169641b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3173a(this.f169641b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3173a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f169640a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f169640a = 1;
                    if (c.y4(this.f169641b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$updateFTP$1$1$2$onComplete$2", f = "CreatePowerGuideStrategyViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f169642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f169643b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f169643b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f169643b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f169642a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f169642a = 1;
                    if (this.f169643b.C4(null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public a(c cVar, int i14) {
            this.f169638a = cVar;
            this.f169639b = i14;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            c cVar3 = this.f169638a;
            if (cVar != cVar2) {
                ge1.b.T(v1.a(cVar3), null, null, new b(cVar3, null), 3);
                return;
            }
            ge1.b.T(v1.a(cVar3), null, null, new C3173a(cVar3, null), 3);
            cVar3.f169614j.j(Integer.valueOf(this.f169639b));
            cVar3.z4(o.SELECT_RIDING_POSITION);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Unit unit) {
            eVar.getClass();
            unit.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$updateFTP$1$2$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f169645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f169645b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f169645b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169644a;
            if (i14 == 0) {
                r.b(obj);
                this.f169644a = 1;
                if (this.f169645b.C4(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, int i14, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f169636b = cVar;
        this.f169637c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f169636b, this.f169637c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169635a;
        c cVar = this.f169636b;
        if (i14 == 0) {
            r.b(obj);
            this.f169635a = 1;
            if (c.x4(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        cVar.f169609e.c(new ta1.a(new ap.b(cVar, this.f169637c, 16), new f1(cVar, 9)));
        return Unit.INSTANCE;
    }
}
