package com.bumptech.glide.load;

import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.f73;
import defpackage.fak;
import defpackage.nj1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    public class C0135a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f6954a;

        public C0135a(InputStream inputStream) {
            this.f6954a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f6954a);
            } finally {
                this.f6954a.reset();
            }
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f6955a;

        public b(ByteBuffer byteBuffer) {
            this.f6955a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f6955a);
            } finally {
                f73.d(this.f6955a);
            }
        }
    }

    public class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj1 f6957b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, nj1 nj1Var) {
            this.f6956a = parcelFileDescriptorRewinder;
            this.f6957b = nj1Var;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            fak fakVar = null;
            try {
                fak fakVar2 = new fak(new FileInputStream(this.f6956a.a().getFileDescriptor()), this.f6957b);
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(fakVar2);
                    fakVar2.c();
                    this.f6956a.a();
                    return imageTypeB;
                } catch (Throwable th) {
                    th = th;
                    fakVar = fakVar2;
                    if (fakVar != null) {
                        fakVar.c();
                    }
                    this.f6956a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f6958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj1 f6959b;

        public d(ByteBuffer byteBuffer, nj1 nj1Var) {
            this.f6958a = byteBuffer;
            this.f6959b = nj1Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f6958a, this.f6959b);
            } finally {
                f73.d(this.f6958a);
            }
        }
    }

    public class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f6960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj1 f6961b;

        public e(InputStream inputStream, nj1 nj1Var) {
            this.f6960a = inputStream;
            this.f6961b = nj1Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f6960a, this.f6961b);
            } finally {
                this.f6960a.reset();
            }
        }
    }

    public class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f6962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj1 f6963b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, nj1 nj1Var) {
            this.f6962a = parcelFileDescriptorRewinder;
            this.f6963b = nj1Var;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            fak fakVar = null;
            try {
                fak fakVar2 = new fak(new FileInputStream(this.f6962a.a().getFileDescriptor()), this.f6963b);
                try {
                    int iA = imageHeaderParser.a(fakVar2, this.f6963b);
                    fakVar2.c();
                    this.f6962a.a();
                    return iA;
                } catch (Throwable th) {
                    th = th;
                    fakVar = fakVar2;
                    if (fakVar != null) {
                        fakVar.c();
                    }
                    this.f6962a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @RequiresApi(21)
    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, nj1 nj1Var) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, nj1Var));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, nj1 nj1Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new fak(inputStream, nj1Var);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, nj1Var));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, nj1 nj1Var) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, nj1Var));
    }

    public static int d(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = gVar.a(list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    @RequiresApi(21)
    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, nj1 nj1Var) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, nj1Var));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, nj1 nj1Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new fak(inputStream, nj1Var);
        }
        inputStream.mark(5242880);
        return h(list, new C0135a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
