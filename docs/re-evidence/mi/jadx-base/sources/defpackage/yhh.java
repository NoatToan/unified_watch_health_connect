package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.reactnativepagerview.event.PageScrollStateChangedEvent;

/* JADX INFO: loaded from: classes6.dex */
public class yhh extends jd8<yhh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40185a;

    public yhh(int i, String str) {
        super(i);
        this.f40185a = str;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("pageScrollState", this.f40185a);
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
