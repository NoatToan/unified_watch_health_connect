package fl1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o13.q;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfl1/g;", "", "Lcl1/a;", "preferences", "Lfl1/f;", "getDeviceWheelchairAvailability", "Lws/a;", "delegate", "Lo53/z;", "dispatcher", "<init>", "(Lcl1/a;Lfl1/f;Lws/a;Lo53/z;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f72002e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl1.a f72003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f72004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ws.a f72005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f72006d;

    static {
        new a(null);
        f72002e = "GetFavoriteRecordableActivitiesUseCase";
    }

    public g(cl1.a aVar, f fVar, ws.a aVar2, z zVar) {
        aVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        zVar.getClass();
        this.f72003a = aVar;
        this.f72004b = fVar;
        this.f72005c = aVar2;
        this.f72006d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable a(g gVar, long j8, List list, v13.c cVar) {
        j jVar;
        Object objA;
        gVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f72017e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f72017e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(gVar, cVar);
            }
        } else {
            jVar = new j(gVar, cVar);
        }
        Object obj = jVar.f72015c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f72017e;
        if (i15 == 0) {
            r.b(obj);
            if (list.isEmpty()) {
                return j0.f134944a;
            }
            f fVar = gVar.f72004b;
            jVar.f72014b = list;
            jVar.f72013a = j8;
            jVar.f72017e = 1;
            objA = fVar.a(j8, jVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = jVar.f72013a;
            list = jVar.f72014b;
            r.b(obj);
            objA = ((q) obj).f128597a;
        }
        Throwable thB = q.b(objA);
        if (thB != null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var, f72002e, thB);
        }
        Boolean bool = Boolean.FALSE;
        if (objA instanceof q.b) {
            objA = bool;
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        rd2.f.a().f152045a.getClass();
        String strK = rd2.j.k(j8);
        if (strK == null) {
            strK = "";
        }
        kl1.c.f105264a.getClass();
        ArrayList arrayListS = y.s(kl1.c.a(strK, zBooleanValue).values());
        int iA = t0.a(y.r(arrayListS, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : arrayListS) {
            zf2.d dVar = (zf2.d) obj2;
            cl1.b.a aVar3 = cl1.b.f27937b;
            int i16 = dVar.f204633e;
            int i17 = dVar.f204634f;
            aVar3.getClass();
            linkedHashMap.put(cl1.b.a.a(i16, i17), obj2);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            zf2.d dVar2 = (zf2.d) linkedHashMap.get(str);
            if (dVar2 == null) {
                Object obj3 = null;
                if (w.z(str, ":", false)) {
                    dVar2 = null;
                } else {
                    for (Object obj4 : arrayListS) {
                        if (s.g(((zf2.d) obj4).f204629a, str)) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    dVar2 = (zf2.d) obj3;
                }
            }
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j8, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f72009c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f72009c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE0 = hVar.f72007a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f72009c;
        if (i15 == 0) {
            r.b(objE0);
            i iVar = new i(this, j8, null);
            hVar.f72009c = 1;
            objE0 = ge1.b.e0(this.f72006d, iVar, hVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((q) objE0).f128597a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfl1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(cl1.a aVar, f fVar, ws.a aVar2, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, fVar, aVar2, zVar);
    }
}
