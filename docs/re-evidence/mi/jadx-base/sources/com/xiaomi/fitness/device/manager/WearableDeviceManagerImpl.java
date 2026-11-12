package com.xiaomi.fitness.device.manager;

import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fit.device.huami.HuaMiDeviceTool;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.fitness.device.manager.utils.ChooseCommonAppUtil;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001B\n\b\u0007¢\u0006\u0005\b\u0084\u0001\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJY\u0010\u0012\u001a\u00020\f2,\u0010\u000e\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u0001`\r2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ%\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u0019\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b&\u0010\u001bJ\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b'\u0010\u001bJ%\u0010)\u001a\u0004\u0018\u00010\u000b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\u0016J\u0011\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00101J4\u00106\u001a\u00020\f2#\u0010/\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b6\u00107J4\u00108\u001a\u00020\f2#\u0010/\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\f2\u0006\u0010/\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u0010/\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010;J\u0019\u0010=\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010>J\u0019\u0010C\u001a\u0004\u0018\u00010\u000b2\u0006\u0010B\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010>J\u0019\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010B\u001a\u00020\u0002H\u0016¢\u0006\u0004\bE\u0010FJ9\u0010K\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0G2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010Q\u001a\u00020\f2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ!\u0010T\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ'\u0010W\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010P\u001a\u00020S2\u0006\u0010V\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020IH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u0002H\u0016¢\u0006\u0004\b[\u0010\u0016J\u0019\u0010\\\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0002H\u0016¢\u0006\u0004\b^\u0010\bJ\u000f\u0010_\u001a\u00020\u0002H\u0016¢\u0006\u0004\b_\u0010\bJ\u000f\u0010`\u001a\u00020\u0002H\u0016¢\u0006\u0004\b`\u0010\bJ\u0017\u0010b\u001a\u00020\f2\u0006\u0010a\u001a\u00020\u0004H\u0016¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\bd\u0010\u001bJ'\u0010g\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010e\u001a\u00020I2\u0006\u0010f\u001a\u00020\u0004H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020I2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020I2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bk\u0010jJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010e\u001a\u00020IH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020I2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bn\u0010jJ\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\bo\u0010\u001bR/\u0010x\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010p8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002090y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\bR\u0017\u0010\u0080\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0083\u0001\u001a\u00020I8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010Z¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/manager/WearableDeviceManagerImpl;", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "", "did", "", "isAvailable", "(Ljava/lang/String;)Z", "getOAID", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "connectDevice", "()V", "(Ljava/lang/String;)V", "connectLocalDevice", "disconnectDevice", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getDeviceList", "()Ljava/util/List;", "getAllDeviceList", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getAllDeviceInfoList", com.xiaomi.onetrack.api.b.n, "getAllFeatureSupportDeviceInfoList", "(Ljava/util/List;)Ljava/util/List;", "setBindNewMode", "model", "getDeviceByModelFromAllDevice", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/Device;", "getDeviceModels", "getLocalDeviceModels", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "removeDeviceModel", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;)V", "removeDeviceStatusListener", "Lkotlin/ParameterName;", "name", "deviceModel", "addDeviceChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "removeDeviceChangeListener", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "addAccessoryDeviceStateListener", "(Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;)V", "removeAccessoryDeviceStateListener", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceInfoInAll", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getLocalDeviceModel", "mac", "getDeviceModelByMac", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuaMiApiCaller", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "Lkotlin/Function0;", "success", "", "fail", "deauthorize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "syncData", "unbindBloodSugarDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;Z)V", "getDeviceSize", "()I", "cancelBind", "switchDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "getLocalPhoneSid", "getCurrentPhoneSid", "getUniqueIdentify", "flag", "setShowCommonAppDialog", "(Z)V", "getAccessoryDeviceModels", "mode", Constants.EXTRA_FROM_APP, "switchDeviceWearMode", "(Ljava/lang/String;IZ)V", "getDeviceCapability", "(Ljava/lang/String;)I", "getDeviceCapabilityV2", "hasAccessoryMode", "(I)Z", "getAccessoryMode", "getNeedKeepAliveDeviceModel", "Lcom/xiaomi/fitness/device/manager/c;", "<set-?>", "mRemoteDeviceManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteDeviceManager", "()Lcom/xiaomi/fitness/device/manager/c;", "setMRemoteDeviceManager", "(Lcom/xiaomi/fitness/device/manager/c;)V", "mRemoteDeviceManager", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mAccessoryDeviceStateListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/OnDeviceChangeListenerAdapter;", "mDeviceChange", "Lcom/xiaomi/fitness/device/manager/OnDeviceChangeListenerAdapter;", "getDid", "isConnected", "()Z", "getDeviceStatus", "deviceStatus", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableDeviceManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableDeviceManagerImpl.kt\ncom/xiaomi/fitness/device/manager/WearableDeviceManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n1863#2,2:407\n1863#2,2:409\n1863#2,2:411\n1863#2,2:413\n1863#2,2:415\n1863#2,2:417\n1863#2,2:419\n*S KotlinDebug\n*F\n+ 1 WearableDeviceManagerImpl.kt\ncom/xiaomi/fitness/device/manager/WearableDeviceManagerImpl\n*L\n131#1:407,2\n142#1:409,2\n159#1:411,2\n178#1:413,2\n186#1:415,2\n368#1:417,2\n397#1:419,2\n*E\n"})
public final class WearableDeviceManagerImpl extends WearableDeviceManagerWrapper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WearableDeviceManagerImpl.class, "mRemoteDeviceManager", "getMRemoteDeviceManager()Lcom/xiaomi/fitness/device/manager/DeviceManagerRemote;", 0))};

    @NotNull
    private static final String TAG = "DeviceManagerImpl";

    @NotNull
    private final CopyOnWriteArrayList<OnAccessoryDeviceStateListener> mAccessoryDeviceStateListeners;

    @NotNull
    private final OnDeviceChangeListenerAdapter mDeviceChange;

    /* JADX INFO: renamed from: mRemoteDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteDeviceManager = new BinderDelegate("mRemoteDeviceManager");

    public WearableDeviceManagerImpl() {
        CopyOnWriteArrayList<OnAccessoryDeviceStateListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.mAccessoryDeviceStateListeners = copyOnWriteArrayList;
        this.mDeviceChange = new OnDeviceChangeListenerAdapter();
        final OnDeviceStatusListenerAdapter onDeviceStatusListenerAdapter = new OnDeviceStatusListenerAdapter(getMDeviceStatusListeners());
        final OnAccessoryDeviceStateListenerAdapter onAccessoryDeviceStateListenerAdapter = new OnAccessoryDeviceStateListenerAdapter(copyOnWriteArrayList);
        ServiceConnector.INSTANCE.getBinder(5, new Function1() { // from class: c8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearableDeviceManagerImpl._init_$lambda$0(this.f5057a, onDeviceStatusListenerAdapter, onAccessoryDeviceStateListenerAdapter, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(WearableDeviceManagerImpl this$0, OnDeviceStatusListenerAdapter deviceStatusListener, OnAccessoryDeviceStateListenerAdapter accessoryDeviceStateListener, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceStatusListener, "$deviceStatusListener");
        Intrinsics.checkNotNullParameter(accessoryDeviceStateListener, "$accessoryDeviceStateListener");
        this$0.setMRemoteDeviceManager(c.a.asInterface(iBinder));
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("init:getBinder: DeviceManagerRemote(" + this$0.getMRemoteDeviceManager() + ")");
        this$0.mDeviceChange.setDeviceManager(this$0.getMRemoteDeviceManager());
        c mRemoteDeviceManager = this$0.getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.addDeviceChangeListener(this$0.mDeviceChange);
        }
        c mRemoteDeviceManager2 = this$0.getMRemoteDeviceManager();
        if (mRemoteDeviceManager2 != null) {
            mRemoteDeviceManager2.addDeviceStatusListener(deviceStatusListener);
        }
        c mRemoteDeviceManager3 = this$0.getMRemoteDeviceManager();
        if (mRemoteDeviceManager3 != null) {
            mRemoteDeviceManager3.addAccessoryDeviceStateListener(accessoryDeviceStateListener);
        }
        return Unit.INSTANCE;
    }

    private final String getDid() {
        DeviceModelRemote currentDeviceModel;
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager == null || (currentDeviceModel = mRemoteDeviceManager.getCurrentDeviceModel()) == null) {
            return null;
        }
        return currentDeviceModel.getDid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getMRemoteDeviceManager() {
        return (c) this.mRemoteDeviceManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final String getOAID() {
        DeviceUtil deviceUtil = DeviceUtil.INSTANCE;
        String vaid = deviceUtil.getVAID(AppUtil.getApp());
        if (vaid != null) {
            return vaid;
        }
        String oaid = deviceUtil.getOAID(AppUtil.getApp());
        if (oaid != null) {
            return oaid;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final boolean isAvailable(String did) {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        return (mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceModel(did) : null) != null;
    }

    private final void setMRemoteDeviceManager(c cVar) {
        this.mRemoteDeviceManager.setValue((Object) this, $$delegatedProperties[0], cVar);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void addAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mAccessoryDeviceStateListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceChangeListener(@NotNull Function1<? super WearableDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChange.add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMDeviceStatusListeners().add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void bindDevice(@NotNull DeviceParameter parameter, @NotNull a callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.bindDevice(parameter, callback);
        }
    }

    @Override // com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper
    public void cancelBind(@NotNull String mac) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "cancelBind() called with: mac = " + mac);
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.cancelBind(mac);
        }
    }

    public final void connectDevice() throws RemoteException {
        Logger.i("start connect device", new Object[0]);
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.connectDevice(ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication()), AppManager.INSTANCE.getInstance().isAppForeground());
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void connectLocalDevice(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.connectLocalDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void deauthorize(@NotNull String did, @NotNull final Function0<Unit> success, @NotNull final Function1<? super Integer, Unit> fail) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.deauthorize(did, new l.a() { // from class: com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl.deauthorize.1
                @Override // com.xiaomi.fitness.device.manager.l
                public void onFail(int code) {
                    AnyExtKt.main$default(null, new WearableDeviceManagerImpl$deauthorize$1$onFail$1(fail, code, null), 1, null);
                }

                @Override // com.xiaomi.fitness.device.manager.l
                public void onSuccess() {
                    AnyExtKt.main$default(null, new WearableDeviceManagerImpl$deauthorize$1$onSuccess$1(success, null), 1, null);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void disconnectDevice(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "disconnectDevice() called with: did = " + did);
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.disconnectDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public /* bridge */ /* synthetic */ DeviceModel findDeviceModel(Function1 function1) {
        return findDeviceModel((Function1<? super WearableDeviceModel, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public List<WearableDeviceModel> getAccessoryDeviceModels() {
        List<DeviceModelRemote> accessoryDeviceModels;
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null && (accessoryDeviceModels = mRemoteDeviceManager.getAccessoryDeviceModels()) != null) {
            for (DeviceModelRemote deviceModelRemote : accessoryDeviceModels) {
                c mRemoteDeviceManager2 = getMRemoteDeviceManager();
                Intrinsics.checkNotNull(mRemoteDeviceManager2);
                arrayList.add(new DeviceModelClient(mRemoteDeviceManager2, deviceModelRemote.getDid()));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public int getAccessoryMode(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getAccessoryMode(did);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @Nullable
    public List<WearableDeviceInfo> getAllDeviceInfoList() {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getDeviceInfoList();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public List<Device> getAllDeviceList() {
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        List<WearableDeviceInfo> deviceInfoList = mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceInfoList() : null;
        if (deviceInfoList != null) {
            Iterator<T> it = deviceInfoList.iterator();
            while (it.hasNext()) {
                T t = ((WearableDeviceInfo) it.next()).device;
                Intrinsics.checkNotNull(t);
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @Nullable
    public List<WearableDeviceInfo> getAllFeatureSupportDeviceInfoList(@NotNull List<String> feature) {
        List<String> features;
        Intrinsics.checkNotNullParameter(feature, "feature");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        List<WearableDeviceInfo> deviceInfoList = mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceInfoList() : null;
        ArrayList arrayList = new ArrayList();
        if (deviceInfoList != null) {
            for (WearableDeviceInfo wearableDeviceInfo : deviceInfoList) {
                Product product = wearableDeviceInfo.getProduct();
                if (product != null && (features = product.getFeatures()) != null && features.containsAll(feature)) {
                    arrayList.add(wearableDeviceInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public String getCurrentPhoneSid() {
        String currentPhoneSid;
        try {
            String cur_phone_did = DevicePreference.INSTANCE.getCUR_PHONE_DID();
            if (!TextUtils.isEmpty(cur_phone_did)) {
                return cur_phone_did;
            }
            c mRemoteDeviceManager = getMRemoteDeviceManager();
            if (mRemoteDeviceManager != null && (currentPhoneSid = mRemoteDeviceManager.getCurrentPhoneSid()) != null) {
                return currentPhoneSid;
            }
            return getLocalPhoneSid();
        } catch (Exception e) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "getCurrentPhoneSid: e " + e);
            return getLocalPhoneSid();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @Nullable
    public Device getDeviceByModelFromAllDevice(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        WearableDeviceInfo deviceInfoByModelFromAllDevice = mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceInfoByModelFromAllDevice(model) : null;
        if (deviceInfoByModelFromAllDevice != null) {
            return (WearableDevice) deviceInfoByModelFromAllDevice.device;
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public int getDeviceCapability(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getDeviceCapability(did);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public int getDeviceCapabilityV2(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getDeviceCapabilityV2(did);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<Device> getDeviceList() {
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        List<WearableDeviceInfo> deviceInfoList = mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceInfoList() : null;
        if (deviceInfoList != null) {
            for (WearableDeviceInfo wearableDeviceInfo : deviceInfoList) {
                WearableDevice wearableDevice = (WearableDevice) wearableDeviceInfo.device;
                if (wearableDevice != null && wearableDevice.getStatus() == 1) {
                    T t = wearableDeviceInfo.device;
                    Intrinsics.checkNotNull(t);
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<WearableDeviceModel> getDeviceModels() {
        List<DeviceModelRemote> deviceModels;
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null && (deviceModels = mRemoteDeviceManager.getDeviceModels()) != null) {
            for (DeviceModelRemote deviceModelRemote : deviceModels) {
                c mRemoteDeviceManager2 = getMRemoteDeviceManager();
                Intrinsics.checkNotNull(mRemoteDeviceManager2);
                arrayList.add(new DeviceModelClient(mRemoteDeviceManager2, deviceModelRemote.getDid()));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceSize() {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getWearableDeviceSize();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceStatus() {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.getDeviceStatus(getDid());
        }
        return -1;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @Nullable
    public HuamiApiCaller getHuaMiApiCaller(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        WearableDeviceModel deviceModelByMac = getDeviceModelByMac(mac);
        String did = deviceModelByMac != null ? deviceModelByMac.getDid() : null;
        if (did == null || did.length() == 0) {
            return null;
        }
        return HuaMiDeviceTool.INSTANCE.getInstance().getOrInit(mac, did);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @Nullable
    public WearableDeviceModel getLocalDeviceModel(@NotNull String model) {
        DeviceModelRemote localDeviceModel;
        Intrinsics.checkNotNullParameter(model, "model");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager == null || (localDeviceModel = mRemoteDeviceManager.getLocalDeviceModel(model)) == null) {
            return null;
        }
        c mRemoteDeviceManager2 = getMRemoteDeviceManager();
        Intrinsics.checkNotNull(mRemoteDeviceManager2);
        return new DeviceModelClient(mRemoteDeviceManager2, localDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<WearableDeviceModel> getLocalDeviceModels() {
        List<DeviceModelRemote> localDeviceModels;
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null && (localDeviceModels = mRemoteDeviceManager.getLocalDeviceModels()) != null) {
            for (DeviceModelRemote deviceModelRemote : localDeviceModels) {
                c mRemoteDeviceManager2 = getMRemoteDeviceManager();
                Intrinsics.checkNotNull(mRemoteDeviceManager2);
                arrayList.add(new DeviceModelClient(mRemoteDeviceManager2, deviceModelRemote.getDid()));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public String getLocalPhoneSid() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public List<WearableDeviceModel> getNeedKeepAliveDeviceModel() {
        List<DeviceModelRemote> needKeepAliveDeviceModel;
        ArrayList arrayList = new ArrayList();
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null && (needKeepAliveDeviceModel = mRemoteDeviceManager.getNeedKeepAliveDeviceModel()) != null) {
            for (DeviceModelRemote deviceModelRemote : needKeepAliveDeviceModel) {
                c mRemoteDeviceManager2 = getMRemoteDeviceManager();
                Intrinsics.checkNotNull(mRemoteDeviceManager2);
                arrayList.add(new DeviceModelClient(mRemoteDeviceManager2, deviceModelRemote.getDid()));
            }
        }
        Logger.i(TAG, "needKeepAliveDeviceModel = " + arrayList);
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    @NotNull
    public String getUniqueIdentify() {
        DevicePreference devicePreference = DevicePreference.INSTANCE;
        String oaid = devicePreference.getOAID();
        if (oaid.length() != 0) {
            return oaid;
        }
        String old_health_oaid = devicePreference.getOLD_HEALTH_OAID();
        if (old_health_oaid.length() != 0) {
            return old_health_oaid;
        }
        String oaid2 = getOAID();
        devicePreference.setOAID(oaid2);
        return oaid2;
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public boolean hasAccessoryMode(int mode) {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            return mRemoteDeviceManager.hasAccessoryMode(mode);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public boolean isConnected() {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        Boolean boolValueOf = mRemoteDeviceManager != null ? Boolean.valueOf(mRemoteDeviceManager.isConnected(getDid())) : null;
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge(TAG, "isConnected: did=" + getDid() + ": " + boolValueOf);
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void removeAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mAccessoryDeviceStateListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceChangeListener(@NotNull Function1<? super WearableDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChange.remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceModel(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.removeDeviceModel(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMDeviceStatusListeners().remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void requestDeviceList(@Nullable Function1<? super List<? extends WearableDeviceModel>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) throws RemoteException {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.requestDeviceList(new b.a() { // from class: com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl.requestDeviceList.1
                @Override // com.xiaomi.fitness.device.manager.b
                public void onFail(String cause, int code) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onFail: ");
                    sb.append(cause);
                }

                @Override // com.xiaomi.fitness.device.manager.b
                public void onSuccess() {
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void setBindNewMode(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DevicePreference.INSTANCE.setIN_BIND_NEW_MODE(true);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void setShowCommonAppDialog(boolean flag) {
        ChooseCommonAppUtil.INSTANCE.setShowCommonAppDialog(flag);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void switchDeviceWearMode(@NotNull String did, int mode, boolean fromApp) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.e(TAG, "switchDeviceWearMode: ", new Exception());
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.switchDeviceWearMode(did, mode, fromApp);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceManager
    public void unbindBloodSugarDevice(@NotNull String did, @NotNull l callback, boolean syncData) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.unbindBloodSugarDevice(did, callback, syncData);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void unbindDevice(@NotNull String did, @Nullable l callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.unbindDevice(did, callback);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public WearableDeviceModel findDeviceModel(@NotNull final Function1<? super WearableDeviceModel, Boolean> p) {
        Intrinsics.checkNotNullParameter(p, "p");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        DeviceModelRemote deviceModelRemoteFindDeviceModel = mRemoteDeviceManager != null ? mRemoteDeviceManager.findDeviceModel(new d.a() { // from class: com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl$findDeviceModel$deviceModel$1
            @Override // com.xiaomi.fitness.device.manager.d
            public boolean predicate(DeviceModelRemote info) {
                Intrinsics.checkNotNullParameter(info, "info");
                Function1<WearableDeviceModel, Boolean> function1 = p;
                c mRemoteDeviceManager2 = this.getMRemoteDeviceManager();
                Intrinsics.checkNotNull(mRemoteDeviceManager2);
                return function1.invoke2(new DeviceModelClient(mRemoteDeviceManager2, info.getDid())).booleanValue();
            }
        }) : null;
        if (deviceModelRemoteFindDeviceModel == null) {
            return null;
        }
        c mRemoteDeviceManager2 = getMRemoteDeviceManager();
        Intrinsics.checkNotNull(mRemoteDeviceManager2);
        return new DeviceModelClient(mRemoteDeviceManager2, deviceModelRemoteFindDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public WearableDeviceModel getCurrentDeviceModel() {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        DeviceModelRemote currentDeviceModel = mRemoteDeviceManager != null ? mRemoteDeviceManager.getCurrentDeviceModel() : null;
        if (currentDeviceModel == null) {
            return null;
        }
        c mRemoteDeviceManager2 = getMRemoteDeviceManager();
        Intrinsics.checkNotNull(mRemoteDeviceManager2);
        return new DeviceModelClient(mRemoteDeviceManager2, currentDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public WearableDeviceInfo getDeviceInfoInAll(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        WearableDeviceInfo deviceInfoInAll = mRemoteDeviceManager != null ? mRemoteDeviceManager.getDeviceInfoInAll(did) : null;
        if (deviceInfoInAll == null) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("Can't find device with " + did);
        }
        return deviceInfoInAll;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public WearableDeviceModel getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (!isAvailable(did)) {
            return null;
        }
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        Intrinsics.checkNotNull(mRemoteDeviceManager);
        return new DeviceModelClient(mRemoteDeviceManager, did);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public WearableDeviceModel getDeviceModelByMac(@NotNull String mac) {
        DeviceModelRemote deviceModelByMac;
        Intrinsics.checkNotNullParameter(mac, "mac");
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager == null || (deviceModelByMac = mRemoteDeviceManager.getDeviceModelByMac(mac)) == null) {
            return null;
        }
        c mRemoteDeviceManager2 = getMRemoteDeviceManager();
        Intrinsics.checkNotNull(mRemoteDeviceManager2);
        return new DeviceModelClient(mRemoteDeviceManager2, deviceModelByMac.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void switchDevice(@Nullable WearableDeviceModel deviceModel) throws RemoteException {
        c mRemoteDeviceManager = getMRemoteDeviceManager();
        if (mRemoteDeviceManager != null) {
            mRemoteDeviceManager.switchDevice(deviceModel != null ? deviceModel.getDid() : null);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void connectDevice(@Nullable String did) throws RemoteException {
        Logger.e("start connect device with " + did, new Object[0]);
        if (did != null && did.length() != 0) {
            if (ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication()) && AppManager.INSTANCE.getInstance().isAppForeground()) {
                c mRemoteDeviceManager = getMRemoteDeviceManager();
                if (mRemoteDeviceManager != null) {
                    mRemoteDeviceManager.ecoConnectDeviceByDid(true, did);
                    return;
                }
                return;
            }
            c mRemoteDeviceManager2 = getMRemoteDeviceManager();
            if (mRemoteDeviceManager2 != null) {
                mRemoteDeviceManager2.ecoConnectDeviceByDid(false, did);
                return;
            }
            return;
        }
        connectDevice();
    }
}
