package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class ffj extends jd8<ffj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17741a;

    public ffj(int i, String str) {
        super(i);
        this.f17741a = str;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.f17741a);
        return writableMapCreateMap;
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
    public String getEventName() {
        return "topEndEditing";
    }
}
