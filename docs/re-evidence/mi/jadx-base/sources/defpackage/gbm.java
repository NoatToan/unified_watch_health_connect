package defpackage;

import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class gbm extends jd8<gbm> {
    public gbm(int i) {
        super(i);
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topShow";
    }
}
