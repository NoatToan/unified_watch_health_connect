package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.w4j;

/* JADX INFO: loaded from: classes8.dex */
public class DataShareBottomQRView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RoundImageView f12880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12881b;
    public RelativeLayout c;
    public RelativeLayout d;
    public int e;

    public DataShareBottomQRView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.f12881b = context;
        LayoutInflater.from(context).inflate(ivi.V0, this);
        if (attributeSet != null) {
            context.obtainStyledAttributes(attributeSet, w4j.x0).recycle();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12880a = (RoundImageView) findViewById(bsi.I2);
        this.c = (RelativeLayout) findViewById(bsi.P5);
        this.d = (RelativeLayout) findViewById(bsi.N5);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e = getMeasuredWidth();
        int measuredWidth = this.c.getMeasuredWidth();
        int i3 = this.e;
        if (measuredWidth < i3 / 2) {
            measuredWidth = DisplayUtil.dip2px(30.0f) + (i3 / 2);
        } else if (measuredWidth > i3 - DisplayUtil.dip2px(90.0f)) {
            measuredWidth = this.e - DisplayUtil.dip2px(90.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = measuredWidth;
        this.c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.width = measuredWidth;
        this.d.setLayoutParams(layoutParams2);
    }
}
