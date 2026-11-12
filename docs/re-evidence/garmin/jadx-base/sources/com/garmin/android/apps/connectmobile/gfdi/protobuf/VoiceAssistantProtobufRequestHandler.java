package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIBluetoothClassic;
import com.garmin.proto.generated.GDIEventSharingProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import f12.y;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.l0;
import p13.w;
import v13.i;
import vb.h;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/VoiceAssistantProtobufRequestHandler;", "Lkk2/a$b;", "Ldt2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkk2/a;", "eventSharingDataHandler", "<init>", "(Landroid/content/Context;Lkk2/a;)V", "", "handleVoiceAssistantFailedToStart", "()V", "bluetoothClassicStateChangeUnSubscribe", "(Lt13/d;)Ljava/lang/Object;", "bluetoothClassicStateChangeSubscription", "Lrs2/c;", "deviceInfo", "Ldt2/g;", "messenger", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", TtmlNode.START, "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "", "connectionId", "close", "(Ljava/lang/String;)V", "Lcom/garmin/proto/generated/GDIEventSharingProto$AlertNotification;", "alert", "onAlertReceived", "(Lcom/garmin/proto/generated/GDIEventSharingProto$AlertNotification;)V", "Landroid/content/Context;", "Lkk2/a;", "", "", "configuration", "Ljava/util/Set;", "getConfiguration", "()Ljava/util/Set;", "", "deviceId", "J", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoiceAssistantProtobufRequestHandler implements kk2.a.b, dt2.a {
    public static final String TAG = "VoiceAssistantProtobufRequestHandler";
    private final Set<Integer> configuration;
    private final Context context;
    private long deviceId;
    private final kk2.a eventSharingDataHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GDIBluetoothClassic.ProfileConnection.State.values().length];
            try {
                iArr[GDIBluetoothClassic.ProfileConnection.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIBluetoothClassic.ProfileConnection.State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GDIBluetoothClassic.ProfileConnection.Profile.values().length];
            try {
                iArr2[GDIBluetoothClassic.ProfileConnection.Profile.HFP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GDIBluetoothClassic.ProfileConnection.Profile.SPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GDIBluetoothClassic.ProfileConnection.Profile.A2DP_SINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$bluetoothClassicStateChangeSubscription$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler", f = "VoiceAssistantProtobufRequestHandler.kt", l = {129}, m = "bluetoothClassicStateChangeSubscription", v = 2)
    public static final class AnonymousClass1 extends v13.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceAssistantProtobufRequestHandler.this.bluetoothClassicStateChangeSubscription(this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$bluetoothClassicStateChangeUnSubscribe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler", f = "VoiceAssistantProtobufRequestHandler.kt", l = {121}, m = "bluetoothClassicStateChangeUnSubscribe", v = 2)
    public static final class C38851 extends v13.c {
        int label;
        /* synthetic */ Object result;

        public C38851(t13.d<? super C38851> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceAssistantProtobufRequestHandler.this.bluetoothClassicStateChangeUnSubscribe(this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$onAlertReceived$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$onAlertReceived$1", f = "VoiceAssistantProtobufRequestHandler.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class C38861 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        public C38861(t13.d<? super C38861> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return VoiceAssistantProtobufRequestHandler.this.new C38861(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38861) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                VoiceAssistantProtobufRequestHandler voiceAssistantProtobufRequestHandler = VoiceAssistantProtobufRequestHandler.this;
                this.label = 1;
                if (voiceAssistantProtobufRequestHandler.bluetoothClassicStateChangeUnSubscribe(this) == aVar) {
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

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler$start$1", f = "VoiceAssistantProtobufRequestHandler.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class C38871 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        public C38871(t13.d<? super C38871> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return VoiceAssistantProtobufRequestHandler.this.new C38871(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38871) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                VoiceAssistantProtobufRequestHandler voiceAssistantProtobufRequestHandler = VoiceAssistantProtobufRequestHandler.this;
                this.label = 1;
                if (voiceAssistantProtobufRequestHandler.bluetoothClassicStateChangeSubscription(this) == aVar) {
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

    public VoiceAssistantProtobufRequestHandler(Context context, kk2.a aVar) {
        context.getClass();
        aVar.getClass();
        this.context = context;
        this.eventSharingDataHandler = aVar;
        this.configuration = l0.f134950a;
        this.deviceId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object bluetoothClassicStateChangeSubscription(t13.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                kk2.a aVar2 = this.eventSharingDataHandler;
                GDIEventSharingProto.AlertType alertType = GDIEventSharingProto.AlertType.BLUETOOTH_CLASSIC_STATE_CHANGE;
                anonymousClass1.label = 1;
                if (aVar2.c(alertType, this, anonymousClass1) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to subscribe to event sharing protobuf - BLUETOOTH_CLASSIC_STATE_CHANGE, ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, TAG, strD);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object bluetoothClassicStateChangeUnSubscribe(t13.d<? super Unit> dVar) {
        C38851 c38851;
        if (dVar instanceof C38851) {
            c38851 = (C38851) dVar;
            int i14 = c38851.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c38851.label = i14 - Integer.MIN_VALUE;
            } else {
                c38851 = new C38851(dVar);
            }
        } else {
            c38851 = new C38851(dVar);
        }
        Object obj = c38851.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c38851.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                kk2.a aVar2 = this.eventSharingDataHandler;
                GDIEventSharingProto.AlertType alertType = GDIEventSharingProto.AlertType.BLUETOOTH_CLASSIC_STATE_CHANGE;
                c38851.label = 1;
                aVar2.getClass();
                Object objL = aVar2.l(w.c(alertType), this, c38851);
                if (objL != aVar) {
                    objL = Unit.INSTANCE;
                }
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to un-subscribe to event sharing protobuf, ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, TAG, strD);
        }
        return Unit.INSTANCE;
    }

    public static final void dismissVoiceAssistantNotification(Context context) {
        INSTANCE.dismissVoiceAssistantNotification(context);
    }

    public static final void displayVoiceAssistantNotification(Context context) {
        INSTANCE.displayVoiceAssistantNotification(context);
    }

    private final void handleVoiceAssistantFailedToStart() {
        y yVar = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);
        if (!yVar.d()) {
            yVar.j(-1L);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, TAG, "handleVoiceAssistantFailedToStart - tip messaging dismissed by user, no my day prompt");
            return;
        }
        yVar.j(this.deviceId);
        INSTANCE.displayVoiceAssistantNotification(this.context);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, TAG, "handleVoiceAssistantFailedToStart");
    }

    public static final boolean isVoiceAssistantSupported(String str, Integer num) {
        return INSTANCE.isVoiceAssistantSupported(str, num);
    }

    @Override // dt2.a
    public void close(String connectionId) {
        connectionId.getClass();
    }

    @Override // dt2.a
    public Set<Integer> getConfiguration() {
        return this.configuration;
    }

    @Override // kk2.a.b
    public void onAlertReceived(GDIEventSharingProto.AlertNotification alert) {
        alert.getClass();
        GDIBluetoothClassic.StateChange bluetoothClassicStateChange = INSTANCE.getBluetoothClassicStateChange(alert);
        if (bluetoothClassicStateChange != null) {
            GDIBluetoothClassic.Handsfree handsfree = bluetoothClassicStateChange.getHandsfree();
            if ((handsfree != null ? handsfree.getState() : null) == GDIBluetoothClassic.Handsfree.State.HFP_VOICE_RECOGNITION_FAILED_TO_START) {
                handleVoiceAssistantFailedToStart();
                String strValueOf = String.valueOf(bluetoothClassicStateChange);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, TAG, strValueOf);
            }
            GDIBluetoothClassic.ProfileConnection connection = bluetoothClassicStateChange.getConnection();
            GDIBluetoothClassic.ProfileConnection.Profile profile = connection != null ? connection.getProfile() : null;
            GDIBluetoothClassic.ProfileConnection connection2 = bluetoothClassicStateChange.getConnection();
            GDIBluetoothClassic.ProfileConnection.State state = connection2 != null ? connection2.getState() : null;
            if (profile != null) {
                y yVar = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);
                int i14 = WhenMappings.$EnumSwitchMapping$1[profile.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2 && i14 != 3) {
                        u0.r();
                        return;
                    }
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new C38861(null), 3);
                    String str = "Device profile " + profile + " incompatible with CTKD";
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, TAG, str);
                    return;
                }
                int i15 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i15 == -1) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var3, TAG, "Connection state is null");
                } else if (i15 == 1) {
                    yVar.i(true);
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return;
                    }
                    yVar.c(true);
                }
                String str2 = "Device supports " + profile + " - " + state;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var4, TAG, str2);
            }
        }
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, dt2.g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        this.deviceId = deviceInfo.getF92746j();
        GDIBluetoothClassic.registerAllExtensions(extensionRegistry);
        if (!INSTANCE.isVoiceAssistantSupported(String.valueOf(deviceInfo.getF92744h()), Integer.valueOf(deviceInfo.getF92745i())) || ((y) KoinJavaComponent.get$default(y.class, null, null, 6, null)).e()) {
            return;
        }
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new C38871(null), 3);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0013H\u0002R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/VoiceAssistantProtobufRequestHandler$Companion;", "", "<init>", "()V", "isVoiceAssistantSupported", "", "productNumber", "", "softwareVersion", "", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "displayVoiceAssistantNotification", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "dismissVoiceAssistantNotification", "TAG", "getBluetoothClassicStateChange", "Lcom/garmin/proto/generated/GDIBluetoothClassic$StateChange;", "Lcom/garmin/proto/generated/GDIEventSharingProto$AlertNotification;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GDIBluetoothClassic.StateChange getBluetoothClassicStateChange(GDIEventSharingProto.AlertNotification alertNotification) {
            if (!alertNotification.getAlertTypeList().contains(GDIEventSharingProto.AlertType.BLUETOOTH_CLASSIC_STATE_CHANGE)) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, GDIBluetoothClassic.StateChange> generatedExtension = GDIBluetoothClassic.StateChange.stateChange;
            if (alertNotification.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDIBluetoothClassic.StateChange) alertNotification.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public static /* synthetic */ boolean isVoiceAssistantSupported$default(Companion companion, String str, Integer num, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                num = null;
            }
            return companion.isVoiceAssistantSupported(str, num);
        }

        public final void dismissVoiceAssistantNotification(Context context) {
            context.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.a(33, context);
        }

        public final void displayVoiceAssistantNotification(Context context) {
            context.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
            intent.setFlags(268468224);
            String string = context.getString(R.string.lbl_set_up_voice_assistant);
            string.getClass();
            String string2 = context.getString(R.string.msg_voice_assistant_learn_more);
            string2.getClass();
            sz0.e eVar = sz0.e.f161383x;
            q qVar = new q(context, eVar.f161386a);
            qVar.N.icon = 2131232010;
            qVar.f202683e = q.e(context.getString(R.string.app_name_garmin_connect));
            o oVar = new o();
            oVar.f202742b = q.e(string);
            oVar.f202664e = q.e(string2);
            qVar.l(oVar);
            qVar.i(16, true);
            qVar.f202686h = PendingIntent.getActivity(context, 0, intent, 201326592);
            sz0.f.a aVar = sz0.f.f161394a;
            Notification notificationC = qVar.c();
            notificationC.getClass();
            aVar.getClass();
            sz0.f.a.f(context, notificationC, 33, eVar);
        }

        public final boolean isVoiceAssistantSupported(String productNumber, Integer softwareVersion) {
            productNumber.getClass();
            if (!zb0.u0.n(productNumber, zb0.u0.f203850z2, zb0.u0.f203844y2) || softwareVersion == null) {
                return zb0.u0.n(productNumber, zb0.u0.f203826v2, zb0.u0.f203832w2, zb0.u0.f203838x2);
            }
            return softwareVersion.intValue() < 1304;
        }

        private Companion() {
        }
    }
}
