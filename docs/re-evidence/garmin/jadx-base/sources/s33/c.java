package s33;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends z33.g.d<c> {
    public static final c T;
    public static final a X = new a();
    public int A;
    public List<s33.b> B;
    public v C;
    public List<Integer> D;
    public y E;
    public List<d> F;
    public byte I;
    public int P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<u> f156528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<s> f156529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f156530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f156532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<s> f156534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Integer> f156535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f156536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<e> f156537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<j> f156538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<o> f156539r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<t> f156540t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<h> f156541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<Integer> f156542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156543x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156544y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f156545z;

    public static class a extends z33.b<c> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new c(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<c, b> {
        public List<Integer> A;
        public y B;
        public List<d> C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156547e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<u> f156550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<s> f156551i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<Integer> f156552j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Integer> f156553k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<s> f156554l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<Integer> f156555m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List<e> f156556n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<j> f156557o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<o> f156558p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<t> f156559q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<h> f156560r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List<Integer> f156561t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f156562v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public s f156563w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f156564x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public List<s33.b> f156565y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public v f156566z;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f156550h = list;
            this.f156551i = list;
            this.f156552j = list;
            this.f156553k = list;
            this.f156554l = list;
            this.f156555m = list;
            this.f156556n = list;
            this.f156557o = list;
            this.f156558p = list;
            this.f156559q = list;
            this.f156560r = list;
            this.f156561t = list;
            this.f156563w = s.f156850w;
            this.f156565y = list;
            this.f156566z = v.f156960g;
            this.A = list;
            this.B = y.f157023e;
            this.C = list;
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
            c cVarI = i();
            if (cVarI.isInitialized()) {
                return cVarI;
            }
            throw new UninitializedMessageException(cVarI);
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
            j((c) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final c i() {
            c cVar = new c(this);
            int i14 = this.f156546d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            cVar.f156525d = this.f156547e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            cVar.f156526e = this.f156548f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            cVar.f156527f = this.f156549g;
            if ((i14 & 8) == 8) {
                this.f156550h = Collections.unmodifiableList(this.f156550h);
                this.f156546d &= -9;
            }
            cVar.f156528g = this.f156550h;
            if ((this.f156546d & 16) == 16) {
                this.f156551i = Collections.unmodifiableList(this.f156551i);
                this.f156546d &= -17;
            }
            cVar.f156529h = this.f156551i;
            if ((this.f156546d & 32) == 32) {
                this.f156552j = Collections.unmodifiableList(this.f156552j);
                this.f156546d &= -33;
            }
            cVar.f156530i = this.f156552j;
            if ((this.f156546d & 64) == 64) {
                this.f156553k = Collections.unmodifiableList(this.f156553k);
                this.f156546d &= -65;
            }
            cVar.f156532k = this.f156553k;
            if ((this.f156546d & 128) == 128) {
                this.f156554l = Collections.unmodifiableList(this.f156554l);
                this.f156546d &= -129;
            }
            cVar.f156534m = this.f156554l;
            if ((this.f156546d & 256) == 256) {
                this.f156555m = Collections.unmodifiableList(this.f156555m);
                this.f156546d &= -257;
            }
            cVar.f156535n = this.f156555m;
            if ((this.f156546d & 512) == 512) {
                this.f156556n = Collections.unmodifiableList(this.f156556n);
                this.f156546d &= -513;
            }
            cVar.f156537p = this.f156556n;
            if ((this.f156546d & 1024) == 1024) {
                this.f156557o = Collections.unmodifiableList(this.f156557o);
                this.f156546d &= -1025;
            }
            cVar.f156538q = this.f156557o;
            if ((this.f156546d & 2048) == 2048) {
                this.f156558p = Collections.unmodifiableList(this.f156558p);
                this.f156546d &= -2049;
            }
            cVar.f156539r = this.f156558p;
            if ((this.f156546d & 4096) == 4096) {
                this.f156559q = Collections.unmodifiableList(this.f156559q);
                this.f156546d &= -4097;
            }
            cVar.f156540t = this.f156559q;
            if ((this.f156546d & 8192) == 8192) {
                this.f156560r = Collections.unmodifiableList(this.f156560r);
                this.f156546d &= -8193;
            }
            cVar.f156541v = this.f156560r;
            if ((this.f156546d & 16384) == 16384) {
                this.f156561t = Collections.unmodifiableList(this.f156561t);
                this.f156546d &= -16385;
            }
            cVar.f156542w = this.f156561t;
            if ((i14 & 32768) == 32768) {
                i15 |= 8;
            }
            cVar.f156544y = this.f156562v;
            if ((i14 & 65536) == 65536) {
                i15 |= 16;
            }
            cVar.f156545z = this.f156563w;
            if ((i14 & 131072) == 131072) {
                i15 |= 32;
            }
            cVar.A = this.f156564x;
            if ((this.f156546d & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 262144) {
                this.f156565y = Collections.unmodifiableList(this.f156565y);
                this.f156546d &= -262145;
            }
            cVar.B = this.f156565y;
            if ((i14 & 524288) == 524288) {
                i15 |= 64;
            }
            cVar.C = this.f156566z;
            if ((this.f156546d & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                this.A = Collections.unmodifiableList(this.A);
                this.f156546d &= -1048577;
            }
            cVar.D = this.A;
            if ((i14 & 2097152) == 2097152) {
                i15 |= 128;
            }
            cVar.E = this.B;
            if ((this.f156546d & 4194304) == 4194304) {
                this.C = Collections.unmodifiableList(this.C);
                this.f156546d &= -4194305;
            }
            cVar.F = this.C;
            cVar.f156524c = i15;
            return cVar;
        }

        public final void j(c cVar) {
            y yVar;
            v vVar;
            s sVar;
            if (cVar == c.T) {
                return;
            }
            int i14 = cVar.f156524c;
            if ((i14 & 1) == 1) {
                int i15 = cVar.f156525d;
                this.f156546d = 1 | this.f156546d;
                this.f156547e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = cVar.f156526e;
                this.f156546d = 2 | this.f156546d;
                this.f156548f = i16;
            }
            if ((i14 & 4) == 4) {
                int i17 = cVar.f156527f;
                this.f156546d = 4 | this.f156546d;
                this.f156549g = i17;
            }
            if (!cVar.f156528g.isEmpty()) {
                if (this.f156550h.isEmpty()) {
                    this.f156550h = cVar.f156528g;
                    this.f156546d &= -9;
                } else {
                    if ((this.f156546d & 8) != 8) {
                        this.f156550h = new ArrayList(this.f156550h);
                        this.f156546d |= 8;
                    }
                    this.f156550h.addAll(cVar.f156528g);
                }
            }
            if (!cVar.f156529h.isEmpty()) {
                if (this.f156551i.isEmpty()) {
                    this.f156551i = cVar.f156529h;
                    this.f156546d &= -17;
                } else {
                    if ((this.f156546d & 16) != 16) {
                        this.f156551i = new ArrayList(this.f156551i);
                        this.f156546d |= 16;
                    }
                    this.f156551i.addAll(cVar.f156529h);
                }
            }
            if (!cVar.f156530i.isEmpty()) {
                if (this.f156552j.isEmpty()) {
                    this.f156552j = cVar.f156530i;
                    this.f156546d &= -33;
                } else {
                    if ((this.f156546d & 32) != 32) {
                        this.f156552j = new ArrayList(this.f156552j);
                        this.f156546d |= 32;
                    }
                    this.f156552j.addAll(cVar.f156530i);
                }
            }
            if (!cVar.f156532k.isEmpty()) {
                if (this.f156553k.isEmpty()) {
                    this.f156553k = cVar.f156532k;
                    this.f156546d &= -65;
                } else {
                    if ((this.f156546d & 64) != 64) {
                        this.f156553k = new ArrayList(this.f156553k);
                        this.f156546d |= 64;
                    }
                    this.f156553k.addAll(cVar.f156532k);
                }
            }
            if (!cVar.f156534m.isEmpty()) {
                if (this.f156554l.isEmpty()) {
                    this.f156554l = cVar.f156534m;
                    this.f156546d &= -129;
                } else {
                    if ((this.f156546d & 128) != 128) {
                        this.f156554l = new ArrayList(this.f156554l);
                        this.f156546d |= 128;
                    }
                    this.f156554l.addAll(cVar.f156534m);
                }
            }
            if (!cVar.f156535n.isEmpty()) {
                if (this.f156555m.isEmpty()) {
                    this.f156555m = cVar.f156535n;
                    this.f156546d &= -257;
                } else {
                    if ((this.f156546d & 256) != 256) {
                        this.f156555m = new ArrayList(this.f156555m);
                        this.f156546d |= 256;
                    }
                    this.f156555m.addAll(cVar.f156535n);
                }
            }
            if (!cVar.f156537p.isEmpty()) {
                if (this.f156556n.isEmpty()) {
                    this.f156556n = cVar.f156537p;
                    this.f156546d &= -513;
                } else {
                    if ((this.f156546d & 512) != 512) {
                        this.f156556n = new ArrayList(this.f156556n);
                        this.f156546d |= 512;
                    }
                    this.f156556n.addAll(cVar.f156537p);
                }
            }
            if (!cVar.f156538q.isEmpty()) {
                if (this.f156557o.isEmpty()) {
                    this.f156557o = cVar.f156538q;
                    this.f156546d &= -1025;
                } else {
                    if ((this.f156546d & 1024) != 1024) {
                        this.f156557o = new ArrayList(this.f156557o);
                        this.f156546d |= 1024;
                    }
                    this.f156557o.addAll(cVar.f156538q);
                }
            }
            if (!cVar.f156539r.isEmpty()) {
                if (this.f156558p.isEmpty()) {
                    this.f156558p = cVar.f156539r;
                    this.f156546d &= -2049;
                } else {
                    if ((this.f156546d & 2048) != 2048) {
                        this.f156558p = new ArrayList(this.f156558p);
                        this.f156546d |= 2048;
                    }
                    this.f156558p.addAll(cVar.f156539r);
                }
            }
            if (!cVar.f156540t.isEmpty()) {
                if (this.f156559q.isEmpty()) {
                    this.f156559q = cVar.f156540t;
                    this.f156546d &= -4097;
                } else {
                    if ((this.f156546d & 4096) != 4096) {
                        this.f156559q = new ArrayList(this.f156559q);
                        this.f156546d |= 4096;
                    }
                    this.f156559q.addAll(cVar.f156540t);
                }
            }
            if (!cVar.f156541v.isEmpty()) {
                if (this.f156560r.isEmpty()) {
                    this.f156560r = cVar.f156541v;
                    this.f156546d &= -8193;
                } else {
                    if ((this.f156546d & 8192) != 8192) {
                        this.f156560r = new ArrayList(this.f156560r);
                        this.f156546d |= 8192;
                    }
                    this.f156560r.addAll(cVar.f156541v);
                }
            }
            if (!cVar.f156542w.isEmpty()) {
                if (this.f156561t.isEmpty()) {
                    this.f156561t = cVar.f156542w;
                    this.f156546d &= -16385;
                } else {
                    if ((this.f156546d & 16384) != 16384) {
                        this.f156561t = new ArrayList(this.f156561t);
                        this.f156546d |= 16384;
                    }
                    this.f156561t.addAll(cVar.f156542w);
                }
            }
            int i18 = cVar.f156524c;
            if ((i18 & 8) == 8) {
                int i19 = cVar.f156544y;
                this.f156546d |= 32768;
                this.f156562v = i19;
            }
            if ((i18 & 16) == 16) {
                s sVar2 = cVar.f156545z;
                if ((this.f156546d & 65536) != 65536 || (sVar = this.f156563w) == s.f156850w) {
                    this.f156563w = sVar2;
                } else {
                    s.c cVarO = s.o(sVar);
                    cVarO.j(sVar2);
                    this.f156563w = cVarO.i();
                }
                this.f156546d |= 65536;
            }
            if ((cVar.f156524c & 32) == 32) {
                int i24 = cVar.A;
                this.f156546d |= 131072;
                this.f156564x = i24;
            }
            if (!cVar.B.isEmpty()) {
                if (this.f156565y.isEmpty()) {
                    this.f156565y = cVar.B;
                    this.f156546d &= -262145;
                } else {
                    if ((this.f156546d & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 262144) {
                        this.f156565y = new ArrayList(this.f156565y);
                        this.f156546d |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    }
                    this.f156565y.addAll(cVar.B);
                }
            }
            if ((cVar.f156524c & 64) == 64) {
                v vVar2 = cVar.C;
                if ((this.f156546d & 524288) != 524288 || (vVar = this.f156566z) == v.f156960g) {
                    this.f156566z = vVar2;
                } else {
                    v.b bVarD = v.d(vVar);
                    bVarD.h(vVar2);
                    this.f156566z = bVarD.g();
                }
                this.f156546d |= 524288;
            }
            if (!cVar.D.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = cVar.D;
                    this.f156546d &= -1048577;
                } else {
                    if ((this.f156546d & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                        this.A = new ArrayList(this.A);
                        this.f156546d |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    }
                    this.A.addAll(cVar.D);
                }
            }
            if ((cVar.f156524c & 128) == 128) {
                y yVar2 = cVar.E;
                if ((this.f156546d & 2097152) != 2097152 || (yVar = this.B) == y.f157023e) {
                    this.B = yVar2;
                } else {
                    y.b bVarF = y.b.f();
                    bVarF.h(yVar);
                    bVarF.h(yVar2);
                    this.B = bVarF.g();
                }
                this.f156546d |= 2097152;
            }
            if (!cVar.F.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = cVar.F;
                    this.f156546d &= -4194305;
                } else {
                    if ((this.f156546d & 4194304) != 4194304) {
                        this.C = new ArrayList(this.C);
                        this.f156546d |= 4194304;
                    }
                    this.C.addAll(cVar.F);
                }
            }
            g(cVar);
            this.f202188a = this.f202188a.b(cVar.f156523b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            c cVar = null;
            try {
                try {
                    j((c) c.X.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    c cVar2 = (c) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        cVar = cVar2;
                        if (cVar != null) {
                            j(cVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (cVar != null) {
                    j(cVar);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s33.c$c, reason: collision with other inner class name */
    public enum EnumC2957c implements z33.h.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f156575a;

        /* JADX INFO: renamed from: s33.c$c$a */
        public static class a implements z33.h.b<EnumC2957c> {
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                switch (i14) {
                    case 0:
                        return EnumC2957c.CLASS;
                    case 1:
                        return EnumC2957c.INTERFACE;
                    case 2:
                        return EnumC2957c.ENUM_CLASS;
                    case 3:
                        return EnumC2957c.ENUM_ENTRY;
                    case 4:
                        return EnumC2957c.ANNOTATION_CLASS;
                    case 5:
                        return EnumC2957c.OBJECT;
                    case 6:
                        return EnumC2957c.COMPANION_OBJECT;
                    default:
                        EnumC2957c enumC2957c = EnumC2957c.CLASS;
                        return null;
                }
            }
        }

        static {
            new a();
        }

        EnumC2957c(int i14, int i15) {
            this.f156575a = i15;
        }

        @Override // z33.h.a
        public final int getNumber() {
            return this.f156575a;
        }
    }

    static {
        c cVar = new c(true);
        T = cVar;
        cVar.m();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private c(z33.d r22, z33.e r23) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s33.c.<init>(z33.d, z33.e):void");
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156524c & 1) == 1) {
            codedOutputStream.m(1, this.f156525d);
        }
        if (this.f156530i.size() > 0) {
            codedOutputStream.v(18);
            codedOutputStream.v(this.f156531j);
        }
        for (int i14 = 0; i14 < this.f156530i.size(); i14++) {
            codedOutputStream.n(this.f156530i.get(i14).intValue());
        }
        if ((this.f156524c & 2) == 2) {
            codedOutputStream.m(3, this.f156526e);
        }
        if ((this.f156524c & 4) == 4) {
            codedOutputStream.m(4, this.f156527f);
        }
        for (int i15 = 0; i15 < this.f156528g.size(); i15++) {
            codedOutputStream.o(5, this.f156528g.get(i15));
        }
        for (int i16 = 0; i16 < this.f156529h.size(); i16++) {
            codedOutputStream.o(6, this.f156529h.get(i16));
        }
        if (this.f156532k.size() > 0) {
            codedOutputStream.v(58);
            codedOutputStream.v(this.f156533l);
        }
        for (int i17 = 0; i17 < this.f156532k.size(); i17++) {
            codedOutputStream.n(this.f156532k.get(i17).intValue());
        }
        for (int i18 = 0; i18 < this.f156537p.size(); i18++) {
            codedOutputStream.o(8, this.f156537p.get(i18));
        }
        for (int i19 = 0; i19 < this.f156538q.size(); i19++) {
            codedOutputStream.o(9, this.f156538q.get(i19));
        }
        for (int i24 = 0; i24 < this.f156539r.size(); i24++) {
            codedOutputStream.o(10, this.f156539r.get(i24));
        }
        for (int i25 = 0; i25 < this.f156540t.size(); i25++) {
            codedOutputStream.o(11, this.f156540t.get(i25));
        }
        for (int i26 = 0; i26 < this.f156541v.size(); i26++) {
            codedOutputStream.o(13, this.f156541v.get(i26));
        }
        if (this.f156542w.size() > 0) {
            codedOutputStream.v(130);
            codedOutputStream.v(this.f156543x);
        }
        for (int i27 = 0; i27 < this.f156542w.size(); i27++) {
            codedOutputStream.n(this.f156542w.get(i27).intValue());
        }
        if ((this.f156524c & 8) == 8) {
            codedOutputStream.m(17, this.f156544y);
        }
        if ((this.f156524c & 16) == 16) {
            codedOutputStream.o(18, this.f156545z);
        }
        if ((this.f156524c & 32) == 32) {
            codedOutputStream.m(19, this.A);
        }
        for (int i28 = 0; i28 < this.f156534m.size(); i28++) {
            codedOutputStream.o(20, this.f156534m.get(i28));
        }
        if (this.f156535n.size() > 0) {
            codedOutputStream.v(170);
            codedOutputStream.v(this.f156536o);
        }
        for (int i29 = 0; i29 < this.f156535n.size(); i29++) {
            codedOutputStream.n(this.f156535n.get(i29).intValue());
        }
        for (int i30 = 0; i30 < this.B.size(); i30++) {
            codedOutputStream.o(25, this.B.get(i30));
        }
        if ((this.f156524c & 64) == 64) {
            codedOutputStream.o(30, this.C);
        }
        for (int i34 = 0; i34 < this.D.size(); i34++) {
            codedOutputStream.m(31, this.D.get(i34).intValue());
        }
        if ((this.f156524c & 128) == 128) {
            codedOutputStream.o(32, this.E);
        }
        for (int i35 = 0; i35 < this.F.size(); i35++) {
            codedOutputStream.o(33, this.F.get(i35));
        }
        aVarI.a(19000, codedOutputStream);
        codedOutputStream.r(this.f156523b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return T;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        List<Integer> list2;
        List<Integer> list3;
        List<Integer> list4;
        List<Integer> list5;
        int i14 = this.P;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156524c & 1) == 1 ? CodedOutputStream.b(1, this.f156525d) : 0;
        int i15 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156530i.size();
            list = this.f156530i;
            if (i15 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i15).intValue());
            i15++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + CodedOutputStream.c(iC);
        }
        this.f156531j = iC;
        if ((this.f156524c & 2) == 2) {
            iD += CodedOutputStream.b(3, this.f156526e);
        }
        if ((this.f156524c & 4) == 4) {
            iD += CodedOutputStream.b(4, this.f156527f);
        }
        for (int i16 = 0; i16 < this.f156528g.size(); i16++) {
            iD += CodedOutputStream.d(5, this.f156528g.get(i16));
        }
        for (int i17 = 0; i17 < this.f156529h.size(); i17++) {
            iD += CodedOutputStream.d(6, this.f156529h.get(i17));
        }
        int i18 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.f156532k.size();
            list2 = this.f156532k;
            if (i18 >= size2) {
                break;
            }
            iC2 += CodedOutputStream.c(list2.get(i18).intValue());
            i18++;
        }
        int iD2 = iD + iC2;
        if (!list2.isEmpty()) {
            iD2 = iD2 + 1 + CodedOutputStream.c(iC2);
        }
        this.f156533l = iC2;
        for (int i19 = 0; i19 < this.f156537p.size(); i19++) {
            iD2 += CodedOutputStream.d(8, this.f156537p.get(i19));
        }
        for (int i24 = 0; i24 < this.f156538q.size(); i24++) {
            iD2 += CodedOutputStream.d(9, this.f156538q.get(i24));
        }
        for (int i25 = 0; i25 < this.f156539r.size(); i25++) {
            iD2 += CodedOutputStream.d(10, this.f156539r.get(i25));
        }
        for (int i26 = 0; i26 < this.f156540t.size(); i26++) {
            iD2 += CodedOutputStream.d(11, this.f156540t.get(i26));
        }
        for (int i27 = 0; i27 < this.f156541v.size(); i27++) {
            iD2 += CodedOutputStream.d(13, this.f156541v.get(i27));
        }
        int i28 = 0;
        int iC3 = 0;
        while (true) {
            int size3 = this.f156542w.size();
            list3 = this.f156542w;
            if (i28 >= size3) {
                break;
            }
            iC3 += CodedOutputStream.c(list3.get(i28).intValue());
            i28++;
        }
        int iD3 = iD2 + iC3;
        if (!list3.isEmpty()) {
            iD3 = iD3 + 2 + CodedOutputStream.c(iC3);
        }
        this.f156543x = iC3;
        if ((this.f156524c & 8) == 8) {
            iD3 += CodedOutputStream.b(17, this.f156544y);
        }
        if ((this.f156524c & 16) == 16) {
            iD3 += CodedOutputStream.d(18, this.f156545z);
        }
        if ((this.f156524c & 32) == 32) {
            iD3 += CodedOutputStream.b(19, this.A);
        }
        for (int i29 = 0; i29 < this.f156534m.size(); i29++) {
            iD3 += CodedOutputStream.d(20, this.f156534m.get(i29));
        }
        int i30 = 0;
        int iC4 = 0;
        while (true) {
            int size4 = this.f156535n.size();
            list4 = this.f156535n;
            if (i30 >= size4) {
                break;
            }
            iC4 += CodedOutputStream.c(list4.get(i30).intValue());
            i30++;
        }
        int iD4 = iD3 + iC4;
        if (!list4.isEmpty()) {
            iD4 = iD4 + 2 + CodedOutputStream.c(iC4);
        }
        this.f156536o = iC4;
        for (int i34 = 0; i34 < this.B.size(); i34++) {
            iD4 += CodedOutputStream.d(25, this.B.get(i34));
        }
        if ((this.f156524c & 64) == 64) {
            iD4 += CodedOutputStream.d(30, this.C);
        }
        int i35 = 0;
        int iC5 = 0;
        while (true) {
            int size5 = this.D.size();
            list5 = this.D;
            if (i35 >= size5) {
                break;
            }
            iC5 += CodedOutputStream.c(list5.get(i35).intValue());
            i35++;
        }
        int iC6 = org.apache.commons.lang3.e.c(2, iD4 + iC5, list5);
        if ((this.f156524c & 128) == 128) {
            iC6 += CodedOutputStream.d(32, this.E);
        }
        for (int i36 = 0; i36 < this.F.size(); i36++) {
            iC6 += CodedOutputStream.d(33, this.F.get(i36));
        }
        int size6 = this.f156523b.size() + e() + iC6;
        this.P = size6;
        return size6;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.I;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        if ((this.f156524c & 2) != 2) {
            this.I = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f156528g.size(); i14++) {
            if (!this.f156528g.get(i14).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f156529h.size(); i15++) {
            if (!this.f156529h.get(i15).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f156534m.size(); i16++) {
            if (!this.f156534m.get(i16).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f156537p.size(); i17++) {
            if (!this.f156537p.get(i17).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f156538q.size(); i18++) {
            if (!this.f156538q.get(i18).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f156539r.size(); i19++) {
            if (!this.f156539r.get(i19).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f156540t.size(); i24++) {
            if (!this.f156540t.get(i24).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < this.f156541v.size(); i25++) {
            if (!this.f156541v.get(i25).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.f156524c & 16) == 16 && !this.f156545z.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i26 = 0; i26 < this.B.size(); i26++) {
            if (!this.B.get(i26).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.f156524c & 64) == 64 && !this.C.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i27 = 0; i27 < this.F.size(); i27++) {
            if (!this.F.get(i27).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    public final void m() {
        this.f156525d = 6;
        this.f156526e = 0;
        this.f156527f = 0;
        List list = Collections.EMPTY_LIST;
        this.f156528g = list;
        this.f156529h = list;
        this.f156530i = list;
        this.f156532k = list;
        this.f156534m = list;
        this.f156535n = list;
        this.f156537p = list;
        this.f156538q = list;
        this.f156539r = list;
        this.f156540t = list;
        this.f156541v = list;
        this.f156542w = list;
        this.f156544y = 0;
        this.f156545z = s.f156850w;
        this.A = 0;
        this.B = list;
        this.C = v.f156960g;
        this.D = list;
        this.E = y.f157023e;
        this.F = list;
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

    private c(z33.g.c<c, ?> cVar) {
        super(cVar);
        this.f156531j = -1;
        this.f156533l = -1;
        this.f156536o = -1;
        this.f156543x = -1;
        this.I = (byte) -1;
        this.P = -1;
        this.f156523b = cVar.f202188a;
    }

    private c(boolean z14) {
        this.f156531j = -1;
        this.f156533l = -1;
        this.f156536o = -1;
        this.f156543x = -1;
        this.I = (byte) -1;
        this.P = -1;
        this.f156523b = z33.c.f202161a;
    }
}
