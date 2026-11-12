package n01;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import g01.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.d0;
import p13.y;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln01/l;", "Ln01/g;", "Lm01/g;", "repository", "Lb11/l;", "selectedMealWindow", "Lm21/b;", "mode", "<init>", "(Lm01/g;Lb11/l;Lm21/b;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b11.l f122141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m21.b f122142e;

    static {
        new a(null);
    }

    public l(m01.g gVar, b11.l lVar, m21.b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f122140c = gVar;
        this.f122141d = lVar;
        this.f122142e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        m mVar;
        h3.a aVar2;
        int i14;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i15 = mVar.f122147e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                mVar.f122147e = i15 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f122145c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = mVar.f122147e;
        b11.l lVar = this.f122141d;
        if (i16 == 0) {
            r.b(obj);
            Object objA = aVar.a();
            int i17 = aVar.f196007a;
            Integer num = (Integer) objA;
            int iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, i17);
            Long l14 = lVar != null ? new Long(lVar.f14331a) : null;
            mVar.f122143a = aVar;
            mVar.f122144b = iIntValue;
            mVar.f122147e = 1;
            Object objR = this.f122140c.r(iF, i17, l14, mVar);
            if (objR == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            i14 = iIntValue;
            obj = objR;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = mVar.f122144b;
            aVar2 = mVar.f122143a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        v vVar = (v) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        List<g01.a> list = vVar.f74266b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b11.a aVarA = ((g01.a) it.next()).a();
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!h((b11.a) obj2)) {
                arrayList3.add(obj2);
            }
        }
        if (i14 == 0) {
            List<g01.a> list2 = vVar.f74265a;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                b11.a aVarA2 = ((g01.a) it3.next()).a();
                if (aVarA2 != null) {
                    arrayList4.add(aVarA2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (!h((b11.a) obj3)) {
                    arrayList5.add(obj3);
                }
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(new g01.n.b(R.string.lbl_frequent_foods, lVar));
                ArrayList arrayList6 = new ArrayList(y.r(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new g01.n.a((b11.a) it4.next()));
                }
                d0.v(arrayList, arrayList6);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new g01.n.b(R.string.lbl_recently_logged, null, 2, null));
            }
        }
        ArrayList arrayList7 = new ArrayList(y.r(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList7.add(new g01.n.a((b11.a) it5.next()));
        }
        d0.v(arrayList, arrayList7);
        return new h3.b.c(arrayList, i14 == 0 ? null : new Integer(i14 - 1), vVar.f74267c ? new Integer((aVar2.f196007a / 50) + i14) : null);
    }

    public final boolean h(b11.a aVar) {
        m21.b bVar = this.f122142e;
        if ((bVar instanceof m21.b.a) && aVar.b() == b11.b.MEAL) {
            return true;
        }
        return (bVar instanceof m21.b.c) && !v21.a.c(aVar, ((m21.b.c) bVar).f116072b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/l$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
