package jj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<mj.d> f98930a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f98931b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98932c;

    public final boolean a(mj.d dVar) {
        boolean z14 = true;
        if (dVar == null) {
            return true;
        }
        boolean zRemove = this.f98930a.remove(dVar);
        if (!this.f98931b.remove(dVar) && !zRemove) {
            z14 = false;
        }
        if (z14) {
            dVar.clear();
        }
        return z14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("{numRequests=");
        sb3.append(this.f98930a.size());
        sb3.append(", isPaused=");
        return hb.a.k(sb3, this.f98932c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
