package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes12.dex */
public class k extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f21274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TextView f21275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected TextView f21276c;
    protected boolean d;
    protected int e;

    public void setShowLogo(boolean z) {
        this.d = z;
        a();
    }

    public void setOrientation(int i) {
        this.e = i;
    }

    public void a(String str, String str2) {
        if (this.f21275b != null && !TextUtils.isEmpty(str)) {
            this.f21275b.setText(str);
        }
        if (this.f21276c == null || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f21276c.setText(str2);
    }

    protected void a() {
        if (this.d || this.e != 1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin += dk.f(getContext());
            setLayoutParams(layoutParams2);
        }
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1;
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 1;
    }

    public k(Context context) {
        super(context);
        this.e = 1;
    }
}
