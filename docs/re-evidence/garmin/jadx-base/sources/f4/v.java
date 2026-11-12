package f4;

import f2.o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.f1;
import p1.g1;
import p1.h1;
import p1.p0;
import p1.t0;
import p1.u0;
import p1.y0;
import p3.a4;
import p3.j2;
import p3.p3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf4/v;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Le23/l;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<e23.a<Unit>, Unit> f68813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68815c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public en0.n f68820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f68821i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f68814b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dh1.a f68816d = new dh1.a(this, 24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f68817e = new o0(this, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.c<a> f68818f = new q3.c<>(new a[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f68819g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f68822j = -1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf4/v$a;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Le23/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<Object, Unit> f68823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f68824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p0<Object> f68825c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f68832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f68833k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68826d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final t0<Object, Object> f68827e = g1.b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t0<Object, p0<Object>> f68828f = new t0<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u0<Object> f68829g = new u0<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q3.c<p3.e0<?>> f68830h = new q3.c<>(new p3.e0[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C1423a f68831i = new C1423a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final t0<Object, Object> f68834l = g1.b();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final HashMap<p3.e0<?>, Object> f68835m = new HashMap<>();

        /* JADX INFO: renamed from: f4.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f4/v$a$a", "Lp3/f0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1423a implements p3.f0 {
            public C1423a() {
            }

            @Override // p3.f0
            public final void a() {
                a.this.f68833k--;
            }

            @Override // p3.f0
            public final void start() {
                a.this.f68833k++;
            }
        }

        public a(e23.l<Object, Unit> lVar) {
            this.f68823a = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0215 A[DONT_INVERT, PHI: r21
          0x0215: PHI (r21v20 boolean) = (r21v19 boolean), (r21v21 boolean) binds: [B:93:0x01ed, B:101:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:103:0x0217 A[Catch: all -> 0x012f, LOOP:8: B:92:0x01e3->B:103:0x0217, LOOP_END, TryCatch #2 {all -> 0x012f, blocks: (B:24:0x0074, B:26:0x007a, B:28:0x007e, B:31:0x0093, B:33:0x00a3, B:35:0x00ad, B:37:0x00b3, B:39:0x00ce, B:42:0x00d9, B:44:0x00e5, B:46:0x00eb, B:48:0x00ef, B:51:0x0101, B:53:0x0111, B:55:0x011b, B:57:0x0121, B:61:0x0133, B:68:0x0155, B:72:0x016d, B:65:0x013e, B:66:0x0147, B:69:0x0158, B:78:0x018f, B:80:0x01a2, B:82:0x01ba, B:83:0x01bf, B:85:0x01cb, B:87:0x01d1, B:89:0x01d5, B:92:0x01e3, B:94:0x01ef, B:96:0x01fb, B:98:0x0201, B:99:0x020b, B:103:0x0217, B:104:0x021a, B:105:0x021f, B:106:0x0223), top: B:321:0x0074 }] */
        /* JADX WARN: Code duplicated, block: B:131:0x0292 A[DONT_INVERT, PHI: r21
          0x0292: PHI (r21v12 boolean) = (r21v11 boolean), (r21v13 boolean) binds: [B:122:0x026a, B:130:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:132:0x0294 A[LOOP:6: B:121:0x0260->B:132:0x0294, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:153:0x0319  */
        /* JADX WARN: Code duplicated, block: B:199:0x03f2 A[DONT_INVERT, PHI: r27
          0x03f2: PHI (r27v12 boolean) = (r27v11 boolean), (r27v13 boolean) binds: [B:186:0x03bb, B:198:0x03f0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:200:0x03f4 A[Catch: all -> 0x03df, LOOP:18: B:185:0x03af->B:200:0x03f4, LOOP_END, TryCatch #1 {all -> 0x03df, blocks: (B:160:0x032c, B:162:0x0330, B:165:0x033e, B:167:0x034d, B:169:0x0359, B:171:0x035f, B:176:0x0389, B:178:0x0395, B:180:0x039b, B:182:0x039f, B:185:0x03af, B:187:0x03bd, B:189:0x03c9, B:191:0x03cf, B:196:0x03e8, B:204:0x0406, B:208:0x041e, B:200:0x03f4, B:201:0x03fb, B:205:0x0409, B:214:0x043c, B:216:0x044d, B:218:0x045b, B:219:0x0460, B:221:0x046c, B:223:0x0472, B:225:0x0476, B:228:0x0484, B:230:0x0490, B:232:0x049c, B:234:0x04a2, B:235:0x04ab, B:239:0x04b7, B:240:0x04ba, B:241:0x04be, B:242:0x04c1), top: B:319:0x032c }] */
        /* JADX WARN: Code duplicated, block: B:202:0x0402  */
        /* JADX WARN: Code duplicated, block: B:238:0x04b5 A[DONT_INVERT, PHI: r2
          0x04b5: PHI (r2v16 boolean) = (r2v15 boolean), (r2v17 boolean) binds: [B:229:0x048e, B:237:0x04b3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:239:0x04b7 A[Catch: all -> 0x03df, LOOP:20: B:228:0x0484->B:239:0x04b7, LOOP_END, TryCatch #1 {all -> 0x03df, blocks: (B:160:0x032c, B:162:0x0330, B:165:0x033e, B:167:0x034d, B:169:0x0359, B:171:0x035f, B:176:0x0389, B:178:0x0395, B:180:0x039b, B:182:0x039f, B:185:0x03af, B:187:0x03bd, B:189:0x03c9, B:191:0x03cf, B:196:0x03e8, B:204:0x0406, B:208:0x041e, B:200:0x03f4, B:201:0x03fb, B:205:0x0409, B:214:0x043c, B:216:0x044d, B:218:0x045b, B:219:0x0460, B:221:0x046c, B:223:0x0472, B:225:0x0476, B:228:0x0484, B:230:0x0490, B:232:0x049c, B:234:0x04a2, B:235:0x04ab, B:239:0x04b7, B:240:0x04ba, B:241:0x04be, B:242:0x04c1), top: B:319:0x032c }] */
        /* JADX WARN: Code duplicated, block: B:244:0x04c5  */
        /* JADX WARN: Code duplicated, block: B:250:0x04d1  */
        /* JADX WARN: Code duplicated, block: B:253:0x04d9  */
        /* JADX WARN: Code duplicated, block: B:255:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:257:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:260:0x04f7  */
        /* JADX WARN: Code duplicated, block: B:262:0x0503  */
        /* JADX WARN: Code duplicated, block: B:264:0x0509  */
        /* JADX WARN: Code duplicated, block: B:268:0x051c A[DONT_INVERT, PHI: r2
          0x051c: PHI (r2v6 boolean) = (r2v5 boolean), (r2v7 boolean) binds: [B:259:0x04f5, B:267:0x051a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:269:0x051e A[LOOP:14: B:258:0x04eb->B:269:0x051e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:270:0x0521  */
        /* JADX WARN: Code duplicated, block: B:329:0x0155 A[EDGE_INSN: B:329:0x0155->B:68:0x0155 BREAK  A[LOOP:4: B:51:0x0101->B:65:0x013e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:335:0x029c A[EDGE_INSN: B:335:0x029c->B:134:0x029c BREAK  A[LOOP:6: B:121:0x0260->B:132:0x0294], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:340:0x021f A[EDGE_INSN: B:340:0x021f->B:105:0x021f BREAK  A[LOOP:8: B:92:0x01e3->B:103:0x0217], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:354:0x0525 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:355:0x0525 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:356:0x0525 A[EDGE_INSN: B:356:0x0525->B:271:0x0525 BREAK  A[LOOP:14: B:258:0x04eb->B:269:0x051e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:357:0x0525 A[EDGE_INSN: B:357:0x0525->B:271:0x0525 BREAK  A[LOOP:14: B:258:0x04eb->B:269:0x051e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:360:0x0512 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:365:0x0404 A[EDGE_INSN: B:365:0x0404->B:203:0x0404 BREAK  A[LOOP:18: B:185:0x03af->B:200:0x03f4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:368:0x04be A[EDGE_INSN: B:368:0x04be->B:241:0x04be BREAK  A[LOOP:20: B:228:0x0484->B:239:0x04b7], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x013c A[DONT_INVERT, PHI: r21
          0x013c: PHI (r21v31 boolean) = (r21v30 boolean), (r21v32 boolean) binds: [B:52:0x010f, B:63:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x013e A[Catch: all -> 0x012f, LOOP:4: B:51:0x0101->B:65:0x013e, LOOP_END, TryCatch #2 {all -> 0x012f, blocks: (B:24:0x0074, B:26:0x007a, B:28:0x007e, B:31:0x0093, B:33:0x00a3, B:35:0x00ad, B:37:0x00b3, B:39:0x00ce, B:42:0x00d9, B:44:0x00e5, B:46:0x00eb, B:48:0x00ef, B:51:0x0101, B:53:0x0111, B:55:0x011b, B:57:0x0121, B:61:0x0133, B:68:0x0155, B:72:0x016d, B:65:0x013e, B:66:0x0147, B:69:0x0158, B:78:0x018f, B:80:0x01a2, B:82:0x01ba, B:83:0x01bf, B:85:0x01cb, B:87:0x01d1, B:89:0x01d5, B:92:0x01e3, B:94:0x01ef, B:96:0x01fb, B:98:0x0201, B:99:0x020b, B:103:0x0217, B:104:0x021a, B:105:0x021f, B:106:0x0223), top: B:321:0x0074 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0151  */
        public final boolean a(Set<? extends Object> set) throws Throwable {
            char c14;
            long j8;
            boolean z14;
            Iterator it;
            Object objD;
            Object[] objArr;
            long[] jArr;
            int length;
            int i14;
            long j14;
            int i15;
            int i16;
            boolean z15;
            Object[] objArr2;
            Iterator it3;
            int i17;
            long j15;
            Object[] objArr3;
            int i18;
            int i19;
            p3.e0<?>[] e0VarArr;
            q3.c<p3.e0<?>> cVar;
            int i24;
            f1 f1Var;
            long[] jArr2;
            t0<Object, p0<Object>> t0Var;
            t0<Object, p0<Object>> t0Var2;
            p0<Object> p0Var;
            long[] jArr3;
            Object[] objArr4;
            int i25;
            long[] jArr4;
            Object[] objArr5;
            int i26;
            int i27;
            long j16;
            int i28;
            int i29;
            Object[] objArr6;
            int i30;
            long j17;
            Object[] objArr7;
            int i34;
            int i35;
            a aVar = this;
            boolean z16 = set instanceof q3.e;
            q3.c<p3.e0<?>> cVar2 = aVar.f68830h;
            t0<Object, Object> t0Var3 = aVar.f68834l;
            HashMap<p3.e0<?>, Object> map = aVar.f68835m;
            f1 f1Var2 = aVar.f68827e;
            u0<Object> u0Var = aVar.f68829g;
            if (z16) {
                h1<T> h1Var = ((q3.e) set).f142365a;
                Object[] objArr8 = h1Var.f134733b;
                long[] jArr5 = h1Var.f134732a;
                int length2 = jArr5.length - 2;
                if (length2 >= 0) {
                    int i36 = 0;
                    c14 = 7;
                    z14 = false;
                    j8 = -9187201950435737472L;
                    while (true) {
                        long j18 = jArr5[i36];
                        int i37 = 8;
                        if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i38 = 8 - ((~(i36 - length2)) >>> 31);
                            int i39 = 0;
                            while (i39 < i38) {
                                if ((j18 & 255) < 128) {
                                    Object obj = objArr8[(i36 << 3) + i39];
                                    if (obj instanceof h0) {
                                        int i44 = d.f68726b;
                                        jArr4 = jArr5;
                                        if (!((h0) obj).A(2)) {
                                        }
                                        j18 = j16 >> 8;
                                        i39 = i29 + 1;
                                        jArr5 = jArr4;
                                        i37 = 8;
                                        objArr8 = objArr5;
                                        length2 = i26;
                                        i36 = i27;
                                        i38 = i28;
                                    } else {
                                        jArr4 = jArr5;
                                    }
                                    if (aVar.f68832j || !t0Var3.b(obj)) {
                                        objArr5 = objArr8;
                                        i26 = length2;
                                        i27 = i36;
                                        j16 = j18;
                                        i28 = i38;
                                        i29 = i39;
                                    } else {
                                        aVar.f68832j = true;
                                        try {
                                            Object objD2 = t0Var3.d(obj);
                                            if (objD2 != null) {
                                                if (objD2 instanceof u0) {
                                                    u0 u0Var2 = (u0) objD2;
                                                    Object[] objArr9 = u0Var2.f134733b;
                                                    long[] jArr6 = u0Var2.f134732a;
                                                    objArr5 = objArr8;
                                                    int length3 = jArr6.length - 2;
                                                    if (length3 >= 0) {
                                                        j16 = j18;
                                                        int i45 = 0;
                                                        Object[] objArr10 = objArr9;
                                                        while (true) {
                                                            long j19 = jArr6[i45];
                                                            i26 = length2;
                                                            i27 = i36;
                                                            if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i46 = 8 - ((~(i45 - length3)) >>> 31);
                                                                int i47 = 0;
                                                                while (i47 < i46) {
                                                                    if ((j19 & 255) < 128) {
                                                                        i30 = i47;
                                                                        p3.e0 e0Var = (p3.e0) objArr10[(i45 << 3) + i47];
                                                                        e0Var.getClass();
                                                                        j17 = j19;
                                                                        Object obj2 = map.get(e0Var);
                                                                        p3 p3VarB = e0Var.b();
                                                                        if (p3VarB == null) {
                                                                            p3VarB = a4.f135041a;
                                                                            p3VarB.getClass();
                                                                        }
                                                                        objArr7 = objArr10;
                                                                        if (p3VarB.a(e0Var.r().f135063f, obj2)) {
                                                                            i34 = i38;
                                                                            i35 = i39;
                                                                            cVar2.b(e0Var);
                                                                        } else {
                                                                            Object objD3 = f1Var2.d(e0Var);
                                                                            if (objD3 == null) {
                                                                                i34 = i38;
                                                                                i35 = i39;
                                                                            } else if (objD3 instanceof u0) {
                                                                                u0 u0Var3 = (u0) objD3;
                                                                                Object[] objArr11 = u0Var3.f134733b;
                                                                                long[] jArr7 = u0Var3.f134732a;
                                                                                int length4 = jArr7.length - 2;
                                                                                if (length4 >= 0) {
                                                                                    int i48 = 0;
                                                                                    while (true) {
                                                                                        long j24 = jArr7[i48];
                                                                                        i34 = i38;
                                                                                        i35 = i39;
                                                                                        if ((((~j24) << 7) & j24 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                            if (i48 != length4) {
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            i48++;
                                                                                            i38 = i34;
                                                                                            i39 = i35;
                                                                                            i37 = 8;
                                                                                        } else {
                                                                                            int i49 = 8 - ((~(i48 - length4)) >>> 31);
                                                                                            for (int i54 = 0; i54 < i49; i54++) {
                                                                                                if ((j24 & 255) < 128) {
                                                                                                    u0Var.d(objArr11[(i48 << 3) + i54]);
                                                                                                    z14 = true;
                                                                                                }
                                                                                                j24 >>= i37;
                                                                                            }
                                                                                            if (i49 != i37) {
                                                                                                break;
                                                                                            }
                                                                                            if (i48 != length4) {
                                                                                                break;
                                                                                            }
                                                                                            i48++;
                                                                                            i38 = i34;
                                                                                            i39 = i35;
                                                                                            i37 = 8;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i34 = i38;
                                                                                    i35 = i39;
                                                                                }
                                                                            } else {
                                                                                i34 = i38;
                                                                                i35 = i39;
                                                                                u0Var.d(objD3);
                                                                                z14 = true;
                                                                            }
                                                                            Unit unit = Unit.INSTANCE;
                                                                        }
                                                                    } else {
                                                                        i30 = i47;
                                                                        j17 = j19;
                                                                        objArr7 = objArr10;
                                                                        i34 = i38;
                                                                        i35 = i39;
                                                                    }
                                                                    j19 = j17 >> 8;
                                                                    i37 = 8;
                                                                    i47 = i30 + 1;
                                                                    objArr10 = objArr7;
                                                                    i38 = i34;
                                                                    i39 = i35;
                                                                }
                                                                objArr6 = objArr10;
                                                                i28 = i38;
                                                                i29 = i39;
                                                                if (i46 != i37) {
                                                                    break;
                                                                }
                                                            } else {
                                                                objArr6 = objArr10;
                                                                i28 = i38;
                                                                i29 = i39;
                                                            }
                                                            if (i45 == length3) {
                                                                break;
                                                            }
                                                            i45++;
                                                            length2 = i26;
                                                            i36 = i27;
                                                            objArr10 = objArr6;
                                                            i38 = i28;
                                                            i39 = i29;
                                                            i37 = 8;
                                                        }
                                                    }
                                                } else {
                                                    objArr5 = objArr8;
                                                    i26 = length2;
                                                    i27 = i36;
                                                    j16 = j18;
                                                    i28 = i38;
                                                    i29 = i39;
                                                    p3.e0 e0Var2 = (p3.e0) objD2;
                                                    Object obj3 = map.get(e0Var2);
                                                    p3 p3VarB2 = e0Var2.b();
                                                    if (p3VarB2 == null) {
                                                        p3VarB2 = a4.f135041a;
                                                        p3VarB2.getClass();
                                                    }
                                                    if (p3VarB2.a(e0Var2.r().f135063f, obj3)) {
                                                        cVar2.b(e0Var2);
                                                    } else {
                                                        Object objD4 = f1Var2.d(e0Var2);
                                                        if (objD4 != null) {
                                                            if (objD4 instanceof u0) {
                                                                u0 u0Var4 = (u0) objD4;
                                                                Object[] objArr12 = u0Var4.f134733b;
                                                                long[] jArr8 = u0Var4.f134732a;
                                                                int length5 = jArr8.length - 2;
                                                                if (length5 >= 0) {
                                                                    int i55 = 0;
                                                                    while (true) {
                                                                        long j25 = jArr8[i55];
                                                                        if ((((~j25) << 7) & j25 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                            if (i55 != length5) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i55++;
                                                                        } else {
                                                                            int i56 = 8 - ((~(i55 - length5)) >>> 31);
                                                                            for (int i57 = 0; i57 < i56; i57++) {
                                                                                if ((j25 & 255) < 128) {
                                                                                    u0Var.d(objArr12[(i55 << 3) + i57]);
                                                                                    z14 = true;
                                                                                }
                                                                                j25 >>= 8;
                                                                            }
                                                                            if (i56 != 8) {
                                                                                break;
                                                                            }
                                                                            if (i55 != length5) {
                                                                                break;
                                                                            }
                                                                            i55++;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                u0Var.d(objD4);
                                                                z14 = true;
                                                            }
                                                        }
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                }
                                                aVar.f68832j = false;
                                            } else {
                                                objArr5 = objArr8;
                                            }
                                            i26 = length2;
                                            i27 = i36;
                                            j16 = j18;
                                            i28 = i38;
                                            i29 = i39;
                                            aVar.f68832j = false;
                                        } catch (Throwable th3) {
                                            aVar.f68832j = false;
                                            throw th3;
                                        }
                                    }
                                    Object objD5 = f1Var2.d(obj);
                                    if (objD5 != null) {
                                        if (objD5 instanceof u0) {
                                            u0 u0Var5 = (u0) objD5;
                                            Object[] objArr13 = u0Var5.f134733b;
                                            long[] jArr9 = u0Var5.f134732a;
                                            int length6 = jArr9.length - 2;
                                            if (length6 >= 0) {
                                                int i58 = 0;
                                                while (true) {
                                                    long j26 = jArr9[i58];
                                                    if ((((~j26) << 7) & j26 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i58 != length6) {
                                                            break;
                                                            break;
                                                        }
                                                        i58++;
                                                    } else {
                                                        int i59 = 8 - ((~(i58 - length6)) >>> 31);
                                                        for (int i64 = 0; i64 < i59; i64++) {
                                                            if ((j26 & 255) < 128) {
                                                                u0Var.d(objArr13[(i58 << 3) + i64]);
                                                                z14 = true;
                                                            }
                                                            j26 >>= 8;
                                                        }
                                                        if (i59 != 8) {
                                                            break;
                                                        }
                                                        if (i58 != length6) {
                                                            break;
                                                        }
                                                        i58++;
                                                    }
                                                }
                                            }
                                        } else {
                                            u0Var.d(objD5);
                                            z14 = true;
                                        }
                                    }
                                    j18 = j16 >> 8;
                                    i39 = i29 + 1;
                                    jArr5 = jArr4;
                                    i37 = 8;
                                    objArr8 = objArr5;
                                    length2 = i26;
                                    i36 = i27;
                                    i38 = i28;
                                } else {
                                    jArr4 = jArr5;
                                }
                                objArr5 = objArr8;
                                i26 = length2;
                                i27 = i36;
                                j16 = j18;
                                i28 = i38;
                                i29 = i39;
                                j18 = j16 >> 8;
                                i39 = i29 + 1;
                                jArr5 = jArr4;
                                i37 = 8;
                                objArr8 = objArr5;
                                length2 = i26;
                                i36 = i27;
                                i38 = i28;
                            }
                            jArr3 = jArr5;
                            objArr4 = objArr8;
                            int i65 = length2;
                            int i66 = i36;
                            if (i38 != i37) {
                                break;
                            }
                            length2 = i65;
                            i25 = i66;
                        } else {
                            jArr3 = jArr5;
                            objArr4 = objArr8;
                            i25 = i36;
                        }
                        if (i25 == length2) {
                            break;
                        }
                        i36 = i25 + 1;
                        jArr5 = jArr3;
                        objArr8 = objArr4;
                    }
                } else {
                    c14 = 7;
                    j8 = -9187201950435737472L;
                    z14 = false;
                }
            } else {
                c14 = 7;
                j8 = -9187201950435737472L;
                Iterator it4 = set.iterator();
                boolean z17 = false;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (next instanceof h0) {
                        int i67 = d.f68726b;
                        if (((h0) next).A(2)) {
                            if (aVar.f68832j && t0Var3.b(next)) {
                                aVar.f68832j = true;
                                try {
                                    Object objD6 = t0Var3.d(next);
                                    if (objD6 != null) {
                                        try {
                                            if (objD6 instanceof u0) {
                                                u0 u0Var6 = (u0) objD6;
                                                Object[] objArr14 = u0Var6.f134733b;
                                                long[] jArr10 = u0Var6.f134732a;
                                                int length7 = jArr10.length - 2;
                                                if (length7 >= 0) {
                                                    int i68 = 0;
                                                    while (true) {
                                                        long j27 = jArr10[i68];
                                                        long[] jArr11 = jArr10;
                                                        Object[] objArr15 = objArr14;
                                                        if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i69 = 8 - ((~(i68 - length7)) >>> 31);
                                                            int i74 = 0;
                                                            while (i74 < i69) {
                                                                if ((j27 & 255) < 128) {
                                                                    it3 = it4;
                                                                    p3.e0 e0Var3 = (p3.e0) objArr15[(i68 << 3) + i74];
                                                                    e0Var3.getClass();
                                                                    boolean z18 = z17;
                                                                    Object obj4 = map.get(e0Var3);
                                                                    p3 p3VarB3 = e0Var3.b();
                                                                    if (p3VarB3 == null) {
                                                                        p3VarB3 = a4.f135041a;
                                                                        p3VarB3.getClass();
                                                                    }
                                                                    i17 = i74;
                                                                    j15 = j27;
                                                                    if (p3VarB3.a(e0Var3.r().f135063f, obj4)) {
                                                                        objArr3 = objArr15;
                                                                        cVar2.b(e0Var3);
                                                                        z17 = z18;
                                                                    } else {
                                                                        Object objD7 = f1Var2.d(e0Var3);
                                                                        if (objD7 == null) {
                                                                            objArr3 = objArr15;
                                                                            z17 = z18;
                                                                        } else if (objD7 instanceof u0) {
                                                                            u0 u0Var7 = (u0) objD7;
                                                                            Object[] objArr16 = u0Var7.f134733b;
                                                                            long[] jArr12 = u0Var7.f134732a;
                                                                            int length8 = jArr12.length - 2;
                                                                            if (length8 >= 0) {
                                                                                objArr3 = objArr15;
                                                                                int i75 = 0;
                                                                                while (true) {
                                                                                    long j28 = jArr12[i75];
                                                                                    long[] jArr13 = jArr12;
                                                                                    if ((((~j28) << 7) & j28 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                        if (i75 != length8) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        i75++;
                                                                                        jArr12 = jArr13;
                                                                                    } else {
                                                                                        int i76 = 8 - ((~(i75 - length8)) >>> 31);
                                                                                        for (int i77 = 0; i77 < i76; i77++) {
                                                                                            if ((j28 & 255) < 128) {
                                                                                                u0Var.d(objArr16[(i75 << 3) + i77]);
                                                                                                z18 = true;
                                                                                            }
                                                                                            j28 >>= 8;
                                                                                        }
                                                                                        if (i76 != 8) {
                                                                                            break;
                                                                                        }
                                                                                        if (i75 != length8) {
                                                                                            break;
                                                                                        }
                                                                                        i75++;
                                                                                        jArr12 = jArr13;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                objArr3 = objArr15;
                                                                            }
                                                                            z17 = z18;
                                                                        } else {
                                                                            objArr3 = objArr15;
                                                                            u0Var.d(objD7);
                                                                            z17 = true;
                                                                        }
                                                                        Unit unit3 = Unit.INSTANCE;
                                                                    }
                                                                } else {
                                                                    it3 = it4;
                                                                    i17 = i74;
                                                                    j15 = j27;
                                                                    objArr3 = objArr15;
                                                                }
                                                                i74 = i17 + 1;
                                                                j27 = j15 >> 8;
                                                                objArr15 = objArr3;
                                                                aVar = this;
                                                                it4 = it3;
                                                            }
                                                            it = it4;
                                                            objArr2 = objArr15;
                                                            if (i69 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            it = it4;
                                                            objArr2 = objArr15;
                                                        }
                                                        if (i68 == length7) {
                                                            break;
                                                        }
                                                        i68++;
                                                        aVar = this;
                                                        it4 = it;
                                                        jArr10 = jArr11;
                                                        objArr14 = objArr2;
                                                    }
                                                } else {
                                                    it = it4;
                                                }
                                            } else {
                                                it = it4;
                                                p3.e0 e0Var4 = (p3.e0) objD6;
                                                Object obj5 = map.get(e0Var4);
                                                p3 p3VarB4 = e0Var4.b();
                                                if (p3VarB4 == null) {
                                                    p3VarB4 = a4.f135041a;
                                                    p3VarB4.getClass();
                                                }
                                                if (p3VarB4.a(e0Var4.r().f135063f, obj5)) {
                                                    cVar2.b(e0Var4);
                                                } else {
                                                    Object objD8 = f1Var2.d(e0Var4);
                                                    if (objD8 != null) {
                                                        if (objD8 instanceof u0) {
                                                            u0 u0Var8 = (u0) objD8;
                                                            Object[] objArr17 = u0Var8.f134733b;
                                                            long[] jArr14 = u0Var8.f134732a;
                                                            int length9 = jArr14.length - 2;
                                                            if (length9 >= 0) {
                                                                int i78 = 0;
                                                                while (true) {
                                                                    long j29 = jArr14[i78];
                                                                    if ((((~j29) << 7) & j29 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i78 != length9) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i78++;
                                                                    } else {
                                                                        int i79 = 8 - ((~(i78 - length9)) >>> 31);
                                                                        for (int i84 = 0; i84 < i79; i84++) {
                                                                            if ((j29 & 255) < 128) {
                                                                                u0Var.d(objArr17[(i78 << 3) + i84]);
                                                                                z17 = true;
                                                                            }
                                                                            j29 >>= 8;
                                                                        }
                                                                        if (i79 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i78 != length9) {
                                                                            break;
                                                                        }
                                                                        i78++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            u0Var.d(objD8);
                                                            z17 = true;
                                                        }
                                                    }
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            z15 = false;
                                            aVar = this;
                                            aVar.f68832j = z15;
                                            throw th;
                                        }
                                    } else {
                                        it = it4;
                                    }
                                    aVar = this;
                                    aVar.f68832j = false;
                                } catch (Throwable th5) {
                                    th = th5;
                                    z15 = false;
                                }
                            } else {
                                it = it4;
                            }
                            objD = f1Var2.d(next);
                            if (objD == null) {
                                if (objD instanceof u0) {
                                    u0 u0Var9 = (u0) objD;
                                    objArr = u0Var9.f134733b;
                                    jArr = u0Var9.f134732a;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i14 = 0;
                                        while (true) {
                                            j14 = jArr[i14];
                                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                if (i14 != length) {
                                                    break;
                                                    break;
                                                }
                                                i14++;
                                            } else {
                                                i15 = 8 - ((~(i14 - length)) >>> 31);
                                                for (i16 = 0; i16 < i15; i16++) {
                                                    if ((j14 & 255) < 128) {
                                                        u0Var.d(objArr[(i14 << 3) + i16]);
                                                        z17 = true;
                                                    }
                                                    j14 >>= 8;
                                                }
                                                if (i15 == 8) {
                                                    break;
                                                }
                                                if (i14 != length) {
                                                    break;
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                } else {
                                    u0Var.d(objD);
                                    z17 = true;
                                }
                            }
                        } else {
                            it = it4;
                        }
                    } else {
                        if (aVar.f68832j) {
                            it = it4;
                        } else {
                            it = it4;
                        }
                        objD = f1Var2.d(next);
                        if (objD == null) {
                            if (objD instanceof u0) {
                                u0 u0Var10 = (u0) objD;
                                objArr = u0Var10.f134733b;
                                jArr = u0Var10.f134732a;
                                length = jArr.length - 2;
                                if (length >= 0) {
                                    i14 = 0;
                                    while (true) {
                                        j14 = jArr[i14];
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            if (i14 != length) {
                                                break;
                                                break;
                                            }
                                            i14++;
                                        } else {
                                            i15 = 8 - ((~(i14 - length)) >>> 31);
                                            while (i16 < i15) {
                                                if ((j14 & 255) < 128) {
                                                    u0Var.d(objArr[(i14 << 3) + i16]);
                                                    z17 = true;
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i15 == 8) {
                                                break;
                                                break;
                                            }
                                            if (i14 != length) {
                                                break;
                                                break;
                                            }
                                            i14++;
                                        }
                                    }
                                }
                            } else {
                                u0Var.d(objD);
                                z17 = true;
                            }
                        }
                    }
                    it4 = it;
                }
                z14 = z17;
            }
            if (!aVar.f68832j && (i18 = cVar2.f142358c) != 0) {
                p3.e0<?>[] e0VarArr2 = cVar2.f142356a;
                int i85 = 0;
                while (i85 < i18) {
                    p3.e0<?> e0Var5 = e0VarArr2[i85];
                    int iHashCode = Long.hashCode(l.i().getF68737b());
                    Object objD9 = f1Var2.d(e0Var5);
                    if (objD9 != null) {
                        boolean z19 = objD9 instanceof u0;
                        t0<Object, p0<Object>> t0Var4 = aVar.f68828f;
                        if (z19) {
                            u0 u0Var11 = (u0) objD9;
                            Object[] objArr18 = u0Var11.f134733b;
                            long[] jArr15 = u0Var11.f134732a;
                            int length10 = jArr15.length - 2;
                            if (length10 >= 0) {
                                int i86 = 0;
                                while (true) {
                                    long j34 = jArr15[i86];
                                    t0<Object, p0<Object>> t0Var5 = t0Var4;
                                    if ((((~j34) << c14) & j34 & j8) != j8) {
                                        int i87 = 8 - ((~(i86 - length10)) >>> 31);
                                        int i88 = 0;
                                        while (i88 < i87) {
                                            if ((j34 & 255) < 128) {
                                                Object obj6 = objArr18[(i86 << 3) + i88];
                                                t0Var2 = t0Var5;
                                                p0<Object> p0VarD = t0Var2.d(obj6);
                                                if (p0VarD == null) {
                                                    p0Var = new p0<>(0, 1, null);
                                                    t0Var2.m(obj6, p0Var);
                                                    Unit unit5 = Unit.INSTANCE;
                                                } else {
                                                    p0Var = p0VarD;
                                                }
                                                aVar.b(e0Var5, iHashCode, obj6, p0Var);
                                            } else {
                                                i85 = i85;
                                                f1Var2 = f1Var2;
                                                jArr15 = jArr15;
                                                t0Var2 = t0Var5;
                                            }
                                            j34 >>= 8;
                                            i88++;
                                            t0Var5 = t0Var2;
                                            e0VarArr2 = e0VarArr2;
                                            i18 = i18;
                                            cVar2 = cVar2;
                                            i85 = i85;
                                            f1Var2 = f1Var2;
                                            jArr15 = jArr15;
                                        }
                                        i19 = i18;
                                        e0VarArr = e0VarArr2;
                                        cVar = cVar2;
                                        i24 = i85;
                                        f1Var = f1Var2;
                                        jArr2 = jArr15;
                                        t0Var = t0Var5;
                                        if (i87 != 8) {
                                            break;
                                        }
                                    } else {
                                        i19 = i18;
                                        e0VarArr = e0VarArr2;
                                        cVar = cVar2;
                                        i24 = i85;
                                        f1Var = f1Var2;
                                        jArr2 = jArr15;
                                        t0Var = t0Var5;
                                    }
                                    if (i86 == length10) {
                                        break;
                                    }
                                    i86++;
                                    t0Var4 = t0Var;
                                    e0VarArr2 = e0VarArr;
                                    i18 = i19;
                                    cVar2 = cVar;
                                    i85 = i24;
                                    f1Var2 = f1Var;
                                    jArr15 = jArr2;
                                }
                            } else {
                                i19 = i18;
                                e0VarArr = e0VarArr2;
                                cVar = cVar2;
                                i24 = i85;
                                f1Var = f1Var2;
                            }
                        } else {
                            i19 = i18;
                            e0VarArr = e0VarArr2;
                            cVar = cVar2;
                            i24 = i85;
                            f1Var = f1Var2;
                            p0<Object> p0VarD2 = t0Var4.d(objD9);
                            if (p0VarD2 == null) {
                                p0VarD2 = new p0<>(0, 1, null);
                                t0Var4.m(objD9, p0VarD2);
                                Unit unit6 = Unit.INSTANCE;
                            }
                            aVar.b(e0Var5, iHashCode, objD9, p0VarD2);
                        }
                    } else {
                        i19 = i18;
                        e0VarArr = e0VarArr2;
                        cVar = cVar2;
                        i24 = i85;
                        f1Var = f1Var2;
                    }
                    i85 = i24 + 1;
                    e0VarArr2 = e0VarArr;
                    i18 = i19;
                    cVar2 = cVar;
                    f1Var2 = f1Var;
                }
                cVar2.g();
            }
            return z14;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x008f A[LOOP:0: B:15:0x0048->B:28:0x008f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x0092 A[EDGE_INSN: B:37:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008f], SYNTHETIC] */
        public final void b(Object obj, int i14, Object obj2, p0<Object> p0Var) {
            int i15;
            if (this.f68833k > 0) {
                return;
            }
            int iE = p0Var.e(obj);
            if (iE < 0) {
                iE = ~iE;
                i15 = -1;
            } else {
                i15 = p0Var.f134875c[iE];
            }
            p0Var.f134874b[iE] = obj;
            p0Var.f134875c[iE] = i14;
            if ((obj instanceof p3.e0) && i15 != i14) {
                p3.d0.a aVarR = ((p3.e0) obj).r();
                this.f68835m.put(obj, aVarR.f135063f);
                y0<g0> y0Var = aVarR.f135062e;
                t0<Object, Object> t0Var = this.f68834l;
                q3.f.c(t0Var, obj);
                Object[] objArr = y0Var.f134874b;
                long[] jArr = y0Var.f134873a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j8 = jArr[i16];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i16 != length) {
                                break;
                                break;
                            }
                            i16++;
                        } else {
                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j8 & 255) < 128) {
                                    g0 g0Var = (g0) objArr[(i16 << 3) + i18];
                                    if (g0Var instanceof h0) {
                                        int i19 = d.f68726b;
                                        ((h0) g0Var).C(2);
                                    }
                                    q3.f.a(t0Var, g0Var, obj);
                                }
                                j8 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            } else if (i16 != length) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                }
            }
            if (i15 == -1) {
                if (obj instanceof h0) {
                    int i24 = d.f68726b;
                    ((h0) obj).C(2);
                }
                q3.f.a(this.f68827e, obj, obj2);
            }
        }

        public final void c(Object obj, Object obj2) {
            t0<Object, Object> t0Var = this.f68827e;
            q3.f.b(t0Var, obj2, obj);
            if (!(obj2 instanceof p3.e0) || t0Var.b(obj2)) {
                return;
            }
            q3.f.c(this.f68834l, obj2);
            this.f68835m.remove(obj2);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void d(e23.l<Object, Boolean> lVar) {
            long[] jArr;
            long[] jArr2;
            long j8;
            char c14;
            long j14;
            int i14;
            t0<Object, p0<Object>> t0Var = this.f68828f;
            long[] jArr3 = t0Var.f134720a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j15 = jArr3[i15];
                char c15 = 7;
                long j16 = -9187201950435737472L;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j15 & 255) < 128) {
                            int i19 = (i15 << 3) + i18;
                            c14 = c15;
                            Object obj = t0Var.f134721b[i19];
                            j14 = j16;
                            p0 p0Var = (p0) t0Var.f134722c[i19];
                            Boolean boolInvoke = lVar.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = p0Var.f134874b;
                                int[] iArr = p0Var.f134875c;
                                long[] jArr4 = p0Var.f134873a;
                                int i24 = i16;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j8 = j15;
                                    int i25 = 0;
                                    while (true) {
                                        long j17 = jArr4[i25];
                                        long[] jArr5 = jArr4;
                                        if ((((~j17) << c14) & j17 & j14) != j14) {
                                            int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                            for (int i27 = 0; i27 < i26; i27++) {
                                                if ((j17 & 255) < 128) {
                                                    int i28 = (i25 << 3) + i27;
                                                    Object obj2 = objArr[i28];
                                                    int i29 = iArr[i28];
                                                    c(obj, obj2);
                                                }
                                                j17 >>= i24;
                                            }
                                            if (i26 != i24) {
                                                break;
                                            }
                                            if (i25 != length2) {
                                                break;
                                            }
                                            i25++;
                                            jArr4 = jArr5;
                                            i24 = 8;
                                        } else if (i25 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i25++;
                                            jArr4 = jArr5;
                                            i24 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j8 = j15;
                                }
                            } else {
                                jArr2 = jArr3;
                                j8 = j15;
                            }
                            if (boolInvoke.booleanValue()) {
                                t0Var.l(i19);
                            }
                            i14 = 8;
                        } else {
                            jArr2 = jArr3;
                            j8 = j15;
                            c14 = c15;
                            j14 = j16;
                            i14 = i16;
                        }
                        i18++;
                        i16 = i14;
                        j15 = j8 >> i14;
                        c15 = c14;
                        j16 = j14;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i17 != i16) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i15 == length) {
                    return;
                }
                i15++;
                jArr3 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(e23.l<? super e23.a<Unit>, Unit> lVar) {
        this.f68813a = lVar;
    }

    public final void a() {
        synchronized (this.f68819g) {
            try {
                q3.c<a> cVar = this.f68818f;
                a[] aVarArr = cVar.f142356a;
                int i14 = cVar.f142358c;
                for (int i15 = 0; i15 < i14; i15++) {
                    a aVar = aVarArr[i15];
                    aVar.f68827e.g();
                    aVar.f68828f.g();
                    aVar.f68834l.g();
                    aVar.f68835m.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:14:0x002e->B:25:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0011, B:26:0x007a, B:28:0x0082, B:33:0x0092, B:30:0x0087, B:11:0x0022, B:14:0x002e, B:16:0x0043, B:18:0x0051, B:20:0x005b, B:21:0x0066, B:25:0x0073, B:34:0x0098), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a A[EDGE_INSN: B:46:0x007a->B:26:0x007a BREAK  A[LOOP:1: B:14:0x002e->B:25:0x0073], SYNTHETIC] */
    public final void b(Object obj) {
        int i14;
        synchronized (this.f68819g) {
            try {
                q3.c<a> cVar = this.f68818f;
                int i15 = cVar.f142358c;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    a[] aVarArr = cVar.f142356a;
                    if (i16 < i15) {
                        a aVar = aVarArr[i16];
                        p0<Object> p0VarK = aVar.f68828f.k(obj);
                        if (p0VarK == null) {
                            i14 = i16;
                        } else {
                            Object[] objArr = p0VarK.f134874b;
                            int[] iArr = p0VarK.f134875c;
                            long[] jArr = p0VarK.f134873a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i18 = 0;
                                while (true) {
                                    long j8 = jArr[i18];
                                    i14 = i16;
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                                        for (int i24 = 0; i24 < i19; i24++) {
                                            if ((j8 & 255) < 128) {
                                                int i25 = (i18 << 3) + i24;
                                                Object obj2 = objArr[i25];
                                                int i26 = iArr[i25];
                                                aVar.c(obj, obj2);
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i19 != 8) {
                                            break;
                                        }
                                        if (i18 != length) {
                                            break;
                                        }
                                        i18++;
                                        i16 = i14;
                                    } else if (i18 != length) {
                                        break;
                                        break;
                                    } else {
                                        i18++;
                                        i16 = i14;
                                    }
                                }
                            } else {
                                i14 = i16;
                            }
                        }
                        if (!aVar.f68828f.f()) {
                            i17++;
                        } else if (i17 > 0) {
                            a[] aVarArr2 = cVar.f142356a;
                            aVarArr2[i14 - i17] = aVarArr2[i14];
                        }
                        i16 = i14 + 1;
                    } else {
                        int i27 = i15 - i17;
                        p13.s.m(i27, i15, null, aVarArr);
                        cVar.f142358c = i27;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c() {
        boolean z14;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (this.f68819g) {
            z14 = this.f68815c;
        }
        if (z14) {
            return false;
        }
        boolean z15 = false;
        while (true) {
            AtomicReference<Object> atomicReference = this.f68814b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        p3.n.b("Unexpected notification");
                        o2.c.f();
                        return false;
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                do {
                    if (atomicReference.compareAndSet(obj, objSubList)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z15;
            }
            synchronized (this.f68819g) {
                try {
                    q3.c<a> cVar = this.f68818f;
                    a[] aVarArr = cVar.f142356a;
                    int i14 = cVar.f142358c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        z15 = aVarArr[i15].a(set) || z15;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void d(T t7, e23.l<? super T, Unit> lVar, e23.a<Unit> aVar) {
        a aVar2;
        a aVar3;
        boolean z14;
        a aVar4;
        long j8;
        Unit unit;
        long j14;
        a aVar5;
        f m0Var;
        long j15;
        p0<Object> p0Var;
        int i14;
        long j16;
        p0<Object> p0Var2;
        long jA = z3.k.a();
        synchronized (this.f68819g) {
            q3.c<a> cVar = this.f68818f;
            a[] aVarArr = cVar.f142356a;
            int i15 = cVar.f142358c;
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArr[i16];
                if (aVar2.f68823a == lVar) {
                    break;
                } else {
                    i16++;
                }
            }
            aVar3 = aVar2;
            z14 = true;
            if (aVar3 == null) {
                lVar.getClass();
                p005kotlin.jvm.internal.y0.e(1, lVar);
                aVar3 = new a(lVar);
                cVar.b(aVar3);
            }
            aVar4 = this.f68821i;
            j8 = this.f68822j;
            unit = Unit.INSTANCE;
        }
        Object obj = unit;
        if (j8 != -1 && j8 != jA) {
            obj = unit;
            StringBuilder sbK = ds.e0.k(j8, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbK.append(jA);
            sbK.append(", name=");
            sbK.append(Thread.currentThread().getName());
            sbK.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            j2.a(sbK.toString());
            obj = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj = unit;
            synchronized (this.f68819g) {
                try {
                    this.f68821i = aVar3;
                    this.f68822j = jA;
                } catch (Throwable th3) {
                    th = th3;
                    j14 = obj;
                }
            }
            o0 o0Var = this.f68817e;
            Object obj2 = aVar3.f68824b;
            p0<Object> p0Var3 = aVar3.f68825c;
            int i17 = aVar3.f68826d;
            aVar3.f68824b = t7;
            aVar3.f68825c = aVar3.f68828f.d(t7);
            if (aVar3.f68826d == -1) {
                aVar3.f68826d = Long.hashCode(l.i().getF68737b());
            }
            a.C1423a c1423a = aVar3.f68831i;
            q3.c cVarE = p3.p0.e();
            try {
                cVarE.b(c1423a);
                f.a aVar6 = f.f68735e;
                if (o0Var == null) {
                    aVar.invoke();
                    aVar5 = aVar3;
                } else {
                    f fVarA = l.f68774b.a();
                    if (fVarA instanceof m0) {
                        aVar5 = aVar3;
                        if (((m0) fVarA).f68795u == z3.k.a()) {
                            e23.l<Object, Unit> lVar2 = ((m0) fVarA).f68793s;
                            e23.l<Object, Unit> lVar3 = ((m0) fVarA).f68794t;
                            try {
                                ((m0) fVarA).f68793s = l.j(o0Var, true, lVar2);
                                ((m0) fVarA).f68794t = lVar3;
                                aVar.invoke();
                                ((m0) fVarA).f68793s = lVar2;
                                ((m0) fVarA).f68794t = lVar3;
                            } catch (Throwable th4) {
                                ((m0) fVarA).f68793s = lVar2;
                                ((m0) fVarA).f68794t = lVar3;
                                throw th4;
                            }
                        }
                    } else {
                        aVar5 = aVar3;
                    }
                    if (fVarA == null || (fVarA instanceof f4.a)) {
                        m0Var = new m0(fVarA instanceof f4.a ? (f4.a) fVarA : null, o0Var, null, true, false);
                    } else {
                        m0Var = fVarA.u(o0Var);
                    }
                    try {
                        f fVarJ = m0Var.j();
                        try {
                            aVar.invoke();
                            f.q(fVarJ);
                            m0Var.c();
                        } catch (Throwable th5) {
                            try {
                                f.q(fVarJ);
                                throw th5;
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    m0Var.c();
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    cVarE.k(cVarE.f142358c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                cVarE.k(cVarE.f142358c - 1);
                a aVar7 = aVar5;
                Object obj3 = aVar7.f68824b;
                obj3.getClass();
                int i18 = aVar7.f68826d;
                p0<Object> p0Var4 = aVar7.f68825c;
                if (p0Var4 != null) {
                    try {
                        long[] jArr = p0Var4.f134873a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j17 = jArr[i19];
                                boolean z15 = z14;
                                p0<Object> p0Var5 = p0Var4;
                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i24 = 8 - ((~(i19 - length)) >>> 31);
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        if ((j17 & 255) < 128) {
                                            i14 = i25;
                                            int i26 = (i19 << 3) + i14;
                                            j16 = j17;
                                            p0Var2 = p0Var5;
                                            Object obj4 = p0Var2.f134874b[i26];
                                            j15 = j8;
                                            try {
                                                boolean z16 = p0Var2.f134875c[i26] != i18 ? z15 : false;
                                                if (z16) {
                                                    aVar7.c(obj3, obj4);
                                                }
                                                if (z16) {
                                                    p0Var2.g(i26);
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                j14 = j15;
                                                synchronized (this.f68819g) {
                                                    this.f68821i = aVar4;
                                                    this.f68822j = j14;
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i14 = i25;
                                            j16 = j17;
                                            p0Var2 = p0Var5;
                                            j15 = j8;
                                        }
                                        i25 = i14 + 1;
                                        long j18 = j15;
                                        p0Var5 = p0Var2;
                                        j17 = j16 >> 8;
                                        j8 = j18;
                                    }
                                    p0Var = p0Var5;
                                    j15 = j8;
                                    if (i24 != 8) {
                                        break;
                                    }
                                } else {
                                    p0Var = p0Var5;
                                    j15 = j8;
                                }
                                if (i19 == length) {
                                    break;
                                }
                                i19++;
                                p0Var4 = p0Var;
                                z14 = z15;
                                j8 = j15;
                            }
                        } else {
                            j15 = j8;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        j15 = j8;
                        j14 = j15;
                        synchronized (this.f68819g) {
                            this.f68821i = aVar4;
                            this.f68822j = j14;
                            Unit unit3 = Unit.INSTANCE;
                            throw th;
                        }
                    }
                } else {
                    j15 = j8;
                }
                aVar7.f68824b = obj2;
                aVar7.f68825c = p0Var3;
                aVar7.f68826d = i17;
                synchronized (this.f68819g) {
                    this.f68821i = aVar4;
                    this.f68822j = j15;
                    Unit unit4 = Unit.INSTANCE;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
            j14 = j8;
        }
    }
}
