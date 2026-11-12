package y70;

import com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0;
import com.garmin.proto.generated.GDIDeviceStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.h0;
import p13.y;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly70/b;", "Lr70/s;", "Ln70/r;", "getBatteryLowStateUseCase", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "<init>", "(Ln70/r;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r70.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n70.r f194644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f194645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f194646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f194647d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lbc0/a;", "updates", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.stateholder.BatteryLowStateHolder$batteryState$2$1", f = "BatteryLowStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<List<? extends bc0.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f194648a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f194648a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(List<? extends bc0.a> list, t13.d<? super Unit> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f194648a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            ArrayList arrayListX = v.h.x(obj);
            for (Object obj2 : list) {
                GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus = ((bc0.a) obj2).f17405c;
                if (remoteDeviceBatteryStatusBatteryStatus == GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.FULLY_CHARGED || remoteDeviceBatteryStatusBatteryStatus == GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.NORMAL) {
                    arrayListX.add(obj2);
                }
            }
            ArrayList arrayList = new ArrayList(y.r(arrayListX, 10));
            Iterator it = arrayListX.iterator();
            while (it.hasNext()) {
                q6.f.s(((bc0.a) it.next()).f17403a, arrayList);
            }
            Set setG1 = h0.g1(arrayList);
            if (!setG1.isEmpty()) {
                b bVar = b.this;
                p2 p2Var = bVar.f194646c;
                p2 p2Var2 = bVar.f194646c;
                Iterable iterable = (Iterable) p2Var.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : iterable) {
                    String str = (String) obj3;
                    Set set = setG1;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it3 = set.iterator();
                        do {
                            if (it3.hasNext()) {
                            }
                        } while (!d53.u.y(str, ((Number) it3.next()).longValue() + ":", false));
                    }
                    arrayList2.add(obj3);
                }
                Set<String> setG2 = h0.g1(arrayList2);
                if (!p005kotlin.jvm.internal.s.g(setG2, p2Var2.getValue())) {
                    p2Var2.setValue(setG2);
                    bVar.f194645b.g(setG2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: y70.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lbc0/a;", "updates", "", "", "dismissed", "<anonymous>", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.stateholder.BatteryLowStateHolder$batteryState$2$2", f = "BatteryLowStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3625b extends v13.i implements e23.q<List<? extends bc0.a>, Set<? extends String>, t13.d<? super List<? extends bc0.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f194650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Set f194651b;

        public C3625b(t13.d<? super C3625b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(List<? extends bc0.a> list, Set<? extends String> set, t13.d<? super List<? extends bc0.a>> dVar) {
            C3625b c3625b = b.this.new C3625b(dVar);
            c3625b.f194650a = list;
            c3625b.f194651b = set;
            return c3625b.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = this.f194650a;
            Set set = this.f194651b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                bc0.a aVar2 = (bc0.a) obj2;
                GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus = aVar2.f17405c;
                if (remoteDeviceBatteryStatusBatteryStatus != GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.FULLY_CHARGED && remoteDeviceBatteryStatusBatteryStatus != GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.NORMAL) {
                    b.this.getClass();
                    if (!set.contains(b.g(aVar2))) {
                        arrayList.add(obj2);
                    }
                }
            }
            return arrayList;
        }
    }

    public b(n70.r rVar, s0 s0Var) {
        rVar.getClass();
        s0Var.getClass();
        this.f194644a = rVar;
        this.f194645b = s0Var;
        this.f194646c = q2.a(s0Var.f());
        this.f194647d = o13.m.b(new xn.r(this, 9));
    }

    public static String g(bc0.a aVar) {
        return aVar.f17403a + ":" + (aVar.f17405c == GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.CRITICAL ? "CRITICAL" : "LOW");
    }

    @Override // r70.s
    public final String a() {
        return o70.f.BATTERY_LOW.a();
    }

    public final void f(bc0.a aVar) {
        aVar.getClass();
        p2 p2Var = this.f194646c;
        LinkedHashSet linkedHashSetI = c1.i((Set) p2Var.getValue(), g(aVar));
        p2Var.k(null, linkedHashSetI);
        this.f194645b.g(linkedHashSetI);
    }
}
