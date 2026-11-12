package com.xiaomi.fitness.eco.device.manager;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerImpl;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.hbk;
import defpackage.sh7;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 f2\u00020\u0001:\u0001fB\t\b\u0007¢\u0006\u0004\be\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J%\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u000bJ\u0011\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00192\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010'J\u0019\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010'J9\u00102\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0/2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u001cH\u0016¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b5\u00106Jc\u0010?\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u00022\b\u0010<\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\t2\u0006\u0010B\u001a\u00020A2\u0006\u0010>\u001a\u00020CH\u0016¢\u0006\u0004\b?\u0010DJ!\u0010F\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bF\u0010GJY\u0010M\u001a\u00020\t2,\u0010I\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0010\u0018\u0001`H2\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020 H\u0016¢\u0006\u0004\bO\u0010\"J\u0017\u0010Q\u001a\u00020\t2\u0006\u0010>\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\bS\u0010\u000bJ\u000f\u0010T\u001a\u00020\u0002H\u0016¢\u0006\u0004\bT\u0010\bR/\u0010]\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00140^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\"¨\u0006g"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerImpl;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "", "did", "", "isAvailable", "(Ljava/lang/String;)Z", "getOAID", "()Ljava/lang/String;", "", "connectDevice", "(Ljava/lang/String;)V", "connectLocalDevice", "disconnectDevice", "ecoFetchDeviceList", "()V", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "getDeviceList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;)V", "removeDeviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getDeviceModels", "getLocalDeviceModels", "Lkotlin/Function1;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "getDeviceSize", "()I", "removeDeviceModel", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "getDeviceInfoInAll", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "model", "getLocalDeviceModel", "mac", "getDeviceModelByMac", "Lkotlin/Function0;", "success", "fail", "deauthorize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "deviceModel", "switchDevice", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "bleName", "oob", "shareId", "shareUserId", "shareDid", "shareModel", "Lsh7;", "callback", "bindDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsh7;)V", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getEcoDeviceSize", "Lhbk;", "refreshEcoList", "(Lhbk;)V", "cancelBind", "getUniqueIdentify", "Lcom/xiaomi/fitness/eco/device/manager/a;", "<set-?>", "mEcoRemoteDeviceManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMEcoRemoteDeviceManager", "()Lcom/xiaomi/fitness/eco/device/manager/a;", "setMEcoRemoteDeviceManager", "(Lcom/xiaomi/fitness/eco/device/manager/a;)V", "mEcoRemoteDeviceManager", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mEcoDeviceStatusListener", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isConnected", "()Z", "getDeviceStatus", "deviceStatus", "<init>", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1863#2,2:266\n1863#2,2:268\n*S KotlinDebug\n*F\n+ 1 EcoDeviceManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerImpl\n*L\n84#1:266,2\n102#1:268,2\n*E\n"})
public final class EcoDeviceManagerImpl extends EcoDeviceManagerWrapper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDeviceManagerImpl.class, "mEcoRemoteDeviceManager", "getMEcoRemoteDeviceManager()Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerRemote;", 0))};

    @NotNull
    private static final String TAG = "EcoDeviceManagerImpl";

    @NotNull
    private final CopyOnWriteArrayList<OnEcoDeviceStatusListener> mEcoDeviceStatusListener;

    /* JADX INFO: renamed from: mEcoRemoteDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mEcoRemoteDeviceManager = new BinderDelegate("mEcoRemoteDeviceManager");

    public EcoDeviceManagerImpl() {
        CopyOnWriteArrayList<OnEcoDeviceStatusListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.mEcoDeviceStatusListener = copyOnWriteArrayList;
        final OnEcoDeviceStatusListenerAdapter onEcoDeviceStatusListenerAdapter = new OnEcoDeviceStatusListenerAdapter(copyOnWriteArrayList);
        ServiceConnector.INSTANCE.getBinder(7, new Function1() { // from class: bs7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceManagerImpl._init_$lambda$0(this.f4553a, onEcoDeviceStatusListenerAdapter, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(EcoDeviceManagerImpl this$0, OnEcoDeviceStatusListenerAdapter deviceStatusListener, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceStatusListener, "$deviceStatusListener");
        this$0.setMEcoRemoteDeviceManager(a.AbstractBinderC0549a.asInterface(iBinder));
        EcoDeviceModelExtKt.logi("init:getBinder: EcoDeviceManagerRemote(" + this$0.getMEcoRemoteDeviceManager() + ")");
        a mEcoRemoteDeviceManager = this$0.getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.addDeviceStatusListener(deviceStatusListener);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getMEcoRemoteDeviceManager() {
        return (a) this.mEcoRemoteDeviceManager.getValue((Object) this, $$delegatedProperties[0]);
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
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        return (mEcoRemoteDeviceManager != null ? mEcoRemoteDeviceManager.getDeviceModel(did) : null) != null;
    }

    private final void setMEcoRemoteDeviceManager(a aVar) {
        this.mEcoRemoteDeviceManager.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public void addDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mEcoDeviceStatusListener.add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void bindDevice(@NotNull DeviceParameter parameter, @NotNull com.xiaomi.fitness.device.manager.a callback) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper
    public void cancelBind(@NotNull String mac) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "cancelBind() called with: mac = " + mac);
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.cancelBind(mac);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void connectDevice(@Nullable String did) throws RemoteException {
        Logger.e("start connect device", new Object[0]);
        if (ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication()) && AppManager.INSTANCE.getInstance().isAppForeground()) {
            a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
            if (mEcoRemoteDeviceManager != null) {
                mEcoRemoteDeviceManager.ecoConnectDeviceByDid(true, did);
                return;
            }
            return;
        }
        a mEcoRemoteDeviceManager2 = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager2 != null) {
            mEcoRemoteDeviceManager2.ecoConnectDeviceByDid(false, did);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public void connectLocalDevice(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.connectLocalDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void deauthorize(@NotNull String did, @NotNull final Function0<Unit> success, @NotNull final Function1<? super Integer, Unit> fail) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.deauthorize(did, new l.a() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerImpl.deauthorize.1
                @Override // com.xiaomi.fitness.device.manager.l
                public void onFail(int code) {
                    AnyExtKt.main$default(null, new EcoDeviceManagerImpl$deauthorize$1$onFail$1(fail, code, null), 1, null);
                }

                @Override // com.xiaomi.fitness.device.manager.l
                public void onSuccess() {
                    AnyExtKt.main$default(null, new EcoDeviceManagerImpl$deauthorize$1$onSuccess$1(success, null), 1, null);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void disconnectDevice(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "disconnectDevice() called with: did = " + did);
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.disconnectDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public void ecoFetchDeviceList() throws RemoteException {
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.ecoFetchDeviceInfoList();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public /* bridge */ /* synthetic */ DeviceModel findDeviceModel(Function1 function1) {
        return findDeviceModel((Function1<? super EcoDeviceModel, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<EcoDevice> getDeviceList() {
        ArrayList arrayList = new ArrayList();
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        List<EcoDeviceInfo> deviceInfoList = mEcoRemoteDeviceManager != null ? mEcoRemoteDeviceManager.getDeviceInfoList() : null;
        if (deviceInfoList != null) {
            for (EcoDeviceInfo ecoDeviceInfo : deviceInfoList) {
                EcoDevice ecoDevice = (EcoDevice) ecoDeviceInfo.device;
                if (ecoDevice != null && ecoDevice.getStatus() == 1) {
                    T t = ecoDeviceInfo.device;
                    Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice");
                    arrayList.add((EcoDevice) t);
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<EcoDeviceModel> getDeviceModels() {
        List<EcoDeviceModelRemote> deviceModels;
        ArrayList arrayList = new ArrayList();
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null && (deviceModels = mEcoRemoteDeviceManager.getDeviceModels()) != null) {
            for (EcoDeviceModelRemote ecoDeviceModelRemote : deviceModels) {
                a mEcoRemoteDeviceManager2 = getMEcoRemoteDeviceManager();
                Intrinsics.checkNotNull(mEcoRemoteDeviceManager2);
                arrayList.add(new EcoDeviceModelClient(mEcoRemoteDeviceManager2, ecoDeviceModelRemote.getDid()));
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceSize() {
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            return mEcoRemoteDeviceManager.getEcoDeviceSize();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceStatus() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public int getEcoDeviceSize() {
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            return mEcoRemoteDeviceManager.getEcoDeviceSize();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    @Nullable
    public EcoDeviceModel getLocalDeviceModel(@NotNull String model) {
        EcoDeviceModelRemote localDeviceModel;
        Intrinsics.checkNotNullParameter(model, "model");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager == null || (localDeviceModel = mEcoRemoteDeviceManager.getLocalDeviceModel(model)) == null) {
            return null;
        }
        a mEcoRemoteDeviceManager2 = getMEcoRemoteDeviceManager();
        Intrinsics.checkNotNull(mEcoRemoteDeviceManager2);
        return new EcoDeviceModelClient(mEcoRemoteDeviceManager2, localDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<EcoDeviceModel> getLocalDeviceModels() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    @NotNull
    public String getUniqueIdentify() {
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        String oaid = ecoDevicePreference.getOAID();
        if (oaid.length() != 0) {
            return oaid;
        }
        String oaid2 = getOAID();
        ecoDevicePreference.setOAID(oaid2);
        return oaid2;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public boolean isConnected() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public void refreshEcoList(@NotNull hbk callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.refreshEcoList(callback);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceModel(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.removeDeviceModel(did);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager
    public void removeDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mEcoDeviceStatusListener.remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void requestDeviceList(@Nullable Function1<? super List<? extends EcoDeviceModel>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) throws RemoteException {
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.ecoFetchDeviceInfoList();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void switchDevice(@Nullable EcoDeviceModel deviceModel) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void unbindDevice(@NotNull String did, @Nullable l callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.unbindDevice(did, callback);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper
    public void bindDevice(@NotNull String mac, @NotNull String model, @Nullable String bleName, @Nullable String oob, @Nullable String shareId, @Nullable String shareUserId, @Nullable String shareDid, @Nullable String shareModel, @NotNull sh7 callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager != null) {
            mEcoRemoteDeviceManager.bindDevice(mac, model, bleName, oob, shareId, shareUserId, shareDid, shareModel, callback);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public EcoDeviceModel findDeviceModel(@NotNull final Function1<? super EcoDeviceModel, Boolean> p) {
        Intrinsics.checkNotNullParameter(p, "p");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        EcoDeviceModelRemote ecoDeviceModelRemoteFindDeviceModel = mEcoRemoteDeviceManager != null ? mEcoRemoteDeviceManager.findDeviceModel(new b.a() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerImpl$findDeviceModel$deviceModel$1
            @Override // com.xiaomi.fitness.eco.device.manager.b
            public boolean predicate(EcoDeviceModelRemote info) {
                Intrinsics.checkNotNullParameter(info, "info");
                Function1<EcoDeviceModel, Boolean> function1 = p;
                a mEcoRemoteDeviceManager2 = this.getMEcoRemoteDeviceManager();
                Intrinsics.checkNotNull(mEcoRemoteDeviceManager2);
                return function1.invoke2(new EcoDeviceModelClient(mEcoRemoteDeviceManager2, info.getDid())).booleanValue();
            }
        }) : null;
        if (ecoDeviceModelRemoteFindDeviceModel == null) {
            return null;
        }
        a mEcoRemoteDeviceManager2 = getMEcoRemoteDeviceManager();
        Intrinsics.checkNotNull(mEcoRemoteDeviceManager2);
        return new EcoDeviceModelClient(mEcoRemoteDeviceManager2, ecoDeviceModelRemoteFindDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public EcoDeviceModel getCurrentDeviceModel() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.toEcoDeviceModel(wearableDeviceModel);
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public EcoDeviceInfo getDeviceInfoInAll(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        EcoDeviceInfo deviceInfoInAll = mEcoRemoteDeviceManager != null ? mEcoRemoteDeviceManager.getDeviceInfoInAll(did) : null;
        if (deviceInfoInAll == null) {
            EcoDeviceModelExtKt.logi("Can't find device with " + did);
        }
        return deviceInfoInAll;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public EcoDeviceModel getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (!isAvailable(did)) {
            return null;
        }
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        Intrinsics.checkNotNull(mEcoRemoteDeviceManager);
        return new EcoDeviceModelClient(mEcoRemoteDeviceManager, did);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public EcoDeviceModel getDeviceModelByMac(@NotNull String mac) {
        EcoDeviceModelRemote deviceModelByMac;
        Intrinsics.checkNotNullParameter(mac, "mac");
        a mEcoRemoteDeviceManager = getMEcoRemoteDeviceManager();
        if (mEcoRemoteDeviceManager == null || (deviceModelByMac = mEcoRemoteDeviceManager.getDeviceModelByMac(mac)) == null) {
            return null;
        }
        a mEcoRemoteDeviceManager2 = getMEcoRemoteDeviceManager();
        Intrinsics.checkNotNull(mEcoRemoteDeviceManager2);
        return new EcoDeviceModelClient(mEcoRemoteDeviceManager2, deviceModelByMac.getDid());
    }
}
