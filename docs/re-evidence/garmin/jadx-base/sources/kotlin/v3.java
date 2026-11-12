package kotlin;

import c53.j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li5/v3;", "Lc53/j;", "Li5/u3;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v3 implements j<u3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91604a = new ArrayList();

    public final void c(Object obj, String str) {
        this.f91604a.add(new u3(str, obj));
    }

    @Override // c53.j
    public final Iterator<u3> iterator() {
        return this.f91604a.iterator();
    }
}
