package rq0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.k;
import d53.u;
import d53.w;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import o13.r;
import o53.b0;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyq0/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.domain.GetDemographicSelectionUseCase$invoke$2", f = "GetDemographicSelectionUseCase.kt", l = {25, 35}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super v2<? extends yq0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f154117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tq0.d f154118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tq0.e f154119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f154120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f154122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f154122f = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f154122f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends yq0.b>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        tq0.e eVar;
        String str;
        Object objA;
        tq0.e eVar2;
        tq0.d dVar;
        String str2;
        int i14;
        Collection collectionS0;
        boolean zQ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f154121e;
        boolean z14 = true;
        d dVar2 = this.f154122f;
        if (i15 == 0) {
            r.b(obj);
            ar0.a aVar2 = dVar2.f154123a;
            bv.d dVar3 = dVar2.f154124b;
            String strB = dVar3.b();
            String str3 = dVar3.g().f77293c;
            this.f154121e = 1;
            objJ = f0.J(aVar2, new ar0.c(aVar2, strB, str3, null), this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(obj);
            objJ = obj;
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = this.f154120d;
            tq0.e eVar3 = this.f154119c;
            tq0.d dVar4 = this.f154118b;
            v2.b bVar = this.f154117a;
            r.b(obj);
            str2 = str4;
            eVar2 = eVar3;
            dVar = dVar4;
            v2Var = bVar;
            objA = obj;
        }
        List list = (List) objA;
        br0.b.f19573a.getClass();
        return new v2.b(new yq0.b(dVar, eVar2, str2, br0.b.a.a(dVar, list), list), ((v2.b) v2Var).f47387b, null, null, 12, null);
        v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                v2.a aVar3 = (v2.a) v2Var;
                return new v2.a(aVar3.f47383a, aVar3.f47384b, aVar3.f47385c);
            }
            u0.r();
            return null;
        }
        v2.b bVar2 = (v2.b) v2Var;
        tq0.d dVar5 = (tq0.d) bVar2.f47386a;
        List<tq0.e> list2 = dVar5.f166050d;
        bv.d dVar6 = dVar2.f154124b;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            }
            tq0.e eVar4 = (tq0.e) it.next();
            String str5 = eVar4.f166052a;
            if (str5 != null) {
                String strW = dVar6.w();
                int iHashCode = str5.hashCode();
                if (iHashCode == 70) {
                    boolean z15 = z14;
                    if (str5.equals("F")) {
                        zQ = u.q(strW, "FEMALE", z15);
                    } else {
                        zQ = false;
                    }
                } else if (iHashCode != 77) {
                    if (iHashCode == 64897 && str5.equals(Rule.ALL)) {
                        if (!u.q(strW, "MALE", true) && !u.q(strW, "FEMALE", true)) {
                            zQ = true;
                        }
                    }
                    zQ = false;
                } else if (str5.equals("M")) {
                    zQ = u.q(strW, "MALE", true);
                } else {
                    zQ = false;
                }
                if (zQ) {
                    eVar = eVar4;
                    break;
                }
            }
            z14 = true;
        }
        List<String> list3 = dVar5.f166048b;
        int iU = dVar2.f154124b.u();
        Iterator<T> it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                str = Rule.ALL;
                break;
            }
            str = (String) it3.next();
            List listG = new k("-").g(0, str);
            if (!listG.isEmpty()) {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i14 = 1;
                        collectionS0 = j0.f134944a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        i14 = 1;
                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                i14 = 1;
                collectionS0 = j0.f134944a;
                break;
            }
            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
            if (strArr.length != i14) {
                int i16 = Integer.parseInt(strArr[0]);
                int i17 = Integer.parseInt(strArr[1]);
                if (i16 <= iU && iU <= i17) {
                    break;
                }
            } else if ((iU == -1 && !w.z(strArr[0], "75", false)) || (iU >= 75 && w.z(strArr[0], "75", false))) {
                break;
            }
        }
        this.f154117a = bVar2;
        this.f154118b = dVar5;
        this.f154119c = eVar;
        this.f154120d = str;
        this.f154121e = 2;
        objA = d.a(dVar2, dVar5, this);
        if (objA != aVar) {
            eVar2 = eVar;
            dVar = dVar5;
            str2 = str;
            List list4 = (List) objA;
            br0.b.f19573a.getClass();
            return new v2.b(new yq0.b(dVar, eVar2, str2, br0.b.a.a(dVar, list4), list4), ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        return aVar;
    }
}
