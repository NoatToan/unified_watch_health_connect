package o10;

import com.garmin.android.apps.connectmobile.connectiq.e;
import ds.e0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo10/c;", "", "", "availableSpace", "availableSlots", "", "Lcom/garmin/android/apps/connectmobile/connectiq/e;", "apps", "<init>", "(JJLjava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f128514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f128515c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j8, long j14, List<? extends e> list) {
        this.f128513a = j8;
        this.f128514b = j14;
        this.f128515c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f128513a == cVar.f128513a && this.f128514b == cVar.f128514b && s.g(this.f128515c, cVar.f128515c);
    }

    public final int hashCode() {
        int iE = f.e(Long.hashCode(this.f128513a) * 31, 31, this.f128514b);
        List<e> list = this.f128515c;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f128513a, "ConnectIQInstalledApps(availableSpace=", ", availableSlots=");
        sbK.append(this.f128514b);
        sbK.append(", apps=");
        sbK.append(this.f128515c);
        sbK.append(")");
        return sbK.toString();
    }
}
