package rd0;

import am.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.room.a0;
import bd0.b0;
import c22.u1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import d53.u;
import e23.p;
import g22.n;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import q53.m;
import q53.t;
import tv.s;
import v13.i;
import xv.g;
import xv.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lz90/d;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.device.setup.sync.OrcaFirmwareUpdateUseCaseImpl$startFirmwareUpdate$1", f = "OrcaFirmwareUpdateUseCaseImpl.kt", l = {288}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t<? super z90.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd0.a f152019c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/b$a", "Lcom/garmin/android/apps/connectmobile/bikesensors/c$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<z90.d> f152020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rd0.a f152021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b f152022c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super z90.d> tVar, rd0.a aVar, com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b) {
            this.f152020a = tVar;
            this.f152021b = aVar;
            this.f152022c = interfaceC0491b;
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c
        public final void a(com.garmin.android.apps.connectmobile.bikesensors.c.b bVar) {
            String str;
            a2 a2Var = a2.DEVICE_SETUP;
            String str2 = bVar.f30868c;
            String strM = j.m("Firmware update fetch complete: version[", str2, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", strM);
            String str3 = bVar.f30866a;
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                int i14 = rd0.a.f152005j;
                rd0.a aVar = this.f152021b;
                aVar.getClass();
                s sVar = aVar.f152008c;
                try {
                    String strValueOf = String.valueOf(sVar.f166538a);
                    int iIntValue = Integer.valueOf(GCMSettingManager.f41537c.getString(strValueOf + "sw_version", "")).intValue();
                    str = String.valueOf(iIntValue / 100) + "." + String.valueOf(iIntValue % 100);
                } catch (NumberFormatException unused) {
                    str = "0";
                }
                a2 a2Var2 = a2.DEVICE_SETUP;
                String strJ = a0.j("Comparing firmware versions. Available version: ", str2, ", Device firmware version: ", str);
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", strJ);
                if (n.d(str2) && !u.q(str2, str, true)) {
                    i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", "Firmware update is available. Starting download.");
                    long jF = sVar.f(aVar.f152006a, str3);
                    aVar.f152011f = jF;
                    GCMSettingManager.K(jF);
                    aVar.f152012g = bVar.f30870e;
                    aVar.d(this.f152022c);
                    return;
                }
            }
            a2 a2Var3 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "OrcaFirmwareUpdateUseCase", "No firmware update available.");
            b.g(this.f152020a);
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c
        public final void b(boolean z14) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strG = com.airbnb.lottie.animation.keyframe.a.g("Firmware update check complete: available[", "]", z14);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", strG);
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c
        public final void c(b0 b0Var) {
            b0Var.getClass();
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware update fetch error: " + b0Var);
            this.f152020a.i(new z90.d(0.0f, false, b0Var, 3, null));
        }
    }

    /* JADX INFO: renamed from: rd0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/b$b", "Lcom/garmin/android/apps/connectmobile/bikesensors/b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2860b implements com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<z90.d> f152023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rd0.a f152024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c> f152025c;

        /* JADX WARN: Multi-variable type inference failed */
        public C2860b(t<? super z90.d> tVar, rd0.a aVar, r0<com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c> r0Var) {
            this.f152023a = tVar;
            this.f152024b = aVar;
            this.f152025c = r0Var;
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
        public final void F6() {
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
        public final void O0(int i14, int i15) {
            float f14 = (i14 * 100.0f) / i15;
            if (f14 >= 50.0f) {
                f14 = 49.0f;
            }
            float f15 = f14;
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware download progress update: " + f15 + "%");
            this.f152023a.i(new z90.d(f15, false, null, 6, null));
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
        public final void Y4(int i14) {
            rd0.a aVar = this.f152024b;
            rd0.a.b bVar = aVar.f152010e;
            if (bVar != null) {
                bVar.cancel();
            }
            aVar.f152010e = null;
            Timer timer = aVar.f152009d;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = aVar.f152009d;
            if (timer2 != null) {
                timer2.purge();
            }
            aVar.f152009d = null;
            t<z90.d> tVar = this.f152023a;
            if (i14 != 8) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strH = j.h(i14, "Firmware download failed with status: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "OrcaFirmwareUpdateUseCase", strH);
                b.a(tVar, null);
                return;
            }
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", "Firmware download completed successfully");
            tVar.i(new z90.d(50.0f, false, null, 6, null));
            try {
                i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", "Sending firmware update to device");
                aVar.f152008c.d();
            } catch (FileNotFoundException e4) {
                i2.f36769a.getClass();
                i2.a.f(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware file not found for transfer to device " + e4);
                b.a(tVar, e4);
            } catch (IOException e14) {
                i2.f36769a.getClass();
                i2.a.f(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware file not found for transfer to device " + e14);
                b.a(tVar, e14);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
        public final void s3(int i14) {
            com.garmin.android.apps.connectmobile.bikesensors.c cVarC;
            rd0.a aVar = this.f152024b;
            if (i14 == 2) {
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Firmware download status update: STATUS_RUNNING");
                aVar.d(this);
                return;
            }
            if (i14 == 8) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", "Firmware download status update: STATUS_SUCCESSFUL");
                Y4(i14);
                return;
            }
            if (i14 != 16) {
                return;
            }
            a2 a2Var3 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "OrcaFirmwareUpdateUseCase", "Firmware download status update: STATUS_FAILED");
            GCMSettingManager.K(-1L);
            com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c interfaceC0492c = this.f152025c.f105810a;
            if (interfaceC0492c == null || (cVarC = aVar.c(interfaceC0492c)) == null) {
                return;
            }
            cVarC.a(aVar.f152007b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/b$c", "Lxv/i;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends xv.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rd0.a f152026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<z90.d> f152027b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(rd0.a aVar, t<? super z90.d> tVar) {
            this.f152026a = aVar;
            this.f152027b = tVar;
        }

        @Override // xv.i
        public final void deleteCachedFiles(xv.a aVar) {
            aVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Received event to delete the cached firmware files");
            this.f152026a.f152008c.a();
        }

        @Override // xv.i
        public final void fileTransferComplete(g gVar) {
            gVar.getClass();
            int i14 = gVar.f192267a;
            t<z90.d> tVar = this.f152027b;
            if (i14 != 0) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strH = j.h(i14, "Firmware file transfer to device failed with response code: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "OrcaFirmwareUpdateUseCase", strH);
                m.a(tVar.i(new z90.d(0.0f, false, b0.REMOTE_DEVICE_FILE_TRANSFER_FAILED, 3, null)));
                return;
            }
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "OrcaFirmwareUpdateUseCase", "Firmware file transfer to device complete");
            rd0.a aVar = this.f152026a;
            new ac2.d(aVar.f152006a).a(aVar.f152012g, wb2.g.RECEIVED);
            b.g(tVar);
        }

        @Override // xv.i
        public final void fileTransferProgressUpdate(h hVar) {
            hVar.getClass();
            float f14 = (((int) ((hVar.f192268a * 100.0f) / this.f152026a.f152008c.f166540c)) / 2) + 50.0f;
            if (f14 >= 100.0f) {
                f14 = 99.0f;
            }
            float f15 = f14;
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware file transfer progress update: " + f15 + "%");
            this.f152027b.i(new z90.d(f15, false, null, 6, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/b$d", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements la2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rd0.a f152028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<z90.d> f152029b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(rd0.a aVar, t<? super z90.d> tVar) {
            this.f152028a = aVar;
            this.f152029b = tVar;
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Device got connected during firmware update");
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Device got disconnected during firmware update");
            long f92746j = hVar.f111673a.getF92746j();
            rd0.a aVar = this.f152028a;
            if (f92746j != aVar.f152007b || aVar.f152011f == -1) {
                return;
            }
            this.f152029b.i(new z90.d(0.0f, false, b0.REMOTE_DEVICE_DISCONNECTED, 3, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rd0/b$e", "Landroid/content/BroadcastReceiver;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rd0.a f152030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b f152031b;

        public e(rd0.a aVar, com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b interfaceC0491b) {
            this.f152030a = aVar;
            this.f152031b = interfaceC0491b;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            if (TextUtils.isEmpty(intent.getAction()) || intent.getExtras() == null || !"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                return;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Received download complete broadcast");
            long longExtra = intent.getLongExtra("extra_download_id", 0L);
            rd0.a aVar = this.f152030a;
            if (longExtra == aVar.f152011f) {
                com.garmin.android.apps.connectmobile.bikesensors.b bVarB = aVar.b(this.f152031b);
                if (bVarB != null) {
                    bVarB.a(aVar.f152011f);
                }
                GCMSettingManager.K(-1L);
                aVar.f152011f = -1L;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rd0.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f152019c = aVar;
    }

    public static final void a(t tVar, IOException iOException) {
        i2.f36769a.getClass();
        i2.a.f(a2.DEVICE_SETUP, "OrcaFirmwareUpdateUseCase", "Firmware update failed " + iOException);
        GCMSettingManager.K(-1L);
        b0 b0Var = b0.FILE_DOWNLOAD_FAILED;
        if (iOException != null) {
            iOException.getMessage();
        }
        b0Var.getClass();
        tVar.i(new z90.d(0.0f, false, b0Var, 3, null));
    }

    public static final void g(t tVar) {
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Firmware update successful");
        GCMSettingManager.K(-1L);
        tVar.i(new z90.d(100.0f, true, null, 4, null));
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f152019c, dVar);
        bVar.f152018b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super z90.d> tVar, t13.d<? super Unit> dVar) {
        return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [T, rd0.b$a] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strA;
        ea2.b bVar;
        t tVar = (t) this.f152018b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152017a;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            rd0.a aVar2 = this.f152019c;
            long j8 = aVar2.f152007b;
            s sVar = aVar2.f152008c;
            String strE = org.apache.commons.lang3.e.e(j8, "Starting firmware update for deviceUnitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", strE);
            if (hk0.p.k(sVar.f166538a) && (strA = u1.a(sVar.f166538a)) != null && (bVar = (ea2.b) hk0.p.f().getCapability(strA, ea2.b.class)) != null) {
                bVar.requestMessage(5023);
            }
            if (GCMSettingManager.f41537c.getInt(String.valueOf(sVar.f166538a), -1) == 1) {
                i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "Firmware update failed due to low battery level of the remote device");
                tVar.i(new z90.d(0.0f, false, b0.REMOTE_DEVICE_BATTERY_LOW, 3, null));
            }
            r0 r0Var = new r0();
            c cVar = new c(aVar2, tVar);
            C2860b c2860b = new C2860b(tVar, aVar2, r0Var);
            r0Var.f105810a = new a(tVar, aVar2, c2860b);
            e eVar = new e(aVar2, c2860b);
            d dVar = new d(aVar2, tVar);
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(cVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
            a7.b.registerReceiver(aVar2.f152006a, eVar, intentFilter, 2);
            if (!sVar.c()) {
                long j14 = GCMSettingManager.f41537c.getLong("VECTOR_FIRMWARE_DOWNLOAD_ID", -1L);
                aVar2.f152011f = j14;
                if (j14 != -1) {
                    i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", a0.f(j14, "Firmware download already in progress with downloadId: ", ". Resuming download progress tracking."));
                    com.garmin.android.apps.connectmobile.bikesensors.b bVarB = aVar2.b(c2860b);
                    if (bVarB != null) {
                        bVarB.c(aVar2.f152011f);
                    }
                } else {
                    i2.a.b(a2Var, "OrcaFirmwareUpdateUseCase", "No firmware download in progress. Checking for firmware update availability.");
                    com.garmin.android.apps.connectmobile.bikesensors.c cVarC = aVar2.c((com.garmin.android.apps.connectmobile.bikesensors.c.InterfaceC0492c) r0Var.f105810a);
                    if (cVarC != null) {
                        cVarC.a(aVar2.f152007b);
                    }
                }
            }
            ok0.d dVar2 = new ok0.d(cVar, aVar2, eVar, dVar, 13);
            this.f152018b = null;
            this.f152017a = 1;
            if (q53.r.a(tVar, dVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
