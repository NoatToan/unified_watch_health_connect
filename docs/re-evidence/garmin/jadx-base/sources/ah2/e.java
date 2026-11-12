package ah2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lah2/e;", "", "", "formattedString", "", "floatValue", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f3290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3291c;

    public /* synthetic */ e(String str, Float f14, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : f14, (i14 & 4) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f3289a, eVar.f3289a) && s.g(this.f3290b, eVar.f3290b) && this.f3291c == eVar.f3291c;
    }

    public final int hashCode() {
        int iHashCode = this.f3289a.hashCode() * 31;
        Float f14 = this.f3290b;
        return Boolean.hashCode(this.f3291c) + ((iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveActivityFormattedMetric(formattedString=");
        sb3.append(this.f3289a);
        sb3.append(", floatValue=");
        sb3.append(this.f3290b);
        sb3.append(", enabled=");
        return hb.a.k(sb3, this.f3291c, ")");
    }

    public e(String str, Float f14, boolean z14) {
        str.getClass();
        this.f3289a = str;
        this.f3290b = f14;
        this.f3291c = z14;
    }
}
