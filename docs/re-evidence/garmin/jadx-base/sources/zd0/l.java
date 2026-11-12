package zd0;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements r53.i<List<? extends k.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f204061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f204062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f204063c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f204064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f204065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f204066c;

        /* JADX INFO: renamed from: zd0.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.domain.GetExistingDevicesConnectionStateUseCase$invoke$$inlined$map$1$2", f = "GetExistingDevicesConnectionStateUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C3808a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f204067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f204068b;

            public C3808a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f204067a = obj;
                this.f204068b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, k kVar, List list) {
            this.f204064a = jVar;
            this.f204065b = kVar;
            this.f204066c = list;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3808a c3808a;
            if (dVar instanceof C3808a) {
                c3808a = (C3808a) dVar;
                int i14 = c3808a.f204068b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3808a.f204068b = i14 - Integer.MIN_VALUE;
                } else {
                    c3808a = new C3808a(dVar);
                }
            } else {
                c3808a = new C3808a(dVar);
            }
            Object obj2 = c3808a.f204067a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3808a.f204068b;
            if (i15 == 0) {
                o13.r.b(obj2);
                ArrayList arrayListE = this.f204065b.f204040a.x().e();
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    q6.f.s(((DeviceProfile) it.next()).getF92746j(), arrayList);
                }
                List<sd2.f> list = this.f204066c;
                ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                for (sd2.f fVar : list) {
                    long unitID = fVar.getUnitID();
                    String displayName = fVar.getDisplayName();
                    if (displayName == null) {
                        displayName = fVar.getProductDisplayName();
                        displayName.getClass();
                    }
                    arrayList2.add(new k.a(unitID, displayName, fVar.getImageURL(), arrayList.contains(Long.valueOf(fVar.getUnitID()))));
                }
                c3808a.f204068b = 1;
                if (this.f204064a.emit(arrayList2, c3808a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public l(r53.i iVar, k kVar, List list) {
        this.f204061a = iVar;
        this.f204062b = kVar;
        this.f204063c = list;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends k.a>> jVar, t13.d dVar) {
        Object objCollect = this.f204061a.collect(new a(jVar, this.f204062b, this.f204063c), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
