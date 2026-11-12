package ch1;

import android.os.Parcelable;
import androidx.datastore.core.CorruptionException;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.compose.clustering.ClusteringKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27338a;

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f27338a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.b();
                return Unit.INSTANCE;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.m();
                return Unit.INSTANCE;
            case 2:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.f132238b = new d53.k("[-–—]").f(bVar3.f132238b, bVar3.f132237a.getString(R.string.ada_dash));
                return Unit.INSTANCE;
            case 4:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            case 5:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.g(k0Var2);
                return Unit.INSTANCE;
            case 7:
                Module module = (Module) obj;
                cm0.a aVar = cm0.a.f27958a;
                module.getClass();
                c50.a aVar2 = new c50.a(21);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Singleton;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier, t0Var.b(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class), null, aVar2, kind, j0Var), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                TypeQualifier typeQualifier = new TypeQualifier(t0Var.b(pb2.g.c.class));
                c50.a aVar3 = new c50.a(22);
                StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier2, t0Var.b(gm0.a.class), typeQualifier, aVar3, kind2, j0Var), module));
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(bm0.a.class), null, new c50.a(23), kind2, j0Var), module));
                return Unit.INSTANCE;
            case 8:
                GarminConnectMobileApp.f28686h.error("RxJavaErrorHandler", (Throwable) obj);
                return Unit.INSTANCE;
            case 9:
                ((com.garmin.android.apps.connectmobile.connectiq.y.a) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                Parcelable.Creator<DeviceSettingsDTO> creator = DeviceSettingsDTO.CREATOR;
                zb0.a.f203414e.getClass();
                return zb0.a.C3799a.a((String) obj);
            case 11:
                ge1.c cVar = (ge1.c) obj;
                int i14 = com.garmin.android.apps.connectmobile.respiration.data.b.f41135b;
                cVar.getClass();
                return cVar.f77005a;
            case 12:
                ge1.c cVar2 = (ge1.c) obj;
                int i15 = com.garmin.android.apps.connectmobile.respiration.data.b.f41135b;
                cVar2.getClass();
                return cVar2.f77005a;
            case 13:
                fu1.u uVar = (fu1.u) obj;
                uVar.getClass();
                return uVar.f73556a.withTimeAtStartOfDay();
            case 14:
                fu1.u uVar2 = (fu1.u) obj;
                uVar2.getClass();
                fu1.q qVar = uVar2.f73557b;
                return Boolean.valueOf((qVar != null ? qVar.getActivityId() : null) == null);
            case 15:
                tt2.a aVar4 = (tt2.a) obj;
                aVar4.getClass();
                return aVar4.toString();
            case 16:
                n63.e eVar = (n63.e) obj;
                eVar.getClass();
                eVar.f123904c = true;
                eVar.f123902a = true;
                return Unit.INSTANCE;
            case 17:
                n63.e eVar2 = (n63.e) obj;
                eVar2.getClass();
                eVar2.f123904c = true;
                eVar2.f123902a = true;
                return Unit.INSTANCE;
            case 18:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
            case 19:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$26$lambda$25((Cluster) obj));
            case 20:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$28$lambda$27((ClusterItem) obj));
            case 21:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$17$lambda$16((Cluster) obj));
            case 22:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$19$lambda$18((ClusterItem) obj));
            case 23:
                return ClusteringKt.Clustering$lambda$21$lambda$20((ClusterItem) obj);
            case 24:
                return ClusteringKt.Clustering$lambda$23$lambda$22((ClusterItem) obj);
            case 25:
                return ClusteringKt.Clustering$lambda$30$lambda$29((ClusterItem) obj);
            case 26:
                return ClusteringKt.Clustering$lambda$32$lambda$31((ClusterItem) obj);
            case 27:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$1$lambda$0((Cluster) obj));
            case 28:
                return Boolean.valueOf(ClusteringKt.Clustering$lambda$3$lambda$2((ClusterItem) obj));
            default:
                return ClusteringKt.Clustering$lambda$5$lambda$4((ClusterItem) obj);
        }
    }

    public /* synthetic */ f(int i14) {
        this.f27338a = i14;
    }
}
