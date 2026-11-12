package lc;

import android.os.Bundle;
import c2.o3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import l3.p1;
import lc.h0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Llc/v0;", "Llc/h0;", "D", "", "<init>", "()V", "", "name", "(Ljava/lang/String;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class v0<D extends h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.b f111890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f111891b;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    public v0(String str) {
        str.getClass();
    }

    public abstract D a();

    public final x0 b() {
        y.b bVar = this.f111890a;
        if (bVar != null) {
            return bVar;
        }
        vb.h.z("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public h0 c(h0 h0Var, Bundle bundle, o0 o0Var) {
        return h0Var;
    }

    public void d(List list, o0 o0Var) {
        c53.g.a aVar = new c53.g.a(c53.c0.i(c53.c0.o(new p13.g0(list), new p1(12, this, o0Var)), new o3(17)));
        while (aVar.hasNext()) {
            b().g((v) aVar.next());
        }
    }

    public void e(y.b bVar) {
        this.f111890a = bVar;
        this.f111891b = true;
    }

    public void f(v vVar) {
        h0 h0Var = vVar.f111882b;
        if (h0Var == null) {
            h0Var = null;
        }
        if (h0Var == null) {
            return;
        }
        c(h0Var, null, gg.b.L(new l72.b1(15)));
        b().c(vVar);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(v vVar, boolean z14) {
        List list = (List) b().f111900e.f150540a.getValue();
        if (!list.contains(vVar)) {
            u0.u("popBackStack was called with ", vVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        v vVar2 = null;
        while (j()) {
            vVar2 = (v) listIterator.previous();
            if (p005kotlin.jvm.internal.s.g(vVar2, vVar)) {
                break;
            }
        }
        if (vVar2 != null) {
            b().d(vVar2, z14);
        }
    }

    public boolean j() {
        return true;
    }

    public v0() {
    }
}
