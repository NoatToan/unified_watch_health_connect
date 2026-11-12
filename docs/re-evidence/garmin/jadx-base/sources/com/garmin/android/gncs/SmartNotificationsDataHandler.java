package com.garmin.android.gncs;

import am.j;
import android.content.Context;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.ancs.ANCSMessageValidator;
import com.garmin.android.ancs.DeviceCapability;
import com.garmin.android.gncs.datasource.GncsDataSourceSender;
import com.garmin.android.gncs.messages.NotificationServiceSubscriptionMessage;
import com.garmin.android.gncs.mms.GNCSMediaRequest;
import com.garmin.android.gncs.mms.GNCSMediaResponse;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsChangedListener;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIGNCS;
import com.garmin.proto.generated.GDIGNCSExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import cz2.p;
import dt2.h;
import dt2.k;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import o13.r;
import o53.b0;
import o53.c0;
import o53.l1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import rs2.v;
import rs2.w;
import rs2.x;
import ss2.n;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b*\u0001n\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0084\u0001\u0083\u0001\u0085\u0001\u0086\u0001B-\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0018\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J'\u00103\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u0002052\u0006\u00100\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b9\u00107J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u0014J\u0017\u0010=\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b=\u0010\u0014J\u001f\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u00102\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u00122\u0006\u0010E\u001a\u00020D2\u0006\u00102\u001a\u00020@H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0012H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bJ\u0010IJ\u001d\u0010O\u001a\u00020N2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0012H\u0002¢\u0006\u0004\bQ\u0010IJ\u000f\u0010R\u001a\u00020\u0012H\u0002¢\u0006\u0004\bR\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010TR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010VR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0016\u0010X\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010d\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0014R\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/garmin/android/gncs/SmartNotificationsDataHandler;", "Lbt2/a;", "Lrs2/w;", "Ldt2/c;", "Ldt2/h;", "Lrs2/c;", Scopes.PROFILE, "Landroid/content/Context;", "appContext", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Callback;", "callback", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Validator;", "validator", "<init>", "(Lrs2/c;Landroid/content/Context;Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Callback;Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Validator;)V", "(Lrs2/c;Landroid/content/Context;)V", "", "sessionKey", "", "setSessionKey", "([B)V", "deviceInfo", "Lrs2/v;", "messenger", TtmlNode.START, "(Lrs2/c;Lrs2/v;)V", "", "connectionId", "close", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", "Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesRequest$Builder;", "capabilitiesRequestBuilder", "configure", "(Lrs2/c;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesRequest$Builder;)V", "Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;", "featureCapabilities", "receiveCapabilities", "(Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;)V", "Ldt2/g;", "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "Lcom/garmin/proto/generated/GDICore$ConnectionReadyNotification;", "notification", "connectionReady", "(Lcom/garmin/proto/generated/GDICore$ConnectionReadyNotification;)V", "", "messageType", "payload", "Lrs2/x;", "responder", "onMessageReceived", "(I[BLrs2/x;)V", "Lo53/l1;", "processSubscriptionMessage$gncs_gdi_release", "([BLrs2/x;)Lo53/l1;", "processSubscriptionMessage", "processControlPointMessage$gncs_gdi_release", "processControlPointMessage", "ancsPayload", "sendGncsNotificationSource", "sendGncsDataSource", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "smart", "Ldt2/k;", "", "onProtobufRequest", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ldt2/k;)Z", "Lcom/garmin/android/gncs/mms/GNCSMediaResponse;", "mediaResponse", "sendImage", "(Lcom/garmin/android/gncs/mms/GNCSMediaResponse;Ldt2/k;)V", "sendDisabledAppsHash", "()V", "sendGarminDeviceUpdatedCapabilities", "", "Lcom/garmin/proto/generated/GDIGNCS$MediaType;", "types", "Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "getMediaType", "(Ljava/util/List;)Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "startListeningForDefaultAppChanges", "stopListeningForDefaultAppChanges", "Lrs2/c;", "Landroid/content/Context;", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Callback;", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Validator;", "Lrs2/v;", "protobufMessenger", "Ldt2/g;", "Lcom/garmin/android/gncs/datasource/GncsDataSourceSender;", "dataSourceSender", "Lcom/garmin/android/gncs/datasource/GncsDataSourceSender;", "getDataSourceSender$gncs_gdi_release", "()Lcom/garmin/android/gncs/datasource/GncsDataSourceSender;", "setDataSourceSender$gncs_gdi_release", "(Lcom/garmin/android/gncs/datasource/GncsDataSourceSender;)V", "logTag", "Ljava/lang/String;", "mmsLogTag", "deviceSupportsBlockedApps", "Z", "encryptionKey", "[B", "getEncryptionKey$gncs_gdi_release", "()[B", "setEncryptionKey$gncs_gdi_release", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "com/garmin/android/gncs/SmartNotificationsDataHandler$smartNotifOSServiceLifecycleCallback$1", "smartNotifOSServiceLifecycleCallback", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$smartNotifOSServiceLifecycleCallback$1;", "Lcom/garmin/android/gncs/settings/GNCSOptOutSettingsChangedListener;", "optOutSettingsChangedListener", "Lcom/garmin/android/gncs/settings/GNCSOptOutSettingsChangedListener;", "getOptOutSettingsChangedListener$gncs_gdi_release", "()Lcom/garmin/android/gncs/settings/GNCSOptOutSettingsChangedListener;", "Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "defaultAppsChangeListener", "Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "getDefaultAppsChangeListener$gncs_gdi_release", "()Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "Lcz2/p;", "runner", "Lcz2/p;", "protobufResponseRunner", "", "getConfiguration", "()Ljava/util/Set;", "configuration", "Companion", "Callback", "GncsDataSourceDelegate", "Validator", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmartNotificationsDataHandler implements bt2.a, w, dt2.c, h {
    private static final int CONTROL_POINT_MESSAGE_ID = 5034;
    private static final int NOTIFICATION_SOURCE_MESSAGE_ID = 5033;
    private final Context appContext;
    private final Callback callback;
    private final b0 coroutineScope;
    public GncsDataSourceSender dataSourceSender;
    private final DefaultAppsObserver.DefaultAppsChangeListener defaultAppsChangeListener;
    private boolean deviceSupportsBlockedApps;
    private byte[] encryptionKey;
    private final String logTag;
    private v messenger;
    private final String mmsLogTag;
    private final GNCSOptOutSettingsChangedListener optOutSettingsChangedListener;
    private final rs2.c profile;
    private dt2.g protobufMessenger;
    private final p protobufResponseRunner;
    private final p runner;
    private final SmartNotificationsDataHandler$smartNotifOSServiceLifecycleCallback$1 smartNotifOSServiceLifecycleCallback;
    private final Validator validator;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Callback;", "", "", "Lcom/garmin/android/ancs/DeviceCapability;", "deviceCapabilities", "", "onCapabilitiesReceived", "(Ljava/util/List;)V", "Lcom/garmin/android/gncs/messages/NotificationServiceSubscriptionMessage;", "request", "onNotificationServiceSubscribe", "(Lcom/garmin/android/gncs/messages/NotificationServiceSubscriptionMessage;)V", "onNotificationServiceUnsubscribe", "", "payload", "onGncsMessageReceived", "([B)V", "Lcom/garmin/android/gncs/mms/GNCSMediaRequest;", "Lcom/garmin/android/gncs/mms/GNCSMediaResponse;", "processMediaRequest", "(Lcom/garmin/android/gncs/mms/GNCSMediaRequest;Lt13/d;)Ljava/lang/Object;", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callback {
        void onCapabilitiesReceived(List<? extends DeviceCapability> deviceCapabilities);

        void onGncsMessageReceived(byte[] payload);

        void onNotificationServiceSubscribe(NotificationServiceSubscriptionMessage request);

        void onNotificationServiceUnsubscribe(NotificationServiceSubscriptionMessage request);

        Object processMediaRequest(GNCSMediaRequest gNCSMediaRequest, t13.d<? super GNCSMediaResponse> dVar);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/garmin/android/gncs/SmartNotificationsDataHandler$GncsDataSourceDelegate;", "Lcom/garmin/android/gncs/datasource/GncsDataSourceSender$Delegate;", "(Lcom/garmin/android/gncs/SmartNotificationsDataHandler;)V", "getSessionKey", "", "send", "", "messageType", "", "payload", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/function/Consumer;", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GncsDataSourceDelegate implements GncsDataSourceSender.Delegate {
        public GncsDataSourceDelegate() {
        }

        @Override // com.garmin.android.gncs.datasource.GncsDataSourceSender.Delegate
        public byte[] getSessionKey() {
            return SmartNotificationsDataHandler.this.getEncryptionKey();
        }

        @Override // com.garmin.android.gncs.datasource.GncsDataSourceSender.Delegate
        public void send(int messageType, byte[] payload, Consumer<byte[]> listener) {
            payload.getClass();
            listener.getClass();
            ge1.b.T(SmartNotificationsDataHandler.this.coroutineScope, null, null, new SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1(SmartNotificationsDataHandler.this, messageType, payload, listener, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Validator;", "", "validateControlPointMessage", "Lcom/garmin/android/ancs/ANCSMessageBase$AncsError;", "ancsMessage", "", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Validator {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static ANCSMessageBase.AncsError validateControlPointMessage(Validator validator, byte[] bArr) {
                bArr.getClass();
                ANCSMessageBase.AncsError ancsErrorValidateControlPointMessage = ANCSMessageValidator.validateControlPointMessage(bArr);
                ancsErrorValidateControlPointMessage.getClass();
                return ancsErrorValidateControlPointMessage;
            }
        }

        ANCSMessageBase.AncsError validateControlPointMessage(byte[] ancsMessage);
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$1", f = "SmartNotificationsDataHandler.kt", l = {584}, m = "invokeSuspend")
    public static final class C39041 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GNCSMediaRequest $mediaRequest;
        final /* synthetic */ k $responder;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$1$1", f = "SmartNotificationsDataHandler.kt", l = {585}, m = "invokeSuspend")
        public static final class C09861 extends i implements l<t13.d<? super Unit>, Object> {
            final /* synthetic */ GNCSMediaRequest $mediaRequest;
            final /* synthetic */ k $responder;
            int label;
            final /* synthetic */ SmartNotificationsDataHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09861(SmartNotificationsDataHandler smartNotificationsDataHandler, GNCSMediaRequest gNCSMediaRequest, k kVar, t13.d<? super C09861> dVar) {
                super(1, dVar);
                this.this$0 = smartNotificationsDataHandler;
                this.$mediaRequest = gNCSMediaRequest;
                this.$responder = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C09861(this.this$0, this.$mediaRequest, this.$responder, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((C09861) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    Callback callback = this.this$0.callback;
                    GNCSMediaRequest gNCSMediaRequest = this.$mediaRequest;
                    this.label = 1;
                    obj = callback.processMediaRequest(gNCSMediaRequest, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                GNCSMediaResponse gNCSMediaResponse = (GNCSMediaResponse) obj;
                if (gNCSMediaResponse == null) {
                    gNCSMediaResponse = new GNCSMediaResponse(this.$mediaRequest.getNotificationId(), this.$mediaRequest.getIndex());
                    gNCSMediaResponse.setStatus(GNCSMediaResponse.Status.UNKNOWN);
                }
                this.this$0.sendImage(gNCSMediaResponse, this.$responder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39041(GNCSMediaRequest gNCSMediaRequest, k kVar, t13.d<? super C39041> dVar) {
            super(2, dVar);
            this.$mediaRequest = gNCSMediaRequest;
            this.$responder = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39041(this.$mediaRequest, this.$responder, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39041) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                p pVar = SmartNotificationsDataHandler.this.protobufResponseRunner;
                C09861 c09861 = new C09861(SmartNotificationsDataHandler.this, this.$mediaRequest, this.$responder, null);
                this.label = 1;
                if (pVar.a(c09861, this) == aVar) {
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

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$onProtobufRequest$3", f = "SmartNotificationsDataHandler.kt", l = {610}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ k $responder;
        final /* synthetic */ GDISmartProto.Smart $smart;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, GDISmartProto.Smart smart, t13.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$responder = kVar;
            this.$smart = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new AnonymousClass3(this.$responder, this.$smart, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                ih2.b.b(SmartNotificationsDataHandler.this.mmsLogTag + " onProtobufRequest => Responding to AppStatusRequest.");
                k kVar = this.$responder;
                GDISmartProto.Smart smart = this.$smart;
                this.label = 1;
                if (kVar.a(smart, this) == aVar) {
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

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$receiveCapabilities$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$receiveCapabilities$1", f = "SmartNotificationsDataHandler.kt", l = {}, m = "invokeSuspend")
    public static final class C39051 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GDICore.FeatureCapabilitiesResponse $featureCapabilities;
        int label;
        final /* synthetic */ SmartNotificationsDataHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39051(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse, SmartNotificationsDataHandler smartNotificationsDataHandler, t13.d<? super C39051> dVar) {
            super(2, dVar);
            this.$featureCapabilities = featureCapabilitiesResponse;
            this.this$0 = smartNotificationsDataHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C39051(this.$featureCapabilities, this.this$0, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39051) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse = this.$featureCapabilities;
            GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIGNCS.CapabilitiesResponse> generatedExtension = GDIGNCS.CapabilitiesResponse.gncs;
            GDIGNCS.CapabilitiesResponse capabilitiesResponse = featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIGNCS.CapabilitiesResponse) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
            if (capabilitiesResponse == null) {
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            if (capabilitiesResponse.hasNcVersion()) {
                int ncVersion = capabilitiesResponse.getNcVersion();
                ih2.b.b(this.this$0.logTag + "receiveCapabilities, ncVersion=" + ncVersion);
                if (ncVersion >= 1) {
                    arrayList.add(DeviceCapability.MODIFIED_NOTIFICATIONS_AFTER_ADDED);
                }
            } else {
                com.airbnb.lottie.animation.keyframe.a.s("{", this.this$0.logTag, "}receiveCapabilities");
            }
            if (capabilitiesResponse.hasSupportBlockedApps()) {
                this.this$0.deviceSupportsBlockedApps = capabilitiesResponse.getSupportBlockedApps();
                ih2.b.b(this.this$0.logTag + "receiveCapabilities, supportBlockedApps=" + this.this$0.deviceSupportsBlockedApps);
                if (this.this$0.deviceSupportsBlockedApps) {
                    arrayList.add(DeviceCapability.SUPPORTS_BLOCKED_APPS);
                }
            }
            if (!arrayList.isEmpty()) {
                this.this$0.callback.onCapabilitiesReceived(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendDisabledAppsHash$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendDisabledAppsHash$1", f = "SmartNotificationsDataHandler.kt", l = {547}, m = "invokeSuspend")
    public static final class C39061 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        Object L$0;
        int label;

        public C39061(t13.d<? super C39061> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39061(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39061) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            SmartNotificationsDataHandler smartNotificationsDataHandler;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                ih2.b.b(SmartNotificationsDataHandler.this.logTag + " sendDisabledAppsHash.");
                dt2.g gVar = SmartNotificationsDataHandler.this.protobufMessenger;
                if (gVar == null) {
                    s.m("protobufMessenger");
                    throw null;
                }
                SmartNotificationsDataHandler smartNotificationsDataHandler2 = SmartNotificationsDataHandler.this;
                try {
                    String hashForDisabledApps = SmartNotificationsDataHandlerKt.getHashForDisabledApps();
                    GDIGNCS.BlockedAppsHashNotification.Builder builderNewBuilder = GDIGNCS.BlockedAppsHashNotification.newBuilder();
                    if (hashForDisabledApps != null) {
                        byte[] bytes = hashForDisabledApps.getBytes(d53.c.f57666b);
                        bytes.getClass();
                        builderNewBuilder.setBlockedAppsHash(ByteString.copyFrom(bytes));
                    } else {
                        builderNewBuilder.setBlockedAppsHash(ByteString.EMPTY);
                    }
                    GDIGNCS.Service.Builder builderNewBuilder2 = GDIGNCS.Service.newBuilder();
                    builderNewBuilder2.setBlockedAppHashNotification(builderNewBuilder.build());
                    GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGNCSExtension.gncsService, builderNewBuilder2.build()).build();
                    smartBuild.getClass();
                    ih2.b.b(smartNotificationsDataHandler2.logTag + " sendDisabledAppsHash, hash=" + hashForDisabledApps);
                    this.L$0 = smartNotificationsDataHandler2;
                    this.label = 1;
                    if (gVar.c(smartBuild, this) == aVar) {
                        return aVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    smartNotificationsDataHandler = smartNotificationsDataHandler2;
                    ih2.b.c(smartNotificationsDataHandler.logTag + " sendDisabledAppsHash, failed to send blocked apps hash notification", th);
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                smartNotificationsDataHandler = (SmartNotificationsDataHandler) this.L$0;
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    ih2.b.c(smartNotificationsDataHandler.logTag + " sendDisabledAppsHash, failed to send blocked apps hash notification", th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendGarminDeviceUpdatedCapabilities$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendGarminDeviceUpdatedCapabilities$1", f = "SmartNotificationsDataHandler.kt", l = {560}, m = "invokeSuspend")
    public static final class C39071 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        Object L$0;
        int label;

        public C39071(t13.d<? super C39071> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39071(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39071) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            SmartNotificationsDataHandler smartNotificationsDataHandler;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            Unit unit = null;
            if (i14 == 0) {
                r.b(obj);
                rs2.i iVar = (rs2.i) da2.d.b().getCapability(SmartNotificationsDataHandler.this.profile.getF92741e(), rs2.i.class);
                if (iVar != null) {
                    SmartNotificationsDataHandler smartNotificationsDataHandler2 = SmartNotificationsDataHandler.this;
                    ih2.b.b(smartNotificationsDataHandler2.logTag + "sendGarminDeviceUpdatedCapabilities");
                    try {
                        this.L$0 = smartNotificationsDataHandler2;
                        this.label = 1;
                        Object objC = iVar.c(iVar.f154390c, (dt2.c[]) Arrays.copyOf(new dt2.c[]{smartNotificationsDataHandler2}, 1), this);
                        if (objC != aVar) {
                            objC = Unit.INSTANCE;
                        }
                        if (objC == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        smartNotificationsDataHandler = smartNotificationsDataHandler2;
                        ih2.b.c(smartNotificationsDataHandler.logTag + "sendGarminDeviceUpdatedCapabilities", th);
                    }
                    unit = Unit.INSTANCE;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                smartNotificationsDataHandler = (SmartNotificationsDataHandler) this.L$0;
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    ih2.b.c(smartNotificationsDataHandler.logTag + "sendGarminDeviceUpdatedCapabilities", th);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                ih2.b.a(new Exception(j.m("device with connectionId [", SmartNotificationsDataHandler.this.profile.getF92741e(), "] not found")), tn.k.g(SmartNotificationsDataHandler.this.logTag, "sendGarminDeviceUpdatedCapabilities"));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsDataSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsDataSource$1", f = "SmartNotificationsDataHandler.kt", l = {444}, m = "invokeSuspend")
    public static final class C39081 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ byte[] $ancsPayload;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsDataSource$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsDataSource$1$1", f = "SmartNotificationsDataHandler.kt", l = {}, m = "invokeSuspend")
        public static final class C09871 extends i implements l<t13.d<? super Unit>, Object> {
            final /* synthetic */ byte[] $ancsPayload;
            int label;
            final /* synthetic */ SmartNotificationsDataHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09871(SmartNotificationsDataHandler smartNotificationsDataHandler, byte[] bArr, t13.d<? super C09871> dVar) {
                super(1, dVar);
                this.this$0 = smartNotificationsDataHandler;
                this.$ancsPayload = bArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(GncsDataSourceSender.Failure failure) {
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C09871(this.this$0, this.$ancsPayload, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((C09871) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.this$0.getDataSourceSender$gncs_gdi_release().sendGncsDataSource(this.$ancsPayload, new d(0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39081(byte[] bArr, t13.d<? super C39081> dVar) {
            super(2, dVar);
            this.$ancsPayload = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39081(this.$ancsPayload, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39081) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                p pVar = SmartNotificationsDataHandler.this.runner;
                C09871 c09871 = new C09871(SmartNotificationsDataHandler.this, this.$ancsPayload, null);
                this.label = 1;
                if (pVar.a(c09871, this) == aVar) {
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

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsNotificationSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsNotificationSource$1", f = "SmartNotificationsDataHandler.kt", l = {420}, m = "invokeSuspend")
    public static final class C39091 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ byte[] $ancsPayload;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsNotificationSource$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendGncsNotificationSource$1$1", f = "SmartNotificationsDataHandler.kt", l = {422, 424}, m = "invokeSuspend")
        public static final class C09881 extends i implements l<t13.d<? super byte[]>, Object> {
            final /* synthetic */ byte[] $ancsPayload;
            final /* synthetic */ byte[] $sessionKey;
            int label;
            final /* synthetic */ SmartNotificationsDataHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09881(byte[] bArr, SmartNotificationsDataHandler smartNotificationsDataHandler, byte[] bArr2, t13.d<? super C09881> dVar) {
                super(1, dVar);
                this.$sessionKey = bArr;
                this.this$0 = smartNotificationsDataHandler;
                this.$ancsPayload = bArr2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C09881(this.$sessionKey, this.this$0, this.$ancsPayload, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super byte[]> dVar) {
                return ((C09881) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
            
                if (r8 == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
            
                if (r8 == r0) goto L25;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return (byte[]) obj;
                    }
                    if (i14 == 2) {
                        r.b(obj);
                        return (byte[]) obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                byte[] bArr = this.$sessionKey;
                SmartNotificationsDataHandler smartNotificationsDataHandler = this.this$0;
                if (bArr == null) {
                    v vVar = smartNotificationsDataHandler.messenger;
                    if (vVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    byte[] bArr2 = this.$ancsPayload;
                    this.label = 1;
                    obj = vVar.b(SmartNotificationsDataHandler.NOTIFICATION_SOURCE_MESSAGE_ID, bArr2, this);
                } else {
                    v vVar2 = smartNotificationsDataHandler.messenger;
                    if (vVar2 == null) {
                        s.m("messenger");
                        throw null;
                    }
                    byte[] bArr3 = this.$ancsPayload;
                    byte[] bArrC = n.c(bArr3.length, true, bArr3, this.$sessionKey);
                    this.label = 2;
                    obj = vVar2.b(SmartNotificationsDataHandler.NOTIFICATION_SOURCE_MESSAGE_ID, bArrC, this);
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39091(byte[] bArr, t13.d<? super C39091> dVar) {
            super(2, dVar);
            this.$ancsPayload = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39091(this.$ancsPayload, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39091) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    byte[] sessionKey = SmartNotificationsDataHandler.this.getDataSourceSender$gncs_gdi_release().mDelegate.getSessionKey();
                    p pVar = SmartNotificationsDataHandler.this.runner;
                    C09881 c09881 = new C09881(sessionKey, SmartNotificationsDataHandler.this, this.$ancsPayload, null);
                    this.label = 1;
                    if (pVar.a(c09881, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable th3) {
                ih2.b.c(SmartNotificationsDataHandler.this.logTag + "failed to send 5033 message", th3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.SmartNotificationsDataHandler$sendImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$sendImage$2", f = "SmartNotificationsDataHandler.kt", l = {503}, m = "invokeSuspend")
    public static final class C39102 extends i implements e23.p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ k $responder;
        final /* synthetic */ GDISmartProto.Smart $smart;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39102(k kVar, GDISmartProto.Smart smart, t13.d<? super C39102> dVar) {
            super(2, dVar);
            this.$responder = kVar;
            this.$smart = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SmartNotificationsDataHandler.this.new C39102(this.$responder, this.$smart, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39102) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                ih2.b.b(SmartNotificationsDataHandler.this.mmsLogTag + " sendImage -> Responding to MMS image Request .");
                k kVar = this.$responder;
                GDISmartProto.Smart smart = this.$smart;
                this.label = 1;
                if (dt2.j.a(kVar, smart, this) == aVar) {
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

    /* JADX WARN: Type inference failed for: r2v7, types: [com.garmin.android.gncs.SmartNotificationsDataHandler$smartNotifOSServiceLifecycleCallback$1] */
    public SmartNotificationsDataHandler(rs2.c cVar, Context context, Callback callback, Validator validator) {
        cVar.getClass();
        context.getClass();
        callback.getClass();
        validator.getClass();
        this.profile = cVar;
        this.appContext = context;
        this.callback = callback;
        this.validator = validator;
        String strM = j.m("SmartNotifDataHandler(", cVar.getF92741e(), ") ");
        this.logTag = strM;
        this.mmsLogTag = "MMS# ".concat(strM);
        this.coroutineScope = zl.a.e("SmartNotifDataHandler", s0.f129406a.plus(ge1.b.h()));
        this.smartNotifOSServiceLifecycleCallback = new SmartNotifOSServiceLifecycleCallback() { // from class: com.garmin.android.gncs.SmartNotificationsDataHandler$smartNotifOSServiceLifecycleCallback$1
            @Override // com.garmin.android.gncs.SmartNotifOSServiceLifecycleCallback
            public void onConnected() {
                ih2.b.b(this.this$0.logTag + " smartNotifOSServiceLifecycleCallback.onConnected()");
                this.this$0.sendGarminDeviceUpdatedCapabilities();
            }

            @Override // com.garmin.android.gncs.SmartNotifOSServiceLifecycleCallback
            public void onDisconnected() {
                ih2.b.b(this.this$0.logTag + " smartNotifOSServiceLifecycleCallback.onDisconnected()");
                this.this$0.sendGarminDeviceUpdatedCapabilities();
            }
        };
        this.optOutSettingsChangedListener = new GNCSOptOutSettingsChangedListener() { // from class: com.garmin.android.gncs.SmartNotificationsDataHandler$optOutSettingsChangedListener$1
            @Override // com.garmin.android.gncs.settings.GNCSOptOutSettingsChangedListener
            public void onSettingsChanged() {
                ih2.b.b(this.this$0.logTag + " optOutSettingsChangedListener.onSettingsChanged()");
                this.this$0.sendDisabledAppsHash();
            }
        };
        this.defaultAppsChangeListener = new DefaultAppsObserver.DefaultAppsChangeListener() { // from class: com.garmin.android.gncs.SmartNotificationsDataHandler$defaultAppsChangeListener$1
            @Override // com.garmin.android.gncs.DefaultAppsObserver.DefaultAppsChangeListener
            public void onDefaultAppsChanged() {
                ih2.b.b(this.this$0.logTag + " DefaultAppsObserver.onDefaultSmsAppChanged");
                this.this$0.sendGarminDeviceUpdatedCapabilities();
            }
        };
        this.runner = new p();
        this.protobufResponseRunner = new p();
        ih2.b.b(strM.concat("instantiated"));
    }

    private final GNCSMediaRequest.MediaType getMediaType(List<? extends GDIGNCS.MediaType> types) {
        return (types.isEmpty() || types.get(0) == GDIGNCS.MediaType.PNG) ? GNCSMediaRequest.MediaType.PNG : GNCSMediaRequest.MediaType.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDisabledAppsHash() {
        ge1.b.T(this.coroutineScope, null, null, new C39061(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendGarminDeviceUpdatedCapabilities() {
        ge1.b.T(this.coroutineScope, null, null, new C39071(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendImage(GNCSMediaResponse mediaResponse, k responder) {
        ih2.b.b(this.mmsLogTag + " sendImage -> " + mediaResponse);
        GDIGNCS.MediaResponse.Builder builderNewBuilder = GDIGNCS.MediaResponse.newBuilder();
        builderNewBuilder.setNotificationUid(mediaResponse.getNotificationId());
        builderNewBuilder.setIndex(mediaResponse.getIndex());
        builderNewBuilder.setType(GDIGNCS.MediaType.valueOf(mediaResponse.getType().name()));
        GNCSMediaResponse.Status status = mediaResponse.getStatus();
        status.getClass();
        builderNewBuilder.setStatus(GDIGNCS.MediaResponse.Status.valueOf(status.name()));
        byte[] imageData = mediaResponse.getImageData();
        if (imageData != null) {
            try {
                zj2.e eVar = (zj2.e) da2.d.c(this.appContext).getCapability(this.profile.getF92741e(), zj2.e.class);
                if (eVar != null) {
                    int iD = eVar.d(imageData, new SmartNotificationsDataHandler$sendImage$1$mmsTransferResult$1(this), new SmartNotificationsDataHandler$sendImage$1$progressReporting$1(this), "MMS Image");
                    ih2.b.b(this.mmsLogTag + " sendImage -> transferId is " + iD);
                    GDIDataTypes.DataTransferItem.Builder builderNewBuilder2 = GDIDataTypes.DataTransferItem.newBuilder();
                    builderNewBuilder2.setId(iD);
                    builderNewBuilder2.setSize(imageData.length);
                    builderNewBuilder.setTransferInfo(builderNewBuilder2);
                } else {
                    ih2.b.d(this.mmsLogTag + " sendImage , DataTransferService is not available.");
                }
            } catch (Throwable th3) {
                ih2.b.c(this.mmsLogTag + " sendImage -> Exception in send Image .", th3);
                return;
            }
        }
        GDIGNCS.Service.Builder builderNewBuilder3 = GDIGNCS.Service.newBuilder();
        builderNewBuilder3.setMediaResponse(builderNewBuilder.build());
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGNCSExtension.gncsService, builderNewBuilder3.build()).build();
        smartBuild.getClass();
        ge1.b.T(this.coroutineScope, null, null, new C39102(responder, smartBuild, null), 3);
    }

    private final void startListeningForDefaultAppChanges() {
        DefaultAppsObserver.INSTANCE.getInstance().addListener(this.profile.getF92741e(), this.defaultAppsChangeListener);
        ih2.b.b(this.logTag + " startListeningForDefaultAppChanges, connectionId=" + this.profile.getF92741e());
    }

    private final void stopListeningForDefaultAppChanges() {
        DefaultAppsObserver.INSTANCE.getInstance().removeListener(this.profile.getF92741e());
        ih2.b.b(this.logTag + " stoppedListeningForDefaultAppChanges, connectionId=" + this.profile.getF92741e());
    }

    @Override // rs2.h
    public void close(String connectionId) {
        connectionId.getClass();
        ih2.b.b(this.logTag + "close");
        try {
            getDataSourceSender$gncs_gdi_release().close();
            c0.d(this.coroutineScope, "SmartNotificationsDataHandler closed");
        } finally {
            GNCSListenerService.removeSmartNotifOSServiceLifecycleCallback(this.smartNotifOSServiceLifecycleCallback);
            GNCSSettings.getInstance().removeOptOutSettingsChangedListener(this.optOutSettingsChangedListener);
            stopListeningForDefaultAppChanges();
        }
    }

    @Override // dt2.c
    public void configure(rs2.c deviceInfo, ExtensionRegistryLite extensionRegistry, GDICore.FeatureCapabilitiesRequest.Builder capabilitiesRequestBuilder) {
        GDIGNCS.NotificationDisabledReason notificationDisabledReason;
        deviceInfo.getClass();
        extensionRegistry.getClass();
        capabilitiesRequestBuilder.getClass();
        String strG = tn.k.g(this.logTag, "configure");
        if (!GNCSListenerService.isNotificationAccessAllowed(this.appContext)) {
            notificationDisabledReason = GDIGNCS.NotificationDisabledReason.LOW_RAM_MOBILE_DEVICE;
        } else if (GNCSListenerService.isServiceConnected()) {
            notificationDisabledReason = null;
        } else {
            notificationDisabledReason = !SmartNotificationsUtil.isNotificationAccessEnabled(this.appContext) ? GDIGNCS.NotificationDisabledReason.PERMISSION_NOT_GRANTED : GDIGNCS.NotificationDisabledReason.SERVICE_NOT_BOUND;
        }
        GDIGNCS.CapabilitiesRequest.Builder builderNewBuilder = GDIGNCS.CapabilitiesRequest.newBuilder();
        int iFromSemanticVersion = SmartNotificationsDataHandlerKt.fromSemanticVersion(BuildConfig.MAVEN_VERSION);
        builderNewBuilder.setNpVersion(iFromSemanticVersion);
        String str = ((Object) strG) + "\n* npVersion:" + iFromSemanticVersion;
        if (notificationDisabledReason != null) {
            builderNewBuilder.setNotificationDisabledReason(notificationDisabledReason);
            str = ((Object) str) + "\n* notificationDisabledReason:" + notificationDisabledReason.name();
            SmartNotificationsUtil.isNotifPermissionGrantedAndServiceConnected(str);
        }
        String defaultSMSApp = SmartNotificationsDataHandlerKt.getDefaultSMSApp(this.appContext);
        builderNewBuilder.setDefaultMessagingAppId(defaultSMSApp);
        String str2 = ((Object) str) + "\n* defaultMessagingAppId:" + defaultSMSApp;
        String defaultDialerApp = SmartNotificationsDataHandlerKt.getDefaultDialerApp(this.appContext);
        builderNewBuilder.setDefaultDialerAppId(defaultDialerApp);
        GDIGNCS.registerAllExtensions(extensionRegistry);
        GDIGNCSExtension.registerAllExtensions(extensionRegistry);
        capabilitiesRequestBuilder.setExtension(GDIGNCS.CapabilitiesRequest.gncs, builderNewBuilder.build());
        ih2.b.b(((Object) str2) + "\n* defaultDialerAppId:" + defaultDialerApp);
        startListeningForDefaultAppChanges();
    }

    @Override // dt2.c
    public void connectionReady(GDICore.ConnectionReadyNotification notification) {
        notification.getClass();
        ih2.b.b(this.logTag + "connectionReady .");
        if (this.deviceSupportsBlockedApps) {
            GNCSSettings.getInstance().addOptOutSettingsChangedListener(this.optOutSettingsChangedListener);
            sendDisabledAppsHash();
        }
    }

    @Override // rs2.h
    public Set<Integer> getConfiguration() {
        return a1.b(6);
    }

    public final GncsDataSourceSender getDataSourceSender$gncs_gdi_release() {
        GncsDataSourceSender gncsDataSourceSender = this.dataSourceSender;
        if (gncsDataSourceSender != null) {
            return gncsDataSourceSender;
        }
        s.m("dataSourceSender");
        throw null;
    }

    /* JADX INFO: renamed from: getDefaultAppsChangeListener$gncs_gdi_release, reason: from getter */
    public final DefaultAppsObserver.DefaultAppsChangeListener getDefaultAppsChangeListener() {
        return this.defaultAppsChangeListener;
    }

    /* JADX INFO: renamed from: getEncryptionKey$gncs_gdi_release, reason: from getter */
    public final byte[] getEncryptionKey() {
        return this.encryptionKey;
    }

    /* JADX INFO: renamed from: getOptOutSettingsChangedListener$gncs_gdi_release, reason: from getter */
    public final GNCSOptOutSettingsChangedListener getOptOutSettingsChangedListener() {
        return this.optOutSettingsChangedListener;
    }

    @Override // rs2.w
    public void onMessageReceived(int messageType, byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        if (messageType == CONTROL_POINT_MESSAGE_ID) {
            processControlPointMessage$gncs_gdi_release(payload, responder);
        } else {
            if (messageType != 5036) {
                return;
            }
            processSubscriptionMessage$gncs_gdi_release(payload, responder);
        }
    }

    @Override // dt2.h
    public boolean onProtobufRequest(GDISmartProto.Smart smart, k responder) {
        smart.getClass();
        responder.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGNCS.Service> generatedExtension = GDIGNCSExtension.gncsService;
        GDIGNCS.Service service = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIGNCS.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (service != null && service.hasMediaRequest()) {
            ih2.b.b(this.mmsLogTag + " onProtobufRequest => service.hasMediaRequest() " + service.hasMediaRequest());
            int notificationUid = service.getMediaRequest().getNotificationUid();
            int index = service.getMediaRequest().getIndex();
            int heightPx = service.getMediaRequest().getAttributes().getHeightPx();
            int widthPx = service.getMediaRequest().getAttributes().getWidthPx();
            int maxByteSize = service.getMediaRequest().getAttributes().getMaxByteSize();
            List<GDIGNCS.MediaType> supportedTypesList = service.getMediaRequest().getSupportedTypesList();
            supportedTypesList.getClass();
            ge1.b.T(this.coroutineScope, null, null, new C39041(new GNCSMediaRequest(notificationUid, index, heightPx, widthPx, maxByteSize, getMediaType(supportedTypesList), service.getMediaRequest().getAttributes().getQuality()), responder, null), 3);
            return true;
        }
        if (service == null || !service.hasAppStatusRequest()) {
            return false;
        }
        ih2.b.b(this.mmsLogTag + " onProtobufRequest => service.hasAppStatusRequest()" + service.hasAppStatusRequest());
        List<AppNotificationStateInfo> applicationStatus = SmartNotificationsDataHandlerKt.getApplicationStatus(this.appContext, service.getAppStatusRequest().getStatus() == GDIGNCS.AppStatusRequest.Status.BLOCKED);
        GDIGNCS.AppStatusResponse.Builder builderNewBuilder = GDIGNCS.AppStatusResponse.newBuilder();
        if (applicationStatus != null) {
            for (AppNotificationStateInfo appNotificationStateInfo : applicationStatus) {
                GDIGNCS.AppStatus.Builder builderNewBuilder2 = GDIGNCS.AppStatus.newBuilder();
                builderNewBuilder2.setPackageId(appNotificationStateInfo.getPackageId());
                builderNewBuilder2.setName(appNotificationStateInfo.getAppDisplayName());
                builderNewBuilder2.setStatus(appNotificationStateInfo.getEnabled() ? GDIGNCS.AppStatus.Status.ALLOWED : GDIGNCS.AppStatus.Status.BLOCKED);
                builderNewBuilder.addApps(builderNewBuilder2);
            }
        }
        GDIGNCS.Service.Builder builderNewBuilder3 = GDIGNCS.Service.newBuilder();
        builderNewBuilder3.setAppStatusResponse(builderNewBuilder.build());
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGNCSExtension.gncsService, builderNewBuilder3.build()).build();
        smartBuild.getClass();
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass3(responder, smartBuild, null), 3);
        return true;
    }

    public final l1 processControlPointMessage$gncs_gdi_release(byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        return ge1.b.T(this.coroutineScope, null, null, new SmartNotificationsDataHandler$processControlPointMessage$1(this, payload, responder, null), 3);
    }

    public final l1 processSubscriptionMessage$gncs_gdi_release(byte[] payload, x responder) {
        payload.getClass();
        responder.getClass();
        return ge1.b.T(this.coroutineScope, null, null, new SmartNotificationsDataHandler$processSubscriptionMessage$1(payload, this, responder, null), 3);
    }

    @Override // dt2.c
    public void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilities) {
        featureCapabilities.getClass();
        ge1.b.T(this.coroutineScope, null, null, new C39051(featureCapabilities, this, null), 3);
    }

    public final void sendGncsDataSource(byte[] ancsPayload) {
        ge1.b.T(this.coroutineScope, null, null, new C39081(ancsPayload, null), 3);
    }

    public final void sendGncsNotificationSource(byte[] ancsPayload) {
        ancsPayload.getClass();
        ge1.b.T(this.coroutineScope, null, null, new C39091(ancsPayload, null), 3);
    }

    public final void setDataSourceSender$gncs_gdi_release(GncsDataSourceSender gncsDataSourceSender) {
        gncsDataSourceSender.getClass();
        this.dataSourceSender = gncsDataSourceSender;
    }

    public final void setEncryptionKey$gncs_gdi_release(byte[] bArr) {
        this.encryptionKey = bArr;
    }

    @Override // bt2.a
    public void setSessionKey(byte[] sessionKey) {
        sessionKey.getClass();
        this.encryptionKey = sessionKey;
    }

    @Override // rs2.h
    public void start(rs2.c deviceInfo, v messenger) {
        deviceInfo.getClass();
        messenger.getClass();
        ih2.b.b(this.logTag + TtmlNode.START);
        messenger.d(NotificationServiceSubscriptionMessage.MESSAGE_ID, this);
        messenger.d(CONTROL_POINT_MESSAGE_ID, this);
        this.messenger = messenger;
        setDataSourceSender$gncs_gdi_release(new GncsDataSourceSender(this.logTag, messenger, new GncsDataSourceDelegate()));
        GNCSListenerService.addSmartNotifOSServiceLifecycleCallback(this.smartNotifOSServiceLifecycleCallback);
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, dt2.g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        messenger.a(this);
        this.protobufMessenger = messenger;
    }

    public /* synthetic */ SmartNotificationsDataHandler(rs2.c cVar, Context context, Callback callback, Validator validator, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, context, (i14 & 4) != 0 ? new GfdiAncsMessageTransport(context, cVar) : callback, (i14 & 8) != 0 ? new Validator() { // from class: com.garmin.android.gncs.SmartNotificationsDataHandler.1
            @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Validator
            public ANCSMessageBase.AncsError validateControlPointMessage(byte[] bArr) {
                return Validator.DefaultImpls.validateControlPointMessage(this, bArr);
            }
        } : validator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler(rs2.c cVar, Context context) {
        this(cVar, context, new GfdiAncsMessageTransport(context, cVar), new Validator() { // from class: com.garmin.android.gncs.SmartNotificationsDataHandler.2
            @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Validator
            public ANCSMessageBase.AncsError validateControlPointMessage(byte[] bArr) {
                return Validator.DefaultImpls.validateControlPointMessage(this, bArr);
            }
        });
        cVar.getClass();
        context.getClass();
    }
}
