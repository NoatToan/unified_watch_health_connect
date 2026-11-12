package pu;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.gcsprotos.generated.Auth;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {68, 81, 82, 83, 84, 85, 86, 87, 116}, m = "execute", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f141148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.j0 f141149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.i0 f141150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.i0 f141151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o53.i0 f141152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o53.i0 f141153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o53.i0 f141154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Auth.MobileAppAuthorizeResponse.Status f141155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.m f141156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserSettingsDTO f141157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f141158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f141159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f141160m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f141159l = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141158k = obj;
        this.f141160m |= Integer.MIN_VALUE;
        return this.f141159l.e(false, this);
    }
}
