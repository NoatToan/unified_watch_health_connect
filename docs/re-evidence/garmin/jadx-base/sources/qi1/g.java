package qi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel", f = "LTESubscriptionViewModel.kt", l = {480}, m = "checkJobStatus", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f144884b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144883a = obj;
        this.f144885c |= Integer.MIN_VALUE;
        int i14 = f.f144858o;
        return this.f144884b.A4(null, this);
    }
}
