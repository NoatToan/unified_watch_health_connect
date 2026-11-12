package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class GCMProgressBar extends ProgressBar {
    public GCMProgressBar(Context context) {
        super(context);
        a();
    }

    public final void a() {
        getIndeterminateDrawable().setColorFilter(a7.b.getColor(getContext(), R.color.gcm_icon_primary_action), PorterDuff.Mode.SRC_ATOP);
    }

    public GCMProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public GCMProgressBar(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        a();
    }
}
