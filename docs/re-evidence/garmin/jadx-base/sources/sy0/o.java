package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsy0/o;", "", "", "isLoading", "Lo82/g;", "selectedIntervalType", "Lrl1/i;", "selectedSleepOverlay", "isTrainingLoadChronicChipSelected", "Lky0/e;", "detailSelectedTab", "<init>", "(ZLo82/g;Lrl1/i;ZLky0/e;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f161268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rl1.i f161269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f161270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ky0.e f161271e;

    public /* synthetic */ o(boolean z14, o82.g gVar, rl1.i iVar, boolean z15, ky0.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? o82.g.f130851d : gVar, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? ky0.e.OVERVIEW : eVar);
    }

    public static o a(o oVar, boolean z14, o82.g gVar, rl1.i iVar, boolean z15, ky0.e eVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = oVar.f161267a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            gVar = oVar.f161268b;
        }
        o82.g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            iVar = oVar.f161269c;
        }
        rl1.i iVar2 = iVar;
        if ((i14 & 8) != 0) {
            z15 = oVar.f161270d;
        }
        boolean z17 = z15;
        if ((i14 & 16) != 0) {
            eVar = oVar.f161271e;
        }
        ky0.e eVar2 = eVar;
        oVar.getClass();
        gVar2.getClass();
        eVar2.getClass();
        return new o(z16, gVar2, iVar2, z17, eVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f161267a == oVar.f161267a && this.f161268b == oVar.f161268b && this.f161269c == oVar.f161269c && this.f161270d == oVar.f161270d && this.f161271e == oVar.f161271e;
    }

    public final int hashCode() {
        int i14 = q6.f.i(this.f161268b, Boolean.hashCode(this.f161267a) * 31, 31);
        rl1.i iVar = this.f161269c;
        return this.f161271e.hashCode() + q6.f.g((i14 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f161270d);
    }

    public final String toString() {
        return "ReportUiState(isLoading=" + this.f161267a + ", selectedIntervalType=" + this.f161268b + ", selectedSleepOverlay=" + this.f161269c + ", isTrainingLoadChronicChipSelected=" + this.f161270d + ", detailSelectedTab=" + this.f161271e + ")";
    }

    public o(boolean z14, o82.g gVar, rl1.i iVar, boolean z15, ky0.e eVar) {
        gVar.getClass();
        eVar.getClass();
        this.f161267a = z14;
        this.f161268b = gVar;
        this.f161269c = iVar;
        this.f161270d = z15;
        this.f161271e = eVar;
    }

    public o() {
        this(false, null, null, false, null, 31, null);
    }
}
