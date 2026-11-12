package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends z33.g.d<n> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f156752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f156753k = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f156756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f156757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f156758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c> f156759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f156760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156761i;

    public static class a extends z33.b<n> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new n(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<n, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r f156763e = r.f156842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p f156764f = p.f156811e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m f156765g = m.f156735k;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<c> f156766h = Collections.EMPTY_LIST;

        private b() {
        }

        public static b h() {
            return new b();
        }

        @Override // z33.g.c, z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            k(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            n nVarI = i();
            if (nVarI.isInitialized()) {
                return nVarI;
            }
            throw new UninitializedMessageException(nVarI);
        }

        @Override // z33.a.AbstractC3766a
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ z33.a.AbstractC3766a b1(z33.d dVar, z33.e eVar) throws Throwable {
            k(dVar, eVar);
            return this;
        }

        @Override // z33.g.c, z33.g.b, z33.a.AbstractC3766a
        /* JADX INFO: renamed from: clone */
        public final Object b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.g.c, z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            j((n) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final n i() {
            n nVar = new n(this);
            int i14 = this.f156762d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            nVar.f156756d = this.f156763e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            nVar.f156757e = this.f156764f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            nVar.f156758f = this.f156765g;
            if ((i14 & 8) == 8) {
                this.f156766h = Collections.unmodifiableList(this.f156766h);
                this.f156762d &= -9;
            }
            nVar.f156759g = this.f156766h;
            nVar.f156755c = i15;
            return nVar;
        }

        public final void j(n nVar) {
            m mVar;
            p pVar;
            r rVar;
            if (nVar == n.f156752j) {
                return;
            }
            if ((nVar.f156755c & 1) == 1) {
                r rVar2 = nVar.f156756d;
                if ((this.f156762d & 1) != 1 || (rVar = this.f156763e) == r.f156842e) {
                    this.f156763e = rVar2;
                } else {
                    r.b bVarF = r.b.f();
                    bVarF.h(rVar);
                    bVarF.h(rVar2);
                    this.f156763e = bVarF.g();
                }
                this.f156762d |= 1;
            }
            if ((nVar.f156755c & 2) == 2) {
                p pVar2 = nVar.f156757e;
                if ((this.f156762d & 2) != 2 || (pVar = this.f156764f) == p.f156811e) {
                    this.f156764f = pVar2;
                } else {
                    p.b bVarF2 = p.b.f();
                    bVarF2.h(pVar);
                    bVarF2.h(pVar2);
                    this.f156764f = bVarF2.g();
                }
                this.f156762d |= 2;
            }
            if ((nVar.f156755c & 4) == 4) {
                m mVar2 = nVar.f156758f;
                if ((this.f156762d & 4) != 4 || (mVar = this.f156765g) == m.f156735k) {
                    this.f156765g = mVar2;
                } else {
                    m.b bVarH = m.b.h();
                    bVarH.j(mVar);
                    bVarH.j(mVar2);
                    this.f156765g = bVarH.i();
                }
                this.f156762d |= 4;
            }
            if (!nVar.f156759g.isEmpty()) {
                if (this.f156766h.isEmpty()) {
                    this.f156766h = nVar.f156759g;
                    this.f156762d &= -9;
                } else {
                    if ((this.f156762d & 8) != 8) {
                        this.f156766h = new ArrayList(this.f156766h);
                        this.f156762d |= 8;
                    }
                    this.f156766h.addAll(nVar.f156759g);
                }
            }
            g(nVar);
            this.f202188a = this.f202188a.b(nVar.f156754b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            n nVar = null;
            try {
                try {
                    j((n) n.f156753k.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    n nVar2 = (n) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        nVar = nVar2;
                        if (nVar != null) {
                            j(nVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (nVar != null) {
                    j(nVar);
                }
                throw th;
            }
        }
    }

    static {
        n nVar = new n(true);
        f156752j = nVar;
        nVar.f156756d = r.f156842e;
        nVar.f156757e = p.f156811e;
        nVar.f156758f = m.f156735k;
        nVar.f156759g = Collections.EMPTY_LIST;
    }

    private n(z33.d dVar, z33.e eVar) {
        this.f156760h = (byte) -1;
        this.f156761i = -1;
        this.f156756d = r.f156842e;
        this.f156757e = p.f156811e;
        this.f156758f = m.f156735k;
        this.f156759g = Collections.EMPTY_LIST;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        char c14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        m.b bVarH = null;
                        r.b bVarF = null;
                        p.b bVarF2 = null;
                        if (iO == 10) {
                            if ((this.f156755c & 1) == 1) {
                                r rVar = this.f156756d;
                                rVar.getClass();
                                bVarF = r.b.f();
                                bVarF.h(rVar);
                            }
                            r rVar2 = (r) dVar.h(r.f156843f, eVar);
                            this.f156756d = rVar2;
                            if (bVarF != null) {
                                bVarF.h(rVar2);
                                this.f156756d = bVarF.g();
                            }
                            this.f156755c |= 1;
                        } else if (iO == 18) {
                            if ((this.f156755c & 2) == 2) {
                                p pVar = this.f156757e;
                                pVar.getClass();
                                bVarF2 = p.b.f();
                                bVarF2.h(pVar);
                            }
                            p pVar2 = (p) dVar.h(p.f156812f, eVar);
                            this.f156757e = pVar2;
                            if (bVarF2 != null) {
                                bVarF2.h(pVar2);
                                this.f156757e = bVarF2.g();
                            }
                            this.f156755c |= 2;
                        } else if (iO == 26) {
                            if ((this.f156755c & 4) == 4) {
                                m mVar = this.f156758f;
                                mVar.getClass();
                                bVarH = m.b.h();
                                bVarH.j(mVar);
                            }
                            m mVar2 = (m) dVar.h(m.f156736l, eVar);
                            this.f156758f = mVar2;
                            if (bVarH != null) {
                                bVarH.j(mVar2);
                                this.f156758f = bVarH.i();
                            }
                            this.f156755c |= 4;
                        } else if (iO == 34) {
                            int i14 = (c14 == true ? 1 : 0) & '\b';
                            c14 = c14;
                            if (i14 != 8) {
                                this.f156759g = new ArrayList();
                                c14 = '\b';
                            }
                            this.f156759g.add((c) dVar.h(c.X, eVar));
                        } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                        }
                    }
                    z14 = true;
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(this);
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th3) {
                if (((c14 == true ? 1 : 0) & '\b') == 8) {
                    this.f156759g = Collections.unmodifiableList(this.f156759g);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156754b = bVarI.e();
                }
                h();
                throw th3;
            }
        }
        if (((c14 == true ? 1 : 0) & '\b') == 8) {
            this.f156759g = Collections.unmodifiableList(this.f156759g);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156754b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156755c & 1) == 1) {
            codedOutputStream.o(1, this.f156756d);
        }
        if ((this.f156755c & 2) == 2) {
            codedOutputStream.o(2, this.f156757e);
        }
        if ((this.f156755c & 4) == 4) {
            codedOutputStream.o(3, this.f156758f);
        }
        for (int i14 = 0; i14 < this.f156759g.size(); i14++) {
            codedOutputStream.o(4, this.f156759g.get(i14));
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156754b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156752j;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156761i;
        if (i14 != -1) {
            return i14;
        }
        int iD = (this.f156755c & 1) == 1 ? CodedOutputStream.d(1, this.f156756d) : 0;
        if ((this.f156755c & 2) == 2) {
            iD += CodedOutputStream.d(2, this.f156757e);
        }
        if ((this.f156755c & 4) == 4) {
            iD += CodedOutputStream.d(3, this.f156758f);
        }
        for (int i15 = 0; i15 < this.f156759g.size(); i15++) {
            iD += CodedOutputStream.d(4, this.f156759g.get(i15));
        }
        int size = this.f156754b.size() + e() + iD;
        this.f156761i = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156760h;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        if ((this.f156755c & 2) == 2 && !this.f156757e.isInitialized()) {
            this.f156760h = (byte) 0;
            return false;
        }
        if ((this.f156755c & 4) == 4 && !this.f156758f.isInitialized()) {
            this.f156760h = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f156759g.size(); i14++) {
            if (!this.f156759g.get(i14).isInitialized()) {
                this.f156760h = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156760h = (byte) 1;
            return true;
        }
        this.f156760h = (byte) 0;
        return false;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return b.h();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        b bVarH = b.h();
        bVarH.j(this);
        return bVarH;
    }

    private n(z33.g.c<n, ?> cVar) {
        super(cVar);
        this.f156760h = (byte) -1;
        this.f156761i = -1;
        this.f156754b = cVar.f202188a;
    }

    private n(boolean z14) {
        this.f156760h = (byte) -1;
        this.f156761i = -1;
        this.f156754b = z33.c.f202161a;
    }
}
