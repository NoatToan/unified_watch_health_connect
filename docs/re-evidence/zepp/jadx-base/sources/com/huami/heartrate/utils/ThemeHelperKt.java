package com.huami.heartrate.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.heartrate.R;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "Lcom/huami/view/basetitle/BaseTitleActivity$STYLE;", "titleStyle", "", "setBackTitleStyle", "setHollywoodBackTitleStyle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "drawableRes", "tintColorRes", "Landroid/graphics/drawable/Drawable;", "a", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class ThemeHelperKt {
    private static final Drawable a(Context context, @DrawableRes int i, @ColorRes int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        DrawableCompat.setTint(drawable, ContextCompat.getColor(context, i2));
        return drawable;
    }

    public static final void setBackTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @NotNull BaseTitleActivity.STYLE style) {
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, R.color.s38), str, !RainbowUtils.isDarkMode(baseTitleActivity));
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.getLeft().setImageDrawable(a(baseTitleActivity, R.drawable.ic_arrow_back_20_2x, i));
        baseTitleActivity.getRightImage().setVisibility(8);
    }

    public static /* synthetic */ void setBackTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, BaseTitleActivity.STYLE style, int i, Object obj) {
        if ((i & 2) != 0) {
            style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        }
        setBackTitleStyle(baseTitleActivity, str, style);
    }

    public static final void setHollywoodBackTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @NotNull BaseTitleActivity.STYLE style) {
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, R.color.heart_rate_hol_activity_bg), str, true);
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(2, 18.0f);
        titleTextView.setTypeface(Typeface.defaultFromStyle(1));
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.getLeft().setImageDrawable(a(baseTitleActivity, R.drawable.ic_arrow_back_20_2x, i));
        baseTitleActivity.getRightImage().setVisibility(8);
    }

    public static /* synthetic */ void setHollywoodBackTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, BaseTitleActivity.STYLE style, int i, Object obj) {
        if ((i & 2) != 0) {
            style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        }
        setHollywoodBackTitleStyle(baseTitleActivity, str, style);
    }
}
