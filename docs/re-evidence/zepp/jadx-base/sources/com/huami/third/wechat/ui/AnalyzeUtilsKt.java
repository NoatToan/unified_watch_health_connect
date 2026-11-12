package com.huami.third.wechat.ui;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\"\u0016\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006\"\u0016\u0010\n\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"", DbUtils.Const.Columns.Event.EVENT_ID, "value", "", "analytics", "EVENT_ENTER_WECHAT", "Ljava/lang/String;", "EVENT_ENTER_WECHAT_STEP", "EVENT_ENTER_WECHAT_SPORT", "EVENT_ENTER_WECHAT_SPORT_ADD", "EVENT_ENTER_WECHAT_SPORT_DELETE", "wechat-ui_release"}, k = 2, mv = {1, 5, 1})
public final class AnalyzeUtilsKt {

    @NotNull
    public static final String EVENT_ENTER_WECHAT = "WeChat";

    @NotNull
    public static final String EVENT_ENTER_WECHAT_SPORT = "WeChat_sport";

    @NotNull
    public static final String EVENT_ENTER_WECHAT_SPORT_ADD = "WeChat_sport_add";

    @NotNull
    public static final String EVENT_ENTER_WECHAT_SPORT_DELETE = "WeChat_sport_del";

    @NotNull
    public static final String EVENT_ENTER_WECHAT_STEP = "WeChat_step";

    public static final void analytics(@NotNull String str, @Nullable String str2) {
        Analytics.recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    public static /* synthetic */ void analytics$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        analytics(str, str2);
    }
}
