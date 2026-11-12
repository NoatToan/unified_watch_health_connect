package kv2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkv2/d;", "", "", "", "selectedIndexes", "Ltv2/c;", "formattedValue", "<init>", "(Ljava/util/List;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Integer> f106815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f106816b;

    public d(List<Integer> list, tv2.c cVar) {
        list.getClass();
        cVar.getClass();
        this.f106815a = list;
        this.f106816b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f106815a.equals(dVar.f106815a) && this.f106816b.equals(dVar.f106816b);
    }

    public final int hashCode() {
        return this.f106816b.hashCode() + (this.f106815a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiSelectionOptions(selectedIndexes=" + this.f106815a + ", formattedValue=" + this.f106816b + ")";
    }
}
