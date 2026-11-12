package um0;

import e23.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lum0/a;", "", "", "Lwg0/a;", "newsFeedList", "", "nextCursor", "", "dayLimit", "", "useCache", "<init>", "(Ljava/util/List;Ljava/lang/String;IZ)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<wg0.a> f171990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f171991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f171993d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(List list, String str, int i14, boolean z14, int i15, j jVar) {
        if ((i15 & 1) != 0) {
            list = Collections.synchronizedList(new ArrayList());
            list.getClass();
        }
        this(list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? 90 : i14, (i15 & 8) != 0 ? false : z14);
    }

    public final boolean a(l<? super wg0.a, Boolean> lVar) {
        boolean zRemoveIf;
        synchronized (this.f171990a) {
            zRemoveIf = this.f171990a.removeIf(new s52.e(new ta0.j(lVar, 12), 6));
        }
        return zRemoveIf;
    }

    public final void b(wg0.a aVar, l<? super wg0.a, Boolean> lVar) {
        Object next;
        synchronized (this.f171990a) {
            try {
                Iterator<T> it = this.f171990a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!lVar.invoke((wg0.a) next).booleanValue());
                wg0.a aVar2 = (wg0.a) next;
                if (aVar2 == null) {
                    return;
                }
                int iIndexOf = this.f171990a.indexOf(aVar2);
                if (iIndexOf != -1) {
                    this.f171990a.set(iIndexOf, aVar);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f171990a, aVar.f171990a) && s.g(this.f171991b, aVar.f171991b) && this.f171992c == aVar.f171992c && this.f171993d == aVar.f171993d;
    }

    public final int hashCode() {
        int iHashCode = this.f171990a.hashCode() * 31;
        String str = this.f171991b;
        return Boolean.hashCode(this.f171993d) + q2.d(this.f171992c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "GroupFeedCache(newsFeedList=" + this.f171990a + ", nextCursor=" + this.f171991b + ", dayLimit=" + this.f171992c + ", useCache=" + this.f171993d + ")";
    }

    public a(List<wg0.a> list, String str, int i14, boolean z14) {
        list.getClass();
        this.f171990a = list;
        this.f171991b = str;
        this.f171992c = i14;
        this.f171993d = z14;
    }

    public a() {
        this(null, null, 0, false, 15, null);
    }
}
