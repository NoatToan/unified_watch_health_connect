package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.constant.BarStyleConstant;
import com.huami.chart.template.ColorTemplate;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Utils;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BarStyle extends BaseStyle implements BarStyleConstant {
    public static final int COLOR_SEGMENT_BAR = 8;
    public static final float DEFAULT_RADIAN_VALUE = 90.0f;
    public static final int INTERACTIVE_ALWAYS_SHOW_VERTICAL_LINE = 4;
    public static final int INTERACTIVE_NORMAL = 1;
    public static final int INTERACTIVE_XLABEL_TARGET_LINE = 2;
    public static final int NONE = 1;
    public static final int NORMAL = 2;
    public static final int SEGMENT_BAR = 4;
    private static final String y = "BarStyle";
    private boolean c;
    private int d;
    private HMColor[] e;
    private boolean f;
    private float[] g;
    private int h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private HMColor p;
    private ChartGradientColor q;
    private ChartGradientColor[] r;
    private float s;
    private float t;
    private int u;
    private float v;
    private int w;
    private int x;

    public static class Builder {
        private boolean c;
        private float f;
        private boolean m;
        private int u;
        private HMColor n = null;
        private ChartGradientColor o = null;
        private int s = -1;
        private float t = 0.0f;
        private int v = 102;
        private int a = 1;
        private HMColor[] b = null;
        private boolean d = false;
        private float[] e = null;
        private int g = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
        private int h = 1;
        private boolean i = true;
        private boolean j = false;
        private boolean k = false;
        private int l = -1;
        private ChartGradientColor[] p = null;
        private float q = 0.0f;
        private float r = -1.0f;

        public Builder(Context context) {
            this.f = ChartUtil.dp2px(context, 1.0f);
            this.u = Utils.getChartBackgroundColor(context);
        }

        public BarStyle create() {
            return new BarStyle(this);
        }

        public Builder setBarColors(HMColor[] hMColorArr) {
            this.b = hMColorArr;
            return this;
        }

        public Builder setBarGradientColors(ChartGradientColor[] chartGradientColorArr) {
            this.p = chartGradientColorArr;
            return this;
        }

        public Builder setBarStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setChartBackgroundColor(int i) {
            this.u = i;
            return this;
        }

        public Builder setClipRange(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setDownSameCancel(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setFingerUpHighlightCancel(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setHighlightBorderColor(int i) {
            this.s = i;
            return this;
        }

        public Builder setHighlightBorderStrokeWidth(float f) {
            this.t = f;
            return this;
        }

        public Builder setHighlightContrast(int i) {
            this.l = i;
            return this;
        }

        public Builder setInteractiveLineColor(int i) {
            this.g = i;
            return this;
        }

        public Builder setInteractiveLineWidth(float f) {
            this.f = f;
            return this;
        }

        public Builder setInteractiveSlide(boolean z) {
            this.k = z;
            return this;
        }

        public Builder setInteractiveType(int i) {
            this.h = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setMinDiff(float f) {
            this.q = f;
            return this;
        }

        public Builder setMinHeight(float f) {
            this.r = f;
            return this;
        }

        public Builder setOverlapColor(HMColor hMColor) {
            this.n = hMColor;
            return this;
        }

        public Builder setOverlapGradientColor(ChartGradientColor chartGradientColor) {
            this.o = chartGradientColor;
            return this;
        }

        public Builder setRadianValues(float[] fArr) {
            this.e = fArr;
            return this;
        }

        public Builder setRenderPriority(int i) {
            this.v = i;
            return this;
        }

        public Builder setSupportRadian(boolean z) {
            this.d = z;
            return this;
        }
    }

    public BarStyle(Builder builder) {
        this.c = true;
        this.f = false;
        this.g = null;
        this.p = null;
        this.q = null;
        this.d = builder.a;
        this.e = builder.b;
        this.c = builder.c;
        this.f = builder.d;
        this.g = builder.e;
        this.i = builder.f;
        this.j = builder.g;
        this.h = builder.h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.r = builder.p;
        this.p = builder.n;
        this.q = builder.o;
        this.s = builder.q;
        this.t = builder.r;
        this.u = builder.s;
        this.v = builder.t;
        this.w = builder.u;
        this.x = builder.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(Exception exc) {
        return "error :  " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(Exception exc) {
        return "error :  " + exc.getMessage();
    }

    public HMColor[] getBarColors() {
        return this.e;
    }

    public ChartGradientColor[] getBarGradientColors() {
        return this.r;
    }

    public int getBarStyle() {
        return this.d;
    }

    public int getChartBackgroundColor() {
        return this.w;
    }

    public int getHighlightBorderColor() {
        return this.u;
    }

    public float getHighlightBorderStrokeWidth() {
        return this.v;
    }

    public int getHighlightContrast() {
        return this.n;
    }

    public int getInteractiveLineColor() {
        return this.j;
    }

    public float getInteractiveLineWidth() {
        return this.i;
    }

    public int getInteractiveType() {
        return this.h;
    }

    public float getMinDiff() {
        return this.s;
    }

    public float getMinHeight() {
        return this.t;
    }

    public HMColor getOverlapColor() {
        return this.p;
    }

    public ChartGradientColor getOverlapGradientColor() {
        return this.q;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 102;
    }

    public float[] getRadianValues() {
        return this.g;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getRenderPriority() {
        return this.x;
    }

    public boolean isDownSameCancel() {
        return this.l;
    }

    public boolean isFingerUpHighlightCancel() {
        return this.o;
    }

    public boolean isInteractiveSlide() {
        return this.m;
    }

    public boolean isInteractiveUpCancel() {
        return this.k;
    }

    public boolean isNeedClipRange() {
        return this.c;
    }

    public boolean isSupportRadian() {
        return this.f;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.d = jSONObject.optInt("style");
        }
        if (jSONObject.has(BarStyleConstant.NEED_CLIP_RANGE)) {
            this.c = jSONObject.optBoolean(BarStyleConstant.NEED_CLIP_RANGE);
        }
        if (jSONObject.has(BarStyleConstant.BAR_COLORS)) {
            try {
                String[] strArrSplit = jSONObject.optString(BarStyleConstant.BAR_COLORS).split(";");
                for (int i = 0; i < strArrSplit.length; i++) {
                    try {
                        String[] strArrSplit2 = strArrSplit[i].trim().split(",");
                        this.e[i] = new HMColor(Color.parseColor(strArrSplit2[0]), strArrSplit2.length > 1 ? Color.parseColor(strArrSplit2[1]) : -1);
                    } catch (Exception e) {
                        HMLog.info(y, new Function0() { // from class: mn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BarStyle.c(e);
                            }
                        });
                    }
                }
            } catch (Exception e2) {
                HMLog.info(y, new Function0() { // from class: ln
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BarStyle.d(e2);
                    }
                });
            }
        }
    }
}
