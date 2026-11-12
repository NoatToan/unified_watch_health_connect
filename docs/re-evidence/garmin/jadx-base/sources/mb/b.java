package mb;

import androidx.media3.common.w;
import fa.r;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kb.b {
    public static a c(r rVar) {
        String strP = rVar.p();
        strP.getClass();
        String strP2 = rVar.p();
        strP2.getClass();
        return new a(strP, strP2, rVar.o(), rVar.o(), Arrays.copyOfRange(rVar.f70054a, rVar.f70055b, rVar.f70056c));
    }

    @Override // kb.b
    public final w b(kb.a aVar, ByteBuffer byteBuffer) {
        return new w(c(new r(byteBuffer.array(), byteBuffer.limit())));
    }
}
