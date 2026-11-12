package ht;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface i {
    static /* synthetic */ void c(i iVar, k kVar, m mVar, l lVar, int i14) {
        if ((i14 & 2) != 0) {
            mVar = null;
        }
        if ((i14 & 4) != 0) {
            lVar = null;
        }
        iVar.b(kVar, mVar, lVar, null);
    }

    void a(o oVar);

    void b(k kVar, m mVar, l lVar, List<n> list);
}
