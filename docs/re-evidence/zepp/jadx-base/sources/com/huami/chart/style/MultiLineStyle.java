package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PathEffect;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.constant.MultiLineStyleConstant;
import com.huami.chart.template.ColorTemplate;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MultiLineStyle extends BaseStyle implements MultiLineStyleConstant {
    public static final int BEZIER = 4;
    public static final int CURVE = 2;
    private static final String E = "MultiLineStyle";
    public static final int INTERACTIVE_ALWAYS_SHOW_VERTICAL_LINE = 2;
    public static final int INTERACTIVE_NORMAL = 1;
    public static final int NONE = 1;
    public static final int STRAIGHT = 8;
    private float A;
    private float B;
    private int C;
    private int D;
    private int c;
    private int[] d;
    private Shader[] e;
    private float f;
    private int[][] g;
    private int[] h;
    private float i;
    private float j;
    private int k;
    private PathEffect l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int s;
    private float t;
    private int u;
    private boolean v;

    @ColorInt
    private int w;
    private boolean x;
    private boolean y;
    private HMGradientDrawableRectValue[] z;

    public static class Builder {
        private int a;
        private Shader[] c;
        private float d;
        private float l;
        private float m;
        private float s;
        private float y;
        private float z;
        private int B = 100;
        private int[] b = null;
        private int[][] e = null;
        private int[] f = null;
        private float g = 0.0f;
        private float h = 0.0f;
        private int i = -1;
        private boolean j = false;
        private float n = -1.0f;
        private float o = 0.0f;
        private float p = 0.0f;

        @ColorInt
        private int q = -16777216;
        private PathEffect k = null;
        private int t = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
        private int r = 1;
        private boolean u = true;
        private boolean v = false;
        private boolean w = false;
        private HMGradientDrawableRectValue[] x = null;
        private int A = -1;

        public Builder(Context context) {
            this.a = 1;
            this.d = ChartUtil.dp2px(context, 1.3f);
            this.a = 1;
            this.d = ChartUtil.dp2px(context, 1.3f);
            this.l = ChartUtil.dp2px(context, 1.0f);
            this.m = ChartUtil.dp2px(context, 1.0f);
            this.s = ChartUtil.dp2px(context, 1.0f);
        }

        public MultiLineStyle create() {
            return new MultiLineStyle(this);
        }

        public Builder setDataPointBorderColor(int i) {
            this.A = i;
            return this;
        }

        public Builder setDataPointBorderRadius(float f) {
            this.z = f;
            return this;
        }

        public Builder setDataPointRadius(float f) {
            this.y = f;
            return this;
        }

        public Builder setDisconnectLineGap(int i) {
            this.i = i;
            return this;
        }

        public Builder setFadingInAndOut(boolean z) {
            this.v = z;
            return this;
        }

        public Builder setGapDashPathEffect(PathEffect pathEffect) {
            this.k = pathEffect;
            return this;
        }

        public Builder setGapPointSize(float f) {
            this.l = f;
            return this;
        }

        public Builder setGradientDrawableRectValues(HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr) {
            this.x = hMGradientDrawableRectValueArr;
            return this;
        }

        public Builder setInteractiveLineColor(int i) {
            this.t = i;
            return this;
        }

        public Builder setInteractiveLineWidth(float f) {
            this.s = f;
            return this;
        }

        public Builder setInteractiveType(int i) {
            this.r = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.u = z;
            return this;
        }

        public Builder setIntersectionPointBorderWidth(float f) {
            this.h = f;
            return this;
        }

        public Builder setIntersectionPointColor(int[] iArr) {
            this.f = iArr;
            return this;
        }

        public Builder setIntersectionPointSize(float f) {
            this.g = f;
            return this;
        }

        public Builder setLineColors(int[] iArr) {
            this.b = iArr;
            return this;
        }

        public Builder setLineShadowLayer(float f, float f2, float f3, int i) {
            this.n = f;
            this.o = f2;
            this.p = f3;
            this.q = i;
            return this;
        }

        public Builder setLineStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setLineWidth(float f) {
            this.d = f;
            return this;
        }

        public Builder setLinesShader(Shader[] shaderArr) {
            this.c = shaderArr;
            return this;
        }

        public Builder setRenderPriority(int i) {
            this.B = i;
            return this;
        }

        public Builder setShadowColors(int[]... iArr) {
            this.e = iArr;
            return this;
        }

        public Builder setShadowShownBeforeIndex(boolean z) {
            this.w = z;
            return this;
        }

        public Builder setSinglePointSize(float f) {
            this.m = f;
            return this;
        }

        public Builder showGapPoint(boolean z) {
            this.j = z;
            return this;
        }
    }

    public MultiLineStyle(Builder builder) {
        this.c = builder.a;
        this.d = builder.b;
        this.e = builder.c;
        this.f = builder.d;
        this.g = builder.e;
        this.h = builder.f;
        this.i = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.n = builder.l;
        this.m = builder.j;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.w = builder.q;
        this.l = builder.k;
        this.t = builder.s;
        this.u = builder.t;
        this.s = builder.r;
        this.v = builder.u;
        this.x = builder.v;
        this.y = builder.w;
        this.z = builder.x;
        this.A = builder.y;
        this.B = builder.z;
        this.C = builder.A;
        this.D = builder.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(String[] strArr, int i) {
        return "color " + strArr[i].trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(String[] strArr, int i) {
        return "color " + strArr[i].trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(String[] strArr, int i) {
        return "color " + strArr[i].trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(Exception exc) {
        return "error: " + exc.getMessage();
    }

    public int getDataPointBorderColor() {
        return this.C;
    }

    public float getDataPointBorderRadius() {
        return this.B;
    }

    public float getDataPointRadius() {
        return this.A;
    }

    public int getDisconnectLineGap() {
        return this.k;
    }

    public PathEffect getGapDashPathEffect() {
        return this.l;
    }

    public float getGapPointSize() {
        return this.n;
    }

    public HMGradientDrawableRectValue[] getGradientDrawableRectValue() {
        return this.z;
    }

    public int getInteractiveLineColor() {
        return this.u;
    }

    public float getInteractiveLineWidth() {
        return this.t;
    }

    public int getInteractiveType() {
        return this.s;
    }

    public float getIntersectionPointBorderWidth() {
        return this.j;
    }

    public int[] getIntersectionPointColor() {
        return this.h;
    }

    public float getIntersectionPointSize() {
        return this.i;
    }

    public int[] getLineColors() {
        return this.d;
    }

    public int getLineShadowColor() {
        return this.w;
    }

    public float getLineShadowDx() {
        return this.q;
    }

    public float getLineShadowDy() {
        return this.r;
    }

    public float getLineShadowRadius() {
        return this.p;
    }

    public int getLineStyle() {
        return this.c;
    }

    public float getLineWidth() {
        return this.f;
    }

    public Shader[] getLinesShader() {
        return this.e;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 100;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getRenderPriority() {
        return this.D;
    }

    public int[][] getShadowColors() {
        return this.g;
    }

    public boolean getShadowShownBeforeIndex() {
        return this.y;
    }

    public float getSinglePointSize() {
        return this.o;
    }

    public boolean isFadingInAndOut() {
        return this.x;
    }

    public boolean isInteractiveUpCancel() {
        return this.v;
    }

    public boolean isShowGapPoint() {
        return this.m;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(MultiLineStyleConstant.LINE_COLORS)) {
            try {
                final String[] strArrSplit = jSONObject.optString(MultiLineStyleConstant.LINE_COLORS).trim().split(",");
                for (final int i = 0; i < strArrSplit.length; i++) {
                    HMLog.verbose(E, new Function0() { // from class: r95
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiLineStyle.g(strArrSplit, i);
                        }
                    });
                    this.d[i] = Color.parseColor(strArrSplit[i].trim());
                }
            } catch (Exception e) {
                HMLog.info(E, new Function0() { // from class: o95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiLineStyle.h(e);
                    }
                });
            }
        }
        if (jSONObject.has("line_width")) {
            this.f = ChartUtil.dp2px(context, (float) jSONObject.optDouble("line_width"));
        }
        if (jSONObject.has("shadow_colors")) {
            try {
                final String[] strArrSplit2 = jSONObject.optString("shadow_colors").trim().split(",");
                for (final int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    HMLog.verbose(E, new Function0() { // from class: s95
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiLineStyle.i(strArrSplit2, i2);
                        }
                    });
                    int i3 = 0;
                    while (true) {
                        int[][] iArr = this.g;
                        if (i3 < iArr[i2].length) {
                            iArr[i2][i3] = Color.parseColor(strArrSplit2[i2].trim());
                            i3++;
                        }
                    }
                }
            } catch (Exception e2) {
                HMLog.info(E, new Function0() { // from class: n95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiLineStyle.j(e2);
                    }
                });
            }
        }
        if (jSONObject.has("intersection_point_color")) {
            try {
                final String[] strArrSplit3 = jSONObject.optString("intersection_point_color").trim().split(",");
                for (final int i4 = 0; i4 < strArrSplit3.length; i4++) {
                    HMLog.verbose(E, new Function0() { // from class: q95
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiLineStyle.k(strArrSplit3, i4);
                        }
                    });
                    this.h[i4] = Color.parseColor(strArrSplit3[i4].trim());
                }
            } catch (Exception e3) {
                HMLog.info(E, new Function0() { // from class: p95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiLineStyle.l(e3);
                    }
                });
            }
        }
        if (jSONObject.has("intersection_point_size")) {
            this.i = ChartUtil.dp2px(context, (float) jSONObject.optDouble("intersection_point_size"));
        }
    }
}
