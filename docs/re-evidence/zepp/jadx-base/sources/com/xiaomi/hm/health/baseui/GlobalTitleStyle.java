package com.xiaomi.hm.health.baseui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u001a \u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "textColor", "", "isBold", "", "setupAccountTitleStyle", "", "title", "subTitle", "setUnifyTitleStyle", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "GlobalTitleStyle")
public final class GlobalTitleStyle {
    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str) {
        setUnifyTitleStyle$default(baseTitleActivity, str, null, 2, null);
    }

    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2) {
        baseTitleActivity.setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(baseTitleActivity, R.color.s38), str, !UtilsKt.isDarkMode(baseTitleActivity));
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s1));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
            baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        drawable.setTint(ContextCompat.getColor(baseTitleActivity, R.color.s1));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        setUnifyTitleStyle(baseTitleActivity, str, str2);
    }

    @JvmOverloads
    public static final void setupAccountTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        setupAccountTitleStyle$default(baseTitleActivity, 0, false, 3, null);
    }

    @JvmOverloads
    public static final void setupAccountTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @ColorRes int i) {
        setupAccountTitleStyle$default(baseTitleActivity, i, false, 2, null);
    }

    @JvmOverloads
    public static final void setupAccountTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @ColorRes int i, boolean z) {
        baseTitleActivity.getTitleTextView().setTextSize(0, baseTitleActivity.getResources().getDimension(R.dimen.font_size_v2_f2));
        baseTitleActivity.getTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, i));
        if (z) {
            baseTitleActivity.getTitleTextView().setTypeface(Typeface.DEFAULT_BOLD);
        }
        baseTitleActivity.getRightTitle().setTextSize(0, baseTitleActivity.getResources().getDimension(R.dimen.font_size_f1));
        baseTitleActivity.getRightTitle().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.cl_8d8d8d));
    }

    public static /* synthetic */ void setupAccountTitleStyle$default(BaseTitleActivity baseTitleActivity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.color.cl_333333;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        setupAccountTitleStyle(baseTitleActivity, i, z);
    }
}
