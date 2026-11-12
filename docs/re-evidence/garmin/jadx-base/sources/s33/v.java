package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends z33.g implements z33.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f156960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f156961h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<s> f156964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f156966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156967f;

    public static class a extends z33.b<v> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new v(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<v, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<s> f156969c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156970d = -1;

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
            v vVarG = g();
            if (vVarG.isInitialized()) {
                return vVarG;
            }
            throw new UninitializedMessageException(vVarG);
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
            h((v) gVar);
            return this;
        }

        public final v g() {
            v vVar = new v(this);
            int i14 = this.f156968b;
            if ((i14 & 1) == 1) {
                this.f156969c = Collections.unmodifiableList(this.f156969c);
                this.f156968b &= -2;
            }
            vVar.f156964c = this.f156969c;
            int i15 = (i14 & 2) != 2 ? 0 : 1;
            vVar.f156965d = this.f156970d;
            vVar.f156963b = i15;
            return vVar;
        }

        public final void h(v vVar) {
            if (vVar == v.f156960g) {
                return;
            }
            if (!vVar.f156964c.isEmpty()) {
                if (this.f156969c.isEmpty()) {
                    this.f156969c = vVar.f156964c;
                    this.f156968b &= -2;
                } else {
                    if ((this.f156968b & 1) != 1) {
                        this.f156969c = new ArrayList(this.f156969c);
                        this.f156968b |= 1;
                    }
                    this.f156969c.addAll(vVar.f156964c);
                }
            }
            if ((vVar.f156963b & 1) == 1) {
                int i14 = vVar.f156965d;
                this.f156968b |= 2;
                this.f156970d = i14;
            }
            this.f202188a = this.f202188a.b(vVar.f156962a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            v vVar = null;
            try {
                try {
                    h((v) v.f156961h.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    v vVar2 = (v) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        vVar = vVar2;
                        if (vVar != null) {
                            h(vVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (vVar != null) {
                    h(vVar);
                }
                throw th;
            }
        }
    }

    static {
        v vVar = new v(true);
        f156960g = vVar;
        vVar.f156964c = Collections.EMPTY_LIST;
        vVar.f156965d = -1;
    }

    private v(z33.d dVar, z33.e eVar) {
        this.f156966e = (byte) -1;
        this.f156967f = -1;
        this.f156964c = Collections.EMPTY_LIST;
        this.f156965d = -1;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        boolean z15 = false;
        while (!z14) {
            try {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 10) {
                                if (!z15) {
                                    this.f156964c = new ArrayList();
                                    z15 = true;
                                }
                                this.f156964c.add((s) dVar.h(s.f156851x, eVar));
                            } else if (iO == 16) {
                                this.f156963b |= 1;
                                this.f156965d = dVar.l();
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
                if (z15) {
                    this.f156964c = Collections.unmodifiableList(this.f156964c);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156962a = bVarI.e();
                }
                throw th3;
            }
        }
        if (z15) {
            this.f156964c = Collections.unmodifiableList(this.f156964c);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156962a = bVarI.e();
        }
    }

    public static b d(v vVar) {
        b bVarF = b.f();
        bVarF.h(vVar);
        return bVarF;
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i14 = 0; i14 < this.f156964c.size(); i14++) {
            codedOutputStream.o(1, this.f156964c.get(i14));
        }
        if ((this.f156963b & 1) == 1) {
            codedOutputStream.m(2, this.f156965d);
        }
        codedOutputStream.r(this.f156962a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156967f;
        if (i14 != -1) {
            return i14;
        }
        int iB = 0;
        for (int i15 = 0; i15 < this.f156964c.size(); i15++) {
            iB += CodedOutputStream.d(1, this.f156964c.get(i15));
        }
        if ((this.f156963b & 1) == 1) {
            iB += CodedOutputStream.b(2, this.f156965d);
        }
        int size = this.f156962a.size() + iB;
        this.f156967f = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156966e;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156964c.size(); i14++) {
            if (!this.f156964c.get(i14).isInitialized()) {
                this.f156966e = (byte) 0;
                return false;
            }
        }
        this.f156966e = (byte) 1;
        return true;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return b.f();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        return d(this);
    }

    private v(z33.g.b bVar) {
        super(bVar);
        this.f156966e = (byte) -1;
        this.f156967f = -1;
        this.f156962a = bVar.f202188a;
    }

    private v(boolean z14) {
        this.f156966e = (byte) -1;
        this.f156967f = -1;
        this.f156962a = z33.c.f202161a;
    }
}
