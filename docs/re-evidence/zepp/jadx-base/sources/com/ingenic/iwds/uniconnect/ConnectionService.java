package com.ingenic.iwds.uniconnect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.uniconnect.link.RemoteDeviceDescriptorStorage;
import com.ingenic.iwds.utils.IwdsLog;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectionService extends Service {
    private b a = new b();

    public static class ConnectionStub extends IConnection.Stub implements IBinder.DeathRecipient {
        private ByteBuffer b;
        private ByteBuffer c;
        private String d;
        private long e = -1;
        private Object f = new Object();
        private IConnectionCallBack g;

        public ConnectionStub(IConnectionCallBack iConnectionCallBack) {
            this.g = iConnectionCallBack;
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public int available() throws RemoteException {
            synchronized (this.f) {
                String str = this.d;
                long j = this.e;
                if (j == -1) {
                    return -5;
                }
                return ConnectionService.nativeAvailable(str, j);
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (this.f) {
                long j = this.e;
                if (j >= 0) {
                    ConnectionService.nativeDestroyConnection(this.d, j);
                    this.d = null;
                    this.e = -1L;
                }
                this.b = null;
                this.c = null;
                this.f = null;
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public void close() throws RemoteException {
            synchronized (this.f) {
                long j = this.e;
                if (j >= 0) {
                    ConnectionService.nativeDestroyConnection(this.d, j);
                    this.g.asBinder().unlinkToDeath(this, 0);
                    this.d = null;
                    this.e = -1L;
                }
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public int getMaxPayloadSize() throws RemoteException {
            synchronized (this.f) {
                String str = this.d;
                long j = this.e;
                if (j == -1) {
                    return -5;
                }
                return ConnectionService.nativeGetMaxPayloadSize(str, j);
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public int handshake() throws RemoteException {
            synchronized (this.f) {
                String str = this.d;
                long j = this.e;
                if (j == -1) {
                    return -5;
                }
                return ConnectionService.nativeHandshake(str, j);
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public long open(String str, int i, String str2, String str3) throws RemoteException {
            synchronized (this.f) {
                this.d = str2;
                long jNativeCreateConnectionByUuid = ConnectionService.nativeCreateConnectionByUuid(str, i, str2, str3.toLowerCase(Locale.ENGLISH), this.g);
                this.e = jNativeCreateConnectionByUuid;
                if (jNativeCreateConnectionByUuid >= 0) {
                    int iNativeGetMaxPayloadSize = ConnectionService.nativeGetMaxPayloadSize(this.d, jNativeCreateConnectionByUuid);
                    if (iNativeGetMaxPayloadSize < 0) {
                        return iNativeGetMaxPayloadSize;
                    }
                    allocReadBuffer(iNativeGetMaxPayloadSize);
                    this.b = ByteBuffer.allocateDirect(iNativeGetMaxPayloadSize);
                    this.c = ByteBuffer.allocateDirect(iNativeGetMaxPayloadSize + 10);
                    this.g.asBinder().linkToDeath(this, 0);
                }
                return this.e;
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public int read(byte[] bArr, int i, int i2) throws RemoteException {
            int iNativeRead;
            synchronized (this.f) {
                String str = this.d;
                long j = this.e;
                if (j == -1) {
                    return -5;
                }
                synchronized (this.b) {
                    iNativeRead = ConnectionService.nativeRead(str, j, this.b, 0, i2);
                    if (iNativeRead >= 0) {
                        this.b.get(bArr, i, iNativeRead);
                        this.b.clear();
                    }
                }
                return iNativeRead;
            }
        }

        @Override // com.ingenic.iwds.uniconnect.IConnection
        public int write(byte[] bArr, int i, int i2) throws RemoteException {
            int iNativeWrite;
            synchronized (this.f) {
                String str = this.d;
                long j = this.e;
                if (j == -1) {
                    return -5;
                }
                synchronized (this.c) {
                    this.c.position(10);
                    this.c.put(bArr, i, i2);
                    iNativeWrite = ConnectionService.nativeWrite(str, j, this.c, 10, i2);
                }
                return iNativeWrite;
            }
        }
    }

    public class b extends IConnectionService.Stub {
        private b() {
        }

        @Override // com.ingenic.iwds.uniconnect.IConnectionService
        public IConnection createConnection(IConnectionCallBack iConnectionCallBack) throws RemoteException {
            return new ConnectionStub(iConnectionCallBack);
        }

        @Override // com.ingenic.iwds.uniconnect.IConnectionService
        public DeviceDescriptor[] getConnectedDeviceDescriptors() throws RemoteException {
            return RemoteDeviceDescriptorStorage.getInstance().getDeviceDescriptorsArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeAvailable(String str, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeCreateConnectionByUuid(String str, int i, String str2, String str3, IConnectionCallBack iConnectionCallBack);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeDestroyConnection(String str, long j);

    private static final native int nativeFlush(String str, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetMaxPayloadSize(String str, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeHandshake(String str, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeRead(String str, long j, ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeWrite(String str, long j, ByteBuffer byteBuffer, int i, int i2);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind()");
        return this.a;
    }
}
