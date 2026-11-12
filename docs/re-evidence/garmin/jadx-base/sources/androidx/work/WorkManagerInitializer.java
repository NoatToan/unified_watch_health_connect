package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ue.i0;
import ue.u;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class WorkManagerInitializer implements zd.b<i0> {
    static {
        u.b("WrkMgrInitializer");
    }

    @Override // zd.b
    public final i0 create(Context context) {
        u.a().getClass();
        a aVar = new a(new a.C0163a());
        i0.f170088a.getClass();
        context.getClass();
        t0.h(context, aVar);
        t0 t0VarG = t0.g(context);
        t0VarG.getClass();
        return t0VarG;
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
