package u1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.l2;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu1/i;", "Lu1/r1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lg6/c;", "density", "Lo4/d0;", "glowColor", "Lc2/h2;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lg6/c;JLc2/h2;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6.c f167533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f167534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f167535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f167536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f167537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f167538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f167539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f167540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h5.m f167541i;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: u1.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend", v = 1)
        public static final class C3150a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f167543a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f167544b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f167545c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3150a(i iVar, t13.d<? super C3150a> dVar) {
                super(2, dVar);
                this.f167545c = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3150a c3150a = new C3150a(this.f167545c, dVar);
                c3150a.f167544b = obj;
                return c3150a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C3150a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x007c  */
            /* JADX WARN: Code duplicated, block: B:28:0x008e A[LOOP:1: B:24:0x007a->B:28:0x008e, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:43:0x0092 A[EDGE_INSN: B:43:0x0092->B:30:0x0092 BREAK  A[LOOP:1: B:24:0x007a->B:28:0x008e], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:17:0x0050). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r12.f167543a
                    r2 = 2
                    r3 = 0
                    u1.i r4 = r12.f167545c
                    r5 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r5) goto L1e
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r12.f167544b
                    b5.c r1 = (b5.c) r1
                    o13.r.b(r13)
                    goto L50
                L17:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r13)
                    r13 = 0
                    return r13
                L1e:
                    java.lang.Object r1 = r12.f167544b
                    b5.c r1 = (b5.c) r1
                    o13.r.b(r13)
                    goto L39
                L26:
                    o13.r.b(r13)
                    java.lang.Object r13 = r12.f167544b
                    r1 = r13
                    b5.c r1 = (b5.c) r1
                    r12.f167544b = r1
                    r12.f167543a = r5
                    java.lang.Object r13 = p008y1.k3.c(r1, r3, r12, r2)
                    if (r13 != r0) goto L39
                    goto L4f
                L39:
                    b5.a0 r13 = (b5.a0) r13
                    long r5 = r13.f15748a
                    r4.f167540h = r5
                    long r5 = r13.f15750c
                    r4.f167534b = r5
                L43:
                    r12.f167544b = r1
                    r12.f167543a = r2
                    b5.s r13 = b5.s.Main
                    java.lang.Object r13 = r1.W0(r13, r12)
                    if (r13 != r0) goto L50
                L4f:
                    return r0
                L50:
                    b5.q r13 = (b5.q) r13
                    java.util.List<b5.a0> r13 = r13.f15870a
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L63:
                    if (r8 >= r6) goto L76
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    b5.a0 r10 = (b5.a0) r10
                    boolean r10 = r10.f15751d
                    if (r10 == 0) goto L73
                    r5.add(r9)
                L73:
                    int r8 = r8 + 1
                    goto L63
                L76:
                    int r13 = r5.size()
                L7a:
                    if (r7 >= r13) goto L91
                    java.lang.Object r6 = r5.get(r7)
                    r8 = r6
                    b5.a0 r8 = (b5.a0) r8
                    long r8 = r8.f15748a
                    long r10 = r4.f167540h
                    boolean r8 = b5.z.b(r8, r10)
                    if (r8 == 0) goto L8e
                    goto L92
                L8e:
                    int r7 = r7 + 1
                    goto L7a
                L91:
                    r6 = r3
                L92:
                    b5.a0 r6 = (b5.a0) r6
                    if (r6 != 0) goto L9d
                    java.lang.Object r13 = p13.h0.d0(r5)
                    r6 = r13
                    b5.a0 r6 = (b5.a0) r6
                L9d:
                    if (r6 == 0) goto La7
                    long r7 = r6.f15748a
                    r4.f167540h = r7
                    long r6 = r6.f15750c
                    r4.f167534b = r6
                La7:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L43
                    r0 = -1
                    r4.f167540h = r0
                    kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: u1.i.a.C3150a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = p008y1.h1.c(h0Var, new C3150a(i.this, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    private i(Context context, g6.c cVar, long j8, c2.h2 h2Var) {
        this.f167533a = cVar;
        n4.c.f123541b.getClass();
        this.f167534b = n4.c.f123543d;
        k0 k0Var = new k0(context, o4.f0.j(j8));
        this.f167535c = k0Var;
        Unit unit = Unit.INSTANCE;
        p3.t1 t1Var = p3.t1.f135313a;
        t1Var.getClass();
        this.f167536d = new p3.c2(unit, t1Var);
        this.f167537e = true;
        n4.g.f123559b.getClass();
        this.f167539g = 0L;
        this.f167540h = -1L;
        b5.v0 v0VarA = b5.s0.a(new a());
        this.f167541i = Build.VERSION.SDK_INT >= 31 ? new i2(v0VarA, this, k0Var) : new r0(v0VarA, this, k0Var, h2Var);
    }

    @Override // u1.r1
    public final boolean a() {
        k0 k0Var = this.f167535c;
        EdgeEffect edgeEffect = k0Var.f167584d;
        if (edgeEffect != null) {
            i0.f167546a.getClass();
            if (i0.b(edgeEffect) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = k0Var.f167585e;
        if (edgeEffect2 != null) {
            i0.f167546a.getClass();
            if (i0.b(edgeEffect2) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = k0Var.f167586f;
        if (edgeEffect3 != null) {
            i0.f167546a.getClass();
            if (i0.b(edgeEffect3) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = k0Var.f167587g;
        if (edgeEffect4 == null) {
            return false;
        }
        i0.f167546a.getClass();
        return i0.b(edgeEffect4) != 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0219  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:106:0x022a  */
    /* JADX WARN: Code duplicated, block: B:107:0x022e  */
    /* JADX WARN: Code duplicated, block: B:110:0x023e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0243  */
    /* JADX WARN: Code duplicated, block: B:114:0x024b  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:158:0x0307  */
    /* JADX WARN: Code duplicated, block: B:162:0x0312  */
    /* JADX WARN: Code duplicated, block: B:164:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x031b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0321  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149 A[PHI: r13 r20
      0x0149: PHI (r13v9 float) = (r13v8 float), (r13v12 float) binds: [B:74:0x017a, B:63:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r20v1 char) = (r20v0 char), (r20v2 char) binds: [B:74:0x017a, B:63:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb  */
    @Override // u1.r1
    public final long b(int i14, long j8, e23.l lVar) {
        long j14;
        float fIntBitsToFloat;
        int i15;
        char c14;
        float fI;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jI;
        long jI2;
        int i16;
        boolean z14;
        boolean zF;
        boolean z15;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        if (n4.g.h(this.f167539g)) {
            return ((n4.c) lVar.invoke(n4.c.a(j8))).f123544a;
        }
        boolean z18 = this.f167538f;
        k0 k0Var = this.f167535c;
        if (!z18) {
            if (k0.g(k0Var.f167586f)) {
                n4.c.f123541b.getClass();
                h(0L);
            }
            if (k0.g(k0Var.f167587g)) {
                n4.c.f123541b.getClass();
                i(0L);
            }
            if (k0.g(k0Var.f167584d)) {
                n4.c.f123541b.getClass();
                j(0L);
            }
            if (k0.g(k0Var.f167585e)) {
                n4.c.f123541b.getClass();
                g(0L);
            }
            this.f167538f = true;
        }
        l2 l2Var = k.f167580b;
        a5.j.f1233b.getClass();
        float f14 = i14 == a5.j.f1235d ? 4.0f : 1.0f;
        long jK = n4.c.k(f14, j8);
        int i19 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i19) != 0.0f) {
            if (!k0.g(k0Var.f167584d) || Float.intBitsToFloat(i19) >= 0.0f) {
                j14 = 4294967295L;
                if (k0.g(k0Var.f167585e) && Float.intBitsToFloat(i19) > 0.0f) {
                    float fG = g(jK);
                    if (!k0.g(k0Var.f167585e)) {
                        k0Var.b().finish();
                    }
                    fIntBitsToFloat = fG == Float.intBitsToFloat((int) (jK & 4294967295L)) ? Float.intBitsToFloat(i19) : fG / f14;
                }
            } else {
                float fJ = j(jK);
                if (!k0.g(k0Var.f167584d)) {
                    k0Var.e().finish();
                }
                j14 = 4294967295L;
                fIntBitsToFloat = fJ == Float.intBitsToFloat((int) (jK & 4294967295L)) ? Float.intBitsToFloat(i19) : fJ / f14;
            }
            i15 = (int) (j8 >> 32);
            if (Float.intBitsToFloat(i15) == 0.0f) {
                if (k0.g(k0Var.f167586f) || Float.intBitsToFloat(i15) >= 0.0f) {
                    c14 = ' ';
                    if (!k0.g(k0Var.f167587g) && Float.intBitsToFloat(i15) > 0.0f) {
                        fI = i(jK);
                        if (!k0.g(k0Var.f167587g)) {
                            k0Var.d().finish();
                        }
                        if (fI == Float.intBitsToFloat((int) (jK >> 32))) {
                            fIntBitsToFloat2 = Float.intBitsToFloat(i15);
                        } else {
                            fIntBitsToFloat2 = fI / f14;
                        }
                    }
                } else {
                    fI = h(jK);
                    c14 = ' ';
                    if (!k0.g(k0Var.f167586f)) {
                        k0Var.c().finish();
                    }
                    if (fI == Float.intBitsToFloat((int) (jK >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i15);
                    } else {
                        fIntBitsToFloat2 = fI / f14;
                    }
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c14);
                n4.c.f123541b.getClass();
                if (!n4.c.d(jFloatToRawIntBits, 0L)) {
                    f();
                }
                jI = n4.c.i(j8, jFloatToRawIntBits);
                long j15 = ((n4.c) lVar.invoke(n4.c.a(jI))).f123544a;
                jI2 = n4.c.i(jI, j15);
                if ((Float.intBitsToFloat((int) (jI >> c14)) == 0.0f || Float.intBitsToFloat((int) (jI & j14)) != 0.0f) && ((Float.intBitsToFloat((int) (j15 >> c14)) != 0.0f || Float.intBitsToFloat((int) (j15 & j14)) != 0.0f) && (k0.g(k0Var.f167586f) || k0.g(k0Var.f167584d) || k0.g(k0Var.f167587g) || k0.g(k0Var.f167585e)))) {
                    d();
                }
                if (i14 == a5.j.f1234c) {
                    i16 = i19;
                    i17 = (int) (jI2 >> c14);
                    if (Float.intBitsToFloat(i17) > 0.5f) {
                        if (Float.intBitsToFloat(i17) < -0.5f) {
                            i(jI2);
                        } else {
                            z16 = false;
                        }
                        i18 = (int) (jI2 & j14);
                        if (Float.intBitsToFloat(i18) > 1056964608) {
                            if (Float.intBitsToFloat(i18) < -1090519040) {
                                g(jI2);
                            } else {
                                z17 = false;
                            }
                            z14 = !z16 || z17;
                            if (!n4.c.d(jI, 0L)) {
                                if (k0.f(k0Var.f167586f) || Float.intBitsToFloat(i15) >= 0.0f) {
                                    zF = false;
                                } else {
                                    i0 i0Var = i0.f167546a;
                                    EdgeEffect edgeEffectC = k0Var.c();
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i15);
                                    i0Var.getClass();
                                    i0.e(edgeEffectC, fIntBitsToFloat3);
                                    zF = k0.f(k0Var.f167586f);
                                }
                                if (k0.f(k0Var.f167587g) && Float.intBitsToFloat(i15) > 0.0f) {
                                    i0 i0Var2 = i0.f167546a;
                                    EdgeEffect edgeEffectD = k0Var.d();
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
                                    i0Var2.getClass();
                                    i0.e(edgeEffectD, fIntBitsToFloat4);
                                    if (!zF || k0.f(k0Var.f167587g)) {
                                        zF = true;
                                    } else {
                                        zF = false;
                                    }
                                }
                                if (k0.f(k0Var.f167584d) && Float.intBitsToFloat(i16) < 0.0f) {
                                    i0 i0Var3 = i0.f167546a;
                                    EdgeEffect edgeEffectE = k0Var.e();
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i16);
                                    i0Var3.getClass();
                                    i0.e(edgeEffectE, fIntBitsToFloat5);
                                    if (!zF || k0.f(k0Var.f167584d)) {
                                        zF = true;
                                    } else {
                                        zF = false;
                                    }
                                }
                                if (k0.f(k0Var.f167585e) && Float.intBitsToFloat(i16) > 0.0f) {
                                    i0 i0Var4 = i0.f167546a;
                                    EdgeEffect edgeEffectB = k0Var.b();
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i16);
                                    i0Var4.getClass();
                                    i0.e(edgeEffectB, fIntBitsToFloat6);
                                    if (!zF || k0.f(k0Var.f167585e)) {
                                        zF = true;
                                    } else {
                                        zF = false;
                                    }
                                }
                                if (!zF || z14) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z14 = z15;
                            }
                            if (z14) {
                                f();
                            }
                            return n4.c.j(jFloatToRawIntBits, j15);
                        }
                        j(jI2);
                        z17 = true;
                        if (z16) {
                        }
                        if (!n4.c.d(jI, 0L)) {
                            if (k0.f(k0Var.f167586f)) {
                                zF = false;
                            } else {
                                zF = false;
                            }
                            if (k0.f(k0Var.f167587g)) {
                                i0 i0Var5 = i0.f167546a;
                                EdgeEffect edgeEffectD2 = k0Var.d();
                                float fIntBitsToFloat7 = Float.intBitsToFloat(i15);
                                i0Var5.getClass();
                                i0.e(edgeEffectD2, fIntBitsToFloat7);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167584d)) {
                                i0 i0Var6 = i0.f167546a;
                                EdgeEffect edgeEffectE2 = k0Var.e();
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i16);
                                i0Var6.getClass();
                                i0.e(edgeEffectE2, fIntBitsToFloat8);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167585e)) {
                                i0 i0Var7 = i0.f167546a;
                                EdgeEffect edgeEffectB2 = k0Var.b();
                                float fIntBitsToFloat9 = Float.intBitsToFloat(i16);
                                i0Var7.getClass();
                                i0.e(edgeEffectB2, fIntBitsToFloat9);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (zF) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            z14 = z15;
                        }
                        if (z14) {
                            f();
                        }
                        return n4.c.j(jFloatToRawIntBits, j15);
                    }
                    h(jI2);
                    z16 = true;
                    i18 = (int) (jI2 & j14);
                    if (Float.intBitsToFloat(i18) > 1056964608) {
                        if (Float.intBitsToFloat(i18) < -1090519040) {
                            g(jI2);
                        } else {
                            z17 = false;
                        }
                        if (z16) {
                        }
                        if (!n4.c.d(jI, 0L)) {
                            if (k0.f(k0Var.f167586f)) {
                                zF = false;
                            } else {
                                zF = false;
                            }
                            if (k0.f(k0Var.f167587g)) {
                                i0 i0Var8 = i0.f167546a;
                                EdgeEffect edgeEffectD3 = k0Var.d();
                                float fIntBitsToFloat10 = Float.intBitsToFloat(i15);
                                i0Var8.getClass();
                                i0.e(edgeEffectD3, fIntBitsToFloat10);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167584d)) {
                                i0 i0Var9 = i0.f167546a;
                                EdgeEffect edgeEffectE3 = k0Var.e();
                                float fIntBitsToFloat11 = Float.intBitsToFloat(i16);
                                i0Var9.getClass();
                                i0.e(edgeEffectE3, fIntBitsToFloat11);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167585e)) {
                                i0 i0Var10 = i0.f167546a;
                                EdgeEffect edgeEffectB3 = k0Var.b();
                                float fIntBitsToFloat12 = Float.intBitsToFloat(i16);
                                i0Var10.getClass();
                                i0.e(edgeEffectB3, fIntBitsToFloat12);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (zF) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            z14 = z15;
                        }
                        if (z14) {
                            f();
                        }
                        return n4.c.j(jFloatToRawIntBits, j15);
                    }
                    j(jI2);
                    z17 = true;
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var11 = i0.f167546a;
                            EdgeEffect edgeEffectD4 = k0Var.d();
                            float fIntBitsToFloat13 = Float.intBitsToFloat(i15);
                            i0Var11.getClass();
                            i0.e(edgeEffectD4, fIntBitsToFloat13);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var12 = i0.f167546a;
                            EdgeEffect edgeEffectE4 = k0Var.e();
                            float fIntBitsToFloat14 = Float.intBitsToFloat(i16);
                            i0Var12.getClass();
                            i0.e(edgeEffectE4, fIntBitsToFloat14);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var13 = i0.f167546a;
                            EdgeEffect edgeEffectB4 = k0Var.b();
                            float fIntBitsToFloat15 = Float.intBitsToFloat(i16);
                            i0Var13.getClass();
                            i0.e(edgeEffectB4, fIntBitsToFloat15);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j15);
                }
                i16 = i19;
                if (!n4.c.d(jI, 0L)) {
                    if (k0.f(k0Var.f167586f)) {
                        zF = false;
                    } else {
                        zF = false;
                    }
                    if (k0.f(k0Var.f167587g)) {
                        i0 i0Var14 = i0.f167546a;
                        EdgeEffect edgeEffectD5 = k0Var.d();
                        float fIntBitsToFloat16 = Float.intBitsToFloat(i15);
                        i0Var14.getClass();
                        i0.e(edgeEffectD5, fIntBitsToFloat16);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167584d)) {
                        i0 i0Var15 = i0.f167546a;
                        EdgeEffect edgeEffectE5 = k0Var.e();
                        float fIntBitsToFloat17 = Float.intBitsToFloat(i16);
                        i0Var15.getClass();
                        i0.e(edgeEffectE5, fIntBitsToFloat17);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167585e)) {
                        i0 i0Var16 = i0.f167546a;
                        EdgeEffect edgeEffectB5 = k0Var.b();
                        float fIntBitsToFloat18 = Float.intBitsToFloat(i16);
                        i0Var16.getClass();
                        i0.e(edgeEffectB5, fIntBitsToFloat18);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (zF) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z14 = z15;
                }
                if (z14) {
                    f();
                }
                return n4.c.j(jFloatToRawIntBits, j15);
            }
            c14 = ' ';
            fIntBitsToFloat2 = 0.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c14);
            n4.c.f123541b.getClass();
            if (!n4.c.d(jFloatToRawIntBits, 0L)) {
                f();
            }
            jI = n4.c.i(j8, jFloatToRawIntBits);
            long j16 = ((n4.c) lVar.invoke(n4.c.a(jI))).f123544a;
            jI2 = n4.c.i(jI, j16);
            if (Float.intBitsToFloat((int) (jI >> c14)) == 0.0f) {
                d();
            } else {
                d();
            }
            if (i14 == a5.j.f1234c) {
                i16 = i19;
                i17 = (int) (jI2 >> c14);
                if (Float.intBitsToFloat(i17) > 0.5f) {
                    if (Float.intBitsToFloat(i17) < -0.5f) {
                        i(jI2);
                    } else {
                        z16 = false;
                    }
                    i18 = (int) (jI2 & j14);
                    if (Float.intBitsToFloat(i18) > 1056964608) {
                        if (Float.intBitsToFloat(i18) < -1090519040) {
                            g(jI2);
                        } else {
                            z17 = false;
                        }
                        if (z16) {
                        }
                        if (!n4.c.d(jI, 0L)) {
                            if (k0.f(k0Var.f167586f)) {
                                zF = false;
                            } else {
                                zF = false;
                            }
                            if (k0.f(k0Var.f167587g)) {
                                i0 i0Var17 = i0.f167546a;
                                EdgeEffect edgeEffectD6 = k0Var.d();
                                float fIntBitsToFloat19 = Float.intBitsToFloat(i15);
                                i0Var17.getClass();
                                i0.e(edgeEffectD6, fIntBitsToFloat19);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167584d)) {
                                i0 i0Var18 = i0.f167546a;
                                EdgeEffect edgeEffectE6 = k0Var.e();
                                float fIntBitsToFloat110 = Float.intBitsToFloat(i16);
                                i0Var18.getClass();
                                i0.e(edgeEffectE6, fIntBitsToFloat110);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167585e)) {
                                i0 i0Var19 = i0.f167546a;
                                EdgeEffect edgeEffectB6 = k0Var.b();
                                float fIntBitsToFloat111 = Float.intBitsToFloat(i16);
                                i0Var19.getClass();
                                i0.e(edgeEffectB6, fIntBitsToFloat111);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (zF) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            z14 = z15;
                        }
                        if (z14) {
                            f();
                        }
                        return n4.c.j(jFloatToRawIntBits, j16);
                    }
                    j(jI2);
                    z17 = true;
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var110 = i0.f167546a;
                            EdgeEffect edgeEffectD7 = k0Var.d();
                            float fIntBitsToFloat112 = Float.intBitsToFloat(i15);
                            i0Var110.getClass();
                            i0.e(edgeEffectD7, fIntBitsToFloat112);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var111 = i0.f167546a;
                            EdgeEffect edgeEffectE7 = k0Var.e();
                            float fIntBitsToFloat113 = Float.intBitsToFloat(i16);
                            i0Var111.getClass();
                            i0.e(edgeEffectE7, fIntBitsToFloat113);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var112 = i0.f167546a;
                            EdgeEffect edgeEffectB7 = k0Var.b();
                            float fIntBitsToFloat114 = Float.intBitsToFloat(i16);
                            i0Var112.getClass();
                            i0.e(edgeEffectB7, fIntBitsToFloat114);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j16);
                }
                h(jI2);
                z16 = true;
                i18 = (int) (jI2 & j14);
                if (Float.intBitsToFloat(i18) > 1056964608) {
                    if (Float.intBitsToFloat(i18) < -1090519040) {
                        g(jI2);
                    } else {
                        z17 = false;
                    }
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var113 = i0.f167546a;
                            EdgeEffect edgeEffectD8 = k0Var.d();
                            float fIntBitsToFloat115 = Float.intBitsToFloat(i15);
                            i0Var113.getClass();
                            i0.e(edgeEffectD8, fIntBitsToFloat115);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var114 = i0.f167546a;
                            EdgeEffect edgeEffectE8 = k0Var.e();
                            float fIntBitsToFloat116 = Float.intBitsToFloat(i16);
                            i0Var114.getClass();
                            i0.e(edgeEffectE8, fIntBitsToFloat116);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var115 = i0.f167546a;
                            EdgeEffect edgeEffectB8 = k0Var.b();
                            float fIntBitsToFloat117 = Float.intBitsToFloat(i16);
                            i0Var115.getClass();
                            i0.e(edgeEffectB8, fIntBitsToFloat117);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j16);
                }
                j(jI2);
                z17 = true;
                if (z16) {
                }
                if (!n4.c.d(jI, 0L)) {
                    if (k0.f(k0Var.f167586f)) {
                        zF = false;
                    } else {
                        zF = false;
                    }
                    if (k0.f(k0Var.f167587g)) {
                        i0 i0Var116 = i0.f167546a;
                        EdgeEffect edgeEffectD9 = k0Var.d();
                        float fIntBitsToFloat118 = Float.intBitsToFloat(i15);
                        i0Var116.getClass();
                        i0.e(edgeEffectD9, fIntBitsToFloat118);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167584d)) {
                        i0 i0Var117 = i0.f167546a;
                        EdgeEffect edgeEffectE9 = k0Var.e();
                        float fIntBitsToFloat119 = Float.intBitsToFloat(i16);
                        i0Var117.getClass();
                        i0.e(edgeEffectE9, fIntBitsToFloat119);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167585e)) {
                        i0 i0Var118 = i0.f167546a;
                        EdgeEffect edgeEffectB9 = k0Var.b();
                        float fIntBitsToFloat1110 = Float.intBitsToFloat(i16);
                        i0Var118.getClass();
                        i0.e(edgeEffectB9, fIntBitsToFloat1110);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (zF) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z14 = z15;
                }
                if (z14) {
                    f();
                }
                return n4.c.j(jFloatToRawIntBits, j16);
            }
            i16 = i19;
            if (!n4.c.d(jI, 0L)) {
                if (k0.f(k0Var.f167586f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (k0.f(k0Var.f167587g)) {
                    i0 i0Var119 = i0.f167546a;
                    EdgeEffect edgeEffectD10 = k0Var.d();
                    float fIntBitsToFloat1111 = Float.intBitsToFloat(i15);
                    i0Var119.getClass();
                    i0.e(edgeEffectD10, fIntBitsToFloat1111);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167584d)) {
                    i0 i0Var1110 = i0.f167546a;
                    EdgeEffect edgeEffectE10 = k0Var.e();
                    float fIntBitsToFloat1112 = Float.intBitsToFloat(i16);
                    i0Var1110.getClass();
                    i0.e(edgeEffectE10, fIntBitsToFloat1112);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167585e)) {
                    i0 i0Var1111 = i0.f167546a;
                    EdgeEffect edgeEffectB10 = k0Var.b();
                    float fIntBitsToFloat1113 = Float.intBitsToFloat(i16);
                    i0Var1111.getClass();
                    i0.e(edgeEffectB10, fIntBitsToFloat1113);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z14 = z15;
            }
            if (z14) {
                f();
            }
            return n4.c.j(jFloatToRawIntBits, j16);
        }
        j14 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i15 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i15) == 0.0f) {
            if (k0.g(k0Var.f167586f)) {
                c14 = ' ';
                if (!k0.g(k0Var.f167587g)) {
                }
            } else {
                c14 = ' ';
                if (!k0.g(k0Var.f167587g)) {
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c14);
            n4.c.f123541b.getClass();
            if (!n4.c.d(jFloatToRawIntBits, 0L)) {
                f();
            }
            jI = n4.c.i(j8, jFloatToRawIntBits);
            long j17 = ((n4.c) lVar.invoke(n4.c.a(jI))).f123544a;
            jI2 = n4.c.i(jI, j17);
            if (Float.intBitsToFloat((int) (jI >> c14)) == 0.0f) {
                d();
            } else {
                d();
            }
            if (i14 == a5.j.f1234c) {
                i16 = i19;
                i17 = (int) (jI2 >> c14);
                if (Float.intBitsToFloat(i17) > 0.5f) {
                    if (Float.intBitsToFloat(i17) < -0.5f) {
                        i(jI2);
                    } else {
                        z16 = false;
                    }
                    i18 = (int) (jI2 & j14);
                    if (Float.intBitsToFloat(i18) > 1056964608) {
                        if (Float.intBitsToFloat(i18) < -1090519040) {
                            g(jI2);
                        } else {
                            z17 = false;
                        }
                        if (z16) {
                        }
                        if (!n4.c.d(jI, 0L)) {
                            if (k0.f(k0Var.f167586f)) {
                                zF = false;
                            } else {
                                zF = false;
                            }
                            if (k0.f(k0Var.f167587g)) {
                                i0 i0Var1112 = i0.f167546a;
                                EdgeEffect edgeEffectD11 = k0Var.d();
                                float fIntBitsToFloat1114 = Float.intBitsToFloat(i15);
                                i0Var1112.getClass();
                                i0.e(edgeEffectD11, fIntBitsToFloat1114);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167584d)) {
                                i0 i0Var1113 = i0.f167546a;
                                EdgeEffect edgeEffectE11 = k0Var.e();
                                float fIntBitsToFloat1115 = Float.intBitsToFloat(i16);
                                i0Var1113.getClass();
                                i0.e(edgeEffectE11, fIntBitsToFloat1115);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (k0.f(k0Var.f167585e)) {
                                i0 i0Var1114 = i0.f167546a;
                                EdgeEffect edgeEffectB11 = k0Var.b();
                                float fIntBitsToFloat1116 = Float.intBitsToFloat(i16);
                                i0Var1114.getClass();
                                i0.e(edgeEffectB11, fIntBitsToFloat1116);
                                if (zF) {
                                    zF = true;
                                } else {
                                    zF = true;
                                }
                            }
                            if (zF) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            z14 = z15;
                        }
                        if (z14) {
                            f();
                        }
                        return n4.c.j(jFloatToRawIntBits, j17);
                    }
                    j(jI2);
                    z17 = true;
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var1115 = i0.f167546a;
                            EdgeEffect edgeEffectD12 = k0Var.d();
                            float fIntBitsToFloat1117 = Float.intBitsToFloat(i15);
                            i0Var1115.getClass();
                            i0.e(edgeEffectD12, fIntBitsToFloat1117);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var1116 = i0.f167546a;
                            EdgeEffect edgeEffectE12 = k0Var.e();
                            float fIntBitsToFloat1118 = Float.intBitsToFloat(i16);
                            i0Var1116.getClass();
                            i0.e(edgeEffectE12, fIntBitsToFloat1118);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var1117 = i0.f167546a;
                            EdgeEffect edgeEffectB12 = k0Var.b();
                            float fIntBitsToFloat1119 = Float.intBitsToFloat(i16);
                            i0Var1117.getClass();
                            i0.e(edgeEffectB12, fIntBitsToFloat1119);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j17);
                }
                h(jI2);
                z16 = true;
                i18 = (int) (jI2 & j14);
                if (Float.intBitsToFloat(i18) > 1056964608) {
                    if (Float.intBitsToFloat(i18) < -1090519040) {
                        g(jI2);
                    } else {
                        z17 = false;
                    }
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var1118 = i0.f167546a;
                            EdgeEffect edgeEffectD13 = k0Var.d();
                            float fIntBitsToFloat11110 = Float.intBitsToFloat(i15);
                            i0Var1118.getClass();
                            i0.e(edgeEffectD13, fIntBitsToFloat11110);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var1119 = i0.f167546a;
                            EdgeEffect edgeEffectE13 = k0Var.e();
                            float fIntBitsToFloat11111 = Float.intBitsToFloat(i16);
                            i0Var1119.getClass();
                            i0.e(edgeEffectE13, fIntBitsToFloat11111);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var11110 = i0.f167546a;
                            EdgeEffect edgeEffectB13 = k0Var.b();
                            float fIntBitsToFloat11112 = Float.intBitsToFloat(i16);
                            i0Var11110.getClass();
                            i0.e(edgeEffectB13, fIntBitsToFloat11112);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j17);
                }
                j(jI2);
                z17 = true;
                if (z16) {
                }
                if (!n4.c.d(jI, 0L)) {
                    if (k0.f(k0Var.f167586f)) {
                        zF = false;
                    } else {
                        zF = false;
                    }
                    if (k0.f(k0Var.f167587g)) {
                        i0 i0Var11111 = i0.f167546a;
                        EdgeEffect edgeEffectD14 = k0Var.d();
                        float fIntBitsToFloat11113 = Float.intBitsToFloat(i15);
                        i0Var11111.getClass();
                        i0.e(edgeEffectD14, fIntBitsToFloat11113);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167584d)) {
                        i0 i0Var11112 = i0.f167546a;
                        EdgeEffect edgeEffectE14 = k0Var.e();
                        float fIntBitsToFloat11114 = Float.intBitsToFloat(i16);
                        i0Var11112.getClass();
                        i0.e(edgeEffectE14, fIntBitsToFloat11114);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167585e)) {
                        i0 i0Var11113 = i0.f167546a;
                        EdgeEffect edgeEffectB14 = k0Var.b();
                        float fIntBitsToFloat11115 = Float.intBitsToFloat(i16);
                        i0Var11113.getClass();
                        i0.e(edgeEffectB14, fIntBitsToFloat11115);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (zF) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z14 = z15;
                }
                if (z14) {
                    f();
                }
                return n4.c.j(jFloatToRawIntBits, j17);
            }
            i16 = i19;
            if (!n4.c.d(jI, 0L)) {
                if (k0.f(k0Var.f167586f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (k0.f(k0Var.f167587g)) {
                    i0 i0Var11114 = i0.f167546a;
                    EdgeEffect edgeEffectD15 = k0Var.d();
                    float fIntBitsToFloat11116 = Float.intBitsToFloat(i15);
                    i0Var11114.getClass();
                    i0.e(edgeEffectD15, fIntBitsToFloat11116);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167584d)) {
                    i0 i0Var11115 = i0.f167546a;
                    EdgeEffect edgeEffectE15 = k0Var.e();
                    float fIntBitsToFloat11117 = Float.intBitsToFloat(i16);
                    i0Var11115.getClass();
                    i0.e(edgeEffectE15, fIntBitsToFloat11117);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167585e)) {
                    i0 i0Var11116 = i0.f167546a;
                    EdgeEffect edgeEffectB15 = k0Var.b();
                    float fIntBitsToFloat11118 = Float.intBitsToFloat(i16);
                    i0Var11116.getClass();
                    i0.e(edgeEffectB15, fIntBitsToFloat11118);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z14 = z15;
            }
            if (z14) {
                f();
            }
            return n4.c.j(jFloatToRawIntBits, j17);
        }
        c14 = ' ';
        fIntBitsToFloat2 = 0.0f;
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j14) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c14);
        n4.c.f123541b.getClass();
        if (!n4.c.d(jFloatToRawIntBits, 0L)) {
            f();
        }
        jI = n4.c.i(j8, jFloatToRawIntBits);
        long j18 = ((n4.c) lVar.invoke(n4.c.a(jI))).f123544a;
        jI2 = n4.c.i(jI, j18);
        if (Float.intBitsToFloat((int) (jI >> c14)) == 0.0f) {
            d();
        } else {
            d();
        }
        if (i14 == a5.j.f1234c) {
            i16 = i19;
            i17 = (int) (jI2 >> c14);
            if (Float.intBitsToFloat(i17) > 0.5f) {
                if (Float.intBitsToFloat(i17) < -0.5f) {
                    i(jI2);
                } else {
                    z16 = false;
                }
                i18 = (int) (jI2 & j14);
                if (Float.intBitsToFloat(i18) > 1056964608) {
                    if (Float.intBitsToFloat(i18) < -1090519040) {
                        g(jI2);
                    } else {
                        z17 = false;
                    }
                    if (z16) {
                    }
                    if (!n4.c.d(jI, 0L)) {
                        if (k0.f(k0Var.f167586f)) {
                            zF = false;
                        } else {
                            zF = false;
                        }
                        if (k0.f(k0Var.f167587g)) {
                            i0 i0Var11117 = i0.f167546a;
                            EdgeEffect edgeEffectD16 = k0Var.d();
                            float fIntBitsToFloat11119 = Float.intBitsToFloat(i15);
                            i0Var11117.getClass();
                            i0.e(edgeEffectD16, fIntBitsToFloat11119);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167584d)) {
                            i0 i0Var11118 = i0.f167546a;
                            EdgeEffect edgeEffectE16 = k0Var.e();
                            float fIntBitsToFloat111110 = Float.intBitsToFloat(i16);
                            i0Var11118.getClass();
                            i0.e(edgeEffectE16, fIntBitsToFloat111110);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (k0.f(k0Var.f167585e)) {
                            i0 i0Var11119 = i0.f167546a;
                            EdgeEffect edgeEffectB16 = k0Var.b();
                            float fIntBitsToFloat111111 = Float.intBitsToFloat(i16);
                            i0Var11119.getClass();
                            i0.e(edgeEffectB16, fIntBitsToFloat111111);
                            if (zF) {
                                zF = true;
                            } else {
                                zF = true;
                            }
                        }
                        if (zF) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z14 = z15;
                    }
                    if (z14) {
                        f();
                    }
                    return n4.c.j(jFloatToRawIntBits, j18);
                }
                j(jI2);
                z17 = true;
                if (z16) {
                }
                if (!n4.c.d(jI, 0L)) {
                    if (k0.f(k0Var.f167586f)) {
                        zF = false;
                    } else {
                        zF = false;
                    }
                    if (k0.f(k0Var.f167587g)) {
                        i0 i0Var111110 = i0.f167546a;
                        EdgeEffect edgeEffectD17 = k0Var.d();
                        float fIntBitsToFloat111112 = Float.intBitsToFloat(i15);
                        i0Var111110.getClass();
                        i0.e(edgeEffectD17, fIntBitsToFloat111112);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167584d)) {
                        i0 i0Var111111 = i0.f167546a;
                        EdgeEffect edgeEffectE17 = k0Var.e();
                        float fIntBitsToFloat111113 = Float.intBitsToFloat(i16);
                        i0Var111111.getClass();
                        i0.e(edgeEffectE17, fIntBitsToFloat111113);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167585e)) {
                        i0 i0Var111112 = i0.f167546a;
                        EdgeEffect edgeEffectB17 = k0Var.b();
                        float fIntBitsToFloat111114 = Float.intBitsToFloat(i16);
                        i0Var111112.getClass();
                        i0.e(edgeEffectB17, fIntBitsToFloat111114);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (zF) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z14 = z15;
                }
                if (z14) {
                    f();
                }
                return n4.c.j(jFloatToRawIntBits, j18);
            }
            h(jI2);
            z16 = true;
            i18 = (int) (jI2 & j14);
            if (Float.intBitsToFloat(i18) > 1056964608) {
                if (Float.intBitsToFloat(i18) < -1090519040) {
                    g(jI2);
                } else {
                    z17 = false;
                }
                if (z16) {
                }
                if (!n4.c.d(jI, 0L)) {
                    if (k0.f(k0Var.f167586f)) {
                        zF = false;
                    } else {
                        zF = false;
                    }
                    if (k0.f(k0Var.f167587g)) {
                        i0 i0Var111113 = i0.f167546a;
                        EdgeEffect edgeEffectD18 = k0Var.d();
                        float fIntBitsToFloat111115 = Float.intBitsToFloat(i15);
                        i0Var111113.getClass();
                        i0.e(edgeEffectD18, fIntBitsToFloat111115);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167584d)) {
                        i0 i0Var111114 = i0.f167546a;
                        EdgeEffect edgeEffectE18 = k0Var.e();
                        float fIntBitsToFloat111116 = Float.intBitsToFloat(i16);
                        i0Var111114.getClass();
                        i0.e(edgeEffectE18, fIntBitsToFloat111116);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (k0.f(k0Var.f167585e)) {
                        i0 i0Var111115 = i0.f167546a;
                        EdgeEffect edgeEffectB18 = k0Var.b();
                        float fIntBitsToFloat111117 = Float.intBitsToFloat(i16);
                        i0Var111115.getClass();
                        i0.e(edgeEffectB18, fIntBitsToFloat111117);
                        if (zF) {
                            zF = true;
                        } else {
                            zF = true;
                        }
                    }
                    if (zF) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z14 = z15;
                }
                if (z14) {
                    f();
                }
                return n4.c.j(jFloatToRawIntBits, j18);
            }
            j(jI2);
            z17 = true;
            if (z16) {
            }
            if (!n4.c.d(jI, 0L)) {
                if (k0.f(k0Var.f167586f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (k0.f(k0Var.f167587g)) {
                    i0 i0Var111116 = i0.f167546a;
                    EdgeEffect edgeEffectD19 = k0Var.d();
                    float fIntBitsToFloat111118 = Float.intBitsToFloat(i15);
                    i0Var111116.getClass();
                    i0.e(edgeEffectD19, fIntBitsToFloat111118);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167584d)) {
                    i0 i0Var111117 = i0.f167546a;
                    EdgeEffect edgeEffectE19 = k0Var.e();
                    float fIntBitsToFloat111119 = Float.intBitsToFloat(i16);
                    i0Var111117.getClass();
                    i0.e(edgeEffectE19, fIntBitsToFloat111119);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (k0.f(k0Var.f167585e)) {
                    i0 i0Var111118 = i0.f167546a;
                    EdgeEffect edgeEffectB19 = k0Var.b();
                    float fIntBitsToFloat1111110 = Float.intBitsToFloat(i16);
                    i0Var111118.getClass();
                    i0.e(edgeEffectB19, fIntBitsToFloat1111110);
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z14 = z15;
            }
            if (z14) {
                f();
            }
            return n4.c.j(jFloatToRawIntBits, j18);
        }
        i16 = i19;
        if (!n4.c.d(jI, 0L)) {
            if (k0.f(k0Var.f167586f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (k0.f(k0Var.f167587g)) {
                i0 i0Var111119 = i0.f167546a;
                EdgeEffect edgeEffectD110 = k0Var.d();
                float fIntBitsToFloat1111111 = Float.intBitsToFloat(i15);
                i0Var111119.getClass();
                i0.e(edgeEffectD110, fIntBitsToFloat1111111);
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (k0.f(k0Var.f167584d)) {
                i0 i0Var1111110 = i0.f167546a;
                EdgeEffect edgeEffectE110 = k0Var.e();
                float fIntBitsToFloat1111112 = Float.intBitsToFloat(i16);
                i0Var1111110.getClass();
                i0.e(edgeEffectE110, fIntBitsToFloat1111112);
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (k0.f(k0Var.f167585e)) {
                i0 i0Var1111111 = i0.f167546a;
                EdgeEffect edgeEffectB110 = k0Var.b();
                float fIntBitsToFloat1111113 = Float.intBitsToFloat(i16);
                i0Var1111111.getClass();
                i0.e(edgeEffectB110, fIntBitsToFloat1111113);
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z15 = true;
            } else {
                z15 = true;
            }
            z14 = z15;
        }
        if (z14) {
            f();
        }
        return n4.c.j(jFloatToRawIntBits, j18);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r19.invoke(r2, r3) == r4) goto L51;
     */
    @Override // u1.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j8, e23.p pVar, v13.c cVar) {
        h hVar;
        float fA;
        float fA2;
        long j14;
        long jE;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f167519d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f167519d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objInvoke = hVar.f167517b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f167519d;
        k0 k0Var = this.f167535c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objInvoke);
                return Unit.INSTANCE;
            }
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = hVar.f167516a;
            o13.r.b(objInvoke);
            jE = g6.s.e(j14, ((g6.s) objInvoke).f76027a);
            this.f167538f = false;
            if (g6.s.c(jE) > 0.0f) {
                i0 i0Var = i0.f167546a;
                EdgeEffect edgeEffectC = k0Var.c();
                int iC = MathKt.c(g6.s.c(jE));
                i0Var.getClass();
                i0.c(edgeEffectC, iC);
            } else if (g6.s.c(jE) < 0.0f) {
                i0 i0Var2 = i0.f167546a;
                EdgeEffect edgeEffectD = k0Var.d();
                int i16 = -MathKt.c(g6.s.c(jE));
                i0Var2.getClass();
                i0.c(edgeEffectD, i16);
            }
            if (g6.s.d(jE) > 0.0f) {
                i0 i0Var3 = i0.f167546a;
                EdgeEffect edgeEffectE = k0Var.e();
                int iC2 = MathKt.c(g6.s.d(jE));
                i0Var3.getClass();
                i0.c(edgeEffectE, iC2);
            } else if (g6.s.d(jE) < 0.0f) {
                i0 i0Var4 = i0.f167546a;
                EdgeEffect edgeEffectB = k0Var.b();
                int i17 = -MathKt.c(g6.s.d(jE));
                i0Var4.getClass();
                i0.c(edgeEffectB, i17);
            }
            d();
            return Unit.INSTANCE;
        }
        o13.r.b(objInvoke);
        if (n4.g.h(this.f167539g)) {
            g6.s sVarA = g6.s.a(j8);
            hVar.f167519d = 1;
        } else {
            boolean zG = k0.g(k0Var.f167586f);
            g6.c cVar2 = this.f167533a;
            if (zG && g6.s.c(j8) < 0.0f) {
                i0 i0Var5 = i0.f167546a;
                EdgeEffect edgeEffectC2 = k0Var.c();
                float fC = g6.s.c(j8);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f167539g >> 32));
                i0Var5.getClass();
                fA = i0.a(edgeEffectC2, fC, fIntBitsToFloat, cVar2);
            } else if (!k0.g(k0Var.f167587g) || g6.s.c(j8) <= 0.0f) {
                fA = 0.0f;
            } else {
                i0 i0Var6 = i0.f167546a;
                EdgeEffect edgeEffectD2 = k0Var.d();
                float f14 = -g6.s.c(j8);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f167539g >> 32));
                i0Var6.getClass();
                fA = -i0.a(edgeEffectD2, f14, fIntBitsToFloat2, cVar2);
            }
            if (k0.g(k0Var.f167584d) && g6.s.d(j8) < 0.0f) {
                i0 i0Var7 = i0.f167546a;
                EdgeEffect edgeEffectE2 = k0Var.e();
                float fD = g6.s.d(j8);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.f167539g));
                i0Var7.getClass();
                fA2 = i0.a(edgeEffectE2, fD, fIntBitsToFloat3, cVar2);
            } else if (!k0.g(k0Var.f167585e) || g6.s.d(j8) <= 0.0f) {
                fA2 = 0.0f;
            } else {
                i0 i0Var8 = i0.f167546a;
                EdgeEffect edgeEffectB2 = k0Var.b();
                float f15 = -g6.s.d(j8);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & this.f167539g));
                i0Var8.getClass();
                fA2 = -i0.a(edgeEffectB2, f15, fIntBitsToFloat4, cVar2);
            }
            long jH = xy2.b.h(fA, fA2);
            g6.s.f76026b.getClass();
            if (jH != 0) {
                f();
            }
            long jE2 = g6.s.e(j8, jH);
            g6.s sVarA2 = g6.s.a(jE2);
            hVar.f167516a = jE2;
            hVar.f167519d = 2;
            objInvoke = pVar.invoke(sVarA2, hVar);
            if (objInvoke != aVar) {
                j14 = jE2;
                jE = g6.s.e(j14, ((g6.s) objInvoke).f76027a);
                this.f167538f = false;
                if (g6.s.c(jE) > 0.0f) {
                    i0 i0Var9 = i0.f167546a;
                    EdgeEffect edgeEffectC3 = k0Var.c();
                    int iC3 = MathKt.c(g6.s.c(jE));
                    i0Var9.getClass();
                    i0.c(edgeEffectC3, iC3);
                } else if (g6.s.c(jE) < 0.0f) {
                    i0 i0Var10 = i0.f167546a;
                    EdgeEffect edgeEffectD3 = k0Var.d();
                    int i18 = -MathKt.c(g6.s.c(jE));
                    i0Var10.getClass();
                    i0.c(edgeEffectD3, i18);
                }
                if (g6.s.d(jE) > 0.0f) {
                    i0 i0Var11 = i0.f167546a;
                    EdgeEffect edgeEffectE3 = k0Var.e();
                    int iC4 = MathKt.c(g6.s.d(jE));
                    i0Var11.getClass();
                    i0.c(edgeEffectE3, iC4);
                } else if (g6.s.d(jE) < 0.0f) {
                    i0 i0Var12 = i0.f167546a;
                    EdgeEffect edgeEffectB3 = k0Var.b();
                    int i19 = -MathKt.c(g6.s.d(jE));
                    i0Var12.getClass();
                    i0.c(edgeEffectB3, i19);
                }
                d();
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }

    public final void d() {
        boolean z14;
        k0 k0Var = this.f167535c;
        EdgeEffect edgeEffect = k0Var.f167584d;
        boolean z15 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z14 = !edgeEffect.isFinished();
        } else {
            z14 = false;
        }
        EdgeEffect edgeEffect2 = k0Var.f167585e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z14 = !edgeEffect2.isFinished() || z14;
        }
        EdgeEffect edgeEffect3 = k0Var.f167586f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z14 = !edgeEffect3.isFinished() || z14;
        }
        EdgeEffect edgeEffect4 = k0Var.f167587g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z14) {
                z15 = false;
            }
            z14 = z15;
        }
        if (z14) {
            f();
        }
    }

    public final long e() {
        long jB = this.f167534b;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = n4.h.b(this.f167539g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.f167539g >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)) / Float.intBitsToFloat((int) (this.f167539g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public final void f() {
        if (this.f167537e) {
            this.f167536d.setValue(Unit.INSTANCE);
        }
    }

    public final float g(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i14 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) / Float.intBitsToFloat((int) (this.f167539g & 4294967295L));
        EdgeEffect edgeEffectB = this.f167535c.b();
        i0.f167546a.getClass();
        return i0.b(edgeEffectB) == 0.0f ? Float.intBitsToFloat((int) (this.f167539g & 4294967295L)) * (-i0.d(edgeEffectB, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i14);
    }

    @Override // u1.r1
    public final h5.j getNode() {
        return this.f167541i;
    }

    public final float h(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) / Float.intBitsToFloat((int) (this.f167539g >> 32));
        EdgeEffect edgeEffectC = this.f167535c.c();
        i0.f167546a.getClass();
        return i0.b(edgeEffectC) == 0.0f ? Float.intBitsToFloat((int) (this.f167539g >> 32)) * i0.d(edgeEffectC, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i14);
    }

    public final float i(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) / Float.intBitsToFloat((int) (this.f167539g >> 32));
        EdgeEffect edgeEffectD = this.f167535c.d();
        i0.f167546a.getClass();
        return i0.b(edgeEffectD) == 0.0f ? Float.intBitsToFloat((int) (this.f167539g >> 32)) * (-i0.d(edgeEffectD, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i14);
    }

    public final float j(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i14 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) / Float.intBitsToFloat((int) (this.f167539g & 4294967295L));
        EdgeEffect edgeEffectE = this.f167535c.e();
        i0.f167546a.getClass();
        return i0.b(edgeEffectE) == 0.0f ? Float.intBitsToFloat((int) (this.f167539g & 4294967295L)) * i0.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i14);
    }

    public final void k(long j8) {
        long j14 = this.f167539g;
        n4.g.f123559b.getClass();
        boolean zC = n4.g.c(j14, 0L);
        boolean zC2 = n4.g.c(j8, this.f167539g);
        this.f167539g = j8;
        if (!zC2) {
            int iC = MathKt.c(Float.intBitsToFloat((int) (j8 >> 32)));
            long jC = (((long) MathKt.c(Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (((long) iC) << 32);
            g6.m.a aVar = g6.m.f76012b;
            k0 k0Var = this.f167535c;
            k0Var.f167583c = jC;
            EdgeEffect edgeEffect = k0Var.f167584d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jC >> 32), (int) (jC & 4294967295L));
            }
            EdgeEffect edgeEffect2 = k0Var.f167585e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jC >> 32), (int) (jC & 4294967295L));
            }
            EdgeEffect edgeEffect3 = k0Var.f167586f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jC & 4294967295L), (int) (jC >> 32));
            }
            EdgeEffect edgeEffect4 = k0Var.f167587g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jC & 4294967295L), (int) (jC >> 32));
            }
            EdgeEffect edgeEffect5 = k0Var.f167588h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jC >> 32), (int) (jC & 4294967295L));
            }
            EdgeEffect edgeEffect6 = k0Var.f167589i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jC >> 32), (int) (jC & 4294967295L));
            }
            EdgeEffect edgeEffect7 = k0Var.f167590j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jC & 4294967295L), (int) (jC >> 32));
            }
            EdgeEffect edgeEffect8 = k0Var.f167591k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jC), (int) (jC >> 32));
            }
        }
        if (zC || zC2) {
            return;
        }
        d();
    }

    public /* synthetic */ i(Context context, g6.c cVar, long j8, c2.h2 h2Var, p005kotlin.jvm.internal.j jVar) {
        this(context, cVar, j8, h2Var);
    }
}
