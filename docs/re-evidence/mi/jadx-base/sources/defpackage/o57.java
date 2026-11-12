package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class o57 extends jd8<o57> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28742a;

    public o57(int i, int i2) {
        super(i);
        this.f28742a = i2;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("drawerState", a());
        return writableMapCreateMap;
    }

    public int a() {
        return this.f28742a;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
