package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class hi4 extends jd8<hi4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20090b;

    public hi4(int i, int i2, int i3) {
        super(i);
        this.f20089a = i2;
        this.f20090b = i3;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", exh.a(this.f20089a));
        writableMapCreateMap.putDouble("height", exh.a(this.f20090b));
        rCTEventEmitter.receiveEvent(getViewTag(), "topContentSizeChange", writableMapCreateMap);
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topContentSizeChange";
    }
}
