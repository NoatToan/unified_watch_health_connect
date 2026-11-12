package com.huami.core.device.wifi_settings.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.core.device.wifi_settings.R;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "subTitle", "", "setUnifyTitleStyle", "wifi-settings_release"}, k = 2, mv = {1, 5, 1})
public final class BaseWifiActivityKt {
    public static final void setUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2) {
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s10;
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
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.mipmap.wifi_setting_icon_back);
        DrawableCompat.setTint(drawable, ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(i);
    }

    public static /* synthetic */ void setUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        setUnifyTitleStyle(baseTitleActivity, str, str2);
    }
}
