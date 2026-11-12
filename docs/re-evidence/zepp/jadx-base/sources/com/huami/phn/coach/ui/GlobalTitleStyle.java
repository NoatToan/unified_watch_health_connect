package com.huami.phn.coach.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.phn.coach.R;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "showRightImage", "", "title", "subTitle", "", "navigationBarColor", "", "setUnifyTitleStyle", "(Lcom/huami/view/basetitle/BaseTitleActivity;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "GlobalTitleStyle")
public final class GlobalTitleStyle {
    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, boolean z, @NotNull String str) {
        setUnifyTitleStyle$default(baseTitleActivity, z, str, null, null, 12, null);
    }

    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, boolean z, @NotNull String str, @Nullable String str2) {
        setUnifyTitleStyle$default(baseTitleActivity, z, str, str2, null, 8, null);
    }

    @JvmOverloads
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, boolean z, @NotNull String str, @Nullable String str2, @Nullable Integer num) {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int iIntValue = R.color.s38;
        baseTitleActivity.setStyle(style, ContextCompat.getColor(baseTitleActivity, iIntValue), str, !RainbowUtils.isDarkMode(baseTitleActivity));
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
        if (z) {
            baseTitleActivity.getRightImage().setVisibility(0);
            Drawable drawable2 = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_more_20_2x);
            drawable2.setTint(ContextCompat.getColor(baseTitleActivity, i));
            baseTitleActivity.getRightImage().setImageDrawable(drawable2);
        }
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        if (RainbowUtils.isDarkMode(baseTitleActivity)) {
            Window window = baseTitleActivity.getWindow();
            if (num != null) {
                iIntValue = num.intValue();
            }
            window.setNavigationBarColor(ContextCompat.getColor(baseTitleActivity, iIntValue));
        }
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, boolean z, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        setUnifyTitleStyle(baseTitleActivity, z, str, str2, num);
    }
}
