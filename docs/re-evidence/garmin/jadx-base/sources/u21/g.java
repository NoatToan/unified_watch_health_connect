package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu21/g;", "", "", "isInMinutes", "", "mealName", "isNameTranslated", "showMealDescription", "isEditable", "Lu21/d0;", "nameError", "", "calorieGoal", "percentage", "Lu21/i1;", "timeSectionUiModel", "navigateBackWithData", "<init>", "(ZLjava/lang/String;ZZZLu21/d0;Ljava/lang/Integer;Ljava/lang/Integer;Lu21/i1;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f167965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f167966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f167967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f167968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1 f167969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f167970j;

    public /* synthetic */ g(boolean z14, String str, boolean z15, boolean z16, boolean z17, d0 d0Var, Integer num, Integer num2, i1 i1Var, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, str, z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? true : z17, (i14 & 32) != 0 ? null : d0Var, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : i1Var, (i14 & 512) != 0 ? false : z18);
    }

    public static g a(g gVar, String str, d0 d0Var, Integer num, Integer num2, i1 i1Var, int i14) {
        boolean z14 = gVar.f167961a;
        if ((i14 & 2) != 0) {
            str = gVar.f167962b;
        }
        String str2 = str;
        boolean z15 = (i14 & 4) != 0 ? gVar.f167963c : true;
        boolean z16 = gVar.f167964d;
        boolean z17 = gVar.f167965e;
        if ((i14 & 32) != 0) {
            d0Var = gVar.f167966f;
        }
        d0 d0Var2 = d0Var;
        if ((i14 & 64) != 0) {
            num = gVar.f167967g;
        }
        Integer num3 = num;
        Integer num4 = (i14 & 128) != 0 ? gVar.f167968h : num2;
        i1 i1Var2 = (i14 & 256) != 0 ? gVar.f167969i : i1Var;
        boolean z18 = (i14 & 512) != 0 ? gVar.f167970j : true;
        gVar.getClass();
        str2.getClass();
        return new g(z14, str2, z15, z16, z17, d0Var2, num3, num4, i1Var2, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f167961a == gVar.f167961a && p005kotlin.jvm.internal.s.g(this.f167962b, gVar.f167962b) && this.f167963c == gVar.f167963c && this.f167964d == gVar.f167964d && this.f167965e == gVar.f167965e && p005kotlin.jvm.internal.s.g(this.f167966f, gVar.f167966f) && p005kotlin.jvm.internal.s.g(this.f167967g, gVar.f167967g) && p005kotlin.jvm.internal.s.g(this.f167968h, gVar.f167968h) && p005kotlin.jvm.internal.s.g(this.f167969i, gVar.f167969i) && this.f167970j == gVar.f167970j;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(wr.g.j(Boolean.hashCode(this.f167961a) * 31, 31, this.f167962b), 31, this.f167963c), 31, this.f167964d), 31, this.f167965e);
        d0 d0Var = this.f167966f;
        int iHashCode = (iG + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        Integer num = this.f167967g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f167968h;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        i1 i1Var = this.f167969i;
        return Boolean.hashCode(this.f167970j) + ((iHashCode3 + (i1Var != null ? i1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditMealUiState(isInMinutes=");
        sb3.append(this.f167961a);
        sb3.append(", mealName=");
        sb3.append(this.f167962b);
        sb3.append(", isNameTranslated=");
        kg.f.q(", showMealDescription=", ", isEditable=", sb3, this.f167963c, this.f167964d);
        sb3.append(this.f167965e);
        sb3.append(", nameError=");
        sb3.append(this.f167966f);
        sb3.append(", calorieGoal=");
        j20.x.m(sb3, this.f167967g, ", percentage=", this.f167968h, ", timeSectionUiModel=");
        sb3.append(this.f167969i);
        sb3.append(", navigateBackWithData=");
        sb3.append(this.f167970j);
        sb3.append(")");
        return sb3.toString();
    }

    public g(boolean z14, String str, boolean z15, boolean z16, boolean z17, d0 d0Var, Integer num, Integer num2, i1 i1Var, boolean z18) {
        str.getClass();
        this.f167961a = z14;
        this.f167962b = str;
        this.f167963c = z15;
        this.f167964d = z16;
        this.f167965e = z17;
        this.f167966f = d0Var;
        this.f167967g = num;
        this.f167968h = num2;
        this.f167969i = i1Var;
        this.f167970j = z18;
    }
}
