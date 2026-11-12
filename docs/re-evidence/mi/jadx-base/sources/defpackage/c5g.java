package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.miplay.audioclient.MediaMetaData;
import com.xiaomi.miplay.audioclient.MiPlayDevice;
import com.xiaomi.miplay.audioclient.MiPlayDeviceControlCenter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class c5g implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public buc f4943b;
    public tvf e;
    public String f;
    public String g;
    public volatile boolean h;
    public final Object i = new Object();
    public Handler j = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public tvf f4944k = new b();
    public ServiceConnection l = new c();
    public List<MiPlayDevice> c = new ArrayList();
    public List<MiPlayDeviceControlCenter> d = new ArrayList();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (c5g.this.e != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleMessage type:");
                sb.append(message.what);
                sb.append(" ,callback:");
                sb.append(System.identityHashCode(c5g.this.e));
            }
            switch (message.what) {
                case 0:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.z1();
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.m3();
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 2:
                    if (c5g.this.e != null) {
                        try {
                            MiPlayDevice miPlayDevice = (MiPlayDevice) message.obj;
                            if (c5g.this.c.contains(miPlayDevice)) {
                                int iIndexOf = c5g.this.c.indexOf(miPlayDevice);
                                c5g.this.c.remove(miPlayDevice);
                                c5g.this.c.add(iIndexOf, miPlayDevice);
                            } else {
                                c5g.this.c.add(miPlayDevice);
                            }
                            c5g.this.e.v3(miPlayDevice);
                        } catch (RemoteException e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 3:
                    if (c5g.this.e != null) {
                        try {
                            MiPlayDevice miPlayDevice2 = (MiPlayDevice) message.obj;
                            if (c5g.this.c.contains(miPlayDevice2)) {
                                int iIndexOf2 = c5g.this.c.indexOf(miPlayDevice2);
                                c5g.this.c.remove(miPlayDevice2);
                                c5g.this.c.add(iIndexOf2, miPlayDevice2);
                            } else {
                                c5g.this.c.add(miPlayDevice2);
                            }
                            c5g.this.e.x3(miPlayDevice2);
                        } catch (RemoteException e4) {
                            e4.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 4:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.onDeviceLost((String) message.obj);
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 5:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.W3((Map) message.obj);
                        } catch (RemoteException e6) {
                            e6.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 6:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.H3((Map) message.obj);
                        } catch (RemoteException e7) {
                            e7.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 7:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.o((Map) message.obj);
                        } catch (RemoteException e8) {
                            e8.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 8:
                    if (c5g.this.e != null) {
                        Object[] objArr = (Object[]) message.obj;
                        try {
                            c5g.this.e.k4((String) objArr[0], ((Integer) objArr[1]).intValue());
                        } catch (RemoteException e9) {
                            e9.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 9:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.P0((Map) message.obj);
                        } catch (RemoteException e10) {
                            e10.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 10:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.F0((Map) message.obj);
                        } catch (RemoteException e11) {
                            e11.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 11:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.H2((Map) message.obj);
                        } catch (RemoteException e12) {
                            e12.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 12:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.q3((Map) message.obj);
                        } catch (RemoteException e13) {
                            e13.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 13:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.a1((Map) message.obj);
                        } catch (RemoteException e14) {
                            e14.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 14:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.k2((Map) message.obj);
                        } catch (RemoteException e15) {
                            e15.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 15:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.l0((Map) message.obj);
                        } catch (RemoteException e16) {
                            e16.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 16:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.w1((Map) message.obj);
                        } catch (RemoteException e17) {
                            e17.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 17:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.o1((Map) message.obj);
                        } catch (RemoteException e18) {
                            e18.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 18:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.a0((Map) message.obj);
                        } catch (RemoteException e19) {
                            e19.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 19:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.G4((String) message.obj);
                        } catch (RemoteException e20) {
                            e20.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 20:
                    if (c5g.this.e != null) {
                        try {
                            MiPlayDeviceControlCenter miPlayDeviceControlCenter = (MiPlayDeviceControlCenter) message.obj;
                            if (c5g.this.d.contains(miPlayDeviceControlCenter)) {
                                int iIndexOf3 = c5g.this.d.indexOf(miPlayDeviceControlCenter);
                                c5g.this.d.remove(miPlayDeviceControlCenter);
                                c5g.this.d.add(iIndexOf3, miPlayDeviceControlCenter);
                            } else {
                                c5g.this.d.add(miPlayDeviceControlCenter);
                            }
                            c5g.this.e.f5(miPlayDeviceControlCenter);
                        } catch (RemoteException e21) {
                            e21.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 21:
                    if (c5g.this.e != null) {
                        try {
                            MiPlayDeviceControlCenter miPlayDeviceControlCenter2 = (MiPlayDeviceControlCenter) message.obj;
                            if (c5g.this.d.contains(miPlayDeviceControlCenter2)) {
                                int iIndexOf4 = c5g.this.d.indexOf(miPlayDeviceControlCenter2);
                                c5g.this.d.remove(miPlayDeviceControlCenter2);
                                c5g.this.d.add(iIndexOf4, miPlayDeviceControlCenter2);
                            } else {
                                c5g.this.d.add(miPlayDeviceControlCenter2);
                            }
                            c5g.this.e.i1(miPlayDeviceControlCenter2);
                        } catch (RemoteException e22) {
                            e22.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 22:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.b3((MediaMetaData) message.obj);
                        } catch (RemoteException e23) {
                            e23.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 23:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.u4((Map) message.obj);
                        } catch (RemoteException e24) {
                            e24.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 24:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.E1((Map) message.obj);
                        } catch (RemoteException e25) {
                            e25.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 25:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.B1((Map) message.obj);
                        } catch (RemoteException e26) {
                            e26.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 26:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.S2((Map) message.obj);
                        } catch (RemoteException e27) {
                            e27.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 27:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.x0((Map) message.obj);
                        } catch (RemoteException e28) {
                            e28.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 28:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.K1((Map) message.obj);
                        } catch (RemoteException e29) {
                            e29.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 29:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.i5((Map) message.obj);
                        } catch (RemoteException e30) {
                            e30.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 30:
                    if (c5g.this.e != null) {
                        Object[] objArr2 = (Object[]) message.obj;
                        try {
                            c5g.this.e.x1((String) objArr2[0], (byte[]) objArr2[1]);
                        } catch (RemoteException e31) {
                            e31.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 31:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.L4((Map) message.obj);
                        } catch (RemoteException e32) {
                            e32.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 32:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.W2((String) message.obj);
                        } catch (RemoteException e33) {
                            e33.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 33:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.h();
                        } catch (RemoteException e34) {
                            e34.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 34:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.l1((Map) message.obj);
                        } catch (RemoteException e35) {
                            e35.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 35:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.U2((Map) message.obj);
                        } catch (RemoteException e36) {
                            e36.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 36:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.t0((Map) message.obj);
                        } catch (RemoteException e37) {
                            e37.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 37:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.M3((Map) message.obj);
                        } catch (RemoteException e38) {
                            e38.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 38:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.L2((Map) message.obj);
                        } catch (RemoteException e39) {
                            e39.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 39:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.w((Map) message.obj);
                        } catch (RemoteException e40) {
                            e40.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 40:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.M1((Map) message.obj);
                        } catch (RemoteException e41) {
                            e41.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 41:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.t2((Map) message.obj);
                        } catch (RemoteException e42) {
                            e42.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 42:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.o4((Map) message.obj);
                        } catch (RemoteException e43) {
                            e43.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 43:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.C((Map) message.obj);
                        } catch (RemoteException e44) {
                            e44.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 44:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.S1((String) message.obj);
                        } catch (RemoteException e45) {
                            e45.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 45:
                    if (c5g.this.e != null) {
                        Object[] objArr3 = (Object[]) message.obj;
                        try {
                            c5g.this.e.c4((String) objArr3[0], (String) objArr3[1]);
                        } catch (RemoteException e46) {
                            e46.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 46:
                    if (c5g.this.e != null) {
                        Object[] objArr4 = (Object[]) message.obj;
                        try {
                            c5g.this.e.s1((String) objArr4[0], ((Integer) objArr4[1]).intValue());
                        } catch (RemoteException e47) {
                            e47.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 47:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.z0((String) message.obj);
                        } catch (RemoteException e48) {
                            e48.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 48:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.G((String) message.obj);
                        } catch (RemoteException e49) {
                            e49.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 49:
                    if (c5g.this.e != null) {
                        Object[] objArr5 = (Object[]) message.obj;
                        try {
                            c5g.this.e.n3((String) objArr5[0], (byte[]) objArr5[1]);
                        } catch (RemoteException e50) {
                            e50.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 50:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.x2((Map) message.obj);
                        } catch (RemoteException e51) {
                            e51.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 51:
                    if (c5g.this.e != null) {
                        Object[] objArr6 = (Object[]) message.obj;
                        try {
                            c5g.this.e.s3((String) objArr6[0], ((Integer) objArr6[1]).intValue(), ((Integer) objArr6[2]).intValue());
                        } catch (RemoteException e52) {
                            e52.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 52:
                    if (c5g.this.e != null) {
                        Object[] objArr7 = (Object[]) message.obj;
                        try {
                            c5g.this.e.W1((String) objArr7[0], (String) objArr7[1], ((Integer) objArr7[2]).intValue());
                        } catch (RemoteException e53) {
                            e53.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 53:
                    if (c5g.this.e != null) {
                        Object[] objArr8 = (Object[]) message.obj;
                        try {
                            c5g.this.e.U((String) objArr8[0], ((Integer) objArr8[1]).intValue());
                        } catch (RemoteException e54) {
                            e54.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 54:
                    if (c5g.this.e != null) {
                        try {
                            c5g.this.e.B0((Map) message.obj);
                        } catch (RemoteException e55) {
                            e55.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 55:
                    if (c5g.this.e != null) {
                        Object[] objArr9 = (Object[]) message.obj;
                        try {
                            c5g.this.e.u1((String) objArr9[0], ((Integer) objArr9[1]).intValue(), (String) objArr9[2]);
                        } catch (RemoteException e56) {
                            e56.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 56:
                    if (c5g.this.e != null) {
                        Object[] objArr10 = (Object[]) message.obj;
                        try {
                            c5g.this.e.b1((String) objArr10[0], (String) objArr10[1]);
                        } catch (RemoteException e57) {
                            e57.printStackTrace();
                            return;
                        }
                    }
                    break;
                case 57:
                    if (c5g.this.e != null) {
                        Object[] objArr11 = (Object[]) message.obj;
                        try {
                            c5g.this.e.c2((String) objArr11[0], (String) objArr11[1]);
                        } catch (RemoteException e58) {
                            e58.printStackTrace();
                            return;
                        }
                    }
                    break;
            }
        }
    }

    public class b extends tvf {
        public b() {
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void B0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(54, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void B1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(25, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void C(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(43, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void E1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(24, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void F0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(10, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void G(String str) throws RemoteException {
            c5g.this.j.obtainMessage(48, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void G4(String str) throws RemoteException {
            c5g.this.j.obtainMessage(19, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void H2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(11, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void H3(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(6, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void K1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(28, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void L2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(38, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void L4(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(31, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void M1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(40, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void M3(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(37, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void P0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(9, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void S1(String str) throws RemoteException {
            c5g.this.j.obtainMessage(44, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void S2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(26, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void U(String str, int i) throws RemoteException {
            c5g.this.j.obtainMessage(53, new Object[]{str, Integer.valueOf(i)}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void U2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(35, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void W1(String str, String str2, int i) throws RemoteException {
            c5g.this.j.obtainMessage(52, new Object[]{str, str2, Integer.valueOf(i)}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void W2(String str) throws RemoteException {
            c5g.this.j.obtainMessage(32, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void W3(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(5, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void a0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(18, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void a1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(13, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void b1(String str, String str2) throws RemoteException {
            c5g.this.j.obtainMessage(56, new Object[]{str, str2}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void b3(MediaMetaData mediaMetaData) throws RemoteException {
            c5g.this.j.obtainMessage(22, mediaMetaData).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void c2(String str, String str2) throws RemoteException {
            c5g.this.j.obtainMessage(57, new Object[]{str, str2}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void c4(String str, String str2) throws RemoteException {
            c5g.this.j.obtainMessage(45, new Object[]{str, str2}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void f5(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException {
            c5g.this.j.obtainMessage(20, miPlayDeviceControlCenter).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void h() throws RemoteException {
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void i1(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException {
            c5g.this.j.obtainMessage(21, miPlayDeviceControlCenter).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void i5(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(29, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void k2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(14, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void k4(String str, int i) throws RemoteException {
            c5g.this.j.obtainMessage(8, new Object[]{str, Integer.valueOf(i)}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void l0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(15, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void l1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(34, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void m3() throws RemoteException {
            c5g.this.j.obtainMessage(1).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void n3(String str, byte[] bArr) throws RemoteException {
            c5g.this.j.obtainMessage(49, new Object[]{str, bArr}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void o(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(7, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void o1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(17, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void o4(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(42, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void onDeviceLost(String str) {
            c5g.this.j.obtainMessage(4, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void q3(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(12, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void s1(String str, int i) throws RemoteException {
            c5g.this.j.obtainMessage(46, new Object[]{str, Integer.valueOf(i)}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void s3(String str, int i, int i2) throws RemoteException {
            c5g.this.j.obtainMessage(51, new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void t0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(36, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void t2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(41, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void u1(String str, int i, String str2) throws RemoteException {
            c5g.this.j.obtainMessage(55, new Object[]{str, Integer.valueOf(i), str2}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void u4(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(23, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void v3(MiPlayDevice miPlayDevice) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDeviceFound: ");
            sb.append(miPlayDevice);
            c5g.this.j.obtainMessage(2, miPlayDevice).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void w(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(39, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void w1(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(16, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x0(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(27, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x1(String str, byte[] bArr) throws RemoteException {
            c5g.this.j.obtainMessage(30, new Object[]{str, bArr}).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x2(Map map) throws RemoteException {
            c5g.this.j.obtainMessage(50, map).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void x3(MiPlayDevice miPlayDevice) throws RemoteException {
            c5g.this.j.obtainMessage(3, miPlayDevice).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void z0(String str) throws RemoteException {
            c5g.this.j.obtainMessage(47, str).sendToTarget();
        }

        @Override // defpackage.tvf, defpackage.cuc
        public void z1() {
            c5g.this.j.obtainMessage(0).sendToTarget();
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            if (c5g.this.j != null) {
                c5g.this.j.obtainMessage(33).sendToTarget();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c5g.this.f4943b = buc.a.s2(iBinder);
            if (c5g.this.f4943b != null) {
                try {
                    c5g.this.f4943b.W0(c5g.this.f, c5g.this.f4944k, c5g.this.g);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public c5g(Context context) {
        this.f4942a = context;
        this.f = context.getPackageName();
    }

    public int A(String[] strArr, String str, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.F2(strArr, str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int B(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null) {
            return -1;
        }
        try {
            return bucVar.S(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int C(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.p0(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int D(String[] strArr, long j) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.n4(strArr, j);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int E(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.j2(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int F(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.Z0(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int G(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.H4(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int H(String[] strArr, long j, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.e2(strArr, j, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int I(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.y(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void J(int i) {
        buc bucVar = this.f4943b;
        if (bucVar != null) {
            if (!bucVar.asBinder().pingBinder()) {
                t(this.e, this.g);
                return;
            }
            try {
                this.c.clear();
                this.d.clear();
                this.f4943b.q4(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public int K(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.V1(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void L() {
        buc bucVar = this.f4943b;
        if (bucVar != null) {
            try {
                bucVar.stopDiscovery();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.j.obtainMessage(33).sendToTarget();
    }

    public int j() {
        buc bucVar = this.f4943b;
        if (bucVar == null) {
            return -1;
        }
        try {
            return bucVar.i();
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public MediaMetaData k() {
        buc bucVar = this.f4943b;
        if (bucVar == null) {
            return null;
        }
        try {
            return bucVar.u2();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int l(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.O2(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int m(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.y4(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int n(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("getMirrorMode:");
        sb.append(System.identityHashCode(this));
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.X0(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int o(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.A4(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int p(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.c3(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int q(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.Z3(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int r(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.W(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int s(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.n5(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public boolean t(tvf tvfVar, String str) {
        boolean z;
        synchronized (this.i) {
            this.e = tvfVar;
            this.g = str;
            Intent intent = new Intent();
            intent.setPackage("com.milink.service");
            intent.setAction("com.xiaomi.miplay.action.MIPLAY_AUDIO_CLIENT_SERVICE");
            this.h = this.f4942a.bindService(intent, this.l, Build.VERSION.SDK_INT >= 29 ? DKFRequestService.s0 : 1);
            StringBuilder sb = new StringBuilder();
            sb.append("mInited:");
            sb.append(this.h);
            z = this.h;
        }
        return z;
    }

    public boolean u(tvf tvfVar, String str, String str2) {
        boolean z;
        synchronized (this.i) {
            this.e = tvfVar;
            this.g = str;
            this.f = str2;
            StringBuilder sb = new StringBuilder();
            sb.append("initAsync: ");
            sb.append(str2);
            Intent intent = new Intent();
            intent.setPackage("com.milink.service");
            intent.setAction("com.xiaomi.miplay.action.MIPLAY_AUDIO_CLIENT_SERVICE");
            this.h = this.f4942a.bindService(intent, this.l, Build.VERSION.SDK_INT >= 29 ? DKFRequestService.s0 : 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mInited:");
            sb2.append(this.h);
            z = this.h;
        }
        return z;
    }

    public int v(String str, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null) {
            return -1;
        }
        try {
            return bucVar.b4(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int w(String str, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || str == null) {
            return -1;
        }
        try {
            return bucVar.g5(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int x(String[] strArr, int i) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.m(strArr, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int y(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null) {
            return -1;
        }
        try {
            return bucVar.d2(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int z(String[] strArr) {
        buc bucVar = this.f4943b;
        if (bucVar == null || strArr == null) {
            return -1;
        }
        try {
            return bucVar.N4(strArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
