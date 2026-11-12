package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends z33.g.d<m> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f156735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f156736l = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<j> f156739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<o> f156740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<t> f156741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f156742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f156743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f156744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156745j;

    public static class a extends z33.b<m> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new m(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<m, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<j> f156747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<o> f156748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<t> f156749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public v f156750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public y f156751i;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f156747e = list;
            this.f156748f = list;
            this.f156749g = list;
            this.f156750h = v.f156960g;
            this.f156751i = y.f157023e;
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
            m mVarI = i();
            if (mVarI.isInitialized()) {
                return mVarI;
            }
            throw new UninitializedMessageException(mVarI);
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
            j((m) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final m i() {
            m mVar = new m(this);
            int i14 = this.f156746d;
            if ((i14 & 1) == 1) {
                this.f156747e = Collections.unmodifiableList(this.f156747e);
                this.f156746d &= -2;
            }
            mVar.f156739d = this.f156747e;
            if ((this.f156746d & 2) == 2) {
                this.f156748f = Collections.unmodifiableList(this.f156748f);
                this.f156746d &= -3;
            }
            mVar.f156740e = this.f156748f;
            if ((this.f156746d & 4) == 4) {
                this.f156749g = Collections.unmodifiableList(this.f156749g);
                this.f156746d &= -5;
            }
            mVar.f156741f = this.f156749g;
            int i15 = (i14 & 8) != 8 ? 0 : 1;
            mVar.f156742g = this.f156750h;
            if ((i14 & 16) == 16) {
                i15 |= 2;
            }
            mVar.f156743h = this.f156751i;
            mVar.f156738c = i15;
            return mVar;
        }

        public final void j(m mVar) {
            y yVar;
            v vVar;
            if (mVar == m.f156735k) {
                return;
            }
            if (!mVar.f156739d.isEmpty()) {
                if (this.f156747e.isEmpty()) {
                    this.f156747e = mVar.f156739d;
                    this.f156746d &= -2;
                } else {
                    if ((this.f156746d & 1) != 1) {
                        this.f156747e = new ArrayList(this.f156747e);
                        this.f156746d |= 1;
                    }
                    this.f156747e.addAll(mVar.f156739d);
                }
            }
            if (!mVar.f156740e.isEmpty()) {
                if (this.f156748f.isEmpty()) {
                    this.f156748f = mVar.f156740e;
                    this.f156746d &= -3;
                } else {
                    if ((this.f156746d & 2) != 2) {
                        this.f156748f = new ArrayList(this.f156748f);
                        this.f156746d |= 2;
                    }
                    this.f156748f.addAll(mVar.f156740e);
                }
            }
            if (!mVar.f156741f.isEmpty()) {
                if (this.f156749g.isEmpty()) {
                    this.f156749g = mVar.f156741f;
                    this.f156746d &= -5;
                } else {
                    if ((this.f156746d & 4) != 4) {
                        this.f156749g = new ArrayList(this.f156749g);
                        this.f156746d |= 4;
                    }
                    this.f156749g.addAll(mVar.f156741f);
                }
            }
            if ((mVar.f156738c & 1) == 1) {
                v vVar2 = mVar.f156742g;
                if ((this.f156746d & 8) != 8 || (vVar = this.f156750h) == v.f156960g) {
                    this.f156750h = vVar2;
                } else {
                    v.b bVarD = v.d(vVar);
                    bVarD.h(vVar2);
                    this.f156750h = bVarD.g();
                }
                this.f156746d |= 8;
            }
            if ((mVar.f156738c & 2) == 2) {
                y yVar2 = mVar.f156743h;
                if ((this.f156746d & 16) != 16 || (yVar = this.f156751i) == y.f157023e) {
                    this.f156751i = yVar2;
                } else {
                    y.b bVarF = y.b.f();
                    bVarF.h(yVar);
                    bVarF.h(yVar2);
                    this.f156751i = bVarF.g();
                }
                this.f156746d |= 16;
            }
            g(mVar);
            this.f202188a = this.f202188a.b(mVar.f156737b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            m mVar = null;
            try {
                try {
                    j((m) m.f156736l.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    m mVar2 = (m) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        mVar = mVar2;
                        if (mVar != null) {
                            j(mVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (mVar != null) {
                    j(mVar);
                }
                throw th;
            }
        }
    }

    static {
        m mVar = new m(true);
        f156735k = mVar;
        List list = Collections.EMPTY_LIST;
        mVar.f156739d = list;
        mVar.f156740e = list;
        mVar.f156741f = list;
        mVar.f156742g = v.f156960g;
        mVar.f156743h = y.f157023e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private m(z33.d dVar, z33.e eVar) {
        this.f156744i = (byte) -1;
        this.f156745j = -1;
        List list = Collections.EMPTY_LIST;
        this.f156739d = list;
        this.f156740e = list;
        this.f156741f = list;
        this.f156742g = v.f156960g;
        this.f156743h = y.f157023e;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 26) {
                            int i15 = (i14 == true ? 1 : 0) & 1;
                            i14 = i14;
                            if (i15 != 1) {
                                this.f156739d = new ArrayList();
                                i14 = (i14 == true ? 1 : 0) | 1;
                            }
                            this.f156739d.add((j) dVar.h(j.B, eVar));
                        } else if (iO == 34) {
                            int i16 = (i14 == true ? 1 : 0) & 2;
                            i14 = i14;
                            if (i16 != 2) {
                                this.f156740e = new ArrayList();
                                i14 = (i14 == true ? 1 : 0) | 2;
                            }
                            this.f156740e.add((o) dVar.h(o.P, eVar));
                        } else if (iO != 42) {
                            y.b bVarF = null;
                            v.b bVarD = null;
                            if (iO == 242) {
                                if ((this.f156738c & 1) == 1) {
                                    v vVar = this.f156742g;
                                    vVar.getClass();
                                    bVarD = v.d(vVar);
                                }
                                v vVar2 = (v) dVar.h(v.f156961h, eVar);
                                this.f156742g = vVar2;
                                if (bVarD != null) {
                                    bVarD.h(vVar2);
                                    this.f156742g = bVarD.g();
                                }
                                this.f156738c |= 1;
                            } else if (iO == 258) {
                                if ((this.f156738c & 2) == 2) {
                                    y yVar = this.f156743h;
                                    yVar.getClass();
                                    bVarF = y.b.f();
                                    bVarF.h(yVar);
                                }
                                y yVar2 = (y) dVar.h(y.f157024f, eVar);
                                this.f156743h = yVar2;
                                if (bVarF != null) {
                                    bVarF.h(yVar2);
                                    this.f156743h = bVarF.g();
                                }
                                this.f156738c |= 2;
                            } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                            }
                        } else {
                            int i17 = (i14 == true ? 1 : 0) & 4;
                            i14 = i14;
                            if (i17 != 4) {
                                this.f156741f = new ArrayList();
                                i14 = (i14 == true ? 1 : 0) | 4;
                            }
                            this.f156741f.add((t) dVar.h(t.f156907q, eVar));
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (((i14 == true ? 1 : 0) & 1) == 1) {
                        this.f156739d = Collections.unmodifiableList(this.f156739d);
                    }
                    if (((i14 == true ? 1 : 0) & 2) == 2) {
                        this.f156740e = Collections.unmodifiableList(this.f156740e);
                    }
                    if (((i14 == true ? 1 : 0) & 4) == 4) {
                        this.f156741f = Collections.unmodifiableList(this.f156741f);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156737b = bVarI.e();
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
        if (((i14 == true ? 1 : 0) & 1) == 1) {
            this.f156739d = Collections.unmodifiableList(this.f156739d);
        }
        if (((i14 == true ? 1 : 0) & 2) == 2) {
            this.f156740e = Collections.unmodifiableList(this.f156740e);
        }
        if (((i14 == true ? 1 : 0) & 4) == 4) {
            this.f156741f = Collections.unmodifiableList(this.f156741f);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156737b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        for (int i14 = 0; i14 < this.f156739d.size(); i14++) {
            codedOutputStream.o(3, this.f156739d.get(i14));
        }
        for (int i15 = 0; i15 < this.f156740e.size(); i15++) {
            codedOutputStream.o(4, this.f156740e.get(i15));
        }
        for (int i16 = 0; i16 < this.f156741f.size(); i16++) {
            codedOutputStream.o(5, this.f156741f.get(i16));
        }
        if ((this.f156738c & 1) == 1) {
            codedOutputStream.o(30, this.f156742g);
        }
        if ((this.f156738c & 2) == 2) {
            codedOutputStream.o(32, this.f156743h);
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156737b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156735k;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156745j;
        if (i14 != -1) {
            return i14;
        }
        int iD = 0;
        for (int i15 = 0; i15 < this.f156739d.size(); i15++) {
            iD += CodedOutputStream.d(3, this.f156739d.get(i15));
        }
        for (int i16 = 0; i16 < this.f156740e.size(); i16++) {
            iD += CodedOutputStream.d(4, this.f156740e.get(i16));
        }
        for (int i17 = 0; i17 < this.f156741f.size(); i17++) {
            iD += CodedOutputStream.d(5, this.f156741f.get(i17));
        }
        if ((this.f156738c & 1) == 1) {
            iD += CodedOutputStream.d(30, this.f156742g);
        }
        if ((this.f156738c & 2) == 2) {
            iD += CodedOutputStream.d(32, this.f156743h);
        }
        int size = this.f156737b.size() + e() + iD;
        this.f156745j = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156744i;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156739d.size(); i14++) {
            if (!this.f156739d.get(i14).isInitialized()) {
                this.f156744i = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f156740e.size(); i15++) {
            if (!this.f156740e.get(i15).isInitialized()) {
                this.f156744i = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f156741f.size(); i16++) {
            if (!this.f156741f.get(i16).isInitialized()) {
                this.f156744i = (byte) 0;
                return false;
            }
        }
        if ((this.f156738c & 1) == 1 && !this.f156742g.isInitialized()) {
            this.f156744i = (byte) 0;
            return false;
        }
        if (d()) {
            this.f156744i = (byte) 1;
            return true;
        }
        this.f156744i = (byte) 0;
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

    private m(z33.g.c<m, ?> cVar) {
        super(cVar);
        this.f156744i = (byte) -1;
        this.f156745j = -1;
        this.f156737b = cVar.f202188a;
    }

    private m(boolean z14) {
        this.f156744i = (byte) -1;
        this.f156745j = -1;
        this.f156737b = z33.c.f202161a;
    }
}
