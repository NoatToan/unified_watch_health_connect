package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y1 extends w2 {
    private y1(Map<String, Object> map) {
        super(map);
    }

    public static y1 a() {
        return new y1(new ArrayMap());
    }

    public static y1 b(w2 w2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : w2Var.f5841a.keySet()) {
            arrayMap.put(str, w2Var.f5841a.get(str));
        }
        return new y1(arrayMap);
    }
}
