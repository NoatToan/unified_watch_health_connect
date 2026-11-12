package qv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {348}, m = "getCyclingAbility", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f148130b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148129a = obj;
        this.f148131c |= Integer.MIN_VALUE;
        return b.z4(this.f148130b, this);
    }
}
