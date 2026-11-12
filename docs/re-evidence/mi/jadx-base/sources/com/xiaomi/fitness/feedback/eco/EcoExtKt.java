package com.xiaomi.fitness.feedback.eco;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport_manager_export.ServiceHelper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\"\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b\u001a\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\b\u001a\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"getEcoOperationHost", "", "getEcoFAQUrl", "model", "wideTagId", "", "tagId", "isUseEcoUrl", "", "type", "isEcoIot", "deviceData", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "isEco", "feedback_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoExtKt {
    @NotNull
    public static final String getEcoFAQUrl(@Nullable String str, int i, int i2) {
        String ecoOperationHost = getEcoOperationHost();
        if (str == null) {
            str = "";
        }
        return ecoOperationHost + "/html/feedback-faq/index.html?model=" + str + "&wideTagId=" + i + "&tagId=" + i2 + "&locale=" + LocaleUtil.getCurrentLocale();
    }

    public static /* synthetic */ String getEcoFAQUrl$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        return getEcoFAQUrl(str, i, i2);
    }

    private static final String getEcoOperationHost() {
        ServiceHelper serviceHelper = ServiceHelper.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strConvertWearToEcoRegion = serviceHelper.convertWearToEcoRegion(lowerCase);
        Logger.i("EcoExt", "getEcoOperationHost: region = " + strConvertWearToEcoRegion);
        if (Intrinsics.areEqual(strConvertWearToEcoRegion, "cn")) {
            return ServiceHelper.HOST_ECO_OPERATION;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(ServiceHelper.HOST_ECO_OPERATION_PLAY, Arrays.copyOf(new Object[]{strConvertWearToEcoRegion + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean isEco(int i) {
        return i == 11 || i == 14 || i == 12 || i == 13;
    }

    public static final boolean isUseEcoUrl(int i, boolean z) {
        return i == 12 || i == 13 || z;
    }

    public static final boolean isUseEcoUrl(@Nullable DeviceData deviceData, boolean z) {
        return (deviceData != null && deviceData.getType() == 10) || (deviceData != null && deviceData.getType() == 11) || z;
    }
}
