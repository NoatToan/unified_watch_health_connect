package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tio implements tqk<InputStream, kza> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f34747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tqk<ByteBuffer, kza> f34748b;
    public final nj1 c;

    public tio(List<ImageHeaderParser> list, tqk<ByteBuffer, kza> tqkVar, nj1 nj1Var) {
        this.f34747a = list;
        this.f34748b = tqkVar;
        this.c = nj1Var;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<kza> b(InputStream inputStream, int i, int i2, cch cchVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f34748b.b(ByteBuffer.wrap(bArrE), i, i2, cchVar);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, cch cchVar) throws IOException {
        return !((Boolean) cchVar.c(uza.f36308b)).booleanValue() && a.f(this.f34747a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
