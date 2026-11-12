package f80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf80/a;", "", "", "deepLink", "Lf80/b;", "source", "<init>", "(Ljava/lang/String;Lf80/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f69943b;

    public a(String str, b bVar) {
        str.getClass();
        bVar.getClass();
        this.f69942a = str;
        this.f69943b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f69942a.equals(aVar.f69942a) && this.f69943b == aVar.f69943b;
    }

    public final int hashCode() {
        return this.f69943b.hashCode() + (this.f69942a.hashCode() * 31);
    }

    public final String toString() {
        return "DeepLinkData(deepLink=" + this.f69942a + ", source=" + this.f69943b + ")";
    }
}
