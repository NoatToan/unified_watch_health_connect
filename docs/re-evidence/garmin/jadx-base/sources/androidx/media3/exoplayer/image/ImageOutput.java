package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9170a = new a();

    public class a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j8, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j8, Bitmap bitmap);
}
