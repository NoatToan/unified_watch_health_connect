package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class jb4 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22607b;
    public final int c;

    public jb4(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f22606a = x4f.a(readableMap, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
        this.f22607b = x4f.a(readableMap, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
        this.c = readableMap.hasKey("elseBlock") ? x4f.a(readableMap, "elseBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.") : -1;
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        Object objP = this.mNodesManager.p(this.f22606a);
        if (!(objP instanceof Number) || ((Number) objP).doubleValue() == 0.0d) {
            int i = this.c;
            return i != -1 ? this.mNodesManager.p(i) : pvg.ZERO;
        }
        int i2 = this.f22607b;
        return i2 != -1 ? this.mNodesManager.p(i2) : pvg.ZERO;
    }
}
