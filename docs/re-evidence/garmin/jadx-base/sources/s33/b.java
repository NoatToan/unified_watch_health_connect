package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends z33.g implements z33.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f156457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f156458h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<C2953b> f156462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f156463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156464f;

    public static class a extends z33.b<b> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new b(dVar, eVar);
        }
    }

    public static final class c extends z33.g.b<b, c> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f156521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<C2953b> f156522d = Collections.EMPTY_LIST;

        private c() {
        }

        public static c f() {
            return new c();
        }

        @Override // z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            c cVar = new c();
            cVar.h(g());
            return cVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            i(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            b bVarG = g();
            if (bVarG.isInitialized()) {
                return bVarG;
            }
            throw new UninitializedMessageException(bVarG);
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
            c cVar = new c();
            cVar.h(g());
            return cVar;
        }

        @Override // z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            c cVar = new c();
            cVar.h(g());
            return cVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            h((b) gVar);
            return this;
        }

        public final b g() {
            b bVar = new b(this);
            int i14 = this.f156520b;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            bVar.f156461c = this.f156521c;
            if ((i14 & 2) == 2) {
                this.f156522d = Collections.unmodifiableList(this.f156522d);
                this.f156520b &= -3;
            }
            bVar.f156462d = this.f156522d;
            bVar.f156460b = i15;
            return bVar;
        }

        public final void h(b bVar) {
            if (bVar == b.f156457g) {
                return;
            }
            if ((bVar.f156460b & 1) == 1) {
                int i14 = bVar.f156461c;
                this.f156520b = 1 | this.f156520b;
                this.f156521c = i14;
            }
            if (!bVar.f156462d.isEmpty()) {
                if (this.f156522d.isEmpty()) {
                    this.f156522d = bVar.f156462d;
                    this.f156520b &= -3;
                } else {
                    if ((this.f156520b & 2) != 2) {
                        this.f156522d = new ArrayList(this.f156522d);
                        this.f156520b |= 2;
                    }
                    this.f156522d.addAll(bVar.f156462d);
                }
            }
            this.f202188a = this.f202188a.b(bVar.f156459a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            b bVar = null;
            try {
                try {
                    h((b) b.f156458h.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    b bVar2 = (b) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = bVar2;
                        if (bVar != null) {
                            h(bVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (bVar != null) {
                    h(bVar);
                }
                throw th;
            }
        }
    }

    static {
        b bVar = new b(true);
        f156457g = bVar;
        bVar.f156461c = 0;
        bVar.f156462d = Collections.EMPTY_LIST;
    }

    private b(z33.d dVar, z33.e eVar) {
        this.f156463e = (byte) -1;
        this.f156464f = -1;
        boolean z14 = false;
        this.f156461c = 0;
        this.f156462d = Collections.EMPTY_LIST;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        char c14 = 0;
        while (!z14) {
            try {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.f156460b |= 1;
                                this.f156461c = dVar.l();
                            } else if (iO == 18) {
                                if ((c14 & 2) != 2) {
                                    this.f156462d = new ArrayList();
                                    c14 = 2;
                                }
                                this.f156462d.add((C2953b) dVar.h(C2953b.f156466h, eVar));
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
                if ((c14 & 2) == 2) {
                    this.f156462d = Collections.unmodifiableList(this.f156462d);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156459a = bVarI.e();
                }
                throw th3;
            }
        }
        if ((c14 & 2) == 2) {
            this.f156462d = Collections.unmodifiableList(this.f156462d);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156459a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f156460b & 1) == 1) {
            codedOutputStream.m(1, this.f156461c);
        }
        for (int i14 = 0; i14 < this.f156462d.size(); i14++) {
            codedOutputStream.o(2, this.f156462d.get(i14));
        }
        codedOutputStream.r(this.f156459a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156464f;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156460b & 1) == 1 ? CodedOutputStream.b(1, this.f156461c) : 0;
        for (int i15 = 0; i15 < this.f156462d.size(); i15++) {
            iB += CodedOutputStream.d(2, this.f156462d.get(i15));
        }
        int size = this.f156459a.size() + iB;
        this.f156464f = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156463e;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        if ((this.f156460b & 1) != 1) {
            this.f156463e = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f156462d.size(); i14++) {
            if (!this.f156462d.get(i14).isInitialized()) {
                this.f156463e = (byte) 0;
                return false;
            }
        }
        this.f156463e = (byte) 1;
        return true;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return c.f();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        c cVarF = c.f();
        cVarF.h(this);
        return cVarF;
    }

    /* JADX INFO: renamed from: s33.b$b, reason: collision with other inner class name */
    public static final class C2953b extends z33.g implements z33.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C2953b f156465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f156466h = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f156467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f156469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f156470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f156471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156472f;

        /* JADX INFO: renamed from: s33.b$b$a */
        public static class a extends z33.b<C2953b> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new C2953b(dVar, eVar);
            }
        }

        /* JADX INFO: renamed from: s33.b$b$b, reason: collision with other inner class name */
        public static final class C2954b extends z33.g.b<C2953b, C2954b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f156473b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f156474c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public c f156475d = c.f156476p;

            private C2954b() {
            }

            public static C2954b f() {
                return new C2954b();
            }

            @Override // z33.g.b, z33.a.AbstractC3766a
            public final z33.a.AbstractC3766a b() {
                C2954b c2954b = new C2954b();
                c2954b.h(g());
                return c2954b;
            }

            @Override // z33.a.AbstractC3766a, z33.n.a
            public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                i(dVar, eVar);
                return this;
            }

            @Override // z33.n.a
            public final z33.n build() {
                C2953b c2953bG = g();
                if (c2953bG.isInitialized()) {
                    return c2953bG;
                }
                throw new UninitializedMessageException(c2953bG);
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
                C2954b c2954b = new C2954b();
                c2954b.h(g());
                return c2954b;
            }

            @Override // z33.g.b
            /* JADX INFO: renamed from: d */
            public final z33.g.b b() {
                C2954b c2954b = new C2954b();
                c2954b.h(g());
                return c2954b;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
                h((C2953b) gVar);
                return this;
            }

            public final C2953b g() {
                C2953b c2953b = new C2953b(this);
                int i14 = this.f156473b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                c2953b.f156469c = this.f156474c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                c2953b.f156470d = this.f156475d;
                c2953b.f156468b = i15;
                return c2953b;
            }

            public final void h(C2953b c2953b) {
                c cVar;
                if (c2953b == C2953b.f156465g) {
                    return;
                }
                int i14 = c2953b.f156468b;
                if ((i14 & 1) == 1) {
                    int i15 = c2953b.f156469c;
                    this.f156473b = 1 | this.f156473b;
                    this.f156474c = i15;
                }
                if ((i14 & 2) == 2) {
                    c cVar2 = c2953b.f156470d;
                    if ((this.f156473b & 2) != 2 || (cVar = this.f156475d) == c.f156476p) {
                        this.f156475d = cVar2;
                    } else {
                        c.C2955b c2955bE = c.e(cVar);
                        c2955bE.h(cVar2);
                        this.f156475d = c2955bE.g();
                    }
                    this.f156473b |= 2;
                }
                this.f202188a = this.f202188a.b(c2953b.f156467a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                C2953b c2953b = null;
                try {
                    try {
                        h((C2953b) C2953b.f156466h.a(dVar, eVar));
                    } catch (InvalidProtocolBufferException e4) {
                        C2953b c2953b2 = (C2953b) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            c2953b = c2953b2;
                            if (c2953b != null) {
                                h(c2953b);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c2953b != null) {
                        h(c2953b);
                    }
                    throw th;
                }
            }
        }

        static {
            C2953b c2953b = new C2953b(true);
            f156465g = c2953b;
            c2953b.f156469c = 0;
            c2953b.f156470d = c.f156476p;
        }

        private C2953b(z33.d dVar, z33.e eVar) {
            c.C2955b c2955bE;
            this.f156471e = (byte) -1;
            this.f156472f = -1;
            boolean z14 = false;
            this.f156469c = 0;
            this.f156470d = c.f156476p;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            while (!z14) {
                try {
                    try {
                        try {
                            int iO = dVar.o();
                            if (iO != 0) {
                                if (iO == 8) {
                                    this.f156468b |= 1;
                                    this.f156469c = dVar.l();
                                } else if (iO == 18) {
                                    if ((this.f156468b & 2) == 2) {
                                        c cVar = this.f156470d;
                                        cVar.getClass();
                                        c2955bE = c.e(cVar);
                                    } else {
                                        c2955bE = null;
                                    }
                                    c cVar2 = (c) dVar.h(c.f156477q, eVar);
                                    this.f156470d = cVar2;
                                    if (c2955bE != null) {
                                        c2955bE.h(cVar2);
                                        this.f156470d = c2955bE.g();
                                    }
                                    this.f156468b |= 2;
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
                        this.f156467a = bVarI.e();
                    }
                    throw th3;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f156467a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f156468b & 1) == 1) {
                codedOutputStream.m(1, this.f156469c);
            }
            if ((this.f156468b & 2) == 2) {
                codedOutputStream.o(2, this.f156470d);
            }
            codedOutputStream.r(this.f156467a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f156472f;
            if (i14 != -1) {
                return i14;
            }
            int iB = (this.f156468b & 1) == 1 ? CodedOutputStream.b(1, this.f156469c) : 0;
            if ((this.f156468b & 2) == 2) {
                iB += CodedOutputStream.d(2, this.f156470d);
            }
            int size = this.f156467a.size() + iB;
            this.f156472f = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f156471e;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            int i14 = this.f156468b;
            if ((i14 & 1) != 1) {
                this.f156471e = (byte) 0;
                return false;
            }
            if ((i14 & 2) != 2) {
                this.f156471e = (byte) 0;
                return false;
            }
            if (this.f156470d.isInitialized()) {
                this.f156471e = (byte) 1;
                return true;
            }
            this.f156471e = (byte) 0;
            return false;
        }

        @Override // z33.n
        public final z33.n.a newBuilderForType() {
            return C2954b.f();
        }

        @Override // z33.n
        public final z33.n.a toBuilder() {
            C2954b c2954bF = C2954b.f();
            c2954bF.h(this);
            return c2954bF;
        }

        private C2953b(z33.g.b bVar) {
            super(bVar);
            this.f156471e = (byte) -1;
            this.f156472f = -1;
            this.f156467a = bVar.f202188a;
        }

        private C2953b(boolean z14) {
            this.f156471e = (byte) -1;
            this.f156472f = -1;
            this.f156467a = z33.c.f202161a;
        }

        /* JADX INFO: renamed from: s33.b$b$c */
        public static final class c extends z33.g implements z33.o {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final c f156476p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final a f156477q = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z33.c f156478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f156479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public EnumC2956c f156480c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f156481d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f156482e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public double f156483f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f156484g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f156485h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f156486i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public b f156487j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<c> f156488k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f156489l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f156490m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public byte f156491n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f156492o;

            /* JADX INFO: renamed from: s33.b$b$c$a */
            public static class a extends z33.b<c> {
                @Override // z33.p
                public final Object a(z33.d dVar, z33.e eVar) {
                    return new c(dVar, eVar);
                }
            }

            /* JADX INFO: renamed from: s33.b$b$c$b, reason: collision with other inner class name */
            public static final class C2955b extends z33.g.b<c, C2955b> implements z33.o {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f156493b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public long f156495d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public float f156496e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public double f156497f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public int f156498g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public int f156499h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public int f156500i;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public int f156503l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public int f156504m;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public EnumC2956c f156494c = EnumC2956c.BYTE;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public b f156501j = b.f156457g;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public List<c> f156502k = Collections.EMPTY_LIST;

                private C2955b() {
                }

                public static C2955b f() {
                    return new C2955b();
                }

                @Override // z33.g.b, z33.a.AbstractC3766a
                public final z33.a.AbstractC3766a b() {
                    C2955b c2955b = new C2955b();
                    c2955b.h(g());
                    return c2955b;
                }

                @Override // z33.a.AbstractC3766a, z33.n.a
                public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                    i(dVar, eVar);
                    return this;
                }

                @Override // z33.n.a
                public final z33.n build() {
                    c cVarG = g();
                    if (cVarG.isInitialized()) {
                        return cVarG;
                    }
                    throw new UninitializedMessageException(cVarG);
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
                    C2955b c2955b = new C2955b();
                    c2955b.h(g());
                    return c2955b;
                }

                @Override // z33.g.b
                /* JADX INFO: renamed from: d */
                public final z33.g.b b() {
                    C2955b c2955b = new C2955b();
                    c2955b.h(g());
                    return c2955b;
                }

                @Override // z33.g.b
                public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
                    h((c) gVar);
                    return this;
                }

                public final c g() {
                    c cVar = new c(this);
                    int i14 = this.f156493b;
                    int i15 = (i14 & 1) != 1 ? 0 : 1;
                    cVar.f156480c = this.f156494c;
                    if ((i14 & 2) == 2) {
                        i15 |= 2;
                    }
                    cVar.f156481d = this.f156495d;
                    if ((i14 & 4) == 4) {
                        i15 |= 4;
                    }
                    cVar.f156482e = this.f156496e;
                    if ((i14 & 8) == 8) {
                        i15 |= 8;
                    }
                    cVar.f156483f = this.f156497f;
                    if ((i14 & 16) == 16) {
                        i15 |= 16;
                    }
                    cVar.f156484g = this.f156498g;
                    if ((i14 & 32) == 32) {
                        i15 |= 32;
                    }
                    cVar.f156485h = this.f156499h;
                    if ((i14 & 64) == 64) {
                        i15 |= 64;
                    }
                    cVar.f156486i = this.f156500i;
                    if ((i14 & 128) == 128) {
                        i15 |= 128;
                    }
                    cVar.f156487j = this.f156501j;
                    if ((i14 & 256) == 256) {
                        this.f156502k = Collections.unmodifiableList(this.f156502k);
                        this.f156493b &= -257;
                    }
                    cVar.f156488k = this.f156502k;
                    if ((i14 & 512) == 512) {
                        i15 |= 256;
                    }
                    cVar.f156489l = this.f156503l;
                    if ((i14 & 1024) == 1024) {
                        i15 |= 512;
                    }
                    cVar.f156490m = this.f156504m;
                    cVar.f156479b = i15;
                    return cVar;
                }

                public final void h(c cVar) {
                    b bVar;
                    if (cVar == c.f156476p) {
                        return;
                    }
                    if ((cVar.f156479b & 1) == 1) {
                        EnumC2956c enumC2956c = cVar.f156480c;
                        enumC2956c.getClass();
                        this.f156493b = 1 | this.f156493b;
                        this.f156494c = enumC2956c;
                    }
                    int i14 = cVar.f156479b;
                    if ((i14 & 2) == 2) {
                        long j8 = cVar.f156481d;
                        this.f156493b |= 2;
                        this.f156495d = j8;
                    }
                    if ((i14 & 4) == 4) {
                        float f14 = cVar.f156482e;
                        this.f156493b = 4 | this.f156493b;
                        this.f156496e = f14;
                    }
                    if ((i14 & 8) == 8) {
                        double d14 = cVar.f156483f;
                        this.f156493b |= 8;
                        this.f156497f = d14;
                    }
                    if ((i14 & 16) == 16) {
                        int i15 = cVar.f156484g;
                        this.f156493b = 16 | this.f156493b;
                        this.f156498g = i15;
                    }
                    if ((i14 & 32) == 32) {
                        int i16 = cVar.f156485h;
                        this.f156493b = 32 | this.f156493b;
                        this.f156499h = i16;
                    }
                    if ((i14 & 64) == 64) {
                        int i17 = cVar.f156486i;
                        this.f156493b = 64 | this.f156493b;
                        this.f156500i = i17;
                    }
                    if ((i14 & 128) == 128) {
                        b bVar2 = cVar.f156487j;
                        if ((this.f156493b & 128) != 128 || (bVar = this.f156501j) == b.f156457g) {
                            this.f156501j = bVar2;
                        } else {
                            c cVarF = c.f();
                            cVarF.h(bVar);
                            cVarF.h(bVar2);
                            this.f156501j = cVarF.g();
                        }
                        this.f156493b |= 128;
                    }
                    if (!cVar.f156488k.isEmpty()) {
                        if (this.f156502k.isEmpty()) {
                            this.f156502k = cVar.f156488k;
                            this.f156493b &= -257;
                        } else {
                            if ((this.f156493b & 256) != 256) {
                                this.f156502k = new ArrayList(this.f156502k);
                                this.f156493b |= 256;
                            }
                            this.f156502k.addAll(cVar.f156488k);
                        }
                    }
                    int i18 = cVar.f156479b;
                    if ((i18 & 256) == 256) {
                        int i19 = cVar.f156489l;
                        this.f156493b |= 512;
                        this.f156503l = i19;
                    }
                    if ((i18 & 512) == 512) {
                        int i24 = cVar.f156490m;
                        this.f156493b |= 1024;
                        this.f156504m = i24;
                    }
                    this.f202188a = this.f202188a.b(cVar.f156478a);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001b  */
                public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            h((c) c.f156477q.a(dVar, eVar));
                        } catch (InvalidProtocolBufferException e4) {
                            c cVar2 = (c) e4.getUnfinishedMessage();
                            try {
                                throw e4;
                            } catch (Throwable th3) {
                                th = th3;
                                cVar = cVar2;
                                if (cVar != null) {
                                    h(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (cVar != null) {
                            h(cVar);
                        }
                        throw th;
                    }
                }
            }

            /* JADX INFO: renamed from: s33.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC2956c implements z33.h.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f156519a;

                /* JADX INFO: renamed from: s33.b$b$c$c$a */
                public static class a implements z33.h.b<EnumC2956c> {
                    @Override // z33.h.b
                    public final z33.h.a findValueByNumber(int i14) {
                        return EnumC2956c.a(i14);
                    }
                }

                static {
                    new a();
                }

                EnumC2956c(int i14, int i15) {
                    this.f156519a = i15;
                }

                public static EnumC2956c a(int i14) {
                    switch (i14) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // z33.h.a
                public final int getNumber() {
                    return this.f156519a;
                }
            }

            static {
                c cVar = new c(true);
                f156476p = cVar;
                cVar.d();
            }

            private c(z33.d dVar, z33.e eVar) {
                c cVarF;
                this.f156491n = (byte) -1;
                this.f156492o = -1;
                d();
                z33.c.b bVarI = z33.c.i();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
                boolean z14 = false;
                char c14 = 0;
                while (!z14) {
                    try {
                        try {
                            int iO = dVar.o();
                            switch (iO) {
                                case 0:
                                    break;
                                case 8:
                                    int iL = dVar.l();
                                    EnumC2956c enumC2956cA = EnumC2956c.a(iL);
                                    if (enumC2956cA == null) {
                                        codedOutputStreamJ.v(iO);
                                        codedOutputStreamJ.v(iL);
                                    } else {
                                        this.f156479b |= 1;
                                        this.f156480c = enumC2956cA;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.f156479b |= 2;
                                    long jM = dVar.m();
                                    this.f156481d = (-(jM & 1)) ^ (jM >>> 1);
                                    continue;
                                case 29:
                                    this.f156479b |= 4;
                                    this.f156482e = Float.intBitsToFloat(dVar.j());
                                    continue;
                                case 33:
                                    this.f156479b |= 8;
                                    this.f156483f = Double.longBitsToDouble(dVar.k());
                                    continue;
                                case 40:
                                    this.f156479b |= 16;
                                    this.f156484g = dVar.l();
                                    continue;
                                case 48:
                                    this.f156479b |= 32;
                                    this.f156485h = dVar.l();
                                    continue;
                                case 56:
                                    this.f156479b |= 64;
                                    this.f156486i = dVar.l();
                                    continue;
                                case 66:
                                    if ((this.f156479b & 128) == 128) {
                                        b bVar = this.f156487j;
                                        bVar.getClass();
                                        cVarF = c.f();
                                        cVarF.h(bVar);
                                    } else {
                                        cVarF = null;
                                    }
                                    b bVar2 = (b) dVar.h(b.f156458h, eVar);
                                    this.f156487j = bVar2;
                                    if (cVarF != null) {
                                        cVarF.h(bVar2);
                                        this.f156487j = cVarF.g();
                                    }
                                    this.f156479b |= 128;
                                    continue;
                                case 74:
                                    if ((c14 & 256) != 256) {
                                        this.f156488k = new ArrayList();
                                        c14 = 256;
                                    }
                                    this.f156488k.add((c) dVar.h(f156477q, eVar));
                                    continue;
                                case 80:
                                    this.f156479b |= 512;
                                    this.f156490m = dVar.l();
                                    continue;
                                case 88:
                                    this.f156479b |= 256;
                                    this.f156489l = dVar.l();
                                    continue;
                                default:
                                    if (!dVar.r(iO, codedOutputStreamJ)) {
                                        break;
                                    }
                                    break;
                            }
                            z14 = true;
                        } catch (Throwable th3) {
                            if ((c14 & 256) == 256) {
                                this.f156488k = Collections.unmodifiableList(this.f156488k);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused) {
                            } finally {
                                this.f156478a = bVarI.e();
                            }
                            throw th3;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    } catch (IOException e14) {
                        throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((c14 & 256) == 256) {
                    this.f156488k = Collections.unmodifiableList(this.f156488k);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.f156478a = bVarI.e();
                }
            }

            public static C2955b e(c cVar) {
                C2955b c2955bF = C2955b.f();
                c2955bF.h(cVar);
                return c2955bF;
            }

            @Override // z33.n
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f156479b & 1) == 1) {
                    codedOutputStream.l(1, this.f156480c.f156519a);
                }
                if ((this.f156479b & 2) == 2) {
                    long j8 = this.f156481d;
                    codedOutputStream.x(2, 0);
                    codedOutputStream.w((j8 >> 63) ^ (j8 << 1));
                }
                if ((this.f156479b & 4) == 4) {
                    float f14 = this.f156482e;
                    codedOutputStream.x(3, 5);
                    codedOutputStream.t(Float.floatToRawIntBits(f14));
                }
                if ((this.f156479b & 8) == 8) {
                    double d14 = this.f156483f;
                    codedOutputStream.x(4, 1);
                    codedOutputStream.u(Double.doubleToRawLongBits(d14));
                }
                if ((this.f156479b & 16) == 16) {
                    codedOutputStream.m(5, this.f156484g);
                }
                if ((this.f156479b & 32) == 32) {
                    codedOutputStream.m(6, this.f156485h);
                }
                if ((this.f156479b & 64) == 64) {
                    codedOutputStream.m(7, this.f156486i);
                }
                if ((this.f156479b & 128) == 128) {
                    codedOutputStream.o(8, this.f156487j);
                }
                for (int i14 = 0; i14 < this.f156488k.size(); i14++) {
                    codedOutputStream.o(9, this.f156488k.get(i14));
                }
                if ((this.f156479b & 512) == 512) {
                    codedOutputStream.m(10, this.f156490m);
                }
                if ((this.f156479b & 256) == 256) {
                    codedOutputStream.m(11, this.f156489l);
                }
                codedOutputStream.r(this.f156478a);
            }

            public final void d() {
                this.f156480c = EnumC2956c.BYTE;
                this.f156481d = 0L;
                this.f156482e = 0.0f;
                this.f156483f = 0.0d;
                this.f156484g = 0;
                this.f156485h = 0;
                this.f156486i = 0;
                this.f156487j = b.f156457g;
                this.f156488k = Collections.EMPTY_LIST;
                this.f156489l = 0;
                this.f156490m = 0;
            }

            @Override // z33.n
            public final int getSerializedSize() {
                int i14 = this.f156492o;
                if (i14 != -1) {
                    return i14;
                }
                int iA = (this.f156479b & 1) == 1 ? CodedOutputStream.a(1, this.f156480c.f156519a) : 0;
                if ((this.f156479b & 2) == 2) {
                    long j8 = this.f156481d;
                    iA += CodedOutputStream.g((j8 >> 63) ^ (j8 << 1)) + CodedOutputStream.h(2);
                }
                if ((this.f156479b & 4) == 4) {
                    iA += CodedOutputStream.h(3) + 4;
                }
                if ((this.f156479b & 8) == 8) {
                    iA += CodedOutputStream.h(4) + 8;
                }
                if ((this.f156479b & 16) == 16) {
                    iA += CodedOutputStream.b(5, this.f156484g);
                }
                if ((this.f156479b & 32) == 32) {
                    iA += CodedOutputStream.b(6, this.f156485h);
                }
                if ((this.f156479b & 64) == 64) {
                    iA += CodedOutputStream.b(7, this.f156486i);
                }
                if ((this.f156479b & 128) == 128) {
                    iA += CodedOutputStream.d(8, this.f156487j);
                }
                for (int i15 = 0; i15 < this.f156488k.size(); i15++) {
                    iA += CodedOutputStream.d(9, this.f156488k.get(i15));
                }
                if ((this.f156479b & 512) == 512) {
                    iA += CodedOutputStream.b(10, this.f156490m);
                }
                if ((this.f156479b & 256) == 256) {
                    iA += CodedOutputStream.b(11, this.f156489l);
                }
                int size = this.f156478a.size() + iA;
                this.f156492o = size;
                return size;
            }

            @Override // z33.o
            public final boolean isInitialized() {
                byte b14 = this.f156491n;
                if (b14 == 1) {
                    return true;
                }
                if (b14 == 0) {
                    return false;
                }
                if ((this.f156479b & 128) == 128 && !this.f156487j.isInitialized()) {
                    this.f156491n = (byte) 0;
                    return false;
                }
                for (int i14 = 0; i14 < this.f156488k.size(); i14++) {
                    if (!this.f156488k.get(i14).isInitialized()) {
                        this.f156491n = (byte) 0;
                        return false;
                    }
                }
                this.f156491n = (byte) 1;
                return true;
            }

            @Override // z33.n
            public final z33.n.a newBuilderForType() {
                return C2955b.f();
            }

            @Override // z33.n
            public final z33.n.a toBuilder() {
                return e(this);
            }

            private c(z33.g.b bVar) {
                super(bVar);
                this.f156491n = (byte) -1;
                this.f156492o = -1;
                this.f156478a = bVar.f202188a;
            }

            private c(boolean z14) {
                this.f156491n = (byte) -1;
                this.f156492o = -1;
                this.f156478a = z33.c.f202161a;
            }
        }
    }

    private b(z33.g.b bVar) {
        super(bVar);
        this.f156463e = (byte) -1;
        this.f156464f = -1;
        this.f156459a = bVar.f202188a;
    }

    private b(boolean z14) {
        this.f156463e = (byte) -1;
        this.f156464f = -1;
        this.f156459a = z33.c.f202161a;
    }
}
