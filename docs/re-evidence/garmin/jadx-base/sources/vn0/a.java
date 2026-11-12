package vn0;

import p005kotlin.Metadata;
import sd2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvn0/a;", "", "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Lsd2/f;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f178837a;

    public a(f fVar) {
        fVar.getClass();
        this.f178837a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f178837a.equals(((a) obj).f178837a);
    }

    public final int hashCode() {
        return this.f178837a.hashCode();
    }

    public final String toString() {
        return "DevicePulseOxSettingsNavArgs(deviceDatabaseRecord=" + this.f178837a + ")";
    }
}
