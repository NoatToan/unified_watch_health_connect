package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class i14 extends pvg implements svg.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20658a;

    public i14(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
    }

    @Override // svg.d
    public void a() {
        if (this.f20658a) {
            markUpdated();
            this.mNodesManager.v(this);
        }
    }

    public void b() {
        if (this.f20658a) {
            return;
        }
        this.f20658a = true;
        this.mNodesManager.v(this);
    }

    public void c() {
        this.f20658a = false;
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        return Double.valueOf(this.mNodesManager.o);
    }
}
