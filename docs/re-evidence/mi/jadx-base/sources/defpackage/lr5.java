package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class lr5 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25368b;

    public lr5(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f25367a = x4f.b(readableMap, "message", "Reanimated: First argument passed to debug node is either of wrong type or is missing.");
        this.f25368b = x4f.a(readableMap, "value", "Reanimated: Second argument passed to debug node is either of wrong type or is missing.");
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        Object objValue = this.mNodesManager.o(this.f25368b, pvg.class).value();
        String.format("%s %s", this.f25367a, objValue);
        return objValue;
    }
}
