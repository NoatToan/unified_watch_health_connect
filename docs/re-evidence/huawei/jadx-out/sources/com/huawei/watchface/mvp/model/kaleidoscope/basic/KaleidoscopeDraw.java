package com.huawei.watchface.mvp.model.kaleidoscope.basic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.huawei.watchface.q3;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.v1;
import com.huawei.watchface.w;

/* JADX INFO: loaded from: classes20.dex */
public class KaleidoscopeDraw extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f30345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f30346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30347c;
    public w d;
    public Paint e;

    public enum a {
        HONEYCOMB,
        RADIAL
    }

    public KaleidoscopeDraw(Context context, String str, String str2) {
        super(context);
        this.e = new Paint();
        this.f30347c = str2;
        a(str);
        a();
    }

    public final void a(String str) {
        if (this.f30345a == null) {
            this.f30345a = WatchFaceBitmapUtil.getSafeDecodeFile(str);
        }
    }

    public Bitmap b() {
        w wVar = this.d;
        if (wVar != null) {
            wVar.b();
            this.f30346b = this.d.a();
        }
        return this.f30346b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        HwLog.i("KaleidoscopeDraw", "onDraw");
        if (canvas == null || (bitmap = this.f30346b) == null) {
            HwLog.w("KaleidoscopeDraw", "onDraw: parameter error.");
        } else if (bitmap.isRecycled()) {
            HwLog.w("KaleidoscopeDraw", "drawBitmap: bitmap has recycled.");
        } else {
            canvas.drawBitmap(this.f30346b, 0.0f, 0.0f, this.e);
        }
    }

    public final void a() {
        if (this.f30345a == null) {
            return;
        }
        if (a.HONEYCOMB.toString().equals(this.f30347c)) {
            this.d = new v1(this.f30345a);
        } else {
            this.d = new q3(this.f30345a);
        }
    }
}
