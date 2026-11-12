package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class osk {
    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, WritableMap writableMap) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushMap(writableMap);
        rCTDeviceEventEmitter.emit("didReceiveNetworkData", writableArrayCreateArray);
    }

    public static void b(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkData", writableArrayCreateArray);
    }

    public static void c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushInt((int) j);
        writableArrayCreateArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", writableArrayCreateArray);
    }

    public static void d(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushInt((int) j);
        writableArrayCreateArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didSendNetworkData", writableArrayCreateArray);
    }

    public static void e(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, long j, long j2) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushString(str);
        writableArrayCreateArray.pushInt((int) j);
        writableArrayCreateArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", writableArrayCreateArray);
    }

    public static void f(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, Throwable th) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushString(str);
        if (th != null && th.getClass() == SocketTimeoutException.class) {
            writableArrayCreateArray.pushBoolean(true);
        }
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", writableArrayCreateArray);
    }

    public static void g(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushNull();
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", writableArrayCreateArray);
    }

    public static void h(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, int i2, WritableMap writableMap, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushInt(i2);
        writableArrayCreateArray.pushMap(writableMap);
        writableArrayCreateArray.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", writableArrayCreateArray);
    }
}
