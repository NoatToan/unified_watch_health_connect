package tb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationViewModel", f = "GestureAnimationViewModel.kt", l = {84}, m = "loadAnimation", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f163698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f163698b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163697a = obj;
        this.f163699c |= Integer.MIN_VALUE;
        return q.x4(this.f163698b, this);
    }
}
