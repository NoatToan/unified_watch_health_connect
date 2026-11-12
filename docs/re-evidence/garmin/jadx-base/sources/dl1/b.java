package dl1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.t;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jl1.i;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.l0;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldl1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ldl1/a;", "Lbl1/b;", "userPreferenceAPI", "Lcl1/a;", "recordActivityPreferences", "<init>", "(Lbl1/b;Lcl1/a;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, dl1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f60300c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl1.b f60301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl1.a f60302b;

    static {
        new a(null);
    }

    public b(bl1.b bVar, cl1.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.f60301a = bVar;
        this.f60302b = aVar;
    }

    @Override // dl1.a
    public final Object a(long j8, i iVar) {
        return d(j8, iVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl1.a
    public final Object b(long j8, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f60306d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f60306d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f60304b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f60306d;
        Set<Long> setG1 = null;
        if (i15 == 0) {
            r.b(objJ);
            d dVar = new d(this, null);
            cVar2.f60303a = j8;
            cVar2.f60306d = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = cVar2.f60303a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                v2.a aVar2 = (v2.a) v2Var;
                return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        String str = ((bl1.a) bVar.f47386a).f18591b;
        if (str != null) {
            List listW = w.W(str, new String[]{","});
            ArrayList arrayList = new ArrayList();
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                Long lJ = t.j((String) it.next());
                if (lJ != null) {
                    arrayList.add(lJ);
                }
            }
            setG1 = h0.g1(arrayList);
        }
        if (setG1 == null) {
            setG1 = l0.f134950a;
        }
        this.f60302b.c(setG1);
        return new v2.b(Boolean.valueOf(setG1.contains(new Long(j8))), bVar.f47387b, bVar.f47388c, null, 8, null);
    }

    @Override // dl1.a
    public final Object c(long j8, t13.d<? super v2<Boolean>> dVar) {
        return d(j8, (v13.c) dVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(long j8, v13.c cVar, boolean z14) {
        e eVar;
        Set<Long> set;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f60312d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f60312d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f60310b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f60312d;
        cl1.a aVar2 = this.f60302b;
        if (i15 == 0) {
            r.b(obj);
            Set<Long> setF1 = h0.f1(aVar2.i());
            if (!(z14 ? setF1.add(new Long(j8)) : setF1.remove(new Long(j8)))) {
                return new v2.b(Boolean.FALSE, 200, null, null, 12, null);
            }
            f fVar = new f(setF1, this, null);
            eVar.f60309a = setF1;
            eVar.f60312d = 1;
            Object objJ = f0.J(this, fVar, eVar);
            if (objJ == aVar) {
                return aVar;
            }
            obj = objJ;
            set = setF1;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = eVar.f60309a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            aVar2.c(set);
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.TRUE, bVar.f47387b, bVar.f47388c, null, 8, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar3 = (v2.a) v2Var;
            return new v2.a(aVar3.f47383a, aVar3.f47384b, aVar3.f47385c);
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldl1/b$a;", "", "<init>", "()V", "", "DELIMITER", "Ljava/lang/String;", "PREFERENCE_KEY_RECORD_ACTIVITY_ONBOARDING_DISPLAYED_DEVICE_IDS_LIST", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
