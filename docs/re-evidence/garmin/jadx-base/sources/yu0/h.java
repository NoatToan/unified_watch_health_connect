package yu0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel", f = "LiveTrackPlusViewModel.kt", l = {270}, m = "getBannerVisibility", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f199765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f199765b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199764a = obj;
        this.f199766c |= Integer.MIN_VALUE;
        return f.x4(this.f199765b, null, this);
    }
}
