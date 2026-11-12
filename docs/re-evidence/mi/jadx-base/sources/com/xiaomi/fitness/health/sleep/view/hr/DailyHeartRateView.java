package com.xiaomi.fitness.health.sleep.view.hr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.c0j;
import defpackage.c54;
import defpackage.hep;
import defpackage.n4j;
import defpackage.rbc;
import defpackage.szc;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class DailyHeartRateView extends BaseColumnView<rbc> {
    public hep T;
    public int U;
    public SimpleDateFormat V;
    public String W;
    public LinearGradient a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public List<Path> f0;
    public List<Path> g0;
    public Paint h0;

    public class a implements szc {
        public a() {
        }

        @Override // defpackage.szc
        public long getEndTime() {
            return DailyHeartRateView.this.C * 1000;
        }

        @Override // defpackage.szc
        public long getStartTime() {
            return DailyHeartRateView.this.B * 1000;
        }
    }

    public DailyHeartRateView(Context context) {
        this(context, null);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void i(List<String> list, rbc rbcVar) {
        StringBuilder sb = this.R;
        sb.delete(0, sb.length());
        StringBuilder sb2 = this.R;
        sb2.append(rbcVar.f32377b);
        sb2.append(this.W);
        String string = this.R.toString();
        String str = this.V.format(Long.valueOf(rbcVar.f32376a * 1000));
        list.add(string);
        list.add(str);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void a(Canvas canvas) {
        float f;
        int i;
        int i2;
        this.f0.clear();
        this.g0.clear();
        float fD = c54.d(this.w.width(), this.C - this.B);
        int size = this.L.size();
        long j = -1;
        Path path = null;
        Path path2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < size) {
            rbc rbcVar = (rbc) this.L.get(i3);
            if (rbcVar == null) {
                f = fD;
                i = size;
                i2 = i3;
            } else {
                long j2 = rbcVar.f32376a;
                Path path3 = path2;
                long j3 = j2 - this.B;
                if (this.H) {
                    j3 = this.C - j2;
                }
                Rect rect = this.w;
                int i6 = rect.left;
                int i7 = i3;
                int i8 = (int) (i6 + (j3 * fD));
                int i9 = rect.bottom;
                f = fD;
                i = size;
                int i10 = (int) (i9 - ((rbcVar.f32377b - 30) * this.D));
                rbcVar.c = i8;
                if (i8 > rect.right || i8 < i6) {
                    path2 = path3;
                } else {
                    if (j < 0 || j2 - j >= 360000) {
                        if (path != null) {
                            path.lineTo(i4, i9);
                            path.lineTo(i5, this.w.bottom);
                            path.close();
                        }
                        path = new Path();
                        this.g0.add(path);
                        path2 = new Path();
                        this.f0.add(path2);
                    } else {
                        path2 = path3;
                    }
                    j = rbcVar.f32376a;
                    if (path.isEmpty()) {
                        if (this.H) {
                            Rect rect2 = this.w;
                            path.moveTo(rect2.right, rect2.bottom);
                            path.lineTo(this.w.right, i10);
                        } else {
                            Rect rect3 = this.w;
                            path.moveTo(rect3.left, rect3.bottom);
                            path.lineTo(this.w.left, i10);
                        }
                        path.lineTo(i8, i10);
                        i5 = i8;
                    } else {
                        path.lineTo(i8, i10);
                    }
                    if (path2.isEmpty()) {
                        if (this.H) {
                            path2.moveTo(this.w.right, i10);
                        } else {
                            path2.moveTo(this.w.left, i10);
                        }
                    }
                    path2.lineTo(i8, i10);
                    i4 = i8;
                }
                if (path != null) {
                    i2 = i7;
                    if (i2 == i - 1) {
                        if (this.H) {
                            path.lineTo(this.w.left, i10);
                            Rect rect4 = this.w;
                            path.lineTo(rect4.left, rect4.bottom);
                        } else {
                            path.lineTo(this.w.right, i10);
                            Rect rect5 = this.w;
                            path.lineTo(rect5.right, rect5.bottom);
                        }
                        path.close();
                    }
                } else {
                    i2 = i7;
                }
                if (path2 != null && i2 == i - 1) {
                    if (this.H) {
                        path2.lineTo(this.w.left, i10);
                    } else {
                        path2.lineTo(this.w.right, i10);
                    }
                }
            }
            i3 = i2 + 1;
            fD = f;
            size = i;
        }
        if (this.a0 == null) {
            Rect rect6 = this.w;
            this.a0 = new LinearGradient(rect6.left, rect6.top, 0.0f, rect6.bottom, this.b0, this.c0, Shader.TileMode.CLAMP);
        }
        this.q.setStrokeWidth(this.e0);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setColor(this.d0);
        this.q.setStrokeJoin(Paint.Join.ROUND);
        this.h0.setShader(this.a0);
        this.h0.setStyle(Paint.Style.FILL);
        int size2 = this.f0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            canvas.drawPath(this.g0.get(i11), this.h0);
            canvas.drawPath(this.f0.get(i11), this.q);
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void g(Canvas canvas) {
        this.T.l(this.o);
        this.T.j(this.v);
        this.T.g(canvas);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getHorizontalLineNum() {
        return 3;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getVerticalLineNum() {
        return 6;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void j(List<String> list, int i) {
        int i2 = (this.U - 30) / i;
        for (int i3 = 0; i3 < i; i3++) {
            list.add(String.valueOf(this.U - (i3 * i2)));
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public boolean u() {
        return true;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void v() {
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < this.L.size(); i++) {
            iMax = Math.max(iMax, ((rbc) this.L.get(i)).f32377b);
        }
        this.U = 60;
        if (iMax > 0) {
            this.U = iMax;
        }
        while (true) {
            int i2 = this.U;
            if (i2 % 30 == 0) {
                return;
            } else {
                this.U = i2 + 1;
            }
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void x(Canvas canvas) {
        super.x(canvas);
        this.D = (this.w.height() * 1.0f) / (this.U - 30);
    }

    public DailyHeartRateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DailyHeartRateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b0 = MenuBuilder.CATEGORY_MASK;
        this.c0 = -16711936;
        this.d0 = MenuBuilder.CATEGORY_MASK;
        this.e0 = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.M0);
        this.b0 = typedArrayObtainStyledAttributes.getColor(n4j.Q0, this.b0);
        this.c0 = typedArrayObtainStyledAttributes.getColor(n4j.P0, this.c0);
        this.d0 = typedArrayObtainStyledAttributes.getColor(n4j.N0, this.d0);
        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.O0, this.e0);
        typedArrayObtainStyledAttributes.recycle();
        hep hepVar = new hep(context);
        this.T = hepVar;
        hepVar.k(new a());
        this.V = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.US);
        this.W = context.getString(c0j.V6);
        this.f0 = new LinkedList();
        this.g0 = new LinkedList();
        Paint paint = new Paint(1);
        this.h0 = paint;
        paint.setColor(-16776961);
        this.h0.setDither(true);
        this.h0.setAlpha(102);
    }
}
