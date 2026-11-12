package com.huami.chart.style;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.style.constant.ValueStyleConstant;
import com.huami.chart.template.ColorTemplate;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ValueStyle extends BaseStyle implements ValueStyleConstant {
    public static final int ALL_VALUE = 2;
    public static final int NONE = 1;
    public static final int SELECT_VALUE = 4;
    public static final int SPECIAL_POSITION = 8;
    private static final String n = "ValueStyle";
    private Bitmap c;
    private int d;
    private float e;
    private int f;
    private float g;
    private HMColor h;
    private IValueTransformation i;
    private ValueGravity j;
    private boolean k;
    private ArrayList<Integer> l;
    private Paint.Style m;

    public static class Builder {
        private float c;
        private float e;
        private Bitmap a = null;
        private int b = -7829368;
        private int d = 1;
        private HMColor f = ColorTemplate.HMCOLOR_DEFAULT;
        private IValueTransformation g = null;
        private ValueGravity h = ValueGravity.TOP;
        private boolean i = false;
        private ArrayList<Integer> j = new ArrayList<>(0);
        private Paint.Style k = Paint.Style.STROKE;

        public Builder(Context context) {
            this.c = ChartUtil.dp2px(context, 5.0f);
            this.e = ChartUtil.sp2px(context, 12.0f);
        }

        public ValueStyle create() {
            return new ValueStyle(this);
        }

        public Builder setBitmapTintColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setDrawEmptyValue(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setPaintStyle(Paint.Style style) {
            this.k = style;
            return this;
        }

        public Builder setShowValueSpecialPosition(ArrayList<Integer> arrayList) {
            this.j = arrayList;
            return this;
        }

        public Builder setValueBitmap(Bitmap bitmap) {
            this.a = bitmap;
            return this;
        }

        public Builder setValueBottomMargin(float f) {
            this.c = f;
            return this;
        }

        public Builder setValueColor(HMColor hMColor) {
            this.f = hMColor;
            return this;
        }

        public Builder setValueGravity(ValueGravity valueGravity) {
            this.h = valueGravity;
            return this;
        }

        public Builder setValueStyle(int i) {
            this.d = i;
            return this;
        }

        public Builder setValueTextSize(float f) {
            this.e = f;
            return this;
        }

        public Builder setValueTransformation(IValueTransformation iValueTransformation) {
            this.g = iValueTransformation;
            return this;
        }
    }

    public enum ValueGravity {
        TOP,
        BOTTOM,
        CENTER
    }

    public ValueStyle(Builder builder) {
        this.f = builder.d;
        this.c = builder.a;
        this.d = builder.b;
        this.e = builder.c;
        this.g = builder.e;
        this.h = builder.f;
        this.i = builder.g;
        this.j = builder.h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
    }

    public int getBitmapTintColor() {
        return this.d;
    }

    public Paint.Style getPaintStyle() {
        return this.m;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 201;
    }

    public ArrayList<Integer> getShowValueSpecialPosition() {
        return this.l;
    }

    public Bitmap getValueBitmap() {
        return this.c;
    }

    public float getValueBottomMargin() {
        return this.e;
    }

    public HMColor getValueColor() {
        return this.h;
    }

    public ValueGravity getValueGravity() {
        return this.j;
    }

    public int getValueStyle() {
        return this.f;
    }

    public float getValueTextSize() {
        return this.g;
    }

    public IValueTransformation getValueTransformation() {
        return this.i;
    }

    public boolean isDrawEmptyValue() {
        return this.k;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, JSONObject jSONObject) {
        int color;
        if (jSONObject.has("style")) {
            this.f = jSONObject.optInt("style");
        }
        jSONObject.has(ValueStyleConstant.VALUE_BITMAP);
        if (jSONObject.has(ValueStyleConstant.BITMAP_TINT_COLOR)) {
            this.d = Color.parseColor(jSONObject.optString(ValueStyleConstant.BITMAP_TINT_COLOR));
        }
        if (jSONObject.has(ValueStyleConstant.VALUE_BOTTOM_MARGIN)) {
            this.e = ChartUtil.dp2px(context, (float) jSONObject.optDouble(ValueStyleConstant.VALUE_BOTTOM_MARGIN));
        }
        if (jSONObject.has(ValueStyleConstant.VALUE_TEXT_SIZE)) {
            this.g = ChartUtil.sp2px(context, (float) jSONObject.optDouble(ValueStyleConstant.VALUE_TEXT_SIZE));
        }
        if (jSONObject.has(ValueStyleConstant.VALUE_COLOR)) {
            String strTrim = jSONObject.optString(ValueStyleConstant.VALUE_COLOR).trim();
            int color2 = -1;
            if (strTrim.contains(",")) {
                String[] strArrSplit = strTrim.split(",");
                color = Color.parseColor(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    color2 = Color.parseColor(strArrSplit[1]);
                }
            } else {
                color = Color.parseColor(strTrim);
            }
            this.h = new HMColor(color, color2);
        }
        jSONObject.has(ValueStyleConstant.VALUE_TRANSFORMATION);
        if (jSONObject.has(ValueStyleConstant.VALUE_GRAVITY)) {
            int iOptInt = jSONObject.optInt(ValueStyleConstant.VALUE_GRAVITY);
            if (iOptInt == 0) {
                this.j = ValueGravity.TOP;
            } else if (iOptInt == 1) {
                this.j = ValueGravity.BOTTOM;
            } else {
                this.j = ValueGravity.CENTER;
            }
        }
        if (jSONObject.has(ValueStyleConstant.DRAW_EMPTY_VALUE)) {
            this.k = jSONObject.optBoolean(ValueStyleConstant.DRAW_EMPTY_VALUE);
        }
    }
}
