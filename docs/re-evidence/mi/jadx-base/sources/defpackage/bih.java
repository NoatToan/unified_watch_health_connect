package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageSelectedEvent;

/* JADX INFO: loaded from: classes4.dex */
public class bih extends jd8<bih> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4252a;

    public bih(int i, int i2) {
        super(i);
        this.f4252a = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f4252a);
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return PageSelectedEvent.EVENT_NAME;
    }
}
