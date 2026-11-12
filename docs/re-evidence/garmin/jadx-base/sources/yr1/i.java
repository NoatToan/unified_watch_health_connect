package yr1;

import android.content.Context;
import android.content.Intent;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v1;
import com.garmin.device.datatypes.DeviceProfile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.s0;
import ok2.a0;
import ok2.w;
import ok2.y;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyr1/i;", "Lec2/b;", "Ldc2/a;", "Landroid/content/Context;", "appContext", "Lgc2/a;", "failureNotificationCallback", "Lbc2/a;", "customStrategyDelegate", "<init>", "(Landroid/content/Context;Lgc2/a;Lbc2/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends ec2.b implements dc2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ez.d f199094d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)J"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sync.GCMSyncDataCallback$getDownloadFilesBitmask$1", f = "GCMSyncDataCallback.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f199095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f199095a = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f199095a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Long> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                lm2.h.d();
                if (!GarminDeviceWakefulService.f33825e) {
                    return null;
                }
                rd2.j jVar = rd2.f.a().f152045a;
                long j8 = this.f199095a;
                jVar.getClass();
                if (rd2.j.h(j8) == null) {
                    return new Long((1 << gy2.g.SETTINGS.f80324a) | (1 << gy2.g.SETTINGS_CHANGE.f80324a) | (1 << gy2.g.DEVICE_SETTINGS.f80324a));
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, gc2.a aVar, bc2.a aVar2) {
        super(aVar, aVar2);
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f199094d = new ez.d(new ez.c(), context.getPackageManager());
    }

    @Override // ec2.b, ec2.c
    public final List<gy2.g> a(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        return deviceProfile.getF92744h() == 2368 ? j0.f134944a : super.a(deviceProfile);
    }

    @Override // ec2.b, ec2.c
    public final Long b(long j8) {
        x53.c cVar = s0.f129406a;
        return (Long) ge1.b.W(x53.b.f189152a, new a(j8, null));
    }

    @Override // dc2.a
    public final /* bridge */ void c(Context context) {
        dc2.a.C1258a.a(this, context);
    }

    @Override // ec2.b, ec2.c
    public final boolean d(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        mv.a aVar = mv.a.f121121a;
        String macAddress = deviceProfile.getMacAddress();
        aVar.getClass();
        boolean z14 = macAddress != null && macAddress.equalsIgnoreCase(mv.a.f121122b);
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSyncUploadBlocker", ".shouldBlockDeviceSyncUpload() -> blockDeviceSyncUpload[" + z14 + "] macAddress[" + macAddress + "]");
        if (!z14) {
            return super.d(deviceProfile);
        }
        i2.a.a(a2Var, "Blocking sync upload for device " + deviceProfile);
        return false;
    }

    @Override // dc2.a
    public final void f(Context context, Intent intent) {
        context.getClass();
        v1.f47374a.getClass();
        v1.f(context, intent);
    }

    @Override // ec2.b, ec2.c
    public final boolean g(long j8, String str) {
        w wVarA;
        dd0.i.f59167a.getClass();
        if (str != null && str.equalsIgnoreCase(dd0.i.f59168b)) {
            a2 a2Var = a2.DEVICES;
            String strM = am.j.m(".shouldSkipVivoDeviceSetupSync() -> Sync requested for Vivo device with macAddress[", str, "]) during setup flow");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strM);
            i2.a.a(a2Var, "Ignoring sync triggered during legacy Vivo device setup flow, pairing operations not ready yet");
            return true;
        }
        da2.d dVarB = da2.d.b();
        str.getClass();
        lk2.b bVar = (lk2.b) dVarB.getCapability(str, lk2.b.class);
        if (bVar != null && (wVarA = a0.f132585h.a().a(str)) != null) {
            wVarA.f(new y(), null);
        }
        return bVar != null;
    }

    @Override // dc2.a
    public final boolean h(int i14) {
        ez.d dVar = this.f199094d;
        dVar.getClass();
        try {
            ez.a aVarA = dVar.a(i14);
            String str = aVarA.f67461a;
            if (str.equals(((il2.e) ec2.e.b()).m().getPackageName())) {
                return true;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_512);
                messageDigest.update(str.getBytes());
                messageDigest.update(aVarA.f67462b);
                byte[] bArrDigest = messageDigest.digest();
                Iterator it = dVar.f67465a.a().iterator();
                while (it.hasNext()) {
                    if (Arrays.equals(bArrDigest, (byte[]) it.next())) {
                        return true;
                    }
                }
                return false;
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException("SHA-512 is not found!", e4);
            }
        } catch (RuntimeException e14) {
            i2.n("PackageCertificateManager", "PackageCertificateManager.isTrusted() returns false for a exception: " + e14.getMessage());
            return false;
        }
    }

    @Override // ec2.b, ec2.c
    public final boolean i() {
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER") || GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_sync_audit_http_logging), false);
    }
}
