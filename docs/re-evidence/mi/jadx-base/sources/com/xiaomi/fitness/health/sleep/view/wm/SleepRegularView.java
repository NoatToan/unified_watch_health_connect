package com.xiaomi.fitness.health.sleep.view.wm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView;
import defpackage.c0j;
import defpackage.c54;
import defpackage.ili;
import defpackage.iwc;
import defpackage.mdr;
import defpackage.tzc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class SleepRegularView extends BaseColumnView<a<b>> {
    public Calendar T;
    public com.xiaomi.fitness.health.sleep.view.wm.a<b> U;
    public DateFormat V;
    public DateFormat W;
    public long a0;
    public int b0;
    public List<RectF> c0;
    public mdr d0;
    public int e0;
    public int f0;
    public int g0;

    public static final class a<T extends tzc> implements iwc, tzc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f12289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12290b;
        public final long c;
        public final long d;
        public float e;
        public float f;

        public a(List<T> list, long j, long j2, long j3) {
            this.f12289a = list == null ? Collections.emptyList() : list;
            this.f12290b = j;
            this.c = j2;
            this.d = j3;
        }

        @Override // defpackage.iwc
        public float a() {
            return this.f;
        }

        @Override // defpackage.iwc
        public float b() {
            return this.e;
        }

        @Override // defpackage.tzc
        public long getEndTime() {
            return this.d;
        }

        @Override // defpackage.tzc
        public long getStartTime() {
            return this.c;
        }

        @Override // defpackage.tzc
        public long getTimestamp() {
            return this.f12290b;
        }

        public String toString() {
            return "DailyRecord{timestamp=" + this.f12290b + ", startTime=" + this.c + ", endTime=" + this.d + ", x=" + this.e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class b implements tzc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f12291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f12292b;
        public long c;

        @Override // defpackage.tzc
        public long getEndTime() {
            return this.f12292b;
        }

        @Override // defpackage.tzc
        public long getStartTime() {
            return this.f12291a;
        }

        @Override // defpackage.tzc
        public long getTimestamp() {
            return this.c;
        }

        public String toString() {
            return "SleepData{startTime=" + this.f12291a + ", endTime=" + this.f12292b + ", timestamp=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public SleepRegularView(Context context) {
        this(context, null);
    }

    public static List<a<b>> K(List<b> list) {
        LinkedList linkedList = new LinkedList();
        com.xiaomi.fitness.health.sleep.view.wm.a.d(linkedList, list);
        return linkedList;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void A(long j, long j2) {
        this.T.setTimeInMillis(j * 1000);
        c54.e(this.T);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.T.getTimeInMillis());
        this.T.setTimeInMillis((j2 * 1000) + c54.f4932a);
        c54.e(this.T);
        super.A(seconds, timeUnit.toSeconds(this.T.getTimeInMillis()));
    }

    public final void E() {
        long j = this.B;
        if (j == this.C) {
            return;
        }
        this.T.setTimeInMillis(j * 1000);
        c54.e(this.T);
        long timeInMillis = this.T.getTimeInMillis();
        this.T.setTimeInMillis(this.C * 1000);
        c54.e(this.T);
        int timeInMillis2 = (int) ((this.T.getTimeInMillis() - timeInMillis) / c54.f4932a);
        this.b0 = timeInMillis2;
        if (timeInMillis2 == 0) {
            throw new IllegalStateException("time date can not be in same day");
        }
    }

    public final void F() {
        Pair<Integer, Integer> pairJ = J(this.U.f12294b);
        this.T.setTimeInMillis(this.B * 1000);
        if (this.U.e) {
            this.T.add(5, -1);
        }
        this.T.set(11, ((Integer) pairJ.first).intValue());
        this.T.set(12, ((Integer) pairJ.second).intValue());
        this.a0 = TimeUnit.MILLISECONDS.toSeconds(this.T.getTimeInMillis());
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void i(List<String> list, a<b> aVar) {
        StringBuilder sb = this.R;
        sb.delete(0, sb.length());
        StringBuilder sb2 = this.R;
        sb2.append(this.V.format(Long.valueOf(aVar.c * 1000)));
        sb2.append("-");
        sb2.append(this.V.format(Long.valueOf(aVar.d * 1000)));
        String string = this.R.toString();
        String str = this.W.format(Long.valueOf(aVar.f12290b * 1000));
        list.add(string);
        list.add(str);
    }

    public final int H(int i) {
        if (i <= 7) {
            return this.e0;
        }
        return (i == 28 || i == 29) ? this.f0 : this.g0;
    }

    public final int I(int i) {
        return i <= 7 ? 6 : 12;
    }

    public final Pair<Integer, Integer> J(int i) {
        return Pair.create(Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        List<T> list;
        this.c0.clear();
        int i = this.b0;
        float fC = c54.c(this.w.width(), i);
        float fHeight = (this.w.height() * 1.0f) / this.U.d;
        int iH = H(i);
        this.h = iH;
        float f4 = iH / 2.0f;
        int size = this.L.size();
        int i2 = 0;
        while (i2 < size) {
            a aVar = (a) this.L.get(i2);
            if (aVar == null || aVar.f12290b < this.B || (list = aVar.f12289a) == 0 || list.isEmpty()) {
                f = fC;
                f2 = fHeight;
                f3 = f4;
            } else {
                long j = aVar.f12290b - this.B;
                long j2 = c54.f4933b;
                int i3 = (int) (j / j2);
                if (i3 < 0) {
                    f = fC;
                    f2 = fHeight;
                    f3 = f4;
                } else {
                    long j3 = this.a0 + (((long) i3) * j2);
                    if (this.H) {
                        i3 = (i - i3) - 1;
                    }
                    aVar.e = c54.a(this.w.left, i3, fC);
                    float fMax = Float.MIN_VALUE;
                    int i4 = 0;
                    while (i4 < list.size()) {
                        b bVar = (b) list.get(i4);
                        long startTime = bVar.getStartTime();
                        long endTime = bVar.getEndTime();
                        int i5 = this.w.top;
                        float f5 = i5 + ((startTime - j3) * fHeight);
                        float f6 = i5 + ((endTime - j3) * fHeight);
                        float f7 = aVar.e;
                        float f8 = fC;
                        RectF rectF = new RectF(f7 - f4, f5, f7 + f4, f6);
                        float f9 = fHeight;
                        float f10 = f4;
                        if (this.w.contains((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom)) {
                            this.c0.add(rectF);
                            fMax = Math.max(fMax, f5);
                        }
                        i4++;
                        fC = f8;
                        fHeight = f9;
                        f4 = f10;
                    }
                    f = fC;
                    f2 = fHeight;
                    f3 = f4;
                    aVar.f = fMax;
                }
            }
            i2++;
            fC = f;
            fHeight = f2;
            f4 = f3;
        }
        this.q.setColor(this.g);
        this.q.setStyle(Paint.Style.FILL);
        for (int i6 = 0; i6 < this.c0.size(); i6++) {
            float fI = I(i);
            canvas.drawRoundRect(this.c0.get(i6), fI, fI, this.q);
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void g(Canvas canvas) {
        this.d0.e(this.b0);
        this.d0.f(this.B, this.C);
        this.d0.g(this.v);
        this.d0.h(this.o);
        this.d0.c(canvas, this.S);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getHorizontalLineNum() {
        return 5;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public int getVerticalLineNum() {
        return 0;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void j(List<String> list, int i) {
        int i2 = this.U.f12293a;
        for (int i3 = 0; i3 < i; i3++) {
            Pair<Integer, Integer> pairJ = J((int) (((long) (this.U.f12294b + (i3 * i2))) % c54.c));
            StringBuilder sb = this.R;
            sb.delete(0, sb.length());
            int iIntValue = ((Integer) pairJ.first).intValue();
            int iIntValue2 = ((Integer) pairJ.second).intValue();
            if (iIntValue < 10) {
                StringBuilder sb2 = this.R;
                sb2.append("0");
                sb2.append(iIntValue);
            } else {
                this.R.append(iIntValue);
            }
            this.R.append(":");
            if (iIntValue2 < 10) {
                StringBuilder sb3 = this.R;
                sb3.append("0");
                sb3.append(iIntValue2);
            } else {
                this.R.append(iIntValue2);
            }
            list.add(this.R.toString());
        }
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public boolean u() {
        return false;
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void v() {
        this.U.c(this.L, this.T);
    }

    @Override // com.xiaomi.fitness.health.sleep.view.baseview.BaseColumnView
    public void x(Canvas canvas) {
        super.x(canvas);
        this.U.c(this.L, this.T);
        E();
        F();
    }

    public SleepRegularView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepRegularView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b0 = 7;
        this.U = new com.xiaomi.fitness.health.sleep.view.wm.a<>();
        this.T = Calendar.getInstance();
        Locale locale = Locale.US;
        this.V = new SimpleDateFormat(TimeUtils.FORMAT_H_M, locale);
        this.W = new SimpleDateFormat(context.getString(c0j.l), locale);
        this.c0 = new LinkedList();
        this.d0 = new mdr(context);
        Resources resources = context.getResources();
        this.e0 = resources.getDimensionPixelOffset(ili.l);
        this.f0 = resources.getDimensionPixelOffset(ili.n);
        this.g0 = resources.getDimensionPixelOffset(ili.m);
    }
}
