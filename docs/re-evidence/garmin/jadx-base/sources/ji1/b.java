package ji1;

import android.annotation.SuppressLint;
import android.location.Location;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lji1/b;", "", "Lji1/a;", "checkPhoneLocationStatus", "Lmv0/e;", "locationProvider", "Lo53/z;", "dispatcher", "<init>", "(Lji1/a;Lmv0/e;Lo53/z;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji1.a f98812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv0.e f98813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f98814c;

    static {
        new a(null);
    }

    public b(ji1.a aVar, mv0.e eVar, z zVar) {
        aVar.getClass();
        eVar.getClass();
        zVar.getClass();
        this.f98812a = aVar;
        this.f98813b = eVar;
        this.f98814c = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"MissingPermission"})
    public final Object a(v13.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f98817c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f98817c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f98815a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f98817c;
        if (i15 == 0) {
            r.b(objE0);
            f fVarA = this.f98812a.a();
            if (fVarA instanceof f.b) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "GetPhoneLocationUseCase", "Location permissions denied");
                return e.b.f98821a;
            }
            if (fVarA instanceof f.c) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "GetPhoneLocationUseCase", "Location service is disabled");
                return e.c.f98822a;
            }
            if (!(fVarA instanceof f.a)) {
                u0.r();
                return null;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "GetPhoneLocationUseCase", "Get current location");
            d dVar = new d(this, null);
            cVar2.f98817c = 1;
            objE0 = ge1.b.e0(this.f98814c, dVar, cVar2);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        Location location = (Location) objE0;
        if (location != null) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "GetPhoneLocationUseCase", "Location obtained successfully");
            return new e.a(new fi1.b(location.getLatitude(), location.getLongitude(), location.getTime()));
        }
        i2.a aVar6 = i2.f36769a;
        a2 a2Var5 = a2.GENERAL;
        aVar6.getClass();
        i2.a.f(a2Var5, "GetPhoneLocationUseCase", "Location is null");
        return e.d.f98823a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lji1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ji1.a aVar, mv0.e eVar, z zVar, int i14, j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, eVar, zVar);
    }
}
