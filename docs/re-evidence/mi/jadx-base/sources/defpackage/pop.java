package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class pop extends dc1 {
    public final a e;
    public final int f;
    public final int g;
    public final int h;
    public final JavaOnlyMap i;

    public pop(ReadableMap readableMap, a aVar) {
        this.e = aVar;
        this.f = readableMap.getInt("animationId");
        this.g = readableMap.getInt("toValue");
        this.h = readableMap.getInt("value");
        this.i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // defpackage.dc1
    public void e() {
        this.i.putDouble("toValue", ((hnq) this.e.l(this.g)).i());
        this.e.t(this.f, this.h, this.i, null);
    }
}
