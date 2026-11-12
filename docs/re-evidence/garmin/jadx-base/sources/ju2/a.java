package ju2;

import c22.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lju2/a;", "", "", "step", "", "attempts", "<init>", "(Ljava/lang/String;I)V", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100940b;

    public a(String str, int i14) {
        str.getClass();
        this.f100939a = str;
        this.f100940b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f100939a, aVar.f100939a) && this.f100940b == aVar.f100940b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f100940b) + (this.f100939a.hashCode() * 31);
    }

    public final String toString() {
        return t.e(this.f100940b, "SetupAttemptMetadata(step=", this.f100939a, ", attempts=", ")");
    }

    public /* synthetic */ a(String str, int i14, int i15, j jVar) {
        this(str, (i15 & 2) != 0 ? 1 : i14);
    }
}
