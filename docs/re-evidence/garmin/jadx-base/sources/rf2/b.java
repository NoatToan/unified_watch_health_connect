package rf2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrf2/b;", "", "Lrf2/a;", "metric", "", "timestampMillis", "Lrf2/k;", "measurementUnit", "value", "", "formattedValue", "<init>", "(Lrf2/a;ILrf2/k;Ljava/lang/Object;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f152455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f152457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f152458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f152460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152461g;

    public b(a aVar, int i14, k kVar, Object obj, String str) {
        aVar.getClass();
        str.getClass();
        this.f152455a = aVar;
        this.f152456b = i14;
        this.f152457c = kVar;
        this.f152458d = obj;
        this.f152459e = str;
        Float f14 = obj instanceof Float ? (Float) obj : null;
        if (f14 != null) {
            this.f152460f = Float.valueOf(f14.floatValue());
        } else {
            this.f152461g = obj instanceof String ? (String) obj : null;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getF152460f() {
        return this.f152460f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getF152455a() {
        return this.f152455a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF152461g() {
        return this.f152461g;
    }

    public final boolean d() {
        return s.g(this.f152461g, "--");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f152455a == bVar.f152455a && this.f152456b == bVar.f152456b && this.f152457c == bVar.f152457c && s.g(this.f152458d, bVar.f152458d) && s.g(this.f152459e, bVar.f152459e);
    }

    public final int hashCode() {
        int iD = q2.d(this.f152456b, this.f152455a.hashCode() * 31, 31);
        k kVar = this.f152457c;
        int iHashCode = (iD + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Object obj = this.f152458d;
        return this.f152459e.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LSVMetricDatum(metric=");
        sb3.append(this.f152455a);
        sb3.append(", timestampMillis=");
        sb3.append(this.f152456b);
        sb3.append(", measurementUnit=");
        sb3.append(this.f152457c);
        sb3.append(", value=");
        sb3.append(this.f152458d);
        sb3.append(", formattedValue=");
        return am.j.o(this.f152459e, ")", sb3);
    }

    public /* synthetic */ b(a aVar, int i14, k kVar, Object obj, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this(aVar, i14, (i15 & 4) != 0 ? null : kVar, obj, (i15 & 16) != 0 ? "--" : str);
    }
}
