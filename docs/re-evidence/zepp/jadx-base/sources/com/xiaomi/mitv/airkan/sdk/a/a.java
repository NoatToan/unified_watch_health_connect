package com.xiaomi.mitv.airkan.sdk.a;

import android.text.TextUtils;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static int h = -11;
    private static int i = -12;
    private static int j = -13;
    private static int k = -14;
    private static int l = -21;
    private static int m = -22;
    private SocketChannel a;
    private String b;
    private InterfaceC1044a d;
    private volatile AtomicBoolean e = new AtomicBoolean(false);
    private volatile AtomicBoolean f = new AtomicBoolean(false);
    private volatile AtomicBoolean g = new AtomicBoolean(false);
    private int c = 6093;

    /* JADX INFO: renamed from: com.xiaomi.mitv.airkan.sdk.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1044a {
        void a();

        void b();

        void c();
    }

    public a(String str, int i2) {
        this.b = str;
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.a = socketChannelOpen;
            socketChannelOpen.configureBlocking(true);
        } catch (Exception e) {
            Logger.w("open channel failed", new Object[0]);
            e.printStackTrace();
        }
    }

    private void b(int i2) {
        if (this.f.compareAndSet(false, true)) {
            Logger.d("connect error:" + this.b, new Object[0]);
        }
    }

    private void c(InterfaceC1044a interfaceC1044a) {
        this.d = interfaceC1044a;
    }

    private static boolean d(String str, int i2) {
        return e(new InetSocketAddress(str, i2));
    }

    private static boolean e(InetSocketAddress inetSocketAddress) {
        Socket socket = new Socket();
        try {
            try {
                socket.connect(inetSocketAddress, 3000);
                try {
                    socket.close();
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                    return true;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (IOException unused) {
            socket.close();
            return false;
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }

    private void f(int i2) {
        Logger.d("connect error:" + this.b, new Object[0]);
    }

    private int g() {
        return this.c;
    }

    private void h() {
        if (this.e.compareAndSet(false, true)) {
            Logger.d(" connect create :" + toString(), new Object[0]);
        }
    }

    private void i() {
        if (this.f.compareAndSet(false, true) && this.e.get()) {
            Logger.d("connect remove:" + toString(), new Object[0]);
        }
    }

    private void j() {
        Logger.d(" connect create :" + toString(), new Object[0]);
    }

    private void k() {
        Logger.d("connect remove:" + toString(), new Object[0]);
    }

    private String l() {
        SocketChannel socketChannel = this.a;
        String hostAddress = socketChannel != null ? socketChannel.socket().getLocalAddress().getHostAddress() : null;
        SocketChannel socketChannel2 = this.a;
        return "local(" + hostAddress + ":" + (socketChannel2 != null ? socketChannel2.socket().getLocalPort() : 0) + ")";
    }

    private String m() {
        return "remote(" + this.b + ":" + this.c + ")";
    }

    public final int a() {
        Logger.i("connect called", new Object[0]);
        SocketChannel socketChannel = this.a;
        if (socketChannel == null) {
            b(-11);
            return -11;
        }
        if (!socketChannel.isOpen()) {
            b(-12);
            return -12;
        }
        if (this.a.isConnected()) {
            Logger.d("has connected,directly return", new Object[0]);
            return 0;
        }
        if (TextUtils.isEmpty(this.b)) {
            b(-14);
            return -14;
        }
        try {
            this.a.connect(new InetSocketAddress(this.b, this.c));
            this.g.compareAndSet(false, true);
            if (this.e.compareAndSet(false, true)) {
                Logger.d(" connect create :" + toString(), new Object[0]);
            }
            return 0;
        } catch (Exception e) {
            Logger.w("Unexpected exception,connect failed :%s", e.getMessage());
            b(-13);
            return -13;
        }
    }

    public final long a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            return a(byteBuffer);
        }
        Logger.d("data is null", new Object[0]);
        return 0L;
    }

    public final long a(ByteBuffer... byteBufferArr) {
        try {
            if (!this.g.get()) {
                Logger.d("not connected,send failed", new Object[0]);
                return -21L;
            }
            if (byteBufferArr.length == 0) {
                Logger.d("data is empty,send failed", new Object[0]);
                return 0L;
            }
            int iRemaining = 0;
            for (int i2 = 0; i2 < byteBufferArr.length; i2++) {
                iRemaining += byteBufferArr[i2] != null ? byteBufferArr[i2].remaining() : 0;
            }
            Logger.d("start send,count:%s", Integer.valueOf(iRemaining));
            long jWrite = byteBufferArr.length == 1 ? this.a.write(byteBufferArr[0]) : this.a.write(byteBufferArr);
            Logger.d("send done:" + jWrite, new Object[0]);
            return jWrite;
        } catch (AsynchronousCloseException unused) {
            Logger.w("Unexpected AsynchronousClose exception,send failed", new Object[0]);
            b();
            return -22L;
        } catch (ClosedChannelException unused2) {
            Logger.w("Unexpected Close exception,send failed", new Object[0]);
            b();
            return -22L;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.w("Unexpected write exception,send failed", new Object[0]);
            return -22L;
        }
    }

    public final int b() {
        try {
            if (this.a != null) {
                Logger.i("close", new Object[0]);
                if (this.f.compareAndSet(false, true) && this.e.get()) {
                    Logger.d("connect remove:" + toString(), new Object[0]);
                }
                this.a.close();
                this.a = null;
            }
        } catch (Exception e) {
            Logger.d("close error", new Object[0]);
            e.printStackTrace();
        }
        this.g.compareAndSet(true, false);
        return 0;
    }

    public final boolean c() {
        return this.g.get();
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connect{");
        SocketChannel socketChannel = this.a;
        String hostAddress = socketChannel != null ? socketChannel.socket().getLocalAddress().getHostAddress() : null;
        SocketChannel socketChannel2 = this.a;
        sb.append("local(" + hostAddress + ":" + (socketChannel2 != null ? socketChannel2.socket().getLocalPort() : 0) + ")");
        sb.append(" => ");
        sb.append("remote(" + this.b + ":" + this.c + ")");
        sb.append('}');
        return sb.toString();
    }
}
