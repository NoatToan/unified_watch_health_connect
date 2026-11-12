package com.huami.hmchartui.utils;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.hmchartui.R;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a(\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000b"}, d2 = {"", "millsToSecond", "secondToMills", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity$STYLE;", "style", "", "title", "subTitle", "", "setUnifyTitleStyle", "hmchartui_release"}, k = 2, mv = {1, 5, 1})
public final class CommonExtensionUtilsKt {
    public static final long millsToSecond(long j) {
        return String.valueOf(j).length() == 13 ? j / ((long) 1000) : j;
    }

    public static final long secondToMills(long j) {
        return String.valueOf(j).length() == 10 ? j * ((long) 1000) : j;
    }

    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull BaseTitleActivity.STYLE style, @NotNull String str) {
        setUnifyTitleStyle$default(baseTitleActivity, style, str, null, 4, null);
    }

    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull BaseTitleActivity.STYLE style, @NotNull String str, @Nullable String str2) {
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, R.color.s38), str, !RainbowUtils.isDarkMode(baseTitleActivity));
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
        drawable.setTint(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, BaseTitleActivity.STYLE style, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        setUnifyTitleStyle(baseTitleActivity, style, str, str2);
    }
}
