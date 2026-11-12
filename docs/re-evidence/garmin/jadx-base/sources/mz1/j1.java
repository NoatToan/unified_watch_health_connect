package mz1;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.SendToDeviceViewModel$getRegisteredDevices$1", f = "SendToDeviceViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f121800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f121802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1 f121803d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f121804a;

        public a(Map map) {
            this.f121804a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Long unitId = ((fg0.i) t7).getUnitId();
            Map map = this.f121804a;
            return r13.a.b((Comparable) map.get(unitId), (Comparable) map.get(((fg0.i) t14).getUnitId()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f121805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f121806b;

        public b(Comparator comparator, i1 i1Var) {
            this.f121805a = comparator;
            this.f121806b = i1Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            boolean z14;
            int iCompare = this.f121805a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            fg0.i iVar = (fg0.i) t14;
            boolean sportingEventCapable = iVar.getSportingEventCapable();
            boolean z15 = false;
            i1 i1Var = this.f121806b;
            if (sportingEventCapable) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar = i1Var.f121790e;
                if ((eVar != null ? eVar.z() : null) != com.garmin.android.library.mapsdkadapter.i.b.GCJ02 || p005kotlin.jvm.internal.s.g(iVar.getGcj02CourseCapable(), Boolean.TRUE)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z14);
            fg0.i iVar2 = (fg0.i) t7;
            if (iVar2.getSportingEventCapable()) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = i1Var.f121790e;
                if ((eVar2 != null ? eVar2.z() : null) != com.garmin.android.library.mapsdkadapter.i.b.GCJ02 || p005kotlin.jvm.internal.s.g(iVar2.getGcj02CourseCapable(), Boolean.TRUE)) {
                    z15 = true;
                }
            }
            return r13.a.b(boolValueOf, Boolean.valueOf(z15));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i1 i1Var, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f121803d = i1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j1 j1Var = new j1(this.f121803d, dVar);
        j1Var.f121802c = obj;
        return j1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list;
        o53.b0 b0Var = (o53.b0) this.f121802c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121801b;
        i1 i1Var = this.f121803d;
        if (i14 == 0) {
            o13.r.b(obj);
            rd2.f.a().f152045a.getClass();
            Iterable iterableD = rd2.j.d();
            if (iterableD == null) {
                iterableD = p13.j0.f134944a;
            }
            i1.a aVar2 = i1.f121784h;
            i1Var.getClass();
            f12.l.f68084a.getClass();
            long jS4 = f12.l.a.a().s4();
            ArrayList arrayListE = ((da2.b) i1Var.f121786a).e();
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((DeviceProfile) it.next()).getF92746j()));
            }
            List listN0 = p13.h0.N0(iterableD, new n1(new m1(new l1(jS4), arrayList)));
            i1.f121784h.getClass();
            zf0.d dVar = i1.f121785i;
            this.f121802c = b0Var;
            this.f121800a = listN0;
            this.f121801b = 1;
            dVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.r(dVar, null), this);
            if (objJ == aVar) {
                return aVar;
            }
            list = listN0;
            obj = objJ;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.f121800a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            int i15 = 0;
            for (Object obj2 : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList2.add(new o13.p(new Long(((sd2.f) obj2).getUnitID()), new Integer(i15)));
                i15 = i16;
            }
            List listN1 = p13.h0.N0((Iterable) ((v2.b) v2Var).f47386a, new b(new a(p13.u0.l(arrayList2)), i1Var));
            i1.a aVar3 = i1.f121784h;
            ((androidx.lifecycle.y0) i1Var.f121787b.getValue()).j(listN1);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "there is a problem in fetching primary device data ");
            p92.y.f136664a.getClass();
            p92.y.a.c("SendToDeviceViewModel", strG);
        }
        return Unit.INSTANCE;
    }
}
