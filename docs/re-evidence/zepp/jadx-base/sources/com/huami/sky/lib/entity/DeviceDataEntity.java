package com.huami.sky.lib.entity;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R!\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/lib/entity/DeviceDataEntity;", "", "", "toString", "", "Lcom/huami/sky/lib/entity/UserActivity;", "userActivity", "Ljava/util/List;", "getUserActivity", "()Ljava/util/List;", "Lcom/huami/sky/lib/entity/UserRrInterval;", "userRrInterval", "getUserRrInterval", "Lcom/huami/sky/lib/entity/UserSleepProbability;", "userSleepProbability", "getUserSleepProbability", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataEntity {

    /* JADX INFO: renamed from: userActivity, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<UserActivity> activity;

    @Nullable
    private final List<UserRrInterval> userRrInterval;

    @Nullable
    private final List<UserSleepProbability> userSleepProbability;

    public DeviceDataEntity(@Nullable List<UserActivity> list, @Nullable List<UserRrInterval> list2, @Nullable List<UserSleepProbability> list3) {
        this.activity = list;
        this.userRrInterval = list2;
        this.userSleepProbability = list3;
    }

    @Nullable
    public final List<UserActivity> getUserActivity() {
        return this.activity;
    }

    @Nullable
    public final List<UserRrInterval> getUserRrInterval() {
        return this.userRrInterval;
    }

    @Nullable
    public final List<UserSleepProbability> getUserSleepProbability() {
        return this.userSleepProbability;
    }

    @NotNull
    public String toString() {
        return "activity=" + this.activity + ",rr=" + this.userRrInterval + ",sleep=" + this.userSleepProbability;
    }
}
