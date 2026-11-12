package qi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel", f = "LTESubscriptionViewModel.kt", l = {343}, m = "loadSSOUrl", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f144912b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144911a = obj;
        this.f144913c |= Integer.MIN_VALUE;
        return f.z4(this.f144912b, this);
    }
}
