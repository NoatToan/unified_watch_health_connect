package p90;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.PairingException;
import com.garmin.proto.generated.GDICore;
import com.google.android.gms.wallet.WalletConstants;
import d53.u;
import java.util.Collection;
import o13.r;
import ok2.a0;
import ok2.w;
import ok2.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import q53.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lq90/a;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.BleDevicePairUseCase$startPairing$1", f = "BleDevicePairUseCase.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<t<? super q90.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.d.a f136475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p90.d f136476d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p90/e$a", "Lrm2/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements rm2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<q90.a> f136477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l90.b f136478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p90.d f136479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0 f136480d;

        /* JADX INFO: renamed from: p90.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2590a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f136481a;

            static {
                int[] iArr = new int[qm2.k.values().length];
                try {
                    iArr[qm2.k.AUTHENTICATING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[qm2.k.AUTHENTICATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[qm2.k.AUTHENTICATION_FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[qm2.k.CONNECTING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[qm2.k.CONNECTING_SUCCESS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[qm2.k.CONNECTING_FAILURE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[qm2.k.CHECKING_DEVICE_REGISTRATION_STATUS_SUCCESS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[qm2.k.SENDING_DEVICE_RESET_COMMAND.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[qm2.k.SENDING_DEVICE_RESET_COMMAND_SUCCESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[qm2.k.SENDING_DEVICE_RESET_COMMAND_FAILURE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[qm2.k.RETRIEVING_GARMIN_DEVICE_XML_SUCCESS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[qm2.k.REGISTERING_DEVICE_SUCCESS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[qm2.k.CHECKING_FOR_FIRMWARE_UPDATE_FAILURE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[qm2.k.CHECKING_FOR_FIRMWARE_UPDATE_SUCCESS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[qm2.k.SYNC_FINISHED.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[qm2.k.SAVED_DEVICE_TO_LOCAL_DATABASE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                f136481a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super q90.a> tVar, l90.b bVar, p90.d dVar, o0 o0Var) {
            this.f136477a = tVar;
            this.f136478b = bVar;
            this.f136479c = dVar;
            this.f136480d = o0Var;
        }

        @Override // rm2.a
        public final void B(BluetoothDevice bluetoothDevice) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = fb1.c.n("eventBluetoothDeviceBonded() - device = ", bluetoothDevice.getAddress());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strN);
            o0 o0Var = this.f136480d;
            e.a(o0Var, this.f136477a, this.f136478b, o0Var.f105806a, false, 96);
        }

        @Override // rm2.c
        public final /* bridge */ void a(long j8, long j14) {
        }

        @Override // rm2.a
        public final void j(BluetoothDevice bluetoothDevice) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = fb1.c.n("eventBluetoothDeviceBonded() - device = ", bluetoothDevice.getAddress());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strN);
        }

        @Override // rm2.c
        public final void m(qm2.k kVar, yl2.e eVar, String str) {
            kVar.getClass();
            int i14 = C2590a.f136481a[kVar.ordinal()];
            l90.b bVar = this.f136478b;
            t<q90.a> tVar = this.f136477a;
            switch (i14) {
                case 1:
                    a2 a2Var = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "BleDevicePairUseCase", "eventProgress() - AUTHENTICATING");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 1.0f, false, 112);
                    break;
                case 2:
                    a2 a2Var2 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "BleDevicePairUseCase", "eventProgress() - AUTHENTICATED");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 1.0f, false, 112);
                    break;
                case 3:
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventProgress() - AUTHENTICATION_FAILURE - failureType: " + eVar + ", failureCode: " + str);
                    tVar.i(new q90.a.c(new PairingException(eVar, str), bVar));
                    tVar.q(null);
                    break;
                case 4:
                    a2 a2Var3 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "BleDevicePairUseCase", "eventProgress() - CONNECTING");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 2.0f, false, 112);
                    break;
                case 5:
                    a2 a2Var4 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "BleDevicePairUseCase", "eventProgress() - CONNECTING_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 3.0f, false, 112);
                    break;
                case 6:
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventProgress() - CONNECTING_FAILURE - failureType: " + eVar + ", failureCode: " + str);
                    tVar.i(new q90.a.c(new PairingException(eVar, str), bVar));
                    tVar.q(null);
                    break;
                case 7:
                    a2 a2Var5 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "BleDevicePairUseCase", "eventProgress() - CHECKING_DEVICE_REGISTRATION_STATUS_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 4.0f, false, 112);
                    break;
                case 8:
                    a2 a2Var6 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var6, "BleDevicePairUseCase", "eventProgress() - SENDING_DEVICE_RESET_COMMAND");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 4.0f, true, 80);
                    break;
                case 9:
                    a2 a2Var7 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var7, "BleDevicePairUseCase", "eventProgress() - SENDING_DEVICE_RESET_COMMAND_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 5.0f, false, 112);
                    break;
                case 10:
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventProgress() - SENDING_DEVICE_RESET_COMMAND_FAILURE - failureType: " + eVar + ", failureCode: " + str);
                    e.a(this.f136480d, this.f136477a, this.f136478b, 5.0f, false, 112);
                    break;
                case 11:
                    a2 a2Var8 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var8, "BleDevicePairUseCase", "eventProgress() - RETRIEVING_GARMIN_DEVICE_XML_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 6.0f, false, 112);
                    break;
                case 12:
                    a2 a2Var9 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var9, "BleDevicePairUseCase", "eventProgress() - REGISTERING_DEVICE_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 7.0f, false, 112);
                    break;
                case 13:
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventProgress() - CHECKING_FOR_FIRMWARE_UPDATE_FAILURE - failureType: " + eVar + ", failureCode: " + str);
                    e.a(this.f136480d, this.f136477a, this.f136478b, 8.0f, false, 112);
                    break;
                case 14:
                    a2 a2Var10 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var10, "BleDevicePairUseCase", "eventProgress() - CHECKING_FOR_FIRMWARE_UPDATE_SUCCESS");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 8.0f, false, 112);
                    break;
                case 15:
                    a2 a2Var11 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var11, "BleDevicePairUseCase", "eventProgress() - SYNC_FINISHED");
                    e.a(this.f136480d, this.f136477a, this.f136478b, 12.0f, false, 112);
                    break;
                case 16:
                    a2 a2Var12 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var12, "BleDevicePairUseCase", "eventProgress() - SAVED_DEVICE_TO_LOCAL_DATABASE");
                    bo1.a.a().getClass();
                    bo1.a.b();
                    this.f136479c.f136471c.g();
                    break;
                default:
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventProgress() - eventType = " + kVar + ", failureType = " + eVar + ", failureCode = " + str);
                    break;
            }
        }

        @Override // rm2.c
        public final void t(long j8) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j8, "eventDeviceActivityTrackerUpdated() - deviceId = ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strE);
            this.f136479c.f136471c.k(j8);
        }

        @Override // rm2.c
        public final void v(qm2.k kVar) {
            kVar.getClass();
            m(kVar, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p90/e$b", "Lum2/a;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements um2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0 f136482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<q90.a> f136483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l90.b f136484c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(o0 o0Var, t<? super q90.a> tVar, l90.b bVar) {
            this.f136482a = o0Var;
            this.f136483b = tVar;
            this.f136484c = bVar;
        }

        @Override // um2.a
        public final void a(float f14) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventSyncProgress() - percentComplete = " + f14);
            e.a(this.f136482a, this.f136483b, this.f136484c, ((f14 / 100) * 2) + 8, false, 112);
        }

        @Override // um2.a
        public final void b() {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", "eventSyncStarted()");
            e.a(this.f136482a, this.f136483b, this.f136484c, 8.0f, false, 48);
        }

        @Override // um2.a
        public final void c(String str, boolean z14) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "eventSyncFinished() - shouldContinue = " + z14 + ", failureReason = " + str);
            if (z14) {
                e.a(this.f136482a, this.f136483b, this.f136484c, 12.0f, false, 112);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p90/e$c", "Lik0/b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ik0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm2.a f136485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p90.d f136486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l90.b f136487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t<q90.a> f136488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o0 f136489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m0 f136490f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(bm2.a aVar, p90.d dVar, l90.b bVar, t<? super q90.a> tVar, o0 o0Var, m0 m0Var) {
            this.f136485a = aVar;
            this.f136486b = dVar;
            this.f136487c = bVar;
            this.f136488d = tVar;
            this.f136489e = o0Var;
            this.f136490f = m0Var;
        }

        @Override // ik0.b
        public final boolean a(rs2.c cVar, GDICore.FeatureCapabilitiesResponse.GuidStatus guidStatus, rs2.t tVar) {
            cVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            String str = "GUID Mismatch device unit id " + cVar.getF92746j() + ", guidStatus: " + guidStatus;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", str);
            if (!u.q(this.f136485a.f18886a, cVar.getF92741e(), true)) {
                return false;
            }
            if (guidStatus == GDICore.FeatureCapabilitiesResponse.GuidStatus.UNSET) {
                i2.a.b(a2Var, "BleDevicePairUseCase", "GUID Mismatch UNSET status, proceeding with pairing and will overwrite customer GUID");
                this.f136486b.f136471c.w(cVar.getF92746j(), tVar);
                return true;
            }
            i2.a.b(a2Var, "BleDevicePairUseCase", "GUID Mismatch, blocking pairing as device is likely associated with another customer. guidStatus: " + guidStatus);
            l90.b bVar = this.f136487c;
            boolean z14 = bVar.f111531p.f58437c.f58415d;
            float f14 = this.f136489e.f105806a / 13.0f;
            long f172494b = cVar.getF92746j();
            o0 o0Var = this.f136489e;
            m0 m0Var = this.f136490f;
            p90.d dVar = this.f136486b;
            t<q90.a> tVar2 = this.f136488d;
            l90.b bVar2 = this.f136487c;
            q53.m.a(this.f136488d.i(new q90.a.e(f14, bVar, false, false, false, null, new p90.a(f172494b, z14, new f(o0Var, z14, m0Var, dVar, cVar, tVar, tVar2, bVar2), new g(o0Var, tVar2, bVar2, 0)), 60, null)));
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p90/e$d", "Lrm2/h;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements rm2.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<q90.a> f136491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f136492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l90.b f136493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ yl2.d f136494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<um2.b> f136495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f136496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p90.d f136497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ m0 f136498h;

        /* JADX WARN: Multi-variable type inference failed */
        public d(t<? super q90.a> tVar, o0 o0Var, l90.b bVar, yl2.d dVar, r0<um2.b> r0Var, b bVar2, p90.d dVar2, m0 m0Var) {
            this.f136491a = tVar;
            this.f136492b = o0Var;
            this.f136493c = bVar;
            this.f136494d = dVar;
            this.f136495e = r0Var;
            this.f136496f = bVar2;
            this.f136497g = dVar2;
            this.f136498h = m0Var;
        }

        @Override // rm2.d
        public final void C(PairingException pairingException) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", "onSetupFailure() - " + pairingException);
            this.f136497g.f136471c.p("BleDevicePairUseCase", false);
            yl2.e pairingFailure = pairingException.getPairingFailure();
            yl2.e eVar = yl2.e.HTTP_CONFLICT_409;
            l90.b bVar = this.f136493c;
            t<q90.a> tVar = this.f136491a;
            if (pairingFailure == eVar && s.g(pairingException.getFailureCode(), "4091")) {
                i2.a.b(a2Var, "BleDevicePairUseCase", "onSetupFailure() - HTTP_CONFLICT_409 with subscription associated with other user");
                tVar.i(new q90.a.d(this.f136494d.getF197655a(), bVar));
                tVar.q(null);
            } else if (pairingException.getPairingFailure() == yl2.e.ABORTED) {
                tVar.i(new q90.a.C2704a(bVar));
                tVar.q(null);
            } else {
                tVar.i(new q90.a.c(pairingException, bVar));
                tVar.q(null);
            }
        }

        @Override // rm2.h
        public final void F() {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", "cancelRequestPasskey()");
        }

        @Override // rm2.h
        public final void H(int i14, sm2.o oVar) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strH = am.j.h(i14, "onRequestPasskey() - timeoutInSeconds = ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strH);
            o0 o0Var = this.f136492b;
            float f14 = o0Var.f105806a / 13.0f;
            t<q90.a> tVar = this.f136491a;
            l90.b bVar = this.f136493c;
            tVar.i(new q90.a.e(f14, this.f136493c, false, false, false, new p90.b(oVar, i14, new g(o0Var, tVar, bVar, 1)), null, 92, null));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, um2.b] */
        @Override // rm2.h
        public final void J(long j8, boolean z14, sm2.l lVar) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BleDevicePairUseCase", "onFirstSyncRequest() - deviceUnitID = " + j8 + ", suppressSoftwareDownload = " + z14);
            dd0.i.f59167a.getClass();
            dd0.i.a();
            bm2.d dVar = this.f136494d.f197842d;
            if (dVar != null) {
                ?? bVar = new um2.b(dVar, this.f136496f, lVar, p13.u.m0(new String[]{"FIT_TYPE_2", "FIT_TYPE_41"}), z14, 0, 0L, 96, null);
                this.f136495e.f105810a = bVar;
                a0 a0VarA = a0.f132585h.a();
                lm2.g gVarC = lm2.h.c();
                if (!bVar.f172027l.compareAndSet(false, true)) {
                    um2.b.f172015n.warn("start() has already been called. New instance needed for an app requested retry");
                    return;
                }
                bVar.f172022g = a0VarA;
                bVar.c();
                bVar.f172022g.b(bVar.f172028m);
                a0 a0Var = bVar.f172022g;
                rs2.c cVar = bVar.f172016a;
                w wVarA = a0Var.a(cVar.getF92741e());
                if (wVarA == null || !wVarA.l()) {
                    wVarA = null;
                }
                if (wVarA == null) {
                    ((fm2.c) gVarC).j(cVar);
                    return;
                }
                wVarA.f(new y((Collection) null, (Collection) bVar.f172019d, y.d.BLOCKED, y.d.FORCED, false, 16, (p005kotlin.jvm.internal.j) null), new um2.c(bVar));
            }
        }

        @Override // rm2.h
        public final void c0(String str, sm2.c cVar) {
            str.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            String strConcat = "onRequestReplaceActivityTracker() - currentAatName = ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strConcat);
            yl2.d dVar = cVar.f160338d;
            dVar.g(false);
            if (cVar.f160288j && dVar.f197839a.f145764f) {
                dVar.f197846h = true;
            }
            cVar.d();
        }

        @Override // rm2.h
        public final void q(sm2.k kVar) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", "onRequestDeviceReset()");
            o0 o0Var = this.f136492b;
            t<q90.a> tVar = this.f136491a;
            l90.b bVar = this.f136493c;
            tVar.i(new q90.a.f(bVar, new p90.c(kVar, new h(o0Var, 0, tVar, bVar))));
        }

        @Override // rm2.d
        public final void x(boolean z14) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("onSetupSuccess() - shouldSync = ", z14);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairUseCase", strH);
            p90.d dVar = this.f136497g;
            dVar.f136471c.p("BleDevicePairUseCase", false);
            hk0.a aVarF = hk0.a.f();
            hk0.a.EnumC1667a enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS;
            yl2.d dVar2 = this.f136494d;
            aVarF.l(enumC1667a, dVar2.getF197655a(), null, null);
            dVar.f136471c.E();
            String f197656b = dVar2.getF197656b();
            DeviceProfile deviceProfileA = da2.d.b().a(f197656b);
            long f172494b = deviceProfileA != null ? deviceProfileA.getF92746j() : -1L;
            if (f172494b > 0 && f197656b != null) {
                dVar.f136472d.a(f172494b, f197656b);
            }
            if (z14) {
                bm2.d dVar3 = dVar2.f197842d;
                if (dVar3 != null) {
                    i2.a.b(a2Var, "BleDevicePairUseCase", v.h.u(dVar3.getF92746j(), "onSetupSuccess() - requesting sync for device unit id ", ", mac address ", dVar3.f()));
                    cd0.p.b(dVar3, "BleDevicePairUseCase");
                }
            } else {
                qm2.l lVar = dVar2.f197839a;
                lVar.getClass();
                bm2.a aVar = dVar2.f197841c;
                if (lVar.f145762d == 3 && aVar != null) {
                    String str = aVar.f18886a;
                    i2.a.b(a2Var, "BleDevicePairUseCase", "onSetupSuccess() - No sync requested, sending sync complete state for device mac address " + str);
                    hk0.a aVarF2 = hk0.a.f();
                    aVarF2.getClass();
                    if (TextUtils.isEmpty(str)) {
                        aVarF2.c("sendSyncCompleteState");
                    } else {
                        ea2.e eVar = (ea2.e) hk0.s.a().getCapability(str, ea2.e.class);
                        if (eVar != null) {
                            eVar.setSyncState(da2.j.FINISHED_WITH_SUCCESS);
                        }
                    }
                }
            }
            long f197655a = dVar2.getF197655a();
            String f197656b2 = dVar2.getF197656b();
            if (f197656b2 == null) {
                bm2.d dVar4 = dVar2.f197842d;
                f197656b2 = dVar4 != null ? dVar4.f() : null;
                if (f197656b2 == null) {
                    f197656b2 = "";
                }
            }
            q90.a.g gVar = new q90.a.g(f197655a, f197656b2, this.f136493c, false, this.f136498h.f105804a);
            t<q90.a> tVar = this.f136491a;
            tVar.i(gVar);
            tVar.q(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q90.d.a aVar, p90.d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f136475c = aVar;
        this.f136476d = dVar;
    }

    public static void a(o0 o0Var, t tVar, l90.b bVar, float f14, boolean z14, int i14) {
        boolean z15 = (i14 & 16) == 0;
        boolean z16 = (i14 & 32) != 0 ? false : z14;
        boolean z17 = (i14 & 64) == 0;
        o0Var.f105806a = f14;
        tVar.i(new q90.a.e(f14 / 13.0f, bVar, z15, z16, z17, null, null, 96, null));
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f136475c, this.f136476d, dVar);
        eVar.f136474b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super q90.a> tVar, t13.d<? super Unit> dVar) {
        return ((e) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        qm2.l lVar;
        bm2.f fVar;
        t tVar = (t) this.f136474b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136473a;
        if (i14 == 0) {
            r.b(obj);
            q90.d.a aVar2 = this.f136475c;
            bm2.a aVar3 = aVar2.f143505a;
            bm2.d dVar = aVar2.f143507c;
            l90.b bVar = aVar2.f143506b;
            yl2.b bVar2 = bVar.f111530o;
            o0 o0Var = new o0();
            m0 m0Var = new m0();
            r0 r0Var = new r0();
            yl2.b bVar3 = yl2.b.f197686f;
            p90.d dVar2 = this.f136476d;
            if (bVar2 != bVar3) {
                lVar = bVar2.f197833b;
                if (lVar == null) {
                    lVar = qm2.l.f145754v;
                }
            } else if (bVar.f111517b && bVar.f111518c) {
                lVar = qm2.l.E;
            } else {
                lVar = dVar2.f136470b.a(bVar.f111522g) ? qm2.l.F : qm2.l.f145754v;
            }
            yl2.d dVar3 = new yl2.d(og2.k.Q(bVar), lVar);
            dVar3.f197841c = aVar3;
            dVar3.f197842d = dVar;
            if (dVar != null && (fVar = dVar3.f197840b) != null) {
                fVar.b(dVar.getF92746j());
            }
            a aVar4 = new a(tVar, bVar, dVar2, o0Var);
            d dVar4 = new d(tVar, o0Var, bVar, dVar3, r0Var, new b(o0Var, tVar, bVar), this.f136476d, m0Var);
            c cVar = new c(aVar3, this.f136476d, bVar, tVar, o0Var, m0Var);
            a(o0Var, tVar, bVar, 1.0f, false, 112);
            dVar2.f136471c.p("BleDevicePairUseCase", true);
            dv.a.a().f61318a = true;
            mv.a aVar5 = mv.a.f121121a;
            String str = aVar3.f18886a;
            aVar5.getClass();
            bVar2.getClass();
            int i15 = mv.a.C2295a.f121123a[bVar2.ordinal()];
            if (i15 == 1 || i15 == 2) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICES, "DeviceSyncUploadBlocker", ".startDeviceSetup() -> Block sync upload for " + bVar2 + " macAddress[" + str + "]");
                mv.a.f121122b = str;
            }
            dd0.i iVar = dd0.i.f59167a;
            String str2 = aVar3.f18886a;
            iVar.getClass();
            int i16 = dd0.i.a.f59169a[bVar2.ordinal()];
            if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.a(a2Var, ".startVivoDevicePairing()");
                dd0.i.f59168b = str2;
            }
            dVar2.f136471c.u(cVar);
            qm2.a aVar6 = new qm2.a();
            Context context = dVar2.f136469a;
            aVar6.f145643b = dVar3;
            aVar6.f145644c = context;
            aVar6.f145645d = aVar4;
            aVar6.f145646e = dVar4;
            aVar6.f145647f = lm2.h.e();
            aVar6.f145648g = lm2.h.f();
            aVar6.f145652k = lm2.h.f113624g;
            aVar6.f();
            nw0.p pVar = new nw0.p(dVar2, 20, r0Var, aVar6);
            this.f136474b = null;
            this.f136473a = 1;
            if (q53.r.a(tVar, pVar, this) == aVar) {
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
