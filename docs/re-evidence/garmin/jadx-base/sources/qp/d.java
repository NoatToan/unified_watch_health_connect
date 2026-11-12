package qp;

import j53.l;
import mp.j;
import mp.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import wr.g;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012$\b\u0002\u0010\u0012\u001a\u001e\u0012\b\u0012\u00060\u0006j\u0002`\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00100\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqp/d;", "", "", "isError", "isDeleteInProgress", "showActivitySuccessfullyDeleted", "", "deletedActivityName", "Lmp/k;", "currentMetricType", "Lmp/a;", "activitiesFilterSelectionData", "Li53/c;", "availableMetrics", "Lmp/j;", "availableChips", "Li53/d;", "Lcom/garmin/android/apps/connectmobile/activities/reports/presentation/model/ReportsChipMapKey;", "selectedChips", "<init>", "(ZZZLjava/lang/String;Lmp/k;Lmp/a;Li53/c;Li53/c;Li53/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f146007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f146008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f146009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f146010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f146011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mp.a f146012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<k> f146013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<j> f146014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.d<String, i53.d<j, Boolean>> f146015i;

    public d(boolean z14, boolean z15, boolean z16, String str, k kVar, mp.a aVar, i53.c cVar, i53.c cVar2, i53.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? null : kVar, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? l.b() : cVar, (i14 & 128) != 0 ? l.b() : cVar2, (i14 & 256) != 0 ? i53.a.c() : dVar);
    }

    public static d a(d dVar, boolean z14, boolean z15, String str, k kVar, mp.a aVar, i53.c cVar, i53.c cVar2, i53.d dVar2, int i14) {
        boolean z16 = z14;
        boolean z17 = dVar.f146007a;
        if ((i14 & 2) != 0) {
            z16 = dVar.f146008b;
        }
        if ((i14 & 4) != 0) {
            z15 = dVar.f146009c;
        }
        if ((i14 & 8) != 0) {
            str = dVar.f146010d;
        }
        if ((i14 & 16) != 0) {
            kVar = dVar.f146011e;
        }
        if ((i14 & 32) != 0) {
            aVar = dVar.f146012f;
        }
        if ((i14 & 64) != 0) {
            cVar = dVar.f146013g;
        }
        if ((i14 & 128) != 0) {
            cVar2 = dVar.f146014h;
        }
        if ((i14 & 256) != 0) {
            dVar2 = dVar.f146015i;
        }
        i53.d dVar3 = dVar2;
        dVar.getClass();
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        dVar3.getClass();
        i53.c cVar3 = cVar2;
        i53.c cVar4 = cVar;
        mp.a aVar2 = aVar;
        k kVar2 = kVar;
        String str2 = str;
        return new d(z17, z16, z15, str2, kVar2, aVar2, cVar4, cVar3, dVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f146007a == dVar.f146007a && this.f146008b == dVar.f146008b && this.f146009c == dVar.f146009c && s.g(this.f146010d, dVar.f146010d) && this.f146011e == dVar.f146011e && s.g(this.f146012f, dVar.f146012f) && s.g(this.f146013g, dVar.f146013g) && s.g(this.f146014h, dVar.f146014h) && s.g(this.f146015i, dVar.f146015i);
    }

    public final int hashCode() {
        int iJ = g.j(f.g(f.g(Boolean.hashCode(this.f146007a) * 31, 31, this.f146008b), 31, this.f146009c), 31, this.f146010d);
        k kVar = this.f146011e;
        int iHashCode = (iJ + (kVar == null ? 0 : kVar.hashCode())) * 31;
        mp.a aVar = this.f146012f;
        return this.f146015i.hashCode() + l2.a(this.f146014h, l2.a(this.f146013g, (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ReportsTabUIState(isError=", ", isDeleteInProgress=", ", showActivitySuccessfullyDeleted=", this.f146007a, this.f146008b);
        fb1.c.w(", deletedActivityName=", this.f146010d, ", currentMetricType=", sbM, this.f146009c);
        sbM.append(this.f146011e);
        sbM.append(", activitiesFilterSelectionData=");
        sbM.append(this.f146012f);
        sbM.append(", availableMetrics=");
        f.w(sbM, this.f146013g, ", availableChips=", this.f146014h, ", selectedChips=");
        sbM.append(this.f146015i);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z14, boolean z15, boolean z16, String str, k kVar, mp.a aVar, i53.c<? extends k> cVar, i53.c<? extends j> cVar2, i53.d<String, ? extends i53.d<j, Boolean>> dVar) {
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        dVar.getClass();
        this.f146007a = z14;
        this.f146008b = z15;
        this.f146009c = z16;
        this.f146010d = str;
        this.f146011e = kVar;
        this.f146012f = aVar;
        this.f146013g = cVar;
        this.f146014h = cVar2;
        this.f146015i = dVar;
    }

    public d() {
        this(false, false, false, null, null, null, null, null, null, 511, null);
    }
}
