package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.w4j;

/* JADX INFO: loaded from: classes8.dex */
public class ShareLogoContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12894b;
    public TextView c;
    public float d;
    public int e;

    public ShareLogoContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12894b = (ImageView) findViewById(bsi.Q3);
        this.c = (TextView) findViewById(bsi.J9);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12894b.getLayoutParams();
        int i = this.e;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f12894b.setLayoutParams(layoutParams);
        this.c.setTextSize(0, this.d);
    }

    public ShareLogoContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareLogoContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12893a = context;
        LayoutInflater.from(context).inflate(ivi.Z0, this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.N3);
            this.d = typedArrayObtainStyledAttributes.getDimension(w4j.P3, DisplayUtil.sp2px(12.0f));
            this.e = (int) typedArrayObtainStyledAttributes.getDimension(w4j.O3, DisplayUtil.dip2px(25.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
