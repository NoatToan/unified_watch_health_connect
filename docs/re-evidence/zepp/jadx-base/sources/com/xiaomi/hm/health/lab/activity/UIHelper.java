package com.xiaomi.hm.health.lab.activity;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.lab.R;

/* JADX INFO: loaded from: classes21.dex */
public class UIHelper {
    public static void setUnifyTitleStyle(BaseTitleActivity baseTitleActivity, String str, String str2) {
        baseTitleActivity.setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(baseTitleActivity, R.color.s38), str, !RainbowUtils.isDarkMode(baseTitleActivity));
        TextView titleTextView = baseTitleActivity.getTitleTextView();
        titleTextView.setTextSize(16.0f);
        titleTextView.setTypeface(Typeface.DEFAULT_BOLD);
        int i = R.color.s1;
        titleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, i));
        if (!TextUtils.isEmpty(str2)) {
            TextView subTitleTextView = baseTitleActivity.getSubTitleTextView();
            subTitleTextView.setVisibility(0);
            subTitleTextView.setText(str2);
            subTitleTextView.setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
        }
        Drawable drawable = ContextCompat.getDrawable(baseTitleActivity, R.drawable.ic_arrow_back_20_2x);
        drawable.setTint(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.getLeft().setImageDrawable(drawable);
        baseTitleActivity.getRightTitle().setVisibility(8);
        baseTitleActivity.getWindow().setBackgroundDrawable(null);
        baseTitleActivity.findViewById(R.id.common_title_content_parent).setBackgroundResource(R.color.s10);
    }
}
