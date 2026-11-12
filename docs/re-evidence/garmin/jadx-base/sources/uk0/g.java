package uk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c80.w;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import gg1.o0;
import gl1.y;
import java.text.NumberFormat;
import p005kotlin.Metadata;
import p3.x1;
import r1.q2;
import rk0.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Luk0/g;", "Luk0/e;", "", TtmlNode.ATTR_ID, "Lc80/u;", "gearType", "nickname", "brand", ModelSourceWrapper.TYPE, "", "activityCount", "Lb63/o;", "firstUseDate", "Lc80/w;", "usageType", "maxUsageDate", "", "maxUsageDistanceMeters", "", "maxUsageDurationSeconds", "durationUsedSeconds", "distanceUsedMeters", "", "retired", "numActivitiesLinked", "daysUsed", "<init>", "(Ljava/lang/String;Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILb63/o;Lc80/w;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;ZLjava/lang/Integer;Ljava/lang/Long;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c80.u f171813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f171815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f171816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f171817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b63.o f171818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f171819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b63.o f171820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f171821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f171822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f171823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f171824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f171825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f171826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f171827p;

    public g(String str, c80.u uVar, String str2, String str3, String str4, int i14, b63.o oVar, w wVar, b63.o oVar2, Double d14, Long l14, Long l15, Double d15, boolean z14, Integer num, Long l16) {
        str.getClass();
        uVar.getClass();
        str3.getClass();
        oVar.getClass();
        wVar.getClass();
        this.f171812a = str;
        this.f171813b = uVar;
        this.f171814c = str2;
        this.f171815d = str3;
        this.f171816e = str4;
        this.f171817f = i14;
        this.f171818g = oVar;
        this.f171819h = wVar;
        this.f171820i = oVar2;
        this.f171821j = d14;
        this.f171822k = l14;
        this.f171823l = l15;
        this.f171824m = d15;
        this.f171825n = z14;
        this.f171826o = num;
        this.f171827p = l16;
    }

    @Override // uk0.e
    public final String a(p3.m mVar) {
        mVar.C(1628124943);
        x1 x1Var = p3.n.f135158a;
        r.f171870a.getClass();
        String strB = r.b(this.f171814c, this.f171815d, this.f171816e, mVar);
        mVar.f();
        return strB;
    }

    @Override // uk0.e
    public final String b(p3.m mVar) {
        mVar.C(547407871);
        x1 x1Var = p3.n.f135158a;
        r.f171870a.getClass();
        String strC = r.c(this.f171814c, this.f171815d, this.f171816e, mVar);
        mVar.f();
        return strC;
    }

    @Override // uk0.e
    public final Double c(b63.o oVar) {
        oVar.getClass();
        t.f171871a.getClass();
        return t.b(this.f171819h, this.f171820i, this.f171821j, this.f171822k, this.f171823l, this.f171824m, this.f171818g, oVar);
    }

    @Override // uk0.e
    public final String d(p3.m mVar) {
        mVar.C(1196273860);
        x1 x1Var = p3.n.f135158a;
        String strL = xy2.b.l(this.f171813b, mVar);
        mVar.f();
        return strL;
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF171825n() {
        return this.f171825n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f171812a.equals(gVar.f171812a) && this.f171813b == gVar.f171813b && p005kotlin.jvm.internal.s.g(this.f171814c, gVar.f171814c) && this.f171815d.equals(gVar.f171815d) && p005kotlin.jvm.internal.s.g(this.f171816e, gVar.f171816e) && this.f171817f == gVar.f171817f && this.f171818g.equals(gVar.f171818g) && this.f171819h == gVar.f171819h && p005kotlin.jvm.internal.s.g(this.f171820i, gVar.f171820i) && p005kotlin.jvm.internal.s.g(this.f171821j, gVar.f171821j) && p005kotlin.jvm.internal.s.g(this.f171822k, gVar.f171822k) && p005kotlin.jvm.internal.s.g(this.f171823l, gVar.f171823l) && p005kotlin.jvm.internal.s.g(this.f171824m, gVar.f171824m) && this.f171825n == gVar.f171825n && p005kotlin.jvm.internal.s.g(this.f171826o, gVar.f171826o) && p005kotlin.jvm.internal.s.g(this.f171827p, gVar.f171827p);
    }

    @Override // uk0.e
    public final String f(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        mVar.C(1812477502);
        x1 x1Var = p3.n.f135158a;
        t.f171871a.getClass();
        String strA = t.a(this.f171819h, this.f171820i, this.f171821j, this.f171822k, this.f171823l, this.f171824m, o0Var, mVar, ((i14 << 18) & 3670016) | 12582912);
        mVar.f();
        return strA;
    }

    @Override // uk0.e
    public final i53.c g(p3.m mVar) {
        mVar.C(415629053);
        x1 x1Var = p3.n.f135158a;
        pi0.e eVar = new pi0.e((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        q13.b bVarB = p13.w.b();
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        int i14 = this.f171817f;
        String str = integerInstance.format(Integer.valueOf(i14));
        if (i14 == 1) {
            mVar.C(10494163);
            bVarB.add(y.Q(mVar, R.string.lbl_common_one_activity));
            mVar.f();
        } else {
            mVar.C(10585334);
            str.getClass();
            bVarB.add(y.P(R.string.lbl_common_number_of_activities, new Object[]{str}, mVar));
            mVar.f();
        }
        bVarB.add(y.P(R.string.first_use_value, new Object[]{eVar.d(g22.l.h(this.f171818g), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY)}, mVar));
        i53.c cVarE = i53.a.e(p13.w.a(bVarB));
        mVar.f();
        return cVarE;
    }

    @Override // uk0.e
    public final u4.d getIcon() {
        return this.f171813b.f25613a;
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF171812a() {
        return this.f171812a;
    }

    public final f0 h() {
        return new f0(this.f171812a, null, this.f171813b, Boolean.valueOf(this.f171825n), this.f171814c, this.f171815d, this.f171816e, null, null, this.f171818g, this.f171819h, null, this.f171820i, this.f171821j, this.f171822k, this.f171823l, this.f171824m, this.f171826o, this.f171827p, null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f171813b.hashCode() + (this.f171812a.hashCode() * 31)) * 31;
        String str = this.f171814c;
        int iJ = wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f171815d);
        String str2 = this.f171816e;
        int iHashCode2 = (this.f171819h.hashCode() + n23.j.a(this.f171818g.f16206a, q2.d(this.f171817f, (iJ + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31)) * 31;
        b63.o oVar = this.f171820i;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Double d14 = this.f171821j;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l14 = this.f171822k;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f171823l;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Double d15 = this.f171824m;
        int iG = q6.f.g((iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.f171825n);
        Integer num = this.f171826o;
        int iHashCode7 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f171827p;
        return iHashCode7 + (l16 != null ? l16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearData(id=");
        sb3.append(this.f171812a);
        sb3.append(", gearType=");
        sb3.append(this.f171813b);
        sb3.append(", nickname=");
        sn.a.t(sb3, this.f171814c, ", brand=", this.f171815d, ", model=");
        q6.f.q(this.f171817f, this.f171816e, ", activityCount=", ", firstUseDate=", sb3);
        sb3.append(this.f171818g);
        sb3.append(", usageType=");
        sb3.append(this.f171819h);
        sb3.append(", maxUsageDate=");
        sb3.append(this.f171820i);
        sb3.append(", maxUsageDistanceMeters=");
        sb3.append(this.f171821j);
        sb3.append(", maxUsageDurationSeconds=");
        kg.f.s(sb3, this.f171822k, ", durationUsedSeconds=", this.f171823l, ", distanceUsedMeters=");
        sb3.append(this.f171824m);
        sb3.append(", retired=");
        sb3.append(this.f171825n);
        sb3.append(", numActivitiesLinked=");
        sb3.append(this.f171826o);
        sb3.append(", daysUsed=");
        sb3.append(this.f171827p);
        sb3.append(")");
        return sb3.toString();
    }
}
