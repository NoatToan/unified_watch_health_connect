package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class GoalLineStyle extends BaseStyle implements GoalLineStyleConstant {
    public static final int DASH_LINE = 2;
    public static final int LABEL = 8;
    public static final int NONE = 1;
    public static final int STROKE_LINE = 4;
    private static final String t = "GoalLineStyle";
    private int c;
    private float d;
    private int[] e;
    private float f;
    private float[] g;
    private String[] h;
    private float i;
    private float j;
    private float[] k;
    private int[] l;
    private Typeface m;
    private GoalLineLabelPosition n;
    private float o;
    private float p;
    private float q;
    private float r;
    private boolean s;

    public static class Builder {
        private float b;
        private float d;
        private int a = 1;
        private int[] c = null;
        private float[] e = {5.0f, 5.0f, 5.0f, 5.0f};
        private String[] f = null;
        private float g = 0.0f;
        private float h = 0.0f;
        private float[] i = null;
        private int[] j = null;
        private Typeface k = null;
        private GoalLineLabelPosition l = GoalLineLabelPosition.END;
        private float n = 0.0f;
        private float m = 0.0f;
        private float o = 0.0f;
        private float p = 0.0f;
        private boolean q = false;

        public Builder(Context context) {
            this.b = ChartUtil.dp2px(context, 1.0f);
            this.d = ChartUtil.sp2px(context, 12.0f);
        }

        public GoalLineStyle create() {
            return new GoalLineStyle(this);
        }

        public Builder setDashLineInterval(float[] fArr) {
            this.e = fArr;
            return this;
        }

        public Builder setGoalLabelMarginEnd(float f) {
            this.g = f;
            return this;
        }

        public Builder setGoalLabelMarginStart(float f) {
            this.g = f;
            return this;
        }

        public Builder setGoalLabelTypeface(Typeface typeface) {
            this.k = typeface;
            return this;
        }

        public Builder setGoalLabels(String[] strArr) {
            this.f = strArr;
            return this;
        }

        public Builder setGoalLineColor(int[] iArr) {
            this.j = iArr;
            return this;
        }

        public Builder setGoalLineFloatTextOffsetX(float f) {
            this.o = f;
            return this;
        }

        public Builder setGoalLineFloatTextOffsetY(float f) {
            this.p = f;
            return this;
        }

        public Builder setGoalLineLabelColors(int[] iArr) {
            this.c = iArr;
            return this;
        }

        public Builder setGoalLineLabelPosition(GoalLineLabelPosition goalLineLabelPosition) {
            this.l = goalLineLabelPosition;
            return this;
        }

        public Builder setGoalLineLabelSize(float f) {
            this.d = f;
            return this;
        }

        public Builder setGoalLineMarginEnd(float f) {
            this.n = f;
            return this;
        }

        public Builder setGoalLineMarginStart(float f) {
            this.m = f;
            return this;
        }

        public Builder setGoalLineOutsideShow(boolean z) {
            this.q = z;
            return this;
        }

        public Builder setGoalLineStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setGoalLineWidth(float f) {
            this.b = f;
            return this;
        }

        public Builder setGoals(float[] fArr) {
            this.i = fArr;
            return this;
        }
    }

    public enum GoalLineLabelPosition {
        START,
        CENTER,
        END,
        FLOAT
    }

    public GoalLineStyle(Builder builder) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(Exception exc) {
        return "error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(Exception exc) {
        return "error: " + exc.getMessage();
    }

    public float[] getDashLineInterval() {
        return this.g;
    }

    public float getGoalLabelMarginEnd() {
        return this.j;
    }

    public float getGoalLabelMarginStart() {
        return this.i;
    }

    public Typeface getGoalLabelTypeface() {
        return this.m;
    }

    public String[] getGoalLabels() {
        return this.h;
    }

    public int[] getGoalLineColors() {
        return this.l;
    }

    public float getGoalLineFloatTextOffsetX() {
        return this.q;
    }

    public float getGoalLineFloatTextOffsetY() {
        return this.r;
    }

    public int[] getGoalLineLabelColors() {
        return this.e;
    }

    public GoalLineLabelPosition getGoalLineLabelPosition() {
        return this.n;
    }

    public float getGoalLineLabelSize() {
        return this.f;
    }

    public float getGoalLineMarginEnd() {
        return this.p;
    }

    public float getGoalLineMarginStart() {
        return this.o;
    }

    public boolean getGoalLineOutsideShow() {
        return this.s;
    }

    public int getGoalLineStyle() {
        return this.c;
    }

    public float getGoalLineWidth() {
        return this.d;
    }

    public float[] getGoals() {
        return this.k;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 2;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_WIDTH)) {
            this.d = ChartUtil.dp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LINE_WIDTH));
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_LABEL_COLORS)) {
            try {
                String[] strArrSplit = jSONObject.optString(GoalLineStyleConstant.GOAL_LINE_LABEL_COLORS).trim().split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    this.e[i] = Color.parseColor(strArrSplit[i]);
                }
            } catch (Exception e) {
                HMLog.info(t, new Function0() { // from class: dg2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoalLineStyle.f(e);
                    }
                });
            }
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_LABEL_SIZE)) {
            this.f = ChartUtil.sp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LINE_LABEL_SIZE));
        }
        if (jSONObject.has(GoalLineStyleConstant.DASH_LINE_INTERVAL)) {
            try {
                String[] strArrSplit2 = jSONObject.optString(GoalLineStyleConstant.DASH_LINE_INTERVAL).trim().split(",");
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    this.g[i2] = Float.parseFloat(strArrSplit2[i2]);
                }
            } catch (Exception e2) {
                HMLog.info(t, new Function0() { // from class: eg2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoalLineStyle.g(e2);
                    }
                });
            }
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LABELS)) {
            try {
                String[] strArrSplit3 = jSONObject.optString(GoalLineStyleConstant.GOAL_LABELS).trim().split(",");
                for (int i3 = 0; i3 < strArrSplit3.length; i3++) {
                    this.h[i3] = strArrSplit3[i3];
                }
            } catch (Exception e3) {
                HMLog.info(t, new Function0() { // from class: gg2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoalLineStyle.h(e3);
                    }
                });
            }
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LABEL_MARGIN_START)) {
            this.i = ChartUtil.dp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LABEL_MARGIN_START));
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LABEL_MARGIN_END)) {
            this.j = ChartUtil.dp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LABEL_MARGIN_END));
        }
        if (jSONObject.has(GoalLineStyleConstant.GOALS)) {
            try {
                String[] strArrSplit4 = jSONObject.optString(GoalLineStyleConstant.GOALS).trim().split(",");
                for (int i4 = 0; i4 < strArrSplit4.length; i4++) {
                    this.k[i4] = Float.parseFloat(strArrSplit4[i4]);
                }
            } catch (Exception e4) {
                HMLog.info(t, new Function0() { // from class: fg2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoalLineStyle.i(e4);
                    }
                });
            }
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_COLORS)) {
            try {
                String[] strArrSplit5 = jSONObject.optString(GoalLineStyleConstant.GOAL_LINE_COLORS).trim().split(",");
                for (int i5 = 0; i5 < strArrSplit5.length; i5++) {
                    this.l[i5] = Color.parseColor(strArrSplit5[i5]);
                }
            } catch (Exception e5) {
                HMLog.info(t, new Function0() { // from class: hg2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoalLineStyle.j(e5);
                    }
                });
            }
        }
        jSONObject.has(GoalLineStyleConstant.GOAL_LABEL_TYPEFACE);
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_LABEL_POSITION)) {
            int iOptInt = jSONObject.optInt(GoalLineStyleConstant.GOAL_LINE_LABEL_POSITION);
            if (iOptInt == 0) {
                this.n = GoalLineLabelPosition.START;
            } else if (iOptInt == 1) {
                this.n = GoalLineLabelPosition.CENTER;
            } else if (iOptInt == 2) {
                this.n = GoalLineLabelPosition.END;
            } else {
                this.n = GoalLineLabelPosition.FLOAT;
            }
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_MARGIN_START)) {
            this.o = ChartUtil.dp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LINE_MARGIN_START));
        }
        if (jSONObject.has(GoalLineStyleConstant.GOAL_LINE_MARGIN_END)) {
            this.p = ChartUtil.dp2px(context, (float) jSONObject.optDouble(GoalLineStyleConstant.GOAL_LINE_MARGIN_END));
        }
    }
}
