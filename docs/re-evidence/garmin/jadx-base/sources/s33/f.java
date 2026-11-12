package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends z33.g implements z33.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f156604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f156605f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<g> f156607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f156608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156609d;

    public static class a extends z33.b<f> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new f(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<f, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<g> f156611c = Collections.EMPTY_LIST;

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
            f fVarG = g();
            if (fVarG.isInitialized()) {
                return fVarG;
            }
            throw new UninitializedMessageException(fVarG);
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
            h((f) gVar);
            return this;
        }

        public final f g() {
            f fVar = new f(this);
            if ((this.f156610b & 1) == 1) {
                this.f156611c = Collections.unmodifiableList(this.f156611c);
                this.f156610b &= -2;
            }
            fVar.f156607b = this.f156611c;
            return fVar;
        }

        public final void h(f fVar) {
            if (fVar == f.f156604e) {
                return;
            }
            if (!fVar.f156607b.isEmpty()) {
                if (this.f156611c.isEmpty()) {
                    this.f156611c = fVar.f156607b;
                    this.f156610b &= -2;
                } else {
                    if ((this.f156610b & 1) != 1) {
                        this.f156611c = new ArrayList(this.f156611c);
                        this.f156610b |= 1;
                    }
                    this.f156611c.addAll(fVar.f156607b);
                }
            }
            this.f202188a = this.f202188a.b(fVar.f156606a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            f fVar = null;
            try {
                try {
                    h((f) f.f156605f.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    f fVar2 = (f) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        fVar = fVar2;
                        if (fVar != null) {
                            h(fVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (fVar != null) {
                    h(fVar);
                }
                throw th;
            }
        }
    }

    static {
        f fVar = new f(true);
        f156604e = fVar;
        fVar.f156607b = Collections.EMPTY_LIST;
    }

    private f(z33.d dVar, z33.e eVar) {
        this.f156608c = (byte) -1;
        this.f156609d = -1;
        this.f156607b = Collections.EMPTY_LIST;
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
                            if (!z15) {
                                this.f156607b = new ArrayList();
                                z15 = true;
                            }
                            this.f156607b.add((g) dVar.h(g.f156613k, eVar));
                        } else if (!dVar.r(iO, codedOutputStreamJ)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (z15) {
                        this.f156607b = Collections.unmodifiableList(this.f156607b);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156606a = bVarI.e();
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
            this.f156607b = Collections.unmodifiableList(this.f156607b);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156606a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i14 = 0; i14 < this.f156607b.size(); i14++) {
            codedOutputStream.o(1, this.f156607b.get(i14));
        }
        codedOutputStream.r(this.f156606a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156609d;
        if (i14 != -1) {
            return i14;
        }
        int iD = 0;
        for (int i15 = 0; i15 < this.f156607b.size(); i15++) {
            iD += CodedOutputStream.d(1, this.f156607b.get(i15));
        }
        int size = this.f156606a.size() + iD;
        this.f156609d = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156608c;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156607b.size(); i14++) {
            if (!this.f156607b.get(i14).isInitialized()) {
                this.f156608c = (byte) 0;
                return false;
            }
        }
        this.f156608c = (byte) 1;
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

    private f(z33.g.b bVar) {
        super(bVar);
        this.f156608c = (byte) -1;
        this.f156609d = -1;
        this.f156606a = bVar.f202188a;
    }

    private f(boolean z14) {
        this.f156608c = (byte) -1;
        this.f156609d = -1;
        this.f156606a = z33.c.f202161a;
    }
}
