package re2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {2026, 2032, 2033}, m = "refreshUserProfileByGCSocialProfileEndpoint")
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ve2.e f152335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f152337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f152337c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152336b = obj;
        this.f152338d |= Integer.MIN_VALUE;
        return b.e(this.f152337c, null, this);
    }
}
