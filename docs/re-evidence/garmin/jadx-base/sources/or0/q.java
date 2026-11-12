package or0;

import b63.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lor0/q;", "", "", "isLoading", "isCurrentWeek", "Lo82/g;", "initialSelectedIntervalType", "Lb63/o;", "initialSelectedDate", "", "weeklyGoal", "Lir0/d;", "currentWeekIntensityMinutes", "<init>", "(ZZLo82/g;Lb63/o;ILir0/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f133397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o82.g f133399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f133400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f133401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ir0.d f133402f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(boolean z14, boolean z15, o82.g gVar, b63.o oVar, int i14, ir0.d dVar, int i15, p005kotlin.jvm.internal.j jVar) {
        z14 = (i15 & 1) != 0 ? false : z14;
        z15 = (i15 & 2) != 0 ? true : z15;
        gVar = (i15 & 4) != 0 ? o82.g.f130850c : gVar;
        if ((i15 & 8) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(z14, z15, gVar, oVar, (i15 & 16) != 0 ? 150 : i14, (i15 & 32) != 0 ? new ir0.d(0, 0, 0, 7, null) : dVar);
    }

    public static q a(q qVar, boolean z14, boolean z15, o82.g gVar, b63.o oVar, int i14, ir0.d dVar, int i15) {
        if ((i15 & 1) != 0) {
            z14 = qVar.f133397a;
        }
        boolean z16 = z14;
        if ((i15 & 2) != 0) {
            z15 = qVar.f133398b;
        }
        boolean z17 = z15;
        if ((i15 & 4) != 0) {
            gVar = qVar.f133399c;
        }
        o82.g gVar2 = gVar;
        if ((i15 & 8) != 0) {
            oVar = qVar.f133400d;
        }
        b63.o oVar2 = oVar;
        if ((i15 & 16) != 0) {
            i14 = qVar.f133401e;
        }
        int i16 = i14;
        if ((i15 & 32) != 0) {
            dVar = qVar.f133402f;
        }
        ir0.d dVar2 = dVar;
        qVar.getClass();
        gVar2.getClass();
        oVar2.getClass();
        dVar2.getClass();
        return new q(z16, z17, gVar2, oVar2, i16, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f133397a == qVar.f133397a && this.f133398b == qVar.f133398b && this.f133399c == qVar.f133399c && s.g(this.f133400d, qVar.f133400d) && this.f133401e == qVar.f133401e && s.g(this.f133402f, qVar.f133402f);
    }

    public final int hashCode() {
        return this.f133402f.hashCode() + q2.d(this.f133401e, n23.j.a(this.f133400d.f16206a, q6.f.i(this.f133399c, q6.f.g(Boolean.hashCode(this.f133397a) * 31, 31, this.f133398b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("IntensityMinutesUiState(isLoading=", ", isCurrentWeek=", ", initialSelectedIntervalType=", this.f133397a, this.f133398b);
        sbM.append(this.f133399c);
        sbM.append(", initialSelectedDate=");
        sbM.append(this.f133400d);
        sbM.append(", weeklyGoal=");
        sbM.append(this.f133401e);
        sbM.append(", currentWeekIntensityMinutes=");
        sbM.append(this.f133402f);
        sbM.append(")");
        return sbM.toString();
    }

    public q(boolean z14, boolean z15, o82.g gVar, b63.o oVar, int i14, ir0.d dVar) {
        gVar.getClass();
        oVar.getClass();
        dVar.getClass();
        this.f133397a = z14;
        this.f133398b = z15;
        this.f133399c = gVar;
        this.f133400d = oVar;
        this.f133401e = i14;
        this.f133402f = dVar;
    }

    public q() {
        this(false, false, null, null, 0, null, 63, null);
    }
}
