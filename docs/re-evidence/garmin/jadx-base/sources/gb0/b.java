package gb0;

import am.j;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgb0/b;", "", "", "value", "unitStringRes", "unitStringDescriptionRes", "<init>", "(III)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76644c;

    public b(int i14, int i15, int i16) {
        this.f76642a = i14;
        this.f76643b = i15;
        this.f76644c = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f76642a == bVar.f76642a && this.f76643b == bVar.f76643b && this.f76644c == bVar.f76644c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76644c) + q2.d(this.f76643b, Integer.hashCode(this.f76642a) * 31, 31);
    }

    public final String toString() {
        return j.q(e5.j(this.f76642a, this.f76643b, "ValueLabelData(value=", ", unitStringRes=", ", unitStringDescriptionRes="), this.f76644c, ")");
    }
}
