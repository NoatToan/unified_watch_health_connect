package vg1;

import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f178119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f178120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f178121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f178122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f178123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zb0.u0 f178124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f178125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f178126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f178127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f178128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yr1.f f178129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f178130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f178131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f178132n;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<dc0.a> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            k0 k0Var = k0.this;
            k0Var.f178119a.G0();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                k0Var.f178119a.q2(cVar);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, dc0.a aVar) {
            k0 k0Var = k0.this;
            yr1.f fVar = k0Var.f178129k;
            if (fVar != null) {
                fVar.K7(k0Var.f178120b);
            }
            k0Var.f178119a.L2();
        }
    }

    public k0(i0 i0Var, yr1.f fVar, int i14, List<a0> list) {
        this.f178124f = null;
        this.f178127i = 32;
        this.f178128j = 32;
        this.f178131m = new ArrayList();
        this.f178119a = i0Var;
        this.f178127i = i14;
        this.f178129k = fVar;
        for (a0 a0Var : list) {
            if (a0Var instanceof b0) {
                int i15 = this.f178127i;
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i15, 2)) {
                    this.f178131m.add(a0Var);
                }
            }
            if (a0Var instanceof e1) {
                int i16 = this.f178127i;
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i16, 4)) {
                    this.f178131m.add(a0Var);
                }
            }
            if (a0Var instanceof i) {
                int i17 = this.f178127i;
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i17, 8)) {
                    this.f178131m.add(a0Var);
                }
            }
            if (a0Var instanceof s0) {
                int i18 = this.f178127i;
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i18, 16)) {
                    this.f178131m.add(a0Var);
                }
            }
            if (a0Var instanceof q0) {
                int i19 = this.f178127i;
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i19, 32)) {
                    this.f178131m.add(a0Var);
                }
            }
        }
    }

    public static Object p(ArrayList arrayList, Class cls) {
        Object next;
        if (arrayList == null) {
            next = null;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object objD = ((a0) next).getF178111a();
            if (objD != null && objD.getClass() == cls) {
                break;
            }
        }
        a0 a0Var = (a0) next;
        if (a0Var != null) {
            return a0Var.getF178111a();
        }
        return null;
    }

    @Override // vg1.h0
    public final void a() {
        e22.a.a(this.f178131m, new tr2.b(this, 28));
    }

    @Override // vg1.h0
    public final void b(Bundle bundle) {
        i0 i0Var = this.f178119a;
        if (bundle == null) {
            i0Var.g0();
            i2.f(a2.SETTINGS, "DynamicSettingsPresenter", "Invalid extras");
            return;
        }
        long j8 = bundle.getLong("GCM_deviceUnitID", -1L);
        this.f178120b = j8;
        if (j8 <= 0) {
            i0Var.g0();
            i2.f(a2.SETTINGS, "DynamicSettingsPresenter", "Invalid device unit ID while entering device settings!");
            return;
        }
        String string = bundle.getString("GCM_deviceProductNbr");
        this.f178123e = string;
        if (string == null) {
            i2.f(a2.SETTINGS, "DynamicSettingsPresenter", "Invalid device product number while entering device settings!");
            i0Var.g0();
            return;
        }
        this.f178121c = bundle.getString("GCM_deviceName");
        this.f178122d = bundle.getString("GCM_macAddress");
        this.f178124f = (zb0.u0) zb0.u0.f203782n6.get(this.f178123e);
        ArrayList arrayList = this.f178131m;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).b(bundle);
            }
        }
    }

    @Override // vg1.h0
    public final Bundle c() {
        if (!m()) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList<a0> arrayList = this.f178131m;
        if (arrayList != null) {
            for (a0 a0Var : arrayList) {
                int i14 = this.f178128j;
                int iG = a0Var.g();
                dc0.a.f59105c.getClass();
                if (dc0.a.C1256a.a(i14, iG)) {
                    a0Var.h(bundle);
                }
            }
        }
        return bundle;
    }

    @Override // vg1.h0
    public final boolean d() {
        return com.garmin.android.library.backgroundtaskmanagement.c.f50123c.e(Long.valueOf(this.f178130l));
    }

    @Override // vg1.h0
    public final DeviceSettingsDTO e() {
        return (DeviceSettingsDTO) p(this.f178131m, DeviceSettingsDTO.class);
    }

    @Override // vg1.h0
    public final boolean f() {
        r0 r0Var = new r0();
        ArrayList<a0> arrayList = this.f178131m;
        if (arrayList != null) {
            for (a0 a0Var : arrayList) {
                if (a0Var.e()) {
                    int i14 = this.f178128j;
                    int iG = a0Var.g();
                    dc0.a.f59105c.getClass();
                    if (!dc0.a.C1256a.a(i14, iG)) {
                        a0Var.f(r0Var);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(r0Var.f178151a) && r0Var.f178152b == null && r0Var.f178153c == null && !r0Var.f178154d) {
            return false;
        }
        this.f178119a.d9();
        this.f178126h = new a();
        this.f178130l = ((zb0.e) KoinJavaComponent.get(zb0.e.class)).D(this.f178120b, r0Var, this.f178126h);
        return true;
    }

    @Override // vg1.h0
    public final UserSettingsDTO g() {
        return (UserSettingsDTO) p(this.f178131m, UserSettingsDTO.class);
    }

    @Override // vg1.h0
    public final String getDeviceName() {
        return this.f178121c;
    }

    @Override // vg1.h0
    public final long getDeviceUnitId() {
        return this.f178120b;
    }

    @Override // vg1.h0
    public final String getMacAddress() {
        return this.f178122d;
    }

    @Override // vg1.h0
    public final uv.i getSensorSettings() {
        return (uv.i) p(this.f178131m, uv.i.class);
    }

    @Override // vg1.h0
    public final int h() {
        return this.f178127i;
    }

    @Override // vg1.h0
    public final boolean hasModel() {
        ArrayList arrayList = this.f178131m;
        Object obj = null;
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                if (!((a0) obj2).hasModel()) {
                    obj = obj2;
                    break;
                }
            }
        }
        return ((a0) obj) == null;
    }

    @Override // vg1.h0
    public final String i() {
        return this.f178123e;
    }

    @Override // vg1.h0
    public final void j(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO != null) {
            ArrayList arrayList = this.f178131m;
            Object obj = null;
            if (arrayList != null) {
                for (Object obj2 : arrayList) {
                    Object objD = ((a0) obj2).getF178111a();
                    if (objD != null && objD.getClass() == DeviceSettingsDTO.class) {
                        obj = obj2;
                        break;
                    }
                }
            }
            a0 a0Var = (a0) obj;
            if (a0Var != null) {
                a0Var.i(deviceSettingsDTO);
            }
            this.f178119a.o2(0);
        }
    }

    @Override // vg1.h0
    public final void k(tr2.b bVar) {
        this.f178125g = new j0(this, bVar);
        this.f178132n = ((zb0.e) KoinJavaComponent.get(zb0.e.class)).z(this.f178127i, this.f178120b, this.f178125g);
    }

    @Override // vg1.h0
    public final void l() {
        this.f178119a.o2(4);
    }

    @Override // vg1.h0
    public final boolean m() {
        int i14 = this.f178128j;
        dc0.a.f59105c.getClass();
        return !dc0.a.C1256a.a(i14, 32);
    }

    @Override // vg1.h0
    public final com.garmin.android.apps.connectmobile.devices.model.f n() {
        return (com.garmin.android.apps.connectmobile.devices.model.f) p(this.f178131m, com.garmin.android.apps.connectmobile.devices.model.f.class);
    }

    @Override // vg1.h0
    public final zb0.u0 o() {
        return this.f178124f;
    }

    @Override // vg1.h0
    public final void onStop() {
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(this.f178132n);
    }

    public k0(i0 i0Var, yr1.f fVar, int i14) {
        this.f178124f = null;
        this.f178127i = 32;
        this.f178128j = 32;
        ArrayList arrayList = new ArrayList();
        this.f178131m = arrayList;
        this.f178119a = i0Var;
        this.f178127i = i14;
        this.f178129k = fVar;
        dc0.a.C1256a c1256a = dc0.a.f59105c;
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 2)) {
            arrayList.add(new b0());
        }
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 4)) {
            arrayList.add(new e1());
        }
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 8)) {
            arrayList.add(new i());
        }
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 32)) {
            arrayList.add(new q0());
        }
    }
}
