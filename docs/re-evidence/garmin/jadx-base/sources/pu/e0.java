package pu;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "fetchUserDevices", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n nVar, t13.d<? super e0> dVar) {
        super(dVar);
        this.f141061b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141060a = obj;
        this.f141062c |= Integer.MIN_VALUE;
        return n.c(this.f141061b, this);
    }
}
