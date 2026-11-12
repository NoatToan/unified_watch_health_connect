package ok2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.List;
import java.util.UUID;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public interface w extends xk2.b, z {

    public static final class a {
        public static /* synthetic */ void a(w wVar, y yVar, u91.i iVar, int i14) {
            if ((i14 & 1) != 0) {
                yVar = new y();
            }
            if ((i14 & 2) != 0) {
                iVar = null;
            }
            wVar.r(yVar, iVar);
        }
    }

    Object b(boolean z14, fm2.c.b.a aVar, v13.c cVar);

    void f(y yVar, e23.l<? super al2.c, Unit> lVar);

    boolean l();

    void p();

    Object q(y yVar, t13.d<? super al2.c> dVar);

    void r(y yVar, e23.p<? super al2.b, ? super CoreTransferException, Unit> pVar);

    Object s(UUID uuid, List list, gl2.g gVar);
}
