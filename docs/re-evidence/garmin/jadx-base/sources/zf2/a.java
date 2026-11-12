package zf2;

import ds.e0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzf2/a;", "", "Lzf2/d;", "activityType", "", "activityTypeKey", "", "sportFITType", "sportFITSubType", "", "Lzf2/c;", "activityTargets", "activityName", "", "activityWithGps", "hasWorkoutSupport", "<init>", "(Lzf2/d;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;ZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f204562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f204565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c> f204566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f204567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f204568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f204569h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(d dVar, String str, int i14, int i15, List<? extends c> list, String str2, boolean z14, boolean z15) {
        dVar.getClass();
        list.getClass();
        this.f204562a = dVar;
        this.f204563b = str;
        this.f204564c = i14;
        this.f204565d = i15;
        this.f204566e = list;
        this.f204567f = str2;
        this.f204568g = z14;
        this.f204569h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f204562a == aVar.f204562a && s.g(this.f204563b, aVar.f204563b) && this.f204564c == aVar.f204564c && this.f204565d == aVar.f204565d && this.f204566e.equals(aVar.f204566e) && s.g(this.f204567f, aVar.f204567f) && this.f204568g == aVar.f204568g && this.f204569h == aVar.f204569h;
    }

    public final int hashCode() {
        int iHashCode = this.f204562a.hashCode() * 31;
        String str = this.f204563b;
        int iB = u0.b(q2.d(this.f204565d, q2.d(this.f204564c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f204566e);
        String str2 = this.f204567f;
        return Boolean.hashCode(this.f204569h) + q6.f.g((iB + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f204568g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityMetadata(activityType=");
        sb3.append(this.f204562a);
        sb3.append(", activityTypeKey=");
        sb3.append(this.f204563b);
        sb3.append(", sportFITType=");
        e0.m(this.f204564c, this.f204565d, ", sportFITSubType=", ", activityTargets=", sb3);
        o2.c.n(", activityName=", this.f204567f, ", activityWithGps=", sb3, this.f204566e);
        return com.airbnb.lottie.animation.keyframe.a.f(", hasWorkoutSupport=", ")", sb3, this.f204568g, this.f204569h);
    }
}
