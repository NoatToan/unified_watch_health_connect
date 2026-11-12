package hd0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$retrieveNetworks$1", f = "WifiNetworksViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<gn2.c.d> f83331c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgn2/c$d;", "<anonymous>", "(Lo53/b0;)Lgn2/c$d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$retrieveNetworks$1$networksResult$1", f = "WifiNetworksViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super gn2.c.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f83334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f83334c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f83334c, dVar);
            aVar.f83333b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super gn2.c.d> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f83333b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83332a;
            b bVar = this.f83334c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    gn2.c cVar = (gn2.c) k.b(gn2.c.class, bVar.f83308a);
                    if (cVar == null) {
                        return null;
                    }
                    this.f83333b = b0Var;
                    this.f83332a = 1;
                    obj = cVar.p(this);
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
                return (gn2.c.d) obj;
            } catch (Exception e4) {
                a2 a2Var = a2.DEVICES;
                String strN = wr.g.n("retrieveNetworks FAILED deviceId[", bVar.f83308a, "] ", e4);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "WifiNetworksViewModel", strN);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, y0<gn2.c.d> y0Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f83330b = bVar;
        this.f83331c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f83330b, this.f83331c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83329a;
        b bVar = this.f83330b;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            a aVar2 = new a(bVar, null);
            this.f83329a = 1;
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
        gn2.c.d dVar = (gn2.c.d) obj;
        if (dVar != null) {
            List<WifiSetup.StoredAccessPoint> list = dVar.f78108c;
            bVar.f83311d = dVar.f78106a;
            ArrayList arrayList = bVar.f83310c;
            arrayList.clear();
            arrayList.addAll(list);
            bVar.f83312e = dVar.f78109d;
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).b(bVar.f83308a, !list.isEmpty());
        }
        bVar.f83309b.j(new h.C1643h(dVar));
        this.f83331c.j(dVar);
        return Unit.INSTANCE;
    }
}
