package com.xiaomi.hm.health.nfc;

import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletEntity;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.nfc.channel.WatchNfcTag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0003J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020!H\u0016J&\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$0\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010 \u001a\u00020\u001fH\u0016R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/nfc/DeviceApi;", "Lcom/huami/nfc/ble/IDeviceApi;", "", "aid", "", "option", "Lcom/huami/nfc/ble/AppletType;", "appletType", "Lcom/huami/nfc/base/PayResponse;", "", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "c", "name", "type", "e", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "body", GoogleApiAvailabilityLight.a, "activeApplet", "deleteApplet", "issueApplet", "updateAppletInfo", "deleteAppletForWatch", "Lcom/huami/nfc/ble/AppletEntity;", "entity", "notifyAppletInfoForWatch", "", "notifyAppletInfoListForWatch", "closeNfcTagReader", "Lcom/huami/nfc/applet/CardScheduleTime;", "cardScheduleTime", "", "deleteScheduleTime", "isSupportScheduleTime", "", "queryScheduleTime", "setScheduleTime", "Lcom/huami/watch/transport/Transporter;", "a", "Lkotlin/Lazy;", "()Lcom/huami/watch/transport/Transporter;", "transporter", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceApi implements IDeviceApi {

    @NotNull
    private static final String b = "device_api";

    @NotNull
    private static final String c = "com.huami.watch.companion.transport.DeleteCard";

    @NotNull
    private static final String d = "com.huami.watch.companion.transport.SyncBusCard";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy transporter = LazyKt__LazyJVMKt.lazy(e.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DeviceApi.this.a().send(WatchNfcTag.ACTION_DOOR_CLOSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AppletType b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppletType appletType, String str) {
            super(0);
            this.b = appletType;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Transporter transporterA = DeviceApi.this.a();
            DataBundle dataBundle = new DataBundle();
            AppletType appletType = this.b;
            String str = this.c;
            dataBundle.putInt("type", appletType.getBtValue());
            dataBundle.putString("aid", str);
            Unit unit = Unit.INSTANCE;
            transporterA.send(DeviceApi.c, dataBundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AppletEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AppletEntity appletEntity) {
            super(0);
            this.b = appletEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Transporter transporterA = DeviceApi.this.a();
            DataBundle dataBundle = new DataBundle();
            AppletEntity appletEntity = this.b;
            Gson gson = new Gson();
            ArrayList arrayList = new ArrayList();
            arrayList.add(appletEntity);
            Unit unit = Unit.INSTANCE;
            dataBundle.putString("buscard_info", gson.toJson(arrayList));
            transporterA.send(DeviceApi.d, dataBundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<AppletEntity> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<AppletEntity> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Transporter transporterA = DeviceApi.this.a();
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString("buscard_info", new Gson().toJson(this.b));
            Unit unit = Unit.INSTANCE;
            transporterA.send(DeviceApi.d, dataBundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/watch/transport/Transporter;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Transporter> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Transporter getA() {
            return Transporter.get(BraceletApp.getContext(), "com.huami.watch.companion");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Transporter a() {
        return (Transporter) this.transporter.getValue();
    }

    private final PayResponse<Unit> b(String aid, int option, AppletType appletType) {
        HMBaseDevice hMBaseDeviceC = c();
        if (!(hMBaseDeviceC instanceof HMMiLiProDevice)) {
            return PayResponse.INSTANCE.error(b, "不支持的设备类型");
        }
        byte[] bArrHexStringToBytes = Hex.hexStringToBytes(aid);
        int bleValue = appletType.getBleValue();
        return ((HMMiLiProDevice) hMBaseDeviceC).setAidInfoSync(bArrHexStringToBytes == null ? new HMAidInfo(option, bleValue, 0, new byte[0]) : new HMAidInfo(option, bleValue, bArrHexStringToBytes.length, bArrHexStringToBytes)) ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, null, 1, null) : PayResponse.INSTANCE.error(b, "设置失败");
    }

    private final HMBaseDevice c() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceManager.getMajorDeviceType());
        Objects.requireNonNull(device, "device is null");
        return device;
    }

    private final <T> PayResponse<T> d(Function0<? extends T> body) {
        try {
            return PayResponse.INSTANCE.success("success", body.getA());
        } catch (Exception e2) {
            return PayResponse.INSTANCE.error(AVSAPIConstants.System.Exception.NAME, e2.getMessage());
        }
    }

    @WorkerThread
    private final PayResponse<Unit> e(String name, String aid, AppletType type) {
        HMBaseDevice hMBaseDeviceC = c();
        if (!(hMBaseDeviceC instanceof HMMiLiProDevice)) {
            return PayResponse.INSTANCE.error(b, "不支持的设备类型");
        }
        byte[] bArrHexStringToBytes = Hex.hexStringToBytes(aid);
        HMAccessInfo hMAccessInfo = new HMAccessInfo(name, bArrHexStringToBytes.length, bArrHexStringToBytes);
        if (type != null) {
            hMAccessInfo.setCardType(type.getBleValue());
        }
        return ((HMMiLiProDevice) hMBaseDeviceC).setAccessInfoSync(hMAccessInfo) ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, null, 1, null) : PayResponse.INSTANCE.error(b, "设置失败");
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> activeApplet(@NotNull String aid, @NotNull AppletType type) {
        return b(aid, 3, type);
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> closeNfcTagReader() {
        return d(new a());
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> deleteApplet(@NotNull String aid, @NotNull AppletType type) {
        return b(aid, 2, type);
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> deleteAppletForWatch(@NotNull String aid, @NotNull AppletType type) {
        return d(new b(type, aid));
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Boolean> deleteScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        Integer code;
        String string;
        HMBaseDevice hMBaseDeviceC = c();
        boolean z = hMBaseDeviceC instanceof HMMiLiProDevice;
        String str = b;
        if (!z) {
            return PayResponse.INSTANCE.error(b, "不支持的设备类型");
        }
        HMCardTSResponse<Boolean> hMCardTSResponseDeleteSwitchCardTimeSync = ((HMMiLiProDevice) hMBaseDeviceC).deleteSwitchCardTimeSync(new HMCardSwitchTime(cardScheduleTime.getCardType(), cardScheduleTime.getAid(), cardScheduleTime.getRepeatMode(), cardScheduleTime.getHour(), cardScheduleTime.getMinute()));
        if (hMCardTSResponseDeleteSwitchCardTimeSync == null ? false : Intrinsics.areEqual(hMCardTSResponseDeleteSwitchCardTimeSync.getData(), Boolean.TRUE)) {
            return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        if (hMCardTSResponseDeleteSwitchCardTimeSync != null && (code = hMCardTSResponseDeleteSwitchCardTimeSync.getCode()) != null && (string = code.toString()) != null) {
            str = string;
        }
        return companion.error(str, "delete card time switch failed");
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    public boolean isSupportScheduleTime() {
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC instanceof HMMiLiProDevice) {
            return ((HMMiLiProDevice) hMBaseDeviceC).isSupportCardTimeSwitchSync();
        }
        return false;
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> issueApplet(@NotNull String aid, @NotNull AppletType type) {
        return b(aid, 1, type);
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> notifyAppletInfoForWatch(@NotNull AppletEntity entity) {
        return d(new c(entity));
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> notifyAppletInfoListForWatch(@NotNull List<AppletEntity> entity) {
        return d(new d(entity));
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<List<CardScheduleTime>> queryScheduleTime(@NotNull AppletType type, @NotNull String aid) {
        String string;
        HMBaseDevice hMBaseDeviceC = c();
        boolean z = hMBaseDeviceC instanceof HMMiLiProDevice;
        String str = b;
        if (!z) {
            return PayResponse.INSTANCE.error(b, "不支持的设备类型");
        }
        HMCardTSResponse<List<HMCardSwitchTime>> hMCardTSResponseQuerySwitchCardTimeSync = ((HMMiLiProDevice) hMBaseDeviceC).querySwitchCardTimeSync(aid, type.getBleValue());
        List<HMCardSwitchTime> data = hMCardTSResponseQuerySwitchCardTimeSync.getData();
        PayResponse<List<CardScheduleTime>> payResponseSuccess$default = null;
        if (data != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
            for (HMCardSwitchTime hMCardSwitchTime : data) {
                arrayList.add(new CardScheduleTime(hMCardSwitchTime.getCardType(), hMCardSwitchTime.getAid(), hMCardSwitchTime.getRepeatMode(), hMCardSwitchTime.getHour(), hMCardSwitchTime.getMinute()));
            }
            payResponseSuccess$default = PayResponse.Companion.success$default(PayResponse.INSTANCE, null, arrayList, 1, null);
        }
        if (payResponseSuccess$default != null) {
            return payResponseSuccess$default;
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        Integer code = hMCardTSResponseQuerySwitchCardTimeSync.getCode();
        if (code != null && (string = code.toString()) != null) {
            str = string;
        }
        return companion.error(str, "query card time switch failed");
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Boolean> setScheduleTime(@NotNull CardScheduleTime cardScheduleTime) {
        Integer code;
        String string;
        HMBaseDevice hMBaseDeviceC = c();
        boolean z = hMBaseDeviceC instanceof HMMiLiProDevice;
        String str = b;
        if (!z) {
            return PayResponse.INSTANCE.error(b, "不支持的设备类型");
        }
        HMCardTSResponse<Boolean> timeSwitchCardSync = ((HMMiLiProDevice) hMBaseDeviceC).setTimeSwitchCardSync(new HMCardSwitchTime(cardScheduleTime.getCardType(), cardScheduleTime.getAid(), cardScheduleTime.getRepeatMode(), cardScheduleTime.getHour(), cardScheduleTime.getMinute()));
        if (timeSwitchCardSync == null ? false : Intrinsics.areEqual(timeSwitchCardSync.getData(), Boolean.TRUE)) {
            return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        if (timeSwitchCardSync != null && (code = timeSwitchCardSync.getCode()) != null && (string = code.toString()) != null) {
            str = string;
        }
        return companion.error(str, "set card time switch failed");
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> updateAppletInfo(@NotNull String name, @NotNull String aid) {
        return e(name, aid, null);
    }

    @Override // com.huami.nfc.ble.IDeviceApi
    @NotNull
    public PayResponse<Unit> updateAppletInfo(@NotNull String name, @NotNull String aid, @Nullable AppletType type) {
        return e(name, aid, type);
    }
}
