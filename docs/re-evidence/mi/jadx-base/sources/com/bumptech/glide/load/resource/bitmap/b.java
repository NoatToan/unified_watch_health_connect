package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.a6i;
import defpackage.f73;
import defpackage.nj1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f6983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f6984b;
        public final nj1 c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, nj1 nj1Var) {
            this.f6983a = byteBuffer;
            this.f6984b = list;
            this.c = nj1Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.c(this.f6984b, f73.d(this.f6983a), this.c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.f6984b, f73.d(this.f6983a));
        }

        public final InputStream e() {
            return f73.g(f73.d(this.f6983a));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b, reason: collision with other inner class name */
    public static final class C0139b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.c f6985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nj1 f6986b;
        public final List<ImageHeaderParser> c;

        public C0139b(InputStream inputStream, List<ImageHeaderParser> list, nj1 nj1Var) {
            this.f6986b = (nj1) a6i.d(nj1Var);
            this.c = (List) a6i.d(list);
            this.f6985a = new com.bumptech.glide.load.data.c(inputStream, nj1Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
            this.f6985a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.b(this.c, this.f6985a.a(), this.f6986b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f6985a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.c, this.f6985a.a(), this.f6986b);
        }
    }

    @RequiresApi(21)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nj1 f6987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f6988b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, nj1 nj1Var) {
            this.f6987a = (nj1) a6i.d(nj1Var);
            this.f6988b = (List) a6i.d(list);
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public int b() throws IOException {
            return com.bumptech.glide.load.a.a(this.f6988b, this.c, this.f6987a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f6988b, this.c, this.f6987a);
        }
    }

    void a();

    int b() throws IOException;

    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
