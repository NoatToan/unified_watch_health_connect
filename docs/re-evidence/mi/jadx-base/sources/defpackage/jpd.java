package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class jpd extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23003a;

    public jpd(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f23003a = hmq.a(readableMap.getArray("input"));
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int i = 0;
        while (true) {
            int[] iArr = this.f23003a;
            if (i >= iArr.length) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", this.mNodeID);
                writableMapCreateMap.putArray("args", writableArrayCreateArray);
                this.mNodesManager.x("onReanimatedCall", writableMapCreateMap);
                return pvg.ZERO;
            }
            pvg pvgVarO = this.mNodesManager.o(iArr[i], pvg.class);
            if (pvgVarO.value() == null) {
                writableArrayCreateArray.pushNull();
            } else {
                Object objValue = pvgVarO.value();
                if (objValue instanceof String) {
                    writableArrayCreateArray.pushString((String) objValue);
                } else {
                    writableArrayCreateArray.pushDouble(pvgVarO.doubleValue().doubleValue());
                }
            }
            i++;
        }
    }
}
