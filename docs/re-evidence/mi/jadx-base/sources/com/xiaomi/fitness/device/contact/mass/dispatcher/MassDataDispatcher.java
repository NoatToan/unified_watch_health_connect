package com.xiaomi.fitness.device.contact.mass.dispatcher;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.common.utils.LockFileUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.mass.MassDataHandler;
import com.xiaomi.fitness.device.contact.mass.dispatcher.MassDataDispatcher;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.f6f;
import defpackage.j6f;
import defpackage.s5f;
import defpackage.s7r;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class MassDataDispatcher implements OnDeviceStatusListener {
    public static MassDataDispatcher g;
    public static volatile int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11889a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f11890b = new Handler(Looper.getMainLooper());
    public final LinkedList<b> c = new LinkedList<>();
    public final Map<String, Integer> d = new HashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = 0;

    public class a implements s5f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f11891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s5f f11892b;

        public a(b bVar, s5f s5fVar) {
            this.f11891a = bVar;
            this.f11892b = s5fVar;
        }

        @Override // defpackage.s5f
        public void onComplete() {
            MassDataDispatcher.this.y(this.f11891a, 0, null);
        }

        @Override // defpackage.s5f
        public void onFail(int i, String str) {
            MassDataDispatcher.this.y(this.f11891a, i, str);
        }

        @Override // defpackage.s5f
        public void onProgress(int i, int i2) {
            Integer num = (Integer) MassDataDispatcher.this.d.get(this.f11891a.f11894b);
            int iIntValue = num == null ? 0 : num.intValue();
            int i3 = i + iIntValue;
            int i4 = iIntValue + i2;
            MassDataDispatcher.this.w(i3, i4, this.f11892b);
            if (i == i2) {
                MassDataDispatcher.this.d.put(this.f11891a.f11894b, Integer.valueOf(i4));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11894b;
        public byte[] c;
        public final int d;
        public final s5f e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11895k;
        public final int l;
        public final int n;
        public final int o;
        public int p;
        public final int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f11896r;
        public int m = 0;
        public boolean s = false;

        public b(int i, int i2, int i3, int i4, String str, int i5, int i6, s5f s5fVar, int i7, int i8, boolean z, boolean z2, int i9, int i10) {
            this.f11893a = i;
            this.h = i2;
            this.f11895k = i3;
            this.l = i4;
            this.f11894b = str;
            this.j = z2;
            this.i = z;
            this.d = i5;
            this.e = s5fVar;
            this.f = i7;
            this.g = i8;
            this.n = i9;
            this.o = i10;
            this.q = i6;
        }

        public void a() {
            File file = new File(this.f11894b);
            if (!file.exists() || file.isDirectory()) {
                Logger.i("MassDataDispatcher", "file data is null");
                return;
            }
            byte[] bArrD = d();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrD.length + this.c.length).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArrD);
            byteBufferOrder.put(this.c);
            this.c = byteBufferOrder.array();
        }

        public void b() {
            byte[] bArrFromInt = ByteUtil.fromInt((int) CRCUtil.getFileCRC32(d(), this.n, this.f11894b));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.c.length + bArrFromInt.length);
            byteBufferAllocate.put(this.c);
            byteBufferAllocate.put(bArrFromInt);
            Logger.i("MassDataDispatcher", "appendDataTailCRC: " + this.c.length);
            this.c = byteBufferAllocate.array();
        }

        public int c() {
            int i = this.d - 4;
            int i2 = this.g;
            if (this.i) {
                i2 += 22;
            }
            if (this.j) {
                i2 += 4;
            }
            int iCeil = (int) Math.ceil(i2 / (i * 1.0f));
            Logger.i("MassDataDispatcher", "getFileSliceSegmentSize() returned: " + iCeil);
            return iCeil;
        }

        public byte[] d() {
            byte bQ = MassDataDispatcher.q(this.f11895k, this.l);
            File file = new File(this.f11894b);
            byte[] fileMD5Bytes = MD5Util.getFileMD5Bytes(file);
            StringBuilder sb = new StringBuilder();
            sb.append("genDataHeader:dataTypeByte=");
            sb.append((int) bQ);
            sb.append(", dataId is null? ");
            sb.append(fileMD5Bytes == null);
            Logger.i("MassDataDispatcher", sb.toString());
            int length = ((int) file.length()) - this.n;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(22).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put(bQ);
            try {
                byteBufferOrder.put(fileMD5Bytes);
            } catch (Exception e) {
                Logger.i("MassDataDispatcher", "getHeader() called isFile" + file.isFile());
                e.printStackTrace();
            }
            byteBufferOrder.putInt(length);
            return byteBufferOrder.array();
        }

        public void e() {
            this.c = MassDataDispatcher.r(this.f, this.g, this.f11894b);
        }

        public String toString() {
            try {
                return "PendingMessage{dataId='" + this.f11894b + "', data = " + this.c.length + ", segmentLength=" + this.d + ", start=" + this.f + ", length=" + this.g + ", index=" + this.h + ", isFirst=" + this.i + ", isLast=" + this.j + ", dataType=" + this.f11895k + ", dataSubType=" + this.l + ", dataTotalLength=" + this.m + ", sentLength=" + this.n + ", fileSegmentSize=" + this.o + ", totalSegmentSize=" + this.p + AbstractJsonLexerKt.END_OBJ;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public MassDataDispatcher() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(22, MassDataHandler.INSTANCE);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }

    public static int n() {
        return h;
    }

    public static byte q(int i, int i2) {
        return (byte) ((i * 16) + i2);
    }

    public static byte[] r(int i, int i2, String str) {
        File file = new File(str);
        if (file.exists()) {
            return LockFileUtil.readFile(file, i, i2, 1000L);
        }
        Logger.i("MassDataDispatcher", "file not exists: " + str);
        return null;
    }

    public static MassDataDispatcher s() {
        if (g == null) {
            g = new MassDataDispatcher();
        }
        return g;
    }

    public static /* synthetic */ void t(s5f s5fVar, int i, int i2) {
        if (s5fVar != null) {
            s5fVar.onProgress(i, i2);
        }
    }

    public static /* synthetic */ void u(s5f s5fVar, int i, String str) {
        if (s5fVar != null) {
            if (i == 0) {
                s5fVar.onComplete();
            } else {
                s5fVar.onFail(i, str);
            }
        }
    }

    public final void A(String str) {
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().f11894b)) {
                it.remove();
            }
        }
    }

    public void B(int i, int i2, int i3, String str, int i4, s5f s5fVar, int i5) {
        Logger.i("MassDataDispatcher", "sendMessage() called with: dataType = [" + i2 + "], dataSubType = [" + i3 + "], dataId = [" + str + "], segmentLength = [" + i4 + "], callback = [" + s5fVar + "], sentLength = [" + i5 + "]");
        int iO = o(i4);
        int i6 = i5 / iO;
        if (m(str)) {
            String str2 = "dup send msg task, and ignore this request: " + str;
            Logger.i("MassDataDispatcher", str2);
            x(1, str2, s5fVar);
            return;
        }
        com.xiaomi.fitness.device.contact.mass.dispatcher.a.a(str);
        b bVarG = G(i, i2, i3, str, iO, 0, s5fVar, i5);
        if (bVarG == null) {
            Logger.i("MassDataDispatcher", "sendMessage: splitDataPendingMessage pending message = null");
            return;
        }
        Logger.i("MassDataDispatcher", "sendMessage -- one new msg task: " + str);
        if (this.e.get()) {
            return;
        }
        this.e.compareAndSet(false, true);
        this.d.put(str, Integer.valueOf(i6));
        F(bVarG);
    }

    public final void C() {
        if (!this.c.isEmpty()) {
            F(this.c.peekFirst());
        } else {
            Logger.i("MassDataDispatcher", "all msg has sent !");
            this.e.set(false);
        }
    }

    public final void D(final int i, final int i2, final Queue<byte[]> queue, final s5f s5fVar, final b bVar) {
        byte[] bArrPoll = queue.poll();
        if (bArrPoll != null) {
            IMiWearCoreClient.INSTANCE.getInstance().sendMassData(h, bArrPoll, new ICallback.Stub() { // from class: com.xiaomi.fitness.device.contact.mass.dispatcher.MassDataDispatcher.2
                @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
                public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                    if (!wearApiResult.d()) {
                        String str = "sendNextSegment: code = " + wearApiResult.a();
                        Logger.w("MassDataDispatcher", str);
                        s5fVar.onFail(3, str);
                        return;
                    }
                    if (bVar.s) {
                        Logger.i("MassDataDispatcher", "onCallback: pendingMessage canceled: " + bVar);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - MassDataDispatcher.this.f;
                    Logger.i("MassDataDispatcher", "sendNextSegment onCallback diff = " + jCurrentTimeMillis);
                    if (jCurrentTimeMillis > 40000) {
                        s5fVar.onFail(5, "timeout");
                        return;
                    }
                    MassDataDispatcher.this.f = System.currentTimeMillis();
                    int i3 = i + 1;
                    b bVar2 = bVar;
                    int i4 = bVar2.f11896r + i3;
                    s5fVar.onProgress(i4, bVar2.p);
                    Logger.i("MassDataDispatcher", "onProgress() called with: pendingMessage进度 = [" + i + "], 总进度 = [" + i4 + "], 一个pendingMessage的分段长度 = " + i2 + ", queue.size = " + queue.size());
                    int i5 = i2;
                    if (i3 < i5) {
                        MassDataDispatcher.this.D(i3, i5, queue, s5fVar, bVar);
                    } else {
                        s5fVar.onComplete();
                    }
                }
            }, AppUtil.INSTANCE.isPlayChannel() ? 80000 : 12000);
            return;
        }
        String str = "data is null, sentCount = " + i + " totalSegSize = " + i2;
        Logger.w("MassDataDispatcher", str);
        s5fVar.onFail(-1, str);
    }

    public final void E(b bVar, Queue<byte[]> queue) {
        s5f s5fVar = bVar.e;
        if (queue == null || queue.size() == 0) {
            Logger.w("MassDataDispatcher", "empty data split data queue ");
            y(bVar, 2, "empty data split data queue ");
        } else {
            int size = queue.size();
            h = bVar.f11893a;
            this.f = System.currentTimeMillis();
            D(0, size, queue, new a(bVar, s5fVar), bVar);
        }
    }

    public final void F(final b bVar) {
        this.f11889a.execute(new Runnable() { // from class: v5f
            @Override // java.lang.Runnable
            public final void run() {
                this.f36499a.v(bVar);
            }
        });
    }

    public final b G(int i, int i2, int i3, String str, int i4, int i5, s5f s5fVar, int i6) {
        String str2 = str;
        long jP = p(str2);
        if (jP == 0) {
            return null;
        }
        int i7 = (int) (jP - ((long) i6));
        int i8 = (i7 / 10485760) + (i7 % 10485760 == 0 ? 0 : 1);
        String str3 = "MassDataDispatcher";
        Logger.i("MassDataDispatcher", "splitDataToPendingMessage: roundSize = " + i8 + ", dataLength = " + jP + ", sentLength = " + i6);
        int iO = o(i4);
        int i9 = i6;
        int i10 = 0;
        while (i10 < i8) {
            int i11 = i9 + 10485760;
            int i12 = ((long) i11) > jP ? (int) (jP - ((long) i9)) : 10485760;
            int i13 = i9;
            String str4 = str3;
            int i14 = i8;
            this.c.addLast(new b(i, i10, i2, i3, str, iO, i5, s5fVar, i13, i12, i10 == 0, i10 == i8 + (-1), i6, i14));
            Logger.i(str4, "splitDataToPendingMessage: start = " + i13 + ", length = " + i12);
            i10++;
            str2 = str;
            str3 = str4;
            i9 = i11;
            i8 = i14;
            jP = jP;
        }
        H(str2);
        return this.c.peekFirst();
    }

    public final void H(String str) {
        int iC = 0;
        for (int i = 0; i < this.c.size(); i++) {
            b bVar = this.c.get(i);
            if (bVar.f11894b.equals(str)) {
                iC += bVar.c();
            }
        }
        Logger.i("MassDataDispatcher", "updateTotalSegmentCount: totalSegment = " + iC);
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            b bVar2 = this.c.get(i2);
            if (bVar2.f11894b.equals(str)) {
                bVar2.p = iC;
            }
        }
    }

    public void l(int i) {
        b next;
        Logger.i("MassDataDispatcher", "cancelMass() called with: massId = [" + i + "]");
        Iterator<b> it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f11893a != i);
        if (next == null) {
            Logger.i("MassDataDispatcher", "cancelMass: pendingMessage == null");
        } else {
            next.s = true;
            y(next, 4, "cancel task");
        }
    }

    public final boolean m(String str) {
        if (this.c.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (str.equals(this.c.get(i).f11894b)) {
                return true;
            }
        }
        return false;
    }

    public final int o(int i) {
        if (i <= 0) {
            Logger.w("MassDataDispatcher", "splitAndSendPendingData  use the default segmentLength 4096");
            return 4096;
        }
        Logger.w("MassDataDispatcher", "splitAndSendPendingData  use the pass-in segmentLength:" + i);
        return i;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(String str, int i, int i2) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(String str) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(String str) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(String str) {
        WearableDeviceModel wearableDeviceModel;
        if (TextUtils.isEmpty(str) || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || !str.equals(wearableDeviceModel.getDid())) {
            return;
        }
        Logger.i("MassDataDispatcher", "onDisconnect() called with: did = [" + str + "], isSendingMsg = [" + this.e + "],pendingMap = [" + this.c.isEmpty() + "]");
        if (this.e.get() && !this.c.isEmpty()) {
            try {
                Iterator<b> it = this.c.iterator();
                while (it.hasNext()) {
                    y(it.next(), 6, "disconnect callback");
                }
            } catch (Exception e) {
                Logger.e("MassDataDispatcher", "onDisconnect: ", e);
            }
        }
    }

    public final long p(String str) {
        File file = new File(str);
        if (file.isDirectory() || !file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public final /* synthetic */ void v(b bVar) {
        if (bVar == null) {
            Logger.w("MassDataDispatcher", "empty msg or null msg data!");
            E(bVar, null);
            return;
        }
        bVar.e();
        if (bVar.c == null) {
            Logger.w("MassDataDispatcher", "empty msg or null msg data!");
            E(bVar, null);
            return;
        }
        if (bVar.i) {
            bVar.a();
        }
        if (bVar.j) {
            bVar.b();
        }
        Logger.i("MassDataDispatcher", "sendNextData: next key = " + bVar);
        E(bVar, com.xiaomi.fitness.device.contact.mass.dispatcher.a.b(bVar));
    }

    public final void w(final int i, final int i2, final s5f s5fVar) {
        this.f11890b.post(new Runnable() { // from class: x5f
            @Override // java.lang.Runnable
            public final void run() {
                MassDataDispatcher.t(s5fVar, i, i2);
            }
        });
    }

    public final void x(final int i, final String str, final s5f s5fVar) {
        Logger.i("MassDataDispatcher", "onResponse() called with: errorCode = [" + i + "], errorMsg = [" + str + "] ");
        this.f11890b.post(new Runnable() { // from class: t5f
            @Override // java.lang.Runnable
            public final void run() {
                MassDataDispatcher.u(s5fVar, i, str);
            }
        });
    }

    public final void y(b bVar, int i, String str) {
        Logger.i("MassDataDispatcher", "onThisMsgFinished() called with: pendingMessage = [" + bVar + "], errorCode = [" + i + "], errorMsg = [" + str + "]");
        if (bVar != null) {
            this.c.remove(bVar);
            s5f s5fVar = bVar.e;
            if (i == 0) {
                b bVarPeekFirst = this.c.peekFirst();
                if (bVarPeekFirst == null || !bVarPeekFirst.f11894b.equals(bVar.f11894b)) {
                    x(i, str, s5fVar);
                    this.d.remove(bVar.f11894b);
                }
            } else {
                x(i, str, s5fVar);
                this.d.remove(bVar.f11894b);
                A(bVar.f11894b);
            }
        }
        C();
    }

    public void z(int i, byte[] bArr, int i2, int i3, OnSyncCallback onSyncCallback) {
        Logger.i("MassDataDispatcher", "prepareMass: " + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 22;
        s7rVar.f = 0;
        f6f f6fVar = new f6f();
        j6f j6fVar = new j6f();
        j6fVar.c = i;
        j6fVar.d = bArr;
        j6fVar.e = i2;
        j6fVar.f = i3;
        f6fVar.s(j6fVar);
        s7rVar.X(f6fVar);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, true, onSyncCallback, 8000);
    }
}
