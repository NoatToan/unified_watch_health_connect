package com.garmin.android.gfdi.framework;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.ble.BleCommunicationException;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gfdi.auth.GarminAuthNotAllowedException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import la2.j;
import ma2.f;
import o13.r;
import o53.b0;
import o53.c0;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import pj2.k;
import r1.q2;
import rs2.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0002@?B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J+\u0010\u0018\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0094@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0084@¢\u0006\u0004\b\u001e\u0010\u001dJ \u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0084@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/garmin/android/gfdi/framework/GfdiServiceSubscriber;", "Lma2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpj2/k;", "gatt", "Ljava/util/UUID;", "service", "readChar", "writeChar", "<init>", "(Landroid/content/Context;Lpj2/k;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "Lla2/j;", "connectionManager", "()Lla2/j;", "", "onResetNeeded", "()V", "", "delayStartUntilAfterHandshake", "()Z", "onDeviceDisconnect", "", "characteristics", "initialize", "(Ljava/util/UUID;[Ljava/util/UUID;)Z", "", "macAddress", "startCommunication", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "restartConnection", "", "retries", "enabled", "toggleNotifications", "(IZLt13/d;)Ljava/lang/Object;", "Lpj2/k;", "Ljava/util/UUID;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "Lcom/garmin/android/gfdi/framework/DeviceManager;", "deviceManager", "Lcom/garmin/android/gfdi/framework/DeviceManager;", "getDeviceManager", "()Lcom/garmin/android/gfdi/framework/DeviceManager;", "setDeviceManager", "(Lcom/garmin/android/gfdi/framework/DeviceManager;)V", "Lrs2/i$b;", "guidMismatchCheck", "Lrs2/i$b;", "getGuidMismatchCheck", "()Lrs2/i$b;", "setGuidMismatchCheck", "(Lrs2/i$b;)V", "Companion", "Creator", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class GfdiServiceSubscriber implements f {
    private static final int ENABLE_NOTIFICATION_RETRIES = 3;
    private final Context context;
    private final b0 coroutineScope;
    private DeviceManager deviceManager;
    private final k gatt;
    private i.b guidMismatchCheck;
    private final Logger logger;
    private final UUID readChar;
    private final UUID service;
    private final UUID writeChar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean ENABLE_NO_RESPONSE_WATCHDOG = true;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/gfdi/framework/GfdiServiceSubscriber$Creator;", "Lma2/f$a;", "Ljava/util/UUID;", "service", "readChar", "writeChar", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lda2/e;", "configuration", "Lpj2/k;", "gatt", "Lma2/f;", "create", "(Landroid/content/Context;Lda2/e;Lpj2/k;)Lma2/f;", "Ljava/util/UUID;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements f.a {
        private final UUID readChar;
        private final UUID service;
        private final UUID writeChar;

        public Creator(UUID uuid, UUID uuid2, UUID uuid3) {
            uuid.getClass();
            uuid2.getClass();
            uuid3.getClass();
            this.service = uuid;
            this.readChar = uuid2;
            this.writeChar = uuid3;
        }

        @Override // ma2.f.a
        public f create(Context context, da2.e configuration, k gatt) {
            context.getClass();
            configuration.getClass();
            gatt.getClass();
            return new GfdiServiceSubscriber(context, gatt, this.service, this.readChar, this.writeChar);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$initialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.GfdiServiceSubscriber$initialize$1", f = "GfdiServiceSubscriber.kt", l = {113}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ String $macAddress;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$initialize$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.gfdi.framework.GfdiServiceSubscriber$initialize$1$1", f = "GfdiServiceSubscriber.kt", l = {114}, m = "invokeSuspend")
        public static final class C09851 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ String $macAddress;
            int label;
            final /* synthetic */ GfdiServiceSubscriber this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09851(GfdiServiceSubscriber gfdiServiceSubscriber, String str, t13.d<? super C09851> dVar) {
                super(2, dVar);
                this.this$0 = gfdiServiceSubscriber;
                this.$macAddress = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C09851(this.this$0, this.$macAddress, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C09851) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    GfdiServiceSubscriber gfdiServiceSubscriber = this.this$0;
                    String str = this.$macAddress;
                    this.label = 1;
                    if (gfdiServiceSubscriber.startCommunication(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$macAddress = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return GfdiServiceSubscriber.this.new AnonymousClass1(this.$macAddress, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                C09851 c09851 = new C09851(GfdiServiceSubscriber.this, this.$macAddress, null);
                this.label = 1;
                if (ge1.b.Y(c09851, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$restartConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.framework.GfdiServiceSubscriber", f = "GfdiServiceSubscriber.kt", l = {219, 227}, m = "restartConnection")
    public static final class C38981 extends v13.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C38981(t13.d<? super C38981> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GfdiServiceSubscriber.this.restartConnection(null, this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$startCommunication$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.framework.GfdiServiceSubscriber", f = "GfdiServiceSubscriber.kt", l = {143, TsExtractor.TS_STREAM_TYPE_AC4, 197}, m = "startCommunication$suspendImpl")
    public static final class C38991 extends v13.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C38991(t13.d<? super C38991> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GfdiServiceSubscriber.startCommunication$suspendImpl(GfdiServiceSubscriber.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$toggleNotifications$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.framework.GfdiServiceSubscriber", f = "GfdiServiceSubscriber.kt", l = {241}, m = "toggleNotifications")
    public static final class C39001 extends v13.c {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C39001(t13.d<? super C39001> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GfdiServiceSubscriber.this.toggleNotifications(0, false, this);
        }
    }

    public GfdiServiceSubscriber(Context context, k kVar, UUID uuid, UUID uuid2, UUID uuid3) {
        context.getClass();
        kVar.getClass();
        uuid.getClass();
        uuid2.getClass();
        uuid3.getClass();
        this.gatt = kVar;
        this.service = uuid;
        this.readChar = uuid2;
        this.writeChar = uuid3;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
        Logger logger = LoggerFactory.getLogger(oa2.d.b("GDI#", "GfdiSubscriber", kVar.getMacAddress(), -1L, this));
        logger.getClass();
        this.logger = logger;
        this.coroutineScope = q2.l("GfdiServiceSubscriber");
        this.guidMismatchCheck = i.b.NOTIFY_MISMATCH;
    }

    private final j connectionManager() {
        la2.e eVar = da2.d.b().f58886a;
        eVar.getClass();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResetNeeded() {
        this.logger.warn("GfdiWatchdog Reset Attempt on " + this.gatt.getMacAddress());
        la2.e eVar = da2.d.b().f58886a;
        String macAddress = this.gatt.getMacAddress();
        macAddress.getClass();
        eVar.k(macAddress);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: all -> 0x010f, GarminAuthNotAllowedException -> 0x0114, TRY_LEAVE, TryCatch #3 {GarminAuthNotAllowedException -> 0x0114, blocks: (B:50:0x0102, B:52:0x010a), top: B:112:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138 A[Catch: GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, TryCatch #10 {GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, blocks: (B:64:0x0132, B:66:0x0138, B:68:0x0140, B:73:0x0159, B:75:0x015d, B:76:0x0169, B:78:0x016d, B:80:0x0176), top: B:121:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0140 A[Catch: GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, TryCatch #10 {GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, blocks: (B:64:0x0132, B:66:0x0138, B:68:0x0140, B:73:0x0159, B:75:0x015d, B:76:0x0169, B:78:0x016d, B:80:0x0176), top: B:121:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015d A[Catch: GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, TryCatch #10 {GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, blocks: (B:64:0x0132, B:66:0x0138, B:68:0x0140, B:73:0x0159, B:75:0x015d, B:76:0x0169, B:78:0x016d, B:80:0x0176), top: B:121:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x016d A[Catch: GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, TryCatch #10 {GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, blocks: (B:64:0x0132, B:66:0x0138, B:68:0x0140, B:73:0x0159, B:75:0x015d, B:76:0x0169, B:78:0x016d, B:80:0x0176), top: B:121:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0176 A[Catch: GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, TRY_LEAVE, TryCatch #10 {GarminAuthNotAllowedException -> 0x0155, all -> 0x0157, blocks: (B:64:0x0132, B:66:0x0138, B:68:0x0140, B:73:0x0159, B:75:0x015d, B:76:0x0169, B:78:0x016d, B:80:0x0176), top: B:121:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019e, code lost:
    
        if (r4.restartConnection(r8, r12) == r3) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object startCommunication$suspendImpl(GfdiServiceSubscriber gfdiServiceSubscriber, String str, t13.d<? super Unit> dVar) {
        C38991 c38991;
        OutputStream outputStreamF;
        InputStream inputStream;
        String str2;
        BleCommunicationException bleCommunicationException;
        hk0.f fVar;
        GfdiServiceSubscriber gfdiServiceSubscriber2;
        Object obj;
        rs2.e eVar;
        k kVar;
        InputStream inputStream2;
        Object objB;
        GfdiServiceSubscriber gfdiServiceSubscriber3;
        InputStream inputStream3;
        String str3;
        i iVar;
        DeviceManager deviceManager;
        DeviceProfile profile;
        qj2.a aVar;
        GfdiServiceSubscriber gfdiServiceSubscriber4 = gfdiServiceSubscriber;
        String str4 = str;
        if (dVar instanceof C38991) {
            c38991 = (C38991) dVar;
            int i14 = c38991.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c38991.label = i14 - Integer.MIN_VALUE;
            } else {
                c38991 = gfdiServiceSubscriber4.new C38991(dVar);
            }
        } else {
            c38991 = gfdiServiceSubscriber4.new C38991(dVar);
        }
        C38991 c38992 = c38991;
        Object obj2 = c38992.result;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = c38992.label;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(obj2);
            try {
                qj2.a aVarK = gfdiServiceSubscriber4.gatt.k(gfdiServiceSubscriber4.service, gfdiServiceSubscriber4.readChar);
                outputStreamF = gfdiServiceSubscriber4.gatt.f(gfdiServiceSubscriber4.service, gfdiServiceSubscriber4.writeChar);
                int iL = gfdiServiceSubscriber4.gatt.l();
                if (!pj2.j.e() || iL > 20) {
                    j jVarConnectionManager = gfdiServiceSubscriber4.connectionManager();
                    String macAddress = gfdiServiceSubscriber4.gatt.getMacAddress();
                    macAddress.getClass();
                    ((la2.e) jVarConnectionManager).j(macAddress, gfdiServiceSubscriber4.gatt.l() > 20);
                } else {
                    aVarK.f145051e = true;
                }
                try {
                    c38992.L$0 = gfdiServiceSubscriber4;
                    c38992.L$1 = str4;
                    c38992.L$2 = aVarK;
                    c38992.L$3 = outputStreamF;
                    c38992.label = 1;
                    if (gfdiServiceSubscriber4.toggleNotifications(3, true, c38992) != aVar2) {
                        inputStream = aVarK;
                        str2 = str4;
                        da2.h.e(str2);
                        fVar = da2.d.c(gfdiServiceSubscriber4.context).f58887b;
                        if (fVar == null) {
                            gfdiServiceSubscriber4.logger.error("No HostConfiguration has been set");
                            da2.h.c(str2, "No HostConfiguration has been set");
                            return Unit.INSTANCE;
                        }
                        rs2.e.f154382c.getClass();
                        eVar = rs2.e.f154383d;
                        kVar = gfdiServiceSubscriber4.gatt;
                        if (kVar instanceof eh2.a) {
                            if (((eh2.a) kVar).d()) {
                                eVar = rs2.e.f154384e;
                            }
                        }
                        rs2.e eVar2 = eVar;
                        OutputStream outputStream = outputStreamF;
                        i.a aVar3 = i.f154387h;
                        i.b bVar = gfdiServiceSubscriber4.guidMismatchCheck;
                        c38992.L$0 = gfdiServiceSubscriber4;
                        c38992.L$1 = str2;
                        c38992.L$2 = inputStream;
                        c38992.L$3 = null;
                        c38992.label = 2;
                        inputStream2 = inputStream;
                        obj = null;
                        objB = aVar3.b(inputStream2, outputStream, str2, fVar, bVar, eVar2, c38992);
                        if (objB != aVar2) {
                            gfdiServiceSubscriber3 = gfdiServiceSubscriber4;
                            inputStream3 = inputStream2;
                            iVar = (i) objB;
                            if (inputStream3 instanceof qj2.a) {
                                aVar = (qj2.a) inputStream3;
                                aVar.f145051e = false;
                                if (aVar.f145052f > 20) {
                                    j jVarConnectionManager2 = gfdiServiceSubscriber3.connectionManager();
                                    String macAddress2 = gfdiServiceSubscriber3.gatt.getMacAddress();
                                    macAddress2.getClass();
                                    ((la2.e) jVarConnectionManager2).j(macAddress2, z14);
                                }
                            }
                            if (ENABLE_NO_RESPONSE_WATCHDOG) {
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(gfdiServiceSubscriber3);
                                iVar.getClass();
                                iVar.f154393f.f154448e = anonymousClass2;
                            }
                            deviceManager = gfdiServiceSubscriber3.deviceManager;
                            if (deviceManager != null) {
                                deviceManager.setGfdiDevice(iVar);
                                profile = deviceManager.getProfile();
                                if (profile != null) {
                                    da2.h.b(profile);
                                }
                            }
                        }
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof BleCommunicationException) {
                        bleCommunicationException = th;
                    } else {
                        bleCommunicationException = null;
                    }
                    if (bleCommunicationException != null || bleCommunicationException.getGattStatus() == Integer.MIN_VALUE) {
                        gfdiServiceSubscriber4.logger.trace("Device disconnected before notifications were enabled.");
                        return Unit.INSTANCE;
                    }
                    da2.h.c(str4, th.getMessage());
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                gfdiServiceSubscriber4.logger.error("Failed to open characteristics", th4);
                da2.h.c(str4, th4.getMessage());
                return Unit.INSTANCE;
            }
        }
        if (i15 == 1) {
            OutputStream outputStream2 = (OutputStream) c38992.L$3;
            inputStream = (InputStream) c38992.L$2;
            String str5 = (String) c38992.L$1;
            GfdiServiceSubscriber gfdiServiceSubscriber5 = (GfdiServiceSubscriber) c38992.L$0;
            try {
                r.b(obj2);
                str2 = str5;
                outputStreamF = outputStream2;
                gfdiServiceSubscriber4 = gfdiServiceSubscriber5;
                da2.h.e(str2);
                fVar = da2.d.c(gfdiServiceSubscriber4.context).f58887b;
                if (fVar == null) {
                    gfdiServiceSubscriber4.logger.error("No HostConfiguration has been set");
                    da2.h.c(str2, "No HostConfiguration has been set");
                    return Unit.INSTANCE;
                }
                try {
                    try {
                        rs2.e.f154382c.getClass();
                        eVar = rs2.e.f154383d;
                        kVar = gfdiServiceSubscriber4.gatt;
                        if (kVar instanceof eh2.a) {
                            try {
                                if (((eh2.a) kVar).d()) {
                                    eVar = rs2.e.f154384e;
                                }
                            } catch (GarminAuthNotAllowedException unused) {
                                gfdiServiceSubscriber2 = gfdiServiceSubscriber4;
                                obj = null;
                                gfdiServiceSubscriber2.logger.warn("Device started Garmin Auth while bonded. Attempting to reset connection");
                                c38992.L$0 = obj;
                                c38992.L$1 = obj;
                                c38992.L$2 = obj;
                                c38992.L$3 = obj;
                                c38992.label = 3;
                            }
                        }
                        rs2.e eVar3 = eVar;
                        OutputStream outputStream3 = outputStreamF;
                        i.a aVar4 = i.f154387h;
                        i.b bVar2 = gfdiServiceSubscriber4.guidMismatchCheck;
                        c38992.L$0 = gfdiServiceSubscriber4;
                        c38992.L$1 = str2;
                        c38992.L$2 = inputStream;
                        c38992.L$3 = null;
                        c38992.label = 2;
                        inputStream2 = inputStream;
                        obj = null;
                        try {
                            objB = aVar4.b(inputStream2, outputStream3, str2, fVar, bVar2, eVar3, c38992);
                            if (objB != aVar2) {
                                gfdiServiceSubscriber3 = gfdiServiceSubscriber4;
                                inputStream3 = inputStream2;
                                iVar = (i) objB;
                                if (inputStream3 instanceof qj2.a) {
                                    aVar = (qj2.a) inputStream3;
                                    aVar.f145051e = false;
                                    if (aVar.f145052f > 20) {
                                        j jVarConnectionManager3 = gfdiServiceSubscriber3.connectionManager();
                                        String macAddress3 = gfdiServiceSubscriber3.gatt.getMacAddress();
                                        macAddress3.getClass();
                                        ((la2.e) jVarConnectionManager3).j(macAddress3, z14);
                                    }
                                }
                                if (ENABLE_NO_RESPONSE_WATCHDOG) {
                                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(gfdiServiceSubscriber3);
                                    iVar.getClass();
                                    iVar.f154393f.f154448e = anonymousClass3;
                                }
                                deviceManager = gfdiServiceSubscriber3.deviceManager;
                                if (deviceManager != null) {
                                    deviceManager.setGfdiDevice(iVar);
                                    profile = deviceManager.getProfile();
                                    if (profile != null) {
                                        da2.h.b(profile);
                                    }
                                }
                            }
                        } catch (GarminAuthNotAllowedException unused2) {
                            gfdiServiceSubscriber2 = gfdiServiceSubscriber4;
                            gfdiServiceSubscriber2.logger.warn("Device started Garmin Auth while bonded. Attempting to reset connection");
                            c38992.L$0 = obj;
                            c38992.L$1 = obj;
                            c38992.L$2 = obj;
                            c38992.L$3 = obj;
                            c38992.label = 3;
                        }
                    } catch (GarminAuthNotAllowedException unused3) {
                        obj = null;
                    }
                    return aVar2;
                } catch (Throwable th5) {
                    th = th5;
                    gfdiServiceSubscriber2 = gfdiServiceSubscriber4;
                    str3 = str2;
                    gfdiServiceSubscriber2.logger.error("Failed to create GfdiDevice", th);
                    da2.h.c(str3, "Failed to create GfdiDevice");
                    return Unit.INSTANCE;
                }
            } catch (Throwable th6) {
                th = th6;
                str4 = str5;
                gfdiServiceSubscriber4 = gfdiServiceSubscriber5;
                if (th instanceof BleCommunicationException) {
                    bleCommunicationException = th;
                } else {
                    bleCommunicationException = null;
                }
                if (bleCommunicationException != null) {
                }
                gfdiServiceSubscriber4.logger.trace("Device disconnected before notifications were enabled.");
                return Unit.INSTANCE;
            }
        }
        if (i15 == 2) {
            inputStream3 = (InputStream) c38992.L$2;
            str3 = (String) c38992.L$1;
            gfdiServiceSubscriber2 = (GfdiServiceSubscriber) c38992.L$0;
            try {
                r.b(obj2);
                gfdiServiceSubscriber3 = gfdiServiceSubscriber2;
                objB = obj2;
                z14 = true;
                str2 = str3;
                obj = null;
                try {
                    iVar = (i) objB;
                    if (inputStream3 instanceof qj2.a) {
                        aVar = (qj2.a) inputStream3;
                        aVar.f145051e = false;
                        if (aVar.f145052f > 20) {
                            j jVarConnectionManager4 = gfdiServiceSubscriber3.connectionManager();
                            String macAddress4 = gfdiServiceSubscriber3.gatt.getMacAddress();
                            macAddress4.getClass();
                            ((la2.e) jVarConnectionManager4).j(macAddress4, z14);
                        }
                    }
                    if (ENABLE_NO_RESPONSE_WATCHDOG) {
                        AnonymousClass2 anonymousClass4 = new AnonymousClass2(gfdiServiceSubscriber3);
                        iVar.getClass();
                        iVar.f154393f.f154448e = anonymousClass4;
                    }
                    deviceManager = gfdiServiceSubscriber3.deviceManager;
                    if (deviceManager != null) {
                        deviceManager.setGfdiDevice(iVar);
                        profile = deviceManager.getProfile();
                        if (profile != null) {
                            da2.h.b(profile);
                        }
                    }
                } catch (GarminAuthNotAllowedException unused4) {
                    gfdiServiceSubscriber2 = gfdiServiceSubscriber3;
                    gfdiServiceSubscriber2.logger.warn("Device started Garmin Auth while bonded. Attempting to reset connection");
                    c38992.L$0 = obj;
                    c38992.L$1 = obj;
                    c38992.L$2 = obj;
                    c38992.L$3 = obj;
                    c38992.label = 3;
                } catch (Throwable th7) {
                    th = th7;
                    gfdiServiceSubscriber2 = gfdiServiceSubscriber3;
                    str3 = str2;
                    gfdiServiceSubscriber2.logger.error("Failed to create GfdiDevice", th);
                    da2.h.c(str3, "Failed to create GfdiDevice");
                }
            } catch (GarminAuthNotAllowedException unused5) {
                str2 = str3;
                obj = null;
                gfdiServiceSubscriber2.logger.warn("Device started Garmin Auth while bonded. Attempting to reset connection");
                c38992.L$0 = obj;
                c38992.L$1 = obj;
                c38992.L$2 = obj;
                c38992.L$3 = obj;
                c38992.label = 3;
            } catch (Throwable th8) {
                th = th8;
                gfdiServiceSubscriber2.logger.error("Failed to create GfdiDevice", th);
                da2.h.c(str3, "Failed to create GfdiDevice");
            }
        } else {
            if (i15 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj2);
        }
        return Unit.INSTANCE;
    }

    @Override // ma2.f
    public boolean delayStartUntilAfterHandshake() {
        return false;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DeviceManager getDeviceManager() {
        return this.deviceManager;
    }

    public final i.b getGuidMismatchCheck() {
        return this.guidMismatchCheck;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    @Override // ma2.f
    public boolean initialize(UUID service, UUID[] characteristics) {
        String macAddress = this.gatt.getMacAddress();
        macAddress.getClass();
        DeviceManager deviceManagerRegister = this.deviceManager;
        if (deviceManagerRegister == null) {
            deviceManagerRegister = DeviceManager.register(this.context, macAddress, 1);
        }
        deviceManagerRegister.setGenericCapability(k.class, this.gatt);
        this.deviceManager = deviceManagerRegister;
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass1(macAddress, null), 3);
        return true;
    }

    @Override // ma2.f
    public void onDeviceDisconnect() {
        c0.d(this.coroutineScope, "GfdiServiceSubscriber closed");
        DeviceManager deviceManager = this.deviceManager;
        this.deviceManager = null;
        if (deviceManager != null) {
            deviceManager.terminate();
            da2.b bVar = da2.d.c(this.context).f58886a.f111646e;
            bVar.getClass();
            bVar.h(this.gatt.getMacAddress());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restartConnection(String str, t13.d<? super Unit> dVar) {
        C38981 c38981;
        String str2;
        if (dVar instanceof C38981) {
            c38981 = (C38981) dVar;
            int i14 = c38981.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c38981.label = i14 - Integer.MIN_VALUE;
            } else {
                c38981 = new C38981(dVar);
            }
        } else {
            c38981 = new C38981(dVar);
        }
        Object obj = c38981.result;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = c38981.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                c38981.L$0 = str;
                c38981.label = 1;
                str2 = str;
                if (toggleNotifications(3, false, c38981) != obj2) {
                }
                return obj2;
            }
            if (i15 == 1) {
                String str3 = (String) c38981.L$0;
                r.b(obj);
                str2 = str3;
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            c38981.L$0 = null;
            c38981.label = 2;
            str = startCommunication(str2, c38981);
        } catch (Exception e4) {
            this.logger.error("Failed to disable notifications on retry", (Throwable) e4);
            da2.h.c(str, "Failed to disable notifications on retry");
            return Unit.INSTANCE;
        }
    }

    public final void setDeviceManager(DeviceManager deviceManager) {
        this.deviceManager = deviceManager;
    }

    public final void setGuidMismatchCheck(i.b bVar) {
        bVar.getClass();
        this.guidMismatchCheck = bVar;
    }

    public Object startCommunication(String str, t13.d<? super Unit> dVar) {
        return startCommunication$suspendImpl(this, str, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:28|47|29|(1:31)(1:32)) */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        r13 = r11;
        r11 = r13;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0053, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008c -> B:33:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a7 -> B:37:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toggleNotifications(int i14, boolean z14, t13.d<? super Unit> dVar) throws BleCommunicationException {
        C39001 c39001;
        String str;
        String str2;
        int i15;
        ListenableFuture<Void> listenableFutureS;
        if (dVar instanceof C39001) {
            c39001 = (C39001) dVar;
            int i16 = c39001.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c39001.label = i16 - Integer.MIN_VALUE;
            } else {
                c39001 = new C39001(dVar);
            }
        } else {
            c39001 = new C39001(dVar);
        }
        Object obj = c39001.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = c39001.label;
        if (i17 == 0) {
            r.b(obj);
            String str3 = z14 ? "enabled" : "disabled";
            str = z14 ? BooleanUtils.ON : BooleanUtils.OFF;
            str2 = str3;
            i15 = i14 - 1;
            if (i14 > 0) {
                return Unit.INSTANCE;
            }
            this.logger.trace("Turning " + str + " notifications. Remaining retries: " + i15);
            listenableFutureS = this.gatt.s(this.service, this.readChar, z14);
            listenableFutureS.getClass();
            c39001.L$0 = str2;
            c39001.L$1 = str;
            c39001.Z$0 = z14;
            c39001.I$0 = i15;
            c39001.label = 1;
            if (t53.c.b(listenableFutureS, c39001) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = c39001.I$0;
            z14 = c39001.Z$0;
            str = (String) c39001.L$1;
            str2 = (String) c39001.L$0;
            try {
                r.b(obj);
            } catch (BleCommunicationException e4) {
                BleCommunicationException e14 = e4;
                this.logger.trace("Caught exception turning " + str + " notifications", (Throwable) e14);
                if (i14 != 0 || e14.getGattStatus() == Integer.MIN_VALUE) {
                    throw e14;
                }
                i15 = i14 - 1;
                if (i14 > 0) {
                    return Unit.INSTANCE;
                }
                this.logger.trace("Turning " + str + " notifications. Remaining retries: " + i15);
                listenableFutureS = this.gatt.s(this.service, this.readChar, z14);
                listenableFutureS.getClass();
                c39001.L$0 = str2;
                c39001.L$1 = str;
                c39001.Z$0 = z14;
                c39001.I$0 = i15;
                c39001.label = 1;
                if (t53.c.b(listenableFutureS, c39001) == aVar) {
                    return aVar;
                }
            }
        }
        this.logger.debug("Notification successfully " + str2);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/gfdi/framework/GfdiServiceSubscriber$Companion;", "", "<init>", "()V", "ENABLE_NOTIFICATION_RETRIES", "", "ENABLE_NO_RESPONSE_WATCHDOG", "", "getENABLE_NO_RESPONSE_WATCHDOG", "()Z", "setENABLE_NO_RESPONSE_WATCHDOG", "(Z)V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final boolean getENABLE_NO_RESPONSE_WATCHDOG() {
            return GfdiServiceSubscriber.ENABLE_NO_RESPONSE_WATCHDOG;
        }

        public final void setENABLE_NO_RESPONSE_WATCHDOG(boolean z14) {
            GfdiServiceSubscriber.ENABLE_NO_RESPONSE_WATCHDOG = z14;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.GfdiServiceSubscriber$startCommunication$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends q implements e23.a<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, GfdiServiceSubscriber.class, "onResetNeeded", "onResetNeeded()V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((GfdiServiceSubscriber) this.receiver).onResetNeeded();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
