package com.huami.chart.provider;

import com.huami.chart.chart.HMChart;
import com.huami.chart.listener.IDataShownAreaListener;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class DrawAreaManager implements IDataShownAreaListener {
    private static final String b = "DrawAreaManager";
    private DrawConfig a;

    public DrawAreaManager(HMChart hMChart) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c() {
        return "getDrawHeight " + (getBottom() - getTop()) + " getBottom " + getBottom() + " getTop " + getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d() {
        return "getDrawWidth " + (getRight() - getLeft()) + " right " + getRight() + " left " + getLeft();
    }

    private void e() {
        if (this.a == null) {
            throw new IllegalStateException("call setDrawConfig first");
        }
    }

    @Override // com.huami.chart.listener.IDataShownAreaListener
    public float getBottom() {
        e();
        return this.a.getCanvasHeight() - this.a.getDataMarginBtm();
    }

    public float getDrawCenterX() {
        return (getLeft() + getRight()) / 2.0f;
    }

    public float getDrawCenterY() {
        return (getTop() + getBottom()) / 2.0f;
    }

    public DrawConfig getDrawConfig() {
        return this.a;
    }

    public float getDrawHeight() {
        HMLog.verbose(b, new Function0() { // from class: bd1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.c();
            }
        });
        return getBottom() - getTop();
    }

    public float getDrawWidth() {
        HMLog.verbose(b, new Function0() { // from class: ad1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.d();
            }
        });
        return getRight() - getLeft();
    }

    public float getHalfDataWidth() {
        e();
        return this.a.getDataWidth() / 2.0f;
    }

    public float getHeight() {
        e();
        return this.a.getCanvasHeight();
    }

    @Override // com.huami.chart.listener.IDataShownAreaListener
    public float getLeft() {
        e();
        return this.a.getDataMarginLeft();
    }

    public float getMarginBottom() {
        e();
        return this.a.getDataMarginBtm();
    }

    @Override // com.huami.chart.listener.IDataShownAreaListener
    public float getRight() {
        e();
        return this.a.getCanvasWidth() - this.a.getDataMarginRight();
    }

    @Override // com.huami.chart.listener.IDataShownAreaListener
    public float getTop() {
        e();
        return this.a.getDataMarginTop();
    }

    public float getWidth() {
        e();
        return this.a.getCanvasWidth();
    }

    public void setDrawConfig(DrawConfig drawConfig) {
        this.a = drawConfig;
    }
}
