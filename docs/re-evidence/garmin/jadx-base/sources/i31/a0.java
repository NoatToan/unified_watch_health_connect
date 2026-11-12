package i31;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.RefreshDeviceOnboardingItemsOnAppResumeUseCase", f = "RefreshDeviceOnboardingItemsOnAppResumeUseCase.kt", l = {11, 14}, m = "invoke", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f90639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f90640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f90642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f90643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, t13.d<? super a0> dVar) {
        super(dVar);
        this.f90643e = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f90642d = obj;
        this.f90644f |= Integer.MIN_VALUE;
        return this.f90643e.a(0L, this);
    }
}
