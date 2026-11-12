package com.xiaomi.hm.health.baseui;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.devicex.R;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "subTitle", "", "bgColor", "Lcom/huami/view/basetitle/BaseTitleActivity$STYLE;", "style", "", "setTitleBar", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class BaseTitleBarExtKt {
    @JvmOverloads
    public static final void setTitleBar(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str) {
        setTitleBar$default(baseTitleActivity, str, null, 0, null, 14, null);
    }

    @JvmOverloads
    public static final void setTitleBar(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2) {
        setTitleBar$default(baseTitleActivity, str, str2, 0, null, 12, null);
    }

    @JvmOverloads
    public static final void setTitleBar(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2, @ColorRes int i) {
        setTitleBar$default(baseTitleActivity, str, str2, i, null, 8, null);
    }

    @JvmOverloads
    public static final void setTitleBar(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2, @ColorRes int i, @NotNull BaseTitleActivity.STYLE style) {
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
            DrawableCompat.setTint(drawable, ContextCompat.getColor(baseTitleActivity, i2));
            DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
        }
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    public static /* synthetic */ void setTitleBar$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, BaseTitleActivity.STYLE style, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = R.color.s38;
        }
        if ((i2 & 8) != 0) {
            style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        }
        setTitleBar(baseTitleActivity, str, str2, i, style);
    }
}
