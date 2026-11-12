package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.DeleteMultiDayActivityUseCase", f = "DeleteMultiDayActivityUseCase.kt", l = {13}, m = "invoke", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f80173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f80173b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80172a = obj;
        this.f80174c |= Integer.MIN_VALUE;
        return this.f80173b.a(null, this);
    }
}
