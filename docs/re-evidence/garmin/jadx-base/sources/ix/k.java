package ix;

import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$checkRegisteredDevicesToShowBodyBatteryTrueUpInHelp$1", f = "BodyBatteryReportsViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f95657b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsViewModel$checkRegisteredDevicesToShowBodyBatteryTrueUpInHelp$1$1", f = "BodyBatteryReportsViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f95658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f95660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f95660c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f95660c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j jVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95659b;
            if (i14 == 0) {
                r.b(obj);
                j jVar2 = this.f95660c;
                fx.a aVar2 = jVar2.f95623c;
                this.f95658a = jVar2;
                this.f95659b = 1;
                Object objC = aVar2.c(this);
                if (objC == aVar) {
                    return aVar;
                }
                jVar = jVar2;
                obj = objC;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar = this.f95658a;
                r.b(obj);
            }
            jVar.f95633m = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f95657b = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f95657b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95656a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f95657b, null);
            this.f95656a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
