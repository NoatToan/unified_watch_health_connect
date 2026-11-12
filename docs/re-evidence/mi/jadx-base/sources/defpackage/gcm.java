package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class gcm implements frk<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static gcm f18838a;

    public static gcm a() {
        if (f18838a == null) {
            f18838a = new gcm();
        }
        return f18838a;
    }

    @Override // defpackage.frk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
