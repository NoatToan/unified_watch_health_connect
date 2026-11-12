package com.huami.chart.interact;

import com.huami.chart.chart.HMChart;
import com.huami.chart.interact.InteractiveManager;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class InteractiveManager {
    private static final String s = "InteractiveManager";
    private Index a = Index.INVALID_INDEX;
    private float b = Float.NaN;
    private float c = Float.NaN;
    private float d = Float.NaN;
    private float e = Float.NaN;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 1.0f;
    private float i = 1.0f;
    private boolean j = true;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private float q = 1.0f;
    private OnScrollStateChanged r;

    public interface OnScrollStateChanged {
        void onScrollStoped();
    }

    public InteractiveManager(HMChart hMChart) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("setScrollStopped ");
        sb.append(this.r == null);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "onScrollStoped callback...";
    }

    public void clear() {
    }

    public float getCurrentDownX() {
        return this.b;
    }

    public float getCurrentDownY() {
        return this.c;
    }

    public Index getCurrentIndex() {
        Index index = this.a;
        return index == null ? Index.INVALID_INDEX : index;
    }

    public float getCurrentScale() {
        return this.q;
    }

    public float getDownX() {
        return this.d;
    }

    public float getDownY() {
        return this.e;
    }

    public float getScaleFactorX() {
        return this.h;
    }

    public float getScaleFactorY() {
        return this.i;
    }

    public float getxOffset() {
        return this.f;
    }

    public float getyOffset() {
        return this.g;
    }

    public boolean isAnchorCenter() {
        return this.o;
    }

    public boolean isEnableAutoAdjust() {
        return this.l;
    }

    public boolean isEnableInteractive() {
        return this.j;
    }

    public boolean isEnableScale() {
        return this.p;
    }

    public boolean isEnableScroll() {
        return this.k;
    }

    public boolean isMoving() {
        return this.m;
    }

    public boolean isScaling() {
        return this.n;
    }

    public void setAnchorCenter(boolean z) {
        this.o = z;
    }

    public void setCurrentDownX(float f) {
        this.b = f;
    }

    public void setCurrentDownY(float f) {
        this.c = f;
    }

    public void setCurrentIndex(Index index) {
        this.a = index;
    }

    public void setCurrentScale(float f) {
        this.q = f;
    }

    public void setDownX(float f) {
        this.d = f;
    }

    public void setDownY(float f) {
        this.e = f;
    }

    public void setEnableAutoAdjust(boolean z) {
        this.l = z;
    }

    public void setEnableInteractive(boolean z) {
        this.j = z;
    }

    public void setEnableScale(boolean z) {
        this.p = z;
    }

    public void setEnableScroll(boolean z) {
        this.k = z;
    }

    public void setMoving(boolean z) {
        this.m = z;
    }

    public void setScaleFactorX(float f) {
        this.h = f;
    }

    public void setScaleFactorY(float f) {
        this.i = f;
    }

    public void setScaling(boolean z) {
        this.n = z;
    }

    public void setScrollStateChangeListener(OnScrollStateChanged onScrollStateChanged) {
        this.r = onScrollStateChanged;
    }

    public void setScrollStoped() {
        HMLog.verbose("HMChart", new Function0() { // from class: ig4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.c();
            }
        });
        if (this.r != null) {
            HMLog.verbose("HMChart", new Function0() { // from class: jg4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InteractiveManager.d();
                }
            });
            this.r.onScrollStoped();
        }
    }

    public void setxOffset(float f) {
        this.f = f;
    }

    public void setyOffset(float f) {
        this.g = f;
    }
}
