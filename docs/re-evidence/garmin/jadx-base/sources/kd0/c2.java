package kd0;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import java.sql.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/c2;", "Ljf0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c2 implements jf0.a {
    @Override // jf0.a
    public final String a(long j8) {
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            return fVarI.d0();
        }
        return null;
    }

    @Override // jf0.a
    public final hf0.b c() {
        return new hf0.b();
    }

    @Override // jf0.a
    public final void d(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ECG_APP_ENABLED);
    }

    @Override // jf0.a
    public final void e(String str) {
        Intent intent;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        if (str != null) {
            EcgDetailActivity.f34869p.getClass();
            intent = EcgDetailActivity.a.a(contextC, str);
        } else {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            intent = new Intent(contextC, (Class<?>) DashboardActivity.class);
        }
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(contextC, 0, intent, 201326592);
        String string = contextC.getString(R.string.launcher_name_garmin_connect);
        String strD = p6.b.d(contextC, R.string.lbl_ecg_recording_ready_to_view, string);
        sz0.e eVar = sz0.e.f161383x;
        z6.q qVar = new z6.q(contextC, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(contextC.getString(R.string.app_name_garmin_connect));
        z6.o oVar = new z6.o();
        oVar.f202742b = z6.q.e(string);
        oVar.f202664e = z6.q.e(strD);
        qVar.l(oVar);
        qVar.i(16, true);
        qVar.f202686h = activity;
        sz0.f.a aVar = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar.getClass();
        sz0.f.a.f(contextC, notificationC, 34, eVar);
    }

    @Override // jf0.a
    public final void f(EcgDetailActivity ecgDetailActivity, gf0.a aVar) throws PackageManager.NameNotFoundException {
        String str;
        com.garmin.android.apps.connectmobile.devices.model.l device;
        com.garmin.android.apps.connectmobile.devices.model.l device2;
        aVar.getClass();
        new pa2.b();
        bz0.o.f22274a.getClass();
        OkHttpClient okHttpClientF = bz0.o.f();
        String string = ecgDetailActivity.getString(R.string.lbl_ecg_recording);
        string.getClass();
        String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GARMIN_HEALTH_SERVICES);
        String strD = d53.u.q(Locale.getDefault().getLanguage(), Locale.SIMPLIFIED_CHINESE.getLanguage(), true) ? hb2.h.d(Locale.getDefault()) : Locale.getDefault().getLanguage();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        LocalDate localDateL1 = lVar.l1();
        String string2 = localDateL1 != null ? localDateL1.toString("yyyy-MM-dd") : null;
        Date date = new Date(DateTime.now().getMillis());
        String string3 = new DateTime(date.getTime()).toString("yyyy-MM-dd");
        String strW = lVar.w();
        String str2 = strW.length() == 0 ? null : strW;
        String strA = wc2.c.a(ecgDetailActivity);
        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        gf0.c deviceInfo = aVar.getDeviceInfo();
        if (deviceInfo == null || (device2 = deviceInfo.getDevice()) == null || (productDisplayName = device2.getDeviceName()) == null) {
            gf0.c deviceInfo2 = aVar.getDeviceInfo();
            if (deviceInfo2 == null || (device = deviceInfo2.getDevice()) == null) {
                gf0.c deviceInfo3 = aVar.getDeviceInfo();
                String productName = deviceInfo3 != null ? deviceInfo3.getProductName() : null;
                str = productName == null ? "" : productName;
            } else {
                String productDisplayName = device.getProductDisplayName();
                str = productDisplayName;
            }
        } else {
            str = productDisplayName;
        }
        pa2.b.a(ecgDetailActivity, new pa2.a(string, "ecg", strK, okHttpClientF, 0, false, aVar.getDetailId(), date, date, d53.u.v("Garmin_".concat(string), StringUtils.SPACE, "", false), new gf0.e(strA, string2, strD, userFullName, null, null, str2, str, string3, 48, null), ecgDetailActivity.getString(R.string.lbl_export_as_pdf, ecgDetailActivity.getString(R.string.lbl_ecg)), 48, null));
    }

    @Override // jf0.a
    public final Object g(String str, boolean z14, boolean z15, v13.i iVar) {
        return cr1.f.a.a(cr1.f.f55362d).d(str, z14, z15, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jf0.a
    public final Object h(long j8, long j14, v13.c cVar) {
        b2 b2Var;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f103995c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f103995c = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(this, cVar);
            }
        } else {
            b2Var = new b2(this, cVar);
        }
        b2 b2Var2 = b2Var;
        Object obj = b2Var2.f103993a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var2.f103995c;
        if (i15 == 0) {
            o13.r.b(obj);
            i31.e0 e0Var = (i31.e0) KoinJavaComponent.get$default(i31.e0.class, null, null, 6, null);
            d31.d dVar = d31.d.ECG;
            d31.c cVar2 = d31.c.COMPLETED;
            b2Var2.f103995c = 1;
            if (e0Var.a(j14, dVar, cVar2, b2Var2) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ((o13.q) obj).getClass();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jf0.a
    public final Object i(long j8, v13.c cVar) {
        z1 z1Var;
        Object objA;
        List list;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f104471d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f104471d = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        Object obj = z1Var.f104469b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var.f104471d;
        Object obj2 = null;
        if (i15 == 0) {
            o13.r.b(obj);
            i31.c cVar2 = (i31.c) KoinJavaComponent.get$default(i31.c.class, null, null, 6, null);
            Set setB = p13.a1.b(new Long(j8));
            z1Var.f104468a = j8;
            z1Var.f104471d = 1;
            objA = cVar2.a("EcgDelegate", setB, z1Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = z1Var.f104468a;
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
        }
        int i16 = o13.q.f128596b;
        boolean z14 = objA instanceof o13.q.b;
        if (z14) {
            return Boolean.FALSE;
        }
        if (z14) {
            objA = null;
        }
        Map map = (Map) objA;
        if (map == null || (list = (List) map.get(new Long(j8))) == null) {
            return Boolean.FALSE;
        }
        for (Object obj3 : list) {
            if (((d31.a) obj3).f57326f == d31.d.ECG) {
                obj2 = obj3;
                break;
            }
        }
        d31.a aVar2 = (d31.a) obj2;
        if (aVar2 == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(aVar2.f57328h != d31.c.NOT_STARTED);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jf0.a
    public final Object k(long j8, long j14, v13.c cVar) {
        a2 a2Var;
        long j15;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i14 = a2Var.f103970d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a2Var.f103970d = i14 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, cVar);
            }
        } else {
            a2Var = new a2(this, cVar);
        }
        a2 a2Var2 = a2Var;
        Object obj = a2Var2.f103968b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a2Var2.f103970d;
        if (i15 == 0) {
            o13.r.b(obj);
            i31.e0 e0Var = (i31.e0) KoinJavaComponent.get$default(i31.e0.class, null, null, 6, null);
            d31.d dVar = d31.d.ECG;
            d31.c cVar2 = d31.c.NOT_STARTED;
            a2Var2.f103967a = j14;
            a2Var2.f103970d = 1;
            if (e0Var.a(j14, dVar, cVar2, a2Var2) == aVar) {
                return aVar;
            }
            j15 = j14;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j15 = a2Var2.f103967a;
            o13.r.b(obj);
            ((o13.q) obj).getClass();
        }
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).l(j15, e31.a.ECG_APP_ENABLED);
        return Unit.INSTANCE;
    }

    @Override // jf0.a
    public final boolean l() {
        Object systemService = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getSystemService("bluetooth");
        systemService.getClass();
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        if (adapter != null) {
            return adapter.isEnabled();
        }
        return false;
    }
}
