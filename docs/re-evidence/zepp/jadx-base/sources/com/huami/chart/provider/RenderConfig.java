package com.huami.chart.provider;

import android.content.Context;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BackgroundStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.PointStyle;
import com.huami.chart.style.SectionLineStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.style.constant.StyleConstant;
import com.huami.tools.log.HMLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class RenderConfig implements Serializable, StyleConstant {
    private static final String n = RenderConfig.class.getSimpleName();
    private BarStyle a;
    private NoDataStyle b;
    private GoalLineStyle c;
    private LineStyle d;
    private AxisStyle e;
    private LineJoinStyle f;
    private ValueStyle g;
    private BackgroundStyle h;
    private MultiLineStyle i;
    private InteractiveLineStyle j;
    private SectionLineStyle k;
    private PointStyle l;
    private String m;

    public static class Builder {
        private BarStyle a = null;
        private NoDataStyle b = null;
        private GoalLineStyle c = null;
        private LineStyle d = null;
        private AxisStyle e = null;
        private LineJoinStyle f = null;
        private ValueStyle g = null;
        private BackgroundStyle h = null;
        private MultiLineStyle i = null;
        private InteractiveLineStyle j = null;
        private SectionLineStyle k = null;
        private PointStyle l = null;
        private String m = "";

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String r(StringBuilder sb) {
            return "jsonFile " + sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String s(Exception exc) {
            return "error " + exc.getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String t(JSONObject jSONObject) {
            return "lineStyle here " + jSONObject.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String u(Exception exc) {
            return "error " + exc.getMessage();
        }

        private void v(Context context, String str) {
            final StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                }
                HMLog.verbose(RenderConfig.n, new Function0() { // from class: pb6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderConfig.Builder.r(sb);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.info(RenderConfig.n, new Function0() { // from class: ob6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderConfig.Builder.s(e);
                    }
                });
            }
            try {
                JSONObject jSONObject = new JSONObject(sb.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StyleConstant.BAR_STYLE);
                if (jSONObjectOptJSONObject != null) {
                    if (this.a == null) {
                        this.a = new BarStyle.Builder(context).create();
                    }
                    this.a.reInitPropertyFromJson(context, jSONObjectOptJSONObject);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("background");
                if (jSONObjectOptJSONObject2 != null) {
                    if (this.h == null) {
                        this.h = new BackgroundStyle.Builder(context).create();
                    }
                    this.h.reInitPropertyFromJson(context, jSONObjectOptJSONObject2);
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("value");
                if (jSONObjectOptJSONObject3 != null) {
                    if (this.g == null) {
                        this.g = new ValueStyle.Builder(context).create();
                    }
                    this.g.reInitPropertyFromJson(context, jSONObjectOptJSONObject3);
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(StyleConstant.NO_DATA_STYLE);
                if (jSONObjectOptJSONObject4 != null) {
                    if (this.b == null) {
                        this.b = new NoDataStyle.Builder(context).create();
                    }
                    this.b.reInitPropertyFromJson(context, jSONObjectOptJSONObject4);
                }
                final JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("line");
                if (jSONObjectOptJSONObject5 != null) {
                    if (this.d == null) {
                        this.d = new LineStyle.Builder(context).create();
                    }
                    HMLog.verbose(RenderConfig.n, new Function0() { // from class: qb6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RenderConfig.Builder.t(jSONObjectOptJSONObject5);
                        }
                    });
                    this.d.reInitPropertyFromJson(context, jSONObjectOptJSONObject5);
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(StyleConstant.LINE_JOINT_STYLE);
                if (jSONObjectOptJSONObject6 != null) {
                    if (this.f == null) {
                        this.f = new LineJoinStyle.Builder(context).create();
                    }
                    this.f.reInitPropertyFromJson(context, jSONObjectOptJSONObject6);
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(StyleConstant.GOAL_LINE_STYLE);
                if (jSONObjectOptJSONObject7 != null) {
                    if (this.c == null) {
                        this.c = new GoalLineStyle.Builder(context).create();
                    }
                    this.c.reInitPropertyFromJson(context, jSONObjectOptJSONObject7);
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject(StyleConstant.AXIS_STYLE);
                if (jSONObjectOptJSONObject8 != null) {
                    if (this.e == null) {
                        this.e = new AxisStyle.Builder(context).create();
                    }
                    this.e.reInitPropertyFromJson(context, jSONObjectOptJSONObject8);
                }
                if (jSONObject.optJSONObject(StyleConstant.MULTI_LINE_STYLE) != null) {
                    if (this.i == null) {
                        this.i = new MultiLineStyle.Builder(context).create();
                    }
                    this.i.reInitPropertyFromJson(context, jSONObjectOptJSONObject8);
                }
                if (jSONObject.optJSONObject(StyleConstant.INTERACTIVE_LINE_STYLE) != null) {
                    if (this.i == null) {
                        this.j = new InteractiveLineStyle.Builder(context).create();
                    }
                    this.j.reInitPropertyFromJson(context, jSONObjectOptJSONObject8);
                }
                if (jSONObject.optJSONObject(StyleConstant.SECTION_LINE_STYLE) != null) {
                    if (this.i == null) {
                        this.k = new SectionLineStyle.Builder(context).create();
                    }
                    this.k.reInitPropertyFromJson(context, jSONObjectOptJSONObject8);
                }
            } catch (Exception e2) {
                HMLog.info(RenderConfig.n, new Function0() { // from class: nb6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderConfig.Builder.u(e2);
                    }
                });
            }
        }

        public RenderConfig create() {
            return new RenderConfig(this);
        }

        public Builder setAssetFileName(Context context, String str) {
            this.m = str;
            v(context, str);
            return this;
        }

        public Builder setAxisStyle(AxisStyle axisStyle) {
            this.e = axisStyle;
            return this;
        }

        public Builder setBackgroundStyle(BackgroundStyle backgroundStyle) {
            this.h = backgroundStyle;
            return this;
        }

        public Builder setBarStyle(BarStyle barStyle) {
            this.a = barStyle;
            return this;
        }

        public Builder setGoalLineStyle(GoalLineStyle goalLineStyle) {
            this.c = goalLineStyle;
            return this;
        }

        public Builder setInteractiveLineStyle(InteractiveLineStyle interactiveLineStyle) {
            this.j = interactiveLineStyle;
            return this;
        }

        public Builder setLineJoinStyle(LineJoinStyle lineJoinStyle) {
            this.f = lineJoinStyle;
            return this;
        }

        public Builder setLineStyle(LineStyle lineStyle) {
            this.d = lineStyle;
            return this;
        }

        public Builder setMultiLineStyle(MultiLineStyle multiLineStyle) {
            this.i = multiLineStyle;
            return this;
        }

        public Builder setNoDataStyle(NoDataStyle noDataStyle) {
            this.b = noDataStyle;
            return this;
        }

        public Builder setPointStyle(PointStyle pointStyle) {
            this.l = pointStyle;
            return this;
        }

        public Builder setSectionLineStyle(SectionLineStyle sectionLineStyle) {
            this.k = sectionLineStyle;
            return this;
        }

        public Builder setValueStyle(ValueStyle valueStyle) {
            this.g = valueStyle;
            return this;
        }
    }

    public RenderConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.m = builder.m;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
    }

    public AxisStyle getAxisStyle() {
        return this.e;
    }

    public BackgroundStyle getBackgroundStyle() {
        return this.h;
    }

    public BarStyle getBarStyle() {
        return this.a;
    }

    public GoalLineStyle getGoalLineStyle() {
        return this.c;
    }

    public InteractiveLineStyle getInteractiveLineStyle() {
        return this.j;
    }

    public LineJoinStyle getLineJoinStyle() {
        return this.f;
    }

    public LineStyle getLineStyle() {
        return this.d;
    }

    public MultiLineStyle getMultiLineStyle() {
        return this.i;
    }

    public NoDataStyle getNoDataStyle() {
        return this.b;
    }

    public PointStyle getPointStyle() {
        return this.l;
    }

    public SectionLineStyle getSectionLineStyle() {
        return this.k;
    }

    public ValueStyle getValueStyle() {
        return this.g;
    }
}
