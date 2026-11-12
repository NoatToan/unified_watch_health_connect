package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class r38 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f32135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f32136b;

    public r38(te teVar) {
        Enumeration enumerationU = teVar.u();
        this.f32135a = (wd) enumerationU.nextElement();
        this.f32136b = (wd) enumerationU.nextElement();
    }

    public static r38 h(Object obj) {
        if (obj instanceof r38) {
            return (r38) obj;
        }
        if (obj != null) {
            return new r38(te.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.f32136b.q();
    }

    public BigInteger i() {
        return this.f32135a.q();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f32135a);
        jdVar.a(this.f32136b);
        return new yg5(jdVar);
    }

    public r38(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f32135a = new wd(bigInteger);
        this.f32136b = new wd(bigInteger2);
    }
}
