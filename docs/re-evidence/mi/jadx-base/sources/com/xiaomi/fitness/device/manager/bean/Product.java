package com.xiaomi.fitness.device.manager.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u009a\u00012\u00020\u0001:\u0014\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001B·\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u00100\u001a\u000201¢\u0006\u0004\b.\u00102J\u0012\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0006\u00100\u001a\u000201H\u0004J\t\u0010\u0090\u0001\u001a\u00020\u0003H\u0016J\u001c\u0010\u0091\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0092\u0001\u001a\u0002012\u0007\u0010\u0093\u0001\u001a\u00020\u0003H\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00108\"\u0004\bH\u0010:R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00108\"\u0004\bX\u0010:R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00104\"\u0004\b\\\u00106R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010a\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00104\"\u0004\bc\u00106R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR&\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010<\"\u0004\bi\u0010>R \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR&\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010<\"\u0004\bw\u0010>R&\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010<\"\u0004\by\u0010>R&\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010<\"\u0004\b{\u0010>R,\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR$\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u00108\"\u0005\b\u0085\u0001\u0010:R\u001e\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u00108\"\u0005\b\u0087\u0001\u0010:R\u001e\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u00108\"\u0005\b\u0089\u0001\u0010:R\"\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u00108\"\u0005\b\u008b\u0001\u0010:R\"\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u00108\"\u0005\b\u008d\u0001\u0010:¨\u0006\u009e\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product;", "Landroid/os/Parcelable;", "appVersion", "", "model", "", "wearOsModelIds", "", "productId", "productName", "bltNamePrefix", HabitShareActivity.KEY_BIG_ICON, "bigIcon3", "bigPreview", "smallIcon", MediaStoreUtil.MediaInfo.SIZE, "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "discovery", "status", "type", "alias", "ota", CardInfo.KEY_CARD_GROUP_ID, "iotSubCategoryId", "accessType", "privateUUID", "Lcom/xiaomi/fitness/device/manager/bean/Product$PrivateUUID;", "features", "xiaoAi", "Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", Feature.ESIM, "Lcom/xiaomi/fitness/device/manager/bean/Product$ESIM;", "alexa", "Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "whitelistFeature", "androidFeature", "rssiArray", "featureMap", "", "bloodPressureModule", "Lcom/xiaomi/fitness/device/manager/bean/Product$AboutModule;", "agps", "category", "subcategory", "skuBigIcon", "skuBigPreview", "<init>", "(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/bean/Product$Size;IIILjava/lang/String;IILjava/lang/Integer;ILcom/xiaomi/fitness/device/manager/bean/Product$PrivateUUID;Ljava/util/List;Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;Lcom/xiaomi/fitness/device/manager/bean/Product$ESIM;Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/xiaomi/fitness/device/manager/bean/Product$AboutModule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAppVersion", "()I", "setAppVersion", "(I)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getWearOsModelIds", "()Ljava/util/List;", "setWearOsModelIds", "(Ljava/util/List;)V", "getProductId", "setProductId", "getProductName", "setProductName", "getBltNamePrefix", "setBltNamePrefix", "getBigIcon", "setBigIcon", "getBigIcon3", "setBigIcon3", "getBigPreview", "setBigPreview", "getSmallIcon", "setSmallIcon", "getSize", "()Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "setSize", "(Lcom/xiaomi/fitness/device/manager/bean/Product$Size;)V", "getDiscovery", "setDiscovery", "getStatus", "setStatus", "getType", "setType", "getAlias", "setAlias", "getOta", "setOta", "getGroupId", "setGroupId", "getIotSubCategoryId", "()Ljava/lang/Integer;", "setIotSubCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAccessType", "setAccessType", "getPrivateUUID", "()Lcom/xiaomi/fitness/device/manager/bean/Product$PrivateUUID;", "setPrivateUUID", "(Lcom/xiaomi/fitness/device/manager/bean/Product$PrivateUUID;)V", "getFeatures", "setFeatures", "getXiaoAi", "()Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "setXiaoAi", "(Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;)V", "getEsim", "()Lcom/xiaomi/fitness/device/manager/bean/Product$ESIM;", "setEsim", "(Lcom/xiaomi/fitness/device/manager/bean/Product$ESIM;)V", "getAlexa", "()Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "setAlexa", "(Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;)V", "getWhitelistFeature", "setWhitelistFeature", "getAndroidFeature", "setAndroidFeature", "getRssiArray", "setRssiArray", "getFeatureMap", "()Ljava/util/Map;", "setFeatureMap", "(Ljava/util/Map;)V", "getBloodPressureModule", "()Lcom/xiaomi/fitness/device/manager/bean/Product$AboutModule;", "setBloodPressureModule", "(Lcom/xiaomi/fitness/device/manager/bean/Product$AboutModule;)V", "getAgps", "setAgps", "getCategory", "setCategory", "getSubcategory", "setSubcategory", "getSkuBigIcon", "setSkuBigIcon", "getSkuBigPreview", "setSkuBigPreview", "readFromParcel", "", "describeContents", "writeToParcel", "dest", "flags", "Size", "PrivateUUID", "XiaoAi", "Alexa", "AboutModule", "ESIM", "Companion", "Type", "Status", "Ota", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Product implements Parcelable {

    @NotNull
    public static final String GYM_MODEL_M2 = "ksmb.treadmill.m2";

    @NotNull
    public static final String HUAMI_BAND_7 = "Xiaomi Smart Band 7";

    @NotNull
    public static final String HUAMI_BAND_7_PRO = "Xiaomi Smart Band 7 Pro";

    @NotNull
    public static final String KONG_MING_NAME = "Mi Smart Band 5";

    @NotNull
    public static final String KONG_MING_NAME_2 = "Kongming";

    @NotNull
    public static final String M61 = "mijia.watch.m61";

    @NotNull
    public static final String M62A_MODEL = "midr.watch.m62a";

    @NotNull
    public static final String M62S_MODEL = "midr.watch.m62s";

    @NotNull
    public static final String M66 = "miwear.watch.m66";

    @NotNull
    public static final String MULAN_MODEL = "mijia.watch.v1";
    public static final int OTA_CUSTOM_HY = 1;
    public static final int OTA_GENERAL = 2;
    public static final int OTA_NONE = 0;

    @NotNull
    public static final String PAN_GU_NAME = "Mi Smart Band 6";

    @NotNull
    public static final String PAN_GU_NAME_2 = "Pangu";

    @NotNull
    public static final String PHONE_MODEL = "mihlth.xiaomi.fitness.phone";
    public static final int STATUS_INTERNAL = 2;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_RELEASE = 3;
    public static final int STATUS_SOLD_OUT = 4;
    public static final int STATUS_WHITELIST = 1;
    public static final int TYPE_BLE_BAND = 3;
    public static final int TYPE_BLE_ECG = 4;
    public static final int TYPE_BLE_WATCH = 2;
    public static final int TYPE_DUAL_BAND = 7;
    public static final int TYPE_DUAL_WATCH = 6;
    public static final int TYPE_EARPHONE = 14;
    public static final int TYPE_EXERCISE_BIKE = 9;
    public static final int TYPE_GLUCOSE_METER = 12;
    public static final int TYPE_HUAMI = 5;
    public static final int TYPE_JUMP_ROPE = 10;
    public static final int TYPE_JUMP_SCALE = 11;
    public static final int TYPE_RN = 13;
    public static final int TYPE_TREADMILL = 8;
    public static final int TYPE_WEAROS = 1;

    @NotNull
    public static final String YUNMAI_MODEL_MS3001 = "yunmai.scales.ms3001";

    @NotNull
    public static final String ZILONG_MODEL = "mijia.watch.band01";

    @SerializedName(ThirdPartAccessConstants.KEY_ACCESS_TYPE)
    private int accessType;

    @Nullable
    private String agps;

    @Nullable
    private Alexa alexa;

    @Nullable
    private String alias;

    @SerializedName("android_feature")
    @Nullable
    private List<String> androidFeature;

    @SerializedName("android_app_version")
    private int appVersion;

    @SerializedName("big_icon")
    @Nullable
    private String bigIcon;

    @SerializedName("big_icon_3")
    @Nullable
    private String bigIcon3;

    @SerializedName("big_preview")
    @Nullable
    private String bigPreview;

    @SerializedName("blood_pressure")
    @Nullable
    private AboutModule bloodPressureModule;

    @SerializedName("blt_name")
    @Nullable
    private String bltNamePrefix;

    @Nullable
    private String category;
    private int discovery;

    @SerializedName(Feature.ESIM)
    @Nullable
    private ESIM esim;

    @SerializedName("feature_map")
    @Nullable
    private Map<String, String> featureMap;

    @SerializedName(b.n)
    @Nullable
    private List<String> features;

    @SerializedName(CirculateDeviceInfo.GROUP_ID)
    private int groupId;

    @Nullable
    private Integer iotSubCategoryId;

    @NotNull
    private String model;

    @SerializedName("ota_type")
    private int ota;

    @SerializedName("priv_uuid")
    @Nullable
    private PrivateUUID privateUUID;

    @SerializedName("pd_id")
    private int productId;

    @SerializedName("pd_name")
    @Nullable
    private String productName;

    @SerializedName("unlock_phone_rssi")
    @Nullable
    private List<Integer> rssiArray;

    @SerializedName("pd_size")
    @Nullable
    private Size size;

    @SerializedName("sku_big_icon")
    @Nullable
    private String skuBigIcon;

    @SerializedName("sku_big_preview")
    @Nullable
    private String skuBigPreview;

    @SerializedName("small_icon")
    @Nullable
    private String smallIcon;

    @SerializedName("status_android")
    private int status;

    @Nullable
    private String subcategory;

    @SerializedName("pd_type")
    private int type;

    @SerializedName("wearos_model_ids")
    @Nullable
    private List<String> wearOsModelIds;

    @SerializedName("whitelist_feature")
    @Nullable
    private List<String> whitelistFeature;

    @SerializedName("xiaoai")
    @Nullable
    private XiaoAi xiaoAi;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() { // from class: com.xiaomi.fitness.device.manager.bean.Product$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Product(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$AboutModule;", "Landroid/os/Parcelable;", "model", "", "fullVersion", "releaseVersion", "certificateNumber", "produceNumber", "technicalNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getFullVersion", "setFullVersion", "getReleaseVersion", "setReleaseVersion", "getCertificateNumber", "setCertificateNumber", "getProduceNumber", "setProduceNumber", "getTechnicalNumber", "setTechnicalNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AboutModule implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AboutModule> CREATOR = new Creator();

        @SerializedName("certificate_number")
        @Nullable
        private String certificateNumber;

        @SerializedName("full_version")
        @Nullable
        private String fullVersion;

        @SerializedName("model")
        @Nullable
        private String model;

        @SerializedName("produce_number")
        @Nullable
        private String produceNumber;

        @SerializedName("release_version")
        @Nullable
        private String releaseVersion;

        @SerializedName("technical_number")
        @Nullable
        private String technicalNumber;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AboutModule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AboutModule createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AboutModule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AboutModule[] newArray(int i) {
                return new AboutModule[i];
            }
        }

        public AboutModule() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ AboutModule copy$default(AboutModule aboutModule, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aboutModule.model;
            }
            if ((i & 2) != 0) {
                str2 = aboutModule.fullVersion;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = aboutModule.releaseVersion;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = aboutModule.certificateNumber;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = aboutModule.produceNumber;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = aboutModule.technicalNumber;
            }
            return aboutModule.copy(str, str7, str8, str9, str10, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFullVersion() {
            return this.fullVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReleaseVersion() {
            return this.releaseVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCertificateNumber() {
            return this.certificateNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getProduceNumber() {
            return this.produceNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        @NotNull
        public final AboutModule copy(@Nullable String model, @Nullable String fullVersion, @Nullable String releaseVersion, @Nullable String certificateNumber, @Nullable String produceNumber, @Nullable String technicalNumber) {
            return new AboutModule(model, fullVersion, releaseVersion, certificateNumber, produceNumber, technicalNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AboutModule)) {
                return false;
            }
            AboutModule aboutModule = (AboutModule) other;
            return Intrinsics.areEqual(this.model, aboutModule.model) && Intrinsics.areEqual(this.fullVersion, aboutModule.fullVersion) && Intrinsics.areEqual(this.releaseVersion, aboutModule.releaseVersion) && Intrinsics.areEqual(this.certificateNumber, aboutModule.certificateNumber) && Intrinsics.areEqual(this.produceNumber, aboutModule.produceNumber) && Intrinsics.areEqual(this.technicalNumber, aboutModule.technicalNumber);
        }

        @Nullable
        public final String getCertificateNumber() {
            return this.certificateNumber;
        }

        @Nullable
        public final String getFullVersion() {
            return this.fullVersion;
        }

        @Nullable
        public final String getModel() {
            return this.model;
        }

        @Nullable
        public final String getProduceNumber() {
            return this.produceNumber;
        }

        @Nullable
        public final String getReleaseVersion() {
            return this.releaseVersion;
        }

        @Nullable
        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        public int hashCode() {
            String str = this.model;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fullVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.releaseVersion;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.certificateNumber;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.produceNumber;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.technicalNumber;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final void setCertificateNumber(@Nullable String str) {
            this.certificateNumber = str;
        }

        public final void setFullVersion(@Nullable String str) {
            this.fullVersion = str;
        }

        public final void setModel(@Nullable String str) {
            this.model = str;
        }

        public final void setProduceNumber(@Nullable String str) {
            this.produceNumber = str;
        }

        public final void setReleaseVersion(@Nullable String str) {
            this.releaseVersion = str;
        }

        public final void setTechnicalNumber(@Nullable String str) {
            this.technicalNumber = str;
        }

        @NotNull
        public String toString() {
            return "AboutModule(model=" + this.model + ", fullVersion=" + this.fullVersion + ", releaseVersion=" + this.releaseVersion + ", certificateNumber=" + this.certificateNumber + ", produceNumber=" + this.produceNumber + ", technicalNumber=" + this.technicalNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.model);
            dest.writeString(this.fullVersion);
            dest.writeString(this.releaseVersion);
            dest.writeString(this.certificateNumber);
            dest.writeString(this.produceNumber);
            dest.writeString(this.technicalNumber);
        }

        public AboutModule(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.model = str;
            this.fullVersion = str2;
            this.releaseVersion = str3;
            this.certificateNumber = str4;
            this.produceNumber = str5;
            this.technicalNumber = str6;
        }

        public /* synthetic */ AboutModule(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$Alexa;", "Landroid/os/Parcelable;", "productId", "", "clientId", "amazonRestHost", "alexaRestHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "getClientId", "setClientId", "getAmazonRestHost", "setAmazonRestHost", "getAlexaRestHost", "setAlexaRestHost", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Alexa implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Alexa> CREATOR = new Creator();

        @SerializedName("alexa_rest_host")
        @Nullable
        private String alexaRestHost;

        @SerializedName("amazon_rest_host")
        @Nullable
        private String amazonRestHost;

        @SerializedName("client_id")
        @Nullable
        private String clientId;

        @SerializedName(IssuerActivity.KEY_PRODUCT_ID)
        @Nullable
        private String productId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Alexa> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Alexa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Alexa(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Alexa[] newArray(int i) {
                return new Alexa[i];
            }
        }

        public Alexa() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Alexa copy$default(Alexa alexa, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alexa.productId;
            }
            if ((i & 2) != 0) {
                str2 = alexa.clientId;
            }
            if ((i & 4) != 0) {
                str3 = alexa.amazonRestHost;
            }
            if ((i & 8) != 0) {
                str4 = alexa.alexaRestHost;
            }
            return alexa.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAmazonRestHost() {
            return this.amazonRestHost;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAlexaRestHost() {
            return this.alexaRestHost;
        }

        @NotNull
        public final Alexa copy(@Nullable String productId, @Nullable String clientId, @Nullable String amazonRestHost, @Nullable String alexaRestHost) {
            return new Alexa(productId, clientId, amazonRestHost, alexaRestHost);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alexa)) {
                return false;
            }
            Alexa alexa = (Alexa) other;
            return Intrinsics.areEqual(this.productId, alexa.productId) && Intrinsics.areEqual(this.clientId, alexa.clientId) && Intrinsics.areEqual(this.amazonRestHost, alexa.amazonRestHost) && Intrinsics.areEqual(this.alexaRestHost, alexa.alexaRestHost);
        }

        @Nullable
        public final String getAlexaRestHost() {
            return this.alexaRestHost;
        }

        @Nullable
        public final String getAmazonRestHost() {
            return this.amazonRestHost;
        }

        @Nullable
        public final String getClientId() {
            return this.clientId;
        }

        @Nullable
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            String str = this.productId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amazonRestHost;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.alexaRestHost;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void setAlexaRestHost(@Nullable String str) {
            this.alexaRestHost = str;
        }

        public final void setAmazonRestHost(@Nullable String str) {
            this.amazonRestHost = str;
        }

        public final void setClientId(@Nullable String str) {
            this.clientId = str;
        }

        public final void setProductId(@Nullable String str) {
            this.productId = str;
        }

        @NotNull
        public String toString() {
            return "Alexa(productId=" + this.productId + ", clientId=" + this.clientId + ", amazonRestHost=" + this.amazonRestHost + ", alexaRestHost=" + this.alexaRestHost + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productId);
            dest.writeString(this.clientId);
            dest.writeString(this.amazonRestHost);
            dest.writeString(this.alexaRestHost);
        }

        public Alexa(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.productId = str;
            this.clientId = str2;
            this.amazonRestHost = str3;
            this.alexaRestHost = str4;
        }

        public /* synthetic */ Alexa(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$ESIM;", "Landroid/os/Parcelable;", "cuMachinType", "", "<init>", "(Ljava/lang/String;)V", "getCuMachinType", "()Ljava/lang/String;", "setCuMachinType", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ESIM implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESIM> CREATOR = new Creator();

        @SerializedName("cucc_code")
        @Nullable
        private String cuMachinType;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESIM> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESIM createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ESIM(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESIM[] newArray(int i) {
                return new ESIM[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ESIM() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ESIM copy$default(ESIM esim, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = esim.cuMachinType;
            }
            return esim.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCuMachinType() {
            return this.cuMachinType;
        }

        @NotNull
        public final ESIM copy(@Nullable String cuMachinType) {
            return new ESIM(cuMachinType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ESIM) && Intrinsics.areEqual(this.cuMachinType, ((ESIM) other).cuMachinType);
        }

        @Nullable
        public final String getCuMachinType() {
            return this.cuMachinType;
        }

        public int hashCode() {
            String str = this.cuMachinType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setCuMachinType(@Nullable String str) {
            this.cuMachinType = str;
        }

        @NotNull
        public String toString() {
            return "ESIM(cuMachinType=" + this.cuMachinType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.cuMachinType);
        }

        public ESIM(@Nullable String str) {
            this.cuMachinType = str;
        }

        public /* synthetic */ ESIM(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$Ota;", "", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Ota {
    }

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$PrivateUUID;", "Landroid/os/Parcelable;", "service", "", "protoTX", "protoRX", "fitness", "voice", "mass", "otaTX", "otaRX", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "getProtoTX", "setProtoTX", "getProtoRX", "setProtoRX", "getFitness", "setFitness", "getVoice", "setVoice", "getMass", "setMass", "getOtaTX", "setOtaTX", "getOtaRX", "setOtaRX", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrivateUUID implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PrivateUUID> CREATOR = new Creator();

        @Nullable
        private String fitness;

        @Nullable
        private String mass;

        @SerializedName("ota_rx")
        @Nullable
        private String otaRX;

        @SerializedName("ota_tx")
        @Nullable
        private String otaTX;

        @SerializedName("proto_rx")
        @Nullable
        private String protoRX;

        @SerializedName("proto_tx")
        @Nullable
        private String protoTX;

        @Nullable
        private String service;

        @Nullable
        private String voice;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrivateUUID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateUUID(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID[] newArray(int i) {
                return new PrivateUUID[i];
            }
        }

        public PrivateUUID() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getService() {
            return this.service;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getProtoTX() {
            return this.protoTX;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProtoRX() {
            return this.protoRX;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFitness() {
            return this.fitness;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVoice() {
            return this.voice;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMass() {
            return this.mass;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOtaTX() {
            return this.otaTX;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOtaRX() {
            return this.otaRX;
        }

        @NotNull
        public final PrivateUUID copy(@Nullable String service, @Nullable String protoTX, @Nullable String protoRX, @Nullable String fitness, @Nullable String voice, @Nullable String mass, @Nullable String otaTX, @Nullable String otaRX) {
            return new PrivateUUID(service, protoTX, protoRX, fitness, voice, mass, otaTX, otaRX);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrivateUUID)) {
                return false;
            }
            PrivateUUID privateUUID = (PrivateUUID) other;
            return Intrinsics.areEqual(this.service, privateUUID.service) && Intrinsics.areEqual(this.protoTX, privateUUID.protoTX) && Intrinsics.areEqual(this.protoRX, privateUUID.protoRX) && Intrinsics.areEqual(this.fitness, privateUUID.fitness) && Intrinsics.areEqual(this.voice, privateUUID.voice) && Intrinsics.areEqual(this.mass, privateUUID.mass) && Intrinsics.areEqual(this.otaTX, privateUUID.otaTX) && Intrinsics.areEqual(this.otaRX, privateUUID.otaRX);
        }

        @Nullable
        public final String getFitness() {
            return this.fitness;
        }

        @Nullable
        public final String getMass() {
            return this.mass;
        }

        @Nullable
        public final String getOtaRX() {
            return this.otaRX;
        }

        @Nullable
        public final String getOtaTX() {
            return this.otaTX;
        }

        @Nullable
        public final String getProtoRX() {
            return this.protoRX;
        }

        @Nullable
        public final String getProtoTX() {
            return this.protoTX;
        }

        @Nullable
        public final String getService() {
            return this.service;
        }

        @Nullable
        public final String getVoice() {
            return this.voice;
        }

        public int hashCode() {
            String str = this.service;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.protoTX;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.protoRX;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fitness;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.voice;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.mass;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.otaTX;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.otaRX;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final void setFitness(@Nullable String str) {
            this.fitness = str;
        }

        public final void setMass(@Nullable String str) {
            this.mass = str;
        }

        public final void setOtaRX(@Nullable String str) {
            this.otaRX = str;
        }

        public final void setOtaTX(@Nullable String str) {
            this.otaTX = str;
        }

        public final void setProtoRX(@Nullable String str) {
            this.protoRX = str;
        }

        public final void setProtoTX(@Nullable String str) {
            this.protoTX = str;
        }

        public final void setService(@Nullable String str) {
            this.service = str;
        }

        public final void setVoice(@Nullable String str) {
            this.voice = str;
        }

        @NotNull
        public String toString() {
            return "PrivateUUID(service=" + this.service + ", protoTX=" + this.protoTX + ", protoRX=" + this.protoRX + ", fitness=" + this.fitness + ", voice=" + this.voice + ", mass=" + this.mass + ", otaTX=" + this.otaTX + ", otaRX=" + this.otaRX + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.service);
            dest.writeString(this.protoTX);
            dest.writeString(this.protoRX);
            dest.writeString(this.fitness);
            dest.writeString(this.voice);
            dest.writeString(this.mass);
            dest.writeString(this.otaTX);
            dest.writeString(this.otaRX);
        }

        public PrivateUUID(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.service = str;
            this.protoTX = str2;
            this.protoRX = str3;
            this.fitness = str4;
            this.voice = str5;
            this.mass = str6;
            this.otaTX = str7;
            this.otaRX = str8;
        }

        public /* synthetic */ PrivateUUID(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJZ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0003J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "Landroid/os/Parcelable;", "width", "", "height", "radius", "ratio", "", "android_scale", "image_format_exist", "image_format", "<init>", "(IIIFLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "getRadius", "setRadius", "getRatio", "()F", "setRatio", "(F)V", "getAndroid_scale", "()Ljava/lang/Float;", "setAndroid_scale", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getImage_format_exist", "()Ljava/lang/Integer;", "setImage_format_exist", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImage_format", "setImage_format", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IIIFLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Size> CREATOR = new Creator();

        @Nullable
        private Float android_scale;
        private int height;

        @Nullable
        private Integer image_format;

        @Nullable
        private Integer image_format_exist;
        private int radius;
        private float ratio;
        private int width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Size> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Size createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Size(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Size[] newArray(int i) {
                return new Size[i];
            }
        }

        public Size(int i, int i2, int i3, float f, @Nullable Float f2, @Nullable Integer num, @Nullable Integer num2) {
            this.width = i;
            this.height = i2;
            this.radius = i3;
            this.ratio = f;
            this.android_scale = f2;
            this.image_format_exist = num;
            this.image_format = num2;
        }

        public static /* synthetic */ Size copy$default(Size size, int i, int i2, int i3, float f, Float f2, Integer num, Integer num2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = size.width;
            }
            if ((i4 & 2) != 0) {
                i2 = size.height;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = size.radius;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                f = size.ratio;
            }
            float f3 = f;
            if ((i4 & 16) != 0) {
                f2 = size.android_scale;
            }
            Float f4 = f2;
            if ((i4 & 32) != 0) {
                num = size.image_format_exist;
            }
            Integer num3 = num;
            if ((i4 & 64) != 0) {
                num2 = size.image_format;
            }
            return size.copy(i, i5, i6, f3, f4, num3, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getRatio() {
            return this.ratio;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Float getAndroid_scale() {
            return this.android_scale;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getImage_format_exist() {
            return this.image_format_exist;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getImage_format() {
            return this.image_format;
        }

        @NotNull
        public final Size copy(int width, int height, int radius, float ratio, @Nullable Float android_scale, @Nullable Integer image_format_exist, @Nullable Integer image_format) {
            return new Size(width, height, radius, ratio, android_scale, image_format_exist, image_format);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height && this.radius == size.radius && Float.compare(this.ratio, size.ratio) == 0 && Intrinsics.areEqual((Object) this.android_scale, (Object) size.android_scale) && Intrinsics.areEqual(this.image_format_exist, size.image_format_exist) && Intrinsics.areEqual(this.image_format, size.image_format);
        }

        @Nullable
        public final Float getAndroid_scale() {
            return this.android_scale;
        }

        public final int getHeight() {
            return this.height;
        }

        @Nullable
        public final Integer getImage_format() {
            return this.image_format;
        }

        @Nullable
        public final Integer getImage_format_exist() {
            return this.image_format_exist;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final float getRatio() {
            return this.ratio;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.radius)) * 31) + Float.hashCode(this.ratio)) * 31;
            Float f = this.android_scale;
            int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.image_format_exist;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.image_format;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public final void setAndroid_scale(@Nullable Float f) {
            this.android_scale = f;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setImage_format(@Nullable Integer num) {
            this.image_format = num;
        }

        public final void setImage_format_exist(@Nullable Integer num) {
            this.image_format_exist = num;
        }

        public final void setRadius(int i) {
            this.radius = i;
        }

        public final void setRatio(float f) {
            this.ratio = f;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        @NotNull
        public String toString() {
            return "Size(width=" + this.width + ", height=" + this.height + ", radius=" + this.radius + ", ratio=" + this.ratio + ", android_scale=" + this.android_scale + ", image_format_exist=" + this.image_format_exist + ", image_format=" + this.image_format + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.width);
            dest.writeInt(this.height);
            dest.writeInt(this.radius);
            dest.writeFloat(this.ratio);
            Float f = this.android_scale;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            Integer num = this.image_format_exist;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.image_format;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$Status;", "", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Status {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$Type;", "", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Type {
    }

    @Parcelize
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010'\u001a\u00020\tJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Product$XiaoAi;", "Landroid/os/Parcelable;", "clientId", "", "clientSecret", "redirectUrl", "mVid", "mPid", DevInfoKeys.CAPABILITY, "", "capability_bigmodel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getClientSecret", "setClientSecret", "getRedirectUrl", "setRedirectUrl", "getMVid", "setMVid", "getMPid", "setMPid", "getCapability", "()I", "setCapability", "(I)V", "getCapability_bigmodel", "setCapability_bigmodel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class XiaoAi implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<XiaoAi> CREATOR = new Creator();

        @SerializedName(DevInfoKeys.CAPABILITY)
        private int capability;

        @SerializedName("capability_bigmodel")
        private int capability_bigmodel;

        @SerializedName("client_id")
        @Nullable
        private String clientId;

        @SerializedName("client_secret")
        @Nullable
        private String clientSecret;

        @SerializedName("PID")
        @Nullable
        private String mPid;

        @SerializedName("VID")
        @Nullable
        private String mVid;

        @SerializedName("redirect_url")
        @Nullable
        private String redirectUrl;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<XiaoAi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final XiaoAi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new XiaoAi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final XiaoAi[] newArray(int i) {
                return new XiaoAi[i];
            }
        }

        public XiaoAi() {
            this(null, null, null, null, null, 0, 0, 127, null);
        }

        public static /* synthetic */ XiaoAi copy$default(XiaoAi xiaoAi, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = xiaoAi.clientId;
            }
            if ((i3 & 2) != 0) {
                str2 = xiaoAi.clientSecret;
            }
            String str6 = str2;
            if ((i3 & 4) != 0) {
                str3 = xiaoAi.redirectUrl;
            }
            String str7 = str3;
            if ((i3 & 8) != 0) {
                str4 = xiaoAi.mVid;
            }
            String str8 = str4;
            if ((i3 & 16) != 0) {
                str5 = xiaoAi.mPid;
            }
            String str9 = str5;
            if ((i3 & 32) != 0) {
                i = xiaoAi.capability;
            }
            int i4 = i;
            if ((i3 & 64) != 0) {
                i2 = xiaoAi.capability_bigmodel;
            }
            return xiaoAi.copy(str, str6, str7, str8, str9, i4, i2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMVid() {
            return this.mVid;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMPid() {
            return this.mPid;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getCapability() {
            return this.capability;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getCapability_bigmodel() {
            return this.capability_bigmodel;
        }

        @NotNull
        public final XiaoAi copy(@Nullable String clientId, @Nullable String clientSecret, @Nullable String redirectUrl, @Nullable String mVid, @Nullable String mPid, int capability, int capability_bigmodel) {
            return new XiaoAi(clientId, clientSecret, redirectUrl, mVid, mPid, capability, capability_bigmodel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof XiaoAi)) {
                return false;
            }
            XiaoAi xiaoAi = (XiaoAi) other;
            return Intrinsics.areEqual(this.clientId, xiaoAi.clientId) && Intrinsics.areEqual(this.clientSecret, xiaoAi.clientSecret) && Intrinsics.areEqual(this.redirectUrl, xiaoAi.redirectUrl) && Intrinsics.areEqual(this.mVid, xiaoAi.mVid) && Intrinsics.areEqual(this.mPid, xiaoAi.mPid) && this.capability == xiaoAi.capability && this.capability_bigmodel == xiaoAi.capability_bigmodel;
        }

        public final int getCapability() {
            return this.capability;
        }

        public final int getCapability_bigmodel() {
            return this.capability_bigmodel;
        }

        @Nullable
        public final String getClientId() {
            return this.clientId;
        }

        @Nullable
        public final String getClientSecret() {
            return this.clientSecret;
        }

        @Nullable
        public final String getMPid() {
            return this.mPid;
        }

        @Nullable
        public final String getMVid() {
            return this.mVid;
        }

        @Nullable
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public int hashCode() {
            String str = this.clientId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientSecret;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.redirectUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.mVid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mPid;
            return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.capability)) * 31) + Integer.hashCode(this.capability_bigmodel);
        }

        public final void setCapability(int i) {
            this.capability = i;
        }

        public final void setCapability_bigmodel(int i) {
            this.capability_bigmodel = i;
        }

        public final void setClientId(@Nullable String str) {
            this.clientId = str;
        }

        public final void setClientSecret(@Nullable String str) {
            this.clientSecret = str;
        }

        public final void setMPid(@Nullable String str) {
            this.mPid = str;
        }

        public final void setMVid(@Nullable String str) {
            this.mVid = str;
        }

        public final void setRedirectUrl(@Nullable String str) {
            this.redirectUrl = str;
        }

        @NotNull
        public String toString() {
            return "XiaoAi(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", redirectUrl=" + this.redirectUrl + ", mVid=" + this.mVid + ", mPid=" + this.mPid + ", capability=" + this.capability + ", capability_bigmodel=" + this.capability_bigmodel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientId);
            dest.writeString(this.clientSecret);
            dest.writeString(this.redirectUrl);
            dest.writeString(this.mVid);
            dest.writeString(this.mPid);
            dest.writeInt(this.capability);
            dest.writeInt(this.capability_bigmodel);
        }

        public XiaoAi(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2) {
            this.clientId = str;
            this.clientSecret = str2;
            this.redirectUrl = str3;
            this.mVid = str4;
            this.mPid = str5;
            this.capability = i;
            this.capability_bigmodel = i2;
        }

        public /* synthetic */ XiaoAi(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) == 0 ? str5 : null, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
        }
    }

    public Product() {
        this(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAccessType() {
        return this.accessType;
    }

    @Nullable
    public final String getAgps() {
        return this.agps;
    }

    @Nullable
    public final Alexa getAlexa() {
        return this.alexa;
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final List<String> getAndroidFeature() {
        return this.androidFeature;
    }

    public final int getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getBigIcon() {
        return this.bigIcon;
    }

    @Nullable
    public final String getBigIcon3() {
        return this.bigIcon3;
    }

    @Nullable
    public final String getBigPreview() {
        return this.bigPreview;
    }

    @Nullable
    public final AboutModule getBloodPressureModule() {
        return this.bloodPressureModule;
    }

    @Nullable
    public final String getBltNamePrefix() {
        return this.bltNamePrefix;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final int getDiscovery() {
        return this.discovery;
    }

    @Nullable
    public final ESIM getEsim() {
        return this.esim;
    }

    @Nullable
    public final Map<String, String> getFeatureMap() {
        return this.featureMap;
    }

    @Nullable
    public final List<String> getFeatures() {
        return this.features;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final Integer getIotSubCategoryId() {
        return this.iotSubCategoryId;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final int getOta() {
        return this.ota;
    }

    @Nullable
    public final PrivateUUID getPrivateUUID() {
        return this.privateUUID;
    }

    public final int getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final List<Integer> getRssiArray() {
        return this.rssiArray;
    }

    @Nullable
    public final Size getSize() {
        return this.size;
    }

    @Nullable
    public final String getSkuBigIcon() {
        return this.skuBigIcon;
    }

    @Nullable
    public final String getSkuBigPreview() {
        return this.skuBigPreview;
    }

    @Nullable
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubcategory() {
        return this.subcategory;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<String> getWearOsModelIds() {
        return this.wearOsModelIds;
    }

    @Nullable
    public final List<String> getWhitelistFeature() {
        return this.whitelistFeature;
    }

    @Nullable
    public final XiaoAi getXiaoAi() {
        return this.xiaoAi;
    }

    public final void readFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.appVersion = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        this.model = string;
        this.wearOsModelIds = parcel.createStringArrayList();
        this.productId = parcel.readInt();
        this.productName = parcel.readString();
        this.bltNamePrefix = parcel.readString();
        this.bigIcon = parcel.readString();
        this.bigIcon3 = parcel.readString();
        this.bigPreview = parcel.readString();
        this.smallIcon = parcel.readString();
        this.size = (Size) parcel.readParcelable(Size.class.getClassLoader());
        this.discovery = parcel.readInt();
        this.status = parcel.readInt();
        this.type = parcel.readInt();
        this.alias = parcel.readString();
        this.ota = parcel.readInt();
        this.groupId = parcel.readInt();
        this.accessType = parcel.readInt();
        this.privateUUID = (PrivateUUID) parcel.readParcelable(PrivateUUID.class.getClassLoader());
        this.features = parcel.createStringArrayList();
        this.xiaoAi = (XiaoAi) parcel.readParcelable(XiaoAi.class.getClassLoader());
        this.esim = (ESIM) parcel.readParcelable(ESIM.class.getClassLoader());
        this.alexa = (Alexa) parcel.readParcelable(Alexa.class.getClassLoader());
        this.whitelistFeature = parcel.createStringArrayList();
        this.androidFeature = parcel.createStringArrayList();
        int[] iArrCreateIntArray = parcel.createIntArray();
        this.rssiArray = iArrCreateIntArray != null ? ArraysKt___ArraysKt.toMutableList(iArrCreateIntArray) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.featureMap = linkedHashMap;
        Intrinsics.checkNotNull(linkedHashMap);
        parcel.readMap(linkedHashMap, getClass().getClassLoader());
        this.bloodPressureModule = (AboutModule) parcel.readParcelable(AboutModule.class.getClassLoader());
        this.agps = parcel.readString();
        this.category = parcel.readString();
        this.subcategory = parcel.readString();
        this.skuBigIcon = parcel.readString();
        this.skuBigPreview = parcel.readString();
    }

    public final void setAccessType(int i) {
        this.accessType = i;
    }

    public final void setAgps(@Nullable String str) {
        this.agps = str;
    }

    public final void setAlexa(@Nullable Alexa alexa) {
        this.alexa = alexa;
    }

    public final void setAlias(@Nullable String str) {
        this.alias = str;
    }

    public final void setAndroidFeature(@Nullable List<String> list) {
        this.androidFeature = list;
    }

    public final void setAppVersion(int i) {
        this.appVersion = i;
    }

    public final void setBigIcon(@Nullable String str) {
        this.bigIcon = str;
    }

    public final void setBigIcon3(@Nullable String str) {
        this.bigIcon3 = str;
    }

    public final void setBigPreview(@Nullable String str) {
        this.bigPreview = str;
    }

    public final void setBloodPressureModule(@Nullable AboutModule aboutModule) {
        this.bloodPressureModule = aboutModule;
    }

    public final void setBltNamePrefix(@Nullable String str) {
        this.bltNamePrefix = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDiscovery(int i) {
        this.discovery = i;
    }

    public final void setEsim(@Nullable ESIM esim) {
        this.esim = esim;
    }

    public final void setFeatureMap(@Nullable Map<String, String> map) {
        this.featureMap = map;
    }

    public final void setFeatures(@Nullable List<String> list) {
        this.features = list;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setIotSubCategoryId(@Nullable Integer num) {
        this.iotSubCategoryId = num;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOta(int i) {
        this.ota = i;
    }

    public final void setPrivateUUID(@Nullable PrivateUUID privateUUID) {
        this.privateUUID = privateUUID;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setRssiArray(@Nullable List<Integer> list) {
        this.rssiArray = list;
    }

    public final void setSize(@Nullable Size size) {
        this.size = size;
    }

    public final void setSkuBigIcon(@Nullable String str) {
        this.skuBigIcon = str;
    }

    public final void setSkuBigPreview(@Nullable String str) {
        this.skuBigPreview = str;
    }

    public final void setSmallIcon(@Nullable String str) {
        this.smallIcon = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSubcategory(@Nullable String str) {
        this.subcategory = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWearOsModelIds(@Nullable List<String> list) {
        this.wearOsModelIds = list;
    }

    public final void setWhitelistFeature(@Nullable List<String> list) {
        this.whitelistFeature = list;
    }

    public final void setXiaoAi(@Nullable XiaoAi xiaoAi) {
        this.xiaoAi = xiaoAi;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.appVersion);
        dest.writeString(this.model);
        dest.writeStringList(this.wearOsModelIds);
        dest.writeInt(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.bltNamePrefix);
        dest.writeString(this.bigIcon);
        dest.writeString(this.bigIcon3);
        dest.writeString(this.bigPreview);
        dest.writeString(this.smallIcon);
        dest.writeParcelable(this.size, flags);
        dest.writeInt(this.discovery);
        dest.writeInt(this.status);
        dest.writeInt(this.type);
        dest.writeString(this.alias);
        dest.writeInt(this.ota);
        dest.writeInt(this.groupId);
        dest.writeInt(this.accessType);
        dest.writeParcelable(this.privateUUID, flags);
        dest.writeStringList(this.features);
        dest.writeParcelable(this.xiaoAi, flags);
        dest.writeParcelable(this.esim, flags);
        dest.writeParcelable(this.alexa, flags);
        dest.writeStringList(this.whitelistFeature);
        dest.writeStringList(this.androidFeature);
        List<Integer> list = this.rssiArray;
        dest.writeIntArray(list != null ? CollectionsKt___CollectionsKt.toIntArray(list) : null);
        dest.writeMap(this.featureMap);
        dest.writeParcelable(this.bloodPressureModule, flags);
        dest.writeString(this.agps);
        dest.writeString(this.category);
        dest.writeString(this.subcategory);
        dest.writeString(this.skuBigIcon);
        dest.writeString(this.skuBigPreview);
    }

    public Product(int i, @NotNull String model, @Nullable List<String> list, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Size size, int i3, int i4, int i5, @Nullable String str7, int i6, int i7, @Nullable Integer num, int i8, @Nullable PrivateUUID privateUUID, @Nullable List<String> list2, @Nullable XiaoAi xiaoAi, @Nullable ESIM esim, @Nullable Alexa alexa, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<Integer> list5, @Nullable Map<String, String> map, @Nullable AboutModule aboutModule, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.appVersion = i;
        this.model = model;
        this.wearOsModelIds = list;
        this.productId = i2;
        this.productName = str;
        this.bltNamePrefix = str2;
        this.bigIcon = str3;
        this.bigIcon3 = str4;
        this.bigPreview = str5;
        this.smallIcon = str6;
        this.size = size;
        this.discovery = i3;
        this.status = i4;
        this.type = i5;
        this.alias = str7;
        this.ota = i6;
        this.groupId = i7;
        this.iotSubCategoryId = num;
        this.accessType = i8;
        this.privateUUID = privateUUID;
        this.features = list2;
        this.xiaoAi = xiaoAi;
        this.esim = esim;
        this.alexa = alexa;
        this.whitelistFeature = list3;
        this.androidFeature = list4;
        this.rssiArray = list5;
        this.featureMap = map;
        this.bloodPressureModule = aboutModule;
        this.agps = str8;
        this.category = str9;
        this.subcategory = str10;
        this.skuBigIcon = str11;
        this.skuBigPreview = str12;
    }

    public /* synthetic */ Product(int i, String str, List list, int i2, String str2, String str3, String str4, String str5, String str6, String str7, Size size, int i3, int i4, int i5, String str8, int i6, int i7, Integer num, int i8, PrivateUUID privateUUID, List list2, XiaoAi xiaoAi, ESIM esim, Alexa alexa, List list3, List list4, List list5, Map map, AboutModule aboutModule, String str9, String str10, String str11, String str12, String str13, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? null : list, (i9 & 8) != 0 ? -1 : i2, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : str3, (i9 & 64) != 0 ? null : str4, (i9 & 128) != 0 ? null : str5, (i9 & 256) != 0 ? null : str6, (i9 & 512) != 0 ? null : str7, (i9 & 1024) != 0 ? null : size, (i9 & 2048) != 0 ? 0 : i3, (i9 & 4096) != 0 ? 0 : i4, (i9 & 8192) != 0 ? 0 : i5, (i9 & 16384) != 0 ? null : str8, (i9 & 32768) != 0 ? 0 : i6, (i9 & 65536) != 0 ? 0 : i7, (i9 & 131072) != 0 ? null : num, (i9 & 262144) != 0 ? 0 : i8, (i9 & 524288) != 0 ? null : privateUUID, (i9 & EventRecurrence.TH) != 0 ? null : list2, (i9 & 2097152) != 0 ? null : xiaoAi, (i9 & 4194304) != 0 ? null : esim, (i9 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? null : alexa, (i9 & 16777216) != 0 ? null : list3, (i9 & 33554432) != 0 ? null : list4, (i9 & 67108864) != 0 ? null : list5, (i9 & 134217728) != 0 ? null : map, (i9 & 268435456) != 0 ? null : aboutModule, (i9 & 536870912) != 0 ? null : str9, (i9 & 1073741824) != 0 ? null : str10, (i9 & Integer.MIN_VALUE) != 0 ? null : str11, (i10 & 1) != 0 ? null : str12, (i10 & 2) != 0 ? null : str13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Product(@NotNull Parcel parcel) {
        this(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
