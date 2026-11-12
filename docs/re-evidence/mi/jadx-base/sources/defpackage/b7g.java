package defpackage;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class b7g {
    public static String a(int i, Map<String, PluginDeviceInfo> map) {
        if (i <= 0) {
            return "";
        }
        try {
            Iterator<Map.Entry<String, PluginDeviceInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                PluginDeviceInfo value = it.next().getValue();
                if (value.q() == i) {
                    return value.l();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str, Map<String, PluginDeviceInfo> map) {
        for (Map.Entry<String, PluginDeviceInfo> entry : map.entrySet()) {
            String strM = entry.getValue().m();
            if (!TextUtils.isEmpty(strM) && Pattern.compile(strM).matcher(str).matches()) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static int c(String str, Map<String, PluginDeviceInfo> map) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Iterator<Map.Entry<String, PluginDeviceInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                PluginDeviceInfo value = it.next().getValue();
                if (value.l().equalsIgnoreCase(str)) {
                    return value.q();
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void d(wb6 wb6Var, int i, PluginDeviceInfo pluginDeviceInfo) {
        if ((i & 1) == 1) {
            pluginDeviceInfo.l0(wb6Var.f37796a);
            pluginDeviceInfo.w0(wb6Var.f37797b);
            pluginDeviceInfo.k0(wb6Var.c);
            pluginDeviceInfo.Y(wb6Var.e);
            pluginDeviceInfo.W(wb6Var.f);
            pluginDeviceInfo.X(wb6Var.g);
            pluginDeviceInfo.a0(wb6Var.i);
            pluginDeviceInfo.u0(wb6Var.m);
            wb6.a aVar = wb6Var.f37798k;
            if (aVar != null) {
                pluginDeviceInfo.o0(aVar.f37800a);
            }
            pluginDeviceInfo.C0(wb6Var.n);
            pluginDeviceInfo.z(wb6Var.q);
            pluginDeviceInfo.q0(wb6Var.f37799r);
            pluginDeviceInfo.F0(wb6Var.s);
            pluginDeviceInfo.B(wb6Var.u);
            pluginDeviceInfo.C(wb6Var.v);
            pluginDeviceInfo.y0(wb6Var.w);
            pluginDeviceInfo.G0(wb6Var.x);
            pluginDeviceInfo.E0(wb6Var.z);
            pluginDeviceInfo.A0(wb6Var.J);
            pluginDeviceInfo.z0(wb6Var.K);
            pluginDeviceInfo.B0(wb6Var.L);
            pluginDeviceInfo.E(wb6Var.A);
            pluginDeviceInfo.A(wb6Var.B);
            pluginDeviceInfo.I0(wb6Var.M);
            pluginDeviceInfo.D0(wb6Var.N != 0);
            pluginDeviceInfo.L0(wb6Var.D);
            pluginDeviceInfo.x0(wb6Var.O);
            pluginDeviceInfo.K0(wb6Var.P);
            pluginDeviceInfo.J0(wb6Var.Q);
            pluginDeviceInfo.j0(wb6Var.R);
            pluginDeviceInfo.h0(wb6Var.S);
            pluginDeviceInfo.R(wb6Var.T);
            pluginDeviceInfo.H0(wb6Var.E);
            pluginDeviceInfo.L(wb6Var.F);
            pluginDeviceInfo.F(wb6Var.H);
            pluginDeviceInfo.v0(wb6Var.V);
            pluginDeviceInfo.P(wb6Var.G);
            pluginDeviceInfo.H(wb6Var.W);
            pluginDeviceInfo.v(wb6Var.I);
            pluginDeviceInfo.e0(wb6Var.X);
        }
        if ((i & 2) == 2) {
            pluginDeviceInfo.p0(wb6Var.d);
            pluginDeviceInfo.I(wb6Var.l);
            pluginDeviceInfo.G(wb6Var.p);
            pluginDeviceInfo.V(wb6Var.h);
        }
    }
}
