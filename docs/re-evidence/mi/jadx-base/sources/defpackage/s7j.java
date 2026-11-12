package defpackage;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes6.dex */
public class s7j extends jd8<s7j> {
    public static final Pools.SynchronizedPool<s7j> c = new Pools.SynchronizedPool<>(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WritableMap f33381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f33382b;

    public static s7j b(oya oyaVar, t7j t7jVar) {
        s7j s7jVarAcquire = c.acquire();
        if (s7jVarAcquire == null) {
            s7jVarAcquire = new s7j();
        }
        s7jVarAcquire.a(oyaVar, t7jVar);
        return s7jVarAcquire;
    }

    public final void a(oya oyaVar, t7j t7jVar) {
        super.init(oyaVar.r().getId());
        WritableMap writableMapCreateMap = Arguments.createMap();
        this.f33381a = writableMapCreateMap;
        if (t7jVar != null) {
            t7jVar.a(oyaVar, writableMapCreateMap);
        }
        this.f33381a.putInt("handlerTag", oyaVar.q());
        this.f33381a.putInt("state", oyaVar.p());
        this.f33382b = oyaVar.j();
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return true;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f33381a);
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return this.f33382b;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // defpackage.jd8
    public void onDispose() {
        this.f33381a = null;
        c.release(this);
    }
}
