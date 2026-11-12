package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.f;
import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes5.dex */
public class g1<MType extends GeneratedMessage, BType extends GeneratedMessage.f, IType extends s0> implements GeneratedMessage.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GeneratedMessage.g f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BType f9644b;
    public MType c;
    public boolean d;

    public g1(MType mtype, GeneratedMessage.g gVar, boolean z) {
        this.c = (MType) d0.a(mtype);
        this.f9643a = gVar;
        this.d = z;
    }

    private void i() {
        GeneratedMessage.g gVar;
        if (this.f9644b != null) {
            this.c = null;
        }
        if (!this.d || (gVar = this.f9643a) == null) {
            return;
        }
        gVar.a();
        this.d = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        i();
    }

    public MType b() {
        this.d = true;
        return (MType) f();
    }

    public g1<MType, BType, IType> c() {
        MType mtype = this.c;
        this.c = (MType) (mtype != null ? mtype.getDefaultInstanceForType() : this.f9644b.getDefaultInstanceForType());
        BType btype = this.f9644b;
        if (btype != null) {
            btype.dispose();
            this.f9644b = null;
        }
        i();
        return this;
    }

    public void d() {
        this.f9643a = null;
    }

    public BType e() {
        if (this.f9644b == null) {
            BType btype = (BType) this.c.newBuilderForType(this);
            this.f9644b = btype;
            btype.mergeFrom(this.c);
            this.f9644b.markClean();
        }
        return this.f9644b;
    }

    public MType f() {
        if (this.c == null) {
            this.c = (MType) this.f9644b.buildPartial();
        }
        return this.c;
    }

    public IType g() {
        BType btype = this.f9644b;
        return btype != null ? btype : this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public g1<MType, BType, IType> h(MType mtype) {
        if (this.f9644b == null) {
            MType mtype2 = this.c;
            if (mtype2 == mtype2.getDefaultInstanceForType()) {
                this.c = mtype;
            } else {
                e().mergeFrom((p0) mtype);
            }
        } else {
            e().mergeFrom((p0) mtype);
        }
        i();
        return this;
    }

    public g1<MType, BType, IType> j(MType mtype) {
        this.c = (MType) d0.a(mtype);
        BType btype = this.f9644b;
        if (btype != null) {
            btype.dispose();
            this.f9644b = null;
        }
        i();
        return this;
    }
}
