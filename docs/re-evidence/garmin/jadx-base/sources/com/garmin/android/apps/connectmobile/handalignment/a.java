package com.garmin.android.apps.connectmobile.handalignment;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import en0.o;
import java.util.Set;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/a;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f36596b = a1.b(Integer.valueOf(SupportedCapability.HANDS_CALIBRATION.ordinal()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Logger f36597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u53.d f36598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rs2.c f36599e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.handalignment.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.handalignment.HandAlignmentProtobufHandler$onProtobufRequest$1", f = "HandAlignmentProtobufHandler.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class C0646a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f36602c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.handalignment.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.handalignment.HandAlignmentProtobufHandler$onProtobufRequest$1$1", f = "HandAlignmentProtobufHandler.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0647a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f36603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f36604b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.handalignment.a$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.handalignment.HandAlignmentProtobufHandler$onProtobufRequest$1$1$1", f = "HandAlignmentProtobufHandler.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0648a extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f36605a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GDIHandCalibration.RotateNotification.Status f36606b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0648a(long j8, GDIHandCalibration.RotateNotification.Status status, t13.d<? super C0648a> dVar) {
                    super(2, dVar);
                    this.f36605a = j8;
                    this.f36606b = status;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C0648a(this.f36605a, this.f36606b, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C0648a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    f.f36613h.getClass();
                    f fVar = (f) f.f36614i.get(Long.valueOf(this.f36605a));
                    if (fVar != null) {
                        GDIHandCalibration.RotateNotification.Status status = this.f36606b;
                        status.getClass();
                        fVar.f36621g.c(status);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0647a(a aVar, GDISmartProto.Smart smart, t13.d<? super C0647a> dVar) {
                super(2, dVar);
                this.f36603a = aVar;
                this.f36604b = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0647a(this.f36603a, this.f36604b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0647a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a aVar2 = this.f36603a;
                rs2.c cVar = aVar2.f36599e;
                if (cVar == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                String f92741e = cVar.getF92741e();
                rs2.c cVar2 = aVar2.f36599e;
                if (cVar2 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                long f92746j = cVar2.getF92746j();
                GDISmartProto.Smart smart = this.f36604b;
                if (o.a(smart).hasRotateNotification()) {
                    GDIHandCalibration.RotateNotification.Status status = o.a(smart).getRotateNotification().getStatus();
                    Logger logger = aVar2.f36597c;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.debug("[" + f92741e + "] rotate notification status = " + status);
                    u53.d dVar = aVar2.f36598d;
                    if (dVar == null) {
                        s.m("coroutineScope");
                        throw null;
                    }
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(dVar, u53.o.f168762a, null, new C0648a(f92746j, status, null), 2);
                } else {
                    Logger logger2 = aVar2.f36597c;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    com.airbnb.lottie.animation.keyframe.a.u("[", f92741e, "] unknown protobuf message.", logger2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0646a(GDISmartProto.Smart smart, t13.d<? super C0646a> dVar) {
            super(2, dVar);
            this.f36602c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new C0646a(this.f36602c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0646a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36600a;
            if (i14 == 0) {
                r.b(obj);
                C0647a c0647a = new C0647a(a.this, this.f36602c, null);
                this.f36600a = 1;
                if (ge1.b.Y(c0647a, this) == aVar) {
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

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f36598d;
        if (dVar != null) {
            c0.d(dVar, "HandAlignmentProtobufHandler closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f36596b;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIHandCalibrationExtension.handCalibrationService)) {
            return false;
        }
        u53.d dVar = this.f36598d;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new C0646a(smart, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f36598d = c0.a(new a0("HandAlignmentProtoHandler"));
        Logger logger = LoggerFactory.getLogger("HandAlignmentProtoHandler");
        logger.getClass();
        this.f36597c = logger;
        extensionRegistryLite.add(GDIHandCalibrationExtension.handCalibrationService);
        ((dt2.d) gVar).f61154i.add(this);
        this.f36599e = cVar;
    }
}
