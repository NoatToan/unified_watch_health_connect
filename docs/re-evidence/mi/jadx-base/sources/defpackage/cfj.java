package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class cfj extends jd8<cfj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5283b;

    public cfj(int i, String str, int i2) {
        super(i);
        this.f5282a = str;
        this.f5283b = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f5282a);
        writableMapCreateMap.putInt("eventCount", this.f5283b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topChange";
    }
}
