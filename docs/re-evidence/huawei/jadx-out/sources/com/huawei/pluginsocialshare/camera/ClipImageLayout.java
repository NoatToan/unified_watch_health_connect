package com.huawei.pluginsocialshare.camera;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes15.dex */
public class ClipImageLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ClipImageView f22540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ClipImageMaskView f22541b;
    private Context d;

    public ClipImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
    }

    public void e(Intent intent) {
        float fApplyDimension;
        int intExtra = intent.getIntExtra("height", -1);
        int intExtra2 = intent.getIntExtra("width", -1);
        float floatExtra = intent.getFloatExtra("scaleRatio", -1.0f);
        float floatExtra2 = intent.getFloatExtra("maxScaleRation", -1.0f);
        float floatExtra3 = intent.getFloatExtra("midScaleRation", -1.0f);
        int intExtra3 = intent.getIntExtra("HorizontalPadding", -1);
        if (intExtra3 != -1) {
            fApplyDimension = TypedValue.applyDimension(1, intExtra3, getResources().getDisplayMetrics());
        } else {
            fApplyDimension = TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics());
        }
        int i = (int) fApplyDimension;
        this.f22540a = new ClipImageView.b(this.d, i).e(this.d).e(intExtra).a(intExtra2).d(floatExtra).c(floatExtra2).b(floatExtra3).b(i).c();
        this.f22541b = new ClipImageMaskView.b(this.d, i).b(intExtra).e(intExtra2).d(i).c();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.f22540a, layoutParams);
        addView(this.f22541b, layoutParams);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f22540a.setImageBitmap(bitmap);
    }

    public Bitmap a() {
        return this.f22540a.b();
    }
}
