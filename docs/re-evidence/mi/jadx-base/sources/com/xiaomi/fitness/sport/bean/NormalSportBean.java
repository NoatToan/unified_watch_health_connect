package com.xiaomi.fitness.sport.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/NormalSportBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "()V", "launchSportEntranceList", "", "Lcom/xiaomi/fitness/sport/bean/LaunchSportEntrance;", "getLaunchSportEntranceList", "()Ljava/util/List;", "setLaunchSportEntranceList", "(Ljava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalSportBean extends BaseSportItemBean {

    @NotNull
    private List<LaunchSportEntrance> launchSportEntranceList = new ArrayList();

    @NotNull
    public final List<LaunchSportEntrance> getLaunchSportEntranceList() {
        return this.launchSportEntranceList;
    }

    public final void setLaunchSportEntranceList(@NotNull List<LaunchSportEntrance> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.launchSportEntranceList = list;
    }
}
