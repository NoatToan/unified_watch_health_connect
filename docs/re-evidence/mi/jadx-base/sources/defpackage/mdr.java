package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class mdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f26047a;
    public long c;
    public long d;
    public int f;
    public Rect g;
    public Paint h;
    public boolean j = AppUtil.isRTLDirection();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f26048b = new Rect();
    public final Calendar e = Calendar.getInstance();
    public SimpleDateFormat i = new SimpleDateFormat(TimeDateUtil.getDayFormatPetternStr(PluginDeviceInfo.FICONOFF), Locale.getDefault());

    public mdr(Context context) {
        this.f26047a = context.getResources().getStringArray(ohi.f29179b);
    }

    public final void a(Canvas canvas) {
        this.h.getTextBounds("88", 0, 2, this.f26048b);
        float fCenterY = this.g.centerY() + (this.f26048b.height() * 0.35f);
        this.h.setTextAlign(Paint.Align.CENTER);
        float fC = c54.c(this.g.width(), this.f);
        this.e.setTimeInMillis(this.c * 1000);
        int actualMaximum = this.e.getActualMaximum(5);
        int i = 1;
        while (i < actualMaximum) {
            int i2 = i - 1;
            if (this.j) {
                i2 = actualMaximum - i;
            }
            float fA = c54.a(this.g.left, i2, fC);
            if (i == 1) {
                this.h.getTextBounds("88", 0, 2, this.f26048b);
                fA += this.f26048b.width() * 0.5f;
            }
            this.e.set(5, i);
            canvas.drawText(d(this.e), fA, fCenterY, this.h);
            i = i == 1 ? i + 6 : i + 7;
        }
    }

    public final void b(Canvas canvas) {
        this.e.setTimeInMillis(this.c * 1000);
        c54.e(this.e);
        long timeInMillis = this.e.getTimeInMillis();
        String str = this.f26047a[0];
        this.h.getTextBounds(str, 0, str.length(), this.f26048b);
        float fCenterY = this.g.centerY() + (this.f26048b.height() * 0.35f);
        this.h.setTextAlign(Paint.Align.CENTER);
        int i = this.f;
        float fC = c54.c(this.g.width(), i);
        for (int i2 = 0; i2 < i; i2++) {
            float fA = c54.a(this.g.left, this.j ? (i - i2) - 1 : i2, fC);
            this.e.setTimeInMillis(timeInMillis);
            canvas.drawText(this.f26047a[(this.e.get(7) + 5) % 7], fA, fCenterY, this.h);
            timeInMillis += c54.f4932a;
        }
    }

    public void c(Canvas canvas, int i) {
        if (i == 0) {
            b(canvas);
        } else {
            if (i == 1) {
                a(canvas);
                return;
            }
            throw new IllegalStateException("unsupported viewType = " + i);
        }
    }

    public final String d(Calendar calendar) {
        if (!TimeDateUtil.isLanguageEn()) {
            return this.i.format(calendar.getTime());
        }
        int i = calendar.get(5);
        return i + TimeDateUtil.INSTANCE.getDayOfMonthSuffix(i);
    }

    public void e(int i) {
        if (i <= 0) {
            i = 7;
        }
        this.f = i;
    }

    public void f(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    public void g(Rect rect) {
        this.g = rect;
    }

    public void h(Paint paint) {
        this.h = paint;
    }
}
