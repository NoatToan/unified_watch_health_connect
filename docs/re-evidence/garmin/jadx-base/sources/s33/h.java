package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends z33.g.d<h> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f156644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f156645i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<s33.b> f156649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f156650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156651g;

    public static class a extends z33.b<h> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new h(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<h, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<s33.b> f156654f = Collections.EMPTY_LIST;

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
            h hVarI = i();
            if (hVarI.isInitialized()) {
                return hVarI;
            }
            throw new UninitializedMessageException(hVarI);
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
            j((h) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final h i() {
            h hVar = new h(this);
            int i14 = this.f156652d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            hVar.f156648d = this.f156653e;
            if ((i14 & 2) == 2) {
                this.f156654f = Collections.unmodifiableList(this.f156654f);
                this.f156652d &= -3;
            }
            hVar.f156649e = this.f156654f;
            hVar.f156647c = i15;
            return hVar;
        }

        public final void j(h hVar) {
            if (hVar == h.f156644h) {
                return;
            }
            if ((hVar.f156647c & 1) == 1) {
                int i14 = hVar.f156648d;
                this.f156652d = 1 | this.f156652d;
                this.f156653e = i14;
            }
            if (!hVar.f156649e.isEmpty()) {
                if (this.f156654f.isEmpty()) {
                    this.f156654f = hVar.f156649e;
                    this.f156652d &= -3;
                } else {
                    if ((this.f156652d & 2) != 2) {
                        this.f156654f = new ArrayList(this.f156654f);
                        this.f156652d |= 2;
                    }
                    this.f156654f.addAll(hVar.f156649e);
                }
            }
            g(hVar);
            this.f202188a = this.f202188a.b(hVar.f156646b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            h hVar = null;
            try {
                try {
                    j((h) h.f156645i.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    h hVar2 = (h) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        hVar = hVar2;
                        if (hVar != null) {
                            j(hVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (hVar != null) {
                    j(hVar);
                }
                throw th;
            }
        }
    }

    static {
        h hVar = new h(true);
        f156644h = hVar;
        hVar.f156648d = 0;
        hVar.f156649e = Collections.EMPTY_LIST;
    }

    private h(z33.d dVar, z33.e eVar) {
        this.f156650f = (byte) -1;
        this.f156651g = -1;
        boolean z14 = false;
        this.f156648d = 0;
        this.f156649e = Collections.EMPTY_LIST;
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
                                this.f156647c |= 1;
                                this.f156648d = dVar.l();
                            } else if (iO == 18) {
                                if ((c14 & 2) != 2) {
                                    this.f156649e = new ArrayList();
                                    c14 = 2;
                                }
                                this.f156649e.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
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
                    this.f156649e = Collections.unmodifiableList(this.f156649e);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156646b = bVarI.e();
                }
                h();
                throw th3;
            }
        }
        if ((c14 & 2) == 2) {
            this.f156649e = Collections.unmodifiableList(this.f156649e);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156646b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156647c & 1) == 1) {
            codedOutputStream.m(1, this.f156648d);
        }
        for (int i14 = 0; i14 < this.f156649e.size(); i14++) {
            codedOutputStream.o(2, this.f156649e.get(i14));
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156646b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156644h;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156651g;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156647c & 1) == 1 ? CodedOutputStream.b(1, this.f156648d) : 0;
        for (int i15 = 0; i15 < this.f156649e.size(); i15++) {
            iB += CodedOutputStream.d(2, this.f156649e.get(i15));
        }
        int size = this.f156646b.size() + e() + iB;
        this.f156651g = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156650f;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156649e.size(); i14++) {
            if (!this.f156649e.get(i14).isInitialized()) {
                this.f156650f = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156650f = (byte) 1;
            return true;
        }
        this.f156650f = (byte) 0;
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

    private h(z33.g.c<h, ?> cVar) {
        super(cVar);
        this.f156650f = (byte) -1;
        this.f156651g = -1;
        this.f156646b = cVar.f202188a;
    }

    private h(boolean z14) {
        this.f156650f = (byte) -1;
        this.f156651g = -1;
        this.f156646b = z33.c.f202161a;
    }
}
