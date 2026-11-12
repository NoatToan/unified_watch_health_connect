package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class m57 extends jd8<m57> {
    public m57(int i) {
        super(i);
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), Arguments.createMap());
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topDrawerOpen";
    }
}
