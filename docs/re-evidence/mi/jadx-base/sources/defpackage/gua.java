package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class gua extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19333a;

    public gua(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f19333a = readableMap.getInt("what");
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        return this.mNodesManager.o(this.f19333a, pvg.class).value();
    }
}
