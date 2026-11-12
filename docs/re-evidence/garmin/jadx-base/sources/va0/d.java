package va0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lva0/d;", "", "", "searchQuery", "", "loading", "", "Lva0/c;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f176577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f176578c;

    public d(String str, boolean z14, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f176576a, dVar.f176576a) && this.f176577b == dVar.f176577b && s.g(this.f176578c, dVar.f176578c);
    }

    public final int hashCode() {
        return this.f176578c.hashCode() + f.g(this.f176576a.hashCode() * 31, 31, this.f176577b);
    }

    public final String toString() {
        return z.c(zl.a.d("DeviceSelectionUiState(searchQuery=", this.f176576a, ", loading=", this.f176577b, ", items="), this.f176578c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, boolean z14, List<? extends c> list) {
        str.getClass();
        list.getClass();
        this.f176576a = str;
        this.f176577b = z14;
        this.f176578c = list;
    }

    public d() {
        this(null, false, null, 7, null);
    }
}
