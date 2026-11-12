package com.huawei.ui.commonui.ruler.circlescaleruler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.qox;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthCircleScaleRuler extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f23852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CircleScaleRuler f23854c;
    private HealthImageView d;

    public HealthCircleScaleRuler(Context context) {
        super(context);
        c();
    }

    public HealthCircleScaleRuler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public HealthCircleScaleRuler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        View viewA = qre.a(BaseApplication.b(), R.layout.layout_health_circle_scale_ruler, this);
        if (viewA == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "init view is null");
            return;
        }
        this.f23854c = (CircleScaleRuler) viewA.findViewById(R.id.layout_health_circle_scale_ruler);
        this.f23852a = (HealthTextView) viewA.findViewById(R.id.layout_health_circle_scale_ruler_title);
        this.d = (HealthImageView) viewA.findViewById(R.id.layout_health_circle_scale_ruler_icon);
        this.f23853b = (HealthTextView) viewA.findViewById(R.id.layout_health_circle_scale_ruler_value);
    }

    public void setCircleScaleRulerData(qox qoxVar) {
        CircleScaleRuler circleScaleRuler = this.f23854c;
        if (circleScaleRuler == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "setCircleScaleRulerData mCircleScaleRuler is null");
        } else {
            circleScaleRuler.setCircleScaleRulerData(qoxVar);
        }
    }

    public void setTitle(CharSequence charSequence) {
        HealthTextView healthTextView = this.f23852a;
        if (healthTextView == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "setTitle mTitle is null");
        } else {
            healthTextView.setText(charSequence);
        }
    }

    public void setIconOnClickListener(View.OnClickListener onClickListener) {
        HealthImageView healthImageView = this.d;
        if (healthImageView == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "setIconOnClickListener mIcon is null");
        } else {
            healthImageView.setOnClickListener(onClickListener);
        }
    }

    public void setValue(CharSequence charSequence) {
        HealthTextView healthTextView = this.f23853b;
        if (healthTextView == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "setValue mValue is null");
        } else {
            healthTextView.setText(charSequence);
        }
    }

    public void setValueTextDirection(int i) {
        HealthTextView healthTextView = this.f23853b;
        if (healthTextView == null) {
            ReleaseLogUtil.d("HealthCircleScaleRuler", "setValueTextDirection mValue is null");
        } else {
            healthTextView.setTextDirection(i);
        }
    }
}
