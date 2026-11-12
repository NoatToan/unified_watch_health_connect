package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.p;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.fitness.common.utils.LockFileUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
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

/* JADX INFO: loaded from: classes7.dex */
public class z5f {
    public static z5f g;
    public static volatile int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.xiaomi.eco.api.a f40905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f40906b = Executors.newSingleThreadExecutor();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final LinkedList<c> d = new LinkedList<>();
    public final Map<String, Integer> e = new HashMap();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public class a implements av7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f40907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ av7 f40908b;

        public a(c cVar, av7 av7Var) {
            this.f40907a = cVar;
            this.f40908b = av7Var;
        }

        @Override // defpackage.av7
        public void onComplete() {
            z5f.this.u(this.f40907a, 0, null);
        }

        @Override // defpackage.av7
        public void onFail(int i, String str) {
            z5f.this.u(this.f40907a, i, str);
        }

        @Override // defpackage.av7
        public void onProgress(int i, int i2) {
            Integer num = (Integer) z5f.this.e.get(this.f40907a.f40912b);
            int iIntValue = num == null ? 0 : num.intValue();
            int i3 = i + iIntValue;
            int i4 = iIntValue + i2;
            z5f.this.s(i3, i4, this.f40908b);
            if (i == i2) {
                z5f.this.e.put(this.f40907a.f40912b, Integer.valueOf(i4));
            }
        }
    }

    public class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f40909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f40910b;
        public final /* synthetic */ av7 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Queue e;

        public b(int i, c cVar, av7 av7Var, int i2, Queue queue) {
            this.f40909a = i;
            this.f40910b = cVar;
            this.c = av7Var;
            this.d = i2;
            this.e = queue;
        }

        @Override // com.xiaomi.eco.api.p.a
        public void onCallback(EcoApiResult ecoApiResult) {
            if (!ecoApiResult.f()) {
                String str = "sendNextSegment: code = " + ecoApiResult.a();
                Logger.w("MassDataDispatcher", str);
                this.c.onFail(3, str);
                return;
            }
            int i = this.f40909a + 1;
            c cVar = this.f40910b;
            int i2 = cVar.f40914r + i;
            this.c.onProgress(i2, cVar.p);
            Logger.i("MassDataDispatcher", "onProgress() called with: pendingMessage进度 = [" + this.f40909a + "], 总进度 = [" + i2 + "], 一个pendingMessage的分段长度 = " + this.d + ", queue.size = " + this.e.size());
            int i3 = this.d;
            if (i < i3) {
                z5f.this.z(i, i3, this.e, this.c, this.f40910b);
            } else {
                this.c.onComplete();
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f40912b;
        public byte[] c;
        public final int d;
        public final av7 e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f40913k;
        public final int l;
        public int m = 0;
        public final int n;
        public final int o;
        public int p;
        public final int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f40914r;

        public c(int i, int i2, int i3, int i4, String str, int i5, int i6, av7 av7Var, int i7, int i8, boolean z, boolean z2, int i9, int i10) {
            this.f40911a = i;
            this.h = i2;
            this.f40913k = i3;
            this.l = i4;
            this.f40912b = str;
            this.j = z2;
            this.i = z;
            this.d = i5;
            this.e = av7Var;
            this.f = i7;
            this.g = i8;
            this.n = i9;
            this.o = i10;
            this.q = i6;
        }

        public void a() {
            File file = new File(this.f40912b);
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
            byte[] bArrFromInt = ByteUtil.fromInt((int) CRCUtil.getFileCRC32(d(), this.n, this.f40912b));
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
            byte bM = z5f.m(this.f40913k, this.l);
            Logger.i("MassDataDispatcher", "genDataHeader:dataTypeByte=" + ((int) bM));
            File file = new File(this.f40912b);
            byte[] fileMD5Bytes = MD5Util.getFileMD5Bytes(file);
            int length = ((int) file.length()) - this.n;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(22).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put(bM);
            byteBufferOrder.put(fileMD5Bytes);
            byteBufferOrder.putInt(length);
            return byteBufferOrder.array();
        }

        public void e() {
            this.c = z5f.n(this.f, this.g, this.f40912b);
        }

        public String toString() {
            try {
                return "PendingMessage{dataId='" + this.f40912b + "', data = " + this.c.length + ", segmentLength=" + this.d + ", start=" + this.f + ", length=" + this.g + ", index=" + this.h + ", isFirst=" + this.i + ", isLast=" + this.j + ", dataType=" + this.f40913k + ", dataSubType=" + this.l + ", dataTotalLength=" + this.m + ", sentLength=" + this.n + ", fileSegmentSize=" + this.o + ", totalSegmentSize=" + this.p + AbstractJsonLexerKt.END_OBJ;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public z5f(com.xiaomi.eco.api.a aVar) {
        this.f40905a = aVar;
    }

    public static byte m(int i, int i2) {
        return (byte) ((i * 16) + i2);
    }

    public static byte[] n(int i, int i2, String str) {
        File file = new File(str);
        if (file.exists()) {
            return LockFileUtil.readFile(file, i, i2, 1000L);
        }
        Logger.i("MassDataDispatcher", "file not exists: " + str);
        return null;
    }

    public static z5f o(com.xiaomi.eco.api.a aVar) {
        z5f z5fVar = g;
        if (z5fVar == null || z5fVar.f40905a != aVar) {
            g = new z5f(aVar);
        }
        return g;
    }

    public static /* synthetic */ void p(av7 av7Var, int i, int i2) {
        if (av7Var != null) {
            av7Var.onProgress(i, i2);
        }
    }

    public static /* synthetic */ void q(av7 av7Var, int i, String str) {
        if (av7Var != null) {
            if (i == 0) {
                av7Var.onComplete();
            } else {
                av7Var.onFail(i, str);
            }
        }
    }

    public final void A(c cVar, Queue<byte[]> queue) {
        av7 av7Var = cVar.e;
        if (queue == null || queue.size() == 0) {
            Logger.w("MassDataDispatcher", "empty data split data queue ");
            u(cVar, 2, "empty data split data queue ");
        } else {
            int size = queue.size();
            h = cVar.f40911a;
            z(0, size, queue, new a(cVar, av7Var), cVar);
        }
    }

    public final void B(final c cVar) {
        this.f40906b.execute(new Runnable() { // from class: u5f
            @Override // java.lang.Runnable
            public final void run() {
                this.f35414a.r(cVar);
            }
        });
    }

    public final c C(int i, int i2, int i3, String str, int i4, int i5, av7 av7Var, int i6) {
        String str2 = str;
        long jL = l(str2);
        if (jL == 0) {
            return null;
        }
        int i7 = (int) (jL - ((long) i6));
        int i8 = (i7 / 10485760) + (i7 % 10485760 == 0 ? 0 : 1);
        String str3 = "MassDataDispatcher";
        Logger.i("MassDataDispatcher", "splitDataToPendingMessage: roundSize = " + i8 + ", dataLength = " + jL + ", sentLength = " + i6);
        int iK = k(i4);
        int i9 = i6;
        int i10 = 0;
        while (i10 < i8) {
            int i11 = i9 + 10485760;
            int i12 = ((long) i11) > jL ? (int) (jL - ((long) i9)) : 10485760;
            int i13 = i9;
            String str4 = str3;
            int i14 = i8;
            this.d.addLast(new c(i, i10, i2, i3, str, iK, i5, av7Var, i13, i12, i10 == 0, i10 == i8 + (-1), i6, i14));
            Logger.i(str4, "splitDataToPendingMessage: start = " + i13 + ", length = " + i12);
            i10++;
            str2 = str;
            str3 = str4;
            i9 = i11;
            i8 = i14;
            jL = jL;
        }
        D(str2);
        return this.d.peekFirst();
    }

    public final void D(String str) {
        int iC = 0;
        for (int i = 0; i < this.d.size(); i++) {
            c cVar = this.d.get(i);
            if (cVar.f40912b.equals(str)) {
                iC += cVar.c();
            }
        }
        Logger.i("MassDataDispatcher", "updateTotalSegmentCount: totalSegment = " + iC);
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            c cVar2 = this.d.get(i2);
            if (cVar2.f40912b.equals(str)) {
                cVar2.p = iC;
            }
        }
    }

    public final boolean j(String str) {
        if (this.d.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (str.equals(this.d.get(i).f40912b)) {
                return true;
            }
        }
        return false;
    }

    public final int k(int i) {
        if (i <= 0) {
            Logger.w("MassDataDispatcher", "splitAndSendPendingData  use the default segmentLength 4096");
            return 4096;
        }
        Logger.w("MassDataDispatcher", "splitAndSendPendingData  use the pass-in segmentLength:" + i);
        return i;
    }

    public final long l(String str) {
        File file = new File(str);
        if (file.isDirectory() || !file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public final /* synthetic */ void r(c cVar) {
        if (cVar == null) {
            Logger.w("MassDataDispatcher", "empty msg or null msg data!");
            A(cVar, null);
            return;
        }
        cVar.e();
        if (cVar.c == null) {
            Logger.w("MassDataDispatcher", "empty msg or null msg data!");
            A(cVar, null);
            return;
        }
        if (cVar.i) {
            cVar.a();
        }
        if (cVar.j) {
            cVar.b();
        }
        Logger.i("MassDataDispatcher", "sendNextData: next key = " + cVar);
        A(cVar, e6f.b(cVar));
    }

    public final void s(final int i, final int i2, final av7 av7Var) {
        this.c.post(new Runnable() { // from class: y5f
            @Override // java.lang.Runnable
            public final void run() {
                z5f.p(av7Var, i, i2);
            }
        });
    }

    public final void t(final int i, final String str, final av7 av7Var) {
        Logger.i("MassDataDispatcher", "onResponse() called with: errorCode = [" + i + "], errorMsg = [" + str + "] ");
        this.c.post(new Runnable() { // from class: w5f
            @Override // java.lang.Runnable
            public final void run() {
                z5f.q(av7Var, i, str);
            }
        });
    }

    public final void u(c cVar, int i, String str) {
        Logger.i("MassDataDispatcher", "onThisMsgFinished() called with: pendingMessage = [" + cVar + "], errorCode = [" + i + "], errorMsg = [" + str + "]");
        if (cVar != null) {
            this.d.remove(cVar);
            av7 av7Var = cVar.e;
            if (i == 0) {
                c cVarPeekFirst = this.d.peekFirst();
                if (cVarPeekFirst == null || !cVarPeekFirst.f40912b.equals(cVar.f40912b)) {
                    t(i, str, av7Var);
                    this.e.remove(cVar.f40912b);
                }
            } else {
                t(i, str, av7Var);
                this.e.remove(cVar.f40912b);
                w(cVar.f40912b);
            }
        }
        y();
    }

    public void v(int i, byte[] bArr, int i2, int i3, p.a aVar) {
        Logger.i("MassDataDispatcher", "prepareMass: " + i);
        u7r u7rVar = new u7r();
        u7rVar.e = 22;
        u7rVar.f = 0;
        g6f g6fVar = new g6f();
        k6f k6fVar = new k6f();
        k6fVar.c = i;
        k6fVar.d = bArr;
        k6fVar.e = i2;
        k6fVar.f = i3;
        g6fVar.r(k6fVar);
        u7rVar.C(g6fVar);
        this.f40905a.call(u7rVar, true, aVar);
    }

    public final void w(String str) {
        Iterator<c> it = this.d.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().f40912b)) {
                it.remove();
            }
        }
    }

    public void x(int i, int i2, int i3, String str, int i4, int i5, av7 av7Var, int i6) {
        Logger.i("MassDataDispatcher", "sendMessage() called with: dataType = [" + i2 + "], dataSubType = [" + i3 + "], dataId = [" + str + "], segmentLength = [" + i4 + "], callback = [" + av7Var + "], sentLength = [" + i6 + "]");
        int iK = k(i4);
        int i7 = i6 / iK;
        if (j(str)) {
            String str2 = "dup send msg task, and ignore this request: " + str;
            Logger.i("MassDataDispatcher", str2);
            t(1, str2, av7Var);
            return;
        }
        e6f.a(str);
        c cVarC = C(i, i2, i3, str, iK, i5, av7Var, i6);
        if (cVarC == null) {
            Logger.i("MassDataDispatcher", "sendMessage: splitDataPendingMessage pending message = null");
            return;
        }
        Logger.i("MassDataDispatcher", "sendMessage -- one new msg task: " + str);
        if (this.f.get()) {
            return;
        }
        this.f.compareAndSet(false, true);
        this.e.put(str, Integer.valueOf(i7));
        B(cVarC);
    }

    public final void y() {
        if (!this.d.isEmpty()) {
            B(this.d.peekFirst());
        } else {
            Logger.i("MassDataDispatcher", "all msg has sent !");
            this.f.set(false);
        }
    }

    public final void z(int i, int i2, Queue<byte[]> queue, av7 av7Var, c cVar) {
        byte[] bArrPoll = queue.poll();
        if (bArrPoll != null) {
            AppUtil.INSTANCE.isPlayChannel();
            this.f40905a.callTimeout(104, bArrPoll, false, new b(i, cVar, av7Var, i2, queue), 80000, cVar.q, cVar.f40911a);
            return;
        }
        String str = "data is null, sentCount = " + i + " totalSegSize = " + i2;
        Logger.w("MassDataDispatcher", str);
        av7Var.onFail(-1, str);
    }
}
