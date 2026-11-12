package pk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public interface c0 extends z {

    public interface a {
        void b(String str, wk2.f fVar, wk2.e eVar);

        void c(String str, UUID uuid, CoreTransferException coreTransferException);
    }

    Object d(rs2.c cVar, wk2.f fVar, CoreTransferException coreTransferException, v13.c cVar2);

    boolean h(rs2.c cVar, wk2.f fVar);

    void l(b0 b0Var);

    Object o(rs2.c cVar, boolean z14, f fVar);
}
