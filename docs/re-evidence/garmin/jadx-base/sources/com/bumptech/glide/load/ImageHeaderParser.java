package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f28523a;

        ImageType(boolean z14) {
            this.f28523a = z14;
        }

        public boolean hasAlpha() {
            return this.f28523a;
        }

        public boolean isWebp() {
            int i14 = a.f28524a[ordinal()];
            return i14 == 1 || i14 == 2 || i14 == 3;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28524a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f28524a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28524a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28524a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int a(InputStream inputStream, xi.b bVar);

    boolean b(InputStream inputStream, xi.b bVar);

    ImageType c(ByteBuffer byteBuffer);

    ImageType d(InputStream inputStream);

    boolean e(ByteBuffer byteBuffer, xi.b bVar);

    int f(ByteBuffer byteBuffer, xi.b bVar);
}
