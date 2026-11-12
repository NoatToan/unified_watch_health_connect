package com.huami.chart.style;

import android.content.Context;
import com.huami.chart.style.constant.PointStyleConstant;
import com.huami.chart.util.ChartUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PointStyle extends BaseStyle implements PointStyleConstant {
    public static final int DOT = 2;
    public static final int NONE = 1;
    private int c;
    private int d;
    private int e;
    private float f;

    public static class Builder {
        private float c;
        private int a = 1;
        private int b = -16777216;
        private int d = -16777216;

        public Builder(Context context) {
            this.c = ChartUtil.dp2px(context, 1.3f);
        }

        public PointStyle create() {
            return new PointStyle(this);
        }

        public Builder setInteractivePointColor(int i) {
            this.d = i;
            return this;
        }

        public Builder setPointColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setPointSize(float f) {
            this.c = f;
            return this;
        }

        public Builder setPointStyle(int i) {
            this.a = i;
            return this;
        }
    }

    public PointStyle(Builder builder) {
        this.c = builder.a;
        this.d = builder.b;
        this.f = builder.c;
        this.e = builder.d;
    }

    public int getInteractivePointColor() {
        return this.e;
    }

    public int getPointColor() {
        return this.d;
    }

    public float getPointSize() {
        return this.f;
    }

    public int getPointStyle() {
        return this.c;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 202;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
    }
}
