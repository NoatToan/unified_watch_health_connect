package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes6.dex */
public class sbd extends jd8<sbd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f08 f33483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public aak f33484b;

    public sbd(int i, f08 f08Var, aak aakVar) {
        super(i);
        this.f33483a = f08Var;
        this.f33484b = aakVar;
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", pwl.b(this.f33483a));
        writableMapCreateMap.putMap("frame", pwl.d(this.f33484b));
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap);
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return "topInsetsChange";
    }
}
