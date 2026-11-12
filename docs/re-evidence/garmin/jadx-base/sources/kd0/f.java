package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.TroubleConnectingActivity;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/f;", "Lws/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements ws.a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.a
    public final Serializable a(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f103986c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f103986c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objM = bVar.f103984a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f103986c;
        if (i15 == 0) {
            o13.r.b(objM);
            l52.y yVar = (l52.y) KoinJavaComponent.get$default(l52.y.class, null, null, 6, null);
            bVar.f103986c = 1;
            objM = yVar.m(bVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        Iterable<String> iterable = (Iterable) objM;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        for (String str : iterable) {
            zf2.d.f204601l.getClass();
            arrayList.add(zf2.d.a.b(str));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.a
    public final Object b(long j8, List list, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f104038c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f104038c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f104036a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f104038c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                int i16 = o13.q.f128596b;
                Object objB = zb0.k.b(LimitedUiProtobufDataHandler.class, j8);
                if (objB == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.f104038c = 1;
                if (((LimitedUiProtobufDataHandler) objB).sendFavoriteSportsNotification(list, eVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i17 = o13.q.f128596b;
            return unit;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            return new o13.q.b(th3);
        }
    }

    @Override // ws.a
    public final void c(Context context) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.a
    public final Object d(v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f104007c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f104007c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objI = cVar2.f104005a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f104007c;
        if (i15 == 0) {
            o13.r.b(objI);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            cVar2.f104007c = 1;
            objI = j1Var.i(cVar2);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return Boolean.valueOf(objI instanceof c80.s.a);
    }

    @Override // ws.a
    public final void e() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.HAS_ENTERED_RECORD_ACTIVITIES);
    }

    @Override // ws.a
    public final String f() {
        return GCMSettingManager.k().b();
    }

    @Override // ws.a
    public final Intent g(Context context) {
        return sn.a.d(context, context, TroubleConnectingActivity.class);
    }

    @Override // ws.a
    public final void h(Context context, sd2.f fVar) {
        context.getClass();
        fVar.getClass();
        if (km2.a.i(fVar.getUnitID(), null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            RTSSettingsLauncherActivity.f34352a.getClass();
            context.startActivity(RTSSettingsLauncherActivity.a.a(context, fVar, GDIRealtimeSettingsProto.WellKnownCompositionId.ACTIVITY_OPTIONS_VALUE, true, null, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ws.a
    public final Object i(long j8, v13.c cVar) {
        a aVar;
        List<String> listD;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f103960c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f103960c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f103958a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f103960c;
        Object obj = null;
        if (i15 == 0) {
            o13.r.b(objJ);
            kv.b.f106596b.getClass();
            kv.b bVar = new kv.b((kv.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, kv.a.class, new c83.h.a[0], null, null, null, 120));
            aVar.f103960c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv.c(bVar, j8, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            int i16 = o13.q.f128596b;
            return o13.r.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        int i17 = o13.q.f128596b;
        for (Object obj2 : ((iv.a) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).b()) {
            if (p005kotlin.jvm.internal.s.g(((iv.b) obj2).getSettingId(), "DeviceSettingId.FAVORITE_ACTIVITY_SPORTS_SUBSPORTS")) {
                obj = obj2;
                break;
            }
        }
        iv.b bVar2 = (iv.b) obj;
        return (bVar2 == null || (listD = bVar2.d()) == null) ? p13.j0.f134944a : listD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ws.a
    public final Object j(String str, long j8, List list, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f104027c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f104027c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f104025a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f104027c;
        if (i15 == 0) {
            o13.r.b(objJ);
            kv.b.f106596b.getClass();
            kv.b bVar = new kv.b((kv.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, kv.a.class, new c83.h.a[0], null, null, null, 120));
            iv.b.f95061d.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zf2.d dVar2 = (zf2.d) it.next();
                cl1.b.a aVar2 = cl1.b.f27937b;
                int i16 = dVar2.f204633e;
                int i17 = dVar2.f204634f;
                aVar2.getClass();
                arrayList.add(cl1.b.a.a(i16, i17));
            }
            iv.a aVar3 = new iv.a(str, p13.w.c(new iv.b(null, null, arrayList, 3, null)), j8);
            dVar.f104027c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv.d(bVar, aVar3, null), dVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            int i18 = o13.q.f128596b;
            return o13.r.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a);
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            int i19 = o13.q.f128596b;
            return Unit.INSTANCE;
        }
        lc.u0.r();
        return null;
    }
}
