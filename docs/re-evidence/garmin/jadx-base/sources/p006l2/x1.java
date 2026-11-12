package p006l2;

import e23.l;
import kotlin.m3;
import m4.g;
import m4.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vb.h;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll2/x1;", "Ll2/y1;", "Li5/m3;", "keyboardController", "<init>", "(Li5/m3;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f108873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f108874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f108875c;

    public x1(m3 m3Var) {
        this.f108873a = m3Var;
    }

    public final z1 a() {
        z1 z1Var = this.f108874b;
        if (z1Var != null) {
            return z1Var;
        }
        s.m("keyboardActions");
        throw null;
    }

    public final boolean b(int i14) {
        l<y1, Unit> lVar;
        m3 m3Var;
        p.f188918b.getClass();
        int i15 = p.f188926j;
        if (i14 == i15) {
            lVar = a().f108932a;
        } else if (i14 == p.f188921e) {
            lVar = a().f108933b;
        } else if (i14 == p.f188925i) {
            lVar = a().f108934c;
        } else if (i14 == p.f188924h) {
            lVar = a().f108935d;
        } else if (i14 == p.f188922f) {
            lVar = a().f108936e;
        } else if (i14 == p.f188923g) {
            lVar = a().f108937f;
        } else {
            if (i14 != p.f188920d && i14 != 0) {
                h.z("invalid ImeAction");
                return false;
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(this);
            return true;
        }
        if (i14 == p.f188925i) {
            q qVar = this.f108875c;
            if (qVar == null) {
                s.m("focusManager");
                throw null;
            }
            g.f116466b.getClass();
            qVar.l(g.f116467c);
            return true;
        }
        if (i14 != p.f188924h) {
            if (i14 != i15 || (m3Var = this.f108873a) == null) {
                return false;
            }
            m3Var.hide();
            return true;
        }
        q qVar2 = this.f108875c;
        if (qVar2 == null) {
            s.m("focusManager");
            throw null;
        }
        g.f116466b.getClass();
        qVar2.l(g.f116468d);
        return true;
    }
}
