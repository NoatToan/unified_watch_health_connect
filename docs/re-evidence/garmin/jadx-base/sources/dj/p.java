package dj;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, xi.b bVar) {
        int iD = new d8.a(inputStream).d(1, "Orientation");
        if (iD == 0) {
            return -1;
        }
        return iD;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean b(InputStream inputStream, xi.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(ByteBuffer byteBuffer, xi.b bVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int f(ByteBuffer byteBuffer, xi.b bVar) {
        AtomicReference<byte[]> atomicReference = qj.a.f144956a;
        return a(new qj.a.C2733a(byteBuffer), bVar);
    }
}
