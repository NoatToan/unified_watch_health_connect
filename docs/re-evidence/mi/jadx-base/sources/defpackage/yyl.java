package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class yyl extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40695b;

    public yyl(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f40694a = x4f.a(readableMap, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
        this.f40695b = x4f.a(readableMap, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        Object objP = this.mNodesManager.p(this.f40695b);
        ((qnq) this.mNodesManager.o(this.f40694a, qnq.class)).b(objP);
        return objP;
    }
}
