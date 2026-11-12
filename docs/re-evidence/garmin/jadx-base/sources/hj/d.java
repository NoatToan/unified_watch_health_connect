package hj;

import java.io.File;
import java.io.IOException;
import ui.k;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class d implements k<c> {
    @Override // ui.k
    public final ui.c a(ui.h hVar) {
        return ui.c.SOURCE;
    }

    @Override // ui.d
    public final boolean b(Object obj, File file, ui.h hVar) throws Throwable {
        try {
            qj.a.d(((c) ((u) obj).get()).f83923a.f83933a.f83935a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
