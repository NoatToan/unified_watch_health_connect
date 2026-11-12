package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zab {
    public final a a;
    private int b = 0;
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;
    private boolean f = true;
    public int zab;

    public zab(Uri uri, int i) {
        this.zab = 0;
        this.a = new a(uri);
        this.zab = i;
    }

    public final void a(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    public final void b(Context context, zak zakVar) {
        if (this.f) {
            zaa(null, false, true, false);
        }
    }

    public final void c(Context context, zak zakVar, boolean z) {
        int i = this.zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    public abstract void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    public final boolean zaa(boolean z, boolean z2) {
        return (!this.d || z2 || z) ? false : true;
    }
}
