package xe2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag", f = "ContinueAsFrag.kt", l = {202, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 208}, m = "displayContinueButtonOrBlockedChildExchangeText")
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public te2.k0 f190564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f190565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f190567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f190568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f190567d = yVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190566c = obj;
        this.f190568e |= Integer.MIN_VALUE;
        return y.v6(this.f190567d, this);
    }
}
