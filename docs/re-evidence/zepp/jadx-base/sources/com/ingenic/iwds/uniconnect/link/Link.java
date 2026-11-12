package com.ingenic.iwds.uniconnect.link;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.IwdsApplication;
import com.ingenic.iwds.uniconnect.Connection;
import com.ingenic.iwds.uniconnect.ConnectionService;
import com.ingenic.iwds.uniconnect.ConnectionServiceManager;
import com.ingenic.iwds.uniconnect.IConnectionCallBack;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import com.ingenic.iwds.utils.serializable.ParcelableUtils;
import com.xiaomi.hm.health.bt.device.Status;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class Link {
    private LinkManager a;
    private String b;
    private String d;
    private DeviceDescriptor f;
    private DeviceDescriptor g;
    private Connection h;
    private HandlerThread j;
    private HandlerThread k;
    private c l;
    private b m;
    private boolean c = false;
    private boolean e = false;
    private String i = "{THIS-IS-GOD-MASTER}";
    private int n = 0;
    private IConnectionCallBack o = new a();

    public static class LinkState {
        public static final int STATE_CONNECTED = 1;
        public static final int STATE_DISCONNECTED = 0;

        public static String a(int i) {
            if (i == 0) {
                return "disconnected";
            }
            if (i == 1) {
                return Status.PRE_CONNECT_STATE_CONNECTED;
            }
            IwdsAssert.dieIf("LinkState", true, "Implement me.");
            return null;
        }
    }

    public class a extends IConnectionCallBack.Stub {
        public a() {
        }

        @Override // com.ingenic.iwds.uniconnect.IConnectionCallBack
        public void stateChanged(int i, int i2) throws RemoteException {
        }
    }

    public class b extends Handler {
        private DataInputStream a;
        private DataOutputStream b;
        private byte[] c;

        public b(Looper looper) {
            super(looper);
            this.c = ParcelableUtils.marshall(Link.this.f);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    byte[] bArr = new byte[this.a.readInt()];
                    this.a.read(bArr);
                    Link.this.g = (DeviceDescriptor) ParcelableUtils.unmarshall(bArr, DeviceDescriptor.CREATOR);
                    Message.obtain(this, 1).sendToTarget();
                    return;
                } catch (IOException unused) {
                    this.b = null;
                    this.a = null;
                    Link.this.h.close();
                    return;
                }
            }
            if (i == 1) {
                try {
                    this.b.writeInt(this.c.length);
                    this.b.write(this.c);
                    Message.obtain(this, 2).sendToTarget();
                    IwdsLog.i(this, "Send local device descriptor: " + Link.this.f.toString());
                    return;
                } catch (IOException unused2) {
                    this.b = null;
                    this.a = null;
                    Link.this.h.close();
                    return;
                }
            }
            if (i == 2) {
                if (Link.this.g != null) {
                    IwdsLog.i(this, "Connect to remote device: " + Link.this.g.toString());
                    Link.this.d(1);
                    RemoteDeviceDescriptorStorage.getInstance().addDeviceDescriptors(Link.this.g);
                    Intent intent = new Intent(ConnectionServiceManager.ACTION_CONNECTED_ADDRESS);
                    intent.putExtra("DeviceDescriptor", Link.this.g);
                    Link.this.a.d().sendBroadcast(intent);
                }
                this.b = null;
                this.a = null;
                Link.this.h.close();
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    Link.this.k.quit();
                    return;
                }
                if (i == 5 && Link.this.h.open((String) message.obj, Link.this.i) >= 0) {
                    if (Link.this.h.handshake() < 0) {
                        Link.this.h.close();
                        return;
                    }
                    this.a = new DataInputStream(Link.this.h.getInputStream());
                    this.b = new DataOutputStream(Link.this.h.getOutputStream());
                    Message.obtain(this, 0).sendToTarget();
                    return;
                }
                return;
            }
            if (Link.this.g != null) {
                IwdsLog.i(this, "Disconnect from remote device: " + Link.this.g.toString());
                Link.this.d(0);
                RemoteDeviceDescriptorStorage.getInstance().removeDeviceDescriptor(Link.this.g);
                Intent intent2 = new Intent(ConnectionServiceManager.ACTION_DISCONNECTED_ADDRESS);
                intent2.putExtra("DeviceDescriptor", Link.this.g);
                Link.this.a.d().sendBroadcast(intent2);
                Link.this.g = null;
            }
        }
    }

    public class c extends Handler {
        private DataInputStream a;
        private DataOutputStream b;
        private byte[] c;

        public c(Looper looper) {
            super(looper);
            this.c = ParcelableUtils.marshall(Link.this.f);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.b.writeInt(this.c.length);
                    this.b.write(this.c);
                    Message.obtain(this, 1).sendToTarget();
                    IwdsLog.i(this, "Send local device descriptor: " + Link.this.f.toString());
                    return;
                } catch (IOException unused) {
                    this.b = null;
                    this.a = null;
                    Link.this.h.close();
                    return;
                }
            }
            if (i == 1) {
                try {
                    byte[] bArr = new byte[this.a.readInt()];
                    this.a.read(bArr);
                    DeviceDescriptor deviceDescriptor = (DeviceDescriptor) ParcelableUtils.unmarshall(bArr, DeviceDescriptor.CREATOR);
                    if ("02:00:00:00:00:00".equals(deviceDescriptor.devAddress)) {
                        deviceDescriptor.devAddress = Link.this.a.j(Link.this.b);
                    }
                    Link.this.g = deviceDescriptor;
                    Message.obtain(this, 2).sendToTarget();
                    return;
                } catch (IOException unused2) {
                    this.b = null;
                    this.a = null;
                    Link.this.h.close();
                    return;
                }
            }
            if (i == 2) {
                if (Link.this.g != null) {
                    IwdsLog.i(this, "Connect to remote device: " + Link.this.g.toString());
                    Link.this.d(1);
                    RemoteDeviceDescriptorStorage.getInstance().addDeviceDescriptors(Link.this.g);
                    Intent intent = new Intent(ConnectionServiceManager.ACTION_CONNECTED_ADDRESS);
                    intent.putExtra("DeviceDescriptor", Link.this.g);
                    Link.this.a.d().sendBroadcast(intent);
                }
                this.b = null;
                this.a = null;
                Link.this.h.close();
                return;
            }
            if (i == 3) {
                if (Link.this.g != null) {
                    IwdsLog.i(this, "Disconnect from remote device: " + Link.this.g.toString());
                    Link.this.d(0);
                    RemoteDeviceDescriptorStorage.getInstance().removeDeviceDescriptor(Link.this.g);
                    Intent intent2 = new Intent(ConnectionServiceManager.ACTION_DISCONNECTED_ADDRESS);
                    intent2.putExtra("DeviceDescriptor", Link.this.g);
                    Link.this.a.d().sendBroadcast(intent2);
                    Link.this.g = null;
                    return;
                }
                return;
            }
            if (i == 4) {
                Link.this.j.quit();
                return;
            }
            if (i == 5 && Link.this.h.open((String) message.obj, Link.this.i) >= 0) {
                int iHandshake = Link.this.h.handshake();
                if (iHandshake >= 0) {
                    this.a = new DataInputStream(Link.this.h.getInputStream());
                    this.b = new DataOutputStream(Link.this.h.getOutputStream());
                    Message.obtain(this, 0).sendToTarget();
                } else {
                    Link.this.h.close();
                    if (iHandshake == -11) {
                        Link.this.c();
                    }
                }
            }
        }
    }

    public Link(LinkManager linkManager, DeviceDescriptor deviceDescriptor, String str) {
        this.a = linkManager;
        this.f = deviceDescriptor;
        this.b = str;
        this.h = new Connection(linkManager.d(), new ConnectionService.ConnectionStub(this.o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) IwdsApplication.getAppContext().getSystemService("power")).newWakeLock(1, getClass().getName());
        IwdsLog.d(this, "Hold wake lock to avoid system sleeping when restart adapter.");
        wakeLockNewWakeLock.acquire(20000L);
        IwdsLog.w(this, "Restarting adapter...");
        Adapter adapter = this.a.h().getAdapter(this.b);
        adapter.disable();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adapter.enable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        synchronized (this) {
            try {
                if (i == 1) {
                    this.n = 1;
                } else {
                    this.n = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(String str) {
        Message messageObtain = isRoleAsClientSide() ? Message.obtain(this.m, 5) : Message.obtain(this.l, 5);
        messageObtain.obj = str;
        messageObtain.sendToTarget();
    }

    private void i() {
        if (isRoleAsClientSide()) {
            Message.obtain(this.m, 3).sendToTarget();
        } else {
            Message.obtain(this.l, 3).sendToTarget();
        }
    }

    public boolean bondAddress(String str) {
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "Address is null or empty.");
        IwdsAssert.dieIf(this, this.e, "Client or server already started(Unboned or stop server first)");
        if (!this.a.c(this.b, str)) {
            return false;
        }
        this.c = true;
        this.d = str;
        this.e = true;
        HandlerThread handlerThread = new HandlerThread("client handler");
        this.k = handlerThread;
        handlerThread.start();
        this.m = new b(this.k.getLooper());
        return true;
    }

    public void e(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLinkStateChanged: State: ");
        sb.append(LinkState.a(i));
        sb.append(", Role: ");
        sb.append(isRoleAsClientSide() ? OpenSdkPlayStatisticUpload.KEY_CLIENT : "server");
        sb.append(", Tag: ");
        sb.append(this.b);
        sb.append(", Address: ");
        sb.append(str);
        IwdsLog.i(this, sb.toString());
        if (i == 1) {
            g(str);
        } else if (i == 0) {
            i();
        }
    }

    public String getBondedAddress() {
        return isRoleAsClientSide() ? this.d : this.a.j(this.b);
    }

    public Context getContext() {
        return this.a.d();
    }

    public int getState() {
        int i;
        synchronized (this) {
            i = this.n;
        }
        return i;
    }

    public String getTag() {
        return this.b;
    }

    public boolean isBonded() {
        if (this.c) {
            return this.e;
        }
        return false;
    }

    public boolean isRoleAsClientSide() {
        return this.c;
    }

    public boolean isServerStarted() {
        if (this.c) {
            return false;
        }
        return this.e;
    }

    public boolean startServer() {
        IwdsAssert.dieIf(this, this.e, "Client or server already started(Unboned or stop server first)");
        if (!this.a.g(this.b)) {
            return false;
        }
        this.c = false;
        this.e = true;
        HandlerThread handlerThread = new HandlerThread("Server handler");
        this.j = handlerThread;
        handlerThread.start();
        this.l = new c(this.j.getLooper());
        return true;
    }

    public void stopServer() {
        IwdsAssert.dieIf(this, isRoleAsClientSide(), "Caller must role as server side.");
        this.a.i(this.b);
        Message.obtain(this.l, 4).sendToTarget();
        this.e = false;
    }

    public void unbond() {
        IwdsAssert.dieIf(this, !isRoleAsClientSide(), "Link must role as client side.");
        this.a.e(this.d);
        Message.obtain(this.m, 4).sendToTarget();
        this.e = false;
    }
}
