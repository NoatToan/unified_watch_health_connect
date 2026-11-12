package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends z33.g implements z33.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f156655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f156656m = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f156661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f156662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<i> f156664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<i> f156665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f156666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156667k;

    public static class a extends z33.b<i> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new i(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<i, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f156669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f156671e = c.TRUE;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s f156672f = s.f156850w;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<i> f156674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<i> f156675i;

        private b() {
            List<i> list = Collections.EMPTY_LIST;
            this.f156674h = list;
            this.f156675i = list;
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
            i iVarG = g();
            if (iVarG.isInitialized()) {
                return iVarG;
            }
            throw new UninitializedMessageException(iVarG);
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
            h((i) gVar);
            return this;
        }

        public final i g() {
            i iVar = new i(this);
            int i14 = this.f156668b;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            iVar.f156659c = this.f156669c;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            iVar.f156660d = this.f156670d;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            iVar.f156661e = this.f156671e;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            iVar.f156662f = this.f156672f;
            if ((i14 & 16) == 16) {
                i15 |= 16;
            }
            iVar.f156663g = this.f156673g;
            if ((i14 & 32) == 32) {
                this.f156674h = Collections.unmodifiableList(this.f156674h);
                this.f156668b &= -33;
            }
            iVar.f156664h = this.f156674h;
            if ((this.f156668b & 64) == 64) {
                this.f156675i = Collections.unmodifiableList(this.f156675i);
                this.f156668b &= -65;
            }
            iVar.f156665i = this.f156675i;
            iVar.f156658b = i15;
            return iVar;
        }

        public final void h(i iVar) {
            s sVar;
            if (iVar == i.f156655l) {
                return;
            }
            int i14 = iVar.f156658b;
            if ((i14 & 1) == 1) {
                int i15 = iVar.f156659c;
                this.f156668b = 1 | this.f156668b;
                this.f156669c = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = iVar.f156660d;
                this.f156668b = 2 | this.f156668b;
                this.f156670d = i16;
            }
            if ((i14 & 4) == 4) {
                c cVar = iVar.f156661e;
                cVar.getClass();
                this.f156668b = 4 | this.f156668b;
                this.f156671e = cVar;
            }
            if ((iVar.f156658b & 8) == 8) {
                s sVar2 = iVar.f156662f;
                if ((this.f156668b & 8) != 8 || (sVar = this.f156672f) == s.f156850w) {
                    this.f156672f = sVar2;
                } else {
                    s.c cVarO = s.o(sVar);
                    cVarO.j(sVar2);
                    this.f156672f = cVarO.i();
                }
                this.f156668b |= 8;
            }
            if ((iVar.f156658b & 16) == 16) {
                int i17 = iVar.f156663g;
                this.f156668b = 16 | this.f156668b;
                this.f156673g = i17;
            }
            if (!iVar.f156664h.isEmpty()) {
                if (this.f156674h.isEmpty()) {
                    this.f156674h = iVar.f156664h;
                    this.f156668b &= -33;
                } else {
                    if ((this.f156668b & 32) != 32) {
                        this.f156674h = new ArrayList(this.f156674h);
                        this.f156668b |= 32;
                    }
                    this.f156674h.addAll(iVar.f156664h);
                }
            }
            if (!iVar.f156665i.isEmpty()) {
                if (this.f156675i.isEmpty()) {
                    this.f156675i = iVar.f156665i;
                    this.f156668b &= -65;
                } else {
                    if ((this.f156668b & 64) != 64) {
                        this.f156675i = new ArrayList(this.f156675i);
                        this.f156668b |= 64;
                    }
                    this.f156675i.addAll(iVar.f156665i);
                }
            }
            this.f202188a = this.f202188a.b(iVar.f156657a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            i iVar = null;
            try {
                try {
                    h((i) i.f156656m.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    i iVar2 = (i) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = iVar2;
                        if (iVar != null) {
                            h(iVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (iVar != null) {
                    h(iVar);
                }
                throw th;
            }
        }
    }

    public enum c implements z33.h.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156680a;

        public static class a implements z33.h.b<c> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return c.TRUE;
                }
                if (i14 == 1) {
                    return c.FALSE;
                }
                if (i14 == 2) {
                    return c.NULL;
                }
                c cVar = c.TRUE;
                return null;
            }
        }

        static {
            new a();
        }

        c(int i14, int i15) {
            this.f156680a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156680a;
        }
    }

    static {
        i iVar = new i(true);
        f156655l = iVar;
        iVar.f156659c = 0;
        iVar.f156660d = 0;
        iVar.f156661e = c.TRUE;
        iVar.f156662f = s.f156850w;
        iVar.f156663g = 0;
        List<i> list = Collections.EMPTY_LIST;
        iVar.f156664h = list;
        iVar.f156665i = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private i(z33.d dVar, z33.e eVar) {
        this.f156666j = (byte) -1;
        this.f156667k = -1;
        boolean z14 = false;
        this.f156659c = 0;
        this.f156660d = 0;
        this.f156661e = c.TRUE;
        this.f156662f = s.f156850w;
        this.f156663g = 0;
        List<i> list = Collections.EMPTY_LIST;
        this.f156664h = list;
        this.f156665i = list;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.f156658b |= 1;
                            this.f156659c = dVar.l();
                        } else if (iO != 16) {
                            s.c cVarO = null;
                            c cVar = null;
                            if (iO == 24) {
                                int iL = dVar.l();
                                if (iL == 0) {
                                    cVar = c.TRUE;
                                } else if (iL == 1) {
                                    cVar = c.FALSE;
                                } else if (iL == 2) {
                                    cVar = c.NULL;
                                }
                                if (cVar == null) {
                                    codedOutputStreamJ.v(iO);
                                    codedOutputStreamJ.v(iL);
                                } else {
                                    this.f156658b |= 4;
                                    this.f156661e = cVar;
                                }
                            } else if (iO == 34) {
                                if ((this.f156658b & 8) == 8) {
                                    s sVar = this.f156662f;
                                    sVar.getClass();
                                    cVarO = s.o(sVar);
                                }
                                s sVar2 = (s) dVar.h(s.f156851x, eVar);
                                this.f156662f = sVar2;
                                if (cVarO != null) {
                                    cVarO.j(sVar2);
                                    this.f156662f = cVarO.i();
                                }
                                this.f156658b |= 8;
                            } else if (iO != 40) {
                                a aVar = f156656m;
                                if (iO == 50) {
                                    int i15 = (i14 == true ? 1 : 0) & 32;
                                    i14 = i14;
                                    if (i15 != 32) {
                                        this.f156664h = new ArrayList();
                                        i14 = (i14 == true ? 1 : 0) | 32;
                                    }
                                    this.f156664h.add((i) dVar.h(aVar, eVar));
                                } else if (iO == 58) {
                                    int i16 = (i14 == true ? 1 : 0) & 64;
                                    i14 = i14;
                                    if (i16 != 64) {
                                        this.f156665i = new ArrayList();
                                        i14 = (i14 == true ? 1 : 0) | 64;
                                    }
                                    this.f156665i.add((i) dVar.h(aVar, eVar));
                                } else if (!dVar.r(iO, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f156658b |= 16;
                                this.f156663g = dVar.l();
                            }
                        } else {
                            this.f156658b |= 2;
                            this.f156660d = dVar.l();
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (((i14 == true ? 1 : 0) & 32) == 32) {
                        this.f156664h = Collections.unmodifiableList(this.f156664h);
                    }
                    if (((i14 == true ? 1 : 0) & 64) == 64) {
                        this.f156665i = Collections.unmodifiableList(this.f156665i);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156657a = bVarI.e();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (((i14 == true ? 1 : 0) & 32) == 32) {
            this.f156664h = Collections.unmodifiableList(this.f156664h);
        }
        if (((i14 == true ? 1 : 0) & 64) == 64) {
            this.f156665i = Collections.unmodifiableList(this.f156665i);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156657a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.f156658b & 1) == 1) {
            codedOutputStream.m(1, this.f156659c);
        }
        if ((this.f156658b & 2) == 2) {
            codedOutputStream.m(2, this.f156660d);
        }
        if ((this.f156658b & 4) == 4) {
            codedOutputStream.l(3, this.f156661e.f156680a);
        }
        if ((this.f156658b & 8) == 8) {
            codedOutputStream.o(4, this.f156662f);
        }
        if ((this.f156658b & 16) == 16) {
            codedOutputStream.m(5, this.f156663g);
        }
        for (int i14 = 0; i14 < this.f156664h.size(); i14++) {
            codedOutputStream.o(6, this.f156664h.get(i14));
        }
        for (int i15 = 0; i15 < this.f156665i.size(); i15++) {
            codedOutputStream.o(7, this.f156665i.get(i15));
        }
        codedOutputStream.r(this.f156657a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156667k;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156658b & 1) == 1 ? CodedOutputStream.b(1, this.f156659c) : 0;
        if ((this.f156658b & 2) == 2) {
            iB += CodedOutputStream.b(2, this.f156660d);
        }
        if ((this.f156658b & 4) == 4) {
            iB += CodedOutputStream.a(3, this.f156661e.f156680a);
        }
        if ((this.f156658b & 8) == 8) {
            iB += CodedOutputStream.d(4, this.f156662f);
        }
        if ((this.f156658b & 16) == 16) {
            iB += CodedOutputStream.b(5, this.f156663g);
        }
        for (int i15 = 0; i15 < this.f156664h.size(); i15++) {
            iB += CodedOutputStream.d(6, this.f156664h.get(i15));
        }
        for (int i16 = 0; i16 < this.f156665i.size(); i16++) {
            iB += CodedOutputStream.d(7, this.f156665i.get(i16));
        }
        int size = this.f156657a.size() + iB;
        this.f156667k = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156666j;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        if ((this.f156658b & 8) == 8 && !this.f156662f.isInitialized()) {
            this.f156666j = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f156664h.size(); i14++) {
            if (!this.f156664h.get(i14).isInitialized()) {
                this.f156666j = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f156665i.size(); i15++) {
            if (!this.f156665i.get(i15).isInitialized()) {
                this.f156666j = (byte) 0;
                return false;
            }
        }
        this.f156666j = (byte) 1;
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

    private i(z33.g.b bVar) {
        super(bVar);
        this.f156666j = (byte) -1;
        this.f156667k = -1;
        this.f156657a = bVar.f202188a;
    }

    private i(boolean z14) {
        this.f156666j = (byte) -1;
        this.f156667k = -1;
        this.f156657a = z33.c.f202161a;
    }
}
