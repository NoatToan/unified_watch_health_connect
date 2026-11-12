package defpackage;

import android.app.Application;
import android.content.Intent;
import com.miot.rn.plugin.activity.PluginRNActivity;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.log.MiJiaLogAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class n1i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile n1i f27437b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<cej> f27438a;

    public class a implements MiJiaLogAdapter {
        public a() {
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public void flushLog() {
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public boolean isDebugBuildType() {
            return mvk.e().a().isDebugBuildType();
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public boolean isDevChannel() {
            return true;
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public boolean isGreyDeveloperOpen() {
            return false;
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public boolean isGreyPublish() {
            return false;
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public boolean isSdkBuildType() {
            return false;
        }

        @Override // com.xiaomi.smarthome.library.log.MiJiaLogAdapter
        public void writeLog(int i, String str, String str2, String str3) {
            mvk.e().a().writeLog(i, str, str2, str3);
        }
    }

    public static n1i b() {
        if (f27437b == null) {
            synchronized (n1i.class) {
                try {
                    if (f27437b == null) {
                        f27437b = new n1i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27437b;
    }

    public List<cej> a() {
        return this.f27438a;
    }

    public void c(Application application, wuk.b bVar) {
        xuk.a("RnPluginManager init");
        g5l g5lVar = new g5l();
        mvk.e().i(application, bVar.l(g5lVar).h(new e64()).n());
        f();
    }

    public void d(Device device) {
        e(device, null);
    }

    public void e(Device device, Intent intent) {
        if (device == null) {
            xuk.c("openPlugin device is null");
            return;
        }
        xuk.c("openPlugin deviceInfo model=" + device.model + ",did=" + device.did);
        DeviceStat deviceStatA = r1i.a(device);
        Intent intent2 = new Intent(MiJiaEnvironment.getAppContext(), (Class<?>) PluginRNActivity.class);
        intent2.addFlags(268435456);
        intent2.putExtra("deviceStat", deviceStatA);
        intent2.putExtra("deviceName", deviceStatA.name);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        MiJiaEnvironment.getAppContext().startActivity(intent2);
    }

    public final void f() {
        MiJiaLog.setAdapter(new a());
    }

    public void g(boolean z, String str, String str2, String str3) {
        rr5.d(z);
        rr5.b(str);
        rr5.c(str3, str2);
    }

    public void h(List<cej> list) {
        this.f27438a = list;
    }
}
