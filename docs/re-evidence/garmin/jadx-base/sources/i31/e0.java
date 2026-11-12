package i31;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Li31/e0;", "", "Lb31/a;", "deviceOnboardingRepository", "Lf12/b;", "userAccount", "<init>", "(Lb31/a;Lf12/b;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b31.a f90668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f90669b;

    static {
        new a(null);
    }

    public e0(b31.a aVar, f12.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f90668a = aVar;
        this.f90669b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object a(long j8, d31.d dVar, d31.c cVar, v13.c cVar2) {
        f0 f0Var;
        b31.a aVar;
        long j14;
        long j15;
        d31.d dVar2;
        d31.c cVar3;
        d31.c cVar4;
        Object objH;
        if (cVar2 instanceof f0) {
            f0Var = (f0) cVar2;
            int i14 = f0Var.f90685g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f90685g = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar2);
            }
        } else {
            f0Var = new f0(this, cVar2);
        }
        f0 f0Var2 = f0Var;
        Object obj = f0Var2.f90683e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var2.f90685g;
        b31.a aVar3 = this.f90668a;
        if (i15 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DismissOnboardingItemUseCase", "Update onboarding item: " + dVar + ", deviceId: " + j8 + " with status: " + cVar);
            long userProfilePk = this.f90669b.getUserProfilePk();
            if (dVar == d31.d.PULSE_OX_JP) {
                i2.a.b(a2Var, "DismissOnboardingItemUseCase", "Also update PULSE_OX for Japan user, deviceId: " + j8 + " with status: " + cVar);
                d31.d dVar3 = d31.d.PULSE_OX;
                f0Var2.f90681c = dVar;
                f0Var2.f90682d = cVar;
                f0Var2.f90679a = j8;
                f0Var2.f90680b = userProfilePk;
                f0Var2.f90685g = 1;
                aVar = aVar3;
                if (aVar.h(userProfilePk, j8, dVar3, cVar, f0Var2) != aVar2) {
                    j14 = j8;
                    j15 = userProfilePk;
                    dVar2 = dVar;
                    cVar4 = cVar;
                }
            } else {
                aVar = aVar3;
                j14 = j8;
                j15 = userProfilePk;
                dVar2 = dVar;
                cVar3 = cVar;
                f0Var2.f90681c = null;
                f0Var2.f90682d = null;
                f0Var2.f90679a = j14;
                f0Var2.f90680b = j15;
                f0Var2.f90685g = 2;
                objH = aVar.h(j15, j14, dVar2, cVar3, f0Var2);
                if (objH != aVar2) {
                    return objH;
                }
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j15 = f0Var2.f90680b;
        j14 = f0Var2.f90679a;
        cVar4 = f0Var2.f90682d;
        dVar2 = f0Var2.f90681c;
        o13.r.b(obj);
        ((o13.q) obj).getClass();
        aVar = aVar3;
        cVar3 = cVar4;
        f0Var2.f90681c = null;
        f0Var2.f90682d = null;
        f0Var2.f90679a = j14;
        f0Var2.f90680b = j15;
        f0Var2.f90685g = 2;
        objH = aVar.h(j15, j14, dVar2, cVar3, f0Var2);
        if (objH != aVar2) {
            return aVar2;
        }
        return objH;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li31/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
