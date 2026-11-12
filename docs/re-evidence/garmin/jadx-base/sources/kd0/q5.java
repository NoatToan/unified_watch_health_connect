package kd0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkd0/q5;", "Ld80/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q5 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f104316a;

    /* JADX WARN: Multi-variable type inference failed */
    public q5(t13.d<? super Boolean> dVar) {
        this.f104316a = dVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        int i14 = o13.q.f128596b;
        this.f104316a.resumeWith(Boolean.FALSE);
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        ArrayList arrayList;
        aVar.getClass();
        List list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((bm2.c) obj2).J0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z14 = (arrayList != null ? arrayList.size() : 0) > 1;
        int i14 = o13.q.f128596b;
        this.f104316a.resumeWith(Boolean.valueOf(z14));
    }
}
