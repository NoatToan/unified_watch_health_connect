package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageSelectedEvent;

/* JADX INFO: loaded from: classes6.dex */
public class aih extends jd8<aih> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1061a;

    public aih(int i, int i2) {
        super(i);
        this.f1061a = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f1061a);
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
