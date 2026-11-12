package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class vej extends jd8<vej> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f36805a;

    public vej(int i, double d) {
        super(i);
        this.f36805a = d;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", a());
        return writableMapCreateMap;
    }

    public double a() {
        return this.f36805a;
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return false;
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
        return "topSlidingComplete";
    }
}
