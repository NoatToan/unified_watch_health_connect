package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import com.huami.chart.style.constant.LineJoinStyleConstant;
import com.huami.chart.template.ColorTemplate;
import com.huami.chart.util.ChartUtil;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class LineJoinStyle extends BaseStyle implements LineJoinStyleConstant {
    public static final int FILLED_CIRCLE = 2;
    public static final int FILLED_CIRCLE_WITH_EDGE = 32;
    public static final int FILLED_OUTER_STROKE_CIRCLE = 8;
    public static final int INTERACTIVE_XLABEL_TARGET_LINE = 64;
    public static final int NONE = 1;
    public static final int STROKE_CIRCLE = 4;
    public static final int STROKE_CIRCLE_WITH_LINE = 16;
    private static final String t = "LineJoinStyle";
    private int c;
    private int d;
    private float e;
    private float f;
    private boolean g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private int m;
    private float n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private HashSet<Integer> s;

    public static class Builder {
        private float c;
        private float d;
        private float f;
        private float g;
        private float h;
        private float j;
        private float k;
        private HashSet<Integer> q;
        private int a = 1;
        private int b = -7829368;
        private boolean e = false;
        private int i = -7829368;
        private int l = 1;
        private int m = ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR;
        private boolean n = true;
        private boolean o = false;
        private boolean p = false;

        public Builder(Context context) {
            this.c = ChartUtil.dp2px(context, 3.0f);
            this.d = ChartUtil.dp2px(context, 3.0f);
            this.f = ChartUtil.dp2px(context, 4.0f);
            this.g = ChartUtil.dp2px(context, 0.7f);
            this.h = ChartUtil.dp2px(context, 4.8f);
            this.j = ChartUtil.dp2px(context, 1.0f);
            this.k = ChartUtil.dp2px(context, 1.0f);
        }

        public LineJoinStyle create() {
            return new LineJoinStyle(this);
        }

        public Builder setDownSameCancel(boolean z) {
            this.o = z;
            return this;
        }

        public Builder setDrawCurrentLineJoint(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setDrawSpecificIndices(boolean z) {
            this.p = z;
            return this;
        }

        public Builder setEdgeColor(int i) {
            this.i = i;
            return this;
        }

        public Builder setEdgeWidth(float f) {
            this.j = f;
            return this;
        }

        public Builder setIndices(HashSet<Integer> hashSet) {
            this.q = hashSet;
            return this;
        }

        public Builder setInteractiveLineColor(int i) {
            this.m = i;
            return this;
        }

        public Builder setInteractiveLineWidth(float f) {
            this.k = f;
            return this;
        }

        public Builder setInteractiveType(int i) {
            this.l = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setLineJointColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setLineJointOuterSize(float f) {
            this.d = f;
            return this;
        }

        public Builder setLineJointResize(float f) {
            this.f = f;
            return this;
        }

        public Builder setLineJointSize(float f) {
            this.c = f;
            return this;
        }

        public Builder setLineJointStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setLineJointWithLineHeight(float f) {
            this.h = f;
            return this;
        }

        public Builder setLineJointWithLineStrokeWidth(float f) {
            this.g = f;
            return this;
        }
    }

    public LineJoinStyle(Builder builder) {
        this.m = 1;
        this.n = Float.NaN;
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
        this.n = builder.k;
        this.m = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.s = builder.q;
    }

    public int getEdgeColor() {
        return this.k;
    }

    public float getEdgeWidth() {
        return this.l;
    }

    public HashSet<Integer> getIndices() {
        return this.s;
    }

    public int getInteractiveLineColor() {
        return this.o;
    }

    public float getInteractiveLineWidth() {
        return this.n;
    }

    public int getInteractiveType() {
        return this.m;
    }

    public int getLineJointColor() {
        return this.d;
    }

    public float getLineJointOuterSize() {
        return this.f;
    }

    public float getLineJointResize() {
        return this.h;
    }

    public float getLineJointSize() {
        return this.e;
    }

    public int getLineJointStyle() {
        return this.c;
    }

    public float getLineJointWithLineHeight() {
        return this.j;
    }

    public float getLineJointWithLineStrokeWidth() {
        return this.i;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 200;
    }

    public boolean isDownSameCancel() {
        return this.q;
    }

    public boolean isDrawCurrentLineJoint() {
        return this.g;
    }

    public boolean isDrawSpecificIndices() {
        return this.r;
    }

    public boolean isInteractiveUpCancel() {
        return this.p;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_COLOR)) {
            this.d = Color.parseColor(jSONObject.optString(LineJoinStyleConstant.LINE_JOINT_COLOR));
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_SIZE)) {
            this.e = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.LINE_JOINT_SIZE));
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_OUTER_SIZE)) {
            this.f = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.LINE_JOINT_OUTER_SIZE));
        }
        if (jSONObject.has(LineJoinStyleConstant.DRAW_CURRENT_LINE_JOINT)) {
            this.g = jSONObject.optBoolean(LineJoinStyleConstant.DRAW_CURRENT_LINE_JOINT);
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_RESIZE)) {
            this.h = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.LINE_JOINT_RESIZE));
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_WITH_LINE_STROKE_WIDTH)) {
            this.i = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.LINE_JOINT_WITH_LINE_STROKE_WIDTH));
        }
        if (jSONObject.has(LineJoinStyleConstant.LINE_JOINT_WITH_LINE_HEIGHT)) {
            this.j = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.LINE_JOINT_WITH_LINE_HEIGHT));
        }
        if (jSONObject.has(LineJoinStyleConstant.EDGE_COLOR)) {
            this.k = Color.parseColor(jSONObject.optString(LineJoinStyleConstant.EDGE_COLOR));
        }
        if (jSONObject.has(LineJoinStyleConstant.EDGE_WIDTH)) {
            this.l = ChartUtil.dp2px(context, (float) jSONObject.optDouble(LineJoinStyleConstant.EDGE_WIDTH));
        }
    }
}
