package gr;

import am.x0;
import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgr/a;", "", "", "Lam/x0;", "activityTypes", "recentActivityTypes", "selectedActivityType", "initialSelectedType", "", "initialScrollIndex", "", "shouldUnlinkEvent", "showChangeTypeDialog", "pendingActivityType", "", "deviceId", "suggestedActivityTypes", "<init>", "(Ljava/util/List;Ljava/util/List;Lam/x0;Lam/x0;IZZLam/x0;Ljava/lang/Long;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x0> f78514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x0> f78515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f78516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f78517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f78519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f78521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f78522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<x0> f78523j;

    public a(List list, List list2, x0 x0Var, x0 x0Var2, int i14, boolean z14, boolean z15, x0 x0Var3, Long l14, List list3, int i15, j jVar) {
        this((i15 & 1) != 0 ? j0.f134944a : list, (i15 & 2) != 0 ? j0.f134944a : list2, (i15 & 4) != 0 ? null : x0Var, (i15 & 8) != 0 ? null : x0Var2, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? null : x0Var3, (i15 & 256) != 0 ? null : l14, (i15 & 512) != 0 ? j0.f134944a : list3);
    }

    public static a a(a aVar, List list, x0 x0Var, int i14, boolean z14, boolean z15, x0 x0Var2, int i15) {
        List<x0> list2 = aVar.f78514a;
        if ((i15 & 2) != 0) {
            list = aVar.f78515b;
        }
        List list3 = list;
        if ((i15 & 4) != 0) {
            x0Var = aVar.f78516c;
        }
        x0 x0Var3 = x0Var;
        x0 x0Var4 = aVar.f78517d;
        if ((i15 & 16) != 0) {
            i14 = aVar.f78518e;
        }
        int i16 = i14;
        boolean z16 = (i15 & 32) != 0 ? aVar.f78519f : z14;
        boolean z17 = (i15 & 64) != 0 ? aVar.f78520g : z15;
        x0 x0Var5 = (i15 & 128) != 0 ? aVar.f78521h : x0Var2;
        Long l14 = aVar.f78522i;
        List<x0> list4 = aVar.f78523j;
        aVar.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new a(list2, list3, x0Var3, x0Var4, i16, z16, z17, x0Var5, l14, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f78514a, aVar.f78514a) && s.g(this.f78515b, aVar.f78515b) && this.f78516c == aVar.f78516c && this.f78517d == aVar.f78517d && this.f78518e == aVar.f78518e && this.f78519f == aVar.f78519f && this.f78520g == aVar.f78520g && this.f78521h == aVar.f78521h && s.g(this.f78522i, aVar.f78522i) && s.g(this.f78523j, aVar.f78523j);
    }

    public final int hashCode() {
        int iB = u0.b(this.f78514a.hashCode() * 31, 31, this.f78515b);
        x0 x0Var = this.f78516c;
        int iHashCode = (iB + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        x0 x0Var2 = this.f78517d;
        int iG = f.g(f.g(q2.d(this.f78518e, (iHashCode + (x0Var2 == null ? 0 : x0Var2.hashCode())) * 31, 31), 31, this.f78519f), 31, this.f78520g);
        x0 x0Var3 = this.f78521h;
        int iHashCode2 = (iG + (x0Var3 == null ? 0 : x0Var3.hashCode())) * 31;
        Long l14 = this.f78522i;
        return this.f78523j.hashCode() + ((iHashCode2 + (l14 != null ? l14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("ActivityTypesUIState(activityTypes=", ", recentActivityTypes=", ", selectedActivityType=", this.f78514a, this.f78515b);
        sbK.append(this.f78516c);
        sbK.append(", initialSelectedType=");
        sbK.append(this.f78517d);
        sbK.append(", initialScrollIndex=");
        fb1.c.x(sbK, this.f78518e, ", shouldUnlinkEvent=", this.f78519f, ", showChangeTypeDialog=");
        sbK.append(this.f78520g);
        sbK.append(", pendingActivityType=");
        sbK.append(this.f78521h);
        sbK.append(", deviceId=");
        sbK.append(this.f78522i);
        sbK.append(", suggestedActivityTypes=");
        sbK.append(this.f78523j);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends x0> list, List<? extends x0> list2, x0 x0Var, x0 x0Var2, int i14, boolean z14, boolean z15, x0 x0Var3, Long l14, List<? extends x0> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f78514a = list;
        this.f78515b = list2;
        this.f78516c = x0Var;
        this.f78517d = x0Var2;
        this.f78518e = i14;
        this.f78519f = z14;
        this.f78520g = z15;
        this.f78521h = x0Var3;
        this.f78522i = l14;
        this.f78523j = list3;
    }

    public a() {
        this(null, null, null, null, 0, false, false, null, null, null, 1023, null);
    }
}
