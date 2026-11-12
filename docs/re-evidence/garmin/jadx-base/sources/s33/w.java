package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends z33.g.d<w> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w f156971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f156972o = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f156977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f156979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<s33.b> f156981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s33.b.C2953b.c f156982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f156983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f156984m;

    public static class a extends z33.b<w> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new w(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<w, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156987f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public s f156988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f156989h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public s f156990i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f156991j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<s33.b> f156992k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public s33.b.C2953b.c f156993l;

        private b() {
            s sVar = s.f156850w;
            this.f156988g = sVar;
            this.f156990i = sVar;
            this.f156992k = Collections.EMPTY_LIST;
            this.f156993l = s33.b.C2953b.c.f156476p;
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
            w wVarI = i();
            if (wVarI.isInitialized()) {
                return wVarI;
            }
            throw new UninitializedMessageException(wVarI);
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
            j((w) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final w i() {
            w wVar = new w(this);
            int i14 = this.f156985d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            wVar.f156975d = this.f156986e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            wVar.f156976e = this.f156987f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            wVar.f156977f = this.f156988g;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            wVar.f156978g = this.f156989h;
            if ((i14 & 16) == 16) {
                i15 |= 16;
            }
            wVar.f156979h = this.f156990i;
            if ((i14 & 32) == 32) {
                i15 |= 32;
            }
            wVar.f156980i = this.f156991j;
            if ((i14 & 64) == 64) {
                this.f156992k = Collections.unmodifiableList(this.f156992k);
                this.f156985d &= -65;
            }
            wVar.f156981j = this.f156992k;
            if ((i14 & 128) == 128) {
                i15 |= 64;
            }
            wVar.f156982k = this.f156993l;
            wVar.f156974c = i15;
            return wVar;
        }

        public final void j(w wVar) {
            s33.b.C2953b.c cVar;
            s sVar;
            s sVar2;
            if (wVar == w.f156971n) {
                return;
            }
            int i14 = wVar.f156974c;
            if ((i14 & 1) == 1) {
                int i15 = wVar.f156975d;
                this.f156985d = 1 | this.f156985d;
                this.f156986e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = wVar.f156976e;
                this.f156985d = 2 | this.f156985d;
                this.f156987f = i16;
            }
            if ((i14 & 4) == 4) {
                s sVar3 = wVar.f156977f;
                if ((this.f156985d & 4) != 4 || (sVar2 = this.f156988g) == s.f156850w) {
                    this.f156988g = sVar3;
                } else {
                    s.c cVarO = s.o(sVar2);
                    cVarO.j(sVar3);
                    this.f156988g = cVarO.i();
                }
                this.f156985d |= 4;
            }
            int i17 = wVar.f156974c;
            if ((i17 & 8) == 8) {
                int i18 = wVar.f156978g;
                this.f156985d = 8 | this.f156985d;
                this.f156989h = i18;
            }
            if ((i17 & 16) == 16) {
                s sVar4 = wVar.f156979h;
                if ((this.f156985d & 16) != 16 || (sVar = this.f156990i) == s.f156850w) {
                    this.f156990i = sVar4;
                } else {
                    s.c cVarO2 = s.o(sVar);
                    cVarO2.j(sVar4);
                    this.f156990i = cVarO2.i();
                }
                this.f156985d |= 16;
            }
            if ((wVar.f156974c & 32) == 32) {
                int i19 = wVar.f156980i;
                this.f156985d = 32 | this.f156985d;
                this.f156991j = i19;
            }
            if (!wVar.f156981j.isEmpty()) {
                if (this.f156992k.isEmpty()) {
                    this.f156992k = wVar.f156981j;
                    this.f156985d &= -65;
                } else {
                    if ((this.f156985d & 64) != 64) {
                        this.f156992k = new ArrayList(this.f156992k);
                        this.f156985d |= 64;
                    }
                    this.f156992k.addAll(wVar.f156981j);
                }
            }
            if ((wVar.f156974c & 64) == 64) {
                s33.b.C2953b.c cVar2 = wVar.f156982k;
                if ((this.f156985d & 128) != 128 || (cVar = this.f156993l) == s33.b.C2953b.c.f156476p) {
                    this.f156993l = cVar2;
                } else {
                    s33.b.C2953b.c.C2955b c2955bE = s33.b.C2953b.c.e(cVar);
                    c2955bE.h(cVar2);
                    this.f156993l = c2955bE.g();
                }
                this.f156985d |= 128;
            }
            g(wVar);
            this.f202188a = this.f202188a.b(wVar.f156973b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            w wVar = null;
            try {
                try {
                    j((w) w.f156972o.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    w wVar2 = (w) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        wVar = wVar2;
                        if (wVar != null) {
                            j(wVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (wVar != null) {
                    j(wVar);
                }
                throw th;
            }
        }
    }

    static {
        w wVar = new w(true);
        f156971n = wVar;
        wVar.f156975d = 0;
        wVar.f156976e = 0;
        s sVar = s.f156850w;
        wVar.f156977f = sVar;
        wVar.f156978g = 0;
        wVar.f156979h = sVar;
        wVar.f156980i = 0;
        wVar.f156981j = Collections.EMPTY_LIST;
        wVar.f156982k = s33.b.C2953b.c.f156476p;
    }

    private w(z33.d dVar, z33.e eVar) {
        this.f156983l = (byte) -1;
        this.f156984m = -1;
        boolean z14 = false;
        this.f156975d = 0;
        this.f156976e = 0;
        s sVar = s.f156850w;
        this.f156977f = sVar;
        this.f156978g = 0;
        this.f156979h = sVar;
        this.f156980i = 0;
        this.f156981j = Collections.EMPTY_LIST;
        this.f156982k = s33.b.C2953b.c.f156476p;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        char c14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.f156974c |= 1;
                            this.f156975d = dVar.l();
                        } else if (iO != 16) {
                            s33.b.C2953b.c.C2955b c2955bE = null;
                            s.c cVarO = null;
                            s.c cVarO2 = null;
                            if (iO == 26) {
                                if ((this.f156974c & 4) == 4) {
                                    s sVar2 = this.f156977f;
                                    sVar2.getClass();
                                    cVarO = s.o(sVar2);
                                }
                                s sVar3 = (s) dVar.h(s.f156851x, eVar);
                                this.f156977f = sVar3;
                                if (cVarO != null) {
                                    cVarO.j(sVar3);
                                    this.f156977f = cVarO.i();
                                }
                                this.f156974c |= 4;
                            } else if (iO == 34) {
                                if ((this.f156974c & 16) == 16) {
                                    s sVar4 = this.f156979h;
                                    sVar4.getClass();
                                    cVarO2 = s.o(sVar4);
                                }
                                s sVar5 = (s) dVar.h(s.f156851x, eVar);
                                this.f156979h = sVar5;
                                if (cVarO2 != null) {
                                    cVarO2.j(sVar5);
                                    this.f156979h = cVarO2.i();
                                }
                                this.f156974c |= 16;
                            } else if (iO == 40) {
                                this.f156974c |= 8;
                                this.f156978g = dVar.l();
                            } else if (iO == 48) {
                                this.f156974c |= 32;
                                this.f156980i = dVar.l();
                            } else if (iO == 58) {
                                int i14 = (c14 == true ? 1 : 0) & '@';
                                c14 = c14;
                                if (i14 != 64) {
                                    this.f156981j = new ArrayList();
                                    c14 = '@';
                                }
                                this.f156981j.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            } else if (iO == 66) {
                                if ((this.f156974c & 64) == 64) {
                                    s33.b.C2953b.c cVar = this.f156982k;
                                    cVar.getClass();
                                    c2955bE = s33.b.C2953b.c.e(cVar);
                                }
                                s33.b.C2953b.c cVar2 = (s33.b.C2953b.c) dVar.h(s33.b.C2953b.c.f156477q, eVar);
                                this.f156982k = cVar2;
                                if (c2955bE != null) {
                                    c2955bE.h(cVar2);
                                    this.f156982k = c2955bE.g();
                                }
                                this.f156974c |= 64;
                            } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                            }
                        } else {
                            this.f156974c |= 2;
                            this.f156976e = dVar.l();
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (((c14 == true ? 1 : 0) & '@') == 64) {
                        this.f156981j = Collections.unmodifiableList(this.f156981j);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156973b = bVarI.e();
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
        if (((c14 == true ? 1 : 0) & '@') == 64) {
            this.f156981j = Collections.unmodifiableList(this.f156981j);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156973b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156974c & 1) == 1) {
            codedOutputStream.m(1, this.f156975d);
        }
        if ((this.f156974c & 2) == 2) {
            codedOutputStream.m(2, this.f156976e);
        }
        if ((this.f156974c & 4) == 4) {
            codedOutputStream.o(3, this.f156977f);
        }
        if ((this.f156974c & 16) == 16) {
            codedOutputStream.o(4, this.f156979h);
        }
        if ((this.f156974c & 8) == 8) {
            codedOutputStream.m(5, this.f156978g);
        }
        if ((this.f156974c & 32) == 32) {
            codedOutputStream.m(6, this.f156980i);
        }
        for (int i14 = 0; i14 < this.f156981j.size(); i14++) {
            codedOutputStream.o(7, this.f156981j.get(i14));
        }
        if ((this.f156974c & 64) == 64) {
            codedOutputStream.o(8, this.f156982k);
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156973b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156971n;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f156984m;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156974c & 1) == 1 ? CodedOutputStream.b(1, this.f156975d) : 0;
        if ((this.f156974c & 2) == 2) {
            iB += CodedOutputStream.b(2, this.f156976e);
        }
        if ((this.f156974c & 4) == 4) {
            iB += CodedOutputStream.d(3, this.f156977f);
        }
        if ((this.f156974c & 16) == 16) {
            iB += CodedOutputStream.d(4, this.f156979h);
        }
        if ((this.f156974c & 8) == 8) {
            iB += CodedOutputStream.b(5, this.f156978g);
        }
        if ((this.f156974c & 32) == 32) {
            iB += CodedOutputStream.b(6, this.f156980i);
        }
        for (int i15 = 0; i15 < this.f156981j.size(); i15++) {
            iB += CodedOutputStream.d(7, this.f156981j.get(i15));
        }
        if ((this.f156974c & 64) == 64) {
            iB += CodedOutputStream.d(8, this.f156982k);
        }
        int size = this.f156973b.size() + e() + iB;
        this.f156984m = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156983l;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        int i14 = this.f156974c;
        if ((i14 & 2) != 2) {
            this.f156983l = (byte) 0;
            return false;
        }
        if ((i14 & 4) == 4 && !this.f156977f.isInitialized()) {
            this.f156983l = (byte) 0;
            return false;
        }
        if ((this.f156974c & 16) == 16 && !this.f156979h.isInitialized()) {
            this.f156983l = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156981j.size(); i15++) {
            if (!this.f156981j.get(i15).isInitialized()) {
                this.f156983l = (byte) 0;
                return false;
            }
        }
        if ((this.f156974c & 64) == 64 && !this.f156982k.isInitialized()) {
            this.f156983l = (byte) 0;
            return false;
        }
        if (d()) {
            this.f156983l = (byte) 1;
            return true;
        }
        this.f156983l = (byte) 0;
        return false;
    }

    public final b m() {
        b bVarH = b.h();
        bVarH.j(this);
        return bVarH;
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

    private w(z33.g.c<w, ?> cVar) {
        super(cVar);
        this.f156983l = (byte) -1;
        this.f156984m = -1;
        this.f156973b = cVar.f202188a;
    }

    private w(boolean z14) {
        this.f156983l = (byte) -1;
        this.f156984m = -1;
        this.f156973b = z33.c.f202161a;
    }
}
