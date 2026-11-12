package rl1;

import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrl1/h;", "", "", "deepSleepMinutes", "lightSleepMinutes", "remSleepMinutes", "awakeSleepMinutes", "totalSleepMinutes", "", "isValidManualSleep", "unmeasuredData", "<init>", "(IIIIIZZ)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f153420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153421g;

    public /* synthetic */ h(int i14, int i15, int i16, int i17, int i18, boolean z14, boolean z15, int i19, p005kotlin.jvm.internal.j jVar) {
        this((i19 & 1) != 0 ? 0 : i14, (i19 & 2) != 0 ? 0 : i15, (i19 & 4) != 0 ? 0 : i16, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f153415a == hVar.f153415a && this.f153416b == hVar.f153416b && this.f153417c == hVar.f153417c && this.f153418d == hVar.f153418d && this.f153419e == hVar.f153419e && this.f153420f == hVar.f153420f && this.f153421g == hVar.f153421g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153421g) + q6.f.g(q2.d(this.f153419e, q2.d(this.f153418d, q2.d(this.f153417c, q2.d(this.f153416b, Integer.hashCode(this.f153415a) * 31, 31), 31), 31), 31), 31, this.f153420f);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f153415a, this.f153416b, "SleepStagesChartData(deepSleepMinutes=", ", lightSleepMinutes=", ", remSleepMinutes=");
        e0.m(this.f153417c, this.f153418d, ", awakeSleepMinutes=", ", totalSleepMinutes=", sbJ);
        fb1.c.x(sbJ, this.f153419e, ", isValidManualSleep=", this.f153420f, ", unmeasuredData=");
        return hb.a.k(sbJ, this.f153421g, ")");
    }

    public h(int i14, int i15, int i16, int i17, int i18, boolean z14, boolean z15) {
        this.f153415a = i14;
        this.f153416b = i15;
        this.f153417c = i16;
        this.f153418d = i17;
        this.f153419e = i18;
        this.f153420f = z14;
        this.f153421g = z15;
    }
}
