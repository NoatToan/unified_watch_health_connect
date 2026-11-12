package com.xiaomi.fitness.baseui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.gki;
import defpackage.gkr;
import defpackage.loi;
import defpackage.mvi;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class TopBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f11671b;
    public ImageView c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public View g;
    public TextView h;
    public boolean i;
    public gkr j;

    public TopBarView(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        String string;
        String string2;
        String string3;
        int resourceId;
        int resourceId2;
        boolean z;
        gkr gkrVarA0 = gkr.A0(LayoutInflater.from(context).inflate(mvi.A, this));
        this.j = gkrVarA0;
        this.f11670a = gkrVarA0.H;
        this.f11671b = gkrVarA0.C;
        this.c = gkrVarA0.E;
        this.d = gkrVarA0.F;
        this.e = gkrVarA0.B;
        this.f = gkrVarA0.D;
        this.g = gkrVarA0.A;
        this.h = gkrVarA0.G;
        int resourceId3 = gki.v;
        int color = getResources().getColor(gki.f19084a);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.l6);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(z4j.m6, resourceId3);
            string = typedArrayObtainStyledAttributes.getString(z4j.t6);
            string2 = typedArrayObtainStyledAttributes.getString(z4j.s6);
            color = typedArrayObtainStyledAttributes.getColor(z4j.u6, color);
            this.i = typedArrayObtainStyledAttributes.getBoolean(z4j.n6, true);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(z4j.p6, -1);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z4j.r6, -1);
            string3 = typedArrayObtainStyledAttributes.getString(z4j.q6);
            z = typedArrayObtainStyledAttributes.getBoolean(z4j.o6, false);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = null;
            string2 = null;
            string3 = null;
            resourceId = -1;
            resourceId2 = -1;
            z = false;
        }
        setBackgroundResource(resourceId3);
        f(string);
        if (string2 != null) {
            e(string2);
        }
        this.f11670a.setTextColor(color);
        if (this.i && resourceId == -1) {
            resourceId = loi.n;
        }
        if (resourceId != -1) {
            b(resourceId);
        } else {
            g(false);
        }
        if (resourceId2 != -1) {
            d(resourceId2);
        } else {
            i(false);
        }
        if (TextUtils.isEmpty(string3)) {
            h(false);
        } else {
            c(string3);
        }
        if (z) {
            this.g.setVisibility(0);
        }
    }

    public TopBarView b(int i) {
        g(true);
        this.f11671b.setImageResource(i);
        return this;
    }

    public TopBarView c(CharSequence charSequence) {
        h(true);
        this.f.setText(charSequence);
        return this;
    }

    public TopBarView d(int i) {
        if (i == -1) {
            i(false);
        } else {
            i(true);
            this.c.setImageResource(i);
        }
        return this;
    }

    public TopBarView e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        this.h.setText(str);
        return this;
    }

    public TopBarView f(CharSequence charSequence) {
        this.f11670a.setText(charSequence);
        return this;
    }

    public TopBarView g(boolean z) {
        this.f11671b.setVisibility(z ? 0 : 8);
        return this;
    }

    public View getDivider() {
        return this.g;
    }

    public TextView getLeftButton() {
        return this.e;
    }

    public ImageView getLeftIcon() {
        return this.f11671b;
    }

    public TextView getRightButton() {
        return this.f;
    }

    public ImageView getRightIcon() {
        return this.c;
    }

    public ImageView getRightIcon2() {
        return this.d;
    }

    public TextView getTitleView() {
        return this.f11670a;
    }

    public TopBarView h(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
        return this;
    }

    public TopBarView i(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        isInEditMode();
    }

    public void setButtonBackgoundResouce(int i) {
        this.e.setBackgroundResource(i);
        this.f11671b.setBackgroundResource(i);
        this.f.setBackgroundResource(i);
        this.c.setBackgroundResource(i);
    }

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        a(context, attributeSet);
    }
}
