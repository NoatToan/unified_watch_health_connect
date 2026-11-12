package defpackage;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class zlo extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Integer> f41445a;

    public zlo(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f41445a = hmq.b(readableMap.getMap("style"));
    }

    @Override // defpackage.pvg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WritableMap evaluate() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry<String, Integer> entry : this.f41445a.entrySet()) {
            pvg pvgVarO = this.mNodesManager.o(entry.getValue().intValue(), pvg.class);
            if (pvgVarO instanceof gyp) {
                javaOnlyMap.putArray(entry.getKey(), (WritableArray) pvgVarO.value());
            } else {
                Object objValue = pvgVarO.value();
                if (objValue instanceof Double) {
                    javaOnlyMap.putDouble(entry.getKey(), ((Double) objValue).doubleValue());
                } else {
                    if (!(objValue instanceof String)) {
                        throw new IllegalStateException("Wrong style form");
                    }
                    javaOnlyMap.putString(entry.getKey(), (String) objValue);
                }
            }
        }
        return javaOnlyMap;
    }
}
