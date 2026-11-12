package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class adm implements itf {
    @Override // defpackage.itf
    public final Metadata a(mtf mtfVar) {
        ByteBuffer byteBuffer = (ByteBuffer) rk1.e(mtfVar.c);
        rk1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (mtfVar.m()) {
            return null;
        }
        return b(mtfVar, byteBuffer);
    }

    public abstract Metadata b(mtf mtfVar, ByteBuffer byteBuffer);
}
