package hd0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$scanNetworks$1", f = "WifiNetworksViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<List<WifiSetup.ScannedAccessPoint>> f83337c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$scanNetworks$1$scannedNetworksResult$1", f = "WifiNetworksViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super List<? extends WifiSetup.ScannedAccessPoint>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f83340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f83340c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f83340c, dVar);
            aVar.f83339b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends WifiSetup.ScannedAccessPoint>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            b0 b0Var = (b0) this.f83339b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83338a;
            b bVar = this.f83340c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    gn2.c cVar = (gn2.c) k.b(gn2.c.class, bVar.f83308a);
                    if (cVar == null) {
                        return null;
                    }
                    this.f83339b = b0Var;
                    this.f83338a = 1;
                    obj = cVar.q(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return (List) obj;
            } catch (Exception e4) {
                a2 a2Var = a2.DEVICES;
                String strN = wr.g.n("scanNetworks FAILED deviceId[", bVar.f83308a, "] ", e4);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "WifiNetworksViewModel", strN);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, y0<List<WifiSetup.ScannedAccessPoint>> y0Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f83336b = bVar;
        this.f83337c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f83336b, this.f83337c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83335a;
        ArrayList arrayList = null;
        b bVar = this.f83336b;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            a aVar2 = new a(bVar, null);
            this.f83335a = 1;
            obj = ge1.b.e0(bVar2, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list = (List) obj;
        ArrayList arrayList2 = bVar.f83310c;
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((WifiSetup.StoredAccessPoint) it.next()).getSsid());
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!arrayList3.contains(((WifiSetup.ScannedAccessPoint) obj2).getSsid())) {
                    arrayList.add(obj2);
                }
            }
        }
        bVar.f83309b.j(new h.b(arrayList));
        this.f83337c.j(arrayList);
        return Unit.INSTANCE;
    }
}
