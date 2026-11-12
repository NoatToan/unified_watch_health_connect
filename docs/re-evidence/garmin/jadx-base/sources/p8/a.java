package p8;

import androidx.health.platform.client.proto.q;
import k23.d;
import org.apache.commons.lang3.e;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final q a(d<? extends q0> dVar) {
        dVar.getClass();
        q.a aVarU = q.u();
        String str = (String) c.f136341b.get(dVar);
        if (str == null) {
            e.w(p6.b.e("Not supported yet: ", dVar));
            return null;
        }
        aVarU.g();
        q.t((q) aVarU.f7677b, str);
        return aVarU.e();
    }
}
