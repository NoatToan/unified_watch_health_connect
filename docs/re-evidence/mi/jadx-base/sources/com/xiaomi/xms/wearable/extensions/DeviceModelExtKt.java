package com.xiaomi.xms.wearable.extensions;

import android.content.pm.PackageManager;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import defpackage.acp;
import defpackage.bcp;
import defpackage.ccp;
import defpackage.eu6;
import defpackage.fcp;
import defpackage.gcp;
import defpackage.jcp;
import defpackage.lg1;
import defpackage.mwo;
import defpackage.qxg;
import defpackage.rxg;
import defpackage.s7r;
import defpackage.txo;
import defpackage.xbp;
import defpackage.xg1;
import defpackage.ybp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\n\u001a\u00020\b*\u00020\u00002 \u0010\t\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0010¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0010¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\b*\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010¢\u0006\u0004\b\u001a\u0010\u0018\u001a!\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010\"\u001a\u00020\b*\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010$\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a9\u0010'\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b'\u0010(\u001a;\u0010*\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-\u001a-\u00101\u001a\u00020\b*\u00020\u00002\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0.¢\u0006\u0002\b/H\u0082\b¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "isSupportThirdPartyApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "Lkotlin/Function2;", "", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "", "", "callback", "getInstalledWatchApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function2;)V", "", "packageName", CommonConstants.KEY_VERSION_CODE, "packageSize", "Leu6;", "prepareInstallApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;IILeu6;)V", "", "fingerprint", "uninstallApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;[BLeu6;)V", "isWearAppInstalled", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Leu6;)V", "Lmwo;", "queryStatus", "Lccp;", "info", "isConnected", "syncPhoneAppStatus", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lccp;Z)V", "Lrxg$d;", "notifyDataList", "addNotifications", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lrxg$d;)V", "findDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", SportRecordBundleKey.BUNDLE_PARAM_URI, "launchApp", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Ljava/lang/String;[BLeu6;)V", "message", "sendPhoneMessage", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;[B[BLeu6;)V", "isAppInstalled", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "checkBleDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "xmswearable_release"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/xms/wearable/extensions/DeviceModelExtKt\n*L\n1#1,299:1\n294#1,6:300\n294#1,6:306\n294#1,6:312\n294#1,6:318\n*S KotlinDebug\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/xms/wearable/extensions/DeviceModelExtKt\n*L\n181#1:300,6\n194#1:306,6\n216#1:312,6\n249#1:318,6\n*E\n"})
public final class DeviceModelExtKt {
    public static final void addNotifications(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull rxg.d notifyDataList) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(notifyDataList, "notifyDataList");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            Logger.w("error :currentDevice is not bluetooth", new Object[0]);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 0;
        qxg qxgVar = new qxg();
        qxgVar.z(notifyDataList);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    private static final void checkBleDevice(WearableDeviceModel wearableDeviceModel, Function1<? super WearableDeviceModel, Unit> function1) {
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            function1.invoke2(wearableDeviceModel);
        } else {
            Logger.w("error :currentDevice is not bluetooth", new Object[0]);
        }
    }

    public static final void findDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            Logger.w("error :currentDevice is not bluetooth", new Object[0]);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 18;
        txo txoVar = new txo();
        txoVar.X(0);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt$findDevice$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
            }
        }, 0, 16, (Object) null);
    }

    public static final void getInstalledWatchApp(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final Function2<? super List<WatchAppItemEntity>, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            callback.invoke(null, -1);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 0;
        final String did = wearableDeviceModel.getDid();
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt.getInstalledWatchApp.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                lg1.d("getInstalledWatchApp from device onError code:" + code);
                callback.invoke(null, Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                s7r packet;
                jcp jcpVarF;
                acp.a aVarO;
                acp[] acpVarArr;
                if (result == null || (packet = result.getPacket()) == null || (jcpVarF = packet.F()) == null || (aVarO = jcpVarF.o()) == null || (acpVarArr = aVarO.c) == null) {
                    onError(did2, type, 1);
                    return;
                }
                String str = did;
                ArrayList arrayList = new ArrayList(acpVarArr.length);
                for (acp acpVar : acpVarArr) {
                    WatchAppItemEntity.Companion companion = WatchAppItemEntity.INSTANCE;
                    Intrinsics.checkNotNull(acpVar);
                    arrayList.add(WatchAppItemEntityExtKt.valueOf(companion, acpVar, str));
                }
                Function2<List<WatchAppItemEntity>, Integer, Unit> function2 = callback;
                lg1.d("getInstalledWatchApp from device onSuccess size:" + arrayList.size());
                function2.invoke(arrayList, 0);
            }
        }, 0, 8, null);
    }

    private static final boolean isAppInstalled(String str) {
        xg1.d("isAppInstalled:" + str);
        try {
            ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(str, 0);
            xg1.d("isAppInstalled:true");
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            xg1.c("isAppInstalled packageName:" + str, e);
            return false;
        }
    }

    public static final boolean isSupportThirdPartyApp(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.THIRD_PARTY_APP) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.THIRD_PARTY_APP_NO_MARKET);
    }

    public static final void isWearAppInstalled(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final eu6<List<WatchAppItemEntity>> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getInstalledWatchApp(wearableDeviceModel, new Function2() { // from class: na6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceModelExtKt.isWearAppInstalled$lambda$8(callback, (List) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isWearAppInstalled$lambda$8(eu6 callback, List list, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (list != null) {
            callback.onResult(list);
        } else {
            callback.onError(i);
        }
        return Unit.INSTANCE;
    }

    public static final void launchApp(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String packageName, @NotNull String uri, @Nullable byte[] bArr, @NotNull final eu6<Unit> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            Logger.w("error :currentDevice is not bluetooth", new Object[0]);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 4;
        ccp ccpVar = new ccp();
        ccpVar.c = packageName;
        ccpVar.d = bArr;
        fcp fcpVar = new fcp();
        fcpVar.c = ccpVar;
        fcpVar.d = uri;
        jcp jcpVar = new jcp();
        jcpVar.E(fcpVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt$launchApp$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                callback.onResult(Unit.INSTANCE);
            }
        }, 0, 8, null);
    }

    public static final void prepareInstallApp(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String packageName, int i, int i2, @NotNull final eu6<Integer> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 20;
            s7rVar.f = 1;
            xbp xbpVar = new xbp();
            xbpVar.c = packageName;
            xbpVar.d = i;
            xbpVar.e = i2;
            jcp jcpVar = new jcp();
            jcpVar.D(xbpVar);
            s7rVar.d0(jcpVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt.prepareInstallApp.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    callback.onError(code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    jcp jcpVarF;
                    ybp ybpVarR;
                    if (result == null || (packet = result.getPacket()) == null || (jcpVarF = packet.F()) == null || (ybpVarR = jcpVarF.r()) == null) {
                        onError(did, type, -1);
                        return;
                    }
                    eu6<Integer> eu6Var = callback;
                    int i3 = ybpVarR.c;
                    lg1.d("prepareInstallThirdApp  status: " + i3 + " expectedSliceLength:" + ybpVarR.d + "  prepareStatus:" + i3);
                    int i4 = ybpVarR.c;
                    if (i4 == 0) {
                        eu6Var.onResult(Integer.valueOf(ybpVarR.d));
                    } else {
                        onError(did, type, i4);
                    }
                }
            }, 0, 8, null);
        }
    }

    public static final void queryStatus(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final eu6<mwo> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 78;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt.queryStatus.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    callback.onError(code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    txo txoVarE;
                    mwo mwoVarB;
                    if (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (mwoVarB = txoVarE.B()) == null) {
                        onError(did, type, 255);
                    } else {
                        callback.onResult(mwoVarB);
                    }
                }
            }, 0, 8, null);
        }
    }

    public static final void sendPhoneMessage(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String packageName, @Nullable byte[] bArr, @Nullable byte[] bArr2, @NotNull final eu6<Unit> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            Logger.w("error :currentDevice is not bluetooth", new Object[0]);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 8;
        ccp ccpVar = new ccp();
        ccpVar.c = packageName;
        ccpVar.d = bArr;
        gcp gcpVar = new gcp();
        gcpVar.d = bArr2;
        gcpVar.c = ccpVar;
        jcp jcpVar = new jcp();
        jcpVar.F(gcpVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt$sendPhoneMessage$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                callback.onResult(Unit.INSTANCE);
            }
        }, 0, 8, null);
    }

    public static final void syncPhoneAppStatus(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull ccp info, final boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            final s7r s7rVar = new s7r();
            s7rVar.e = 20;
            s7rVar.f = 7;
            bcp bcpVar = new bcp();
            int i = z ? 1 : 2;
            bcpVar.d = i;
            if (i == 2) {
                String packageName = info.c;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (!isAppInstalled(packageName)) {
                    bcpVar.d = 3;
                }
            }
            bcpVar.c = info;
            jcp jcpVar = new jcp();
            jcpVar.z(bcpVar);
            s7rVar.d0(jcpVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt.syncPhoneAppStatus.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    xg1.d("onError isConnected:" + z + "  status: = " + s7rVar.F().p().d + "  code: " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    xg1.d("isConnected:" + z + "  status: = " + s7rVar.F().p().d + "  code: " + (result != null ? Integer.valueOf(result.getCode()) : null));
                }
            }, 0, 8, null);
        }
    }

    public static final void uninstallApp(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String packageName, @NotNull byte[] fingerprint, @NotNull final eu6<Unit> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 20;
            s7rVar.f = 3;
            ccp ccpVar = new ccp();
            ccpVar.c = packageName;
            ccpVar.d = fingerprint;
            jcp jcpVar = new jcp();
            jcpVar.A(ccpVar);
            s7rVar.d0(jcpVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.xms.wearable.extensions.DeviceModelExtKt.uninstallApp.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    callback.onError(code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    callback.onResult(null);
                }
            }, 0, 8, null);
        }
    }
}
