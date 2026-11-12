package zd0;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lsd2/f;", "pairedDevices", "Lzd0/c;", "<unused var>", "Lzd0/o$a;", "<anonymous>", "(Ljava/util/List;Lzd0/c;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.GetStartActivityCapablePairedDevicesUseCase$invoke$1", f = "GetStartActivityCapablePairedDevicesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.q<List<? extends sd2.f>, zd0.c, t13.d<? super List<? extends o.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f204102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f204103b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f204104a;

        public a(long j8) {
            this.f204104a = j8;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            long unitID = ((sd2.f) t14).getUnitID();
            long j8 = this.f204104a;
            return r13.a.b(Boolean.valueOf(unitID == j8), Boolean.valueOf(((sd2.f) t7).getUnitID() == j8));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f204105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f204106b;

        public b(Comparator comparator, List list) {
            this.f204105a = comparator;
            this.f204106b = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f204105a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            Long lValueOf = Long.valueOf(((sd2.f) t14).getUnitID());
            List list = this.f204106b;
            return r13.a.b(Boolean.valueOf(list.contains(lValueOf)), Boolean.valueOf(list.contains(Long.valueOf(((sd2.f) t7).getUnitID()))));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f204107a;

        public c(Comparator comparator) {
            this.f204107a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f204107a.compare(t7, t14);
            return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((sd2.f) t14).K2()), Long.valueOf(((sd2.f) t7).K2()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(3, dVar);
        this.f204103b = oVar;
    }

    @Override // e23.q
    public final Object invoke(List<? extends sd2.f> list, zd0.c cVar, t13.d<? super List<? extends o.a>> dVar) {
        p pVar = new p(this.f204103b, dVar);
        pVar.f204102a = list;
        return pVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f204102a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o oVar = this.f204103b;
        ArrayList arrayListE = oVar.f204088b.x().e();
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            q6.f.s(((DeviceProfile) it.next()).getF92746j(), arrayList);
        }
        long jS4 = oVar.f204087a.s4();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (oVar.f204089c.a((sd2.f) obj2)) {
                arrayList2.add(obj2);
            }
        }
        List<sd2.f> listN0 = p13.h0.N0(arrayList2, new c(new b(new a(jS4), arrayList)));
        ArrayList arrayList3 = new ArrayList(p13.y.r(listN0, 10));
        for (sd2.f fVar : listN0) {
            long unitID = fVar.getUnitID();
            String productDisplayName = fVar.getProductDisplayName();
            productDisplayName.getClass();
            String displayName = fVar.getDisplayName();
            if (displayName == null) {
                displayName = fVar.getProductDisplayName();
                displayName.getClass();
            }
            arrayList3.add(new o.a(unitID, productDisplayName, displayName, fVar.getImageURL(), arrayList.contains(Long.valueOf(fVar.getUnitID()))));
        }
        return arrayList3;
    }
}
