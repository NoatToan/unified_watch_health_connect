package com.xiaomi.hm.health.nfc.service;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.City;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.di.koin.module.WalletModuleKt;
import com.xiaomi.hm.health.nfc.bus.BusDeviceUtilKt;
import com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103JS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00032\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042'\u0010\r\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002JE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\f2\u001f\u0010\r\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\b\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0007J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0007J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenService;", "Lcom/xiaomi/hm/health/nfc/service/INfcOpenService;", "Lorg/koin/core/component/KoinComponent;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "info", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "aid", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "body", "a", "Lcom/huami/nfc/base/PayResponse;", "c", "R", "Lkotlin/ExtensionFunctionType;", "b", "", "checkEnv", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "getSeId", "getDeviceId", "", "deleteCard", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "queryCardInfo", "Lcom/huami/nfc/web/NfcDevice;", "Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/huami/nfc/applet/api/SeInfoApi;", "Lcom/huami/nfc/applet/api/SeInfoApi;", "seInfoApi", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "weApi", "Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;", "cardApi", "Lcom/huami/nfc/ble/IDeviceApi;", "e", "Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "Lcom/huami/nfc/ble/NfcBleApi;", "f", "Lcom/huami/nfc/ble/NfcBleApi;", "nfcBleApi", "<init>", "(Lcom/huami/nfc/web/NfcDevice;Lcom/huami/nfc/applet/api/SeInfoApi;Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;Lcom/huami/nfc/ble/IDeviceApi;Lcom/huami/nfc/ble/NfcBleApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NfcOpenService implements INfcOpenService, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice nfcDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SeInfoApi seInfoApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final INFCOpenServiceWebAPI weApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ICardInfoApi cardApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi deviceApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NfcBleApi nfcBleApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<Object, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<Object, ? extends Object> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "------deleteCard:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, NfcOpenServiceResponse<Unit>> {
        public b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004c  */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<Unit> invoke(@NotNull String str) {
            String appCode;
            int iCheckEnv = NfcOpenService.this.checkEnv();
            if (iCheckEnv != 0) {
                return NfcOpenServiceResponse.Companion.error$default(NfcOpenServiceResponse.INSTANCE, iCheckEnv, null, 2, null);
            }
            if (Intrinsics.areEqual(BusCardExtensions.fromAid(str).getAppCode(), "9000")) {
                PayResponse<String> lingNanTongCityCode = NfcOpenService.this.nfcBleApi.getLingNanTongCityCode();
                if (lingNanTongCityCode.isSuccessful()) {
                    String data = lingNanTongCityCode.getData();
                    if (data == null || data.length() == 0) {
                        appCode = BusCardExtensions.fromAid(str).getAppCode();
                    } else {
                        appCode = lingNanTongCityCode.getData();
                    }
                } else {
                    appCode = BusCardExtensions.fromAid(str).getAppCode();
                }
            } else {
                appCode = BusCardExtensions.fromAid(str).getAppCode();
            }
            if (appCode == null) {
                return NfcOpenServiceResponse.Companion.error$default(NfcOpenServiceResponse.INSTANCE, iCheckEnv, null, 2, null);
            }
            NfcOpenService nfcOpenService = NfcOpenService.this;
            NfcOpenServiceResponse<Unit> nfcOpenServiceResponseC = nfcOpenService.c(nfcOpenService.weApi.deleteApp(City.INSTANCE.from(appCode), NfcOpenService.this.getDeviceId()));
            NfcOpenService nfcOpenService2 = NfcOpenService.this;
            if (nfcOpenServiceResponseC.isSuccessful()) {
                if (NfcDeviceKt.isClassicDevice(nfcOpenService2.nfcDevice.getDeviceModel())) {
                    nfcOpenService2.deviceApi.deleteAppletForWatch(str, AppletType.BUS);
                } else {
                    nfcOpenService2.deviceApi.deleteApplet(str, AppletType.BUS);
                }
            }
            return nfcOpenServiceResponseC;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<Object, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<Object, ? extends Object> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "------getSeId:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, NfcOpenServiceResponse<SeInfoEntity>> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<NfcOpenServiceResponse<String>, SeInfoEntity> {
            public final /* synthetic */ NfcOpenService a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NfcOpenService nfcOpenService) {
                super(1);
                this.a = nfcOpenService;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SeInfoEntity invoke(@NotNull NfcOpenServiceResponse<String> nfcOpenServiceResponse) {
                if (!nfcOpenServiceResponse.isSuccessful()) {
                    return null;
                }
                String data = nfcOpenServiceResponse.getData();
                String data2 = this.a.seInfoApi.getSeId(data).getData();
                if (data2 == null) {
                    data2 = "";
                }
                return new SeInfoEntity(data2, data);
            }
        }

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<SeInfoEntity> invoke(@NotNull String str) {
            int iCheckEnv = NfcOpenService.this.checkEnv();
            if (iCheckEnv != 0) {
                return NfcOpenServiceResponse.Companion.error$default(NfcOpenServiceResponse.INSTANCE, iCheckEnv, null, 2, null);
            }
            NfcDevice nfcDevice = NfcOpenService.this.nfcDevice;
            NfcOpenService nfcOpenService = NfcOpenService.this;
            return nfcOpenService.b(nfcOpenService.c(nfcOpenService.seInfoApi.getCplc(nfcDevice.getSn())), new a(NfcOpenService.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<Object, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<Object, ? extends Object> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "------queryCardInfo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<String, NfcOpenServiceResponse<CardInfoEntity>> {
        public final /* synthetic */ Map<Object, Object> a;
        public final /* synthetic */ NfcOpenService b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Map<Object, ? extends Object> map, NfcOpenService nfcOpenService) {
            super(1);
            this.a = map;
            this.b = nfcOpenService;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcOpenServiceResponse<CardInfoEntity> invoke(@NotNull String str) {
            Integer num = (Integer) this.a.get("dataType");
            int iIntValue = num == null ? 15 : num.intValue();
            if (iIntValue <= 15) {
                int iCheckEnv = this.b.checkEnv();
                return iCheckEnv != 0 ? NfcOpenServiceResponse.Companion.error$default(NfcOpenServiceResponse.INSTANCE, iCheckEnv, null, 2, null) : CardInfoApiKt.info(this.b.cardApi, iIntValue, str);
            }
            return NfcOpenServiceResponse.INSTANCE.error(4, "参数非法。dataType 超出定义范围。dataType: " + iIntValue + ", 应小于 15。");
        }
    }

    public NfcOpenService(@NotNull NfcDevice nfcDevice, @NotNull SeInfoApi seInfoApi, @NotNull INFCOpenServiceWebAPI iNFCOpenServiceWebAPI, @NotNull ICardInfoApi iCardInfoApi, @NotNull IDeviceApi iDeviceApi, @NotNull NfcBleApi nfcBleApi) {
        this.nfcDevice = nfcDevice;
        this.seInfoApi = seInfoApi;
        this.weApi = iNFCOpenServiceWebAPI;
        this.cardApi = iCardInfoApi;
        this.deviceApi = iDeviceApi;
        this.nfcBleApi = nfcBleApi;
    }

    private final <T> NfcOpenServiceResponse<T> a(Map<Object, ? extends Object> info, Function1<? super String, NfcOpenServiceResponse<T>> body) {
        String str = (String) info.get("aid");
        if (str == null || str.length() == 0) {
            return NfcOpenServiceResponse.INSTANCE.error(4, "参数非法。未找到 aid 信息，请检查传参后重试。");
        }
        if (NfcOpenServiceKt.getSupportCityList().contains(str)) {
            return body.invoke(str);
        }
        return NfcOpenServiceResponse.INSTANCE.error(4, "参数非法。暂不支持此aid，请确认aid信息是否正确，传入aid信息为：" + str + "。");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T, R> NfcOpenServiceResponse<R> b(NfcOpenServiceResponse<T> nfcOpenServiceResponse, Function1<? super NfcOpenServiceResponse<T>, ? extends R> function1) {
        return new NfcOpenServiceResponse<>(nfcOpenServiceResponse.getCode(), nfcOpenServiceResponse.getMessage(), function1.invoke(nfcOpenServiceResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> NfcOpenServiceResponse<T> c(PayResponse<? extends T> payResponse) {
        if (!payResponse.isSuccessful()) {
            return new NfcOpenServiceResponse<>(99, new Gson().toJson(payResponse), payResponse.getData());
        }
        String message = payResponse.getMessage();
        if (message == null) {
            message = "";
        }
        return new NfcOpenServiceResponse<>(0, message, payResponse.getData());
    }

    @VisibleForTesting
    public final int checkEnv() {
        if (NfcDeviceConfigKt.hasFeatureNfcBusDevice()) {
            return !BusDeviceUtilKt.isNfcDeviceConnected() ? 2 : 0;
        }
        return 1;
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<Unit> deleteCard(@NotNull Map<Object, ? extends Object> info) {
        HMLog.info(NfcOpenServiceKt.NfcOpenServiceTAG, new a(info));
        return a(info, new b());
    }

    @VisibleForTesting
    @NotNull
    public final String getDeviceId() {
        DeviceInfo deviceInfo;
        String deviceID;
        if (BusDeviceUtilKt.isClassicBluetoothWatch()) {
            return WalletModuleKt.device(WalletModuleKt.walletDeviceScope()).getDevice_id();
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        return (device == null || (deviceInfo = device.getDeviceInfo()) == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<SeInfoEntity> getSeId(@NotNull Map<Object, ? extends Object> info) {
        HMLog.info(NfcOpenServiceKt.NfcOpenServiceTAG, new c(info));
        return a(info, new d());
    }

    @Override // com.xiaomi.hm.health.nfc.service.INfcOpenService
    @NotNull
    public NfcOpenServiceResponse<CardInfoEntity> queryCardInfo(@NotNull Map<Object, ? extends Object> info) {
        HMLog.info(NfcOpenServiceKt.NfcOpenServiceTAG, new e(info));
        return a(info, new f(info, this));
    }
}
