package qf2;

import fb1.c;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqf2/a;", "", "", "maxDisconnectTimeBeforeTimeout", "maxDisconnectTimeBeforeWarning", "maxCacheAge", "", "darkThemeEnabled", "useMetricUnits", "isWheelchairMode", "<init>", "(IIIZZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f144649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f144650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f144651f;

    public /* synthetic */ a(int i14, int i15, int i16, boolean z14, boolean z15, boolean z16, int i17, j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16, (i17 & 8) != 0 ? false : z14, (i17 & 16) != 0 ? false : z15, (i17 & 32) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f144646a == aVar.f144646a && this.f144647b == aVar.f144647b && this.f144648c == aVar.f144648c && this.f144649d == aVar.f144649d && this.f144650e == aVar.f144650e && this.f144651f == aVar.f144651f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144651f) + f.g(f.g(q2.d(this.f144648c, q2.d(this.f144647b, Integer.hashCode(this.f144646a) * 31, 31), 31), 31, this.f144649d), 31, this.f144650e);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f144646a, this.f144647b, "LSVSessionConfiguration(maxDisconnectTimeBeforeTimeout=", ", maxDisconnectTimeBeforeWarning=", ", maxCacheAge=");
        c.x(sbJ, this.f144648c, ", darkThemeEnabled=", this.f144649d, ", useMetricUnits=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isWheelchairMode=", ")", sbJ, this.f144650e, this.f144651f);
    }

    public a(int i14, int i15, int i16, boolean z14, boolean z15, boolean z16) {
        this.f144646a = i14;
        this.f144647b = i15;
        this.f144648c = i16;
        this.f144649d = z14;
        this.f144650e = z15;
        this.f144651f = z16;
    }

    public a() {
        this(0, 0, 0, false, false, false, 63, null);
    }
}
