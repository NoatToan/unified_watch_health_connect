package l33;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f109718a;

    public d0(e0 e0Var) {
        this.f109718a = e0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = e0.f109726m;
        HashMap map = new HashMap();
        for (Map.Entry entry : ((Map) gl1.d.B(this.f109718a.f109729i, e0.f109726m[0])).entrySet()) {
            String str = (String) entry.getKey();
            q33.x xVar = (q33.x) entry.getValue();
            g43.c cVarD = g43.c.d(str);
            r33.a aVarA = xVar.a();
            int i14 = e0.a.f109733a[aVarA.f150095a.ordinal()];
            if (i14 == 1) {
                String str2 = aVarA.f150100f;
                if (aVarA.f150095a != r33.a.EnumC2820a.MULTIFILE_CLASS_PART) {
                    str2 = null;
                }
                if (str2 != null) {
                    map.put(cVarD, g43.c.d(str2));
                }
            } else if (i14 == 2) {
                map.put(cVarD, cVarD);
            }
        }
        return map;
    }
}
