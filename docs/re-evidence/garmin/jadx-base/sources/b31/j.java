package b31;

import java.util.ArrayList;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.PromptOnboardingRepositoryImpl", f = "PromptOnboardingRepositoryImpl.kt", l = {27, 45}, m = "fetchOnboardingPromptItems-gIAlu-s", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f15644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f15648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f15648e = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15647d = obj;
        this.f15649f |= Integer.MIN_VALUE;
        Object objD = this.f15648e.d(null, this);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : q.a(objD);
    }
}
