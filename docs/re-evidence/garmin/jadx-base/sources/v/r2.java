package v;

import android.media.ImageWriter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements ImageWriter.OnImageReleasedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.e f174005a;

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) throws Exception {
        this.f174005a.close();
    }
}
