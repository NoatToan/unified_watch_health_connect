package vr1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvr1/n;", "Lvr1/e;", "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Lsd2/f;)V", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd2.f f179557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sd2.f fVar) {
        super(null);
        fVar.getClass();
        this.f179557a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && s.g(this.f179557a, ((n) obj).f179557a);
    }

    public final int hashCode() {
        return this.f179557a.hashCode();
    }

    public final String toString() {
        return "StressSettingsDestination(deviceDatabaseRecord=" + this.f179557a + ")";
    }
}
