package uu0;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.domain.GetLiveTrackPlusDataUseCase", f = "GetLiveTrackPlusDataUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f172815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f172816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f172817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f172818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f172817c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172816b = obj;
        this.f172818d |= Integer.MIN_VALUE;
        return this.f172817c.b(this);
    }
}
