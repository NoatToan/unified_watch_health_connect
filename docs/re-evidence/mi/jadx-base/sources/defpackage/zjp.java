package defpackage;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchEventType;

/* JADX INFO: loaded from: classes4.dex */
public class zjp {
    public static WritableArray a(int i, vjp vjpVar) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        MotionEvent motionEventA = vjpVar.a();
        float x = motionEventA.getX() - vjpVar.b();
        float y = motionEventA.getY() - vjpVar.c();
        for (int i2 = 0; i2 < motionEventA.getPointerCount(); i2++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("pageX", exh.a(motionEventA.getX(i2)));
            writableMapCreateMap.putDouble("pageY", exh.a(motionEventA.getY(i2)));
            float x2 = motionEventA.getX(i2) - x;
            float y2 = motionEventA.getY(i2) - y;
            writableMapCreateMap.putDouble("locationX", exh.a(x2));
            writableMapCreateMap.putDouble("locationY", exh.a(y2));
            writableMapCreateMap.putInt("target", i);
            writableMapCreateMap.putDouble("timestamp", vjpVar.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEventA.getPointerId(i2));
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }

    public static void b(RCTEventEmitter rCTEventEmitter, TouchEventType touchEventType, int i, vjp vjpVar) {
        WritableArray writableArrayA = a(i, vjpVar);
        MotionEvent motionEventA = vjpVar.a();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (touchEventType == TouchEventType.MOVE || touchEventType == TouchEventType.CANCEL) {
            for (int i2 = 0; i2 < motionEventA.getPointerCount(); i2++) {
                writableArrayCreateArray.pushInt(i2);
            }
        } else {
            if (touchEventType != TouchEventType.START && touchEventType != TouchEventType.END) {
                throw new RuntimeException("Unknown touch type: " + touchEventType);
            }
            writableArrayCreateArray.pushInt(motionEventA.getActionIndex());
        }
        rCTEventEmitter.receiveTouches(TouchEventType.getJSEventName(touchEventType), writableArrayA, writableArrayCreateArray);
    }
}
