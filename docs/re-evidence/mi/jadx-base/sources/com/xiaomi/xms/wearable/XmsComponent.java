package com.xiaomi.xms.wearable;

import android.content.Intent;
import com.autonavi.minimap.wearable.AMapWearableConnector;
import com.google.gson.Gson;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.xms.wearable.XmsComponent;
import com.xiaomi.xms.wearable.amap.AmapConnectProvider;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.extensions.WatchAppItemEntityExtKt;
import com.xiaomi.xms.wearable.request.XmsRequest;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import com.xiaomi.xms.wearable.ui.appshop.model.GetWeichatLicense;
import com.xiaomi.xms.wearable.utils.DeviceContactUtilsKt;
import com.xiaomi.xms.wearable.utils.MarketHandler;
import defpackage.acp;
import defpackage.ccp;
import defpackage.gcp;
import defpackage.lg1;
import defpackage.owo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.xg1;
import defpackage.zbp;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/xiaomi/xms/wearable/XmsComponent;", "", "<init>", "()V", "mDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "getMDataHandler", "()Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "mDataHandler$delegate", "Lkotlin/Lazy;", "mInstallResultHandler", "getMInstallResultHandler", "mInstallResultHandler$delegate", "appRepository", "Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "getAppRepository", "()Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "appRepository$delegate", "marketHandler", "Lcom/xiaomi/xms/wearable/utils/MarketHandler;", "getMarketHandler", "()Lcom/xiaomi/xms/wearable/utils/MarketHandler;", "marketHandler$delegate", "initThirdAppInstallResult", "", "initThirdApp", "notifyConnectedStatusChanged", "did", "", "isConnected", "", "InstallResultHandler", "XmsDataHandler", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "三方应用")
public final class XmsComponent {

    @NotNull
    public static final String TAG = "XmsComponent";

