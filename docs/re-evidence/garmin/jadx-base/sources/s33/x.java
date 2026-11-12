package s33;

import java.io.IOException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends z33.g implements z33.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f156994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f156995l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f157000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f157001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f157002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f157003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f157004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f157005j;

    public static class a extends z33.b<x> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new x(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<x, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f157006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f157007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f157008d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f157010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f157011g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f157009e = c.ERROR;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f157012h = d.LANGUAGE_VERSION;

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
            x xVarG = g();
            if (xVarG.isInitialized()) {
                return xVarG;
            }
            throw new UninitializedMessageException(xVarG);
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
            h((x) gVar);
            return this;
        }

        public final x g() {
            x xVar = new x(this);
            int i14 = this.f157006b;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            xVar.f156998c = this.f157007c;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            xVar.f156999d = this.f157008d;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            xVar.f157000e = this.f157009e;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            xVar.f157001f = this.f157010f;
            if ((i14 & 16) == 16) {
                i15 |= 16;
            }
            xVar.f157002g = this.f157011g;
            if ((i14 & 32) == 32) {
                i15 |= 32;
            }
            xVar.f157003h = this.f157012h;
            xVar.f156997b = i15;
            return xVar;
        }

        public final void h(x xVar) {
            if (xVar == x.f156994k) {
                return;
            }
            int i14 = xVar.f156997b;
            if ((i14 & 1) == 1) {
                int i15 = xVar.f156998c;
                this.f157006b = 1 | this.f157006b;
                this.f157007c = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = xVar.f156999d;
                this.f157006b = 2 | this.f157006b;
                this.f157008d = i16;
            }
            if ((i14 & 4) == 4) {
                c cVar = xVar.f157000e;
                cVar.getClass();
                this.f157006b = 4 | this.f157006b;
                this.f157009e = cVar;
            }
            int i17 = xVar.f156997b;
            if ((i17 & 8) == 8) {
                int i18 = xVar.f157001f;
                this.f157006b = 8 | this.f157006b;
                this.f157010f = i18;
            }
            if ((i17 & 16) == 16) {
                int i19 = xVar.f157002g;
                this.f157006b = 16 | this.f157006b;
                this.f157011g = i19;
            }
            if ((i17 & 32) == 32) {
                d dVar = xVar.f157003h;
                dVar.getClass();
                this.f157006b = 32 | this.f157006b;
                this.f157012h = dVar;
            }
            this.f202188a = this.f202188a.b(xVar.f156996a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            x xVar = null;
            try {
                try {
                    h((x) x.f156995l.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    x xVar2 = (x) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        xVar = xVar2;
                        if (xVar != null) {
                            h(xVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (xVar != null) {
                    h(xVar);
                }
                throw th;
            }
        }
    }

    public enum c implements z33.h.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f157017a;

        public static class a implements z33.h.b<c> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return c.WARNING;
                }
                if (i14 == 1) {
                    return c.ERROR;
                }
                if (i14 == 2) {
                    return c.HIDDEN;
                }
                c cVar = c.WARNING;
                return null;
            }
        }

        static {
            new a();
        }

        c(int i14, int i15) {
            this.f157017a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f157017a;
        }
    }

    public enum d implements z33.h.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f157022a;

        public static class a implements z33.h.b<d> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return d.LANGUAGE_VERSION;
                }
                if (i14 == 1) {
                    return d.COMPILER_VERSION;
                }
                if (i14 == 2) {
                    return d.API_VERSION;
                }
                d dVar = d.LANGUAGE_VERSION;
                return null;
            }
        }

        static {
            new a();
        }

        d(int i14, int i15) {
            this.f157022a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f157022a;
        }
    }

    static {
        x xVar = new x(true);
        f156994k = xVar;
        xVar.f156998c = 0;
        xVar.f156999d = 0;
        xVar.f157000e = c.ERROR;
        xVar.f157001f = 0;
        xVar.f157002g = 0;
        xVar.f157003h = d.LANGUAGE_VERSION;
    }

    private x(z33.d dVar, z33.e eVar) {
        this.f157004i = (byte) -1;
        this.f157005j = -1;
        boolean z14 = false;
        this.f156998c = 0;
        this.f156999d = 0;
        this.f157000e = c.ERROR;
        this.f157001f = 0;
        this.f157002g = 0;
        this.f157003h = d.LANGUAGE_VERSION;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.f156997b |= 1;
                            this.f156998c = dVar.l();
                        } else if (iO != 16) {
                            d dVar2 = null;
                            c cVar = null;
                            if (iO == 24) {
                                int iL = dVar.l();
                                if (iL == 0) {
                                    cVar = c.WARNING;
                                } else if (iL == 1) {
                                    cVar = c.ERROR;
                                } else if (iL == 2) {
                                    cVar = c.HIDDEN;
                                }
                                if (cVar == null) {
                                    codedOutputStreamJ.v(iO);
                                    codedOutputStreamJ.v(iL);
                                } else {
                                    this.f156997b |= 4;
                                    this.f157000e = cVar;
                                }
                            } else if (iO == 32) {
                                this.f156997b |= 8;
                                this.f157001f = dVar.l();
                            } else if (iO == 40) {
                                this.f156997b |= 16;
                                this.f157002g = dVar.l();
                            } else if (iO == 48) {
                                int iL2 = dVar.l();
                                if (iL2 == 0) {
                                    dVar2 = d.LANGUAGE_VERSION;
                                } else if (iL2 == 1) {
                                    dVar2 = d.COMPILER_VERSION;
                                } else if (iL2 == 2) {
                                    dVar2 = d.API_VERSION;
                                }
                                if (dVar2 == null) {
                                    codedOutputStreamJ.v(iO);
                                    codedOutputStreamJ.v(iL2);
                                } else {
                                    this.f156997b |= 32;
                                    this.f157003h = dVar2;
                                }
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        } else {
                            this.f156997b |= 2;
                            this.f156999d = dVar.l();
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156996a = bVarI.e();
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
            this.f156996a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f156997b & 1) == 1) {
            codedOutputStream.m(1, this.f156998c);
        }
        if ((this.f156997b & 2) == 2) {
            codedOutputStream.m(2, this.f156999d);
        }
        if ((this.f156997b & 4) == 4) {
            codedOutputStream.l(3, this.f157000e.f157017a);
        }
        if ((this.f156997b & 8) == 8) {
            codedOutputStream.m(4, this.f157001f);
        }
        if ((this.f156997b & 16) == 16) {
            codedOutputStream.m(5, this.f157002g);
        }
        if ((this.f156997b & 32) == 32) {
            codedOutputStream.l(6, this.f157003h.f157022a);
        }
        codedOutputStream.r(this.f156996a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f157005j;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156997b & 1) == 1 ? CodedOutputStream.b(1, this.f156998c) : 0;
        if ((this.f156997b & 2) == 2) {
            iB += CodedOutputStream.b(2, this.f156999d);
        }
        if ((this.f156997b & 4) == 4) {
            iB += CodedOutputStream.a(3, this.f157000e.f157017a);
        }
        if ((this.f156997b & 8) == 8) {
            iB += CodedOutputStream.b(4, this.f157001f);
        }
        if ((this.f156997b & 16) == 16) {
            iB += CodedOutputStream.b(5, this.f157002g);
        }
        if ((this.f156997b & 32) == 32) {
            iB += CodedOutputStream.a(6, this.f157003h.f157022a);
        }
        int size = this.f156996a.size() + iB;
        this.f157005j = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f157004i;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        this.f157004i = (byte) 1;
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

    private x(z33.g.b bVar) {
        super(bVar);
        this.f157004i = (byte) -1;
        this.f157005j = -1;
        this.f156996a = bVar.f202188a;
    }

    private x(boolean z14) {
        this.f157004i = (byte) -1;
        this.f157005j = -1;
        this.f156996a = z33.c.f202161a;
    }
}
