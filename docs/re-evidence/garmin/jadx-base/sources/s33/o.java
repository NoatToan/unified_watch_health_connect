package s33;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends z33.g.d<o> {
    public static final o I;
    public static final a P = new a();
    public List<s33.b> A;
    public List<s33.b> B;
    public f C;
    public f D;
    public byte E;
    public int F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f156772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<u> f156774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f156775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<s> f156777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<Integer> f156778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<w> f156780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w f156781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f156782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f156783r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<Integer> f156784t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<d> f156785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<s33.b> f156786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<s33.b> f156787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<s33.b> f156788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List<s33.b> f156789z;

    public static class a extends z33.b<o> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new o(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<o, b> {
        public List<s33.b> A;
        public List<s33.b> B;
        public f C;
        public f D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156791e = 518;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f156792f = 2054;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f156793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public s f156794h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f156795i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<u> f156796j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s f156797k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f156798l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<s> f156799m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List<Integer> f156800n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<w> f156801o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public w f156802p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f156803q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f156804r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List<Integer> f156805t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public List<d> f156806v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public List<s33.b> f156807w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public List<s33.b> f156808x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public List<s33.b> f156809y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public List<s33.b> f156810z;

        private b() {
            s sVar = s.f156850w;
            this.f156794h = sVar;
            List list = Collections.EMPTY_LIST;
            this.f156796j = list;
            this.f156797k = sVar;
            this.f156799m = list;
            this.f156800n = list;
            this.f156801o = list;
            this.f156802p = w.f156971n;
            this.f156805t = list;
            this.f156806v = list;
            this.f156807w = list;
            this.f156808x = list;
            this.f156809y = list;
            this.f156810z = list;
            this.A = list;
            this.B = list;
            f fVar = f.f156604e;
            this.C = fVar;
            this.D = fVar;
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
            o oVarI = i();
            if (oVarI.isInitialized()) {
                return oVarI;
            }
            throw new UninitializedMessageException(oVarI);
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
            j((o) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final o i() {
            o oVar = new o(this);
            int i14 = this.f156790d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            oVar.f156769d = this.f156791e;
            if ((i14 & 2) == 2) {
                i15 |= 2;
            }
            oVar.f156770e = this.f156792f;
            if ((i14 & 4) == 4) {
                i15 |= 4;
            }
            oVar.f156771f = this.f156793g;
            if ((i14 & 8) == 8) {
                i15 |= 8;
            }
            oVar.f156772g = this.f156794h;
            if ((i14 & 16) == 16) {
                i15 |= 16;
            }
            oVar.f156773h = this.f156795i;
            if ((i14 & 32) == 32) {
                this.f156796j = Collections.unmodifiableList(this.f156796j);
                this.f156790d &= -33;
            }
            oVar.f156774i = this.f156796j;
            if ((i14 & 64) == 64) {
                i15 |= 32;
            }
            oVar.f156775j = this.f156797k;
            if ((i14 & 128) == 128) {
                i15 |= 64;
            }
            oVar.f156776k = this.f156798l;
            if ((this.f156790d & 256) == 256) {
                this.f156799m = Collections.unmodifiableList(this.f156799m);
                this.f156790d &= -257;
            }
            oVar.f156777l = this.f156799m;
            if ((this.f156790d & 512) == 512) {
                this.f156800n = Collections.unmodifiableList(this.f156800n);
                this.f156790d &= -513;
            }
            oVar.f156778m = this.f156800n;
            if ((this.f156790d & 1024) == 1024) {
                this.f156801o = Collections.unmodifiableList(this.f156801o);
                this.f156790d &= -1025;
            }
            oVar.f156780o = this.f156801o;
            if ((i14 & 2048) == 2048) {
                i15 |= 128;
            }
            oVar.f156781p = this.f156802p;
            if ((i14 & 4096) == 4096) {
                i15 |= 256;
            }
            oVar.f156782q = this.f156803q;
            if ((i14 & 8192) == 8192) {
                i15 |= 512;
            }
            oVar.f156783r = this.f156804r;
            if ((this.f156790d & 16384) == 16384) {
                this.f156805t = Collections.unmodifiableList(this.f156805t);
                this.f156790d &= -16385;
            }
            oVar.f156784t = this.f156805t;
            if ((this.f156790d & 32768) == 32768) {
                this.f156806v = Collections.unmodifiableList(this.f156806v);
                this.f156790d &= -32769;
            }
            oVar.f156785v = this.f156806v;
            if ((this.f156790d & 65536) == 65536) {
                this.f156807w = Collections.unmodifiableList(this.f156807w);
                this.f156790d &= -65537;
            }
            oVar.f156786w = this.f156807w;
            if ((this.f156790d & 131072) == 131072) {
                this.f156808x = Collections.unmodifiableList(this.f156808x);
                this.f156790d &= -131073;
            }
            oVar.f156787x = this.f156808x;
            if ((this.f156790d & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 262144) {
                this.f156809y = Collections.unmodifiableList(this.f156809y);
                this.f156790d &= -262145;
            }
            oVar.f156788y = this.f156809y;
            if ((this.f156790d & 524288) == 524288) {
                this.f156810z = Collections.unmodifiableList(this.f156810z);
                this.f156790d &= -524289;
            }
            oVar.f156789z = this.f156810z;
            if ((this.f156790d & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                this.A = Collections.unmodifiableList(this.A);
                this.f156790d &= -1048577;
            }
            oVar.A = this.A;
            if ((this.f156790d & 2097152) == 2097152) {
                this.B = Collections.unmodifiableList(this.B);
                this.f156790d &= -2097153;
            }
            oVar.B = this.B;
            if ((4194304 & i14) == 4194304) {
                i15 |= 1024;
            }
            oVar.C = this.C;
            if ((i14 & 8388608) == 8388608) {
                i15 |= 2048;
            }
            oVar.D = this.D;
            oVar.f156768c = i15;
            return oVar;
        }

        public final void j(o oVar) {
            f fVar;
            f fVar2;
            w wVar;
            s sVar;
            s sVar2;
            if (oVar == o.I) {
                return;
            }
            int i14 = oVar.f156768c;
            if ((i14 & 1) == 1) {
                int i15 = oVar.f156769d;
                this.f156790d = 1 | this.f156790d;
                this.f156791e = i15;
            }
            if ((i14 & 2) == 2) {
                int i16 = oVar.f156770e;
                this.f156790d = 2 | this.f156790d;
                this.f156792f = i16;
            }
            if ((i14 & 4) == 4) {
                int i17 = oVar.f156771f;
                this.f156790d = 4 | this.f156790d;
                this.f156793g = i17;
            }
            if ((i14 & 8) == 8) {
                s sVar3 = oVar.f156772g;
                if ((this.f156790d & 8) != 8 || (sVar2 = this.f156794h) == s.f156850w) {
                    this.f156794h = sVar3;
                } else {
                    s.c cVarO = s.o(sVar2);
                    cVarO.j(sVar3);
                    this.f156794h = cVarO.i();
                }
                this.f156790d |= 8;
            }
            if ((oVar.f156768c & 16) == 16) {
                int i18 = oVar.f156773h;
                this.f156790d = 16 | this.f156790d;
                this.f156795i = i18;
            }
            if (!oVar.f156774i.isEmpty()) {
                if (this.f156796j.isEmpty()) {
                    this.f156796j = oVar.f156774i;
                    this.f156790d &= -33;
                } else {
                    if ((this.f156790d & 32) != 32) {
                        this.f156796j = new ArrayList(this.f156796j);
                        this.f156790d |= 32;
                    }
                    this.f156796j.addAll(oVar.f156774i);
                }
            }
            if ((oVar.f156768c & 32) == 32) {
                s sVar4 = oVar.f156775j;
                if ((this.f156790d & 64) != 64 || (sVar = this.f156797k) == s.f156850w) {
                    this.f156797k = sVar4;
                } else {
                    s.c cVarO2 = s.o(sVar);
                    cVarO2.j(sVar4);
                    this.f156797k = cVarO2.i();
                }
                this.f156790d |= 64;
            }
            if ((oVar.f156768c & 64) == 64) {
                int i19 = oVar.f156776k;
                this.f156790d |= 128;
                this.f156798l = i19;
            }
            if (!oVar.f156777l.isEmpty()) {
                if (this.f156799m.isEmpty()) {
                    this.f156799m = oVar.f156777l;
                    this.f156790d &= -257;
                } else {
                    if ((this.f156790d & 256) != 256) {
                        this.f156799m = new ArrayList(this.f156799m);
                        this.f156790d |= 256;
                    }
                    this.f156799m.addAll(oVar.f156777l);
                }
            }
            if (!oVar.f156778m.isEmpty()) {
                if (this.f156800n.isEmpty()) {
                    this.f156800n = oVar.f156778m;
                    this.f156790d &= -513;
                } else {
                    if ((this.f156790d & 512) != 512) {
                        this.f156800n = new ArrayList(this.f156800n);
                        this.f156790d |= 512;
                    }
                    this.f156800n.addAll(oVar.f156778m);
                }
            }
            if (!oVar.f156780o.isEmpty()) {
                if (this.f156801o.isEmpty()) {
                    this.f156801o = oVar.f156780o;
                    this.f156790d &= -1025;
                } else {
                    if ((this.f156790d & 1024) != 1024) {
                        this.f156801o = new ArrayList(this.f156801o);
                        this.f156790d |= 1024;
                    }
                    this.f156801o.addAll(oVar.f156780o);
                }
            }
            if ((oVar.f156768c & 128) == 128) {
                w wVar2 = oVar.f156781p;
                if ((this.f156790d & 2048) != 2048 || (wVar = this.f156802p) == w.f156971n) {
                    this.f156802p = wVar2;
                } else {
                    w.b bVarH = w.b.h();
                    bVarH.j(wVar);
                    bVarH.j(wVar2);
                    this.f156802p = bVarH.i();
                }
                this.f156790d |= 2048;
            }
            int i24 = oVar.f156768c;
            if ((i24 & 256) == 256) {
                int i25 = oVar.f156782q;
                this.f156790d |= 4096;
                this.f156803q = i25;
            }
            if ((i24 & 512) == 512) {
                int i26 = oVar.f156783r;
                this.f156790d |= 8192;
                this.f156804r = i26;
            }
            if (!oVar.f156784t.isEmpty()) {
                if (this.f156805t.isEmpty()) {
                    this.f156805t = oVar.f156784t;
                    this.f156790d &= -16385;
                } else {
                    if ((this.f156790d & 16384) != 16384) {
                        this.f156805t = new ArrayList(this.f156805t);
                        this.f156790d |= 16384;
                    }
                    this.f156805t.addAll(oVar.f156784t);
                }
            }
            if (!oVar.f156785v.isEmpty()) {
                if (this.f156806v.isEmpty()) {
                    this.f156806v = oVar.f156785v;
                    this.f156790d &= -32769;
                } else {
                    if ((this.f156790d & 32768) != 32768) {
                        this.f156806v = new ArrayList(this.f156806v);
                        this.f156790d |= 32768;
                    }
                    this.f156806v.addAll(oVar.f156785v);
                }
            }
            if (!oVar.f156786w.isEmpty()) {
                if (this.f156807w.isEmpty()) {
                    this.f156807w = oVar.f156786w;
                    this.f156790d &= -65537;
                } else {
                    if ((this.f156790d & 65536) != 65536) {
                        this.f156807w = new ArrayList(this.f156807w);
                        this.f156790d |= 65536;
                    }
                    this.f156807w.addAll(oVar.f156786w);
                }
            }
            if (!oVar.f156787x.isEmpty()) {
                if (this.f156808x.isEmpty()) {
                    this.f156808x = oVar.f156787x;
                    this.f156790d &= -131073;
                } else {
                    if ((this.f156790d & 131072) != 131072) {
                        this.f156808x = new ArrayList(this.f156808x);
                        this.f156790d |= 131072;
                    }
                    this.f156808x.addAll(oVar.f156787x);
                }
            }
            if (!oVar.f156788y.isEmpty()) {
                if (this.f156809y.isEmpty()) {
                    this.f156809y = oVar.f156788y;
                    this.f156790d &= -262145;
                } else {
                    if ((this.f156790d & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 262144) {
                        this.f156809y = new ArrayList(this.f156809y);
                        this.f156790d |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    }
                    this.f156809y.addAll(oVar.f156788y);
                }
            }
            if (!oVar.f156789z.isEmpty()) {
                if (this.f156810z.isEmpty()) {
                    this.f156810z = oVar.f156789z;
                    this.f156790d &= -524289;
                } else {
                    if ((this.f156790d & 524288) != 524288) {
                        this.f156810z = new ArrayList(this.f156810z);
                        this.f156790d |= 524288;
                    }
                    this.f156810z.addAll(oVar.f156789z);
                }
            }
            if (!oVar.A.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = oVar.A;
                    this.f156790d &= -1048577;
                } else {
                    if ((this.f156790d & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                        this.A = new ArrayList(this.A);
                        this.f156790d |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    }
                    this.A.addAll(oVar.A);
                }
            }
            if (!oVar.B.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = oVar.B;
                    this.f156790d &= -2097153;
                } else {
                    if ((this.f156790d & 2097152) != 2097152) {
                        this.B = new ArrayList(this.B);
                        this.f156790d |= 2097152;
                    }
                    this.B.addAll(oVar.B);
                }
            }
            if ((oVar.f156768c & 1024) == 1024) {
                f fVar3 = oVar.C;
                if ((this.f156790d & 4194304) != 4194304 || (fVar2 = this.C) == f.f156604e) {
                    this.C = fVar3;
                } else {
                    f.b bVarF = f.b.f();
                    bVarF.h(fVar2);
                    bVarF.h(fVar3);
                    this.C = bVarF.g();
                }
                this.f156790d |= 4194304;
            }
            if ((oVar.f156768c & 2048) == 2048) {
                f fVar4 = oVar.D;
                if ((this.f156790d & 8388608) != 8388608 || (fVar = this.D) == f.f156604e) {
                    this.D = fVar4;
                } else {
                    f.b bVarF2 = f.b.f();
                    bVarF2.h(fVar);
                    bVarF2.h(fVar4);
                    this.D = bVarF2.g();
                }
                this.f156790d |= 8388608;
            }
            g(oVar);
            this.f202188a = this.f202188a.b(oVar.f156767b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            o oVar = null;
            try {
                try {
                    j((o) o.P.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    o oVar2 = (o) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        oVar = oVar2;
                        if (oVar != null) {
                            j(oVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (oVar != null) {
                    j(oVar);
                }
                throw th;
            }
        }
    }

    static {
        o oVar = new o(true);
        I = oVar;
        oVar.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    private o(z33.d dVar, z33.e eVar) throws Throwable {
        f.b bVarF;
        f.b bVarF2;
        this.f156779n = -1;
        this.E = (byte) -1;
        this.F = -1;
        m();
        z33.c.b bVarI = z33.c.i();
        boolean z14 = true;
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z15 = false;
        int i14 = 0;
        while (true) {
            boolean z16 = z14;
            if (z15) {
                if ((i14 & 32) == 32) {
                    this.f156774i = Collections.unmodifiableList(this.f156774i);
                }
                if ((i14 & 256) == 256) {
                    this.f156777l = Collections.unmodifiableList(this.f156777l);
                }
                if ((i14 & 512) == 512) {
                    this.f156778m = Collections.unmodifiableList(this.f156778m);
                }
                if ((i14 & 65536) == 65536) {
                    this.f156786w = Collections.unmodifiableList(this.f156786w);
                }
                if ((i14 & 131072) == 131072) {
                    this.f156787x = Collections.unmodifiableList(this.f156787x);
                }
                if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 262144) {
                    this.f156788y = Collections.unmodifiableList(this.f156788y);
                }
                if ((i14 & 1024) == 1024) {
                    this.f156780o = Collections.unmodifiableList(this.f156780o);
                }
                if ((i14 & 16384) == 16384) {
                    this.f156784t = Collections.unmodifiableList(this.f156784t);
                }
                if ((i14 & 32768) == 32768) {
                    this.f156785v = Collections.unmodifiableList(this.f156785v);
                }
                if ((i14 & 524288) == 524288) {
                    this.f156789z = Collections.unmodifiableList(this.f156789z);
                }
                if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if ((i14 & 2097152) == 2097152) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused) {
                } finally {
                    this.f156767b = bVarI.e();
                }
                h();
                return;
            }
            try {
                try {
                    int iO = dVar.o();
                    switch (iO) {
                        case 0:
                            z15 = z16;
                            z14 = z16;
                            break;
                        case 8:
                            this.f156768c |= 2;
                            this.f156770e = dVar.g();
                            z14 = z16;
                            break;
                        case 16:
                            this.f156768c |= 4;
                            this.f156771f = dVar.g();
                            z14 = z16;
                            break;
                        case 26:
                            s.c builder = (this.f156768c & 8) == 8 ? this.f156772g.toBuilder() : null;
                            s sVar = (s) dVar.h(s.f156851x, eVar);
                            this.f156772g = sVar;
                            if (builder != 0) {
                                builder.j(sVar);
                                this.f156772g = builder.i();
                            }
                            this.f156768c |= 8;
                            z14 = z16;
                            break;
                        case 34:
                            if ((i14 & 32) != 32) {
                                this.f156774i = new ArrayList();
                                i14 |= 32;
                            }
                            this.f156774i.add((u) dVar.h(u.f156934o, eVar));
                            z14 = z16;
                            break;
                        case 42:
                            s.c builder2 = (this.f156768c & 32) == 32 ? this.f156775j.toBuilder() : null;
                            s sVar2 = (s) dVar.h(s.f156851x, eVar);
                            this.f156775j = sVar2;
                            if (builder2 != 0) {
                                builder2.j(sVar2);
                                this.f156775j = builder2.i();
                            }
                            this.f156768c |= 32;
                            z14 = z16;
                            break;
                        case 50:
                            w.b bVarM = (this.f156768c & 128) == 128 ? this.f156781p.m() : null;
                            w wVar = (w) dVar.h(w.f156972o, eVar);
                            this.f156781p = wVar;
                            if (bVarM != 0) {
                                bVarM.j(wVar);
                                this.f156781p = bVarM.i();
                            }
                            this.f156768c |= 128;
                            z14 = z16;
                            break;
                        case 56:
                            this.f156768c |= 256;
                            this.f156782q = dVar.g();
                            z14 = z16;
                            break;
                        case 64:
                            this.f156768c |= 512;
                            this.f156783r = dVar.g();
                            z14 = z16;
                            break;
                        case 72:
                            this.f156768c |= 16;
                            this.f156773h = dVar.g();
                            z14 = z16;
                            break;
                        case 80:
                            this.f156768c |= 64;
                            this.f156776k = dVar.g();
                            z14 = z16;
                            break;
                        case 88:
                            this.f156768c |= 1;
                            this.f156769d = dVar.g();
                            z14 = z16;
                            break;
                        case 98:
                            if ((i14 & 256) != 256) {
                                this.f156777l = new ArrayList();
                                i14 |= 256;
                            }
                            this.f156777l.add((s) dVar.h(s.f156851x, eVar));
                            z14 = z16;
                            break;
                        case 104:
                            if ((i14 & 512) != 512) {
                                this.f156778m = new ArrayList();
                                i14 |= 512;
                            }
                            this.f156778m.add(Integer.valueOf(dVar.g()));
                            z14 = z16;
                            break;
                        case 106:
                            int iE = dVar.e(dVar.l());
                            if ((i14 & 512) != 512 && dVar.b() > 0) {
                                this.f156778m = new ArrayList();
                                i14 |= 512;
                            }
                            while (dVar.b() > 0) {
                                this.f156778m.add(Integer.valueOf(dVar.g()));
                            }
                            dVar.d(iE);
                            z14 = z16;
                            break;
                        case 114:
                            if ((i14 & 65536) != 65536) {
                                this.f156786w = new ArrayList();
                                i14 |= 65536;
                            }
                            this.f156786w.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case 122:
                            if ((i14 & 131072) != 131072) {
                                this.f156787x = new ArrayList();
                                i14 |= 131072;
                            }
                            this.f156787x.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case 130:
                            if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 262144) {
                                this.f156788y = new ArrayList();
                                i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                            }
                            this.f156788y.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                            if ((i14 & 1024) != 1024) {
                                this.f156780o = new ArrayList();
                                i14 |= 1024;
                            }
                            this.f156780o.add((w) dVar.h(w.f156972o, eVar));
                            z14 = z16;
                            break;
                        case 248:
                            if ((i14 & 16384) != 16384) {
                                this.f156784t = new ArrayList();
                                i14 |= 16384;
                            }
                            this.f156784t.add(Integer.valueOf(dVar.g()));
                            z14 = z16;
                            break;
                        case 250:
                            int iE2 = dVar.e(dVar.l());
                            if ((i14 & 16384) != 16384 && dVar.b() > 0) {
                                this.f156784t = new ArrayList();
                                i14 |= 16384;
                            }
                            while (dVar.b() > 0) {
                                this.f156784t.add(Integer.valueOf(dVar.g()));
                            }
                            dVar.d(iE2);
                            z14 = z16;
                            break;
                        case 258:
                            if ((i14 & 32768) != 32768) {
                                this.f156785v = new ArrayList();
                                i14 |= 32768;
                            }
                            this.f156785v.add((d) dVar.h(d.f156577h, eVar));
                            z14 = z16;
                            break;
                        case 266:
                            if ((i14 & 524288) != 524288) {
                                this.f156789z = new ArrayList();
                                i14 |= 524288;
                            }
                            this.f156789z.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case 274:
                            if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                                this.A = new ArrayList();
                                i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            }
                            this.A.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case 282:
                            if ((i14 & 2097152) != 2097152) {
                                this.B = new ArrayList();
                                i14 |= 2097152;
                            }
                            this.B.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                            z14 = z16;
                            break;
                        case 322:
                            if ((this.f156768c & 1024) == 1024) {
                                f fVar = this.C;
                                fVar.getClass();
                                bVarF2 = f.b.f();
                                bVarF2.h(fVar);
                            } else {
                                bVarF2 = null;
                            }
                            f fVar2 = (f) dVar.h(f.f156605f, eVar);
                            this.C = fVar2;
                            if (bVarF2 != null) {
                                bVarF2.h(fVar2);
                                this.C = bVarF2.g();
                            }
                            this.f156768c |= 1024;
                            z14 = z16;
                            break;
                        case 330:
                            try {
                                if ((this.f156768c & 2048) == 2048) {
                                    try {
                                        f fVar3 = this.D;
                                        fVar3.getClass();
                                        bVarF = f.b.f();
                                        bVarF.h(fVar3);
                                    } catch (InvalidProtocolBufferException e4) {
                                        e = e4;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e14) {
                                        e = e14;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if ((i14 & 32) == 32) {
                                            this.f156774i = Collections.unmodifiableList(this.f156774i);
                                        }
                                        if ((i14 & 256) == 256) {
                                            this.f156777l = Collections.unmodifiableList(this.f156777l);
                                        }
                                        if ((i14 & 512) == 512) {
                                            this.f156778m = Collections.unmodifiableList(this.f156778m);
                                        }
                                        if ((i14 & 65536) == 65536) {
                                            this.f156786w = Collections.unmodifiableList(this.f156786w);
                                        }
                                        if ((i14 & 131072) == 131072) {
                                            this.f156787x = Collections.unmodifiableList(this.f156787x);
                                        }
                                        if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 262144) {
                                            this.f156788y = Collections.unmodifiableList(this.f156788y);
                                        }
                                        if ((i14 & 1024) == 1024) {
                                            this.f156780o = Collections.unmodifiableList(this.f156780o);
                                        }
                                        if ((i14 & 16384) == 16384) {
                                            this.f156784t = Collections.unmodifiableList(this.f156784t);
                                        }
                                        if ((i14 & 32768) == 32768) {
                                            this.f156785v = Collections.unmodifiableList(this.f156785v);
                                        }
                                        if ((i14 & 524288) == 524288) {
                                            this.f156789z = Collections.unmodifiableList(this.f156789z);
                                        }
                                        if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                                            this.A = Collections.unmodifiableList(this.A);
                                        }
                                        if ((i14 & 2097152) == 2097152) {
                                            this.B = Collections.unmodifiableList(this.B);
                                        }
                                        try {
                                            codedOutputStreamJ.i();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.f156767b = bVarI.e();
                                        }
                                        h();
                                        throw th;
                                    }
                                } else {
                                    bVarF = null;
                                }
                                f fVar4 = (f) dVar.h(f.f156605f, eVar);
                                this.D = fVar4;
                                if (bVarF != null) {
                                    bVarF.h(fVar4);
                                    this.D = bVarF.g();
                                }
                                this.f156768c |= 2048;
                                z14 = z16;
                            } catch (InvalidProtocolBufferException e15) {
                                e = e15;
                            } catch (IOException e16) {
                                e = e16;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            break;
                        default:
                            if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                                z15 = z16;
                            }
                            z14 = z16;
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (InvalidProtocolBufferException e17) {
                e = e17;
            } catch (IOException e18) {
                e = e18;
            }
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156768c & 2) == 2) {
            codedOutputStream.m(1, this.f156770e);
        }
        if ((this.f156768c & 4) == 4) {
            codedOutputStream.m(2, this.f156771f);
        }
        if ((this.f156768c & 8) == 8) {
            codedOutputStream.o(3, this.f156772g);
        }
        for (int i14 = 0; i14 < this.f156774i.size(); i14++) {
            codedOutputStream.o(4, this.f156774i.get(i14));
        }
        if ((this.f156768c & 32) == 32) {
            codedOutputStream.o(5, this.f156775j);
        }
        if ((this.f156768c & 128) == 128) {
            codedOutputStream.o(6, this.f156781p);
        }
        if ((this.f156768c & 256) == 256) {
            codedOutputStream.m(7, this.f156782q);
        }
        if ((this.f156768c & 512) == 512) {
            codedOutputStream.m(8, this.f156783r);
        }
        if ((this.f156768c & 16) == 16) {
            codedOutputStream.m(9, this.f156773h);
        }
        if ((this.f156768c & 64) == 64) {
            codedOutputStream.m(10, this.f156776k);
        }
        if ((this.f156768c & 1) == 1) {
            codedOutputStream.m(11, this.f156769d);
        }
        for (int i15 = 0; i15 < this.f156777l.size(); i15++) {
            codedOutputStream.o(12, this.f156777l.get(i15));
        }
        if (this.f156778m.size() > 0) {
            codedOutputStream.v(106);
            codedOutputStream.v(this.f156779n);
        }
        for (int i16 = 0; i16 < this.f156778m.size(); i16++) {
            codedOutputStream.n(this.f156778m.get(i16).intValue());
        }
        for (int i17 = 0; i17 < this.f156786w.size(); i17++) {
            codedOutputStream.o(14, this.f156786w.get(i17));
        }
        for (int i18 = 0; i18 < this.f156787x.size(); i18++) {
            codedOutputStream.o(15, this.f156787x.get(i18));
        }
        for (int i19 = 0; i19 < this.f156788y.size(); i19++) {
            codedOutputStream.o(16, this.f156788y.get(i19));
        }
        for (int i24 = 0; i24 < this.f156780o.size(); i24++) {
            codedOutputStream.o(17, this.f156780o.get(i24));
        }
        for (int i25 = 0; i25 < this.f156784t.size(); i25++) {
            codedOutputStream.m(31, this.f156784t.get(i25).intValue());
        }
        for (int i26 = 0; i26 < this.f156785v.size(); i26++) {
            codedOutputStream.o(32, this.f156785v.get(i26));
        }
        for (int i27 = 0; i27 < this.f156789z.size(); i27++) {
            codedOutputStream.o(33, this.f156789z.get(i27));
        }
        for (int i28 = 0; i28 < this.A.size(); i28++) {
            codedOutputStream.o(34, this.A.get(i28));
        }
        for (int i29 = 0; i29 < this.B.size(); i29++) {
            codedOutputStream.o(35, this.B.get(i29));
        }
        if ((this.f156768c & 1024) == 1024) {
            codedOutputStream.o(40, this.C);
        }
        if ((this.f156768c & 2048) == 2048) {
            codedOutputStream.o(41, this.D);
        }
        aVarI.a(19000, codedOutputStream);
        codedOutputStream.r(this.f156767b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return I;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        List<Integer> list2;
        int i14 = this.F;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156768c & 2) == 2 ? CodedOutputStream.b(1, this.f156770e) : 0;
        if ((this.f156768c & 4) == 4) {
            iB += CodedOutputStream.b(2, this.f156771f);
        }
        if ((this.f156768c & 8) == 8) {
            iB += CodedOutputStream.d(3, this.f156772g);
        }
        for (int i15 = 0; i15 < this.f156774i.size(); i15++) {
            iB += CodedOutputStream.d(4, this.f156774i.get(i15));
        }
        if ((this.f156768c & 32) == 32) {
            iB += CodedOutputStream.d(5, this.f156775j);
        }
        if ((this.f156768c & 128) == 128) {
            iB += CodedOutputStream.d(6, this.f156781p);
        }
        if ((this.f156768c & 256) == 256) {
            iB += CodedOutputStream.b(7, this.f156782q);
        }
        if ((this.f156768c & 512) == 512) {
            iB += CodedOutputStream.b(8, this.f156783r);
        }
        if ((this.f156768c & 16) == 16) {
            iB += CodedOutputStream.b(9, this.f156773h);
        }
        if ((this.f156768c & 64) == 64) {
            iB += CodedOutputStream.b(10, this.f156776k);
        }
        if ((this.f156768c & 1) == 1) {
            iB += CodedOutputStream.b(11, this.f156769d);
        }
        for (int i16 = 0; i16 < this.f156777l.size(); i16++) {
            iB += CodedOutputStream.d(12, this.f156777l.get(i16));
        }
        int i17 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156778m.size();
            list = this.f156778m;
            if (i17 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i17).intValue());
            i17++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + CodedOutputStream.c(iC);
        }
        this.f156779n = iC;
        for (int i18 = 0; i18 < this.f156786w.size(); i18++) {
            iD += CodedOutputStream.d(14, this.f156786w.get(i18));
        }
        for (int i19 = 0; i19 < this.f156787x.size(); i19++) {
            iD += CodedOutputStream.d(15, this.f156787x.get(i19));
        }
        for (int i24 = 0; i24 < this.f156788y.size(); i24++) {
            iD += CodedOutputStream.d(16, this.f156788y.get(i24));
        }
        for (int i25 = 0; i25 < this.f156780o.size(); i25++) {
            iD += CodedOutputStream.d(17, this.f156780o.get(i25));
        }
        int i26 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.f156784t.size();
            list2 = this.f156784t;
            if (i26 >= size2) {
                break;
            }
            iC2 += CodedOutputStream.c(list2.get(i26).intValue());
            i26++;
        }
        int iC3 = org.apache.commons.lang3.e.c(2, iD + iC2, list2);
        for (int i27 = 0; i27 < this.f156785v.size(); i27++) {
            iC3 += CodedOutputStream.d(32, this.f156785v.get(i27));
        }
        for (int i28 = 0; i28 < this.f156789z.size(); i28++) {
            iC3 += CodedOutputStream.d(33, this.f156789z.get(i28));
        }
        for (int i29 = 0; i29 < this.A.size(); i29++) {
            iC3 += CodedOutputStream.d(34, this.A.get(i29));
        }
        for (int i30 = 0; i30 < this.B.size(); i30++) {
            iC3 += CodedOutputStream.d(35, this.B.get(i30));
        }
        if ((this.f156768c & 1024) == 1024) {
            iC3 += CodedOutputStream.d(40, this.C);
        }
        if ((this.f156768c & 2048) == 2048) {
            iC3 += CodedOutputStream.d(41, this.D);
        }
        int size3 = this.f156767b.size() + e() + iC3;
        this.F = size3;
        return size3;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.E;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        int i14 = this.f156768c;
        if ((i14 & 4) != 4) {
            this.E = (byte) 0;
            return false;
        }
        if ((i14 & 8) == 8 && !this.f156772g.isInitialized()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f156774i.size(); i15++) {
            if (!this.f156774i.get(i15).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f156768c & 32) == 32 && !this.f156775j.isInitialized()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < this.f156777l.size(); i16++) {
            if (!this.f156777l.get(i16).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f156780o.size(); i17++) {
            if (!this.f156780o.get(i17).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f156768c & 128) == 128 && !this.f156781p.isInitialized()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f156785v.size(); i18++) {
            if (!this.f156785v.get(i18).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f156786w.size(); i19++) {
            if (!this.f156786w.get(i19).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f156787x.size(); i24++) {
            if (!this.f156787x.get(i24).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < this.f156788y.size(); i25++) {
            if (!this.f156788y.get(i25).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i26 = 0; i26 < this.f156789z.size(); i26++) {
            if (!this.f156789z.get(i26).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.A.size(); i27++) {
            if (!this.A.get(i27).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i28 = 0; i28 < this.B.size(); i28++) {
            if (!this.B.get(i28).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f156768c & 1024) == 1024 && !this.C.isInitialized()) {
            this.E = (byte) 0;
            return false;
        }
        if ((this.f156768c & 2048) == 2048 && !this.D.isInitialized()) {
            this.E = (byte) 0;
            return false;
        }
        if (d()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    public final void m() {
        this.f156769d = 518;
        this.f156770e = 2054;
        this.f156771f = 0;
        s sVar = s.f156850w;
        this.f156772g = sVar;
        this.f156773h = 0;
        List list = Collections.EMPTY_LIST;
        this.f156774i = list;
        this.f156775j = sVar;
        this.f156776k = 0;
        this.f156777l = list;
        this.f156778m = list;
        this.f156780o = list;
        this.f156781p = w.f156971n;
        this.f156782q = 0;
        this.f156783r = 0;
        this.f156784t = list;
        this.f156785v = list;
        this.f156786w = list;
        this.f156787x = list;
        this.f156788y = list;
        this.f156789z = list;
        this.A = list;
        this.B = list;
        f fVar = f.f156604e;
        this.C = fVar;
        this.D = fVar;
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

    private o(z33.g.c<o, ?> cVar) {
        super(cVar);
        this.f156779n = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f156767b = cVar.f202188a;
    }

    private o(boolean z14) {
        this.f156779n = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f156767b = z33.c.f202161a;
    }
}
