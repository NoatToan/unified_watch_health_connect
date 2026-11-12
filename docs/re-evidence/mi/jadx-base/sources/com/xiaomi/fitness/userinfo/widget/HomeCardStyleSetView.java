package com.xiaomi.fitness.userinfo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.xiaomi.fitness.widget.view.CardStyleSetView;
import defpackage.a5j;
import defpackage.hsi;
import defpackage.nvi;

/* JADX INFO: loaded from: classes10.dex */
public class HomeCardStyleSetView extends CardStyleSetView {
    public HomeCardStyleSetView(Context context) {
        this(context, null);
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public int getLayoutRes() {
        return nvi.D;
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void onInitView(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        findViewById(hsi.p).setVisibility(typedArray.getBoolean(a5j.M, false) ? 0 : 8);
    }

    @Override // com.xiaomi.fitness.widget.view.CardStyleSetView
    public void setEnable(boolean z, int i) {
        super.setEnable(z, i);
    }

    public void setTopViewShow(boolean z) {
        findViewById(hsi.p).setVisibility(z ? 0 : 8);
    }

    public HomeCardStyleSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardStyleSetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
