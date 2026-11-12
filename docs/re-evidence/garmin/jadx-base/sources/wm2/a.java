package wm2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.ExtensionRegistryLite;
import dt2.g;
import dt2.k;
import e23.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.l0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\n\b'\u0018\u0000 N2\u00020\u0001:\u0001OB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH%¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH%¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J7\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0005H&¢\u0006\u0004\b.\u0010/J%\u00100\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J'\u00100\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0005H\u0007¢\u0006\u0004\b0\u00103J)\u00106\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001a2\b\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001aH\u0007¢\u0006\u0004\b8\u00109J'\u00106\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u0010:J\u001d\u00108\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u001c¢\u0006\u0004\b8\u0010;J!\u0010<\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0017H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010?R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u001c\u0010\u0003\u001a\n B*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0016\u0010D\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00170\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lwm2/a;", "Ldt2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "", "validator", "<init>", "(Landroid/content/Context;Le23/p;)V", "proto", "capabilities", "isValidRequest", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ljava/util/Set;)Z", "Lrs2/c;", "deviceInfo", "smart", "Ldt2/k;", "responder", "onProtobufRequest", "(Lrs2/c;Lcom/garmin/proto/generated/GDISmartProto$Smart;Ldt2/k;)Z", "", "generateNextRequestId", "()I", "", "unitId", "", "getMacAddressPreferBLE", "(J)Ljava/lang/String;", "getMacAddressPreferBTC", "connectionId", "", "close", "(Ljava/lang/String;)V", "Ldt2/g;", "messenger", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", TtmlNode.START, "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "deviceId", "macAddress", "requestId", "message", "handleRequestMessage", "(Landroid/content/Context;JLjava/lang/String;ILcom/garmin/proto/generated/GDISmartProto$Smart;)Z", "respondToRequest", "(ILjava/lang/String;Lcom/garmin/proto/generated/GDISmartProto$Smart;)V", "remoteDeviceUnitID", "(IJLcom/garmin/proto/generated/GDISmartProto$Smart;)V", "Lwm2/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initiateRequest", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;JLwm2/b;)V", "initiateNotification", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;J)V", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ljava/lang/String;Lwm2/b;)V", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ljava/lang/String;)V", "handleResponseMessage", "(ILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "handleResponseError", "(I)V", "handleCancelRequestMessage", "Le23/p;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "nextRequestId", "I", "", "responders", "Ljava/util/Map;", "devices", "Ljava/util/Set;", "getConfiguration", "()Ljava/util/Set;", "configuration", "Companion", "a", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class a implements dt2.a {
    private final Set<SupportedCapability> capabilities;
    private final Context context;
    private final Map<String, g> devices;
    private int nextRequestId;
    private final Map<Integer, k> responders;
    private final p<GDISmartProto.Smart, Set<? extends SupportedCapability>, Boolean> validator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ProtobufRequestManager";
    private static final Logger LOGGER = gt2.b.f79005a.i("ProtobufRequestManager");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$initiateNotification$2", f = "AbstractProtobufRequestManager.kt", l = {224}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f186068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f186069c;

        /* JADX INFO: renamed from: wm2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
        @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$initiateNotification$2$1", f = "AbstractProtobufRequestManager.kt", l = {226}, m = "invokeSuspend")
        public static final class C3460a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f186071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f186072c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3460a(g gVar, GDISmartProto.Smart smart, t13.d<? super C3460a> dVar) {
                super(2, dVar);
                this.f186071b = gVar;
                this.f186072c = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3460a(this.f186071b, this.f186072c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3460a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186070a;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        g gVar = this.f186071b;
                        GDISmartProto.Smart smart = this.f186072c;
                        this.f186070a = 1;
                        if (gVar.c(smart, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                } catch (ProtobufException e4) {
                    a.getLOGGER().error("failed to send protobuf notification: " + e4.getMessage());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, GDISmartProto.Smart smart, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f186068b = gVar;
            this.f186069c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f186068b, this.f186069c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186067a;
            if (i14 == 0) {
                r.b(obj);
                C3460a c3460a = new C3460a(this.f186068b, this.f186069c, null);
                this.f186067a = 1;
                if (ge1.b.Y(c3460a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$initiateRequest$2", f = "AbstractProtobufRequestManager.kt", l = {191}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f186075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f186076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ wm2.b f186077e;

        /* JADX INFO: renamed from: wm2.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
        @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$initiateRequest$2$1", f = "AbstractProtobufRequestManager.kt", l = {194}, m = "invokeSuspend")
        public static final class C3461a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f186079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f186080c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f186081d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f186082e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ wm2.b f186083f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3461a(a aVar, g gVar, GDISmartProto.Smart smart, wm2.b bVar, t13.d<? super C3461a> dVar) {
                super(2, dVar);
                this.f186080c = aVar;
                this.f186081d = gVar;
                this.f186082e = smart;
                this.f186083f = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3461a(this.f186080c, this.f186081d, this.f186082e, this.f186083f, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3461a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x005b  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                int i14;
                ProtobufException e4;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f186079b;
                wm2.b bVar = this.f186083f;
                if (i15 == 0) {
                    r.b(obj);
                    int iGenerateNextRequestId = this.f186080c.generateNextRequestId();
                    try {
                        g gVar = this.f186081d;
                        GDISmartProto.Smart smart = this.f186082e;
                        this.f186078a = iGenerateNextRequestId;
                        this.f186079b = 1;
                        Object objB = gVar.b(smart, this);
                        if (objB == aVar) {
                            return aVar;
                        }
                        i14 = iGenerateNextRequestId;
                        obj = objB;
                    } catch (ProtobufException e14) {
                        i14 = iGenerateNextRequestId;
                        e4 = e14;
                        a.getLOGGER().error("failed to send protobuf request: " + e4.getMessage());
                        if (bVar != null) {
                            bVar.onResponseFailed(i14);
                        }
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = this.f186078a;
                    try {
                        r.b(obj);
                    } catch (ProtobufException e15) {
                        e4 = e15;
                        a.getLOGGER().error("failed to send protobuf request: " + e4.getMessage());
                        if (bVar != null) {
                            bVar.onResponseFailed(i14);
                        }
                    }
                }
                GDISmartProto.Smart smart2 = (GDISmartProto.Smart) obj;
                if (bVar != null) {
                    bVar.onResponseReceived(i14, smart2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, GDISmartProto.Smart smart, wm2.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f186075c = gVar;
            this.f186076d = smart;
            this.f186077e = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f186075c, this.f186076d, this.f186077e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186073a;
            if (i14 == 0) {
                r.b(obj);
                C3461a c3461a = new C3461a(a.this, this.f186075c, this.f186076d, this.f186077e, null);
                this.f186073a = 1;
                if (ge1.b.Y(c3461a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$respondToRequest$1", f = "AbstractProtobufRequestManager.kt", l = {119}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f186085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f186086c;

        /* JADX INFO: renamed from: wm2.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
        @v13.e(c = "com.garmin.device.protobuf.handler.AbstractProtobufRequestManager$respondToRequest$1$1", f = "AbstractProtobufRequestManager.kt", l = {121}, m = "invokeSuspend")
        public static final class C3462a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f186088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f186089c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3462a(k kVar, GDISmartProto.Smart smart, t13.d<? super C3462a> dVar) {
                super(2, dVar);
                this.f186088b = kVar;
                this.f186089c = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3462a(this.f186088b, this.f186089c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3462a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186087a;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        k kVar = this.f186088b;
                        GDISmartProto.Smart smart = this.f186089c;
                        this.f186087a = 1;
                        if (kVar.a(smart, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                } catch (ProtobufException e4) {
                    a.getLOGGER().error("failed to send protobuf response: " + e4.getMessage());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar, GDISmartProto.Smart smart, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f186085b = kVar;
            this.f186086c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f186085b, this.f186086c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186084a;
            if (i14 == 0) {
                r.b(obj);
                C3462a c3462a = new C3462a(this.f186085b, this.f186086c, null);
                this.f186084a = 1;
                if (ge1.b.Y(c3462a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wm2/a$e", "Ldt2/h;", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class e implements dt2.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f186091c;

        public e(rs2.c cVar) {
            this.f186091c = cVar;
        }

        @Override // dt2.h
        public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
            smart.getClass();
            return a.this.onProtobufRequest(this.f186091c, smart, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, p<? super GDISmartProto.Smart, ? super Set<? extends SupportedCapability>, Boolean> pVar) throws Throwable {
        context.getClass();
        pVar.getClass();
        this.validator = pVar;
        this.context = context.getApplicationContext();
        this.responders = new LinkedHashMap();
        this.devices = new LinkedHashMap();
        Set<SupportedCapability> setLoadAppCapabilities = SupportedCapability.loadAppCapabilities(context);
        setLoadAppCapabilities.getClass();
        this.capabilities = setLoadAppCapabilities;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized int generateNextRequestId() {
        try {
            int i14 = this.nextRequestId + 1;
            this.nextRequestId = i14;
            if (i14 > 65535) {
                this.nextRequestId = 1;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.nextRequestId;
    }

    public static final Logger getLOGGER() {
        INSTANCE.getClass();
        return LOGGER;
    }

    public static final String getTAG() {
        INSTANCE.getClass();
        return TAG;
    }

    private final boolean isValidRequest(GDISmartProto.Smart proto, Set<? extends SupportedCapability> capabilities) {
        return this.validator.invoke(proto, capabilities).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onProtobufRequest(rs2.c deviceInfo, GDISmartProto.Smart smart, k responder) {
        if (!isValidRequest(smart, this.capabilities)) {
            return false;
        }
        int iGenerateNextRequestId = generateNextRequestId();
        synchronized (this.responders) {
            this.responders.put(Integer.valueOf(iGenerateNextRequestId), responder);
            Unit unit = Unit.INSTANCE;
        }
        Context context = this.context;
        context.getClass();
        boolean zHandleRequestMessage = handleRequestMessage(context, deviceInfo.getF92746j(), deviceInfo.getF92741e(), iGenerateNextRequestId, smart);
        if (zHandleRequestMessage) {
            return zHandleRequestMessage;
        }
        synchronized (this.responders) {
            this.responders.remove(Integer.valueOf(iGenerateNextRequestId));
        }
        return zHandleRequestMessage;
    }

    @Override // dt2.a
    public void close(String connectionId) {
        connectionId.getClass();
        synchronized (this.devices) {
            this.devices.remove(connectionId);
        }
    }

    @Override // dt2.a
    public Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @o13.e
    public abstract String getMacAddressPreferBLE(long unitId);

    @o13.e
    public abstract String getMacAddressPreferBTC(long unitId);

    @o13.e
    public final void handleCancelRequestMessage(int requestId) {
        LOGGER.warn("app does not need to call 'handleCancelRequestMessage'");
    }

    public abstract boolean handleRequestMessage(Context context, long deviceId, String macAddress, int requestId, GDISmartProto.Smart message);

    @o13.e
    public final void handleResponseError(int requestId) {
        LOGGER.warn("app does not need to call 'handleResponseError'");
    }

    @o13.e
    public final void handleResponseMessage(int requestId, GDISmartProto.Smart message) {
        LOGGER.warn("app does not need to call 'handleResponseMessage'");
    }

    @o13.e
    public final void initiateNotification(GDISmartProto.Smart message, long remoteDeviceUnitID) {
        Unit unit;
        message.getClass();
        String macAddressPreferBLE = getMacAddressPreferBLE(remoteDeviceUnitID);
        if (macAddressPreferBLE != null) {
            initiateNotification(message, macAddressPreferBLE);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LOGGER.warn("no mac address for " + remoteDeviceUnitID);
        }
    }

    public final void initiateRequest(GDISmartProto.Smart message, String macAddress, wm2.b listener) {
        g gVar;
        message.getClass();
        macAddress.getClass();
        synchronized (this.devices) {
            gVar = this.devices.get(macAddress);
        }
        if (gVar != null) {
            ge1.b.T(e1.f129333a, null, null, new c(gVar, message, listener, null), 3);
        }
    }

    public final void respondToRequest(int requestId, String macAddress, GDISmartProto.Smart message) {
        k kVarRemove;
        macAddress.getClass();
        message.getClass();
        synchronized (this.responders) {
            kVarRemove = this.responders.remove(Integer.valueOf(requestId));
        }
        if (kVarRemove != null) {
            ge1.b.T(e1.f129333a, null, null, new d(kVarRemove, message, null), 3);
        }
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        synchronized (this.devices) {
            this.devices.put(deviceInfo.getF92741e(), messenger);
            Unit unit = Unit.INSTANCE;
        }
        messenger.a(new e(deviceInfo));
    }

    /* JADX INFO: renamed from: wm2.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwm2/a$a;", "", "<init>", "()V", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void initiateNotification(GDISmartProto.Smart message, String macAddress) {
        g gVar;
        message.getClass();
        macAddress.getClass();
        synchronized (this.devices) {
            gVar = this.devices.get(macAddress);
        }
        if (gVar != null) {
            ge1.b.T(e1.f129333a, null, null, new b(gVar, message, null), 3);
        }
    }

    @o13.e
    public final void respondToRequest(int requestId, long remoteDeviceUnitID, GDISmartProto.Smart message) {
        Unit unit;
        message.getClass();
        String macAddressPreferBTC = getMacAddressPreferBTC(remoteDeviceUnitID);
        if (macAddressPreferBTC != null) {
            respondToRequest(requestId, macAddressPreferBTC, message);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LOGGER.warn("no mac address for " + remoteDeviceUnitID);
        }
    }

    @o13.e
    public final void initiateRequest(GDISmartProto.Smart message, long remoteDeviceUnitID, wm2.b listener) {
        Unit unit;
        message.getClass();
        String macAddressPreferBLE = getMacAddressPreferBLE(remoteDeviceUnitID);
        if (macAddressPreferBLE != null) {
            initiateRequest(message, macAddressPreferBLE, listener);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LOGGER.warn("no mac address for " + remoteDeviceUnitID);
        }
    }
}
