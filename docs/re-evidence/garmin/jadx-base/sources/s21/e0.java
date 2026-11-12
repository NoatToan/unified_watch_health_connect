package s21;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls21/e0;", "", "Lb63/v;", "time", "pickerMinTime", "pickerMaxTime", "Lo21/a;", "errorState", "<init>", "(Lb63/v;Lb63/v;Lb63/v;Lo21/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.v f156100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.v f156101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f156102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o21.a f156103d;

    public e0(b63.v vVar, b63.v vVar2, b63.v vVar3, o21.a aVar) {
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        this.f156100a = vVar;
        this.f156101b = vVar2;
        this.f156102c = vVar3;
        this.f156103d = aVar;
    }

    public static e0 a(e0 e0Var, b63.v vVar, b63.v vVar2, int i14) {
        if ((i14 & 1) != 0) {
            vVar = e0Var.f156100a;
        }
        if ((i14 & 2) != 0) {
            vVar2 = e0Var.f156101b;
        }
        b63.v vVar3 = e0Var.f156102c;
        o21.a aVar = (i14 & 8) != 0 ? e0Var.f156103d : null;
        e0Var.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        return new e0(vVar, vVar2, vVar3, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f156100a, e0Var.f156100a) && p005kotlin.jvm.internal.s.g(this.f156101b, e0Var.f156101b) && p005kotlin.jvm.internal.s.g(this.f156102c, e0Var.f156102c) && p005kotlin.jvm.internal.s.g(this.f156103d, e0Var.f156103d);
    }

    public final int hashCode() {
        int iC = l2.c(this.f156102c.f16219a, l2.c(this.f156101b.f16219a, this.f156100a.f16219a.hashCode() * 31, 31), 31);
        o21.a aVar = this.f156103d;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "TimelineWindowRowUIModel(time=" + this.f156100a + ", pickerMinTime=" + this.f156101b + ", pickerMaxTime=" + this.f156102c + ", errorState=" + this.f156103d + ")";
    }

    public e0(b63.v vVar, b63.v vVar2, b63.v vVar3, o21.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, (i14 & 2) != 0 ? v21.d.f175318v : vVar2, (i14 & 4) != 0 ? v21.d.f175319w : vVar3, (i14 & 8) != 0 ? null : aVar);
    }
}
