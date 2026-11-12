package com.huami.wallet.ui.entity;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.wallet.ui.R;

/* JADX INFO: loaded from: classes16.dex */
public enum RichPayMode {
    ALIPAY(R.drawable.wl_ic_alipay, R.string.wl_alipay),
    WECHAT_PAY(R.drawable.wl_ic_wechat_pay, R.string.wl_wechat_pay),
    MI_PAY(R.drawable.wl_ic_mi_pay, R.string.wl_mi_pay);


    @DrawableRes
    public final int icon;

    @StringRes
    public final int name;

    RichPayMode(int i, int i2) {
        this.icon = i;
        this.name = i2;
    }
}
