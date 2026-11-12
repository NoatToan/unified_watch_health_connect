package fj;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import qj.m;
import ui.h;
import ui.j;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f71817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.b f71818b;

    /* JADX INFO: renamed from: fj.a$a, reason: collision with other inner class name */
    public static final class C1460a implements u<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f71819a;

        public C1460a(AnimatedImageDrawable animatedImageDrawable) {
            this.f71819a = animatedImageDrawable;
        }

        @Override // wi.u
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // wi.u
        public final void b() {
            AnimatedImageDrawable animatedImageDrawable = this.f71819a;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // wi.u
        public final Drawable get() {
            return this.f71819a;
        }

        @Override // wi.u
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.f71819a;
            return m.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }
    }

    public static final class b implements j<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f71820a;

        public b(a aVar) {
            this.f71820a = aVar;
        }

        @Override // ui.j
        public final u<Drawable> a(ByteBuffer byteBuffer, int i14, int i15, h hVar) {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f71820a.getClass();
            return a.b(sourceCreateSource, i14, i15, hVar);
        }

        @Override // ui.j
        public final boolean b(ByteBuffer byteBuffer, h hVar) {
            ByteBuffer byteBuffer2 = byteBuffer;
            ImageHeaderParser.ImageType imageTypeD = byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : com.bumptech.glide.load.a.d(this.f71820a.f71817a, new com.bumptech.glide.load.b(byteBuffer2));
            if (imageTypeD != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeD == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    public static final class c implements j<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f71821a;

        public c(a aVar) {
            this.f71821a = aVar;
        }

        @Override // ui.j
        public final u<Drawable> a(InputStream inputStream, int i14, int i15, h hVar) {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(qj.a.b(inputStream));
            this.f71821a.getClass();
            return a.b(sourceCreateSource, i14, i15, hVar);
        }

        @Override // ui.j
        public final boolean b(InputStream inputStream, h hVar) {
            a aVar = this.f71821a;
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(inputStream, aVar.f71817a, aVar.f71818b);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    private a(List<ImageHeaderParser> list, xi.b bVar) {
        this.f71817a = list;
        this.f71818b = bVar;
    }

    public static b a(ArrayList arrayList, xi.b bVar) {
        return new b(new a(arrayList, bVar));
    }

    public static C1460a b(ImageDecoder.Source source, int i14, int i15, h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new cj.a(i14, i15, hVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C1460a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        vb.h.B(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public static c c(ArrayList arrayList, xi.b bVar) {
        return new c(new a(arrayList, bVar));
    }
}
