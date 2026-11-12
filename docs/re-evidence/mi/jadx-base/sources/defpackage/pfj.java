package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fitness.statistics.StatConstants;

/* JADX INFO: loaded from: classes4.dex */
public class pfj extends jd8<pfj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30349b;

    public pfj(int i, int i2, int i3) {
        super(i);
        this.f30348a = i2;
        this.f30349b = i3;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt(StatConstants.PARAM_END, this.f30349b);
        writableMapCreateMap2.putInt(StatConstants.PARAM_START, this.f30348a);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topSelectionChange";
    }
}
