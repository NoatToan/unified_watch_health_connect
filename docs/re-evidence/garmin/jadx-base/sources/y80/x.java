package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly80/x;", "Ly80/w;", "Ly80/v;", "deviceSettingsAPI", "<init>", "(Ly80/v;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f195227a;

    static {
        new a(null);
    }

    public x(v vVar) {
        vVar.getClass();
        this.f195227a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y80.w
    public final Object a(long j8, v13.c cVar) {
        y yVar;
        Object bVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f195231d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f195231d = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objB = yVar.f195229b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f195231d;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                int i16 = o13.q.f128596b;
                v vVar = this.f195227a;
                yVar.f195228a = j8;
                yVar.f195231d = 1;
                objB = vVar.b(j8, yVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = yVar.f195228a;
                o13.r.b(objB);
            }
            bVar = (z80.f) ((c83.a0) objB).f25746b;
            if (bVar == null) {
                throw new Exception("Device Settings response body is null");
            }
            int i17 = o13.q.f128596b;
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceSettingsRepository", "Failed to get device settings for unitId: " + j8 + ", error: " + thB);
            }
            return bVar;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y80.w
    public final Object b(long j8, z80.f fVar, v13.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f195234c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f195234c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.f195232a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f195234c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                int i16 = o13.q.f128596b;
                v vVar = this.f195227a;
                zVar.f195234c = 1;
                if (vVar.a(j8, fVar, zVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i17 = o13.q.f128596b;
            return unit;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            return new o13.q.b(th3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly80/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
