package com.huami.account.ui.common;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huami.account.ui.R;
import com.huami.account.ui.register.RegisterActivity;
import com.huami.account.utils.AppChannel;
import com.huami.account.utils.AppChannelKt;
import com.huami.account.utils.UtilsKt;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/huami/view/basetitle/BaseTitleActivity;", "", "setupAccountTitleStyle", "", "checkAllChannel", "setupGrayTitleStyle", "setupLightTitleStyle", "setupHollywoodTitleStyle", "", "getTitleBgColor", "setRightTitleGone", "", "a", "F", "HOLLYWOOD_TITLE_BUTTON_PADDING", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class GlobalTitleStyleKt {
    private static final float a = 7.0f;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppChannel.values().length];
            iArr[AppChannel.Zepp.ordinal()] = 1;
            iArr[AppChannel.Amazfit.ordinal()] = 2;
            iArr[AppChannel.Unknown.ordinal()] = 3;
            iArr[AppChannel.MiFit.ordinal()] = 4;
            iArr[AppChannel.Hollywood.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Object checkAllChannel(@NotNull Object obj) {
        return obj;
    }

    public static final int getTitleBgColor(@NotNull BaseTitleActivity baseTitleActivity) {
        int i = WhenMappings.$EnumSwitchMapping$0[AppChannelKt.getAppChannel(baseTitleActivity).ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return ContextCompat.getColor(baseTitleActivity, R.color.s10);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ContextCompat.getColor(baseTitleActivity, R.color.s38);
    }

    public static final void setRightTitleGone(@NotNull BaseTitleActivity baseTitleActivity) {
        baseTitleActivity.getRightTitle().setVisibility(8);
    }

    public static final void setupAccountTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        Unit unit;
        int i = WhenMappings.$EnumSwitchMapping$0[AppChannelKt.getAppChannel(baseTitleActivity).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            setupLightTitleStyle(baseTitleActivity);
            unit = Unit.INSTANCE;
        } else if (i == 4) {
            if (baseTitleActivity instanceof RegisterActivity) {
                setupLightTitleStyle(baseTitleActivity);
            } else {
                setupGrayTitleStyle(baseTitleActivity);
            }
            unit = Unit.INSTANCE;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            setupHollywoodTitleStyle(baseTitleActivity);
            unit = Unit.INSTANCE;
        }
        checkAllChannel(unit);
    }

    public static final void setupGrayTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        int i = R.color.s10;
        baseTitleActivity.setStatusBarColor(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.setTitleBarBackgroundColor(ContextCompat.getColor(baseTitleActivity, i));
        baseTitleActivity.setBaseTitleColor(ContextCompat.getColor(baseTitleActivity, R.color.s1));
    }

    public static final void setupHollywoodTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        baseTitleActivity.getTitleTextView().setTextSize(0, baseTitleActivity.getResources().getDimensionPixelSize(R.dimen.account_ui_font_size_v2_f2));
        baseTitleActivity.getTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.account_ui_black));
        baseTitleActivity.getRightTitle().setTextSize(0, baseTitleActivity.getResources().getDimension(R.dimen.account_ui_font_size_f1));
        baseTitleActivity.getRightTitle().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.account_ui_cl_8d8d8d));
        ViewGroup.LayoutParams layoutParams = baseTitleActivity.getLeft().getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int iDp2px = (int) UtilsKt.dp2px(baseTitleActivity, 7.0f);
            baseTitleActivity.getLeft().setPadding(0, iDp2px, iDp2px * 2, iDp2px);
            baseTitleActivity.getLeft().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            baseTitleActivity.getLeft().setLayoutParams(layoutParams2);
        }
        baseTitleActivity.getTitleTextView().setTypeface(baseTitleActivity.getTitleTextView().getTypeface(), 1);
    }

    public static final void setupLightTitleStyle(@NotNull BaseTitleActivity baseTitleActivity) {
        baseTitleActivity.getTitleTextView().setTextSize(0, baseTitleActivity.getResources().getDimension(R.dimen.account_ui_font_size_v2_f2));
        baseTitleActivity.getTitleTextView().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s1));
        baseTitleActivity.getRightTitle().setTextSize(0, baseTitleActivity.getResources().getDimension(R.dimen.account_ui_font_size_f1));
        baseTitleActivity.getRightTitle().setTextColor(ContextCompat.getColor(baseTitleActivity, R.color.s2));
    }
}
