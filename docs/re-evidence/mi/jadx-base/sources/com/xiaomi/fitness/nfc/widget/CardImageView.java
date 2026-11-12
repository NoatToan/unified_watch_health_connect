package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.pli;

/* JADX INFO: loaded from: classes9.dex */
public class CardImageView extends SelectorImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f12634b;
    public String c;
    public String d;
    public int e;
    public int f;

    public CardImageView(Context context) {
        super(context);
        this.e = 0;
        this.f = 0;
    }

    public final void a() {
        if (this.e == 0) {
            this.e = getWidth() / 6;
            this.f = (getHeight() / 7) * 6;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
        if (!TextUtils.isEmpty(this.f12633a)) {
            if (this.f12634b == null) {
                Paint paint = new Paint(1);
                this.f12634b = paint;
                paint.setColor(-1);
            }
            this.f12634b.setAlpha(255);
            this.f12634b.setTextSize(getResources().getDimension(pli.m));
            canvas.drawText(this.f12633a, getResources().getDimension(pli.o), DisplayUtil.dip2px(30.0f), this.f12634b);
        }
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        if (this.f12634b == null) {
            Paint paint2 = new Paint(1);
            this.f12634b = paint2;
            paint2.setColor(-1);
        }
        this.f12634b.setAlpha(200);
        this.f12634b.setTextSize(getResources().getDimension(pli.l));
        canvas.drawText(this.c, this.e, this.f, this.f12634b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setCardDate(String str) {
        this.d = str;
        invalidate();
    }

    public void setCardNo(String str) {
        this.c = str;
        invalidate();
    }

    public void setName(String str) {
        this.f12633a = str;
        invalidate();
    }

    public CardImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.f = 0;
    }

    public CardImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        this.f = 0;
    }
}
