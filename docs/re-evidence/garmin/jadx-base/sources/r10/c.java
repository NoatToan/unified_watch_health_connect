package r10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.repo.ConnectIQAppSettingsRepo", f = "ConnectIQAppSettingsRepo.kt", l = {82}, m = "getSettingsBinaryCall", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f149339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f149340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f149340b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f149339a = obj;
        this.f149341c |= Integer.MIN_VALUE;
        return a.a(this.f149340b, null, null, null, null, null, this);
    }
}
