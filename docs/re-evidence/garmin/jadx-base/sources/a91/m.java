package a91;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.c1;
import p13.h0;
import p13.l0;
import z70.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"La91/m;", "Lcom/garmin/android/apps/connectmobile/f0;", "La91/w;", "personalizedInsightsApi", "Lz70/j0;", "userPreferenceApi", "La80/a;", "dataPreferences", "<init>", "(La91/w;Lz70/j0;La80/a;)V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<String> f2145d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f2147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a80.a f2148c;

    static {
        new a(null);
        f2145d = p13.u.m0(new String[]{"en", "es", "fr", "de", "it", "ja", "zh_TW"});
    }

    public m(w wVar, j0 j0Var, a80.a aVar) {
        wVar.getClass();
        j0Var.getClass();
        aVar.getClass();
        this.f2146a = wVar;
        this.f2147b = j0Var;
        this.f2148c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f2151c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f2151c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f2149a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f2151c;
        if (i15 == 0) {
            o13.r.b(objJ);
            o oVar = new o(this, null);
            nVar.f2151c = 1;
            objJ = f0.J(this, oVar, nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return v2Var;
        }
        v2.b bVar = (v2.b) v2Var;
        T t7 = bVar.f47386a;
        if (bVar.f47387b != 204) {
            d91.w wVar = (d91.w) t7;
            if (wVar.getPreferredAiLanguage() != null && !p005kotlin.jvm.internal.s.g(wVar.getPreferredAiLanguage(), "system")) {
                return bVar;
            }
        }
        return v2.b.a(bVar, new d91.w(null));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[LOOP:0: B:33:0x0091->B:35:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable b(v13.c cVar) {
        p pVar;
        v2 v2Var;
        v2 v2Var2;
        String str;
        Set setG1;
        ArrayList arrayList;
        Iterator it;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f2157d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f2157d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f2155b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f2157d;
        Set set = f2145d;
        if (i15 == 0) {
            o13.r.b(objJ);
            q qVar = new q(this, null);
            pVar.f2157d = 1;
            objJ = f0.J(this, qVar, pVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var2 = pVar.f2154a;
            o13.r.b(objJ);
        }
        v2Var = v2Var2;
        if (v2Var instanceof v2.b) {
            return null;
        }
        str = ((z70.u) ((v2.b) v2Var).f47386a).f202869b;
        if (str != null) {
            List listW = d53.w.W(str, new String[]{","});
            arrayList = new ArrayList(p13.y.r(listW, 10));
            it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(d53.w.i0((String) it.next()).toString());
            }
            setG1 = h0.g1(arrayList);
            if (setG1 == null) {
                setG1 = l0.f134950a;
            }
        } else {
            setG1 = l0.f134950a;
        }
        return c1.h(setG1, set);
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (((z70.u) bVar.f47386a).f202869b == null) {
                pVar.f2154a = bVar;
                pVar.f2157d = 2;
                if (d(set, pVar) != aVar) {
                    v2Var2 = v2Var;
                    v2Var = v2Var2;
                }
                return aVar;
            }
        }
        if (v2Var instanceof v2.b) {
            return null;
        }
        str = ((z70.u) ((v2.b) v2Var).f47386a).f202869b;
        if (str != null) {
            List listW2 = d53.w.W(str, new String[]{","});
            arrayList = new ArrayList(p13.y.r(listW2, 10));
            it = listW2.iterator();
            while (it.hasNext()) {
                arrayList.add(d53.w.i0((String) it.next()).toString());
            }
            setG1 = h0.g1(arrayList);
            if (setG1 == null) {
                setG1 = l0.f134950a;
            }
        } else {
            setG1 = l0.f134950a;
        }
        return c1.h(setG1, set);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(boolean z14, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f2162c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f2162c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objJ = rVar.f2160a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f2162c;
        a80.a aVar2 = this.f2148c;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (z14) {
                aVar2.f(l0.f134950a);
            }
            Set<String> setC = aVar2.c();
            if (!setC.isEmpty()) {
                return setC;
            }
            s sVar = new s(this, null);
            rVar.f2162c = 1;
            objJ = f0.J(this, sVar, rVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        Set<String> setA = ((d91.o) ((v2.b) v2Var).f47386a).a();
        Set<String> set = setA;
        if (set != null && !set.isEmpty()) {
            aVar2.f(setA);
        }
        return setA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(Set set, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f2170c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f2170c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.f2168a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f2170c;
        if (i15 == 0) {
            o13.r.b(objJ);
            v vVar = new v(this, set, null);
            uVar.f2170c = 1;
            objJ = f0.J(this, vVar, uVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        String str = ((z70.u) ((v2.b) v2Var).f47386a).f202869b;
        if (str != null) {
            List listW = d53.w.W(str, new String[]{","});
            ArrayList arrayList = new ArrayList(p13.y.r(listW, 10));
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(d53.w.i0((String) it.next()).toString());
            }
            Set setG1 = h0.g1(arrayList);
            if (setG1 != null) {
                return setG1;
            }
        }
        return l0.f134950a;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La91/m$a;", "", "<init>", "()V", "", "SUPPORTED_LANGUAGE_PROMPT_SHOWN", "Ljava/lang/String;", "SYSTEM_VALUE", "", "originalLanguages", "Ljava/util/Set;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
