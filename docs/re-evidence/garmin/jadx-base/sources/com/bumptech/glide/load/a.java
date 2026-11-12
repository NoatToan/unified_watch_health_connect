package com.bumptech.glide.load;

import dj.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    public class C0436a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f28525a;

        public C0436a(InputStream inputStream) {
            this.f28525a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.e
        public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            InputStream inputStream = this.f28525a;
            try {
                return imageHeaderParser.d(inputStream);
            } finally {
                inputStream.reset();
            }
        }
    }

    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f28526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xi.b f28527b;

        public b(InputStream inputStream, xi.b bVar) {
            this.f28526a = inputStream;
            this.f28527b = bVar;
        }

        @Override // com.bumptech.glide.load.a.d
        public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
            InputStream inputStream = this.f28526a;
            try {
                return imageHeaderParser.a(inputStream, this.f28527b);
            } finally {
                inputStream.reset();
            }
        }
    }

    public interface c {
        boolean a(ImageHeaderParser imageHeaderParser);
    }

    public interface d {
        int a(ImageHeaderParser imageHeaderParser);
    }

    public interface e {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    private a() {
    }

    public static int a(InputStream inputStream, List list, xi.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return b(list, new b(inputStream, bVar));
    }

    public static int b(List<ImageHeaderParser> list, d dVar) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iA = dVar.a(list.get(i14));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType c(InputStream inputStream, List list, xi.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new C0436a(inputStream));
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, e eVar) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            ImageHeaderParser.ImageType imageTypeA = eVar.a(list.get(i14));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean e(List<ImageHeaderParser> list, c cVar) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (cVar.a(list.get(i14))) {
                return true;
            }
        }
        return false;
    }
}
