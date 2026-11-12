package uu0;

import c80.p;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import p005kotlin.Metadata;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.domain.GetLiveTrackPlusDataUseCase", f = "GetLiveTrackPlusDataUseCase.kt", l = {21, 22, 29, 33, 23}, m = RemoteConfigComponent.FETCH_FILE_NAME, v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f172806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f172807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z1 f172808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f172809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f172810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f172811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f172812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f172813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f172814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f172813h = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172812g = obj;
        this.f172814i |= Integer.MIN_VALUE;
        return this.f172813h.a(this);
    }
}
