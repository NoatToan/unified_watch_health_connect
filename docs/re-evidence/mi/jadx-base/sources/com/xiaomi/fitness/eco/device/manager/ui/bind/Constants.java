package com.xiaomi.fitness.eco.device.manager.ui.bind;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/Constants;", "", "<init>", "()V", "HOST_ECO_OPERATION", "", "getEcoOperationHost", "getEcoPrivacyPolicyUrlByType", "type", "locale", "model", "getEcoUserAgreementByType", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {

    @NotNull
    private static final String HOST_ECO_OPERATION = "https://res.eco.mi.com";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    private Constants() {
    }

    private final String getEcoOperationHost() {
        return "https://res.eco.mi.com";
    }

    @NotNull
    public final String getEcoPrivacyPolicyUrlByType(@NotNull String type, @NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        return getEcoOperationHost() + "/html/privacy/index.html?type=" + type + "&model=" + model + "&locale=" + locale;
    }

    @NotNull
    public final String getEcoUserAgreementByType(@NotNull String type, @NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        return getEcoOperationHost() + "/html/privacy/index.html?type=" + type + "&model=" + model;
    }
}
