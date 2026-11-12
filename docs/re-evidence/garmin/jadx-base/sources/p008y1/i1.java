package p008y1;

import b5.m0;
import c5.e;
import e23.l;
import f5.d0;
import h5.k;
import java.util.ArrayList;
import n4.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import vb.h;
import y4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly1/i1;", "", "Ly1/p0;", "node", "<init>", "(Ly1/p0;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f193277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.C3608a f193278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.d f193279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.c f193280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.b f193281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f193282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f193283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f193284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v3 f193285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f193286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z1 f193287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f193288l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193301a;

        static {
            int[] iArr = new int[a.C3608a.EnumC3609a.values().length];
            try {
                iArr[a.C3608a.EnumC3609a.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f193301a = iArr;
        }
    }

    public i1(p0 p0Var) {
        this.f193277a = p0Var;
        c.f123541b.getClass();
        this.f193284h = c.f123543d;
        this.f193286j = new k1();
        this.f193287k = new z1();
        this.f193288l = 0L;
    }

    public static void c(i1 i1Var, d dVar, long j8, long j14, int i14) {
        if ((i14 & 4) != 0) {
            c.f123541b.getClass();
            j14 = 0;
        }
        p0 p0Var = i1Var.f193277a;
        a.c cVar = i1Var.f193280d;
        if (cVar == null) {
            a.c cVar2 = new a.c(null, 0L, false, 7, null);
            i1Var.f193280d = cVar2;
            cVar = cVar2;
        }
        cVar.f193297a = dVar;
        cVar.f193298b = j8;
        v3 v3Var = i1Var.f193285i;
        if (v3Var == null) {
            i1Var.f193285i = new v3(p0Var.f193516c, 0L, 2, null);
        } else {
            v3Var.f193688a = p0Var.f193516c;
            v3Var.f193689b = j14;
        }
        cVar.f193299c = false;
        i1Var.f193282f = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        a.C3608a c3608a = this.f193278b;
        boolean z14 = false;
        if (c3608a == null) {
            c3608a = new a.C3608a(null, z14, 3, 0 == true ? 1 : 0);
            this.f193278b = c3608a;
        }
        c3608a.f193289a = a.C3608a.EnumC3609a.NotInitialized;
        c3608a.f193290b = false;
        this.f193282f = c3608a;
    }

    public final void b(d dVar, long j8, v3 v3Var) {
        a.b bVar = this.f193281e;
        if (bVar == null) {
            a.b bVar2 = new a.b(null, 0L, null, 7, null);
            this.f193281e = bVar2;
            bVar = bVar2;
        }
        bVar.f193295a = dVar;
        bVar.f193296b = j8;
        v3.c(v3Var);
        this.f193282f = bVar;
    }

    public final e d() {
        e eVar = this.f193283g;
        if (eVar != null) {
            return eVar;
        }
        h.s("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(d dVar, y4.b bVar, long j8) {
        p0 p0Var = this.f193277a;
        long jF = d0.f(k.f(p0Var));
        long j14 = this.f193284h;
        c.f123541b.getClass();
        if (!c.d(j14, c.f123543d) && !c.d(jF, this.f193284h)) {
            this.f193288l = c.j(this.f193288l, c.i(jF, this.f193284h));
        }
        this.f193284h = jF;
        b2 b2Var = p0Var.f193516c;
        b2Var.getClass();
        a1.a aVar = a1.f193076a;
        if (Math.abs(Float.intBitsToFloat((int) (b2Var == b2.Vertical ? j8 & 4294967295L : j8 >> 32))) > 2.0f) {
            j1.a(d(), dVar, p0Var.f193516c, bVar, this.f193286j, this.f193288l);
            z1 z1Var = this.f193287k;
            ArrayList arrayList = z1Var.f193767b;
            if (arrayList.size() == 3) {
                int i14 = z1Var.f193766a;
                z1Var.f193766a = i14 + 1;
                arrayList.set(i14, c.a(j8));
            } else {
                arrayList.add(c.a(j8));
            }
            if (z1Var.f193766a == 3) {
                z1Var.f193766a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((c) arrayList.get(i15)).f123544a >> 32))));
            }
            float fO = (float) h0.O(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((c) arrayList.get(i16)).f123544a & 4294967295L))));
            }
            float fO2 = (float) h0.O(arrayList3);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fO);
            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fO2)) & 4294967295L;
            c.a aVar2 = c.f123541b;
            p0Var.f2(new e0.b(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), true, null));
        }
    }

    public final void f(d dVar, d dVar2, y4.b bVar, long j8) {
        if (this.f193283g == null) {
            this.f193283g = new e();
        }
        c.f123541b.getClass();
        this.f193288l = 0L;
        e eVarD = d();
        p0 p0Var = this.f193277a;
        j1.a(eVarD, dVar, p0Var.f193516c, bVar, this.f193286j, this.f193288l);
        long jI = c.i(j1.c(dVar2, p0Var.f193516c, bVar), j8);
        l<? super m0, Boolean> lVar = p0Var.f193517d;
        m0.f15849b.getClass();
        if (lVar.invoke(m0.a(m0.f15850c)).booleanValue()) {
            this.f193284h = d0.f(k.f(p0Var));
            p0Var.f2(new e0.c(jI, null));
        }
        z1 z1Var = this.f193287k;
        z1Var.f193766a = 0;
        z1Var.f193767b.clear();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ly1/i1$a;", "", "<init>", "()V", "a", "c", "b", "d", "Ly1/i1$a$a;", "Ly1/i1$a$b;", "Ly1/i1$a$c;", "Ly1/i1$a$d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly1/i1$a$d;", "Ly1/i1$a;", "Lb5/z;", "pointerId", "<init>", "(JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f193300a;

            public d(long j8, int i14, j jVar) {
                this((i14 & 1) != 0 ? Long.MAX_VALUE : j8, null);
            }

            private d(long j8) {
                super(null);
                this.f193300a = j8;
            }

            public /* synthetic */ d(long j8, j jVar) {
                this(j8);
            }
        }

        /* JADX INFO: renamed from: y1.i1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ly1/i1$a$a;", "Ly1/i1$a;", "Ly1/i1$a$a$a;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Ly1/i1$a$a$a;Z)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3608a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public EnumC3609a f193289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f193290b;

            /* JADX INFO: renamed from: y1.i1$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/i1$a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum EnumC3609a {
                Yes,
                No,
                NotInitialized
            }

            public /* synthetic */ C3608a(EnumC3609a enumC3609a, boolean z14, int i14, j jVar) {
                this((i14 & 1) != 0 ? EnumC3609a.NotInitialized : enumC3609a, (i14 & 2) != 0 ? false : z14);
            }

            public C3608a(EnumC3609a enumC3609a, boolean z14) {
                super(null);
                this.f193289a = enumC3609a;
                this.f193290b = z14;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3608a() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/i1$a$c;", "Ly1/i1$a;", "Ly4/d;", "initialDown", "Lb5/z;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Ly4/d;JZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public y4.d f193297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f193298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f193299c;

            public c(y4.d dVar, long j8, boolean z14, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? Long.MAX_VALUE : j8, (i14 & 4) != 0 ? false : z14, null);
            }

            private c(y4.d dVar, long j8, boolean z14) {
                super(null);
                this.f193297a = dVar;
                this.f193298b = j8;
                this.f193299c = z14;
            }

            public /* synthetic */ c(y4.d dVar, long j8, boolean z14, j jVar) {
                this(dVar, j8, z14);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/i1$a$b;", "Ly1/i1$a;", "Ly4/d;", "initialDown", "Lb5/z;", "pointerId", "Ly1/v3;", "touchSlopDetector", "<init>", "(Ly4/d;JLy1/v3;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public y4.d f193295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f193296b;

            public b(y4.d dVar, long j8, v3 v3Var, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? Long.MAX_VALUE : j8, (i14 & 4) != 0 ? null : v3Var, null);
            }

            private b(y4.d dVar, long j8, v3 v3Var) {
                super(null);
                this.f193295a = dVar;
                this.f193296b = j8;
            }

            public /* synthetic */ b(y4.d dVar, long j8, v3 v3Var, j jVar) {
                this(dVar, j8, v3Var);
            }
        }
    }
}
