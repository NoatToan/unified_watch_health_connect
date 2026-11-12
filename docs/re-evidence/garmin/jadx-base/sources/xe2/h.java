package xe2;

import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity", f = "AuthenticationActivity.kt", l = {1049, 1072}, m = "evaluatePlayStoreAgeSignals$fetchAccessStatus")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AuthenticationActivity f190483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f190484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190485c;

    public h(t13.d<? super h> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190484b = obj;
        this.f190485c |= Integer.MIN_VALUE;
        return AuthenticationActivity.W9(null, null, this);
    }
}
