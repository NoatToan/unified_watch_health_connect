package z80;

import b63.o;
import gg1.o0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lz80/l;", "", "", "height", "weight", "Lz80/k;", "gender", "Lb63/o;", "birthDate", "Lgg1/o0;", "measurementSystem", "", "userExternalBottomTimeInSeconds", "Lz80/m;", "userSleepData", "", "Lz80/j;", "sleepWindows", "", "profilePicUrl", "", "isWheelchairUser", "hasWheelchairDeviceCapable", "", "activityLevel", "Lz80/h;", "doNotDisturbMode", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Lz80/k;Lb63/o;Lgg1/o0;JLz80/m;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Lz80/h;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f203072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f203073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f203074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f203075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f203076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f203077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f203078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<j> f203079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f203080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f203081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f203082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f203083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f203084m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Double d14, Double d15, k kVar, o oVar, o0 o0Var, long j8, m mVar, List list, String str, Boolean bool, boolean z14, Integer num, h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? dValueOf : d14, (i14 & 2) == 0 ? d15 : dValueOf, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? null : oVar, (i14 & 16) != 0 ? null : o0Var, (i14 & 32) != 0 ? -1L : j8, (i14 & 64) != 0 ? null : mVar, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : bool, (i14 & 1024) != 0 ? false : z14, (i14 & 2048) == 0 ? num : null, (i14 & 4096) != 0 ? h.c.f203058b : hVar);
    }

    public static l a(l lVar, Double d14, Double d15, k kVar, o oVar, o0 o0Var, long j8, m mVar, List list, String str, Boolean bool, boolean z14, Integer num, h hVar, int i14) {
        Double d16 = (i14 & 1) != 0 ? lVar.f203072a : d14;
        Double d17 = (i14 & 2) != 0 ? lVar.f203073b : d15;
        k kVar2 = (i14 & 4) != 0 ? lVar.f203074c : kVar;
        o oVar2 = (i14 & 8) != 0 ? lVar.f203075d : oVar;
        o0 o0Var2 = (i14 & 16) != 0 ? lVar.f203076e : o0Var;
        long j14 = (i14 & 32) != 0 ? lVar.f203077f : j8;
        m mVar2 = (i14 & 64) != 0 ? lVar.f203078g : mVar;
        List list2 = (i14 & 128) != 0 ? lVar.f203079h : list;
        String str2 = (i14 & 256) != 0 ? lVar.f203080i : str;
        Boolean bool2 = (i14 & 512) != 0 ? lVar.f203081j : bool;
        boolean z15 = (i14 & 1024) != 0 ? lVar.f203082k : z14;
        Integer num2 = (i14 & 2048) != 0 ? lVar.f203083l : num;
        h hVar2 = (i14 & 4096) != 0 ? lVar.f203084m : hVar;
        lVar.getClass();
        hVar2.getClass();
        return new l(d16, d17, kVar2, oVar2, o0Var2, j14, mVar2, list2, str2, bool2, z15, num2, hVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f203072a, lVar.f203072a) && s.g(this.f203073b, lVar.f203073b) && this.f203074c == lVar.f203074c && s.g(this.f203075d, lVar.f203075d) && this.f203076e == lVar.f203076e && this.f203077f == lVar.f203077f && s.g(this.f203078g, lVar.f203078g) && s.g(this.f203079h, lVar.f203079h) && s.g(this.f203080i, lVar.f203080i) && s.g(this.f203081j, lVar.f203081j) && this.f203082k == lVar.f203082k && s.g(this.f203083l, lVar.f203083l) && s.g(this.f203084m, lVar.f203084m);
    }

    public final int hashCode() {
        Double d14 = this.f203072a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f203073b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        k kVar = this.f203074c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        o oVar = this.f203075d;
        int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        o0 o0Var = this.f203076e;
        int iE = q6.f.e((iHashCode4 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31, this.f203077f);
        m mVar = this.f203078g;
        int iHashCode5 = (iE + (mVar == null ? 0 : mVar.hashCode())) * 31;
        List<j> list = this.f203079h;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f203080i;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f203081j;
        int iG = q6.f.g((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f203082k);
        Integer num = this.f203083l;
        return this.f203084m.hashCode() + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("UserProfileData(height=", this.f203072a, this.f203073b, ", weight=", ", gender=");
        sbI.append(this.f203074c);
        sbI.append(", birthDate=");
        sbI.append(this.f203075d);
        sbI.append(", measurementSystem=");
        sbI.append(this.f203076e);
        sbI.append(", userExternalBottomTimeInSeconds=");
        sbI.append(this.f203077f);
        sbI.append(", userSleepData=");
        sbI.append(this.f203078g);
        sbI.append(", sleepWindows=");
        sbI.append(this.f203079h);
        sbI.append(", profilePicUrl=");
        sbI.append(this.f203080i);
        sbI.append(", isWheelchairUser=");
        sbI.append(this.f203081j);
        sbI.append(", hasWheelchairDeviceCapable=");
        sbI.append(this.f203082k);
        sbI.append(", activityLevel=");
        sbI.append(this.f203083l);
        sbI.append(", doNotDisturbMode=");
        sbI.append(this.f203084m);
        sbI.append(")");
        return sbI.toString();
    }

    public l(Double d14, Double d15, k kVar, o oVar, o0 o0Var, long j8, m mVar, List<j> list, String str, Boolean bool, boolean z14, Integer num, h hVar) {
        hVar.getClass();
        this.f203072a = d14;
        this.f203073b = d15;
        this.f203074c = kVar;
        this.f203075d = oVar;
        this.f203076e = o0Var;
        this.f203077f = j8;
        this.f203078g = mVar;
        this.f203079h = list;
        this.f203080i = str;
        this.f203081j = bool;
        this.f203082k = z14;
        this.f203083l = num;
        this.f203084m = hVar;
    }

    public l() {
        this(null, null, null, null, null, 0L, null, null, null, null, false, null, null, 8191, null);
    }
}
