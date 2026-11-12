package com.huami.chart.style;

import android.content.Context;
import android.graphics.Color;
import com.huami.chart.style.SectionLineStyle;
import com.huami.chart.style.constant.SectionLineStyleConstant;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class SectionLineStyle extends BaseStyle implements SectionLineStyleConstant {
    public static final int BEZIER = 4;
    public static final int CURVE = 2;
    public static final int INTERACTIVE_NORMAL = 16;
    public static final int NONE = 1;
    public static final int STRAIGHT = 8;
    private static final String m = "SectionLineStyle";
    private int c;
    private int d;
    private float e;
    private int[] f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private float k;
    private int l;

    public static class Builder {
        private float c;
        private float i;
        private int j;
        private int a = 1;
        private int b = -16777216;
        private int[] d = null;
        private int e = 16;
        private boolean f = true;
        private boolean g = false;
        private int h = -16777216;

        public Builder(Context context) {
            this.c = ChartUtil.dp2px(context, 1.3f);
            this.i = ChartUtil.dp2px(context, 1.3f);
        }

        public SectionLineStyle create() {
            return new SectionLineStyle(this);
        }

        public Builder setDisconnectLineGap(int i) {
            this.j = i;
            return this;
        }

        public Builder setInteractiveLineColor(int i) {
            this.h = i;
            return this;
        }

        public Builder setInteractiveLineWidth(float f) {
            this.i = f;
            return this;
        }

        public Builder setInteractiveSlide(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setInteractiveType(int i) {
            this.e = i;
            return this;
        }

        public Builder setInteractiveUpCancel(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setLineColor(int i) {
            this.b = i;
            return this;
        }

        public Builder setLineStyle(int i) {
            this.a = i;
            return this;
        }

        public Builder setLineWidth(float f) {
            this.c = f;
            return this;
        }

        public Builder setShadowColors(int[] iArr) {
            this.d = iArr;
            return this;
        }
    }

    public SectionLineStyle(Builder builder) {
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

    public int getDisconnectLineGap() {
        return this.l;
    }

    public int getInteractiveLineColor() {
        return this.j;
    }

    public float getInteractiveLineWidth() {
        return this.k;
    }

    public int getInteractiveType() {
        return this.g;
    }

    public int getLineColor() {
        return this.d;
    }

    public int getLineStyle() {
        return this.c;
    }

    public float getLineWidth() {
        return this.e;
    }

    @Override // com.huami.chart.style.BaseStyle
    public int getPriority() {
        return 203;
    }

    public int[] getShadowColors() {
        return this.f;
    }

    public boolean isInteractiveSlide() {
        return this.i;
    }

    public boolean isInteractiveUpCancel() {
        return this.h;
    }

    @Override // com.huami.chart.style.BaseStyle
    public void reInitPropertyFromJson(Context context, final JSONObject jSONObject) {
        if (jSONObject.has("style")) {
            this.c = jSONObject.optInt("style");
        }
        if (jSONObject.has("line_color")) {
            HMLog.verbose(m, new Function0() { // from class: jl6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SectionLineStyle.d(jSONObject);
                }
            });
            this.d = Color.parseColor(jSONObject.optString("line_color"));
        }
        if (jSONObject.has("line_width")) {
            this.e = ChartUtil.dp2px(context, (float) jSONObject.optDouble("line_width"));
        }
        if (jSONObject.has("shadow_colors")) {
            try {
                final String[] strArrSplit = jSONObject.optString("shadow_colors").trim().split(",");
                for (final int i = 0; i < strArrSplit.length; i++) {
                    HMLog.verbose(m, new Function0() { // from class: kl6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SectionLineStyle.e(strArrSplit, i);
                        }
                    });
                    this.f[i] = Color.parseColor(strArrSplit[i].trim());
                }
            } catch (Exception e) {
                HMLog.info(m, new Function0() { // from class: il6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SectionLineStyle.f(e);
                    }
                });
            }
        }
        if (jSONObject.has("interactive_type")) {
            this.g = jSONObject.optInt("interactive_type");
        }
        if (jSONObject.has("interactive_up_cancel")) {
            this.h = jSONObject.optBoolean("interactive_up_cancel");
        }
        if (jSONObject.has("is_interactive_slide")) {
            this.i = jSONObject.optBoolean("is_interactive_slide");
        }
        if (jSONObject.has("high_light_line_color")) {
            this.j = Color.parseColor(jSONObject.optString("high_light_line_color"));
        }
        if (jSONObject.has("high_light_line_width")) {
            this.k = ChartUtil.dp2px(context, (float) jSONObject.optDouble("high_light_line_width"));
        }
        if (jSONObject.has(SectionLineStyleConstant.DISCONNECT_LINE_GAP)) {
            this.l = jSONObject.optInt(SectionLineStyleConstant.DISCONNECT_LINE_GAP);
        }
    }
}
