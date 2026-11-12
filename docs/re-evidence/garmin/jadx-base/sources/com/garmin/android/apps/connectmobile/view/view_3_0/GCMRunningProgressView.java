package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.garmin.android.apps.connectmobile.R;
import og2.k;

/* JADX INFO: loaded from: classes10.dex */
public class GCMRunningProgressView extends AppCompatImageView {
    public GCMRunningProgressView(Context context) {
        super(context);
        c();
    }

    public final void c() {
        int dimension = (int) getResources().getDimension(R.dimen.spacing_xlarge);
        setPadding(dimension, dimension, dimension, dimension);
        setImageDrawable(null);
        Drawable drawable = a7.b.getDrawable(getContext(), R.drawable.gcm4_running_man_animation);
        k.F(R.color.gcm_running_man_icon, getContext(), drawable);
        setBackgroundDrawable(drawable);
        ((AnimationDrawable) getBackground()).start();
    }

    public GCMRunningProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public GCMRunningProgressView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        c();
    }
}
