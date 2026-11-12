package bt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt1/j;", "", "", "value", "", "formattedValue", "<init>", "(FLjava/lang/String;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21113b;

    public /* synthetic */ j(float f14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, (i14 & 2) != 0 ? String.valueOf((int) f14) : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f21112a, jVar.f21112a) == 0 && p005kotlin.jvm.internal.s.g(this.f21113b, jVar.f21113b);
    }

    public final int hashCode() {
        return this.f21113b.hashCode() + (Float.hashCode(this.f21112a) * 31);
    }

    public final String toString() {
        return "FloatPickerValue(value=" + this.f21112a + ", formattedValue=" + this.f21113b + ")";
    }

    public j(float f14, String str) {
        str.getClass();
        this.f21112a = f14;
        this.f21113b = str;
    }
}
