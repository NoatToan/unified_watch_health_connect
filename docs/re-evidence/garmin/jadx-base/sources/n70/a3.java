package n70;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lsd2/f;", "pairedDevices", "", "", "Ljc0/c;", "batteryStatuses", "Lzd0/c;", "<unused var>", "Ln70/z2$b;", "<anonymous>", "(Ljava/util/List;Ljava/util/Map;Lzd0/c;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetPairedDevicesInfoUseCase$invoke$1", f = "GetPairedDevicesInfoUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a3 extends v13.i implements e23.r<List<? extends sd2.f>, Map<Long, ? extends jc0.c>, zd0.c, t13.d<? super List<? extends z2.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f124009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Map f124010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2 f124011c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f124012a;

        public a(long j8) {
            this.f124012a = j8;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            long unitID = ((sd2.f) t14).getUnitID();
            long j8 = this.f124012a;
            return r13.a.b(Boolean.valueOf(unitID == j8), Boolean.valueOf(((sd2.f) t7).getUnitID() == j8));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f124013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f124014b;

        public b(Comparator comparator, List list) {
            this.f124013a = comparator;
            this.f124014b = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f124013a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            Long lValueOf = Long.valueOf(((sd2.f) t14).getUnitID());
            List list = this.f124014b;
            return r13.a.b(Boolean.valueOf(list.contains(lValueOf)), Boolean.valueOf(list.contains(Long.valueOf(((sd2.f) t7).getUnitID()))));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f124015a;

        public c(Comparator comparator) {
            this.f124015a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f124015a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((sd2.f) t14).K2()), Long.valueOf(((sd2.f) t7).K2()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(z2 z2Var, t13.d<? super a3> dVar) {
        super(4, dVar);
        this.f124011c = z2Var;
    }

    @Override // e23.r
    public final Object invoke(List<? extends sd2.f> list, Map<Long, ? extends jc0.c> map, zd0.c cVar, t13.d<? super List<? extends z2.b>> dVar) {
        a3 a3Var = new a3(this.f124011c, dVar);
        a3Var.f124009a = list;
        a3Var.f124010b = map;
        return a3Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f124009a;
        Map map = this.f124010b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z2 z2Var = this.f124011c;
        ArrayList arrayListE = ((da2.b) z2Var.f124809h).e();
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            q6.f.s(((DeviceProfile) it.next()).getF92746j(), arrayList);
        }
        if (list.size() <= 1) {
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(z2.a(z2Var, (sd2.f) it3.next(), arrayList, map));
            }
            return arrayList2;
        }
        long jS4 = z2Var.f124803b.s4();
        int iD = (int) z2Var.f124806e.d("max_number_of_devices_in_home");
        if (iD <= 0) {
            iD = 5;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            sd2.f fVar = (sd2.f) obj2;
            if (fVar.getUnitID() != jS4 && !arrayList.contains(new Long(fVar.getUnitID()))) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                e53.c.a aVar2 = e53.c.f63094b;
                if (fVar.K2() >= jCurrentTimeMillis - e53.c.e(e53.e.e(90, e53.f.DAYS))) {
                }
            }
            arrayList3.add(obj2);
        }
        List listS0 = p13.h0.S0(p13.h0.N0(arrayList3, new c(new b(new a(jS4), arrayList))), iD);
        ArrayList arrayList4 = new ArrayList(p13.y.r(listS0, 10));
        Iterator it4 = listS0.iterator();
        while (it4.hasNext()) {
            arrayList4.add(z2.a(z2Var, (sd2.f) it4.next(), arrayList, map));
        }
        return arrayList4;
    }
}
