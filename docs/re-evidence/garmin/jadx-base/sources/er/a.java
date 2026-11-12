package er;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ler/a;", "", "", "progress", "", "percentageString", "", "iconRes", "colorRes", "zoneLabel", "zoneCaption", "valueString", "<init>", "(FLjava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f65051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f65053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65057g;

    public /* synthetic */ a(float f14, String str, Integer num, int i14, String str2, String str3, String str4, int i15, j jVar) {
        this(f14, str, (i15 & 4) != 0 ? null : num, i14, str2, (i15 & 32) != 0 ? null : str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f65051a, aVar.f65051a) == 0 && s.g(this.f65052b, aVar.f65052b) && s.g(this.f65053c, aVar.f65053c) && this.f65054d == aVar.f65054d && s.g(this.f65055e, aVar.f65055e) && s.g(this.f65056f, aVar.f65056f) && s.g(this.f65057g, aVar.f65057g);
    }

    public final int hashCode() {
        int iJ = g.j(Float.hashCode(this.f65051a) * 31, 31, this.f65052b);
        Integer num = this.f65053c;
        int iJ2 = g.j(q2.d(this.f65054d, (iJ + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f65055e);
        String str = this.f65056f;
        return this.f65057g.hashCode() + ((iJ2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ZoneChartItemState(progress=");
        sb3.append(this.f65051a);
        sb3.append(", percentageString=");
        sb3.append(this.f65052b);
        sb3.append(", iconRes=");
        sb3.append(this.f65053c);
        sb3.append(", colorRes=");
        sb3.append(this.f65054d);
        sb3.append(", zoneLabel=");
        sn.a.t(sb3, this.f65055e, ", zoneCaption=", this.f65056f, ", valueString=");
        return am.j.o(this.f65057g, ")", sb3);
    }

    public a(float f14, String str, Integer num, int i14, String str2, String str3, String str4) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str4);
        this.f65051a = f14;
        this.f65052b = str;
        this.f65053c = num;
        this.f65054d = i14;
        this.f65055e = str2;
        this.f65056f = str3;
        this.f65057g = str4;
    }
}
