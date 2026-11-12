package d4;

import c53.c0;
import c53.q;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import de2.z;
import dg.p;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import m63.b0;
import m63.f1;
import m63.y1;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.p0;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57448a;

    public /* synthetic */ h(int i14) {
        this.f57448a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f57448a) {
            case 0:
                y3 y3Var = i.f57449a;
                return null;
            case 1:
                return new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null);
            case 2:
                return new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null);
            case 3:
                return p0.n(Boolean.TRUE);
            case 4:
                d60.b.a aVar = d60.b.f57806c;
                return (d60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, d60.a.class, new c83.h.a[0], null, null, null, 120);
            case 5:
                return 2;
            case 6:
                d90.b.C1245b c1245b = d90.b.Companion;
                return d90.c.Companion.serializer();
            case 7:
                d90.c.a aVar2 = d90.c.Companion;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType", t0Var.b(d90.c.class), new k23.d[]{t0Var.b(d90.c.b.class), t0Var.b(d90.c.C1246c.class), t0Var.b(d90.c.d.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType.CustomVivofit3", d90.c.b.INSTANCE, new Annotation[0]), d90.c.C1246c.a.f58432a, new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType.DeviceServerImage", d90.c.d.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 8:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType.CustomVivofit3", d90.c.b.INSTANCE, new Annotation[0]);
            case 9:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType.DeviceServerImage", d90.c.d.INSTANCE, new Annotation[0]);
            case 10:
                d90.d.Companion companion = d90.d.INSTANCE;
                u90.a[] aVarArrValues = u90.a.values();
                aVarArrValues.getClass();
                return new m63.e(new b0("com.garmin.android.apps.connectmobile.device.setup.domain.profile.model.UserProfileWizardStep", aVarArrValues));
            case 11:
                d90.d.Companion companion2 = d90.d.INSTANCE;
                j90.e[] eVarArrValues = j90.e.values();
                eVarArrValues.getClass();
                return new m63.e(new b0("com.garmin.android.apps.connectmobile.device.setup.domain.customization.model.DeviceCustomizationWizardStep", eVarArrValues));
            case 12:
                d90.d.Companion companion3 = d90.d.INSTANCE;
                return d90.f.Companion.serializer();
            case 13:
                d90.d.Companion companion4 = d90.d.INSTANCE;
                r90.a[] aVarArrValues2 = r90.a.values();
                aVarArrValues2.getClass();
                return new m63.e(new b0("com.garmin.android.apps.connectmobile.device.setup.domain.permissions.DeviceSetupPermission", aVarArrValues2));
            case 14:
                d90.d.Companion companion5 = d90.d.INSTANCE;
                return d90.g.INSTANCE.serializer();
            case 15:
                d90.d.Companion companion6 = d90.d.INSTANCE;
                return new m63.e(n90.b.INSTANCE.serializer());
            case 16:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupSyncConfig.Default", d90.f.b.INSTANCE, new Annotation[0]);
            case 17:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupSyncConfig.NoSync", d90.f.c.INSTANCE, new Annotation[0]);
            case 18:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupSyncConfig.OrcaDevice", d90.f.d.INSTANCE, new Annotation[0]);
            case 19:
                return new f1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupSyncConfig.Sync2FirmwareUpdate", d90.f.C1248f.INSTANCE, new Annotation[0]);
            case 20:
                d90.g[] gVarArrValues = d90.g.values();
                gVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupWifiConfig", gVarArrValues);
            case 21:
                d90.h.Companion companion7 = d90.h.INSTANCE;
                d90.j[] jVarArrValues = d90.j.values();
                jVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.TutorialType", jVarArrValues);
            case 22:
                d90.i.Companion companion8 = d90.i.INSTANCE;
                d90.j[] jVarArrValues2 = d90.j.values();
                jVarArrValues2.getClass();
                return new b0("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.TutorialType", jVarArrValues2);
            case 23:
                return j92.a.b();
            case 24:
                y3 y3Var2 = d92.c.f58627a;
                return Boolean.FALSE;
            case 25:
                int i14 = BLEScanningWizardActivity.f34476l;
                return null;
            case 26:
                int i15 = de2.a.f59227j;
                return new z();
            case 27:
                p pVar = p.f59494a;
                try {
                    return dg.b.a(c0.s(q.b(Arrays.asList(new vf.d()).iterator())));
                } catch (Throwable th3) {
                    throw new ServiceConfigurationError(th3.getMessage(), th3);
                }
            case 28:
                p pVar2 = p.f59494a;
                try {
                    return dg.b.a(c0.s(q.b(Arrays.asList(new zf.c()).iterator())));
                } catch (Throwable th4) {
                    throw new ServiceConfigurationError(th4.getMessage(), th4);
                }
            default:
                dh0.e.b bVar = dh0.e.Companion;
                return new m63.e(y1.f117048a);
        }
    }
}
