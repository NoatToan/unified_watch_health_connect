package com.huami.web.container.utils;

import android.view.View;
import android.widget.ImageButton;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.R;

/* JADX INFO: loaded from: classes17.dex */
public class H5Utils {
    private static int a = Integer.MIN_VALUE;

    private H5Utils() {
    }

    private static void a(BaseTitleActivity baseTitleActivity) {
        if (a != Integer.MIN_VALUE) {
            if (baseTitleActivity.isShowingRightImage()) {
                baseTitleActivity.setRightImageResWithTint(R.drawable.common_title_more, a);
            }
            if (baseTitleActivity.isShowRight2Image()) {
                baseTitleActivity.setRight2ImageResWithTint(R.drawable.common_title_cancel, a);
                return;
            }
            return;
        }
        if (baseTitleActivity.isShowingRightImage()) {
            baseTitleActivity.setRightImageRes(R.drawable.common_title_more, R.color.black40);
        }
        if (baseTitleActivity.isShowRight2Image()) {
            baseTitleActivity.setRight2ImageRes(R.drawable.common_title_cancel, R.color.black40);
        }
    }

    public static void finishActivity(BaseTitleActivity baseTitleActivity) {
        baseTitleActivity.finish();
    }

    public static void setFunctionButtonVisible(BaseTitleActivity baseTitleActivity, boolean z, View.OnClickListener onClickListener) {
        ImageButton rightImage = baseTitleActivity.getRightImage();
        if (!z) {
            rightImage.setVisibility(8);
            rightImage.setOnClickListener(null);
        } else {
            rightImage.setVisibility(0);
            rightImage.setOnClickListener(onClickListener);
            a(baseTitleActivity);
        }
    }

    public static void setSystemBarColor(BaseTitleActivity baseTitleActivity, int i) {
        baseTitleActivity.setStatusBarColor(i);
    }

    public static void setTitleBarBackgroundColor(BaseTitleActivity baseTitleActivity, int i) {
        baseTitleActivity.setTitleBarBackgroundColor(i);
        baseTitleActivity.setStatusBarColor(i);
        baseTitleActivity.setSystemBarMode(false);
    }

    public static void setTitleFontColor(BaseTitleActivity baseTitleActivity, int i) {
        a = i;
        baseTitleActivity.setBaseTitleColor(i);
        baseTitleActivity.setLeftImageResWithTint(i);
        a(baseTitleActivity);
    }

    public static void setTitleText(BaseTitleActivity baseTitleActivity, String str) {
        baseTitleActivity.setTitleText(str);
    }

    public static void setTitleVisibility(BaseTitleActivity baseTitleActivity, boolean z) {
        baseTitleActivity.setTitleBarVisible(z);
    }

    public static void showCancelAuthButton(BaseTitleActivity baseTitleActivity, boolean z, View.OnClickListener onClickListener) {
        ImageButton right2 = baseTitleActivity.getRight2();
        if (!z) {
            right2.setVisibility(8);
            right2.setOnClickListener(null);
        } else {
            right2.setVisibility(0);
            right2.setOnClickListener(onClickListener);
            a(baseTitleActivity);
        }
    }
}
