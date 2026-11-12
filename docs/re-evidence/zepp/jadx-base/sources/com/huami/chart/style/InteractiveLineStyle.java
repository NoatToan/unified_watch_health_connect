package com.huami.chart.style;

import android.content.Context;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import com.huami.chart.style.constant.InteractiveLineConstant;
import com.huami.chart.util.ChartUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class InteractiveLineStyle extends BaseStyle {
    public static final int INTERACTIVE_ALWAYS_AND_ADJUST_VERTICAL_LINE = 32;
    public static final int INTERACTIVE_ALWAYS_SHOW_VERTICAL_LINE = 16;
    public static final int INTERACTIVE_LINE_SHOW_DOWN = 2;
    public static final int INTERACTIVE_SHOW_GET_HORIZONTAL_LINE = 8;
    public static final int INTERACTIVE_SHOW_GET_VERTICAL_LINE = 4;
    public static final int NONE = 1;
    private int c;
    private int d;
    private Shader e;
    private float f;
    private int g;
    private float h;
    private int i;
    private float j;
    private float k;
    private int l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;
    private float q;

    @ColorInt
    private int r;
    private boolean s;
    private boolean t;

    public static class Builder {
        private float d;
        private int a = 4;
        private int b = -16777216;
        private int e = -16777216;
        private float f = 0.0f;
        private int g = -16777216;
        private float h = 0.0f;
        private float i = 0.0f;
        private int j = -1;
        private boolean k = true;
        private boolean l = false;
        private Shader c = null;
        private float m = -1.0f;
        private float n = 0.0f;
        private float o = 0.0f;

        @ColorInt
        private int p = -16777216;
        private boolean q = true;
        private boolean r = false;

        public Builder(Context context) {
            this.d = ChartUtil.sp2px(context, 1.0f);
        }

        public InteractiveLineStyle create() {
            return new InteractiveLineStyle(this);
        }

        public Builder setHideMainInteractivePoint(boolean z) {
            this.r = z;
            return this;
        }

        public Builder setHorizontalLineColor(int i) {
            this.e = i;
            return this;
        }

        public Builder setHorizontalLineWidth(float f) {
            this.f = f;
            return this;
        }

        public Builder setInteractiveLineStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.k = z;
            return this;
        }

        public Builder setIntersectionPointBorder(float f) {
            this.i = f;
            return this;
        }

        public Builder setIntersectionPointBorderColor(int i) {
            this.j = i;
            return this;
        }

        public Builder setIntersectionPointColor(int i) {
            this.g = i;
            return this;
        }

        public Builder setIntersectionPointSize(float f) {
            this.h = f;
            return this;
        }

        public Builder setPointShadowLayer(float f, float f2, float f3, int i) {
            this.m = f;
            this.n = f2;
            this.o = f3;
            this.p = i;
            return this;
        }

        public Builder setShowVerticalLineOnlyInRange(boolean z) {
            this.q = z;
            return this;
        }

        public Builder setSupportSinglePoint(boolean z) {
            this.l = z;
            return this;
        }

        public Builder setVerticalLineColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setVerticalLineShader(Shader shader) {
            this.c = shader;
            return this;
        }

        public Builder setVerticalLineWidth(float f) {
            this.d = f;
            return this;
        }
    }

    public InteractiveLineStyle(Builder builder) {
        this.c = builder.a;
        this.d = builder.b;
        this.f = builder.d;
        this.g = builder.e;
        this.h = builder.f;
        this.i = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
        this.e = builder.c;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.s = builder.q;
        this.t = builder.r;
    }

    public int getHorizontalLineColor() {
        return this.g;
    }

    public float getHorizontalLineWidth() {
        return this.h;
    }

    public int getInteractiveLineStyle() {
        return this.c;
    }

    public float getIntersectionPointBorder() {
        return this.k;
    }

    public int getIntersectionPointBorderColor() {
        return this.l;
    }

    public int getIntersectionPointColor() {
        return this.i;
    }

    public float getIntersectionPointSize() {
        return this.j;
    }

    public int getPointShadowColor() {
        return this.r;
    }

    public float getPointShadowDx() {
        return this.p;
    }

    public float getPointShadowDy() {
        return this.q;
    }

    public float getPointShadowRadius() {
        return this.o;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 300;
    }

    public int getVerticalLineColor() {
        return this.d;
    }

    public Shader getVerticalLineShader() {
        return this.e;
    }

    public float getVerticalLineWidth() {
        return this.f;
    }

    public boolean isHideMainInteractivePoint() {
        return this.t;
    }

    public boolean isInteractiveUpCancel() {
        return this.m;
    }

    public boolean isShowVerticalLineOnlyInRange() {
        return this.s;
    }

    public boolean isSupportSinglePoint() {
        return this.n;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        this.c = jSONObject.optInt("style");
        this.d = jSONObject.optInt(InteractiveLineConstant.VERTICAL_LINE_COLORS);
        this.f = jSONObject.optInt(InteractiveLineConstant.VERTICAL_LINE_WIDTH);
        this.g = jSONObject.optInt(InteractiveLineConstant.HORIZONTAL_LINE_COLORS);
        this.h = jSONObject.optInt(InteractiveLineConstant.HORIZONTAL_LINE_WIDTH);
        this.i = jSONObject.optInt("intersection_point_color");
        this.j = jSONObject.optInt("intersection_point_size");
        this.k = jSONObject.optInt(InteractiveLineConstant.INTERSECTION_POINT_BORDER);
        this.m = jSONObject.optBoolean("interactive_up_cancel");
        this.n = jSONObject.optBoolean(InteractiveLineConstant.IS_SUPPORT_SINGLE_POINT);
    }
}
