package defpackage;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes6.dex */
public class h8j extends jd8<h8j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pools.SynchronizedPool<h8j> f19804b = new Pools.SynchronizedPool<>(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WritableMap f19805a;

    public static h8j b(oya oyaVar, int i, int i2, t7j t7jVar) {
        h8j h8jVarAcquire = f19804b.acquire();
        if (h8jVarAcquire == null) {
            h8jVarAcquire = new h8j();
        }
        h8jVarAcquire.a(oyaVar, i, i2, t7jVar);
        return h8jVarAcquire;
    }

    public final void a(oya oyaVar, int i, int i2, t7j t7jVar) {
        super.init(oyaVar.r().getId());
        WritableMap writableMapCreateMap = Arguments.createMap();
        this.f19805a = writableMapCreateMap;
        if (t7jVar != null) {
            t7jVar.a(oyaVar, writableMapCreateMap);
        }
        this.f19805a.putInt("handlerTag", oyaVar.q());
        this.f19805a.putInt("state", i);
        this.f19805a.putInt("oldState", i2);
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f19805a);
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // defpackage.jd8
    public void onDispose() {
        this.f19805a = null;
        f19804b.release(this);
    }
}
