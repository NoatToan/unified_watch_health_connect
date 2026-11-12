package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends z33.g implements z33.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f156811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f156812f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f156813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<c> f156814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f156815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156816d;

    public static class a extends z33.b<p> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new p(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<p, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<c> f156818c = Collections.EMPTY_LIST;

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
            p pVarG = g();
            if (pVarG.isInitialized()) {
                return pVarG;
            }
            throw new UninitializedMessageException(pVarG);
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
            h((p) gVar);
            return this;
        }

        public final p g() {
            p pVar = new p(this);
            if ((this.f156817b & 1) == 1) {
                this.f156818c = Collections.unmodifiableList(this.f156818c);
                this.f156817b &= -2;
            }
            pVar.f156814b = this.f156818c;
            return pVar;
        }

        public final void h(p pVar) {
            if (pVar == p.f156811e) {
                return;
            }
            if (!pVar.f156814b.isEmpty()) {
                if (this.f156818c.isEmpty()) {
                    this.f156818c = pVar.f156814b;
                    this.f156817b &= -2;
                } else {
                    if ((this.f156817b & 1) != 1) {
                        this.f156818c = new ArrayList(this.f156818c);
                        this.f156817b |= 1;
                    }
                    this.f156818c.addAll(pVar.f156814b);
                }
            }
            this.f202188a = this.f202188a.b(pVar.f156813a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            p pVar = null;
            try {
                try {
                    h((p) p.f156812f.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    p pVar2 = (p) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = pVar2;
                        if (pVar != null) {
                            h(pVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (pVar != null) {
                    h(pVar);
                }
                throw th;
            }
        }
    }

    static {
        p pVar = new p(true);
        f156811e = pVar;
        pVar.f156814b = Collections.EMPTY_LIST;
    }

    private p(z33.d dVar, z33.e eVar) {
        this.f156815c = (byte) -1;
        this.f156816d = -1;
        this.f156814b = Collections.EMPTY_LIST;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        boolean z15 = false;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 10) {
                            if (!z15) {
                                this.f156814b = new ArrayList();
                                z15 = true;
                            }
                            this.f156814b.add((c) dVar.h(c.f156820i, eVar));
                        } else if (!dVar.r(iO, codedOutputStreamJ)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (z15) {
                        this.f156814b = Collections.unmodifiableList(this.f156814b);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156813a = bVarI.e();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (z15) {
            this.f156814b = Collections.unmodifiableList(this.f156814b);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156813a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i14 = 0; i14 < this.f156814b.size(); i14++) {
            codedOutputStream.o(1, this.f156814b.get(i14));
        }
        codedOutputStream.r(this.f156813a);
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156816d;
        if (i14 != -1) {
            return i14;
        }
        int iD = 0;
        for (int i15 = 0; i15 < this.f156814b.size(); i15++) {
            iD += CodedOutputStream.d(1, this.f156814b.get(i15));
        }
        int size = this.f156813a.size() + iD;
        this.f156816d = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156815c;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156814b.size(); i14++) {
            if (!this.f156814b.get(i14).isInitialized()) {
                this.f156815c = (byte) 0;
                return false;
            }
        }
        this.f156815c = (byte) 1;
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

    private p(z33.g.b bVar) {
        super(bVar);
        this.f156815c = (byte) -1;
        this.f156816d = -1;
        this.f156813a = bVar.f202188a;
    }

    private p(boolean z14) {
        this.f156815c = (byte) -1;
        this.f156816d = -1;
        this.f156813a = z33.c.f202161a;
    }

    public static final class c extends z33.g implements z33.o {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f156819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f156820i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f156821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f156822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f156823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public EnumC2958c f156825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f156826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156827g;

        public static class a extends z33.b<c> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new c(dVar, eVar);
            }
        }

        public static final class b extends z33.g.b<c, b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f156828b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f156830d;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f156829c = -1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public EnumC2958c f156831e = EnumC2958c.PACKAGE;

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
                h((c) gVar);
                return this;
            }

            public final c g() {
                c cVar = new c(this);
                int i14 = this.f156828b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                cVar.f156823c = this.f156829c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                cVar.f156824d = this.f156830d;
                if ((i14 & 4) == 4) {
                    i15 |= 4;
                }
                cVar.f156825e = this.f156831e;
                cVar.f156822b = i15;
                return cVar;
            }

            public final void h(c cVar) {
                if (cVar == c.f156819h) {
                    return;
                }
                int i14 = cVar.f156822b;
                if ((i14 & 1) == 1) {
                    int i15 = cVar.f156823c;
                    this.f156828b = 1 | this.f156828b;
                    this.f156829c = i15;
                }
                if ((i14 & 2) == 2) {
                    int i16 = cVar.f156824d;
                    this.f156828b = 2 | this.f156828b;
                    this.f156830d = i16;
                }
                if ((i14 & 4) == 4) {
                    EnumC2958c enumC2958c = cVar.f156825e;
                    enumC2958c.getClass();
                    this.f156828b = 4 | this.f156828b;
                    this.f156831e = enumC2958c;
                }
                this.f202188a = this.f202188a.b(cVar.f156821a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        h((c) c.f156820i.a(dVar, eVar));
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

        /* JADX INFO: renamed from: s33.p$c$c, reason: collision with other inner class name */
        public enum EnumC2958c implements z33.h.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f156836a;

            /* JADX INFO: renamed from: s33.p$c$c$a */
            public static class a implements z33.h.b<EnumC2958c> {
                @Override // z33.h.b
                public final z33.h.a findValueByNumber(int i14) {
                    if (i14 == 0) {
                        return EnumC2958c.CLASS;
                    }
                    if (i14 == 1) {
                        return EnumC2958c.PACKAGE;
                    }
                    if (i14 == 2) {
                        return EnumC2958c.LOCAL;
                    }
                    EnumC2958c enumC2958c = EnumC2958c.CLASS;
                    return null;
                }
            }

            static {
                new a();
            }

            EnumC2958c(int i14, int i15) {
                this.f156836a = i15;
            }

            @Override // z33.h.a
            public final int getNumber() {
                return this.f156836a;
            }
        }

        static {
            c cVar = new c(true);
            f156819h = cVar;
            cVar.f156823c = -1;
            cVar.f156824d = 0;
            cVar.f156825e = EnumC2958c.PACKAGE;
        }

        private c(z33.d dVar, z33.e eVar) {
            this.f156826f = (byte) -1;
            this.f156827g = -1;
            this.f156823c = -1;
            boolean z14 = false;
            this.f156824d = 0;
            this.f156825e = EnumC2958c.PACKAGE;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            while (!z14) {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.f156822b |= 1;
                                this.f156823c = dVar.l();
                            } else if (iO == 16) {
                                this.f156822b |= 2;
                                this.f156824d = dVar.l();
                            } else if (iO == 24) {
                                int iL = dVar.l();
                                EnumC2958c enumC2958c = iL != 0 ? iL != 1 ? iL != 2 ? null : EnumC2958c.LOCAL : EnumC2958c.PACKAGE : EnumC2958c.CLASS;
                                if (enumC2958c == null) {
                                    codedOutputStreamJ.v(iO);
                                    codedOutputStreamJ.v(iL);
                                } else {
                                    this.f156822b |= 4;
                                    this.f156825e = enumC2958c;
                                }
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        }
                        z14 = true;
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    } catch (IOException e14) {
                        throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th3) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156821a = bVarI.e();
                    }
                    throw th3;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f156821a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f156822b & 1) == 1) {
                codedOutputStream.m(1, this.f156823c);
            }
            if ((this.f156822b & 2) == 2) {
                codedOutputStream.m(2, this.f156824d);
            }
            if ((this.f156822b & 4) == 4) {
                codedOutputStream.l(3, this.f156825e.f156836a);
            }
            codedOutputStream.r(this.f156821a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f156827g;
            if (i14 != -1) {
                return i14;
            }
            int iB = (this.f156822b & 1) == 1 ? CodedOutputStream.b(1, this.f156823c) : 0;
            if ((this.f156822b & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f156824d);
            }
            if ((this.f156822b & 4) == 4) {
                iB += CodedOutputStream.a(3, this.f156825e.f156836a);
            }
            int size = this.f156821a.size() + iB;
            this.f156827g = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f156826f;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if ((this.f156822b & 2) == 2) {
                this.f156826f = (byte) 1;
                return true;
            }
            this.f156826f = (byte) 0;
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

        private c(z33.g.b bVar) {
            super(bVar);
            this.f156826f = (byte) -1;
            this.f156827g = -1;
            this.f156821a = bVar.f202188a;
        }

        private c(boolean z14) {
            this.f156826f = (byte) -1;
            this.f156827g = -1;
            this.f156821a = z33.c.f202161a;
        }
    }
}
