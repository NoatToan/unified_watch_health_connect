package rc;

import android.os.Bundle;
import androidx.lifecycle.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import lc.q0;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrc/n;", "Lrc/a;", "Landroidx/lifecycle/j1;", "handle", "", "", "Llc/q0;", "typeMap", "<init>", "(Landroidx/lifecycle/j1;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f151856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, q0<?>> f151857b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(j1 j1Var, Map<String, ? extends q0<?>> map) {
        j1Var.getClass();
        map.getClass();
        this.f151856a = j1Var;
        this.f151857b = map;
    }

    @Override // rc.a
    public final boolean a(String str) {
        str.getClass();
        j1 j1Var = this.f151856a;
        j1Var.getClass();
        t9.a aVar = j1Var.f7945b;
        aVar.getClass();
        return aVar.f163193a.containsKey(str);
    }

    @Override // rc.a
    public final Object b(String str) {
        p[] pVarArr;
        str.getClass();
        j1 j1Var = this.f151856a;
        Map mapB = t0.b(new p(str, j1Var.a(str)));
        if (mapB.isEmpty()) {
            pVarArr = new p[0];
        } else {
            ArrayList arrayList = new ArrayList(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                arrayList.add(new p((String) entry.getKey(), entry.getValue()));
            }
            pVarArr = (p[]) arrayList.toArray(new p[0]);
        }
        Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
        q0<?> q0Var = this.f151857b.get(str);
        if (q0Var != null) {
            return q0Var.a(bundleA, str);
        }
        u0.u("Failed to find type for ", str, " when decoding ", j1Var);
        return null;
    }
}
