package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import com.huami.chart.style.constant.NodataStyleConstant;
import com.huami.chart.util.ChartUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NoDataStyle extends BaseStyle implements NodataStyleConstant {
    public static final int LABEL = 2;
    public static final int NONE = 1;
    private int c;
    private String d;
    private float e;
    private int f;
    private boolean g;
    private float h;

    public static class Builder {
        private float c;
        private int a = 1;
        private String b = "";
        private int d = -7829368;
        private boolean e = false;
        private float f = Float.NaN;

        public Builder(Context context) {
            this.c = ChartUtil.sp2px(context, 12.0f);
        }

        public NoDataStyle create() {
            return new NoDataStyle(this);
        }

        public Builder setLabelCenterInCanvas(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setLabelCenterXOffset(float f) {
            this.f = f;
            return this;
        }

        public Builder setNoDataLabel(String str) {
            this.b = str;
            return this;
        }

        public Builder setNoDataLabelColor(int i) {
            this.d = i;
            return this;
        }

        public Builder setNoDataLabelSize(float f) {
            this.c = f;
            return this;
        }

        public Builder setNoDataStyle(int i) {
            this.a = i;
            return this;
        }
    }

    public NoDataStyle(Builder builder) {
        this.c = builder.a;
        this.d = builder.b;
        this.e = builder.c;
        this.f = builder.d;
        this.g = builder.e;
        this.h = builder.f;
    }

    public float getLabelCenterXOffset() {
        return this.h;
    }

    public String getNoDataLabel() {
        return this.d;
    }

    public int getNoDataLabelColor() {
        return this.f;
    }

    public float getNoDataLabelSize() {
        return this.e;
    }

    public int getNoDataStyle() {
        return this.c;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 3;
    }

    public boolean isLabelCenterInCanvas() {
        return this.g;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has(NodataStyleConstant.NO_DATA_LABEL)) {
            this.d = jSONObject.optString(NodataStyleConstant.NO_DATA_LABEL);
        }
        if (jSONObject.has(NodataStyleConstant.NO_DATA_LABEL_SIZE)) {
            this.e = ChartUtil.sp2px(context, (float) jSONObject.optDouble(NodataStyleConstant.NO_DATA_LABEL_SIZE));
        }
        if (jSONObject.has(NodataStyleConstant.NO_DATA_LABEL_COLOR)) {
            this.f = Color.parseColor(jSONObject.optString(NodataStyleConstant.NO_DATA_LABEL_COLOR));
        }
    }
}
