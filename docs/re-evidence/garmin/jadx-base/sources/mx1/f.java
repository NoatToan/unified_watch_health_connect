package mx1;

import c22.o;
import c22.p3;
import ch.qos.logback.core.joran.action.Action;
import ds.e0;
import j20.x;
import j23.l;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmx1/f;", "", "", Action.KEY_ATTRIBUTE, "apiKey", "", "nameResId", "daysPerWeek", "Lmx1/e;", "repSetIntensity", "Lj23/l;", "planWeeksDurationInterval", "estimatedWorkoutMinutesDurationInterval", "", "daysSummariesResIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILmx1/e;Lj23/l;Lj23/l;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f121399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f121400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f121401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Integer> f121402h;

    public f(String str, String str2, int i14, int i15, e eVar, l lVar, l lVar2, List<Integer> list) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        lVar2.getClass();
        list.getClass();
        this.f121395a = str;
        this.f121396b = str2;
        this.f121397c = i14;
        this.f121398d = i15;
        this.f121399e = eVar;
        this.f121400f = lVar;
        this.f121401g = lVar2;
        this.f121402h = list;
    }

    public static f a(f fVar, int i14, e eVar, int i15) {
        String str = fVar.f121395a;
        String str2 = fVar.f121396b;
        int i16 = fVar.f121397c;
        if ((i15 & 8) != 0) {
            i14 = fVar.f121398d;
        }
        int i17 = i14;
        if ((i15 & 16) != 0) {
            eVar = fVar.f121399e;
        }
        l lVar = fVar.f121400f;
        l lVar2 = fVar.f121401g;
        List<Integer> list = fVar.f121402h;
        fVar.getClass();
        return new f(str, str2, i16, i17, eVar, lVar, lVar2, list);
    }

    public final String b() {
        String str;
        String str2;
        ox1.a.f134331a.getClass();
        String str3 = g.f121403a.f121395a;
        String str4 = this.f121395a;
        boolean zEquals = str4.equals(str3);
        e eVar = this.f121399e;
        if (zEquals) {
            str = eVar == e.REP_5 ? "IncreaseMaxStrength_PPL.png" : "BuildMuscleMass_PPL.png";
        } else if (str4.equals(g.f121404b.f121395a)) {
            str = eVar == e.REP_5 ? "IncreaseMaxStrength_Big5.png" : "BuildMuscleMass_Big5.png";
        } else if (str4.equals(g.f121405c.f121395a)) {
            str = "IncreaseMaxStrength_Powerlifting.png";
        } else if (str4.equals(g.f121406d.f121395a)) {
            str = "BuildMuscleMass_Bodybuilding.png";
        } else {
            str = str4.equals(g.f121407e.f121395a) ? "GetFit_StrengthBuilder.png" : "GetFit_FitnessActivator.png";
        }
        String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL);
        int iF = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).f();
        if (iF <= 120) {
            str2 = p3.LDPI.f23201a;
        } else if (iF <= 160) {
            str2 = p3.MDPI.f23201a;
        } else if (iF <= 240) {
            str2 = p3.HDPI.f23201a;
        } else {
            str2 = iF <= 320 ? p3.XHDPI.f23201a : p3.XXHDPI.f23201a;
        }
        return x.d(strK, "/images/training-plans/strength/", str2, "/", str);
    }

    public final boolean c() {
        return this.f121395a.equals(g.f121409g.f121395a);
    }

    public final boolean d() {
        return p13.x.k(g.f121407e.f121395a, g.f121408f.f121395a).contains(this.f121395a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f121395a.equals(fVar.f121395a) && this.f121396b.equals(fVar.f121396b) && this.f121397c == fVar.f121397c && this.f121398d == fVar.f121398d && this.f121399e == fVar.f121399e && this.f121400f.equals(fVar.f121400f) && this.f121401g.equals(fVar.f121401g) && this.f121402h.equals(fVar.f121402h);
    }

    public final int hashCode() {
        int iD = q2.d(this.f121398d, q2.d(this.f121397c, wr.g.j(this.f121395a.hashCode() * 31, 31, this.f121396b), 31), 31);
        e eVar = this.f121399e;
        return this.f121402h.hashCode() + ((this.f121401g.hashCode() + ((this.f121400f.hashCode() + ((iD + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("StrengthTrainingPlanType(key=", this.f121395a, ", apiKey=", this.f121396b, ", nameResId=");
        e0.m(this.f121397c, this.f121398d, ", daysPerWeek=", ", repSetIntensity=", sbI);
        sbI.append(this.f121399e);
        sbI.append(", planWeeksDurationInterval=");
        sbI.append(this.f121400f);
        sbI.append(", estimatedWorkoutMinutesDurationInterval=");
        sbI.append(this.f121401g);
        sbI.append(", daysSummariesResIds=");
        sbI.append(this.f121402h);
        sbI.append(")");
        return sbI.toString();
    }
}
