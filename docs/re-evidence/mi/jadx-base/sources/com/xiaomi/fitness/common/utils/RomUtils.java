package com.xiaomi.fitness.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DoorCardConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.passport.ui.utils.OsHelper;
import defpackage.n86;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001ZB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0007J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&J\u0010\u0010(\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020&J\u000e\u0010,\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&J1\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050<\"\u00020\u0005H\u0002¢\u0006\u0002\u0010=J\u0010\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005H\u0002J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0005H\u0002J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0002J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u0005H\u0002J\u0010\u0010M\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u0005H\u0002J\u0010\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u0018H\u0002J\u0006\u0010P\u001a\u00020\u0018J$\u0010Q\u001a\u00020\u00182\n\u0010R\u001a\u0006\u0012\u0002\b\u00030S2\u0006\u0010T\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0018H\u0002J\u0006\u0010V\u001a\u00020\u0018J\b\u0010W\u001a\u0004\u0018\u00010\u0005J\u001a\u0010X\u001a\u0004\u0018\u00010\u00052\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0019R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010.\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u0011\u00104\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019R\u0011\u00105\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010+R\u0014\u00109\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010+R\u0011\u0010@\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bA\u0010+R\u001a\u0010B\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u0010+¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/common/utils/RomUtils;", "", "<init>", "()V", "TAG", "", "HUAWEI", "HONOR", OsHelper.ROM_VIVO, DoorCardConstants.PARTNER_ID, OsHelper.ROM_OPPO, "SAMSUNG", "SONY", "BLACK_SHARK", "VERSION_PROPERTY_HUAWEI", "VERSION_PROPERTY_VIVO", "VERSION_PROPERTY_XIAOMI", "VERSION_PROPERTY_OPPO", "VERSION_MIUI", "VERSION_MIUI_VALUE_11", DeviceTypes.UNKNOWN, "bean", "Lcom/xiaomi/fitness/common/utils/RomUtils$RomInfo;", "isHuawei", "", "()Z", "isHonor", "isVivo", "isXiaomi", "isXiaomi$annotations", "isSamSung", "isSamSung$annotations", "isSony", "isSony$annotations", "isBlackShark", "isBlackShark$annotations", "isHyperOS", "context", "Landroid/content/Context;", "isAtLeastHyperOS2", "isAtLeastHyperOS3", TSMAuthContants.PARAM_HYPER_OS_VERSION, "getHyperOSVersion", "()Ljava/lang/String;", "isMIUIRom", "isMiui", "isMiuiLite", "totalRam", "", "getTotalRam", "()I", "isMiuiDev", "isOppo", "romInfo", "getRomInfo", "()Lcom/xiaomi/fitness/common/utils/RomUtils$RomInfo;", "isRightRom", CommonConstants.KEY_BRAND, "manufacturer", "names", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z", "getManufacturer", "getBrand", "brandSpecial", "getBrandSpecial", "miuiVersion", "getMiuiVersion$annotations", "getMiuiVersion", "getRomVersion", "propertyName", "getSystemProperty", "name", "getSystemPropertyByShell", "propName", "getSystemPropertyByStream", "key", "getSystemPropertyByReflect", "checkIsMiui", "onlyDev", "isMiDev", "getStaticBooleanField", "buildClass", "Ljava/lang/Class;", "fieldName", "defaultValue", "isHarmonyOs", "getHarmonyVersion", "getProp", "property", "RomInfo", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRomUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RomUtils.kt\ncom/xiaomi/fitness/common/utils/RomUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,437:1\n37#2:438\n36#2,3:439\n*S KotlinDebug\n*F\n+ 1 RomUtils.kt\ncom/xiaomi/fitness/common/utils/RomUtils\n*L\n176#1:438\n176#1:439,3\n*E\n"})
public final class RomUtils {

    @NotNull
    public static final String BLACK_SHARK = "shark";

    @NotNull
    public static final String HONOR = "honor";

    @NotNull
    public static final String HUAWEI = "huawei";

    @NotNull
    public static final RomUtils INSTANCE = new RomUtils();

