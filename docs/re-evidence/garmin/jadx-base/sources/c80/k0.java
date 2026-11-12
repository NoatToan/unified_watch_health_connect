package c80;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lc80/k0;", "", "", "", "types", "", "isDismissible", "dismissOnTap", "", "Lc80/u0;", "dismissOnVisit", "<init>", "(Ljava/util/Set;ZZLjava/util/List;)V", "", "behaviors", "(Ljava/util/Map;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25400e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f25401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<u0> f25404d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    public k0(Map<String, String> map) {
        ?? arrayList;
        String str;
        Object next;
        Set<String> setKeySet = (map == null || (setKeySet = map.keySet()) == null) ? p13.l0.f134950a : setKeySet;
        Boolean boolU = w3.x.u(map != null ? map.get(j0.IS_DISMISSIBLE.f25397a) : null);
        boolean zBooleanValue = boolU != null ? boolU.booleanValue() : true;
        Boolean boolU2 = w3.x.u(map != null ? map.get(j0.DISMISS_ON_TAP.f25397a) : null);
        boolean zBooleanValue2 = boolU2 != null ? boolU2.booleanValue() : true;
        f25400e.getClass();
        if (map == null || (str = map.get(j0.DISMISS_ON_VISIT.f25397a)) == null) {
            arrayList = p13.j0.f134944a;
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            List<String> list = (List) aVar.c(new m63.e(y1.f117048a), str);
            arrayList = new ArrayList();
            for (String str2 : list) {
                u0.f25617b.getClass();
                Iterator it = u0.f25619d.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((u0) next).f25620a, str2));
                u0 u0Var = (u0) next;
                if (u0Var != null) {
                    arrayList.add(u0Var);
                }
            }
        }
        this(setKeySet, zBooleanValue, zBooleanValue2, arrayList);
    }

    public final boolean a() {
        Object next;
        Set<String> set = this.f25401a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            j0.f25391b.getClass();
            Iterator<T> it = j0.f25396g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((j0) next).f25397a, str));
            if (((j0) next) == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.f25401a, k0Var.f25401a) && this.f25402b == k0Var.f25402b && this.f25403c == k0Var.f25403c && p005kotlin.jvm.internal.s.g(this.f25404d, k0Var.f25404d);
    }

    public final int hashCode() {
        return this.f25404d.hashCode() + q6.f.g(q6.f.g(this.f25401a.hashCode() * 31, 31, this.f25402b), 31, this.f25403c);
    }

    public final String toString() {
        return "PromoBehaviors(types=" + this.f25401a + ", isDismissible=" + this.f25402b + ", dismissOnTap=" + this.f25403c + ", dismissOnVisit=" + this.f25404d + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/k0$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(Set<String> set, boolean z14, boolean z15, List<? extends u0> list) {
        set.getClass();
        list.getClass();
        this.f25401a = set;
        this.f25402b = z14;
        this.f25403c = z15;
        this.f25404d = list;
    }
}
