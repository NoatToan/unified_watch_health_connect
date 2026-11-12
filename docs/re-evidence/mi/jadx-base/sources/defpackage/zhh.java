package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageScrollStateChangedEvent;

/* JADX INFO: loaded from: classes4.dex */
public class zhh extends jd8<zhh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41286a;

    public zhh(int i, String str) {
        super(i);
        this.f41286a = str;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("pageScrollState", this.f41286a);
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return PageScrollStateChangedEvent.EVENT_NAME;
    }
}
