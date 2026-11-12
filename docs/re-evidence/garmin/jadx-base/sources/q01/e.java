package q01;

import b63.v;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lq01/e;", "", "", FirebaseAnalytics.Param.INDEX, "", TtmlNode.ATTR_ID, "", "name", "", "isEditable", Constants.ENABLE_DISABLE, "isTranslated", "Lb63/v;", "startTime", "endTime", "displayOrder", "Lk01/d;", "goals", "goalPercentage", "defaultMealName", "<init>", "(ILjava/lang/Long;Ljava/lang/String;ZZZLb63/v;Lb63/v;Ljava/lang/Integer;Lk01/d;ILjava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f141993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f141994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f141996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f141997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f141998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f141999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f142000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f142001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k01.d f142002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f142003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f142004l;

    public /* synthetic */ e(int i14, Long l14, String str, boolean z14, boolean z15, boolean z16, v vVar, v vVar2, Integer num, k01.d dVar, int i15, String str2, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, l14, str, z14, z15, z16, vVar, vVar2, num, dVar, (i16 & 1024) != 0 ? 0 : i15, str2);
    }

    public static e a(e eVar, String str, boolean z14, boolean z15, v vVar, v vVar2, k01.d dVar, int i14, int i15) {
        int i16 = eVar.f141993a;
        Long l14 = eVar.f141994b;
        if ((i15 & 4) != 0) {
            str = eVar.f141995c;
        }
        String str2 = str;
        boolean z16 = eVar.f141996d;
        boolean z17 = (i15 & 16) != 0 ? eVar.f141997e : z14;
        boolean z18 = (i15 & 32) != 0 ? eVar.f141998f : z15;
        v vVar3 = (i15 & 64) != 0 ? eVar.f141999g : vVar;
        v vVar4 = (i15 & 128) != 0 ? eVar.f142000h : vVar2;
        Integer num = eVar.f142001i;
        k01.d dVar2 = (i15 & 512) != 0 ? eVar.f142002j : dVar;
        int i17 = (i15 & 1024) != 0 ? eVar.f142003k : i14;
        String str3 = eVar.f142004l;
        eVar.getClass();
        str2.getClass();
        return new e(i16, l14, str2, z16, z17, z18, vVar3, vVar4, num, dVar2, i17, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f141993a == eVar.f141993a && s.g(this.f141994b, eVar.f141994b) && s.g(this.f141995c, eVar.f141995c) && this.f141996d == eVar.f141996d && this.f141997e == eVar.f141997e && this.f141998f == eVar.f141998f && s.g(this.f141999g, eVar.f141999g) && s.g(this.f142000h, eVar.f142000h) && s.g(this.f142001i, eVar.f142001i) && s.g(this.f142002j, eVar.f142002j) && this.f142003k == eVar.f142003k && s.g(this.f142004l, eVar.f142004l);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f141993a) * 31;
        Long l14 = this.f141994b;
        int iG = q6.f.g(q6.f.g(q6.f.g(wr.g.j((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.f141995c), 31, this.f141996d), 31, this.f141997e), 31, this.f141998f);
        v vVar = this.f141999g;
        int iHashCode2 = (iG + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        v vVar2 = this.f142000h;
        int iHashCode3 = (iHashCode2 + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        Integer num = this.f142001i;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        k01.d dVar = this.f142002j;
        int iD = q2.d(this.f142003k, (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str = this.f142004l;
        return iD + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealSettingsItem(index=");
        sb3.append(this.f141993a);
        sb3.append(", id=");
        sb3.append(this.f141994b);
        sb3.append(", name=");
        v.h.C(this.f141995c, ", isEditable=", ", isEnabled=", sb3, this.f141996d);
        kg.f.q(", isTranslated=", ", startTime=", sb3, this.f141997e, this.f141998f);
        sb3.append(this.f141999g);
        sb3.append(", endTime=");
        sb3.append(this.f142000h);
        sb3.append(", displayOrder=");
        sb3.append(this.f142001i);
        sb3.append(", goals=");
        sb3.append(this.f142002j);
        sb3.append(", goalPercentage=");
        sb3.append(this.f142003k);
        sb3.append(", defaultMealName=");
        sb3.append(this.f142004l);
        sb3.append(")");
        return sb3.toString();
    }

    public e(int i14, Long l14, String str, boolean z14, boolean z15, boolean z16, v vVar, v vVar2, Integer num, k01.d dVar, int i15, String str2) {
        str.getClass();
        this.f141993a = i14;
        this.f141994b = l14;
        this.f141995c = str;
        this.f141996d = z14;
        this.f141997e = z15;
        this.f141998f = z16;
        this.f141999g = vVar;
        this.f142000h = vVar2;
        this.f142001i = num;
        this.f142002j = dVar;
        this.f142003k = i15;
        this.f142004l = str2;
    }
}
