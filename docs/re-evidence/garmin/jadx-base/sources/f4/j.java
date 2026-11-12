package f4;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\fB5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lf4/j;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements Iterable<Long>, f23.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f68751e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f68752f = new j(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f68756d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc53/l;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.h implements e23.p<c53.l<? super Long>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long[] f68757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68761e;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = j.this.new b(dVar);
            bVar.f68761e = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(c53.l<? super Long> lVar, t13.d<? super Unit> dVar) {
            return ((b) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00df  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:30:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:30:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:42:0x00e0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:44:0x00e3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f4.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private j(long j8, long j14, long j15, long[] jArr) {
        this.f68753a = j8;
        this.f68754b = j14;
        this.f68755c = j15;
        this.f68756d = jArr;
    }

    public final j a(j jVar) {
        j jVarB;
        long[] jArr;
        j jVar2 = f68752f;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j8 = jVar.f68755c;
        long j14 = jVar.f68755c;
        long[] jArr2 = jVar.f68756d;
        long j15 = jVar.f68754b;
        long j16 = jVar.f68753a;
        long j17 = this.f68755c;
        if (j8 == j17 && jArr2 == (jArr = this.f68756d)) {
            return new j(this.f68753a & (~j16), this.f68754b & (~j15), j17, jArr);
        }
        if (jArr2 != null) {
            jVarB = this;
            for (long j18 : jArr2) {
                jVarB = jVarB.b(j18);
            }
        } else {
            jVarB = this;
        }
        long j19 = 0;
        if (j15 != 0) {
            int i14 = 0;
            while (i14 < 64) {
                if (((1 << i14) & j15) != j19) {
                    jVarB = jVarB.b(((long) i14) + j14);
                }
                i14++;
                j19 = j19;
            }
        }
        long j24 = j19;
        if (j16 != j24) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j16) != j24) {
                    jVarB = jVarB.b(((long) i15) + j14 + ((long) 64));
                }
            }
        }
        return jVarB;
    }

    public final j b(long j8) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j14 = j8 - this.f68755c;
        long j15 = 0;
        if (p005kotlin.jvm.internal.s.i(j14, j15) >= 0 && p005kotlin.jvm.internal.s.i(j14, 64) < 0) {
            long j16 = 1 << ((int) j14);
            long j17 = this.f68754b;
            if ((j17 & j16) != 0) {
                return new j(this.f68753a, j17 & (~j16), this.f68755c, this.f68756d);
            }
        } else if (p005kotlin.jvm.internal.s.i(j14, 64) >= 0 && p005kotlin.jvm.internal.s.i(j14, 128) < 0) {
            long j18 = 1 << (((int) j14) - 64);
            long j19 = this.f68753a;
            if ((j19 & j18) != 0) {
                return new j(j19 & (~j18), this.f68754b, this.f68755c, this.f68756d);
            }
        } else if (p005kotlin.jvm.internal.s.i(j14, j15) < 0 && (jArr = this.f68756d) != null && (iC = t.c(jArr, j8)) >= 0) {
            int length = jArr.length;
            int i14 = length - 1;
            if (i14 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i14];
                if (iC > 0) {
                    p13.s.g(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i14) {
                    p13.s.g(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f68753a, this.f68754b, this.f68755c, jArr2);
        }
        return this;
    }

    public final boolean c(long j8) {
        long[] jArr;
        long j14 = j8 - this.f68755c;
        long j15 = 0;
        if (p005kotlin.jvm.internal.s.i(j14, j15) >= 0 && p005kotlin.jvm.internal.s.i(j14, 64) < 0) {
            return ((1 << ((int) j14)) & this.f68754b) != 0;
        }
        if (p005kotlin.jvm.internal.s.i(j14, 64) < 0 || p005kotlin.jvm.internal.s.i(j14, 128) >= 0) {
            return p005kotlin.jvm.internal.s.i(j14, j15) <= 0 && (jArr = this.f68756d) != null && t.c(jArr, j8) >= 0;
        }
        return ((1 << (((int) j14) - 64)) & this.f68753a) != 0;
    }

    public final j d(j jVar) {
        j jVarE;
        j jVarE2;
        long[] jArr;
        j jVar2 = f68752f;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar;
        }
        long j8 = jVar.f68755c;
        long j14 = jVar.f68755c;
        long[] jArr2 = jVar.f68756d;
        long j15 = jVar.f68754b;
        long j16 = jVar.f68753a;
        long j17 = this.f68755c;
        long j18 = this.f68754b;
        long j19 = this.f68753a;
        if (j8 == j17 && jArr2 == (jArr = this.f68756d)) {
            return new j(j19 | j16, j18 | j15, j17, jArr);
        }
        int i14 = 0;
        long[] jArr3 = this.f68756d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                jVarE = this;
                for (long j24 : jArr2) {
                    jVarE = jVarE.e(j24);
                }
            } else {
                jVarE = this;
            }
            if (j15 != 0) {
                for (int i15 = 0; i15 < 64; i15++) {
                    if (((1 << i15) & j15) != 0) {
                        jVarE = jVarE.e(((long) i15) + j14);
                    }
                }
            }
            if (j16 != 0) {
                while (i14 < 64) {
                    if (((1 << i14) & j16) != 0) {
                        jVarE = jVarE.e(((long) i14) + j14 + ((long) 64));
                    }
                    i14++;
                }
            }
            return jVarE;
        }
        if (jArr3 != null) {
            jVarE2 = jVar;
            for (long j25 : jArr3) {
                jVarE2 = jVarE2.e(j25);
            }
        } else {
            jVarE2 = jVar;
        }
        long j26 = this.f68755c;
        if (j18 != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if (((1 << i16) & j18) != 0) {
                    jVarE2 = jVarE2.e(((long) i16) + j26);
                }
            }
        }
        if (j19 != 0) {
            while (i14 < 64) {
                if (((1 << i14) & j19) != 0) {
                    jVarE2 = jVarE2.e(((long) i14) + j26 + ((long) 64));
                }
                i14++;
            }
        }
        return jVarE2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    public final j e(long j8) {
        long[] jArr;
        long j14;
        long[] jArr2;
        long[] jArr3;
        long j15 = this.f68755c;
        long j16 = j8 - j15;
        long j17 = 0;
        int i14 = p005kotlin.jvm.internal.s.i(j16, j17);
        long j18 = this.f68754b;
        int i15 = 64;
        long j19 = 0;
        if (i14 < 0 || p005kotlin.jvm.internal.s.i(j16, 64) >= 0) {
            long j24 = 64;
            int i16 = p005kotlin.jvm.internal.s.i(j16, j24);
            long j25 = this.f68753a;
            if (i16 < 0 || p005kotlin.jvm.internal.s.i(j16, 128) >= 0) {
                long j26 = 128;
                int i17 = p005kotlin.jvm.internal.s.i(j16, j26);
                long[] jArr4 = this.f68756d;
                if (i17 < 0) {
                    if (jArr4 == null) {
                        return new j(this.f68753a, this.f68754b, this.f68755c, new long[]{j8});
                    }
                    int iC = t.c(jArr4, j8);
                    if (iC < 0) {
                        int i18 = -(iC + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        p13.s.g(jArr4, jArr5, 0, 0, i18);
                        p13.s.g(jArr4, jArr5, i18 + 1, i18, length);
                        jArr5[i18] = j8;
                        return new j(this.f68753a, this.f68754b, this.f68755c, jArr5);
                    }
                } else if (!c(j8)) {
                    long j27 = 1;
                    long j28 = ((j8 + j27) / j24) * j24;
                    if (p005kotlin.jvm.internal.s.i(j28, j17) < 0) {
                        j28 = (Long.MAX_VALUE - j26) + j27;
                    }
                    long j29 = j15;
                    long j34 = j25;
                    i iVar = null;
                    while (true) {
                        if (p005kotlin.jvm.internal.s.i(j29, j28) >= 0) {
                            jArr = jArr4;
                            j14 = j29;
                            j19 = j18;
                            break;
                        }
                        if (j18 != 0) {
                            if (iVar == null) {
                                iVar = new i(jArr4);
                            }
                            int i19 = 0;
                            while (i19 < i15) {
                                if ((j18 & (1 << i19)) != 0) {
                                    iVar.f68748a.a(((long) i19) + j29);
                                }
                                i19++;
                                jArr4 = jArr4;
                                i15 = 64;
                            }
                        }
                        long[] jArr6 = jArr4;
                        if (j34 == 0) {
                            j14 = j28;
                            jArr = jArr6;
                            break;
                        }
                        j29 += j24;
                        jArr4 = jArr6;
                        j18 = j34;
                        i15 = 64;
                        j34 = 0;
                    }
                    if (iVar == null) {
                        jArr2 = jArr;
                    } else {
                        p1.l0 l0Var = iVar.f68748a;
                        int i24 = l0Var.f134838b;
                        if (i24 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr7 = new long[i24];
                            long[] jArr8 = l0Var.f134837a;
                            for (int i25 = 0; i25 < i24; i25++) {
                                jArr7[i25] = jArr8[i25];
                            }
                            jArr3 = jArr7;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new j(j34, j19, j14, jArr2).e(j8);
                }
            } else {
                long j35 = 1 << (((int) j16) - 64);
                if ((j25 & j35) == 0) {
                    return new j(j25 | j35, this.f68754b, this.f68755c, this.f68756d);
                }
            }
        } else {
            long j36 = 1 << ((int) j16);
            if ((j18 & j36) == 0) {
                return new j(this.f68753a, j18 | j36, this.f68755c, this.f68756d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return c53.n.a(new c53.m(new b(null)).f24571a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(" [");
        ArrayList arrayList = new ArrayList(p13.y.r(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "");
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = arrayList.get(i15);
            i14++;
            if (i14 > 1) {
                sb4.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb4.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb4.append(((Character) obj).charValue());
            } else {
                sb4.append((CharSequence) obj.toString());
            }
        }
        sb4.append((CharSequence) "");
        sb3.append(sb4.toString());
        sb3.append(']');
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4/j$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
