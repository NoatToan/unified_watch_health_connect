package com.huami.chart.provider;

import android.content.Context;
import com.huami.chart.util.ChartUtil;

/* JADX INFO: loaded from: classes6.dex */
public class DrawConfig {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    public static class Builder {
        private float a = Float.NaN;
        private float b = Float.NaN;
        private float c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 0.0f;
        private float g;

        public Builder(Context context) {
            this.g = ChartUtil.dp2px(context, 10.0f);
        }

        public DrawConfig create() {
            return new DrawConfig(this);
        }

        public Builder setCanvasHeight(float f) {
            this.b = f;
            return this;
        }

        public Builder setCanvasWidth(float f) {
            this.a = f;
            return this;
        }

        public Builder setDataMarginBottom(float f) {
            this.f = f;
            return this;
        }

        public Builder setDataMarginLeft(float f) {
            this.c = f;
            return this;
        }

        public Builder setDataMarginRight(float f) {
            this.d = f;
            return this;
        }

        public Builder setDataMarginTop(float f) {
            this.e = f;
            return this;
        }

        public Builder setDataWidth(float f) {
            this.g = f;
            return this;
        }
    }

    public DrawConfig(Builder builder) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.b = builder.b;
        this.a = builder.a;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
    }

    public float getCanvasHeight() {
        return this.b;
    }

    public float getCanvasWidth() {
        return this.a;
    }

    public float getDataMarginBtm() {
        return this.f;
    }

    public float getDataMarginLeft() {
        return this.c;
    }

    public float getDataMarginRight() {
        return this.d;
    }

    public float getDataMarginTop() {
        return this.e;
    }

    public float getDataWidth() {
        return this.g;
    }
}
