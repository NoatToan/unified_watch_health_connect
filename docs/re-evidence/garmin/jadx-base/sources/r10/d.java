package r10;

import c83.a0;
import com.garmin.android.apps.connectmobile.connectiq.b0;
import com.garmin.android.apps.connectmobile.connectiq.l;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.io.IOException;
import java.util.List;
import lc.u0;
import o13.q;
import o13.r;
import o53.i0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p92.y;
import y10.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr10/d;", "", "Lp10/a$a;", "connectIQApiCallerApi", "Lcom/garmin/android/apps/connectmobile/connectiq/b0;", "connectIQRequestManager", "<init>", "(Lp10/a$a;Lcom/garmin/android/apps/connectmobile/connectiq/b0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p10.a.InterfaceC2560a f149342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f149343b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149344a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.MUSIC_PROVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.DATA_FIELDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.WIDGETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.WATCH_FACES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f149344a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(p10.a.InterfaceC2560a interfaceC2560a, b0 b0Var, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            p10.a.f134883c.getClass();
            interfaceC2560a = new p10.a().a();
        }
        if ((i14 & 2) != 0) {
            b0Var = b0.e();
            b0Var.getClass();
        }
        this(interfaceC2560a, b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, v13.c cVar) {
        e eVar;
        List list2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f149347c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f149347c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objAwait = eVar.f149345a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f149347c;
        if (i15 == 0) {
            r.b(objAwait);
            i0<a0<List<o10.a>>> i0VarB = this.f149342a.b((String[]) list.toArray(new String[0]));
            eVar.f149347c = 1;
            objAwait = i0VarB.await(eVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        a0 a0Var = (a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list2 = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during posting apps icons!"), new Integer(response.code()), null, 4, null) : new v2.b(list2, response.code(), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, List list, v13.c cVar) {
        f fVar;
        List list2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f149350c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f149350c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objAwait = fVar.f149348a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f149350c;
        if (i15 == 0) {
            r.b(objAwait);
            i0<a0<List<o10.b>>> i0VarC = this.f149342a.c(new q10.d(str, hb2.h.b(), new com.garmin.android.apps.connectmobile.connectiq.j().a(list)));
            fVar.f149350c = 1;
            objAwait = i0VarC.await(fVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        a0 a0Var = (a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list2 = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during posting apps updates!"), new Integer(response.code()), null, 4, null) : new v2.b(list2, response.code(), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, String str3, String str4, v13.c cVar) {
        g gVar;
        List list;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f149353c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f149353c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objAwait = gVar.f149351a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f149353c;
        if (i15 == 0) {
            r.b(objAwait);
            i0<a0<List<o10.b>>> i0VarA = this.f149342a.a(str, str2, str3, str4);
            gVar.f149353c = 1;
            objAwait = i0VarA.await(gVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        a0 a0Var = (a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during fetching apps!"), new Integer(response.code()), null, 4, null) : new v2.b(list, response.code(), null, null, 12, null);
    }

    public final Object d(l lVar, d0 d0Var) {
        t13.i iVar = new t13.i(u13.f.b(d0Var));
        h hVar = new h(iVar);
        int i14 = a.f149344a[lVar.ordinal()];
        b0 b0Var = this.f149343b;
        switch (i14) {
            case 1:
                b0Var.getClass();
                b0Var.d(GDIConnectIQInstalledApps.AppType.WATCH_APP, hVar);
                break;
            case 2:
                b0Var.getClass();
                b0Var.d(GDIConnectIQInstalledApps.AppType.AUDIO_CONTENT_PROVIDER, hVar);
                break;
            case 3:
                b0Var.getClass();
                b0Var.d(GDIConnectIQInstalledApps.AppType.DATA_FIELD, hVar);
                break;
            case 4:
                b0Var.getClass();
                b0Var.d(GDIConnectIQInstalledApps.AppType.WIDGET, hVar);
                break;
            case 5:
                b0Var.getClass();
                b0Var.d(GDIConnectIQInstalledApps.AppType.WATCH_FACE, hVar);
                break;
            case 6:
                y.f136664a.getClass();
                y.a.b("requestInstalledCIQItems for UNKNOWN type");
                int i15 = q.f128596b;
                iVar.resumeWith(new o10.c(0L, 0L, j0.f134944a));
                break;
            default:
                u0.r();
                return null;
        }
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q10.a aVar, v13.c cVar) {
        i iVar;
        List list;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f149357c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f149357c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objAwait = iVar.f149355a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f149357c;
        if (i15 == 0) {
            r.b(objAwait);
            i0<a0<List<q10.b>>> i0VarD = this.f149342a.d(aVar);
            iVar.f149357c = 1;
            objAwait = i0VarD.await(iVar);
            if (objAwait == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        a0 a0Var = (a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during posting apps install!"), new Integer(response.code()), null, 4, null) : new v2.b(list, response.code(), null, null, 12, null);
    }

    public d(p10.a.InterfaceC2560a interfaceC2560a, b0 b0Var) {
        interfaceC2560a.getClass();
        b0Var.getClass();
        this.f149342a = interfaceC2560a;
        this.f149343b = b0Var;
    }

    public d() {
        this(null, null, 3, null);
    }
}
