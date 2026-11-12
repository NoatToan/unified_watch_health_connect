package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class tdi extends dc1 {
    public int e = -1;
    public final a f;
    public final UIManager g;
    public final Map<String, Integer> h;
    public final JavaOnlyMap i;

    public tdi(ReadableMap readableMap, a aVar, UIManager uIManager) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.h = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.h.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.i = new JavaOnlyMap();
        this.f = aVar;
        this.g = uIManager;
    }

    public void f(int i) {
        if (this.e == -1) {
            this.e = i;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.d + " is already attached to a view");
    }

    public void g(int i) {
        if (this.e != i) {
            throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
        }
        this.e = -1;
    }

    public void h() {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.i.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.i.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
    }

    public final void i() {
        if (this.e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.h.entrySet()) {
            dc1 dc1VarL = this.f.l(entry.getValue().intValue());
            if (dc1VarL == null) {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
            if (dc1VarL instanceof ylo) {
                ((ylo) dc1VarL).f(this.i);
            } else {
                if (!(dc1VarL instanceof hnq)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + dc1VarL.getClass());
                }
                hnq hnqVar = (hnq) dc1VarL;
                Object objH = hnqVar.h();
                if (objH instanceof String) {
                    this.i.putString(entry.getKey(), (String) objH);
                } else {
                    this.i.putDouble(entry.getKey(), hnqVar.i());
                }
            }
        }
        this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
    }
}
