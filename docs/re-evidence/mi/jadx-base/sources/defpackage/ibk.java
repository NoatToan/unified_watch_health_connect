package defpackage;

import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class ibk extends jd8<ibk> {
    public ibk(int i) {
        super(i);
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topRefresh";
    }
}
