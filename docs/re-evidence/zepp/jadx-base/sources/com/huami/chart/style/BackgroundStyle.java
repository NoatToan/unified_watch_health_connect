package com.huami.chart.style;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import com.huami.chart.data.BackgroundShader;
import com.huami.chart.data.XAxisData;
import com.huami.chart.style.constant.BackgroundStyleConstant;
import com.huami.chart.util.ChartUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BackgroundStyle extends BaseStyle implements BackgroundStyleConstant {
    public static final int GRID = 4;
    public static final int IMAGE = 8;
    public static final int NONE = 1;
    public static final int PARTITION_DRAWING = 32;
    public static final int PURE_COLOR = 2;
    public static final int VERTICAL_AXIS = 16;
    private int c;
    private int d;
    private Bitmap e;
    private float f;
    private float g;
    private int h;
    private SparseArray<XAxisData> i;
    private BackgroundShader j;
    private float k;
    private float l;

    public static class Builder {
        private float d;
        private float e;
        private int f;
        private BackgroundShader h;
        private float i = Float.NaN;
        private float j = Float.NaN;
        private int a = 1;
        private int b = -7829368;
        private Bitmap c = null;
        private SparseArray<XAxisData> g = null;

        public Builder(Context context) {
        }

        public BackgroundStyle create() {
            return new BackgroundStyle(this);
        }

        public Builder setAxisData(SparseArray<XAxisData> sparseArray) {
            this.g = sparseArray;
            return this;
        }

        public Builder setBackgroundBitmap(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setBackgroundShader(BackgroundShader backgroundShader) {
            this.h = backgroundShader;
            return this;
        }

        public Builder setBackgroundStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setGridDividerSize(float f) {
            this.e = f;
            return this;
        }

        public Builder setGridLineColor(int i) {
            this.f = i;
            return this;
        }

        public Builder setGridLineWidth(float f) {
            this.d = f;
            return this;
        }

        public Builder setMarginEnd(float f) {
            this.j = f;
            return this;
        }

        public Builder setMarginStart(float f) {
            this.i = f;
            return this;
        }
    }

    public BackgroundStyle(Builder builder) {
        this.c = 0;
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
    }

    public SparseArray<XAxisData> getAxisData() {
        return this.i;
    }

    public Bitmap getBackgroundBitmap() {
        return this.e;
    }

    public int getBackgroundColor() {
        return this.d;
    }

    public BackgroundShader getBackgroundShader() {
        return this.j;
    }

    public int getBackgroundStyle() {
        return this.c;
    }

    public float getGridDividerSize() {
        return this.g;
    }

    public int getGridLineColor() {
        return this.h;
    }

    public float getGridLineWidth() {
        return this.f;
    }

    public float getMarginEnd() {
        return this.l;
    }

    public float getMarginStart() {
        return this.k;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 0;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(BackgroundStyleConstant.BACKGROUND_COLOR)) {
            this.d = Color.parseColor(jSONObject.optString(BackgroundStyleConstant.BACKGROUND_COLOR));
        }
        jSONObject.has(BackgroundStyleConstant.BACKGROUND_BITMAP);
        if (jSONObject.has(BackgroundStyleConstant.GRID_LINE_WIDTH)) {
            this.f = ChartUtil.dp2px(context, (float) jSONObject.optDouble(BackgroundStyleConstant.GRID_LINE_WIDTH));
        }
        if (jSONObject.has(BackgroundStyleConstant.GRID_DIVIDER_SIZE)) {
            this.g = ChartUtil.dp2px(context, (float) jSONObject.optDouble(BackgroundStyleConstant.GRID_DIVIDER_SIZE));
        }
        if (jSONObject.has(BackgroundStyleConstant.GRID_LINE_COLOR)) {
            this.h = Color.parseColor(jSONObject.optString(BackgroundStyleConstant.GRID_LINE_COLOR));
        }
    }
}
