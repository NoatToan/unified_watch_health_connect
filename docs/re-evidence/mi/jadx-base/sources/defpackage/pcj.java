package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class pcj extends jd8<pcj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30248a;

    public pcj(int i, boolean z) {
        super(i);
        this.f30248a = z;
    }

    public boolean a() {
        return this.f30248a;
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
        return "topChange";
    }

    public final WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putBoolean("value", a());
        return writableMapCreateMap;
    }
}
