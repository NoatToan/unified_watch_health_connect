package r22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr22/u1;", "Lr22/m;", "Lkotlin/Function0;", "", "selectionChangedListener", "<init>", "(Le23/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u1 extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f149902f;

    public u1(e23.a<Unit> aVar) {
        super(aVar);
        this.f149902f = -1;
    }

    public final void D(List<t1> list) {
        list.getClass();
        ArrayList arrayList = this.f149751d;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
        Iterator<t1> it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next().f149897g) {
                this.f149902f = i14;
            }
            i14++;
        }
        i14 = -1;
        this.f149902f = i14;
    }

    @Override // r22.m
    public final void g(int i14) {
        int size = i14 - this.f34942a.size();
        if (size < 0) {
            return;
        }
        int i15 = this.f149902f;
        e23.a<Unit> aVar = this.f149750c;
        if (size == i15) {
            C(size);
            this.f149902f = -1;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        C(i15);
        C(size);
        this.f149902f = size;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
