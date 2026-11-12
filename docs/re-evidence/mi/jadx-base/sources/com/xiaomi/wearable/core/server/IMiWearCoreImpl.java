package com.xiaomi.wearable.core.server;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.ArrayMap;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.WearMode;
import com.xiaomi.wearable.connection.ACLReceiver;
import com.xiaomi.wearable.connection.ConnectSource;
import com.xiaomi.wearable.connection.ConnectStateObserver;
import com.xiaomi.wearable.connection.IDeviceStateListener;
import com.xiaomi.wearable.connection.PowerKeeperReceiver;
import com.xiaomi.wearable.connection.ScreenReceiver;
import com.xiaomi.wearable.core.CapabilityManager;
import com.xiaomi.wearable.core.ConnectTrackerKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.DeviceInfoExtKt;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.a;
import com.xiaomi.wearable.core.c;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.core.client.ThirdPartySupport;
import com.xiaomi.wearable.core.d;
import com.xiaomi.wearable.core.e;
import com.xiaomi.wearable.core.server.IMiWearCoreImpl;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.mass.RunningMassManager;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import com.xiaomi.wearable.wear.api.ThirdPartyApiCall;
import com.xiaomi.wearable.wear.api.WearApiCall;
import defpackage.s33;
import defpackage.s5f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b*\u0001o\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0085\u0001B\n\b\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u0016J!\u0010&\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0012J\u0011\u0010'\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u000bJ!\u0010,\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J7\u00103\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u000bJ\u000f\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0006J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010;J?\u0010A\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00132\u0006\u00102\u001a\u00020?2\u0006\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010EJ'\u0010H\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ'\u0010J\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bJ\u0010IJ\u0019\u0010K\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u00108J/\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0006\u00102\u001a\u00020?2\u0006\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u000fH\u0016¢\u0006\u0004\bQ\u0010;J\u0017\u0010R\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\u000bJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u000bJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010!\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00042\u0006\u0010!\u001a\u00020TH\u0016¢\u0006\u0004\bW\u0010VJ\u001f\u0010Y\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0006\u00102\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ=\u0010[\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010\u000bJ\u0019\u0010^\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b^\u00108J\u0017\u0010_\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b_\u0010\u000bJ\u0019\u0010`\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b`\u0010\u000bJ)\u0010c\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000fH\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010\u000bJ\u0019\u0010f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bf\u0010\u000bJ\u0019\u0010g\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bg\u0010\u000bJ\u0017\u0010h\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010T¢\u0006\u0004\bh\u0010VJ\r\u0010i\u001a\u00020\u0004¢\u0006\u0004\bi\u0010\u0006R$\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010m\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR+\u0010w\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020 0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010~\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl;", "Lcom/xiaomi/wearable/core/e$a;", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", "Lcom/xiaomi/wearable/core/client/ThirdPartySupport;", "", "initCurrentDevice", "()V", "reportLastConnectStateIfNeed", "", "did", "connectDeviceIfNeed", "(Ljava/lang/String;)V", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "getApiCall", "(Ljava/lang/String;)Lcom/xiaomi/wearable/wear/api/WearApiCall;", "", "state", "notifyDeviceChange", "(Ljava/lang/String;I)V", "", "currentDevice", "setCurrentDeviceInner", "(Ljava/lang/String;Z)V", "deviceInfo", "addDeviceInfoInner", "Lcom/xiaomi/wearable/core/DeviceInfo;", "convertToDevice", "(Ljava/lang/String;)Lcom/xiaomi/wearable/core/DeviceInfo;", Home.JSON_KEY_ADDRESS, "findBondedWearApiCall", "channel", "setChannel", "Lcom/xiaomi/wearable/core/server/OnDeviceChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerDeviceChangeListener", "(Lcom/xiaomi/wearable/core/server/OnDeviceChangeListener;)V", "setCurrentDevice", "mode", "setWearMode", "getCurrentDevice", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "addDeviceInfo", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "api", "addThirdDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "type", "detailType", "path", "Ls5f;", "callback", "sendThirdFile", "(Ljava/lang/String;IILjava/lang/String;Ls5f;)V", "removeDeviceInfo", "removeAllDeviceInfo", "getDeviceCapabilities", "(Ljava/lang/String;)I", "appCapability", "setAppCapabilities", "(I)V", "", "data", "needResponse", "Lcom/xiaomi/wearable/core/ICallback;", "timeout", "call", "(ILjava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)I", "callId", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Ljava/lang/String;I)Z", "Lcom/xiaomi/wearable/core/c;", "handler", "addDeviceDataHandler", "(Ljava/lang/String;ILcom/xiaomi/wearable/core/c;)V", "removeDeviceDataHandler", "isIdle", "(Ljava/lang/String;)Z", "openMassChannel", "massId", "sendMassData", "(I[BLcom/xiaomi/wearable/core/ICallback;I)V", "closeMassChannel", "connect", "disconnect", "Lcom/xiaomi/wearable/core/d;", "addDeviceStateListener", "(Lcom/xiaomi/wearable/core/d;)V", "removeDeviceStateListener", "Lcom/xiaomi/wearable/core/a;", "openUnauthConnection", "(Ljava/lang/String;Lcom/xiaomi/wearable/core/a;)V", "unauthCall", "(Ljava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)V", "closeUnauthConnection", "getDeviceCapabilitiesV2", "onConnectStart", "onConnectSuccess", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onDisconnect", "onDeviceFound", "onDeviceLost", "onClientDied", CervicalMucusRecord.Appearance.CLEAR, "Ljava/util/concurrent/ConcurrentHashMap;", "wearApiCalls", "Ljava/util/concurrent/ConcurrentHashMap;", "currentApiCall", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "com/xiaomi/wearable/core/server/IMiWearCoreImpl$deviceStateListeners$1", "deviceStateListeners", "Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl$deviceStateListeners$1;", "Landroid/util/ArrayMap;", "unauthApiCalls$delegate", "Lkotlin/Lazy;", "getUnauthApiCalls", "()Landroid/util/ArrayMap;", "unauthApiCalls", "", "onDeviceChangeListeners", "Ljava/util/List;", "", "lock", "Ljava/lang/Object;", "inBindingMode", "Z", "getInBindingMode", "()Z", "setInBindingMode", "(Z)V", "<init>", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIMiWearCoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMiWearCoreImpl.kt\ncom/xiaomi/wearable/core/server/IMiWearCoreImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 CoreExt.kt\ncom/xiaomi/wearable/CoreExtKt\n*L\n1#1,671:1\n1863#2,2:672\n216#3,2:674\n216#3,2:676\n216#3,2:678\n216#3,2:680\n160#4,15:682\n177#4,15:697\n160#4,15:712\n160#4,15:727\n160#4,15:742\n160#4,15:757\n*S KotlinDebug\n*F\n+ 1 IMiWearCoreImpl.kt\ncom/xiaomi/wearable/core/server/IMiWearCoreImpl\n*L\n138#1:672,2\n498#1:674,2\n637#1:676,2\n654#1:678,2\n659#1:680,2\n569#1:682,15\n582#1:697,15\n591#1:712,15\n600#1:727,15\n615#1:742,15\n624#1:757,15\n*E\n"})
public final class IMiWearCoreImpl extends e.a implements IDeviceStateListener, ThirdPartySupport {

