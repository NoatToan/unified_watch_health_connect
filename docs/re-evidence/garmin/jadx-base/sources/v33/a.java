package v33;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import r1.q2;
import s33.j;
import s33.m;
import s33.o;
import s33.s;
import z33.g;
import z33.h;
import z33.n;
import z33.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.f<s33.e, c> f175422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.f<j, c> f175423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g.f<j, Integer> f175424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g.f<o, d> f175425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.f<o, Integer> f175426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g.f<s, Boolean> f175427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.f<s33.c, Integer> f175428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g.f<s33.c, List<o>> f175429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g.f<s33.c, Integer> f175430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g.f<s33.c, Integer> f175431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g.f<m, Integer> f175432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g.f<m, List<o>> f175433l;

    static {
        s33.e eVar = s33.e.f156587k;
        c cVar = c.f175445g;
        v.c cVar2 = v.f202258m;
        f175422a = g.c(eVar, cVar, cVar, 100, cVar2, c.class);
        j jVar = j.A;
        f175423b = g.c(jVar, cVar, cVar, 100, cVar2, c.class);
        v vVar = v.f202252g;
        f175424c = g.c(jVar, 0, null, 101, vVar, Integer.class);
        o oVar = o.I;
        d dVar = d.f175456j;
        f175425d = g.c(oVar, dVar, dVar, 100, cVar2, d.class);
        f175426e = g.c(oVar, 0, null, 101, vVar, Integer.class);
        f175427f = g.c(s.f156850w, Boolean.FALSE, null, 101, v.f202255j, Boolean.class);
        s33.c cVar3 = s33.c.T;
        f175428g = g.c(cVar3, 0, null, 101, vVar, Integer.class);
        f175429h = g.b(cVar3, oVar, 102, cVar2, o.class);
        f175430i = g.c(cVar3, 0, null, 103, vVar, Integer.class);
        f175431j = g.c(cVar3, 0, null, 104, vVar, Integer.class);
        m mVar = m.f156735k;
        f175432k = g.c(mVar, 0, null, 101, vVar, Integer.class);
        f175433l = g.b(mVar, oVar, 102, cVar2, o.class);
    }

    public static final class b extends g implements z33.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f175434g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C3268a f175435h = new C3268a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f175436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f175437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f175438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f175439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f175440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f175441f;

        /* JADX INFO: renamed from: v33.a$b$a, reason: collision with other inner class name */
        public static class C3268a extends z33.b<b> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new b(dVar, eVar);
            }
        }

        /* JADX INFO: renamed from: v33.a$b$b, reason: collision with other inner class name */
        public static final class C3269b extends g.b<b, C3269b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f175442b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f175443c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f175444d;

            private C3269b() {
            }

            public static C3269b f() {
                return new C3269b();
            }

            @Override // z33.g.b, z33.a.AbstractC3766a
            public final z33.a.AbstractC3766a b() {
                C3269b c3269b = new C3269b();
                c3269b.h(g());
                return c3269b;
            }

            @Override // z33.a.AbstractC3766a, z33.n.a
            public final /* bridge */ /* synthetic */ n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                i(dVar, eVar);
                return this;
            }

            @Override // z33.n.a
            public final n build() {
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
                C3269b c3269b = new C3269b();
                c3269b.h(g());
                return c3269b;
            }

            @Override // z33.g.b
            /* JADX INFO: renamed from: d */
            public final g.b b() {
                C3269b c3269b = new C3269b();
                c3269b.h(g());
                return c3269b;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ g.b e(g gVar) {
                h((b) gVar);
                return this;
            }

            public final b g() {
                b bVar = new b(this);
                int i14 = this.f175442b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                bVar.f175438c = this.f175443c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                bVar.f175439d = this.f175444d;
                bVar.f175437b = i15;
                return bVar;
            }

            public final void h(b bVar) {
                if (bVar == b.f175434g) {
                    return;
                }
                int i14 = bVar.f175437b;
                if ((i14 & 1) == 1) {
                    int i15 = bVar.f175438c;
                    this.f175442b = 1 | this.f175442b;
                    this.f175443c = i15;
                }
                if ((i14 & 2) == 2) {
                    int i16 = bVar.f175439d;
                    this.f175442b = 2 | this.f175442b;
                    this.f175444d = i16;
                }
                this.f202188a = this.f202188a.b(bVar.f175436a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        h((b) b.f175435h.a(dVar, eVar));
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

        static {
            b bVar = new b(true);
            f175434g = bVar;
            bVar.f175438c = 0;
            bVar.f175439d = 0;
        }

        private b(z33.d dVar, z33.e eVar) {
            this.f175440e = (byte) -1;
            this.f175441f = -1;
            boolean z14 = false;
            this.f175438c = 0;
            this.f175439d = 0;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            while (!z14) {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.f175437b |= 1;
                                this.f175438c = dVar.l();
                            } else if (iO == 16) {
                                this.f175437b |= 2;
                                this.f175439d = dVar.l();
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        }
                        z14 = true;
                    } catch (Throwable th3) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } finally {
                            this.f175436a = bVarI.e();
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
                this.f175436a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f175437b & 1) == 1) {
                codedOutputStream.m(1, this.f175438c);
            }
            if ((this.f175437b & 2) == 2) {
                codedOutputStream.m(2, this.f175439d);
            }
            codedOutputStream.r(this.f175436a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f175441f;
            if (i14 != -1) {
                return i14;
            }
            int iB = (this.f175437b & 1) == 1 ? CodedOutputStream.b(1, this.f175438c) : 0;
            if ((this.f175437b & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f175439d);
            }
            int size = this.f175436a.size() + iB;
            this.f175441f = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f175440e;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f175440e = (byte) 1;
            return true;
        }

        @Override // z33.n
        public final n.a newBuilderForType() {
            return C3269b.f();
        }

        @Override // z33.n
        public final n.a toBuilder() {
            C3269b c3269bF = C3269b.f();
            c3269bF.h(this);
            return c3269bF;
        }

        private b(g.b bVar) {
            super(bVar);
            this.f175440e = (byte) -1;
            this.f175441f = -1;
            this.f175436a = bVar.f202188a;
        }

        private b(boolean z14) {
            this.f175440e = (byte) -1;
            this.f175441f = -1;
            this.f175436a = z33.c.f202161a;
        }
    }

    public static final class c extends g implements z33.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f175445g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C3270a f175446h = new C3270a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f175447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f175448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f175449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f175450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f175451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f175452f;

        /* JADX INFO: renamed from: v33.a$c$a, reason: collision with other inner class name */
        public static class C3270a extends z33.b<c> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new c(dVar, eVar);
            }
        }

        public static final class b extends g.b<c, b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f175453b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f175454c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f175455d;

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
            public final /* bridge */ /* synthetic */ n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                i(dVar, eVar);
                return this;
            }

            @Override // z33.n.a
            public final n build() {
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
            public final g.b b() {
                b bVar = new b();
                bVar.h(g());
                return bVar;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ g.b e(g gVar) {
                h((c) gVar);
                return this;
            }

            public final c g() {
                c cVar = new c(this);
                int i14 = this.f175453b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                cVar.f175449c = this.f175454c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                cVar.f175450d = this.f175455d;
                cVar.f175448b = i15;
                return cVar;
            }

            public final void h(c cVar) {
                if (cVar == c.f175445g) {
                    return;
                }
                int i14 = cVar.f175448b;
                if ((i14 & 1) == 1) {
                    int i15 = cVar.f175449c;
                    this.f175453b = 1 | this.f175453b;
                    this.f175454c = i15;
                }
                if ((i14 & 2) == 2) {
                    int i16 = cVar.f175450d;
                    this.f175453b = 2 | this.f175453b;
                    this.f175455d = i16;
                }
                this.f202188a = this.f202188a.b(cVar.f175447a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        h((c) c.f175446h.a(dVar, eVar));
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

        static {
            c cVar = new c(true);
            f175445g = cVar;
            cVar.f175449c = 0;
            cVar.f175450d = 0;
        }

        private c(z33.d dVar, z33.e eVar) {
            this.f175451e = (byte) -1;
            this.f175452f = -1;
            boolean z14 = false;
            this.f175449c = 0;
            this.f175450d = 0;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            while (!z14) {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.f175448b |= 1;
                                this.f175449c = dVar.l();
                            } else if (iO == 16) {
                                this.f175448b |= 2;
                                this.f175450d = dVar.l();
                            } else if (!dVar.r(iO, codedOutputStreamJ)) {
                            }
                        }
                        z14 = true;
                    } catch (Throwable th3) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } finally {
                            this.f175447a = bVarI.e();
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
                this.f175447a = bVarI.e();
            }
        }

        public static b d(c cVar) {
            b bVarF = b.f();
            bVarF.h(cVar);
            return bVarF;
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f175448b & 1) == 1) {
                codedOutputStream.m(1, this.f175449c);
            }
            if ((this.f175448b & 2) == 2) {
                codedOutputStream.m(2, this.f175450d);
            }
            codedOutputStream.r(this.f175447a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f175452f;
            if (i14 != -1) {
                return i14;
            }
            int iB = (this.f175448b & 1) == 1 ? CodedOutputStream.b(1, this.f175449c) : 0;
            if ((this.f175448b & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f175450d);
            }
            int size = this.f175447a.size() + iB;
            this.f175452f = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f175451e;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f175451e = (byte) 1;
            return true;
        }

        @Override // z33.n
        public final n.a newBuilderForType() {
            return b.f();
        }

        @Override // z33.n
        public final n.a toBuilder() {
            return d(this);
        }

        private c(g.b bVar) {
            super(bVar);
            this.f175451e = (byte) -1;
            this.f175452f = -1;
            this.f175447a = bVar.f202188a;
        }

        private c(boolean z14) {
            this.f175451e = (byte) -1;
            this.f175452f = -1;
            this.f175447a = z33.c.f202161a;
        }
    }

    public static final class e extends g implements z33.o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f175473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C3272a f175474h = new C3272a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f175475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<c> f175476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Integer> f175477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f175478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f175479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f175480f;

        /* JADX INFO: renamed from: v33.a$e$a, reason: collision with other inner class name */
        public static class C3272a extends z33.b<e> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new e(dVar, eVar);
            }
        }

        public static final class b extends g.b<e, b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f175481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List<c> f175482c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public List<Integer> f175483d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f175482c = list;
                this.f175483d = list;
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
            public final /* bridge */ /* synthetic */ n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                i(dVar, eVar);
                return this;
            }

            @Override // z33.n.a
            public final n build() {
                e eVarG = g();
                if (eVarG.isInitialized()) {
                    return eVarG;
                }
                throw new UninitializedMessageException(eVarG);
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
            public final g.b b() {
                b bVar = new b();
                bVar.h(g());
                return bVar;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ g.b e(g gVar) {
                h((e) gVar);
                return this;
            }

            public final e g() {
                e eVar = new e(this);
                if ((this.f175481b & 1) == 1) {
                    this.f175482c = Collections.unmodifiableList(this.f175482c);
                    this.f175481b &= -2;
                }
                eVar.f175476b = this.f175482c;
                if ((this.f175481b & 2) == 2) {
                    this.f175483d = Collections.unmodifiableList(this.f175483d);
                    this.f175481b &= -3;
                }
                eVar.f175477c = this.f175483d;
                return eVar;
            }

            public final void h(e eVar) {
                if (eVar == e.f175473g) {
                    return;
                }
                if (!eVar.f175476b.isEmpty()) {
                    if (this.f175482c.isEmpty()) {
                        this.f175482c = eVar.f175476b;
                        this.f175481b &= -2;
                    } else {
                        if ((this.f175481b & 1) != 1) {
                            this.f175482c = new ArrayList(this.f175482c);
                            this.f175481b |= 1;
                        }
                        this.f175482c.addAll(eVar.f175476b);
                    }
                }
                if (!eVar.f175477c.isEmpty()) {
                    if (this.f175483d.isEmpty()) {
                        this.f175483d = eVar.f175477c;
                        this.f175481b &= -3;
                    } else {
                        if ((this.f175481b & 2) != 2) {
                            this.f175483d = new ArrayList(this.f175483d);
                            this.f175481b |= 2;
                        }
                        this.f175483d.addAll(eVar.f175477c);
                    }
                }
                this.f202188a = this.f202188a.b(eVar.f175475a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                e eVar2 = null;
                try {
                    try {
                        h((e) e.f175474h.a(dVar, eVar));
                    } catch (InvalidProtocolBufferException e4) {
                        e eVar3 = (e) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            eVar2 = eVar3;
                            if (eVar2 != null) {
                                h(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (eVar2 != null) {
                        h(eVar2);
                    }
                    throw th;
                }
            }
        }

        static {
            e eVar = new e(true);
            f175473g = eVar;
            List list = Collections.EMPTY_LIST;
            eVar.f175476b = list;
            eVar.f175477c = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        private e(z33.d dVar, z33.e eVar) {
            this.f175478d = -1;
            this.f175479e = (byte) -1;
            this.f175480f = -1;
            List list = Collections.EMPTY_LIST;
            this.f175476b = list;
            this.f175477c = list;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            boolean z14 = false;
            int i14 = 0;
            while (!z14) {
                try {
                    try {
                        try {
                            int iO = dVar.o();
                            if (iO != 0) {
                                if (iO == 10) {
                                    if ((i14 & 1) != 1) {
                                        this.f175476b = new ArrayList();
                                        i14 |= 1;
                                    }
                                    this.f175476b.add((c) dVar.h(c.f175485n, eVar));
                                } else if (iO == 40) {
                                    if ((i14 & 2) != 2) {
                                        this.f175477c = new ArrayList();
                                        i14 |= 2;
                                    }
                                    this.f175477c.add(Integer.valueOf(dVar.l()));
                                } else if (iO == 42) {
                                    int iE = dVar.e(dVar.l());
                                    if ((i14 & 2) != 2 && dVar.b() > 0) {
                                        this.f175477c = new ArrayList();
                                        i14 |= 2;
                                    }
                                    while (dVar.b() > 0) {
                                        this.f175477c.add(Integer.valueOf(dVar.l()));
                                    }
                                    dVar.d(iE);
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
                    if ((i14 & 1) == 1) {
                        this.f175476b = Collections.unmodifiableList(this.f175476b);
                    }
                    if ((i14 & 2) == 2) {
                        this.f175477c = Collections.unmodifiableList(this.f175477c);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f175475a = bVarI.e();
                    }
                    throw th3;
                }
            }
            if ((i14 & 1) == 1) {
                this.f175476b = Collections.unmodifiableList(this.f175476b);
            }
            if ((i14 & 2) == 2) {
                this.f175477c = Collections.unmodifiableList(this.f175477c);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f175475a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i14 = 0; i14 < this.f175476b.size(); i14++) {
                codedOutputStream.o(1, this.f175476b.get(i14));
            }
            if (this.f175477c.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.f175478d);
            }
            for (int i15 = 0; i15 < this.f175477c.size(); i15++) {
                codedOutputStream.n(this.f175477c.get(i15).intValue());
            }
            codedOutputStream.r(this.f175475a);
        }

        @Override // z33.n
        public final int getSerializedSize() {
            List<Integer> list;
            int i14 = this.f175480f;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iD = 0;
            for (int i16 = 0; i16 < this.f175476b.size(); i16++) {
                iD += CodedOutputStream.d(1, this.f175476b.get(i16));
            }
            int iC = 0;
            while (true) {
                int size = this.f175477c.size();
                list = this.f175477c;
                if (i15 >= size) {
                    break;
                }
                iC += CodedOutputStream.c(list.get(i15).intValue());
                i15++;
            }
            int iC2 = iD + iC;
            if (!list.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.f175478d = iC;
            int size2 = this.f175475a.size() + iC2;
            this.f175480f = size2;
            return size2;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f175479e;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f175479e = (byte) 1;
            return true;
        }

        @Override // z33.n
        public final n.a newBuilderForType() {
            return b.f();
        }

        @Override // z33.n
        public final n.a toBuilder() {
            b bVarF = b.f();
            bVarF.h(this);
            return bVarF;
        }

        private e(g.b bVar) {
            super(bVar);
            this.f175478d = -1;
            this.f175479e = (byte) -1;
            this.f175480f = -1;
            this.f175475a = bVar.f202188a;
        }

        private e(boolean z14) {
            this.f175478d = -1;
            this.f175479e = (byte) -1;
            this.f175480f = -1;
            this.f175475a = z33.c.f202161a;
        }

        public static final class c extends g implements z33.o {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final c f175484m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C3273a f175485n = new C3273a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z33.c f175486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f175487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f175488c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f175489d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f175490e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public EnumC3274c f175491f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List<Integer> f175492g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f175493h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public List<Integer> f175494i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f175495j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public byte f175496k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f175497l;

            /* JADX INFO: renamed from: v33.a$e$c$a, reason: collision with other inner class name */
            public static class C3273a extends z33.b<c> {
                @Override // z33.p
                public final Object a(z33.d dVar, z33.e eVar) {
                    return new c(dVar, eVar);
                }
            }

            public static final class b extends g.b<c, b> implements z33.o {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f175498b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f175500d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public List<Integer> f175503g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public List<Integer> f175504h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f175499c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f175501e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public EnumC3274c f175502f = EnumC3274c.NONE;

                private b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f175503g = list;
                    this.f175504h = list;
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
                public final /* bridge */ /* synthetic */ n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                    i(dVar, eVar);
                    return this;
                }

                @Override // z33.n.a
                public final n build() {
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
                public final g.b b() {
                    b bVar = new b();
                    bVar.h(g());
                    return bVar;
                }

                @Override // z33.g.b
                public final /* bridge */ /* synthetic */ g.b e(g gVar) {
                    h((c) gVar);
                    return this;
                }

                public final c g() {
                    c cVar = new c(this);
                    int i14 = this.f175498b;
                    int i15 = (i14 & 1) != 1 ? 0 : 1;
                    cVar.f175488c = this.f175499c;
                    if ((i14 & 2) == 2) {
                        i15 |= 2;
                    }
                    cVar.f175489d = this.f175500d;
                    if ((i14 & 4) == 4) {
                        i15 |= 4;
                    }
                    cVar.f175490e = this.f175501e;
                    if ((i14 & 8) == 8) {
                        i15 |= 8;
                    }
                    cVar.f175491f = this.f175502f;
                    if ((i14 & 16) == 16) {
                        this.f175503g = Collections.unmodifiableList(this.f175503g);
                        this.f175498b &= -17;
                    }
                    cVar.f175492g = this.f175503g;
                    if ((this.f175498b & 32) == 32) {
                        this.f175504h = Collections.unmodifiableList(this.f175504h);
                        this.f175498b &= -33;
                    }
                    cVar.f175494i = this.f175504h;
                    cVar.f175487b = i15;
                    return cVar;
                }

                public final void h(c cVar) {
                    if (cVar == c.f175484m) {
                        return;
                    }
                    int i14 = cVar.f175487b;
                    if ((i14 & 1) == 1) {
                        int i15 = cVar.f175488c;
                        this.f175498b = 1 | this.f175498b;
                        this.f175499c = i15;
                    }
                    if ((i14 & 2) == 2) {
                        int i16 = cVar.f175489d;
                        this.f175498b = 2 | this.f175498b;
                        this.f175500d = i16;
                    }
                    if ((i14 & 4) == 4) {
                        this.f175498b |= 4;
                        this.f175501e = cVar.f175490e;
                    }
                    if ((i14 & 8) == 8) {
                        EnumC3274c enumC3274c = cVar.f175491f;
                        enumC3274c.getClass();
                        this.f175498b = 8 | this.f175498b;
                        this.f175502f = enumC3274c;
                    }
                    if (!cVar.f175492g.isEmpty()) {
                        if (this.f175503g.isEmpty()) {
                            this.f175503g = cVar.f175492g;
                            this.f175498b &= -17;
                        } else {
                            if ((this.f175498b & 16) != 16) {
                                this.f175503g = new ArrayList(this.f175503g);
                                this.f175498b |= 16;
                            }
                            this.f175503g.addAll(cVar.f175492g);
                        }
                    }
                    if (!cVar.f175494i.isEmpty()) {
                        if (this.f175504h.isEmpty()) {
                            this.f175504h = cVar.f175494i;
                            this.f175498b &= -33;
                        } else {
                            if ((this.f175498b & 32) != 32) {
                                this.f175504h = new ArrayList(this.f175504h);
                                this.f175498b |= 32;
                            }
                            this.f175504h.addAll(cVar.f175494i);
                        }
                    }
                    this.f202188a = this.f202188a.b(cVar.f175486a);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001b  */
                public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            h((c) c.f175485n.a(dVar, eVar));
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

            /* JADX INFO: renamed from: v33.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC3274c implements h.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f175509a;

                /* JADX INFO: renamed from: v33.a$e$c$c$a, reason: collision with other inner class name */
                public static class C3275a implements h.b<EnumC3274c> {
                    @Override // z33.h.b
                    public final h.a findValueByNumber(int i14) {
                        if (i14 == 0) {
                            return EnumC3274c.NONE;
                        }
                        if (i14 == 1) {
                            return EnumC3274c.INTERNAL_TO_CLASS_ID;
                        }
                        if (i14 == 2) {
                            return EnumC3274c.DESC_TO_CLASS_ID;
                        }
                        EnumC3274c enumC3274c = EnumC3274c.NONE;
                        return null;
                    }
                }

                static {
                    new C3275a();
                }

                EnumC3274c(int i14, int i15) {
                    this.f175509a = i15;
                }

                @Override // z33.h.a
                public final int getNumber() {
                    return this.f175509a;
                }
            }

            static {
                c cVar = new c(true);
                f175484m = cVar;
                cVar.f175488c = 1;
                cVar.f175489d = 0;
                cVar.f175490e = "";
                cVar.f175491f = EnumC3274c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                cVar.f175492g = list;
                cVar.f175494i = list;
            }

            private c(z33.d dVar, z33.e eVar) {
                this.f175493h = -1;
                this.f175495j = -1;
                this.f175496k = (byte) -1;
                this.f175497l = -1;
                this.f175488c = 1;
                boolean z14 = false;
                this.f175489d = 0;
                this.f175490e = "";
                this.f175491f = EnumC3274c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f175492g = list;
                this.f175494i = list;
                z33.c.b bVarI = z33.c.i();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
                int i14 = 0;
                while (!z14) {
                    try {
                        try {
                            int iO = dVar.o();
                            if (iO != 0) {
                                if (iO == 8) {
                                    this.f175487b |= 1;
                                    this.f175488c = dVar.l();
                                } else if (iO == 16) {
                                    this.f175487b |= 2;
                                    this.f175489d = dVar.l();
                                } else if (iO == 24) {
                                    int iL = dVar.l();
                                    EnumC3274c enumC3274c = iL != 0 ? iL != 1 ? iL != 2 ? null : EnumC3274c.DESC_TO_CLASS_ID : EnumC3274c.INTERNAL_TO_CLASS_ID : EnumC3274c.NONE;
                                    if (enumC3274c == null) {
                                        codedOutputStreamJ.v(iO);
                                        codedOutputStreamJ.v(iL);
                                    } else {
                                        this.f175487b |= 8;
                                        this.f175491f = enumC3274c;
                                    }
                                } else if (iO == 32) {
                                    if ((i14 & 16) != 16) {
                                        this.f175492g = new ArrayList();
                                        i14 |= 16;
                                    }
                                    this.f175492g.add(Integer.valueOf(dVar.l()));
                                } else if (iO == 34) {
                                    int iE = dVar.e(dVar.l());
                                    if ((i14 & 16) != 16 && dVar.b() > 0) {
                                        this.f175492g = new ArrayList();
                                        i14 |= 16;
                                    }
                                    while (dVar.b() > 0) {
                                        this.f175492g.add(Integer.valueOf(dVar.l()));
                                    }
                                    dVar.d(iE);
                                } else if (iO == 40) {
                                    if ((i14 & 32) != 32) {
                                        this.f175494i = new ArrayList();
                                        i14 |= 32;
                                    }
                                    this.f175494i.add(Integer.valueOf(dVar.l()));
                                } else if (iO == 42) {
                                    int iE2 = dVar.e(dVar.l());
                                    if ((i14 & 32) != 32 && dVar.b() > 0) {
                                        this.f175494i = new ArrayList();
                                        i14 |= 32;
                                    }
                                    while (dVar.b() > 0) {
                                        this.f175494i.add(Integer.valueOf(dVar.l()));
                                    }
                                    dVar.d(iE2);
                                } else if (iO == 50) {
                                    z33.m mVarF = dVar.f();
                                    this.f175487b |= 4;
                                    this.f175490e = mVarF;
                                } else if (!dVar.r(iO, codedOutputStreamJ)) {
                                }
                            }
                            z14 = true;
                        } catch (Throwable th3) {
                            if ((i14 & 16) == 16) {
                                this.f175492g = Collections.unmodifiableList(this.f175492g);
                            }
                            if ((i14 & 32) == 32) {
                                this.f175494i = Collections.unmodifiableList(this.f175494i);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused) {
                            } finally {
                                this.f175486a = bVarI.e();
                            }
                            throw th3;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    } catch (IOException e14) {
                        throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((i14 & 16) == 16) {
                    this.f175492g = Collections.unmodifiableList(this.f175492g);
                }
                if ((i14 & 32) == 32) {
                    this.f175494i = Collections.unmodifiableList(this.f175494i);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.f175486a = bVarI.e();
                }
            }

            @Override // z33.n
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                z33.c mVar;
                getSerializedSize();
                if ((this.f175487b & 1) == 1) {
                    codedOutputStream.m(1, this.f175488c);
                }
                if ((this.f175487b & 2) == 2) {
                    codedOutputStream.m(2, this.f175489d);
                }
                if ((this.f175487b & 8) == 8) {
                    codedOutputStream.l(3, this.f175491f.f175509a);
                }
                if (this.f175492g.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.f175493h);
                }
                for (int i14 = 0; i14 < this.f175492g.size(); i14++) {
                    codedOutputStream.n(this.f175492g.get(i14).intValue());
                }
                if (this.f175494i.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.f175495j);
                }
                for (int i15 = 0; i15 < this.f175494i.size(); i15++) {
                    codedOutputStream.n(this.f175494i.get(i15).intValue());
                }
                if ((this.f175487b & 4) == 4) {
                    Object obj = this.f175490e;
                    if (obj instanceof String) {
                        String str = (String) obj;
                        z33.m mVar2 = z33.c.f202161a;
                        try {
                            mVar = new z33.m(str.getBytes("UTF-8"));
                            this.f175490e = mVar;
                        } catch (UnsupportedEncodingException e4) {
                            q2.v("UTF-8 not supported?", e4);
                            return;
                        }
                    } else {
                        mVar = (z33.c) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(mVar.size());
                    codedOutputStream.r(mVar);
                }
                codedOutputStream.r(this.f175486a);
            }

            @Override // z33.n
            public final int getSerializedSize() {
                List<Integer> list;
                List<Integer> list2;
                z33.c mVar;
                int i14 = this.f175497l;
                if (i14 != -1) {
                    return i14;
                }
                int iB = (this.f175487b & 1) == 1 ? CodedOutputStream.b(1, this.f175488c) : 0;
                if ((this.f175487b & 2) == 2) {
                    iB += CodedOutputStream.b(2, this.f175489d);
                }
                if ((this.f175487b & 8) == 8) {
                    iB += CodedOutputStream.a(3, this.f175491f.f175509a);
                }
                int i15 = 0;
                int iC = 0;
                while (true) {
                    int size = this.f175492g.size();
                    list = this.f175492g;
                    if (i15 >= size) {
                        break;
                    }
                    iC += CodedOutputStream.c(list.get(i15).intValue());
                    i15++;
                }
                int iC2 = iB + iC;
                if (!list.isEmpty()) {
                    iC2 = iC2 + 1 + CodedOutputStream.c(iC);
                }
                this.f175493h = iC;
                int i16 = 0;
                int iC3 = 0;
                while (true) {
                    int size2 = this.f175494i.size();
                    list2 = this.f175494i;
                    if (i16 >= size2) {
                        break;
                    }
                    iC3 += CodedOutputStream.c(list2.get(i16).intValue());
                    i16++;
                }
                int size3 = iC2 + iC3;
                if (!list2.isEmpty()) {
                    size3 = size3 + 1 + CodedOutputStream.c(iC3);
                }
                this.f175495j = iC3;
                if ((this.f175487b & 4) == 4) {
                    Object obj = this.f175490e;
                    if (obj instanceof String) {
                        String str = (String) obj;
                        z33.m mVar2 = z33.c.f202161a;
                        try {
                            mVar = new z33.m(str.getBytes("UTF-8"));
                            this.f175490e = mVar;
                        } catch (UnsupportedEncodingException e4) {
                            q2.v("UTF-8 not supported?", e4);
                            return 0;
                        }
                    } else {
                        mVar = (z33.c) obj;
                    }
                    size3 += mVar.size() + CodedOutputStream.f(mVar.size()) + CodedOutputStream.h(6);
                }
                int size4 = this.f175486a.size() + size3;
                this.f175497l = size4;
                return size4;
            }

            @Override // z33.o
            public final boolean isInitialized() {
                byte b14 = this.f175496k;
                if (b14 == 1) {
                    return true;
                }
                if (b14 == 0) {
                    return false;
                }
                this.f175496k = (byte) 1;
                return true;
            }

            @Override // z33.n
            public final n.a newBuilderForType() {
                return b.f();
            }

            @Override // z33.n
            public final n.a toBuilder() {
                b bVarF = b.f();
                bVarF.h(this);
                return bVarF;
            }

            private c(g.b bVar) {
                super(bVar);
                this.f175493h = -1;
                this.f175495j = -1;
                this.f175496k = (byte) -1;
                this.f175497l = -1;
                this.f175486a = bVar.f202188a;
            }

            private c(boolean z14) {
                this.f175493h = -1;
                this.f175495j = -1;
                this.f175496k = (byte) -1;
                this.f175497l = -1;
                this.f175486a = z33.c.f202161a;
            }
        }
    }

    public static final class d extends g implements z33.o {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f175456j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final C3271a f175457k = new C3271a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.c f175458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f175459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f175460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f175461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f175462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f175463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f175464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f175465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f175466i;

        /* JADX INFO: renamed from: v33.a$d$a, reason: collision with other inner class name */
        public static class C3271a extends z33.b<d> {
            @Override // z33.p
            public final Object a(z33.d dVar, z33.e eVar) {
                return new d(dVar, eVar);
            }
        }

        public static final class b extends g.b<d, b> implements z33.o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f175467b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public b f175468c = b.f175434g;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public c f175469d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public c f175470e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public c f175471f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public c f175472g;

            private b() {
                c cVar = c.f175445g;
                this.f175469d = cVar;
                this.f175470e = cVar;
                this.f175471f = cVar;
                this.f175472g = cVar;
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
            public final /* bridge */ /* synthetic */ n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
                i(dVar, eVar);
                return this;
            }

            @Override // z33.n.a
            public final n build() {
                d dVarG = g();
                if (dVarG.isInitialized()) {
                    return dVarG;
                }
                throw new UninitializedMessageException(dVarG);
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
            public final g.b b() {
                b bVar = new b();
                bVar.h(g());
                return bVar;
            }

            @Override // z33.g.b
            public final /* bridge */ /* synthetic */ g.b e(g gVar) {
                h((d) gVar);
                return this;
            }

            public final d g() {
                d dVar = new d(this);
                int i14 = this.f175467b;
                int i15 = (i14 & 1) != 1 ? 0 : 1;
                dVar.f175460c = this.f175468c;
                if ((i14 & 2) == 2) {
                    i15 |= 2;
                }
                dVar.f175461d = this.f175469d;
                if ((i14 & 4) == 4) {
                    i15 |= 4;
                }
                dVar.f175462e = this.f175470e;
                if ((i14 & 8) == 8) {
                    i15 |= 8;
                }
                dVar.f175463f = this.f175471f;
                if ((i14 & 16) == 16) {
                    i15 |= 16;
                }
                dVar.f175464g = this.f175472g;
                dVar.f175459b = i15;
                return dVar;
            }

            public final void h(d dVar) {
                c cVar;
                c cVar2;
                c cVar3;
                c cVar4;
                b bVar;
                if (dVar == d.f175456j) {
                    return;
                }
                if ((dVar.f175459b & 1) == 1) {
                    b bVar2 = dVar.f175460c;
                    if ((this.f175467b & 1) != 1 || (bVar = this.f175468c) == b.f175434g) {
                        this.f175468c = bVar2;
                    } else {
                        b.C3269b c3269bF = b.C3269b.f();
                        c3269bF.h(bVar);
                        c3269bF.h(bVar2);
                        this.f175468c = c3269bF.g();
                    }
                    this.f175467b |= 1;
                }
                if ((dVar.f175459b & 2) == 2) {
                    c cVar5 = dVar.f175461d;
                    if ((this.f175467b & 2) != 2 || (cVar4 = this.f175469d) == c.f175445g) {
                        this.f175469d = cVar5;
                    } else {
                        c.b bVarD = c.d(cVar4);
                        bVarD.h(cVar5);
                        this.f175469d = bVarD.g();
                    }
                    this.f175467b |= 2;
                }
                if (dVar.d()) {
                    c cVar6 = dVar.f175462e;
                    if ((this.f175467b & 4) != 4 || (cVar3 = this.f175470e) == c.f175445g) {
                        this.f175470e = cVar6;
                    } else {
                        c.b bVarD2 = c.d(cVar3);
                        bVarD2.h(cVar6);
                        this.f175470e = bVarD2.g();
                    }
                    this.f175467b |= 4;
                }
                if ((dVar.f175459b & 8) == 8) {
                    c cVar7 = dVar.f175463f;
                    if ((this.f175467b & 8) != 8 || (cVar2 = this.f175471f) == c.f175445g) {
                        this.f175471f = cVar7;
                    } else {
                        c.b bVarD3 = c.d(cVar2);
                        bVarD3.h(cVar7);
                        this.f175471f = bVarD3.g();
                    }
                    this.f175467b |= 8;
                }
                if ((dVar.f175459b & 16) == 16) {
                    c cVar8 = dVar.f175464g;
                    if ((this.f175467b & 16) != 16 || (cVar = this.f175472g) == c.f175445g) {
                        this.f175472g = cVar8;
                    } else {
                        c.b bVarD4 = c.d(cVar);
                        bVarD4.h(cVar8);
                        this.f175472g = bVarD4.g();
                    }
                    this.f175467b |= 16;
                }
                this.f202188a = this.f202188a.b(dVar.f175458a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(z33.d dVar, z33.e eVar) throws Throwable {
                d dVar2 = null;
                try {
                    try {
                        h((d) d.f175457k.a(dVar, eVar));
                    } catch (InvalidProtocolBufferException e4) {
                        d dVar3 = (d) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            dVar2 = dVar3;
                            if (dVar2 != null) {
                                h(dVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (dVar2 != null) {
                        h(dVar2);
                    }
                    throw th;
                }
            }
        }

        static {
            d dVar = new d(true);
            f175456j = dVar;
            dVar.f175460c = b.f175434g;
            c cVar = c.f175445g;
            dVar.f175461d = cVar;
            dVar.f175462e = cVar;
            dVar.f175463f = cVar;
            dVar.f175464g = cVar;
        }

        private d(z33.d dVar, z33.e eVar) {
            this.f175465h = (byte) -1;
            this.f175466i = -1;
            this.f175460c = b.f175434g;
            c cVar = c.f175445g;
            this.f175461d = cVar;
            this.f175462e = cVar;
            this.f175463f = cVar;
            this.f175464g = cVar;
            z33.c.b bVarI = z33.c.i();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
            boolean z14 = false;
            while (!z14) {
                try {
                    try {
                        int iO = dVar.o();
                        if (iO != 0) {
                            c.b bVarD = null;
                            b.C3269b c3269bF = null;
                            c.b bVarD2 = null;
                            c.b bVarD3 = null;
                            c.b bVarD4 = null;
                            if (iO == 10) {
                                if ((this.f175459b & 1) == 1) {
                                    b bVar = this.f175460c;
                                    bVar.getClass();
                                    c3269bF = b.C3269b.f();
                                    c3269bF.h(bVar);
                                }
                                b bVar2 = (b) dVar.h(b.f175435h, eVar);
                                this.f175460c = bVar2;
                                if (c3269bF != null) {
                                    c3269bF.h(bVar2);
                                    this.f175460c = c3269bF.g();
                                }
                                this.f175459b |= 1;
                            } else if (iO == 18) {
                                if ((this.f175459b & 2) == 2) {
                                    c cVar2 = this.f175461d;
                                    cVar2.getClass();
                                    bVarD2 = c.d(cVar2);
                                }
                                c cVar3 = (c) dVar.h(c.f175446h, eVar);
                                this.f175461d = cVar3;
                                if (bVarD2 != null) {
                                    bVarD2.h(cVar3);
                                    this.f175461d = bVarD2.g();
                                }
                                this.f175459b |= 2;
                            } else if (iO == 26) {
                                if ((this.f175459b & 4) == 4) {
                                    c cVar4 = this.f175462e;
                                    cVar4.getClass();
                                    bVarD3 = c.d(cVar4);
                                }
                                c cVar5 = (c) dVar.h(c.f175446h, eVar);
                                this.f175462e = cVar5;
                                if (bVarD3 != null) {
                                    bVarD3.h(cVar5);
                                    this.f175462e = bVarD3.g();
                                }
                                this.f175459b |= 4;
                            } else if (iO == 34) {
                                if ((this.f175459b & 8) == 8) {
                                    c cVar6 = this.f175463f;
                                    cVar6.getClass();
                                    bVarD4 = c.d(cVar6);
                                }
                                c cVar7 = (c) dVar.h(c.f175446h, eVar);
                                this.f175463f = cVar7;
                                if (bVarD4 != null) {
                                    bVarD4.h(cVar7);
                                    this.f175463f = bVarD4.g();
                                }
                                this.f175459b |= 8;
                            } else if (iO == 42) {
                                if ((this.f175459b & 16) == 16) {
                                    c cVar8 = this.f175464g;
                                    cVar8.getClass();
                                    bVarD = c.d(cVar8);
                                }
                                c cVar9 = (c) dVar.h(c.f175446h, eVar);
                                this.f175464g = cVar9;
                                if (bVarD != null) {
                                    bVarD.h(cVar9);
                                    this.f175464g = bVarD.g();
                                }
                                this.f175459b |= 16;
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
                        this.f175458a = bVarI.e();
                    }
                    throw th3;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f175458a = bVarI.e();
            }
        }

        @Override // z33.n
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f175459b & 1) == 1) {
                codedOutputStream.o(1, this.f175460c);
            }
            if ((this.f175459b & 2) == 2) {
                codedOutputStream.o(2, this.f175461d);
            }
            if ((this.f175459b & 4) == 4) {
                codedOutputStream.o(3, this.f175462e);
            }
            if ((this.f175459b & 8) == 8) {
                codedOutputStream.o(4, this.f175463f);
            }
            if ((this.f175459b & 16) == 16) {
                codedOutputStream.o(5, this.f175464g);
            }
            codedOutputStream.r(this.f175458a);
        }

        public final boolean d() {
            return (this.f175459b & 4) == 4;
        }

        @Override // z33.n
        public final int getSerializedSize() {
            int i14 = this.f175466i;
            if (i14 != -1) {
                return i14;
            }
            int iD = (this.f175459b & 1) == 1 ? CodedOutputStream.d(1, this.f175460c) : 0;
            if ((this.f175459b & 2) == 2) {
                iD += CodedOutputStream.d(2, this.f175461d);
            }
            if ((this.f175459b & 4) == 4) {
                iD += CodedOutputStream.d(3, this.f175462e);
            }
            if ((this.f175459b & 8) == 8) {
                iD += CodedOutputStream.d(4, this.f175463f);
            }
            if ((this.f175459b & 16) == 16) {
                iD += CodedOutputStream.d(5, this.f175464g);
            }
            int size = this.f175458a.size() + iD;
            this.f175466i = size;
            return size;
        }

        @Override // z33.o
        public final boolean isInitialized() {
            byte b14 = this.f175465h;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f175465h = (byte) 1;
            return true;
        }

        @Override // z33.n
        public final n.a newBuilderForType() {
            return b.f();
        }

        @Override // z33.n
        public final n.a toBuilder() {
            b bVarF = b.f();
            bVarF.h(this);
            return bVarF;
        }

        private d(g.b bVar) {
            super(bVar);
            this.f175465h = (byte) -1;
            this.f175466i = -1;
            this.f175458a = bVar.f202188a;
        }

        private d(boolean z14) {
            this.f175465h = (byte) -1;
            this.f175466i = -1;
            this.f175458a = z33.c.f202161a;
        }
    }
}
