package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class hep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f19990b;
    public szc c;
    public Paint d;
    public float e;
    public Rect f;
    public final Paint h;
    public List<a> i;
    public List<a> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19991k;
    public StringBuilder l;
    public boolean m = AppUtil.isRTLDirection();
    public final Calendar g = Calendar.getInstance();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19993b;

        public a(long j, float f) {
            this.f19992a = j;
            this.f19993b = f;
        }

        public float a() {
            return this.f19993b;
        }

        public long b() {
            return this.f19992a;
        }
    }

    public hep(Context context) {
        this.f19989a = context;
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.i = new LinkedList();
        this.j = new LinkedList();
        this.f = new Rect();
        this.l = new StringBuilder();
    }

    public static float e(float f, long j, long j2, float f2) {
        return f + ((j2 - j) * f2);
    }

    public final void a(Calendar calendar) {
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public final void b(Canvas canvas) {
        long startTime = this.c.getStartTime();
        long endTime = this.c.getEndTime();
        StringBuilder sb = this.l;
        sb.delete(0, sb.length());
        this.l.append(this.f19989a.getString(c0j.Ip, d(startTime)));
        String string = this.l.toString();
        StringBuilder sb2 = this.l;
        sb2.delete(0, sb2.length());
        this.l.append(this.f19989a.getString(c0j.Hp, d(endTime)));
        String string2 = this.l.toString();
        StringBuilder sb3 = this.l;
        sb3.delete(0, sb3.length());
        this.d.getTextBounds(string, 0, string.length(), this.f);
        float fCenterY = this.f19990b.centerY() + (this.f.height() * 0.3f);
        Paint.Align textAlign = this.d.getTextAlign();
        Paint paint = this.d;
        Paint.Align align = Paint.Align.LEFT;
        paint.setTextAlign(align);
        float f = this.f19990b.left;
        if (this.m) {
            this.d.setTextAlign(Paint.Align.RIGHT);
            f = this.f19990b.right;
        }
        canvas.drawText(string, f, fCenterY, this.d);
        this.d.setTextAlign(Paint.Align.RIGHT);
        float f2 = this.f19990b.right;
        if (this.m) {
            this.d.setTextAlign(align);
            f2 = this.f19990b.left;
        }
        canvas.drawText(string2, f2, fCenterY, this.d);
        this.d.setTextAlign(textAlign);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0061  */
    public final void c(Canvas canvas) {
        float f = this.f19990b.top;
        float fB = f + this.c.b();
        float fCenterY = this.f19990b.centerY() + (this.f.height() * 0.3f);
        float f2 = this.f19990b.left;
        float fWidth = this.f.width();
        this.j.clear();
        int size = this.i.size();
        int i = size - 1;
        a aVar = this.i.get(i);
        float fA = aVar.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            a aVar2 = this.i.get(i3);
            float fA2 = aVar2.a();
            if (i3 <= 0 || fA2 - f2 > fWidth) {
                float f3 = fA - fA2;
                if (f3 >= fWidth) {
                    if (i3 != size - 2 || i2 % 2 != 1 || f3 > 1.2f * fWidth) {
                        this.j.add(aVar2);
                        i2++;
                        f2 = fA2;
                    }
                }
                f2 = f2;
            } else {
                f2 = f2;
            }
        }
        this.j.add(aVar);
        int size2 = this.j.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a aVar3 = this.j.get(i4);
            String strD = d(aVar3.b());
            float fA3 = aVar3.a();
            if (i4 <= 0 || i4 != size2 - 2 || i4 % 2 != 0) {
                if (i4 % 2 == 0 || i4 == size2 - 1) {
                    canvas.drawText(strD, fA3, fCenterY, this.d);
                } else {
                    canvas.drawLine(fA3, f, fA3, fB, this.h);
                }
            }
        }
    }

    public final String d(long j) {
        this.g.setTimeInMillis(j);
        int i = this.g.get(11);
        int i2 = this.g.get(12);
        return String.format(Locale.US, "%s:%s", i >= 10 ? String.valueOf(i) : String.format(Locale.US, "0%d", Integer.valueOf(i)), i2 >= 10 ? String.valueOf(i2) : String.format(Locale.US, "0%d", Integer.valueOf(i2)));
    }

    public final void f(Canvas canvas) {
        c(canvas);
    }

    public void g(Canvas canvas) {
        if (!this.f19991k) {
            b(canvas);
        } else {
            h();
            f(canvas);
        }
    }

    public final void h() {
        long duration = this.c.getDuration();
        if (duration == 0) {
            this.e = 0.0f;
        } else {
            this.e = (this.f19990b.width() * 1.0f) / duration;
        }
        this.h.setColor(this.c.a());
        this.h.setStrokeWidth(this.c.c());
        i();
    }

    public final void i() {
        this.i.clear();
        long startTime = this.c.getStartTime();
        long endTime = this.c.getEndTime();
        this.d.getTextBounds("88:88", 0, 5, this.f);
        this.i.add(new a(startTime, this.f19990b.left + (this.f.width() / 2.0f)));
        this.g.setTimeInMillis(endTime);
        a(this.g);
        this.g.add(11, -1);
        long timeInMillis = this.g.getTimeInMillis();
        this.g.setTimeInMillis(startTime);
        a(this.g);
        this.g.add(11, 2);
        long timeInMillis2 = this.g.getTimeInMillis();
        while (timeInMillis2 <= timeInMillis) {
            this.i.add(new a(timeInMillis2, e(this.f19990b.left, startTime, timeInMillis2, this.e)));
            this.g.add(11, 1);
            timeInMillis2 = this.g.getTimeInMillis();
        }
        this.i.add(new a(endTime, this.f19990b.right - (this.f.width() / 2.0f)));
    }

    public void j(Rect rect) {
        this.f19990b = rect;
    }

    public void k(szc szcVar) {
        this.c = szcVar;
    }

    public void l(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        this.d = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }
}
