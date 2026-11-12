package tm1;

import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltm1/b;", "", "", "deepSleepMinutes", "lightSleepMinutes", "remSleepMinutes", "awakeSleepMinutes", "totalSleepMinutes", "", "isManualSleep", "<init>", "(IIIIIZ)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f165442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f165443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f165444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f165445f;

    public /* synthetic */ b(int i14, int i15, int i16, int i17, int i18, boolean z14, int i19, j jVar) {
        this((i19 & 1) != 0 ? 0 : i14, (i19 & 2) != 0 ? 0 : i15, (i19 & 4) != 0 ? 0 : i16, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18, (i19 & 32) != 0 ? false : z14);
    }

    public final boolean a() {
        return this.f165445f && this.f165444e > 0 && this.f165440a <= 0 && this.f165441b <= 0 && this.f165442c <= 0 && this.f165443d <= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f165440a == bVar.f165440a && this.f165441b == bVar.f165441b && this.f165442c == bVar.f165442c && this.f165443d == bVar.f165443d && this.f165444e == bVar.f165444e && this.f165445f == bVar.f165445f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165445f) + q2.d(this.f165444e, q2.d(this.f165443d, q2.d(this.f165442c, q2.d(this.f165441b, Integer.hashCode(this.f165440a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f165440a, this.f165441b, "SleepStagesData(deepSleepMinutes=", ", lightSleepMinutes=", ", remSleepMinutes=");
        e0.m(this.f165442c, this.f165443d, ", awakeSleepMinutes=", ", totalSleepMinutes=", sbJ);
        sbJ.append(this.f165444e);
        sbJ.append(", isManualSleep=");
        sbJ.append(this.f165445f);
        sbJ.append(")");
        return sbJ.toString();
    }

    public b(int i14, int i15, int i16, int i17, int i18, boolean z14) {
        this.f165440a = i14;
        this.f165441b = i15;
        this.f165442c = i16;
        this.f165443d = i17;
        this.f165444e = i18;
        this.f165445f = z14;
    }

    public b() {
        this(0, 0, 0, 0, 0, false, 63, null);
    }
}
