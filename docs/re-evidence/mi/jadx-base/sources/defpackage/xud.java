package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes4.dex */
public class xud extends fud {
    public final xud c;
    public q67 d;
    public xud e;
    public String f;
    public Object g;
    public boolean h;

    public xud(int i, xud xudVar, q67 q67Var) {
        this.f18247a = i;
        this.c = xudVar;
        this.d = q67Var;
        this.f18248b = -1;
    }

    private final void k(q67 q67Var, String str) throws JsonProcessingException {
        if (q67Var.c(str)) {
            Object objB = q67Var.b();
            throw new JsonGenerationException("Duplicate field '" + str + "'", objB instanceof JsonGenerator ? (JsonGenerator) objB : null);
        }
    }

    public static xud o(q67 q67Var) {
        return new xud(0, null, q67Var);
    }

    @Override // defpackage.fud
    public final String b() {
        return this.f;
    }

    @Override // defpackage.fud
    public Object c() {
        return this.g;
    }

    @Override // defpackage.fud
    public void i(Object obj) {
        this.g = obj;
    }

    public xud l() {
        this.g = null;
        return this.c;
    }

    public xud m() {
        xud xudVar = this.e;
        if (xudVar != null) {
            return xudVar.r(1);
        }
        q67 q67Var = this.d;
        xud xudVar2 = new xud(1, this, q67Var == null ? null : q67Var.a());
        this.e = xudVar2;
        return xudVar2;
    }

    public xud n() {
        xud xudVar = this.e;
        if (xudVar != null) {
            return xudVar.r(2);
        }
        q67 q67Var = this.d;
        xud xudVar2 = new xud(2, this, q67Var == null ? null : q67Var.a());
        this.e = xudVar2;
        return xudVar2;
    }

    public q67 p() {
        return this.d;
    }

    @Override // defpackage.fud
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final xud e() {
        return this.c;
    }

    public xud r(int i) {
        this.f18247a = i;
        this.f18248b = -1;
        this.f = null;
        this.h = false;
        this.g = null;
        q67 q67Var = this.d;
        if (q67Var != null) {
            q67Var.d();
        }
        return this;
    }

    public xud s(q67 q67Var) {
        this.d = q67Var;
        return this;
    }

    public int t(String str) throws JsonProcessingException {
        if (this.f18247a != 2 || this.h) {
            return 4;
        }
        this.h = true;
        this.f = str;
        q67 q67Var = this.d;
        if (q67Var != null) {
            k(q67Var, str);
        }
        return this.f18248b < 0 ? 0 : 1;
    }

    public int u() {
        int i = this.f18247a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.f18248b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.f18248b;
            this.f18248b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = this.f18248b + 1;
        this.f18248b = i3;
        return i3 == 0 ? 0 : 3;
    }
}
