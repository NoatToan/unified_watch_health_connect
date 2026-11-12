package com.xiaomi.fitness.health.sleep.view.spo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView;
import defpackage.c54;
import defpackage.g9n;
import defpackage.hep;
import defpackage.szc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class DailySpoView extends BaseColumnView<g9n> {
    public hep T;
    public List<RectF> U;
    public Path V;
    public float[] W;
    public int a0;
    public int b0;
    public DateFormat c0;
    public int d0;

    public class a implements szc {
        public a() {
        }

        @Override // defpackage.szc
        public long getEndTime() {
            return DailySpoView.this.C * 1000;
        }

        @Override // defpackage.szc
        public long getStartTime() {
            return DailySpoView.this.B * 1000;
        }
    }

    public DailySpoView(Context context) {
        this(context, null);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void i(List<String> list, g9n g9nVar) {
        StringBuilder sb = this.R;
        sb.delete(0, sb.length());
        StringBuilder sb2 = this.R;
        sb2.append(g9nVar.c);
        sb2.append("%");
        if (g9nVar.c < g9nVar.d) {
            StringBuilder sb3 = this.R;
            sb3.append("-");
            sb3.append(g9nVar.d);
            sb3.append("%");
        }
        list.add(this.R.toString());
        long j = g9nVar.f18759a * 1000;
        long millis = TimeUnit.MINUTES.toMillis(10L) + j;
        StringBuilder sb4 = this.R;
        sb4.delete(0, sb4.length());
        StringBuilder sb5 = this.R;
        sb5.append(this.c0.format(Long.valueOf(j)));
        sb5.append("-");
        sb5.append(this.c0.format(Long.valueOf(millis)));
        list.add(this.R.toString());
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void a(Canvas canvas) {
        this.U.clear();
        float fD = c54.d(this.w.width() - 32, this.C - this.B);
        int size = this.L.size();
        float f = this.h / 2.0f;
        for (int i = 0; i < size; i++) {
            g9n g9nVar = (g9n) this.L.get(i);
            if (g9nVar != null && g9nVar.f18760b.length != 0) {
                long j = g9nVar.f18759a;
                long j2 = j - this.B;
                if (this.H) {
                    j2 = this.C - j;
                }
                float fB = c54.b(this.w.left + 16, j2, fD);
                Rect rect = this.w;
                if (fB <= rect.right && fB >= rect.left) {
                    g9nVar.e = fB;
                    Integer[] numArr = g9nVar.f18760b;
                    int i2 = Integer.MIN_VALUE;
                    RectF rectF = null;
                    int i3 = 0;
                    while (i3 < numArr.length) {
                        int iIntValue = numArr[i3].intValue() - this.b0;
                        int i4 = (int) (this.w.bottom - (iIntValue * this.D));
                        if (i3 == 0 || iIntValue - i2 >= 2) {
                            float f2 = i4;
                            RectF rectF2 = new RectF(fB - f, f2, fB + f, f2);
                            this.U.add(rectF2);
                            rectF = rectF2;
                        } else {
                            float f3 = i4;
                            if (f3 < rectF.top) {
                                rectF.top = f3;
                            }
                            if (f3 > rectF.bottom) {
                                rectF.bottom = f3;
                            }
                        }
                        i3++;
                        i2 = iIntValue;
                    }
                }
            }
        }
        this.q.setColor(this.g);
        this.q.setStyle(Paint.Style.FILL);
        this.V.reset();
        for (RectF rectF3 : this.U) {
            rectF3.top -= f;
            rectF3.bottom += f;
            this.V.addRoundRect(rectF3, this.W, Path.Direction.CCW);
        }
        canvas.drawPath(this.V, this.q);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void g(Canvas canvas) {
        this.T.j(this.v);
        this.T.l(this.o);
        this.T.g(canvas);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getHorizontalLineNum() {
        return 4;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getVerticalLineNum() {
        return 3;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void j(List<String> list, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            list.add(String.valueOf(this.a0 - (this.d0 * i2)));
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public boolean u() {
        return true;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void v() {
        int iMin = 100;
        this.a0 = 100;
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            g9n g9nVar = (g9n) this.L.get(i);
            if (g9nVar != null && g9nVar.f18760b.length != 0) {
                iMin = Math.min(iMin, g9nVar.c);
            }
        }
        this.b0 = 80;
        this.d0 = 5;
        if (iMin < 80) {
            this.b0 = 60;
            this.d0 = 10;
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void x(Canvas canvas) {
        super.x(canvas);
        this.D = (this.w.height() * 1.0f) / (this.a0 - this.b0);
    }

    public DailySpoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DailySpoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hep hepVar = new hep(context);
        this.T = hepVar;
        hepVar.k(new a());
        this.U = new LinkedList();
        this.V = new Path();
        float f = this.h / 2.0f;
        this.W = new float[]{f, f, f, f, f, f, f, f};
        this.c0 = new SimpleDateFormat(TimeUtils.FORMAT_H_M, Locale.US);
    }
}
