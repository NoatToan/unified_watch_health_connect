package com.xiaomi.fitness.homepage.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;

/* JADX INFO: loaded from: classes9.dex */
public class DataHeaderTargetItemV2View extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12346b;
    public TextView c;

    public DataHeaderTargetItemV2View(Context context) {
        super(context);
        b(context);
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(jui.V5, this);
    }

    public void a(int i, String str, String str2, String str3) {
        this.f12345a.setText(str);
        this.c.setText(str2);
        this.f12346b.setText(str3);
        Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(getContext(), i);
        int iDip2px = DisplayUtil.dip2px(20.0f);
        resourceDrawable.setBounds(0, 0, iDip2px, iDip2px);
        Drawable resourceDrawable2 = ResourceExtKt.getResourceDrawable(getContext(), pni.Z1);
        Drawable resourceDrawable3 = ResourceExtKt.getResourceDrawable(getContext(), pni.G1);
        if (AppUtil.isRTLDirection()) {
            this.f12346b.setCompoundDrawablesWithIntrinsicBounds(resourceDrawable3, (Drawable) null, resourceDrawable, (Drawable) null);
        } else {
            this.f12346b.setCompoundDrawablesWithIntrinsicBounds(resourceDrawable, (Drawable) null, resourceDrawable2, (Drawable) null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12345a = (TextView) findViewById(eri.Po);
        this.c = (TextView) findViewById(eri.ci);
        this.f12346b = (TextView) findViewById(eri.xo);
    }

    public DataHeaderTargetItemV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public DataHeaderTargetItemV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
