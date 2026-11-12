package xe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AbstractBaseActivity", f = "AbstractBaseActivity.kt", l = {330}, m = "generatePortalTokenForLockToEmailAddress")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f190447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.a f190448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.mobileauth.ui.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f190448b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190447a = obj;
        this.f190449c |= Integer.MIN_VALUE;
        return this.f190448b.P9(null, this);
    }
}
