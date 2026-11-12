package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.tsmclient.sesdk.OrderData;
import defpackage.mri;
import defpackage.o0j;
import defpackage.sui;
import defpackage.wni;

/* JADX INFO: loaded from: classes9.dex */
public class RechargeFeeItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12651b;
    public View c;
    public View d;

    public RechargeFeeItemView(Context context) {
        super(context);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(sui.G0, this);
        this.d = findViewById(mri.T0);
        this.f12650a = (TextView) findViewById(mri.m);
        this.f12651b = (TextView) findViewById(mri.C1);
        this.c = findViewById(mri.E2);
    }

    public void b(OrderData.Fee fee, boolean z) {
        this.f12650a.setText(String.format(getContext().getString(o0j.O1), Float.valueOf((fee.getRechargeFee() * 1.0f) / 100.0f)));
        this.f12651b.setText(String.format(getContext().getString(o0j.N1), Float.valueOf(fee.getRechargeFee() / 100.0f)));
        if (fee.isSuggested()) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (z) {
            this.d.setBackgroundResource(wni.q);
        } else {
            this.d.setBackgroundResource(wni.p);
        }
    }

    public RechargeFeeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public RechargeFeeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
