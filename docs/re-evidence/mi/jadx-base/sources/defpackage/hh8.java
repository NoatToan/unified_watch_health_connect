package defpackage;

import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(27)
public final class hh8 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, nj1 nj1Var) throws IOException {
        int iH = new gh8(inputStream).h("Orientation", 1);
        if (iH == 0) {
            return -1;
        }
        return iH;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(ByteBuffer byteBuffer, nj1 nj1Var) throws IOException {
        return a(f73.g(byteBuffer), nj1Var);
    }
}
