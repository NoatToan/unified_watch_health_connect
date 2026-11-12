package com.xiaomi.passport.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.account.passportsdk.account_sso.R;

/* JADX INFO: loaded from: classes11.dex */
public class AccountPreferenceCategoryDivider extends View {
    public AccountPreferenceCategoryDivider(Context context) {
        super(context);
        initLayout();
    }

    private void initLayout() {
        setBackground(getResources().getDrawable(R.drawable.account_preference_category_divider));
    }

    public AccountPreferenceCategoryDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initLayout();
    }

    public AccountPreferenceCategoryDivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initLayout();
    }
}
