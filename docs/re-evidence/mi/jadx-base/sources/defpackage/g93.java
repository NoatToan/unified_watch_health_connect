package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g93 {
    public static String a(c93 c93Var) {
        try {
            return c93Var instanceof x9g ? c(((x9g) c93Var).c().get(0)) : c(c93Var);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> b(c93 c93Var) {
        try {
            if (!(c93Var instanceof x9g)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(c(c93Var));
                return arrayList;
            }
            List<c93> listC = ((x9g) c93Var).c();
            ArrayList arrayList2 = new ArrayList(listC.size());
            for (int i = 0; i < listC.size(); i++) {
                arrayList2.add(c(listC.get(i)));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(c93 c93Var) throws UnsupportedEncodingException {
        return eql.a(c93Var.a().getBytes("UTF-8"));
    }
}
