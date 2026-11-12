package defpackage;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public class pd8 implements LifecycleEventListener {
    private static final Comparator<jd8> EVENT_COMPARATOR = new a();
    private final d mCurrentFrameCallback;
    private final c mDispatchEventsRunnable;
    private final ReactApplicationContext mReactContext;
    private volatile ReactEventEmitter mReactEventEmitter;
    private final Object mEventsStagingLock = new Object();
    private final Object mEventsToDispatchLock = new Object();
    private final LongSparseArray<Integer> mEventCookieToLastEventIdx = new LongSparseArray<>();
    private final Map<String, Short> mEventNameToEventId = e4f.b();
    private final ArrayList<jd8> mEventStaging = new ArrayList<>();
    private final ArrayList<qd8> mListeners = new ArrayList<>();
    private final List<zg2> mPostEventDispatchListeners = new ArrayList();
    private final AtomicInteger mHasDispatchScheduledCount = new AtomicInteger();
    private jd8[] mEventsToDispatch = new jd8[16];
    private int mEventsToDispatchSize = 0;
    private short mNextEventTypeId = 0;
    private volatile boolean mHasDispatchScheduled = false;

    public class a implements Comparator<jd8> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(jd8 jd8Var, jd8 jd8Var2) {
            if (jd8Var == null && jd8Var2 == null) {
                return 0;
            }
            if (jd8Var == null) {
                return -1;
            }
            if (jd8Var2 == null) {
                return 1;
            }
            long timestampMs = jd8Var.getTimestampMs() - jd8Var2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pd8.this.stopFrameCallback();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Systrace.c(0L, "DispatchEventsRunnable");
            try {
                Systrace.d(0L, "ScheduleDispatchFrameCallback", pd8.this.mHasDispatchScheduledCount.getAndIncrement());
                pd8.this.mHasDispatchScheduled = false;
                sk1.c(pd8.this.mReactEventEmitter);
                synchronized (pd8.this.mEventsToDispatchLock) {
                    try {
                        if (pd8.this.mEventsToDispatchSize > 0) {
                            if (pd8.this.mEventsToDispatchSize > 1) {
                                Arrays.sort(pd8.this.mEventsToDispatch, 0, pd8.this.mEventsToDispatchSize, pd8.EVENT_COMPARATOR);
                            }
                            for (int i = 0; i < pd8.this.mEventsToDispatchSize; i++) {
                                jd8 jd8Var = pd8.this.mEventsToDispatch[i];
                                if (jd8Var != null) {
                                    Systrace.d(0L, jd8Var.getEventName(), jd8Var.getUniqueID());
                                    jd8Var.dispatch(pd8.this.mReactEventEmitter);
                                    jd8Var.dispose();
                                }
                            }
                            pd8.this.clearEventsToDispatch();
                            pd8.this.mEventCookieToLastEventIdx.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = pd8.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((zg2) it.next()).a();
                }
                Systrace.g(0L);
            } catch (Throwable th2) {
                Systrace.g(0L);
                throw th2;
            }
        }

        public /* synthetic */ c(pd8 pd8Var, a aVar) {
            this();
        }
    }

    public pd8(ReactApplicationContext reactApplicationContext) {
        a aVar = null;
        this.mDispatchEventsRunnable = new c(this, aVar);
        this.mCurrentFrameCallback = new d(this, aVar);
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(reactApplicationContext);
    }

    private void addEventToEventsToDispatch(jd8 jd8Var) {
        int i = this.mEventsToDispatchSize;
        jd8[] jd8VarArr = this.mEventsToDispatch;
        if (i == jd8VarArr.length) {
            this.mEventsToDispatch = (jd8[]) Arrays.copyOf(jd8VarArr, jd8VarArr.length * 2);
        }
        jd8[] jd8VarArr2 = this.mEventsToDispatch;
        int i2 = this.mEventsToDispatchSize;
        this.mEventsToDispatchSize = i2 + 1;
        jd8VarArr2[i2] = jd8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsToDispatch() {
        Arrays.fill(this.mEventsToDispatch, 0, this.mEventsToDispatchSize, (Object) null);
        this.mEventsToDispatchSize = 0;
    }

    private static long getEventCookie(int i, short s, short s2) {
        return ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((long) i) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    private void maybePostFrameCallbackFromNonUI() {
        if (this.mReactEventEmitter != null) {
            this.mCurrentFrameCallback.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveStagedEventsToDispatchQueue() {
        synchronized (this.mEventsStagingLock) {
            synchronized (this.mEventsToDispatchLock) {
                for (int i = 0; i < this.mEventStaging.size(); i++) {
                    try {
                        jd8 jd8Var = this.mEventStaging.get(i);
                        if (jd8Var.canCoalesce()) {
                            long eventCookie = getEventCookie(jd8Var.getViewTag(), jd8Var.getEventName(), jd8Var.getCoalescingKey());
                            Integer num = this.mEventCookieToLastEventIdx.get(eventCookie);
                            jd8 jd8Var2 = null;
                            if (num == null) {
                                this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                            } else {
                                jd8 jd8Var3 = this.mEventsToDispatch[num.intValue()];
                                jd8 jd8VarCoalesce = jd8Var.coalesce(jd8Var3);
                                if (jd8VarCoalesce != jd8Var3) {
                                    this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                                    this.mEventsToDispatch[num.intValue()] = null;
                                    jd8Var2 = jd8Var3;
                                    jd8Var = jd8VarCoalesce;
                                } else {
                                    jd8Var2 = jd8Var;
                                    jd8Var = null;
                                }
                            }
                            if (jd8Var != null) {
                                addEventToEventsToDispatch(jd8Var);
                            }
                            if (jd8Var2 != null) {
                                jd8Var2.dispose();
                            }
                        } else {
                            addEventToEventsToDispatch(jd8Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.mEventStaging.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopFrameCallback() {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentFrameCallback.f();
    }

    public void addBatchEventDispatchedListener(zg2 zg2Var) {
        this.mPostEventDispatchListeners.add(zg2Var);
    }

    public void addListener(qd8 qd8Var) {
        this.mListeners.add(qd8Var);
    }

    public void dispatchAllEvents() {
        maybePostFrameCallbackFromNonUI();
    }

    public void dispatchEvent(jd8 jd8Var) {
        sk1.b(jd8Var.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<qd8> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().a(jd8Var);
        }
        synchronized (this.mEventsStagingLock) {
            this.mEventStaging.add(jd8Var);
            Systrace.j(0L, jd8Var.getEventName(), jd8Var.getUniqueID());
        }
        maybePostFrameCallbackFromNonUI();
    }

    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        maybePostFrameCallbackFromNonUI();
    }

    public void registerEventEmitter(int i, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i, rCTEventEmitter);
    }

    public void removeBatchEventDispatchedListener(zg2 zg2Var) {
        this.mPostEventDispatchListeners.remove(zg2Var);
    }

    public void removeListener(qd8 qd8Var) {
        this.mListeners.remove(qd8Var);
    }

    public void unregisterEventEmitter(int i) {
        this.mReactEventEmitter.unregister(i);
    }

    private long getEventCookie(int i, String str, short s) {
        short sShortValue;
        Short sh = this.mEventNameToEventId.get(str);
        if (sh != null) {
            sShortValue = sh.shortValue();
        } else {
            short s2 = this.mNextEventTypeId;
            this.mNextEventTypeId = (short) (s2 + 1);
            this.mEventNameToEventId.put(str, Short.valueOf(s2));
            sShortValue = s2;
        }
        return getEventCookie(i, sShortValue, s);
    }

    public class d extends com.facebook.react.modules.core.a.AbstractC0164a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f30286b;
        public boolean c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.c();
            }
        }

        public d() {
            this.f30286b = false;
            this.c = false;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0164a
        public void a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.c) {
                this.f30286b = false;
            } else {
                e();
            }
            Systrace.c(0L, "ScheduleDispatchFrameCallback");
            try {
                pd8.this.moveStagedEventsToDispatchQueue();
                if (!pd8.this.mHasDispatchScheduled) {
                    pd8.this.mHasDispatchScheduled = true;
                    Systrace.j(0L, "ScheduleDispatchFrameCallback", pd8.this.mHasDispatchScheduledCount.get());
                    pd8.this.mReactContext.runOnJSQueueThread(pd8.this.mDispatchEventsRunnable);
                }
            } finally {
                Systrace.g(0L);
            }
        }

        public void c() {
            if (this.f30286b) {
                return;
            }
            this.f30286b = true;
            e();
        }

        public void d() {
            if (this.f30286b) {
                return;
            }
            if (pd8.this.mReactContext.isOnUiQueueThread()) {
                c();
            } else {
                pd8.this.mReactContext.runOnUiQueueThread(new a());
            }
        }

        public final void e() {
            ReactChoreographer.i().m(ReactChoreographer.CallbackType.TIMERS_EVENTS, pd8.this.mCurrentFrameCallback);
        }

        public void f() {
            this.c = true;
        }

        public /* synthetic */ d(pd8 pd8Var, a aVar) {
            this();
        }
    }
}