    /* JADX INFO: renamed from: mDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: osr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmsComponent.mDataHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mInstallResultHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mInstallResultHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: psr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmsComponent.mInstallResultHandler_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: appRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qsr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmsComponent.appRepository_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: marketHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy marketHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rsr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XmsComponent.marketHandler_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/xms/wearable/XmsComponent$InstallResultHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "Ls7r;", "packet", "", "handleInstallResult", "(Ls7r;)Z", "", "handleInstallResultPacket", "(Ls7r;)V", "", "did", "", "type", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    public static final class InstallResultHandler extends DataHandlerWrapper {
        private final boolean handleInstallResult(s7r packet) {
            if (packet.f != 2) {
                return false;
            }
            handleInstallResultPacket(packet);
            return true;
        }

        private final void handleInstallResultPacket(s7r packet) {
            zbp zbpVarS = packet.F().s();
            String strP = zbpVarS != null ? zbpVarS.p() : null;
            Integer numValueOf = zbpVarS != null ? Integer.valueOf(zbpVarS.e) : null;
            lg1.d("handleInstallResultPacket code:" + numValueOf + " packageName:" + strP + " appItem:" + zbpVarS.o() + " ");
            if (Integer.valueOf(zbpVarS.e).intValue() != 0) {
                if (strP != null) {
                    AppStatusManager.updateStatus$default(AppStatusManager.INSTANCE.getINSTANCE(), strP, 12, 0, null, 12, null);
                }
                lg1.d("handleInstallResultPacket install fail packageName:" + strP);
                return;
            }
            final acp acpVarO = zbpVarS.o();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
            if (acpVarO == null || did == null) {
                return;
            }
            WatchAppRepository.INSTANCE.getInstance().insertWatchAppWithCallback(WatchAppItemEntityExtKt.valueOf(WatchAppItemEntity.INSTANCE, acpVarO, did), new Function1() { // from class: ssr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return XmsComponent.InstallResultHandler.handleInstallResultPacket$lambda$1(acpVarO, ((Boolean) obj).booleanValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleInstallResultPacket$lambda$1(acp acpVar, boolean z) {
            lg1.d("handleInstallResultPacket insertWatchAppWithCallback success:" + z);
            AppStatusManager instance = AppStatusManager.INSTANCE.getINSTANCE();
            if (z) {
                String packageName = acpVar.c;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                AppStatusManager.updateStatus$default(instance, packageName, 11, 0, null, 12, null);
                String packageName2 = acpVar.c;
                Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                AppStatusManager.updateStatus$default(instance, packageName2, 1, 0, null, 12, null);
            } else {
                String packageName3 = acpVar.c;
                Intrinsics.checkNotNullExpressionValue(packageName3, "packageName");
                AppStatusManager.updateStatus$default(instance, packageName3, 12, 0, null, 12, null);
            }
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            boolean zIsSupportThirdPartyApp = wearableDeviceModel != null ? DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModel) : false;
            lg1.d("InstallResultHandler handlePacket " + type + " " + (packet != null ? Integer.valueOf(packet.f) : null) + " " + zIsSupportThirdPartyApp);
            if (!zIsSupportThirdPartyApp) {
                return false;
            }
            if (packet != null) {
                try {
                    if (type == 20) {
                        return handleInstallResult(packet);
                    }
                    lg1.b("handlePacket error:unsupported type " + type);
                } catch (Exception e) {
                    lg1.c("handlePacket error:", e);
                }
            } else {
                lg1.b("handlePacket error: packet is null");
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/xms/wearable/XmsComponent$XmsDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "Ls7r;", "packet", "", "did", "", "handleThirdAppPacket", "(Ls7r;Ljava/lang/String;)Z", "handleSystemPacket", "(Ls7r;)Z", "", "type", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nXmsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmsComponent.kt\ncom/xiaomi/xms/wearable/XmsComponent$XmsDataHandler\n+ 2 DeviceUtils.kt\ncom/xiaomi/xms/wearable/utils/DeviceUtilsKt\n*L\n1#1,304:1\n7#2,7:305\n*S KotlinDebug\n*F\n+ 1 XmsComponent.kt\ncom/xiaomi/xms/wearable/XmsComponent$XmsDataHandler\n*L\n260#1:305,7\n*E\n"})
    public static final class XmsDataHandler extends DataHandlerWrapper {
        private final boolean handleSystemPacket(s7r packet) {
            if (packet.f == 79) {
                txo txoVarE = packet.E();
                owo owoVarC = txoVarE != null ? txoVarE.C() : null;
                xg1.d("report basic status:" + owoVarC);
                Intent intent = new Intent();
                intent.setClass(ApplicationExtKt.getApplication().getApplicationContext(), WearableXmsService.class);
                intent.putExtra(WearableXmsService.PARAM_PACKET_ID, packet.f);
                intent.putExtra(WearableXmsService.PARAM_BASIC_REPORT, new Gson().toJson(owoVarC));
                ApplicationExtKt.getApplication().startService(intent);
            }
            return false;
        }

        private final boolean handleThirdAppPacket(s7r packet, final String did) {
            int i = packet.f;
            if (i == 6) {
                xg1.d("request phone app status");
                ccp ccpVarQ = packet.F().q();
                FitnessSyncer fitnessSyncExtKt = FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
                String packageName = ccpVarQ.c;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (fitnessSyncExtKt.isBloodSugarThirdParty(packageName)) {
                    xg1.d("REQUEST_PHONE_APP_STATUS: blood sugar, health app handle");
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel != null) {
                        Intrinsics.checkNotNull(ccpVarQ);
                        DeviceModelExtKt.syncPhoneAppStatus(wearableDeviceModel, ccpVarQ, true);
                    }
                    return true;
                }
                Intent intent = new Intent();
                intent.setClass(ApplicationExtKt.getApplication().getApplicationContext(), WearableXmsService.class);
                intent.putExtra(WearableXmsService.PARAM_PACKET_ID, packet.f);
                intent.putExtra(WearableXmsService.PARAM_PACKAGE_NAME, ccpVarQ.c);
                intent.putExtra(WearableXmsService.PARAM_FINGERPRINT, ccpVarQ.d);
                ApplicationExtKt.getApplication().startService(intent);
                return true;
            }
            if (i != 9) {
                if (i != 10) {
                    return false;
                }
                xg1.d("request weichat license did:" + did);
                new XmsRequest().getWeichatLicense(did, new Function1<GetWeichatLicense, Unit>() { // from class: com.xiaomi.xms.wearable.XmsComponent$XmsDataHandler$handleThirdAppPacket$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(GetWeichatLicense getWeichatLicense) {
                        invoke2(getWeichatLicense);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(GetWeichatLicense getWeichatLicense) {
                        Intrinsics.checkNotNullParameter(getWeichatLicense, "getWeichatLicense");
                        String str = did;
                        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                        xg1.d("sendWeicharLicense2Device " + wearableDeviceModel2 + " " + (wearableDeviceModel2 != null ? wearableDeviceModel2.getDid() : null) + " " + str);
                        if (wearableDeviceModel2 == null || !Intrinsics.areEqual(wearableDeviceModel2.getDid(), str)) {
                            return;
                        }
                        DeviceContactUtilsKt.sendWeicharLicense2Device(getWeichatLicense);
                    }
                }, new Function1() { // from class: tsr
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return XmsComponent.XmsDataHandler.handleThirdAppPacket$lambda$4((String) obj);
                    }
                });
                return true;
            }
            xg1.d("send message 2 phone third app");
            gcp gcpVarT = packet.F().t();
            FitnessSyncer fitnessSyncExtKt2 = FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
            String packageName2 = gcpVarT.c.c;
            Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
            if (fitnessSyncExtKt2.isBloodSugarThirdParty(packageName2)) {
                xg1.d("SEND_WEAR_MESSAGE: blood sugar 3 app, return");
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setClass(ApplicationExtKt.getApplication().getApplicationContext(), WearableXmsService.class);
            intent2.putExtra(WearableXmsService.PARAM_PACKET_ID, packet.f);
            intent2.putExtra(WearableXmsService.PARAM_PACKAGE_NAME, gcpVarT.c.c);
            intent2.putExtra(WearableXmsService.PARAM_CONTENT, gcpVarT.d);
            ApplicationExtKt.getApplication().startService(intent2);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleThirdAppPacket$lambda$4(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            xg1.d("sendWeicharLicense2Device " + wearableDeviceModel + " " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) + " " + did);
            if (wearableDeviceModel != null && Intrinsics.areEqual(wearableDeviceModel.getDid(), did)) {
                DeviceContactUtilsKt.sendWeicharLicenseError2Device();
            }
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.d(XmsComponent.TAG, "handleData " + type + " " + data);
            return false;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            boolean zIsSupportThirdPartyApp = wearableDeviceModel != null ? DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModel) : false;
            xg1.d("XmsDataHandler handlePacket " + type + " " + (packet != null ? Integer.valueOf(packet.f) : null) + " " + zIsSupportThirdPartyApp);
            if (!zIsSupportThirdPartyApp) {
                return false;
            }
            if (packet != null) {
                try {
                    if (type == 2) {
                        return handleSystemPacket(packet);
                    }
                    if (type == 20) {
                        return handleThirdAppPacket(packet, did);
                    }
                } catch (Exception e) {
                    xg1.c("handlePacket error:", e);
                }
            } else {
                xg1.b("handlePacket error: packet is null");
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.XmsComponent$initThirdApp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/xms/wearable/XmsComponent$initThirdApp$1", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "onConnectStart", "", "did", "", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnDeviceStatusListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onConnectSuccess$lambda$3$lambda$2(XmsComponent this$0, String str, List list, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            lg1.d("getInstalledWatchApp from device onResult " + list + " " + i);
            if (list != null) {
                this$0.getAppRepository().syncAppsToRepository(str, list);
            }
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            if (did != null) {
                XmsComponent.this.notifyConnectedStatusChanged(did, false);
            }
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(final String did) {
            if (did != null) {
                final XmsComponent xmsComponent = XmsComponent.this;
                xmsComponent.notifyConnectedStatusChanged(did, true);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
                lg1.d("onConnectSuccess did: " + did);
                if (wearableDeviceModel != null) {
                    DeviceModelExtKt.getInstalledWatchApp(wearableDeviceModel, new Function2() { // from class: usr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return XmsComponent.AnonymousClass1.onConnectSuccess$lambda$3$lambda$2(xmsComponent, did, (List) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            if (did != null) {
                XmsComponent.this.notifyConnectedStatusChanged(did, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.XmsComponent$notifyConnectedStatusChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.XmsComponent$notifyConnectedStatusChanged$1", f = "XmsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34981(Intent intent, Continuation<? super C34981> continuation) {
            super(2, continuation);
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34981(this.$intent, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ApplicationExtKt.getApplication().startService(this.$intent);
            } catch (Exception e) {
                Logger.e(XmsComponent.TAG, "notifyConnectedStatusChanged error", e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchAppRepository appRepository_delegate$lambda$2() {
        return WatchAppRepository.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchAppRepository getAppRepository() {
        return (WatchAppRepository) this.appRepository.getValue();
    }

    private final DataHandlerWrapper getMDataHandler() {
        return (DataHandlerWrapper) this.mDataHandler.getValue();
    }

    private final DataHandlerWrapper getMInstallResultHandler() {
        return (DataHandlerWrapper) this.mInstallResultHandler.getValue();
    }

    private final MarketHandler getMarketHandler() {
        return (MarketHandler) this.marketHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XmsDataHandler mDataHandler_delegate$lambda$0() {
        return new XmsDataHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallResultHandler mInstallResultHandler_delegate$lambda$1() {
        return new InstallResultHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarketHandler marketHandler_delegate$lambda$3() {
        return new MarketHandler();
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, processName = ":device")
    public final void initThirdApp() {
        lg1.d("XmsComponent initThirdApp");
        AMapWearableConnector.getInstance().setConnectProvider(AmapConnectProvider.INSTANCE.getInstance());
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        deviceSyncExtKt.addDataHandler(20, getMDataHandler());
        deviceSyncExtKt.addDataHandler(2, getMDataHandler());
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new AnonymousClass1());
    }

    @ComponentTask(notEarlierThan = 3, notLaterThan = 3)
    public final void initThirdAppInstallResult() {
        lg1.d("XmsComponent initThirdAppInstallResult");
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addDataHandler(20, getMInstallResultHandler());
        DeviceSyncExtKt.getInstance(companion).addDataHandler(15, getMarketHandler());
    }

    public final void notifyConnectedStatusChanged(@NotNull String did, boolean isConnected) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intent intent = new Intent();
        intent.setClass(ApplicationExtKt.getApplication().getApplicationContext(), WearableXmsService.class);
        intent.putExtra(WearableXmsService.PARAM_ACTION, WearableXmsService.ACTION_CONNECTED_STATUS_CHANGED);
        intent.putExtra(WearableXmsService.PARAM_DID, did);
        intent.putExtra(WearableXmsService.PARAM_CONNECTED, isConnected);
        Logger.i(TAG, "notifyConnectedStatusChanged " + did + " " + isConnected);
        ScopeExtKt.scope(Dispatchers.getMain(), new C34981(intent, null));
    }
}
