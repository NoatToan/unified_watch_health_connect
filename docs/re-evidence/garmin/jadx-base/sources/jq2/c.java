package jq2;

import com.google.common.primitives.UnsignedBytes;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Ljq2/c;", "", "", "", "Ljq2/d;", "transactionSystemMap", "Ljq2/e;", "transactionTypeMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "a", "Ljava/util/Map;", "getTransactionSystemMap", "()Ljava/util/Map;", "b", "getTransactionTypeMap", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransactionSystemMap")
    private final Map<Integer, d> transactionSystemMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransactionType")
    private final Map<Integer, e> transactionTypeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Map<Integer, d> map, Map<Integer, ? extends e> map2) {
        map.getClass();
        map2.getClass();
        this.transactionSystemMap = map;
        this.transactionTypeMap = map2;
    }

    public final a a(iq2.c cVar) {
        a iconType;
        cVar.getClass();
        d dVar = this.transactionSystemMap.get(Integer.valueOf(cVar.f94742f & UnsignedBytes.MAX_VALUE));
        return (dVar == null || (iconType = dVar.getIconType()) == null) ? a.Purchase : iconType;
    }

    public final String b(iq2.c cVar) {
        List<b> listB;
        Object next;
        String name;
        cVar.getClass();
        d dVar = this.transactionSystemMap.get(Integer.valueOf(cVar.f94742f & UnsignedBytes.MAX_VALUE));
        if (dVar == null || (listB = dVar.b()) == null) {
            return "";
        }
        Iterator<T> it = listB.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != (cVar.f94743g & UnsignedBytes.MAX_VALUE));
        b bVar = (b) next;
        return (bVar == null || (name = bVar.getName()) == null) ? "" : name;
    }

    public final String c(iq2.c cVar) {
        cVar.getClass();
        d dVar = this.transactionSystemMap.get(Integer.valueOf(cVar.f94742f & UnsignedBytes.MAX_VALUE));
        if (dVar != null) {
            return dVar.getName();
        }
        return null;
    }

    public final e d(iq2.c cVar) {
        cVar.getClass();
        e eVar = this.transactionTypeMap.get(Integer.valueOf(cVar.f94739c & UnsignedBytes.MAX_VALUE));
        return eVar == null ? e.EMPTY : eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.transactionSystemMap, cVar.transactionSystemMap) && s.g(this.transactionTypeMap, cVar.transactionTypeMap);
    }

    public final int hashCode() {
        return this.transactionTypeMap.hashCode() + (this.transactionSystemMap.hashCode() * 31);
    }

    public final String toString() {
        return "TransactionResourceDto(transactionSystemMap=" + this.transactionSystemMap + ", transactionTypeMap=" + this.transactionTypeMap + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Map map, Map map2, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(map, map2);
    }
}
