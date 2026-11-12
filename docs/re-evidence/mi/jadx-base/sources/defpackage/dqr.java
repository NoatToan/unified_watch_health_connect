package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class dqr extends be implements dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pe f15823a;

    public dqr(hqr hqrVar) {
        this.f15823a = null;
        this.f15823a = hqrVar.toASN1Primitive();
    }

    public static dqr g(Object obj) {
        if (obj == null || (obj instanceof dqr)) {
            return (dqr) obj;
        }
        if (obj instanceof pe) {
            return new dqr((pe) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new dqr(pe.j((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
        }
    }

    public pe h() {
        return this.f15823a;
    }

    public boolean i() {
        return this.f15823a instanceof zd;
    }

    public boolean j() {
        return this.f15823a instanceof fe;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f15823a;
    }

    public dqr(fe feVar) {
        this.f15823a = feVar;
    }

    public dqr(zd zdVar) {
        this.f15823a = zdVar;
    }

    public dqr(pe peVar) {
        this.f15823a = peVar;
    }
}
