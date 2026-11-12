package com.xiaomi.fitness.homepage.viewholder;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.n4j;

/* JADX INFO: loaded from: classes9.dex */
public class XAxisView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12350b;
    public int c;
    public boolean d;

    public XAxisView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12349a = (TextView) findViewById(eri.tn);
        this.f12350b = (TextView) findViewById(eri.un);
        this.f12349a.setTextColor(this.c);
        this.f12350b.setTextColor(this.c);
    }

    public void setEnableRTL(boolean z) {
        this.d = z;
    }

    public void setTxtXAxis1(String str) {
        if (!AppUtil.isRTLDirection() || this.d) {
            this.f12349a.setText(str);
        } else {
            this.f12350b.setText(str);
        }
    }

    public void setTxtXAxis3(String str) {
        if (!AppUtil.isRTLDirection() || this.d) {
            this.f12350b.setText(str);
        } else {
            this.f12349a.setText(str);
        }
    }

    public XAxisView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XAxisView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jui.g8, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.K6);
        this.c = typedArrayObtainStyledAttributes.getColor(n4j.L6, getResources().getColor(iji.z0));
        this.d = typedArrayObtainStyledAttributes.getBoolean(n4j.M6, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
