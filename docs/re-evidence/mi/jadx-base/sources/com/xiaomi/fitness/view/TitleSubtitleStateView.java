package com.xiaomi.fitness.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;

/* JADX INFO: loaded from: classes10.dex */
public class TitleSubtitleStateView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13347b;
    public TextView c;
    public ImageView d;

    public TitleSubtitleStateView(Context context) {
        this(context, null);
    }

    public TitleSubtitleStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleSubtitleStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.j6);
        String string = typedArrayObtainStyledAttributes.getString(n4j.o6);
        String string2 = typedArrayObtainStyledAttributes.getString(n4j.n6);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(n4j.l6, true);
        String string3 = typedArrayObtainStyledAttributes.getString(n4j.m6);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(n4j.k6);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(jui.X7, (ViewGroup) this, true);
        this.f13346a = (TextView) viewInflate.findViewById(eri.bn);
        this.f13347b = (TextView) viewInflate.findViewById(eri.Mm);
        this.c = (TextView) viewInflate.findViewById(eri.Hm);
        this.d = (ImageView) viewInflate.findViewById(eri.G7);
        this.f13346a.setText(string);
        this.c.setText(string3);
        this.f13347b.setText(string2);
        this.f13347b.setVisibility(z ? 0 : 8);
        this.d.setImageDrawable(drawable);
    }
}
