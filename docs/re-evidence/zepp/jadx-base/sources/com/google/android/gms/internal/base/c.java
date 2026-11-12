package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class c extends Drawable.ConstantState {
    public int a;
    public int b;

    public c(@Nullable c cVar) {
        if (cVar != null) {
            this.a = cVar.a;
            this.b = cVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zaf(this);
    }
}
