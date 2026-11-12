package qv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {367}, m = "getEventDTO", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f148154b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148153a = obj;
        this.f148155c |= Integer.MIN_VALUE;
        int i14 = b.f147933y;
        return this.f148154b.K4(0L, this);
    }
}
