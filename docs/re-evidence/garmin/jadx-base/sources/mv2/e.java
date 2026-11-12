package mv2;

import am.j;
import j20.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmv2/e;", "", "", "seconds", "Ltv2/c;", "formattedValue", "pickerTitle", "minimum", "maximum", "granularity", "<init>", "(JLtv2/c;Ltv2/c;JJJ)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f121207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f121208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv2.c f121209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f121210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f121211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f121212f;

    public e(long j8, tv2.c cVar, tv2.c cVar2, long j14, long j15, long j16) {
        cVar.getClass();
        cVar2.getClass();
        this.f121207a = j8;
        this.f121208b = cVar;
        this.f121209c = cVar2;
        this.f121210d = j14;
        this.f121211e = j15;
        this.f121212f = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f121207a == eVar.f121207a && this.f121208b.equals(eVar.f121208b) && this.f121209c.equals(eVar.f121209c) && this.f121210d == eVar.f121210d && this.f121211e == eVar.f121211e && this.f121212f == eVar.f121212f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f121212f) + q6.f.e(q6.f.e(wr.g.l(this.f121209c, wr.g.l(this.f121208b, Long.hashCode(this.f121207a) * 31, 31), 31), 31, this.f121210d), 31, this.f121211e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TimePickerOptions(seconds=");
        sb3.append(this.f121207a);
        sb3.append(", formattedValue=");
        sb3.append(this.f121208b);
        sb3.append(", pickerTitle=");
        sb3.append(this.f121209c);
        sb3.append(", minimum=");
        sb3.append(this.f121210d);
        x.j(this.f121211e, ", maximum=", ", granularity=", sb3);
        return j.i(this.f121212f, ")", sb3);
    }
}
