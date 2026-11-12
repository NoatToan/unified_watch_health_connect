package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u001a\"\u00105\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00032\u0006\u00106\u001a\u00020\f\u001a\"\u00107\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00032\u0006\u00106\u001a\u00020\f\u001a$\u0010=\u001a\u0004\u0018\u00010\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00032\u0006\u0010>\u001a\u00020\u0002\u001a\u001a\u0010G\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u001a\u001a\u0010H\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u001a\u0012\u0010I\u001a\u00020\f*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u001a\u0014\u0010J\u001a\u0004\u0018\u00010\f*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u001a\u0014\u0010K\u001a\u0004\u0018\u00010\f*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u001a\u001a\u0010I\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u001a\u001c\u0010J\u001a\u0004\u0018\u00010\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\u001a\u001c\u0010K\u001a\u0004\u0018\u00010\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003\"-\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"%\u0010\b\u001a\u00020\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"'\u0010\u000b\u001a\u0004\u0018\u00010\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"%\u0010\u000f\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"%\u0010\u0011\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"%\u0010\u0013\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\"%\u0010\u0015\u001a\u00020\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\"'\u0010\u0017\u001a\u0004\u0018\u00010\f*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e\"%\u0010\u0019\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b\"%\u0010\u001c\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\"%\u0010\u001d\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\"%\u0010\u001e\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b\"%\u0010\u001f\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b\"%\u0010 \u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u001b\"'\u0010!\u001a\u0004\u0018\u00010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"%\u0010$\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u001b\"%\u0010%\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u001b\"%\u0010&\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\"'\u0010'\u001a\u0004\u0018\u00010(*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010*\"'\u0010+\u001a\u0004\u0018\u00010,*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010.\"'\u0010/\u001a\u0004\u0018\u000100*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b1\u00102\"%\u00103\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u001b\"%\u00104\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b\"%\u00108\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010\u001b\"%\u00109\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b9\u0010\u001b\"%\u0010:\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b:\u0010\u001b\"%\u0010;\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010\u001b\"%\u0010<\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\b<\u0010\u001b\"\u0015\u0010$\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b$\u0010@\"\u0015\u0010%\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b%\u0010@\"\u0015\u0010A\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\bA\u0010@\"\u0015\u0010B\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\bB\u0010@\"\u0015\u0010C\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\bC\u0010@\"\u0015\u0010D\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\bD\u0010@\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010@\"\u0015\u0010\u001e\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010@\"\u0015\u0010\u001f\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010@\"\u0015\u0010\u0019\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010@\"\u0015\u00104\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b4\u0010@\"\u0015\u0010E\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\bE\u0010@\"\u0015\u00103\u001a\u00020\u001a*\u00020?8F¢\u0006\u0006\u001a\u0004\b3\u0010@\"%\u0010F\u001a\u00020\u001a*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010\u001b¨\u0006L"}, d2 = {"rssiArray", "", "", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getRssiArray", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Ljava/util/List;", "otaMode", "getOtaMode", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)I", "agps", "", "getAgps", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Ljava/lang/String;", "mac", "getMac", "identifier", "getIdentifier", "model", "getModel", "name", "getName", "firmwareVersion", "getFirmwareVersion", "isWearOS", "", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Z", "isHuaMi", "isL66", "isL67", "isLibai", "isEarphone", "iotSunCategory", "getIotSunCategory", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Ljava/lang/Integer;", "isPanGu", "isKongMing", "isBandType", "xiaoAi", "Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "getXiaoAi", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "alexa", "Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "getAlexa", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", MediaStoreUtil.MediaInfo.SIZE, "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "getSize", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "isLocalDevice", "isM66", "isSupportFeature", com.xiaomi.onetrack.api.b.n, "isSupportInWhiteListFeature", "isBle", "isBluetooth", "isEcg", "isWatch", "isDual", "getDeviceIconUrl", "imgType", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "isHuami", "isMuLan", "isZiLong", "isBloodSugar", "isM61", "isPhone", "getBeanPreviewUrl", "getRingPreviewUrl", "getSKU", "getBigIcon", "getPreviewIcon", "device-manager_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/fitness/device/manager/DeviceModelExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
public final class DeviceModelExtKt {
    @Nullable
    public static final String getAgps(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getAgps();
    }

    @Nullable
    public static final Product.Alexa getAlexa(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getAlexa();
    }

