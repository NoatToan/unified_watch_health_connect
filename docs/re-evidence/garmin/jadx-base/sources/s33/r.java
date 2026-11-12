package s33;

import java.io.IOException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends z33.g implements z33.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f156842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f156843f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z33.l f156845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f156846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156847d;

    public static class a extends z33.b<r> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new r(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<r, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z33.l f156849c = z33.k.f202209b;

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
            r rVarG = g();
            if (rVarG.isInitialized()) {
                return rVarG;
            }
            throw new UninitializedMessageException(rVarG);
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
            h((r) gVar);
            return this;
        }

        public final r g() {
            r rVar = new r(this);
            if ((this.f156848b & 1) == 1) {
                this.f156849c = this.f156849c.getUnmodifiableView();
                this.f156848b &= -2;
            }
            rVar.f156845b = this.f156849c;
            return rVar;
        }

        public final void h(r rVar) {
            if (rVar == r.f156842e) {
                return;
            }
            if (!rVar.f156845b.isEmpty()) {
                if (this.f156849c.isEmpty()) {
                    this.f156849c = rVar.f156845b;
                    this.f156848b &= -2;
                } else {
                    if ((this.f156848b & 1) != 1) {
                        this.f156849c = new z33.k(this.f156849c);
                        this.f156848b |= 1;
                    }
                    this.f156849c.addAll(rVar.f156845b);
                }
            }
            this.f202188a = this.f202188a.b(rVar.f156844a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            r rVar = null;
            try {
                try {
                    h((r) r.f156843f.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    r rVar2 = (r) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar = rVar2;
                        if (rVar != null) {
                            h(rVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (rVar != null) {
                    h(rVar);
                }
                throw th;
            }
        }
    }

    static {
        r rVar = new r(true);
        f156842e = rVar;
        rVar.f156845b = z33.k.f202209b;
    }

    private r(z33.d dVar, z33.e eVar) {
        this.f156846c = (byte) -1;
        this.f156847d = -1;
        this.f156845b = z33.k.f202209b;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        boolean z15 = false;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 10) {
                            z33.m mVarF = dVar.f();
                            if (!z15) {
                                this.f156845b = new z33.k();
                                z15 = true;
                            }
                            this.f156845b.n2(mVarF);
                        } else if (!dVar.r(iO, codedOutputStreamJ)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (z15) {
                        this.f156845b = this.f156845b.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156844a = bVarI.e();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (z15) {
            this.f156845b = this.f156845b.getUnmodifiableView();
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156844a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i14 = 0; i14 < this.f156845b.size(); i14++) {
            z33.c byteString = this.f156845b.getByteString(i14);
            codedOutputStream.x(1, 2);
            codedOutputStream.v(byteString.size());
            codedOutputStream.r(byteString);
        }
        codedOutputStream.r(this.f156844a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156847d;
        if (i14 != -1) {
            return i14;
        }
        int i15 = 0;
        int size = 0;
        while (true) {
            int size2 = this.f156845b.size();
            z33.l lVar = this.f156845b;
            if (i15 >= size2) {
                int size3 = this.f156844a.size() + lVar.size() + size;
                this.f156847d = size3;
                return size3;
            }
            z33.c byteString = lVar.getByteString(i15);
            size += byteString.size() + CodedOutputStream.f(byteString.size());
            i15++;
        }
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156846c;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        this.f156846c = (byte) 1;
        return true;
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

    private r(z33.g.b bVar) {
        super(bVar);
        this.f156846c = (byte) -1;
        this.f156847d = -1;
        this.f156844a = bVar.f202188a;
    }

    private r(boolean z14) {
        this.f156846c = (byte) -1;
        this.f156847d = -1;
        this.f156844a = z33.c.f202161a;
    }
}
