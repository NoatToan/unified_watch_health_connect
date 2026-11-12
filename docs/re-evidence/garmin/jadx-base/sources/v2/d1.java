package v2;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv2/d1;", "Lv2/t0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f174948a;

    public d1(e1 e1Var) {
        this.f174948a = e1Var;
    }

    @Override // v2.t0
    public final void a(int i14) {
        this.f174948a.f174963d.invoke(x5.p.a(i14));
    }

    @Override // v2.t0
    public final void b(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        a1 a1Var = this.f174948a.f174972m;
        synchronized (a1Var.f174861c) {
            try {
                a1Var.f174864f = z16;
                a1Var.f174865g = z17;
                a1Var.f174866h = z18;
                a1Var.f174867i = z19;
                if (z14) {
                    a1Var.f174863e = true;
                    if (a1Var.f174868j != null) {
                        a1Var.a();
                    }
                }
                a1Var.f174862d = z15;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // v2.t0
    public final void c(KeyEvent keyEvent) {
        ((BaseInputConnection) this.f174948a.f174970k.getValue()).sendKeyEvent(keyEvent);
    }

    @Override // v2.t0
    public final void d(ArrayList arrayList) {
        this.f174948a.f174962c.invoke(arrayList);
    }

    @Override // v2.t0
    public final void e(i1 i1Var) {
        e1 e1Var = this.f174948a;
        ArrayList arrayList = e1Var.f174969j;
        ArrayList arrayList2 = e1Var.f174969j;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (p005kotlin.jvm.internal.s.g(((WeakReference) arrayList2.get(i14)).get(), i1Var)) {
                arrayList2.remove(i14);
                return;
            }
        }
    }
}
