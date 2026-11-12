package i31;

import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Li31/c;", "", "Li31/v;", "getSupportedOnboardingTypes", "Lb31/a;", "onboardingRepository", "Lkg1/a;", "developerSettings", "<init>", "(Li31/v;Lb31/a;Lkg1/a;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f90648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.a f90649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg1.a f90650c;

    static {
        new a(null);
    }

    public c(v vVar, b31.a aVar, kg1.a aVar2) {
        vVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f90648a = vVar;
        this.f90649b = aVar;
        this.f90650c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Set set, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f90657c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f90657c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f90655a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f90657c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i2.f36769a.getClass();
        i2.a.b(a2.ONBOARDING, "FetchDeviceOnboardingItemsUseCase", "[" + str + "] Fetching onboarding items for device ids: " + set);
        Set<d31.d> setA = this.f90648a.a(set);
        s3.f23252a.getClass();
        boolean z14 = s3.a("ROLE_MBTESTER") && this.f90650c.O();
        dVar.f90657c = 1;
        Object objF = this.f90649b.f(set, setA, z14, dVar);
        return objF == aVar ? aVar : objF;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li31/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
