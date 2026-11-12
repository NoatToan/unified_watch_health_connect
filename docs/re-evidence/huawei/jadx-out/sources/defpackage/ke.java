package defpackage;

import com.alipay.sdk.m.a0.e;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public class ke {
    public Stack<e> e = new Stack<>();

    public e b() {
        return this.e.pop();
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public void e(e eVar) {
        this.e.push(eVar);
    }

    public void c() {
        if (d()) {
            return;
        }
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.e.clear();
    }
}
