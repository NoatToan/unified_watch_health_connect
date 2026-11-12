package pt1;

import android.os.Parcelable;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpt1/j;", "", "", "searchString", "locale", "Li53/c;", "Lpt1/i;", "searchItems", "selectedSearchResultItemState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li53/c;Lpt1/i;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<i> f140869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f140870d;

    static {
        Parcelable.Creator<le2.a> creator = le2.a.CREATOR;
    }

    public j(String str, String str2, i53.c cVar, i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? j53.l.b() : cVar, (i14 & 8) != 0 ? null : iVar);
    }

    public static j a(j jVar, String str, j53.j jVar2, i iVar, int i14) {
        if ((i14 & 1) != 0) {
            str = jVar.f140867a;
        }
        String str2 = jVar.f140868b;
        i53.c<i> cVar = jVar2;
        if ((i14 & 4) != 0) {
            cVar = jVar.f140869c;
        }
        if ((i14 & 8) != 0) {
            iVar = jVar.f140870d;
        }
        jVar.getClass();
        str.getClass();
        str2.getClass();
        cVar.getClass();
        return new j(str, str2, cVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f140867a, jVar.f140867a) && p005kotlin.jvm.internal.s.g(this.f140868b, jVar.f140868b) && p005kotlin.jvm.internal.s.g(this.f140869c, jVar.f140869c) && p005kotlin.jvm.internal.s.g(this.f140870d, jVar.f140870d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f140869c, wr.g.j(this.f140867a.hashCode() * 31, 31, this.f140868b), 31);
        i iVar = this.f140870d;
        return iA + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SearchState(searchString=", this.f140867a, ", locale=", this.f140868b, ", searchItems=");
        sbI.append(this.f140869c);
        sbI.append(", selectedSearchResultItemState=");
        sbI.append(this.f140870d);
        sbI.append(")");
        return sbI.toString();
    }

    public j(String str, String str2, i53.c<i> cVar, i iVar) {
        str.getClass();
        str2.getClass();
        cVar.getClass();
        this.f140867a = str;
        this.f140868b = str2;
        this.f140869c = cVar;
        this.f140870d = iVar;
    }

    public j() {
        this(null, null, null, null, 15, null);
    }
}
