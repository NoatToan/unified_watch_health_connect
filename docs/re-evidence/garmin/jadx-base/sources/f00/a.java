package f00;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf00/a;", "Lf00/c;", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f67645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<IDataSet<?>, C1406a> f67646i;

    /* JADX INFO: renamed from: f00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/a$a;", "", "<init>", "(Lf00/a;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C1406a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f67647a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap[] f67648b;

        public C1406a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
        this.f67645h = new float[2];
        this.f67646i = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c A[LOOP:1: B:68:0x017c->B:86:0x01d0, LOOP_START, PHI: r2
      0x017c: PHI (r2v7 int) = (r2v6 int), (r2v8 int) binds: [B:67:0x017a, B:86:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0 A[LOOP:1: B:68:0x017c->B:86:0x01d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3 A[EDGE_INSN: B:92:0x01d3->B:87:0x01d3 BREAK  A[LOOP:1: B:68:0x017c->B:86:0x01d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3 A[EDGE_INSN: B:93:0x01d3->B:87:0x01d3 BREAK  A[LOOP:1: B:68:0x017c->B:86:0x01d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3 A[EDGE_INSN: B:94:0x01d3->B:87:0x01d3 BREAK  A[LOOP:1: B:68:0x017c->B:86:0x01d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0171 A[EDGE_INSN: B:95:0x0171->B:66:0x0171 BREAK  A[LOOP:2: B:52:0x0111->B:63:0x0160], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // f00.c, com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawCircles(Canvas canvas) {
        int i14;
        int i15;
        int i16;
        float circleRadius;
        int i17;
        HashMap<IDataSet<?>, C1406a> map;
        C1406a c1406a;
        Bitmap[] bitmapArr;
        float f14;
        int i18;
        int i19;
        ?? entryForIndex;
        Bitmap[] bitmapArr2;
        Bitmap bitmap;
        Path path;
        a aVar;
        int circleColorCount;
        float circleRadius2;
        int i24;
        float circleHoleRadius;
        int i25;
        Bitmap bitmapCreateBitmap;
        Canvas canvas2;
        Bitmap[] bitmapArr3;
        Drawable drawable;
        Bitmap bitmapA;
        Bitmap[] bitmapArr4;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.f67645h;
        int i26 = 0;
        float f15 = 0.0f;
        fArr[0] = 0.0f;
        int i27 = 1;
        fArr[1] = 0.0f;
        List dataSets = this.mChart.getLineData().getDataSets();
        int size = dataSets.size();
        int i28 = 0;
        while (i28 < size) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i28);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                boolean z14 = iLineDataSet instanceof xz.c;
                if (z14) {
                    Drawable drawable2 = ((xz.c) iLineDataSet).f192732a;
                    circleRadius = (drawable2 != null ? drawable2.getIntrinsicWidth() : i26) / 2;
                } else {
                    circleRadius = iLineDataSet.getCircleRadius();
                }
                float circleHoleRadius2 = iLineDataSet.getCircleHoleRadius();
                int i29 = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius2 >= circleRadius || circleHoleRadius2 <= f15) ? i26 : i27;
                if (i29 != 0) {
                    i14 = i26;
                    if (iLineDataSet.getCircleHoleColor() == 1122867) {
                        i17 = i27;
                    }
                    map = this.f67646i;
                    if (map.containsKey(iLineDataSet)) {
                        c1406a = map.get(iLineDataSet);
                    } else {
                        C1406a c1406a2 = new C1406a();
                        map.put(iLineDataSet, c1406a2);
                        c1406a = c1406a2;
                    }
                    c1406a.getClass();
                    bitmapArr = c1406a.f67648b;
                    if (bitmapArr == null) {
                        c1406a.f67648b = new Bitmap[i27];
                    } else {
                        if (bitmapArr.length != i27) {
                            c1406a.f67648b = new Bitmap[i27];
                        } else {
                            i15 = i27;
                        }
                        i16 = size;
                        f14 = circleRadius;
                        BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                        int i30 = xBounds.range;
                        i18 = xBounds.min;
                        i19 = i30 + i18;
                        if (i18 <= i19) {
                            while (true) {
                                entryForIndex = iLineDataSet.getEntryForIndex(i18);
                                if (entryForIndex == 0) {
                                    fArr[i14] = entryForIndex.getX();
                                    fArr[i15] = entryForIndex.getY() * phaseY;
                                    transformer.pointValuesToPixel(fArr);
                                    if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsLeft(fArr[i14]) && this.mViewPortHandler.isInBoundsY(fArr[i15])) {
                                        bitmapArr2 = c1406a.f67648b;
                                        if (bitmapArr2 != null) {
                                            bitmap = bitmapArr2[i18 % bitmapArr2.length];
                                        } else {
                                            bitmap = null;
                                        }
                                        if (bitmap != null && canvas != null) {
                                            canvas.drawBitmap(bitmap, fArr[i14] - f14, fArr[i15] - f14, (Paint) null);
                                        }
                                    }
                                    if (i18 != i19) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    path = c1406a.f67647a;
                    i15 = i27;
                    aVar = a.this;
                    if (z14) {
                        circleColorCount = iLineDataSet.getCircleColorCount();
                        phaseY = phaseY;
                        circleRadius2 = iLineDataSet.getCircleRadius();
                        i24 = i17;
                        circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                        i25 = i14;
                        while (true) {
                            i16 = size;
                            if (i25 < circleColorCount) {
                                break;
                            }
                            int i34 = circleColorCount;
                            float f16 = circleRadius;
                            int i35 = (int) (((double) circleRadius2) * 2.1d);
                            bitmapCreateBitmap = Bitmap.createBitmap(i35, i35, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.getClass();
                            canvas2 = new Canvas(bitmapCreateBitmap);
                            bitmapArr3 = c1406a.f67648b;
                            if (bitmapArr3 != null) {
                                bitmapArr3[i25] = bitmapCreateBitmap;
                            }
                            aVar.mRenderPaint.setColor(iLineDataSet.getCircleColor(i25));
                            if (i24 != 0) {
                                path.reset();
                                path.addCircle(circleRadius2, circleRadius2, circleRadius2, Path.Direction.CW);
                                path.addCircle(circleRadius2, circleRadius2, circleHoleRadius, Path.Direction.CCW);
                                canvas2.drawPath(path, aVar.mRenderPaint);
                            } else {
                                canvas2.drawCircle(circleRadius2, circleRadius2, circleRadius2, aVar.mRenderPaint);
                                if (i29 != 0) {
                                    canvas2.drawCircle(circleRadius2, circleRadius2, circleHoleRadius, aVar.mCirclePaintInner);
                                }
                            }
                            i25++;
                            size = i16;
                            circleRadius = f16;
                            circleColorCount = i34;
                        }
                    } else {
                        drawable = ((xz.c) iLineDataSet).f192732a;
                        if (drawable != null) {
                            bitmapA = d7.b.a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            bitmapArr4 = c1406a.f67648b;
                            if (bitmapArr4 != null) {
                                bitmapArr4[i14] = bitmapA;
                            }
                        }
                        i16 = size;
                    }
                    f14 = circleRadius;
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                    int i36 = xBounds2.range;
                    i18 = xBounds2.min;
                    i19 = i36 + i18;
                    if (i18 <= i19) {
                        while (true) {
                            entryForIndex = iLineDataSet.getEntryForIndex(i18);
                            if (entryForIndex == 0) {
                                fArr[i14] = entryForIndex.getX();
                                fArr[i15] = entryForIndex.getY() * phaseY;
                                transformer.pointValuesToPixel(fArr);
                                if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                    if (this.mViewPortHandler.isInBoundsLeft(fArr[i14])) {
                                        bitmapArr2 = c1406a.f67648b;
                                        if (bitmapArr2 != null) {
                                            bitmap = bitmapArr2[i18 % bitmapArr2.length];
                                        } else {
                                            bitmap = null;
                                        }
                                        if (bitmap != null) {
                                            canvas.drawBitmap(bitmap, fArr[i14] - f14, fArr[i15] - f14, (Paint) null);
                                        }
                                    }
                                    if (i18 != i19) {
                                        break;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                    break;
                                }
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                } else {
                    i14 = i26;
                }
                i17 = i14;
                map = this.f67646i;
                if (map.containsKey(iLineDataSet)) {
                    c1406a = map.get(iLineDataSet);
                } else {
                    C1406a c1406a3 = new C1406a();
                    map.put(iLineDataSet, c1406a3);
                    c1406a = c1406a3;
                }
                c1406a.getClass();
                bitmapArr = c1406a.f67648b;
                if (bitmapArr == null) {
                    c1406a.f67648b = new Bitmap[i27];
                } else {
                    if (bitmapArr.length != i27) {
                        c1406a.f67648b = new Bitmap[i27];
                    } else {
                        i15 = i27;
                    }
                    i16 = size;
                    f14 = circleRadius;
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds3 = this.mXBounds;
                    int i37 = xBounds3.range;
                    i18 = xBounds3.min;
                    i19 = i37 + i18;
                    if (i18 <= i19) {
                        while (true) {
                            entryForIndex = iLineDataSet.getEntryForIndex(i18);
                            if (entryForIndex == 0) {
                                fArr[i14] = entryForIndex.getX();
                                fArr[i15] = entryForIndex.getY() * phaseY;
                                transformer.pointValuesToPixel(fArr);
                                if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                    if (this.mViewPortHandler.isInBoundsLeft(fArr[i14])) {
                                        bitmapArr2 = c1406a.f67648b;
                                        if (bitmapArr2 != null) {
                                            bitmap = bitmapArr2[i18 % bitmapArr2.length];
                                        } else {
                                            bitmap = null;
                                        }
                                        if (bitmap != null) {
                                            canvas.drawBitmap(bitmap, fArr[i14] - f14, fArr[i15] - f14, (Paint) null);
                                        }
                                    }
                                    if (i18 != i19) {
                                        break;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                    break;
                                }
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                }
                path = c1406a.f67647a;
                i15 = i27;
                aVar = a.this;
                if (z14) {
                    circleColorCount = iLineDataSet.getCircleColorCount();
                    phaseY = phaseY;
                    circleRadius2 = iLineDataSet.getCircleRadius();
                    i24 = i17;
                    circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                    i25 = i14;
                    while (true) {
                        i16 = size;
                        if (i25 < circleColorCount) {
                            break;
                            break;
                        }
                        int i38 = circleColorCount;
                        float f17 = circleRadius;
                        int i39 = (int) (((double) circleRadius2) * 2.1d);
                        bitmapCreateBitmap = Bitmap.createBitmap(i39, i39, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        canvas2 = new Canvas(bitmapCreateBitmap);
                        bitmapArr3 = c1406a.f67648b;
                        if (bitmapArr3 != null) {
                            bitmapArr3[i25] = bitmapCreateBitmap;
                        }
                        aVar.mRenderPaint.setColor(iLineDataSet.getCircleColor(i25));
                        if (i24 != 0) {
                            path.reset();
                            path.addCircle(circleRadius2, circleRadius2, circleRadius2, Path.Direction.CW);
                            path.addCircle(circleRadius2, circleRadius2, circleHoleRadius, Path.Direction.CCW);
                            canvas2.drawPath(path, aVar.mRenderPaint);
                        } else {
                            canvas2.drawCircle(circleRadius2, circleRadius2, circleRadius2, aVar.mRenderPaint);
                            if (i29 != 0) {
                                canvas2.drawCircle(circleRadius2, circleRadius2, circleHoleRadius, aVar.mCirclePaintInner);
                            }
                        }
                        i25++;
                        size = i16;
                        circleRadius = f17;
                        circleColorCount = i38;
                    }
                } else {
                    drawable = ((xz.c) iLineDataSet).f192732a;
                    if (drawable != null) {
                        bitmapA = d7.b.a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        bitmapArr4 = c1406a.f67648b;
                        if (bitmapArr4 != null) {
                            bitmapArr4[i14] = bitmapA;
                        }
                    }
                    i16 = size;
                }
                f14 = circleRadius;
                BarLineScatterCandleBubbleRenderer.XBounds xBounds4 = this.mXBounds;
                int i310 = xBounds4.range;
                i18 = xBounds4.min;
                i19 = i310 + i18;
                if (i18 <= i19) {
                    while (true) {
                        entryForIndex = iLineDataSet.getEntryForIndex(i18);
                        if (entryForIndex == 0) {
                            fArr[i14] = entryForIndex.getX();
                            fArr[i15] = entryForIndex.getY() * phaseY;
                            transformer.pointValuesToPixel(fArr);
                            if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                if (this.mViewPortHandler.isInBoundsLeft(fArr[i14])) {
                                    bitmapArr2 = c1406a.f67648b;
                                    if (bitmapArr2 != null) {
                                        bitmap = bitmapArr2[i18 % bitmapArr2.length];
                                    } else {
                                        bitmap = null;
                                    }
                                    if (bitmap != null) {
                                        canvas.drawBitmap(bitmap, fArr[i14] - f14, fArr[i15] - f14, (Paint) null);
                                    }
                                }
                                if (i18 != i19) {
                                    break;
                                    break;
                                }
                                i18++;
                            } else {
                                break;
                                break;
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            } else {
                phaseY = phaseY;
                i14 = i26;
                i15 = i27;
                dataSets = dataSets;
                i16 = size;
            }
            i28++;
            i26 = i14;
            i27 = i15;
            phaseY = phaseY;
            dataSets = dataSets;
            size = i16;
            f15 = 0.0f;
        }
    }
}
