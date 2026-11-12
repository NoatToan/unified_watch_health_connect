package com.huami.healthlabel.utils;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\u001a(\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002H\u0000\u001a*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0000\"\u0016\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\n\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\n\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\n\"\u0016\u0010\u0013\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\n\"\u0016\u0010\u0014\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0016\u0010\u0015\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\n\"\u0016\u0010\u0016\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0016\u0010\u0017\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\n\"\u0016\u0010\u0018\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\n\"\u0016\u0010\u0019\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\n\"\u0016\u0010\u001a\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\n\"\u0016\u0010\u001b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\n\"\u0016\u0010\u001c\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"", DbUtils.Const.Columns.Event.EVENT_ID, "", "params", "", "analytics", "", "Lkotlin/Pair;", "", HealthLabelAnalyticsKt.HOME_TAG_C, "Ljava/lang/String;", HealthLabelAnalyticsKt.HOME_TAG_V, HealthLabelAnalyticsKt.HOME_TAG_SLIDE_C, HealthLabelAnalyticsKt.HOME_TAG_SELECT_C, HealthLabelAnalyticsKt.HOME_TAG_BACK_C, HealthLabelAnalyticsKt.HOME_TAG_MANAGE_C, HealthLabelAnalyticsKt.HOME_TAG_LOGGING_C, HealthLabelAnalyticsKt.HOME_TAG_ADD_C, HealthLabelAnalyticsKt.HOME_TAG_T, HealthLabelAnalyticsKt.TAG_LOGGING_V, HealthLabelAnalyticsKt.TAG_MANAGE_V, HealthLabelAnalyticsKt.TAG_MANAGE_EDITOR_C, HealthLabelAnalyticsKt.TAG_MANAGE_EDITOR_DELETE_C, HealthLabelAnalyticsKt.HOME_TAG_HOLD_C, HealthLabelAnalyticsKt.TAG_LOGGING_DELETE_C, "TAG_CLICK_SOURCE", "TAG_CLICK_SOURCE_MINE", "TAG_CLICK_SOURCE_HOME", "TAG_HOME_LABEL_COUNT", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class HealthLabelAnalyticsKt {

    @NotNull
    public static final String HOME_TAG_ADD_C = "HOME_TAG_ADD_C";

    @NotNull
    public static final String HOME_TAG_BACK_C = "HOME_TAG_BACK_C";

    @NotNull
    public static final String HOME_TAG_C = "HOME_TAG_C";

    @NotNull
    public static final String HOME_TAG_HOLD_C = "HOME_TAG_HOLD_C";

    @NotNull
    public static final String HOME_TAG_LOGGING_C = "HOME_TAG_LOGGING_C";

    @NotNull
    public static final String HOME_TAG_MANAGE_C = "HOME_TAG_MANAGE_C";

    @NotNull
    public static final String HOME_TAG_SELECT_C = "HOME_TAG_SELECT_C";

    @NotNull
    public static final String HOME_TAG_SLIDE_C = "HOME_TAG_SLIDE_C";

    @NotNull
    public static final String HOME_TAG_T = "HOME_TAG_T";

    @NotNull
    public static final String HOME_TAG_V = "HOME_TAG_V";

    @NotNull
    public static final String TAG_CLICK_SOURCE = "cf";

    @NotNull
    public static final String TAG_CLICK_SOURCE_HOME = "首页";

    @NotNull
    public static final String TAG_CLICK_SOURCE_MINE = "我的";

    @NotNull
    public static final String TAG_HOME_LABEL_COUNT = "cards";

    @NotNull
    public static final String TAG_LOGGING_DELETE_C = "TAG_LOGGING_DELETE_C";

    @NotNull
    public static final String TAG_LOGGING_V = "TAG_LOGGING_V";

    @NotNull
    public static final String TAG_MANAGE_EDITOR_C = "TAG_MANAGE_EDITOR_C";

    @NotNull
    public static final String TAG_MANAGE_EDITOR_DELETE_C = "TAG_MANAGE_EDITOR_DELETE_C";

    @NotNull
    public static final String TAG_MANAGE_V = "TAG_MANAGE_V";

    public static final void analytics(@NotNull String str, @Nullable Map<String, String> map) {
        Analytics.recordEvent(new CountEventBuilder(str).setAnonymous(false).setIdentified(true).setRealTimeRecord(true).putExtras(map));
    }

    public static /* synthetic */ void analytics$default(String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        analytics(str, (Map<String, String>) map);
    }

    public static final void analytics(@NotNull String str, @NotNull List<? extends Pair<String, ? extends Object>> list) {
        HashMap map = new HashMap();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            map.put(pair.getFirst(), pair.getSecond().toString());
        }
        analytics(str, map);
    }
}
