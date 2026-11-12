package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class tv2 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f35072a;

    public tv2(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f35072a = hmq.a(readableMap.getArray("block"));
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        Object objValue = null;
        int i = 0;
        while (true) {
            int[] iArr = this.f35072a;
            if (i >= iArr.length) {
                return objValue;
            }
            objValue = this.mNodesManager.o(iArr[i], pvg.class).value();
            i++;
        }
    }
}
