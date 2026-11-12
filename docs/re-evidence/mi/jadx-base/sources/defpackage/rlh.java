package defpackage;

import com.typesafe.config.ConfigException;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public final class rlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack<String> f32678a = new Stack<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qlh f32679b;

    public void a(String str) {
        c();
        this.f32678a.push(str);
    }

    public void b(qlh qlhVar) {
        c();
        String strB = qlhVar.b();
        qlh qlhVarJ = qlhVar.j();
        while (true) {
            this.f32678a.push(strB);
            if (qlhVarJ == null) {
                return;
            }
            strB = qlhVarJ.b();
            qlhVarJ = qlhVarJ.j();
        }
    }

    public final void c() {
        if (this.f32679b != null) {
            throw new ConfigException.BugOrBroken("Adding to PathBuilder after getting result");
        }
    }

    public qlh d() {
        if (this.f32679b == null) {
            qlh qlhVar = null;
            while (!this.f32678a.isEmpty()) {
                qlhVar = new qlh(this.f32678a.pop(), qlhVar);
            }
            this.f32679b = qlhVar;
        }
        return this.f32679b;
    }
}
