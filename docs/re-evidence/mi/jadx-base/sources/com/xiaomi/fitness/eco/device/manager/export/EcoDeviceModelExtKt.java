package com.xiaomi.fitness.eco.device.manager.export;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0012\u0010$\u001a\u00020\u0018*\u00020\u00032\u0006\u0010%\u001a\u00020\n\u001a\n\u0010>\u001a\u00020\u0018*\u00020\n\u001a\n\u0010?\u001a\u00020\u0018*\u00020\n\u001a\n\u0010@\u001a\u00020\u0018*\u00020\n\"\u001d\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\"\u0015\u0010\u0011\u001a\u00020\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\"\u0015\u0010\u0013\u001a\u00020\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f\"\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019\"\u0015\u0010\u001b\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019\"\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019\"\u0015\u0010#\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019\"\u0015\u0010&\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019\"\u0015\u0010'\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0019\"\u0015\u0010(\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0019\"\u0015\u0010)\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019\"\u0015\u0010\"\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b\"\u0010+\"\u0015\u0010,\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019\"\u0015\u0010-\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019\"\u0015\u0010.\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019\"\u0015\u0010/\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019\"\u0015\u00100\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019\"\u0017\u00101\u001a\u0004\u0018\u000102*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u00105\u001a\u0004\u0018\u000106*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u00109\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b9\u0010\u0019\"\u0015\u0010/\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b/\u0010+\"\u0015\u00100\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b0\u0010+\"\u0015\u0010:\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b:\u0010+\"\u0015\u0010;\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b;\u0010+\"\u0015\u0010<\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b<\u0010+\"\u0015\u0010,\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b,\u0010+\"\u0015\u0010.\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b.\u0010+\"\u0015\u0010=\u001a\u00020\u0018*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0018*\u00020*8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010+¨\u0006A"}, d2 = {"rssiArray", "", "", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getRssiArray", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Ljava/util/List;", "otaMode", "getOtaMode", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)I", "agps", "", "getAgps", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Ljava/lang/String;", "mac", "getMac", "identifier", "getIdentifier", "model", "getModel", "name", "getName", "firmwareVersion", "getFirmwareVersion", "isWearOS", "", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Z", "isEco", "isBandType", "isTreadmill", "isExerciseBike", MediaStoreUtil.MediaInfo.SIZE, "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "getSize", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "isLocalDevice", "isHuaMi", "isSupportFeature", b.n, "isBle", "isBluetooth", "isEcg", "isWatch", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;)Z", "isL66", "isL61", "isL67", "isPanGu", "isKongMing", "xiaoAi", "Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "getXiaoAi", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "alexa", "Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "getAlexa", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "isDual", "isHuami", "isMuLan", "isZiLong", "isPhone", "isEcoScale", "isEightScale", "isLocalMachine", "eco-device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceModelExtKt {
    @Nullable
    public static final String getAgps(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getAgps();
    }

    @Nullable
    public static final Product.Alexa getAlexa(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getAlexa();
    }

    @Nullable
    public static final String getFirmwareVersion(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().getFirmwareVersion();
    }

    @NotNull
    public static final String getIdentifier(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        String identifier = ecoDeviceModel.getDeviceInfo().getIdentifier();
        return identifier == null ? "" : identifier;
    }

    @NotNull
    public static final String getMac(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        String mac = ecoDeviceModel.getDeviceInfo().getMac();
        return mac == null ? "" : mac;
    }

    @NotNull
    public static final String getModel(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().getModel();
    }

    @NotNull
    public static final String getName(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return StringsKt__StringsKt.trim((CharSequence) ecoDeviceModel.getDeviceInfo().getName()).toString();
    }

    public static final int getOtaMode(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getOta();
    }

    @Nullable
    public static final List<Integer> getRssiArray(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getRssiArray();
    }

    @Nullable
    public static final Product.Size getSize(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getSize();
    }

    @Nullable
    public static final Product.XiaoAi getXiaoAi(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getXiaoAi();
    }

    public static final boolean isBandType(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().isBandType();
    }

    public static final boolean isBle(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getType() == 2 || ecoDeviceModel.getProduct().getType() == 3;
    }

    public static final boolean isBluetooth(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return CollectionsKt__CollectionsKt.arrayListOf(3, 2, 4, 7, 6).contains(Integer.valueOf(ecoDeviceModel.getProduct().getType()));
    }

    public static final boolean isDual(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getType() == 6 || ecoDeviceModel.getProduct().getType() == 7;
    }

    public static final boolean isEcg(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getType() == 4;
    }

    public static final boolean isEco(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        EcoDevice ecoDevice = (EcoDevice) ecoDeviceModel.getDeviceInfo().device;
        return ecoDevice != null && ecoDevice.getDeviceType() == 1;
    }

    public static final boolean isEcoScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(str, "yunmai.scales.ms3001", false, 2, null);
    }

    public static final boolean isEightScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(str, "yunmai.scales.ms3001", false, 2, null);
    }

    public static final boolean isExerciseBike(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getType() == 9;
    }

    public static final boolean isHuaMi(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().isHuaMi();
    }

    public static final boolean isHuami(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return ecoProduct.getType() == 5;
    }

    public static final boolean isKongMing(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return DeviceModelExtKt.isKongMing(ecoDeviceModel.getProduct());
    }

    public static final boolean isL61(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return StringsKt__StringsKt.contains$default((CharSequence) getModel(ecoDeviceModel), (CharSequence) "mijia.watch.l61", false, 2, (Object) null);
    }

    public static final boolean isL66(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return DeviceModelExtKt.isL66(ecoDeviceModel.getProduct());
    }

    public static final boolean isL67(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return DeviceModelExtKt.isL67(ecoDeviceModel.getProduct());
    }

    public static final boolean isLocalDevice(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getAccessType() == 1;
    }

    public static final boolean isLocalMachine(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.equals("runmi.exbike.jscrm1") || str.equals("yesoul.exbike.jsc01y");
    }

    public static final boolean isMuLan(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return Intrinsics.areEqual(ecoProduct.getModel(), Product.MULAN_MODEL);
    }

    public static final boolean isPanGu(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return DeviceModelExtKt.isPanGu(ecoDeviceModel.getProduct());
    }

    public static final boolean isPhone(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().isPhone();
    }

    public static final boolean isSupportFeature(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<String> features = ecoDeviceModel.getProduct().getFeatures();
        return features != null && features.contains(feature);
    }

    public static final boolean isTreadmill(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getProduct().getType() == 8;
    }

    public static final boolean isWatch(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().isWatch();
    }

    public static final boolean isWearOS(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return ecoDeviceModel.getDeviceInfo().isWearOS();
    }

    public static final boolean isZiLong(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return Intrinsics.areEqual(ecoProduct.getModel(), Product.ZILONG_MODEL);
    }

    public static final boolean isEco(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return EcoBindDeviceInfo.INSTANCE.isEightScale(ecoProduct.getModel());
    }

    public static final boolean isKongMing(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        if (StringsKt__StringsJVMKt.equals(Product.KONG_MING_NAME, ecoProduct.getBltNamePrefix(), true)) {
            return true;
        }
        String bltNamePrefix = ecoProduct.getBltNamePrefix();
        return bltNamePrefix != null && StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.KONG_MING_NAME_2, false, 2, null);
    }

    public static final boolean isL66(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        String bltNamePrefix = ecoProduct.getBltNamePrefix();
        return (bltNamePrefix == null || !StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.HUAMI_BAND_7, false, 2, null) || Intrinsics.areEqual(ecoProduct.getBltNamePrefix(), Product.HUAMI_BAND_7_PRO)) ? false : true;
    }

    public static final boolean isL67(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return ecoProduct.getProductId() == 6885;
    }

    public static final boolean isLocalDevice(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return ecoProduct.getAccessType() == 1;
    }

    public static final boolean isPanGu(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME, ecoProduct.getBltNamePrefix(), true) || StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME_2, ecoProduct.getBltNamePrefix(), true);
    }
}
