package com.fitness.banner.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fitness/banner/export/BusinessKey;", "", "<init>", "()V", "BUSINESS_SPORT", "", "BUSINESS_ARTICLE", "BUSINESS_TAB_SPORT", "BUSINESS_TAB_DEVICE", "BUSINESS_TAG_USER_CENTER", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BusinessKey {

    @NotNull
    public static final String BUSINESS_ARTICLE = "MI_WATCH_ARTICLE";

    @NotNull
    public static final String BUSINESS_SPORT = "MI_WATCH_SPORT";

    @NotNull
    public static final String BUSINESS_TAB_DEVICE = "MI_HEALTH_DEVICE_TAB_PAGE";

    @NotNull
    public static final String BUSINESS_TAB_SPORT = "MI_HEALTH_SPORT_TAB_PAGE";

    @NotNull
    public static final String BUSINESS_TAG_USER_CENTER = "MI_HEALTH_USER_CENTER_TAB_PAGE";

    @NotNull
    public static final BusinessKey INSTANCE = new BusinessKey();

    private BusinessKey() {
    }
}
