package yc;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyc/i3;", "", "Key", "Value", "", "Lyc/h3$b$c;", "pages", "", "anchorPosition", "Lyc/u2;", "config", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lyc/u2;I)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i3<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h3.b.c<Key, Value>> f196061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f196062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f196063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f196064d;

    public i3(List<h3.b.c<Key, Value>> list, Integer num, u2 u2Var, int i14) {
        list.getClass();
        u2Var.getClass();
        this.f196061a = list;
        this.f196062b = num;
        this.f196063c = u2Var;
        this.f196064d = i14;
    }

    public final h3.b.c<Key, Value> a(int i14) {
        List<h3.b.c<Key, Value>> list = this.f196061a;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h3.b.c) it.next()).f196016a.isEmpty()) {
                int size = i14 - this.f196064d;
                int i15 = 0;
                while (i15 < list.size() - 1 && size > p13.x.j(list.get(i15).f196016a)) {
                    size -= list.get(i15).f196016a.size();
                    i15++;
                }
                return size < 0 ? (h3.b.c) p13.h0.b0(list) : list.get(i15);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f196061a.equals(i3Var.f196061a) && p005kotlin.jvm.internal.s.g(this.f196062b, i3Var.f196062b) && this.f196063c.equals(i3Var.f196063c) && this.f196064d == i3Var.f196064d;
    }

    public final int hashCode() {
        int iHashCode = this.f196061a.hashCode();
        Integer num = this.f196062b;
        return Integer.hashCode(this.f196064d) + this.f196063c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PagingState(pages=");
        sb3.append(this.f196061a);
        sb3.append(", anchorPosition=");
        sb3.append(this.f196062b);
        sb3.append(", config=");
        sb3.append(this.f196063c);
        sb3.append(", leadingPlaceholderCount=");
        return ds.e0.j(sb3, this.f196064d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
