package ch2;

import android.content.Context;
import android.content.Intent;
import bs2.q4;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.connectiq.b1;
import com.garmin.android.apps.connectmobile.connectiq.u0;
import com.garmin.android.apps.connectmobile.connectiq.z0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.IQApp;
import com.garmin.android.connectiq.IQDevice;
import com.garmin.android.gfdi.framework.PRNGFixes;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import dh2.i;
import dh2.j;
import dh2.k;
import dh2.m;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.HashMap;
import ss2.n;

/* JADX INFO: loaded from: classes11.dex */
public class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27528a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<h> f27529b;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f27530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27531b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27532c = 0;

        public a(c cVar, long j8, d dVar, boolean z14) {
            this.f27530a = dVar;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i("CIQ#MonkeybrainsInboundMessageHandler");
    }

    public c(h hVar) {
        this.f27529b = new WeakReference<>(hVar);
    }

    public final long a() {
        DeviceProfile profile;
        WeakReference<h> weakReference = this.f27529b;
        if (weakReference == null || weakReference.get() == null || (profile = weakReference.get().getRemoteDeviceProxy().getProfile()) == null) {
            return 0L;
        }
        return profile.getF92746j();
    }

    public final e.a b(dh2.g gVar) {
        if (b.b().d(a(), gVar.e(), false)) {
            return !this.f27528a.containsKey(Integer.valueOf(gVar.e())) ? new e.a(this, e.b.TRANSFER_NOT_STARTED, dh2.f.a.ACK_REQUEST_RESPONSE, gVar.e()) : new e.a(this, e.b.SUCCESS_ACK, dh2.f.a.ACK_REQUEST_RESPONSE, gVar.e());
        }
        return new e.a(this, e.b.INVALID_CONNECTION_ID, dh2.f.a.ACK_REQUEST_RESPONSE, gVar.e());
    }

    public final e.a c(i iVar) {
        long jA = a();
        if (!b.b().d(jA, iVar.e(), false)) {
            return new e.a(this, e.b.INVALID_CONNECTION_ID, dh2.f.a.ENCRYPTION_KEY, iVar.e());
        }
        PRNGFixes.apply();
        byte[] bArrC = new byte[16];
        new SecureRandom().nextBytes(bArrC);
        b.C0419b c0419bC = b.b().c(iVar.e(), jA);
        if (c0419bC != null) {
            c0419bC.f27525f = bArrC;
        }
        WeakReference<h> weakReference = this.f27529b;
        if ((weakReference != null) & (weakReference.get() != null)) {
            dh2.h hVar = new dh2.h();
            ga2.a aVar = (ga2.a) weakReference.get().getRemoteDeviceProxy().getCapability(ga2.a.class);
            byte[] bArr = aVar == null ? null : aVar.f76618b;
            if (bArr != null) {
                byte[] bArr2 = hVar.f59673a;
                bArr2[18] = (byte) (1 | bArr2[18]);
                bArrC = n.c(16, false, bArrC, bArr);
            }
            hVar.g(iVar.e());
            if (bArrC.length == 16) {
                System.arraycopy(bArrC, 0, hVar.f59673a, 2, 16);
            }
            byte[] bArr3 = hVar.f59673a;
            bArr3[18] = (byte) (bArr3[18] | 2);
            weakReference.get().g(hVar);
        }
        return new e.a(this, e.b.SUCCESS, dh2.f.a.ENCRYPTION_KEY, iVar.e());
    }

    public final e.a d(j jVar) {
        byte[] bArr = jVar.f59673a;
        boolean z14 = (bArr[2] & 2) == 2;
        long jA = a();
        if (z14) {
            b.C0419b c0419bC = b.b().c(jVar.e(), jA);
            if ((c0419bC == null ? null : c0419bC.f27525f) == null) {
                return new e.a(this, e.b.MISSING_ENCRYPTION_KEY, dh2.f.a.FIRST_PACKET, jVar.e());
            }
        }
        a aVar = new a(this, System.currentTimeMillis(), new d((int) ((((long) bArr[3]) & 255) | (((long) (bArr[4] << 8)) & 65280) | (((long) (bArr[5] << Ascii.DLE)) & 16711680) | (((long) (bArr[6] << Ascii.CAN)) & 4278190080L))), z14);
        if (!b.b().d(jA, jVar.e(), false)) {
            return new e.a(this, e.b.INVALID_CONNECTION_ID, dh2.f.a.FIRST_PACKET, jVar.e());
        }
        this.f27528a.put(Integer.valueOf(jVar.e()), aVar);
        return new e.a(this, e.b.SUCCESS_ACK, dh2.f.a.FIRST_PACKET, jVar.e(), 255);
    }

    public final e.a e(k kVar) {
        long jA = a();
        if (!b.b().d(jA, kVar.e(), false)) {
            return new e.a(this, e.b.INVALID_CONNECTION_ID, dh2.f.a.LAST_PACKET, kVar.e());
        }
        if (!this.f27528a.containsKey(Integer.valueOf(kVar.e()))) {
            return new e.a(this, e.b.TRANSFER_NOT_STARTED, dh2.f.a.LAST_PACKET, kVar.e());
        }
        a aVar = (a) this.f27528a.get(Integer.valueOf(kVar.e()));
        d dVar = aVar.f27530a;
        byte[] bArr = dVar.f27533a;
        int i14 = dVar.f27534b;
        int iA = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iA = q4.a(bArr[i15], iA);
        }
        short s8 = (short) iA;
        byte[] bArr2 = kVar.f59673a;
        if (s8 != ((short) (((bArr2[4] << 8) & 65280) | (bArr2[3] & UnsignedBytes.MAX_VALUE)))) {
            return new e.a(this, e.b.CRC_MISMATCH, dh2.f.a.LAST_PACKET, kVar.e());
        }
        if (kVar.e() != 0) {
            b.C0419b c0419bC = b.b().c(kVar.e(), jA);
            String str = c0419bC == null ? "" : c0419bC.f27520a;
            if (h.f27575i != null) {
                byte[] bArrB = aVar.f27530a.f27533a;
                b.C0419b c0419bC2 = b.b().c(kVar.e(), jA);
                u0.a aVar2 = null;
                byte[] bArr3 = c0419bC2 == null ? null : c0419bC2.f27525f;
                if (bArr3 != null) {
                    bArrB = n.b(bArrB, 0, bArrB.length, true, bArr3);
                }
                byte[] bArr4 = bArrB;
                z0.b bVar = h.f27575i;
                long jA2 = a();
                bVar.getClass();
                Context context = GarminConnectMobileApp.f28688j;
                if (context != null) {
                    u0.b bVarC = u0.b().c(str);
                    for (u0.a aVar3 : u0.b().f32027a.values()) {
                        if (aVar3.f32029a.equalsIgnoreCase(str)) {
                            aVar2 = aVar3;
                            break;
                        }
                    }
                    if (bVarC != null) {
                        i2.d("MonkeybrainsStateManager", "Requesting bind service for message received for unitId: " + jA2);
                        bVarC.f32034c.a(context, bVarC.f32033b);
                        new Thread(new b1(jA2, str, bArr4, bVarC)).start();
                    } else if (aVar2 != null) {
                        IQDevice iQDevice = new IQDevice(jA2, "");
                        Intent intent = new Intent(aVar2.f32030b);
                        intent.setPackage(aVar2.f32031c);
                        intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, iQDevice);
                        intent.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str);
                        intent.putExtra(ConnectIQ.EXTRA_PAYLOAD, bArr4);
                        intent.putExtra(ConnectIQ.EXTRA_REMOTE_APPLICATION, new IQApp(str));
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
        this.f27528a.remove(Integer.valueOf(kVar.e()));
        return new e.a(this, e.b.SUCCESS_ACK, dh2.f.a.LAST_PACKET, kVar.e(), kVar.f59673a[2]);
    }

    public final e.a f(m mVar) {
        a aVar;
        if (!b.b().d(a(), mVar.e(), false)) {
            return new e.a(this, e.b.INVALID_CONNECTION_ID, dh2.f.a.DATA_TRANSMISSION, mVar.e());
        }
        Integer numValueOf = Integer.valueOf(mVar.e());
        HashMap map = this.f27528a;
        if (map.containsKey(numValueOf) && (aVar = (a) map.get(Integer.valueOf(mVar.e()))) != null) {
            d dVar = aVar.f27530a;
            if (mVar.f() != aVar.f27531b) {
                int i14 = dVar.f27535c - aVar.f27532c;
                dVar.f27535c = i14;
                if (i14 < 0) {
                    dVar.f27535c = 0;
                }
                aVar.f27532c = 0;
                return new e.a(this, e.b.INVALID_SEQUENCE, dh2.f.a.DATA_TRANSMISSION, mVar.e(), aVar.f27531b);
            }
            int i15 = mVar.f59659c;
            byte[] bArr = new byte[i15];
            System.arraycopy(mVar.f59673a, 1, bArr, 0, i15);
            int i16 = dVar.f27535c;
            int i17 = dVar.f27534b;
            if (i16 < i17 && i16 + i15 <= i17) {
                System.arraycopy(bArr, 0, dVar.f27533a, i16, i15);
                dVar.f27535c += i15;
            }
            System.currentTimeMillis();
            aVar.f27532c += i15;
            int i18 = aVar.f27531b;
            int i19 = i18 + 1;
            aVar.f27531b = i19;
            if (i19 > 14) {
                aVar.f27531b = 0;
                aVar.f27532c = 0;
            }
            return i18 == 14 ? new e.a(this, e.b.SUCCESS_ACK, dh2.f.a.DATA_TRANSMISSION, mVar.e(), i18) : new e.a(this, e.b.SUCCESS, dh2.f.a.DATA_TRANSMISSION, mVar.e());
        }
        return new e.a(this, e.b.TRANSFER_NOT_STARTED, dh2.f.a.DATA_TRANSMISSION, mVar.e());
    }
}
