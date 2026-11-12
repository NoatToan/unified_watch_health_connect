package com.xiaomi.hm.health.nfc;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.web.DeviceModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.resource.BeatsDoorRes;
import com.huami.wallet.accessdoor.resource.ChongQingDoorRes;
import com.huami.wallet.accessdoor.resource.CincoDoorRes;
import com.huami.wallet.accessdoor.resource.DongTingHuDoorRes;
import com.huami.wallet.accessdoor.resource.IAccessDoorRes;
import com.huami.wallet.accessdoor.resource.VeniceDoorRes;
import com.huami.wallet.accessdoor.resource.WatchDoorRes;
import com.huami.wallet.ui.resource.BeatsWalletRes;
import com.huami.wallet.ui.resource.ChongQingWalletRes;
import com.huami.wallet.ui.resource.CincoWalletRes;
import com.huami.wallet.ui.resource.DTHWalletRes;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.resource.VeniceWalletRes;
import com.huami.wallet.ui.resource.WatchWalletRes;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\n\u001a\u00020\u0000H\u0002\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "deviceInfo", "", "isSupportBleApi", "isSupportDnyamicCityDevice", "isSupportUnionpay", "Lcom/huami/wallet/accessdoor/resource/IAccessDoorRes;", "getAccessDoorRes", "Lcom/huami/wallet/ui/resource/IWalletRes;", "getBusRes", "a", "Lcom/huami/nfc/web/DeviceModel;", "deviceModel", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class NfcConfigKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_CHONGQING.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_BEATS_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_BEATS.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_BEATS_P.ordinal()] = 4;
            iArr[HMDeviceSource.WATCH_AMAZFIT_QOG.ordinal()] = 5;
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU.ordinal()] = 6;
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU_E.ordinal()] = 7;
            iArr[HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_DTH.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_VENICE.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_BLANC.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_ZURICH.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_VERONA.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_MADRID.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_SOFIA.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_VIENNA.ordinal()] = 28;
            iArr[HMDeviceSource.MILI_PROVENCE.ordinal()] = 29;
            iArr[HMDeviceSource.MILI_TEIDE.ordinal()] = 30;
            iArr[HMDeviceSource.MILI_ANDES.ordinal()] = 31;
            iArr[HMDeviceSource.MILI_BARI_NFC.ordinal()] = 32;
            iArr[HMDeviceSource.MILI_LEIDEN.ordinal()] = 33;
            iArr[HMDeviceSource.MILI_BERLIN.ordinal()] = 34;
            iArr[HMDeviceSource.MILI_LILLE.ordinal()] = 35;
            iArr[HMDeviceSource.MILI_FLORENCE.ordinal()] = 36;
            iArr[HMDeviceSource.MILI_WAST.ordinal()] = 37;
            iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 38;
            iArr[HMDeviceSource.MILI_TONLESAP.ordinal()] = 39;
            iArr[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 40;
            iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 41;
            iArr[HMDeviceSource.MILI_LINCS.ordinal()] = 42;
            iArr[HMDeviceSource.MILI_HAWK.ordinal()] = 43;
            iArr[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 44;
            iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 45;
            iArr[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 46;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 47;
            iArr[HMDeviceSource.MILI_PRAGUE.ordinal()] = 48;
            iArr[HMDeviceSource.MILI_BLED_PRO.ordinal()] = 49;
            iArr[HMDeviceSource.SMART_WATCH_EVEREST_2.ordinal()] = 50;
            iArr[HMDeviceSource.SMART_WATCH_EVEREST_2S.ordinal()] = 51;
            iArr[HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR.ordinal()] = 52;
            iArr[HMDeviceSource.MILI_PROVENCE_W.ordinal()] = 53;
            iArr[HMDeviceSource.MILI_TEIDE_W.ordinal()] = 54;
            iArr[HMDeviceSource.MILI_LONDON.ordinal()] = 55;
            iArr[HMDeviceSource.MILI_PYH.ordinal()] = 56;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "不支持的设备，device source: " + HMDeviceSource.fromValue(this.a.getDevice_source().intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, boolean z) {
            super(0);
            this.a = i;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "-- isSupportDnyamicCityDevice " + this.a + " " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "-- 1 isSupportDnyamicCityDevice false";
        }
    }

    private static final Device a() {
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceManager.getInstance().getMajorDeviceType());
        Objects.requireNonNull(bindInfo, "Device info is null");
        return bindInfo;
    }

    @NotNull
    public static final DeviceModel deviceModel(@NotNull Device device) {
        if (device.getDevice_source() == null) {
            throw new IllegalArgumentException("device_source is null".toString());
        }
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 3:
                return DeviceModel.Beats.INSTANCE;
            case 4:
                return DeviceModel.BeatsP.INSTANCE;
            case 5:
                return DeviceModel.Qogir.INSTANCE;
            case 6:
                return DeviceModel.Xihu.INSTANCE;
            case 7:
                return DeviceModel.XihuE.INSTANCE;
            case 8:
                return DeviceModel.Xihu.INSTANCE;
            case 9:
                return DeviceModel.DongtingLake.INSTANCE;
            case 10:
                return DeviceModel.Venice.INSTANCE;
            case 11:
                return DeviceModel.Onyx.INSTANCE;
            case 12:
                return DeviceModel.Corsica.INSTANCE;
            case 13:
                return DeviceModel.Osprey.INSTANCE;
            case 14:
                return DeviceModel.Lisbon.INSTANCE;
            case 15:
                return DeviceModel.Newton.INSTANCE;
            case 16:
                return DeviceModel.Hamburg.INSTANCE;
            case 17:
                return DeviceModel.Bonn.INSTANCE;
            case 18:
                return DeviceModel.Volga.INSTANCE;
            case 19:
                return DeviceModel.Blanc.INSTANCE;
            case 20:
                return DeviceModel.Como.INSTANCE;
            case 21:
                return DeviceModel.ComoLite.INSTANCE;
            case 22:
                return DeviceModel.Ness.INSTANCE;
            case 23:
                return DeviceModel.Zurich.INSTANCE;
            case 24:
                return DeviceModel.Verona.INSTANCE;
            case 25:
            case 26:
                return DeviceModel.Madrid.INSTANCE;
            case 27:
                return DeviceModel.Sofia.INSTANCE;
            case 28:
                return DeviceModel.Vienna.INSTANCE;
            case 29:
                return DeviceModel.Provence.INSTANCE;
            case 30:
                return DeviceModel.Teide.INSTANCE;
            case 31:
                return DeviceModel.Andes.INSTANCE;
            case 32:
                return DeviceModel.Bari.INSTANCE;
            case 33:
                return DeviceModel.Leiden.INSTANCE;
            case 34:
                return DeviceModel.Berlin.INSTANCE;
            case 35:
                return DeviceModel.Lille.INSTANCE;
            case 36:
                return DeviceModel.Florence.INSTANCE;
            case 37:
                return DeviceModel.Wast.INSTANCE;
            case 38:
            case 47:
            case 54:
            default:
                LogcatKt.error$default(Logcat.INSTANCE, null, new a(device), 1, null);
                return DeviceModel.EmptyModelDevice.INSTANCE;
            case 39:
                return DeviceModel.TLSCH.INSTANCE;
            case 40:
                return DeviceModel.TLSCL.INSTANCE;
            case 41:
                return DeviceModel.KESTREL.INSTANCE;
            case 42:
                return DeviceModel.Lincs.INSTANCE;
            case 43:
            case 44:
                return DeviceModel.Hawk.INSTANCE;
            case 45:
            case 46:
                return DeviceModel.Falcon.INSTANCE;
            case 48:
                return DeviceModel.Prague.INSTANCE;
            case 49:
                return DeviceModel.BledPro.INSTANCE;
            case 50:
                return DeviceModel.Everest2.INSTANCE;
            case 51:
                return DeviceModel.Everest2.INSTANCE;
            case 52:
                return DeviceModel.Everest2.INSTANCE;
            case 53:
                return DeviceModel.ProvenceW.INSTANCE;
            case 55:
                return DeviceModel.London.INSTANCE;
            case 56:
                return DeviceModel.PoyangLake.INSTANCE;
        }
    }

    @NotNull
    public static final IAccessDoorRes getAccessDoorRes(@NotNull Device device) {
        Integer device_source = device.getDevice_source();
        if (device_source == null) {
            throw new IllegalArgumentException("device_source is null".toString());
        }
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device_source.intValue());
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 1:
                return new ChongQingDoorRes();
            case 2:
            default:
                throw new IllegalArgumentException("不支持的设备，device source: " + HMDeviceSource.fromValue(device_source.intValue()));
            case 3:
            case 4:
                return new BeatsDoorRes();
            case 5:
            case 6:
            case 7:
            case 8:
            case 50:
            case 51:
            case 52:
                return new WatchDoorRes();
            case 9:
            case 12:
            case 15:
            case 20:
            case 21:
            case 22:
            case 23:
            case 39:
            case 40:
            case 41:
            case 42:
                return new DongTingHuDoorRes();
            case 10:
            case 24:
            case 55:
                return new VeniceDoorRes();
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 25:
            case 26:
            case 27:
            case 28:
            case 31:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return new WatchDoorRes();
            case 29:
            case 53:
                return new WatchDoorRes();
            case 30:
            case 54:
                return new WatchDoorRes();
            case 32:
                return new WatchDoorRes();
            case 33:
                return new WatchDoorRes();
            case 34:
                return new WatchDoorRes();
            case 35:
                return new WatchDoorRes();
            case 36:
                return new WatchDoorRes();
            case 37:
                return new WatchDoorRes();
            case 38:
                return new CincoDoorRes();
        }
    }

    public static /* synthetic */ IAccessDoorRes getAccessDoorRes$default(Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            device = a();
        }
        return getAccessDoorRes(device);
    }

    @NotNull
    public static final IWalletRes getBusRes(@NotNull Device device) {
        Integer device_source = device.getDevice_source();
        if (device_source == null) {
            throw new IllegalArgumentException("device_source is null".toString());
        }
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device_source.intValue());
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 1:
                return new ChongQingWalletRes();
            case 2:
            case 47:
            default:
                throw new IllegalArgumentException("不支持的设备，device source: " + HMDeviceSource.fromValue(device_source.intValue()));
            case 3:
            case 4:
                return new BeatsWalletRes();
            case 5:
            case 6:
            case 7:
            case 8:
            case 50:
            case 51:
            case 52:
                return new WatchWalletRes();
            case 9:
            case 12:
            case 15:
            case 20:
            case 21:
            case 22:
            case 23:
            case 39:
            case 40:
            case 41:
            case 42:
                return new DTHWalletRes();
            case 10:
            case 55:
                return new VeniceWalletRes();
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 31:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
                return new WatchWalletRes();
            case 29:
            case 53:
                return new WatchWalletRes();
            case 30:
            case 54:
                return new WatchWalletRes();
            case 32:
                return new WatchWalletRes();
            case 33:
                return new WatchWalletRes();
            case 34:
                return new WatchWalletRes();
            case 35:
                return new WatchWalletRes();
            case 36:
                return new WatchWalletRes();
            case 37:
                return new WatchWalletRes();
            case 38:
                return new CincoWalletRes();
        }
    }

    public static /* synthetic */ IWalletRes getBusRes$default(Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            device = a();
        }
        return getBusRes(device);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN, SYNTHETIC] */
    public static final boolean isSupportBleApi(@NotNull Device device) {
        Integer device_source = device.getDevice_source();
        if (device_source == null) {
            return false;
        }
        int iIntValue = device_source.intValue();
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName(HMDeviceManager.getInstance().getBoundDeviceFirmwareVersion(HMDeviceType.MILI));
        int versionCodeFromVersionName2 = ProfileUtils.getVersionCodeFromVersionName("1.7.0.6");
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(iIntValue);
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 1:
                if (versionCodeFromVersionName >= versionCodeFromVersionName2) {
                    return true;
                }
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            default:
                return true;
        }
    }

    public static /* synthetic */ boolean isSupportBleApi$default(Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            device = a();
        }
        return isSupportBleApi(device);
    }

    public static final boolean isSupportDnyamicCityDevice(@NotNull Device device) {
        Integer device_source = device.getDevice_source();
        boolean z = false;
        if (device_source == null) {
            HMLog.info$default(null, c.a, 1, null);
            return false;
        }
        int iIntValue = device_source.intValue();
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(iIntValue);
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                z = true;
                break;
        }
        HMLog.info$default(null, new b(iIntValue, z), 1, null);
        return z;
    }

    public static /* synthetic */ boolean isSupportDnyamicCityDevice$default(Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            device = a();
        }
        return isSupportDnyamicCityDevice(device);
    }

    public static final boolean isSupportUnionpay(@NotNull Device device) {
        Integer device_source = device.getDevice_source();
        if (device_source == null) {
            return false;
        }
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device_source.intValue());
        if ((hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) == 9) {
            return ProfileUtils.getVersionCodeFromVersionName(HMDeviceManager.getInstance().getBoundDeviceFirmwareVersion(HMDeviceType.MILI)) >= ProfileUtils.getVersionCodeFromVersionName("4.1.6.02");
        }
        return false;
    }

    public static /* synthetic */ boolean isSupportUnionpay$default(Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            device = a();
        }
        return isSupportUnionpay(device);
    }
}
