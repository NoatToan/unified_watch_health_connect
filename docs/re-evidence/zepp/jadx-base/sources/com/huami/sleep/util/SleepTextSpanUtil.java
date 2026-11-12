package com.huami.sleep.util;

import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0002JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/util/SleepTextSpanUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "time", "minId", "hourId", "Landroid/text/SpannableString;", "a", "Landroid/widget/TextView;", Configs.Params.TV, "adjust", "normalId", "lessMId", "lessHId", "moreMId", "moreHId", "", "dataFormatDisplay", LogUtil.I, "HOUR_MINUTES", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTextSpanUtil {

    @NotNull
    public static final SleepTextSpanUtil INSTANCE = new SleepTextSpanUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int HOUR_MINUTES = 60;

    private SleepTextSpanUtil() {
    }

    private final SpannableString a(Context context, int time, @StringRes int minId, @StringRes int hourId) {
        return time < 60 ? new SpannableString(context.getResources().getString(minId, Integer.valueOf(time))) : new SpannableString(context.getResources().getString(hourId, Integer.valueOf(time / 60), Integer.valueOf(time % 60)));
    }

    public final void dataFormatDisplay(@NotNull Context context, @Nullable TextView tv, int adjust, @StringRes int normalId, @StringRes int lessMId, @StringRes int lessHId, @StringRes int moreMId, @StringRes int moreHId) {
        if (Math.abs(adjust) <= 15) {
            if (tv == null) {
                return;
            }
            tv.setText(normalId);
        } else if (adjust > 0) {
            if (tv == null) {
                return;
            }
            tv.setText(a(context, adjust, lessMId, lessHId));
        } else {
            int i = -adjust;
            if (tv == null) {
                return;
            }
            tv.setText(a(context, i, moreMId, moreHId));
        }
    }
}
