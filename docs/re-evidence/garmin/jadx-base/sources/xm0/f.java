package xm0;

import androidx.lifecycle.z0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f implements z0, p005kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f191389a;

    public f(e eVar) {
        this.f191389a = eVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
            return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final o13.h<?> getFunctionDelegate() {
        return new p005kotlin.jvm.internal.q(1, this.f191389a, e.class, "onLeaderboardTypeChanged", "onLeaderboardTypeChanged(Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupLeaderboardType;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        j10.d dVar = (j10.d) obj;
        dVar.getClass();
        e eVar = this.f191389a;
        ArrayList arrayList = eVar.f191359f;
        if (arrayList == null) {
            p005kotlin.jvm.internal.s.m("validLeaderboardTypeList");
            throw null;
        }
        int iIndexOf = arrayList.indexOf(dVar);
        k32.c<d> cVar = eVar.f191360g;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("chipHolderGroup");
            throw null;
        }
        ArrayList arrayList2 = eVar.f191358e;
        if (arrayList2 == null) {
            p005kotlin.jvm.internal.s.m("allChipTypes");
            throw null;
        }
        List listC = p13.w.c(arrayList2.get(iIndexOf));
        Iterator<T> it = cVar.f102673a.iterator();
        while (it.hasNext()) {
            k32.e eVar2 = (k32.e) it.next();
            eVar2.c(listC.contains(eVar2.f102677b));
        }
        ViewPager2 viewPager2 = eVar.f191361h;
        if (viewPager2 != null) {
            viewPager2.c(iIndexOf, false);
        } else {
            p005kotlin.jvm.internal.s.m("viewPager");
            throw null;
        }
    }
}
