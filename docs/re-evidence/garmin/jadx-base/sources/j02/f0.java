package j02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj02/f0;", "Lj02/h;", "Le2/n;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements h<e2.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.v f96068a;

    public f0(e2.v vVar) {
        this.f96068a = vVar;
    }

    @Override // j02.h
    public final long a() {
        return this.f96068a.a();
    }

    public final boolean c() {
        return this.f96068a.i();
    }

    @Override // j02.h
    public final ArrayList e() {
        e2.v vVar = this.f96068a;
        List<e2.n> listE = vVar.e();
        ArrayList arrayList = new ArrayList(p13.y.r(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new e0((e2.n) it.next(), vVar.getOrientation()));
        }
        return arrayList;
    }

    @Override // j02.h
    public final b2 getOrientation() {
        return this.f96068a.getOrientation();
    }
}
