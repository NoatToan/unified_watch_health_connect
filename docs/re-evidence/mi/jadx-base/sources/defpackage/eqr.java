package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class eqr extends de implements ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public re f16975a;

    public eqr(ae aeVar) {
        this.f16975a = aeVar;
    }

    public static eqr g(Object obj) {
        if (obj == null || (obj instanceof eqr)) {
            return (eqr) obj;
        }
        if (obj instanceof re) {
            return new eqr((re) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new eqr(re.j((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
        }
    }

    public re h() {
        return this.f16975a;
    }

    public boolean i() {
        return this.f16975a instanceof ae;
    }

    public boolean j() {
        return this.f16975a instanceof ee;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f16975a;
    }

    public eqr(ee eeVar) {
        this.f16975a = eeVar;
    }

    public eqr(re reVar) {
        this.f16975a = reVar;
    }

    public eqr(iqr iqrVar) {
        this.f16975a = null;
        this.f16975a = iqrVar.toASN1Primitive();
    }
}
