package px2;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.GDISaMD;
import com.garmin.proto.generated.GDISaMDExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.SaMDEcg;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.BitSet;
import java.util.Set;
import o13.r;
import o13.t;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.a1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lpx2/o;", "Ldt2/c;", "Ldt2/h;", "Lrs2/c;", "deviceInfo", "Lkx2/d;", "appCapabilities", "Lzj2/e;", "dataTransfer", "<init>", "(Lrs2/c;Lkx2/d;Lzj2/e;)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements dt2.c, dt2.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f141834m = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs2.c f141835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx2.d f141836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zj2.e f141837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f141838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f141839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f141840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f141841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kx2.d f141842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dt2.g f141843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public px2.e f141844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public px2.f f141845l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$onProtobufRequest$1$1", f = "SaMDProtobufHandler.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141846a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISaMD.Service f141848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f141849d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GDISaMD.Service service, dt2.k kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141848c = service;
            this.f141849d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new b(this.f141848c, this.f141849d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141846a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.this;
                px2.e eVar = oVar.f141844k;
                if (eVar != null) {
                    long f172494b = oVar.f141835b.getF92746j();
                    String str = oVar.f141838e;
                    ByteString ecgService = this.f141848c.getEcgService();
                    ecgService.getClass();
                    this.f141846a = 1;
                    Logger logger = eVar.f141793b;
                    SaMDEcg.Service from = SaMDEcg.Service.parseFrom(ecgService);
                    Unit unit = null;
                    if (!from.hasFirstReadResult()) {
                        from = null;
                    }
                    if (from != null) {
                        gx2.b.f80060a.getClass();
                        vf1.b bVar = gx2.b.f80061b;
                        if (bVar != null) {
                            logger.debug("handleDeviceRequest: notifying app of 'first read result'...");
                            SaMDEcg.FirstReadResult firstReadResult = from.getFirstReadResult();
                            firstReadResult.getClass();
                            bVar.e(f172494b, str, firstReadResult);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            logger.error("handleDeviceRequest: app delegate is null, cannot notify app of 'first read result'...");
                        }
                    }
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$onProtobufRequest$1$2", f = "SaMDProtobufHandler.kt", l = {180}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141850a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISaMD.Service f141852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f141853d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GDISaMD.Service service, dt2.k kVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f141852c = service;
            this.f141853d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new c(this.f141852c, this.f141853d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141850a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.this;
                px2.f fVar = oVar.f141845l;
                if (fVar != null) {
                    long f172494b = oVar.f141835b.getF92746j();
                    ByteString garminHealthService = this.f141852c.getGarminHealthService();
                    garminHealthService.getClass();
                    this.f141850a = 1;
                    fVar.f141794b.debug("handleDeviceRequest...");
                    GDIGarminHealth.Service from = GDIGarminHealth.Service.parseFrom(garminHealthService);
                    from.getClass();
                    Object objK = fVar.k(from, f172494b, this.f141853d, this);
                    if (objK != aVar) {
                        objK = Unit.INSTANCE;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$onProtobufRequest$1$3", f = "SaMDProtobufHandler.kt", l = {191}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141854a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f141856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f141857d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr, dt2.k kVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f141856c = bArr;
            this.f141857d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new d(this.f141856c, this.f141857d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141854a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.this;
                px2.f fVar = oVar.f141845l;
                if (fVar != null) {
                    long f172494b = oVar.f141835b.getF92746j();
                    byte[] bArr = this.f141856c;
                    bArr.getClass();
                    this.f141854a = 1;
                    fVar.f141794b.debug("handleDeviceRequest(base64)...");
                    GDIGarminHealth.Service from = GDIGarminHealth.Service.parseFrom(bArr);
                    from.getClass();
                    Object objK = fVar.k(from, f172494b, this.f141857d, this);
                    if (objK != aVar) {
                        objK = Unit.INSTANCE;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$onProtobufRequest$1$4", f = "SaMDProtobufHandler.kt", l = {195}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141858a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IllegalArgumentException f141860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ dt2.k f141861d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
        @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$onProtobufRequest$1$4$1", f = "SaMDProtobufHandler.kt", l = {199}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f141862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f141863b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IllegalArgumentException f141864c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ dt2.k f141865d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, IllegalArgumentException illegalArgumentException, dt2.k kVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f141863b = oVar;
                this.f141864c = illegalArgumentException;
                this.f141865d = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f141863b, this.f141864c, this.f141865d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f141862a;
                if (i14 == 0) {
                    r.b(obj);
                    GDISaMD.SaMDCommonFailures saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    this.f141863b.f141839f.error("handleMsg -> base64 decoding service 'garmin_health_service_file_transfer', sending failure 'GDIGarminHealth.FileTransferResponse' " + saMDCommonFailures, (Throwable) this.f141864c);
                    GDISmartProto.Smart smartA = tu2.a.a(GDIGarminHealth.Service.newBuilder().setFileXferResponse(GDIGarminHealth.FileTransferResponse.newBuilder().setFailure(saMDCommonFailures)));
                    smartA.getClass();
                    this.f141862a = 1;
                    if (dt2.j.a(this.f141865d, smartA, this) == aVar) {
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
        public e(IllegalArgumentException illegalArgumentException, dt2.k kVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f141860c = illegalArgumentException;
            this.f141861d = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new e(this.f141860c, this.f141861d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141858a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(o.this, this.f141860c, this.f141861d, null);
                this.f141858a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo53/b0;", "invoke", "()Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends w implements e23.a<b0> {
        public f() {
            super(0);
        }

        @Override // e23.a
        public final b0 invoke() {
            o oVar = o.this;
            a0 a0Var = new a0("ProtoHandler_" + oVar.f141835b.getF92746j() + "@" + oVar.hashCode());
            x53.c cVar = s0.f129406a;
            return c0.a(a0Var.plus(x53.b.f189152a).plus(ge1.b.h()));
        }
    }

    private o(rs2.c cVar, kx2.d dVar, zj2.e eVar) {
        this.f141835b = cVar;
        this.f141836c = dVar;
        this.f141837d = eVar;
        this.f141838e = cVar.getF92741e();
        Logger loggerL = ge1.b.L("ProtoHandler_" + cVar.getF92746j() + "@" + hashCode());
        this.f141839f = loggerL;
        this.f141840g = o13.m.b(new f());
        this.f141842i = new kx2.d(false, false, false, 7, null);
        loggerL.debug("app -> " + dVar);
    }

    public final b0 c() {
        return (b0) this.f141840g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt2.a
    public final void close(String str) {
        rs2.c cVar = this.f141835b;
        str.getClass();
        try {
            this.f141839f.debug("close");
            c0.d(c(), cVar.getF92742f() + ", unitId " + cVar.getF92746j() + " disconnected");
            p pVar = this.f141841h;
            if (pVar != null) {
                da2.d.b().f58886a.i(pVar);
            }
        } finally {
            this.f141844k = null;
            this.f141845l = null;
        }
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        this.f141839f.debug("configure");
        GDISaMDExtension.registerAllExtensions(extensionRegistryLite);
        GDISaMD.registerAllExtensions(extensionRegistryLite);
        kx2.d dVar = this.f141836c;
        dVar.getClass();
        BitSet bitSet = new BitSet();
        bitSet.set(0, dVar.f107129a);
        bitSet.set(1, dVar.f107130b);
        bitSet.set(2, dVar.f107131c);
        bitSet.set(3, this.f141837d != null);
        ByteString byteStringCopyFrom = ByteString.copyFrom(bitSet.toByteArray());
        byteStringCopyFrom.getClass();
        builder.setExtension(GDISaMD.requestSaMDCapabilities, byteStringCopyFrom);
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return a1.b(89);
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GDISaMD.Service serviceB = tu2.a.b(smart);
        if (serviceB != null) {
            if (serviceB.hasEcgService() && !serviceB.getEcgService().isEmpty()) {
                ge1.b.T(c(), null, null, new b(serviceB, kVar, null), 3);
                return true;
            }
            if (serviceB.hasGarminHealthService() && !serviceB.getGarminHealthService().isEmpty()) {
                ge1.b.T(c(), null, null, new c(serviceB, kVar, null), 3);
                return true;
            }
            if (serviceB.hasGarminHealthServiceFileTransfer()) {
                String garminHealthServiceFileTransfer = serviceB.getGarminHealthServiceFileTransfer();
                garminHealthServiceFileTransfer.getClass();
                if (garminHealthServiceFileTransfer.length() > 0) {
                    try {
                        ge1.b.T(c(), null, null, new d(Base64.decode(serviceB.getGarminHealthServiceFileTransfer(), 0), kVar, null), 3);
                        return true;
                    } catch (IllegalArgumentException e4) {
                        ge1.b.T(c(), null, null, new e(e4, kVar, null), 3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // dt2.c
    @SuppressLint({"VisibleForTests"})
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        ByteString byteString;
        Logger logger = this.f141839f;
        StringBuilder sb3 = new StringBuilder("receiveCapabilities: ");
        try {
            GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, ByteString> generatedExtension = GDISaMD.responseSaMDCapabilities;
            if (featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                byteString = (ByteString) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                if (byteString.isEmpty()) {
                    byteString = null;
                }
            } else {
                byteString = null;
            }
            if (byteString != null) {
                kx2.d.f107128d.getClass();
                BitSet bitSetValueOf = BitSet.valueOf(byteString.toByteArray());
                this.f141842i = new kx2.d(bitSetValueOf.get(0), bitSetValueOf.get(1), bitSetValueOf.get(2));
            }
            sb3.append("device -> ");
            sb3.append(this.f141842i);
            qx2.a aVar = qx2.a.f148445a;
            long f172494b = this.f141835b.getF92746j();
            kx2.d dVar = this.f141842i;
            synchronized (aVar) {
                qx2.a.g(dVar, aVar.b(qx2.b.DEVICE_SAMD_CAPABILITIES, f172494b));
            }
            logger.debug(sb3.toString());
        } catch (Throwable th3) {
            logger.debug(sb3.toString());
            throw th3;
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        rs2.c cVar2;
        dt2.g gVar2;
        cVar.getClass();
        gVar.getClass();
        Logger logger = this.f141839f;
        logger.debug(TtmlNode.START);
        kx2.d dVar = this.f141836c;
        if (dVar.f107130b && this.f141842i.f107130b) {
            this.f141844k = new px2.e(gVar, logger);
            logger.debug("start: 'EcgServiceHandler' created");
        }
        if ((dVar.f107131c && this.f141842i.f107131c) || (dVar.f107129a && this.f141842i.f107129a)) {
            cVar2 = cVar;
            gVar2 = gVar;
            this.f141845l = new px2.f(gVar2, cVar2, this.f141839f, c(), this.f141837d);
            logger.debug("start: 'GarminHealthServiceHandler' created");
        } else {
            cVar2 = cVar;
            gVar2 = gVar;
        }
        if (this.f141844k == null && this.f141845l == null) {
            return;
        }
        this.f141843j = gVar2;
        ((dt2.d) gVar2).f61154i.add(this);
        if (!da2.d.b().f58886a.g(((us2.f) cVar2).f172493a)) {
            logger.warn("start: presumed pairing (not a requested persisted connection)");
            return;
        }
        logger.debug("initGarminDeviceConnectionCallback");
        this.f141841h = new p(this);
        la2.e eVar = da2.d.b().f58886a;
        p pVar = this.f141841h;
        pVar.getClass();
        eVar.b(pVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpx2/o$a;", "", "<init>", "()V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o(rs2.c cVar, kx2.d dVar, zj2.e eVar, p005kotlin.jvm.internal.j jVar) {
        this(cVar, dVar, eVar);
    }
}
