package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.gki;
import defpackage.loi;
import defpackage.x44;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class StatusTextView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11630b;
    public int c;
    public int d;
    public int e;
    public Context f;
    public String g;
    public Paint h;

    public StatusTextView(Context context) {
        this(context, null);
        this.f = context;
    }

    public final void a() {
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(DisplayUtil.dip2px(12.0f));
        this.h.setColor(this.f11629a == 1 ? this.f11630b : this.c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapDecodeResource;
        super.onDraw(canvas);
        if (this.f11629a == 1) {
            bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.d);
            this.h.setColor(this.f11630b);
        } else {
            bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.e);
            this.h.setColor(this.c);
        }
        canvas.drawBitmap(bitmapDecodeResource, (getWidth() - bitmapDecodeResource.getWidth()) / 2, 0.0f, this.h);
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        canvas.drawText(this.g, getWidth() / 2, bitmapDecodeResource.getHeight() + DisplayUtil.dip2px(12.0f), this.h);
    }

    public void setSelectColor(int i) {
        this.f11630b = i;
        invalidate();
    }

    public void setSelectType(int i) {
        this.f11629a = i;
        invalidate();
    }

    public StatusTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f = context;
    }

    public StatusTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11629a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.I5);
        this.f11629a = typedArrayObtainStyledAttributes.getInteger(z4j.L5, 0);
        this.f11630b = typedArrayObtainStyledAttributes.getColor(z4j.K5, x44.a(gki.p));
        this.c = typedArrayObtainStyledAttributes.getColor(z4j.O5, x44.a(gki.f19087r));
        this.d = typedArrayObtainStyledAttributes.getResourceId(z4j.J5, loi.f25271b);
        this.e = typedArrayObtainStyledAttributes.getResourceId(z4j.N5, loi.c);
        this.g = typedArrayObtainStyledAttributes.getString(z4j.M5);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
