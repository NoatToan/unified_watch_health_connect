package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes34.dex */
public class mas extends mab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f14211c;

    public mas(int i) {
        this.f14210b = i;
    }

    public static Bitmap a(Context context, Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return mah.f14193c.b(context);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        Bitmap bitmapA = a(context, context.getResources().getDrawable(this.f14210b));
        this.f14211c = bitmapA;
        return bitmapA;
    }
}
