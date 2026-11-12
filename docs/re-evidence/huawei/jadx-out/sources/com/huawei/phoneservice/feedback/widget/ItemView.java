package com.huawei.phoneservice.feedback.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.phoneservice.faq.base.util.o;
import com.huawei.uikit.hwresources.R;

/* JADX INFO: loaded from: classes13.dex */
public class ItemView extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21791c;

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o.e(this, this.f21791c.getResources().getDimensionPixelOffset(R.dimen.emui_dimens_max_start));
    }

    public ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21791c = context;
    }

    public ItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemView(Context context) {
        this(context, null);
    }
}
