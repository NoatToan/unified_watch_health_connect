package xy;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxy/b;", "", "", "dayOfWeek", "date", "total", "Lny/c$b;", "values", "Lb63/o;", "localDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny/c$b;Lb63/o;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ny.c.b f192606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f192607e;

    public b(String str, String str2, String str3, ny.c.b bVar, o oVar) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f192603a = str;
        this.f192604b = str2;
        this.f192605c = str3;
        this.f192606d = bVar;
        this.f192607e = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f192603a.equals(bVar.f192603a) && this.f192604b.equals(bVar.f192604b) && this.f192605c.equals(bVar.f192605c) && s.g(this.f192606d, bVar.f192606d) && s.g(this.f192607e, bVar.f192607e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.f192603a.hashCode() * 31, 31, this.f192604b), 31, this.f192605c);
        ny.c.b bVar = this.f192606d;
        int iHashCode = (iJ + (bVar == null ? 0 : bVar.hashCode())) * 31;
        o oVar = this.f192607e;
        return iHashCode + (oVar != null ? oVar.f16206a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CaloriesDailyListItem(dayOfWeek=", this.f192603a, ", date=", this.f192604b, ", total=");
        sbI.append(this.f192605c);
        sbI.append(", values=");
        sbI.append(this.f192606d);
        sbI.append(", localDate=");
        sbI.append(this.f192607e);
        sbI.append(")");
        return sbI.toString();
    }
}
