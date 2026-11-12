package ep0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lep0/c0;", "", "", "trendingTypeKey", "", "statTypeKey", "<init>", "(ILjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64871b;

    public c0(int i14, String str) {
        str.getClass();
        this.f64870a = i14;
        this.f64871b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f64870a == c0Var.f64870a && this.f64871b.equals(c0Var.f64871b);
    }

    public final int hashCode() {
        return this.f64871b.hashCode() + (Integer.hashCode(this.f64870a) * 31);
    }

    public final String toString() {
        return o2.c.e(this.f64870a, "Trend(trendingTypeKey=", ", statTypeKey=", this.f64871b, ")");
    }
}
