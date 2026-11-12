package s31;

import i31.e0;
import java.util.List;
import o53.b0;
import o53.s0;
import o53.z;
import o70.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.i;
import r70.s;
import t13.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls31/c;", "Lr70/s;", "Lo53/b0;", "Lr53/i;", "", "Lk31/a;", "onboardingItems", "Li31/e0;", "updateDeviceOnboardingItemUseCase", "Li31/b0;", "refreshDeviceOnboardingItemsOnAppResumeUseCase", "Lo53/z;", "ioDispatcher", "<init>", "(Lr53/i;Li31/e0;Li31/b0;Lo53/z;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements s, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<List<k31.a>> f156453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f156454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i31.b0 f156455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f156456d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(i<? extends List<k31.a>> iVar, e0 e0Var, i31.b0 b0Var, z zVar) {
        iVar.getClass();
        e0Var.getClass();
        b0Var.getClass();
        zVar.getClass();
        this.f156453a = iVar;
        this.f156454b = e0Var;
        this.f156455c = b0Var;
        this.f156456d = zVar;
    }

    @Override // r70.s
    public final String a() {
        return f.ONBOARDING.a();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF136462d() {
        return this.f156456d.plus(ge1.b.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(i iVar, e0 e0Var, i31.b0 b0Var, z zVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(iVar, e0Var, b0Var, zVar);
    }
}
