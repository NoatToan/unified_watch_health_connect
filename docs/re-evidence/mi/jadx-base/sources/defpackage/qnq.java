package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes6.dex */
public class qnq extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f31682a;

    public qnq(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        if (readableMap == null || !readableMap.hasKey("value")) {
            this.f31682a = null;
            return;
        }
        ReadableType type = readableMap.getType("value");
        if (type == ReadableType.String) {
            this.f31682a = readableMap.getString("value");
        } else if (type == ReadableType.Number) {
            this.f31682a = Double.valueOf(readableMap.getDouble("value"));
        } else {
            if (type != ReadableType.Null) {
                throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
            }
            this.f31682a = null;
        }
    }

    public void b(Object obj) {
        this.f31682a = obj;
        forceUpdateMemoizedValue(obj);
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        return this.f31682a;
    }
}
