package defpackage;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.scroll.ScrollEventType;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes4.dex */
public class vhl extends jd8<vhl> {
    public static final Pools.SynchronizedPool<vhl> j = new Pools.SynchronizedPool<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36906b;
    public double c;
    public double d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ScrollEventType i;

    public static vhl b(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        vhl vhlVarAcquire = j.acquire();
        if (vhlVarAcquire == null) {
            vhlVarAcquire = new vhl();
        }
        vhlVarAcquire.a(i, scrollEventType, i2, i3, f, f2, i4, i5, i6, i7);
        return vhlVarAcquire;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", 0.0d);
        writableMapCreateMap.putDouble("bottom", 0.0d);
        writableMapCreateMap.putDouble("left", 0.0d);
        writableMapCreateMap.putDouble(TSMAuthContants.PARAM_KEY_RIGHT, 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", exh.a(this.f36905a));
        writableMapCreateMap2.putDouble("y", exh.a(this.f36906b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("width", exh.a(this.e));
        writableMapCreateMap3.putDouble("height", exh.a(this.f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("width", exh.a(this.g));
        writableMapCreateMap4.putDouble("height", exh.a(this.h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.c);
        writableMapCreateMap5.putDouble("y", this.d);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        return writableMapCreateMap6;
    }

    public final void a(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.init(i);
        this.i = scrollEventType;
        this.f36905a = i2;
        this.f36906b = i3;
        this.c = f;
        this.d = f2;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return this.i == ScrollEventType.SCROLL;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return ScrollEventType.getJSEventName((ScrollEventType) sk1.c(this.i));
    }

    @Override // defpackage.jd8
    public void onDispose() {
        j.release(this);
    }
}
