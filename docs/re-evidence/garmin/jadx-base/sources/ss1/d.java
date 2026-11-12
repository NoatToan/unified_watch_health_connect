package ss1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {186}, m = "getCourseInformation", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z zVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f160626b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160625a = obj;
        this.f160627c |= Integer.MIN_VALUE;
        return this.f160626b.d4(0L, this);
    }
}
