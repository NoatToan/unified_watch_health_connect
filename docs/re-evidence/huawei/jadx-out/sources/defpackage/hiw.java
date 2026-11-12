package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.health.suggestion.ui.fitness.module.SugChart;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hiw {
    public static void b(Canvas canvas, hmc hmcVar, c cVar) {
        if (canvas == null || hmcVar == null || cVar.d == null || cVar.f36786a == null) {
            LogUtil.e("Suggestion_CalloutHelper", "canvas == null || excel == null || calloutPaint == null || backgroundPaint == null");
            return;
        }
        float fA = a(2.0f) + (cVar.e / 2.0f);
        if (hmcVar.l() <= 0.0f) {
            return;
        }
        PointF pointFB = hmcVar.b();
        Path path = new Path();
        float fA2 = a(8.0f);
        float fA3 = a(4.0f);
        path.moveTo(pointFB.x, pointFB.y - fA);
        float f = fA2 / 2.0f;
        path.lineTo(pointFB.x - f, ((pointFB.y - fA) - fA3) - 1.0f);
        path.lineTo(pointFB.x + f, ((pointFB.y - fA) - fA3) - 1.0f);
        path.close();
        canvas.drawPath(path, cVar.f36786a);
        String strValueOf = String.valueOf(hmcVar.j());
        float fMeasureText = cVar.d.measureText(strValueOf);
        float fA4 = a(21.0f);
        float fA5 = a(6.0f);
        float f2 = fMeasureText / 2.0f;
        RectF rectF = new RectF((pointFB.x - f2) - fA5, ((pointFB.y - fA) - fA3) - fA4, pointFB.x + f2 + fA5, (pointFB.y - fA) - fA3);
        float f3 = rectF.right - cVar.f36787b;
        float f4 = pointFB.x;
        if (f3 > 0.0f) {
            rectF.right = (rectF.right - f3) - 1.0f;
            rectF.left = (rectF.left - f3) - 1.0f;
            f4 = (pointFB.x - f3) - 1.0f;
        } else if (rectF.left < 0.0f) {
            rectF.right = (rectF.right - rectF.left) + 1.0f;
            f4 = (pointFB.x - rectF.left) + 1.0f;
            rectF.left = 1.0f;
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, cVar.f36786a);
        canvas.drawText(strValueOf, f4, (rectF.bottom - (rectF.height() / 2.0f)) + (d(cVar.d) / 2.0f), cVar.d);
    }

    private static int a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    private static float d(Paint paint) {
        return (-paint.ascent()) - paint.descent();
    }

    public static float d() {
        return a(21.0f) + a(4.0f) + a(4.0f);
    }

    public static hmc a(hmc hmcVar, hmc hmcVar2) {
        if (hmcVar != null && hmcVar2 != null) {
            return hmcVar2.i() > hmcVar.i() ? hmcVar2 : hmcVar;
        }
        LogUtil.e("Suggestion_CalloutHelper", "sugExcel == null || standardHeightExcel == null");
        return null;
    }

    public static hmc e(hmc hmcVar, hmc hmcVar2) {
        if (hmcVar != null && hmcVar2 != null) {
            return hmcVar2.t() > hmcVar.t() ? hmcVar2 : hmcVar;
        }
        LogUtil.e("Suggestion_CalloutHelper", "sugExcel == null || highestExcel == null");
        return null;
    }

    public static void e(MotionEvent motionEvent, PointF pointF, float f, SugChart.OnHelperGestureListener onHelperGestureListener) {
        if (motionEvent == null || pointF == null) {
            LogUtil.e("Suggestion_CalloutHelper", "event == null || downPoint == null");
            return;
        }
        float x = motionEvent.getX() - pointF.x;
        float f2 = 3.0f * f;
        if (Math.abs(motionEvent.getY() - pointF.y) < f2) {
            if (Math.abs(x) <= f * 4.0f || onHelperGestureListener == null) {
                return;
            }
            onHelperGestureListener.scrollX(x > 0.0f);
            return;
        }
        if (Math.abs(x) >= f2 || onHelperGestureListener == null) {
            return;
        }
        onHelperGestureListener.scrollX(motionEvent.getY() - pointF.y > 0.0f);
    }

    public static int c(List<hmc> list) {
        if (njy.e(list)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i).l() < list.get(i2).l()) {
                i = i2;
            }
        }
        return i;
    }

    public static boolean a(PointF pointF, hmc hmcVar, PointF pointF2) {
        return pointF != null && pointF2 != null && hmcVar != null && pointF2.x <= pointF.x && pointF2.x + hmcVar.y() > pointF.x && pointF2.y > pointF.y && (pointF2.y - hmcVar.t()) - 1.0f < pointF.y;
    }

    public static boolean a(hmc hmcVar) {
        if (hmcVar == null) {
            return false;
        }
        return hmcVar.h() == 0 || hmcVar.h() == 3 || hmcVar.h() == 2;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f36786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f36787b;
        private Paint d;
        private float e;

        public c(float f, float f2, Paint paint, Paint paint2) {
            this.e = f;
            this.f36787b = f2;
            this.f36786a = paint;
            this.d = paint2;
        }
    }
}
