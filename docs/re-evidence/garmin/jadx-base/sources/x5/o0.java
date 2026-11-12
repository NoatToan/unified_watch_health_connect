package x5;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx5/o0;", "Lx5/r;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f188917a;

    public o0(n0 n0Var) {
        this.f188917a = n0Var;
    }

    @Override // x5.r
    public final void a(int i14) {
        this.f188917a.f188893f.invoke(p.a(i14));
    }

    @Override // x5.r
    public final void b(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        g gVar = this.f188917a.f188899l;
        synchronized (gVar.f188839c) {
            try {
                gVar.f188842f = z16;
                gVar.f188843g = z17;
                gVar.f188844h = z18;
                gVar.f188845i = z19;
                if (z14) {
                    gVar.f188841e = true;
                    if (gVar.f188846j != null) {
                        gVar.a();
                    }
                }
                gVar.f188840d = z15;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // x5.r
    public final void c(KeyEvent keyEvent) {
        ((BaseInputConnection) this.f188917a.f188897j.getValue()).sendKeyEvent(keyEvent);
    }

    @Override // x5.r
    public final void d(ArrayList arrayList) {
        this.f188917a.f188892e.invoke(arrayList);
    }

    @Override // x5.r
    public final void e(h0 h0Var) {
        n0 n0Var = this.f188917a;
        ArrayList arrayList = n0Var.f188896i;
        ArrayList arrayList2 = n0Var.f188896i;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (p005kotlin.jvm.internal.s.g(((WeakReference) arrayList2.get(i14)).get(), h0Var)) {
                arrayList2.remove(i14);
                return;
            }
        }
    }
}
