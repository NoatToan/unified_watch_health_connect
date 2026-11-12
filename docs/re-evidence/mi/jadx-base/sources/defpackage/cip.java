package defpackage;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes4.dex */
public class cip extends fud {
    public final fud c;
    public final JsonLocation d;
    public String e;
    public Object f;

    public cip() {
        super(0, -1);
        this.c = null;
        this.d = JsonLocation.NA;
    }

    public static cip m(fud fudVar) {
        return fudVar == null ? new cip() : new cip(fudVar, null);
    }

    @Override // defpackage.fud
    public String b() {
        return this.e;
    }

    @Override // defpackage.fud
    public Object c() {
        return this.f;
    }

    @Override // defpackage.fud
    public fud e() {
        return this.c;
    }

    @Override // defpackage.fud
    public void i(Object obj) {
        this.f = obj;
    }

    public cip k() {
        return new cip(this, 1, -1);
    }

    public cip l() {
        return new cip(this, 2, -1);
    }

    public cip n() {
        fud fudVar = this.c;
        if (fudVar instanceof cip) {
            return (cip) fudVar;
        }
        return fudVar == null ? new cip() : new cip(fudVar, this.d);
    }

    public void o(String str) throws JsonProcessingException {
        this.e = str;
    }

    public cip(fud fudVar, JsonLocation jsonLocation) {
        super(fudVar);
        this.c = fudVar.e();
        this.e = fudVar.b();
        this.f = fudVar.c();
        this.d = jsonLocation;
    }

    public cip(cip cipVar, int i, int i2) {
        super(i, i2);
        this.c = cipVar;
        this.d = cipVar.d;
    }
}
