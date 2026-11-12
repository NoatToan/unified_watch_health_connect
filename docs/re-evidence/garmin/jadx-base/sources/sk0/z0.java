package sk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsk0/z0;", "", "", "isLoading", "Li53/e;", "Lc80/u;", "gearTypeFilters", "retiredGearTypeFilters", "Lsk0/b1$b;", "needsRefresh", "Ljk0/o;", "sortOrder", "gearTypeFilter", "retiredGearTypeFilter", "showWhatsNew", "<init>", "(ZLi53/e;Li53/e;Li53/e;Ljk0/o;Lc80/u;Lc80/u;Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.e<c80.u> f159924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.e<c80.u> f159925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.e<b1.b> f159926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jk0.o f159927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c80.u f159928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c80.u f159929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f159930h;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(boolean z14, i53.e<? extends c80.u> eVar, i53.e<? extends c80.u> eVar2, i53.e<? extends b1.b> eVar3, jk0.o oVar, c80.u uVar, c80.u uVar2, boolean z15) {
        eVar.getClass();
        eVar2.getClass();
        eVar3.getClass();
        oVar.getClass();
        this.f159923a = z14;
        this.f159924b = eVar;
        this.f159925c = eVar2;
        this.f159926d = eVar3;
        this.f159927e = oVar;
        this.f159928f = uVar;
        this.f159929g = uVar2;
        this.f159930h = z15;
    }

    public static z0 a(z0 z0Var, boolean z14, i53.e eVar, i53.e eVar2, i53.e eVar3, jk0.o oVar, c80.u uVar, c80.u uVar2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = z0Var.f159923a;
        }
        boolean z15 = z14;
        if ((i14 & 2) != 0) {
            eVar = z0Var.f159924b;
        }
        i53.e eVar4 = eVar;
        if ((i14 & 4) != 0) {
            eVar2 = z0Var.f159925c;
        }
        i53.e eVar5 = eVar2;
        if ((i14 & 8) != 0) {
            eVar3 = z0Var.f159926d;
        }
        i53.e eVar6 = eVar3;
        if ((i14 & 16) != 0) {
            oVar = z0Var.f159927e;
        }
        jk0.o oVar2 = oVar;
        if ((i14 & 32) != 0) {
            uVar = z0Var.f159928f;
        }
        c80.u uVar3 = uVar;
        c80.u uVar4 = (i14 & 64) != 0 ? z0Var.f159929g : uVar2;
        boolean z16 = (i14 & 128) != 0 ? z0Var.f159930h : false;
        z0Var.getClass();
        eVar4.getClass();
        eVar5.getClass();
        eVar6.getClass();
        oVar2.getClass();
        return new z0(z15, eVar4, eVar5, eVar6, oVar2, uVar3, uVar4, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f159923a == z0Var.f159923a && this.f159924b.equals(z0Var.f159924b) && this.f159925c.equals(z0Var.f159925c) && this.f159926d.equals(z0Var.f159926d) && this.f159927e == z0Var.f159927e && this.f159928f == z0Var.f159928f && this.f159929g == z0Var.f159929g && this.f159930h == z0Var.f159930h;
    }

    public final int hashCode() {
        int iHashCode = (this.f159927e.hashCode() + ((this.f159926d.hashCode() + ((this.f159925c.hashCode() + ((this.f159924b.hashCode() + (Boolean.hashCode(this.f159923a) * 31)) * 31)) * 31)) * 31)) * 31;
        c80.u uVar = this.f159928f;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        c80.u uVar2 = this.f159929g;
        return Boolean.hashCode(this.f159930h) + ((iHashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GearListState(isLoading=" + this.f159923a + ", gearTypeFilters=" + this.f159924b + ", retiredGearTypeFilters=" + this.f159925c + ", needsRefresh=" + this.f159926d + ", sortOrder=" + this.f159927e + ", gearTypeFilter=" + this.f159928f + ", retiredGearTypeFilter=" + this.f159929g + ", showWhatsNew=" + this.f159930h + ")";
    }
}
