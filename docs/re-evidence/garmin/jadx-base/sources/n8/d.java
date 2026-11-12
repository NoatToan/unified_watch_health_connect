package n8;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln8/d;", "", "", "buildVersionCode", "sdkExtensionVersion", "<init>", "(ILjava/lang/Integer;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f124923b;

    public /* synthetic */ d(int i14, Integer num, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f124922a == dVar.f124922a && s.g(this.f124923b, dVar.f124923b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f124922a) * 31;
        Integer num = this.f124923b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "HealthConnectPlatformVersion(buildVersionCode=" + this.f124922a + ", sdkExtensionVersion=" + this.f124923b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public d(int i14, Integer num) {
        this.f124922a = i14;
        this.f124923b = num;
    }
}
