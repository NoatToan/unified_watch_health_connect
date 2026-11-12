package com.xiaomi.fitness.sport_manager_export;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/ServiceHelper;", "", "<init>", "()V", "HOST_ECO_OPERATION", "", "HOST_ECO_OPERATION_PLAY", "convertWearToEcoRegion", "currentRegion", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceHelper {

    @NotNull
    public static final String HOST_ECO_OPERATION = "https://res.eco.mi.com";

    @NotNull
    public static final String HOST_ECO_OPERATION_PLAY = "https://%scdn.eco.mi.com/eco-web/prod";

    @NotNull
    public static final ServiceHelper INSTANCE = new ServiceHelper();

    private ServiceHelper() {
    }

    @NotNull
    public final String convertWearToEcoRegion(@NotNull String currentRegion) {
        Intrinsics.checkNotNullParameter(currentRegion, "currentRegion");
        int iHashCode = currentRegion.hashCode();
        if (iHashCode == 3201) {
            return !currentRegion.equals("de") ? currentRegion : "eu";
        }
        if (iHashCode != 3305) {
            return (iHashCode == 3742 && currentRegion.equals("us")) ? "or" : currentRegion;
        }
        return !currentRegion.equals("i2") ? currentRegion : "in";
    }
}
