package u21;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu21/i1;", "", "Lb63/v;", "currentStartTime", "", "showStartTimeIsRequiredError", "startTimePickerMaxTime", "currentEndTime", "showEndTimeIsRequiredError", "endTimePickerMinTime", "endTimePickerMaxTime", "<init>", "(Lb63/v;ZLb63/v;Lb63/v;ZLb63/v;Lb63/v;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.v f168006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f168008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f168009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f168010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b63.v f168011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b63.v f168012g;

    public i1(b63.v vVar, boolean z14, b63.v vVar2, b63.v vVar3, boolean z15, b63.v vVar4, b63.v vVar5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? v21.d.f175319w : vVar2, vVar3, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? new b63.v(0, 0, 0, 0, 12, null) : vVar4, (i14 & 64) != 0 ? v21.d.f175319w : vVar5);
    }

    public static i1 a(i1 i1Var, b63.v vVar, boolean z14, b63.v vVar2, boolean z15, b63.v vVar3, int i14) {
        if ((i14 & 1) != 0) {
            vVar = i1Var.f168006a;
        }
        b63.v vVar4 = vVar;
        b63.v vVar5 = i1Var.f168008c;
        if ((i14 & 8) != 0) {
            vVar2 = i1Var.f168009d;
        }
        b63.v vVar6 = vVar2;
        if ((i14 & 32) != 0) {
            vVar3 = i1Var.f168011f;
        }
        b63.v vVar7 = vVar3;
        b63.v vVar8 = i1Var.f168012g;
        vVar5.getClass();
        vVar7.getClass();
        vVar8.getClass();
        return new i1(vVar4, z14, vVar5, vVar6, z15, vVar7, vVar8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return p005kotlin.jvm.internal.s.g(this.f168006a, i1Var.f168006a) && this.f168007b == i1Var.f168007b && p005kotlin.jvm.internal.s.g(this.f168008c, i1Var.f168008c) && p005kotlin.jvm.internal.s.g(this.f168009d, i1Var.f168009d) && this.f168010e == i1Var.f168010e && p005kotlin.jvm.internal.s.g(this.f168011f, i1Var.f168011f) && p005kotlin.jvm.internal.s.g(this.f168012g, i1Var.f168012g);
    }

    public final int hashCode() {
        b63.v vVar = this.f168006a;
        int iC = l2.c(this.f168008c.f16219a, q6.f.g((vVar == null ? 0 : vVar.f16219a.hashCode()) * 31, 31, this.f168007b), 31);
        b63.v vVar2 = this.f168009d;
        return this.f168012g.f16219a.hashCode() + l2.c(this.f168011f.f16219a, q6.f.g((iC + (vVar2 != null ? vVar2.f16219a.hashCode() : 0)) * 31, 31, this.f168010e), 31);
    }

    public final String toString() {
        return "TimeSectionUIModel(currentStartTime=" + this.f168006a + ", showStartTimeIsRequiredError=" + this.f168007b + ", startTimePickerMaxTime=" + this.f168008c + ", currentEndTime=" + this.f168009d + ", showEndTimeIsRequiredError=" + this.f168010e + ", endTimePickerMinTime=" + this.f168011f + ", endTimePickerMaxTime=" + this.f168012g + ")";
    }

    public i1(b63.v vVar, boolean z14, b63.v vVar2, b63.v vVar3, boolean z15, b63.v vVar4, b63.v vVar5) {
        vVar2.getClass();
        vVar4.getClass();
        vVar5.getClass();
        this.f168006a = vVar;
        this.f168007b = z14;
        this.f168008c = vVar2;
        this.f168009d = vVar3;
        this.f168010e = z15;
        this.f168011f = vVar4;
        this.f168012g = vVar5;
    }
}
