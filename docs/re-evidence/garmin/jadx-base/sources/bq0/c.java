package bq0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lbq0/c;", "", "", "maxImageSizeMb", "maxResizeableImageResolution", "<init>", "(II)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19481c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19483b;

    static {
        new a(null);
    }

    public /* synthetic */ c(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 1 : i14, (i16 & 2) != 0 ? 15000 : i15);
    }

    public final zp0.f a(Context context, k kVar, Long l14) throws Exception {
        int i14 = this.f19482a;
        context.getClass();
        kVar.getClass();
        String str = kVar.f19511c;
        Uri uri = kVar.f19509a;
        try {
            Bitmap bitmap = (Bitmap) com.bumptech.glide.b.c(context).c(context).g().H(uri).L().get();
            if (bitmap == null) {
                throw new IllegalArgumentException("Could not load image with uri " + uri + " to bitmap.");
            }
            int width = bitmap.getWidth();
            int i15 = this.f19483b;
            if (width > i15 || bitmap.getHeight() > i15) {
                throw new ImageTooLargeException("Image too large, actual size " + bitmap.getWidth() + "x" + bitmap.getHeight() + ", max supported " + i15 + "x" + i15);
            }
            a2 a2Var = a2.IMAGE_LOADER;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "ImageLoader loadImage -> Trying to resize image to less than " + i14 + " MB...");
            zp0.f fVarC = c22.q.c(bitmap, i14);
            if (fVarC == null) {
                throw new ImageTooLargeException("Image too large, max image size supported " + i14 + " MB");
            }
            i2.a.a(a2Var, "ImageLoader loadImage -> Image resized successfully from " + kVar.f19512d + " MB to " + (((double) fVarC.f206588a.length) / 1048576.0d) + " MB. Original extension: " + str + ". Resulted extension: " + fVarC.f206589b);
            return fVarC;
        } catch (Exception e4) {
            a2 a2Var2 = a2.IMAGE_LOADER;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "loadImage ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "ImageLoader", strD);
            int i16 = bq0.a.f19480a;
            if (l14 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("activityId", String.valueOf(l14.longValue()));
                bundle.putString("ImageSize", String.valueOf(0));
                bundle.putString("Type", str);
                bundle.putString(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "exception: " + e4);
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "ActivityUploadImageInfo");
            }
            throw e4;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbq0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(int i14, int i15) {
        this.f19482a = i14;
        this.f19483b = i15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        int i14 = 0;
        this(i14, i14, 3, null);
    }
}
