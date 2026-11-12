package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class uj1 implements zud<Object> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zud
    public <E> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
        vpdVar.c(appendable);
        boolean z = false;
        for (Object obj : (Object[]) e) {
            if (z) {
                vpdVar.m(appendable);
            } else {
                z = true;
            }
            ypd.d(obj, appendable, vpdVar);
        }
        vpdVar.d(appendable);
    }
}
