package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le63/h;", "T", "Le63/o;", "", "Le63/s;", "formats", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h<T> implements o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s<T>> f63248a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends s<? super T>> list) {
        list.getClass();
        this.f63248a = list;
    }

    @Override // e63.o
    public f63.e<T> a() {
        List<s<T>> list = this.f63248a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).a());
        }
        return arrayList.size() == 1 ? (f63.e) h0.I0(arrayList) : new f63.a(arrayList);
    }

    @Override // e63.o
    public g63.o<T> b() {
        List<s<T>> list = this.f63248a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).b());
        }
        return zf.b.j(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f63248a.equals(((h) obj).f63248a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63248a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("ConcatenatedFormatStructure("), h0.k0(this.f63248a, ", ", null, null, null, 62), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
