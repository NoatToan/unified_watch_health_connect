package com.huami.chart.render;

import android.graphics.Canvas;
import com.huami.chart.chart.HMChart;
import com.huami.chart.provider.MyPaint;
import com.huami.chart.style.BaseStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RenderFactory {
    private static final String c = "RenderFactory";
    private List<BaseStyle> a = new ArrayList();
    private HashMap<Integer, BaseRender> b = new HashMap<>();

    public class a implements Comparator<BaseStyle> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BaseStyle baseStyle, BaseStyle baseStyle2) {
            return baseStyle.getRenderPriority() - baseStyle2.getRenderPriority();
        }
    }

    public RenderFactory init(HMChart hMChart) {
        this.a.clear();
        this.b.clear();
        MyPaint myPaint = new MyPaint(hMChart);
        this.b.put(1, new AxisRender(hMChart, myPaint));
        this.b.put(0, new BackgroundRender(hMChart, myPaint));
        this.b.put(102, new BarRender(hMChart, myPaint));
        this.b.put(101, new LineRender(hMChart, myPaint));
        this.b.put(2, new GoalLineRender(hMChart, myPaint));
        this.b.put(200, new LineJoinRender(hMChart, myPaint));
        this.b.put(202, new PointRender(hMChart, myPaint));
        this.b.put(3, new NoDataRender(hMChart, myPaint));
        this.b.put(201, new ValueRender(hMChart, myPaint));
        this.b.put(100, new MultiLineRender(hMChart, myPaint));
        this.b.put(300, new InteractiveLineRender(hMChart, myPaint));
        this.b.put(203, new SectionLineRender(hMChart, myPaint));
        return this;
    }

    public void render(Canvas canvas, int i, int i2, float f) {
        Collections.sort(this.a, new a());
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            BaseStyle baseStyle = this.a.get(i3);
            if (baseStyle.needRefresh()) {
                this.b.get(Integer.valueOf(baseStyle.getPriority())).draw(canvas, i, i2, f);
            }
        }
    }

    public <T extends BaseStyle> RenderFactory with(T t) {
        if (t != null) {
            this.b.get(Integer.valueOf(t.getPriority())).setBaseStyle(t);
            this.a.add(t);
        }
        return this;
    }
}
