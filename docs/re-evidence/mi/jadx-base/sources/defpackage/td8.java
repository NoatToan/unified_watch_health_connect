package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class td8 extends adm {
    @Override // defpackage.adm
    public Metadata b(mtf mtfVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new okh(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(okh okhVar) {
        return new EventMessage((String) rk1.e(okhVar.x()), (String) rk1.e(okhVar.x()), okhVar.F(), okhVar.F(), Arrays.copyOfRange(okhVar.d(), okhVar.e(), okhVar.f()));
    }
}
