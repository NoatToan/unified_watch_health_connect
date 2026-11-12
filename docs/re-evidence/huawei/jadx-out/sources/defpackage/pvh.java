package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.esim.view.EsimCardStatusGetActivity;
import com.huawei.sim.esim.view.EsimManagerActivity;
import com.huawei.sim.esim.view.WirelessManagerActivity;

/* JADX INFO: loaded from: classes15.dex */
public class pvh extends pbx {
    private static pvh d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45900a = false;

    private pvh() {
    }

    public static pvh b(Context context) {
        pvh pvhVar;
        synchronized (pvh.class) {
            if (d == null) {
                d = new pvh();
            }
            pvhVar = d;
        }
        return pvhVar;
    }

    public void a(Context context) {
        try {
            context.startActivity(new Intent(context, (Class<?>) WirelessManagerActivity.class));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginSim", "openWirelessActivity ActivityNotFoundException");
        }
    }

    public void d(Context context) {
        if (context instanceof Activity) {
            try {
                context.startActivity(new Intent(context, (Class<?>) EsimManagerActivity.class));
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("PluginSim", "openEsimManagerActivity ActivityNotFoundException");
                return;
            }
        }
        LogUtil.j("PluginSim", "context is not instanceof Activity");
    }

    public void c(Context context) {
        if (context instanceof Activity) {
            try {
                context.startActivity(new Intent(context, (Class<?>) EsimCardStatusGetActivity.class));
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("PluginSim", "openEsimCardStatusGetActivity ActivityNotFoundException");
                return;
            }
        }
        LogUtil.j("PluginSim", "openEsimCardStatusGetActivity context is not instanceof Activity");
    }

    public void b(boolean z) {
        this.f45900a = z;
    }

    public boolean e() {
        return this.f45900a;
    }
}
