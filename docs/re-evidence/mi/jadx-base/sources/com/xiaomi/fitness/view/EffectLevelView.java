package com.xiaomi.fitness.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;

/* JADX INFO: loaded from: classes10.dex */
public class EffectLevelView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f13340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f13341b;
    public TextView c;
    public ViewGroup d;
    public Context e;

    public EffectLevelView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        int resourceId;
        this.e = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(jui.g6, this);
        this.d = viewGroup;
        this.f13340a = (ImageView) viewGroup.findViewById(eri.x4);
        this.f13341b = this.d.findViewById(eri.z4);
        this.c = (TextView) this.d.findViewById(eri.y4);
        int i2 = -1;
        boolean z = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.n1);
            drawable = typedArrayObtainStyledAttributes.getDrawable(n4j.o1);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(n4j.s1, -1);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(n4j.t1, -1);
            drawable2 = typedArrayObtainStyledAttributes.getDrawable(n4j.p1);
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(n4j.q1, -1);
            z = typedArrayObtainStyledAttributes.getBoolean(n4j.r1, false);
            typedArrayObtainStyledAttributes.recycle();
            i = dimensionPixelOffset;
            i2 = resourceId2;
        } else {
            drawable = null;
            drawable2 = null;
            i = -1;
            resourceId = -1;
        }
        setImageDrawable(drawable);
        setText(i2);
        setTextColor(resourceId);
        setDividerDrawable(drawable2);
        setDividerHeight(i);
        setSelectedLevel(z);
    }

    public void setDividerColor(int i) {
        if (i == -1 || this.f13341b == null) {
            return;
        }
        this.f13341b.setBackgroundColor(this.e.getResources().getColor(i));
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        View view;
        if (drawable == null || (view = this.f13341b) == null) {
            return;
        }
        view.setBackground(drawable);
    }

    public void setDividerHeight(int i) {
        View view;
        if (i <= 0 || (view = this.f13341b) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        this.f13341b.setLayoutParams(layoutParams);
    }

    public void setDividerResource(int i) {
        View view;
        if (i == -1 || (view = this.f13341b) == null) {
            return;
        }
        view.setBackgroundResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = this.f13340a) == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        ImageView imageView;
        if (i == -1 || (imageView = this.f13340a) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public void setSelectedLevel(boolean z) {
        ImageView imageView = this.f13340a;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    public void setText(int i) {
        if (i != -1) {
            this.c.setText(i);
        }
    }

    public void setTextColor(int i) {
        if (i != -1) {
            this.c.setTextColor(getResources().getColor(i));
        }
    }

    public void setText(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public EffectLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public EffectLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
