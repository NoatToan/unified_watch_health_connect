package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import androidx.annotation.GuardedBy;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.systrace.Systrace;
import defpackage.asq;
import defpackage.cm8;
import defpackage.exh;
import defpackage.g9p;
import defpackage.l4b;
import defpackage.nwg;
import defpackage.p7q;
import defpackage.pyo;
import defpackage.yej;
import defpackage.zhg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zhg f7488b;
    public final i e;
    public final ReactApplicationContext f;
    public nwg j;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7490r;
    public long s;
    public long t;
    public long u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7487a = new int[4];
    public final Object c = new Object();
    public final Object d = new Object();
    public ArrayList<s> g = new ArrayList<>();

    @GuardedBy("mDispatchRunnablesLock")
    public ArrayList<Runnable> h = new ArrayList<>();

    @GuardedBy("mNonBatchedOperationsLock")
    public ArrayDeque<s> i = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7489k = false;
    public boolean l = false;
    public boolean m = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayDeque f7492b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;

        public a(int i, ArrayDeque arrayDeque, ArrayList arrayList, long j, long j2, long j3, long j4) {
            this.f7491a = i;
            this.f7492b = arrayDeque;
            this.c = arrayList;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            pyo.a(0L, "DispatchUI").a("BatchId", this.f7491a).c();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayDeque arrayDeque = this.f7492b;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((s) it.next()).execute();
                        }
                    }
                    ArrayList arrayList = this.c;
                    if (arrayList != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((s) it2.next()).execute();
                        }
                    }
                    if (e.this.m && e.this.o == 0) {
                        e.this.o = this.d;
                        e.this.p = this.e;
                        e.this.q = this.f;
                        e.this.f7490r = jUptimeMillis;
                        e.this.u = this.g;
                        Systrace.b(0L, "delayBeforeDispatchViewUpdates", 0, e.this.o * FolmeCore.NANOS_TO_MS);
                        Systrace.f(0L, "delayBeforeDispatchViewUpdates", 0, e.this.q * FolmeCore.NANOS_TO_MS);
                        Systrace.b(0L, "delayBeforeBatchRunStart", 0, e.this.q * FolmeCore.NANOS_TO_MS);
                        Systrace.f(0L, "delayBeforeBatchRunStart", 0, e.this.f7490r * FolmeCore.NANOS_TO_MS);
                    }
                    e.this.f7488b.f();
                    if (e.this.j != null) {
                        e.this.j.a();
                    }
                    Systrace.g(0L);
                } catch (Exception e) {
                    e.this.l = true;
                    throw e;
                }
            } catch (Throwable th) {
                Systrace.g(0L);
                throw th;
            }
        }
    }

    public class b extends GuardedRunnable {
        public b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            e.this.N();
        }
    }

    public final class c extends w {
        public final int c;
        public final boolean d;
        public final boolean e;

        public c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.c = i2;
            this.e = z;
            this.d = z2;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            if (this.e) {
                e.this.f7488b.e();
            } else {
                e.this.f7488b.A(this.f7507a, this.c, this.d);
            }
        }
    }

    public class d implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReadableMap f7494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callback f7495b;

        public /* synthetic */ d(e eVar, ReadableMap readableMap, Callback callback, a aVar) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.h(this.f7494a, this.f7495b);
        }

        public d(ReadableMap readableMap, Callback callback) {
            this.f7494a = readableMap;
            this.f7495b = callback;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.e$e, reason: collision with other inner class name */
    public final class C0171e extends w {
        public final g9p c;
        public final String d;
        public final yej e;

        public C0171e(g9p g9pVar, int i, String str, yej yejVar) {
            super(i);
            this.c = g9pVar;
            this.d = str;
            this.e = yejVar;
            Systrace.j(0L, "createView", this.f7507a);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            Systrace.d(0L, "createView", this.f7507a);
            e.this.f7488b.j(this.c, this.f7507a, this.d, this.e);
        }
    }

    public final class f implements s {
        public f() {
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.k();
        }

        public /* synthetic */ f(e eVar, a aVar) {
            this();
        }
    }

    @Deprecated
    public final class g extends w {
        public final int c;
        public final ReadableArray d;

        public g(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.c = i2;
            this.d = readableArray;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.l(this.f7507a, this.c, this.d);
        }
    }

    public final class h extends w {
        public final String c;
        public final ReadableArray d;

        public h(int i, String str, ReadableArray readableArray) {
            super(i);
            this.c = str;
            this.d = readableArray;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.m(this.f7507a, this.c, this.d);
        }
    }

    public class i extends l4b {
        public final int c;

        public /* synthetic */ i(e eVar, ReactContext reactContext, int i, a aVar) {
            this(reactContext, i);
        }

        @Override // defpackage.l4b
        public void c(long j) {
            if (e.this.l) {
                cm8.C("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Systrace.c(0L, "dispatchNonBatchedUIOperations");
            try {
                d(j);
                Systrace.g(0L);
                e.this.N();
                ReactChoreographer.i().m(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            } catch (Throwable th) {
                Systrace.g(0L);
                throw th;
            }
        }

        public final void d(long j) throws Exception {
            s sVar;
            while (16 - ((System.nanoTime() - j) / FolmeCore.NANOS_TO_MS) >= this.c) {
                synchronized (e.this.d) {
                    try {
                        if (e.this.i.isEmpty()) {
                            return;
                        } else {
                            sVar = (s) e.this.i.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    sVar.execute();
                    e.r(e.this, SystemClock.uptimeMillis() - jUptimeMillis);
                } catch (Exception e) {
                    e.this.l = true;
                    throw e;
                }
            }
        }

        public i(ReactContext reactContext, int i) {
            super(reactContext);
            this.c = i;
        }
    }

    public final class j implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f7498b;
        public final float c;
        public final Callback d;

        public /* synthetic */ j(e eVar, int i, float f, float f2, Callback callback, a aVar) {
            this(i, f, f2, callback);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            try {
                e.this.f7488b.t(this.f7497a, e.this.f7487a);
                float f = e.this.f7487a[0];
                float f2 = e.this.f7487a[1];
                int iO = e.this.f7488b.o(this.f7497a, this.f7498b, this.c);
                try {
                    e.this.f7488b.t(iO, e.this.f7487a);
                    this.d.invoke(Integer.valueOf(iO), Float.valueOf(exh.a(e.this.f7487a[0] - f)), Float.valueOf(exh.a(e.this.f7487a[1] - f2)), Float.valueOf(exh.a(e.this.f7487a[2])), Float.valueOf(exh.a(e.this.f7487a[3])));
                } catch (IllegalViewOperationException unused) {
                    this.d.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.d.invoke(new Object[0]);
            }
        }

        public j(int i, float f, float f2, Callback callback) {
            this.f7497a = i;
            this.f7498b = f;
            this.c = f2;
            this.d = callback;
        }
    }

    public final class k extends w {
        public final int[] c;
        public final asq[] d;
        public final int[] e;
        public final int[] f;

        public k(int i, int[] iArr, asq[] asqVarArr, int[] iArr2, int[] iArr3) {
            super(i);
            this.c = iArr;
            this.d = asqVarArr;
            this.e = iArr2;
            this.f = iArr3;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.r(this.f7507a, this.c, this.d, this.e, this.f);
        }
    }

    public final class l implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callback f7500b;

        public /* synthetic */ l(e eVar, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            try {
                e.this.f7488b.u(this.f7499a, e.this.f7487a);
                this.f7500b.invoke(Float.valueOf(exh.a(e.this.f7487a[0])), Float.valueOf(exh.a(e.this.f7487a[1])), Float.valueOf(exh.a(e.this.f7487a[2])), Float.valueOf(exh.a(e.this.f7487a[3])));
            } catch (NoSuchNativeViewException unused) {
                this.f7500b.invoke(new Object[0]);
            }
        }

        public l(int i, Callback callback) {
            this.f7499a = i;
            this.f7500b = callback;
        }
    }

    public final class m implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callback f7502b;

        public /* synthetic */ m(e eVar, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            try {
                e.this.f7488b.t(this.f7501a, e.this.f7487a);
                this.f7502b.invoke(0, 0, Float.valueOf(exh.a(e.this.f7487a[2])), Float.valueOf(exh.a(e.this.f7487a[3])), Float.valueOf(exh.a(e.this.f7487a[0])), Float.valueOf(exh.a(e.this.f7487a[1])));
            } catch (NoSuchNativeViewException unused) {
                this.f7502b.invoke(new Object[0]);
            }
        }

        public m(int i, Callback callback) {
            this.f7501a = i;
            this.f7502b = callback;
        }
    }

    public final class n extends w {
        public n(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.w(this.f7507a);
        }
    }

    public final class o extends w {
        public final int c;

        public /* synthetic */ o(e eVar, int i, int i2, a aVar) {
            this(i, i2);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.z(this.f7507a, this.c);
        }

        public o(int i, int i2) {
            super(i);
            this.c = i2;
        }
    }

    public class p implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7503a;

        public /* synthetic */ p(e eVar, boolean z, a aVar) {
            this(z);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.B(this.f7503a);
        }

        public p(boolean z) {
            this.f7503a = z;
        }
    }

    public final class q extends w {
        public final ReadableArray c;
        public final Callback d;
        public final Callback e;

        public q(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.c = readableArray;
            this.d = callback;
            this.e = callback2;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.C(this.f7507a, this.c, this.e, this.d);
        }
    }

    public class r implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7q f7505a;

        public r(p7q p7qVar) {
            this.f7505a = p7qVar;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            this.f7505a.execute(e.this.f7488b);
        }
    }

    public interface s {
        void execute();
    }

    public final class t extends w {
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public t(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.c = i;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            Systrace.j(0L, "updateLayout", this.f7507a);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            Systrace.d(0L, "updateLayout", this.f7507a);
            e.this.f7488b.D(this.c, this.f7507a, this.d, this.e, this.f, this.g);
        }
    }

    public final class u extends w {
        public final yej c;

        public /* synthetic */ u(e eVar, int i, yej yejVar, a aVar) {
            this(i, yejVar);
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.F(this.f7507a, this.c);
        }

        public u(int i, yej yejVar) {
            super(i);
            this.c = yejVar;
        }
    }

    public final class v extends w {
        public final Object c;

        public v(int i, Object obj) {
            super(i);
            this.c = obj;
        }

        @Override // com.facebook.react.uimanager.e.s
        public void execute() {
            e.this.f7488b.G(this.f7507a, this.c);
        }
    }

    public abstract class w implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7507a;

        public w(int i) {
            this.f7507a = i;
        }
    }

    public e(ReactApplicationContext reactApplicationContext, zhg zhgVar, int i2) {
        this.f7488b = zhgVar;
        this.e = new i(this, reactApplicationContext, i2 == -1 ? 8 : i2, null);
        this.f = reactApplicationContext;
    }

    public static /* synthetic */ long r(e eVar, long j2) {
        long j3 = eVar.n + j2;
        eVar.n = j3;
        return j3;
    }

    public void A(int i2, float f2, float f3, Callback callback) {
        this.g.add(new j(this, i2, f2, f3, callback, null));
    }

    public void B(int i2, int[] iArr, asq[] asqVarArr, int[] iArr2, int[] iArr3) {
        this.g.add(new k(i2, iArr, asqVarArr, iArr2, iArr3));
    }

    public void C(int i2, Callback callback) {
        this.g.add(new m(this, i2, callback, null));
    }

    public void D(int i2, Callback callback) {
        this.g.add(new l(this, i2, callback, null));
    }

    public void E(int i2) {
        this.g.add(new n(i2));
    }

    public void F(int i2, int i3) {
        this.g.add(new o(this, i2, i3, null));
    }

    public void G(int i2, int i3, boolean z) {
        this.g.add(new c(i2, i3, false, z));
    }

    public void H(boolean z) {
        this.g.add(new p(this, z, null));
    }

    public void I(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.g.add(new q(i2, readableArray, callback, callback2));
    }

    public void J(p7q p7qVar) {
        this.g.add(new r(p7qVar));
    }

    public void K(int i2, Object obj) {
        this.g.add(new v(i2, obj));
    }

    public void L(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.g.add(new t(i2, i3, i4, i5, i6, i7));
    }

    public void M(int i2, String str, yej yejVar) {
        this.g.add(new u(this, i2, yejVar, null));
    }

    public final void N() {
        if (this.l) {
            cm8.C("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.c) {
            if (this.h.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.h;
            this.h = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.m) {
                this.s = SystemClock.uptimeMillis() - jUptimeMillis;
                this.t = this.n;
                this.m = false;
                Systrace.b(0L, "batchedExecutionTime", 0, jUptimeMillis * FolmeCore.NANOS_TO_MS);
                Systrace.e(0L, "batchedExecutionTime", 0);
            }
            this.n = 0L;
        }
    }

    public zhg O() {
        return this.f7488b;
    }

    public Map<String, Long> P() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.o));
        map.put("LayoutTime", Long.valueOf(this.p));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.q));
        map.put("RunStartTime", Long.valueOf(this.f7490r));
        map.put("BatchedExecutionTime", Long.valueOf(this.s));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.t));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.u));
        return map;
    }

    public boolean Q() {
        return this.g.isEmpty();
    }

    public void R() {
        this.f7489k = false;
        ReactChoreographer.i().o(ReactChoreographer.CallbackType.DISPATCH_UI, this.e);
        N();
    }

    public void S(p7q p7qVar) {
        this.g.add(0, new r(p7qVar));
    }

    public void T() {
        this.m = true;
        this.o = 0L;
    }

    public void U() {
        this.f7489k = true;
        ReactChoreographer.i().m(ReactChoreographer.CallbackType.DISPATCH_UI, this.e);
    }

    public void V(nwg nwgVar) {
        this.j = nwgVar;
    }

    public void s(int i2, View view) {
        this.f7488b.a(i2, view);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [long] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayDeque] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(int r19, long r20, long r22) throws java.lang.Throwable {
        /*
            r18 = this;
            r14 = r18
            r0 = r19
            java.lang.String r1 = "UIViewOperationQueue.dispatchViewUpdates"
            r12 = 0
            pyo$b r1 = defpackage.pyo.a(r12, r1)
            java.lang.String r2 = "batchId"
            pyo$b r1 = r1.a(r2, r0)
            r1.c()
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L31
            long r15 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList<com.facebook.react.uimanager.e$s> r1 = r14.g     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 != 0) goto L35
            java.util.ArrayList<com.facebook.react.uimanager.e$s> r1 = r14.g     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r14.g = r3     // Catch: java.lang.Throwable -> L31
            r5 = r1
            goto L36
        L31:
            r0 = move-exception
            r2 = r12
            goto La7
        L35:
            r5 = r2
        L36:
            java.lang.Object r1 = r14.d     // Catch: java.lang.Throwable -> L31
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque<com.facebook.react.uimanager.e$s> r3 = r14.i     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L4a
            java.util.ArrayDeque<com.facebook.react.uimanager.e$s> r2 = r14.i     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            r14.i = r3     // Catch: java.lang.Throwable -> L4c
        L4a:
            r4 = r2
            goto L4f
        L4c:
            r0 = move-exception
            r2 = r12
            goto La3
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            nwg r1 = r14.j     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L57
            r1.b()     // Catch: java.lang.Throwable -> L31
        L57:
            com.facebook.react.uimanager.e$a r8 = new com.facebook.react.uimanager.e$a     // Catch: java.lang.Throwable -> L31
            r1 = r8
            r2 = r18
            r3 = r19
            r6 = r20
            r17 = r8
            r8 = r22
            r12 = r15
            r1.<init>(r3, r4, r5, r6, r8, r10, r12)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "acquiring mDispatchRunnablesLock"
            r2 = 0
            pyo$b r1 = defpackage.pyo.a(r2, r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = "batchId"
            pyo$b r0 = r1.a(r4, r0)     // Catch: java.lang.Throwable -> L96
            r0.c()     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r14.c     // Catch: java.lang.Throwable -> L96
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L96
            com.facebook.systrace.Systrace.g(r2)     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList<java.lang.Runnable> r0 = r14.h     // Catch: java.lang.Throwable -> L9c
            r4 = r17
            r0.add(r4)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r14.f7489k     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L98
            com.facebook.react.uimanager.e$b r0 = new com.facebook.react.uimanager.e$b     // Catch: java.lang.Throwable -> L96
            com.facebook.react.bridge.ReactApplicationContext r1 = r14.f     // Catch: java.lang.Throwable -> L96
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La7
        L98:
            com.facebook.systrace.Systrace.g(r2)
            return
        L9c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L96
        L9f:
            r0 = move-exception
            r2 = 0
            goto La7
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> L96
        La5:
            r0 = move-exception
            goto La3
        La7:
            com.facebook.systrace.Systrace.g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.e.t(int, long, long):void");
    }

    public void u() {
        this.g.add(new c(0, 0, true, false));
    }

    public void v(ReadableMap readableMap, Callback callback) {
        this.g.add(new d(this, readableMap, callback, null));
    }

    public void w(g9p g9pVar, int i2, String str, yej yejVar) {
        synchronized (this.d) {
            this.i.addLast(new C0171e(g9pVar, i2, str, yejVar));
        }
    }

    public void x() {
        this.g.add(new f(this, null));
    }

    @Deprecated
    public void y(int i2, int i3, ReadableArray readableArray) {
        this.g.add(new g(i2, i3, readableArray));
    }

    public void z(int i2, String str, ReadableArray readableArray) {
        this.g.add(new h(i2, str, readableArray));
    }
}
