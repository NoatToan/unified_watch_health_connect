package sf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.epoch.EpochViewModel", f = "EpochViewModel.kt", l = {64}, m = "postEpochRequest", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f158861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f158863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f158864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f158863c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158862b = obj;
        this.f158864d |= Integer.MIN_VALUE;
        return j.x4(this.f158863c, null, null, this);
    }
}
