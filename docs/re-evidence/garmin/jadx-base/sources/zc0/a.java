package zc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzc0/a;", "", "Laa0/d;", "deviceAnimationHolder", "", "uniqueId", "<init>", "(Laa0/d;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa0.d f203922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203923b;

    static {
        int i14 = aa0.d.f2192h;
    }

    public a(aa0.d dVar, String str) {
        dVar.getClass();
        str.getClass();
        this.f203922a = dVar;
        this.f203923b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f203922a.equals(aVar.f203922a) && this.f203923b.equals(aVar.f203923b);
    }

    public final int hashCode() {
        return this.f203923b.hashCode() + (this.f203922a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceAnimationHolderWrapper(deviceAnimationHolder=" + this.f203922a + ", uniqueId=" + this.f203923b + ")";
    }
}
