package rs2;

import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrs2/a0;", "Lrs2/z;", "Lrs2/g;", "customLogger", "Lt13/g;", "coroutineContext", "<init>", "(Lrs2/g;Lt13/g;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a0 extends z implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f154361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f154362d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onExtensionsRegistered$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExtensionRegistryLite f154364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExtensionRegistryLite extensionRegistryLite, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154364b = extensionRegistryLite;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new a(this.f154364b, dVar);
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
                a0.this.f154361c.onExtensionsRegistered(this.f154364b);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onProtobufRequest$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f154366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f154367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14, GDISmartProto.Smart smart, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f154366b = i14;
            this.f154367c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new b(this.f154366b, this.f154367c, dVar);
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
                a0.this.f154361c.onProtobufRequest(this.f154366b, this.f154367c);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onProtobufRespond$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f154369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f154370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i14, GDISmartProto.Smart smart, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f154369b = i14;
            this.f154370c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new c(this.f154369b, this.f154370c, dVar);
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
                a0.this.f154361c.onProtobufRequest(this.f154369b, this.f154370c);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onReceiveResponse$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f154372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f154373c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i14, GDISmartProto.Smart smart, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f154372b = i14;
            this.f154373c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new d(this.f154372b, this.f154373c, dVar);
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
                a0.this.f154361c.onReceiveResponse(this.f154372b, this.f154373c);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onSendNotification$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f154375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f154376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i14, GDISmartProto.Smart smart, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f154375b = i14;
            this.f154376c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new e(this.f154375b, this.f154376c, dVar);
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
                a0.this.f154361c.onSendNotification(this.f154375b, this.f154376c);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.SafeGfdiCustomProtobufLogger$onSendRequest$1", f = "GfdiCustomProtobufLogger.kt", l = {}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f154378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f154379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i14, GDISmartProto.Smart smart, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f154378b = i14;
            this.f154379c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new f(this.f154378b, this.f154379c, dVar);
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
                a0.this.f154361c.onSendRequest(this.f154378b, this.f154379c);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g gVar, t13.g gVar2) {
        super(gVar, gVar2);
        gVar.getClass();
        gVar2.getClass();
        this.f154361c = gVar;
        this.f154362d = zl.a.e("GfdiCustomProtobufLogger", gVar2);
    }

    @Override // rs2.g
    public final void onExtensionsRegistered(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        ge1.b.T(this.f154362d, null, null, new a(extensionRegistryLite, null), 3);
    }

    @Override // rs2.g
    public final void onProtobufRequest(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f154362d, null, null, new b(i14, smart, null), 3);
    }

    @Override // rs2.g
    public final void onProtobufRespond(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f154362d, null, null, new c(i14, smart, null), 3);
    }

    @Override // rs2.g
    public final void onReceiveResponse(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f154362d, null, null, new d(i14, smart, null), 3);
    }

    @Override // rs2.g
    public final void onSendNotification(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f154362d, null, null, new e(i14, smart, null), 3);
    }

    @Override // rs2.g
    public final void onSendRequest(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f154362d, null, null, new f(i14, smart, null), 3);
    }

    public a0(g gVar, t13.g gVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? s0.f129406a : gVar2);
    }
}
