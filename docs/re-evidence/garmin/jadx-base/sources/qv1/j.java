package qv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {466}, m = "getTrainingLoad", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f148163b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148162a = obj;
        this.f148164c |= Integer.MIN_VALUE;
        return b.F4(this.f148163b, null, null, null, this);
    }
}
