package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¨\u0006\b"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity$STYLE;", "style", "", "title", "subTitle", "", "setUnifyTitleStyle", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class EventReminderExpandKt {
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull BaseTitleActivity.STYLE style, @NotNull String str, @Nullable String str2) {
        boolean z = true;
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
        Button leftText = baseTitleActivity.getLeftText();
        CharSequence text = leftText.getText();
        if (text != null && text.length() != 0) {
            z = false;
        }
        if (!z) {
            leftText = null;
        }
        if (leftText != null) {
            leftText.setVisibility(8);
            Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTint(ContextCompat.getColor(baseTitleActivity, i));
            } else {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(baseTitleActivity, i), PorterDuff.Mode.SRC_IN));
            }
            baseTitleActivity.getLeft().setImageDrawable(drawable);
        }
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, BaseTitleActivity.STYLE style, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        setUnifyTitleStyle(baseTitleActivity, style, str, str2);
    }
}