    @NotNull
    public static final String OPPO = "oppo";

    @NotNull
    public static final String SAMSUNG = "samsung";

    @NotNull
    public static final String SONY = "sony";

    @NotNull
    private static final String TAG = "RomUtils";

    @NotNull
    private static final String UNKNOWN = "unknown";

    @NotNull
    private static final String VERSION_MIUI = "ro.miui.ui.version.name";

    @NotNull
    public static final String VERSION_MIUI_VALUE_11 = "V11";

    @NotNull
    private static final String VERSION_PROPERTY_HUAWEI = "ro.build.version.emui";

    @NotNull
    private static final String VERSION_PROPERTY_OPPO = "ro.build.version.opporom";

    @NotNull
    private static final String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";

    @NotNull
    private static final String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";

    @NotNull
    public static final String VIVO = "vivo";

    @NotNull
    public static final String XIAOMI = "xiaomi";
    private static RomInfo bean;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/common/utils/RomUtils$RomInfo;", "", "name", "", "version", "isMiui", "", "isMiuiDev", "model", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getVersion", "setVersion", "()Z", "setMiui", "(Z)V", "setMiuiDev", "getModel", "setModel", "getProduct", "setProduct", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RomInfo {
        private boolean isMiui;
        private boolean isMiuiDev;

        @Nullable
        private String model;

        @Nullable
        private String name;

        @Nullable
        private String product;

        @Nullable
        private String version;

        public RomInfo() {
            this(null, null, false, false, null, null, 63, null);
        }

        public static /* synthetic */ RomInfo copy$default(RomInfo romInfo, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = romInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = romInfo.version;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                z = romInfo.isMiui;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = romInfo.isMiuiDev;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                str3 = romInfo.model;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                str4 = romInfo.product;
            }
            return romInfo.copy(str, str5, z3, z4, str6, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsMiui() {
            return this.isMiui;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMiuiDev() {
            return this.isMiuiDev;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        @NotNull
        public final RomInfo copy(@Nullable String name, @Nullable String version, boolean isMiui, boolean isMiuiDev, @Nullable String model, @Nullable String product) {
            return new RomInfo(name, version, isMiui, isMiuiDev, model, product);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RomInfo)) {
                return false;
            }
            RomInfo romInfo = (RomInfo) other;
            return Intrinsics.areEqual(this.name, romInfo.name) && Intrinsics.areEqual(this.version, romInfo.version) && this.isMiui == romInfo.isMiui && this.isMiuiDev == romInfo.isMiuiDev && Intrinsics.areEqual(this.model, romInfo.model) && Intrinsics.areEqual(this.product, romInfo.product);
        }

        @Nullable
        public final String getModel() {
            return this.model;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getProduct() {
            return this.product;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.version;
            int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isMiui)) * 31) + Boolean.hashCode(this.isMiuiDev)) * 31;
            String str3 = this.model;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.product;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean isMiui() {
            return this.isMiui;
        }

        public final boolean isMiuiDev() {
            return this.isMiuiDev;
        }

        public final void setMiui(boolean z) {
            this.isMiui = z;
        }

        public final void setMiuiDev(boolean z) {
            this.isMiuiDev = z;
        }

        public final void setModel(@Nullable String str) {
            this.model = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setProduct(@Nullable String str) {
            this.product = str;
        }

        public final void setVersion(@Nullable String str) {
            this.version = str;
        }

        @NotNull
        public String toString() {
            return "RomInfo(name=" + this.name + ", version=" + this.version + ", isMiui=" + this.isMiui + ", isMiuiDev=" + this.isMiuiDev + ", model=" + this.model + ", product=" + this.product + ")";
        }

        public RomInfo(@Nullable String str, @Nullable String str2, boolean z, boolean z2, @Nullable String str3, @Nullable String str4) {
            this.name = str;
            this.version = str2;
            this.isMiui = z;
            this.isMiuiDev = z2;
            this.model = str3;
            this.product = str4;
        }

        public /* synthetic */ RomInfo(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
        }
    }

    private RomUtils() {
    }

