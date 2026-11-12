package v80;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import da2.i;
import f12.l;
import java.util.List;
import o13.r;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import t13.g;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lv80/c;", "", "Lda2/i;", "connectedDeviceRegistry", "Lt80/a;", "passcodeCountriesApi", "Lf12/l;", "userSettings", "Lo53/z;", "ioDispatcher", "<init>", "(Lda2/i;Lt80/a;Lf12/l;Lo53/z;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f176204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80.a f176205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f176206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f176207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f176208e;

    static {
        new a(null);
    }

    public c(i iVar, t80.a aVar, l lVar, z zVar) {
        iVar.getClass();
        aVar.getClass();
        lVar.getClass();
        zVar.getClass();
        this.f176204a = iVar;
        this.f176205b = aVar;
        this.f176206c = lVar;
        this.f176207d = zVar;
        this.f176208e = c0.a(g.a.C3052a.d(zVar, g8.i.c()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(c cVar, v13.c cVar2) {
        d dVar;
        List<String> listA;
        cVar.getClass();
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f176211c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f176211c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        Object objA = dVar.f176209a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f176211c;
        try {
            if (i15 == 0) {
                r.b(objA);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "RegionRequiresPasscodeNotification", "Fetching countries requiring passcode");
                t80.a aVar3 = cVar.f176205b;
                dVar.f176211c = 1;
                objA = aVar3.a(dVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            t80.b bVar = (t80.b) ((a0) objA).f25746b;
            if (bVar != null && (listA = bVar.a()) != null) {
                return listA;
            }
            return j0.f134944a;
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to fetch countries requiring passcode ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "RegionRequiresPasscodeNotification", strD);
            return j0.f134944a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv80/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(i iVar, t80.a aVar, l lVar, z zVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(iVar, aVar, lVar, zVar);
    }
}
