package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class qtd extends dip {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ptd f31827b;

    public qtd(String str) {
        this(ptd.e(str));
    }

    @Override // defpackage.dip
    public boolean a() {
        return this.f31827b.h();
    }

    @Override // defpackage.dip
    public dip c() {
        return this;
    }

    @Override // defpackage.dip
    public dip d() {
        return this;
    }

    @Override // defpackage.dip
    public dip e(int i) {
        ptd ptdVarF = this.f31827b.f(i);
        if (ptdVarF == null) {
            return null;
        }
        return ptdVarF.h() ? dip.f15573a : new qtd(ptdVarF);
    }

    @Override // defpackage.dip
    public dip f(String str) {
        ptd ptdVarG = this.f31827b.g(str);
        if (ptdVarG == null) {
            return null;
        }
        return ptdVarG.h() ? dip.f15573a : new qtd(ptdVarG);
    }

    @Override // defpackage.dip
    public String toString() {
        return "[JsonPointerFilter at: " + this.f31827b + "]";
    }

    public qtd(ptd ptdVar) {
        this.f31827b = ptdVar;
    }
}
