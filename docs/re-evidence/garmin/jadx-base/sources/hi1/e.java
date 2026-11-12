package hi1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import ii1.g;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhi1/e;", "", "Lji1/b;", "getPhoneLocation", "Lii1/g;", "saveDeviceLocation", "<init>", "(Lji1/b;Lii1/g;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji1.b f83873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f83874b;

    static {
        new a(null);
    }

    public e(ji1.b bVar, g gVar) {
        bVar.getClass();
        gVar.getClass();
        this.f83873a = bVar;
        this.f83874b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        if (r12 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j8, v13.c cVar) {
        f fVar;
        Object objA;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f83878d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f83878d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA2 = fVar.f83876b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f83878d;
        if (i15 == 0) {
            r.b(objA2);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "UpdateFindMyDeviceLocationUseCase", "Get location [deviceId=" + j8 + "]");
            fVar.f83875a = j8;
            fVar.f83878d = 1;
            objA2 = this.f83873a.a(fVar);
            if (objA2 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = fVar.f83875a;
            r.b(objA2);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = fVar.f83875a;
            r.b(objA2);
            objA = ((q) objA2).f128597a;
        }
        Throwable thB = q.b(objA);
        if (thB != null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.g(a2Var2, "UpdateFindMyDeviceLocationUseCase", thB);
            return new q.b(thB);
        }
        String strF = a0.f(j8, "Location saved successfully [deviceId=", "]");
        i2.a aVar4 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var3, "UpdateFindMyDeviceLocationUseCase", strF);
        return d.C1657d.f83872a;
        ji1.e eVar = (ji1.e) objA2;
        if (s.g(eVar, ji1.e.c.f98822a)) {
            String strF2 = a0.f(j8, "Location service disabled [deviceId=", "]");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "UpdateFindMyDeviceLocationUseCase", strF2);
            int i16 = q.f128596b;
            return d.b.f83870a;
        }
        if (eVar instanceof ji1.e.b) {
            String strF3 = a0.f(j8, "Location permission denied [deviceId=", "]");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var5, "UpdateFindMyDeviceLocationUseCase", strF3);
            int i17 = q.f128596b;
            return d.a.f83869a;
        }
        if (s.g(eVar, ji1.e.d.f98823a)) {
            String strF4 = a0.f(j8, "Location unavailable [deviceId=", "]");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var6, "UpdateFindMyDeviceLocationUseCase", strF4);
            int i18 = q.f128596b;
            return d.c.f83871a;
        }
        if (!(eVar instanceof ji1.e.a)) {
            u0.r();
            return null;
        }
        String strF5 = a0.f(j8, "Location available [deviceId=", "]");
        i2.a aVar8 = i2.f36769a;
        a2 a2Var7 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var7, "UpdateFindMyDeviceLocationUseCase", strF5);
        fi1.b bVar = ((ji1.e.a) eVar).f98820a;
        fVar.f83875a = j8;
        fVar.f83878d = 2;
        objA = this.f83874b.a(j8, bVar, fVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhi1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
