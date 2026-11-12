package p90;

import androidx.room.a0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.y;
import o13.r;
import o53.j2;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp90/k;", "", "Ll80/a;", "deviceDelegate", "Lf12/y;", "voiceAssistantPreferences", "Lo53/z;", "ioDispatcher", "<init>", "(Ll80/a;Lf12/y;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.a f136539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f136540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f136541c;

    static {
        new a(null);
    }

    public k(l80.a aVar, y yVar, z zVar) {
        aVar.getClass();
        yVar.getClass();
        zVar.getClass();
        this.f136539a = aVar;
        this.f136540b = yVar;
        this.f136541c = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, String str, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f136545d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f136545d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objC = lVar.f136543b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f136545d;
        y yVar = this.f136540b;
        if (i15 == 0) {
            r.b(objC);
            if (!this.f136539a.f(str) || !yVar.e() || yVar.h()) {
                return Boolean.FALSE;
            }
            yVar.a(true);
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = a0.f(j8, "Device with unitId: ", " is CTKD dual pair failure candidate, waiting for CONNECTED status before showing failure screen.");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CheckCtkdDualPairFailureUseCase", strF);
            m mVar = new m(this, null);
            lVar.f136542a = j8;
            lVar.f136545d = 1;
            objC = j2.c(AbstractComponentTracker.LINGERING_TIMEOUT, mVar, lVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = lVar.f136542a;
            r.b(objC);
        }
        if (((Unit) objC) == null) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strF2 = a0.f(j8, "Timed out waiting for CONNECTED status for device with unitId: ", ", showing failure screen.");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "CheckCtkdDualPairFailureUseCase", strF2);
        } else {
            a2 a2Var3 = a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j8, "Received CONNECTED status for device with unitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "CheckCtkdDualPairFailureUseCase", strE);
        }
        boolean zE = yVar.e();
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "CheckCtkdDualPairFailureUseCase", "CTKD dual pair failure status for device with unitId: " + j8 + " is " + zE);
        yVar.b();
        return Boolean.valueOf(zE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp90/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CTKD_FAILURE_DELAY_MILLIS", "J", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(l80.a aVar, y yVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, yVar, zVar);
    }
}
