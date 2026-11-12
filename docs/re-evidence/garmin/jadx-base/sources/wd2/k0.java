package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwd2/k0;", "Lxd2/y0;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 implements xd2.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f184517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184518b;

    public k0(a aVar, LivetrackService livetrackService) {
        this.f184517a = aVar;
        this.f184518b = livetrackService;
    }

    @Override // xd2.y0
    public final Object a(v13.i iVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new j0(this.f184517a, null), iVar);
    }

    @Override // xd2.y0
    public final Object b(long j8, xd2.o oVar) {
        l lVar = this.f184518b.f50164d;
        if (lVar != null) {
            return lVar.getF104147d().d(j8, oVar);
        }
        p005kotlin.jvm.internal.s.m("applicationDelegate");
        throw null;
    }
}
