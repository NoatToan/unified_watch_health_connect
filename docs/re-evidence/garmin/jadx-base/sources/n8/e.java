package n8;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln8/e;", "", "", "apkVersionCode", "Ln8/d;", RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, "<init>", "(Ljava/lang/Long;Ln8/d;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f124924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f124925b;

    public e(Long l14, d dVar) {
        dVar.getClass();
        this.f124924a = l14;
        this.f124925b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f124924a, eVar.f124924a) && s.g(this.f124925b, eVar.f124925b);
    }

    public final int hashCode() {
        Long l14 = this.f124924a;
        return this.f124925b.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31);
    }

    public final String toString() {
        return "HealthConnectVersionInfo(apkVersionCode=" + this.f124924a + ", platformVersion=" + this.f124925b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ e(Long l14, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, dVar);
    }
}
