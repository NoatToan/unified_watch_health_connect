package xi0;

import am.t1;
import com.garmin.android.apps.connectmobile.f0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxi0/e;", "Lxi0/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lvi0/a;", "ftpAPI", "<init>", "(Lvi0/a;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi0.a f191126a;

    public e(vi0.a aVar) {
        aVar.getClass();
        this.f191126a = aVar;
    }

    @Override // xi0.a
    public final Object a(String str, fz0.c cVar, ArrayList arrayList, hj0.a.C1661a c1661a) {
        return f0.J(this, new c(this, str, cVar, arrayList, null), c1661a);
    }

    @Override // xi0.a
    public final Object b(String str, fz0.c cVar, fz0.c cVar2, List list, t1 t1Var, hj0.a.b.C1663b c1663b) {
        return f0.J(this, new d(this, str, cVar, cVar2, list, t1Var, null), c1663b);
    }

    @Override // xi0.a
    public final Object c(String str, fz0.c cVar, fz0.c cVar2, List list, t1 t1Var, hj0.a.b.C1662a c1662a) {
        return f0.J(this, new b(this, str, cVar, cVar2, list, t1Var, null), c1662a);
    }
}
