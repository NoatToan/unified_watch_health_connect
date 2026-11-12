package com.huawei.hwdevice.phoneprocess.mgr.btproxy;

import android.os.SystemClock;
import androidx.media3.datasource.cache.CacheDataSink;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class DistributionNetworkTcpSocketIoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Delegator f17462a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f17464c;
    private boolean e;
    private ServerSocketChannel h;
    private Selector j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f17463b = ByteBuffer.allocate(CacheDataSink.DEFAULT_BUFFER_SIZE);
    private final Set<SocketChannel> g = new HashSet(16);
    private final Set<SocketChannel> d = new HashSet(16);
    private final Set<SocketChannel> i = new HashSet(16);

    public interface Delegator {
        void doAccept(SocketChannel socketChannel);

        void doClose(SocketChannel socketChannel);

        void doRead(SocketChannel socketChannel, ByteBuffer byteBuffer);

        int doWrite(SocketChannel socketChannel);
    }

    public DistributionNetworkTcpSocketIoManager(Delegator delegator) {
        this.f17462a = delegator;
    }

    public void a(SocketChannel socketChannel) {
        synchronized (this.g) {
            this.g.add(socketChannel);
        }
        Selector selector = this.j;
        if (selector != null) {
            selector.wakeup();
        }
    }

    public void b(SocketChannel socketChannel) {
        synchronized (this.d) {
            this.d.add(socketChannel);
        }
        Selector selector = this.j;
        if (selector != null) {
            selector.wakeup();
        }
    }

    public void c(SocketChannel socketChannel) {
        synchronized (this.i) {
            this.i.add(socketChannel);
        }
        Selector selector = this.j;
        if (selector != null) {
            selector.wakeup();
        }
    }

    public void b() {
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Shutdown requested");
        this.f17464c = false;
        Selector selector = this.j;
        if (selector != null) {
            selector.wakeup();
        }
    }

    public void d() throws IOException {
        this.f17464c = true;
        this.j = SelectorProvider.provider().openSelector();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
        ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
        this.h = serverSocketChannelOpen;
        serverSocketChannelOpen.configureBlocking(false);
        this.h.socket().bind(inetSocketAddress);
        this.h.register(this.j, 16);
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Listening for TCP sockets at ", this.h.socket());
    }

    public void a() throws IOException {
        ServerSocketChannel serverSocketChannel = this.h;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException unused) {
                LogUtil.c("IOException", new Object[0]);
            }
            this.h = null;
        }
        this.j.close();
    }

    public void e() throws ClosedSelectorException, IOException {
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Tcp relaying thread started, entering into select loop");
        while (this.f17464c) {
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "enter running tcp loop");
            this.e = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.j.select();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            Iterator<SelectionKey> it = this.j.selectedKeys().iterator();
            synchronized (this.j.selectedKeys()) {
                a(it);
            }
            if (i()) {
                this.e = true;
            }
            if (j()) {
                this.e = true;
            }
            if (c()) {
                this.e = true;
            }
            if (this.e) {
                LogUtil.a("DistributionNetworkTcpSocketIoManager", "Select completed in ", Long.valueOf(jElapsedRealtime2), " ms");
            } else {
                LogUtil.a("DistributionNetworkTcpSocketIoManager", "Select completed in ", Long.valueOf(jElapsedRealtime2), " ms and ", "resulted in no work performed ", Integer.valueOf(this.j.keys().size()));
            }
        }
        b(this.h);
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Loop exited");
    }

    private void a(Iterator<SelectionKey> it) {
        while (it.hasNext()) {
            SelectionKey next = it.next();
            if (!next.isValid()) {
                LogUtil.d("DistributionNetworkTcpSocketIoManager", "key is Invalid");
                it.remove();
            } else {
                try {
                    if (next.isConnectable()) {
                        e(next);
                        it.remove();
                        this.e = true;
                    } else if (next.isAcceptable()) {
                        d(next);
                        it.remove();
                        this.e = true;
                    } else {
                        e(it, next);
                    }
                } catch (IOException unused) {
                    LogUtil.c("DistributionNetworkTcpSocketIoManager", "Error during operating socket channels");
                    a(next);
                }
            }
        }
    }

    private void e(Iterator<SelectionKey> it, SelectionKey selectionKey) throws IOException {
        if (selectionKey.isReadable()) {
            if (b(selectionKey) == 0) {
                it.remove();
            }
            this.e = true;
        } else {
            if (selectionKey.isWritable()) {
                if (c(selectionKey) == 0) {
                    it.remove();
                }
                this.e = true;
                return;
            }
            it.remove();
        }
    }

    private boolean c() {
        ArrayList arrayList = new ArrayList(16);
        synchronized (this.g) {
            arrayList.addAll(this.g);
            this.g.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e((SocketChannel) it.next());
        }
        return !arrayList.isEmpty();
    }

    private boolean i() throws IOException {
        ArrayList arrayList = new ArrayList(16);
        synchronized (this.d) {
            arrayList.addAll(this.d);
            this.d.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SocketChannel) it.next()).register(this.j, 8);
        }
        if (!arrayList.isEmpty()) {
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Registered ", Integer.valueOf(arrayList.size()), " connecting channels");
        }
        return !arrayList.isEmpty();
    }

    private boolean j() throws IOException {
        ArrayList arrayList = new ArrayList(16);
        synchronized (this.i) {
            arrayList.addAll(this.i);
            this.i.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SelectionKey selectionKeyKeyFor = ((SocketChannel) it.next()).keyFor(this.j);
            if (selectionKeyKeyFor != null && selectionKeyKeyFor.isValid()) {
                selectionKeyKeyFor.interestOps(selectionKeyKeyFor.interestOps() | 4);
            }
        }
        if (!arrayList.isEmpty()) {
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Registered ", Integer.valueOf(arrayList.size()), " writing channels");
        }
        return !arrayList.isEmpty();
    }

    private void b(SelectableChannel selectableChannel) {
        for (SelectionKey selectionKey : this.j.keys()) {
            if (selectionKey.channel() != selectableChannel && selectionKey.channel().isOpen()) {
                a(selectionKey);
            }
        }
    }

    private void e(SelectionKey selectionKey) throws IOException {
        if (!((SocketChannel) selectionKey.channel()).finishConnect()) {
            a(selectionKey);
        } else {
            selectionKey.interestOps((selectionKey.interestOps() & (-9)) | 1);
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Channel connected");
        }
    }

    private void d(SelectionKey selectionKey) throws IOException {
        SocketChannel socketChannelAccept = ((ServerSocketChannel) selectionKey.channel()).accept();
        socketChannelAccept.configureBlocking(false);
        socketChannelAccept.socket().setTcpNoDelay(true);
        socketChannelAccept.register(this.j, 1);
        this.f17462a.doAccept(socketChannelAccept);
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Accepted connection");
    }

    private int b(SelectionKey selectionKey) throws IOException {
        if (!(selectionKey.channel() instanceof SocketChannel)) {
            return -1;
        }
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        this.f17463b.clear();
        int i = socketChannel.read(this.f17463b);
        if (i == -1) {
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Channel has reached end-of-stream, closing");
            a(selectionKey);
            return i;
        }
        this.f17463b.flip();
        this.f17462a.doRead(socketChannel, this.f17463b);
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "Read ", Integer.valueOf(i), " bytes");
        return i;
    }

    private int c(SelectionKey selectionKey) {
        LogUtil.a("DistributionNetworkTcpSocketIoManager", "enterDoWrite");
        if (!(selectionKey.channel() instanceof SocketChannel)) {
            return -1;
        }
        int iDoWrite = this.f17462a.doWrite((SocketChannel) selectionKey.channel());
        if (iDoWrite == 0) {
            selectionKey.interestOps(selectionKey.interestOps() & (-5));
        }
        if (iDoWrite != 0) {
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Wrote ", Integer.valueOf(iDoWrite), " bytes");
            return iDoWrite;
        }
        LogUtil.d("DistributionNetworkTcpSocketIoManager", "No bytes written: losing interest in channel write ability");
        return iDoWrite;
    }

    private void e(SocketChannel socketChannel) {
        try {
            this.f17462a.doClose(socketChannel);
            socketChannel.close();
            LogUtil.a("DistributionNetworkTcpSocketIoManager", "Closed channel");
        } catch (IOException unused) {
            LogUtil.c("DistributionNetworkTcpSocketIoManager", "Failed to close channel ");
        }
    }

    private void a(SelectionKey selectionKey) {
        selectionKey.cancel();
        SelectableChannel selectableChannelChannel = selectionKey.channel();
        if (!(selectableChannelChannel instanceof SocketChannel)) {
            try {
                LogUtil.a("DistributionNetworkTcpSocketIoManager", "channel close");
                selectableChannelChannel.close();
                return;
            } catch (IOException unused) {
                LogUtil.c("DistributionNetworkTcpSocketIoManager", "Failed to close non-socket channel");
                return;
            }
        }
        e((SocketChannel) selectableChannelChannel);
    }
}
