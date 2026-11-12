package defpackage;

import kotlin.Metadata;
import kotlin.time.Clock;

/* JADX INFO: renamed from: zfp, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"systemClock", "Lkotlin/time/Clock;", "getSystemClock$annotations", "()V", "systemClockNow", "Lkotlin/time/Instant;", "serializedInstant", "", "instant", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class systemClock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Clock f54058a = IMPLEMENTATIONS.f53973b.e();

    public static final Object c(zfq zfqVar) {
        zcp.c(zfqVar, "");
        return new zfy(zfqVar.getF54061a(), zfqVar.getE());
    }
}
