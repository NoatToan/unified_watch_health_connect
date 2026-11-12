package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 28)
public final class kw5 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final flb f24359a = flb.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24360b;
    public final int c;
    public final DecodeFormat d;
    public final DownsampleStrategy e;
    public final boolean f;
    public final PreferredColorSpace g;

    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public kw5(int i, int i2, cch cchVar) {
        this.f24360b = i;
        this.c = i2;
        this.d = (DecodeFormat) cchVar.c(com.bumptech.glide.load.resource.bitmap.a.f);
        this.e = (DownsampleStrategy) cchVar.c(DownsampleStrategy.h);
        wbh<Boolean> wbhVar = com.bumptech.glide.load.resource.bitmap.a.j;
        this.f = cchVar.c(wbhVar) != null && ((Boolean) cchVar.c(wbhVar)).booleanValue();
        this.g = (PreferredColorSpace) cchVar.c(com.bumptech.glide.load.resource.bitmap.a.g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f24359a.f(this.f24360b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f24360b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(size.getHeight());
            sb.append("] to [");
            sb.append(iRound);
            sb.append("x");
            sb.append(iRound2);
            sb.append("] scaleFactor: ");
            sb.append(fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.g;
        if (preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
