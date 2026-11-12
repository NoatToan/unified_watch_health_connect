package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends z33.g.d<u> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f156933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f156934o = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f156939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f156940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<s> f156941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f156942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<s33.b> f156944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f156945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f156946m;

    public static class a extends z33.b<u> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new u(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<u, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f156950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f156951h = c.INV;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<s> f156952i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<Integer> f156953j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<s33.b> f156954k;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f156952i = list;
            this.f156953j = list;
            this.f156954k = list;
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
            u uVarI = i();
            if (uVarI.isInitialized()) {
                return uVarI;
            }
            throw new UninitializedMessageException(uVarI);
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
            j((u) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final u i() {
            u uVar = new u(this);
            int i14 = this.f156947d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            uVar.f156937d = this.f156948e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            uVar.f156938e = this.f156949f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            uVar.f156939f = this.f156950g;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            uVar.f156940g = this.f156951h;
            if ((i14 & 16) == 16) {
                this.f156952i = Collections.unmodifiableList(this.f156952i);
                this.f156947d &= -17;
            }
            uVar.f156941h = this.f156952i;
            if ((this.f156947d & 32) == 32) {
                this.f156953j = Collections.unmodifiableList(this.f156953j);
                this.f156947d &= -33;
            }
            uVar.f156942i = this.f156953j;
            if ((this.f156947d & 64) == 64) {
                this.f156954k = Collections.unmodifiableList(this.f156954k);
                this.f156947d &= -65;
            }
            uVar.f156944k = this.f156954k;
            uVar.f156936c = i15;
            return uVar;
        }

        public final void j(u uVar) {
            if (uVar == u.f156933n) {
                return;
            }
            int i14 = uVar.f156936c;
            if ((i14 & 1) == 1) {
                int i15 = uVar.f156937d;
                this.f156947d = 1 | this.f156947d;
                this.f156948e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = uVar.f156938e;
                this.f156947d = 2 | this.f156947d;
                this.f156949f = i16;
            }
            if ((i14 & 4) == 4) {
                boolean z14 = uVar.f156939f;
                this.f156947d = 4 | this.f156947d;
                this.f156950g = z14;
            }
            if ((i14 & 8) == 8) {
                c cVar = uVar.f156940g;
                cVar.getClass();
                this.f156947d = 8 | this.f156947d;
                this.f156951h = cVar;
            }
            if (!uVar.f156941h.isEmpty()) {
                if (this.f156952i.isEmpty()) {
                    this.f156952i = uVar.f156941h;
                    this.f156947d &= -17;
                } else {
                    if ((this.f156947d & 16) != 16) {
                        this.f156952i = new ArrayList(this.f156952i);
                        this.f156947d |= 16;
                    }
                    this.f156952i.addAll(uVar.f156941h);
                }
            }
            if (!uVar.f156942i.isEmpty()) {
                if (this.f156953j.isEmpty()) {
                    this.f156953j = uVar.f156942i;
                    this.f156947d &= -33;
                } else {
                    if ((this.f156947d & 32) != 32) {
                        this.f156953j = new ArrayList(this.f156953j);
                        this.f156947d |= 32;
                    }
                    this.f156953j.addAll(uVar.f156942i);
                }
            }
            if (!uVar.f156944k.isEmpty()) {
                if (this.f156954k.isEmpty()) {
                    this.f156954k = uVar.f156944k;
                    this.f156947d &= -65;
                } else {
                    if ((this.f156947d & 64) != 64) {
                        this.f156954k = new ArrayList(this.f156954k);
                        this.f156947d |= 64;
                    }
                    this.f156954k.addAll(uVar.f156944k);
                }
            }
            g(uVar);
            this.f202188a = this.f202188a.b(uVar.f156935b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            u uVar = null;
            try {
                try {
                    j((u) u.f156934o.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    u uVar2 = (u) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        uVar = uVar2;
                        if (uVar != null) {
                            j(uVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (uVar != null) {
                    j(uVar);
                }
                throw th;
            }
        }
    }

    public enum c implements z33.h.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156959a;

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
                c cVar = c.IN;
                return null;
            }
        }

        static {
            new a();
        }

        c(int i14, int i15) {
            this.f156959a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156959a;
        }
    }

    static {
        u uVar = new u(true);
        f156933n = uVar;
        uVar.f156937d = 0;
        uVar.f156938e = 0;
        uVar.f156939f = false;
        uVar.f156940g = c.INV;
        List list = Collections.EMPTY_LIST;
        uVar.f156941h = list;
        uVar.f156942i = list;
        uVar.f156944k = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private u(z33.d dVar, z33.e eVar) {
        this.f156943j = -1;
        this.f156945l = (byte) -1;
        this.f156946m = -1;
        this.f156937d = 0;
        this.f156938e = 0;
        this.f156939f = false;
        this.f156940g = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f156941h = list;
        this.f156942i = list;
        this.f156944k = list;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.f156936c |= 1;
                            this.f156937d = dVar.l();
                        } else if (iO == 16) {
                            this.f156936c |= 2;
                            this.f156938e = dVar.l();
                        } else if (iO == 24) {
                            this.f156936c |= 4;
                            this.f156939f = dVar.m() != 0;
                        } else if (iO == 32) {
                            int iL = dVar.l();
                            c cVar = iL != 0 ? iL != 1 ? iL != 2 ? null : c.INV : c.OUT : c.IN;
                            if (cVar == null) {
                                codedOutputStreamJ.v(iO);
                                codedOutputStreamJ.v(iL);
                            } else {
                                this.f156936c |= 8;
                                this.f156940g = cVar;
                            }
                        } else if (iO == 42) {
                            if ((i14 & 16) != 16) {
                                this.f156941h = new ArrayList();
                                i14 |= 16;
                            }
                            this.f156941h.add((s) dVar.h(s.f156851x, eVar));
                        } else if (iO == 48) {
                            if ((i14 & 32) != 32) {
                                this.f156942i = new ArrayList();
                                i14 |= 32;
                            }
                            this.f156942i.add(Integer.valueOf(dVar.l()));
                        } else if (iO == 50) {
                            int iE = dVar.e(dVar.l());
                            if ((i14 & 32) != 32 && dVar.b() > 0) {
                                this.f156942i = new ArrayList();
                                i14 |= 32;
                            }
                            while (dVar.b() > 0) {
                                this.f156942i.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.d(iE);
                        } else if (iO == 802) {
                            if ((i14 & 64) != 64) {
                                this.f156944k = new ArrayList();
                                i14 |= 64;
                            }
                            this.f156944k.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                        } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if ((i14 & 16) == 16) {
                        this.f156941h = Collections.unmodifiableList(this.f156941h);
                    }
                    if ((i14 & 32) == 32) {
                        this.f156942i = Collections.unmodifiableList(this.f156942i);
                    }
                    if ((i14 & 64) == 64) {
                        this.f156944k = Collections.unmodifiableList(this.f156944k);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156935b = bVarI.e();
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
        if ((i14 & 16) == 16) {
            this.f156941h = Collections.unmodifiableList(this.f156941h);
        }
        if ((i14 & 32) == 32) {
            this.f156942i = Collections.unmodifiableList(this.f156942i);
        }
        if ((i14 & 64) == 64) {
            this.f156944k = Collections.unmodifiableList(this.f156944k);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156935b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156936c & 1) == 1) {
            codedOutputStream.m(1, this.f156937d);
        }
        if ((this.f156936c & 2) == 2) {
            codedOutputStream.m(2, this.f156938e);
        }
        if ((this.f156936c & 4) == 4) {
            boolean z14 = this.f156939f;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z14 ? 1 : 0);
        }
        if ((this.f156936c & 8) == 8) {
            codedOutputStream.l(4, this.f156940g.f156959a);
        }
        for (int i14 = 0; i14 < this.f156941h.size(); i14++) {
            codedOutputStream.o(5, this.f156941h.get(i14));
        }
        if (this.f156942i.size() > 0) {
            codedOutputStream.v(50);
            codedOutputStream.v(this.f156943j);
        }
        for (int i15 = 0; i15 < this.f156942i.size(); i15++) {
            codedOutputStream.n(this.f156942i.get(i15).intValue());
        }
        for (int i16 = 0; i16 < this.f156944k.size(); i16++) {
            codedOutputStream.o(100, this.f156944k.get(i16));
        }
        aVarI.a(1000, codedOutputStream);
        codedOutputStream.r(this.f156935b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156933n;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        int i14 = this.f156946m;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156936c & 1) == 1 ? CodedOutputStream.b(1, this.f156937d) : 0;
        if ((this.f156936c & 2) == 2) {
            iB += CodedOutputStream.b(2, this.f156938e);
        }
        if ((this.f156936c & 4) == 4) {
            iB += CodedOutputStream.h(3) + 1;
        }
        if ((this.f156936c & 8) == 8) {
            iB += CodedOutputStream.a(4, this.f156940g.f156959a);
        }
        for (int i15 = 0; i15 < this.f156941h.size(); i15++) {
            iB += CodedOutputStream.d(5, this.f156941h.get(i15));
        }
        int i16 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156942i.size();
            list = this.f156942i;
            if (i16 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i16).intValue());
            i16++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + CodedOutputStream.c(iC);
        }
        this.f156943j = iC;
        for (int i17 = 0; i17 < this.f156944k.size(); i17++) {
            iD += CodedOutputStream.d(100, this.f156944k.get(i17));
        }
        int size2 = this.f156935b.size() + e() + iD;
        this.f156946m = size2;
        return size2;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156945l;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        int i14 = this.f156936c;
        if ((i14 & 1) != 1) {
            this.f156945l = (byte) 0;
            return false;
        }
        if ((i14 & 2) != 2) {
            this.f156945l = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156941h.size(); i15++) {
            if (!this.f156941h.get(i15).isInitialized()) {
                this.f156945l = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f156944k.size(); i16++) {
            if (!this.f156944k.get(i16).isInitialized()) {
                this.f156945l = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156945l = (byte) 1;
            return true;
        }
        this.f156945l = (byte) 0;
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

    private u(z33.g.c<u, ?> cVar) {
        super(cVar);
        this.f156943j = -1;
        this.f156945l = (byte) -1;
        this.f156946m = -1;
        this.f156935b = cVar.f202188a;
    }

    private u(boolean z14) {
        this.f156943j = -1;
        this.f156945l = (byte) -1;
        this.f156946m = -1;
        this.f156935b = z33.c.f202161a;
    }
}
