package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes12.dex */
public class ad extends ProgressButton {
    @Override // com.huawei.openalliance.ad.views.ProgressButton
    protected int getTextStart() {
        if (dk.h()) {
            return this.k;
        }
        int width = ((getWidth() - this.f21074a.width()) - this.n) - as.a(getContext(), 8.0f);
        if (width < this.j) {
            width = this.j;
        }
        hw.b("ProgressButtonNew", "safeTextStart: %s", Integer.valueOf(width));
        return width;
    }

    @Override // com.huawei.openalliance.ad.views.ProgressButton
    protected void a(Canvas canvas) {
        int width;
        int height;
        synchronized (this.h) {
            if (this.f21076c != null && this.f21076c.length() > 0) {
                String strIntern = this.f21076c.toString().intern();
                if (this.m) {
                    width = (getWidth() / 2) - this.f21074a.centerX();
                    if (this.l && width < this.i) {
                        width = getTextStart();
                    }
                    height = getHeight() / 2;
                } else {
                    width = (getWidth() - this.f21074a.width()) - as.a(getContext(), 1.0f);
                    if (this.l && width < this.i) {
                        width = getTextStart();
                    }
                    height = getHeight() / 2;
                }
                canvas.drawText((CharSequence) strIntern, 0, strIntern.length(), width, height - this.f21074a.centerY(), this.f21075b);
                a(getWidth(), getHeight());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.ProgressButton
    protected void a(int i, int i2) {
        int width;
        int width2;
        synchronized (this.h) {
            if (this.m) {
                width = (getWidth() / 2) - this.f21074a.centerX();
                if (this.l && width < this.i) {
                    width = getTextStart();
                }
                width2 = this.f21074a.width() + width;
            } else {
                width = (getWidth() - this.f21074a.width()) - as.a(getContext(), 1.0f);
                if (this.l && width < this.i) {
                    width = getTextStart();
                }
                width2 = getWidth();
            }
            if (this.g != null) {
                this.g.setBounds(width, 0, width2, i2);
            }
        }
    }

    public ad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
