package com.huami.chart.style;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.huami.chart.data.HMShadow;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.style.constant.AxisStyleConstant;
import com.huami.chart.util.ChartUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AxisStyle extends BaseStyle implements AxisStyleConstant {
    public static final int INDICATOR_BACKGROUND = 8;
    public static final int INDICATOR_BITMAP = 4;
    public static final int INDICATOR_CIRCLE = 2;
    public static final int INDICATOR_NONE = 1;
    public static final int NONE = 1;
    public static final int RANGE_MIDONG = 8192;
    public static final int XAXIS = 2;
    public static final int XAXIS_ARROW_LFT = 1024;
    public static final int XAXIS_ARROW_RHT = 256;
    public static final int XAXIS_LABEL = 32;
    public static final int XAXIS_LABEL_BG = 4096;
    public static final int XAXIS_SCALE = 8;
    public static final int XAXIS_SUB_LABEL = 64;
    public static final int YAXIS = 4;
    public static final int YAXIS_ARROW_BTM = 2048;
    public static final int YAXIS_ARROW_TOP = 512;
    public static final int YAXIS_LABEL = 128;
    public static final int YAXIS_SCALE = 16;
    public static final int YAXIS_SCALE_LONG = 16384;
    public static final int YAXIS_SCALE_LONG_DASH = 32768;
    private static final String i0 = "AxisStyle";
    private int A;
    private float B;
    private int C;
    private float D;
    private float E;
    private float F;
    private Typeface G;
    private Typeface H;
    private Typeface I;
    private SparseArray<XAxisData> J;
    private SparseArray<YAxisData> K;
    private SparseArray<YAxisData> L;
    private int M;
    private boolean N;
    private float O;
    private float P;
    private int[] Q;
    private float R;
    private int S;
    private float[] T;
    private boolean U;
    private boolean V;
    private boolean W;
    private float X;
    private float Y;
    private int Z;
    private Bitmap a0;
    private int b0;
    private int c;
    private float c0;
    private float d;
    private float d0;
    private int e;
    private float e0;
    private float f;
    private int f0;
    private int g;
    private boolean g0;
    private float h;
    private HMShadow h0;
    private int i;
    private float j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private int y;
    private int z;

    public AxisStyle(Builder builder) {
        this.c = builder.a;
        this.d = builder.b;
        this.e = builder.c;
        this.f = builder.d;
        this.g = builder.e;
        this.h = builder.f;
        this.i = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.s = builder.q;
        this.t = builder.r;
        this.u = builder.s;
        this.v = builder.t;
        this.w = builder.u;
        this.x = builder.v;
        this.y = builder.w;
        this.z = builder.x;
        this.A = builder.y;
        this.B = builder.z;
        this.C = builder.A;
        this.D = builder.B;
        this.E = builder.C;
        this.F = builder.D;
        this.G = builder.E;
        this.H = builder.F;
        this.I = builder.G;
        this.J = builder.H;
        this.K = builder.I;
        this.L = builder.J;
        this.M = builder.K;
        this.N = builder.L;
        this.O = builder.M;
        this.P = builder.N;
        this.Q = builder.O;
        this.R = builder.P;
        this.S = builder.Q;
        this.T = builder.R;
        this.U = builder.S;
        this.W = builder.U;
        this.a0 = builder.X;
        this.b0 = builder.Y;
        this.X = builder.V;
        this.Z = builder.Z;
        this.Y = builder.W;
        this.c0 = builder.a0;
        this.e0 = builder.b0;
        this.d0 = builder.c0;
        this.f0 = builder.d0;
        this.g0 = builder.e0;
        this.V = builder.T;
        this.h0 = builder.f0;
    }

    public float getAbsoluteZeroX() {
        return this.v;
    }

    public int getAxisStyle() {
        return this.c;
    }

    public int getBottomIndicatorBackgroundColor() {
        return this.f0;
    }

    public float getBottomIndicatorBackgroundHeight() {
        return this.e0;
    }

    public float getBottomIndicatorBackgroundMarginTop() {
        return this.d0;
    }

    public Bitmap getBottomIndicatorBitmap() {
        return this.a0;
    }

    public float getBottomIndicatorCircleRadius() {
        return this.c0;
    }

    public HMShadow getBottomIndicatorShadow() {
        return this.h0;
    }

    public int getBottomIndicatorShape() {
        return this.Z;
    }

    public float getBottomIndicatorShapeMarginTop() {
        return this.Y;
    }

    public int getBottomIndicatorTintColor() {
        return this.b0;
    }

    public int[] getMidongColors() {
        return this.Q;
    }

    public float getMidongLeftHeight() {
        return this.P;
    }

    public float getMidongLeftWidth() {
        return this.O;
    }

    public float getMidongMarginLine() {
        return this.R;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 1;
    }

    public int getXLabelHighlightColor() {
        return this.z;
    }

    public float getXMovableLabelMarginTop() {
        return this.X;
    }

    public int getYAxisScaleLongDashColor() {
        return this.S;
    }

    public float[] getYAxisScaleLongDashIntervals() {
        return this.T;
    }

    public float getZeroX() {
        return this.t;
    }

    public float getZeroY() {
        return this.u;
    }

    public float getxAxisArrowLength() {
        return this.n;
    }

    public SparseArray<XAxisData> getxAxisDatas() {
        return this.J;
    }

    public int getxAxisLabelBgColor() {
        return this.M;
    }

    public int getxAxisLineColor() {
        return this.e;
    }

    public float getxAxisLineWidth() {
        return this.d;
    }

    public float getxAxisMarginLeft() {
        return this.r;
    }

    public float getxAxisMarginRight() {
        return this.s;
    }

    public int getxAxisScaleLineColor() {
        return this.i;
    }

    public float getxAxisScaleLineHeight() {
        return this.l;
    }

    public float getxAxisScaleLineWidth() {
        return this.h;
    }

    public int getxLabelColor() {
        return this.y;
    }

    public float getxLabelMarginTop() {
        return this.D;
    }

    public float getxLabelSize() {
        return this.w;
    }

    public Typeface getxLabelTypeface() {
        return this.G;
    }

    public int getxSubLabelColor() {
        return this.C;
    }

    public float getxSubLabelMarginTop() {
        return this.E;
    }

    public float getxSubLabelSize() {
        return this.B;
    }

    public Typeface getxSubLabelTypeface() {
        return this.I;
    }

    public float getyAxisArrowLength() {
        return this.o;
    }

    public SparseArray<YAxisData> getyAxisDatas() {
        return this.K;
    }

    public int getyAxisLineColor() {
        return this.g;
    }

    public float getyAxisLineWidth() {
        return this.f;
    }

    public float getyAxisMarginBottom() {
        return this.q;
    }

    public float getyAxisMarginTop() {
        return this.p;
    }

    public SparseArray<YAxisData> getyAxisScaleDatas() {
        return this.L;
    }

    public int getyAxisScaleLineColor() {
        return this.k;
    }

    public float getyAxisScaleLineHeight() {
        return this.m;
    }

    public float getyAxisScaleLineWidth() {
        return this.j;
    }

    public int getyLabelColor() {
        return this.A;
    }

    public float getyLabelMarginYAxis() {
        return this.F;
    }

    public float getyLabelSize() {
        return this.x;
    }

    public Typeface getyLabelTypeface() {
        return this.H;
    }

    public boolean isIndentHeadAndTail() {
        return this.V;
    }

    public boolean isInteractiveUpCancel() {
        return this.g0;
    }

    public boolean isLabelCenter() {
        return this.N;
    }

    public boolean isXLabelAnimate() {
        return this.W;
    }

    public boolean isyAxisRight() {
        return this.U;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_LINE_WIDTH)) {
            this.d = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_LINE_WIDTH));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_LINE_WIDTH)) {
            this.f = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_LINE_WIDTH));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_LINE_COLOR)) {
            this.e = Color.parseColor(jSONObject.optString(AxisStyleConstant.X_AXIS_LINE_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_LINE_COLOR)) {
            this.g = Color.parseColor(jSONObject.optString(AxisStyleConstant.Y_AXIS_LINE_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_SCALE_LINE_WIDTH)) {
            this.h = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_SCALE_LINE_WIDTH));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_SCALE_LINE_WIDTH)) {
            this.j = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_SCALE_LINE_WIDTH));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_SCALE_LINE_HEIGHT)) {
            this.l = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_SCALE_LINE_HEIGHT));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_SCALE_LINE_HEIGHT)) {
            this.m = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_SCALE_LINE_HEIGHT));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_SCALE_LINE_COLOR)) {
            this.i = Color.parseColor(jSONObject.optString(AxisStyleConstant.X_AXIS_SCALE_LINE_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_SCALE_LINE_COLOR)) {
            this.k = Color.parseColor(jSONObject.optString(AxisStyleConstant.Y_AXIS_SCALE_LINE_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_ARROW_LENGTH)) {
            this.n = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_ARROW_LENGTH));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_ARROW_LENGTH)) {
            this.o = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_ARROW_LENGTH));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_MARGIN_TOP)) {
            this.p = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_MARGIN_TOP));
        }
        if (jSONObject.has(AxisStyleConstant.Y_AXIS_MARGIN_BOTTOM)) {
            this.q = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_AXIS_MARGIN_BOTTOM));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_MARGIN_LEFT)) {
            this.r = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_MARGIN_LEFT));
        }
        if (jSONObject.has(AxisStyleConstant.X_AXIS_MARGIN_RIGHT)) {
            this.s = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_AXIS_MARGIN_RIGHT));
        }
        if (jSONObject.has(AxisStyleConstant.ZERO_X)) {
            this.t = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.ZERO_X));
        }
        if (jSONObject.has(AxisStyleConstant.ZERO_Y)) {
            this.u = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.ZERO_Y));
        }
        if (jSONObject.has(AxisStyleConstant.X_LABEL_SIZE)) {
            this.w = ChartUtil.sp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_LABEL_SIZE));
        }
        if (jSONObject.has(AxisStyleConstant.Y_LABEL_SIZE)) {
            this.x = ChartUtil.sp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_LABEL_SIZE));
        }
        if (jSONObject.has(AxisStyleConstant.X_SUB_LABEL_SIZE)) {
            this.B = ChartUtil.sp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_SUB_LABEL_SIZE));
        }
        if (jSONObject.has(AxisStyleConstant.X_LABEL_COLOR)) {
            this.y = Color.parseColor(jSONObject.optString(AxisStyleConstant.X_LABEL_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.Y_LABEL_COLOR)) {
            this.A = Color.parseColor(jSONObject.optString(AxisStyleConstant.Y_LABEL_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.X_SUB_LABEL_COLOR)) {
            this.C = Color.parseColor(jSONObject.optString(AxisStyleConstant.X_SUB_LABEL_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.X_LABEL_MARGIN_TOP)) {
            this.D = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_LABEL_MARGIN_TOP));
        }
        if (jSONObject.has(AxisStyleConstant.X_SUB_LABEL_MARGIN_TOP)) {
            this.E = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.X_SUB_LABEL_MARGIN_TOP));
        }
        if (jSONObject.has(AxisStyleConstant.Y_LABEL_MARGIN_Y_AXIS)) {
            this.F = ChartUtil.dp2px(context, (float) jSONObject.optDouble(AxisStyleConstant.Y_LABEL_MARGIN_Y_AXIS));
        }
        jSONObject.has(AxisStyleConstant.X_LABEL_TYPEFACE);
        jSONObject.has(AxisStyleConstant.Y_LABEL_TYPEFACE);
        jSONObject.has(AxisStyleConstant.X_SUB_LABEL_TYPEFACE);
        jSONObject.has(AxisStyleConstant.X_AXIS_DATAS);
        jSONObject.has(AxisStyleConstant.Y_AXIS_DATAS);
        if (jSONObject.has(AxisStyleConstant.X_AXIS_LABEL_BG_COLOR)) {
            this.M = Color.parseColor(jSONObject.optString(AxisStyleConstant.X_AXIS_LABEL_BG_COLOR));
        }
        if (jSONObject.has(AxisStyleConstant.IS_LABEL_CENTER)) {
            this.N = jSONObject.optBoolean(AxisStyleConstant.IS_LABEL_CENTER);
        }
    }

    public void setYAxisScaleLongDashColor(int i) {
        this.S = i;
    }

    public void setYAxisScaleLongDashIntervals(float[] fArr) {
        this.T = fArr;
    }

    public static class Builder {
        private float B;
        private float C;
        private float D;
        private float M;
        private float N;
        private float P;
        private float[] R;
        private float a0;
        private float b;
        private float b0;
        private float c0;
        private float d;
        private float f;
        private HMShadow f0;
        private Context g0;
        private float h;
        private float j;
        private float k;
        private float l;
        private float m;
        private float u;
        private float v;
        private float z;
        private int a = 1;
        private int c = -7829368;
        private int e = -7829368;
        private int g = -7829368;
        private int i = Color.parseColor("#1A000000");
        private float n = 0.0f;
        private float o = 0.0f;
        private float p = 0.0f;
        private float q = 0.0f;
        private float r = 0.0f;
        private float s = 0.0f;
        private float t = -1.0f;
        private int w = -7829368;
        private int x = -7829368;
        private int y = -7829368;
        private int A = -7829368;
        private Typeface E = null;
        private Typeface F = null;
        private Typeface G = null;
        private SparseArray<XAxisData> H = null;
        private SparseArray<YAxisData> I = null;
        private SparseArray<YAxisData> J = null;
        private int K = -7829368;
        private boolean L = true;
        private int[] O = {Color.parseColor("#FF5353"), Color.parseColor("#FFC100"), Color.parseColor("#00CDB6")};
        private int Q = Color.parseColor("#dedede");
        private boolean S = false;
        private boolean T = false;
        private boolean U = false;
        private Bitmap X = null;
        private int Y = -7829368;
        private float V = 0.0f;
        private float W = 0.0f;
        private int Z = 1;
        private int d0 = -7829368;
        private boolean e0 = false;

        public Builder(Context context) {
            this.g0 = context;
            this.b = ChartUtil.dp2px(context, 1.0f);
            this.d = ChartUtil.dp2px(context, 1.0f);
            this.f = ChartUtil.dp2px(context, 1.0f);
            this.h = ChartUtil.dp2px(context, 1.0f);
            this.j = ChartUtil.dp2px(context, 1.0f);
            this.k = ChartUtil.dp2px(context, 1.0f);
            this.l = ChartUtil.dp2px(context, 5.0f);
            this.m = ChartUtil.dp2px(context, 5.0f);
            this.u = ChartUtil.dp2px(context, 12.0f);
            this.v = ChartUtil.dp2px(context, 12.0f);
            this.z = ChartUtil.dp2px(context, 9.0f);
            this.B = ChartUtil.dp2px(context, 1.0f);
            this.C = ChartUtil.dp2px(context, 1.0f);
            this.D = ChartUtil.dp2px(context, 1.0f);
            this.M = ChartUtil.dp2px(context, 3.8f);
            this.N = ChartUtil.dp2px(context, 28.8f);
            this.P = ChartUtil.dp2px(context, 5.0f);
            this.R = new float[]{ChartUtil.dp2px(context, 5.0f), ChartUtil.dp2px(context, 5.0f)};
            this.a0 = ChartUtil.dp2px(context, 5.0f);
            this.b0 = ChartUtil.dp2px(context, 20.0f);
            this.c0 = ChartUtil.dp2px(context, 5.0f);
        }

        public AxisStyle create() {
            return new AxisStyle(this);
        }

        public Builder setAbsoluteZeroX(float f) {
            this.t = f;
            return this;
        }

        public Builder setAxisStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setBottomIndicatorBackgroundColor(int i) {
            this.d0 = i;
            return this;
        }

        public Builder setBottomIndicatorBackgroundHeight(float f) {
            this.b0 = f;
            return this;
        }

        public Builder setBottomIndicatorBackgroundMarginTop(float f) {
            this.c0 = f;
            return this;
        }

        public Builder setBottomIndicatorBitmap(Bitmap bitmap) {
            this.X = bitmap;
            return this;
        }

        public Builder setBottomIndicatorCircleRadius(float f) {
            this.a0 = f;
            return this;
        }

        public Builder setBottomIndicatorShadow() {
            return setBottomIndicatorShadow(new HMShadow(ChartUtil.dp2px(this.g0, 15.0f), 0.0f, ChartUtil.dp2px(this.g0, 1.0f), Color.parseColor("#1F000000")));
        }

        public Builder setBottomIndicatorShape(int i) {
            this.Z = i;
            return this;
        }

        public Builder setBottomIndicatorShapeMarginTop(float f) {
            this.W = f;
            return this;
        }

        public Builder setBottomIndicatorTintColor(int i) {
            this.Y = i;
            return this;
        }

        public Builder setIndentHeadAndTail(boolean z) {
            this.T = z;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.e0 = z;
            return this;
        }

        public Builder setLabelCenter(boolean z) {
            this.L = z;
            return this;
        }

        public Builder setXAxisArrowLength(float f) {
            this.l = f;
            return this;
        }

        public Builder setXAxisData(SparseArray<XAxisData> sparseArray) {
            this.H = sparseArray;
            return this;
        }

        public Builder setXAxisLabelBgColor(int i) {
            this.K = i;
            return this;
        }

        public Builder setXAxisLineColor(int i) {
            this.c = i;
            return this;
        }

        public Builder setXAxisLineWidth(float f) {
            this.b = f;
            return this;
        }

        public Builder setXAxisMarginLeft(float f) {
            this.p = f;
            return this;
        }

        public Builder setXAxisMarginRight(float f) {
            this.q = f;
            return this;
        }

        public Builder setXAxisScaleLineColor(int i) {
            this.g = i;
            return this;
        }

        public Builder setXAxisScaleLineHeight(float f) {
            this.j = f;
            return this;
        }

        public Builder setXAxisScaleLineWidth(float f) {
            this.f = f;
            return this;
        }

        public Builder setXLabelColor(int i) {
            this.w = i;
            return this;
        }

        public Builder setXLabelHighlightColor(int i) {
            this.x = i;
            return this;
        }

        public Builder setXLabelMarginTop(float f) {
            this.B = f;
            return this;
        }

        public Builder setXLabelSize(float f) {
            this.u = f;
            return this;
        }

        public Builder setXLabelSupportAnimation(boolean z) {
            this.U = z;
            return this;
        }

        public Builder setXLabelTypeface(Typeface typeface) {
            this.E = typeface;
            return this;
        }

        public Builder setXMovableLabelMarginTop(float f) {
            this.V = f;
            return this;
        }

        public Builder setXSubLabelColor(int i) {
            this.A = i;
            return this;
        }

        public Builder setXSubLabelMarginTop(float f) {
            this.C = f;
            return this;
        }

        public Builder setXSubLabelSize(float f) {
            this.z = f;
            return this;
        }

        public Builder setXSubLabelTypeface(Typeface typeface) {
            this.G = typeface;
            return this;
        }

        public Builder setYAxisArrowLength(float f) {
            this.m = f;
            return this;
        }

        public Builder setYAxisData(SparseArray<YAxisData> sparseArray) {
            this.I = sparseArray;
            return this;
        }

        public Builder setYAxisLineColor(int i) {
            this.e = i;
            return this;
        }

        public Builder setYAxisLineWidth(float f) {
            this.d = f;
            return this;
        }

        public Builder setYAxisMarginBottom(float f) {
            this.o = f;
            return this;
        }

        public Builder setYAxisMarginTop(float f) {
            this.n = f;
            return this;
        }

        public Builder setYAxisRight(boolean z) {
            this.S = z;
            return this;
        }

        public Builder setYAxisScaleDatas(SparseArray<YAxisData> sparseArray) {
            this.J = sparseArray;
            return this;
        }

        public Builder setYAxisScaleLineColor(int i) {
            this.i = i;
            return this;
        }

        public Builder setYAxisScaleLineHeight(float f) {
            this.k = f;
            return this;
        }

        public Builder setYAxisScaleLineWidth(float f) {
            this.h = f;
            return this;
        }

        public Builder setYAxisScaleLongDashColor(int i) {
            this.Q = i;
            return this;
        }

        public Builder setYAxisScaleLongDashIntervals(float[] fArr) {
            this.R = fArr;
            return this;
        }

        public Builder setYLabelColor(int i) {
            this.y = i;
            return this;
        }

        public Builder setYLabelMarginYAxis(float f) {
            this.D = f;
            return this;
        }

        public Builder setYLabelSize(float f) {
            this.v = f;
            return this;
        }

        public Builder setYLabelTypeface(Typeface typeface) {
            this.F = typeface;
            return this;
        }

        public Builder setZeroX(float f) {
            this.r = f;
            return this;
        }

        public Builder setZeroY(float f) {
            this.s = f;
            return this;
        }

        public Builder setBottomIndicatorShadow(HMShadow hMShadow) {
            this.f0 = hMShadow;
            return this;
        }
    }
}
