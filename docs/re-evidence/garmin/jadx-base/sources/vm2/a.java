package vm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import d53.u;
import java.util.Set;
import lm2.i;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvm2/a;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f178815a = new a();

    /* JADX INFO: renamed from: vm2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"vm2/a$a", "Llm2/i$b;", "", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3341a implements i.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k7.b<Boolean> f178816a;

        public C3341a(k7.b<Boolean> bVar) {
            this.f178816a = bVar;
        }

        @Override // lm2.i.b
        public final void a(String str) {
            String str2 = str;
            k7.b<Boolean> bVar = this.f178816a;
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        JSONArray jSONArray = new JSONArray(str2);
                        String str3 = Build.MODEL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int length = jSONArray.length();
                        for (int i14 = 0; i14 < length; i14++) {
                            String string = jSONArray.getString(i14);
                            if (string != null && u.y(str3, string, false)) {
                                bVar.accept(Boolean.FALSE);
                                return;
                            }
                        }
                        bVar.accept(Boolean.TRUE);
                        return;
                    }
                } catch (JSONException unused) {
                    bVar.accept(Boolean.TRUE);
                    return;
                }
            }
            bVar.accept(Boolean.TRUE);
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            th3.getClass();
            this.f178816a.accept(Boolean.TRUE);
        }
    }

    private a() {
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(String str) {
        Set<BluetoothDevice> bondedDevices;
        str.getClass();
        if (str.length() <= 0 || (bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices()) == null || bondedDevices.size() <= 0) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            if (bluetoothDevice != null && u.q(bluetoothDevice.getAddress(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public static void b(bm2.a aVar, k7.b bVar, boolean z14) {
        String str;
        jm2.c cVar;
        aVar.getClass();
        String str2 = aVar.f18886a;
        String str3 = aVar.f18888c;
        String str4 = Build.MANUFACTURER;
        String strG = str4 == null ? null : sn.a.g(str4);
        if (("3851".equals(str3) || "4017".equals(str3) || "4125".equals(str3) || "1693".equals(str3)) && Build.VERSION.SDK_INT >= 31) {
            bVar.accept(Boolean.FALSE);
            return;
        }
        lm2.g gVarC = lm2.h.c();
        str2.getClass();
        fm2.d dVarF = ((fm2.c) gVarC).f(str2);
        if (dVarF != null && z14) {
            bVar.accept(Boolean.valueOf(!dVarF.a()));
            return;
        }
        if (aVar.b() || a(str2)) {
            int i14 = Build.VERSION.SDK_INT;
            lm2.h.d();
            kg1.a.f104701a.getClass();
            if (i14 >= kg1.a.C2003a.a().E() && !"VIVO".equals(strG)) {
                "HUAWEI".equals(strG);
                i iVarF = lm2.h.f();
                C3341a c3341a = new C3341a(bVar);
                im2.c.InterfaceC1797c interfaceC1797c = ((im2.c) iVarF).f94217a;
                zi2.a aVarA = interfaceC1797c != null ? interfaceC1797c.a() : null;
                int i15 = aVarA == null ? -1 : im2.c.d.f94224a[aVarA.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                    str.getClass();
                } else {
                    str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                    str.getClass();
                }
                if (interfaceC1797c == null || (cVar = (jm2.c) interfaceC1797c.b(str).b(jm2.c.class)) == null) {
                    vb.h.s("networkServiceFactory is null and getGcService isn't overridden");
                    return;
                } else {
                    cVar.a().q0(new im2.f(c3341a));
                    return;
                }
            }
        }
        bVar.accept(Boolean.FALSE);
    }
}
