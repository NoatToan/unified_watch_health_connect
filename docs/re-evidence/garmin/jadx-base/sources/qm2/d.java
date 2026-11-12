package qm2;

import o13.r;
import o53.b0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.setup.BluetoothClassicDeviceStrategy$onHandshakeFailed$1", f = "BluetoothClassicDeviceStrategy.kt", l = {615}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f145696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f145697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f145698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.e f145699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ la2.i f145700f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.setup.BluetoothClassicDeviceStrategy$onHandshakeFailed$1$1", f = "BluetoothClassicDeviceStrategy.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f145701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f145702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yl2.e f145703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ la2.i f145704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, String str, yl2.e eVar, la2.i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f145701a = bVar;
            this.f145702b = str;
            this.f145703c = eVar;
            this.f145704d = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f145701a, this.f145702b, this.f145703c, this.f145704d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b.a aVar2 = b.A;
            b bVar = this.f145701a;
            if (!bVar.o(this.f145702b)) {
                bVar.n(this.f145703c, "BLE: " + this.f145704d);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, yl2.e eVar, la2.i iVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f145697c = bVar;
        this.f145698d = str;
        this.f145699e = eVar;
        this.f145700f = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f145697c, this.f145698d, this.f145699e, this.f145700f, dVar);
        dVar2.f145696b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145695a;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var2 = (b0) this.f145696b;
            this.f145696b = b0Var2;
            this.f145695a = 1;
            if (m0.b(1000L, this) == aVar) {
                return aVar;
            }
            b0Var = b0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = (b0) this.f145696b;
            r.b(obj);
        }
        b bVar = this.f145697c;
        bVar.f145681z.f145688a = false;
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, u53.o.f168762a, null, new a(bVar, this.f145698d, this.f145699e, this.f145700f, null), 2);
        return Unit.INSTANCE;
    }
}
