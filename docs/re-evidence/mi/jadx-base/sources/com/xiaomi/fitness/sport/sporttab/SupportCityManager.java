package com.xiaomi.fitness.sport.sporttab;

import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\r\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SupportCityManager;", "", "<init>", "()V", "supportCityData", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "getSupportCityData", "()Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "setSupportCityData", "(Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;)V", "initSupportCityData", "", "data", "isOfficialOpen", "", "()Ljava/lang/Boolean;", "isAIOpen", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportCityManager {

    @NotNull
    public static final SupportCityManager INSTANCE = new SupportCityManager();

    @Nullable
    private static volatile RunningRouteSupportCityBean supportCityData;

    private SupportCityManager() {
    }

    @Nullable
    public final RunningRouteSupportCityBean getSupportCityData() {
        return supportCityData;
    }

    public final void initSupportCityData(@NotNull RunningRouteSupportCityBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        supportCityData = data;
    }

    public final boolean isAIOpen() {
        RunningRouteSupportCityBean runningRouteSupportCityBean = supportCityData;
        return runningRouteSupportCityBean != null && runningRouteSupportCityBean.getAiOpen();
    }

    @Nullable
    public final Boolean isOfficialOpen() {
        RunningRouteSupportCityBean runningRouteSupportCityBean = supportCityData;
        if (runningRouteSupportCityBean != null) {
            return Boolean.valueOf(runningRouteSupportCityBean.getOfficialOpen());
        }
        return null;
    }

    public final void setSupportCityData(@Nullable RunningRouteSupportCityBean runningRouteSupportCityBean) {
        supportCityData = runningRouteSupportCityBean;
    }
}
