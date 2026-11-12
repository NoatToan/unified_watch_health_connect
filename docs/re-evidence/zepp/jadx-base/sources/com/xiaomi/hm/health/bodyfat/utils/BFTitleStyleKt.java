package com.xiaomi.hm.health.bodyfat.utils;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.xiaomi.hm.health.bodyfat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001aB\u0010\f\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000\u001a$\u0010\r\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0000H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u000fH\u0000¨\u0006\u0011"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "subTitle", "", "setUnifyTitleStyle", "Lcom/huami/view/basetitle/BaseTitleActivity$STYLE;", "style", "", "color", "", "darkMode", "setTitleStyle", "setTransparentTitleStyle", "setBackAndShareTitleStyle", "Landroidx/appcompat/app/AppCompatActivity;", "setDefaultTheme", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class BFTitleStyleKt {
    public static final void setBackAndShareTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_SHARE;
        int i = R.color.s38;
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, i), BFCallback.getInstance().enableMiDongFlavor());
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getSubTitleTextView().setVisibility(0);
        baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(baseTitleActivity, i2));
        }
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.setRightImageResWithTint(R.drawable.ic_share_20, ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        StatusBarUtil.setStatusColor(baseTitleActivity, false, !RainbowUtils.isDarkMode(baseTitleActivity), baseTitleActivity.getResources().getColor(i));
    }

    public static final void setDefaultTheme(@NotNull AppCompatActivity appCompatActivity) {
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            appCompatActivity.setTheme(R.style.Theme_App_Zepp);
        }
    }

    public static final void setTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @Nullable String str, @Nullable String str2, @NotNull BaseTitleActivity.STYLE style, int i, boolean z) {
        baseTitleActivity.setStyle(style, i, str, z);
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i2));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
            baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(baseTitleActivity, i2));
        } else {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(baseTitleActivity, i2));
        }
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        StatusBarUtil.setStatusColor(baseTitleActivity, false, !RainbowUtils.isDarkMode(baseTitleActivity), baseTitleActivity.getResources().getColor(R.color.s38));
    }

    public static /* synthetic */ void setTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, BaseTitleActivity.STYLE style, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        }
        if ((i2 & 8) != 0) {
            i = ContextCompat.getColor(baseTitleActivity, R.color.s38);
        }
        if ((i2 & 16) != 0) {
            z = !RainbowUtils.isDarkMode(baseTitleActivity);
        }
        setTitleStyle(baseTitleActivity, str, str2, style, i, z);
    }

    public static final void setTransparentTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @Nullable String str, @Nullable String str2) {
        baseTitleActivity.setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_TRANSPARENT, 0, str, BFCallback.getInstance().enableMiDongFlavor());
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
            baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(baseTitleActivity, i));
        } else {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(baseTitleActivity, i));
        }
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        StatusBarUtil.setStatusColor(baseTitleActivity, false, !RainbowUtils.isDarkMode(baseTitleActivity), baseTitleActivity.getResources().getColor(R.color.s38));
    }

    public static /* synthetic */ void setTransparentTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        setTransparentTitleStyle(baseTitleActivity, str, str2);
    }

    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @Nullable String str, @Nullable String str2) {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, i), str, !RainbowUtils.isDarkMode(baseTitleActivity));
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i2));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
            baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(baseTitleActivity, i2));
        } else {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(baseTitleActivity, i2));
        }
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        StatusBarUtil.setStatusColor(baseTitleActivity, false, !RainbowUtils.isDarkMode(baseTitleActivity), baseTitleActivity.getResources().getColor(i));
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        setUnifyTitleStyle(baseTitleActivity, str, str2);
    }
}
