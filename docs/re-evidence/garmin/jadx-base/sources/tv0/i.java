package tv0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import pv0.a0;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Ltv0/i;", "", "Lrv0/a;", "repository", "Lf12/b;", "userAccount", "Ltv0/g;", "requestDeviceUpdate", "Lo53/z;", "dispatcher", "Lqv0/a;", "preferences", "<init>", "(Lrv0/a;Lf12/b;Ltv0/g;Lo53/z;Lqv0/a;)V", "b", "c", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f166561f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rv0.a f166562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f166563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f166564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f166565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qv0.a f166566e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltv0/i$b;", "", "", "Lpv0/d;", "behaviours", "originalBehaviours", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<pv0.d> f166567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<pv0.d> f166568b;

        public b(List<pv0.d> list, List<pv0.d> list2) {
            list.getClass();
            list2.getClass();
            this.f166567a = list;
            this.f166568b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f166567a.equals(bVar.f166567a) && this.f166568b.equals(bVar.f166568b);
        }

        public final int hashCode() {
            return this.f166568b.hashCode() + (this.f166567a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("SaveOperationData(behaviours=", ", originalBehaviours=", ")", this.f166567a, this.f166568b);
        }
    }

    public interface c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltv0/i$c$a;", "Ltv0/i$c;", "Ltv0/h;", "result", "<init>", "(Ltv0/h;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f166569a;

            public a(h hVar) {
                hVar.getClass();
                this.f166569a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f166569a.equals(((a) obj).f166569a);
            }

            public final int hashCode() {
                return this.f166569a.hashCode();
            }

            public final String toString() {
                return "FinishOperation(result=" + this.f166569a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltv0/i$c$b;", "Ltv0/i$c;", "Ltv0/i$b;", "data", "<init>", "(Ltv0/i$b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f166570a;

            public b(b bVar) {
                bVar.getClass();
                this.f166570a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f166570a.equals(((b) obj).f166570a);
            }

            public final int hashCode() {
                return this.f166570a.hashCode();
            }

            public final String toString() {
                return "TaskSuccessful(data=" + this.f166570a + ")";
            }
        }
    }

    static {
        new a(null);
    }

    public i(rv0.a aVar, f12.b bVar, g gVar, z zVar, qv0.a aVar2) {
        aVar.getClass();
        bVar.getClass();
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        this.f166562a = aVar;
        this.f166563b = bVar;
        this.f166564c = gVar;
        this.f166565d = zVar;
        this.f166566e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(i iVar, b bVar, v13.c cVar) {
        j jVar;
        Set set;
        iVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f166575e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f166575e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(iVar, cVar);
            }
        } else {
            jVar = new j(iVar, cVar);
        }
        Object obj = jVar.f166573c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f166575e;
        if (i15 == 0) {
            o13.r.b(obj);
            List<pv0.d> list = bVar.f166567a;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                q6.f.s(((pv0.d) it.next()).f141358a, arrayList);
            }
            Set setG1 = h0.g1(arrayList);
            List<pv0.d> list2 = bVar.f166568b;
            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                q6.f.s(((pv0.d) it3.next()).f141358a, arrayList2);
            }
            Set setG2 = h0.g1(h0.z0(arrayList2, setG1));
            if (setG2.isEmpty()) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "No custom behaviours to delete");
                return new c.b(bVar);
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SaveBehaviourChangesUseCase", "Deleting custom behaviours");
            rv0.a aVar2 = iVar.f166562a;
            jVar.f166571a = bVar;
            jVar.f166572b = setG2;
            jVar.f166575e = 1;
            Object objT = aVar2.t(setG2, jVar);
            if (objT == aVar) {
                return aVar;
            }
            obj = objT;
            set = setG2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = jVar.f166572b;
            bVar = jVar.f166571a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Deleting custom behaviours failed: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "SaveBehaviourChangesUseCase", strD);
            return new c.a(new h.a(bVar.f166567a, bVar.f166568b));
        }
        a2 a2Var4 = a2.LIFESTYLE_LOGGING;
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "SaveBehaviourChangesUseCase", "Deleted custom behaviours with success");
        List<pv0.d> list3 = bVar.f166568b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (!set.contains(new Long(((pv0.d) obj2).f141358a))) {
                arrayList3.add(obj2);
            }
        }
        return new c.b(new b(bVar.f166567a, arrayList3));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6.emit(r5, r0) == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r5 == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r7.emit(r5, r0) == r9) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:30:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, r53.j jVar, b bVar, e23.p[] pVarArr, v13.c cVar) {
        k kVar;
        c bVar2;
        r53.j jVar2;
        Iterator it;
        h cVar2;
        String str;
        iVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f166582g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f166582g = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(iVar, cVar);
            }
        } else {
            kVar = new k(iVar, cVar);
        }
        Object objInvoke = kVar.f166580e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f166582g;
        if (i15 != 0) {
            if (i15 == 1) {
                pVarArr = (e23.p[]) kVar.f166578c;
                bVar = kVar.f166577b;
                jVar = kVar.f166576a;
                o13.r.b(objInvoke);
            } else {
                if (i15 == 2) {
                    it = kVar.f166579d;
                    jVar2 = kVar.f166576a;
                    o13.r.b(objInvoke);
                    bVar2 = (c) objInvoke;
                    if (it.hasNext() || !(bVar2 instanceof c.b)) {
                        if (bVar2 instanceof c.a) {
                            cVar2 = ((c.a) bVar2).f166569a;
                        } else {
                            if (!(bVar2 instanceof c.b)) {
                                u0.r();
                                return null;
                            }
                            cVar2 = new h.c(((c.b) bVar2).f166570a.f166567a, true);
                        }
                        a2 a2Var = a2.LIFESTYLE_LOGGING;
                        if (cVar2 instanceof h.c) {
                            str = "success";
                        } else {
                            str = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                        }
                        String strConcat = "Save behaviours finished with ".concat(str);
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "SaveBehaviourChangesUseCase", strConcat);
                        kVar.f166576a = null;
                        kVar.f166577b = null;
                        kVar.f166578c = null;
                        kVar.f166579d = null;
                        kVar.f166582g = 3;
                    } else {
                        e23.p pVar = (e23.p) it.next();
                        b bVar3 = ((c.b) bVar2).f166570a;
                        kVar.f166576a = jVar2;
                        kVar.f166577b = null;
                        kVar.f166578c = null;
                        kVar.f166579d = it;
                        kVar.f166582g = 2;
                        objInvoke = pVar.invoke(bVar3, kVar);
                    }
                    return aVar;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objInvoke);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objInvoke);
        h.b bVar4 = h.b.f166558a;
        kVar.f166576a = jVar;
        kVar.f166577b = bVar;
        kVar.f166578c = pVarArr;
        kVar.f166582g = 1;
        p005kotlin.jvm.internal.b bVarB = p005kotlin.jvm.internal.i.b(pVarArr);
        bVar2 = new c.b(bVar);
        jVar2 = jVar;
        it = bVarB;
        if (it.hasNext()) {
            if (bVar2 instanceof c.a) {
                cVar2 = ((c.a) bVar2).f166569a;
            } else {
                if (!(bVar2 instanceof c.b)) {
                    u0.r();
                    return null;
                }
                cVar2 = new h.c(((c.b) bVar2).f166570a.f166567a, true);
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            if (cVar2 instanceof h.c) {
                str = "success";
            } else {
                str = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
            }
            String strConcat2 = "Save behaviours finished with ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SaveBehaviourChangesUseCase", strConcat2);
            kVar.f166576a = null;
            kVar.f166577b = null;
            kVar.f166578c = null;
            kVar.f166579d = null;
            kVar.f166582g = 3;
        } else {
            if (bVar2 instanceof c.a) {
                cVar2 = ((c.a) bVar2).f166569a;
            } else {
                if (!(bVar2 instanceof c.b)) {
                    u0.r();
                    return null;
                }
                cVar2 = new h.c(((c.b) bVar2).f166570a.f166567a, true);
            }
            a2 a2Var3 = a2.LIFESTYLE_LOGGING;
            if (cVar2 instanceof h.c) {
                str = "success";
            } else {
                str = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
            }
            String strConcat3 = "Save behaviours finished with ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "SaveBehaviourChangesUseCase", strConcat3);
            kVar.f166576a = null;
            kVar.f166577b = null;
            kVar.f166578c = null;
            kVar.f166579d = null;
            kVar.f166582g = 3;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(i iVar, b bVar, v13.c cVar) {
        m mVar;
        ArrayList arrayList;
        iVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f166616e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f166616e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(iVar, cVar);
            }
        } else {
            mVar = new m(iVar, cVar);
        }
        Object objB = mVar.f166614c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f166616e;
        if (i15 == 0) {
            o13.r.b(objB);
            List<pv0.d> list = bVar.f166567a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                pv0.d dVar = (pv0.d) obj;
                dVar.getClass();
                if (dVar.f141358a < 0) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "No custom behaviours to save");
                return new c.b(bVar);
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SaveBehaviourChangesUseCase", "Saving custom behaviours");
            rv0.a aVar2 = iVar.f166562a;
            mVar.f166612a = bVar;
            mVar.f166613b = arrayList2;
            mVar.f166616e = 1;
            objB = aVar2.b(arrayList2, mVar);
            if (objB == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = mVar.f166613b;
            bVar = mVar.f166612a;
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Saving custom behaviours failed: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "SaveBehaviourChangesUseCase", strD);
            return new c.a(new h.a(bVar.f166567a, bVar.f166568b));
        }
        a2 a2Var4 = a2.LIFESTYLE_LOGGING;
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "SaveBehaviourChangesUseCase", "Saved custom behaviours with success");
        List list2 = (List) ((v2.b) v2Var).f47386a;
        List<pv0.d> list3 = bVar.f166567a;
        ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
        for (pv0.d dVarA : list3) {
            dVarA.getClass();
            if (dVarA.f141358a < 0) {
                dVarA = pv0.d.a((pv0.d) list2.get(arrayList.indexOf(dVarA)), null, dVarA.f141365h, 895);
            }
            arrayList3.add(dVarA);
        }
        return new c.b(new b(arrayList3, h0.C0(bVar.f166568b, list2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(i iVar, b bVar, b63.o oVar, v13.c cVar) {
        n nVar;
        iVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f166620d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f166620d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(iVar, cVar);
            }
        } else {
            nVar = new n(iVar, cVar);
        }
        Object objH = nVar.f166618b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f166620d;
        if (i15 == 0) {
            o13.r.b(objH);
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "Saving tracked behaviours");
            ArrayList arrayListB = pv0.f.b(bVar.f166567a);
            nVar.f166617a = bVar;
            nVar.f166620d = 1;
            objH = iVar.h(arrayListB, oVar, nVar);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = nVar.f166617a;
            o13.r.b(objH);
        }
        v2 v2Var = (v2) objH;
        if (!(v2Var instanceof v2.a)) {
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SaveBehaviourChangesUseCase", "Saved tracked behaviours with success");
            return new c.b(bVar);
        }
        a2 a2Var3 = a2.LIFESTYLE_LOGGING;
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Save tracked behaviours failed: ");
        i2.f36769a.getClass();
        i2.a.f(a2Var3, "SaveBehaviourChangesUseCase", strD);
        return new c.a(new h.a(bVar.f166567a, bVar.f166568b));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cc -> B:31:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(tv0.i r17, tv0.i.b r18, v13.c r19) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv0.i.e(tv0.i, tv0.i$b, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r9 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(i iVar, Boolean bool, b bVar, v13.c cVar) {
        p pVar;
        v2 v2Var;
        iVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f166634e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f166634e = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(iVar, cVar);
            }
        } else {
            pVar = new p(iVar, cVar);
        }
        Object objQ = pVar.f166632c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f166634e;
        if (i15 == 0) {
            o13.r.b(objQ);
            if (bool == null) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "Auto logging enablement not changed");
                return new c.b(bVar);
            }
            iVar.f166566e.m();
            boolean zBooleanValue = bool.booleanValue();
            rv0.a aVar2 = iVar.f166562a;
            pVar.f166630a = bool;
            pVar.f166631b = bVar;
            if (zBooleanValue) {
                pVar.f166634e = 1;
                objQ = aVar2.g(pVar);
            } else {
                pVar.f166634e = 2;
                objQ = aVar2.q(pVar);
            }
            return aVar;
        }
        if (i15 == 1) {
            bVar = pVar.f166631b;
            bool = pVar.f166630a;
            o13.r.b(objQ);
            v2Var = (v2) objQ;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = pVar.f166631b;
            bool = pVar.f166630a;
            o13.r.b(objQ);
            v2Var = (v2) objQ;
        }
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            String strM = am.j.m("Auto logging ", bool.booleanValue() ? "enabled" : "disabled", " with success");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SaveBehaviourChangesUseCase", strM);
            return new c.b(bVar);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var3 = a2.LIFESTYLE_LOGGING;
        String str = bool.booleanValue() ? "enable" : "disable";
        String str2 = "Failed to " + str + " auto logging: " + ((v2.a) v2Var).f47383a;
        i2.f36769a.getClass();
        i2.a.f(a2Var3, "SaveBehaviourChangesUseCase", str2);
        return new c.a(new h.a(bVar.f166567a, bVar.f166568b));
    }

    public static r53.i g(i iVar, List list, List list2, b63.o oVar, Boolean bool, int i14) {
        if ((i14 & 2) != 0) {
            list2 = j0.f134944a;
        }
        List list3 = list2;
        if ((i14 & 4) != 0) {
            oVar = g22.l.d(b63.o.INSTANCE);
        }
        b63.o oVar2 = oVar;
        if ((i14 & 8) != 0) {
            bool = null;
        }
        iVar.getClass();
        list.getClass();
        list3.getClass();
        return r53.s.A(new c2(new l(iVar, list, list3, oVar2, bool, null)), iVar.f166565d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ArrayList arrayList, b63.o oVar, v13.c cVar) {
        q qVar;
        a0 a0Var;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f166639e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f166639e = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objF = qVar.f166637c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f166639e;
        rv0.a aVar2 = this.f166562a;
        if (i15 == 0) {
            o13.r.b(objF);
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q6.f.s(((pv0.d) it.next()).f141358a, arrayList2);
            }
            a0Var = new a0(this.f166563b.getUserProfilePk(), oVar, arrayList2);
            qVar.f166635a = oVar;
            qVar.f166636b = a0Var;
            qVar.f166639e = 1;
            objF = aVar2.f(a0Var, qVar);
            if (objF != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objF);
                return objF;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a0Var = qVar.f166636b;
        oVar = qVar.f166635a;
        o13.r.b(objF);
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            return v2Var;
        }
        a2 a2Var = a2.LIFESTYLE_LOGGING;
        String str = "Failed to save tracked behaviours for date " + fz0.d.a(oVar) + ": trying to save for today";
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SaveBehaviourChangesUseCase", str);
        a0 a0Var2 = new a0(a0Var.f141337a, fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString(), a0Var.f141339c);
        qVar.f166635a = null;
        qVar.f166636b = null;
        qVar.f166639e = 2;
        Object objF2 = aVar2.f(a0Var2, qVar);
        return objF2 == aVar ? aVar : objF2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltv0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(rv0.a aVar, f12.b bVar, g gVar, z zVar, qv0.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, bVar, gVar, zVar, aVar2);
    }
}
