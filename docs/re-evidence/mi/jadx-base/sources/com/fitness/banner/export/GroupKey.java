package com.fitness.banner.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/fitness/banner/export/GroupKey;", "", "<init>", "()V", "GROUP_DEFAULT", "", "GROUP_OUTDOOR_RUN", "GROUP_FREE_TRAIN", "GROUP_OUTDOOR_WALK", "GROUP_OUTDOOR_BIKE", "GROUP_INDOOR_RUN", "GROUP_ARTICLE_NO_DEVICE", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupKey {
    public static final int GROUP_ARTICLE_NO_DEVICE = 2;
    public static final int GROUP_DEFAULT = 0;
    public static final int GROUP_FREE_TRAIN = 2;
    public static final int GROUP_INDOOR_RUN = 5;
    public static final int GROUP_OUTDOOR_BIKE = 4;
    public static final int GROUP_OUTDOOR_RUN = 1;
    public static final int GROUP_OUTDOOR_WALK = 3;

    @NotNull
    public static final GroupKey INSTANCE = new GroupKey();

    private GroupKey() {
    }
}
