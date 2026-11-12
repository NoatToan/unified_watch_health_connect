package bw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbw2/g;", "", "", "value", "Ltv2/c;", "subText", "<init>", "(ZLtv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f21593b;

    public g(boolean z14, tv2.c cVar) {
        cVar.getClass();
        this.f21592a = z14;
        this.f21593b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f21592a == gVar.f21592a && this.f21593b.equals(gVar.f21593b);
    }

    public final int hashCode() {
        return this.f21593b.hashCode() + (Boolean.hashCode(this.f21592a) * 31);
    }

    public final String toString() {
        return "SwitchOptions(value=" + this.f21592a + ", subText=" + this.f21593b + ")";
    }
}
