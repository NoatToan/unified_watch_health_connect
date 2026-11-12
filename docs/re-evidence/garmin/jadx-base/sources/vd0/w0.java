package vd0;

import android.net.Uri;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvd0/w0;", "Lcom/yalantis/ucrop/callback/BitmapCropCallback;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements BitmapCropCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Uri> f177423a;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(o53.j<? super Uri> jVar) {
        this.f177423a = jVar;
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onBitmapCropped(Uri uri, int i14, int i15, int i16, int i17) {
        uri.getClass();
        int i18 = o13.q.f128596b;
        this.f177423a.resumeWith(uri);
    }

    @Override // com.yalantis.ucrop.callback.BitmapCropCallback
    public final void onCropFailure(Throwable th3) {
        th3.getClass();
        int i14 = o13.q.f128596b;
        this.f177423a.resumeWith(null);
    }
}
