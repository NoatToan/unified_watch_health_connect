package ao;

import e23.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015BS\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lao/b;", "Lyc/h3;", "", "Lwo0/a;", "", "searchQuery", "Lao/m;", "baseQuery", "", "Ljo/c;", "filters", "Lco/h;", "mapItem", "Lco/j;", "searchActivities", "Lkotlin/Function2;", "", "", "updateCount", "<init>", "(Ljava/lang/String;Lao/m;Ljava/util/List;Lco/h;Lco/j;Le23/p;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h3<Integer, wo0.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f11499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<jo.c> f11500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final co.h f11501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final co.j f11502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p<Integer, Boolean, Unit> f11503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<Long> f11504h;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, m mVar, List<? extends jo.c> list, co.h hVar, co.j jVar, p<? super Integer, ? super Boolean, Unit> pVar) {
        mVar.getClass();
        hVar.getClass();
        jVar.getClass();
        pVar.getClass();
        this.f11498b = str;
        this.f11499c = mVar;
        this.f11500d = list;
        this.f11501e = hVar;
        this.f11502f = jVar;
        this.f11503g = pVar;
        this.f11504h = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, wo0.a> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        int iIntValue = num3.intValue();
        h3.b.c<Integer, wo0.a> cVarA = i3Var.a(iIntValue);
        m mVar = this.f11499c;
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return Integer.valueOf(num2.intValue() + mVar.f11530c);
        }
        h3.b.c<Integer, wo0.a> cVarA2 = i3Var.a(iIntValue);
        if (cVarA2 == null || (num = cVarA2.f196018c) == null) {
            return null;
        }
        return Integer.valueOf(num.intValue() - mVar.f11530c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        c cVar2;
        Object objA;
        int i14;
        int i15;
        ?? arrayList;
        bo.f fVar;
        bo.f fVar2;
        List<bo.l> list;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f11509e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f11509e = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f11507c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f11509e;
        m mVar = this.f11499c;
        boolean z14 = true;
        if (i17 == 0) {
            r.b(obj);
            Integer num = (Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 0;
            int i18 = aVar.f196007a;
            int i19 = i18 > 20 ? 20 : i18;
            am.g gVar = mVar.f11528a;
            jo.f fVar3 = mVar.f11531d;
            int i24 = mVar.f11532e;
            String str = mVar.f11533f;
            gVar.getClass();
            fVar3.getClass();
            m mVar2 = new m(gVar, iIntValue, i19, fVar3, i24, str);
            List list2 = this.f11500d;
            if (list2 == null) {
                list2 = j0.f134944a;
            }
            cVar2.f11505a = iIntValue;
            cVar2.f11506b = i19;
            cVar2.f11509e = 1;
            objA = this.f11502f.a(this.f11498b, mVar2, list2, cVar2);
            if (objA == aVar2) {
                return aVar2;
            }
            i14 = iIntValue;
            i15 = i19;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = cVar2.f11506b;
            i14 = cVar2.f11505a;
            r.b(obj);
            objA = ((q) obj).f128597a;
        }
        int i25 = q.f128596b;
        boolean z15 = objA instanceof q.b;
        if (z15) {
            Throwable thB = q.b(objA);
            if (thB == null) {
                thB = new Exception("Unknown error");
            }
            return new h3.b.a(thB);
        }
        bo.d dVar = (bo.d) (z15 ? null : objA);
        if (dVar == null || (list = dVar.f19102a) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f11501e.a((bo.l) it.next()));
            }
        }
        bo.d dVar2 = (bo.d) (z15 ? null : objA);
        int i26 = (dVar2 == null || (fVar2 = dVar2.f19104c) == null) ? 0 : fVar2.f19113a;
        if (z15) {
            objA = null;
        }
        bo.d dVar3 = (bo.d) objA;
        this.f11503g.invoke(new Integer(i26), Boolean.valueOf((dVar3 == null || (fVar = dVar3.f19104c) == null) ? false : fVar.f19114b));
        if (mVar.f11528a.f3963c && arrayList.size() >= i15) {
            z14 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) arrayList) {
            if (this.f11504h.add(new Long(((wo0.a) obj2).f186415a))) {
                arrayList2.add(obj2);
            }
        }
        return new h3.b.c(arrayList2, i14 == 0 ? null : new Integer(i14 - i15), z14 ? null : new Integer(i14 + i15));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lao/b$a;", "", "<init>", "()V", "", "FIRST_PAGE_INDEX", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
