package gn;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.x;
import yz1.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgn/o;", "Ln70/o;", "", "Lj70/d;", "activitiesData", "<init>", "(Lj70/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends n70.o<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<Boolean> f78053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o70.b f78054b;

    public o(j70.d<Boolean> dVar) {
        dVar.getClass();
        this.f78053a = dVar;
        this.f78054b = o70.b.LIVE_ACTIVITY;
    }

    @Override // n70.o
    public final ArrayList c() {
        j70.d<Boolean> dVar = this.f78053a;
        if (p005kotlin.jvm.internal.s.g(dVar.f97521b, Boolean.TRUE)) {
            return x.d(new j70.d(new yz1.d(u.LOADING, null, false, 6, null), dVar.f97521b));
        }
        return null;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d, reason: from getter */
    public final o70.b getF78054b() {
        return this.f78054b;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetLiveActivityDataUseCase";
    }
}
