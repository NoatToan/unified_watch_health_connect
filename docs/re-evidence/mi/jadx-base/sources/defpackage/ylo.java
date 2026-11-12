package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ylo extends dc1 {
    public final a e;
    public final Map<String, Integer> f;

    public ylo(ReadableMap readableMap, a aVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.e = aVar;
    }

    public void f(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
            dc1 dc1VarL = this.e.l(entry.getValue().intValue());
            if (dc1VarL == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
            if (dc1VarL instanceof zxp) {
                ((zxp) dc1VarL).f(javaOnlyMap);
            } else {
                if (!(dc1VarL instanceof hnq)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + dc1VarL.getClass());
                }
                javaOnlyMap.putDouble(entry.getKey(), ((hnq) dc1VarL).i());
            }
        }
    }
}
