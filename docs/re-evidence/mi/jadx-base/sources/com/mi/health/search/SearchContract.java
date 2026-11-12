package com.mi.health.search;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/mi/health/search/SearchContract;", "", "<init>", "()V", "COLUMN_TITLE", "", "COLUMN_SUMMARY_ON", "COLUMN_SUMMARY_OFF", "COLUMN_KEYWORDS", "COLUMN_ICON_RESID", "COLUMN_INTENT_ACTION", "COLUMN_INTENT_TARGET_PACKAGE", "COLUMN_INTENT_TARGET_CLASS", "COLUMN_URI_STRING", "COLUMN_EXTRAS", "COLUMN_OTHER", "SEARCH_RESULT_COLUMNS", "", "getSEARCH_RESULT_COLUMNS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchContract {

    @NotNull
    public static final String COLUMN_EXTRAS = "extras";

    @NotNull
    public static final String COLUMN_KEYWORDS = "keywords";

    @NotNull
    public static final String COLUMN_OTHER = "other";

    @NotNull
    public static final String COLUMN_TITLE = "title";

    @NotNull
    public static final SearchContract INSTANCE = new SearchContract();

    @NotNull
    public static final String COLUMN_SUMMARY_ON = "summaryOn";

    @NotNull
    public static final String COLUMN_SUMMARY_OFF = "summaryOff";

    @NotNull
    public static final String COLUMN_ICON_RESID = "iconResId";

    @NotNull
    public static final String COLUMN_INTENT_ACTION = "intentAction";

    @NotNull
    public static final String COLUMN_INTENT_TARGET_PACKAGE = "intentTargetPackage";

    @NotNull
    public static final String COLUMN_INTENT_TARGET_CLASS = "intentTargetClass";

    @NotNull
    public static final String COLUMN_URI_STRING = "uriString";

    @NotNull
    private static final String[] SEARCH_RESULT_COLUMNS = {"title", COLUMN_SUMMARY_ON, COLUMN_SUMMARY_OFF, "keywords", COLUMN_ICON_RESID, COLUMN_INTENT_ACTION, COLUMN_INTENT_TARGET_PACKAGE, COLUMN_INTENT_TARGET_CLASS, COLUMN_URI_STRING, "extras", "other"};

    private SearchContract() {
    }

    @NotNull
    public final String[] getSEARCH_RESULT_COLUMNS() {
        return SEARCH_RESULT_COLUMNS;
    }
}
