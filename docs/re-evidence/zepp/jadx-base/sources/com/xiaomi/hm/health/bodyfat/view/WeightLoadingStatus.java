package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public class WeightLoadingStatus extends RelativeLayout {
    private ImageView a;
    private ImageView b;
    private TextView c;
    private RotateAnimation d;

    public WeightLoadingStatus(Context context) {
        this(context, null, 0);
    }

    private void a() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.d = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        this.d.setDuration(400L);
    }

    public void loadingFailed() {
        this.d.cancel();
        this.a.setVisibility(4);
        this.b.setVisibility(0);
        this.c.setText(R.string.load_failed);
    }

    public void startLoading() {
        this.a.setVisibility(0);
        this.a.startAnimation(this.d);
        this.b.setVisibility(8);
        this.c.setText(R.string.loading);
    }

    public void stopLoading() {
        this.d.cancel();
    }

    public WeightLoadingStatus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeightLoadingStatus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RelativeLayout.inflate(context, R.layout.view_weight_loading_status, this);
        this.a = (ImageView) findViewById(R.id.loading_view);
        this.b = (ImageView) findViewById(R.id.loading_failure);
        this.c = (TextView) findViewById(R.id.loading_message);
        a();
    }
}
