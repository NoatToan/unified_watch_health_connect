package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.PathEffect;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import com.huami.chart.data.MultiColorLine;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.constant.LineStyleConstant;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class LineStyle extends BaseStyle implements LineStyleConstant {
    public static final int BEZIER = 4;
    public static final int CURVE = 2;
    public static final int INTERACTIVE_NORMAL = 16;
    public static final int INTERACTIVE_XLABEL_TARGET_LINE = 32;
    public static final int NONE = 1;
    public static final int STRAIGHT = 8;
    private static final String X = "LineStyle";
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private float F;
    private float G;
    private int H;
    private boolean I;
    private PathEffect J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;

    @ColorInt
    private int P;
    private MultiColorLine[] Q;
    private boolean R;
    private HMGradientDrawableRectValue S;
    private float T;
    private float U;
    private int V;
    private int W;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private int i;
    private int j;
    private float k;
    private int[] l;
    private int[] m;
    private boolean n;
    private Shader o;
    private Shader p;
    private float q;
    private float r;
    private float s;
    private float t;
    private PathEffect u;
    private ArrayList<RangeIndex> v;
    private ArrayList<int[]> w;
    private ArrayList<Integer> x;
    private float y;
    private int z;

    public static class Builder {
        private float H;
        private float I;
        private float R;
        private float S;
        private int a;
        private float e;
        private float f;
        private int g;
        private float i;
        private int U = 101;
        private int b = -16777216;
        private int c = -16777216;
        private int d = -1;
        private int h = SupportMenu.CATEGORY_MASK;
        private int[] j = null;
        private int[] k = null;
        private boolean l = false;
        private Shader m = null;
        private Shader n = null;
        private float o = 0.0f;
        private float p = 0.0f;
        private float q = 0.0f;
        private float r = 0.0f;
        private ArrayList<RangeIndex> s = new ArrayList<>();
        private ArrayList<int[]> t = new ArrayList<>();
        private PathEffect u = new CornerPathEffect(45.0f);
        private ArrayList<Integer> v = new ArrayList<>();
        private int z = 16;
        private boolean A = true;
        private boolean B = false;
        private float w = -1.0f;
        private int x = -16777216;
        private int y = -7829368;
        private int E = SupportMenu.CATEGORY_MASK;
        private float G = 0.0f;
        private float F = 0.0f;
        private int C = -1;
        private boolean J = false;
        private float K = -1.0f;
        private float L = 0.0f;
        private float M = 0.0f;

        @ColorInt
        private int N = -16777216;
        private MultiColorLine[] O = null;
        private PathEffect D = null;
        private boolean P = false;
        private HMGradientDrawableRectValue Q = null;
        private int T = -1;

        public Builder(Context context) {
            this.a = 1;
            this.e = ChartUtil.dp2px(context, 1.3f);
            this.a = 1;
            this.e = ChartUtil.dp2px(context, 1.3f);
            this.i = ChartUtil.dp2px(context, 1.0f);
            this.f = ChartUtil.dp2px(context, 3.0f);
            this.f = -7829368.0f;
            this.I = ChartUtil.dp2px(context, 1.0f);
            this.H = ChartUtil.dp2px(context, 1.0f);
        }

        public LineStyle create() {
            return new LineStyle(this);
        }

        public Builder setAboveDividerLineColor(int i) {
            this.x = i;
            return this;
        }

        public Builder setBelowDividerLineColor(int i) {
            this.y = i;
            return this;
        }

        public Builder setClipBtm(float f) {
            this.r = f;
            return this;
        }

        public Builder setClipEnd(float f) {
            this.p = f;
            return this;
        }

        public Builder setClipStart(float f) {
            this.o = f;
            return this;
        }

        public Builder setClipTop(float f) {
            this.q = f;
            return this;
        }

        public Builder setDataPointBorderColor(int i) {
            this.T = i;
            return this;
        }

        public Builder setDataPointBorderRadius(float f) {
            this.S = f;
            return this;
        }

        public Builder setDataPointRadius(float f) {
            this.R = f;
            return this;
        }

        public Builder setDisconnectLineGap(int i) {
            this.C = i;
            return this;
        }

        public Builder setDividerValue(float f) {
            this.w = f;
            return this;
        }

        public Builder setFadingInAndOut(boolean z) {
            this.P = z;
            return this;
        }

        public Builder setGapDashPathEffect(PathEffect pathEffect) {
            this.D = pathEffect;
            return this;
        }

        public Builder setGapPointSize(int i) {
            this.I = i;
            return this;
        }

        public Builder setGradientDrawableRectValue(HMGradientDrawableRectValue hMGradientDrawableRectValue) {
            this.Q = hMGradientDrawableRectValue;
            return this;
        }

        public Builder setHighlightLineColor(int i) {
            this.h = i;
            return this;
        }

        public Builder setHighlightLineWidth(float f) {
            this.i = f;
            return this;
        }

        public Builder setInteractiveSlide(boolean z) {
            this.B = z;
            return this;
        }

        public Builder setInteractiveType(int i) {
            this.z = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.A = z;
            return this;
        }

        public Builder setIntersectionPointBorderWidth(float f) {
            this.F = f;
            return this;
        }

        public Builder setIntersectionPointColor(int i) {
            this.E = i;
            return this;
        }

        public Builder setIntersectionPointSize(float f) {
            this.G = f;
            return this;
        }

        public Builder setLineColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setLineShader(Shader shader) {
            this.m = shader;
            return this;
        }

        public Builder setLineShadowLayer(float f, float f2, float f3, int i) {
            this.K = f;
            this.L = f2;
            this.M = f3;
            this.N = i;
            return this;
        }

        public Builder setLineStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setLineWidth(float f) {
            this.e = f;
            return this;
        }

        public Builder setMultiColorLines(MultiColorLine[] multiColorLineArr) {
            this.O = multiColorLineArr;
            return this;
        }

        public Builder setRenderPriority(int i) {
            this.U = i;
            return this;
        }

        public Builder setShadowBeforeIndex(boolean z) {
            this.l = z;
            return this;
        }

        public Builder setShadowColors(int[] iArr) {
            this.j = iArr;
            return this;
        }

        public Builder setSinglePointSize(float f) {
            this.H = f;
            return this;
        }

        public Builder setSubBezierLineColor(int i) {
            this.d = i;
            return this;
        }

        public Builder setSubIndex(ArrayList<RangeIndex> arrayList) {
            this.s = arrayList;
            return this;
        }

        public Builder setSubIndexShadowColors(ArrayList<int[]> arrayList) {
            this.t = arrayList;
            return this;
        }

        public Builder setSubLinePathEffect(PathEffect pathEffect) {
            this.u = pathEffect;
            return this;
        }

        public Builder setSubLineShader(Shader shader) {
            this.n = shader;
            return this;
        }

        public Builder setSubLinecolor(int i) {
            this.c = i;
            return this;
        }

        public Builder setSubPointColor(int i) {
            this.g = i;
            return this;
        }

        public Builder setSubPointRadius(float f) {
            this.f = f;
            return this;
        }

        public Builder setSubPoints(ArrayList<Integer> arrayList) {
            this.v = arrayList;
            return this;
        }

        public Builder setSubShadowColors(int[] iArr) {
            this.k = iArr;
            return this;
        }

        public Builder showGapPoint(boolean z) {
            this.J = z;
            return this;
        }
    }

    public LineStyle(Builder builder) {
        this.v = null;
        this.w = null;
        this.x = new ArrayList<>();
        this.y = -1.0f;
        this.E = -1;
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
        this.v = builder.s;
        this.w = builder.t;
        this.u = builder.u;
        this.x = builder.v;
        this.B = builder.z;
        this.C = builder.A;
        this.D = builder.B;
        this.y = builder.w;
        this.z = builder.x;
        this.A = builder.y;
        this.F = builder.G;
        this.E = builder.E;
        this.G = builder.F;
        this.H = builder.C;
        this.J = builder.D;
        this.K = builder.I;
        this.I = builder.J;
        this.L = builder.H;
        this.M = builder.K;
        this.N = builder.L;
        this.O = builder.M;
        this.P = builder.N;
        this.Q = builder.O;
        this.R = builder.P;
        this.T = builder.R;
        this.U = builder.S;
        this.V = builder.T;
        this.W = builder.U;
        this.S = builder.Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(JSONObject jSONObject) {
        return "new color " + jSONObject.optString("line_color");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(String[] strArr, int i) {
        return "color " + strArr[i].trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "error: " + exc.getMessage();
    }

    public int getAboveDividerLineColor() {
        return this.z;
    }

    public int getBelowDividerLineColor() {
        return this.A;
    }

    public float getClipBtm() {
        return this.t;
    }

    public float getClipEnd() {
        return this.r;
    }

    public float getClipStart() {
        return this.q;
    }

    public float getClipTop() {
        return this.s;
    }

    public int getDataPointBorderColor() {
        return this.V;
    }

    public float getDataPointBorderRadius() {
        return this.U;
    }

    public float getDataPointRadius() {
        return this.T;
    }

    public int getDisconnectLineGap() {
        return this.H;
    }

    public float getDividerValue() {
        return this.y;
    }

    public PathEffect getGapDashPathEffect() {
        return this.J;
    }

    public float getGapPointSize() {
        return this.K;
    }

    public HMGradientDrawableRectValue getGradientDrawableRectValue() {
        return this.S;
    }

    public int getHighlightLineColor() {
        return this.j;
    }

    public float getHighlightLineWidth() {
        return this.k;
    }

    public int getInteractiveType() {
        return this.B;
    }

    public float getIntersectionPointBorderWidth() {
        return this.G;
    }

    public int getIntersectionPointColor() {
        return this.E;
    }

    public float getIntersectionPointSize() {
        return this.F;
    }

    public int getLineColor() {
        return this.d;
    }

    public Shader getLineShader() {
        return this.o;
    }

    public int getLineShadowColor() {
        return this.P;
    }

    public float getLineShadowDx() {
        return this.N;
    }

    public float getLineShadowDy() {
        return this.O;
    }

    public float getLineShadowRadius() {
        return this.M;
    }

    public int getLineStyle() {
        return this.c;
    }

    public float getLineWidth() {
        return this.g;
    }

    public MultiColorLine[] getMultiColorLines() {
        return this.Q;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 101;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getRenderPriority() {
        return this.W;
    }

    public int[] getShadowColors() {
        return this.l;
    }

    public boolean getShadowShownBeforeIndex() {
        return this.n;
    }

    public float getSinglePointSize() {
        return this.L;
    }

    public int getSubBezierLineColor() {
        return this.f;
    }

    public ArrayList<RangeIndex> getSubIndex() {
        return this.v;
    }

    public ArrayList<int[]> getSubIndexShadowColors() {
        return this.w;
    }

    public int getSubLineColor() {
        return this.e;
    }

    public PathEffect getSubLinePathEffect() {
        return this.u;
    }

    public Shader getSubLineShader() {
        return this.p;
    }

    public int getSubPointColor() {
        return this.i;
    }

    public float getSubPointRadius() {
        return this.h;
    }

    public ArrayList<Integer> getSubPoints() {
        return this.x;
    }

    public int[] getSubShadowColors() {
        return this.m;
    }

    public boolean isFadingInAndOut() {
        return this.R;
    }

    public boolean isInteractiveSlide() {
        return this.D;
    }

    public boolean isInteractiveUpCancel() {
        return this.C;
    }

    public boolean isShowGapPoint() {
        return this.I;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, final JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has("line_color")) {
            HMLog.verbose(X, new Function0() { // from class: no4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineStyle.d(jSONObject);
                }
            });
            this.d = Color.parseColor(jSONObject.optString("line_color"));
        }
        if (jSONObject.has("line_width")) {
            this.g = ChartUtil.dp2px(context, (float) jSONObject.optDouble("line_width"));
        }
        if (jSONObject.has("high_light_line_color")) {
            this.j = Color.parseColor(jSONObject.optString("high_light_line_color"));
        }
        if (jSONObject.has("high_light_line_width")) {
            this.k = ChartUtil.dp2px(context, (float) jSONObject.optDouble("high_light_line_width"));
        }
        if (jSONObject.has("shadow_colors")) {
            try {
                final String[] strArrSplit = jSONObject.optString("shadow_colors").trim().split(",");
                for (final int i = 0; i < strArrSplit.length; i++) {
                    HMLog.verbose(X, new Function0() { // from class: oo4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LineStyle.e(strArrSplit, i);
                        }
                    });
                    this.l[i] = Color.parseColor(strArrSplit[i].trim());
                }
            } catch (Exception e) {
                HMLog.info(X, new Function0() { // from class: mo4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LineStyle.f(e);
                    }
                });
            }
        }
        if (jSONObject.has("interactive_type")) {
            this.B = jSONObject.optInt("interactive_type");
        }
        if (jSONObject.has("interactive_up_cancel")) {
            this.C = jSONObject.optBoolean("interactive_up_cancel");
        }
        if (jSONObject.has("is_interactive_slide")) {
            this.D = jSONObject.optBoolean("is_interactive_slide");
        }
        if (jSONObject.has(LineStyleConstant.SHADOW_SHOWN_BEFORE_INDEX)) {
            this.n = jSONObject.optBoolean(LineStyleConstant.SHADOW_SHOWN_BEFORE_INDEX);
        }
        jSONObject.has(LineStyleConstant.SHADER);
        if (jSONObject.has(LineStyleConstant.CLIP_START)) {
            this.q = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineStyleConstant.CLIP_START));
        }
        if (jSONObject.has(LineStyleConstant.CLIP_END)) {
            this.r = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineStyleConstant.CLIP_END));
        }
        if (jSONObject.has(LineStyleConstant.CLIP_TOP)) {
            this.s = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineStyleConstant.CLIP_TOP));
        }
        if (jSONObject.has(LineStyleConstant.CLIP_BTM)) {
            this.t = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineStyleConstant.CLIP_BTM));
        }
    }
}
