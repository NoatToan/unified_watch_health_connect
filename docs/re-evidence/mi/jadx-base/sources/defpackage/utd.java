package defpackage;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes4.dex */
public final class utd extends fud {
    public final utd c;
    public q67 d;
    public utd e;
    public String f;
    public Object g;
    public int h;
    public int i;

    public utd(utd utdVar, q67 q67Var, int i, int i2, int i3) {
        this.c = utdVar;
        this.d = q67Var;
        this.f18247a = i;
        this.h = i2;
        this.i = i3;
        this.f18248b = -1;
    }

    public static utd o(q67 q67Var) {
        return new utd(null, q67Var, 0, 1, 0);
    }

    @Override // defpackage.fud
    public String b() {
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

    public final void k(q67 q67Var, String str) throws JsonProcessingException {
        if (q67Var.c(str)) {
            Object objB = q67Var.b();
            throw new JsonParseException(objB instanceof JsonParser ? (JsonParser) objB : null, "Duplicate field '" + str + "'");
        }
    }

    public utd l() {
        this.g = null;
        return this.c;
    }

    public utd m(int i, int i2) {
        utd utdVar = this.e;
        if (utdVar == null) {
            q67 q67Var = this.d;
            utdVar = new utd(this, q67Var == null ? null : q67Var.a(), 1, i, i2);
            this.e = utdVar;
        } else {
            utdVar.t(1, i, i2);
        }
        return utdVar;
    }

    public utd n(int i, int i2) {
        utd utdVar = this.e;
        if (utdVar != null) {
            utdVar.t(2, i, i2);
            return utdVar;
        }
        q67 q67Var = this.d;
        utd utdVar2 = new utd(this, q67Var == null ? null : q67Var.a(), 2, i, i2);
        this.e = utdVar2;
        return utdVar2;
    }

    public boolean p() {
        int i = this.f18248b + 1;
        this.f18248b = i;
        return this.f18247a != 0 && i > 0;
    }

    public q67 q() {
        return this.d;
    }

    @Override // defpackage.fud
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public utd e() {
        return this.c;
    }

    public JsonLocation s(Object obj) {
        return new JsonLocation(obj, -1L, this.h, this.i);
    }

    public void t(int i, int i2, int i3) {
        this.f18247a = i;
        this.f18248b = -1;
        this.h = i2;
        this.i = i3;
        this.f = null;
        this.g = null;
        q67 q67Var = this.d;
        if (q67Var != null) {
            q67Var.d();
        }
    }

    public void u(String str) throws JsonProcessingException {
        this.f = str;
        q67 q67Var = this.d;
        if (q67Var != null) {
            k(q67Var, str);
        }
    }

    public utd v(q67 q67Var) {
        this.d = q67Var;
        return this;
    }
}
