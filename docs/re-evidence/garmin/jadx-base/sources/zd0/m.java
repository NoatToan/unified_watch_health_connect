package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.GetScreenlessPairedDevicesUseCase", f = "GetScreenlessPairedDevicesUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f204078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f204078b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204077a = obj;
        this.f204079c |= Integer.MIN_VALUE;
        return this.f204078b.a(this);
    }
}
