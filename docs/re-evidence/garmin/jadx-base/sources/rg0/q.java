package rg0;

import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity", f = "AuthorizedViewersActivity.kt", l = {336}, m = "navToDetails", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ue0.d f152600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewersActivity f152602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super q> dVar) {
        super(dVar);
        this.f152602c = authorizedViewersActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152601b = obj;
        this.f152603d |= Integer.MIN_VALUE;
        return AuthorizedViewersActivity.fa(this.f152602c, null, this);
    }
}
