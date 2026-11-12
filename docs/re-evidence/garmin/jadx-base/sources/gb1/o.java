package gb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsViewModel", f = "PregnancyDetailsViewModel.kt", l = {209}, m = "postCycleType", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f76698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f76698b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76697a = obj;
        this.f76699c |= Integer.MIN_VALUE;
        return l.x4(this.f76698b, null, null, this);
    }
}
