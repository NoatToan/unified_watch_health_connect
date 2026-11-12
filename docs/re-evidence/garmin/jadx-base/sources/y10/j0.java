package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel", f = "ConnectIQStorageManagementViewModel.kt", l = {105}, m = "getAppUpdates", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f193899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, t13.d<? super j0> dVar) {
        super(dVar);
        this.f193899b = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193898a = obj;
        this.f193900c |= Integer.MIN_VALUE;
        return k0.y4(this.f193899b, null, null, this);
    }
}
