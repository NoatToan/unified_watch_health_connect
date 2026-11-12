package vf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvf2/e;", "", "", "category", "categoryTranslation", "", "isBodyWeight", "exerciseTypeKey", "exerciseTranslation", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f177932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f177933e;

    public /* synthetic */ e(String str, String str2, boolean z14, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f177929a, eVar.f177929a) && p005kotlin.jvm.internal.s.g(this.f177930b, eVar.f177930b) && this.f177931c == eVar.f177931c && p005kotlin.jvm.internal.s.g(this.f177932d, eVar.f177932d) && p005kotlin.jvm.internal.s.g(this.f177933e, eVar.f177933e);
    }

    public final int hashCode() {
        String str = this.f177929a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f177930b;
        int iG = q6.f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f177931c);
        String str3 = this.f177932d;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f177933e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExerciseListItem(category=", this.f177929a, ", categoryTranslation=", this.f177930b, ", isBodyWeight=");
        fb1.c.w(", exerciseTypeKey=", this.f177932d, ", exerciseTranslation=", sbI, this.f177931c);
        return am.j.o(this.f177933e, ")", sbI);
    }

    public e(String str, String str2, boolean z14, String str3, String str4) {
        this.f177929a = str;
        this.f177930b = str2;
        this.f177931c = z14;
        this.f177932d = str3;
        this.f177933e = str4;
    }

    public e() {
        this(null, null, false, null, null, 31, null);
    }
}
