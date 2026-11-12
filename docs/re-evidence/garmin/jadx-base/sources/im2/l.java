package im2;

import java.util.Iterator;
import java.util.List;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim2/l;", "", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements vm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f94333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f94334c;

    public l(List<c83.d<?>> list, l1 l1Var, m0 m0Var) {
        this.f94332a = list;
        this.f94333b = l1Var;
        this.f94334c = m0Var;
    }

    @Override // vm2.b
    public final void cancel() {
        Iterator<T> it = this.f94332a.iterator();
        while (it.hasNext()) {
            ((c83.d) it.next()).cancel();
        }
        this.f94333b.c(null);
        this.f94334c.f105804a = false;
    }
}
