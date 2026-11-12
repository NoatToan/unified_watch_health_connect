package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class oa3 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28911b;
    public final int[] c;
    public final int[] d;

    public oa3(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f28911b = readableMap.getInt("what");
        this.d = hmq.a(readableMap.getArray("params"));
        this.c = hmq.a(readableMap.getArray("args"));
    }

    private void c() {
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                this.mNodesManager.p.f34551b = this.f28910a;
                return;
            } else {
                ((yjh) this.mNodesManager.o(iArr[i], yjh.class)).d();
                i++;
            }
        }
    }

    public final void b() {
        tbq tbqVar = this.mNodesManager.p;
        this.f28910a = tbqVar.f34551b;
        tbqVar.f34551b = this.mNodesManager.p.f34551b + '/' + String.valueOf(this.mNodeID);
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                return;
            }
            ((yjh) this.mNodesManager.o(iArr[i], yjh.class)).c(Integer.valueOf(this.c[i]), this.f28910a);
            i++;
        }
    }

    @Override // defpackage.pvg
    public Object evaluate() {
        b();
        Object objValue = this.mNodesManager.o(this.f28911b, pvg.class).value();
        c();
        return objValue;
    }
}
