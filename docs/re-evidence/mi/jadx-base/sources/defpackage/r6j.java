package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class r6j extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public we f32245a;

    public r6j(we weVar) {
        this.f32245a = weVar;
    }

    public static r6j h(Object obj) {
        if (obj instanceof r6j) {
            return (r6j) obj;
        }
        if (obj != null) {
            return new r6j(we.r(obj));
        }
        return null;
    }

    public im1 g() {
        if (this.f32245a.size() == 0) {
            return null;
        }
        return im1.g(this.f32245a.u(0));
    }

    public im1[] i() {
        int size = this.f32245a.size();
        im1[] im1VarArr = new im1[size];
        for (int i = 0; i != size; i++) {
            im1VarArr[i] = im1.g(this.f32245a.u(i));
        }
        return im1VarArr;
    }

    public boolean j() {
        return this.f32245a.size() > 1;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f32245a;
    }
}
