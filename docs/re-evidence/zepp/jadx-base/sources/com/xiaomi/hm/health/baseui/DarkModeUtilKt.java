package com.xiaomi.hm.health.baseui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\u000b\u001a\u00020\u0006*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "title", "subTitle", "", "color", "", "setDeviceSettingUnifyTitleStyle", "Lcom/huami/lib/rainbow/ListTile;", "drawableRes", "colorRes", "setLeadingWithTint", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class DarkModeUtilKt {
    @JvmOverloads
    public static final void setDeviceSettingUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str) {
        setDeviceSettingUnifyTitleStyle$default(baseTitleActivity, str, null, 0, 6, null);
    }

    @JvmOverloads
    public static final void setDeviceSettingUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2) {
        setDeviceSettingUnifyTitleStyle$default(baseTitleActivity, str, str2, 0, 4, null);
    }

    @JvmOverloads
    public static final void setDeviceSettingUnifyTitleStyle(@NotNull BaseTitleActivity baseTitleActivity, @NotNull String str, @Nullable String str2, @ColorRes int i) {
        baseTitleActivity.setStyle(BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_DEVICE, ContextCompat.getColor(baseTitleActivity, i), str, !RainbowUtils.isDarkMode(baseTitleActivity));
        baseTitleActivity.setContentViewBehindTitleBar(false, false);
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i2));
        if (str2 != null) {
            baseTitleActivity.getSubTitleTextView().setVisibility(0);
            baseTitleActivity.getSubTitleTextView().setText(str2);
        }
        baseTitleActivity.getSubTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        DrawableCompat.setTint(drawable, ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        ((FrameLayout) baseTitleActivity.findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
        Drawable drawable2 = ContextCompat.getDrawable(baseTitleActivity, R.drawable.icon_edit);
        if (drawable2 == null) {
            return;
        }
        DrawableCompat.setTint(drawable2, ContextCompat.getColor(baseTitleActivity, i2));
        baseTitleActivity.getRightImage().setImageDrawable(drawable2);
    }

    public static /* synthetic */ void setDeviceSettingUnifyTitleStyle$default(BaseTitleActivity baseTitleActivity, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = R.color.s38;
        }
        setDeviceSettingUnifyTitleStyle(baseTitleActivity, str, str2, i);
    }

    public static final void setLeadingWithTint(@NotNull ListTile listTile, @DrawableRes int i, @ColorRes int i2) {
        int color = ContextCompat.getColor(listTile.getContext(), i2);
        listTile.setLeading(i);
        listTile.setLeadingTint(color);
    }
}
