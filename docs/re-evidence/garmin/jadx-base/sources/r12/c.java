package r12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersPagingSource", f = "FollowMutedUsersPagingSource.kt", l = {26}, m = "fetchDtoList", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f149406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f149407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f149407b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f149406a = obj;
        this.f149408c |= Integer.MIN_VALUE;
        return this.f149407b.g(0, 0, this);
    }
}
