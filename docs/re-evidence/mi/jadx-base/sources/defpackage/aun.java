package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.entrys.model.SportItemModel;
import com.xiaomi.fitness.chart.entrys.model.SportRecordItemList;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class aun extends zfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vfe f3467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f3468b;
    public Paint c;
    public onq d;
    public Paint e;
    public Paint f;
    public List<SportRecordKey> g;
    public SportRecordKey h;
    public float i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3469a;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            f3469a = iArr;
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3469a[SportRecordKey.SwimStrokeFreq.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3469a[SportRecordKey.SwimSwolf.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3469a[SportRecordKey.FreeBreathAngle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3469a[SportRecordKey.FreePitchAngle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3469a[SportRecordKey.FrogBreathAngle.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3469a[SportRecordKey.FrogSkiDuration.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public aun(vfe vfeVar, onq onqVar) {
        super(vfeVar, onqVar);
        this.g = new ArrayList();
        this.h = null;
        this.i = 1.0f;
        this.f3467a = vfeVar;
        this.d = onqVar;
        initChartPaint();
    }

    private void initChartPaint() {
        Paint paint = new Paint();
        this.e = paint;
        paint.reset();
        this.e.setAntiAlias(true);
        Paint paint2 = this.e;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.e.setStrokeWidth(DisplayUtil.dip2px(0.8f));
        Paint paint3 = new Paint();
        this.f3468b = paint3;
        paint3.reset();
        this.f3468b.setAntiAlias(true);
        Paint paint4 = this.f3468b;
        Paint.Style style2 = Paint.Style.STROKE;
        paint4.setStyle(style2);
        Paint paint5 = this.f3468b;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        this.f3468b.setStrokeJoin(Paint.Join.ROUND);
        this.f3468b.setStrokeWidth(DisplayUtil.dip2px(1.3f));
        this.f3468b.setColor(this.f3467a.O0);
        Paint paint6 = new Paint();
        this.c = paint6;
        paint6.reset();
        this.c.setAntiAlias(true);
        this.c.setStyle(style);
        this.c.setStrokeCap(cap);
        this.c.setStrokeWidth(DisplayUtil.dip2px(0.8f));
        this.c.setColor(this.f3467a.O0);
        Paint paint7 = new Paint();
        this.f = paint7;
        paint7.reset();
        this.f.setAntiAlias(true);
        this.f.setStyle(style2);
        this.f.setStrokeCap(cap);
        this.f.setStrokeWidth(DisplayUtil.dip2px(0.8f));
        this.f.setColor(this.f3467a.O0);
    }

    public final boolean a(SportRecordKey sportRecordKey) {
        switch (a.f3469a[sportRecordKey.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public RectF b(Canvas canvas, String str, float f, RecyclerView recyclerView) {
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
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String[] strArrSplit2 = str2.split(gv5.CONNECT_VALUE_STR);
        boolean z = true;
        float fMeasureText = 0.0f;
        for (String str4 : strArrSplit2) {
            if (Objects.equals(str4, "")) {
                z = !z;
            } else if (z) {
                fMeasureText += this.mHighLightSmallPaint.measureText(str4);
                z = false;
            } else {
                fMeasureText += this.mHighLightBigPaint.measureText(str4);
                z = true;
            }
        }
        float fMax = Math.max(fMeasureText, this.mHighLightSmallPaint.measureText(str3)) + fDip2px + fDip2px;
        float f2 = fMax / 2.0f;
        float fDip2px4 = fDip2px2 - DisplayUtil.dip2px(59.0f);
        RectF rectF = new RectF();
        this.mBarChartPaint.setColor(x44.a(aji.x));
        float f3 = ((vfe) this.mBarChartAttrs).e;
        if (fAbs <= f2) {
            rectF.set(paddingLeft, fDip2px4, fMax + paddingLeft, fDip2px2);
        } else if (fAbs2 <= f2) {
            rectF.set(width - fMax, fDip2px4, width, fDip2px2);
        } else {
            rectF.set(f - f2, fDip2px4, f + f2, fDip2px2);
        }
        canvas.drawRoundRect(rectF, f3, f3, this.mBarChartPaint);
        float f4 = (rectF.bottom - fDip2px3) - 8.0f;
        float fI = (f4 - o8p.i(this.mHighLightBigPaint)) + 8.0f;
        boolean z2 = true;
        float fMeasureText2 = 0.0f;
        for (String str5 : strArrSplit2) {
            if (Objects.equals(str5, "")) {
                z2 = !z2;
            } else if (z2) {
                canvas.drawText(str5, rectF.left + fDip2px + fMeasureText2, f4, this.mHighLightSmallPaint);
                fMeasureText2 += this.mHighLightSmallPaint.measureText(str5);
                z2 = false;
            } else {
                canvas.drawText(str5, rectF.left + fDip2px + fMeasureText2, f4, this.mHighLightBigPaint);
                fMeasureText2 += this.mHighLightBigPaint.measureText(str5);
                z2 = true;
            }
        }
        canvas.drawText(str3, rectF.left + fDip2px, fI, this.mHighLightDescPaint);
        return rectF;
    }

    public <T extends RecyclerBarEntry> void c(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        if (((vfe) this.mBarChartAttrs).C) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                String barLabel = recyclerBarEntry.isSelected() ? this.d.getBarLabel(recyclerBarEntry) : "";
                Logger.d("SingleTapUpEntry.isSelected()" + recyclerBarEntry.isSelected(), new Object[0]);
                if (recyclerBarEntry.isSelected() && !barLabel.isEmpty()) {
                    float left = childAt.getLeft() + (childAt.getWidth() / 2.0f);
                    childAt.getBottom();
                    SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                    int iFindRangeIndex = sportRecordLandEntry.findRangeIndex(sportRecordLandEntry.getSelectX());
                    List<Pair<Float, Float>> item = sportRecordLandEntry.getItem();
                    List<SportItemModel> listValue = sportRecordLandEntry.getDataItem().getListValue();
                    if (iFindRangeIndex != -1) {
                        left = ((item.get(iFindRangeIndex).getSecond().floatValue() - item.get(iFindRangeIndex).getFirst().floatValue()) / 2.0f) + item.get(iFindRangeIndex).getFirst().floatValue();
                        if (listValue.get(iFindRangeIndex).getPointY() != 0.0f) {
                            listValue.get(iFindRangeIndex).getPointY();
                        }
                    }
                    eu3.f(childAt, recyclerView, rtrVar, this.mBarChartAttrs, recyclerBarEntry);
                    RectF rectFB = b(canvas, barLabel, left, recyclerView);
                    childAt.setContentDescription(barLabel);
                    canvas.drawLines(new float[]{left, rectFB.bottom, left, (childAt.getBottom() - recyclerView.getPaddingBottom()) - ((vfe) this.mBarChartAttrs).f625a}, this.mHighLightLinePaint);
                }
            }
        }
    }

    public <T extends RecyclerBarEntry> void d(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        List<SportRecordKey> list;
        int i2;
        float f;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        List<SportRecordKey> list2 = this.g;
        int i3 = 0;
        while (i3 < list2.size()) {
            Path path = new Path();
            path.reset();
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i4 = 0;
            boolean z = false;
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
                if (recyclerBarEntry instanceof SportRecordLandEntry) {
                    SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                    i = childCount;
                    Map<SportRecordKey, SportRecordItemList> otherLineDataList = sportRecordLandEntry.getOtherLineDataList();
                    list = list2;
                    SportRecordKey sportRecordKey = list2.get(i3);
                    this.h = sportRecordKey;
                    if (otherLineDataList.containsKey(sportRecordKey)) {
                        SportRecordItemList sportRecordItemList = otherLineDataList.get(this.h);
                        Objects.requireNonNull(sportRecordItemList);
                        List<SportItemModel> listValue = sportRecordItemList.getListValue();
                        f = f2;
                        SportRecordItemList sportRecordItemList2 = otherLineDataList.get(this.h);
                        Objects.requireNonNull(sportRecordItemList2);
                        this.f3468b.setColor(sportRecordItemList2.getSportLineColor());
                        sportRecordLandEntry.getItem().clear();
                        RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.f3467a, recyclerBarEntry);
                        float fWidth = rectFD.width() / listValue.size();
                        int i5 = 0;
                        while (i5 < listValue.size()) {
                            float fH = h(listValue, i5, rtrVar);
                            int i6 = i3;
                            float fK = eu3.k(fH, recyclerView, rtrVar, this.f3467a);
                            float f4 = AppUtil.isRTLDirection() ? rectFD.right - (i5 * fWidth) : rectFD.left + (i5 * fWidth);
                            if (f4 < paddingLeft || f4 > width) {
                                path.moveTo(f4, fK);
                            } else {
                                if (SportRecordChatUtil.INSTANCE.checkZeroNotValidByKey(this.h, g(listValue, i5))) {
                                    z = false;
                                } else if (!z) {
                                    path.moveTo(f4, fK);
                                    z = true;
                                } else if (!a(this.h) || f == fH) {
                                    path.lineTo(f4, fK);
                                } else {
                                    path.lineTo(f3, fK);
                                }
                                float f5 = 0.5f * fWidth;
                                sportRecordLandEntry.getItem().add(new Pair<>(Float.valueOf(f4 - f5), Float.valueOf(f5 + f4)));
                                listValue.get(i5).setPointX(f4);
                                listValue.get(i5).setPointY(fK);
                                f3 = f4;
                                f = fH;
                            }
                            i5++;
                            recyclerView = recyclerView;
                            rtrVar = rtrVar;
                            i3 = i6;
                            width = width;
                            paddingLeft = paddingLeft;
                        }
                        width = width;
                        paddingLeft = paddingLeft;
                        i2 = i3;
                    }
                    f2 = f;
                    i4++;
                    recyclerView = recyclerView;
                    rtrVar = rtrVar;
                    childCount = i;
                    list2 = list;
                    i3 = i2;
                    width = width;
                    paddingLeft = paddingLeft;
                } else {
                    i = childCount;
                    list = list2;
                }
                i2 = i3;
                f = f2;
                f2 = f;
                i4++;
                recyclerView = recyclerView;
                rtrVar = rtrVar;
                childCount = i;
                list2 = list;
                i3 = i2;
                width = width;
                paddingLeft = paddingLeft;
            }
            canvas.drawPath(path, this.f3468b);
            i3++;
        }
    }

    public <T extends RecyclerBarEntry> void e(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float f;
        float f2;
        float f3;
        LinearGradient linearGradient;
        SportRecordKey sportRecordKey;
        float f4;
        boolean z;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        Path path = new Path();
        path.reset();
        Path path2 = new Path();
        path2.reset();
        float bottom = recyclerView.getBottom() - recyclerView.getPaddingBottom();
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof SportRecordLandEntry) {
                SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                List<SportItemModel> listValue = sportRecordLandEntry.getDataItem().getListValue();
                SportRecordKey sportRecordKey2 = sportRecordLandEntry.getDataItem().getSportRecordKey();
                this.h = sportRecordKey2;
                if (!this.g.contains(sportRecordKey2)) {
                    return;
                }
                int sportLineColor = sportRecordLandEntry.getDataItem().getSportLineColor();
                int endFillColor = sportRecordLandEntry.getDataItem().getEndFillColor();
                this.f3468b.setColor(sportLineColor);
                this.c.setColor(sportLineColor);
                sportRecordLandEntry.getItem().clear();
                SportRecordKey sportRecordKey3 = sportRecordKey2;
                List<SportItemModel> list = listValue;
                float f7 = f5;
                RectF rectFE = eu3.e(childAt, recyclerView, rtrVar, this.f3467a, recyclerBarEntry, false);
                float f8 = rectFE.bottom;
                float fWidth = rectFE.width() / list.size();
                float top = recyclerView.getTop() + recyclerView.getPaddingTop();
                int[] iArr = {sportLineColor, endFillColor};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, top, 0.0f, f8, iArr, (float[]) null, tileMode);
                if (this.h == SportRecordKey.DivingDepth) {
                    rectFE.bottom = top;
                    linearGradient = new LinearGradient(0.0f, top, 0.0f, rectFE.top, new int[]{endFillColor, sportLineColor}, (float[]) null, tileMode);
                    f3 = top;
                } else {
                    f3 = f8;
                    linearGradient = linearGradient2;
                }
                this.e.setShader(linearGradient);
                f5 = f7;
                int i2 = 0;
                while (i2 < list.size()) {
                    List<SportItemModel> list2 = list;
                    float fH = h(list2, i2, rtrVar);
                    float fK = eu3.k(fH, recyclerView, rtrVar, this.f3467a);
                    float f9 = AppUtil.isRTLDirection() ? rectFE.right - (i2 * fWidth) : rectFE.left + (i2 * fWidth);
                    if (f9 < paddingLeft || f9 > width) {
                        sportRecordKey = sportRecordKey3;
                        f4 = paddingLeft;
                        path.moveTo(f9, fK);
                    } else {
                        SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
                        sportRecordKey = sportRecordKey3;
                        if (sportRecordChatUtil.checkZeroNotValidByKey(sportRecordKey, g(list2, i2))) {
                            f4 = paddingLeft;
                            z2 = false;
                        } else {
                            if (z2) {
                                if (!a(sportRecordKey) || f6 == fH) {
                                    path.lineTo(f9, fK);
                                    path2.lineTo(f9, fK);
                                } else {
                                    path.lineTo(f5, fK);
                                    path2.lineTo(f5, fK);
                                }
                                f4 = paddingLeft;
                            } else {
                                path.moveTo(f9, fK);
                                path2.lineTo(f5, rectFE.bottom);
                                if (sportRecordChatUtil.chartSportLineFillKey(sportRecordKey)) {
                                    f4 = paddingLeft;
                                    z = true;
                                    if (this.g.size() == 1 && f5 != 0.0f) {
                                        new xfe(this.e, path2).draw(canvas);
                                    }
                                } else {
                                    f4 = paddingLeft;
                                    z = true;
                                }
                                path2.reset();
                                path2.moveTo(f9, rectFE.bottom);
                                path2.lineTo(f9, fK);
                                z2 = z;
                            }
                            if (sportRecordChatUtil.chartSportPointKey(sportRecordKey)) {
                                canvas.drawCircle(f9, fK, DisplayUtil.dip2px(1.7f), this.c);
                            }
                            f5 = f9;
                            f6 = fH;
                        }
                        float f10 = 0.5f * fWidth;
                        sportRecordLandEntry.getItem().add(new Pair<>(Float.valueOf(f9 - f10), Float.valueOf(f10 + f9)));
                        list2.get(i2).setPointX(f9);
                        list2.get(i2).setPointY(fK);
                    }
                    i2++;
                    recyclerView = recyclerView;
                    rtrVar = rtrVar;
                    f3 = f3;
                    paddingLeft = f4;
                    list = list2;
                    sportRecordKey3 = sportRecordKey;
                    width = width;
                }
                f = width;
                f2 = paddingLeft;
                bottom = f3;
            } else {
                f = width;
                f2 = paddingLeft;
            }
            i++;
            childCount = childCount;
            width = f;
            paddingLeft = f2;
        }
        path2.lineTo(f5, bottom);
        SportRecordKey sportRecordKey4 = this.h;
        if (sportRecordKey4 != null && SportRecordChatUtil.INSTANCE.chartSportLineFillKey(sportRecordKey4) && this.g.size() == 1) {
            new xfe(this.e, path2).draw(canvas);
        }
        SportRecordKey sportRecordKey5 = this.h;
        if (sportRecordKey5 == null || !SportRecordChatUtil.INSTANCE.chartSportLineKey(sportRecordKey5, null, null)) {
            return;
        }
        canvas.drawPath(path, this.f3468b);
    }

    public <T extends RecyclerBarEntry> void f(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float f;
        float f2;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof SportRecordLandEntry) {
                SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) recyclerBarEntry;
                Map<SportRecordKey, SportRecordItemList> otherPointDataList = sportRecordLandEntry.getOtherPointDataList();
                List<SportRecordKey> list = this.g;
                int i2 = 0;
                while (i2 < list.size()) {
                    SportRecordKey sportRecordKey = list.get(i2);
                    this.h = sportRecordKey;
                    if (otherPointDataList.containsKey(sportRecordKey)) {
                        SportRecordItemList sportRecordItemList = otherPointDataList.get(this.h);
                        Objects.requireNonNull(sportRecordItemList);
                        List<SportItemModel> listValue = sportRecordItemList.getListValue();
                        SportRecordItemList sportRecordItemList2 = otherPointDataList.get(this.h);
                        Objects.requireNonNull(sportRecordItemList2);
                        this.c.setColor(sportRecordItemList2.getSportLineColor());
                        sportRecordLandEntry.getItem().clear();
                        RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.f3467a, recyclerBarEntry);
                        float fWidth = rectFD.width() / listValue.size();
                        float f3 = rectFD.left;
                        int i3 = 0;
                        while (i3 < listValue.size()) {
                            RecyclerBarEntry recyclerBarEntry2 = recyclerBarEntry;
                            float fK = eu3.k(h(listValue, i3, rtrVar), recyclerView, rtrVar, this.f3467a);
                            float f4 = i3;
                            float f5 = f3 + (f4 * fWidth);
                            if (f5 >= paddingLeft + fWidth && f5 <= width) {
                                if (!SportRecordChatUtil.INSTANCE.checkZeroNotValidByKey(this.h, g(listValue, i3))) {
                                    canvas.drawCircle(f5, fK, DisplayUtil.dip2px(1.7f), this.c);
                                }
                                sportRecordLandEntry.getItem().add(new Pair<>(Float.valueOf(((f4 - 0.5f) * fWidth) + f3), Float.valueOf(((f4 + 0.5f) * fWidth) + f3)));
                            }
                            i3++;
                            recyclerView = recyclerView;
                            rtrVar = rtrVar;
                            recyclerBarEntry = recyclerBarEntry2;
                            width = width;
                            paddingLeft = paddingLeft;
                        }
                        f = width;
                        f2 = paddingLeft;
                    } else {
                        f = width;
                        f2 = paddingLeft;
                    }
                    i2++;
                    recyclerView = recyclerView;
                    rtrVar = rtrVar;
                    childCount = childCount;
                    childAt = childAt;
                    recyclerBarEntry = recyclerBarEntry;
                    width = f;
                    paddingLeft = f2;
                }
            }
            i++;
            childCount = childCount;
            width = width;
            paddingLeft = paddingLeft;
        }
    }

    public final float g(List<SportItemModel> list, int i) {
        return list.get(i).getItemValue();
    }

    public final float h(List<SportItemModel> list, int i, rtr rtrVar) {
        return SportRecordChatUtil.INSTANCE.chartSportRevertChartKey(this.h) ? (rtrVar.mAxisMaximum - list.get(i).getItemChartValue()) + rtrVar.mAxisMinimum : list.get(i).getItemChartValue();
    }

    public void i(List<SportRecordKey> list) {
        this.g = list;
    }

    @Override // defpackage.zfe, com.xiaomi.fitness.chart.render.BaseChartRender
    public void setHighLightValueFormatter(onq onqVar) {
        this.d = onqVar;
    }
}
