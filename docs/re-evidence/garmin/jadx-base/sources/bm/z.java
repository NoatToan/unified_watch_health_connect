package bm;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityViewModel", f = "TrimActivityViewModel.kt", l = {462}, m = "displayTooLongDialog", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, t13.d<? super z> dVar2) {
        super(dVar2);
        this.f18880b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18879a = obj;
        this.f18881c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.x4(this.f18880b, this);
    }
}