    @NotNull
    public static final String getBeanPreviewUrl(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        if (currentRegion.length() == 0) {
            currentRegion = "cn";
        }
        String str = "https://hlth.io.mi.com/app/v1/resource/download";
        if (!Intrinsics.areEqual(currentRegion, "cn")) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) "https://hlth.io.mi.com/app/v1/resource/download", "://", 0, false, 6, (Object) null) + 3;
            String strSubstring = "https://hlth.io.mi.com/app/v1/resource/download".substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = "https://hlth.io.mi.com/app/v1/resource/download".substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            str = strSubstring + currentRegion + "." + strSubstring2;
        }
        String str2 = "watch/" + getModel(deviceModel);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.US, "?data={\"module\":\"widget\",\"category\":\"%s\",\"name\":\"runningbean.png\"}", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str + str3;
    }

    @Nullable
    public static final String getBigIcon(@NotNull DeviceInfo<? extends Device> deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        Product product = deviceInfo.getProduct();
        String strOptString = null;
        if (product != null) {
            String bigIcon3 = product.getBigIcon3() != null ? product.getBigIcon3() : product.getBigIcon();
            try {
                if (product.getSkuBigIcon() == null) {
                    Logger.i("getBigIcon", "product.skuBigIcon is null");
                } else {
                    Logger.i("getBigIcon", "product.skuBigIcon is " + product.getSkuBigIcon());
                }
                String skuBigIcon = product.getSkuBigIcon();
                JSONObject jSONObject = skuBigIcon != null ? new JSONObject(skuBigIcon) : null;
                String sku = getSKU(deviceInfo);
                if (jSONObject == null) {
                    Logger.i("getBigIcon", "jsonObject is null");
                } else {
                    Logger.i("getBigIcon", "jsonObject " + jSONObject);
                }
                strOptString = (jSONObject == null || !jSONObject.has(sku)) ? bigIcon3 : jSONObject.optString(sku);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logger.i("getBigIcon", "icon:" + strOptString);
        }
        return strOptString;
    }

    @Nullable
    public static final String getDeviceIconUrl(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel, int i) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        if (i == 1) {
            return deviceModel.getProduct().getSmallIcon();
        }
        if (i != 2) {
            return i != 3 ? deviceModel.getProduct().getBigPreview() : deviceModel.getProduct().getBigPreview();
        }
        String bigIcon3 = deviceModel.getProduct().getBigIcon3();
        Product product = deviceModel.getProduct();
        return bigIcon3 != null ? product.getBigIcon3() : product.getBigIcon();
    }

    @Nullable
    public static final String getFirmwareVersion(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().getFirmwareVersion();
    }

    @NotNull
    public static final String getIdentifier(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        String identifier = deviceModel.getDeviceInfo().getIdentifier();
        return identifier == null ? "" : identifier;
    }

    @Nullable
    public static final Integer getIotSunCategory(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getIotSubCategoryId();
    }

    @NotNull
    public static final String getMac(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        String mac = deviceModel.getDeviceInfo().getMac();
        return mac == null ? "" : mac;
    }

    @NotNull
    public static final String getModel(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().getModel();
    }

    @NotNull
    public static final String getName(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return StringsKt__StringsKt.trim((CharSequence) deviceModel.getDeviceInfo().getName()).toString();
    }

    public static final int getOtaMode(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getOta();
    }

    @Nullable
    public static final String getPreviewIcon(@NotNull DeviceInfo<? extends Device> deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        Product product = deviceInfo.getProduct();
        String strOptString = null;
        if (product != null) {
            String bigPreview = product.getBigPreview();
            try {
                String skuBigPreview = product.getSkuBigPreview();
                JSONObject jSONObject = skuBigPreview != null ? new JSONObject(skuBigPreview) : null;
                String sku = getSKU(deviceInfo);
                strOptString = (jSONObject == null || !jSONObject.has(sku)) ? bigPreview : jSONObject.optString(sku);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logger.i("getPreviewIcon", "icon:" + strOptString);
        }
        return strOptString;
    }

    @NotNull
    public static final String getRingPreviewUrl(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        if (currentRegion.length() == 0) {
            currentRegion = "cn";
        }
        String str = "https://hlth.io.mi.com/app/v1/resource/download";
        if (!Intrinsics.areEqual(currentRegion, "cn")) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) "https://hlth.io.mi.com/app/v1/resource/download", "://", 0, false, 6, (Object) null) + 3;
            String strSubstring = "https://hlth.io.mi.com/app/v1/resource/download".substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = "https://hlth.io.mi.com/app/v1/resource/download".substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            str = strSubstring + currentRegion + "." + strSubstring2;
        }
        String str2 = "watch/" + getModel(deviceModel);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.US, "?data={\"module\":\"widget\",\"category\":\"%s\",\"name\":\"necklace.png\"}", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str + str3;
    }

    @Nullable
    public static final List<Integer> getRssiArray(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getRssiArray();
    }

    @NotNull
    public static final String getSKU(@NotNull DeviceInfo<? extends Device> deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        String sn = deviceInfo.getSn();
        String strSubstring = "";
        if (sn != null && StringsKt__StringsKt.contains$default((CharSequence) sn, (CharSequence) "/", false, 2, (Object) null)) {
            strSubstring = sn.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) sn, "/", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Logger.i("getSKU", "sku:" + ((Object) strSubstring));
        return strSubstring;
    }

    @Nullable
    public static final Product.Size getSize(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getSize();
    }

    @Nullable
    public static final Product.XiaoAi getXiaoAi(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getXiaoAi();
    }

    public static final boolean isBandType(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().isBandType();
    }

    public static final boolean isBle(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getType() == 2 || deviceModel.getProduct().getType() == 3;
    }

    public static final boolean isBloodSugar(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 12;
    }

    public static final boolean isBluetooth(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return CollectionsKt__CollectionsKt.arrayListOf(3, 2, 4, 7, 6).contains(Integer.valueOf(deviceModel.getProduct().getType()));
    }

    public static final boolean isDual(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getType() == 6 || deviceModel.getProduct().getType() == 7;
    }

    public static final boolean isEarphone(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getType() == 14;
    }

    public static final boolean isEcg(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getType() == 4;
    }

    public static final boolean isHuaMi(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().isHuaMi();
    }

    public static final boolean isHuami(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 5;
    }

    public static final boolean isKongMing(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isKongMing(deviceModel.getProduct());
    }

    public static final boolean isL66(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isL66(deviceModel.getProduct());
    }

    public static final boolean isL67(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isL67(deviceModel.getProduct());
    }

    public static final boolean isLibai(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isLibai(deviceModel.getProduct());
    }

    public static final boolean isLocalDevice(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getProduct().getAccessType() == 1;
    }

    public static final boolean isM61(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(product.getModel(), Product.M61, false, 2, null);
    }

    public static final boolean isM66(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isM66(deviceModel.getProduct());
    }

    public static final boolean isMuLan(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.MULAN_MODEL);
    }

    public static final boolean isPanGu(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return isPanGu(deviceModel.getProduct());
    }

    public static final boolean isPhone(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().isPhone();
    }

    public static final boolean isSupportFeature(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<String> features = deviceModel.getProduct().getFeatures();
        return features != null && features.contains(feature);
    }

    public static final boolean isSupportInWhiteListFeature(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<String> whitelistFeature = deviceModel.getProduct().getWhitelistFeature();
        return whitelistFeature != null && whitelistFeature.contains(feature);
    }

    public static final boolean isWatch(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().isWatch();
    }

    public static final boolean isWearOS(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return deviceModel.getDeviceInfo().isWearOS();
    }

    public static final boolean isZiLong(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.ZILONG_MODEL);
    }

    public static final boolean isKongMing(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        if (StringsKt__StringsJVMKt.equals(Product.KONG_MING_NAME, product.getBltNamePrefix(), true)) {
            return true;
        }
        String bltNamePrefix = product.getBltNamePrefix();
        return bltNamePrefix != null && StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.KONG_MING_NAME_2, false, 2, null);
    }

    public static final boolean isL66(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        String bltNamePrefix = product.getBltNamePrefix();
        return (bltNamePrefix == null || !StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.HUAMI_BAND_7, false, 2, null) || Intrinsics.areEqual(product.getBltNamePrefix(), Product.HUAMI_BAND_7_PRO)) ? false : true;
    }

    public static final boolean isL67(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getProductId() == 6885;
    }

    public static final boolean isLibai(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), "xiaomi.watch.mars");
    }

    public static final boolean isLocalDevice(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getAccessType() == 1;
    }

    public static final boolean isM66(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(product.getModel(), Product.M66, false, 2, null);
    }

    public static final boolean isPanGu(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME, product.getBltNamePrefix(), true) || StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME_2, product.getBltNamePrefix(), true);
    }

    public static final boolean isWearOS(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }

    @NotNull
    public static final String getSKU(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return getSKU((DeviceInfo<? extends Device>) deviceModel.getDeviceInfo());
    }

    @Nullable
    public static final String getPreviewIcon(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return getPreviewIcon((DeviceInfo<? extends Device>) deviceModel.getDeviceInfo());
    }

    @Nullable
    public static final String getBigIcon(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return getBigIcon((DeviceInfo<? extends Device>) deviceModel.getDeviceInfo());
    }
}
