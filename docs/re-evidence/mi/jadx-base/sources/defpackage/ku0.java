package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class ku0 extends hnq {
    public final a i;
    public final int[] j;

    public ku0(ReadableMap readableMap, a aVar) {
        this.i = aVar;
        ReadableArray array = readableMap.getArray("input");
        this.j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    @Override // defpackage.dc1
    public void e() {
        this.f = 0.0d;
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                return;
            }
            dc1 dc1VarL = this.i.l(iArr[i]);
            if (dc1VarL == null || !(dc1VarL instanceof hnq)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
            }
            this.f += ((hnq) dc1VarL).i();
            i++;
        }
    }
}
