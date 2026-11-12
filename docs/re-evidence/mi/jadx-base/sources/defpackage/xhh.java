package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageScrollEvent;

/* JADX INFO: loaded from: classes4.dex */
public class xhh extends jd8<xhh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39134b;

    public xhh(int i, int i2, float f) {
        super(i);
        this.f39133a = i2;
        this.f39134b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f39133a);
        writableMapCreateMap.putDouble("offset", this.f39134b);
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return PageScrollEvent.EVENT_NAME;
    }
}
