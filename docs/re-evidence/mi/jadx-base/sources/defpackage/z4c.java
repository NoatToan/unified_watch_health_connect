package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.a52;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z4c<T extends RecyclerBarEntry, E extends a52> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Drawable> f40866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40867b = false;
    public E c;
    public Paint d;
    public Paint e;
    public Paint f;
    public onq g;
    public Paint h;
    public Paint i;
    public Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f40868k;
    public Paint l;
    public Paint m;

    public z4c(E e, onq onqVar) {
        this.c = e;
        this.g = onqVar;
        j();
        l();
        k();
    }

    public float a(String str) {
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        float fMeasureText = 0.0f;
        for (int i = 0; i < strArrSplit.length; i++) {
            fMeasureText += i % 2 == 0 ? this.h.measureText(strArrSplit[i]) : this.i.measureText(strArrSplit[i]);
        }
        return fMeasureText;
    }

    public RectF b(Canvas canvas, String str, float f, RecyclerView recyclerView, T t) {
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        float fDip2px = DisplayUtil.dip2px(16.0f);
        float fDip2px2 = paddingTop + DisplayUtil.dip2px(10.0f);
        DisplayUtil.dip2px(3.0f);
        DisplayUtil.dip2px(6.0f);
        float fDip2px3 = DisplayUtil.dip2px(8.0f);
        int length = strArrSplit.length;
        RectF rectF = new RectF();
        if (length != 3) {
            return rectF;
        }
        String str2 = strArrSplit[0];
        String[] strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        if (strArrSplit2.length != 6) {
            return rectF;
        }
        String str3 = strArrSplit2[0];
        String str4 = strArrSplit2[1];
        String str5 = strArrSplit[1];
        String str6 = strArrSplit[2];
        float fMax = Math.max((a(str3 + gv5.CONNECT_VALUE_STR + str4) * 2.0f) + DisplayUtil.dip2px(13.0f), this.i.measureText(str6)) + fDip2px + fDip2px;
        float f2 = fMax / 2.0f;
        float fDip2px4 = fDip2px2 - ((float) DisplayUtil.dip2px(84.0f));
        this.d.setColor(x44.a(aji.x));
        float f3 = this.c.e;
        if (fAbs <= f2) {
            rectF.set(paddingLeft, fDip2px4, fMax + paddingLeft, fDip2px2);
        } else if (fAbs2 <= f2) {
            rectF.set(width - fMax, fDip2px4, width, fDip2px2);
        } else {
            rectF.set(f - f2, fDip2px4, f + f2, fDip2px2);
        }
        canvas.drawRoundRect(rectF, f3, f3, this.d);
        float f4 = (rectF.bottom - fDip2px3) - 8.0f;
        f(canvas, str2, str5, rectF);
        canvas.drawText(str6, rectF.left + fDip2px, f4, this.j);
        return rectF;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Incorrect types in method signature: <E:Lsf2;>(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;TE;)V */
    public void c(Canvas canvas, RecyclerView recyclerView, sf2 sf2Var) {
        int i;
        int i2;
        Boolean bool;
        String str;
        float f;
        float[] fArr;
        int i3 = 3;
        if (this.c.C) {
            int childCount = recyclerView.getChildCount();
            Boolean bool2 = Boolean.FALSE;
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                String barLabel = this.g.getBarLabel(recyclerBarEntry);
                if (!recyclerBarEntry.isSelected() || (TextUtils.isEmpty(barLabel) && !(recyclerBarEntry instanceof BloodGlucoseEntry))) {
                    i = i3;
                    i2 = 1;
                } else {
                    float left = childAt.getLeft() + (childAt.getWidth() / 2.0f);
                    if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                        BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                        float selectX = bloodGlucoseEntry.getSelectX();
                        if (selectX != -1.0f) {
                            List<Pair<Float, Float>> item = bloodGlucoseEntry.getItem();
                            int iFindRangeIndex = bloodGlucoseEntry.findRangeIndex(selectX);
                            if (iFindRangeIndex == -1) {
                                return;
                            }
                            float fFloatValue = item.get(iFindRangeIndex).getFirst().floatValue() + ((item.get(iFindRangeIndex).getSecond().floatValue() - item.get(iFindRangeIndex).getFirst().floatValue()) / 2.0f);
                            String bloodGlucoseLabel = this.g.getBloodGlucoseLabel(bloodGlucoseEntry, iFindRangeIndex);
                            if (TextUtils.isEmpty(bloodGlucoseLabel)) {
                                return;
                            }
                            String[] strArrSplit = bloodGlucoseLabel.split(gv5.CONNECT_STR);
                            if (strArrSplit.length == i3) {
                                bool2 = Boolean.TRUE;
                            }
                            if (strArrSplit.length < 2) {
                                return;
                            }
                            BloodGlucoseLineChartData bloodGlucoseLineChartData = bloodGlucoseEntry.getValues().get(iFindRangeIndex);
                            recyclerBarEntry.drawableType = bloodGlucoseLineChartData.getDrawableType();
                            recyclerBarEntry.levelType = bloodGlucoseLineChartData.getLevelType();
                            recyclerBarEntry.levelValue = bloodGlucoseLineChartData.getLevelStingRes();
                            if (bloodGlucoseEntry.getHighLightType() == 2) {
                                FingerBSList fingerBSList = bloodGlucoseEntry.getFingerBSList().get(iFindRangeIndex);
                                recyclerBarEntry.levelType = fingerBSList.getLevelType();
                                recyclerBarEntry.levelValue = fingerBSList.getLevelStingRes();
                            }
                            bool = bool2;
                            f = fFloatValue;
                            str = bloodGlucoseLabel;
                        } else {
                            bool = bool2;
                            str = barLabel;
                            f = left;
                        }
                    } else {
                        bool = bool2;
                        str = barLabel;
                        f = left;
                    }
                    RectF rectFF = eu3.f(childAt, recyclerView, sf2Var, this.c, recyclerBarEntry);
                    new RectF();
                    RectF rectFB = bool.booleanValue() ? b(canvas, str, f, recyclerView, recyclerBarEntry) : d(canvas, str, f, recyclerView, recyclerBarEntry);
                    if ((this.c instanceof vfe) || (recyclerBarEntry instanceof SegmentBarEntry) || (recyclerBarEntry instanceof MaxMinEntry)) {
                        i2 = 1;
                        i = 3;
                        fArr = new float[]{f, rectFB.bottom, f, (childAt.getBottom() - recyclerView.getPaddingBottom()) - this.c.f625a};
                    } else {
                        fArr = new float[]{f, rectFF.top, f, rectFB.bottom};
                        i = 3;
                        i2 = 1;
                    }
                    canvas.drawLines(fArr, this.f40868k);
                    bool2 = bool;
                }
                i4 += i2;
                i3 = i;
            }
        }
    }

    public RectF d(Canvas canvas, String str, float f, RecyclerView recyclerView, T t) {
        String str2;
        String str3;
        int i;
        float paddingTop = recyclerView.getPaddingTop();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        float fAbs = Math.abs(f - paddingLeft);
        float fAbs2 = Math.abs(width - f);
        float fDip2px = DisplayUtil.dip2px(16.0f);
        float fDip2px2 = paddingTop - DisplayUtil.dip2px(10.0f);
        DisplayUtil.dip2px(3.0f);
        DisplayUtil.dip2px(6.0f);
        float fDip2px3 = DisplayUtil.dip2px(8.0f);
        int length = strArrSplit.length;
        RectF rectF = new RectF();
        if (length == 1) {
            return rectF;
        }
        boolean z = length == 3;
        String str4 = strArrSplit[0];
        String str5 = strArrSplit[1];
        if (z) {
            str3 = strArrSplit[2];
            str2 = str5;
        } else {
            str2 = null;
            str3 = str5;
        }
        float fA = a(str4);
        if (z) {
            fA = Math.max(fA, a(str2));
        }
        String str6 = str2;
        this.i.setTextSize(DisplayUtil.dip2px(12.0f));
        float fMeasureText = this.i.measureText(str3);
        float fMax = Math.max(fA, fMeasureText) + fDip2px + fDip2px;
        float f2 = fA;
        if (t.levelType > -1) {
            fMax = fMax + DisplayUtil.dip2px(3.0f) + this.l.measureText(t.levelValue);
        }
        float f3 = fMax / 2.0f;
        float fDip2px4 = DisplayUtil.dip2px(59.0f);
        if (z) {
            fDip2px4 = DisplayUtil.dip2px(90.0f);
        }
        float f4 = this.f40867b ? (paddingTop / 2.0f) + (fDip2px4 / 2.0f) : fDip2px2;
        float f5 = f4 - fDip2px4;
        this.d.setColor(x44.a(aji.x));
        float f6 = this.c.e;
        if (fAbs <= f3) {
            rectF.set(paddingLeft, f5, fMax + paddingLeft, f4);
        } else if (fAbs2 <= f3) {
            rectF.set(width - fMax, f5, width, f4);
        } else {
            rectF.set(f - f3, f5, f + f3, f4);
        }
        canvas.drawRoundRect(rectF, f6, f6, this.d);
        float f7 = (rectF.bottom - fDip2px3) - 8.0f;
        g(canvas, str4, str6, rectF);
        canvas.drawText(str3, rectF.left + fDip2px, f7, this.j);
        int i2 = t.levelType;
        if (i2 != -1) {
            e(canvas, i2, t.levelValue, rectF.left + fMeasureText + fDip2px, rectF.bottom - fDip2px3);
        }
        List<Drawable> list = this.f40866a;
        if (list != null && (i = t.drawableType) > 0 && i <= list.size()) {
            Drawable drawable = this.f40866a.get(t.drawableType - 1);
            int iDip2px = (int) (rectF.left + f2 + fDip2px + DisplayUtil.dip2px(6.0f));
            int minimumWidth = drawable.getMinimumWidth() + iDip2px;
            int iDip2px2 = (int) (f4 - DisplayUtil.dip2px(25.0f));
            drawable.setBounds(iDip2px, iDip2px2 - drawable.getMinimumHeight(), minimumWidth, iDip2px2);
            drawable.draw(canvas);
        }
        return rectF;
    }

    public final void e(Canvas canvas, int i, String str, float f, float f2) {
        this.m.setColor(0);
        this.l.setColor(i(i));
        float f3 = this.c.e / 3.0f;
        RectF rectF = new RectF();
        float fDip2px = DisplayUtil.dip2px(3.0f);
        rectF.set(f, f2 - DisplayUtil.dip2px(14.0f), this.l.measureText(str) + f + (2.0f * fDip2px), f2);
        canvas.drawRoundRect(rectF, f3, f3, this.m);
        canvas.drawText(str, rectF.left + fDip2px, f2 - DisplayUtil.dip2px(4.0f), this.l);
    }

    public final void f(Canvas canvas, String str, String str2, RectF rectF) {
        float f;
        float fI;
        int i;
        int i2;
        float fMeasureText;
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        int i3 = 0;
        String[] strArrSplit2 = new String[0];
        if (str2 != null && str2.length() > 0) {
            strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        }
        String[] strArr = strArrSplit2;
        boolean z = strArr.length > 0;
        float fDip2px = rectF.left + DisplayUtil.dip2px(16.0f);
        float f2 = 8.0f;
        float fDip2px2 = (((rectF.bottom - DisplayUtil.dip2px(8.0f)) - 8.0f) - o8p.i(this.j)) - 2.0f;
        float f3 = fDip2px2 + 8.0f;
        if (z) {
            fI = (fDip2px2 - o8p.i(this.j)) - 8.0f;
            f = 4.0f + fI;
        } else {
            f = f3;
            fI = fDip2px2;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (true) {
            i = 3;
            if (i3 >= strArrSplit.length) {
                break;
            }
            if (AppUtil.isRTLDirection()) {
                if (i3 == 3) {
                    fDip2px += DisplayUtil.dip2px(f2);
                    f5 = fDip2px;
                }
                int i4 = i3 % 3;
                if (i4 == 0) {
                    float fMeasureText2 = this.h.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText2;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText2, fI, this.h);
                } else if (i4 == 1) {
                    fMeasureText = this.i.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText + 6.0f;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText, f, this.i);
                    f4 = fMeasureText;
                } else {
                    float fMeasureText3 = this.i.measureText(strArrSplit[i3]);
                    float f6 = ((fDip2px + fMeasureText3) - f4) - fMeasureText3;
                    canvas.drawText(strArrSplit[i3], f6, (f + 6.0f) - o8p.i(this.i), this.i);
                    fDip2px = f6 + Math.max(fMeasureText3, f4);
                    f5 = f5;
                }
            } else {
                if (i3 == 3) {
                    fDip2px += DisplayUtil.dip2px(8.0f);
                    f5 = fDip2px;
                }
                int i5 = i3 % 3;
                if (i5 == 0) {
                    float fMeasureText4 = this.h.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText4;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText4, fI, this.h);
                } else if (i5 == 1) {
                    fMeasureText = this.i.measureText(strArrSplit[i3]);
                    fDip2px += fMeasureText + 6.0f;
                    canvas.drawText(strArrSplit[i3], fDip2px - fMeasureText, f, this.i);
                    f4 = fMeasureText;
                } else {
                    float fMeasureText5 = this.i.measureText(strArrSplit[i3]);
                    float f7 = ((fDip2px + fMeasureText5) - f4) - fMeasureText5;
                    canvas.drawText(strArrSplit[i3], f7, (f + 6.0f) - o8p.i(this.i), this.i);
                    fDip2px = f7 + Math.max(fMeasureText5, f4);
                }
            }
            i3++;
            fI = fI;
            f2 = 8.0f;
        }
        float fDip2px3 = rectF.left + DisplayUtil.dip2px(16.0f);
        int i6 = 0;
        int iH = 0;
        while (i6 < strArr.length) {
            if (AppUtil.isRTLDirection()) {
                if (i6 == i) {
                    fDip2px3 = f5;
                }
                int i7 = i6 % 3;
                if (i7 == 0) {
                    float fMeasureText6 = this.j.measureText(strArr[i6]);
                    fDip2px3 += fMeasureText6;
                    canvas.drawText(strArr[i6], fDip2px3 - fMeasureText6, fDip2px2, this.j);
                    i2 = i;
                } else if (i7 == 2) {
                    float fMeasureText7 = this.j.measureText(strArr[i6]);
                    float f8 = fDip2px3 + fMeasureText7 + 8.0f;
                    i2 = i;
                    e(canvas, iH, strArr[i6], f8 - fMeasureText7, f3);
                    fDip2px3 = f8;
                } else {
                    i2 = i;
                    iH = h(strArr[i6]);
                }
            } else {
                i2 = i;
                if (i6 == i2) {
                    fDip2px3 = f5;
                }
                int i8 = i6 % 3;
                if (i8 == 0) {
                    float fMeasureText8 = this.j.measureText(strArr[i6]);
                    fDip2px3 += fMeasureText8;
                    canvas.drawText(strArr[i6], fDip2px3 - fMeasureText8, fDip2px2, this.j);
                } else if (i8 == 2) {
                    float fMeasureText9 = this.j.measureText(strArr[i6]);
                    float f9 = fDip2px3 + fMeasureText9 + 8.0f;
                    e(canvas, iH, strArr[i6], f9 - fMeasureText9, f3);
                    fDip2px3 = f9;
                } else {
                    iH = h(strArr[i6]);
                }
                i6++;
                i = i2;
            }
            i6++;
            i = i2;
        }
    }

    public final void g(Canvas canvas, String str, String str2, RectF rectF) {
        String[] strArrSplit = str.split(gv5.CONNECT_VALUE_STR);
        String[] strArrSplit2 = new String[0];
        if (str2 != null && str2.length() > 0) {
            strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        }
        boolean z = strArrSplit2.length > 0;
        float fDip2px = rectF.left + DisplayUtil.dip2px(16.0f);
        float fDip2px2 = (((rectF.bottom - DisplayUtil.dip2px(8.0f)) - 8.0f) - o8p.i(this.j)) - 2.0f;
        float f = fDip2px2 + 8.0f;
        float fI = fDip2px2 - 10.0f;
        float f2 = f - 20.0f;
        if (z) {
            fI = fDip2px2 - o8p.i(this.h);
            f2 = fI + 8.0f;
        }
        if (strArrSplit.length == 3) {
            float fMeasureText = this.h.measureText(strArrSplit[0]);
            float f3 = fDip2px + fMeasureText + 6.0f;
            canvas.drawText(strArrSplit[0], f3 - fMeasureText, fI, this.h);
            float f4 = this.c.C0;
            if (f4 > 0.0f) {
                this.i.setTextSize(f4);
            } else {
                this.i.setTextSize(DisplayUtil.dip2px(12.0f));
            }
            float fMeasureText2 = this.i.measureText(strArrSplit[1]);
            float f5 = f3 + fMeasureText2 + 6.0f;
            canvas.drawText(strArrSplit[1], f5 - fMeasureText2, fI, this.i);
            float f6 = this.c.C0;
            if (f6 > 0.0f) {
                this.i.setTextSize(f6 + DisplayUtil.dip2px(2.0f));
            } else {
                this.i.setTextSize(DisplayUtil.dip2px(14.0f));
            }
            float fMeasureText3 = this.i.measureText(strArrSplit[2]);
            canvas.drawText(strArrSplit[2], (f5 + (fMeasureText3 + 6.0f)) - fMeasureText3, fI, this.i);
        } else {
            for (int i = 0; i < strArrSplit.length; i++) {
                if (AppUtil.isRTLDirection()) {
                    if (i % 2 == 0) {
                        float fMeasureText4 = this.i.measureText(strArrSplit[i]);
                        fDip2px += fMeasureText4 + 6.0f;
                        canvas.drawText(strArrSplit[i], fDip2px - fMeasureText4, fI, this.i);
                    } else {
                        float fMeasureText5 = this.h.measureText(strArrSplit[i]);
                        fDip2px += fMeasureText5;
                        canvas.drawText(strArrSplit[i], fDip2px - fMeasureText5, f2, this.h);
                    }
                } else if (i % 2 == 0) {
                    float fMeasureText6 = this.h.measureText(strArrSplit[i]);
                    fDip2px += fMeasureText6;
                    canvas.drawText(strArrSplit[i], fDip2px - fMeasureText6, f2, this.h);
                } else {
                    float fMeasureText7 = this.i.measureText(strArrSplit[i]);
                    fDip2px += fMeasureText7 + 6.0f;
                    canvas.drawText(strArrSplit[i], fDip2px - fMeasureText7, fI, this.i);
                }
            }
        }
        float fDip2px3 = rectF.left + DisplayUtil.dip2px(16.0f);
        for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
            if (AppUtil.isRTLDirection()) {
                if (i2 % 2 == 0) {
                    float fMeasureText8 = this.i.measureText(strArrSplit2[i2]);
                    fDip2px3 += fMeasureText8 + 6.0f;
                    canvas.drawText(strArrSplit2[i2], fDip2px3 - fMeasureText8, fDip2px2, this.i);
                } else {
                    float fMeasureText9 = this.h.measureText(strArrSplit2[i2]);
                    fDip2px3 += fMeasureText9;
                    canvas.drawText(strArrSplit2[i2], fDip2px3 - fMeasureText9, f, this.h);
                }
            } else if (i2 % 2 == 0) {
                float fMeasureText10 = this.h.measureText(strArrSplit2[i2]);
                fDip2px3 += fMeasureText10;
                canvas.drawText(strArrSplit2[i2], fDip2px3 - fMeasureText10, f, this.h);
            } else {
                float fMeasureText11 = this.i.measureText(strArrSplit2[i2]);
                fDip2px3 += fMeasureText11 + 6.0f;
                canvas.drawText(strArrSplit2[i2], fDip2px3 - fMeasureText11, fDip2px2, this.i);
            }
        }
    }

    public final int h(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b2 = 1;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b2 = 2;
                }
                break;
            case 53:
                if (str.equals(UserConfig.KEY_DEVICE_LITE_SORT_GROUP)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 5;
            default:
                return 0;
        }
    }

    public final int i(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return x44.a(aji.q);
                    }
                }
            }
            return x44.a(aji.p);
        }
        return x44.a(aji.o);
    }

    public void j() {
        Paint paint = new Paint();
        this.d = paint;
        paint.reset();
        this.d.setAntiAlias(true);
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.d.setStrokeWidth(8.0f);
        this.d.setColor(this.c.g0);
        Paint paint3 = new Paint();
        this.f = paint3;
        paint3.reset();
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setColor(this.c.g0);
        Paint paint4 = new Paint();
        this.m = paint4;
        paint4.reset();
        this.m.setAntiAlias(true);
        this.m.setStyle(style);
        this.m.setStrokeWidth(8.0f);
    }

    public void k() {
        Paint paint = new Paint();
        this.h = paint;
        paint.reset();
        this.h.setAntiAlias(true);
        this.h.setColor(x44.a(aji.e0));
        float f = this.c.B0;
        if (f > 0.0f) {
            this.h.setTextSize(f);
        } else {
            int iDip2px = DisplayUtil.dip2px(24.0f);
            LocalLanguageUtil localLanguageUtil = LocalLanguageUtil.INSTANCE;
            if (localLanguageUtil.languageGerman() || localLanguageUtil.languageGreek() || localLanguageUtil.languageGreek()) {
                iDip2px = DisplayUtil.dip2px(18.0f);
            }
            this.h.setTextSize(iDip2px);
        }
        this.h.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.reset();
        this.i.setAntiAlias(true);
        this.i.setColor(x44.a(aji.e0));
        float f2 = this.c.C0;
        if (f2 > 0.0f) {
            this.i.setTextSize(f2);
        } else {
            this.i.setTextSize(DisplayUtil.dip2px(12.0f));
        }
        this.i.setTextAlign(Paint.Align.LEFT);
        this.i.setTypeface(Typeface.create("mipro-regular", 1));
        Paint paint3 = new Paint();
        this.j = paint3;
        paint3.reset();
        this.j.setAntiAlias(true);
        this.j.setColor(x44.a(aji.i0));
        this.j.setTextSize(DisplayUtil.dip2px(12.0f));
        this.j.setTypeface(Typeface.create("mipro-regular", 0));
        Paint paint4 = new Paint();
        this.f40868k = paint4;
        paint4.reset();
        this.f40868k.setAntiAlias(true);
        this.f40868k.setStyle(Paint.Style.STROKE);
        this.f40868k.setStrokeWidth(3.0f);
        this.f40868k.setColor(this.c.z0);
        Paint paint5 = new Paint();
        this.l = paint5;
        paint5.reset();
        this.l.setAntiAlias(true);
        this.l.setTypeface(Typeface.create("mipro-regular", 0));
        this.l.setTextSize(DisplayUtil.dip2px(9.0f));
    }

    public void l() {
        Paint paint = new Paint();
        this.e = paint;
        paint.reset();
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setStrokeWidth(1.0f);
        this.e.setColor(this.c.k0);
        this.e.setTextSize(DisplayUtil.dip2px(12.0f));
    }
}
