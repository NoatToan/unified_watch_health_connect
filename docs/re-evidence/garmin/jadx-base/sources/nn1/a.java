package nn1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnn1/a;", "", "", "titleResId", "", "Lnn1/c;", "detailsParagraphs", "<init>", "(ILjava/util/List;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f126688b;

    public a(int i14, List<c> list) {
        list.getClass();
        this.f126687a = i14;
        this.f126688b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f126687a == aVar.f126687a && this.f126688b.equals(aVar.f126688b);
    }

    public final int hashCode() {
        return this.f126688b.hashCode() + (Integer.hashCode(this.f126687a) * 31);
    }

    public final String toString() {
        return "SleepScoreDetailsContent(titleResId=" + this.f126687a + ", detailsParagraphs=" + this.f126688b + ")";
    }
}
