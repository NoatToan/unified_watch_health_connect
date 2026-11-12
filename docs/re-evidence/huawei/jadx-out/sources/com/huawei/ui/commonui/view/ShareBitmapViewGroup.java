package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.uikit.phone.hwcolumnlayout.widget.HwColumnLinearLayout;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ShareBitmapViewGroup extends HwColumnLinearLayout {
    public ShareBitmapViewGroup(Context context) {
        super(context);
    }

    public ShareBitmapViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareBitmapViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void c(List<Bitmap> list) {
        HealthCardView healthCardView = new HealthCardView(getContext());
        healthCardView.setRadius(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultCornerRadiusM));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        int i = 0;
        for (Bitmap bitmap : list) {
            if (bitmap == null) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            int width = bitmap.getWidth();
            int width2 = getWidth();
            int height = (int) (bitmap.getHeight() * ((width2 - (BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) * 2)) / width));
            i += height;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(width2 - (BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) * 2), height));
            imageView.setImageBitmap(bitmap);
            imageView.requestLayout();
            linearLayout.addView(imageView, -1);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i);
        layoutParams.gravity = 1;
        healthCardView.setLayoutParams(layoutParams);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, i));
        linearLayout.invalidate();
        healthCardView.addView(linearLayout);
        healthCardView.invalidate();
        addView(healthCardView, -1);
        invalidate();
    }

    public void d(Bitmap bitmap) {
        b(-1, bitmap);
    }

    public void b(int i, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        int width = bitmap.getWidth();
        int width2 = getWidth();
        int height = bitmap.getHeight();
        if (width > width2) {
            height = (int) (bitmap.getHeight() * (width2 / width));
            width = width2;
        }
        imageView.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        imageView.setImageBitmap(bitmap);
        imageView.requestLayout();
        addView(imageView, i);
        invalidate();
    }

    public Bitmap getHoleViewBitmap() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            height += getChildAt(i).getHeight();
        }
        if (height == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), height, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(getContext().getColor(R.color.health_chart_extend_background_color));
        draw(canvas);
        removeAllViews();
        return bitmapCreateBitmap;
    }
}
