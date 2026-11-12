package yr2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.util.extensions.ApduTransferExtensionsKt", f = "ApduTransferExtensions.kt", l = {55}, m = "coExecuteApduCommandSuccessfully", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199137b;

    public c(t13.d<? super c> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199136a = obj;
        this.f199137b |= Integer.MIN_VALUE;
        return w13.b.f(null, null, 0L, this);
    }
}
