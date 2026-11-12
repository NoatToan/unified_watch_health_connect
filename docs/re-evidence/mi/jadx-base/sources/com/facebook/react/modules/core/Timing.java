package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import defpackage.gmb;
import defpackage.hmb;
import defpackage.n06;
import defpackage.ndj;
import defpackage.uvo;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = Timing.NAME)
public final class Timing extends ReactContextBaseJavaModule implements LifecycleEventListener, hmb {
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    public static final String NAME = "Timing";
    private final AtomicBoolean isPaused;
    private final AtomicBoolean isRunningTasks;
    private c mCurrentIdleCallbackRunnable;
    private final n06 mDevSupportManager;
    private boolean mFrameCallbackPosted;
    private boolean mFrameIdleCallbackPosted;
    private final Object mIdleCallbackGuard;
    private final d mIdleFrameCallback;
    private final ReactChoreographer mReactChoreographer;
    private boolean mSendIdleEvents;
    private final f mTimerFrameCallback;
    private final Object mTimerGuard;
    private final SparseArray<e> mTimerIdsToTimers;
    private final PriorityQueue<e> mTimers;

    public class a implements Comparator<e> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            long j = eVar.d - eVar2.d;
            if (j == 0) {
                return 0;
            }
            return j < 0 ? -1 : 1;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7383a;

        public b(boolean z) {
            this.f7383a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (Timing.this.mIdleCallbackGuard) {
                try {
                    if (this.f7383a) {
                        Timing.this.setChoreographerIdleCallback();
                    } else {
                        Timing.this.clearChoreographerIdleCallback();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f7385a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7386b;

        public c(long j) {
            this.f7386b = j;
        }

        public void a() {
            this.f7385a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (this.f7385a) {
                return;
            }
            long jC = uvo.c() - (this.f7386b / FolmeCore.NANOS_TO_MS);
            long jA = uvo.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            synchronized (Timing.this.mIdleCallbackGuard) {
                z = Timing.this.mSendIdleEvents;
            }
            if (z) {
                ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks(jA);
            }
            Timing.this.mCurrentIdleCallbackRunnable = null;
        }
    }

    public class d extends com.facebook.react.modules.core.a.AbstractC0164a {
        public d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0164a
        public void a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.a();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = timing.new c(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.m(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }

        public /* synthetic */ d(Timing timing, a aVar) {
            this();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7389b;
        public final int c;
        public long d;

        public /* synthetic */ e(int i, long j, int i2, boolean z, a aVar) {
            this(i, j, i2, z);
        }

        public e(int i, long j, int i2, boolean z) {
            this.f7388a = i;
            this.d = j;
            this.c = i2;
            this.f7389b = z;
        }
    }

    public Timing(ReactApplicationContext reactApplicationContext, n06 n06Var) {
        super(reactApplicationContext);
        this.mTimerGuard = new Object();
        this.mIdleCallbackGuard = new Object();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        a aVar = null;
        this.mTimerFrameCallback = new f(this, aVar);
        this.mIdleFrameCallback = new d(this, aVar);
        this.mFrameCallbackPosted = false;
        this.mFrameIdleCallbackPosted = false;
        this.mSendIdleEvents = false;
        this.mDevSupportManager = n06Var;
        this.mTimers = new PriorityQueue<>(11, new a());
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = ReactChoreographer.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.o(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    private void clearFrameCallback() {
        gmb gmbVarD = gmb.d(getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !gmbVarD.e()) {
            this.mReactChoreographer.o(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    private void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            try {
                if (this.mSendIdleEvents) {
                    setChoreographerIdleCallback();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setChoreographerCallback() {
        if (this.mFrameCallbackPosted) {
            return;
        }
        this.mReactChoreographer.m(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
        this.mFrameCallbackPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            return;
        }
        this.mReactChoreographer.m(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
        this.mFrameIdleCallbackPosted = true;
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d2, boolean z) {
        long jA = uvo.a();
        long j = (long) d2;
        if (this.mDevSupportManager.getDevSupportEnabled() && Math.abs(j - jA) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j - jA) + ((long) i2));
        if (i2 == 0 && !z) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(i);
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(writableArrayCreateArray);
        } else {
            e eVar = new e(i, (uvo.b() / FolmeCore.NANOS_TO_MS) + jMax, i2, z, null);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(eVar);
                this.mTimerIdsToTimers.put(i, eVar);
            }
        }
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            try {
                e eVar = this.mTimerIdsToTimers.get(i);
                if (eVar == null) {
                    return;
                }
                this.mTimerIdsToTimers.remove(i);
                this.mTimers.remove(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        gmb.d(getReactApplicationContext()).b(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback();
        gmb.d(getReactApplicationContext()).g(this);
    }

    @Override // defpackage.hmb
    public void onHeadlessJsTaskFinish(int i) {
        if (gmb.d(getReactApplicationContext()).e()) {
            return;
        }
        this.isRunningTasks.set(false);
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHeadlessJsTaskStart(int i) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @ReactMethod
    public void setSendIdleEvents(boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        UiThreadUtil.runOnUiThread(new b(z));
    }

    public class f extends com.facebook.react.modules.core.a.AbstractC0164a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WritableArray f7390b;

        public f() {
            this.f7390b = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0164a
        public void a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / FolmeCore.NANOS_TO_MS;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((e) Timing.this.mTimers.peek()).d < j2) {
                        try {
                            e eVar = (e) Timing.this.mTimers.poll();
                            if (this.f7390b == null) {
                                this.f7390b = Arguments.createArray();
                            }
                            this.f7390b.pushInt(eVar.f7388a);
                            if (eVar.f7389b) {
                                eVar.d = ((long) eVar.c) + j2;
                                Timing.this.mTimers.add(eVar);
                            } else {
                                Timing.this.mTimerIdsToTimers.remove(eVar.f7388a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (this.f7390b != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.f7390b);
                    this.f7390b = null;
                }
                Timing.this.mReactChoreographer.m(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }

        public /* synthetic */ f(Timing timing, a aVar) {
            this();
        }
    }
}
