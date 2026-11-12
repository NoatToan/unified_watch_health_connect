package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageScrollEvent;

/* JADX INFO: loaded from: classes6.dex */
public class whh extends jd8<whh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f37981b;

    public whh(int i, int i2, float f) {
        super(i);
        this.f37980a = i2;
        this.f37981b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f37980a);
        writableMapCreateMap.putDouble("offset", this.f37981b);
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
