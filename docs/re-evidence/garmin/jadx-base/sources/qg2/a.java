package qg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqg2/a;", "", "Lqg2/b;", "constraints", "", "invertAxis", "<init>", "(Lqg2/b;Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f144671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144672b;

    public a(b bVar, boolean z14) {
        bVar.getClass();
        this.f144671a = bVar;
        this.f144672b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f144671a.equals(aVar.f144671a) && this.f144672b == aVar.f144672b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144672b) + (this.f144671a.hashCode() * 31);
    }

    public final String toString() {
        return "AxisConfiguration(constraints=" + this.f144671a + ", invertAxis=" + this.f144672b + ")";
    }
}
