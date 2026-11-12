package hj;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class j implements ui.j<InputStream, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f83960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui.j<ByteBuffer, c> f83961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi.b f83962c;

    public j(List<ImageHeaderParser> list, ui.j<ByteBuffer, c> jVar, xi.b bVar) {
        this.f83960a = list;
        this.f83961b = jVar;
        this.f83962c = bVar;
    }

    @Override // ui.j
    public final u<c> a(InputStream inputStream, int i14, int i15, ui.h hVar) {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i16 = inputStream2.read(bArr);
                if (i16 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i16);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f83961b.a(ByteBuffer.wrap(byteArray), i14, i15, hVar);
    }

    @Override // ui.j
    public final boolean b(InputStream inputStream, ui.h hVar) {
        return !((Boolean) hVar.c(i.f83959b)).booleanValue() && com.bumptech.glide.load.a.c(inputStream, this.f83960a, this.f83962c) == ImageHeaderParser.ImageType.GIF;
    }
}
