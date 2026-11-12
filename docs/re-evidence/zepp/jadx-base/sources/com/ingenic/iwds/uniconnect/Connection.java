package com.ingenic.iwds.uniconnect;

import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.exception.IwdsException;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class Connection {
    private Context a;
    private IConnection c;
    private String d;
    private String e;
    private InputStream g;
    private OutputStream h;
    private int b = -1;
    private long f = -1;
    private boolean i = true;

    public Connection(Context context, IConnection iConnection) {
        IwdsAssert.dieIf(this, context == null, "Context is null.");
        IwdsAssert.dieIf(this, iConnection == null, "Connection is null.");
        synchronized (this) {
            this.a = context;
            this.c = iConnection;
            this.g = new a(this);
            this.h = new b(this);
        }
    }

    public int available() {
        try {
            return this.c.available();
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in available: " + e);
            return -4;
        }
    }

    public void close() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            try {
                this.c.close();
                this.f = -1L;
                this.i = true;
            } catch (RemoteException e) {
                IwdsLog.e(this, "Exception in close: " + e);
            }
        }
    }

    public String getAddress() {
        String str;
        synchronized (this) {
            str = this.d;
        }
        return str;
    }

    public int getDataChunkSize() {
        return this.b;
    }

    public InputStream getInputStream() {
        return this.g;
    }

    public OutputStream getOutputStream() {
        return this.h;
    }

    public long getPort() {
        long j;
        synchronized (this) {
            j = this.f;
        }
        return j;
    }

    public String getUUID() {
        String str;
        synchronized (this) {
            str = this.e;
        }
        return str;
    }

    public int handshake() {
        try {
            return this.c.handshake();
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in handshake: " + e);
            return -4;
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public int open(DeviceDescriptor deviceDescriptor, String str) {
        IwdsAssert.dieIf(this, deviceDescriptor == null, "Device descriptor is null.");
        return open(deviceDescriptor.devAddress, str);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IwdsAssert.dieIf(this, bArr == null || (i | i2) < 0 || bArr.length < i + i2, "Buffer is null or buffer exceed.");
        while (i2 > 0) {
            try {
                int i4 = this.c.read(bArr, i, Math.min(i2, this.b));
                if (i4 < 0) {
                    return i3 > 0 ? i3 : i4;
                }
                i3 += i4;
                i += i4;
                i2 -= i4;
            } catch (RemoteException e) {
                IwdsLog.e(this, "Exception in read: " + e);
                if (i3 > 0) {
                    return i3;
                }
                return -4;
            }
        }
        return i3;
    }

    public int write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IwdsAssert.dieIf(this, bArr == null || (i | i2) < 0 || bArr.length < i + i2, "Buffer is null or buffer exceed.");
        while (i2 > 0) {
            try {
                int iWrite = this.c.write(bArr, i, Math.min(i2, this.b));
                if (iWrite < 0) {
                    return i3 > 0 ? i3 : iWrite;
                }
                i3 += iWrite;
                i += iWrite;
                i2 -= iWrite;
            } catch (RemoteException e) {
                IwdsLog.e(this, "Exception in write: " + e);
                if (i3 > 0) {
                    return i3;
                }
                return -4;
            }
        }
        return i3;
    }

    public static final class b extends OutputStream {
        private Connection a;

        public b(Connection connection) {
            this.a = connection;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = {(byte) i};
            int iWrite = 0;
            while (iWrite != 1) {
                iWrite = this.a.write(bArr, 0, 1);
                if (iWrite < 0) {
                    IwdsException.throwUniconnectIOException(iWrite);
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            while (i2 > 0) {
                int iWrite = this.a.write(bArr, i, i2);
                if (iWrite < 0) {
                    IwdsException.throwUniconnectIOException(iWrite);
                }
                i += iWrite;
                i2 -= iWrite;
            }
        }
    }

    public static final class a extends InputStream {
        private Connection a;

        public a(Connection connection) {
            this.a = connection;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            int iAvailable = this.a.available();
            if (iAvailable < 0) {
                IwdsException.throwUniconnectIOException(iAvailable);
            }
            return iAvailable;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = new byte[1];
            int i = 0;
            while (i != 1) {
                i = this.a.read(bArr, 0, 1);
                if (i < 0) {
                    IwdsException.throwUniconnectIOException(i);
                }
            }
            return bArr[0] & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.a.read(bArr, i, i2);
            if (i3 < 0) {
                IwdsException.throwUniconnectIOException(i3);
            }
            return i3;
        }
    }

    public int open(String str, String str2) {
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "Address is null or empty.");
        IwdsAssert.dieIf(this, str2 == null || str2.isEmpty(), "Uuid is null or empty.");
        IwdsAssert.dieIf(this, (str2.matches("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}") || str2.equals("{THIS-IS-GOD-MASTER}")) ? false : true, "Invalid UUID: " + str2 + "(need a 8-4-4-4-12 style UUID).");
        synchronized (this) {
            if (!this.i) {
                return 0;
            }
            this.d = str;
            this.e = str2;
            try {
                long jOpen = this.c.open(this.a.getPackageName(), Process.myPid(), str, this.e);
                if (jOpen < 0) {
                    return (int) jOpen;
                }
                this.b = this.c.getMaxPayloadSize();
                this.f = jOpen;
                this.i = false;
                return 0;
            } catch (RemoteException e) {
                IwdsLog.e(this, "Exception in open: " + e);
                return -4;
            }
        }
    }
}
