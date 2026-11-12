package defpackage;

import android.view.MotionEvent;
import androidx.core.util.Pools;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchEventType;

/* JADX INFO: loaded from: classes4.dex */
public class vjp extends jd8<vjp> {
    public static final Pools.SynchronizedPool<vjp> f = new Pools.SynchronizedPool<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f36957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TouchEventType f36958b;
    public short c;
    public float d;
    public float e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36959a;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            f36959a = iArr;
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36959a[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36959a[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36959a[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static vjp e(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f2, float f3, wjp wjpVar) {
        vjp vjpVarAcquire = f.acquire();
        if (vjpVarAcquire == null) {
            vjpVarAcquire = new vjp();
        }
        vjpVarAcquire.d(i, touchEventType, motionEvent, j, f2, f3, wjpVar);
        return vjpVarAcquire;
    }

    public MotionEvent a() {
        sk1.c(this.f36957a);
        return this.f36957a;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        int i = a.f36959a[((TouchEventType) sk1.c(this.f36958b)).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f36958b);
    }

    public final void d(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f2, float f3, wjp wjpVar) {
        super.init(i);
        short sB = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            wjpVar.a(j);
        } else if (action == 1) {
            wjpVar.e(j);
        } else if (action == 2) {
            sB = wjpVar.b(j);
        } else if (action == 3) {
            wjpVar.e(j);
        } else {
            if (action != 5 && action != 6) {
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
            }
            wjpVar.d(j);
        }
        this.f36958b = touchEventType;
        this.f36957a = MotionEvent.obtain(motionEvent);
        this.c = sB;
        this.d = f2;
        this.e = f3;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        zjp.b(rCTEventEmitter, (TouchEventType) sk1.c(this.f36958b), getViewTag(), this);
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return this.c;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return TouchEventType.getJSEventName((TouchEventType) sk1.c(this.f36958b));
    }

    @Override // defpackage.jd8
    public void onDispose() {
        ((MotionEvent) sk1.c(this.f36957a)).recycle();
        this.f36957a = null;
        f.release(this);
    }
}
