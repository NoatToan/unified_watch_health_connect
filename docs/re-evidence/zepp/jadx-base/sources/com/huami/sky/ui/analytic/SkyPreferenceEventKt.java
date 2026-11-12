package com.huami.sky.ui.analytic;

import android.content.Context;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000\"\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0016\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\r\"\u0016\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "musicId", "", "recordPreferencePlayEvent", "", "isEdit", "", "", "musicIds", "recordPreferenceSaveEvent", SkyPreferenceEventKt.AIMUSIC_PREFERENCE_V, "Ljava/lang/String;", SkyPreferenceEventKt.AIMUSIC_PREFERENCE_SAVE_C, SkyPreferenceEventKt.AIMUSIC_PREFERENCE_SKIP_C, SkyPreferenceEventKt.AIMUSIC_PREFERENCE_PLAY_C, "FROM_START", "FROM_EDIT", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyPreferenceEventKt {

    @NotNull
    public static final String AIMUSIC_PREFERENCE_PLAY_C = "AIMUSIC_PREFERENCE_PLAY_C";

    @NotNull
    public static final String AIMUSIC_PREFERENCE_SAVE_C = "AIMUSIC_PREFERENCE_SAVE_C";

    @NotNull
    public static final String AIMUSIC_PREFERENCE_SKIP_C = "AIMUSIC_PREFERENCE_SKIP_C";

    @NotNull
    public static final String AIMUSIC_PREFERENCE_V = "AIMUSIC_PREFERENCE_V";

    @NotNull
    public static final String FROM_EDIT = "1";

    @NotNull
    public static final String FROM_START = "0";

    public static final void recordPreferencePlayEvent(@NotNull Context context, @NotNull String str) {
        Analytics.recordEvent(new CountEventBuilder(AIMUSIC_PREFERENCE_PLAY_C).addExtra(WebConstant.QueryParam.TYPE_MUSIC, str).addExtra("from", context instanceof SkyMusicPreferenceActivity ? "0" : "1"));
    }

    public static final void recordPreferenceSaveEvent(boolean z, @NotNull List<Integer> list) {
        Analytics.recordEvent(new CountEventBuilder(AIMUSIC_PREFERENCE_SAVE_C).addExtra(WebConstant.QueryParam.TYPE_MUSIC, CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)).addExtra("from", z ? "1" : "0"));
    }
}
