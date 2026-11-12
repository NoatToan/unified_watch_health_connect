package com.huawei.phoneservice.faq.base.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.phoneservice.faq.base.util.o;
import com.huawei.uikit.hwresources.R;

/* JADX INFO: loaded from: classes13.dex */
public class ListItemRelativeLayout extends RelativeLayout {
    private Context d;

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        o.e(this, this.d.getResources().getDimensionPixelSize(R.dimen.emui_dimens_max_start), this.d.getResources().getDimensionPixelSize(R.dimen.emui_dimens_max_end));
        super.onConfigurationChanged(configuration);
    }

    private void d(Context context) {
        this.d = context;
    }

    public ListItemRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    public ListItemRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItemRelativeLayout(Context context) {
        this(context, null);
    }
}
