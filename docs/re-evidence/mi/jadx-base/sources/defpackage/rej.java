package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class rej extends jd8<rej> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f32470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32471b;

    public rej(int i, double d, boolean z) {
        super(i);
        this.f32470a = d;
        this.f32471b = z;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", a());
        writableMapCreateMap.putBoolean("fromUser", b());
        return writableMapCreateMap;
    }

    public double a() {
        return this.f32470a;
    }

    public boolean b() {
        return this.f32471b;
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
        return "topChange";
    }
}
