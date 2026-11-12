package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class gso {
    public static Bitmap a(View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
