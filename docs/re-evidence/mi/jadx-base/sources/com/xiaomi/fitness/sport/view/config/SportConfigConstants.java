package com.xiaomi.fitness.sport.view.config;

import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/view/config/SportConfigConstants;", "", "<init>", "()V", "HOST_OPERATION", "", "LOCK_SCREEN_NOT_WORKING_INSTRUCTION_URL", "RUN_IN_BG_INSTRUCTION_URL", "getLockScreenUrl", "locale", "model", "getRunInBgInstructionUrl", "getOperationHost", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportConfigConstants {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    public static final SportConfigConstants INSTANCE = new SportConfigConstants();

    @NotNull
    private static final String LOCK_SCREEN_NOT_WORKING_INSTRUCTION_URL = "%s/html/luckscreen_permission_guide/index.html?locale=%s&model=%s";

    @NotNull
    private static final String RUN_IN_BG_INSTRUCTION_URL = "%s/html/permission_settings_run_in_background/index.html?locale=%s&model=%s";

    private SportConfigConstants() {
    }

    @JvmStatic
    @NotNull
    public static final String getLockScreenUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(LOCK_SCREEN_NOT_WORKING_INSTRUCTION_URL, Arrays.copyOf(new Object[]{INSTANCE.getOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getOperationHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @JvmStatic
    @NotNull
    public static final String getRunInBgInstructionUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(RUN_IN_BG_INSTRUCTION_URL, Arrays.copyOf(new Object[]{INSTANCE.getOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
