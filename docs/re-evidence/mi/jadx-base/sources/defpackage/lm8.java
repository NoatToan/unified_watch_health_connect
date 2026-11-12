package defpackage;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.GuardedBy;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.Binding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class lm8 implements UIManager, LifecycleEventListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f25208r = "lm8";
    public static final boolean s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Binding f25209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactApplicationContext f25210b;
    public final pd8 c;
    public final ConcurrentHashMap<Integer, g9p> d;
    public final EventBeatManager e;
    public final Object f;
    public final Object g;

    @GuardedBy("mMountItemsLock")
    public List<x8g> h;

    @GuardedBy("mPreMountItemsLock")
    public ArrayDeque<x8g> i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25211k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;

    public class a implements x8g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f25212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25213b;
        public final /* synthetic */ boolean c;

        public a(int i, int i2, boolean z) {
            this.f25212a = i;
            this.f25213b = i2;
            this.c = z;
        }

        @Override // defpackage.x8g
        public void a(y8g y8gVar) {
            throw null;
        }
    }

    public class b implements x8g {
        public b() {
        }

        @Override // defpackage.x8g
        public void a(y8g y8gVar) {
            throw null;
        }
    }

    static {
        s = edj.d || c9i.a().b(ycj.g);
        km8.a();
    }

    @v07
    private x8g createBatchMountItem(x8g[] x8gVarArr, int i, int i2) {
        return new BatchMountItem(x8gVarArr, i, i2);
    }

    @v07
    private x8g createMountItem(String str, ReadableMap readableMap, Object obj, int i, int i2, boolean z) {
        String strA = jm8.a(str);
        g9p g9pVar = this.d.get(Integer.valueOf(i));
        if (g9pVar != null) {
            return new w05(g9pVar, i, i2, strA, readableMap, (bdo) obj, z);
        }
        throw new IllegalArgumentException("Unable to find ReactContext for root: " + i);
    }

    @v07
    private x8g deleteMountItem(int i) {
        return new xy5(i);
    }

    @v07
    private x8g insertMountItem(int i, int i2, int i3) {
        return new nbd(i, i2, i3);
    }

    @v07
    private long measure(String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, float f2, float f3, float f4) {
        lae.d(f, f2);
        lae.c(f, f2);
        lae.d(f3, f4);
        lae.c(f3, f4);
        throw null;
    }

    @v07
    private void preallocateView(int i, int i2, String str, ReadableMap readableMap, Object obj, boolean z) {
        g9p g9pVar = this.d.get(Integer.valueOf(i));
        String strA = jm8.a(str);
        synchronized (this.g) {
            this.i.add(new h5i(g9pVar, i, i2, strA, readableMap, (bdo) obj, z));
        }
    }

    @v07
    private x8g removeMountItem(int i, int i2, int i3) {
        return new okk(i, i2, i3);
    }

    @v07
    private void scheduleMountItem(x8g x8gVar, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        boolean z = x8gVar instanceof BatchMountItem;
        if (z) {
            this.m = j;
            this.n = j5 - j4;
            this.p = j7 - j6;
            this.o = SystemClock.uptimeMillis() - j6;
            this.l = SystemClock.uptimeMillis();
        }
        synchronized (this.f) {
            this.h.add(x8gVar);
        }
        if (z) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i, this.m);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i);
        }
        if (UiThreadUtil.isOnUiThread()) {
            a();
        }
    }

    @v07
    private x8g updateEventEmitterMountItem(int i, Object obj) {
        return new ubq(i, (EventEmitterWrapper) obj);
    }

    @v07
    private x8g updateLayoutMountItem(int i, int i2, int i3, int i4, int i5, int i6) {
        return new fcq(i, i2, i3, i4, i5, i6);
    }

    @v07
    private x8g updateLocalDataMountItem(int i, ReadableMap readableMap) {
        return new gcq(i, readableMap);
    }

    @v07
    private x8g updatePropsMountItem(int i, ReadableMap readableMap) {
        return new hcq(i, readableMap);
    }

    @v07
    private x8g updateStateMountItem(int i, Object obj) {
        return new kcq(i, (bdo) obj);
    }

    public final void a() {
        ArrayDeque<x8g> arrayDeque;
        this.j = SystemClock.uptimeMillis();
        synchronized (this.f) {
            try {
                if (this.h.isEmpty()) {
                    return;
                }
                List<x8g> list = this.h;
                this.h = new ArrayList();
                synchronized (this.g) {
                    try {
                        if (this.i.isEmpty()) {
                            arrayDeque = null;
                        } else {
                            arrayDeque = this.i;
                            this.i = new ArrayDeque<>(250);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (arrayDeque != null) {
                    Systrace.c(0L, "FabricUIManager::mountViews preMountItems to execute: " + arrayDeque.size());
                    while (!arrayDeque.isEmpty()) {
                        arrayDeque.pollFirst().a(null);
                    }
                    Systrace.g(0L);
                }
                Systrace.c(0L, "FabricUIManager::mountViews mountItems to execute: " + list.size());
                long jUptimeMillis = SystemClock.uptimeMillis();
                for (x8g x8gVar : list) {
                    if (s) {
                        cm8.b(f25208r, "dispatchMountItems: Executing mountItem: " + x8gVar);
                    }
                    x8gVar.a(null);
                }
                this.f25211k = SystemClock.uptimeMillis() - jUptimeMillis;
                Systrace.g(0L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        mej.a();
        new g9p(this.f25210b, t.getContext());
        throw null;
    }

    public void b(int i, String str, WritableMap writableMap) {
        throw null;
    }

    @v07
    public void clearJSResponder() {
        synchronized (this.f) {
            this.h.add(new b());
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        synchronized (this.f) {
            this.h.add(new xy6(i, i2, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.m));
        map.put("LayoutTime", Long.valueOf(this.n));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.l));
        map.put("RunStartTime", Long.valueOf(this.j));
        map.put("BatchedExecutionTime", Long.valueOf(this.f25211k));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.o));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.p));
        return map;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.c.registerEventEmitter(2, new FabricEventEmitter(this));
        this.c.addBatchEventDispatchedListener(this.e);
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        if (s) {
            cm8.b(f25208r, "Destroying Catalyst Instance");
        }
        this.c.removeBatchEventDispatchedListener(this.e);
        this.c.unregisterEventEmitter(2);
        this.f25209a.a();
        bvq.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        ReactChoreographer.i().o(ReactChoreographer.CallbackType.DISPATCH_UI, null);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactChoreographer.i().m(ReactChoreographer.CallbackType.DISPATCH_UI, null);
    }

    @v07
    public void onRequestEventBeat() {
        this.c.dispatchAllEvents();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @v07
    public void setJSResponder(int i, int i2, boolean z) {
        synchronized (this.f) {
            this.h.add(new a(i, i2, z));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) throws Throwable {
        String str;
        int i2;
        String str2;
        int i3;
        ReactMarkerConstants reactMarkerConstants;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i4 = this.q;
        this.q = i4 + 1;
        try {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i4);
            try {
                scheduleMountItem(updatePropsMountItem(i, readableMap), i4, jUptimeMillis, 0L, 0L, 0L, 0L, 0L, 0L);
                reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
                i3 = i4;
                str2 = null;
            } catch (Exception unused) {
                i3 = i4;
                str2 = null;
                reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
            } catch (Throwable th) {
                th = th;
                i2 = i4;
                str = null;
                ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, str, i2);
                throw th;
            }
        } catch (Exception unused2) {
            str2 = null;
            i3 = i4;
        } catch (Throwable th2) {
            th = th2;
            str = null;
            i2 = i4;
        }
        ReactMarker.logFabricMarker(reactMarkerConstants, str2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        if (s) {
            cm8.b(f25208r, "Updating Root Layout Specs");
        }
        this.f25209a.setConstraints(i, lae.b(i2), lae.a(i2), lae.b(i3), lae.a(i3));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        synchronized (this.f) {
            this.h.add(new zy6(i, str, readableArray));
        }
    }
}
