package wc;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.j0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tB1\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lwc/f;", "", "", "Lwc/g;", "mergedHistory", "", "currentIndex", "<init>", "(Ljava/util/List;I)V", "()V", "currentInfo", "backInfo", "forwardInfo", "(Lwc/g;Ljava/util/List;Ljava/util/List;)V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<g> f184240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184241b;

    /* JADX WARN: Multi-variable type inference failed */
    private f(List<? extends g> list, int i14) {
        this.f184240a = list;
        this.f184241b = i14;
        if (list.isEmpty() && i14 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i14 >= 0 && i14 < size) {
                return;
            }
        }
        kg.f.w(b71.i.i(i14, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), x.i(list), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f184241b == fVar.f184241b && s.g(this.f184240a, fVar.f184240a);
    }

    public final int hashCode() {
        return this.f184240a.hashCode() + (this.f184241b * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb3.append(this.f184241b);
        sb3.append(", mergedHistory=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f184240a, sb3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(g gVar, List<? extends g> list) {
        this(gVar, list, null, 4, null);
        gVar.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        this(gVar, null, null, 6, null);
        gVar.getClass();
    }

    public f() {
        this(j0.f134944a, -1);
    }

    public f(g gVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(g gVar, List<? extends g> list, List<? extends g> list2) {
        gVar.getClass();
        list.getClass();
        list2.getClass();
        q13.b bVarB = w.b();
        d0.v(bVarB, list);
        bVarB.add(gVar);
        d0.v(bVarB, list2);
        this(w.a(bVarB), list.size());
    }
}
