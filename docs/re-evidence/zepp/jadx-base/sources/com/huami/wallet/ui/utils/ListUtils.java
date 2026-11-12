package com.huami.wallet.ui.utils;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.decoration.DividerDecoration;

/* JADX INFO: loaded from: classes16.dex */
public class ListUtils {
    public static DividerDecoration.Style getBorderDividerStyle(Context context) {
        return new DividerDecoration.Style().setDividerColor(ContextCompat.getColor(context, R.color.s4)).setDividerHeight(context.getResources().getDimensionPixelSize(R.dimen.divider)).setShowMiddleDivider(false).setShowBottomDivider(true).setShowTopDivider(true);
    }

    public static DividerDecoration.Style getMiddleDividerStyle(Context context) {
        return new DividerDecoration.Style().setDividerColor(ContextCompat.getColor(context, R.color.s4)).setDividerHeight(context.getResources().getDimensionPixelSize(R.dimen.divider)).setDividerPadding(context.getResources().getDimensionPixelSize(R.dimen.wl_border_margin)).setShowMiddleDivider(true).setShowBottomDivider(false).setShowTopDivider(false);
    }
}
