package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu21/c;", "", "", "activeCaloriesGoal", "customActiveCalories", "", "showCustomActiveCaloriesError", "isSaveEnabled", "Ls21/a;", "activityLevelOption", "Ll01/a;", "activityMultiplier", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLs21/a;Ll01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s21.a f167911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l01.a f167912f;

    public /* synthetic */ c(String str, String str2, boolean z14, boolean z15, s21.a aVar, l01.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? s21.a.ACTIVE_CALORIES : aVar, (i14 & 32) != 0 ? null : aVar2);
    }

    public static c a(c cVar, String str, boolean z14, boolean z15, s21.a aVar, l01.a aVar2, int i14) {
        String str2 = str;
        String str3 = cVar.f167907a;
        if ((i14 & 2) != 0) {
            str2 = cVar.f167908b;
        }
        if ((i14 & 4) != 0) {
            z14 = cVar.f167909c;
        }
        if ((i14 & 32) != 0) {
            aVar2 = cVar.f167912f;
        }
        cVar.getClass();
        str3.getClass();
        str2.getClass();
        aVar.getClass();
        boolean z16 = z14;
        return new c(str3, str2, z16, z15, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f167907a, cVar.f167907a) && p005kotlin.jvm.internal.s.g(this.f167908b, cVar.f167908b) && this.f167909c == cVar.f167909c && this.f167910d == cVar.f167910d && this.f167911e == cVar.f167911e && this.f167912f == cVar.f167912f;
    }

    public final int hashCode() {
        int iHashCode = (this.f167911e.hashCode() + q6.f.g(q6.f.g(wr.g.j(this.f167907a.hashCode() * 31, 31, this.f167908b), 31, this.f167909c), 31, this.f167910d)) * 31;
        l01.a aVar = this.f167912f;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivityLevelUiModel(activeCaloriesGoal=", this.f167907a, ", customActiveCalories=", this.f167908b, ", showCustomActiveCaloriesError=");
        kg.f.q(", isSaveEnabled=", ", activityLevelOption=", sbI, this.f167909c, this.f167910d);
        sbI.append(this.f167911e);
        sbI.append(", activityMultiplier=");
        sbI.append(this.f167912f);
        sbI.append(")");
        return sbI.toString();
    }

    public c(String str, String str2, boolean z14, boolean z15, s21.a aVar, l01.a aVar2) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f167907a = str;
        this.f167908b = str2;
        this.f167909c = z14;
        this.f167910d = z15;
        this.f167911e = aVar;
        this.f167912f = aVar2;
    }

    public c() {
        this(null, null, false, false, null, null, 63, null);
    }
}
