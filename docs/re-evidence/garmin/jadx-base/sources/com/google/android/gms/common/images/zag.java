package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i14) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i14;
    }

    public abstract void zaa(Drawable drawable, boolean z14, boolean z15, boolean z16);

    public final void zab(Context context, zam zamVar, boolean z14) {
        int i14 = this.zab;
        zaa(i14 != 0 ? context.getResources().getDrawable(i14) : null, z14, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z14) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
