package gc0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgc0/t;", "", "", "Lgc0/e;", "userDevices", "", "userHasSensors", "<init>", "(Ljava/util/List;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<? extends e> f76923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76924b;

    public t(List<? extends e> list, boolean z14) {
        this.f76923a = list;
        this.f76924b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f76923a, tVar.f76923a) && this.f76924b == tVar.f76924b;
    }

    public final int hashCode() {
        List<? extends e> list = this.f76923a;
        return Boolean.hashCode(this.f76924b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "UserDevicesData(userDevices=" + this.f76923a + ", userHasSensors=" + this.f76924b + ")";
    }
}