    @NotNull
    private static final String TAG = "IMiWearCoreImpl";

    @Nullable
    private WearApiCall<?> currentApiCall;
    private volatile boolean inBindingMode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IMiWearCoreImpl instance = new IMiWearCoreImpl();

    @NotNull
    private final ConcurrentHashMap<String, WearApiCall<?>> wearApiCalls = new ConcurrentHashMap<>();

    @NotNull
    private final IMiWearCoreImpl$deviceStateListeners$1 deviceStateListeners = new RemoteCallbackList<d>() { // from class: com.xiaomi.wearable.core.server.IMiWearCoreImpl$deviceStateListeners$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(d callback, Object cookie) {
            CoreExtKt.getLogger().i("IMiWearCoreImpl", "onCallbackDied() called with: callback = " + callback + ", cookie = " + cookie);
            String str = (String) cookie;
            if (Intrinsics.areEqual(str, "com.mi.health") || Intrinsics.areEqual(str, "com.xiaomi.wearable")) {
                this.this$0.onClientDied(callback);
            }
        }
    };

    /* JADX INFO: renamed from: unauthApiCalls$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unauthApiCalls = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fuc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IMiWearCoreImpl.unauthApiCalls_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<OnDeviceChangeListener> onDeviceChangeListeners = new ArrayList();

    @NotNull
    private final Object lock = new Object();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl;", "getInstance", "()Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IMiWearCoreImpl getInstance() {
            return IMiWearCoreImpl.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.wearable.core.server.IMiWearCoreImpl$deviceStateListeners$1] */
    private IMiWearCoreImpl() {
        initCurrentDevice();
        ConnectStateObserver connectStateObserver = ConnectStateObserver.INSTANCE;
        connectStateObserver.register();
        ACLReceiver.INSTANCE.register();
        ScreenReceiver.INSTANCE.register();
        PowerKeeperReceiver.INSTANCE.register();
        connectStateObserver.addConnectResultListener(this);
        reportLastConnectStateIfNeed();
    }

    private final void addDeviceInfoInner(String deviceInfo) {
        synchronized (this.lock) {
            try {
                DeviceInfo deviceInfoConvertToDevice = convertToDevice(deviceInfo);
                if (deviceInfoConvertToDevice != null) {
                    WearApiCall<?> wearApiCall = this.wearApiCalls.get(deviceInfoConvertToDevice.getDid());
                    if (wearApiCall == null) {
                        WearApiCall<?> wearApiCall2 = getUnauthApiCalls().get(deviceInfoConvertToDevice.getAddress());
                        if (wearApiCall2 == null) {
                            ConcurrentHashMap<String, WearApiCall<?>> concurrentHashMap = this.wearApiCalls;
                            String did = deviceInfoConvertToDevice.getDid();
                            Intrinsics.checkNotNull(did);
                            concurrentHashMap.put(did, ApiCallFactory.createApiCall(deviceInfoConvertToDevice));
                        } else {
                            this.inBindingMode = false;
                            wearApiCall2.onUpdate(deviceInfoConvertToDevice);
                            getUnauthApiCalls().remove(deviceInfoConvertToDevice.getAddress());
                            ConcurrentHashMap<String, WearApiCall<?>> concurrentHashMap2 = this.wearApiCalls;
                            String did2 = deviceInfoConvertToDevice.getDid();
                            Intrinsics.checkNotNull(did2);
                            concurrentHashMap2.put(did2, wearApiCall2);
                        }
                    } else {
                        CoreExtKt.getLogger().i(TAG, "addDeviceInfo() called old: " + wearApiCall.getDeviceInfo() + ", new: " + deviceInfoConvertToDevice);
                        this.inBindingMode = false;
                        if (Intrinsics.areEqual(wearApiCall.getDeviceInfo(), deviceInfoConvertToDevice)) {
                            CoreExtKt.getLogger().i(TAG, "noting to change");
                        } else {
                            wearApiCall.onUpdate(deviceInfoConvertToDevice);
                        }
                    }
                    if (CoreExtKt.getInLyra()) {
                        DeviceInfoManager deviceInfoManager = DeviceInfoManager.INSTANCE;
                        String did3 = deviceInfoConvertToDevice.getDid();
                        Intrinsics.checkNotNull(did3);
                        deviceInfoManager.addDeviceInfo(did3, deviceInfo);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void connectDeviceIfNeed(final String did) {
        final WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
        if (wearApiCall == null) {
            return;
        }
        final boolean isConnectActive = wearApiCall.getDeviceInfo().getIsConnectActive();
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().postDelayed(new Runnable() { // from class: kuc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.connectDeviceIfNeed$lambda$2(isConnectActive, did, wearApiCall, this);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectDeviceIfNeed$lambda$2(boolean z, String did, WearApiCall wearApiCall, IMiWearCoreImpl this$0) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(wearApiCall, "$wearApiCall");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoreExtKt.getLogger().i(TAG, "connectDeviceIfNeed() called " + z);
        if (DeviceInfoManager.INSTANCE.isDisconnectDevice(did) || !z || !s33.e() || wearApiCall.isConnected()) {
            return;
        }
        this$0.connect(did);
    }

    private final DeviceInfo convertToDevice(String deviceInfo) {
        DeviceInfo deviceInfoConvertToDevice;
        try {
            deviceInfoConvertToDevice = DeviceInfoExtKt.convertToDevice(deviceInfo);
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "addDeviceInfo() called covert to device error, " + deviceInfo, e);
            deviceInfoConvertToDevice = null;
        }
        if (deviceInfoConvertToDevice == null) {
            CoreExtKt.getLogger().e(TAG, "addDeviceInfo() called covert device null ");
            return null;
        }
        if (DeviceInfoExtKt.isValid(deviceInfoConvertToDevice)) {
            return deviceInfoConvertToDevice;
        }
        CoreExtKt.getLogger().e(TAG, "addDeviceInfo() called covert device invalid " + deviceInfoConvertToDevice);
        return null;
    }

    private final WearApiCall<?> findBondedWearApiCall(String address) {
        for (Map.Entry<String, WearApiCall<?>> entry : this.wearApiCalls.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getAddress(), address)) {
                Logger logger = CoreExtKt.getLogger();
                String key = entry.getKey();
                logger.i(TAG, "findBondedWearApiCall() called " + ((Object) key) + ", " + entry.getValue().isDestroyed());
                if (!entry.getValue().isDestroyed()) {
                    return entry.getValue();
                }
                this.wearApiCalls.remove(entry.getKey());
                return null;
            }
        }
        return null;
    }

    private final WearApiCall<?> getApiCall(String did) {
        return did == null ? this.currentApiCall : this.wearApiCalls.get(did);
    }

    private final ArrayMap<String, WearApiCall<?>> getUnauthApiCalls() {
        return (ArrayMap) this.unauthApiCalls.getValue();
    }

    private final void initCurrentDevice() {
        if (CoreExtKt.getInLyra()) {
            DeviceInfoManager deviceInfoManager = DeviceInfoManager.INSTANCE;
            String currentDeviceDid = deviceInfoManager.getCurrentDeviceDid();
            if (currentDeviceDid == null || StringsKt__StringsKt.isBlank(currentDeviceDid)) {
                CoreExtKt.getLogger().i(TAG, "loadCurrentDeviceInfo() called did null");
                return;
            }
            CoreExtKt.getLogger().i(TAG, "initCurrentDevice() called did " + currentDeviceDid);
            String deviceInfo = deviceInfoManager.getDeviceInfo(currentDeviceDid);
            CoreExtKt.getLogger().i(TAG, "loadCurrentDeviceInfo() called did " + currentDeviceDid + ", device " + deviceInfo);
            if (deviceInfo == null || StringsKt__StringsKt.isBlank(deviceInfo)) {
                CoreExtKt.getLogger().i(TAG, "loadCurrentDeviceInfo() called device null");
                return;
            }
            addDeviceInfoInner(deviceInfo);
            setCurrentDeviceInner(currentDeviceDid, true);
            connectDeviceIfNeed(currentDeviceDid);
        }
    }

    private final void notifyDeviceChange(String did, int state) {
        CoreExtKt.getLogger().i(TAG, "notifyDeviceChange() called with: did = " + did + ", state = " + state);
        for (OnDeviceChangeListener onDeviceChangeListener : this.onDeviceChangeListeners) {
            if (state == 1) {
                onDeviceChangeListener.onDeviceRemove(did);
            } else if (state == 2) {
                onDeviceChangeListener.onCurrentDeviceChanged(did);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectFailure$lambda$26(IMiWearCoreImpl this$0, String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i3);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    broadcastItem.onConnectFailure(str, i, i2);
                }
            } finally {
                try {
                    iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
                } catch (Exception unused) {
                    CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
                }
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectStart$lambda$22(IMiWearCoreImpl this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    broadcastItem.onConnectStart(did);
                }
            } catch (Exception e) {
                CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
            }
        } finally {
            try {
                iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
            } catch (Exception unused) {
                CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConnectSuccess$lambda$24(IMiWearCoreImpl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    Object broadcastCookie = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastCookie(i);
                    CoreExtKt.getLogger().i(TAG, "onConnectSuccess() cookie = " + broadcastCookie);
                    broadcastItem.onConnectSuccess(str);
                }
            } finally {
                try {
                    iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
                } catch (Exception unused) {
                    CoreExtKt.getLogger().e("forEachWithCookie", "An exception occurred when finishBroadcast");
                }
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e("forEachWithCookie", "An exception occurred during RemoteCallbackList forEach", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceFound$lambda$30(IMiWearCoreImpl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    broadcastItem.onDeviceFound(str);
                }
            } finally {
                try {
                    iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
                } catch (Exception unused) {
                    CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
                }
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeviceLost$lambda$32(IMiWearCoreImpl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    broadcastItem.onDeviceLost(str);
                }
            } finally {
                try {
                    iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
                } catch (Exception unused) {
                    CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
                }
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDisconnect$lambda$28(IMiWearCoreImpl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IMiWearCoreImpl$deviceStateListeners$1 iMiWearCoreImpl$deviceStateListeners$1 = this$0.deviceStateListeners;
        try {
            try {
                int iBeginBroadcast = iMiWearCoreImpl$deviceStateListeners$1.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    d broadcastItem = iMiWearCoreImpl$deviceStateListeners$1.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    broadcastItem.onDisconnect(str);
                }
            } finally {
                try {
                    iMiWearCoreImpl$deviceStateListeners$1.finishBroadcast();
                } catch (Exception unused) {
                    CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
                }
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
        }
    }

    private final void reportLastConnectStateIfNeed() {
        DeviceInfoManager deviceInfoManager = DeviceInfoManager.INSTANCE;
        boolean deviceConnectState = deviceInfoManager.getDeviceConnectState();
        final String currentDeviceModel = deviceInfoManager.getCurrentDeviceModel();
        if (deviceConnectState) {
            com.xiaomi.wearable.CoreExtKt.getWorkerHandler().postDelayed(new Runnable() { // from class: huc
                @Override // java.lang.Runnable
                public final void run() {
                    IMiWearCoreImpl.reportLastConnectStateIfNeed$lambda$1(currentDeviceModel);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportLastConnectStateIfNeed$lambda$1(String str) {
        if (str == null) {
            str = "";
        }
        ConnectTrackerKt.endTrackConnectAlive(null, str, 0, "", "", 4);
    }

    private final void setCurrentDeviceInner(String did, boolean currentDevice) {
        synchronized (this.lock) {
            try {
                if (this.wearApiCalls.containsKey(did)) {
                    WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
                    this.currentApiCall = wearApiCall;
                    if (wearApiCall != null) {
                        wearApiCall.setCurrent(currentDevice);
                    }
                    Unit unit = Unit.INSTANCE;
                    if (CoreExtKt.getInLyra() && currentDevice) {
                        DeviceInfoManager.INSTANCE.setCurrentDeviceInfo(did);
                        notifyDeviceChange(did, 2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayMap unauthApiCalls_delegate$lambda$0() {
        return new ArrayMap();
    }

    @Override // com.xiaomi.wearable.core.e
    public void addDeviceDataHandler(@NotNull String did, int type, @NotNull c handler) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(handler, "handler");
        CoreExtKt.getLogger().i(TAG, "addDeviceDataHandler() called with: did = " + did + ", type = " + type + ", handler = " + handler);
        synchronized (this.lock) {
            WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
            if (wearApiCall != null) {
                wearApiCall.addDeviceDataHandler(type, handler);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void addDeviceInfo(@NotNull String deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        CoreExtKt.getLogger().i(TAG, "addDeviceInfo() called with: deviceInfo = " + deviceInfo);
        if (PermissionChecker.INSTANCE.checkCallPermission()) {
            addDeviceInfoInner(deviceInfo);
        } else {
            CoreExtKt.getLogger().i(TAG, "addDeviceInfo() error permission");
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void addDeviceStateListener(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CoreExtKt.getLogger().i(TAG, "addDeviceStateListener() called with: listener = " + listener);
        register(listener, com.xiaomi.wearable.CoreExtKt.getCallingPackage());
    }

    @Override // com.xiaomi.wearable.core.client.ThirdPartySupport
    public void addThirdDeviceInfo(@NotNull DeviceInfo deviceInfo, @Nullable IDeviceApiCall api) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        CoreExtKt.getLogger().i(TAG, "addThirdDeviceInfo() called with: deviceInfo = " + deviceInfo + ", api = " + api);
        synchronized (this.lock) {
            try {
                String did = deviceInfo.getDid();
                if (did != null) {
                    WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
                    if (wearApiCall == null) {
                        WearApiCall<?> wearApiCall2 = getUnauthApiCalls().get(deviceInfo.getAddress());
                        if (wearApiCall2 == null) {
                            this.wearApiCalls.put(did, ApiCallFactory.INSTANCE.createThirdPartyApiCall(deviceInfo, api));
                        } else {
                            wearApiCall2.onUpdate(deviceInfo);
                            getUnauthApiCalls().remove(deviceInfo.getAddress());
                            this.wearApiCalls.put(did, wearApiCall2);
                        }
                    } else if (Intrinsics.areEqual(wearApiCall.getDeviceInfo(), deviceInfo)) {
                        CoreExtKt.getLogger().i(TAG, "noting to change");
                    } else {
                        wearApiCall.onUpdate(deviceInfo);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public int call(int type, @NotNull String did, @NotNull byte[] data, boolean needResponse, @NotNull ICallback callback, int timeout) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i(TAG, "call() called with: type = " + type + ", did = " + did + ", data = " + data + ", needResponse = " + needResponse + ", callback = " + callback + ", timeout = " + timeout);
        WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
        if (wearApiCall != null) {
            return wearApiCall.call(type, data, needResponse, callback, timeout);
        }
        callback.onCallback(new WearApiResult(-2));
        return 0;
    }

    @Override // com.xiaomi.wearable.core.e
    public boolean cancel(@NotNull String did, int callId) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearApiCall<?> apiCall = getApiCall(did);
        if (apiCall == null) {
            return false;
        }
        apiCall.cancel(callId);
        return true;
    }

    public final void clear() {
        CoreExtKt.getLogger().i(TAG, "clear() called");
        Iterator<Map.Entry<String, WearApiCall<?>>> it = this.wearApiCalls.entrySet().iterator();
        while (it.hasNext()) {
            removeDeviceInfo(it.next().getKey());
        }
        this.wearApiCalls.clear();
        for (Map.Entry<String, WearApiCall<?>> entry : getUnauthApiCalls().entrySet()) {
            entry.getValue().closeUnauthConnection(entry.getKey());
        }
        getUnauthApiCalls().clear();
        this.currentApiCall = null;
    }

    @Override // com.xiaomi.wearable.core.e
    public void closeMassChannel(int massId) {
        RunningMassManager.INSTANCE.cancelMassTask(massId);
    }

    @Override // com.xiaomi.wearable.core.e
    public void closeUnauthConnection(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (!PermissionChecker.INSTANCE.checkCallPermission()) {
            CoreExtKt.getLogger().i(TAG, "closeUnauthConnection() error permission");
            return;
        }
        CoreExtKt.getLogger().i(TAG, "closeUnauthConnection() called with: address = " + address + ", " + getUnauthApiCalls().get(address));
        WearApiCall<?> wearApiCallRemove = getUnauthApiCalls().remove(address);
        if (wearApiCallRemove != null && !this.wearApiCalls.contains(wearApiCallRemove)) {
            wearApiCallRemove.closeUnauthConnection(address);
        }
        this.inBindingMode = false;
    }

    @Override // com.xiaomi.wearable.core.e
    public void connect(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (PermissionChecker.INSTANCE.checkCallPermission()) {
            ConnectSource.INSTANCE.setFromMainProcess(true);
        }
        synchronized (this.lock) {
            WearApiCall<?> apiCall = getApiCall(did);
            if (apiCall != null) {
                apiCall.connect();
                Unit unit = Unit.INSTANCE;
            }
        }
        if (CoreExtKt.getInLyra()) {
            DeviceInfoManager.INSTANCE.setDisconnectDevice(did, false);
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void disconnect(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        synchronized (this.lock) {
            WearApiCall<?> apiCall = getApiCall(did);
            if (apiCall != null) {
                apiCall.disconnect();
                Unit unit = Unit.INSTANCE;
            }
        }
        if (CoreExtKt.getInLyra()) {
            DeviceInfoManager.INSTANCE.setDisconnectDevice(did, true);
        }
    }

    @Override // com.xiaomi.wearable.core.e
    @Nullable
    public DeviceInfo getCurrentDevice() {
        CoreExtKt.getLogger().i(TAG, "getCurrentDevice() called");
        WearApiCall<?> wearApiCall = this.currentApiCall;
        if (wearApiCall != null) {
            return wearApiCall.getDeviceInfo();
        }
        return null;
    }

    @Override // com.xiaomi.wearable.core.e
    public int getDeviceCapabilities(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "getDeviceCapabilities() called with: did = " + did);
        synchronized (this.lock) {
            WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
            if (wearApiCall == null) {
                return 0;
            }
            return wearApiCall.getDeviceCapability();
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public int getDeviceCapabilitiesV2(@Nullable String did) {
        CoreExtKt.getLogger().i(TAG, "getDeviceCapabilitiesV2() called with: did = " + did);
        synchronized (this.lock) {
            WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
            if (wearApiCall == null) {
                return 0;
            }
            return wearApiCall.getDeviceCapabilityV2();
        }
    }

    public final boolean getInBindingMode() {
        return this.inBindingMode;
    }

    @Override // com.xiaomi.wearable.core.e
    public boolean isIdle(@Nullable String did) {
        boolean zIsIDLE;
        CoreExtKt.getLogger().i(TAG, "isIdle() called with: did = " + did + ", " + this.wearApiCalls.get(did));
        synchronized (this.lock) {
            WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
            zIsIDLE = wearApiCall != null ? wearApiCall.isIDLE() : false;
        }
        return zIsIDLE;
    }

    public final void onClientDied(@Nullable d callback) {
        CoreExtKt.getLogger().i(TAG, "onClientDied() called with: callback = " + callback + ", inBindingMode = " + this.inBindingMode);
        RunningMassManager.INSTANCE.clearRunningMassTask();
        if (this.inBindingMode) {
            for (Map.Entry<String, WearApiCall<?>> entry : getUnauthApiCalls().entrySet()) {
                CoreExtKt.getLogger().i(TAG, "onClientDied() close unauthApiCall. contains in bound device " + this.wearApiCalls.containsValue(entry.getValue()));
                if (!this.wearApiCalls.containsValue(entry.getValue())) {
                    entry.getValue().closeUnauthConnection(entry.getKey());
                }
            }
        }
        this.inBindingMode = false;
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectFailure(@Nullable final String did, final int errorCode, final int retryTimes) {
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: euc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.onConnectFailure$lambda$26(this.f17074a, did, errorCode, retryTimes);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectStart(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onConnectStart() called with: did = " + did);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: juc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.onConnectStart$lambda$22(this.f23137a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectSuccess(@Nullable final String did) {
        CoreExtKt.getLogger().i(TAG, "onConnectSuccess() called with: did = " + did);
        if (!CoreExtKt.getInLyra() || PrivacyChecker.INSTANCE.checkPrivacy()) {
            com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: guc
                @Override // java.lang.Runnable
                public final void run() {
                    IMiWearCoreImpl.onConnectSuccess$lambda$24(this.f19334a, did);
                }
            });
        } else {
            clear();
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onDeviceFound(@Nullable final String did) {
        CoreExtKt.getLogger().i(TAG, "onDeviceFound() called with: did = " + did + ", size = " + getRegisteredCallbackCount());
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: muc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.onDeviceFound$lambda$30(this.f27215a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onDeviceLost(@Nullable final String did) {
        CoreExtKt.getLogger().i(TAG, "onDeviceLost() called with: did = " + did);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: iuc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.onDeviceLost$lambda$32(this.f22097a, did);
            }
        });
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onDisconnect(@Nullable final String did) {
        CoreExtKt.getLogger().i(TAG, "onDisconnect() called with: did = " + did);
        com.xiaomi.wearable.CoreExtKt.getWorkerHandler().post(new Runnable() { // from class: luc
            @Override // java.lang.Runnable
            public final void run() {
                IMiWearCoreImpl.onDisconnect$lambda$28(this.f25438a, did);
            }
        });
        DeviceInfo currentDevice = getCurrentDevice();
        if (Intrinsics.areEqual(did, currentDevice != null ? currentDevice.getDid() : null)) {
            RunningMassManager.INSTANCE.clearRunningMassTask();
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public int openMassChannel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        synchronized (this.lock) {
            try {
                WearApiCall<?> apiCall = getApiCall(did);
                int iOpenMassChannel = apiCall != null ? apiCall.openMassChannel() : -1;
                if (apiCall != null && iOpenMassChannel != -1) {
                    if (RunningMassManager.INSTANCE.openMassTask(apiCall, iOpenMassChannel)) {
                        return iOpenMassChannel;
                    }
                    return -1;
                }
                CoreExtKt.getLogger().i(TAG, "openMassChannel error");
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void openUnauthConnection(@NotNull String deviceInfo, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!PermissionChecker.INSTANCE.checkCallPermission()) {
            CoreExtKt.getLogger().i(TAG, "openUnauthConnection() error permission");
            return;
        }
        DeviceInfo deviceInfoConvertToDevice = convertToDevice(deviceInfo);
        if (deviceInfoConvertToDevice == null) {
            CoreExtKt.getLogger().i(TAG, "openUnauthConnection convertToDevice but device is null");
            throw new IllegalArgumentException("illegal device");
        }
        WearApiCall<?> wearApiCallFindBondedWearApiCall = findBondedWearApiCall(deviceInfoConvertToDevice.getAddress());
        CoreExtKt.getLogger().i(TAG, "openUnauthConnection() is bonded " + wearApiCallFindBondedWearApiCall + ", contains in binding map " + getUnauthApiCalls().get(deviceInfoConvertToDevice.getAddress()));
        if (wearApiCallFindBondedWearApiCall == null) {
            wearApiCallFindBondedWearApiCall = ApiCallFactory.createApiCall(deviceInfoConvertToDevice);
        }
        getUnauthApiCalls().put(deviceInfoConvertToDevice.getAddress(), wearApiCallFindBondedWearApiCall);
        wearApiCallFindBondedWearApiCall.openUnauthConnection(callback);
        this.inBindingMode = true;
    }

    public final void registerDeviceChangeListener(@NotNull OnDeviceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDeviceChangeListeners.add(listener);
    }

    @Override // com.xiaomi.wearable.core.e
    public void removeAllDeviceInfo() {
        CoreExtKt.getLogger().i(TAG, "removeAllDeviceInfo() called");
        clear();
    }

    @Override // com.xiaomi.wearable.core.e
    public void removeDeviceDataHandler(@NotNull String did, int type, @NotNull c handler) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(handler, "handler");
        CoreExtKt.getLogger().i(TAG, "removeDeviceDataHandler() called with: did = " + did + ", type = " + type + ", handler = " + handler);
        synchronized (this.lock) {
            WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
            if (wearApiCall != null) {
                wearApiCall.removeDeviceDataHandler(type, handler);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void removeDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "removeDeviceInfo() called with: did = " + did + ", contains " + this.wearApiCalls.contains(did));
        synchronized (this.lock) {
            try {
                WearApiCall<?> wearApiCallRemove = this.wearApiCalls.remove(did);
                if (wearApiCallRemove != null) {
                    wearApiCallRemove.destroy();
                }
                if (Intrinsics.areEqual(this.currentApiCall, wearApiCallRemove)) {
                    this.currentApiCall = null;
                }
                DeviceInfoManager.INSTANCE.removeDeviceInfo(did);
                notifyDeviceChange(did, 1);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void removeDeviceStateListener(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CoreExtKt.getLogger().i(TAG, "removeDeviceStateListener() called with: listener = " + listener);
        unregister(listener);
    }

    @Override // com.xiaomi.wearable.core.e
    public void sendMassData(int massId, @NotNull byte[] data, @NotNull ICallback callback, int timeout) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RunningMassManager.INSTANCE.sendMassData(massId, data, callback, timeout);
    }

    @Override // com.xiaomi.wearable.core.client.ThirdPartySupport
    public void sendThirdFile(@NotNull String did, int type, int detailType, @NotNull String path, @NotNull s5f callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearApiCall<?> apiCall = getApiCall(did);
        if (apiCall == null) {
            CoreExtKt.getLogger().i(TAG, "get api call error");
            callback.onFail(8, "no api call");
        } else if (apiCall instanceof ThirdPartyApiCall) {
            ((ThirdPartyApiCall) apiCall).sendFile(type, detailType, path, callback);
        } else {
            CoreExtKt.getLogger().i(TAG, "not third party api call error");
            callback.onFail(8, "not third party api call");
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void setAppCapabilities(int appCapability) {
        CoreExtKt.getLogger().i(TAG, "setAppCapabilities() called with: appCapability = " + appCapability);
        if (PermissionChecker.INSTANCE.checkCallPermission()) {
            CapabilityManager.INSTANCE.setAppCapabilities(appCapability);
        } else {
            CoreExtKt.getLogger().i(TAG, "setAppCapabilities() error permission");
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void setChannel(@Nullable String channel) {
        CoreExtKt.getLogger().i(TAG, "setChannel() called with: channel = " + channel);
        CoreExtKt.setChannel(channel);
        BluetoothManager.INSTANCE.get().setChannel(channel);
    }

    @Override // com.xiaomi.wearable.core.e
    public void setCurrentDevice(@NotNull String did, boolean currentDevice) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "setCurrentDevice() called with: did = " + did + ", currentDevice = " + currentDevice);
        if (PermissionChecker.INSTANCE.checkCallPermission()) {
            setCurrentDeviceInner(did, currentDevice);
        } else {
            CoreExtKt.getLogger().i(TAG, "setCurrentDevice() error permission");
        }
    }

    public final void setInBindingMode(boolean z) {
        this.inBindingMode = z;
    }

    @Override // com.xiaomi.wearable.core.e
    public void setWearMode(@Nullable String did, int mode) {
        Logger logger = CoreExtKt.getLogger();
        WearMode.Companion companion = WearMode.INSTANCE;
        logger.i(TAG, "setWearMode() called with: did = " + did + ", mode = " + companion.print(mode));
        synchronized (this.lock) {
            try {
                WearApiCall<?> wearApiCall = this.wearApiCalls.get(did);
                if (wearApiCall == null || wearApiCall.wearMode != mode) {
                    if (mode != 0) {
                        if (mode == 1 || mode == 2) {
                            onDeviceLost(did);
                        } else {
                            CoreExtKt.getLogger().i(TAG, "setWearMode() called error wear mode ");
                        }
                    } else if (wearApiCall != null && wearApiCall.isAuthConnected()) {
                        onDeviceFound(did);
                    }
                    if (wearApiCall != null) {
                        wearApiCall.setWearMode(mode);
                    }
                } else {
                    CoreExtKt.getLogger().i(TAG, "setWearMode() same status return mode = " + companion.print(mode));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.wearable.core.e
    public void unauthCall(@Nullable String address, @Nullable byte[] data, boolean needResponse, @Nullable ICallback callback, int timeout) {
        if (!PermissionChecker.INSTANCE.checkCallPermission()) {
            CoreExtKt.getLogger().i(TAG, "unauthCall() error permission");
            return;
        }
        CoreExtKt.getLogger().i(TAG, "unauthCall() called with: address = " + address + ", " + getUnauthApiCalls().get(address));
        WearApiCall<?> wearApiCall = getUnauthApiCalls().get(address);
        if (wearApiCall != null) {
            wearApiCall.unauthCall(address, data, needResponse, callback, timeout);
        }
    }
}
