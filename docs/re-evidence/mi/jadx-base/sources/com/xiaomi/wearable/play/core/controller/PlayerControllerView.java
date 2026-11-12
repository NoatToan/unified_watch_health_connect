package com.xiaomi.wearable.play.core.controller;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.l0i;
import defpackage.msi;
import defpackage.soi;
import defpackage.tvi;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerControllerView extends PlayerControllerViewBase {
    public SeekBar d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public RelativeLayout i;
    public ProgressBar j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f14427k;
    public boolean l;
    public boolean m;

    public PlayerControllerView(Context context) {
        super(context);
        this.m = false;
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void c() {
        this.i.setOnClickListener(this.c);
        this.d.setOnClickListener(this.c);
        this.h.setOnClickListener(this.c);
        this.d.setOnSeekBarChangeListener(this.f14428a.k());
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void d() {
        View.inflate(getContext(), tvi.e, this);
        this.d = (SeekBar) findViewById(msi.l);
        this.e = (ImageView) findViewById(msi.f);
        this.i = (RelativeLayout) findViewById(msi.g);
        this.f = (TextView) findViewById(msi.m);
        this.g = (TextView) findViewById(msi.i);
        this.h = (ImageView) findViewById(msi.c);
        this.j = (ProgressBar) findViewById(msi.e);
        this.f14427k = (RelativeLayout) findViewById(msi.f27162a);
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void e(String str, String str2) {
        this.f.setText(str);
        this.g.setText(str2);
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void f(int i, int i2) {
        if (i >= 0) {
            this.j.setProgress(i);
        }
        if (i2 >= 0) {
            this.j.setSecondaryProgress(i2);
        }
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void g() {
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public View getAnimationView() {
        return this.f14427k;
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void h(String str) {
        this.f.setText(str);
    }

    public final void i(boolean z) {
        if (z) {
            if (this.l) {
                this.h.setImageResource(soi.f33841a);
                return;
            } else {
                this.h.setImageResource(soi.f33842b);
                return;
            }
        }
        if (this.l) {
            this.h.setImageResource(soi.c);
        } else {
            this.h.setImageResource(soi.d);
        }
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void setLock(Boolean bool) {
        super.setLock(bool);
        if (bool.booleanValue()) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void setPlayImage(boolean z) {
        this.m = z;
        i(z);
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void setSeekBar(int i) {
        this.d.setProgress(i);
    }

    @Override // com.xiaomi.wearable.play.core.controller.PlayerControllerViewBase
    public void setViewData(l0i l0iVar) {
    }
}
