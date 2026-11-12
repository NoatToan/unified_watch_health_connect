package st;

import android.content.Context;
import tt.n;
import u13.f;
import v13.i;
import zp0.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final Object a(n nVar, Context context, i iVar) {
        String profileImg;
        if (nVar == null || (profileImg = nVar.getProfileImg()) == null) {
            return null;
        }
        t13.i iVar2 = new t13.i(f.b(iVar));
        c.f206560v.getClass();
        c cVarA = c.a.a(context);
        cVarA.f206565e = profileImg;
        cVarA.d(new a(iVar2));
        Object objA = iVar2.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }
}
