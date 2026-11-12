package com.huawei.ui.commonui.activetips;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.ui.commonui.R;
import defpackage.qrr;

/* JADX INFO: loaded from: classes16.dex */
public class ActiveTipsView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f23260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f23261b;
    private Context d;
    private View e;

    public ActiveTipsView(Context context) {
        super(context);
        this.d = context;
        c();
    }

    public ActiveTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
        c();
    }

    public ActiveTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.active_tips, this);
        this.e = viewInflate;
        if (viewInflate == null) {
            return;
        }
        this.f23261b = (TextView) viewInflate.findViewById(R.id.active_tips_text);
        this.f23260a = (TextView) this.e.findViewById(R.id.goto_active_center);
        Typeface typefaceC = qrr.c();
        this.f23261b.setTypeface(typefaceC);
        this.f23260a.setTypeface(typefaceC);
    }

    public void setActiveBtText(String str) {
        this.f23260a.setText(str);
    }

    public void setTipsText(String str) {
        this.f23261b.setText(str);
    }

    public void setClickActiveListener(View.OnClickListener onClickListener) {
        this.f23260a.setOnClickListener(onClickListener);
    }

    public void setClickBannerListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }
}
