package qi1;

import p005kotlin.Metadata;
import ui1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel", f = "LTESubscriptionViewModel.kt", l = {192, 193}, m = "handleActiveSubscription", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f144900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f144902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f144904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f144905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f144906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f144905f = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144904e = obj;
        this.f144906g |= Integer.MIN_VALUE;
        return f.y4(this.f144905f, false, false, null, this);
    }
}
