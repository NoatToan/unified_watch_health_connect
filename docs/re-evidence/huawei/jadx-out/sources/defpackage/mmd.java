package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class mmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile boolean f41911a;
    private Selector i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleArrayMap<e, DatagramChannel> f41913c = new SimpleArrayMap<>(8);
    private final SimpleArrayMap<DatagramChannel, e> e = new SimpleArrayMap<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<DatagramChannel> f41912b = new HashSet(16);
    private final Object g = new Object();
    private final ByteBuffer d = ByteBuffer.allocateDirect(65535);
    private long j = -1;

    public long e() {
        return this.j;
    }

    public void d(long j) {
        if (this.j > 0) {
            this.j = j;
        }
    }

    public void b(int i) throws IOException {
        LogUtil.a("UdpRelayingManager", "enter setup");
        d(i);
        this.i = SelectorProvider.provider().openSelector();
        this.f41911a = true;
    }

    public void d() {
        this.f41911a = false;
        Selector selector = this.i;
        if (selector != null) {
            selector.wakeup();
        }
    }

    public void c() {
        synchronized (this.g) {
            this.f41913c.clear();
            this.e.clear();
        }
        try {
            Selector selector = this.i;
            if (selector != null) {
                selector.close();
            }
        } catch (IOException unused) {
            Log.e("UdpRelayingManager", "UdpRelayingThread exception");
        }
    }

    public DatagramChannel b(String str, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        DatagramChannel datagramChannel;
        e eVar = new e(str, inetSocketAddress, inetSocketAddress2);
        synchronized (this.g) {
            datagramChannel = this.f41913c.get(eVar);
        }
        if (datagramChannel != null) {
            return datagramChannel;
        }
        DatagramChannel datagramChannelOpen = DatagramChannel.open();
        datagramChannelOpen.connect(inetSocketAddress2);
        datagramChannelOpen.configureBlocking(false);
        synchronized (this.f41912b) {
            this.f41912b.add(datagramChannelOpen);
        }
        synchronized (this.g) {
            this.f41913c.put(eVar, datagramChannelOpen);
            this.e.put(datagramChannelOpen, eVar);
        }
        Selector selector = this.i;
        if (selector != null) {
            selector.wakeup();
        }
        return datagramChannelOpen;
    }

    public void a() throws ClosedSelectorException, IOException {
        Selector selector;
        while (this.f41911a && (selector = this.i) != null) {
            selector.select();
            Iterator<SelectionKey> it = this.i.selectedKeys().iterator();
            synchronized (this.i.selectedKeys()) {
                a(it);
            }
        }
        b();
        LogUtil.a("UdpRelayingManager", "Loop exited");
    }

    private void a(Iterator<SelectionKey> it) throws ClosedChannelException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
        boolean z = false;
        while (it.hasNext()) {
            SelectionKey next = it.next();
            if (!next.isValid()) {
                it.remove();
            } else {
                try {
                    if (next.isReadable()) {
                        if (b(next) == 0) {
                            it.remove();
                        }
                        z = true;
                    } else {
                        LogUtil.a("UdpRelayingManager", "key is unreadable");
                        it.remove();
                    }
                } catch (IOException unused) {
                    LogUtil.c("UdpRelayingManager", "Unable to read from the selected datagram channel");
                    c(next);
                }
            }
        }
        if (j() || z) {
            LogUtil.a("UdpRelayingManager", "Select completed in ", Long.valueOf(jElapsedRealtime), " ms");
        } else {
            LogUtil.a("UdpRelayingManager", "Select completed in ", Long.valueOf(jElapsedRealtime), " ms and ", "resulted in no work performed ", Integer.valueOf(this.i.keys().size()));
        }
    }

    private int b(SelectionKey selectionKey) throws IOException {
        e eVar;
        SelectableChannel selectableChannelChannel = selectionKey.channel();
        if (!(selectableChannelChannel instanceof DatagramChannel)) {
            return -1;
        }
        DatagramChannel datagramChannel = (DatagramChannel) selectableChannelChannel;
        synchronized (this.g) {
            eVar = this.e.get(datagramChannel);
        }
        if (eVar == null) {
            LogUtil.d("UdpRelayingManager", "Reading a channel not recorded");
            c(selectionKey);
            return -1;
        }
        this.d.clear();
        int i = datagramChannel.read(this.d);
        if (i == -1) {
            LogUtil.d("UdpRelayingManager", "Datagram not available for a readable key");
            c(selectionKey);
            return i;
        }
        if (e() > 0 && eVar.b() + ((long) i) > e()) {
            LogUtil.d("UdpRelayingManager", "Current channel's data is bigger than ", Long.valueOf(e()), "b, so need to closed.");
            xjt.f("send udp data Current channel's data is bigger than " + e() + " byte, so need to closed.");
            c(selectionKey);
            return -1;
        }
        this.d.flip();
        int iRemaining = this.d.remaining();
        byte[] bArr = new byte[iRemaining];
        this.d.get(bArr);
        if (iRemaining == 0) {
            return -1;
        }
        a(e(bArr, eVar.a().getAddress().getAddress(), eVar.a().getPort(), eVar.e().getAddress().getAddress(), eVar.e().getPort()), eVar.f41915c);
        eVar.d(eVar.b() + ((long) i));
        return i;
    }

    public void a(mlq mlqVar, String str) {
        if (mlqVar == null || TextUtils.isEmpty(str)) {
            LogUtil.d("UdpRelayingManager", "messageBean:", mlqVar, "nodeId: ", str);
            xjt.f("sendUdpDataToBt messageBean is null or nodeId is empty");
            return;
        }
        byte[] bArrA = mlt.a(c(mlqVar, str), mlqVar);
        LogUtil.a("UdpRelayingManager", "sendUdpDataToBt: ", "dstPort: ", Integer.valueOf(mlqVar.a()), "srcPort:", Integer.valueOf(mlqVar.k()));
        mlz.d().c(bArrA, 1);
    }

    private byte[] c(mlq mlqVar, String str) {
        return new cqj().b(3, str).b(4, b(mlqVar.o())).b(5, mlqVar.k()).b(6, b(mlqVar.e())).b(7, mlqVar.a()).b(8, mlqVar.h()).e();
    }

    private String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(b2 & 255);
            sb.append(".");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public mlq e(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        mlq mlqVar = new mlq();
        mlqVar.c(6);
        mlqVar.b(bArr2);
        mlqVar.h(i);
        mlqVar.a(bArr3);
        mlqVar.d(i2);
        mlqVar.d(bArr);
        return mlqVar;
    }

    private void c(SelectionKey selectionKey) {
        LogUtil.a("UdpRelayingManager", "Close selection key ", selectionKey);
        selectionKey.cancel();
        SelectableChannel selectableChannelChannel = selectionKey.channel();
        if (selectableChannelChannel instanceof DatagramChannel) {
            e((DatagramChannel) selectableChannelChannel);
            e eVar = this.e.get(selectableChannelChannel);
            if (eVar != null) {
                synchronized (this.g) {
                    this.f41913c.remove(eVar);
                    this.e.remove(selectableChannelChannel);
                }
                LogUtil.a("UdpRelayingManager", "had removed from map");
            }
        }
    }

    private void e(DatagramChannel datagramChannel) {
        try {
            datagramChannel.close();
        } catch (IOException unused) {
            LogUtil.c("UdpRelayingManager", "IOException during closing channel");
        }
    }

    private boolean j() throws ClosedChannelException {
        LogUtil.a("UdpRelayingManager", "enter registerChannels");
        ArrayList arrayList = new ArrayList(10);
        synchronized (this.f41912b) {
            arrayList.addAll(this.f41912b);
            this.f41912b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DatagramChannel) it.next()).register(this.i, 1);
        }
        return !arrayList.isEmpty();
    }

    private void b() {
        Selector selector = this.i;
        if (selector == null) {
            LogUtil.c("UdpRelayingManager", "socket selector is null");
            return;
        }
        for (SelectionKey selectionKey : selector.keys()) {
            if (selectionKey.channel().isOpen()) {
                c(selectionKey);
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f41914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f41915c;
        private InetSocketAddress d;
        private InetSocketAddress e;

        private e(String str, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
            this.f41915c = str;
            this.e = inetSocketAddress;
            this.d = inetSocketAddress2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InetSocketAddress e() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InetSocketAddress a() {
            return this.d;
        }

        public long b() {
            return this.f41914b;
        }

        public void d(long j) {
            this.f41914b = j;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            e eVar = (e) obj;
            return this.f41915c.equals(eVar.f41915c) && this.e.equals(eVar.e) && this.d.equals(eVar.d);
        }

        public int hashCode() {
            return ((((this.f41915c.hashCode() + 527) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
        }
    }
}
