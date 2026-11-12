package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljv1/e;", "", "", "hasRecommendation", "Lvt1/n;", "currentPlanDistance", "recommendedPlanDistance", "Lm52/i;", "currentTriathlonType", "recommendedTriathlonType", "", "recommendedRaceTime", "isITPRecommendation", "isRecommendationAccepted", "weeksUntilEvent", "", "formattedDistance", "<init>", "(ZLvt1/n;Lvt1/n;Lm52/i;Lm52/i;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f101032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt1.n f101033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt1.n f101034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m52.i f101035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m52.i f101036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f101037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f101038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f101039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f101040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f101041j;

    public /* synthetic */ e(boolean z14, vt1.n nVar, vt1.n nVar2, m52.i iVar, m52.i iVar2, Integer num, boolean z15, boolean z16, Integer num2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : nVar, (i14 & 4) != 0 ? null : nVar2, (i14 & 8) != 0 ? null : iVar, (i14 & 16) != 0 ? null : iVar2, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : str);
    }

    public static e a(e eVar, boolean z14) {
        return new e(eVar.f101032a, eVar.f101033b, eVar.f101034c, eVar.f101035d, eVar.f101036e, eVar.f101037f, eVar.f101038g, z14, eVar.f101040i, eVar.f101041j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f101032a == eVar.f101032a && this.f101033b == eVar.f101033b && this.f101034c == eVar.f101034c && this.f101035d == eVar.f101035d && this.f101036e == eVar.f101036e && p005kotlin.jvm.internal.s.g(this.f101037f, eVar.f101037f) && this.f101038g == eVar.f101038g && this.f101039h == eVar.f101039h && p005kotlin.jvm.internal.s.g(this.f101040i, eVar.f101040i) && p005kotlin.jvm.internal.s.g(this.f101041j, eVar.f101041j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f101032a) * 31;
        vt1.n nVar = this.f101033b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        vt1.n nVar2 = this.f101034c;
        int iHashCode3 = (iHashCode2 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        m52.i iVar = this.f101035d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        m52.i iVar2 = this.f101036e;
        int iHashCode5 = (iHashCode4 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        Integer num = this.f101037f;
        int iG = q6.f.g(q6.f.g((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f101038g), 31, this.f101039h);
        Integer num2 = this.f101040i;
        int iHashCode6 = (iG + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f101041j;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoachCautionUIModel(hasRecommendation=");
        sb3.append(this.f101032a);
        sb3.append(", currentPlanDistance=");
        sb3.append(this.f101033b);
        sb3.append(", recommendedPlanDistance=");
        sb3.append(this.f101034c);
        sb3.append(", currentTriathlonType=");
        sb3.append(this.f101035d);
        sb3.append(", recommendedTriathlonType=");
        sb3.append(this.f101036e);
        sb3.append(", recommendedRaceTime=");
        sb3.append(this.f101037f);
        sb3.append(", isITPRecommendation=");
        kg.f.q(", isRecommendationAccepted=", ", weeksUntilEvent=", sb3, this.f101038g, this.f101039h);
        sb3.append(this.f101040i);
        sb3.append(", formattedDistance=");
        sb3.append(this.f101041j);
        sb3.append(")");
        return sb3.toString();
    }

    public e(boolean z14, vt1.n nVar, vt1.n nVar2, m52.i iVar, m52.i iVar2, Integer num, boolean z15, boolean z16, Integer num2, String str) {
        this.f101032a = z14;
        this.f101033b = nVar;
        this.f101034c = nVar2;
        this.f101035d = iVar;
        this.f101036e = iVar2;
        this.f101037f = num;
        this.f101038g = z15;
        this.f101039h = z16;
        this.f101040i = num2;
        this.f101041j = str;
    }

    public e() {
        this(false, null, null, null, null, null, false, false, null, null, 1023, null);
    }
}
