package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends z33.g.d<s> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f156850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f156851x = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<b> f156854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f156855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f156857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f156863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f156865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f156866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f156867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<s33.b> f156868r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f156869t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f156870v;

    public static class a extends z33.b<s> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new s(dVar, eVar);
        }
    }

    public static final class c extends z33.g.c<s, c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<b> f156891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f156892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public s f156894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f156895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f156896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f156897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f156898l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f156899m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public s f156900n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f156901o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public s f156902p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f156903q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f156904r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List<s33.b> f156905t;

        private c() {
            List list = Collections.EMPTY_LIST;
            this.f156891e = list;
            s sVar = s.f156850w;
            this.f156894h = sVar;
            this.f156900n = sVar;
            this.f156902p = sVar;
            this.f156905t = list;
        }

        public static c h() {
            return new c();
        }

        @Override // z33.g.c, z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            c cVar = new c();
            cVar.j(i());
            return cVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            k(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            s sVarI = i();
            if (sVarI.isInitialized()) {
                return sVarI;
            }
            throw new UninitializedMessageException(sVarI);
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
            c cVar = new c();
            cVar.j(i());
            return cVar;
        }

        @Override // z33.g.c, z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            c cVar = new c();
            cVar.j(i());
            return cVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            j((s) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            c cVar = new c();
            cVar.j(i());
            return cVar;
        }

        public final s i() {
            s sVar = new s(this);
            int i14 = this.f156890d;
            if ((i14 & 1) == 1) {
                this.f156891e = Collections.unmodifiableList(this.f156891e);
                this.f156890d &= -2;
            }
            sVar.f156854d = this.f156891e;
            int i15 = (i14 & 2) != 2 ? 0 : 1;
            sVar.f156855e = this.f156892f;
            if ((i14 & 4) == 4) {
                i15 |= 2;
            }
            sVar.f156856f = this.f156893g;
            if ((i14 & 8) == 8) {
                i15 |= 4;
            }
            sVar.f156857g = this.f156894h;
            if ((i14 & 16) == 16) {
                i15 |= 8;
            }
            sVar.f156858h = this.f156895i;
            if ((i14 & 32) == 32) {
                i15 |= 16;
            }
            sVar.f156859i = this.f156896j;
            if ((i14 & 64) == 64) {
                i15 |= 32;
            }
            sVar.f156860j = this.f156897k;
            if ((i14 & 128) == 128) {
                i15 |= 64;
            }
            sVar.f156861k = this.f156898l;
            if ((i14 & 256) == 256) {
                i15 |= 128;
            }
            sVar.f156862l = this.f156899m;
            if ((i14 & 512) == 512) {
                i15 |= 256;
            }
            sVar.f156863m = this.f156900n;
            if ((i14 & 1024) == 1024) {
                i15 |= 512;
            }
            sVar.f156864n = this.f156901o;
            if ((i14 & 2048) == 2048) {
                i15 |= 1024;
            }
            sVar.f156865o = this.f156902p;
            if ((i14 & 4096) == 4096) {
                i15 |= 2048;
            }
            sVar.f156866p = this.f156903q;
            if ((i14 & 8192) == 8192) {
                i15 |= 4096;
            }
            sVar.f156867q = this.f156904r;
            if ((this.f156890d & 16384) == 16384) {
                this.f156905t = Collections.unmodifiableList(this.f156905t);
                this.f156890d &= -16385;
            }
            sVar.f156868r = this.f156905t;
            sVar.f156853c = i15;
            return sVar;
        }

        public final c j(s sVar) {
            s sVar2;
            s sVar3;
            s sVar4;
            s sVar5 = s.f156850w;
            if (sVar == sVar5) {
                return this;
            }
            if (!sVar.f156854d.isEmpty()) {
                if (this.f156891e.isEmpty()) {
                    this.f156891e = sVar.f156854d;
                    this.f156890d &= -2;
                } else {
                    if ((this.f156890d & 1) != 1) {
                        this.f156891e = new ArrayList(this.f156891e);
                        this.f156890d |= 1;
                    }
                    this.f156891e.addAll(sVar.f156854d);
                }
            }
            int i14 = sVar.f156853c;
            if ((i14 & 1) == 1) {
                boolean z14 = sVar.f156855e;
                this.f156890d |= 2;
                this.f156892f = z14;
            }
            if ((i14 & 2) == 2) {
                int i15 = sVar.f156856f;
                this.f156890d |= 4;
                this.f156893g = i15;
            }
            if ((i14 & 4) == 4) {
                s sVar6 = sVar.f156857g;
                if ((this.f156890d & 8) != 8 || (sVar4 = this.f156894h) == sVar5) {
                    this.f156894h = sVar6;
                } else {
                    c cVarO = s.o(sVar4);
                    cVarO.j(sVar6);
                    this.f156894h = cVarO.i();
                }
                this.f156890d |= 8;
            }
            if ((sVar.f156853c & 8) == 8) {
                int i16 = sVar.f156858h;
                this.f156890d |= 16;
                this.f156895i = i16;
            }
            if (sVar.m()) {
                int i17 = sVar.f156859i;
                this.f156890d |= 32;
                this.f156896j = i17;
            }
            int i18 = sVar.f156853c;
            if ((i18 & 32) == 32) {
                int i19 = sVar.f156860j;
                this.f156890d |= 64;
                this.f156897k = i19;
            }
            if ((i18 & 64) == 64) {
                int i24 = sVar.f156861k;
                this.f156890d |= 128;
                this.f156898l = i24;
            }
            if ((i18 & 128) == 128) {
                int i25 = sVar.f156862l;
                this.f156890d |= 256;
                this.f156899m = i25;
            }
            if ((i18 & 256) == 256) {
                s sVar7 = sVar.f156863m;
                if ((this.f156890d & 512) != 512 || (sVar3 = this.f156900n) == sVar5) {
                    this.f156900n = sVar7;
                } else {
                    c cVarO2 = s.o(sVar3);
                    cVarO2.j(sVar7);
                    this.f156900n = cVarO2.i();
                }
                this.f156890d |= 512;
            }
            int i26 = sVar.f156853c;
            if ((i26 & 512) == 512) {
                int i27 = sVar.f156864n;
                this.f156890d |= 1024;
                this.f156901o = i27;
            }
            if ((i26 & 1024) == 1024) {
                s sVar8 = sVar.f156865o;
                if ((this.f156890d & 2048) != 2048 || (sVar2 = this.f156902p) == sVar5) {
                    this.f156902p = sVar8;
                } else {
                    c cVarO3 = s.o(sVar2);
                    cVarO3.j(sVar8);
                    this.f156902p = cVarO3.i();
                }
                this.f156890d |= 2048;
            }
            int i28 = sVar.f156853c;
            if ((i28 & 2048) == 2048) {
                int i29 = sVar.f156866p;
                this.f156890d |= 4096;
                this.f156903q = i29;
            }
            if ((i28 & 4096) == 4096) {
                int i30 = sVar.f156867q;
                this.f156890d |= 8192;
                this.f156904r = i30;
            }
            if (!sVar.f156868r.isEmpty()) {
                if (this.f156905t.isEmpty()) {
                    this.f156905t = sVar.f156868r;
                    this.f156890d &= -16385;
                } else {
                    if ((this.f156890d & 16384) != 16384) {
                        this.f156905t = new ArrayList(this.f156905t);
                        this.f156890d |= 16384;
                    }
                    this.f156905t.addAll(sVar.f156868r);
                }
            }
            g(sVar);
            this.f202188a = this.f202188a.b(sVar.f156852b);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            s sVar = null;
            try {
                try {
                    j((s) s.f156851x.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    s sVar2 = (s) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        sVar = sVar2;
                        if (sVar != null) {
                            j(sVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (sVar != null) {
                    j(sVar);
                }
                throw th;
            }
        }
    }

    static {
        s sVar = new s(true);
        f156850w = sVar;
        sVar.n();
    }

    private s(z33.d dVar, z33.e eVar) {
        this.f156869t = (byte) -1;
        this.f156870v = -1;
        n();
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    a aVar = f156851x;
                    c cVarO = null;
                    switch (iO) {
                        case 0:
                            break;
                        case 8:
                            this.f156853c |= 4096;
                            this.f156867q = dVar.l();
                            continue;
                        case 18:
                            if ((i14 & 1) != 1) {
                                this.f156854d = new ArrayList();
                                i14 |= 1;
                            }
                            this.f156854d.add((b) dVar.h(b.f156872i, eVar));
                            continue;
                        case 24:
                            this.f156853c |= 1;
                            this.f156855e = dVar.m() != 0;
                            continue;
                        case 32:
                            this.f156853c |= 2;
                            this.f156856f = dVar.l();
                            continue;
                        case 42:
                            if ((this.f156853c & 4) == 4) {
                                s sVar = this.f156857g;
                                sVar.getClass();
                                cVarO = o(sVar);
                            }
                            s sVar2 = (s) dVar.h(aVar, eVar);
                            this.f156857g = sVar2;
                            if (cVarO != null) {
                                cVarO.j(sVar2);
                                this.f156857g = cVarO.i();
                            }
                            this.f156853c |= 4;
                            continue;
                        case 48:
                            this.f156853c |= 16;
                            this.f156859i = dVar.l();
                            continue;
                        case 56:
                            this.f156853c |= 32;
                            this.f156860j = dVar.l();
                            continue;
                        case 64:
                            this.f156853c |= 8;
                            this.f156858h = dVar.l();
                            continue;
                        case 72:
                            this.f156853c |= 64;
                            this.f156861k = dVar.l();
                            continue;
                        case 82:
                            if ((this.f156853c & 256) == 256) {
                                s sVar3 = this.f156863m;
                                sVar3.getClass();
                                cVarO = o(sVar3);
                            }
                            s sVar4 = (s) dVar.h(aVar, eVar);
                            this.f156863m = sVar4;
                            if (cVarO != null) {
                                cVarO.j(sVar4);
                                this.f156863m = cVarO.i();
                            }
                            this.f156853c |= 256;
                            continue;
                        case 88:
                            this.f156853c |= 512;
                            this.f156864n = dVar.l();
                            continue;
                        case 96:
                            this.f156853c |= 128;
                            this.f156862l = dVar.l();
                            continue;
                        case 106:
                            if ((this.f156853c & 1024) == 1024) {
                                s sVar5 = this.f156865o;
                                sVar5.getClass();
                                cVarO = o(sVar5);
                            }
                            s sVar6 = (s) dVar.h(aVar, eVar);
                            this.f156865o = sVar6;
                            if (cVarO != null) {
                                cVarO.j(sVar6);
                                this.f156865o = cVarO.i();
                            }
                            this.f156853c |= 1024;
                            continue;
                        case 112:
                            this.f156853c |= 2048;
                            this.f156866p = dVar.l();
                            continue;
                        case 802:
                            if ((i14 & 16384) != 16384) {
                                this.f156868r = new ArrayList();
                                i14 |= 16384;
                            }
                            this.f156868r.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            continue;
                        default:
                            if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                                break;
                            }
                            break;
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if ((i14 & 1) == 1) {
                        this.f156854d = Collections.unmodifiableList(this.f156854d);
                    }
                    if ((i14 & 16384) == 16384) {
                        this.f156868r = Collections.unmodifiableList(this.f156868r);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156852b = bVarI.e();
                    }
                    h();
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if ((i14 & 1) == 1) {
            this.f156854d = Collections.unmodifiableList(this.f156854d);
        }
        if ((i14 & 16384) == 16384) {
            this.f156868r = Collections.unmodifiableList(this.f156868r);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156852b = bVarI.e();
        }
        h();
    }

    public static c o(s sVar) {
        c cVarH = c.h();
        cVarH.j(sVar);
        return cVarH;
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156853c & 4096) == 4096) {
            codedOutputStream.m(1, this.f156867q);
        }
        for (int i14 = 0; i14 < this.f156854d.size(); i14++) {
            codedOutputStream.o(2, this.f156854d.get(i14));
        }
        if ((this.f156853c & 1) == 1) {
            boolean z14 = this.f156855e;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z14 ? 1 : 0);
        }
        if ((this.f156853c & 2) == 2) {
            codedOutputStream.m(4, this.f156856f);
        }
        if ((this.f156853c & 4) == 4) {
            codedOutputStream.o(5, this.f156857g);
        }
        if ((this.f156853c & 16) == 16) {
            codedOutputStream.m(6, this.f156859i);
        }
        if ((this.f156853c & 32) == 32) {
            codedOutputStream.m(7, this.f156860j);
        }
        if ((this.f156853c & 8) == 8) {
            codedOutputStream.m(8, this.f156858h);
        }
        if ((this.f156853c & 64) == 64) {
            codedOutputStream.m(9, this.f156861k);
        }
        if ((this.f156853c & 256) == 256) {
            codedOutputStream.o(10, this.f156863m);
        }
        if ((this.f156853c & 512) == 512) {
            codedOutputStream.m(11, this.f156864n);
        }
        if ((this.f156853c & 128) == 128) {
            codedOutputStream.m(12, this.f156862l);
        }
        if ((this.f156853c & 1024) == 1024) {
            codedOutputStream.o(13, this.f156865o);
        }
        if ((this.f156853c & 2048) == 2048) {
            codedOutputStream.m(14, this.f156866p);
        }
        for (int i15 = 0; i15 < this.f156868r.size(); i15++) {
            codedOutputStream.o(100, this.f156868r.get(i15));
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156852b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156850w;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156870v;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156853c & 4096) == 4096 ? CodedOutputStream.b(1, this.f156867q) : 0;
        for (int i15 = 0; i15 < this.f156854d.size(); i15++) {
            iB += CodedOutputStream.d(2, this.f156854d.get(i15));
        }
        if ((this.f156853c & 1) == 1) {
            iB += CodedOutputStream.h(3) + 1;
        }
        if ((this.f156853c & 2) == 2) {
            iB += CodedOutputStream.b(4, this.f156856f);
        }
        if ((this.f156853c & 4) == 4) {
            iB += CodedOutputStream.d(5, this.f156857g);
        }
        if ((this.f156853c & 16) == 16) {
            iB += CodedOutputStream.b(6, this.f156859i);
        }
        if ((this.f156853c & 32) == 32) {
            iB += CodedOutputStream.b(7, this.f156860j);
        }
        if ((this.f156853c & 8) == 8) {
            iB += CodedOutputStream.b(8, this.f156858h);
        }
        if ((this.f156853c & 64) == 64) {
            iB += CodedOutputStream.b(9, this.f156861k);
        }
        if ((this.f156853c & 256) == 256) {
            iB += CodedOutputStream.d(10, this.f156863m);
        }
        if ((this.f156853c & 512) == 512) {
            iB += CodedOutputStream.b(11, this.f156864n);
        }
        if ((this.f156853c & 128) == 128) {
            iB += CodedOutputStream.b(12, this.f156862l);
        }
        if ((this.f156853c & 1024) == 1024) {
            iB += CodedOutputStream.d(13, this.f156865o);
        }
        if ((this.f156853c & 2048) == 2048) {
            iB += CodedOutputStream.b(14, this.f156866p);
        }
        for (int i16 = 0; i16 < this.f156868r.size(); i16++) {
            iB += CodedOutputStream.d(100, this.f156868r.get(i16));
        }
        int size = this.f156852b.size() + e() + iB;
        this.f156870v = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156869t;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156854d.size(); i14++) {
            if (!this.f156854d.get(i14).isInitialized()) {
                this.f156869t = (byte) 0;
                return false;
            }
        }
        if ((this.f156853c & 4) == 4 && !this.f156857g.isInitialized()) {
            this.f156869t = (byte) 0;
            return false;
        }
        if ((this.f156853c & 256) == 256 && !this.f156863m.isInitialized()) {
            this.f156869t = (byte) 0;
            return false;
        }
        if ((this.f156853c & 1024) == 1024 && !this.f156865o.isInitialized()) {
            this.f156869t = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156868r.size(); i15++) {
            if (!this.f156868r.get(i15).isInitialized()) {
                this.f156869t = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156869t = (byte) 1;
            return true;
        }
        this.f156869t = (byte) 0;
        return false;
    }

    public final boolean m() {
        return (this.f156853c & 16) == 16;
    }

    public final void n() {
        List list = Collections.EMPTY_LIST;
        this.f156854d = list;
        this.f156855e = false;
        this.f156856f = 0;
        s sVar = f156850w;
        this.f156857g = sVar;
        this.f156858h = 0;
        this.f156859i = 0;
        this.f156860j = 0;
        this.f156861k = 0;
        this.f156862l = 0;
        this.f156863m = sVar;
        this.f156864n = 0;
        this.f156865o = sVar;
        this.f156866p = 0;
        this.f156867q = 0;
        this.f156868r = list;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return c.h();
    }

    @Override // z33.n
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final c toBuilder() {
        return o(this);
    }

    public static final class b extends z33.g implements z33.o {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f156871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f156872i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f156873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f156875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s f156876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f156878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156879g;

        public static class a extends z33.b<b> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new b(dVar, eVar);
            }
        }

        /* JADX INFO: renamed from: s33.s$b$b, reason: collision with other inner class name */
        public static final class C2959b extends z33.g.b<b, C2959b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f156880b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public c f156881c = c.INV;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public s f156882d = s.f156850w;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f156883e;

            private C2959b() {
            }

            public static C2959b f() {
                return new C2959b();
            }

            @Override // z33.g.b, z33.a.AbstractC3766a
            public final z33.a.AbstractC3766a b() {
                C2959b c2959b = new C2959b();
                c2959b.h(g());
                return c2959b;
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
                C2959b c2959b = new C2959b();
                c2959b.h(g());
                return c2959b;
            }

            @Override // z33.g.b
            /* JADX INFO: renamed from: d */
            public final z33.g.b b() {
                C2959b c2959b = new C2959b();
                c2959b.h(g());
                return c2959b;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
                h((b) gVar);
                return this;
            }

            public final b g() {
                b bVar = new b(this);
                int i14 = this.f156880b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                bVar.f156875c = this.f156881c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                bVar.f156876d = this.f156882d;
                if ((i14 & 4) == 4) {
                    i15 |= 4;
                }
                bVar.f156877e = this.f156883e;
                bVar.f156874b = i15;
                return bVar;
            }

            public final void h(b bVar) {
                s sVar;
                if (bVar == b.f156871h) {
                    return;
                }
                if ((bVar.f156874b & 1) == 1) {
                    c cVar = bVar.f156875c;
                    cVar.getClass();
                    this.f156880b = 1 | this.f156880b;
                    this.f156881c = cVar;
                }
                if ((bVar.f156874b & 2) == 2) {
                    s sVar2 = bVar.f156876d;
                    if ((this.f156880b & 2) != 2 || (sVar = this.f156882d) == s.f156850w) {
                        this.f156882d = sVar2;
                    } else {
                        c cVarO = s.o(sVar);
                        cVarO.j(sVar2);
                        this.f156882d = cVarO.i();
                    }
                    this.f156880b |= 2;
                }
                if ((bVar.f156874b & 4) == 4) {
                    int i14 = bVar.f156877e;
                    this.f156880b = 4 | this.f156880b;
                    this.f156883e = i14;
                }
                this.f202188a = this.f202188a.b(bVar.f156873a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        h((b) b.f156872i.a(dVar, eVar));
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

        public enum c implements z33.h.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f156889a;

            public static class a implements z33.h.b<c> {
                @Override // z33.h.b
                public final z33.h.a findValueByNumber(int i14) {
                    if (i14 == 0) {
                        return c.IN;
                    }
                    if (i14 == 1) {
                        return c.OUT;
                    }
                    if (i14 == 2) {
                        return c.INV;
                    }
                    if (i14 == 3) {
                        return c.STAR;
                    }
                    c cVar = c.IN;
                    return null;
                }
            }

            static {
                new a();
            }

            c(int i14, int i15) {
                this.f156889a = i15;
            }

            @Override // z33.h.a
            public final int getNumber() {
                return this.f156889a;
            }
        }

        static {
            b bVar = new b(true);
            f156871h = bVar;
            bVar.f156875c = c.INV;
            bVar.f156876d = s.f156850w;
            bVar.f156877e = 0;
        }

        private b(z33.d dVar, z33.e eVar) {
            this.f156878f = (byte) -1;
            this.f156879g = -1;
            this.f156875c = c.INV;
            this.f156876d = s.f156850w;
            boolean z14 = false;
            this.f156877e = 0;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            while (!z14) {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            c cVarO = null;
                            c cVar = null;
                            if (iO == 8) {
                                int iL = dVar.l();
                                if (iL == 0) {
                                    cVar = c.IN;
                                } else if (iL == 1) {
                                    cVar = c.OUT;
                                } else if (iL == 2) {
                                    cVar = c.INV;
                                } else if (iL == 3) {
                                    cVar = c.STAR;
                                }
                                if (cVar == null) {
                                    codedOutputStreamJ.v(iO);
                                    codedOutputStreamJ.v(iL);
                                } else {
                                    this.f156874b |= 1;
                                    this.f156875c = cVar;
                                }
                            } else if (iO == 18) {
                                if ((this.f156874b & 2) == 2) {
                                    s sVar = this.f156876d;
                                    sVar.getClass();
                                    cVarO = s.o(sVar);
                                }
                                s sVar2 = (s) dVar.h(s.f156851x, eVar);
                                this.f156876d = sVar2;
                                if (cVarO != null) {
                                    cVarO.j(sVar2);
                                    this.f156876d = cVarO.i();
                                }
                                this.f156874b |= 2;
                            } else if (iO == 24) {
                                this.f156874b |= 4;
                                this.f156877e = dVar.l();
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        }
                        z14 = true;
                    } catch (Throwable th3) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } finally {
                            this.f156873a = bVarI.e();
                        }
                        throw th3;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(this);
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f156873a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f156874b & 1) == 1) {
                codedOutputStream.l(1, this.f156875c.f156889a);
            }
            if ((this.f156874b & 2) == 2) {
                codedOutputStream.o(2, this.f156876d);
            }
            if ((this.f156874b & 4) == 4) {
                codedOutputStream.m(3, this.f156877e);
            }
            codedOutputStream.r(this.f156873a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f156879g;
            if (i14 != -1) {
                return i14;
            }
            int iA = (this.f156874b & 1) == 1 ? CodedOutputStream.a(1, this.f156875c.f156889a) : 0;
            if ((this.f156874b & 2) == 2) {
                iA += CodedOutputStream.d(2, this.f156876d);
            }
            if ((this.f156874b & 4) == 4) {
                iA += CodedOutputStream.b(3, this.f156877e);
            }
            int size = this.f156873a.size() + iA;
            this.f156879g = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f156878f;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if ((this.f156874b & 2) != 2 || this.f156876d.isInitialized()) {
                this.f156878f = (byte) 1;
                return true;
            }
            this.f156878f = (byte) 0;
            return false;
        }

        @Override // z33.n
        public final z33.n.a newBuilderForType() {
            return C2959b.f();
        }

        @Override // z33.n
        public final z33.n.a toBuilder() {
            C2959b c2959bF = C2959b.f();
            c2959bF.h(this);
            return c2959bF;
        }

        private b(z33.g.b bVar) {
            super(bVar);
            this.f156878f = (byte) -1;
            this.f156879g = -1;
            this.f156873a = bVar.f202188a;
        }

        private b(boolean z14) {
            this.f156878f = (byte) -1;
            this.f156879g = -1;
            this.f156873a = z33.c.f202161a;
        }
    }

    private s(z33.g.c<s, ?> cVar) {
        super(cVar);
        this.f156869t = (byte) -1;
        this.f156870v = -1;
        this.f156852b = cVar.f202188a;
    }

    private s(boolean z14) {
        this.f156869t = (byte) -1;
        this.f156870v = -1;
        this.f156852b = z33.c.f202161a;
    }
}
