package nr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/x0;", "Lnr/w0;", "", "activityTypeId", "", "activityTypeName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x0 extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f127586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Integer num, String str) {
        super(null);
        str.getClass();
        this.f127586a = num;
        this.f127587b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127586a, x0Var.f127586a) && p005kotlin.jvm.internal.s.g(this.f127587b, x0Var.f127587b);
    }

    public final int hashCode() {
        Integer num = this.f127586a;
        return this.f127587b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return n23.j.f("ByActivityTypeId(activityTypeId=", this.f127586a, ", activityTypeName=", this.f127587b, ")");
    }
}
