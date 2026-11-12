package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldy1/h;", "", "", "exerciseKey", "category", "", "isPrimary", "isDeletable", "isSelectable", "isSelected", "isEditable", "name", "description", "", "durationInSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/String;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f61562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f61564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f61565j;

    public h(String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str3, String str4, int i14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.f61556a = str;
        this.f61557b = str2;
        this.f61558c = z14;
        this.f61559d = z15;
        this.f61560e = z16;
        this.f61561f = z17;
        this.f61562g = z18;
        this.f61563h = str3;
        this.f61564i = str4;
        this.f61565j = i14;
    }

    public static h a(h hVar, String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, String str3, int i14) {
        if ((i14 & 1) != 0) {
            str = hVar.f61556a;
        }
        String str4 = str;
        if ((i14 & 2) != 0) {
            str2 = hVar.f61557b;
        }
        String str5 = str2;
        boolean z18 = hVar.f61558c;
        boolean z19 = (i14 & 8) != 0 ? hVar.f61559d : z14;
        boolean z24 = (i14 & 16) != 0 ? hVar.f61560e : z15;
        boolean z25 = (i14 & 32) != 0 ? hVar.f61561f : z16;
        boolean z26 = (i14 & 64) != 0 ? hVar.f61562g : z17;
        String str6 = (i14 & 128) != 0 ? hVar.f61563h : str3;
        String str7 = hVar.f61564i;
        int i15 = hVar.f61565j;
        hVar.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        return new h(str4, str5, z18, z19, z24, z25, z26, str6, str7, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f61556a, hVar.f61556a) && p005kotlin.jvm.internal.s.g(this.f61557b, hVar.f61557b) && this.f61558c == hVar.f61558c && this.f61559d == hVar.f61559d && this.f61560e == hVar.f61560e && this.f61561f == hVar.f61561f && this.f61562g == hVar.f61562g && p005kotlin.jvm.internal.s.g(this.f61563h, hVar.f61563h) && p005kotlin.jvm.internal.s.g(this.f61564i, hVar.f61564i) && this.f61565j == hVar.f61565j;
    }

    public final int hashCode() {
        int iHashCode = this.f61556a.hashCode() * 31;
        String str = this.f61557b;
        return Integer.hashCode(this.f61565j) + wr.g.j(wr.g.j(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61558c), 31, this.f61559d), 31, this.f61560e), 31, this.f61561f), 31, this.f61562g), 31, this.f61563h), 31, this.f61564i);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExerciseState(exerciseKey=", this.f61556a, ", category=", this.f61557b, ", isPrimary=");
        kg.f.q(", isDeletable=", ", isSelectable=", sbI, this.f61558c, this.f61559d);
        kg.f.q(", isSelected=", ", isEditable=", sbI, this.f61560e, this.f61561f);
        fb1.c.w(", name=", this.f61563h, ", description=", sbI, this.f61562g);
        sbI.append(this.f61564i);
        sbI.append(", durationInSeconds=");
        sbI.append(this.f61565j);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ h(String str, String str2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str3, String str4, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : str2, z14, z15, z16, z17, z18, str3, str4, i14);
    }
}
