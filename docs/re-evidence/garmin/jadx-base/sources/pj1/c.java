package pj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.AssistancePlusMccManager", f = "AssistancePlusMccManager.kt", l = {72}, m = "getISOCode", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f137886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f137886b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137885a = obj;
        this.f137887c |= Integer.MIN_VALUE;
        return this.f137886b.c(0.0d, 0.0d, this);
    }
}
