package v60;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv60/a;", "", "", "shouldShowProduct", "", "shopUrl", "<init>", "(ZLjava/lang/String;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175793b;

    public a(boolean z14, String str) {
        this.f175792a = z14;
        this.f175793b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f175792a == aVar.f175792a && s.g(this.f175793b, aVar.f175793b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f175792a) * 31;
        String str = this.f175793b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CrossSellBannerModel(shouldShowProduct=" + this.f175792a + ", shopUrl=" + this.f175793b + ")";
    }
}
