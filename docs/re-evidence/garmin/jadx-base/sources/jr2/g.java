package jr2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u008a\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljr2/g;", "", "", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100566b;

    public g(String str, String str2) {
        str.getClass();
        this.f100565a = str;
        this.f100566b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f100565a.equals(gVar.f100565a) && s.g(this.f100566b, gVar.f100566b);
    }

    public final int hashCode() {
        int iHashCode = this.f100565a.hashCode() * 31;
        String str = this.f100566b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("Item(title=", this.f100565a, ", value=", this.f100566b, ")");
    }
}
