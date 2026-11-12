package defpackage;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class y8h extends jd8<y8h> {
    public static final Pools.SynchronizedPool<y8h> e = new Pools.SynchronizedPool<>(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39929b;
    public int c;
    public int d;

    public static y8h b(int i, int i2, int i3, int i4, int i5) {
        y8h y8hVarAcquire = e.acquire();
        if (y8hVarAcquire == null) {
            y8hVarAcquire = new y8h();
        }
        y8hVarAcquire.a(i, i2, i3, i4, i5);
        return y8hVarAcquire;
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        super.init(i);
        this.f39928a = i2;
        this.f39929b = i3;
        this.c = i4;
        this.d = i5;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", exh.a(this.f39928a));
        writableMapCreateMap.putDouble("y", exh.a(this.f39929b));
        writableMapCreateMap.putDouble("width", exh.a(this.c));
        writableMapCreateMap.putDouble("height", exh.a(this.d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap2);
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topLayout";
    }

    @Override // defpackage.jd8
    public void onDispose() {
        e.release(this);
    }
}
