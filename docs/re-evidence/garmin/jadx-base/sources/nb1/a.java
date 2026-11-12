package nb1;

import android.content.Context;
import android.content.Intent;
import f12.l;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import pd1.c;
import tb1.b;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb1/a;", "Lud1/a;", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ud1.a {
    @Override // ud1.a
    public final Intent d(Context context) {
        context.getClass();
        return ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).c(context);
    }

    @Override // ud1.a
    public final String e(Context context) {
        context.getClass();
        return k.g(context.getPackageName(), ".action.ACTION_PREGNANCY_REMINDER");
    }

    @Override // ud1.a
    public final c g() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).O();
    }

    @Override // ud1.a
    public final boolean i(pd1.b bVar) {
        List<Integer> listF;
        List<Integer> listF2 = bVar.f();
        return listF2 == null || listF2.size() != 1 || (listF = bVar.f()) == null || !listF.contains(0);
    }

    @Override // ud1.a
    public final void m(c cVar) {
        cVar.getClass();
        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).u1(cVar);
    }
}
