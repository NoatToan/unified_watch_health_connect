package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0258a;
import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes5.dex */
public class h1<MType extends a, BType extends a.AbstractC0258a, IType extends s0> implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.b f9650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BType f9651b;
    public MType c;
    public boolean d;

    public h1(MType mtype, a.b bVar, boolean z) {
        this.c = (MType) d0.a(mtype);
        this.f9650a = bVar;
        this.d = z;
    }

    private void h() {
        a.b bVar;
        if (this.f9651b != null) {
            this.c = null;
        }
        if (!this.d || (bVar = this.f9650a) == null) {
            return;
        }
        bVar.a();
        this.d = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        h();
    }

    public MType b() {
        this.d = true;
        return (MType) f();
    }

    public h1<MType, BType, IType> c() {
        MType mtype = this.c;
        this.c = (MType) (mtype != null ? mtype.getDefaultInstanceForType() : this.f9651b.getDefaultInstanceForType());
        BType btype = this.f9651b;
        if (btype != null) {
            btype.dispose();
            this.f9651b = null;
        }
        h();
        return this;
    }

    public void d() {
        this.f9650a = null;
    }

    public BType e() {
        if (this.f9651b == null) {
            BType btype = (BType) this.c.newBuilderForType(this);
            this.f9651b = btype;
            btype.mergeFrom(this.c);
            this.f9651b.markClean();
        }
        return this.f9651b;
    }

    public MType f() {
        if (this.c == null) {
            this.c = (MType) this.f9651b.buildPartial();
        }
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public h1<MType, BType, IType> g(MType mtype) {
        if (this.f9651b == null) {
            p0 p0Var = this.c;
            if (p0Var == p0Var.getDefaultInstanceForType()) {
                this.c = mtype;
            } else {
                e().mergeFrom((p0) mtype);
            }
        } else {
            e().mergeFrom((p0) mtype);
        }
        h();
        return this;
    }

    public h1<MType, BType, IType> i(MType mtype) {
        this.c = (MType) d0.a(mtype);
        BType btype = this.f9651b;
        if (btype != null) {
            btype.dispose();
            this.f9651b = null;
        }
        h();
        return this;
    }
}
