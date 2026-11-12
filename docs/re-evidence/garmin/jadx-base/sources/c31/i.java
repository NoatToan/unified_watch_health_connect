package c31;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.local.PromptOnboardingDao", f = "PromptOnboardingDao.kt", l = {22, 23}, m = "syncItems$suspendImpl", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f24093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f24094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f24096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f24096d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24095c = obj;
        this.f24097e |= Integer.MIN_VALUE;
        return j.b(this.f24096d, null, this);
    }
}
