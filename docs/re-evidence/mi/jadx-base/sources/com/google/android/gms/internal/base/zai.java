package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
final class zai extends Drawable.ConstantState {
    int mChangingConfigurations;
    int zanv;

    public zai(zai zaiVar) {
        if (zaiVar != null) {
            this.mChangingConfigurations = zaiVar.mChangingConfigurations;
            this.zanv = zaiVar.zanv;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zae(this);
    }
}
