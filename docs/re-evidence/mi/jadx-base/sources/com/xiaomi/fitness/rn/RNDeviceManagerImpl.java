package com.xiaomi.fitness.rn;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback;
import com.xiaomi.fitness.mijia.sdk.data.MiJiaScanDevice;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.RNDeviceManagerImpl;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.bean.RNDeviceInfo;
import com.xiaomi.fitness.rn.export.bean.RNDeviceParameter;
import com.xiaomi.fitness.rn.export.extensions.RnSettingsExportApiExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.log.RnPluginLog;
import com.xiaomi.fitness.rn.models.PluginDeviceModel;
import com.xiaomi.fitness.rn.models.RNDeviceModelWrapper;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.fitness.rn.sdk.RnPersistManager;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.RnCallbackHelper;
import defpackage.n1i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\bw\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u001fJY\u0010(\u001a\u00020\u00052,\u0010$\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010!j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0002\u0018\u0001`#2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0005\u0018\u00010!j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u001fJE\u0010+\u001a\u00020\u00052\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050!j\b\u0012\u0004\u0012\u00020\u0010`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050!j\u0002`&H\u0016¢\u0006\u0004\b+\u0010)J]\u00100\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00102\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00050!j\b\u0012\u0004\u0012\u00020/`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050!j\u0002`&H\u0016¢\u0006\u0004\b0\u00101J]\u00102\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00102\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00050!j\b\u0012\u0004\u0012\u00020/`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050!j\u0002`&H\u0016¢\u0006\u0004\b2\u00101JE\u00103\u001a\u00020\u00052\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050!j\b\u0012\u0004\u0012\u00020\u0010`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050!j\u0002`&H\u0016¢\u0006\u0004\b3\u0010)JM\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00102\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00050!j\b\u0012\u0004\u0012\u00020/`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050!j\u0002`&H\u0016¢\u0006\u0004\b5\u00106J'\u0010;\u001a\u00020\u00052\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020,2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J%\u0010>\u001a\u0004\u0018\u00010\"2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020/0!H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b@\u0010\u001fJ\u0017\u0010A\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010\u001fJ\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020\"0\u0002H\u0016¢\u0006\u0004\bE\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020\"0\u0002H\u0016¢\u0006\u0004\bF\u0010DJ\u0017\u0010G\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bG\u0010\u001fJ\u0011\u0010H\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00052\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010PJ9\u0010W\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00050T2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00050!H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020,H\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b[\u0010\\J4\u0010_\u001a\u00020\u00052#\u0010K\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00050!H\u0016¢\u0006\u0004\b_\u0010`J4\u0010a\u001a\u00020\u00052#\u0010K\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00050!H\u0016¢\u0006\u0004\ba\u0010`J\u001f\u0010f\u001a\u00020\u00052\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ!\u0010i\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010e\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR \u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010Z¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/rn/RNDeviceManagerImpl;", "Lcom/xiaomi/fitness/rn/export/RNDeviceManager;", "", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "devices", "", "onRequestDeviceListSuccess", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "getDeviceInfos", "(Ljava/util/List;)Ljava/util/List;", "initDeviceModels", "device", "Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "initDeviceModel", "(Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;)Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "", "did", "getDeviceModelInternal", "(Ljava/lang/String;)Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "clearAllModel", "()V", "getDeviceInfo", "(Lcom/xiaomi/fitness/rn/export/bean/RNDevice;)Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "notifyDeviceChange", "deviceModel", "Lcom/xiaomi/smarthome/device/Device;", "getDevice", "(Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;)Lcom/xiaomi/smarthome/device/Device;", "mac", "doRnActionOnBindSuccess", "(Ljava/lang/String;)V", "removeDevice", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "openPlugin", "getBindKey", "", "privacyId", "privacyVersion", "", "revokePrivacy", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptPrivacy", "getCommonConfig", "value", "setCommonConfig", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "result", AccountInteractActivity.KEY_REQUEST_CODE, "Landroid/content/Intent;", "data", "revokeSuccessResult", "(IILandroid/content/Intent;)V", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "connectDevice", "disconnectDevice", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getDeviceList", "()Ljava/util/List;", "getDeviceModels", "getLocalDeviceModels", "removeDeviceModel", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;)V", "removeDeviceStatusListener", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "getDeviceInfoInAll", "(Ljava/lang/String;)Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "getDeviceModelByMac", "Lkotlin/Function0;", "success", "fail", "deauthorize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getDeviceSize", "()I", "switchDevice", "(Lcom/xiaomi/fitness/rn/export/RNDeviceModel;)V", "Lkotlin/ParameterName;", "name", "removeDeviceChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "addDeviceChangeListener", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "Lcom/xiaomi/fitness/rn/RNDeviceContainer;", "mDeviceContainer", "Lcom/xiaomi/fitness/rn/RNDeviceContainer;", "Ljava/util/concurrent/ConcurrentHashMap;", "mDeviceModels", "Ljava/util/concurrent/ConcurrentHashMap;", "mCurrentDeviceModel", "Lcom/xiaomi/fitness/rn/models/RNDeviceModelWrapper;", "isConnected", "()Z", "getDeviceStatus", "deviceStatus", "<init>", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRNDeviceManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNDeviceManagerImpl.kt\ncom/xiaomi/fitness/rn/RNDeviceManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1863#2,2:401\n1863#2,2:403\n1863#2,2:406\n1#3:405\n*S KotlinDebug\n*F\n+ 1 RNDeviceManagerImpl.kt\ncom/xiaomi/fitness/rn/RNDeviceManagerImpl\n*L\n74#1:401,2\n99#1:403,2\n298#1:406,2\n*E\n"})
public final class RNDeviceManagerImpl extends RNDeviceManager {

    @Nullable
    private volatile RNDeviceModelWrapper mCurrentDeviceModel;

    @NotNull
    private final RNDeviceContainer mDeviceContainer = new RNDeviceContainer();

    @NotNull
    private final ConcurrentHashMap<String, RNDeviceModelWrapper> mDeviceModels = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptPrivacy$lambda$4(Function1 onSuccess, boolean z) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        if (z) {
            RNLogKt.logi("acceptPrivacy success");
        }
        onSuccess.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final void clearAllModel() {
        this.mDeviceModels.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRnActionOnBindSuccess(final String mac) {
        DeviceManager.DefaultImpls.requestDeviceList$default(this, new Function1() { // from class: g7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.doRnActionOnBindSuccess$lambda$11(mac, (List) obj);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRnActionOnBindSuccess$lambda$11(String mac, List deviceModels) {
        Object next;
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        Iterator it = deviceModels.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(DeviceModelExtKt.getMac((RNDeviceModel) next), mac));
        RNDeviceModel rNDeviceModel = (RNDeviceModel) next;
        if (rNDeviceModel != null) {
            RnPluginLog.INSTANCE.i("onBindSuccess, and delDevicePrivacyNativeData(" + rNDeviceModel.getDid() + ")");
            RnPersistManager.INSTANCE.delDevicePrivacyNativeData(rNDeviceModel.getDid());
        }
        return Unit.INSTANCE;
    }

    private final Device getDevice(RNDeviceModelWrapper deviceModel) {
        Device device = new Device();
        device.did = deviceModel.getDid();
        device.model = DeviceModelExtKt.getModel(deviceModel);
        device.name = DeviceModelExtKt.getName(deviceModel);
        device.pid = deviceModel.getDeviceInfo().getProductId();
        device.mac = DeviceModelExtKt.getMac(deviceModel);
        device.sn = DeviceModelExtKt.getIdentifier(deviceModel);
        T t = deviceModel.getDeviceInfo().device;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.rn.export.bean.RNDevice");
        RNDevice rNDevice = (RNDevice) t;
        device.setExtraInfo(rNDevice.getExtraJson());
        device.permitLevel = rNDevice.getPermitLevel();
        device.ownerId = rNDevice.getOwnerId();
        device.ownerName = rNDevice.getOwnerName();
        device.isOnline = rNDevice.getIsOnline();
        device.setOwner(deviceModel.isOwner());
        return device;
    }

    private final RNDeviceInfo getDeviceInfo(RNDevice device) {
        RNProductManager productExtKt = ProductExtKt.getInstance(RNProductManager.INSTANCE);
        RNDeviceInfo rNDeviceInfo = new RNDeviceInfo();
        rNDeviceInfo.device = device;
        rNDeviceInfo.setProduct(productExtKt.getProductByModel(device.getModel()));
        Map<String, String> extraValues = device.getExtraValues();
        String str = extraValues != null ? extraValues.get("extraJson") : null;
        if (str != null && str.length() != 0) {
            rNDeviceInfo.setFirmwareVersion(new JSONObject(str).optString("fw_version"));
        }
        return rNDeviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceInfoInAll$lambda$5(String did, RNDeviceModel it) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), did);
    }

    private final synchronized List<RNDeviceInfo> getDeviceInfos(List<RNDevice> devices) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            RNProductManager productExtKt = ProductExtKt.getInstance(RNProductManager.INSTANCE);
            for (RNDevice rNDevice : devices) {
                RNDeviceInfo rNDeviceInfo = new RNDeviceInfo();
                rNDeviceInfo.device = rNDevice;
                rNDeviceInfo.setProduct(productExtKt.getProductByModel(rNDevice.getModel()));
                Map<String, String> extraValues = rNDevice.getExtraValues();
                String str = extraValues != null ? extraValues.get("extraJson") : null;
                if (str != null && str.length() != 0) {
                    rNDeviceInfo.setFirmwareVersion(new JSONObject(str).optString("fw_version"));
                }
                arrayList.add(rNDeviceInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$7(String mac, RNDeviceModel it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DeviceModelExtKt.getMac(it), mac);
    }

    private final synchronized RNDeviceModelWrapper getDeviceModelInternal(String did) {
        if (did != null) {
            if (did.length() != 0) {
                return this.mDeviceModels.get(did);
            }
        }
        return null;
    }

    private final synchronized RNDeviceModelWrapper initDeviceModel(RNDeviceInfo device) {
        RNDeviceModelWrapper deviceModelInternal;
        try {
            RNLogKt.logi("initDeviceModel() called with: device = " + device);
            deviceModelInternal = getDeviceModelInternal(device.getDid());
            if (deviceModelInternal == null) {
                deviceModelInternal = new PluginDeviceModel(device);
            } else {
                deviceModelInternal.initByModelDevice(device);
            }
        } catch (Throwable th) {
            throw th;
        }
        return deviceModelInternal;
    }

    private final synchronized void initDeviceModels(List<RNDeviceInfo> devices) {
        Integer numValueOf;
        if (devices != null) {
            try {
                numValueOf = Integer.valueOf(devices.size());
            } catch (Throwable th) {
                throw th;
            }
        } else {
            numValueOf = null;
        }
        RNLogKt.logi("init DeviceModels by devices(size=" + numValueOf + ")");
        List<RNDeviceInfo> list = devices;
        if (list == null || list.isEmpty()) {
            clearAllModel();
        } else {
            HashMap map = new HashMap();
            for (RNDeviceInfo rNDeviceInfo : devices) {
                RNDeviceModelWrapper rNDeviceModelWrapperInitDeviceModel = initDeviceModel(rNDeviceInfo);
                this.mDeviceModels.remove(rNDeviceInfo.getDid());
                if (rNDeviceModelWrapperInitDeviceModel != null) {
                    map.put(rNDeviceInfo.getDid(), rNDeviceModelWrapperInitDeviceModel);
                }
            }
            clearAllModel();
            this.mDeviceModels.putAll(map);
        }
        notifyDeviceChange();
    }

    private final void notifyDeviceChange() {
        Iterator<T> it = getMDeviceChangeListeners().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(this.mCurrentDeviceModel);
        }
    }

    private final void onRequestDeviceListSuccess(List<RNDevice> devices) {
        RNLogKt.logi("request device list success " + devices.size());
        if (!devices.isEmpty()) {
            initDeviceModels(getDeviceInfos(devices));
            return;
        }
        clearAllModel();
        this.mCurrentDeviceModel = null;
        notifyDeviceChange();
    }

    private final void removeDevice(String did) {
        this.mDeviceContainer.removeDevice(did);
        RNDeviceModelWrapper rNDeviceModelWrapperRemove = this.mDeviceModels.remove(did);
        if (rNDeviceModelWrapperRemove == null) {
            return;
        }
        RNDeviceModelWrapper rNDeviceModelWrapper = this.mCurrentDeviceModel;
        if (Intrinsics.areEqual(rNDeviceModelWrapper != null ? rNDeviceModelWrapper.getDid() : null, did)) {
            RNDeviceModelWrapper rNDeviceModelWrapper2 = this.mCurrentDeviceModel;
            if (rNDeviceModelWrapper2 != null) {
                rNDeviceModelWrapper2.destroy(true);
            }
            this.mCurrentDeviceModel = null;
        } else {
            rNDeviceModelWrapperRemove.destroy(true);
        }
        notifyDeviceChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceList$lambda$0(RNDeviceManagerImpl this$0, Function1 function1, List devices) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(devices, "devices");
        this$0.onRequestDeviceListSuccess(devices);
        if (function1 != null) {
            function1.invoke2(this$0.getDeviceModels());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit revokePrivacy$lambda$3(RNDeviceManagerImpl this$0, String did, Function1 onSuccess, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        if (z) {
            this$0.removeDevice(did);
        }
        onSuccess.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindDevice$lambda$12(RNDeviceManagerImpl this$0, String did, l lVar, boolean z) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        if (z) {
            this$0.removeDevice(did);
            if (lVar != null) {
                lVar.onSuccess();
            }
        } else if (lVar != null) {
            lVar.onFail(-1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindDevice$lambda$13(l lVar, ApiException it) throws RemoteException {
        Intrinsics.checkNotNullParameter(it, "it");
        if (lVar != null) {
            lVar.onFail(it.getErrorCode());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void acceptPrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSDKCompat.INSTANCE.getInstance().acceptPrivacy(did, privacyId, privacyVersion, new Function1() { // from class: f7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.acceptPrivacy$lambda$4(onSuccess, ((Boolean) obj).booleanValue());
            }
        }, onFail);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceChangeListener(@NotNull Function1<? super RNDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMDeviceChangeListeners().add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void bindDevice(@NotNull final DeviceParameter parameter, @NotNull final a callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(parameter instanceof RNDeviceParameter)) {
            RNLogKt.loge("bind plugin device requires RNDeviceParameter");
            callback.onBindFailure(-1);
        } else {
            RNDeviceParameter rNDeviceParameter = (RNDeviceParameter) parameter;
            MiJiaSDKCompat.INSTANCE.getInstance().startBindDevice(new MiJiaScanDevice(rNDeviceParameter.getPacket(), rNDeviceParameter.getMac(), null, rNDeviceParameter.getModel(), System.currentTimeMillis(), ""), new MiJiaBleBindCallback() { // from class: com.xiaomi.fitness.rn.RNDeviceManagerImpl.bindDevice.1
                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback
                public void onAuthResponse(int code, Bundle args) throws RemoteException {
                    if (code == 0) {
                        callback.onPairingSuccess(null);
                    } else {
                        callback.onPairingFailure(code);
                    }
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback
                public void onBindResponse(int code, Bundle args) throws RemoteException {
                    if (code != 0) {
                        callback.onBindFailure(code);
                    } else {
                        this.doRnActionOnBindSuccess(((RNDeviceParameter) parameter).getMac());
                        callback.onBindSuccess("");
                    }
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback
                public void onConnectResponse(int code, Bundle args) throws RemoteException {
                    if (code == 0) {
                        callback.onConnectSuccess();
                    } else {
                        callback.onConnectFailure(code);
                    }
                }

                @Override // com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback
                public void onLastResponse(int code, Bundle args) {
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void connectDevice(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void deauthorize(@NotNull String did, @NotNull Function0<Unit> success, @NotNull Function1<? super Integer, Unit> fail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void disconnectDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public /* bridge */ /* synthetic */ DeviceModel findDeviceModel(Function1 function1) {
        return findDeviceModel((Function1<? super RNDeviceModel, Boolean>) function1);
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void getBindKey(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSDKCompat.INSTANCE.getInstance().getBindKey(onSuccess, onFail);
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void getCommonConfig(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSDKCompat.INSTANCE.getInstance().getCommonConfig(onSuccess, onFail);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public RNDeviceModel getCurrentDeviceModel() {
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<com.xiaomi.fitness.device.manager.bean.Device> getDeviceList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<RNDeviceModel> getDeviceModels() {
        Collection<RNDeviceModelWrapper> collectionValues = this.mDeviceModels.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt___CollectionsKt.toList(collectionValues);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceSize() {
        return this.mDeviceModels.size();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceStatus() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<RNDeviceModel> getLocalDeviceModels() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public boolean isConnected() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void openPlugin(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        RNDeviceModelWrapper rNDeviceModelWrapper = this.mDeviceModels.get(did);
        if (rNDeviceModelWrapper != null) {
            RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE).onPluginOpened(rNDeviceModelWrapper);
            n1i.b().d(getDevice(rNDeviceModelWrapper));
            return;
        }
        RnPluginLog.INSTANCE.i("Can not find device with did(" + did + ")");
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceChangeListener(@NotNull Function1<? super RNDeviceModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMDeviceChangeListeners().remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.mDeviceModels.remove(did);
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager, com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void requestDeviceList(@Nullable final Function1<? super List<? extends RNDeviceModel>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) {
        this.mDeviceContainer.requestBindDeviceList(new Function1() { // from class: h7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.requestDeviceList$lambda$0(this.f19779a, onSuccess, (List) obj);
            }
        }, onFail);
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void revokePrivacy(@NotNull final String did, int privacyId, @NotNull String privacyVersion, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSDKCompat.INSTANCE.getInstance().revokePrivacy(did, privacyId, privacyVersion, new Function1() { // from class: l7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.revokePrivacy$lambda$3(this.f24745a, did, onSuccess, ((Boolean) obj).booleanValue());
            }
        }, onFail);
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void revokeSuccessResult(int result, int requestCode, @NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RnCallbackHelper.getInstance().onActivityResult(result, requestCode, data);
    }

    @Override // com.xiaomi.fitness.rn.export.RNDeviceManager
    public void setCommonConfig(@NotNull String value, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSDKCompat.INSTANCE.getInstance().setCommonConfig(value, onSuccess, onFail);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void switchDevice(@Nullable RNDeviceModel deviceModel) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void unbindDevice(@NotNull final String did, @Nullable final l callback) {
        Product product;
        Intrinsics.checkNotNullParameter(did, "did");
        RNDeviceModelWrapper rNDeviceModelWrapper = this.mDeviceModels.get(did);
        MiJiaSDKCompat.INSTANCE.getInstance().deleteDevice(did, (rNDeviceModelWrapper == null || (product = rNDeviceModelWrapper.getProduct()) == null) ? -1 : product.getProductId(), null, new Function1() { // from class: i7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.unbindDevice$lambda$12(this.f20861a, did, callback, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: j7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceManagerImpl.unbindDevice$lambda$13(callback, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public RNDeviceModel findDeviceModel(@NotNull Function1<? super RNDeviceModel, Boolean> p) {
        Object next;
        Intrinsics.checkNotNullParameter(p, "p");
        Collection<RNDeviceModelWrapper> collectionValues = this.mDeviceModels.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p.invoke2(next).booleanValue()) {
                return (RNDeviceModel) next;
            }
        }
        next = null;
        return (RNDeviceModel) next;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public RNDeviceInfo getDeviceInfoInAll(@NotNull final String did) {
        RNDevice device;
        Intrinsics.checkNotNullParameter(did, "did");
        RNDeviceModel rNDeviceModelFindDeviceModel = findDeviceModel(new Function1() { // from class: e7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(RNDeviceManagerImpl.getDeviceInfoInAll$lambda$5(did, (RNDeviceModel) obj));
            }
        });
        if (rNDeviceModelFindDeviceModel == null || (device = rNDeviceModelFindDeviceModel.getDevice()) == null) {
            return null;
        }
        return getDeviceInfo(device);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public RNDeviceModel getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return this.mDeviceModels.get(did);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public RNDeviceModel getDeviceModelByMac(@NotNull final String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return findDeviceModel(new Function1() { // from class: k7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(RNDeviceManagerImpl.getDeviceModelByMac$lambda$7(mac, (RNDeviceModel) obj));
            }
        });
    }
}
