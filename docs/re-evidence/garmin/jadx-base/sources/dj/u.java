package dj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface u {

    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f59874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f59875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi.b f59876c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, xi.b bVar) {
            this.f59874a = byteBuffer;
            this.f59875b = list;
            this.f59876c = bVar;
        }

        @Override // dj.u
        public final void a() {
        }

        @Override // dj.u
        public final Bitmap b(BitmapFactory.Options options) {
            return s.a(new qj.a.C2733a(qj.a.c(this.f59874a)), options, this);
        }

        @Override // dj.u
        public final boolean c() {
            ByteBuffer byteBufferC = qj.a.c(this.f59874a);
            if (byteBufferC == null) {
                return false;
            }
            return com.bumptech.glide.load.a.e(this.f59875b, new com.bumptech.glide.load.f(byteBufferC, this.f59876c));
        }

        @Override // dj.u
        public final int d() {
            ByteBuffer byteBufferC = qj.a.c(this.f59874a);
            if (byteBufferC == null) {
                return -1;
            }
            return com.bumptech.glide.load.a.b(this.f59875b, new com.bumptech.glide.load.d(byteBufferC, this.f59876c));
        }

        @Override // dj.u
        public final ImageHeaderParser.ImageType getImageType() {
            ByteBuffer byteBufferC = qj.a.c(this.f59874a);
            if (byteBufferC == null) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            return com.bumptech.glide.load.a.d(this.f59875b, new com.bumptech.glide.load.b(byteBufferC));
        }
    }

    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f59877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi.b f59878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f59879c;

        public b(InputStream inputStream, List<ImageHeaderParser> list, xi.b bVar) {
            qj.l.c(bVar, "Argument must not be null");
            this.f59878b = bVar;
            qj.l.c(list, "Argument must not be null");
            this.f59879c = list;
            this.f59877a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // dj.u
        public final void a() {
            y yVar = this.f59877a.f28556a;
            synchronized (yVar) {
                yVar.f59889c = yVar.f59887a.length;
            }
        }

        @Override // dj.u
        public final Bitmap b(BitmapFactory.Options options) {
            y yVar = this.f59877a.f28556a;
            yVar.reset();
            return s.a(yVar, options, this);
        }

        @Override // dj.u
        public final boolean c() {
            y yVar = this.f59877a.f28556a;
            yVar.reset();
            yVar.mark(5242880);
            return com.bumptech.glide.load.a.e(this.f59879c, new com.bumptech.glide.load.g(yVar, this.f59878b));
        }

        @Override // dj.u
        public final int d() {
            y yVar = this.f59877a.f28556a;
            yVar.reset();
            return com.bumptech.glide.load.a.a(yVar, this.f59879c, this.f59878b);
        }

        @Override // dj.u
        public final ImageHeaderParser.ImageType getImageType() {
            y yVar = this.f59877a.f28556a;
            yVar.reset();
            return com.bumptech.glide.load.a.c(yVar, this.f59879c, this.f59878b);
        }
    }

    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi.b f59880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f59881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f59882c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, xi.b bVar) {
            qj.l.c(bVar, "Argument must not be null");
            this.f59880a = bVar;
            qj.l.c(list, "Argument must not be null");
            this.f59881b = list;
            this.f59882c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // dj.u
        public final void a() {
        }

        @Override // dj.u
        public final Bitmap b(BitmapFactory.Options options) throws Throwable {
            boolean zC;
            FileDescriptor fileDescriptor = this.f59882c.b().getFileDescriptor();
            int i14 = Build.VERSION.SDK_INT;
            Bitmap bitmapB = null;
            if (i14 == 34) {
                qj.f fVar = s.b.f59865a;
                if ((i14 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) s.b.f59865a.get()).booleanValue() : false) {
                    try {
                        zC = c();
                    } catch (IOException unused) {
                        zC = false;
                    }
                    if (zC) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        qj.l.a(config == config2, "");
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapB;
                            }
                            try {
                                bitmapB = s.b(bitmapDecodeFileDescriptor);
                            } catch (Throwable th3) {
                                th = th3;
                                bitmapB = bitmapDecodeFileDescriptor;
                                if (bitmapB != null) {
                                    bitmapB.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapB;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            }
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }

        @Override // dj.u
        public final boolean c() {
            return com.bumptech.glide.load.a.e(this.f59881b, new com.bumptech.glide.load.h(this.f59882c, this.f59880a));
        }

        @Override // dj.u
        public final int d() {
            return com.bumptech.glide.load.a.b(this.f59881b, new com.bumptech.glide.load.e(this.f59882c, this.f59880a));
        }

        @Override // dj.u
        public final ImageHeaderParser.ImageType getImageType() {
            return com.bumptech.glide.load.a.d(this.f59881b, new com.bumptech.glide.load.c(this.f59882c, this.f59880a));
        }
    }

    void a();

    Bitmap b(BitmapFactory.Options options);

    boolean c();

    int d();

    ImageHeaderParser.ImageType getImageType();
}
