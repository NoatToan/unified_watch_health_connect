package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sdb extends pdb {
    @Override // defpackage.pdb
    public boolean b(n08 n08Var) {
        if (q08.a(a())) {
            return true;
        }
        List listAsList = Arrays.asList(a().toUpperCase().split(";"));
        Iterator<String> it = u08.h(n08Var.getUserAgent()).iterator();
        while (it.hasNext()) {
            if (listAsList.contains(it.next().toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
