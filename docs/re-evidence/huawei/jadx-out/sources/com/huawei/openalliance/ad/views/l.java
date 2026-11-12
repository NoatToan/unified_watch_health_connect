package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class l extends k {
    protected ImageView f;
    protected ScanningView g;

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hw.b(getViewTag(), "w=%s, h=%s, oldw=%s, oldh=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.l.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b(l.this.getViewTag(), "POST %s %s", Integer.valueOf(l.this.f.getHeight()), Integer.valueOf(l.this.f.getWidth()));
                if (l.this.g.getSrcBitmap() == null) {
                    ScanningView scanningView = l.this.g;
                    l lVar = l.this;
                    scanningView.setSrcBitmap(lVar.a(lVar.f));
                }
                if (l.this.g != null) {
                    l.this.g.a();
                }
            }
        });
    }

    protected String getViewTag() {
        return "PPSSplashSwipeClickView";
    }

    public void b() {
        ScanningView scanningView = this.g;
        if (scanningView != null) {
            scanningView.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0 || drawingCache == null) {
            hw.b(getViewTag(), "captureWidget NULL");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, 0, 0, measuredWidth, measuredHeight);
        view.destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    public l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public l(Context context) {
        super(context);
    }
}