    private final boolean checkIsMiui(boolean onlyDev) {
        Class<?> cls;
        try {
            cls = Class.forName("miui.os.Build");
        } catch (Exception e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            return getStaticBooleanField(cls, onlyDev ? "IS_DEVELOPMENT_VERSION" : "IS_MIUI", false);
        }
        return false;
    }

    private final String getBrand() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str)) {
                return "unknown";
            }
            Intrinsics.checkNotNull(str);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private final String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str)) {
                return "unknown";
            }
            Intrinsics.checkNotNull(str);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    @NotNull
    public static final String getMiuiVersion() {
        return INSTANCE.getSystemProperty(VERSION_MIUI);
    }

    @JvmStatic
    public static /* synthetic */ void getMiuiVersion$annotations() {
    }

    private final String getProp(String property, String defaultValue) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            Object objInvoke = declaredMethod.invoke(cls, property);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objInvoke;
            return TextUtils.isEmpty(str) ? defaultValue : str;
        } catch (Throwable th) {
            th.printStackTrace();
            return defaultValue;
        }
    }

    private final String getRomVersion(String propertyName) {
        String systemProperty = !TextUtils.isEmpty(propertyName) ? getSystemProperty(propertyName) : "";
        if (TextUtils.isEmpty(systemProperty) || Intrinsics.areEqual(systemProperty, "unknown")) {
            try {
                String str = Build.DISPLAY;
                if (!TextUtils.isEmpty(str)) {
                    Intrinsics.checkNotNull(str);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String lowerCase = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    systemProperty = lowerCase;
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(systemProperty) ? "unknown" : systemProperty;
    }

    private final boolean getStaticBooleanField(Class<?> buildClass, String fieldName, boolean defaultValue) {
        try {
            Field field = buildClass.getField(fieldName);
            field.setAccessible(true);
            return field.getBoolean(null);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    private final String getSystemProperty(String name) throws Throwable {
        String systemPropertyByShell = getSystemPropertyByShell(name);
        if (!TextUtils.isEmpty(systemPropertyByShell)) {
            return systemPropertyByShell;
        }
        String systemPropertyByStream = getSystemPropertyByStream(name);
        return (TextUtils.isEmpty(systemPropertyByStream) && Build.VERSION.SDK_INT < 28) ? getSystemPropertyByReflect(name) : systemPropertyByStream;
    }

    private final String getSystemPropertyByReflect(String key) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, key, "");
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String getSystemPropertyByShell(String propName) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + propName).getInputStream()), 1024);
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return line;
                    }
                    bufferedReader2.close();
                    return "";
                } catch (IOException unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                return "";
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final String getSystemPropertyByStream(String key) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                String property = properties.getProperty(key, "");
                Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
                CloseableKt.closeFinally(fileInputStream, null);
                return property;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ boolean isAtLeastHyperOS3$default(RomUtils romUtils, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = AppUtil.getApp();
        }
        return romUtils.isAtLeastHyperOS3(context);
    }

    public static final boolean isBlackShark() {
        return Intrinsics.areEqual(BLACK_SHARK, INSTANCE.getRomInfo().getName());
    }

    @JvmStatic
    public static /* synthetic */ void isBlackShark$annotations() {
    }

    @JvmStatic
    public static final boolean isHyperOS(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RomUtils romUtils = INSTANCE;
        return romUtils.isMIUIRom(context) && !TextUtils.isEmpty(romUtils.getSystemPropertyByReflect("ro.mi.os.version.name"));
    }

    private final boolean isRightRom(String brand, String manufacturer, String... names) {
        for (String str : names) {
            if (StringsKt__StringsKt.contains$default((CharSequence) brand, (CharSequence) str, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) manufacturer, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isSamSung() {
        return Intrinsics.areEqual(SAMSUNG, INSTANCE.getRomInfo().getName());
    }

    @JvmStatic
    public static /* synthetic */ void isSamSung$annotations() {
    }

    public static final boolean isSony() {
        return Intrinsics.areEqual(SONY, INSTANCE.getRomInfo().getName());
    }

    @JvmStatic
    public static /* synthetic */ void isSony$annotations() {
    }

    public static final boolean isXiaomi() {
        return Intrinsics.areEqual("xiaomi", INSTANCE.getRomInfo().getName());
    }

    @JvmStatic
    public static /* synthetic */ void isXiaomi$annotations() {
    }

    @NotNull
    public final String getBrandSpecial() {
        if (isXiaomi()) {
            return "xiaomi";
        }
        if (isHuawei()) {
            return HUAWEI;
        }
        if (isOppo()) {
            return OPPO;
        }
        return isVivo() ? VIVO : getBrand();
    }

    @Nullable
    public final String getHarmonyVersion() {
        return getProp("hw_sc.build.platform.version", "");
    }

    @NotNull
    public final String getHyperOSVersion() {
        return getSystemPropertyByReflect("ro.mi.os.version.name");
    }

    @NotNull
    public final RomInfo getRomInfo() {
        RomInfo romInfo = bean;
        if (romInfo != null) {
            if (romInfo != null) {
                return romInfo;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        bean = new RomInfo(null, null, false, false, null, null, 63, null);
        String brand = getBrand();
        String manufacturer = getManufacturer();
        RomInfo romInfo2 = bean;
        if (romInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            romInfo2 = null;
        }
        romInfo2.setModel(Build.MODEL);
        RomInfo romInfo3 = bean;
        if (romInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            romInfo3 = null;
        }
        romInfo3.setProduct(Build.PRODUCT);
        if (isRightRom(brand, manufacturer, HUAWEI)) {
            RomInfo romInfo4 = bean;
            if (romInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo4 = null;
            }
            romInfo4.setName(HUAWEI);
            String romVersion = getRomVersion(VERSION_PROPERTY_HUAWEI);
            String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) romVersion, new String[]{RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length > 1) {
                RomInfo romInfo5 = bean;
                if (romInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                    romInfo5 = null;
                }
                romInfo5.setVersion(strArr[1]);
            } else {
                RomInfo romInfo6 = bean;
                if (romInfo6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bean");
                    romInfo6 = null;
                }
                romInfo6.setVersion(romVersion);
            }
            RomInfo romInfo7 = bean;
            if (romInfo7 != null) {
                return romInfo7;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, VIVO)) {
            RomInfo romInfo8 = bean;
            if (romInfo8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo8 = null;
            }
            romInfo8.setName(VIVO);
            RomInfo romInfo9 = bean;
            if (romInfo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo9 = null;
            }
            romInfo9.setVersion(getRomVersion(VERSION_PROPERTY_VIVO));
            RomInfo romInfo10 = bean;
            if (romInfo10 != null) {
                return romInfo10;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, "xiaomi")) {
            RomInfo romInfo11 = bean;
            if (romInfo11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo11 = null;
            }
            romInfo11.setName("xiaomi");
            RomInfo romInfo12 = bean;
            if (romInfo12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo12 = null;
            }
            romInfo12.setVersion(getRomVersion(VERSION_PROPERTY_XIAOMI));
            RomInfo romInfo13 = bean;
            if (romInfo13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo13 = null;
            }
            romInfo13.setMiui(checkIsMiui(false));
            RomInfo romInfo14 = bean;
            if (romInfo14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo14 = null;
            }
            romInfo14.setMiuiDev(checkIsMiui(true));
            RomInfo romInfo15 = bean;
            if (romInfo15 != null) {
                return romInfo15;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, BLACK_SHARK)) {
            RomInfo romInfo16 = bean;
            if (romInfo16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo16 = null;
            }
            romInfo16.setName(BLACK_SHARK);
            RomInfo romInfo17 = bean;
            if (romInfo17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo17 = null;
            }
            romInfo17.setVersion("unknown");
            RomInfo romInfo18 = bean;
            if (romInfo18 != null) {
                return romInfo18;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, SAMSUNG)) {
            RomInfo romInfo19 = bean;
            if (romInfo19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo19 = null;
            }
            romInfo19.setName(SAMSUNG);
            RomInfo romInfo20 = bean;
            if (romInfo20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo20 = null;
            }
            romInfo20.setVersion("unknown");
            RomInfo romInfo21 = bean;
            if (romInfo21 != null) {
                return romInfo21;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, SONY)) {
            RomInfo romInfo22 = bean;
            if (romInfo22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo22 = null;
            }
            romInfo22.setName(SONY);
            RomInfo romInfo23 = bean;
            if (romInfo23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo23 = null;
            }
            romInfo23.setVersion("unknown");
            RomInfo romInfo24 = bean;
            if (romInfo24 != null) {
                return romInfo24;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, HONOR)) {
            RomInfo romInfo25 = bean;
            if (romInfo25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo25 = null;
            }
            romInfo25.setName(HONOR);
            RomInfo romInfo26 = bean;
            if (romInfo26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo26 = null;
            }
            romInfo26.setVersion("unknown");
            RomInfo romInfo27 = bean;
            if (romInfo27 != null) {
                return romInfo27;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        if (isRightRom(brand, manufacturer, OPPO)) {
            RomInfo romInfo28 = bean;
            if (romInfo28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo28 = null;
            }
            romInfo28.setName(OPPO);
            RomInfo romInfo29 = bean;
            if (romInfo29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bean");
                romInfo29 = null;
            }
            romInfo29.setVersion(getRomVersion(VERSION_PROPERTY_OPPO));
            RomInfo romInfo30 = bean;
            if (romInfo30 != null) {
                return romInfo30;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            return null;
        }
        RomInfo romInfo31 = bean;
        if (romInfo31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            romInfo31 = null;
        }
        romInfo31.setName(manufacturer);
        RomInfo romInfo32 = bean;
        if (romInfo32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bean");
            romInfo32 = null;
        }
        romInfo32.setVersion(getRomVersion(""));
        RomInfo romInfo33 = bean;
        if (romInfo33 != null) {
            return romInfo33;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bean");
        return null;
    }

    public final int getTotalRam() {
        if (isMiui()) {
            return n86.s;
        }
        ActivityManager activityManager = (ActivityManager) ApplicationExtKt.getApplication().getSystemService(ActivityManager.class);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / ((long) 1073741824));
    }

    public final boolean isAtLeastHyperOS2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String systemPropertyByReflect = getSystemPropertyByReflect("ro.mi.os.version.code");
        return isMIUIRom(context) && !TextUtils.isEmpty(systemPropertyByReflect) && Integer.parseInt(systemPropertyByReflect) >= 2;
    }

    public final boolean isAtLeastHyperOS3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String systemPropertyByReflect = getSystemPropertyByReflect("ro.mi.os.version.code");
        return isMIUIRom(context) && !TextUtils.isEmpty(systemPropertyByReflect) && Integer.parseInt(systemPropertyByReflect) >= 3;
    }

    public final boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return StringsKt__StringsJVMKt.equals("Harmony", cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString(), true);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isHonor() {
        return Intrinsics.areEqual(HONOR, getRomInfo().getName());
    }

    public final boolean isHuawei() {
        return Intrinsics.areEqual(HUAWEI, getRomInfo().getName());
    }

    public final boolean isMIUIRom(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getPackageInfo("com.miui.cloudservice", 16384) != null;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public final boolean isMiDev() {
        try {
            if (getRomInfo().getVersion() == null) {
                return false;
            }
            String version = getRomInfo().getVersion();
            Intrinsics.checkNotNull(version);
            return StringsKt__StringsJVMKt.endsWith$default(version, ".DEV", false, 2, null);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isMiui() {
        return isXiaomi() && getRomInfo().isMiui();
    }

    public final boolean isMiuiDev() {
        return isXiaomi() && getRomInfo().isMiuiDev();
    }

    public final boolean isMiuiLite() {
        return n86.f27647r || Intrinsics.areEqual("dandelion", Build.BOARD);
    }

    public final boolean isOppo() {
        return Intrinsics.areEqual(OPPO, getRomInfo().getName());
    }

    public final boolean isVivo() {
        return Intrinsics.areEqual(VIVO, getRomInfo().getName());
    }
}
