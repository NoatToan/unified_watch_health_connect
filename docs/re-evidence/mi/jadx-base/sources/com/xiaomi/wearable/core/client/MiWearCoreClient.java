package com.xiaomi.wearable.core.client;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.ArrayMap;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.miot.core.bluetooth.TransferLogger;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.WearMode;
import com.xiaomi.wearable.connection.IDeviceStateListener;
import com.xiaomi.wearable.core.AccountReceiver;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfoExtKt;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.IReporter;
import com.xiaomi.wearable.core.PackageReceiver;
import com.xiaomi.wearable.core.a;
import com.xiaomi.wearable.core.client.MiWearCoreClient;
import com.xiaomi.wearable.core.e;
import com.xiaomi.wearable.core.server.IMiWearCoreImpl;
import com.xiaomi.wearable.core.server.OnDeviceChangeListener;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import defpackage.s5f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0085\u0001\u0084\u0001B\n\b\u0000¢\u0006\u0005\b\u0083\u0001\u0010\u0015J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J7\u00108\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u001c2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\u0015J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010@JC\u0010F\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010C\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ'\u0010M\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ'\u0010O\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010NJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bR\u0010<J/\u0010T\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u00112\u0006\u0010B\u001a\u00020A2\u0006\u00107\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u0011H\u0016¢\u0006\u0004\bV\u0010@J\u0017\u0010W\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bW\u0010\u001fJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bX\u0010\u001fJ\u0017\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b]\u0010\\J\u001f\u0010_\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`J7\u0010b\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\f2\u0006\u00107\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u001cH\u0016¢\u0006\u0004\bd\u0010\u001fJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u001cH\u0016¢\u0006\u0004\bf\u0010\u001fJ\u0017\u0010h\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\fH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bj\u0010\u001fJ\u0017\u0010k\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bk\u0010\u001fR\u0018\u0010l\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020Y0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R!\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020~0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0005\u0012\u00030\u0081\u00010n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010q¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/wearable/core/client/MiWearCoreClient;", "Lcom/xiaomi/wearable/core/client/IMiWearCoreClient;", "Lcom/xiaomi/wearable/core/PackageReceiver$PackageChangeReceiver;", "Lcom/xiaomi/wearable/core/AccountReceiver$AccountChangeReceiver;", "Lcom/xiaomi/wearable/core/server/OnDeviceChangeListener;", "Landroid/content/Context;", "context", "", "initBluetoothManager", "(Landroid/content/Context;)V", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "serviceStateListener", "", "bindService", "(Lcom/xiaomi/wearable/core/client/ServiceStateListener;)Z", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "", "getDeviceLyraType", "(Lcom/xiaomi/wearable/core/DeviceInfo;)I", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/wearable/core/client/Logger;", "logger", "Lcom/xiaomi/wearable/core/IReporter;", "reporter", "init", "(Landroid/content/Context;Lcom/xiaomi/wearable/core/client/Logger;Lcom/xiaomi/wearable/core/IReporter;Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "", "channel", "setChannel", "(Ljava/lang/String;)V", "addServiceStateListener", "(Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "removeServiceStateListener", "did", "currentDevice", "setCurrentDevice", "(Ljava/lang/String;Z)V", "mode", "setWearMode", "(Ljava/lang/String;I)V", "Lcom/xiaomi/wearable/core/client/DeviceInfo;", "getCurrentDevice", "()Lcom/xiaomi/wearable/core/client/DeviceInfo;", "addDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "api", "addThirdDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "type", "detailType", "path", "Ls5f;", "callback", "sendThirdFile", "(Ljava/lang/String;IILjava/lang/String;Ls5f;)V", "removeDeviceInfo", "getDeviceCapabilities", "(Ljava/lang/String;)I", "getDeviceCapabilitiesV2", "appCapability", "setAppCapabilities", "(I)V", "", "data", "needResponse", "Lcom/xiaomi/wearable/core/ICallback;", "timeout", "call", "(ILjava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)I", "callId", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Ljava/lang/String;I)Z", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "handler", "addDeviceDataHandler", "(Ljava/lang/String;ILcom/xiaomi/wearable/core/client/IDataHandler;)V", "removeDeviceDataHandler", "isIdle", "(Ljava/lang/String;)Z", "openMassChannel", "massId", "sendMassData", "(I[BLcom/xiaomi/wearable/core/ICallback;I)V", "closeMassChannel", "connect", "disconnect", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStateListener", "(Lcom/xiaomi/wearable/connection/IDeviceStateListener;)V", "removeDeviceStateListener", "Lcom/xiaomi/wearable/core/a;", "openUnauthConnection", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/core/a;)V", Home.JSON_KEY_ADDRESS, "unauthCall", "(Ljava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)V", "closeUnauthConnection", "action", "onPackageChange", "login", "onAccountChanged", "(Z)V", "onCurrentDeviceChanged", "onDeviceRemove", "currentDeviceID", "Ljava/lang/String;", "Landroid/util/ArrayMap;", "Lcom/xiaomi/wearable/core/e;", "coreServiceMap", "Landroid/util/ArrayMap;", "Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl;", "clientCoreService", "Lcom/xiaomi/wearable/core/server/IMiWearCoreImpl;", "remoteCoreService", "Lcom/xiaomi/wearable/core/e;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "deviceStateListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/wearable/core/client/DeviceStateAdapter;", "deviceStateAdapter", "Lcom/xiaomi/wearable/core/client/DeviceStateAdapter;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/wearable/core/client/DataHandlerAdapter;", "dataHandlers", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/wearable/core/client/MiWearCoreClient$MassChannelService;", "massChannels", "<init>", "Companion", "MassChannelService", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiWearCoreClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiWearCoreClient.kt\ncom/xiaomi/wearable/core/client/MiWearCoreClient\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,649:1\n216#2,2:650\n*S KotlinDebug\n*F\n+ 1 MiWearCoreClient.kt\ncom/xiaomi/wearable/core/client/MiWearCoreClient\n*L\n509#1:650,2\n*E\n"})
public final class MiWearCoreClient implements IMiWearCoreClient, PackageReceiver.PackageChangeReceiver, AccountReceiver.AccountChangeReceiver, OnDeviceChangeListener {

    @NotNull
    private static final String TAG = "MiWearCoreClient";
    private IMiWearCoreImpl clientCoreService;

    @NotNull
    private final ArrayMap<String, e> coreServiceMap = new ArrayMap<>();

    @Nullable
    private volatile String currentDeviceID;

    @NotNull
    private final ConcurrentHashMap<String, DataHandlerAdapter> dataHandlers;

    @NotNull
    private final DeviceStateAdapter deviceStateAdapter;

    @NotNull
    private final CopyOnWriteArrayList<IDeviceStateListener> deviceStateListeners;

    @NotNull
    private final ArrayMap<Integer, MassChannelService> massChannels;

    @Nullable
    private e remoteCoreService;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/core/client/MiWearCoreClient$MassChannelService;", "", "", "component1", "()Ljava/lang/String;", "Lcom/xiaomi/wearable/core/e;", "component2", "()Lcom/xiaomi/wearable/core/e;", "did", "miWearCore", "copy", "(Ljava/lang/String;Lcom/xiaomi/wearable/core/e;)Lcom/xiaomi/wearable/core/client/MiWearCoreClient$MassChannelService;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDid", "Lcom/xiaomi/wearable/core/e;", "getMiWearCore", "<init>", "(Ljava/lang/String;Lcom/xiaomi/wearable/core/e;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class MassChannelService {

        @NotNull
        private final String did;

        @NotNull
        private final e miWearCore;

        public MassChannelService(@NotNull String did, @NotNull e miWearCore) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(miWearCore, "miWearCore");
            this.did = did;
            this.miWearCore = miWearCore;
        }

        public static /* synthetic */ MassChannelService copy$default(MassChannelService massChannelService, String str, e eVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = massChannelService.did;
            }
            if ((i & 2) != 0) {
                eVar = massChannelService.miWearCore;
            }
            return massChannelService.copy(str, eVar);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDid() {
            return this.did;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final e getMiWearCore() {
            return this.miWearCore;
        }

        @NotNull
        public final MassChannelService copy(@NotNull String did, @NotNull e miWearCore) {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(miWearCore, "miWearCore");
            return new MassChannelService(did, miWearCore);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MassChannelService)) {
                return false;
            }
            MassChannelService massChannelService = (MassChannelService) other;
            return Intrinsics.areEqual(this.did, massChannelService.did) && Intrinsics.areEqual(this.miWearCore, massChannelService.miWearCore);
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @NotNull
        public final e getMiWearCore() {
            return this.miWearCore;
        }

        public int hashCode() {
            return (this.did.hashCode() * 31) + this.miWearCore.hashCode();
        }

        @NotNull
        public String toString() {
            return "MassChannelService(did=" + this.did + ", miWearCore=" + this.miWearCore + ")";
        }
    }

    public MiWearCoreClient() {
        CopyOnWriteArrayList<IDeviceStateListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.deviceStateListeners = copyOnWriteArrayList;
        this.deviceStateAdapter = new DeviceStateAdapter(copyOnWriteArrayList);
        this.dataHandlers = new ConcurrentHashMap<>();
        this.massChannels = new ArrayMap<>();
    }

    private final boolean bindService(final ServiceStateListener serviceStateListener) {
        CoreExtKt.getLogger().i(TAG, "bindService() called ");
        return LyraService.INSTANCE.bindService(1, new ServiceStateListener() { // from class: com.xiaomi.wearable.core.client.MiWearCoreClient.bindService.1
            @Override // com.xiaomi.wearable.core.client.ServiceStateListener
            public void onCoreServiceState(int state) throws RemoteException {
                CoreExtKt.getLogger().i(MiWearCoreClient.TAG, "onServiceState() called with: state " + state);
                if (state == 1) {
                    CoreExtKt.setLyraConnection(true);
                    MiWearCoreClient.this.remoteCoreService = LyraService.INSTANCE.getMiWearCore();
                    e eVar = MiWearCoreClient.this.remoteCoreService;
                    if (eVar != null) {
                        eVar.addDeviceStateListener(MiWearCoreClient.this.deviceStateAdapter);
                    }
                } else if (state == 2) {
                    MiWearCoreClient.this.remoteCoreService = null;
                    MiWearCoreClient.this.dataHandlers.clear();
                    MiWearCoreClient.this.deviceStateAdapter.onServiceDisconnected();
                    CoreExtKt.removeRemote(MiWearCoreClient.this.coreServiceMap);
                } else if (state == 3) {
                    CoreExtKt.setLyraConnection(false);
                    MiWearCoreClient.this.remoteCoreService = null;
                    MiWearCoreClient.this.dataHandlers.clear();
                    MiWearCoreClient.this.deviceStateAdapter.onServiceDisconnected();
                    CoreExtKt.removeRemote(MiWearCoreClient.this.coreServiceMap);
                } else if (state == 4) {
                    MiWearCoreClient miWearCoreClient = MiWearCoreClient.this;
                    LyraService lyraService = LyraService.INSTANCE;
                    miWearCoreClient.remoteCoreService = lyraService.getMiWearCore();
                    e eVar2 = MiWearCoreClient.this.remoteCoreService;
                    if (eVar2 != null) {
                        eVar2.removeAllDeviceInfo();
                    }
                    lyraService.unbindCoreService();
                    MiWearCoreClient.this.remoteCoreService = null;
                }
                serviceStateListener.onCoreServiceState(state);
            }
        });
    }

    private final void clear() {
        CoreExtKt.getLogger().i(TAG, "clear() called currentDevice: " + this.currentDeviceID);
        IMiWearCoreImpl iMiWearCoreImpl = null;
        this.currentDeviceID = null;
        this.dataHandlers.clear();
        if (!CoreExtKt.getInLyra()) {
            this.deviceStateListeners.clear();
        }
        IMiWearCoreImpl iMiWearCoreImpl2 = this.clientCoreService;
        if (iMiWearCoreImpl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
        } else {
            iMiWearCoreImpl = iMiWearCoreImpl2;
        }
        iMiWearCoreImpl.clear();
        this.coreServiceMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnect$lambda$3(MiWearCoreClient this$0, String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        e eVar = this$0.coreServiceMap.get(did);
        if (eVar != null) {
            eVar.disconnect(did);
        }
    }

    private final int getDeviceLyraType(com.xiaomi.wearable.core.DeviceInfo deviceInfo) {
        int type = deviceInfo.getType();
        if (type == 2) {
            return 2;
        }
        if (type == 3) {
            return 1;
        }
        if (type != 6) {
            return type != 7 ? -1 : 3;
        }
        return 4;
    }

    private final void initBluetoothManager(Context context) {
        BluetoothManager.INSTANCE.get().init(context, new TransferLogger() { // from class: com.xiaomi.wearable.core.client.MiWearCoreClient.initBluetoothManager.1
            @Override // com.xiaomi.miot.core.bluetooth.TransferLogger
            public void d(String tag, String msg, Object... args) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(args, "args");
                CoreExtKt.getLogger().d(tag, msg);
            }

            @Override // com.xiaomi.miot.core.bluetooth.TransferLogger
            public void e(String tag, String msg, Object... args) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(args, "args");
                CoreExtKt.getLogger().e(tag, msg);
            }

            @Override // com.xiaomi.miot.core.bluetooth.TransferLogger
            public void i(String tag, String msg, Object... args) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(args, "args");
                CoreExtKt.getLogger().i(tag, msg);
            }

            @Override // com.xiaomi.miot.core.bluetooth.TransferLogger
            public void w(String tag, String msg, Object... args) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(args, "args");
                CoreExtKt.getLogger().w(tag, msg);
            }

            @Override // com.xiaomi.miot.core.bluetooth.TransferLogger
            public void i(String tag, String msg) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(msg, "msg");
                CoreExtKt.getLogger().i(tag, msg);
            }
        });
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void addDeviceDataHandler(@NotNull String did, int type, @NotNull IDataHandler handler) throws RemoteException {
        e eVar;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(handler, "handler");
        CoreExtKt.getLogger().i(TAG, "addDeviceDataHandler() called with: handler = " + handler + ", list = " + this.dataHandlers.get(did));
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(did);
        }
        if (eVar == null) {
            CoreExtKt.getLogger().i(TAG, "addDeviceDataHandler() core service null");
            return;
        }
        DataHandlerAdapter dataHandlerAdapter = this.dataHandlers.get(did);
        if (dataHandlerAdapter == null) {
            dataHandlerAdapter = new DataHandlerAdapter(did, type);
            eVar.addDeviceDataHandler(did, type, dataHandlerAdapter);
            this.dataHandlers.put(did, dataHandlerAdapter);
        }
        if (dataHandlerAdapter.contains(handler)) {
            return;
        }
        dataHandlerAdapter.add(handler);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[PHI: r0
      0x0048: PHI (r0v5 com.xiaomi.wearable.core.server.IMiWearCoreImpl) = (r0v4 com.xiaomi.wearable.core.server.IMiWearCoreImpl), (r0v12 com.xiaomi.wearable.core.server.IMiWearCoreImpl) binds: [B:18:0x0056, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void addDeviceInfo(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo) throws RemoteException {
        IMiWearCoreImpl iMiWearCoreImpl;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        CoreExtKt.getLogger().i(TAG, "addDeviceInfo() called with: deviceInfo = " + deviceInfo.getAddress());
        if (CoreExtKt.getInLyra()) {
            return;
        }
        e eVar = null;
        if (!CoreExtKt.getLyraConnection()) {
            iMiWearCoreImpl = this.clientCoreService;
            if (iMiWearCoreImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            } else {
                eVar = iMiWearCoreImpl;
            }
        } else if (this.remoteCoreService == null) {
            CoreExtKt.getLogger().e(TAG, "getCoreService called coreRemote is null ");
        } else if (deviceInfo.isWearableDevice()) {
            eVar = this.remoteCoreService;
        } else {
            iMiWearCoreImpl = this.clientCoreService;
            if (iMiWearCoreImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            } else {
                eVar = iMiWearCoreImpl;
            }
        }
        if (eVar != null) {
            CoreExtKt.getLogger().i(TAG, "addDeviceInfo() called " + eVar + " " + this.remoteCoreService);
            eVar.addDeviceInfo(DeviceInfoExtKt.convertToJson(deviceInfo));
            this.coreServiceMap.put(deviceInfo.getDid(), eVar);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void addDeviceStateListener(@NotNull IDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CoreExtKt.getLogger().i(TAG, "addDeviceStateListener() called with: listener = " + listener);
        this.deviceStateListeners.add(listener);
        if (CoreExtKt.getInLyra() && this.deviceStateAdapter.getConnected()) {
            listener.onDeviceFound(this.deviceStateAdapter.getDid());
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void addServiceStateListener(@NotNull ServiceStateListener serviceStateListener) {
        Intrinsics.checkNotNullParameter(serviceStateListener, "serviceStateListener");
        CoreExtKt.getLogger().i(TAG, "addServiceStateListener() called with: serviceStateListener = " + serviceStateListener);
        LyraService.INSTANCE.addServiceConnectionListener(serviceStateListener);
    }

    @Override // com.xiaomi.wearable.core.client.ThirdPartySupport
    public void addThirdDeviceInfo(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo, @Nullable IDeviceApiCall api) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        IMiWearCoreImpl iMiWearCoreImpl = this.clientCoreService;
        IMiWearCoreImpl iMiWearCoreImpl2 = null;
        if (iMiWearCoreImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            iMiWearCoreImpl = null;
        }
        iMiWearCoreImpl.addThirdDeviceInfo(deviceInfo, api);
        ArrayMap<String, e> arrayMap = this.coreServiceMap;
        String did = deviceInfo.getDid();
        IMiWearCoreImpl iMiWearCoreImpl3 = this.clientCoreService;
        if (iMiWearCoreImpl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
        } else {
            iMiWearCoreImpl2 = iMiWearCoreImpl3;
        }
        arrayMap.put(did, iMiWearCoreImpl2);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public int call(int type, @NotNull String did, @Nullable byte[] data, boolean needResponse, @Nullable ICallback callback, int timeout) {
        e eVar;
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "call() called with: type = " + type + ", did = " + did + ", data = " + data + ", callback = " + callback + ", timeout = " + timeout + ", service = " + this.coreServiceMap.get(did));
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(did);
        }
        e eVar2 = eVar;
        if (eVar2 == null) {
            return -1;
        }
        if (!eVar2.asBinder().isBinderAlive()) {
            CoreExtKt.getLogger().e(TAG, "call() called binder died");
            return -1;
        }
        try {
            return eVar2.call(type, did, data, false, callback, timeout);
        } catch (DeadObjectException unused) {
            CoreExtKt.getLogger().e(TAG, "call() binder died ");
            return -1;
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public boolean cancel(@NotNull String did, int callId) {
        e eVar;
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "cancel() called with: did = " + did + ", callId = " + callId);
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(did);
        }
        if (eVar != null) {
            return eVar.cancel(did, callId);
        }
        return false;
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void closeMassChannel(int massId) throws RemoteException {
        CoreExtKt.getLogger().i(TAG, "closeMassChannel() called with: massId = " + massId);
        MassChannelService massChannelService = this.massChannels.get(Integer.valueOf(massId));
        if (massChannelService != null) {
            massChannelService.getMiWearCore().closeMassChannel(massId);
            try {
                this.massChannels.remove(Integer.valueOf(massId));
                return;
            } catch (Exception e) {
                CoreExtKt.getLogger().e(TAG, "closeMassChannel error", e);
                return;
            }
        }
        CoreExtKt.getLogger().i(TAG, "closeMassChannel() called with massId = " + massId + ", core service null");
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void closeUnauthConnection(@NotNull String address) throws RemoteException {
        Intrinsics.checkNotNullParameter(address, "address");
        e eVarRemove = this.coreServiceMap.remove(address);
        CoreExtKt.getLogger().i(TAG, "closeUnauthConnection() called with: address = " + address + ", api" + eVarRemove);
        if (eVarRemove != null) {
            eVarRemove.closeUnauthConnection(address);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void connect(@NotNull String did) throws RemoteException {
        e eVar;
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "connect() called with: did = " + did + ", coreService = " + this.coreServiceMap.get(did));
        if (CoreExtKt.getInLyra() || (eVar = this.coreServiceMap.get(did)) == null) {
            return;
        }
        eVar.connect(did);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void disconnect(@NotNull final String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "disconnect() called with: did = " + did);
        if (CoreExtKt.getInLyra()) {
            return;
        }
        if (!CoreExtKt.getLyraConnection()) {
            e eVar = this.coreServiceMap.get(did);
            if (eVar != null) {
                eVar.disconnect(did);
                return;
            }
            return;
        }
        if (CoreExtKt.isFixedDeadlock() || this.massChannels.isEmpty()) {
            e eVar2 = this.coreServiceMap.get(did);
            if (eVar2 != null) {
                eVar2.disconnect(did);
                return;
            }
            return;
        }
        CoreExtKt.getLogger().i(TAG, "disconnect() called " + this.massChannels);
        boolean z = false;
        for (Map.Entry<Integer, MassChannelService> entry : this.massChannels.entrySet()) {
            if (Intrinsics.areEqual(did, entry.getValue().getDid())) {
                e eVar3 = this.coreServiceMap.get(did);
                if (eVar3 != null) {
                    Integer key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                    eVar3.closeMassChannel(key.intValue());
                }
                z = true;
            }
        }
        if (z) {
            com.xiaomi.wearable.CoreExtKt.getHandler().postDelayed(new Runnable() { // from class: vwf
                @Override // java.lang.Runnable
                public final void run() throws RemoteException {
                    MiWearCoreClient.disconnect$lambda$3(this.f37306a, did);
                }
            }, 15000L);
        } else {
            CoreExtKt.getLogger().e(TAG, "not disconnect");
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    @Nullable
    public DeviceInfo getCurrentDevice() throws RemoteException {
        e eVar;
        CoreExtKt.getLogger().i(TAG, "getCurrentDevice() called");
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(this.currentDeviceID);
        }
        if (eVar == null) {
            CoreExtKt.getLogger().i(TAG, "getCurrentDevice() coreService is null");
            return null;
        }
        com.xiaomi.wearable.core.DeviceInfo currentDevice = eVar.getCurrentDevice();
        if (currentDevice == null) {
            return null;
        }
        String deviceName = currentDevice.getDeviceName();
        String str = deviceName == null ? "" : deviceName;
        int deviceLyraType = getDeviceLyraType(currentDevice);
        String str2 = currentDevice.isBLE() ? ProductList.ProductInfo.BLE_TYPE : Country.BR;
        String model = currentDevice.getModel();
        String str3 = model == null ? "" : model;
        String did = currentDevice.getDid();
        return new DeviceInfo(str, str3, deviceLyraType, str2, did == null ? "" : did);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public int getDeviceCapabilities(@NotNull String did) {
        e eVar;
        int deviceCapabilities;
        Intrinsics.checkNotNullParameter(did, "did");
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(did);
        }
        if (eVar != null) {
            try {
                deviceCapabilities = eVar.getDeviceCapabilities(did);
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            deviceCapabilities = 0;
        }
        CoreExtKt.getLogger().i(TAG, "getDeviceCapabilities() called with: did = " + did + " " + deviceCapabilities);
        return deviceCapabilities;
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public int getDeviceCapabilitiesV2(@NotNull String did) {
        e eVar;
        int deviceCapabilitiesV2;
        Intrinsics.checkNotNullParameter(did, "did");
        if (CoreExtKt.getInLyra()) {
            eVar = this.clientCoreService;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                eVar = null;
            }
        } else {
            eVar = this.coreServiceMap.get(did);
        }
        if (eVar != null) {
            try {
                deviceCapabilitiesV2 = eVar.getDeviceCapabilitiesV2(did);
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            deviceCapabilitiesV2 = 0;
        }
        CoreExtKt.getLogger().i(TAG, "getDeviceCapabilitiesV2() called with: did = " + did + " " + deviceCapabilitiesV2);
        return deviceCapabilitiesV2;
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void init(@NotNull Context context, @NotNull Logger logger, @NotNull IReporter reporter, @NotNull ServiceStateListener serviceStateListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(serviceStateListener, "serviceStateListener");
        com.xiaomi.wearable.CoreExtKt.setContext(context);
        CoreExtKt.setLogger(logger);
        CoreExtKt.setServiceStateListener(serviceStateListener);
        CoreExtKt.setReporter(reporter);
        initBluetoothManager(context);
        logger.i(TAG, "init() called with: context = " + context + ", logger = " + logger + ", reporter = " + reporter + ", serviceStateListener = " + serviceStateListener);
        IMiWearCoreImpl companion = IMiWearCoreImpl.INSTANCE.getInstance();
        this.clientCoreService = companion;
        IMiWearCoreImpl iMiWearCoreImpl = null;
        if (companion == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            companion = null;
        }
        companion.addDeviceStateListener(this.deviceStateAdapter);
        if (CoreExtKt.getInLyra()) {
            PackageReceiver packageReceiver = PackageReceiver.INSTANCE;
            packageReceiver.registerPackageReceiver();
            packageReceiver.addPackageChangeReceiver(this);
            AccountReceiver accountReceiver = AccountReceiver.INSTANCE;
            accountReceiver.register();
            accountReceiver.addAccountReceiver(this);
            serviceStateListener.onCoreServiceState(1);
            IMiWearCoreImpl iMiWearCoreImpl2 = this.clientCoreService;
            if (iMiWearCoreImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            } else {
                iMiWearCoreImpl = iMiWearCoreImpl2;
            }
            iMiWearCoreImpl.registerDeviceChangeListener(this);
            return;
        }
        if (!CoreExtKt.useLyra()) {
            logger.i(TAG, "init() use app core service");
            CoreExtKt.setLyraConnection(false);
            serviceStateListener.onCoreServiceState(1);
            return;
        }
        boolean zBindService = bindService(serviceStateListener);
        logger.i(TAG, "init() called with: bind lyra service result " + zBindService);
        if (zBindService) {
            CoreExtKt.setLyraConnection(true);
        } else {
            CoreExtKt.setLyraConnection(false);
            serviceStateListener.onCoreServiceState(1);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public boolean isIdle(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "isIdle() called with: did = " + did + ", service = " + this.coreServiceMap.get(did));
        e eVar = this.coreServiceMap.get(did);
        if (eVar != null) {
            return eVar.isIdle(did);
        }
        return false;
    }

    @Override // com.xiaomi.wearable.core.AccountReceiver.AccountChangeReceiver
    public void onAccountChanged(boolean login) {
        CoreExtKt.getLogger().i(TAG, "onAccountChanged() called with: login = " + login);
        if (CoreExtKt.getInLyra() && !login) {
            clear();
        }
    }

    @Override // com.xiaomi.wearable.core.server.OnDeviceChangeListener
    public void onCurrentDeviceChanged(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onCurrentDeviceChanged() called with: did = " + did);
        this.currentDeviceID = did;
    }

    @Override // com.xiaomi.wearable.core.server.OnDeviceChangeListener
    public void onDeviceRemove(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "onDeviceRemove() called with: did = " + did + ", current = " + this.currentDeviceID);
        if (Intrinsics.areEqual(this.currentDeviceID, did)) {
            this.deviceStateAdapter.onDeviceLost(did);
        }
        DataHandlerAdapter dataHandlerAdapterRemove = this.dataHandlers.remove(did);
        if (dataHandlerAdapterRemove != null) {
            dataHandlerAdapterRemove.clear();
        }
    }

    @Override // com.xiaomi.wearable.core.PackageReceiver.PackageChangeReceiver
    public void onPackageChange(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        CoreExtKt.getLogger().i(TAG, "onPackageChange() called with: action = " + action + ", " + this.currentDeviceID);
        if (CoreExtKt.getInLyra() && Intrinsics.areEqual(action, "android.intent.action.PACKAGE_REMOVED")) {
            clear();
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public int openMassChannel(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        e eVar = this.coreServiceMap.get(did);
        if (eVar == null) {
            return -1;
        }
        int iOpenMassChannel = eVar.openMassChannel(did);
        CoreExtKt.getLogger().i(TAG, "openMassChannel() called with: did = " + did + ", service = " + eVar + ", massId = " + iOpenMassChannel);
        if (iOpenMassChannel != -1) {
            this.massChannels.put(Integer.valueOf(iOpenMassChannel), new MassChannelService(did, eVar));
        }
        return iOpenMassChannel;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r0
      0x003b: PHI (r0v7 com.xiaomi.wearable.core.server.IMiWearCoreImpl) = (r0v6 com.xiaomi.wearable.core.server.IMiWearCoreImpl), (r0v9 com.xiaomi.wearable.core.server.IMiWearCoreImpl) binds: [B:14:0x0048, B:7:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void openUnauthConnection(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo, @NotNull a callback) throws IllegalAccessException, RemoteException {
        IMiWearCoreImpl iMiWearCoreImpl;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (CoreExtKt.getInLyra()) {
            throw new IllegalAccessException("health operation");
        }
        CoreExtKt.getLogger().i(TAG, "openUnauthConnection() called with: deviceInfo = " + deviceInfo);
        e eVar = null;
        if (!deviceInfo.isWearableDevice()) {
            iMiWearCoreImpl = this.clientCoreService;
            if (iMiWearCoreImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            } else {
                eVar = iMiWearCoreImpl;
            }
        } else if (CoreExtKt.getLyraConnection()) {
            eVar = this.remoteCoreService;
        } else {
            iMiWearCoreImpl = this.clientCoreService;
            if (iMiWearCoreImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            } else {
                eVar = iMiWearCoreImpl;
            }
        }
        if (eVar != null) {
            this.coreServiceMap.put(deviceInfo.getAddress(), eVar);
            eVar.openUnauthConnection(DeviceInfoExtKt.convertToJson(deviceInfo), callback);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void removeDeviceDataHandler(@NotNull String did, int type, @NotNull IDataHandler handler) {
        IInterface iInterface;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(handler, "handler");
        CoreExtKt.getLogger().i(TAG, "removeDeviceDataHandler() called with: did = " + did + ", handler = " + handler);
        if (CoreExtKt.getInLyra()) {
            iInterface = this.clientCoreService;
            if (iInterface == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                iInterface = null;
            }
        } else {
            iInterface = (e) this.coreServiceMap.get(did);
        }
        if (iInterface == null) {
            CoreExtKt.getLogger().i(TAG, "removeDeviceDataHandler() core service null");
            return;
        }
        DataHandlerAdapter dataHandlerAdapter = this.dataHandlers.get(did);
        if (dataHandlerAdapter == null) {
            CoreExtKt.getLogger().i(TAG, "removeDeviceDataHandler() not registered");
        } else {
            dataHandlerAdapter.remove(handler);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void removeDeviceInfo(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "removeDeviceInfo() called with: did = " + did + ", contains = " + this.dataHandlers.contains(did));
        if (CoreExtKt.getInLyra()) {
            return;
        }
        DataHandlerAdapter dataHandlerAdapterRemove = this.dataHandlers.remove(did);
        if (dataHandlerAdapterRemove != null) {
            dataHandlerAdapterRemove.clear();
        }
        e eVar = this.coreServiceMap.get(did);
        if (eVar != null) {
            eVar.removeDeviceInfo(did);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void removeDeviceStateListener(@NotNull IDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CoreExtKt.getLogger().i(TAG, "removeDeviceStateListener() called with: listener = " + listener);
        this.deviceStateListeners.remove(listener);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void removeServiceStateListener(@NotNull ServiceStateListener serviceStateListener) {
        Intrinsics.checkNotNullParameter(serviceStateListener, "serviceStateListener");
        LyraService.INSTANCE.removeServiceConnectionListener(serviceStateListener);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void sendMassData(int massId, @NotNull byte[] data, @NotNull ICallback callback, int timeout) throws RemoteException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i(TAG, "sendMassData() called with: massId = " + massId + ", data = " + data + ", callback = " + callback + ", timeout = " + timeout);
        MassChannelService massChannelService = this.massChannels.get(Integer.valueOf(massId));
        if (massChannelService != null) {
            massChannelService.getMiWearCore().sendMassData(massId, data, callback, timeout);
            return;
        }
        CoreExtKt.getLogger().i(TAG, "sendMassData() called with: massId = " + massId + " has the mass channel has ben opened");
    }

    @Override // com.xiaomi.wearable.core.client.ThirdPartySupport
    public void sendThirdFile(@NotNull String did, int type, int detailType, @NotNull String path, @NotNull s5f callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IMiWearCoreImpl iMiWearCoreImpl = this.clientCoreService;
        if (iMiWearCoreImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            iMiWearCoreImpl = null;
        }
        iMiWearCoreImpl.sendThirdFile(did, type, detailType, path, callback);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void setAppCapabilities(int appCapability) throws RemoteException {
        CoreExtKt.getLogger().i(TAG, "setAppCapabilities() called with: appCapability = " + appCapability);
        if (CoreExtKt.getLyraConnection()) {
            appCapability |= 2048;
        }
        try {
            IMiWearCoreImpl iMiWearCoreImpl = this.clientCoreService;
            if (iMiWearCoreImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
                iMiWearCoreImpl = null;
            }
            iMiWearCoreImpl.setAppCapabilities(appCapability);
            e eVar = this.remoteCoreService;
            if (eVar != null) {
                eVar.setAppCapabilities(appCapability);
            }
        } catch (DeadObjectException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void setChannel(@Nullable String channel) throws RemoteException {
        CoreExtKt.getLogger().i(TAG, "setChannel() called with: channel = " + channel + ", service = " + this.remoteCoreService);
        CoreExtKt.setChannel(channel);
        BluetoothManager.INSTANCE.get().setChannel(channel);
        e eVar = this.remoteCoreService;
        if (eVar != null) {
            eVar.setChannel(channel);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void setCurrentDevice(@NotNull String did, boolean currentDevice) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        if (CoreExtKt.getInLyra()) {
            return;
        }
        CoreExtKt.getLogger().i(TAG, "setCurrentDevice() called with: did = " + did + ", current " + currentDevice);
        e eVar = this.coreServiceMap.get(did);
        if (eVar != null) {
            eVar.setCurrentDevice(did, currentDevice);
        }
        this.currentDeviceID = did;
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void setWearMode(@NotNull String did, int mode) throws RemoteException {
        e eVar;
        Intrinsics.checkNotNullParameter(did, "did");
        CoreExtKt.getLogger().i(TAG, "setWearMode() called with: did = " + did + ", mode = " + WearMode.INSTANCE.print(mode));
        if (CoreExtKt.getInLyra() || (eVar = this.coreServiceMap.get(did)) == null) {
            return;
        }
        eVar.setWearMode(did, mode);
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void unauthCall(@NotNull String address, @NotNull byte[] data, boolean needResponse, @NotNull ICallback callback, int timeout) throws RemoteException {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i(TAG, "unauthCall() called with: address = " + address);
        e eVar = this.coreServiceMap.get(address);
        if (eVar == null) {
            CoreExtKt.getLogger().i(TAG, "unauthCall() open unauth conneciton first");
        } else {
            eVar.unauthCall(address, data, needResponse, callback, timeout);
        }
    }

    @Override // com.xiaomi.wearable.core.client.IMiWearCoreClient
    public void removeDeviceInfo() throws RemoteException {
        CoreExtKt.getLogger().i(TAG, "removeDeviceInfo() called");
        if (CoreExtKt.getInLyra()) {
            CoreExtKt.getLogger().i(TAG, "removeDeviceInfo() called");
            return;
        }
        clear();
        IMiWearCoreImpl iMiWearCoreImpl = this.clientCoreService;
        if (iMiWearCoreImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientCoreService");
            iMiWearCoreImpl = null;
        }
        iMiWearCoreImpl.clear();
        e eVar = this.remoteCoreService;
        if (eVar != null) {
            eVar.removeAllDeviceInfo();
        }
    }
}
