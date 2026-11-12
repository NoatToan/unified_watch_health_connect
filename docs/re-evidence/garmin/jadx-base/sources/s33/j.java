package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends z33.g.d<j> {
    public static final j A;
    public static final a B = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f156686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<u> f156688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f156689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<s> f156691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<Integer> f156692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<w> f156694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<w> f156695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f156696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<Integer> f156697r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f156698t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<d> f156699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<s33.b> f156700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<s33.b> f156701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f156702y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f156703z;

    public static class a extends z33.b<j> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new j(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<j, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156705e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156706f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public s f156708h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f156709i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<u> f156710j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s f156711k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f156712l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<s> f156713m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List<Integer> f156714n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<w> f156715o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<w> f156716p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public v f156717q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<Integer> f156718r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public f f156719t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public List<d> f156720v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public List<s33.b> f156721w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public List<s33.b> f156722x;

        private b() {
            s sVar = s.f156850w;
            this.f156708h = sVar;
            List list = Collections.EMPTY_LIST;
            this.f156710j = list;
            this.f156711k = sVar;
            this.f156713m = list;
            this.f156714n = list;
            this.f156715o = list;
            this.f156716p = list;
            this.f156717q = v.f156960g;
            this.f156718r = list;
            this.f156719t = f.f156604e;
            this.f156720v = list;
            this.f156721w = list;
            this.f156722x = list;
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
            j jVarI = i();
            if (jVarI.isInitialized()) {
                return jVarI;
            }
            throw new UninitializedMessageException(jVarI);
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
            j((j) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final j i() {
            j jVar = new j(this);
            int i14 = this.f156704d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            jVar.f156683d = this.f156705e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            jVar.f156684e = this.f156706f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            jVar.f156685f = this.f156707g;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            jVar.f156686g = this.f156708h;
            if ((i14 & 16) == 16) {
                i15 |= 16;
            }
            jVar.f156687h = this.f156709i;
            if ((i14 & 32) == 32) {
                this.f156710j = Collections.unmodifiableList(this.f156710j);
                this.f156704d &= -33;
            }
            jVar.f156688i = this.f156710j;
            if ((i14 & 64) == 64) {
                i15 |= 32;
            }
            jVar.f156689j = this.f156711k;
            if ((i14 & 128) == 128) {
                i15 |= 64;
            }
            jVar.f156690k = this.f156712l;
            if ((this.f156704d & 256) == 256) {
                this.f156713m = Collections.unmodifiableList(this.f156713m);
                this.f156704d &= -257;
            }
            jVar.f156691l = this.f156713m;
            if ((this.f156704d & 512) == 512) {
                this.f156714n = Collections.unmodifiableList(this.f156714n);
                this.f156704d &= -513;
            }
            jVar.f156692m = this.f156714n;
            if ((this.f156704d & 1024) == 1024) {
                this.f156715o = Collections.unmodifiableList(this.f156715o);
                this.f156704d &= -1025;
            }
            jVar.f156694o = this.f156715o;
            if ((this.f156704d & 2048) == 2048) {
                this.f156716p = Collections.unmodifiableList(this.f156716p);
                this.f156704d &= -2049;
            }
            jVar.f156695p = this.f156716p;
            if ((i14 & 4096) == 4096) {
                i15 |= 128;
            }
            jVar.f156696q = this.f156717q;
            if ((this.f156704d & 8192) == 8192) {
                this.f156718r = Collections.unmodifiableList(this.f156718r);
                this.f156704d &= -8193;
            }
            jVar.f156697r = this.f156718r;
            if ((i14 & 16384) == 16384) {
                i15 |= 256;
            }
            jVar.f156698t = this.f156719t;
            if ((this.f156704d & 32768) == 32768) {
                this.f156720v = Collections.unmodifiableList(this.f156720v);
                this.f156704d &= -32769;
            }
            jVar.f156699v = this.f156720v;
            if ((this.f156704d & 65536) == 65536) {
                this.f156721w = Collections.unmodifiableList(this.f156721w);
                this.f156704d &= -65537;
            }
            jVar.f156700w = this.f156721w;
            if ((this.f156704d & 131072) == 131072) {
                this.f156722x = Collections.unmodifiableList(this.f156722x);
                this.f156704d &= -131073;
            }
            jVar.f156701x = this.f156722x;
            jVar.f156682c = i15;
            return jVar;
        }

        public final void j(j jVar) {
            f fVar;
            v vVar;
            s sVar;
            s sVar2;
            if (jVar == j.A) {
                return;
            }
            int i14 = jVar.f156682c;
            if ((i14 & 1) == 1) {
                int i15 = jVar.f156683d;
                this.f156704d = 1 | this.f156704d;
                this.f156705e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = jVar.f156684e;
                this.f156704d = 2 | this.f156704d;
                this.f156706f = i16;
            }
            if ((i14 & 4) == 4) {
                int i17 = jVar.f156685f;
                this.f156704d = 4 | this.f156704d;
                this.f156707g = i17;
            }
            if ((i14 & 8) == 8) {
                s sVar3 = jVar.f156686g;
                if ((this.f156704d & 8) != 8 || (sVar2 = this.f156708h) == s.f156850w) {
                    this.f156708h = sVar3;
                } else {
                    s.c cVarO = s.o(sVar2);
                    cVarO.j(sVar3);
                    this.f156708h = cVarO.i();
                }
                this.f156704d |= 8;
            }
            if ((jVar.f156682c & 16) == 16) {
                int i18 = jVar.f156687h;
                this.f156704d = 16 | this.f156704d;
                this.f156709i = i18;
            }
            if (!jVar.f156688i.isEmpty()) {
                if (this.f156710j.isEmpty()) {
                    this.f156710j = jVar.f156688i;
                    this.f156704d &= -33;
                } else {
                    if ((this.f156704d & 32) != 32) {
                        this.f156710j = new ArrayList(this.f156710j);
                        this.f156704d |= 32;
                    }
                    this.f156710j.addAll(jVar.f156688i);
                }
            }
            if ((jVar.f156682c & 32) == 32) {
                s sVar4 = jVar.f156689j;
                if ((this.f156704d & 64) != 64 || (sVar = this.f156711k) == s.f156850w) {
                    this.f156711k = sVar4;
                } else {
                    s.c cVarO2 = s.o(sVar);
                    cVarO2.j(sVar4);
                    this.f156711k = cVarO2.i();
                }
                this.f156704d |= 64;
            }
            if ((jVar.f156682c & 64) == 64) {
                int i19 = jVar.f156690k;
                this.f156704d |= 128;
                this.f156712l = i19;
            }
            if (!jVar.f156691l.isEmpty()) {
                if (this.f156713m.isEmpty()) {
                    this.f156713m = jVar.f156691l;
                    this.f156704d &= -257;
                } else {
                    if ((this.f156704d & 256) != 256) {
                        this.f156713m = new ArrayList(this.f156713m);
                        this.f156704d |= 256;
                    }
                    this.f156713m.addAll(jVar.f156691l);
                }
            }
            if (!jVar.f156692m.isEmpty()) {
                if (this.f156714n.isEmpty()) {
                    this.f156714n = jVar.f156692m;
                    this.f156704d &= -513;
                } else {
                    if ((this.f156704d & 512) != 512) {
                        this.f156714n = new ArrayList(this.f156714n);
                        this.f156704d |= 512;
                    }
                    this.f156714n.addAll(jVar.f156692m);
                }
            }
            if (!jVar.f156694o.isEmpty()) {
                if (this.f156715o.isEmpty()) {
                    this.f156715o = jVar.f156694o;
                    this.f156704d &= -1025;
                } else {
                    if ((this.f156704d & 1024) != 1024) {
                        this.f156715o = new ArrayList(this.f156715o);
                        this.f156704d |= 1024;
                    }
                    this.f156715o.addAll(jVar.f156694o);
                }
            }
            if (!jVar.f156695p.isEmpty()) {
                if (this.f156716p.isEmpty()) {
                    this.f156716p = jVar.f156695p;
                    this.f156704d &= -2049;
                } else {
                    if ((this.f156704d & 2048) != 2048) {
                        this.f156716p = new ArrayList(this.f156716p);
                        this.f156704d |= 2048;
                    }
                    this.f156716p.addAll(jVar.f156695p);
                }
            }
            if ((jVar.f156682c & 128) == 128) {
                v vVar2 = jVar.f156696q;
                if ((this.f156704d & 4096) != 4096 || (vVar = this.f156717q) == v.f156960g) {
                    this.f156717q = vVar2;
                } else {
                    v.b bVarD = v.d(vVar);
                    bVarD.h(vVar2);
                    this.f156717q = bVarD.g();
                }
                this.f156704d |= 4096;
            }
            if (!jVar.f156697r.isEmpty()) {
                if (this.f156718r.isEmpty()) {
                    this.f156718r = jVar.f156697r;
                    this.f156704d &= -8193;
                } else {
                    if ((this.f156704d & 8192) != 8192) {
                        this.f156718r = new ArrayList(this.f156718r);
                        this.f156704d |= 8192;
                    }
                    this.f156718r.addAll(jVar.f156697r);
                }
            }
            if ((jVar.f156682c & 256) == 256) {
                f fVar2 = jVar.f156698t;
                if ((this.f156704d & 16384) != 16384 || (fVar = this.f156719t) == f.f156604e) {
                    this.f156719t = fVar2;
                } else {
                    f.b bVarF = f.b.f();
                    bVarF.h(fVar);
                    bVarF.h(fVar2);
                    this.f156719t = bVarF.g();
                }
                this.f156704d |= 16384;
            }
            if (!jVar.f156699v.isEmpty()) {
                if (this.f156720v.isEmpty()) {
                    this.f156720v = jVar.f156699v;
                    this.f156704d &= -32769;
                } else {
                    if ((this.f156704d & 32768) != 32768) {
                        this.f156720v = new ArrayList(this.f156720v);
                        this.f156704d |= 32768;
                    }
                    this.f156720v.addAll(jVar.f156699v);
                }
            }
            if (!jVar.f156700w.isEmpty()) {
                if (this.f156721w.isEmpty()) {
                    this.f156721w = jVar.f156700w;
                    this.f156704d &= -65537;
                } else {
                    if ((this.f156704d & 65536) != 65536) {
                        this.f156721w = new ArrayList(this.f156721w);
                        this.f156704d |= 65536;
                    }
                    this.f156721w.addAll(jVar.f156700w);
                }
            }
            if (!jVar.f156701x.isEmpty()) {
                if (this.f156722x.isEmpty()) {
                    this.f156722x = jVar.f156701x;
                    this.f156704d &= -131073;
                } else {
                    if ((this.f156704d & 131072) != 131072) {
                        this.f156722x = new ArrayList(this.f156722x);
                        this.f156704d |= 131072;
                    }
                    this.f156722x.addAll(jVar.f156701x);
                }
            }
            g(jVar);
            this.f202188a = this.f202188a.b(jVar.f156681b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            j jVar = null;
            try {
                try {
                    j((j) j.B.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    j jVar2 = (j) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        jVar = jVar2;
                        if (jVar != null) {
                            j(jVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (jVar != null) {
                    j(jVar);
                }
                throw th;
            }
        }
    }

    static {
        j jVar = new j(true);
        A = jVar;
        jVar.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:135:0x0340  */
    /* JADX WARN: Code duplicated, block: B:138:0x034c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0358  */
    /* JADX WARN: Code duplicated, block: B:144:0x0364  */
    /* JADX WARN: Code duplicated, block: B:147:0x0370  */
    /* JADX WARN: Code duplicated, block: B:150:0x037c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0388  */
    /* JADX WARN: Code duplicated, block: B:156:0x0396  */
    /* JADX WARN: Code duplicated, block: B:159:0x03a4  */
    /* JADX WARN: Multi-variable type inference failed */
    private j(z33.d dVar, z33.e eVar) throws Throwable {
        int i14;
        f.b bVarF;
        this.f156693n = -1;
        this.f156702y = (byte) -1;
        this.f156703z = -1;
        m();
        z33.c.b bVarI = z33.c.i();
        boolean z14 = true;
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            int i16 = 32768;
            int i17 = 131072;
            boolean z16 = z14;
            if (z15) {
                if ((i15 & 32) == 32) {
                    this.f156688i = Collections.unmodifiableList(this.f156688i);
                }
                if ((i15 & 2048) == 2048) {
                    this.f156695p = Collections.unmodifiableList(this.f156695p);
                }
                if ((i15 & 256) == 256) {
                    this.f156691l = Collections.unmodifiableList(this.f156691l);
                }
                if ((i15 & 512) == 512) {
                    this.f156692m = Collections.unmodifiableList(this.f156692m);
                }
                if ((i15 & 65536) == 65536) {
                    this.f156700w = Collections.unmodifiableList(this.f156700w);
                }
                if ((i15 & 1024) == 1024) {
                    this.f156694o = Collections.unmodifiableList(this.f156694o);
                }
                if ((i15 & 8192) == 8192) {
                    this.f156697r = Collections.unmodifiableList(this.f156697r);
                }
                if ((i15 & 32768) == 32768) {
                    this.f156699v = Collections.unmodifiableList(this.f156699v);
                }
                if ((i15 & 131072) == 131072) {
                    this.f156701x = Collections.unmodifiableList(this.f156701x);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156681b = bVarI.e();
                }
                h();
                return;
            }
            try {
                int iO = dVar.o();
                Cloneable cloneableO = null;
                switch (iO) {
                    case 0:
                        z15 = z16;
                        z14 = z16;
                        break;
                    case 8:
                        this.f156682c |= 2;
                        this.f156684e = dVar.l();
                        z14 = z16;
                        break;
                    case 16:
                        this.f156682c |= 4;
                        this.f156685f = dVar.l();
                        z14 = z16;
                        break;
                    case 26:
                        if ((this.f156682c & 8) == 8) {
                            s sVar = this.f156686g;
                            sVar.getClass();
                            cloneableO = s.o(sVar);
                        }
                        s.c cVar = cloneableO;
                        s sVar2 = (s) dVar.h(s.f156851x, eVar);
                        this.f156686g = sVar2;
                        if (cVar != 0) {
                            cVar.j(sVar2);
                            this.f156686g = cVar.i();
                        }
                        this.f156682c |= 8;
                        z14 = z16;
                        break;
                    case 34:
                        if ((i15 & 32) != 32) {
                            this.f156688i = new ArrayList();
                            i15 |= 32;
                        }
                        this.f156688i.add((u) dVar.h(u.f156934o, eVar));
                        z14 = z16;
                        break;
                    case 42:
                        if ((this.f156682c & 32) == 32) {
                            s sVar3 = this.f156689j;
                            sVar3.getClass();
                            cloneableO = s.o(sVar3);
                        }
                        s.c cVar2 = cloneableO;
                        s sVar4 = (s) dVar.h(s.f156851x, eVar);
                        this.f156689j = sVar4;
                        if (cVar2 != 0) {
                            cVar2.j(sVar4);
                            this.f156689j = cVar2.i();
                        }
                        this.f156682c |= 32;
                        z14 = z16;
                        break;
                    case 50:
                        if ((i15 & 2048) != 2048) {
                            this.f156695p = new ArrayList();
                            i15 |= 2048;
                        }
                        this.f156695p.add((w) dVar.h(w.f156972o, eVar));
                        z14 = z16;
                        break;
                    case 56:
                        this.f156682c |= 16;
                        this.f156687h = dVar.l();
                        z14 = z16;
                        break;
                    case 64:
                        this.f156682c |= 64;
                        this.f156690k = dVar.l();
                        z14 = z16;
                        break;
                    case 72:
                        this.f156682c |= 1;
                        this.f156683d = dVar.l();
                        z14 = z16;
                        break;
                    case 82:
                        if ((i15 & 256) != 256) {
                            this.f156691l = new ArrayList();
                            i15 |= 256;
                        }
                        this.f156691l.add((s) dVar.h(s.f156851x, eVar));
                        z14 = z16;
                        break;
                    case 88:
                        if ((i15 & 512) != 512) {
                            this.f156692m = new ArrayList();
                            i15 |= 512;
                        }
                        this.f156692m.add(Integer.valueOf(dVar.l()));
                        z14 = z16;
                        break;
                    case 90:
                        int iE = dVar.e(dVar.l());
                        if ((i15 & 512) != 512 && dVar.b() > 0) {
                            this.f156692m = new ArrayList();
                            i15 |= 512;
                        }
                        while (dVar.b() > 0) {
                            this.f156692m.add(Integer.valueOf(dVar.l()));
                        }
                        dVar.d(iE);
                        z14 = z16;
                        break;
                    case 98:
                        if ((i15 & 65536) != 65536) {
                            this.f156700w = new ArrayList();
                            i15 |= 65536;
                        }
                        this.f156700w.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                        z14 = z16;
                        break;
                    case 106:
                        if ((i15 & 1024) != 1024) {
                            this.f156694o = new ArrayList();
                            i15 |= 1024;
                        }
                        this.f156694o.add((w) dVar.h(w.f156972o, eVar));
                        z14 = z16;
                        break;
                    case 242:
                        if ((this.f156682c & 128) == 128) {
                            v vVar = this.f156696q;
                            vVar.getClass();
                            cloneableO = v.d(vVar);
                        }
                        v.b bVar = cloneableO;
                        v vVar2 = (v) dVar.h(v.f156961h, eVar);
                        this.f156696q = vVar2;
                        if (bVar != 0) {
                            bVar.h(vVar2);
                            this.f156696q = bVar.g();
                        }
                        this.f156682c |= 128;
                        z14 = z16;
                        break;
                    case 248:
                        if ((i15 & 8192) != 8192) {
                            this.f156697r = new ArrayList();
                            i15 |= 8192;
                        }
                        this.f156697r.add(Integer.valueOf(dVar.l()));
                        z14 = z16;
                        break;
                    case 250:
                        i17 = 131072;
                        int iE2 = dVar.e(dVar.l());
                        if ((i15 & 8192) != 8192 && dVar.b() > 0) {
                            this.f156697r = new ArrayList();
                            i15 |= 8192;
                        }
                        while (dVar.b() > 0) {
                            i14 = i16;
                            try {
                                try {
                                    this.f156697r.add(Integer.valueOf(dVar.l()));
                                    i16 = i14;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if ((i15 & 32) == 32) {
                                        this.f156688i = Collections.unmodifiableList(this.f156688i);
                                    }
                                    if ((i15 & 2048) == 2048) {
                                        this.f156695p = Collections.unmodifiableList(this.f156695p);
                                    }
                                    if ((i15 & 256) == 256) {
                                        this.f156691l = Collections.unmodifiableList(this.f156691l);
                                    }
                                    if ((i15 & 512) == 512) {
                                        this.f156692m = Collections.unmodifiableList(this.f156692m);
                                    }
                                    if ((i15 & 65536) == 65536) {
                                        this.f156700w = Collections.unmodifiableList(this.f156700w);
                                    }
                                    if ((i15 & 1024) == 1024) {
                                        this.f156694o = Collections.unmodifiableList(this.f156694o);
                                    }
                                    if ((i15 & 8192) == 8192) {
                                        this.f156697r = Collections.unmodifiableList(this.f156697r);
                                    }
                                    if ((i15 & i14) == i14) {
                                        this.f156699v = Collections.unmodifiableList(this.f156699v);
                                    }
                                    if ((i15 & i17) == i17) {
                                        this.f156701x = Collections.unmodifiableList(this.f156701x);
                                    }
                                    try {
                                        codedOutputStreamJ.i();
                                        break;
                                    } catch (IOException unused2) {
                                    } finally {
                                        this.f156681b = bVarI.e();
                                    }
                                    h();
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException e4) {
                                e = e4;
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e14) {
                                e = e14;
                                throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                            }
                        }
                        dVar.d(iE2);
                        z14 = z16;
                        break;
                    case 258:
                        if ((this.f156682c & 256) == 256) {
                            f fVar = this.f156698t;
                            fVar.getClass();
                            bVarF = f.b.f();
                            bVarF.h(fVar);
                        } else {
                            bVarF = null;
                        }
                        f fVar2 = (f) dVar.h(f.f156605f, eVar);
                        this.f156698t = fVar2;
                        if (bVarF != null) {
                            bVarF.h(fVar2);
                            this.f156698t = bVarF.g();
                        }
                        this.f156682c |= 256;
                        z14 = z16;
                        break;
                    case 266:
                        if ((i15 & 32768) != 32768) {
                            this.f156699v = new ArrayList();
                            i15 |= 32768;
                        }
                        this.f156699v.add((d) dVar.h(d.f156577h, eVar));
                        z14 = z16;
                        break;
                    case 274:
                        if ((i15 & 131072) != 131072) {
                            this.f156701x = new ArrayList();
                            i15 |= 131072;
                        }
                        try {
                            try {
                                this.f156701x.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                                z14 = z16;
                            } catch (InvalidProtocolBufferException e15) {
                                e = e15;
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e16) {
                                e = e16;
                                throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                            } catch (Throwable th4) {
                                th = th4;
                                i14 = 32768;
                                if ((i15 & 32) == 32) {
                                    this.f156688i = Collections.unmodifiableList(this.f156688i);
                                }
                                if ((i15 & 2048) == 2048) {
                                    this.f156695p = Collections.unmodifiableList(this.f156695p);
                                }
                                if ((i15 & 256) == 256) {
                                    this.f156691l = Collections.unmodifiableList(this.f156691l);
                                }
                                if ((i15 & 512) == 512) {
                                    this.f156692m = Collections.unmodifiableList(this.f156692m);
                                }
                                if ((i15 & 65536) == 65536) {
                                    this.f156700w = Collections.unmodifiableList(this.f156700w);
                                }
                                if ((i15 & 1024) == 1024) {
                                    this.f156694o = Collections.unmodifiableList(this.f156694o);
                                }
                                if ((i15 & 8192) == 8192) {
                                    this.f156697r = Collections.unmodifiableList(this.f156697r);
                                }
                                if ((i15 & i14) == i14) {
                                    this.f156699v = Collections.unmodifiableList(this.f156699v);
                                }
                                if ((i15 & i17) == i17) {
                                    this.f156701x = Collections.unmodifiableList(this.f156701x);
                                }
                                codedOutputStreamJ.i();
                                h();
                                throw th;
                            }
                        } catch (InvalidProtocolBufferException e17) {
                            e = e17;
                        } catch (IOException e18) {
                            e = e18;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        break;
                    default:
                        if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                            z15 = z16;
                        }
                        z14 = z16;
                        break;
                }
            } catch (InvalidProtocolBufferException e19) {
                e = e19;
            } catch (IOException e24) {
                e = e24;
            } catch (Throwable th6) {
                th = th6;
                i14 = 32768;
                i17 = 131072;
            }
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156682c & 2) == 2) {
            codedOutputStream.m(1, this.f156684e);
        }
        if ((this.f156682c & 4) == 4) {
            codedOutputStream.m(2, this.f156685f);
        }
        if ((this.f156682c & 8) == 8) {
            codedOutputStream.o(3, this.f156686g);
        }
        for (int i14 = 0; i14 < this.f156688i.size(); i14++) {
            codedOutputStream.o(4, this.f156688i.get(i14));
        }
        if ((this.f156682c & 32) == 32) {
            codedOutputStream.o(5, this.f156689j);
        }
        for (int i15 = 0; i15 < this.f156695p.size(); i15++) {
            codedOutputStream.o(6, this.f156695p.get(i15));
        }
        if ((this.f156682c & 16) == 16) {
            codedOutputStream.m(7, this.f156687h);
        }
        if ((this.f156682c & 64) == 64) {
            codedOutputStream.m(8, this.f156690k);
        }
        if ((this.f156682c & 1) == 1) {
            codedOutputStream.m(9, this.f156683d);
        }
        for (int i16 = 0; i16 < this.f156691l.size(); i16++) {
            codedOutputStream.o(10, this.f156691l.get(i16));
        }
        if (this.f156692m.size() > 0) {
            codedOutputStream.v(90);
            codedOutputStream.v(this.f156693n);
        }
        for (int i17 = 0; i17 < this.f156692m.size(); i17++) {
            codedOutputStream.n(this.f156692m.get(i17).intValue());
        }
        for (int i18 = 0; i18 < this.f156700w.size(); i18++) {
            codedOutputStream.o(12, this.f156700w.get(i18));
        }
        for (int i19 = 0; i19 < this.f156694o.size(); i19++) {
            codedOutputStream.o(13, this.f156694o.get(i19));
        }
        if ((this.f156682c & 128) == 128) {
            codedOutputStream.o(30, this.f156696q);
        }
        for (int i24 = 0; i24 < this.f156697r.size(); i24++) {
            codedOutputStream.m(31, this.f156697r.get(i24).intValue());
        }
        if ((this.f156682c & 256) == 256) {
            codedOutputStream.o(32, this.f156698t);
        }
        for (int i25 = 0; i25 < this.f156699v.size(); i25++) {
            codedOutputStream.o(33, this.f156699v.get(i25));
        }
        for (int i26 = 0; i26 < this.f156701x.size(); i26++) {
            codedOutputStream.o(34, this.f156701x.get(i26));
        }
        aVarI.a(19000, codedOutputStream);
        codedOutputStream.r(this.f156681b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return A;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        List<Integer> list2;
        int i14 = this.f156703z;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156682c & 2) == 2 ? CodedOutputStream.b(1, this.f156684e) : 0;
        if ((this.f156682c & 4) == 4) {
            iB += CodedOutputStream.b(2, this.f156685f);
        }
        if ((this.f156682c & 8) == 8) {
            iB += CodedOutputStream.d(3, this.f156686g);
        }
        for (int i15 = 0; i15 < this.f156688i.size(); i15++) {
            iB += CodedOutputStream.d(4, this.f156688i.get(i15));
        }
        if ((this.f156682c & 32) == 32) {
            iB += CodedOutputStream.d(5, this.f156689j);
        }
        for (int i16 = 0; i16 < this.f156695p.size(); i16++) {
            iB += CodedOutputStream.d(6, this.f156695p.get(i16));
        }
        if ((this.f156682c & 16) == 16) {
            iB += CodedOutputStream.b(7, this.f156687h);
        }
        if ((this.f156682c & 64) == 64) {
            iB += CodedOutputStream.b(8, this.f156690k);
        }
        if ((this.f156682c & 1) == 1) {
            iB += CodedOutputStream.b(9, this.f156683d);
        }
        for (int i17 = 0; i17 < this.f156691l.size(); i17++) {
            iB += CodedOutputStream.d(10, this.f156691l.get(i17));
        }
        int i18 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156692m.size();
            list = this.f156692m;
            if (i18 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i18).intValue());
            i18++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + CodedOutputStream.c(iC);
        }
        this.f156693n = iC;
        for (int i19 = 0; i19 < this.f156700w.size(); i19++) {
            iD += CodedOutputStream.d(12, this.f156700w.get(i19));
        }
        for (int i24 = 0; i24 < this.f156694o.size(); i24++) {
            iD += CodedOutputStream.d(13, this.f156694o.get(i24));
        }
        if ((this.f156682c & 128) == 128) {
            iD += CodedOutputStream.d(30, this.f156696q);
        }
        int i25 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.f156697r.size();
            list2 = this.f156697r;
            if (i25 >= size2) {
                break;
            }
            iC2 += CodedOutputStream.c(list2.get(i25).intValue());
            i25++;
        }
        int iC3 = org.apache.commons.lang3.e.c(2, iD + iC2, list2);
        if ((this.f156682c & 256) == 256) {
            iC3 += CodedOutputStream.d(32, this.f156698t);
        }
        for (int i26 = 0; i26 < this.f156699v.size(); i26++) {
            iC3 += CodedOutputStream.d(33, this.f156699v.get(i26));
        }
        for (int i27 = 0; i27 < this.f156701x.size(); i27++) {
            iC3 += CodedOutputStream.d(34, this.f156701x.get(i27));
        }
        int size3 = this.f156681b.size() + e() + iC3;
        this.f156703z = size3;
        return size3;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156702y;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        int i14 = this.f156682c;
        if ((i14 & 4) != 4) {
            this.f156702y = (byte) 0;
            return false;
        }
        if ((i14 & 8) == 8 && !this.f156686g.isInitialized()) {
            this.f156702y = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156688i.size(); i15++) {
            if (!this.f156688i.get(i15).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        if ((this.f156682c & 32) == 32 && !this.f156689j.isInitialized()) {
            this.f156702y = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < this.f156691l.size(); i16++) {
            if (!this.f156691l.get(i16).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f156694o.size(); i17++) {
            if (!this.f156694o.get(i17).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f156695p.size(); i18++) {
            if (!this.f156695p.get(i18).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        if ((this.f156682c & 128) == 128 && !this.f156696q.isInitialized()) {
            this.f156702y = (byte) 0;
            return false;
        }
        if ((this.f156682c & 256) == 256 && !this.f156698t.isInitialized()) {
            this.f156702y = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f156699v.size(); i19++) {
            if (!this.f156699v.get(i19).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f156700w.size(); i24++) {
            if (!this.f156700w.get(i24).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < this.f156701x.size(); i25++) {
            if (!this.f156701x.get(i25).isInitialized()) {
                this.f156702y = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156702y = (byte) 1;
            return true;
        }
        this.f156702y = (byte) 0;
        return false;
    }

    public final void m() {
        this.f156683d = 6;
        this.f156684e = 6;
        this.f156685f = 0;
        s sVar = s.f156850w;
        this.f156686g = sVar;
        this.f156687h = 0;
        List list = Collections.EMPTY_LIST;
        this.f156688i = list;
        this.f156689j = sVar;
        this.f156690k = 0;
        this.f156691l = list;
        this.f156692m = list;
        this.f156694o = list;
        this.f156695p = list;
        this.f156696q = v.f156960g;
        this.f156697r = list;
        this.f156698t = f.f156604e;
        this.f156699v = list;
        this.f156700w = list;
        this.f156701x = list;
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

    private j(z33.g.c<j, ?> cVar) {
        super(cVar);
        this.f156693n = -1;
        this.f156702y = (byte) -1;
        this.f156703z = -1;
        this.f156681b = cVar.f202188a;
    }

    private j(boolean z14) {
        this.f156693n = -1;
        this.f156702y = (byte) -1;
        this.f156703z = -1;
        this.f156681b = z33.c.f202161a;
    }
}
