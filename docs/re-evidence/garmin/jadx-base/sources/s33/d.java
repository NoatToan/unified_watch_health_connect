package s33;

import java.io.IOException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends z33.g implements z33.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f156576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f156577h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z33.c f156581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f156582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156583f;

    public static class a extends z33.b<d> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new d(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<d, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f156585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z33.c f156586d = z33.c.f202161a;

        private b() {
        }

        public static b f() {
            return new b();
        }

        @Override // z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            i(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            d dVarG = g();
            if (dVarG.isInitialized()) {
                return dVarG;
            }
            throw new UninitializedMessageException(dVarG);
        }

        @Override // z33.a.AbstractC3766a
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ z33.a.AbstractC3766a b1(z33.d dVar, z33.e eVar) throws Throwable {
            i(dVar, eVar);
            return this;
        }

        @Override // z33.g.b, z33.a.AbstractC3766a
        /* JADX INFO: renamed from: clone */
        public final Object b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            h((d) gVar);
            return this;
        }

        public final d g() {
            d dVar = new d(this);
            int i14 = this.f156584b;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            dVar.f156580c = this.f156585c;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            dVar.f156581d = this.f156586d;
            dVar.f156579b = i15;
            return dVar;
        }

        public final void h(d dVar) {
            if (dVar == d.f156576g) {
                return;
            }
            int i14 = dVar.f156579b;
            if ((i14 & 1) == 1) {
                int i15 = dVar.f156580c;
                this.f156584b = 1 | this.f156584b;
                this.f156585c = i15;
            }
            if ((i14 & 2) == 2) {
                z33.c cVar = dVar.f156581d;
                cVar.getClass();
                this.f156584b = 2 | this.f156584b;
                this.f156586d = cVar;
            }
            this.f202188a = this.f202188a.b(dVar.f156578a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            d dVar2 = null;
            try {
                try {
                    h((d) d.f156577h.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    d dVar3 = (d) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        dVar2 = dVar3;
                        if (dVar2 != null) {
                            h(dVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (dVar2 != null) {
                    h(dVar2);
                }
                throw th;
            }
        }
    }

    static {
        d dVar = new d(true);
        f156576g = dVar;
        dVar.f156580c = 0;
        dVar.f156581d = z33.c.f202161a;
    }

    private d(z33.d dVar, z33.e eVar) {
        this.f156582e = (byte) -1;
        this.f156583f = -1;
        boolean z14 = false;
        this.f156580c = 0;
        this.f156581d = z33.c.f202161a;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        while (!z14) {
            try {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.f156579b |= 1;
                                this.f156580c = dVar.l();
                            } else if (iO == 18) {
                                this.f156579b |= 2;
                                this.f156581d = dVar.f();
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        }
                        z14 = true;
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    }
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th3) {
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156578a = bVarI.e();
                }
                throw th3;
            }
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156578a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f156579b & 1) == 1) {
            codedOutputStream.m(1, this.f156580c);
        }
        if ((this.f156579b & 2) == 2) {
            z33.c cVar = this.f156581d;
            codedOutputStream.x(2, 2);
            codedOutputStream.v(cVar.size());
            codedOutputStream.r(cVar);
        }
        codedOutputStream.r(this.f156578a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156583f;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156579b & 1) == 1 ? CodedOutputStream.b(1, this.f156580c) : 0;
        if ((this.f156579b & 2) == 2) {
            z33.c cVar = this.f156581d;
            iB += cVar.size() + CodedOutputStream.f(cVar.size()) + CodedOutputStream.h(2);
        }
        int size = this.f156578a.size() + iB;
        this.f156583f = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156582e;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        int i14 = this.f156579b;
        if ((i14 & 1) != 1) {
            this.f156582e = (byte) 0;
            return false;
        }
        if ((i14 & 2) == 2) {
            this.f156582e = (byte) 1;
            return true;
        }
        this.f156582e = (byte) 0;
        return false;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return b.f();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        b bVarF = b.f();
        bVarF.h(this);
        return bVarF;
    }

    private d(z33.g.b bVar) {
        super(bVar);
        this.f156582e = (byte) -1;
        this.f156583f = -1;
        this.f156578a = bVar.f202188a;
    }

    private d(boolean z14) {
        this.f156582e = (byte) -1;
        this.f156583f = -1;
        this.f156578a = z33.c.f202161a;
    }
}
