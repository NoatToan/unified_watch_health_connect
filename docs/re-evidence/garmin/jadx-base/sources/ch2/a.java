package ch2;

import android.content.Intent;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.connectiq.u0;
import com.garmin.android.apps.connectmobile.connectiq.w0;
import com.garmin.android.apps.connectmobile.connectiq.x0;
import com.garmin.android.apps.connectmobile.connectiq.z0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.IQDevice;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.primitives.UnsignedBytes;
import dh2.n;
import dh2.o;
import dh2.p;
import dh2.q;
import dh2.s;
import dh2.u;
import dh2.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f27516b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<h> f27517a;

    static {
        int i14 = gt2.c.f79010a;
        f27516b = gt2.b.f79005a.i("CIQ#CommandHandler");
    }

    public a(h hVar) {
        this.f27517a = new WeakReference<>(hVar);
    }

    public static String a(long j8, int i14, boolean z14) {
        if (!b.b().d(j8, i14, z14)) {
            return null;
        }
        b.C0419b c0419bC = b.b().c(i14, j8);
        return c0419bC == null ? "" : c0419bC.f27520a;
    }

    public final long b() {
        DeviceProfile profile;
        WeakReference<h> weakReference = this.f27517a;
        if (weakReference == null || weakReference.get() == null || (profile = weakReference.get().getRemoteDeviceProxy().getProfile()) == null) {
            return 0L;
        }
        return profile.getF92746j();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0078  */
    public final void c(dh2.b bVar) {
        byte[] bArr = bVar.f59673a;
        z0.b bVar2 = h.f27575i;
        if (bVar2 != null) {
            int i14 = (bArr[18] & UnsignedBytes.MAX_VALUE) | ((bArr[19] << 8) & 65280);
            long jB = b();
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 2, bArr2, 0, 16);
            String str = new String(v.a(bArr2));
            z0 z0Var = z0.this;
            z0Var.getClass();
            z0.c cVarH = z0Var.h(jB, z0.d.APPLICATION_INFO);
            if (cVarH != null) {
                String str2 = cVarH.f32125e;
                u0.b bVarC = u0.b().c(str);
                if (bVarC != null) {
                    String str3 = bVarC.f32033b;
                    if (str3.equals(str2)) {
                        i2.d("MonkeybrainsStateManager", "Requesting bind service for application info for device: " + jB);
                        bVarC.f32034c.a(z0Var.f32117a, str3);
                        new Thread(new w0(z0Var, cVarH, jB, str, i14, bVarC, 1)).start();
                    } else {
                        Intent intent = new Intent(cVarH.f32126f);
                        intent.setPackage(str2);
                        intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(jB, ""));
                        intent.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str);
                        intent.putExtra(ConnectIQ.EXTRA_APPLICATION_VERSION, i14);
                        GarminConnectMobileApp.f28688j.sendBroadcast(intent);
                    }
                } else {
                    Intent intent2 = new Intent(cVarH.f32126f);
                    intent2.setPackage(str2);
                    intent2.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(jB, ""));
                    intent2.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str);
                    intent2.putExtra(ConnectIQ.EXTRA_APPLICATION_VERSION, i14);
                    GarminConnectMobileApp.f28688j.sendBroadcast(intent2);
                }
                z0Var.m(cVarH);
            }
        }
    }

    public final void d(dh2.d dVar) {
        byte[] bArr = dVar.f59673a;
        dh2.d.a aVar = bArr[2] != 1 ? dh2.d.a.SUCCESS : dh2.d.a.INVALID_CONNECTION_ID;
        f27516b.debug("handleCloseConnectionResponse ErrorCode: " + aVar.name());
        long jB = b();
        if (aVar != dh2.d.a.SUCCESS) {
            z0.b bVar = h.f27575i;
            if (bVar != null) {
                bVar.a(jB, a(jB, bArr[3], true));
                return;
            }
            return;
        }
        String strA = a(jB, bArr[3], true);
        b.b().a(jB, bArr[3], true);
        z0.b bVar2 = h.f27575i;
        if (bVar2 != null) {
            bVar2.a(jB, strA);
        }
    }

    public final void e(n nVar) {
        long jB = b();
        b bVarB = b.b();
        byte[] bArr = nVar.f59673a;
        boolean zD = bVarB.d(jB, bArr[2], false);
        WeakReference<h> weakReference = this.f27517a;
        if (zD) {
            a(jB, bArr[2], false);
            b.b().a(jB, bArr[2], false);
            if (h.f27575i != null) {
                b();
            }
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            weakReference.get().h(bArr[2], o.a.SUCCESS.f59663a);
            return;
        }
        if (h.f27575i != null) {
            b();
            a(jB, bArr[2], false);
            int i14 = o.a.INVALID_CONNECTION_ID.f59663a;
        }
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        weakReference.get().h(bArr[2], o.a.INVALID_CONNECTION_ID.f59663a);
    }

    public final void f(p pVar) {
        byte[] bArr = pVar.f59673a;
        if (h.f27575i != null) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 2, bArr2, 0, 16);
            String strA = v.a(bArr2);
            long jB = b();
            h.f27575i.getClass();
            b.b().e(jB, strA, bArr[18], false, false);
            h.f27575i.getClass();
            WeakReference<h> weakReference = this.f27517a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            h hVar = weakReference.get();
            byte b14 = bArr[18];
            q.a aVar = q.a.SUCCESS;
            int i14 = aVar.f59667a;
            hVar.getClass();
            if (b14 < 0 || b14 > 15) {
                return;
            }
            q qVar = new q();
            byte[] bArr3 = qVar.f59673a;
            bArr3[3] = b14;
            if (i14 == 1) {
                aVar = q.a.NO_COMPANION_APP;
            }
            bArr3[2] = (byte) aVar.f59667a;
            hVar.f(qVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    public final void g(s sVar) {
        byte[] bArr = sVar.f59673a;
        if (h.f27575i != null) {
            byte b14 = bArr[18];
            long jB = b();
            z0.b bVar = h.f27575i;
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 2, bArr2, 0, 16);
            String str = new String(v.a(bArr2));
            z0 z0Var = z0.this;
            z0Var.getClass();
            z0.c cVarH = z0Var.h(jB, z0.d.OPEN_APPLICATION);
            if (cVarH != null) {
                String str2 = cVarH.f32125e;
                u0.b bVarC = u0.b().c(str);
                if (bVarC != null) {
                    String str3 = bVarC.f32033b;
                    if (str3.equals(str2)) {
                        i2.d("MonkeybrainsStateManager", "Requesting bind service for open application response for device: " + jB);
                        bVarC.f32034c.a(z0Var.f32117a, str3);
                        new Thread(new w0(z0Var, cVarH, jB, str, b14, bVarC, 0)).start();
                    } else {
                        Intent intent = new Intent(cVarH.f32126f);
                        intent.setPackage(str2);
                        intent.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_DEVICE, new IQDevice(jB, ""));
                        intent.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_ID, str);
                        intent.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_RESULT_CODE, (int) b14);
                        GarminConnectMobileApp.f28688j.sendBroadcast(intent);
                    }
                } else {
                    Intent intent2 = new Intent(cVarH.f32126f);
                    intent2.setPackage(str2);
                    intent2.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_DEVICE, new IQDevice(jB, ""));
                    intent2.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_ID, str);
                    intent2.putExtra(ConnectIQ.EXTRA_OPEN_APPLICATION_RESULT_CODE, (int) b14);
                    GarminConnectMobileApp.f28688j.sendBroadcast(intent2);
                }
                z0Var.m(cVarH);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x012d A[Catch: all -> 0x012b, TryCatch #0 {all -> 0x012b, blocks: (B:42:0x00e1, B:44:0x00e9, B:46:0x00f8, B:48:0x0100, B:51:0x012d, B:52:0x0159, B:53:0x015f, B:55:0x0165, B:57:0x0171, B:59:0x0175, B:61:0x017b, B:63:0x0181, B:66:0x018c), top: B:71:0x00e1 }] */
    public final void h(u uVar) {
        u.a aVar;
        ea2.d dVarE;
        DeviceProfile profile;
        byte[] bArr = uVar.f59673a;
        byte b14 = bArr[2];
        if (b14 == 1) {
            aVar = u.a.NO_SUCH_APPLICATION;
        } else if (b14 != 2) {
            aVar = b14 != 3 ? u.a.SUCCESS : u.a.CONNECTION_EXISTS;
        } else {
            aVar = u.a.NO_FREE_CONNECTION;
        }
        WeakReference<h> weakReference = this.f27517a;
        long f172494b = (weakReference == null || weakReference.get() == null || (profile = weakReference.get().getRemoteDeviceProxy().getProfile()) == null) ? 0L : profile.getF92746j();
        f27516b.debug("handleOpenConnectionResponse ErrorCode: " + aVar.name());
        if (aVar == u.a.SUCCESS) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 3, bArr2, 0, 16);
            String str = new String(v.a(bArr2));
            b.b().e(f172494b, str, bArr[19], true, bArr.length > 20 && (bArr[20] & 1) == 1);
            z0.b bVar = h.f27575i;
            if (bVar != null) {
                byte b15 = bArr[19];
                z0 z0Var = z0.this;
                z0Var.getClass();
                z0.c cVarI = z0Var.i(f172494b, z0.d.OPEN_CONNECTION, str);
                if (cVarI != null) {
                    if (cVarI.f32128h) {
                        z0Var.f32118b.add(new z0.c(f172494b, z0.d.DATA_TRANSFER, str, b15, cVarI.f32125e, cVarI.f32126f, null, false));
                        ea2.d dVarE2 = z0Var.e(f172494b);
                        if (dVarE2 != null) {
                            dVarE2.a(b15, cVarI.f32129i, cVarI.f32130j);
                        }
                    }
                    z0Var.m(cVarI);
                    return;
                }
                return;
            }
            return;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 3, bArr3, 0, 16);
        String str2 = new String(v.a(bArr3));
        z0.b bVar2 = h.f27575i;
        if (bVar2 != null) {
            z0 z0Var2 = z0.this;
            z0Var2.getClass();
            z0.f32116e.lock();
            try {
                z0.c cVarI2 = z0Var2.i(f172494b, z0.d.OPEN_CONNECTION, str2);
                if (cVarI2 != null) {
                    String str3 = cVarI2.f32125e;
                    z0Var2.m(cVarI2);
                    u0.b bVarC = u0.b().c(str2);
                    if (bVarC != null) {
                        String str4 = bVarC.f32033b;
                        if (str4.equals(str3)) {
                            i2.d("MonkeybrainsStateManager", "Requesting bind service for connection open failed for device: " + f172494b);
                            bVarC.f32034c.a(z0Var2.f32117a, str4);
                            x0 x0Var = new x0(z0Var2, cVarI2, f172494b, str2, bVarC);
                            z0Var2 = z0Var2;
                            f172494b = f172494b;
                            new Thread(x0Var).start();
                        } else {
                            Intent intent = new Intent(cVarI2.f32126f);
                            intent.setPackage(str3);
                            intent.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(f172494b, ""));
                            intent.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str2);
                            intent.putExtra(ConnectIQ.EXTRA_STATUS, ConnectIQ.IQMessageStatus.FAILURE_DURING_TRANSFER.ordinal());
                            GarminConnectMobileApp.f28688j.sendBroadcast(intent);
                        }
                    } else {
                        Intent intent2 = new Intent(cVarI2.f32126f);
                        intent2.setPackage(str3);
                        intent2.putExtra(ConnectIQ.EXTRA_REMOTE_DEVICE, new IQDevice(f172494b, ""));
                        intent2.putExtra(ConnectIQ.EXTRA_APPLICATION_ID, str2);
                        intent2.putExtra(ConnectIQ.EXTRA_STATUS, ConnectIQ.IQMessageStatus.FAILURE_DURING_TRANSFER.ordinal());
                        GarminConnectMobileApp.f28688j.sendBroadcast(intent2);
                    }
                }
                for (z0.c cVar : z0Var2.f32118b) {
                    if (z0.d.OPEN_CONNECTION == cVar.f32122b && !cVar.f32127g) {
                        long j8 = cVar.f32121a;
                        if (j8 == f172494b && (dVarE = z0Var2.e(j8)) != null) {
                            dVarE.b(cVar.f32123c);
                            z0.f32116e.unlock();
                        }
                    }
                }
                z0.f32115d.remove(Long.valueOf(f172494b));
                z0.f32116e.unlock();
            } catch (Throwable th3) {
                z0.f32116e.unlock();
                throw th3;
            }
        }
    }
}
