package dt2;

import c22.t;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import ds.e0;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.q;
import o13.r;
import o53.c0;
import o53.i0;
import o53.j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r1.q2;
import rs2.b0;
import rs2.v;
import rs2.w;
import rs2.y;
import u53.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0012B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ldt2/d;", "Lrs2/w;", "Ldt2/g;", "Lrs2/b0;", "", "connectionId", "Lrs2/v;", "messenger", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", "Lrs2/g;", "customLogger", "", "timeout", "Lcz2/a;", "clock", "<init>", "(Ljava/lang/String;Lrs2/v;Lcom/google/protobuf/ExtensionRegistryLite;Lrs2/g;JLcz2/a;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements w, g, b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Method f61144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Field f61145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Field f61146o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f61147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExtensionRegistryLite f61148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rs2.g f61149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f61150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cz2.a f61151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u53.d f61152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f61153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<h> f61154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f61155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f61156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f61157l;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61158a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.EXCEEDED_PROTOBUF_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.UNKNOWN_PROTOBUF_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61158a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler", f = "ProtobufHandler.kt", l = {328}, m = "send$gfdi_release")
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f61160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f61162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public GDISmartProto.Smart f61163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p0 f61164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f61165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f61166h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f61168j;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f61166h = obj;
            this.f61168j |= Integer.MIN_VALUE;
            return d.this.h(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: dt2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler$send$handleException$1", f = "ProtobufHandler.kt", l = {}, m = "invokeSuspend")
    public static final class C1298d extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1298d(int i14, t13.d<? super C1298d> dVar) {
            super(2, dVar);
            this.f61170b = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C1298d(this.f61170b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1298d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Method method = d.f61144m;
            d dVar = d.this;
            dVar.getClass();
            byte[] bArr = new byte[2];
            jg.b.T(0, this.f61170b, bArr);
            ft2.d.b(dVar.f61152g, new dt2.e(dVar, bArr, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/GDISmartProto$Smart;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler$sendRequest$2", f = "ProtobufHandler.kt", l = {641, 235, 252}, m = "invokeSuspend")
    public static final class e extends v13.i implements p<o53.b0, t13.d<? super GDISmartProto.Smart>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f61171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f61172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.a f61173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f61174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public GDISmartProto.Smart f61175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f61177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f61178h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f61179i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f61181k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/GDISmartProto$Smart;"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler$sendRequest$2$deferred$1", f = "ProtobufHandler.kt", l = {636}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<o53.b0, t13.d<? super GDISmartProto.Smart>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public z53.a f61182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f61183b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f61184c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0<dt2.b> f61185d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ z53.a f61186e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f61187f;

            /* JADX INFO: renamed from: dt2.d$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C1299a implements e23.l<q<? extends GDISmartProto.Smart>, Boolean> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ o53.j<GDISmartProto.Smart> f61188a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f61189b;

                /* JADX WARN: Multi-variable type inference failed */
                public C1299a(o53.j<? super GDISmartProto.Smart> jVar, d dVar) {
                    this.f61188a = jVar;
                    this.f61189b = dVar;
                }

                @Override // e23.l
                public final Boolean invoke(q<? extends GDISmartProto.Smart> qVar) {
                    Object obj = qVar.f128597a;
                    o53.j<GDISmartProto.Smart> jVar = this.f61188a;
                    boolean z14 = jVar.isActive() && c0.g(this.f61189b.f61152g);
                    jVar.resumeWith(obj);
                    return Boolean.valueOf(z14);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, r0<dt2.b> r0Var, z53.a aVar, long j8, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f61184c = dVar;
                this.f61185d = r0Var;
                this.f61186e = aVar;
                this.f61187f = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f61184c, this.f61185d, this.f61186e, this.f61187f, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super GDISmartProto.Smart> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [T, dt2.b, java.lang.Object] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f61183b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                d dVar = this.f61184c;
                r0<dt2.b> r0Var = this.f61185d;
                z53.a aVar2 = this.f61186e;
                long j8 = this.f61187f;
                this.f61182a = aVar2;
                this.f61183b = 1;
                o53.k kVar = new o53.k(u13.f.b(this), 1);
                kVar.q();
                try {
                    ?? bVar = new dt2.b(dVar.f61148c, dVar.f61151f, new C1299a(kVar, dVar));
                    r0Var.f105810a = bVar;
                    synchronized (dVar.f61155j) {
                        dVar.f61156k.put(new Long(j8), bVar);
                        Unit unit = Unit.INSTANCE;
                    }
                    aVar2.e(null);
                    Object objP = kVar.p();
                    return objP == aVar ? aVar : objP;
                } catch (Throwable th3) {
                    aVar2.e(null);
                    throw th3;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/GDISmartProto$Smart;"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler$sendRequest$2$response$1", f = "ProtobufHandler.kt", l = {253}, m = "invokeSuspend")
        public static final class b extends v13.i implements p<o53.b0, t13.d<? super GDISmartProto.Smart>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f61190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0<GDISmartProto.Smart> f61191b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i0<GDISmartProto.Smart> i0Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f61191b = i0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f61191b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super GDISmartProto.Smart> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f61190a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f61190a = 1;
                    Object objAwait = this.f61191b.await(this);
                    return objAwait == aVar ? aVar : objAwait;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GDISmartProto.Smart smart, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f61181k = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = d.this.new e(this.f61181k, dVar);
            eVar.f61179i = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super GDISmartProto.Smart> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0158 A[Catch: all -> 0x002b, CancellationException -> 0x002e, ProtobufException -> 0x0031, TryCatch #7 {ProtobufException -> 0x0031, CancellationException -> 0x002e, blocks: (B:8:0x0022, B:56:0x0184, B:49:0x0142, B:51:0x0158, B:53:0x0169, B:66:0x01d3, B:67:0x01da, B:68:0x01db, B:69:0x01e0, B:58:0x0188, B:60:0x01bc, B:48:0x013c, B:72:0x01e3, B:73:0x01e6, B:24:0x0064, B:39:0x00f6), top: B:94:0x000e, outer: #5 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0169 A[Catch: all -> 0x002b, CancellationException -> 0x002e, ProtobufException -> 0x0031, TryCatch #7 {ProtobufException -> 0x0031, CancellationException -> 0x002e, blocks: (B:8:0x0022, B:56:0x0184, B:49:0x0142, B:51:0x0158, B:53:0x0169, B:66:0x01d3, B:67:0x01da, B:68:0x01db, B:69:0x01e0, B:58:0x0188, B:60:0x01bc, B:48:0x013c, B:72:0x01e3, B:73:0x01e6, B:24:0x0064, B:39:0x00f6), top: B:94:0x000e, outer: #5 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01d3 A[Catch: all -> 0x002b, CancellationException -> 0x002e, ProtobufException -> 0x0031, TRY_ENTER, TryCatch #7 {ProtobufException -> 0x0031, CancellationException -> 0x002e, blocks: (B:8:0x0022, B:56:0x0184, B:49:0x0142, B:51:0x0158, B:53:0x0169, B:66:0x01d3, B:67:0x01da, B:68:0x01db, B:69:0x01e0, B:58:0x0188, B:60:0x01bc, B:48:0x013c, B:72:0x01e3, B:73:0x01e6, B:24:0x0064, B:39:0x00f6), top: B:94:0x000e, outer: #5 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x01db A[Catch: all -> 0x002b, CancellationException -> 0x002e, ProtobufException -> 0x0031, TryCatch #7 {ProtobufException -> 0x0031, CancellationException -> 0x002e, blocks: (B:8:0x0022, B:56:0x0184, B:49:0x0142, B:51:0x0158, B:53:0x0169, B:66:0x01d3, B:67:0x01da, B:68:0x01db, B:69:0x01e0, B:58:0x0188, B:60:0x01bc, B:48:0x013c, B:72:0x01e3, B:73:0x01e6, B:24:0x0064, B:39:0x00f6), top: B:94:0x000e, outer: #5 }] */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
        
            if (r3 == r0) goto L55;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0207: INVOKE (r4v1 ?? I:java.lang.Long), (r9 I:long) DIRECT call: java.lang.Long.<init>(long):void A[Catch: all -> 0x0212, MD:(long):void (c)], block:B:80:0x0203 */
        /* JADX WARN: Type inference failed for: r9v0, types: [long] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0181 -> B:56:0x0184). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r14;
            int i14;
            long j8;
            i0 i0VarJ;
            o53.b0 b0Var;
            int i15;
            d dVar;
            GDISmartProto.Smart smart;
            r0 r0Var;
            z53.a aVar;
            z53.a aVar2;
            r0 r0Var2;
            i0 i0Var;
            o53.b0 b0Var2;
            i0 i0Var2;
            r0 r0Var3;
            o53.b0 b0Var3;
            long jMillis;
            T t7;
            long j14;
            long j15;
            Object objC;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f61178h;
            int i17 = 5044;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            r.b(obj);
                            o53.b0 b0Var4 = (o53.b0) this.f61179i;
                            d dVar2 = d.this;
                            Method method = d.f61144m;
                            synchronized (dVar2.f61155j) {
                                i14 = dVar2.f61157l;
                                int i18 = i14 + 1;
                                dVar2.f61157l = i18;
                                if (i18 > 65535) {
                                    dVar2.f61157l = 0;
                                }
                            }
                            Logger logger = d.this.f61153h;
                            ct2.c.f55534a.getClass();
                            String strA = ct2.c.a(5043);
                            String strG = d.this.g(this.f61181k);
                            StringBuilder sbK = androidx.core.view.j.k(i14, "Sending ", strA, " [", "]: ");
                            sbK.append(strG);
                            logger.debug(sbK.toString());
                            rs2.g gVar = d.this.f61149d;
                            if (gVar != null) {
                                gVar.onSendRequest(i14, this.f61181k);
                            }
                            d.this.getClass();
                            long j16 = (((long) 5044) & 4294967295L) | ((4294967295L & ((long) i14)) << 32);
                            r0 r0Var4 = new r0();
                            x xVar = z53.c.f202558a;
                            z53.b bVar = new z53.b(true);
                            a aVar4 = new a(d.this, r0Var4, bVar, j16, null);
                            j8 = j16;
                            i0VarJ = ge1.b.j(b0Var4, null, null, aVar4, 3);
                            d dVar3 = d.this;
                            GDISmartProto.Smart smart2 = this.f61181k;
                            this.f61179i = b0Var4;
                            this.f61171a = r0Var4;
                            this.f61172b = i0VarJ;
                            this.f61173c = bVar;
                            this.f61174d = dVar3;
                            this.f61175e = smart2;
                            this.f61176f = i14;
                            this.f61177g = j8;
                            this.f61178h = 1;
                            if (bVar.c(this) != aVar3) {
                                b0Var = b0Var4;
                                i15 = i14;
                                dVar = dVar3;
                                smart = smart2;
                                r0Var = r0Var4;
                                aVar = bVar;
                            }
                            return aVar3;
                        }
                        if (i16 != 1) {
                            if (i16 == 2) {
                                j8 = this.f61177g;
                                i15 = this.f61176f;
                                aVar2 = this.f61173c;
                                i0Var = this.f61172b;
                                r0Var2 = this.f61171a;
                                b0Var2 = (o53.b0) this.f61179i;
                                try {
                                    r.b(obj);
                                    i17 = 5044;
                                    Unit unit = Unit.INSTANCE;
                                    aVar2.e(null);
                                    i0Var2 = i0Var;
                                    r0Var3 = r0Var2;
                                    b0Var3 = b0Var2;
                                    c0.f(d.this.f61152g);
                                    c0.f(b0Var3);
                                    jMillis = d.this.f61151f.millis();
                                    t7 = r0Var3.f105810a;
                                    if (t7 == 0) {
                                        s.m("responseReceiver");
                                        throw null;
                                    }
                                    j14 = jMillis - ((dt2.b) t7).f61139d.get();
                                    j15 = d.this.f61150e;
                                    if (j14 > j15) {
                                        throw new ProtobufException("Timed out waiting for device response", null, 2, null);
                                    }
                                    b bVar2 = new b(i0Var2, null);
                                    this.f61179i = b0Var3;
                                    this.f61171a = r0Var3;
                                    this.f61172b = i0Var2;
                                    this.f61173c = null;
                                    this.f61176f = i15;
                                    this.f61177g = j8;
                                    this.f61178h = 3;
                                    objC = j2.c(j15 - j14, bVar2, this);
                                } catch (Throwable th3) {
                                    th = th3;
                                    aVar2.e(null);
                                    throw th;
                                }
                            } else {
                                if (i16 != 3) {
                                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j8 = this.f61177g;
                                i15 = this.f61176f;
                                i0Var2 = this.f61172b;
                                r0Var3 = this.f61171a;
                                b0Var3 = (o53.b0) this.f61179i;
                                r.b(obj);
                                i17 = 5044;
                                objC = obj;
                            }
                            GDISmartProto.Smart smart3 = (GDISmartProto.Smart) objC;
                            if (smart3 != null) {
                                d dVar4 = d.this;
                                Logger logger2 = dVar4.f61153h;
                                ct2.c.f55534a.getClass();
                                logger2.debug(ct2.c.a(i17) + " [" + i15 + "] complete: " + dVar4.g(smart3));
                                rs2.g gVar2 = dVar4.f61149d;
                                if (gVar2 != null) {
                                    gVar2.onReceiveResponse(i15, smart3);
                                }
                                d dVar5 = d.this;
                                synchronized (dVar5.f61155j) {
                                }
                                return smart3;
                            }
                            c0.f(d.this.f61152g);
                            c0.f(b0Var3);
                            jMillis = d.this.f61151f.millis();
                            t7 = r0Var3.f105810a;
                            if (t7 == 0) {
                                s.m("responseReceiver");
                                throw null;
                            }
                            j14 = jMillis - ((dt2.b) t7).f61139d.get();
                            j15 = d.this.f61150e;
                            if (j14 > j15) {
                                throw new ProtobufException("Timed out waiting for device response", null, 2, null);
                            }
                            b bVar3 = new b(i0Var2, null);
                            this.f61179i = b0Var3;
                            this.f61171a = r0Var3;
                            this.f61172b = i0Var2;
                            this.f61173c = null;
                            this.f61176f = i15;
                            this.f61177g = j8;
                            this.f61178h = 3;
                            objC = j2.c(j15 - j14, bVar3, this);
                        } else {
                            j8 = this.f61177g;
                            i15 = this.f61176f;
                            smart = this.f61175e;
                            dVar = this.f61174d;
                            aVar = this.f61173c;
                            i0 i0Var3 = this.f61172b;
                            r0 r0Var5 = this.f61171a;
                            b0Var = (o53.b0) this.f61179i;
                            r.b(obj);
                            r0Var = r0Var5;
                            i0VarJ = i0Var3;
                        }
                        this.f61179i = b0Var;
                        this.f61171a = r0Var;
                        this.f61172b = i0VarJ;
                        this.f61173c = aVar;
                        this.f61174d = null;
                        this.f61175e = null;
                        this.f61176f = i15;
                        this.f61177g = j8;
                        this.f61178h = 2;
                        if (dVar.h(5043, i15, smart, this) != aVar3) {
                            r0Var2 = r0Var;
                            aVar2 = aVar;
                            i0Var = i0VarJ;
                            b0Var2 = b0Var;
                            Unit unit2 = Unit.INSTANCE;
                            aVar2.e(null);
                            i0Var2 = i0Var;
                            r0Var3 = r0Var2;
                            b0Var3 = b0Var2;
                            c0.f(d.this.f61152g);
                            c0.f(b0Var3);
                            jMillis = d.this.f61151f.millis();
                            t7 = r0Var3.f105810a;
                            if (t7 == 0) {
                                s.m("responseReceiver");
                                throw null;
                            }
                            j14 = jMillis - ((dt2.b) t7).f61139d.get();
                            j15 = d.this.f61150e;
                            if (j14 > j15) {
                                throw new ProtobufException("Timed out waiting for device response", null, 2, null);
                            }
                            b bVar4 = new b(i0Var2, null);
                            this.f61179i = b0Var3;
                            this.f61171a = r0Var3;
                            this.f61172b = i0Var2;
                            this.f61173c = null;
                            this.f61176f = i15;
                            this.f61177g = j8;
                            this.f61178h = 3;
                            objC = j2.c(j15 - j14, bVar4, this);
                        }
                        return aVar3;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                        aVar2.e(null);
                        throw th;
                    }
                } catch (Throwable th5) {
                    d dVar6 = d.this;
                    synchronized (dVar6.f61155j) {
                        throw th5;
                    }
                }
            } catch (ProtobufException e4) {
                c0.f(d.this.f61152g);
                throw e4;
            } catch (CancellationException e14) {
                c0.f(d.this.f61152g);
                throw new ProtobufException("App cancelled protobuf request while waiting for response", e14);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Method method;
        Field declaredField;
        Field field = null;
        new a(0 == true ? 1 : 0);
        try {
            method = GDISmartProto.Smart.class.getMethod("getAllFields", null);
        } catch (Exception unused) {
            method = null;
        }
        f61144m = method;
        try {
            declaredField = GDISmartProto.Smart.class.getDeclaredField("bitField0_");
            declaredField.setAccessible(true);
        } catch (Exception unused2) {
            declaredField = null;
        }
        f61145n = declaredField;
        if (declaredField == null) {
            f61146o = null;
            return;
        }
        try {
            Field declaredField2 = GDISmartProto.Smart.class.getDeclaredField("bitField1_");
            declaredField2.setAccessible(true);
            field = declaredField2;
        } catch (Exception unused3) {
        }
        f61146o = field;
    }

    public d(String str, v vVar, ExtensionRegistryLite extensionRegistryLite, rs2.g gVar, long j8, cz2.a aVar) {
        str.getClass();
        vVar.getClass();
        extensionRegistryLite.getClass();
        aVar.getClass();
        this.f61147b = vVar;
        this.f61148c = extensionRegistryLite;
        this.f61149d = gVar;
        this.f61150e = j8;
        this.f61151f = aVar;
        this.f61152g = q2.l("ProtobufHandler");
        rs2.d.f154380a.getClass();
        this.f61153h = LoggerFactory.getLogger(rs2.d.a("ProtobufHandler", -1L, this, str));
        this.f61154i = new CopyOnWriteArraySet<>();
        this.f61155j = new Object();
        this.f61156k = new LinkedHashMap();
        vVar.d(5043, this);
        vVar.d(5044, this);
        vVar.d(5045, this);
    }

    public static final void i(p0 p0Var, d dVar, int i14, int i15, GDISmartProto.Smart smart, Exception exc, String str) throws ProtobufException {
        if (p0Var.f105807a != 0 && !oc.b.x(exc)) {
            ge1.b.T(dVar.f61152g, null, null, dVar.new C1298d(i15, null), 3);
        }
        if (str == null) {
            if (oc.b.x(exc)) {
                ct2.c.f55534a.getClass();
                String strA = ct2.c.a(i14);
                String strG = dVar.g(smart);
                StringBuilder sbK = androidx.core.view.j.k(i15, "Timeout sending ", strA, " [", "] ");
                sbK.append(strG);
                str = sbK.toString();
            } else {
                ct2.c.f55534a.getClass();
                String strA2 = ct2.c.a(i14);
                String strG2 = dVar.g(smart);
                StringBuilder sbK2 = androidx.core.view.j.k(i15, "Failed to send ", strA2, " [", "] ");
                sbK2.append(strG2);
                str = sbK2.toString();
            }
        }
        dVar.f61153h.error(str);
        throw new ProtobufException(str, exc);
    }

    public static /* synthetic */ void j(p0 p0Var, d dVar, int i14, int i15, GDISmartProto.Smart smart, Exception exc, String str, int i16) throws ProtobufException {
        if ((i16 & 32) != 0) {
            exc = null;
        }
        if ((i16 & 64) != 0) {
            str = null;
        }
        i(p0Var, dVar, i14, i15, smart, exc, str);
        throw null;
    }

    @Override // dt2.g
    public final void a(h hVar) {
        hVar.getClass();
        this.f61154i.add(hVar);
    }

    @Override // dt2.g
    public final Object b(GDISmartProto.Smart smart, t13.d<? super GDISmartProto.Smart> dVar) {
        return c0.e(new e(smart, null), dVar);
    }

    @Override // dt2.g
    public final Object c(GDISmartProto.Smart smart, t13.d<? super Unit> dVar) throws ProtobufException {
        int i14;
        synchronized (this.f61155j) {
            i14 = this.f61157l;
            int i15 = i14 + 1;
            this.f61157l = i15;
            if (i15 > 65535) {
                this.f61157l = 0;
            }
        }
        this.f61153h.debug("Sending Protobuf Notification [" + i14 + "]: " + g(smart));
        rs2.g gVar = this.f61149d;
        if (gVar != null) {
            gVar.onSendNotification(i14, smart);
        }
        Object objH = h(5043, i14, smart, dVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }

    @Override // rs2.b0
    public final void d(int i14, y yVar, byte[] bArr) {
        yVar.getClass();
        if (i14 == 5043) {
            if (yVar == y.NAK || yVar == y.UNKNOWN_OR_NOT_SUPPORTED) {
                int length = bArr.length;
                Logger logger = this.f61153h;
                if (length < 2) {
                    logger.error("Received protobuf unsupported cancellation with invalid length");
                    return;
                }
                int iK = jg.b.K(0, bArr);
                ct2.c.f55534a.getClass();
                logger.debug(t.e(iK, "Incoming ", ct2.c.a(5044), " [", "] unsupported by device"));
                dt2.b bVarF = f(5044, iK, false);
                if (bVarF != null) {
                    ProtobufException protobufException = new ProtobufException("Device doesn't support this protobuf message", null, 2, null);
                    int i15 = q.f128596b;
                    bVarF.a(new q.b(protobufException));
                }
            }
        }
    }

    public final void e() {
        List<dt2.b> listB1;
        c0.d(this.f61152g, "ProtobufHandler closed");
        synchronized (this.f61155j) {
            listB1 = h0.b1(this.f61156k.values());
            this.f61156k.clear();
            Unit unit = Unit.INSTANCE;
        }
        for (dt2.b bVar : listB1) {
            CancellationException cancellationException = new CancellationException("Connection closed");
            bVar.getClass();
            int i14 = q.f128596b;
            bVar.a(new q.b(cancellationException));
        }
    }

    public final dt2.b f(int i14, int i15, boolean z14) {
        long j8 = (((long) i14) & 4294967295L) | ((4294967295L & ((long) i15)) << 32);
        synchronized (this.f61155j) {
            dt2.b bVar = (dt2.b) this.f61156k.get(Long.valueOf(j8));
            if (bVar == null) {
                if (!z14) {
                    return null;
                }
                bVar = new dt2.b(this.f61148c, this.f61151f, new cg1.a(this, j8, i15));
                this.f61156k.put(Long.valueOf(j8), bVar);
            }
            return bVar;
        }
    }

    public final String g(GDISmartProto.Smart smart) {
        String str;
        Set setKeySet;
        try {
            Method method = f61144m;
            if (method != null) {
                Object objInvoke = method.invoke(smart, null);
                Map map = objInvoke instanceof Map ? (Map) objInvoke : null;
                StringBuilder sb3 = new StringBuilder();
                for (Descriptors.FieldDescriptor fieldDescriptor : (map == null || (setKeySet = map.keySet()) == null) ? j0.f134944a : setKeySet) {
                    if (sb3.length() > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(fieldDescriptor.getName());
                }
                return "[ " + ((Object) sb3) + " ]";
            }
            Field field = f61145n;
            if (field == null) {
                return "";
            }
            int i14 = field.getInt(smart);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < 32; i15++) {
                if (((i14 >> i15) & 1) == 1) {
                    arrayList.add(Integer.valueOf(i15));
                }
            }
            Field field2 = f61146o;
            if (field2 != null) {
                int i16 = field2.getInt(smart);
                for (int i17 = 0; i17 < 32; i17++) {
                    if (((i16 >> i17) & 1) == 1) {
                        arrayList.add(Integer.valueOf(i17 + 32));
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                switch (iIntValue + 1) {
                    case 1:
                        str = "Calendar";
                        break;
                    case 2:
                        str = "CIQ Http";
                        break;
                    case 3:
                        str = "CIQ Installed Apps";
                        break;
                    case 4:
                        str = "CIQ App Settings";
                        break;
                    case 5:
                        str = "International Golf";
                        break;
                    case 6:
                        str = "Swing Sensor";
                        break;
                    case 7:
                        str = "Data Transfer";
                        break;
                    case 8:
                        str = "Device Status";
                        break;
                    case 9:
                        str = "Incident Detection";
                        break;
                    case 10:
                        str = "Audio Prompts";
                        break;
                    case 11:
                        str = "Wifi Setup";
                        break;
                    case 12:
                        str = "Find My Watch";
                        break;
                    case 13:
                        str = "Core";
                        break;
                    case 14:
                        str = "Group Live Track";
                        break;
                    case 15:
                        str = "Express Pay Command";
                        break;
                    case 16:
                        str = "SMS Notification";
                        break;
                    case 17:
                        str = "Live Track Messaging";
                        break;
                    case 18:
                        str = "Instant Input";
                        break;
                    case 19:
                        str = "Sport Profile Setup";
                        break;
                    case 20:
                        str = "HSA Data";
                        break;
                    case 21:
                        str = "Live Track";
                        break;
                    case 22:
                        str = "Explore Sync";
                        break;
                    case 23:
                        str = "Waypoint Transfer";
                        break;
                    case 24:
                        str = "Device Message";
                        break;
                    case 25:
                        str = "LTE";
                        break;
                    case 26:
                        str = "Anti-Theft Alarm";
                        break;
                    case 27:
                        str = "Credentials";
                        break;
                    case 28:
                        str = "InReach Tracking";
                        break;
                    case 29:
                        str = "InReach Messaging";
                        break;
                    case 30:
                        str = "Event Sharing";
                        break;
                    case 31:
                        str = "Generic Item Transfer";
                        break;
                    case 32:
                        str = "InReach Contact Sync";
                        break;
                    case 33:
                        str = "Hand Calibration";
                        break;
                    case 34:
                        str = "InReach Weather";
                        break;
                    case 35:
                        str = "Wind";
                        break;
                    case 36:
                        str = "Simple Setup";
                        break;
                    case 37:
                        str = "Switcher";
                        break;
                    case 38:
                        str = "Launch Monitor";
                        break;
                    case 39:
                        str = "SaMD";
                        break;
                    case 40:
                        str = "Navigation Sync";
                        break;
                    default:
                        str = "Unknown (" + iIntValue + ")";
                        break;
                }
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(str);
            }
            return "[ " + ((Object) sb4) + " ]";
        } catch (Exception e4) {
            e0.v("Failed to print protobuf services: ", e4.getMessage(), this.f61153h);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: CancellationException -> 0x0228, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0228, blocks: (B:28:0x0086, B:30:0x008b, B:31:0x00f7), top: B:113:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170 A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017e A[Catch: CancellationException -> 0x0177, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c5 A[Catch: CancellationException -> 0x0177, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0177, blocks: (B:41:0x012c, B:43:0x0132, B:66:0x0170, B:73:0x0194, B:74:0x01c4, B:72:0x017e, B:46:0x0143, B:49:0x014a, B:52:0x0151, B:55:0x0158, B:58:0x015f, B:61:0x0166, B:75:0x01c5), top: B:111:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [dt2.d$c, t13.d] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.p0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [dt2.d$c] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [u13.a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.garmin.proto.generated.GDISmartProto$Smart] */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.slf4j.Logger] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v11, types: [rs2.v] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011d -> B:115:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(int r21, int r22, com.garmin.proto.generated.GDISmartProto.Smart r23, t13.d<? super p005kotlin.Unit> r24) throws com.garmin.gfdi.protobuf.ProtobufException {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt2.d.h(int, int, com.garmin.proto.generated.GDISmartProto$Smart, t13.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) throws IOException {
        String str;
        int i15;
        l lVar;
        ByteArrayOutputStream byteArrayOutputStream;
        bArr.getClass();
        Logger logger = this.f61153h;
        u53.d dVar = this.f61152g;
        switch (i14) {
            case 5043:
            case 5044:
                if (bArr.length >= 14) {
                    int iK = jg.b.K(0, bArr);
                    int iL = (int) jg.b.L(2, bArr);
                    int iL2 = (int) jg.b.L(6, bArr);
                    int iL3 = (int) jg.b.L(10, bArr);
                    int i16 = iL3 + 14;
                    if (bArr.length >= i16) {
                        byte[] bArrK = p13.s.k(14, i16, bArr);
                        dt2.b bVarF = f(i14, iK, i14 == 5043 && iL == 0);
                        if (bVarF != null) {
                            str = " [";
                            bVarF.f61139d.set(bVarF.f61137b.millis());
                            ByteArrayOutputStream byteArrayOutputStream2 = bVarF.f61141f;
                            i15 = iL;
                            if (byteArrayOutputStream2.size() < i15) {
                                int i17 = q.f128596b;
                                bVarF.a(new q.b(new ProtobufException("Incoming data failed: Missing packet", null, 2, null)));
                                lVar = l.MISSING_PACKET;
                            } else if (byteArrayOutputStream2.size() > i15) {
                                lVar = l.DUPLICATE_PACKET;
                            } else if (byteArrayOutputStream2.size() + bArrK.length > iL2) {
                                int i18 = q.f128596b;
                                bVarF.a(new q.b(new ProtobufException("Incoming data failed: Exceeded protobuf length", null, 2, null)));
                                lVar = l.EXCEEDED_PROTOBUF_LENGTH;
                            } else {
                                byteArrayOutputStream2.write(bArrK);
                                if (byteArrayOutputStream2.size() == iL2) {
                                    try {
                                        GDISmartProto.Smart from = GDISmartProto.Smart.parseFrom(byteArrayOutputStream2.toByteArray(), bVarF.f61136a);
                                        int i19 = q.f128596b;
                                        lVar = bVarF.a(from) ? l.NO_ERROR : l.UNKNOWN_PROTOBUF_MESSAGE;
                                    } catch (InvalidProtocolBufferException e4) {
                                        int i24 = q.f128596b;
                                        bVarF.a(new q.b(new ProtobufException("Incoming data failed: Parse error", e4)));
                                        lVar = l.PARSE_ERROR;
                                    }
                                } else {
                                    lVar = l.NO_ERROR;
                                }
                            }
                            if (lVar == null) {
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream(8);
                            lg.d.P(byteArrayOutputStream, iK);
                            lg.d.Q(byteArrayOutputStream, i15);
                            lVar.getClass();
                            if (lVar != l.NO_ERROR || lVar == l.DUPLICATE_PACKET) {
                                String str2 = str;
                                ct2.c.f55534a.getClass();
                                StringBuilder sbK = androidx.core.view.j.k(iK, "Received ", ct2.c.a(i14), str2, "]: bytes ");
                                e0.m(i15, (i15 + iL3) - 1, "-", " of ", sbK);
                                sbK.append(iL2);
                                logger.debug(sbK.toString());
                                byteArrayOutputStream.write(0);
                            } else {
                                ct2.c.f55534a.getClass();
                                String strA = ct2.c.a(i14);
                                String strName = lVar.name();
                                StringBuilder sbK2 = androidx.core.view.j.k(iK, "Received invalid ", strA, str, "]: ");
                                sbK2.append(strName);
                                logger.warn(sbK2.toString());
                                int i25 = b.f61158a[lVar.ordinal()];
                                if (i25 == 1 || i25 == 2) {
                                    logger.warn("Invalid protobuf bytes received from device");
                                } else if (i25 == 3) {
                                    logger.warn("No app ProtobufRequestListener found for valid protobuf message from device");
                                }
                                byteArrayOutputStream.write(1);
                            }
                            byteArrayOutputStream.write(lVar.f61211a & 255);
                            y yVar = y.ACK;
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                            ft2.d.a(xVar, dVar, yVar, byteArray);
                        } else {
                            str = " [";
                            i15 = iL;
                        }
                        lVar = l.UNKNOWN_REQUEST_ID;
                        byteArrayOutputStream = new ByteArrayOutputStream(8);
                        lg.d.P(byteArrayOutputStream, iK);
                        lg.d.Q(byteArrayOutputStream, i15);
                        lVar.getClass();
                        if (lVar != l.NO_ERROR) {
                            String str3 = str;
                            ct2.c.f55534a.getClass();
                            StringBuilder sbK3 = androidx.core.view.j.k(iK, "Received ", ct2.c.a(i14), str3, "]: bytes ");
                            e0.m(i15, (i15 + iL3) - 1, "-", " of ", sbK3);
                            sbK3.append(iL2);
                            logger.debug(sbK3.toString());
                            byteArrayOutputStream.write(0);
                        } else {
                            String str4 = str;
                            ct2.c.f55534a.getClass();
                            StringBuilder sbK4 = androidx.core.view.j.k(iK, "Received ", ct2.c.a(i14), str4, "]: bytes ");
                            e0.m(i15, (i15 + iL3) - 1, "-", " of ", sbK4);
                            sbK4.append(iL2);
                            logger.debug(sbK4.toString());
                            byteArrayOutputStream.write(0);
                        }
                        byteArrayOutputStream.write(lVar.f61211a & 255);
                        y yVar2 = y.ACK;
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        byteArray2.getClass();
                        ft2.d.a(xVar, dVar, yVar2, byteArray2);
                    } else {
                        ct2.c.f55534a.getClass();
                        logger.error(t.e(iK, "Received ", ct2.c.a(i14), " [", "] with invalid data length"));
                        ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                    }
                } else {
                    ct2.c.f55534a.getClass();
                    com.airbnb.lottie.animation.keyframe.a.z("Received ", ct2.c.a(i14), " with invalid length", logger);
                    ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                }
                break;
            case 5045:
                if (bArr.length >= 2) {
                    int iK2 = jg.b.K(0, bArr);
                    ct2.c.f55534a.getClass();
                    logger.debug(t.e(iK2, "Incoming ", ct2.c.a(5044), " [", "] cancelled by device"));
                    dt2.b bVarF2 = f(5044, iK2, false);
                    if (bVarF2 != null) {
                        ProtobufException protobufException = new ProtobufException("Device cancelled protobuf", null, 2, null);
                        int i26 = q.f128596b;
                        bVarF2.a(new q.b(protobufException));
                    }
                    ft2.d.a(xVar, dVar, y.ACK, bArr);
                } else {
                    logger.error("Received protobuf cancellation with invalid length");
                    ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                }
                break;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Ldt2/d$a;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT", "J", "RESPONSE_FAILSAFE_TIMEOUT", "", "HEADER_SIZE", "I", "Ljava/lang/reflect/Method;", "getAllFieldsMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "bitField0", "Ljava/lang/reflect/Field;", "bitField1", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, v vVar, ExtensionRegistryLite extensionRegistryLite, rs2.g gVar, long j8, cz2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        cz2.a aVar2;
        rs2.g gVar2 = (i14 & 8) != 0 ? null : gVar;
        long j14 = (i14 & 16) != 0 ? 30000L : j8;
        if ((i14 & 32) != 0) {
            cz2.a.f56879a.getClass();
            aVar2 = cz2.a.C1219a.f56881b;
        } else {
            aVar2 = aVar;
        }
        this(str, vVar, extensionRegistryLite, gVar2, j14, aVar2);
    }
}
