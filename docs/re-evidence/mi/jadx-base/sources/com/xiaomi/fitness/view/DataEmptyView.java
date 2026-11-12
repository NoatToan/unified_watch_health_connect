package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.eri;
import defpackage.jui;

/* JADX INFO: loaded from: classes10.dex */
public class DataEmptyView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f13334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13335b;
    public TextView c;
    public View d;

    public DataEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(jui.F6, this);
    }

    public void d(String str) {
        this.f13335b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13334a = (ImageView) findViewById(eri.z7);
        this.f13335b = (TextView) findViewById(eri.Jn);
        this.c = (TextView) findViewById(eri.In);
        this.d = findViewById(eri.le);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f13334a.setOnClickListener(new View.OnClickListener() { // from class: fl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickListener.onClick(view);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: gl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickListener.onClick(view);
            }
        });
        this.f13335b.setOnClickListener(new View.OnClickListener() { // from class: hl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickListener.onClick(view);
            }
        });
    }

    public void setVisible(int i) {
        this.d.setVisibility(i);
        this.f13334a.setVisibility(i);
        this.f13335b.setVisibility(i);
    }
}
