package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends z33.g implements z33.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f156612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f156613k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f156616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<i> f156617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f156618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f156619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f156620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f156621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156622i;

    public static class a extends z33.b<g> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new g(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<g, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f156624c = d.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<i> f156625d = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f156626e = i.f156655l;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e f156627f = e.AT_MOST_ONCE;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f156628g = c.CONCLUSION_CONDITION;

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
            g gVarG = g();
            if (gVarG.isInitialized()) {
                return gVarG;
            }
            throw new UninitializedMessageException(gVarG);
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
            h((g) gVar);
            return this;
        }

        public final g g() {
            g gVar = new g(this);
            int i14 = this.f156623b;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            gVar.f156616c = this.f156624c;
            if ((i14 & 2) == 2) {
                this.f156625d = Collections.unmodifiableList(this.f156625d);
                this.f156623b &= -3;
            }
            gVar.f156617d = this.f156625d;
            if ((i14 & 4) == 4) {
                i15 |= 2;
            }
            gVar.f156618e = this.f156626e;
            if ((i14 & 8) == 8) {
                i15 |= 4;
            }
            gVar.f156619f = this.f156627f;
            if ((i14 & 16) == 16) {
                i15 |= 8;
            }
            gVar.f156620g = this.f156628g;
            gVar.f156615b = i15;
            return gVar;
        }

        public final void h(g gVar) {
            i iVar;
            if (gVar == g.f156612j) {
                return;
            }
            if ((gVar.f156615b & 1) == 1) {
                d dVar = gVar.f156616c;
                dVar.getClass();
                this.f156623b = 1 | this.f156623b;
                this.f156624c = dVar;
            }
            if (!gVar.f156617d.isEmpty()) {
                if (this.f156625d.isEmpty()) {
                    this.f156625d = gVar.f156617d;
                    this.f156623b &= -3;
                } else {
                    if ((this.f156623b & 2) != 2) {
                        this.f156625d = new ArrayList(this.f156625d);
                        this.f156623b |= 2;
                    }
                    this.f156625d.addAll(gVar.f156617d);
                }
            }
            if ((gVar.f156615b & 2) == 2) {
                i iVar2 = gVar.f156618e;
                if ((this.f156623b & 4) != 4 || (iVar = this.f156626e) == i.f156655l) {
                    this.f156626e = iVar2;
                } else {
                    i.b bVarF = i.b.f();
                    bVarF.h(iVar);
                    bVarF.h(iVar2);
                    this.f156626e = bVarF.g();
                }
                this.f156623b |= 4;
            }
            if ((gVar.f156615b & 4) == 4) {
                e eVar = gVar.f156619f;
                eVar.getClass();
                this.f156623b |= 8;
                this.f156627f = eVar;
            }
            if ((gVar.f156615b & 8) == 8) {
                c cVar = gVar.f156620g;
                cVar.getClass();
                this.f156623b |= 16;
                this.f156628g = cVar;
            }
            this.f202188a = this.f202188a.b(gVar.f156614a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            g gVar = null;
            try {
                try {
                    h((g) g.f156613k.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    g gVar2 = (g) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        gVar = gVar2;
                        if (gVar != null) {
                            h(gVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (gVar != null) {
                    h(gVar);
                }
                throw th;
            }
        }
    }

    public enum c implements z33.h.a {
        CONCLUSION_CONDITION(0, 0),
        RETURNS_CONDITION(1, 1),
        HOLDSIN_CONDITION(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156633a;

        public static class a implements z33.h.b<c> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return c.CONCLUSION_CONDITION;
                }
                if (i14 == 1) {
                    return c.RETURNS_CONDITION;
                }
                if (i14 == 2) {
                    return c.HOLDSIN_CONDITION;
                }
                c cVar = c.CONCLUSION_CONDITION;
                return null;
            }
        }

        static {
            new a();
        }

        c(int i14, int i15) {
            this.f156633a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156633a;
        }
    }

    public enum d implements z33.h.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156638a;

        public static class a implements z33.h.b<d> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return d.RETURNS_CONSTANT;
                }
                if (i14 == 1) {
                    return d.CALLS;
                }
                if (i14 == 2) {
                    return d.RETURNS_NOT_NULL;
                }
                d dVar = d.RETURNS_CONSTANT;
                return null;
            }
        }

        static {
            new a();
        }

        d(int i14, int i15) {
            this.f156638a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156638a;
        }
    }

    public enum e implements z33.h.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156643a;

        public static class a implements z33.h.b<e> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return e.AT_MOST_ONCE;
                }
                if (i14 == 1) {
                    return e.EXACTLY_ONCE;
                }
                if (i14 == 2) {
                    return e.AT_LEAST_ONCE;
                }
                e eVar = e.AT_MOST_ONCE;
                return null;
            }
        }

        static {
            new a();
        }

        e(int i14, int i15) {
            this.f156643a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156643a;
        }
    }

    static {
        g gVar = new g(true);
        f156612j = gVar;
        gVar.f156616c = d.RETURNS_CONSTANT;
        gVar.f156617d = Collections.EMPTY_LIST;
        gVar.f156618e = i.f156655l;
        gVar.f156619f = e.AT_MOST_ONCE;
        gVar.f156620g = c.CONCLUSION_CONDITION;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private g(z33.d dVar, z33.e eVar) {
        this.f156621h = (byte) -1;
        this.f156622i = -1;
        this.f156616c = d.RETURNS_CONSTANT;
        this.f156617d = Collections.EMPTY_LIST;
        this.f156618e = i.f156655l;
        this.f156619f = e.AT_MOST_ONCE;
        this.f156620g = c.CONCLUSION_CONDITION;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        char c14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        c cVar = null;
                        d dVar2 = null;
                        i.b bVarF = null;
                        e eVar2 = null;
                        if (iO == 8) {
                            int iL = dVar.l();
                            if (iL == 0) {
                                dVar2 = d.RETURNS_CONSTANT;
                            } else if (iL == 1) {
                                dVar2 = d.CALLS;
                            } else if (iL == 2) {
                                dVar2 = d.RETURNS_NOT_NULL;
                            }
                            if (dVar2 == null) {
                                codedOutputStreamJ.v(iO);
                                codedOutputStreamJ.v(iL);
                            } else {
                                this.f156615b |= 1;
                                this.f156616c = dVar2;
                            }
                        } else if (iO == 18) {
                            int i14 = (c14 == true ? 1 : 0) & 2;
                            c14 = c14;
                            if (i14 != 2) {
                                this.f156617d = new ArrayList();
                                c14 = 2;
                            }
                            this.f156617d.add((i) dVar.h(i.f156656m, eVar));
                        } else if (iO == 26) {
                            if ((this.f156615b & 2) == 2) {
                                i iVar = this.f156618e;
                                iVar.getClass();
                                bVarF = i.b.f();
                                bVarF.h(iVar);
                            }
                            i iVar2 = (i) dVar.h(i.f156656m, eVar);
                            this.f156618e = iVar2;
                            if (bVarF != null) {
                                bVarF.h(iVar2);
                                this.f156618e = bVarF.g();
                            }
                            this.f156615b |= 2;
                        } else if (iO == 32) {
                            int iL2 = dVar.l();
                            if (iL2 == 0) {
                                eVar2 = e.AT_MOST_ONCE;
                            } else if (iL2 == 1) {
                                eVar2 = e.EXACTLY_ONCE;
                            } else if (iL2 == 2) {
                                eVar2 = e.AT_LEAST_ONCE;
                            }
                            if (eVar2 == null) {
                                codedOutputStreamJ.v(iO);
                                codedOutputStreamJ.v(iL2);
                            } else {
                                this.f156615b |= 4;
                                this.f156619f = eVar2;
                            }
                        } else if (iO == 40) {
                            int iL3 = dVar.l();
                            if (iL3 == 0) {
                                cVar = c.CONCLUSION_CONDITION;
                            } else if (iL3 == 1) {
                                cVar = c.RETURNS_CONDITION;
                            } else if (iL3 == 2) {
                                cVar = c.HOLDSIN_CONDITION;
                            }
                            if (cVar == null) {
                                codedOutputStreamJ.v(iO);
                                codedOutputStreamJ.v(iL3);
                            } else {
                                this.f156615b |= 8;
                                this.f156620g = cVar;
                            }
                        } else if (!dVar.r(iO, codedOutputStreamJ)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (((c14 == true ? 1 : 0) & 2) == 2) {
                        this.f156617d = Collections.unmodifiableList(this.f156617d);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156614a = bVarI.e();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (((c14 == true ? 1 : 0) & 2) == 2) {
            this.f156617d = Collections.unmodifiableList(this.f156617d);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156614a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f156615b & 1) == 1) {
            codedOutputStream.l(1, this.f156616c.f156638a);
        }
        for (int i14 = 0; i14 < this.f156617d.size(); i14++) {
            codedOutputStream.o(2, this.f156617d.get(i14));
        }
        if ((this.f156615b & 2) == 2) {
            codedOutputStream.o(3, this.f156618e);
        }
        if ((this.f156615b & 4) == 4) {
            codedOutputStream.l(4, this.f156619f.f156643a);
        }
        if ((this.f156615b & 8) == 8) {
            codedOutputStream.l(5, this.f156620g.f156633a);
        }
        codedOutputStream.r(this.f156614a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156622i;
        if (i14 != -1) {
            return i14;
        }
        int iA = (this.f156615b & 1) == 1 ? CodedOutputStream.a(1, this.f156616c.f156638a) : 0;
        for (int i15 = 0; i15 < this.f156617d.size(); i15++) {
            iA += CodedOutputStream.d(2, this.f156617d.get(i15));
        }
        if ((this.f156615b & 2) == 2) {
            iA += CodedOutputStream.d(3, this.f156618e);
        }
        if ((this.f156615b & 4) == 4) {
            iA += CodedOutputStream.a(4, this.f156619f.f156643a);
        }
        if ((this.f156615b & 8) == 8) {
            iA += CodedOutputStream.a(5, this.f156620g.f156633a);
        }
        int size = this.f156614a.size() + iA;
        this.f156622i = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156621h;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156617d.size(); i14++) {
            if (!this.f156617d.get(i14).isInitialized()) {
                this.f156621h = (byte) 0;
                return false;
            }
        }
        if ((this.f156615b & 2) != 2 || this.f156618e.isInitialized()) {
            this.f156621h = (byte) 1;
            return true;
        }
        this.f156621h = (byte) 0;
        return false;
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

    private g(z33.g.b bVar) {
        super(bVar);
        this.f156621h = (byte) -1;
        this.f156622i = -1;
        this.f156614a = bVar.f202188a;
    }

    private g(boolean z14) {
        this.f156621h = (byte) -1;
        this.f156622i = -1;
        this.f156614a = z33.c.f202161a;
    }
}
