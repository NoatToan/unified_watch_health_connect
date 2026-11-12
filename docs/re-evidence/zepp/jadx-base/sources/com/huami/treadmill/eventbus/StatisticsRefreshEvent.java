package com.huami.treadmill.eventbus;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/treadmill/eventbus/StatisticsRefreshEvent;", "", "", "a", "Ljava/lang/String;", "getSectionRefresh", "()Ljava/lang/String;", "setSectionRefresh", "(Ljava/lang/String;)V", "sectionRefresh", "section", "<init>", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsRefreshEvent {

    @NotNull
    public static final String SECTION_NUM_REFRESH = "num of not upload";

    @NotNull
    public static final String SECTION_TREADMILL_RECORD_INFO = "info of treadmill record";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String sectionRefresh;

    public StatisticsRefreshEvent(@NotNull String str) {
        this.sectionRefresh = str;
    }

    @NotNull
    public final String getSectionRefresh() {
        return this.sectionRefresh;
    }

    public final void setSectionRefresh(@NotNull String str) {
        this.sectionRefresh = str;
    }
}
