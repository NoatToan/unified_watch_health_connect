package ek1;

import com.garmin.android.apps.connectmobile.v2;
import hk1.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.AuthorizeThirdPartyTokenUseCase", f = "AuthorizeThirdPartyTokenUseCase.kt", l = {60}, m = "handleThirdPartyAppResponse", v = 2)
public final class a<T extends hk1.r> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f64418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f64420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f64420c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64419b = obj;
        this.f64421d |= Integer.MIN_VALUE;
        return this.f64420c.a(null, false, null, null, this);
    }
}
