package vl2;

import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvl2/d;", "", "", "packageId", "Lvl2/e;", "status", "", "Lvl2/a;", "results", "<init>", "(Ljava/lang/String;Lvl2/e;Ljava/util/List;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f178717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f178718c;

    public d(String str, e eVar, List<a> list) {
        str.getClass();
        eVar.getClass();
        list.getClass();
        this.f178716a = str;
        this.f178717b = eVar;
        this.f178718c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f178716a.equals(dVar.f178716a) && this.f178717b == dVar.f178717b && this.f178718c.equals(dVar.f178718c);
    }

    public final int hashCode() {
        return this.f178718c.hashCode() + ((this.f178717b.hashCode() + (this.f178716a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApduPackageResult(packageId=");
        sb3.append(this.f178716a);
        sb3.append(", status=");
        sb3.append(this.f178717b);
        sb3.append(", results=");
        return z.c(sb3, this.f178718c, ")");
    }
}
