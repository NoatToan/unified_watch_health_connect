package defpackage;

import com.facebook.react.bridge.ReadableMap;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public class yjh extends qnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stack<Integer> f40242b;
    public String c;

    public yjh(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f40242b = new Stack<>();
    }

    @Override // defpackage.qnq
    public void b(Object obj) {
        pvg pvgVarO = this.mNodesManager.o(this.f40242b.peek().intValue(), pvg.class);
        tbq tbqVar = this.mUpdateContext;
        String str = tbqVar.f34551b;
        tbqVar.f34551b = this.c;
        ((qnq) pvgVarO).b(obj);
        this.mUpdateContext.f34551b = str;
        forceUpdateMemoizedValue(obj);
    }

    public void c(Integer num, String str) {
        this.c = str;
        this.f40242b.push(num);
    }

    public void d() {
        this.f40242b.pop();
    }

    public boolean e() {
        pvg pvgVarO = this.mNodesManager.o(this.f40242b.peek().intValue(), pvg.class);
        return pvgVarO instanceof yjh ? ((yjh) pvgVarO).e() : ((i14) pvgVarO).f20658a;
    }

    @Override // defpackage.qnq, defpackage.pvg
    public Object evaluate() {
        tbq tbqVar = this.mUpdateContext;
        String str = tbqVar.f34551b;
        tbqVar.f34551b = this.c;
        Object objValue = this.mNodesManager.o(this.f40242b.peek().intValue(), pvg.class).value();
        this.mUpdateContext.f34551b = str;
        return objValue;
    }

    public void f() {
        pvg pvgVarO = this.mNodesManager.o(this.f40242b.peek().intValue(), pvg.class);
        if (pvgVarO instanceof yjh) {
            ((yjh) pvgVarO).f();
        } else {
            ((i14) pvgVarO).b();
        }
    }

    public void g() {
        pvg pvgVarO = this.mNodesManager.o(this.f40242b.peek().intValue(), pvg.class);
        if (pvgVarO instanceof yjh) {
            ((yjh) pvgVarO).g();
        } else {
            ((i14) pvgVarO).c();
        }
    }
}
