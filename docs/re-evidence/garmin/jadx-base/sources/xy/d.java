package xy;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxy/d;", "", "", "dateRange", "total", "Lb63/o;", "localDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb63/o;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f192616c;

    public d(String str, String str2, o oVar) {
        str.getClass();
        str2.getClass();
        this.f192614a = str;
        this.f192615b = str2;
        this.f192616c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f192614a.equals(dVar.f192614a) && this.f192615b.equals(dVar.f192615b) && s.g(this.f192616c, dVar.f192616c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f192614a.hashCode() * 31, 31, this.f192615b);
        o oVar = this.f192616c;
        return iJ + (oVar == null ? 0 : oVar.f16206a.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CaloriesWeeklyListItem(dateRange=", this.f192614a, ", total=", this.f192615b, ", localDate=");
        sbI.append(this.f192616c);
        sbI.append(")");
        return sbI.toString();
    }
}
