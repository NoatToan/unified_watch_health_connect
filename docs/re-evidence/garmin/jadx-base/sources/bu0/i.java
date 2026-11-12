package bu0;

import au0.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbu0/i;", "", "Lau0/z;", "liveActivityRepositoryWrapper", "<init>", "(Lau0/z;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21209a;

    public i(z zVar) {
        zVar.getClass();
        this.f21209a = zVar;
    }

    public final boolean a(Long l14) {
        z zVar = this.f21209a;
        boolean zBooleanValue = ((Boolean) zVar.f13012k.getValue()).booleanValue();
        if (l14 == null) {
            return zBooleanValue;
        }
        rs2.c cVar = (rs2.c) zVar.f13016o.f150540a.getValue();
        Long lValueOf = cVar != null ? Long.valueOf(cVar.getF92746j()) : null;
        if (zBooleanValue) {
            return lValueOf != null && lValueOf.longValue() == l14.longValue();
        }
        return false;
    }
}
