package gn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n70.a0;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u0001B\u001d\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgn/q;", "Ln70/a0;", "", "Lj70/d;", "Lgs1/f;", "", "", "autoDetectedEvents", "<init>", "(Lj70/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements a0<Collection<? extends j70.d<gs1.f>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<List<String>> f78055a;

    public q(j70.d<List<String>> dVar) {
        dVar.getClass();
        this.f78055a = dVar;
    }

    @Override // n70.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ArrayList invoke() {
        j70.d<List<String>> dVar = this.f78055a;
        List<String> list = dVar.f97521b;
        ArrayList arrayList = null;
        List list2 = (List) a(list != null ? (String) h0.d0(list) : null, new p());
        if (list2 != null) {
            arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new j70.d(dVar.f97520a, (gs1.f) it.next()));
            }
        }
        return arrayList;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetMoveIqDataUseCase";
    }
}
