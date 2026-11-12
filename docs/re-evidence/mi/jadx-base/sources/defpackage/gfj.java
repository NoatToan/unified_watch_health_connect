package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fitness.statistics.StatConstants;

/* JADX INFO: loaded from: classes4.dex */
public class gfj extends jd8<gfj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18928b;
    public int c;
    public int d;

    public gfj(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.f18927a = str;
        this.f18928b = str2;
        this.c = i2;
        this.d = i3;
    }

    private WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(StatConstants.PARAM_START, this.c);
        writableMapCreateMap2.putDouble(StatConstants.PARAM_END, this.d);
        writableMapCreateMap.putString("text", this.f18927a);
        writableMapCreateMap.putString("previousText", this.f18928b);
        writableMapCreateMap.putMap("range", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
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
        return "topTextInput";
    }
}
