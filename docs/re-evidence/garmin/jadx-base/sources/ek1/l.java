package ek1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.GetThirdPartyAppDataUseCase", f = "GetThirdPartyAppDataUseCase.kt", l = {90}, m = "getConsumerPermissions", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f64463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f64463c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64462b = obj;
        this.f64464d |= Integer.MIN_VALUE;
        int i14 = i.f64449c;
        return this.f64463c.b(null, this);
    }
}
