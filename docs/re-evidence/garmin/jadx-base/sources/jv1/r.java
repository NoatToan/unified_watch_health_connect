package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljv1/r;", "", "Lvt1/e;", "fbtaPlanType", "Lvt1/o;", "sportTypeEnum", "Ljv1/h;", "durationType", "Lfg0/k;", "selectedEvent", "Ljv1/m;", "planTargetData", "selectedGoal", "<init>", "(Lvt1/e;Lvt1/o;Ljv1/h;Lfg0/k;Ljv1/m;Ljv1/m;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt1.e f101116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt1.o f101117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f101118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg0.k f101119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f101120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f101121f;

    public /* synthetic */ r(vt1.e eVar, vt1.o oVar, h hVar, fg0.k kVar, m mVar, m mVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : hVar, (i14 & 8) != 0 ? null : kVar, (i14 & 16) != 0 ? null : mVar, (i14 & 32) != 0 ? null : mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f101116a == rVar.f101116a && this.f101117b == rVar.f101117b && p005kotlin.jvm.internal.s.g(this.f101118c, rVar.f101118c) && p005kotlin.jvm.internal.s.g(this.f101119d, rVar.f101119d) && p005kotlin.jvm.internal.s.g(this.f101120e, rVar.f101120e) && p005kotlin.jvm.internal.s.g(this.f101121f, rVar.f101121f);
    }

    public final int hashCode() {
        vt1.e eVar = this.f101116a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        vt1.o oVar = this.f101117b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        h hVar = this.f101118c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        fg0.k kVar = this.f101119d;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.f101120e;
        int iHashCode5 = (iHashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        m mVar2 = this.f101121f;
        return iHashCode5 + (mVar2 != null ? mVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FBTGoalSetUpUiModel(fbtaPlanType=" + this.f101116a + ", sportTypeEnum=" + this.f101117b + ", durationType=" + this.f101118c + ", selectedEvent=" + this.f101119d + ", planTargetData=" + this.f101120e + ", selectedGoal=" + this.f101121f + ")";
    }

    public r(vt1.e eVar, vt1.o oVar, h hVar, fg0.k kVar, m mVar, m mVar2) {
        this.f101116a = eVar;
        this.f101117b = oVar;
        this.f101118c = hVar;
        this.f101119d = kVar;
        this.f101120e = mVar;
        this.f101121f = mVar2;
    }

    public r() {
        this(null, null, null, null, null, null, 63, null);
    }
}
