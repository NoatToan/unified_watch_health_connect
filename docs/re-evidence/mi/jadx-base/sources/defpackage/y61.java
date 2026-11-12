package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class y61 extends pvg implements dn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39825a;

    public y61(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f39825a = x4f.a(readableMap, "what", "Reanimated: Argument passed to always node is either of wrong type or is missing.");
    }

    @Override // defpackage.dn9
    public void update() {
        value();
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        this.mNodesManager.o(this.f39825a, pvg.class).value();
        return pvg.ZERO;
    }
}
