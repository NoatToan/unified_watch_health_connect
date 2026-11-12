package h73;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f82379a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f82380b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f82381c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f82382d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f82383e = null;

    public abstract void a(i03.k kVar);

    public final void b(r rVar) {
        rVar.f();
        rVar.d(this);
        r rVar2 = this.f82381c;
        if (rVar2 == null) {
            this.f82380b = rVar;
            this.f82381c = rVar;
        } else {
            rVar2.f82383e = rVar;
            rVar.f82382d = rVar2;
            this.f82381c = rVar;
        }
    }

    public r c() {
        return this.f82379a;
    }

    public void d(r rVar) {
        this.f82379a = rVar;
    }

    public String e() {
        return "";
    }

    public final void f() {
        r rVar = this.f82382d;
        if (rVar != null) {
            rVar.f82383e = this.f82383e;
        } else {
            r rVar2 = this.f82379a;
            if (rVar2 != null) {
                rVar2.f82380b = this.f82383e;
            }
        }
        r rVar3 = this.f82383e;
        if (rVar3 != null) {
            rVar3.f82382d = rVar;
        } else {
            r rVar4 = this.f82379a;
            if (rVar4 != null) {
                rVar4.f82381c = rVar;
            }
        }
        this.f82379a = null;
        this.f82383e = null;
        this.f82382d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + StringSubstitutor.DEFAULT_VAR_END;
    }
}
