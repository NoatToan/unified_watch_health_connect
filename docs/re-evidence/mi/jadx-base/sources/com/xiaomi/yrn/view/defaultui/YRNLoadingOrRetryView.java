package com.xiaomi.yrn.view.defaultui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.o1d;
import defpackage.tsi;
import defpackage.zvi;

/* JADX INFO: loaded from: classes2.dex */
public class YRNLoadingOrRetryView extends FrameLayout implements o1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f14552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14553b;
    public View c;
    public View d;
    public View.OnClickListener e;

    public YRNLoadingOrRetryView(Context context) {
        this(context, null);
    }

    public final void b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(zvi.f41717b, (ViewGroup) this, true);
        this.f14552a = viewInflate.findViewById(tsi.d);
        this.f14553b = viewInflate.findViewById(tsi.c);
        this.c = viewInflate.findViewById(tsi.g);
        View viewFindViewById = viewInflate.findViewById(tsi.f34996a);
        this.d = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: wxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38468a.c(view);
            }
        });
    }

    public final /* synthetic */ void c(View view) {
        View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void d(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // defpackage.o1d
    public void dismiss() {
        setVisibility(8);
    }

    @Override // defpackage.o1d
    public View getView() {
        return this;
    }

    @Override // defpackage.o1d
    public void setOnRetryListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    @Override // defpackage.o1d
    public void showLoading() {
        setVisibility(0);
        d(this.f14552a, true);
        d(this.f14553b, false);
        d(this.c, false);
        d(this.d, false);
    }

    @Override // defpackage.o1d
    public void showRetry() {
        setVisibility(0);
        d(this.f14552a, false);
        d(this.f14553b, true);
        d(this.c, true);
        d(this.d, true);
    }

    public YRNLoadingOrRetryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YRNLoadingOrRetryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
