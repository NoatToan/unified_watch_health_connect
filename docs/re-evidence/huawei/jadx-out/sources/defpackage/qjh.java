package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.calendarview.listener.OnDayMarkShowListener;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes43.dex */
public class qjh {
    public static void d(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, qjo qjoVar, int i3, Paint paint, Paint paint2) {
        for (HealthMark healthMark : healthCalendar.getMarks()) {
            int iE = healthMark.e();
            int iC = healthMark.c();
            int i4 = AnonymousClass2.f46310b[healthMark.h().ordinal()];
            if (i4 == 1) {
                Drawable drawableD = healthMark.d();
                if (drawableD == null) {
                    drawableD = qjoVar.f().d();
                    iE = qjoVar.f().e();
                }
                if (drawableD != null) {
                    d(canvas, drawableD, i + iC, i2 + iE);
                }
            } else if (i4 == 2) {
                a(canvas, i, i2, qjoVar, i3, paint, healthMark);
            } else if (i4 == 3) {
                String strA = healthMark.a();
                Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                float f = i;
                float f2 = (i2 - fontMetrics.ascent) + iE;
                canvas.drawText(strA, f, f2, paint2);
                Drawable drawableD2 = healthMark.d();
                if (drawableD2 != null) {
                    float fMeasureText = ((paint2.measureText(strA) + drawableD2.getIntrinsicWidth()) / 2.0f) + iC;
                    if (LanguageUtil.ba(BaseApplication.b())) {
                        fMeasureText = -fMeasureText;
                    }
                    d(canvas, drawableD2, f + fMeasureText, (f2 + fontMetrics.descent) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f));
                }
            } else if (i4 == 4) {
                d(canvas, healthCalendar, i, i2, qjoVar.g, healthMark, iE, iC);
            }
        }
    }

    /* JADX INFO: renamed from: qjh$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f46310b;

        static {
            int[] iArr = new int[HealthMark.MarkType.values().length];
            f46310b = iArr;
            try {
                iArr[HealthMark.MarkType.DRAWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46310b[HealthMark.MarkType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46310b[HealthMark.MarkType.TEXT_DRAWABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46310b[HealthMark.MarkType.VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void a(Canvas canvas, int i, int i2, qjo qjoVar, int i3, Paint paint, HealthMark healthMark) {
        int iB;
        if (healthMark.f()) {
            iB = healthMark.b();
        } else {
            iB = qjoVar.f().b();
        }
        paint.setColor(iB);
        canvas.drawCircle(i, i2 - i3, i3, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void d(Canvas canvas, HealthCalendar healthCalendar, int i, int i2, int i3, HealthMark healthMark, int i4, int i5) {
        View viewJ = healthMark.j();
        if (viewJ == 0) {
            return;
        }
        healthMark.e(i3);
        int iSave = canvas.save();
        canvas.translate((i - (viewJ.getWidth() / 2)) + i5, i2 + i4);
        if (viewJ instanceof OnDayMarkShowListener) {
            ((OnDayMarkShowListener) viewJ).onDayMarkShow(viewJ, healthCalendar);
        }
        viewJ.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    private static void d(Canvas canvas, Drawable drawable, float f, float f2) {
        int iSave = canvas.save();
        canvas.translate(f, f2);
        int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
