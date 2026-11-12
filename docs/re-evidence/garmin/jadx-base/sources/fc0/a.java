package fc0;

import bz.b;
import bz.c;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.android.gms.stats.CodePackage;
import d53.w;
import l73.k;
import org.greenrobot.eventbus.ThreadMode;
import p005kotlin.Metadata;
import p1.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfc0/a;", "Lbz/c;", "<init>", "()V", "Lbz/b;", "changeEvent", "", "deviceCapabilitiesChanged", "(Lbz/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70392a = "GCMDeviceCapabilityUpdateListener";

    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.USER;
        aVar.getClass();
        i2.a.b(a2Var, this.f70392a, "Adding golf user role");
        if (!GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_was_device_golf_download_capability_connected), false)) {
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_was_device_golf_download_capability_connected, GCMSettingManager.f41536b.edit(), true);
        }
        GCMSettingManager.b("ROLE_OUTDOOR_USER");
    }

    @Override // bz.c
    @k(threadMode = ThreadMode.ASYNC)
    public void deviceCapabilitiesChanged(b changeEvent) {
        changeEvent.getClass();
        String str = changeEvent.f22261a;
        String str2 = this.f70392a;
        if (str != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.USER;
            String strConcat = "deviceCapabilitiesChanged: Received capability string: ".concat(str);
            aVar.getClass();
            i2.a.b(a2Var, str2, strConcat);
            if (w.z(str, "WELLNESS", false)) {
                aVar.getClass();
                i2.a.b(a2Var, str2, "Adding wellness user role");
                GCMSettingManager.b("ROLE_WELLNESS_USER");
            }
            if (w.z(str, CodePackage.FITNESS, false)) {
                aVar.getClass();
                i2.a.b(a2Var, str2, "Adding fitness user role");
                GCMSettingManager.b("ROLE_FITNESS_USER");
            }
            if (w.z(str, "GOLF", false)) {
                a();
            }
            if (w.z(str, "DIVE", false)) {
                aVar.getClass();
                i2.a.b(a2Var, str2, "Adding dive user role");
                GCMSettingManager.b("ROLE_DIVE_USER");
                return;
            }
            return;
        }
        z<String> zVar = td2.a.f163901a;
        if (td2.a.d(td2.a.EnumC3084a.WELLNESS.toString())) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.USER;
            aVar2.getClass();
            i2.a.b(a2Var2, str2, "Adding wellness user role");
            GCMSettingManager.b("ROLE_WELLNESS_USER");
            return;
        }
        if (td2.a.d(td2.a.EnumC3084a.FITNESS.toString())) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.USER;
            aVar3.getClass();
            i2.a.b(a2Var3, str2, "Adding fitness user role");
            GCMSettingManager.b("ROLE_FITNESS_USER");
            return;
        }
        if (td2.a.d(td2.a.EnumC3084a.GOLF.toString())) {
            a();
            return;
        }
        if (td2.a.d(td2.a.EnumC3084a.DIVE.toString())) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.USER;
            aVar4.getClass();
            i2.a.b(a2Var4, str2, "Adding dive user role");
            GCMSettingManager.b("ROLE_DIVE_USER");
        }
    }
}
