package lt2;

import mt2.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llt2/g;", "", "Lmt2/l;", "stepType", "", "localizedExerciseName", "description", "Llt2/a;", "endCondition", "Llt2/b;", "primaryTarget", "secondaryTarget", "Llt2/e;", "weight", "Lmt2/h;", "strokeType", "Lmt2/g;", "equipmentType", "<init>", "(Lmt2/l;Ljava/lang/String;Ljava/lang/String;Llt2/a;Llt2/b;Llt2/b;Llt2/e;Lmt2/h;Lmt2/g;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f114889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f114892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f114893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f114894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f114895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mt2.h f114896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mt2.g f114897i;

    public /* synthetic */ g(l lVar, String str, String str2, a aVar, b bVar, b bVar2, e eVar, mt2.h hVar, mt2.g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.OTHER : lVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? new a(null, 0.0d, null, null, 15, null) : aVar, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? null : bVar2, (i14 & 64) != 0 ? new e(0.0d, 0.0d, 0.0d, 7, null) : eVar, (i14 & 128) != 0 ? null : hVar, (i14 & 256) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f114889a == gVar.f114889a && s.g(this.f114890b, gVar.f114890b) && s.g(this.f114891c, gVar.f114891c) && s.g(this.f114892d, gVar.f114892d) && s.g(this.f114893e, gVar.f114893e) && s.g(this.f114894f, gVar.f114894f) && s.g(this.f114895g, gVar.f114895g) && this.f114896h == gVar.f114896h && this.f114897i == gVar.f114897i;
    }

    public final int hashCode() {
        int iHashCode = this.f114889a.hashCode() * 31;
        String str = this.f114890b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114891c;
        int iHashCode3 = (this.f114892d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        b bVar = this.f114893e;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f114894f;
        int iHashCode5 = (this.f114895g.hashCode() + ((iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31;
        mt2.h hVar = this.f114896h;
        int iHashCode6 = (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        mt2.g gVar = this.f114897i;
        return iHashCode6 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "CommonWorkoutStep(stepType=" + this.f114889a + ", localizedExerciseName=" + this.f114890b + ", description=" + this.f114891c + ", endCondition=" + this.f114892d + ", primaryTarget=" + this.f114893e + ", secondaryTarget=" + this.f114894f + ", weight=" + this.f114895g + ", strokeType=" + this.f114896h + ", equipmentType=" + this.f114897i + ")";
    }

    public g(l lVar, String str, String str2, a aVar, b bVar, b bVar2, e eVar, mt2.h hVar, mt2.g gVar) {
        lVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.f114889a = lVar;
        this.f114890b = str;
        this.f114891c = str2;
        this.f114892d = aVar;
        this.f114893e = bVar;
        this.f114894f = bVar2;
        this.f114895g = eVar;
        this.f114896h = hVar;
        this.f114897i = gVar;
    }

    public g() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
