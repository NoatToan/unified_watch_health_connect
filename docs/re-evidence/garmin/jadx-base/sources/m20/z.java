package m20;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lm20/z;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm20/e;", "Lm20/g;", "contactsAPI", "Lm20/b0;", "emergencyContactsAPI", "Ljw/w;", "phoneContactsProvider", "contactFeatureRepository", "La22/i;", "userProfileRepo", "<init>", "(Lm20/g;Lm20/b0;Ljw/w;Lm20/e;La22/i;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements com.garmin.android.apps.connectmobile.f0, e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f116054f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f116055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f116056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw.w f116057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f116058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a22.i f116059e;

    static {
        a22.i.a aVar = a22.i.f537b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z(g gVar, b0 b0Var, jw.w wVar, e eVar, a22.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        gVar = (i14 & 1) != 0 ? com.garmin.android.apps.connectmobile.contacts.b.e() ? (g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a0.class, new c83.h.a[0], null, null, null, 120) : (g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, g.class, new c83.h.a[0], null, null, null, 120) : gVar;
        if ((i14 & 16) != 0) {
            a22.i.f537b.getClass();
            iVar = a22.i.a.a();
        }
        this(gVar, b0Var, wVar, eVar, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(z zVar, List list, v13.c cVar) {
        s sVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        l20.g gVarQ;
        l20.g gVarQ2;
        zVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f116022d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f116022d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(zVar, cVar);
            }
        } else {
            sVar = new s(zVar, cVar);
        }
        Object objA = sVar.f116020b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f116022d;
        if (i15 == 0) {
            o13.r.b(objA);
            if (list != null) {
                a22.i iVar = zVar.f116059e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    l20.g gVarQ3 = ((l20.a) it.next()).q();
                    Long userId = gVarQ3 != null ? gVarQ3.getUserId() : null;
                    String strValueOf = userId != null ? String.valueOf(userId.longValue()) : null;
                    if (strValueOf != null) {
                        arrayList.add(strValueOf);
                    }
                }
                List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
                sVar.f116019a = list;
                sVar.f116022d = 1;
                objA = iVar.a(arrayList, listK, sVar);
                if (objA == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = sVar.f116019a;
        o13.r.b(objA);
        Map map = (Map) objA;
        for (l20.a aVar2 : list) {
            l20.g gVarQ4 = aVar2.q();
            Long userId2 = gVarQ4 != null ? gVarQ4.getUserId() : null;
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(userId2 != null ? new Integer((int) userId2.longValue()) : null);
            if (lVar != null && (profileImageUrls = lVar.getProfileImageUrls()) != null) {
                String str = profileImageUrls.f46880i;
                if (str != null && (gVarQ2 = aVar2.q()) != null) {
                    gVarQ2.t(str);
                }
                String str2 = profileImageUrls.f46879h;
                if (str2 != null && (gVarQ = aVar2.q()) != null) {
                    gVarQ.s(str2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // m20.e
    public final Object a(long j8, j20.l.a aVar) {
        return this.f116058d.a(j8, aVar);
    }

    @Override // m20.e
    public final Object b(String str, v13.i iVar) {
        return this.f116058d.b(str, iVar);
    }

    @Override // m20.e
    public final Object c(b bVar, hl.a aVar, j20.l.a aVar2) {
        return this.f116058d.c(bVar, aVar, aVar2);
    }

    public final Object f(l20.a aVar, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.contacts.b.e() ? com.garmin.android.apps.connectmobile.f0.J(this, new j((a0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a0.class, new c83.h.a[0], null, null, null, 120), aVar, null), iVar) : com.garmin.android.apps.connectmobile.f0.J(this, new k((g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, g.class, new c83.h.a[0], null, null, null, 120), aVar, null), iVar);
    }

    public final Object g(v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n(this, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:31:0x0088->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(l20.a aVar, v13.c cVar) {
        v vVar;
        l20.a aVar2;
        v2 v2Var;
        v2 v2Var2;
        v2.b bVar;
        List<l20.a> listF;
        Object obj;
        l20.a aVar3 = aVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f116045e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f116045e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objJ = vVar.f116043c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f116045e;
        Object obj3 = null;
        if (i15 == 0) {
            o13.r.b(objJ);
            w wVar = new w(aVar3, null);
            vVar.f116041a = aVar3;
            vVar.f116045e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, wVar, vVar);
            if (objJ != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            aVar3 = vVar.f116041a;
            o13.r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = vVar.f116042b;
            aVar2 = vVar.f116041a;
            o13.r.b(objJ);
        }
        v2Var2 = (v2) objJ;
        if (v2Var2 instanceof v2.b) {
            bVar = (v2.b) v2Var2;
            listF = ((l20.r) bVar.f47386a).f();
            if (listF != null) {
                for (Object obj4 : listF) {
                    if (p005kotlin.jvm.internal.s.g(((l20.a) obj4).getContactId(), aVar2.getContactId())) {
                        obj3 = obj4;
                        break;
                    }
                }
                obj3 = (l20.a) obj3;
            }
            obj = obj3;
            if (obj != null) {
                return new v2.b(obj, bVar.f47387b, null, null, 12, null);
            }
        }
        return v2Var;
        v2 v2Var3 = (v2) objJ;
        if (!(v2Var3 instanceof v2.b)) {
            return v2Var3;
        }
        vVar.f116041a = aVar3;
        vVar.f116042b = (v2.b) v2Var3;
        vVar.f116045e = 2;
        Object objG = g(vVar);
        if (objG != obj2) {
            aVar2 = aVar3;
            v2Var = v2Var3;
            objJ = objG;
            v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                bVar = (v2.b) v2Var2;
                listF = ((l20.r) bVar.f47386a).f();
                if (listF != null) {
                    while (r4.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g(((l20.a) obj4).getContactId(), aVar2.getContactId())) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    obj3 = (l20.a) obj3;
                }
                obj = obj3;
                if (obj != null) {
                    return new v2.b(obj, bVar.f47387b, null, null, 12, null);
                }
            }
            return v2Var;
        }
        return obj2;
    }

    public final Object i(l20.r rVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.contacts.b.e() ? com.garmin.android.apps.connectmobile.f0.J(this, new x((a0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a0.class, new c83.h.a[0], null, null, null, 120), rVar, null), cVar) : com.garmin.android.apps.connectmobile.f0.J(this, new y((g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, g.class, new c83.h.a[0], null, null, null, 120), rVar, null), cVar);
    }

    public z(g gVar, b0 b0Var, jw.w wVar, e eVar, a22.i iVar) {
        gVar.getClass();
        b0Var.getClass();
        wVar.getClass();
        eVar.getClass();
        iVar.getClass();
        this.f116055a = gVar;
        this.f116056b = b0Var;
        this.f116057c = wVar;
        this.f116058d = eVar;
        this.f116059e = iVar;
    }
}
