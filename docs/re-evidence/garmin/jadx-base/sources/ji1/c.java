package ji1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.phone.GetPhoneLocationUseCase", f = "GetPhoneLocationUseCase.kt", l = {36}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f98816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f98816b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98815a = obj;
        this.f98817c |= Integer.MIN_VALUE;
        return this.f98816b.a(this);
    }
}
