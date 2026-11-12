package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fitness.util.SportRecordBundleKey;

/* JADX INFO: loaded from: classes4.dex */
public class t4d extends jd8<t4d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34298b;
    public final int c;
    public final int d;
    public final String e;

    public t4d(int i, int i2) {
        this(i, i2, null);
    }

    public static String a(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return "topLoad";
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
    }

    @Override // defpackage.jd8
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMapCreateMap;
        int i;
        if (this.f34298b != null || (i = this.f34297a) == 2 || i == 1) {
            writableMapCreateMap = Arguments.createMap();
            String str = this.f34298b;
            if (str != null) {
                writableMapCreateMap.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, str);
            }
            int i2 = this.f34297a;
            if (i2 == 2) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("width", this.c);
                writableMapCreateMap2.putDouble("height", this.d);
                String str2 = this.f34298b;
                if (str2 != null) {
                    writableMapCreateMap2.putString("url", str2);
                }
                writableMapCreateMap.putMap("source", writableMapCreateMap2);
            } else if (i2 == 1) {
                writableMapCreateMap.putString("error", this.e);
            }
        } else {
            writableMapCreateMap = null;
        }
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap);
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) this.f34297a;
    }

    @Override // defpackage.jd8
    public String getEventName() {
        return a(this.f34297a);
    }

    public t4d(int i, int i2, String str) {
        this(i, i2, str, 0, 0, null);
    }

    public t4d(int i, int i2, String str, int i3, int i4) {
        this(i, i2, str, i3, i4, null);
    }

    public t4d(int i, int i2, boolean z, String str) {
        this(i, i2, null, 0, 0, str);
    }

    public t4d(int i, int i2, String str, int i3, int i4, String str2) {
        super(i);
        this.f34297a = i2;
        this.f34298b = str;
        this.c = i3;
        this.d = i4;
        this.e = str2;
    }
}
