package e63;

import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le63/d;", "T", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f63242a = new ArrayList();

    public final void a(o<? super T> oVar) {
        oVar.getClass();
        boolean z14 = oVar instanceof s;
        ArrayList arrayList = this.f63242a;
        if (z14) {
            arrayList.add(oVar);
        } else {
            if (!(oVar instanceof h)) {
                u0.r();
                return;
            }
            Iterator<T> it = ((h) oVar).f63248a.iterator();
            while (it.hasNext()) {
                arrayList.add((s) it.next());
            }
        }
    }
}
