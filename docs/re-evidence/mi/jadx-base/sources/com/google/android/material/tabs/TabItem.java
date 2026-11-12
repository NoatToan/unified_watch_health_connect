package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b4j;
import defpackage.xfp;

/* JADX INFO: loaded from: classes5.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f8838b;
    public final int c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xfp xfpVarU = xfp.u(context, attributeSet, b4j.v8);
        this.f8837a = xfpVarU.p(b4j.y8);
        this.f8838b = xfpVarU.g(b4j.w8);
        this.c = xfpVarU.n(b4j.x8, 0);
        xfpVarU.w();
    }
}
