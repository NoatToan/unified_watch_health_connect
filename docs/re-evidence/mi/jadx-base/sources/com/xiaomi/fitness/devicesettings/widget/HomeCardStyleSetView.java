package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.xiaomi.fitness.widget.view.CardStyleSetView;
import defpackage.eui;
import defpackage.i4j;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class HomeCardStyleSetView extends CardStyleSetView {
    public HomeCardStyleSetView(Context context) {
        this(context, null);
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public int getLayoutRes() {
        return eui.S2;
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void onInitView(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        findViewById(zqi.s0).setVisibility(typedArray.getBoolean(i4j.O, false) ? 0 : 8);
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void setEnable(boolean z, int i) {
        super.setEnable(z, i);
    }

    public void setTopViewShow(boolean z) {
        findViewById(zqi.s0).setVisibility(z ? 0 : 8);
    }

    public HomeCardStyleSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardStyleSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
