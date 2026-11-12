package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends z33.g.d<t> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f156906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f156907q = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<u> f156912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f156913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f156915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<s33.b> f156917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<Integer> f156918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<d> f156919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f156920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f156921o;

    public static class a extends z33.b<t> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new t(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<t, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156923e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<u> f156925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public s f156926h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f156927i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public s f156928j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f156929k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<s33.b> f156930l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<Integer> f156931m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List<d> f156932n;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f156925g = list;
            s sVar = s.f156850w;
            this.f156926h = sVar;
            this.f156928j = sVar;
            this.f156930l = list;
            this.f156931m = list;
            this.f156932n = list;
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
            t tVarI = i();
            if (tVarI.isInitialized()) {
                return tVarI;
            }
            throw new UninitializedMessageException(tVarI);
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
            j((t) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final t i() {
            t tVar = new t(this);
            int i14 = this.f156922d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            tVar.f156910d = this.f156923e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            tVar.f156911e = this.f156924f;
            if ((i14 & 4) == 4) {
                this.f156925g = Collections.unmodifiableList(this.f156925g);
                this.f156922d &= -5;
            }
            tVar.f156912f = this.f156925g;
            if ((i14 & 8) == 8) {
                i15 |= 4;
            }
            tVar.f156913g = this.f156926h;
            if ((i14 & 16) == 16) {
                i15 |= 8;
            }
            tVar.f156914h = this.f156927i;
            if ((i14 & 32) == 32) {
                i15 |= 16;
            }
            tVar.f156915i = this.f156928j;
            if ((i14 & 64) == 64) {
                i15 |= 32;
            }
            tVar.f156916j = this.f156929k;
            if ((this.f156922d & 128) == 128) {
                this.f156930l = Collections.unmodifiableList(this.f156930l);
                this.f156922d &= -129;
            }
            tVar.f156917k = this.f156930l;
            if ((this.f156922d & 256) == 256) {
                this.f156931m = Collections.unmodifiableList(this.f156931m);
                this.f156922d &= -257;
            }
            tVar.f156918l = this.f156931m;
            if ((this.f156922d & 512) == 512) {
                this.f156932n = Collections.unmodifiableList(this.f156932n);
                this.f156922d &= -513;
            }
            tVar.f156919m = this.f156932n;
            tVar.f156909c = i15;
            return tVar;
        }

        public final void j(t tVar) {
            s sVar;
            s sVar2;
            if (tVar == t.f156906p) {
                return;
            }
            int i14 = tVar.f156909c;
            if ((i14 & 1) == 1) {
                int i15 = tVar.f156910d;
                this.f156922d = 1 | this.f156922d;
                this.f156923e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = tVar.f156911e;
                this.f156922d = 2 | this.f156922d;
                this.f156924f = i16;
            }
            if (!tVar.f156912f.isEmpty()) {
                if (this.f156925g.isEmpty()) {
                    this.f156925g = tVar.f156912f;
                    this.f156922d &= -5;
                } else {
                    if ((this.f156922d & 4) != 4) {
                        this.f156925g = new ArrayList(this.f156925g);
                        this.f156922d |= 4;
                    }
                    this.f156925g.addAll(tVar.f156912f);
                }
            }
            if ((tVar.f156909c & 4) == 4) {
                s sVar3 = tVar.f156913g;
                if ((this.f156922d & 8) != 8 || (sVar2 = this.f156926h) == s.f156850w) {
                    this.f156926h = sVar3;
                } else {
                    s.c cVarO = s.o(sVar2);
                    cVarO.j(sVar3);
                    this.f156926h = cVarO.i();
                }
                this.f156922d |= 8;
            }
            int i17 = tVar.f156909c;
            if ((i17 & 8) == 8) {
                int i18 = tVar.f156914h;
                this.f156922d |= 16;
                this.f156927i = i18;
            }
            if ((i17 & 16) == 16) {
                s sVar4 = tVar.f156915i;
                if ((this.f156922d & 32) != 32 || (sVar = this.f156928j) == s.f156850w) {
                    this.f156928j = sVar4;
                } else {
                    s.c cVarO2 = s.o(sVar);
                    cVarO2.j(sVar4);
                    this.f156928j = cVarO2.i();
                }
                this.f156922d |= 32;
            }
            if ((tVar.f156909c & 32) == 32) {
                int i19 = tVar.f156916j;
                this.f156922d |= 64;
                this.f156929k = i19;
            }
            if (!tVar.f156917k.isEmpty()) {
                if (this.f156930l.isEmpty()) {
                    this.f156930l = tVar.f156917k;
                    this.f156922d &= -129;
                } else {
                    if ((this.f156922d & 128) != 128) {
                        this.f156930l = new ArrayList(this.f156930l);
                        this.f156922d |= 128;
                    }
                    this.f156930l.addAll(tVar.f156917k);
                }
            }
            if (!tVar.f156918l.isEmpty()) {
                if (this.f156931m.isEmpty()) {
                    this.f156931m = tVar.f156918l;
                    this.f156922d &= -257;
                } else {
                    if ((this.f156922d & 256) != 256) {
                        this.f156931m = new ArrayList(this.f156931m);
                        this.f156922d |= 256;
                    }
                    this.f156931m.addAll(tVar.f156918l);
                }
            }
            if (!tVar.f156919m.isEmpty()) {
                if (this.f156932n.isEmpty()) {
                    this.f156932n = tVar.f156919m;
                    this.f156922d &= -513;
                } else {
                    if ((this.f156922d & 512) != 512) {
                        this.f156932n = new ArrayList(this.f156932n);
                        this.f156922d |= 512;
                    }
                    this.f156932n.addAll(tVar.f156919m);
                }
            }
            g(tVar);
            this.f202188a = this.f202188a.b(tVar.f156908b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            t tVar = null;
            try {
                try {
                    j((t) t.f156907q.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    t tVar2 = (t) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        tVar = tVar2;
                        if (tVar != null) {
                            j(tVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (tVar != null) {
                    j(tVar);
                }
                throw th;
            }
        }
    }

    static {
        t tVar = new t(true);
        f156906p = tVar;
        tVar.f156910d = 6;
        tVar.f156911e = 0;
        List list = Collections.EMPTY_LIST;
        tVar.f156912f = list;
        s sVar = s.f156850w;
        tVar.f156913g = sVar;
        tVar.f156914h = 0;
        tVar.f156915i = sVar;
        tVar.f156916j = 0;
        tVar.f156917k = list;
        tVar.f156918l = list;
        tVar.f156919m = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private t(z33.d dVar, z33.e eVar) {
        this.f156920n = (byte) -1;
        this.f156921o = -1;
        this.f156910d = 6;
        boolean z14 = false;
        this.f156911e = 0;
        List list = Collections.EMPTY_LIST;
        this.f156912f = list;
        s sVar = s.f156850w;
        this.f156913g = sVar;
        this.f156914h = 0;
        this.f156915i = sVar;
        this.f156916j = 0;
        this.f156917k = list;
        this.f156918l = list;
        this.f156919m = list;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    s.c cVarO = null;
                    switch (iO) {
                        case 0:
                            break;
                        case 8:
                            this.f156909c |= 1;
                            this.f156910d = dVar.l();
                            continue;
                        case 16:
                            this.f156909c |= 2;
                            this.f156911e = dVar.l();
                            continue;
                        case 26:
                            if ((i14 & 4) != 4) {
                                this.f156912f = new ArrayList();
                                i14 |= 4;
                            }
                            this.f156912f.add((u) dVar.h(u.f156934o, eVar));
                            continue;
                        case 34:
                            if ((this.f156909c & 4) == 4) {
                                s sVar2 = this.f156913g;
                                sVar2.getClass();
                                cVarO = s.o(sVar2);
                            }
                            s sVar3 = (s) dVar.h(s.f156851x, eVar);
                            this.f156913g = sVar3;
                            if (cVarO != null) {
                                cVarO.j(sVar3);
                                this.f156913g = cVarO.i();
                            }
                            this.f156909c |= 4;
                            continue;
                        case 40:
                            this.f156909c |= 8;
                            this.f156914h = dVar.l();
                            continue;
                        case 50:
                            if ((this.f156909c & 16) == 16) {
                                s sVar4 = this.f156915i;
                                sVar4.getClass();
                                cVarO = s.o(sVar4);
                            }
                            s sVar5 = (s) dVar.h(s.f156851x, eVar);
                            this.f156915i = sVar5;
                            if (cVarO != null) {
                                cVarO.j(sVar5);
                                this.f156915i = cVarO.i();
                            }
                            this.f156909c |= 16;
                            continue;
                        case 56:
                            this.f156909c |= 32;
                            this.f156916j = dVar.l();
                            continue;
                        case 66:
                            if ((i14 & 128) != 128) {
                                this.f156917k = new ArrayList();
                                i14 |= 128;
                            }
                            this.f156917k.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            continue;
                        case 248:
                            if ((i14 & 256) != 256) {
                                this.f156918l = new ArrayList();
                                i14 |= 256;
                            }
                            this.f156918l.add(Integer.valueOf(dVar.l()));
                            continue;
                        case 250:
                            int iE = dVar.e(dVar.l());
                            if ((i14 & 256) != 256 && dVar.b() > 0) {
                                this.f156918l = new ArrayList();
                                i14 |= 256;
                            }
                            while (dVar.b() > 0) {
                                this.f156918l.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.d(iE);
                            continue;
                        case 258:
                            if ((i14 & 512) != 512) {
                                this.f156919m = new ArrayList();
                                i14 |= 512;
                            }
                            this.f156919m.add((d) dVar.h(d.f156577h, eVar));
                            continue;
                        default:
                            if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                                break;
                            }
                            break;
                    }
                    z14 = true;
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(this);
                } catch (IOException e14) {
                    throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th3) {
                if ((i14 & 4) == 4) {
                    this.f156912f = Collections.unmodifiableList(this.f156912f);
                }
                if ((i14 & 128) == 128) {
                    this.f156917k = Collections.unmodifiableList(this.f156917k);
                }
                if ((i14 & 256) == 256) {
                    this.f156918l = Collections.unmodifiableList(this.f156918l);
                }
                if ((i14 & 512) == 512) {
                    this.f156919m = Collections.unmodifiableList(this.f156919m);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156908b = bVarI.e();
                }
                h();
                throw th3;
            }
        }
        if ((i14 & 4) == 4) {
            this.f156912f = Collections.unmodifiableList(this.f156912f);
        }
        if ((i14 & 128) == 128) {
            this.f156917k = Collections.unmodifiableList(this.f156917k);
        }
        if ((i14 & 256) == 256) {
            this.f156918l = Collections.unmodifiableList(this.f156918l);
        }
        if ((i14 & 512) == 512) {
            this.f156919m = Collections.unmodifiableList(this.f156919m);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156908b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156909c & 1) == 1) {
            codedOutputStream.m(1, this.f156910d);
        }
        if ((this.f156909c & 2) == 2) {
            codedOutputStream.m(2, this.f156911e);
        }
        for (int i14 = 0; i14 < this.f156912f.size(); i14++) {
            codedOutputStream.o(3, this.f156912f.get(i14));
        }
        if ((this.f156909c & 4) == 4) {
            codedOutputStream.o(4, this.f156913g);
        }
        if ((this.f156909c & 8) == 8) {
            codedOutputStream.m(5, this.f156914h);
        }
        if ((this.f156909c & 16) == 16) {
            codedOutputStream.o(6, this.f156915i);
        }
        if ((this.f156909c & 32) == 32) {
            codedOutputStream.m(7, this.f156916j);
        }
        for (int i15 = 0; i15 < this.f156917k.size(); i15++) {
            codedOutputStream.o(8, this.f156917k.get(i15));
        }
        for (int i16 = 0; i16 < this.f156918l.size(); i16++) {
            codedOutputStream.m(31, this.f156918l.get(i16).intValue());
        }
        for (int i17 = 0; i17 < this.f156919m.size(); i17++) {
            codedOutputStream.o(32, this.f156919m.get(i17));
        }
        aVarI.a(200, codedOutputStream);
        codedOutputStream.r(this.f156908b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156906p;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        int i14 = this.f156921o;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156909c & 1) == 1 ? CodedOutputStream.b(1, this.f156910d) : 0;
        if ((this.f156909c & 2) == 2) {
            iB += CodedOutputStream.b(2, this.f156911e);
        }
        for (int i15 = 0; i15 < this.f156912f.size(); i15++) {
            iB += CodedOutputStream.d(3, this.f156912f.get(i15));
        }
        if ((this.f156909c & 4) == 4) {
            iB += CodedOutputStream.d(4, this.f156913g);
        }
        if ((this.f156909c & 8) == 8) {
            iB += CodedOutputStream.b(5, this.f156914h);
        }
        if ((this.f156909c & 16) == 16) {
            iB += CodedOutputStream.d(6, this.f156915i);
        }
        if ((this.f156909c & 32) == 32) {
            iB += CodedOutputStream.b(7, this.f156916j);
        }
        for (int i16 = 0; i16 < this.f156917k.size(); i16++) {
            iB += CodedOutputStream.d(8, this.f156917k.get(i16));
        }
        int i17 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156918l.size();
            list = this.f156918l;
            if (i17 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i17).intValue());
            i17++;
        }
        int iC2 = org.apache.commons.lang3.e.c(2, iB + iC, list);
        for (int i18 = 0; i18 < this.f156919m.size(); i18++) {
            iC2 += CodedOutputStream.d(32, this.f156919m.get(i18));
        }
        int size2 = this.f156908b.size() + e() + iC2;
        this.f156921o = size2;
        return size2;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156920n;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        if ((this.f156909c & 2) != 2) {
            this.f156920n = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f156912f.size(); i14++) {
            if (!this.f156912f.get(i14).isInitialized()) {
                this.f156920n = (byte) 0;
                return false;
            }
        }
        if ((this.f156909c & 4) == 4 && !this.f156913g.isInitialized()) {
            this.f156920n = (byte) 0;
            return false;
        }
        if ((this.f156909c & 16) == 16 && !this.f156915i.isInitialized()) {
            this.f156920n = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156917k.size(); i15++) {
            if (!this.f156917k.get(i15).isInitialized()) {
                this.f156920n = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f156919m.size(); i16++) {
            if (!this.f156919m.get(i16).isInitialized()) {
                this.f156920n = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156920n = (byte) 1;
            return true;
        }
        this.f156920n = (byte) 0;
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

    private t(z33.g.c<t, ?> cVar) {
        super(cVar);
        this.f156920n = (byte) -1;
        this.f156921o = -1;
        this.f156908b = cVar.f202188a;
    }

    private t(boolean z14) {
        this.f156920n = (byte) -1;
        this.f156921o = -1;
        this.f156908b = z33.c.f202161a;
    }
}
