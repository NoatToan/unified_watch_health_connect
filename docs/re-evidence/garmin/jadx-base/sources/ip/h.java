package ip;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.privacy.BaseActivityPrivacyRepo", f = "BaseActivityPrivacyRepo.kt", l = {21}, m = "updateSpecificPastActivities-gIAlu-s", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f94656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f94657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f94657b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94656a = obj;
        this.f94658c |= Integer.MIN_VALUE;
        Object objD = this.f94657b.d(null, this);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : q.a(objD);
    }
}
