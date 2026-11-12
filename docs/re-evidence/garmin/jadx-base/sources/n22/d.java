package n22;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f122377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122378b;

    public d(Bitmap bitmap, int i14) {
        this.f122377a = bitmap;
        this.f122378b = i14 % 360;
    }

    public d(Bitmap bitmap) {
        this.f122377a = bitmap;
        this.f122378b = 0;
    }
}
