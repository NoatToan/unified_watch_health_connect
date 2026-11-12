package defpackage;

import android.os.StatFs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Ld2;", "Ljava/lang/Thread;", "", "run", PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, "", PluginDeviceInfo.FDESC, "Lf2;", "mBleLoggerWriter$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FMODEL, "()Lf2;", "mBleLoggerWriter", "", "mLogPath", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lb2;", "cacheLogQueue", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class d2 extends Thread {

    @NotNull
    public static final a C = new a(null);
    public boolean A;

    @NotNull
    public final List<e2> B;

    @NotNull
    public final String t;

    @NotNull
    public final ConcurrentLinkedQueue<b2> u;

    @NotNull
    public final Object v;
    public boolean w;

    @NotNull
    public final Lazy x;
    public long y;
    public long z;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ld2$a;", "", "", "ONCE_WRITE_ITEMS", "I", "WRITE_INTERVAL", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf2;", PluginDeviceInfo.FMODEL, "()Lf2;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<f2> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f2 invoke() {
            return new f2(d2.this.t, 0L, 2, null);
        }
    }

    public d2(@NotNull String mLogPath, @NotNull ConcurrentLinkedQueue<b2> cacheLogQueue) {
        Intrinsics.checkNotNullParameter(mLogPath, "mLogPath");
        Intrinsics.checkNotNullParameter(cacheLogQueue, "cacheLogQueue");
        this.t = mLogPath;
        this.u = cacheLogQueue;
        this.v = new Object();
        this.x = LazyKt__LazyJVMKt.lazy(new b());
        this.B = new ArrayList();
    }

    public static final void b(d2 d2Var) throws InterruptedException {
        d2Var.w = false;
        d2Var.v.wait();
        d2Var.w = true;
    }

    public final void c() {
        if (this.w) {
            return;
        }
        synchronized (this.v) {
            this.v.notify();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void d() {
        if (this.B.isEmpty()) {
            this.z = System.currentTimeMillis();
            return;
        }
        if (System.currentTimeMillis() - this.y > 60000) {
            this.y = System.currentTimeMillis();
            this.A = b();
        }
        if (!this.A) {
            this.B.clear();
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.B.iterator();
        while (it.hasNext()) {
            sb.append(((e2) it.next()).a());
        }
        this.B.clear();
        try {
            f2 f2VarA = a();
            c2 c2VarA = c2.f4844b.a();
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "logInfo.toString()");
            f2VarA.a(c2VarA.a(string));
        } catch (Exception unused) {
        }
        this.z = System.currentTimeMillis();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0022 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            super.run()
        L3:
            java.lang.Object r0 = r5.v
            monitor-enter(r0)
            r1 = 1
            r5.w = r1     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.ConcurrentLinkedQueue<b2> r1 = r5.u     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L22
            b2 r1 = (defpackage.b2) r1     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L4c
            java.lang.String r2 = "poll()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1 instanceof defpackage.e2     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.util.List<e2> r2 = r5.B     // Catch: java.lang.Throwable -> L22
            r2.add(r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L56
        L24:
            long r1 = r5.z     // Catch: java.lang.Throwable -> L22
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            long r3 = r5.z     // Catch: java.lang.Throwable -> L22
            long r1 = r1 - r3
            r3 = 2000(0x7d0, double:9.88E-321)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L3c
            r5.d()     // Catch: java.lang.Throwable -> L22
        L3c:
            java.util.List<e2> r1 = r5.B     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            r2 = 50
            if (r1 < r2) goto L49
            r5.d()     // Catch: java.lang.Throwable -> L22
        L49:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 != 0) goto L52
            b(r5)     // Catch: java.lang.Throwable -> L22
        L52:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L3
        L56:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2.run():void");
    }

    public final f2 a() {
        return (f2) this.x.getValue();
    }

    public final boolean b() {
        try {
            StatFs statFs = new StatFs(this.t);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > 52428800;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
