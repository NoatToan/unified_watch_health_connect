package qi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel", f = "LTESubscriptionViewModel.kt", l = {167, 171}, m = "handleActivationInProcess", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f144898c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144897b = obj;
        this.f144899d |= Integer.MIN_VALUE;
        return f.x4(this.f144898c, this);
    }
}
