package j4;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import h5.c1;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import kotlin.j3;
import kotlin.k3;
import kotlin.m;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p1.i0;
import p1.o;
import p1.t0;
import p13.h0;
import p5.a0;
import p5.c0;
import p5.d0;
import p5.j0;
import p5.p;
import p5.q;
import p5.r;
import p5.y;
import q53.l;
import s5.p0;
import s5.q0;
import s5.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lj4/a;", "Landroidx/lifecycle/n;", "Landroid/view/View$OnAttachStateChangeListener;", "Li5/m;", "view", "Lkotlin/Function0;", "Lj4/g;", "onContentCaptureSession", "<init>", "(Li5/m;Le23/a;)V", "b", "c", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements n, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f96962p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f96963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<? extends j4.g> f96964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j4.g f96965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f96966d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f96967e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f96968f = b.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f96969g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q53.b f96970h = l.a(1, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f96971i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0 f96972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f96973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0<j3> f96974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j3 f96975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f96976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final eh2.b f96977o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj4/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj4/a$c;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f96981a = new c();

        private c() {
        }

        public static void a(a aVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            a0 a0VarB;
            y yVar;
            e23.l lVar;
            int size = longSparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long jKeyAt = longSparseArray.keyAt(i14);
                ViewTranslationResponse viewTranslationResponseL = com.garmin.android.gncs.telephony.b.l(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (a0VarB = aVar.d().b((int) jKeyAt)) != null && (yVar = a0VarB.f135947a) != null) {
                    q qVar = yVar.f136098d;
                    p.f136057a.getClass();
                    p5.a aVar2 = (p5.a) r.a(qVar, p.f136069m);
                    if (aVar2 != null && (lVar = (e23.l) aVar2.f135946b) != null) {
                    }
                }
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96982a;

        static {
            int[] iArr = new int[j4.e.values().length];
            try {
                iArr[j4.e.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j4.e.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96982a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp5/y;", "it", "", "invoke", "(Lp5/y;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends w implements e23.l<y, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f96983a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(y yVar) {
            q qVarK = yVar.k();
            d0.f135959a.getClass();
            return Boolean.valueOf(qVarK.f136085a.b(d0.C));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", FirebaseAnalytics.Param.INDEX, "Lp5/y;", "child", "", "invoke", "(ILp5/y;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends w implements e23.p<Integer, y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j3 f96984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f96985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(j3 j3Var, a aVar) {
            super(2);
            this.f96984a = j3Var;
            this.f96985b = aVar;
        }

        @Override // e23.p
        public final Unit invoke(Integer num, y yVar) {
            int iIntValue = num.intValue();
            y yVar2 = yVar;
            if (!this.f96984a.f91235b.a(yVar2.f136100f)) {
                int i14 = a.f96962p;
                a aVar = this.f96985b;
                aVar.i(iIntValue, yVar2);
                aVar.f96970h.i(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", IntegerTokenConverter.CONVERTER_KEY, "Lp5/y;", "child", "", "invoke", "(ILp5/y;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends w implements e23.p<Integer, y, Unit> {
        public g() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Integer num, y yVar) {
            int i14 = a.f96962p;
            a.this.i(num.intValue(), yVar);
            return Unit.INSTANCE;
        }
    }

    static {
        new C1849a(null);
    }

    public a(m mVar, e23.a<? extends j4.g> aVar) {
        this.f96963a = mVar;
        this.f96964b = aVar;
        i0 i0Var = o.f134780a;
        i0Var.getClass();
        this.f96972j = i0Var;
        this.f96974l = o.a();
        this.f96975m = new j3(mVar.getSemanticsOwner().a(), i0Var);
        this.f96977o = new eh2.b(this, 25);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r2
      0x0046: PHI (r2v3 q53.k) = (r2v1 q53.k), (r2v2 q53.k), (r2v5 q53.k) binds: [B:16:0x0039, B:34:0x0089, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[PHI: r2 r8
      0x0051: PHI (r2v2 q53.k) = (r2v3 q53.k), (r2v4 q53.k) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v3 java.lang.Object) = (r8v14 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(v13.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j4.c
            if (r0 == 0) goto L13
            r0 = r8
            j4.c r0 = (j4.c) r0
            int r1 = r0.f96990d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96990d = r1
            goto L18
        L13:
            j4.c r0 = new j4.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f96988b
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f96990d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            q53.k r2 = r0.f96987a
            o13.r.b(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r8)
            r8 = 0
            return r8
        L33:
            q53.k r2 = r0.f96987a
            o13.r.b(r8)
            goto L51
        L39:
            o13.r.b(r8)
            q53.b r8 = r7.f96970h
            r8.getClass()
            q53.b$a r2 = new q53.b$a
            r2.<init>()
        L46:
            r0.f96987a = r2
            r0.f96990d = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 != r1) goto L51
            goto L8b
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8c
            r2.next()
            boolean r8 = r7.e()
            if (r8 == 0) goto L65
            r7.f()
        L65:
            boolean r8 = h4.e.f81547i
            if (r8 == 0) goto L70
            i5.m r8 = r7.f96963a
            android.os.Handler r8 = r8.getHandler()
            goto L72
        L70:
            android.os.Handler r8 = r7.f96971i
        L72:
            boolean r5 = r7.f96976n
            if (r5 != 0) goto L7f
            if (r8 == 0) goto L7f
            r7.f96976n = r4
            eh2.b r5 = r7.f96977o
            r8.post(r5)
        L7f:
            r0.f96987a = r2
            r0.f96990d = r3
            long r5 = r7.f96967e
            java.lang.Object r8 = o53.m0.b(r5, r0)
            if (r8 != r1) goto L46
        L8b:
            return r1
        L8c:
            kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.a.a(v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[LOOP:2: B:21:0x006f->B:39:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0177 A[LOOP:4: B:45:0x00f1->B:70:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x00da A[EDGE_INSN: B:90:0x00da->B:41:0x00da BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00d1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x017e A[EDGE_INSN: B:96:0x017e->B:71:0x017e BREAK  A[LOOP:4: B:45:0x00f1->B:70:0x0177], SYNTHETIC] */
    public final void b(p1.n<a0> nVar) {
        int[] iArr;
        int[] iArr2;
        long j8;
        char c14;
        long j14;
        int i14;
        int i15;
        long j15;
        long j16;
        p1.n<a0> nVar2 = nVar;
        int[] iArr3 = nVar2.f134773b;
        long[] jArr = nVar2.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j17 = jArr[i16];
            char c15 = 7;
            long j18 = -9187201950435737472L;
            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j17 & 255) < 128) {
                        int i24 = iArr3[(i16 << 3) + i19];
                        c14 = c15;
                        j3 j3VarB = this.f96974l.b(i24);
                        a0 a0VarB = nVar2.b(i24);
                        y yVar = a0VarB != null ? a0VarB.f135947a : null;
                        if (yVar == null) {
                            throw e5.m("no value for specified key");
                        }
                        j14 = j18;
                        int i25 = yVar.f136100f;
                        q qVar = yVar.f136098d;
                        if (j3VarB == null) {
                            t0<j0<?>, Object> t0Var = qVar.f136085a;
                            Object[] objArr = t0Var.f134721b;
                            long[] jArr2 = t0Var.f134720a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i26 = i17;
                                int i27 = 0;
                                while (true) {
                                    long j19 = jArr2[i27];
                                    j8 = j17;
                                    if ((((~j19) << c14) & j19 & j14) != j14) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            if ((j19 & 255) < 128) {
                                                j16 = j19;
                                                j0 j0Var = (j0) objArr[(i27 << 3) + i29];
                                                d0 d0Var = d0.f135959a;
                                                d0Var.getClass();
                                                j0<List<s5.c>> j0Var2 = d0.D;
                                                if (s.g(j0Var, j0Var2)) {
                                                    d0Var.getClass();
                                                    List list = (List) r.a(qVar, j0Var2);
                                                    h(i25, String.valueOf(list != null ? (s5.c) h0.d0(list) : null));
                                                }
                                            } else {
                                                j16 = j19;
                                            }
                                            j19 = j16 >> i26;
                                        }
                                        if (i28 != i26) {
                                            break;
                                        }
                                        if (i27 != length2) {
                                            break;
                                        }
                                        i27++;
                                        j17 = j8;
                                        i26 = 8;
                                    } else if (i27 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i27++;
                                        j17 = j8;
                                        i26 = 8;
                                    }
                                }
                            } else {
                                j8 = j17;
                            }
                        } else {
                            iArr2 = iArr3;
                            j8 = j17;
                            t0<j0<?>, Object> t0Var2 = qVar.f136085a;
                            Object[] objArr2 = t0Var2.f134721b;
                            long[] jArr3 = t0Var2.f134720a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i30 = 0;
                                while (true) {
                                    long j24 = jArr4[i30];
                                    long[] jArr5 = jArr4;
                                    i14 = i19;
                                    if ((((~j24) << c14) & j24 & j14) != j14) {
                                        int i34 = 8 - ((~(i30 - length3)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j24 & 255) < 128) {
                                                j15 = j24;
                                                j0 j0Var3 = (j0) objArr2[(i30 << 3) + i35];
                                                d0 d0Var2 = d0.f135959a;
                                                d0Var2.getClass();
                                                j0<List<s5.c>> j0Var4 = d0.D;
                                                if (s.g(j0Var3, j0Var4)) {
                                                    q qVar2 = j3VarB.f91234a;
                                                    d0Var2.getClass();
                                                    List list2 = (List) r.a(qVar2, j0Var4);
                                                    s5.c cVar = list2 != null ? (s5.c) h0.d0(list2) : null;
                                                    d0Var2.getClass();
                                                    List list3 = (List) r.a(qVar, j0Var4);
                                                    s5.c cVar2 = list3 != null ? (s5.c) h0.d0(list3) : null;
                                                    if (!s.g(cVar, cVar2)) {
                                                        h(i25, String.valueOf(cVar2));
                                                    }
                                                }
                                            } else {
                                                j15 = j24;
                                            }
                                            i35++;
                                            j24 = j15 >> 8;
                                        }
                                        if (i34 != 8) {
                                            break;
                                        }
                                        if (i30 != length3) {
                                            break;
                                        }
                                        i30++;
                                        i19 = i14;
                                        jArr4 = jArr5;
                                    } else if (i30 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i30++;
                                        i19 = i14;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i15 = 8;
                        }
                        i14 = i19;
                        i15 = 8;
                    } else {
                        iArr2 = iArr3;
                        j8 = j17;
                        c14 = c15;
                        j14 = j18;
                        i14 = i19;
                        i15 = i17;
                    }
                    j17 = j8 >> i15;
                    i19 = i14 + 1;
                    i17 = i15;
                    c15 = c14;
                    j18 = j14;
                    iArr3 = iArr2;
                    nVar2 = nVar;
                }
                iArr = iArr3;
                if (i18 != i17) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i16 == length) {
                return;
            }
            i16++;
            nVar2 = nVar;
            iArr3 = iArr;
        }
    }

    public final void c(y yVar, e23.p<? super Integer, ? super y, Unit> pVar) {
        yVar.getClass();
        List listJ = y.j(4, yVar);
        int size = listJ.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = listJ.get(i15);
            if (d().a(((y) obj).f136100f)) {
                pVar.invoke(Integer.valueOf(i14), obj);
                i14++;
            }
        }
    }

    public final p1.n<a0> d() {
        if (this.f96969g) {
            this.f96969g = false;
            this.f96972j = c0.a(this.f96963a.getSemanticsOwner(), e.f96983a);
            this.f96973k = System.currentTimeMillis();
        }
        return this.f96972j;
    }

    public final boolean e() {
        j4.f.f96998a.getClass();
        return j4.f.a.f97000b && this.f96965c != null;
    }

    public final void f() {
        j4.g gVar = this.f96965c;
        if (gVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f96966d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                j4.d dVar = (j4.d) arrayList.get(i14);
                int i15 = d.f96982a[dVar.f96993c.ordinal()];
                if (i15 == 1) {
                    l5.e eVar = dVar.f96994d;
                    if (eVar != null) {
                        gVar.e(eVar.f110138a);
                    }
                } else if (i15 != 2) {
                    u0.r();
                    return;
                } else {
                    AutofillId autofillIdA = gVar.a(dVar.f96991a);
                    if (autofillIdA != null) {
                        gVar.c(autofillIdA);
                    }
                }
            }
            gVar.flush();
            arrayList.clear();
        }
    }

    public final void g(y yVar, j3 j3Var) {
        c(yVar, new f(j3Var, this));
        List listJ = y.j(4, yVar);
        int size = listJ.size();
        for (int i14 = 0; i14 < size; i14++) {
            y yVar2 = (y) listJ.get(i14);
            p1.n<a0> nVarD = d();
            int i15 = yVar2.f136100f;
            if (nVarD.a(i15)) {
                i0<j3> i0Var = this.f96974l;
                if (i0Var.a(i15)) {
                    j3 j3VarB = i0Var.b(i15);
                    if (j3VarB == null) {
                        throw e5.m("node not present in pruned tree before this change");
                    }
                    g(yVar2, j3VarB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i14, String str) {
        j4.g gVar;
        if (Build.VERSION.SDK_INT >= 29 && (gVar = this.f96965c) != null) {
            AutofillId autofillIdA = gVar.a(i14);
            if (autofillIdA == null) {
                throw e5.m("Invalid content capture ID");
            }
            gVar.d(autofillIdA, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    public final void i(int i14, y yVar) {
        e23.l lVar;
        AutofillId autofillIdA;
        n4.d dVarA;
        l5.e eVar;
        String strC;
        e23.l lVar2;
        if (e()) {
            q qVar = yVar.f136098d;
            d0.f135959a.getClass();
            Boolean bool = (Boolean) r.a(qVar, d0.F);
            if (this.f96968f == b.SHOW_ORIGINAL && s.g(bool, Boolean.TRUE)) {
                p.f136057a.getClass();
                p5.a aVar = (p5.a) r.a(qVar, p.f136070n);
                if (aVar != null && (lVar2 = (e23.l) aVar.f135946b) != null) {
                }
            } else if (this.f96968f == b.SHOW_TRANSLATED && s.g(bool, Boolean.FALSE)) {
                p.f136057a.getClass();
                p5.a aVar2 = (p5.a) r.a(qVar, p.f136070n);
                if (aVar2 != null && (lVar = (e23.l) aVar2.f135946b) != null) {
                }
            }
            int i15 = yVar.f136100f;
            j4.g gVar = this.f96965c;
            if (gVar != null && Build.VERSION.SDK_INT >= 29) {
                l5.a aVarA = l5.a.a(this.f96963a.getAutofillId());
                y yVarL = yVar.l();
                int i16 = yVar.f136100f;
                if (yVarL != null) {
                    autofillIdA = gVar.a(yVarL.f136100f);
                    if (autofillIdA == null) {
                        eVar = null;
                    }
                } else {
                    autofillIdA = aVarA.f110135a;
                }
                l5.e eVarB = gVar.b(autofillIdA, i16);
                if (eVarB == null) {
                    eVar = null;
                } else {
                    ViewStructure viewStructure = eVarB.f110138a;
                    q qVar2 = yVar.f136098d;
                    if (qVar2.f136085a.b(d0.M)) {
                        eVar = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f96973k);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i14);
                        }
                        String str = (String) r.a(qVar2, d0.B);
                        if (str != null) {
                            viewStructure.setId(i16, null, null, str);
                        }
                        if (((Boolean) r.a(qVar2, d0.f135973o)) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        List list = (List) r.a(qVar2, d0.D);
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(i6.b.b(list, "\n", null, 62));
                        }
                        s5.c cVar = (s5.c) r.a(qVar2, d0.H);
                        if (cVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(cVar);
                        }
                        List list2 = (List) r.a(qVar2, d0.f135960b);
                        if (list2 != null) {
                            viewStructure.setContentDescription(i6.b.b(list2, "\n", null, 62));
                        }
                        p5.l lVar3 = (p5.l) r.a(qVar2, d0.A);
                        if (lVar3 != null && (strC = k3.c(lVar3.f136041a)) != null) {
                            viewStructure.setClassName(strC);
                        }
                        q0 q0VarA = k3.a(qVar2);
                        if (q0VarA != null) {
                            p0 p0Var = q0VarA.f157280a;
                            x0 x0Var = p0Var.f157266b;
                            g6.c cVar2 = p0Var.f157271g;
                            viewStructure.setTextStyle(cVar2.getF75992b() * cVar2.getF75991a() * g6.q.d(x0Var.f157322a.fontSize), 0, 0, 0);
                        }
                        c1 c1VarD = yVar.d();
                        if (c1VarD == null) {
                            n4.d.f123545e.getClass();
                            dVarA = n4.d.f123546f;
                        } else {
                            c1 c1Var = c1VarD.isAttached() ? c1VarD : null;
                            if (c1Var != null) {
                                dVarA = yVar.a(c1Var);
                            } else {
                                n4.d.f123545e.getClass();
                                dVarA = n4.d.f123546f;
                            }
                        }
                        float f14 = dVarA.f123547a;
                        float f15 = dVarA.f123548b;
                        viewStructure.setDimens((int) f14, (int) f15, 0, 0, (int) (dVarA.f123549c - f14), (int) (dVarA.f123550d - f15));
                        eVar = eVarB;
                    }
                }
            } else {
                eVar = null;
            }
            if (eVar != null) {
                this.f96966d.add(new j4.d(i15, this.f96973k, j4.e.VIEW_APPEAR, eVar));
            }
            c(yVar, new g());
        }
    }

    public final void j(y yVar) {
        if (e()) {
            this.f96966d.add(new j4.d(yVar.f136100f, this.f96973k, j4.e.VIEW_DISAPPEAR, null));
            List listJ = y.j(4, yVar);
            int size = listJ.size();
            for (int i14 = 0; i14 < size; i14++) {
                j((y) listJ.get(i14));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        i0<j3> i0Var = this.f96974l;
        i0Var.c();
        p1.n<a0> nVarD = d();
        int[] iArr = nVarD.f134773b;
        Object[] objArr = nVarD.f134774c;
        long[] jArr = nVarD.f134772a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            int i17 = (i14 << 3) + i16;
                            i0Var.i(iArr[i17], new j3(((a0) objArr[i17]).f135947a, d()));
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        this.f96975m = new j3(this.f96963a.getSemanticsOwner().a(), d());
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        this.f96965c = this.f96964b.invoke();
        i(-1, this.f96963a.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.n
    public final void onStop(n0 n0Var) {
        j(this.f96963a.getSemanticsOwner().a());
        f();
        this.f96965c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        Handler handler = h4.e.f81547i ? this.f96963a.getHandler() : this.f96971i;
        handler.getClass();
        handler.removeCallbacks(this.f96977o);
        this.f96965c = null;
    }

    /* JADX INFO: renamed from: j4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lj4/a$a;", "", "<init>", "()V", "", "VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP", "Ljava/lang/String;", "VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1849a {
        public /* synthetic */ C1849a(j jVar) {
            this();
        }

        private C1849a() {
        }
    }
}
