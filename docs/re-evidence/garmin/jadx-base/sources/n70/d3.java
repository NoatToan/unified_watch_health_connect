package n70;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln70/d3;", "", "Lvb0/b;", "repository", "Lf12/l;", "userSettings", "<init>", "(Lvb0/b;Lf12/l;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f124134d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb0.b f124135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f124136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.p2 f124137c;

    static {
        new a(null);
    }

    public d3(vb0.b bVar, f12.l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f124135a = bVar;
        this.f124136b = lVar;
        this.f124137c = r53.q2.a(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(d3 d3Var, v13.c cVar) {
        e3 e3Var;
        List list;
        ArrayList arrayList;
        List list2;
        d3Var.getClass();
        if (cVar instanceof e3) {
            e3Var = (e3) cVar;
            int i14 = e3Var.f124179e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e3Var.f124179e = i14 - Integer.MIN_VALUE;
            } else {
                e3Var = new e3(d3Var, cVar);
            }
        } else {
            e3Var = new e3(d3Var, cVar);
        }
        Object obj = e3Var.f124177c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e3Var.f124179e;
        if (i15 == 0) {
            o13.r.b(obj);
            ArrayList arrayListB = d3Var.b();
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListE, 10));
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList2);
                }
                list = arrayList2;
            } else {
                list = p13.j0.f134944a;
            }
            vb0.b bVar = d3Var.f124135a;
            e3Var.f124175a = arrayListB;
            e3Var.f124176b = list;
            e3Var.f124179e = 1;
            Object objB = bVar.b(e3Var);
            if (objB == aVar) {
                return aVar;
            }
            arrayList = arrayListB;
            obj = objB;
            list2 = list;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = (List) e3Var.f124176b;
            arrayList = e3Var.f124175a;
            o13.r.b(obj);
        }
        List list3 = (List) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            vb0.e eVar = (vb0.e) obj2;
            if (!list2.contains(new Long(eVar.getUnitId())) || list3.contains(new Long(eVar.getUnitId()))) {
                arrayList3.add(obj2);
            }
        }
        f12.l lVar = d3Var.f124136b;
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(GsonUtil.a((vb0.e) it3.next()));
        }
        lVar.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList4));
        return Unit.INSTANCE;
    }

    public final ArrayList b() {
        Set<String> setL1 = this.f124136b.L1("DISMISSED_BANNER_DEVICES");
        ArrayList arrayList = new ArrayList(p13.y.r(setL1, 10));
        Iterator<T> it = setL1.iterator();
        while (it.hasNext()) {
            arrayList.add((vb0.e) GsonUtil.f47253b.fromJson((String) it.next(), vb0.e.class));
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln70/d3$a;", "", "<init>", "()V", "", "TWO_DAYS_IN_MILLIS", "I", "", "INREACH_REMINDER_OVERRIDE", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
