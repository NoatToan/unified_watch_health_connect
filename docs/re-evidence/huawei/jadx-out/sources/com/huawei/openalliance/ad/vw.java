package com.huawei.openalliance.ad;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes41.dex */
public class vw implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f21492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21493b = false;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f21493b) {
            this.f21492a.onCheckedChanged(compoundButton, z);
        } else {
            hw.b("OAIDOnCheckedChangeListener", "not click able");
        }
    }

    public void a(boolean z) {
        this.f21493b = z;
    }

    public vw(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f21492a = onCheckedChangeListener;
    }
}
