package mz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.renderer.LegendRenderer;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmz/c;", "Lcom/github/mikephil/chartingv2/renderer/LegendRenderer;", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/chartingv2/components/Legend;", "legend", "Landroid/content/Context;", "mContext", "<init>", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/Legend;Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends LegendRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f121613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f121614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121615c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f121617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f121618c;

        static {
            int[] iArr = new int[gz.d.b.values().length];
            try {
                iArr[gz.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gz.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gz.d.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f121616a = iArr;
            int[] iArr2 = new int[gz.d.EnumC1607d.values().length];
            try {
                iArr2[gz.d.EnumC1607d.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gz.d.EnumC1607d.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gz.d.EnumC1607d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f121617b = iArr2;
            int[] iArr3 = new int[gz.d.c.values().length];
            try {
                iArr3[gz.d.c.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[gz.d.c.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f121618c = iArr3;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewPortHandler viewPortHandler, Legend legend, Context context) {
        super(viewPortHandler, legend);
        context.getClass();
        this.f121613a = context;
        this.f121614b = new String[0];
        this.f121615c = -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.github.mikephil.chartingv2.renderer.LegendRenderer
    public final void drawForm(Canvas canvas, float f14, float f15, int i14, Legend legend) {
        canvas.getClass();
        legend.getClass();
        int i15 = legend.getColors()[i14];
        if (i15 == 1122868) {
            return;
        }
        float formSize = legend.getFormSize();
        float f16 = formSize / 2.0f;
        String str = this.f121614b[i14];
        if (str != null) {
            this.mLegendFormPaint.reset();
            this.mLegendFormPaint.setAntiAlias(true);
            this.mLegendFormPaint.setColor(i15);
            int i16 = this.f121615c;
            if (i16 != -1) {
                this.mLegendFormPaint.setAlpha(i16);
            }
            switch (str.hashCode()) {
                case -1360216880:
                    if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                        this.mLegendFormPaint.setStyle(Paint.Style.FILL);
                        canvas.drawCircle(f14 + f16, f15, f16, this.mLegendFormPaint);
                        break;
                    }
                    break;
                case -1281915958:
                    if (str.equals("circle_unfilled")) {
                        this.mLegendFormPaint.setStyle(Paint.Style.STROKE);
                        this.mLegendFormPaint.setStrokeWidth(4.0f);
                        canvas.drawCircle(f14 + f16, f15, f16 - (4.0f / 2), this.mLegendFormPaint);
                        break;
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        this.mLegendFormPaint.setStyle(Paint.Style.FILL);
                        this.mLegendFormPaint.setStrokeWidth(formSize / 6);
                        canvas.drawLine(f14, f15, f14 + formSize, f15, this.mLegendFormPaint);
                        break;
                    }
                    break;
                case 373895106:
                    if (str.equals("dashed_line")) {
                        this.mLegendFormPaint.setStyle(Paint.Style.FILL);
                        this.mLegendFormPaint.setTextSize(legend.getTextSize());
                        this.mLegendFormPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                        String string = this.f121613a.getString(R.string.lbl_dashes);
                        string.getClass();
                        Rect rect = new Rect();
                        this.mLegendFormPaint.getTextBounds(string, 0, string.length(), rect);
                        canvas.drawText(string, f14, (formSize / 4) + f15 + ((rect.bottom - rect.top) / 2), this.mLegendFormPaint);
                        break;
                    }
                    break;
                case 565870238:
                    if (str.equals("line_with_circle")) {
                        this.mLegendFormPaint.setStyle(Paint.Style.FILL);
                        float f17 = 2;
                        this.mLegendFormPaint.setStrokeWidth(f16 / f17);
                        canvas.drawCircle(f14 + f16, f15, f16 - (f16 / 4), this.mLegendFormPaint);
                        canvas.drawLine((legend.getFormToTextSpace() / f17) + (f14 - formSize), f15, ((formSize * f17) + f14) - (legend.getFormToTextSpace() / f17), f15, this.mLegendFormPaint);
                        break;
                    }
                    break;
                case 1042732783:
                    if (str.equals("dashed_two_line_interval")) {
                        this.mLegendFormPaint.setStyle(Paint.Style.FILL);
                        this.mLegendFormPaint.setStrokeWidth(formSize / 6);
                        float f18 = formSize / 3;
                        this.mLegendFormPaint.setPathEffect(new DashPathEffect(new float[]{f18, f18}, 0.0f));
                        canvas.drawLine(f14, f15, f14 + formSize, f15, this.mLegendFormPaint);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.LegendRenderer
    public final void renderLegend(Canvas canvas) {
        float chartWidth;
        float f14;
        Canvas canvas2;
        int i14;
        Boolean[] boolArr;
        int i15;
        float f15;
        float fContentTop;
        String str;
        float f16;
        float f17;
        Canvas canvas3;
        float fCalcTextWidth;
        canvas.getClass();
        if (this.mLegend.isEnabled()) {
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = Utils.getLineHeight(this.mLegendLabelPaint);
            float yEntrySpace = this.mLegend.getYEntrySpace() + Utils.getLineSpacing(this.mLegendLabelPaint);
            float fCalcTextHeight = lineHeight - (Utils.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            String[] labels = this.mLegend.getLabels();
            int[] colors = this.mLegend.getColors();
            float formToTextSpace = this.mLegend.getFormToTextSpace();
            float xEntrySpace = this.mLegend.getXEntrySpace();
            Legend legend = this.mLegend;
            legend.getClass();
            gz.d.c cVar = ((gz.d) legend).f80380c;
            Legend legend2 = this.mLegend;
            legend2.getClass();
            gz.d.b bVar = ((gz.d) legend2).f80378a;
            Legend legend3 = this.mLegend;
            legend3.getClass();
            gz.d.EnumC1607d enumC1607d = ((gz.d) legend3).f80379b;
            Legend.LegendDirection direction = this.mLegend.getDirection();
            float formSize = this.mLegend.getFormSize();
            Legend legend4 = this.mLegend;
            legend4.getClass();
            boolean[] zArr = ((gz.d) legend4).f80382e;
            float stackSpace = this.mLegend.getStackSpace();
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            int i16 = b.f121616a[bVar.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    gz.d.c cVar2 = gz.d.c.VERTICAL;
                    ViewPortHandler viewPortHandler = this.mViewPortHandler;
                    chartWidth = (cVar == cVar2 ? viewPortHandler.getChartWidth() : viewPortHandler.contentRight()) - xOffset;
                    if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        chartWidth -= this.mLegend.mNeededWidth;
                    }
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return;
                    }
                    float chartWidth2 = this.mViewPortHandler.getChartWidth() / 2.0f;
                    Legend.LegendDirection legendDirection = Legend.LegendDirection.LEFT_TO_RIGHT;
                    float f18 = chartWidth2 + (direction == legendDirection ? xOffset : -xOffset);
                    if (cVar == gz.d.c.VERTICAL) {
                        Legend legend5 = this.mLegend;
                        chartWidth = f18 + ((float) (direction == legendDirection ? (((double) (-legend5.mNeededWidth)) / 2.0d) + ((double) xOffset) : (((double) legend5.mNeededWidth) / 2.0d) - ((double) xOffset)));
                    } else {
                        xOffset = f18;
                    }
                }
                xOffset = chartWidth;
            } else {
                if (cVar != gz.d.c.VERTICAL) {
                    xOffset += this.mViewPortHandler.contentLeft();
                }
                if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                    chartWidth = this.mLegend.mNeededWidth + xOffset;
                    xOffset = chartWidth;
                }
            }
            int i17 = b.f121618c[cVar.ordinal()];
            String str2 = "";
            if (i17 == 1) {
                FSize[] calculatedLineSizes = this.mLegend.getF80361h();
                FSize[] calculatedLabelSizes = this.mLegend.getF80359f();
                Boolean[] calculatedLabelBreakPoints = this.mLegend.getF80360g();
                int i18 = b.f121617b[enumC1607d.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        yOffset = (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return;
                        }
                        yOffset = q6.f.c(this.mViewPortHandler.getChartHeight(), this.mLegend.mNeededHeight, 2.0f, yOffset);
                    }
                }
                int length = labels.length;
                float f19 = xOffset;
                int i19 = 0;
                int i24 = 0;
                while (i24 < length) {
                    int i25 = length;
                    if (i24 >= calculatedLabelBreakPoints.length || !calculatedLabelBreakPoints[i24].booleanValue()) {
                        f14 = yOffset;
                    } else {
                        f14 = lineHeight + yEntrySpace + yOffset;
                        f19 = xOffset;
                    }
                    if (f19 == xOffset && bVar == gz.d.b.CENTER && i19 < calculatedLineSizes.length) {
                        f19 = ((direction == Legend.LegendDirection.RIGHT_TO_LEFT ? calculatedLineSizes[i19].width : -calculatedLineSizes[i19].width) / 2.0f) + f19;
                        i19++;
                    }
                    float f22 = f19;
                    int i26 = i19;
                    boolean z14 = colors[i24] != 1122868 && (zArr == null || zArr[i24]);
                    boolean z15 = labels[i24] == null;
                    if (z14) {
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f22 -= formSize;
                        }
                        Legend legend6 = this.mLegend;
                        legend6.getClass();
                        i14 = i25;
                        boolArr = calculatedLabelBreakPoints;
                        float f24 = f22;
                        drawForm(canvas, f24, f14 + fCalcTextHeight, i24, legend6);
                        canvas2 = canvas;
                        f22 = direction == Legend.LegendDirection.LEFT_TO_RIGHT ? f24 + formSize : f24;
                    } else {
                        canvas2 = canvas;
                        i14 = i25;
                        boolArr = calculatedLabelBreakPoints;
                    }
                    if (z15) {
                        i15 = i24;
                        f15 = f22 + (direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -stackSpace : stackSpace);
                    } else {
                        if (z14) {
                            f22 += direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -formToTextSpace : formToTextSpace;
                        }
                        Legend.LegendDirection legendDirection2 = Legend.LegendDirection.RIGHT_TO_LEFT;
                        if (direction == legendDirection2) {
                            f22 -= calculatedLabelSizes[i24].width;
                        }
                        int textColor = (zArr == null || zArr[i24]) ? this.mLegend.getTextColor() : 0;
                        i15 = i24;
                        float f25 = f14 + lineHeight;
                        String str3 = labels[i15];
                        this.mLegendLabelPaint.setColor(textColor);
                        canvas2.drawText(str3 == null ? "" : str3, f22, f25, this.mLegendLabelPaint);
                        if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                            f22 += calculatedLabelSizes[i15].width;
                        }
                        f15 = f22 + (direction == legendDirection2 ? -xEntrySpace : xEntrySpace);
                    }
                    i24 = i15 + 1;
                    i19 = i26;
                    calculatedLabelBreakPoints = boolArr;
                    yOffset = f14;
                    calculatedLineSizes = calculatedLineSizes;
                    f19 = f15;
                    length = i14;
                }
                return;
            }
            if (i17 != 2) {
                u0.r();
                return;
            }
            int i27 = b.f121617b[enumC1607d.ordinal()];
            if (i27 == 1) {
                fContentTop = (bVar == gz.d.b.CENTER ? 0.0f : this.mViewPortHandler.contentTop()) + yOffset;
            } else if (i27 == 2) {
                gz.d.b bVar2 = gz.d.b.CENTER;
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                fContentTop = (bVar == bVar2 ? viewPortHandler2.getChartHeight() : viewPortHandler2.contentBottom()) - (this.mLegend.mNeededHeight + yOffset);
            } else if (i27 != 3) {
                u0.r();
                return;
            } else {
                float chartHeight = this.mViewPortHandler.getChartHeight() / 2.0f;
                Legend legend7 = this.mLegend;
                fContentTop = legend7.getYOffset() + (chartHeight - (legend7.mNeededHeight / 2.0f));
            }
            float f26 = fContentTop;
            float f27 = stackSpace;
            int i28 = 0;
            boolean z16 = false;
            float f28 = 0.0f;
            while (i28 < labels.length) {
                boolean z17 = colors[i28] != 1122868 && (zArr == null || zArr[i28]);
                if (z17) {
                    Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                    float f29 = direction == legendDirection3 ? xOffset + f28 : xOffset - (formSize - f28);
                    Legend legend8 = this.mLegend;
                    legend8.getClass();
                    f16 = yEntrySpace;
                    str = str2;
                    f17 = f27;
                    canvas3 = canvas;
                    drawForm(canvas3, f29, f26 + fCalcTextHeight, i28, legend8);
                    fCalcTextWidth = direction == legendDirection3 ? f29 + formSize : f29;
                } else {
                    str = str2;
                    f16 = yEntrySpace;
                    f17 = f27;
                    canvas3 = canvas;
                    fCalcTextWidth = xOffset;
                }
                String str4 = labels[i28];
                if (str4 != null) {
                    if (z17 && !z16) {
                        fCalcTextWidth += direction == Legend.LegendDirection.LEFT_TO_RIGHT ? formToTextSpace : -formToTextSpace;
                    } else if (z16) {
                        fCalcTextWidth = xOffset;
                    }
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        fCalcTextWidth -= Utils.calcTextWidth(this.mLegendLabelPaint, str4);
                    }
                    int textColor2 = (zArr == null || zArr[i28]) ? this.mLegend.getTextColor() : 0;
                    if (z16) {
                        f26 += lineHeight + f16;
                        float f34 = f26 + lineHeight;
                        String str5 = labels[i28];
                        this.mLegendLabelPaint.setColor(textColor2);
                        if (str5 == null) {
                            str5 = str;
                        }
                        canvas3.drawText(str5, fCalcTextWidth, f34, this.mLegendLabelPaint);
                    } else {
                        float f35 = f26 + lineHeight;
                        String str6 = labels[i28];
                        this.mLegendLabelPaint.setColor(textColor2);
                        if (str6 == null) {
                            str6 = str;
                        }
                        canvas3.drawText(str6, fCalcTextWidth, f35, this.mLegendLabelPaint);
                    }
                    f26 = lineHeight + f16 + f26;
                    f28 = 0.0f;
                } else {
                    f28 = formSize + f17 + f28;
                    z16 = true;
                }
                i28++;
                f27 = f17;
                yEntrySpace = f16;
                str2 = str;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lmz/c$a;", "", "<init>", "()V", "", "LINE_WITH_CIRCLE", "Ljava/lang/String;", "DASHED_LINE", "DASHED_TWO_LINE", "CIRCLE", "CIRCLE_UNFILLED", "LINE", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
