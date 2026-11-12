package com.huawei.ui.homehealth.functionsetcard.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.wuw;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes17.dex */
public class PhysiologicalCycleDotMatrixView extends View {
    private Paint aa;
    private int ab;
    private int ac;
    private float ad;
    private float ae;
    private float af;
    private Paint ag;
    private Paint ah;
    private float ai;
    private String aj;
    private int[][] f;
    private Paint g;
    private Context i;
    private Paint k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Paint o;
    private Paint p;
    private Paint q;
    private Paint r;
    private Paint s;
    private Paint t;
    private Paint u;
    private Paint v;
    private Paint w;
    private Paint x;
    private Paint y;
    private Paint z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25458b = qrs.d(BaseApplication.b(), 4.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25457a = qrs.d(BaseApplication.b(), 6.0f);
    private static final float d = qrs.d(BaseApplication.b(), 8.0f);
    private static final float e = qrs.d(BaseApplication.b(), 8.5f);
    private static final float j = qrs.d(BaseApplication.b(), 11.0f);
    private static final float h = qrs.d(BaseApplication.b(), 8.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f25459c = qrs.d(BaseApplication.b(), 10.0f);

    private boolean c(int i) {
        return i == 1 || i == 3 || i == 5 || i == 7;
    }

    private boolean d(int i) {
        return i == 9;
    }

    public PhysiologicalCycleDotMatrixView(Context context, List<HiHealthData> list) {
        super(context);
        this.aj = "今";
        this.i = context;
        this.f = e(new ArrayList(list));
        c();
    }

    private int[][] e(List<HiHealthData> list) {
        boolean zE = wuw.e();
        LogUtil.a("DotMatrixView", "createDataList size : ", Integer.valueOf(list.size()), " isOpenOvulationFertilePeriodSwitch ", Boolean.valueOf(zE));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData == null) {
                LogUtil.j("DotMatrixView", "hiData item is null");
            } else {
                try {
                    int iD = d(String.valueOf(hiHealthData.getDouble("point_value")), hiHealthData.getStartTime(), zE);
                    arrayList.add(Integer.valueOf(iD));
                    LogUtil.a("DotMatrixView", "createDataList pointType ", Integer.valueOf(iD));
                } catch (NullPointerException unused) {
                    LogUtil.e("DotMatrixView", "data.getStartTime() nullPointerException");
                }
            }
        }
        Collections.reverse(arrayList);
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 7);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = iArr[i2];
                if (i3 < iArr2.length) {
                    int i4 = (i2 * 7) + i3;
                    iArr2[i3] = njy.c(arrayList, i4) ? ((Integer) arrayList.get(i4)).intValue() : 0;
                    i3++;
                }
            }
        }
        this.ab = iArr[0].length;
        this.ac = iArr.length;
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 != null) {
                LogUtil.a("DotMatrixView", "createDataList, time: ", new Date(hiHealthData2.getStartTime()), ", type: ", String.valueOf(hiHealthData2.getDouble("point_value")));
            }
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    private int d(String str, long j2, boolean z) {
        str.hashCode();
        switch (str) {
            case "0.0":
                return d(j2) ? 1 : 0;
            case "2.0":
                if (z) {
                    return d(j2) ? 9 : 8;
                }
                return d(j2) ? 1 : 0;
            case "100.0":
            case "101.0":
            case "102.0":
                return d(j2) ? 3 : 2;
            case "300.0":
            case "301.0":
            case "302.0":
                return d(j2) ? 7 : 6;
            case "400.0":
            case "401.0":
            case "402.0":
            case "403.0":
                if (z) {
                    return d(j2) ? 5 : 4;
                }
                return d(j2) ? 1 : 0;
            default:
                LogUtil.j("DotMatrixView", "getPointType other type!");
                return 0;
        }
    }

    private boolean d(long j2) {
        return ltb.c(System.currentTimeMillis()) == j2;
    }

    private void c() {
        if (qqs.c()) {
            this.r = a(R.color.flyme_menstrual_other);
            this.s = b(R.color.flyme_menstrual_other_target);
            this.p = b(R.color.flyme_menstrual_other_line);
        } else {
            this.r = a(R.color.menstrual_other);
            this.s = b(R.color.menstrual_other_target);
            this.p = b(R.color.menstrual_other_line);
        }
        this.u = a(R.color.menstrual_other_text);
        this.n = a(R.color.menstrual_period);
        this.t = b(R.color.menstrual_period_target);
        this.l = b(R.color.menstrual_period_line);
        this.q = a(R.color.menstrual_period_text);
        this.z = a(R.color.menstrual_pregnancies);
        this.ah = b(R.color.menstrual_pregnancies_target);
        this.aa = b(R.color.menstrual_pregnancies_line);
        this.ag = a(R.color.menstrual_pregnancies_text);
        this.w = c(R.color.menstrual_pregnancies_text, f25457a);
        this.x = b(R.color.menstrual_pregnancies_text, e);
        this.v = b(R.color.menstrual_pregnancies_line);
        this.y = a(R.color.menstrual_ovulation_text);
        this.o = b(R.color.menstrual_forecasts_target);
        this.k = b(R.color.menstrual_forecasts_line);
        this.m = a(R.color.menstrual_forecasts_text);
        Paint paintA = a(R.color.colorCardBg);
        this.g = paintA;
        paintA.setStyle(Paint.Style.FILL_AND_STROKE);
        a();
        if (LanguageUtil.l(BaseApplication.b())) {
            return;
        }
        this.aj = UnitUtil.e(Calendar.getInstance().get(5), 1, 0);
    }

    private void a() {
        float f = f25458b;
        float f2 = 2.0f * f;
        this.ai = j + f2;
        this.ae = f2 + h;
        this.ad = 0.3f * f;
        this.af = f * 0.6f;
    }

    private Paint a(int i) {
        return c(i, this.af);
    }

    private Paint c(int i, float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(i, null));
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(f);
        paint.setStrokeWidth(this.ad);
        return paint;
    }

    private Paint b(int i) {
        return b(i, this.af);
    }

    private Paint b(int i, float f) {
        Paint paintA = a(i);
        paintA.setStyle(Paint.Style.FILL);
        paintA.setTextSize(f);
        paintA.setStrokeWidth(this.ad);
        return paintA;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int[] iArr;
        int i;
        int i2;
        super.onDraw(canvas);
        if (LanguageUtil.ba(this.i.getApplicationContext())) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight());
        }
        for (int i3 = 0; i3 < this.f.length; i3++) {
            for (int i4 = 0; i4 < this.f[0].length; i4++) {
                float fE = e(i3, i4);
                int[][] iArr2 = this.f;
                if (i4 != iArr2[0].length - 1 && (i = (iArr = iArr2[i3])[i4]) != -1 && (i2 = iArr[i4 + 1]) != -1) {
                    e(canvas, (i4 * this.ai) + fE, e + (i3 * this.ae), Math.min(i, i2));
                }
                e(canvas, fE + (i4 * this.ai), e + (i3 * this.ae), f25458b, this.f[i3][i4]);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (c(this.f[0][this.ab - 1]) || d(this.f[0][this.ab - 1])) {
            float f = this.ab - 1;
            float f2 = this.ai;
            float f3 = f25457a;
            float f4 = e;
            setMeasuredDimension((int) ((f * f2) + f3 + f4), (int) (f4 + ((this.ac - 1) * this.ae) + f3));
            return;
        }
        float f5 = this.ab - 1;
        float f6 = this.ai;
        float f7 = f25457a;
        setMeasuredDimension((int) ((f5 * f6) + (2.0f * f7)), (int) (d + ((this.ac - 1) * this.ae) + f7));
    }

    private void e(Canvas canvas, float f, float f2, float f3, int i) {
        switch (i) {
            case 0:
                canvas.drawCircle(f, f2, f3, this.r);
                break;
            case 1:
                canvas.drawCircle(f, f2, d, this.s);
                this.u.setTextSize(f25459c);
                a(canvas, this.aj, f, f2, this.u);
                break;
            case 2:
                canvas.drawCircle(f, f2, f3, this.n);
                break;
            case 3:
                canvas.drawCircle(f, f2, d, this.t);
                this.q.setTextSize(f25459c);
                a(canvas, this.aj, f, f2, this.q);
                break;
            case 4:
                canvas.drawCircle(f, f2, f3, this.z);
                break;
            case 5:
                canvas.drawCircle(f, f2, d, this.ah);
                this.ag.setTextSize(f25459c);
                a(canvas, this.aj, f, f2, this.ag);
                break;
            case 6:
                canvas.drawCircle(f, f2, f3, this.g);
                c(canvas, f, f2, f3, i);
                break;
            case 7:
                canvas.drawCircle(f, f2, 24.0f - this.g.getStrokeWidth(), this.g);
                c(canvas, f, f2, d, 6);
                this.m.setTextSize(f25459c);
                a(canvas, this.aj, f, f2, this.m);
                break;
            case 8:
                canvas.drawCircle(f, f2, f25457a / 2.0f, this.g);
                e(canvas, f, f2);
                break;
            case 9:
                b(canvas, f, f2);
                this.y.setTextSize(f25459c);
                a(canvas, this.aj, f, f2, this.y);
                break;
        }
    }

    private void e(Canvas canvas, float f, float f2) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) ContextCompat.getDrawable(this.i, R.drawable.physiological_cycle_ovulation_untarget);
        if (bitmapDrawable == null) {
            LogUtil.a("DotMatrixView", "drawOvulationIcon: ", "unTargetDrawable is null");
            return;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap == null) {
            LogUtil.a("DotMatrixView", "drawOvulationIcon: ", "bitmap is null");
            return;
        }
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new RectF(f - (bitmap.getWidth() / 2.0f), f2 - (bitmap.getHeight() / 2.0f), f + (bitmap.getWidth() / 2.0f), f2 + (bitmap.getHeight() / 2.0f)), this.w);
    }

    private void b(Canvas canvas, float f, float f2) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) ContextCompat.getDrawable(this.i, R.drawable.physiological_cycle_ovulation_target);
        if (bitmapDrawable == null) {
            LogUtil.a("DotMatrixView", "drawOvulationTargetIcon: ", "targetDrawable is null");
            return;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap == null) {
            LogUtil.a("DotMatrixView", "drawOvulationTargetIcon: ", "bitmap is null");
            return;
        }
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new RectF(f - (bitmap.getWidth() / 2.0f), f2 - (bitmap.getHeight() / 2.0f), f + (bitmap.getWidth() / 2.0f), f2 + (bitmap.getHeight() / 2.0f)), this.x);
    }

    private float e(int i, int i2) {
        if (i != 0 || i2 != 0) {
            if (this.f[i][i2] == 8) {
                return f25457a;
            }
            return f25458b;
        }
        int i3 = this.f[i][i2];
        if (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7) {
            return d;
        }
        if (i3 == 8) {
            return f25457a;
        }
        if (i3 == 9) {
            return e;
        }
        return f25458b;
    }

    private void e(Canvas canvas, float f, float f2, int i) {
        Path path = new Path();
        float f3 = f25458b;
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f * 2.0f;
        float f6 = this.ai;
        float f7 = f3 / 3.0f;
        path.quadTo((f5 + f6) / 2.0f, f7 + f2, f6 + f, f4);
        float f8 = f3 + f2;
        path.lineTo(this.ai + f, f8);
        path.quadTo((f5 + this.ai) / 2.0f, f2 - f7, f, f8);
        path.lineTo(f, f4);
        switch (i) {
            case 0:
            case 1:
                canvas.drawPath(path, this.p);
                break;
            case 2:
            case 3:
                canvas.drawPath(path, this.l);
                break;
            case 4:
            case 5:
                canvas.drawPath(path, this.aa);
                break;
            case 6:
                this.k.setTextSize(qrs.d(this.i, 8.0f));
                char[] cArr = new char[64];
                Arrays.fill(cArr, FilenameUtils.EXTENSION_SEPARATOR);
                canvas.drawTextOnPath(cArr, 0, 64, path, 0.0f, 0.0f, this.k);
                break;
            case 7:
                canvas.drawPath(path, this.o);
                break;
            case 8:
            case 9:
                canvas.drawPath(path, this.v);
                break;
        }
    }

    private void c(Canvas canvas, float f, float f2, float f3, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            canvas.save();
            Pair<Float, Float> pairD = d(f, f2, 0.05f * f3, ((double) i2) * (6.283185307179586d / ((double) 10)));
            canvas.translate(((Float) pairD.first).floatValue(), ((Float) pairD.second).floatValue());
            canvas.rotate((i2 * 360.0f) / 10);
            if (i == 7) {
                canvas.drawRoundRect(new RectF((-f3) * 0.15f, 1.2f * f3, 0.15f * f3, 0.7f * f3), f3, f3, this.o);
            } else {
                canvas.drawCircle(0.85f * f3, 0.0f, 0.15f * f3, this.m);
            }
            canvas.restore();
        }
    }

    private Pair<Float, Float> d(float f, float f2, float f3, double d2) {
        double d3 = f3;
        return new Pair<>(Float.valueOf((float) (((double) f) + (Math.cos(d2) * d3))), Float.valueOf((float) (((double) f2) + (d3 * Math.sin(d2)))));
    }

    private void a(Canvas canvas, String str, float f, float f2, Paint paint) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DotMatrixView", "toady is null,return");
            return;
        }
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = fontMetrics.descent;
        float f4 = f2 + (((f3 - fontMetrics.ascent) / 2.0f) - f3);
        float f5 = f - (fMeasureText / 2.0f);
        if (LanguageUtil.ba(this.i)) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, f, getHeight());
            canvas.drawText(str, f5, f4, paint);
            canvas.restore();
            return;
        }
        canvas.drawText(str, f5, f4, paint);
    }
}
