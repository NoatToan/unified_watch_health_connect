package rs2;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrs2/z;", "Lrs2/f;", "customLogger", "Lt13/g;", "coroutineContext", "<init>", "(Lrs2/f;Lt13/g;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class z implements rs2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.f f154467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f154468b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onClose$1", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onClose();
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onMessageReadFailed$1", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f154471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f154471b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new b(this.f154471b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onMessageReadFailed(this.f154471b);
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onRequestRead$1", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f154473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f154474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f154475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, int i14, byte[] bArr, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f154473b = num;
            this.f154474c = i14;
            this.f154475d = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new c(this.f154473b, this.f154474c, this.f154475d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onRequestRead(this.f154473b, this.f154474c, this.f154475d);
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onResponseRead$1", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f154477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f154478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f154479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f154480e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Integer num, int i14, y yVar, byte[] bArr, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f154477b = num;
            this.f154478c = i14;
            this.f154479d = yVar;
            this.f154480e = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new d(this.f154477b, this.f154478c, this.f154479d, this.f154480e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onResponseRead(this.f154477b, this.f154478c, this.f154479d, this.f154480e);
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onWrite$1", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f154482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f154483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f154484d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Integer num, int i14, byte[] bArr, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f154482b = num;
            this.f154483c = i14;
            this.f154484d = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new e(this.f154482b, this.f154483c, this.f154484d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onWrite(this.f154482b, this.f154483c, this.f154484d);
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomLogger$onWrite$2", f = "GfdiCustomLogger.kt", l = {}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f154486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f154487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f154488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f154489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Integer num, int i14, y yVar, byte[] bArr, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f154486b = num;
            this.f154487c = i14;
            this.f154488d = yVar;
            this.f154489e = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z.this.new f(this.f154486b, this.f154487c, this.f154488d, this.f154489e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                z.this.f154467a.onWrite(this.f154486b, this.f154487c, this.f154488d, this.f154489e);
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public z(rs2.f fVar, t13.g gVar) {
        fVar.getClass();
        gVar.getClass();
        this.f154467a = fVar;
        this.f154468b = zl.a.e("GfdiCustomLogger", gVar);
    }

    @Override // rs2.f
    public final void onClose() {
        ge1.b.T(this.f154468b, null, null, new a(null), 3);
    }

    @Override // rs2.f
    public final void onMessageReadFailed(String str) {
        str.getClass();
        ge1.b.T(this.f154468b, null, null, new b(str, null), 3);
    }

    @Override // rs2.f
    public final void onRequestRead(Integer num, int i14, byte[] bArr) {
        bArr.getClass();
        ge1.b.T(this.f154468b, null, null, new c(num, i14, bArr, null), 3);
    }

    @Override // rs2.f
    public final void onResponseRead(Integer num, int i14, y yVar, byte[] bArr) {
        yVar.getClass();
        bArr.getClass();
        ge1.b.T(this.f154468b, null, null, new d(num, i14, yVar, bArr, null), 3);
    }

    @Override // rs2.f
    public final void onWrite(Integer num, int i14, y yVar, byte[] bArr) {
        yVar.getClass();
        bArr.getClass();
        ge1.b.T(this.f154468b, null, null, new f(num, i14, yVar, bArr, null), 3);
    }

    public z(rs2.f fVar, t13.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? s0.f129406a : gVar);
    }

    @Override // rs2.f
    public final void onWrite(Integer num, int i14, byte[] bArr) {
        bArr.getClass();
        ge1.b.T(this.f154468b, null, null, new e(num, i14, bArr, null), 3);
    }
}
