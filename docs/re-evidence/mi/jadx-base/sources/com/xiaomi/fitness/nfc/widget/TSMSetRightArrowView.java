package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.mri;
import defpackage.pli;
import defpackage.rji;

/* JADX INFO: loaded from: classes9.dex */
public class TSMSetRightArrowView extends SetRightArrowView {
    public View.OnClickListener i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f12680k;

    public TSMSetRightArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = true;
    }

    public final /* synthetic */ void d(View view) {
        this.i.onClick(view);
    }

    public final /* synthetic */ void e(View view) {
        this.i.onClick(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        a(false);
        this.f12680k = (TextView) findViewById(mri.s);
        Resources resources = getContext().getResources();
        this.f12680k.setPaddingRelative((int) resources.getDimension(pli.i), (int) resources.getDimension(pli.f30525k), (int) resources.getDimension(pli.j), (int) resources.getDimension(pli.h));
        this.f12680k.setTextColor(getContext().getResources().getColorStateList(rji.c));
        this.f12680k.setVisibility(this.j ? 0 : 8);
        if (this.i != null) {
            this.f12680k.setOnClickListener(new View.OnClickListener() { // from class: vyo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37370a.d(view);
                }
            });
        }
    }

    public void setOnRightValueClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        this.f12680k.setOnClickListener(new View.OnClickListener() { // from class: uyo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36288a.e(view);
            }
        });
    }

    public void setRightValueEnabled(boolean z) {
        this.j = z;
        this.f12680k.setVisibility(z ? 0 : 8);
    }

    public TSMSetRightArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
    }

    public TSMSetRightArrowView(Context context) {
        super(context);
        this.j = true;
    }
}
