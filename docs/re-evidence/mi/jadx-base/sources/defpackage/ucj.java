package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class ucj extends jd8<cfj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35623b;

    public ucj(int i, float f, float f2) {
        super(i);
        this.f35622a = f;
        this.f35623b = f2;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("width", this.f35622a);
        writableMapCreateMap2.putDouble("height", this.f35623b);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topContentSizeChange";
    }
}
