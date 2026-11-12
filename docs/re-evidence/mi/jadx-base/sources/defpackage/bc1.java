package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(28)
public final class bc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f4041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj1 f4042b;

    public static final class a implements kqk<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f4043a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f4043a = animatedImageDrawable;
        }

        @Override // defpackage.kqk
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // defpackage.kqk
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f4043a;
        }

        @Override // defpackage.kqk
        public int getSize() {
            return this.f4043a.getIntrinsicWidth() * this.f4043a.getIntrinsicHeight() * ulq.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // defpackage.kqk
        public void recycle() {
            this.f4043a.stop();
            this.f4043a.clearAnimationCallbacks();
        }
    }

    public static final class b implements tqk<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bc1 f4044a;

        public b(bc1 bc1Var) {
            this.f4044a = bc1Var;
        }

        @Override // defpackage.tqk
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public kqk<Drawable> b(ByteBuffer byteBuffer, int i, int i2, cch cchVar) throws IOException {
            return this.f4044a.b(ImageDecoder.createSource(byteBuffer), i, i2, cchVar);
        }

        @Override // defpackage.tqk
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, cch cchVar) throws IOException {
            return this.f4044a.d(byteBuffer);
        }
    }

    public static final class c implements tqk<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bc1 f4045a;

        public c(bc1 bc1Var) {
            this.f4045a = bc1Var;
        }

        @Override // defpackage.tqk
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public kqk<Drawable> b(InputStream inputStream, int i, int i2, cch cchVar) throws IOException {
            return this.f4045a.b(ImageDecoder.createSource(f73.b(inputStream)), i, i2, cchVar);
        }

        @Override // defpackage.tqk
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, cch cchVar) throws IOException {
            return this.f4045a.c(inputStream);
        }
    }

    public bc1(List<ImageHeaderParser> list, nj1 nj1Var) {
        this.f4041a = list;
        this.f4042b = nj1Var;
    }

    public static tqk<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, nj1 nj1Var) {
        return new b(new bc1(list, nj1Var));
    }

    public static tqk<InputStream, Drawable> f(List<ImageHeaderParser> list, nj1 nj1Var) {
        return new c(new bc1(list, nj1Var));
    }

    public kqk<Drawable> b(ImageDecoder.Source source, int i, int i2, cch cchVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new kw5(i, i2, cchVar));
        if (p3d.a(drawableDecodeDrawable)) {
            return new a(u3d.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.f4041a, inputStream, this.f4042b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.f4041a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
