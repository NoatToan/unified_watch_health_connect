package qi1;

import p005kotlin.Metadata;
import ui1.g0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel", f = "LTESubscriptionViewModel.kt", l = {442, 449, 459}, m = "validateThenTransfer", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f144920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f fVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f144922c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144921b = obj;
        this.f144923d |= Integer.MIN_VALUE;
        int i14 = f.f144858o;
        return this.f144922c.G4(null, this);
    }
}
