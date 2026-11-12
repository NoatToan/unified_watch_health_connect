package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEventBlob;", "", "jsonString", "", "id", "", "(Ljava/lang/String;J)V", "getId", "()J", "getJsonString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class sa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47891c;

    public sa(String str, long j) {
        zcp.c(str, "");
        this.f47890b = str;
        this.f47891c = j;
    }

    public /* synthetic */ sa(String str, long j, int i, zcm zcmVar) {
        this(str, (i & 2) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF47890b() {
        return this.f47890b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF47891c() {
        return this.f47891c;
    }

    public String toString() {
        return "AnalyticsEventBlob(jsonString=" + this.f47890b + ", id=" + this.f47891c + g4.l;
    }

    public int hashCode() {
        return (this.f47890b.hashCode() * 31) + Long.hashCode(this.f47891c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sa)) {
            return false;
        }
        sa saVar = (sa) other;
        return zcp.b((Object) this.f47890b, (Object) saVar.f47890b) && this.f47891c == saVar.f47891c;
    }
}
