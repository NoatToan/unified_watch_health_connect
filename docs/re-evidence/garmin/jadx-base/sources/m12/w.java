package m12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.SaveProfileChangesUseCase", f = "SaveProfileChangesUseCase.kt", l = {57, 75, 88}, m = "invoke", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f115904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f115907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f115908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f115908e = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115907d = obj;
        this.f115909f |= Integer.MIN_VALUE;
        return this.f115908e.a(null, this);
    }
}
