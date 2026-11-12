package p006l2;

import a2.j;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b21.p9;
import b5.h0;
import b5.s0;
import b50.o;
import c2.u;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import f5.z0;
import ge1.b;
import gl1.y;
import java.util.concurrent.atomic.AtomicReference;
import k62.k;
import kg.f;
import kotlin.h4;
import kotlin.k2;
import kotlin.m3;
import kotlin.o1;
import kotlin.q3;
import kotlin.t1;
import o13.r;
import o4.q1;
import o4.w;
import o53.b0;
import o53.c0;
import o53.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.b2;
import p008y1.k3;
import p13.j0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.o2;
import p3.p1;
import p3.p2;
import p3.x1;
import q4.g;
import s5.c;
import s5.i0;
import s5.w0;
import s5.x0;
import t13.d;
import u1.g0;
import u1.j1;
import v13.e;
import v13.i;
import v2.b1;
import v2.c1;
import v2.v;
import vb.h;
import w5.f0;
import x5.e0;
import x5.l0;
import x5.m0;
import x5.p0;
import x5.q;
import x5.q0;
import x5.r0;
import xn.t;
import z2.a0;
import z2.d2;
import z2.h2;
import z2.m2;
import z2.p;
import z2.s2;
import z2.t0;
import z2.t2;
import z2.u2;
import z2.x;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f108536a;

        public a(long j8) {
            this.f108536a = j8;
        }

        @Override // z2.p
        public final long a() {
            return this.f108536a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p2 f108537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f108538b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends i implements e23.p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f108539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f108540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p2 f108541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h2 f108542d;

            /* JADX INFO: renamed from: l2.h1$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1114}, m = "invokeSuspend", v = 1)
            public static final class C2084a extends i implements e23.p<b0, d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f108543a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f108544b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p2 f108545c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2084a(h0 h0Var, p2 p2Var, d<? super C2084a> dVar) {
                    super(2, dVar);
                    this.f108544b = h0Var;
                    this.f108545c = p2Var;
                }

                @Override // v13.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    return new C2084a(this.f108544b, this.f108545c, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                    return ((C2084a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f108543a;
                    if (i14 == 0) {
                        r.b(obj);
                        this.f108543a = 1;
                        if (h2.a(this.f108544b, this.f108545c, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: l2.h1$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1117}, m = "invokeSuspend", v = 1)
            public static final class C2085b extends i implements e23.p<b0, d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f108546a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f108547b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h2 f108548c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2085b(h0 h0Var, h2 h2Var, d<? super C2085b> dVar) {
                    super(2, dVar);
                    this.f108547b = h0Var;
                    this.f108548c = h2Var;
                }

                @Override // v13.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    return new C2085b(this.f108547b, this.f108548c, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                    return ((C2085b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f108546a;
                    if (i14 == 0) {
                        r.b(obj);
                        a1 a1Var = new a1(this.f108548c, 1);
                        this.f108546a = 1;
                        if (k3.f(this.f108547b, null, null, a1Var, this, 7) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h0 h0Var, p2 p2Var, h2 h2Var, d<? super a> dVar) {
                super(2, dVar);
                this.f108540b = h0Var;
                this.f108541c = p2Var;
                this.f108542d = h2Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                a aVar = new a(this.f108540b, this.f108541c, this.f108542d, dVar);
                aVar.f108539a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                b0 b0Var = (b0) this.f108539a;
                d0 d0Var = d0.UNDISPATCHED;
                p2 p2Var = this.f108541c;
                h0 h0Var = this.f108540b;
                ge1.b.T(b0Var, null, d0Var, new C2084a(h0Var, p2Var, null), 1);
                ge1.b.T(b0Var, null, d0Var, new C2085b(h0Var, this.f108542d, null), 1);
                return Unit.INSTANCE;
            }
        }

        public b(p2 p2Var, h2 h2Var) {
            this.f108537a = p2Var;
            this.f108538b = h2Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
            Object objE = c0.e(new a(h0Var, this.f108537a, this.f108538b, null), dVar);
            return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0402  */
    /* JADX WARN: Code duplicated, block: B:209:0x042b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0435  */
    /* JADX WARN: Code duplicated, block: B:213:0x043f  */
    /* JADX WARN: Code duplicated, block: B:214:0x044f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0454  */
    /* JADX WARN: Code duplicated, block: B:218:0x045b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0463  */
    /* JADX WARN: Code duplicated, block: B:223:0x0474 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x047b  */
    /* JADX WARN: Code duplicated, block: B:230:0x048e  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:236:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:239:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:241:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:247:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:250:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:253:0x0506  */
    /* JADX WARN: Code duplicated, block: B:256:0x0564  */
    /* JADX WARN: Code duplicated, block: B:258:0x057e  */
    /* JADX WARN: Code duplicated, block: B:261:0x059d  */
    /* JADX WARN: Code duplicated, block: B:262:0x059f  */
    /* JADX WARN: Code duplicated, block: B:265:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:266:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:269:0x05be  */
    /* JADX WARN: Code duplicated, block: B:270:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:273:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:275:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:281:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x0600  */
    /* JADX WARN: Code duplicated, block: B:287:0x066a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x066e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0695  */
    /* JADX WARN: Code duplicated, block: B:296:0x069f  */
    /* JADX WARN: Code duplicated, block: B:298:0x06a5 A[PHI: r29
      0x06a5: PHI (r29v7 l2.b2) = (r29v5 l2.b2), (r29v8 l2.b2) binds: [B:297:0x06a3, B:295:0x069c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:304:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:305:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:306:0x06c4 A[PHI: r21
      0x06c4: PHI (r21v13 java.lang.Object) = (r6v5 java.lang.Object), (r21v17 java.lang.Object) binds: [B:301:0x06ae, B:304:0x06b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:309:0x06ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:313:0x0716  */
    /* JADX WARN: Code duplicated, block: B:314:0x0718  */
    /* JADX WARN: Code duplicated, block: B:317:0x0720  */
    /* JADX WARN: Code duplicated, block: B:318:0x0722  */
    /* JADX WARN: Code duplicated, block: B:321:0x0734 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x073c  */
    /* JADX WARN: Code duplicated, block: B:327:0x0755  */
    /* JADX WARN: Code duplicated, block: B:330:0x0770 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x0772  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:335:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:338:0x07b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:339:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:342:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:343:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:347:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:350:0x07f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:353:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:356:0x083d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:365:0x087d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0889 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:371:0x088e  */
    /* JADX WARN: Code duplicated, block: B:374:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:375:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:378:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:380:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:386:0x08c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:387:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:392:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:394:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:398:0x0919  */
    /* JADX WARN: Code duplicated, block: B:400:0x091d  */
    /* JADX WARN: Code duplicated, block: B:404:0x093c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:405:0x093e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0971  */
    /* JADX WARN: Code duplicated, block: B:409:0x0979  */
    /* JADX WARN: Code duplicated, block: B:412:0x098a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:413:0x098c  */
    /* JADX WARN: Code duplicated, block: B:416:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:418:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a20  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v28, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v5, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r12v23, types: [h4.r] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r14v26, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r14v27, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r72v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v39, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void a(final l0 l0Var, l lVar, h4.r rVar, x0 x0Var, r0 r0Var, l lVar2, j jVar, w wVar, boolean z14, int i14, int i15, final q qVar, z1 z1Var, final boolean z15, final boolean z16, e23.q qVar2, m mVar, int i16, int i17) {
        int i18;
        int i19;
        ?? r14;
        ?? r15;
        int i24;
        h4 h4Var;
        x0 x0Var2;
        c cVar;
        boolean z17;
        ?? r16;
        m4.q qVar3;
        int i25;
        g6.c cVar2;
        x5.l lVar3;
        p0 p0Var;
        w0 w0Var;
        String str;
        c cVar3;
        boolean z18;
        boolean z19;
        long j8;
        l0 l0VarB;
        l0 l0Var2;
        Object objQ;
        ?? r17;
        final s3 s3Var;
        long jCurrentTimeMillis;
        Object objQ2;
        final b0 b0Var;
        Object objQ3;
        final i2.a aVar;
        Object objQ4;
        final h2 h2Var;
        m4.b0 b0Var2;
        boolean z24;
        ?? A;
        int i26;
        boolean z25;
        int i27;
        boolean z26;
        final m0 m0Var;
        boolean z27;
        int i28;
        boolean zR;
        Object obj;
        int i29;
        final b2 b2Var;
        i2.a aVar2;
        b0 b0Var3;
        x5.c0 c0Var;
        l0 l0Var3;
        h2 h2Var2;
        boolean z28;
        q qVar4;
        ?? r18;
        boolean z29;
        p1 p1VarQ;
        Unit unit;
        b2 b2Var2;
        boolean z34;
        boolean z35;
        Object objQ5;
        Object b1Var;
        h2 h2Var3;
        Unit unit2;
        Object obj2;
        b2 b2Var3;
        p1 p1Var;
        boolean zR2;
        Object objQ6;
        h4.r rVarB;
        boolean z36;
        boolean z37;
        boolean zR3;
        Object objQ7;
        x5.c0 c0Var2;
        l lVar4;
        boolean zR4;
        Object objQ8;
        boolean z38;
        boolean zR5;
        Object objQ9;
        boolean z39;
        h4 h4Var2;
        boolean z44;
        boolean zR6;
        Object objQ10;
        h4 h4Var3;
        b0 b0Var4;
        m0 m0Var2;
        final h2 h2Var4;
        final b2 b2Var4;
        h4.r rVarA;
        boolean zR7;
        Object objQ11;
        boolean z45;
        boolean z46;
        boolean z47;
        Object objQ12;
        q qVar5;
        final boolean z48;
        boolean z49;
        k2.a aVar3;
        int i30;
        boolean z54;
        boolean zH;
        Object objQ13;
        w wVar2;
        long j14;
        w t1Var;
        boolean zR8;
        Object objQ14;
        h4.r rVarF;
        Long l14;
        int i34 = qVar.f188935d;
        ?? E = mVar.E(31062401);
        if ((i16 & 6) == 0) {
            i18 = i16 | (E.B(l0Var) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= E.r(lVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= E.B(rVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= E.B(x0Var) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= E.B(r0Var) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i18 |= E.r(lVar2) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= E.B(jVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i18 |= E.B(wVar) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i18 |= E.h(z14) ? 67108864 : 33554432;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= E.k(i14) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i19 = i17 | (E.k(i15) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= E.B(qVar) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 |= E.B(z1Var) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i19 |= E.h(z15) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i19 |= E.h(z16) ? 16384 : 8192;
        }
        if ((i17 & 196608) == 0) {
            i19 |= E.r(qVar2) ? 131072 : 65536;
        }
        int i35 = i19 | 1572864;
        if (E.n(i18 & 1, ((i18 & 306783379) == 306783378 && (599187 & i35) == 599186) ? false : true)) {
            E.G0();
            if ((i16 & 1) != 0 && !E.o0()) {
                E.e();
            }
            E.h0();
            x1 x1Var = n.f135158a;
            Object objQ15 = E.q();
            m.f135153a.getClass();
            Object obj3 = m.a.f135155b;
            if (objQ15 == obj3) {
                objQ15 = f.j(E);
            }
            m4.b0 b0Var5 = (m4.b0) objQ15;
            Object objQ16 = E.q();
            if (objQ16 == obj3) {
                c1.a aVar4 = c1.f174908a;
                objQ16 = new v2.b();
                E.K(objQ16);
            }
            b1 b1Var2 = (b1) objQ16;
            Object objQ17 = E.q();
            if (objQ17 == obj3) {
                objQ17 = new m0(b1Var2);
                E.K(objQ17);
            }
            m0 m0Var3 = (m0) objQ17;
            g6.c cVar4 = (g6.c) E.A(t1.f91490h);
            w5.q.b bVar = (w5.q.b) E.A(t1.f91493k);
            long j15 = ((t2) E.A(u2.f201804a)).f201803b;
            m4.q qVar6 = (m4.q) E.A(t1.f91491i);
            h4 h4Var4 = (h4) E.A(t1.f91503u);
            m3 m3Var = (m3) E.A(t1.f91499q);
            b2 b2Var5 = (i14 == 1 && !z14 && qVar.f188932a) ? b2.Horizontal : b2.Vertical;
            E.C(-213744626);
            Object[] objArr = {b2Var5};
            f3.f108478g.getClass();
            d4.l lVar5 = f3.f108479h;
            boolean zK = E.k(b2Var5.ordinal());
            Object objQ18 = E.q();
            if (zK || objQ18 == obj3) {
                r15 = 0;
                objQ18 = new v0(b2Var5, 0);
                E.K(objQ18);
            } else {
                r15 = 0;
            }
            f3 f3Var = (f3) d4.a.c(objArr, lVar5, (e23.a) objQ18, E, r15);
            E.g0(r15);
            if (((b2) f3Var.f108485f.getF182175a()) != b2Var5) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(b2Var5 == b2.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i36 = i18 & 14;
            boolean z55 = ((i18 & 57344) == 16384) | (i36 == 4);
            Object objQ19 = E.q();
            if (z55 || objQ19 == obj3) {
                q0 q0VarA = u3.a(r0Var, l0Var.f188878a);
                w0 w0Var2 = l0Var.f188880c;
                if (w0Var2 != null) {
                    long j16 = w0Var2.f157317a;
                    t2.f108797a.getClass();
                    x5.c0 c0Var3 = q0VarA.f188940b;
                    w0.a aVar5 = w0.f157315b;
                    int iB = c0Var3.b((int) (j16 >> 32));
                    int iB2 = c0Var3.b((int) (j16 & 4294967295L));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    c.b bVar2 = new c.b(q0VarA.f188939a);
                    d6.i.f57760b.getClass();
                    bVar2.a(new i0(0L, 0L, (f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, d6.i.f57762d, (q1) null, (s5.b0) null, (g) null, 61439, (p005kotlin.jvm.internal.j) null), iMin, iMax);
                    objQ19 = new q0(bVar2.k(), c0Var3);
                } else {
                    objQ19 = q0VarA;
                }
                E.K(objQ19);
            } else {
                b0Var5 = b0Var5;
                f3Var = f3Var;
                j15 = j15;
            }
            q0 q0Var = (q0) objQ19;
            c cVar5 = q0Var.f188939a;
            final x5.c0 c0Var4 = q0Var.f188940b;
            o2 o2VarJ = p3.p0.j(E);
            boolean zB = E.B(m3Var);
            Object objQ20 = E.q();
            if (zB || objQ20 == obj3) {
                ?? r19 = E;
                i24 = i34;
                h4Var = h4Var4;
                x0Var2 = x0Var;
                cVar = cVar5;
                z17 = z14;
                objQ20 = new b2(new n2(cVar5, x0Var2, 0, 0, z14, 0, cVar4, bVar, null, 300, null), o2VarJ, m3Var);
                r19.K(objQ20);
                r16 = r19;
            } else {
                x0Var2 = x0Var;
                r16 = E;
                i24 = i34;
                h4Var = h4Var4;
                z17 = z14;
                cVar = cVar5;
            }
            b2 b2Var6 = (b2) objQ20;
            c cVar6 = l0Var.f188878a;
            ?? r110 = r16;
            long j17 = l0Var.f188879b;
            b2Var6.f108411u = lVar;
            b2Var6.f108416z = j15;
            x1 x1Var2 = b2Var6.f108408r;
            x1Var2.f108874b = z1Var;
            x1Var2.f108875c = qVar6;
            b2Var6.f108400j = cVar6;
            n2 n2Var = b2Var6.f108391a;
            j0 j0Var = j0.f134944a;
            d6.p.f57793b.getClass();
            int i37 = d6.p.f57794c;
            if (s.g(n2Var.f108674a, cVar) && s.g(n2Var.f108675b, x0Var2) && n2Var.f108678e == z17 && n2Var.f108679f == i37) {
                qVar3 = qVar6;
                if (n2Var.f108676c == Integer.MAX_VALUE) {
                    i25 = 1;
                    if (n2Var.f108677d == 1 && s.g(n2Var.f108680g, cVar4) && s.g(n2Var.f108682i, j0Var) && n2Var.f108681h == bVar) {
                        cVar2 = cVar4;
                    }
                    if (b2Var6.f108391a != n2Var) {
                        b2Var6.f108406p = true;
                    }
                    b2Var6.f108391a = n2Var;
                    lVar3 = b2Var6.f108394d;
                    p0Var = b2Var6.f108395e;
                    lVar3.getClass();
                    w0Var = l0Var.f188880c;
                    boolean zG = s.g(w0Var, lVar3.f188875b.c());
                    str = lVar3.f188874a.f188878a.f157138b;
                    cVar3 = l0Var.f188878a;
                    if (s.g(str, cVar3.f157138b)) {
                        if (w0.d(lVar3.f188874a.f188879b, j17)) {
                            z18 = false;
                        } else {
                            lVar3.f188875b.h(w0.h(j17), w0.g(j17));
                            z18 = false;
                            z19 = true;
                        }
                        if (w0Var == null) {
                            x5.m mVar2 = lVar3.f188875b;
                            mVar2.f188884d = -1;
                            mVar2.f188885e = -1;
                        } else {
                            j8 = w0Var.f157317a;
                            if (!w0.e(j8)) {
                                lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                            }
                        }
                        if (z18 && (z19 || zG)) {
                            l0VarB = l0Var;
                        } else {
                            x5.m mVar3 = lVar3.f188875b;
                            mVar3.f188884d = -1;
                            mVar3.f188885e = -1;
                            l0VarB = l0.b(l0Var, null, 0L, 3);
                        }
                        l0Var2 = lVar3.f188874a;
                        lVar3.f188874a = l0VarB;
                        if (p0Var != null && s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
                            p0Var.f188929b.c(l0Var2, l0VarB);
                        }
                        objQ = r110.q();
                        if (objQ == obj3) {
                            objQ = new s3(0, 1, null);
                            ?? r111 = r110;
                            r111.K(objQ);
                            r17 = r111;
                        } else {
                            r17 = r110;
                        }
                        s3Var = (s3) objQ;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (s3Var.f108789f) {
                            s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                            s3Var.a(l0Var);
                        } else {
                            l14 = s3Var.f108788e;
                            if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                                s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                                s3Var.a(l0Var);
                            }
                        }
                        objQ2 = r17.q();
                        if (objQ2 == obj3) {
                            objQ2 = p3.l0.j(t13.h.f161748a, r17);
                            r17.K(objQ2);
                        }
                        b0Var = (b0) objQ2;
                        objQ3 = r17.q();
                        if (objQ3 == obj3) {
                            objQ3 = new i2.c();
                            r17.K(objQ3);
                        }
                        aVar = (i2.a) objQ3;
                        objQ4 = r17.q();
                        if (objQ4 == obj3) {
                            objQ4 = new h2(s3Var);
                            r17.K(objQ4);
                        }
                        h2Var = (h2) objQ4;
                        h2Var.f201605b = c0Var4;
                        h2Var.f201609f = r0Var;
                        h2Var.f201606c = b2Var6.f108412v;
                        h2Var.f201607d = b2Var6;
                        h2Var.f201608e.setValue(l0Var);
                        h2Var.f201627x = w0.a(j17);
                        h2Var.f201611h = (o1) r17.A(t1.f91488f);
                        h2Var.f201612i = b0Var;
                        h2Var.f201614k = (q3) r17.A(t1.f91500r);
                        h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
                        b0Var2 = b0Var5;
                        h2Var.f201616m = b0Var2;
                        final boolean z56 = !z16;
                        h2Var.f201617n.setValue(Boolean.valueOf(z56));
                        h2Var.f201618o.setValue(Boolean.valueOf(z15));
                        if (g0.f167496c) {
                            r17.C(1966756105);
                            h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                            z24 = false;
                        } else {
                            z24 = false;
                            r17.C(1951015297);
                        }
                        r17.g0(z24);
                        b2Var6.b();
                        A = h4.r.S;
                        boolean zR9 = r17.r(b2Var6);
                        i26 = i35 & 7168;
                        if (i26 == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z57 = z25 | zR9;
                        i27 = i35 & 57344;
                        if (i27 == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean z58 = z26 | z57;
                        m0Var = m0Var3;
                        boolean zR10 = z58 | r17.r(m0Var);
                        if (i36 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        i28 = (i35 & 112) ^ 48;
                        zR = zR10 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
                        Object objQ21 = r17.q();
                        if (!zR || objQ21 == obj3) {
                            ?? r112 = r17;
                            i29 = i27;
                            b2Var = b2Var6;
                            obj = new l() { // from class: l2.w0
                                /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    i3 i3VarD;
                                    m4.g0 g0Var = (m4.g0) obj4;
                                    b2 b2Var7 = b2Var;
                                    if (b2Var7.b() == g0Var.a()) {
                                        return Unit.INSTANCE;
                                    }
                                    b2Var7.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                                    boolean zB2 = b2Var7.b();
                                    l0 l0Var4 = l0Var;
                                    x5.c0 c0Var5 = c0Var4;
                                    if (zB2 && z15 && !z16) {
                                        t2.a aVar6 = t2.f108797a;
                                        x5.l lVar6 = b2Var7.f108394d;
                                        x0 x0Var3 = b2Var7.f108412v;
                                        x0 x0Var4 = b2Var7.f108413w;
                                        aVar6.getClass();
                                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                        k kVar = new k(lVar6, 14, x0Var3, r0Var2);
                                        m0 m0Var4 = m0Var;
                                        x5.g0 g0Var2 = m0Var4.f188886a;
                                        g0Var2.g(l0Var4, qVar, kVar, x0Var4);
                                        ?? p0Var2 = new p0(m0Var4, g0Var2);
                                        m0Var4.f188887b.set((p0) p0Var2);
                                        r0Var2.f105810a = p0Var2;
                                        b2Var7.f108395e = p0Var2;
                                        h1.f(b2Var7, l0Var4, c0Var5);
                                    } else {
                                        h1.e(b2Var7);
                                    }
                                    if (g0Var.a() && (i3VarD = b2Var7.d()) != null) {
                                        b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var7, i3VarD, c0Var5, null), 3);
                                    }
                                    if (!g0Var.a()) {
                                        h2Var.m(null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            aVar2 = aVar;
                            b0Var3 = b0Var;
                            c0Var = c0Var4;
                            l0Var3 = l0Var;
                            h2Var2 = h2Var;
                            z28 = z15;
                            m0Var = m0Var;
                            qVar4 = qVar;
                            r112.K(obj);
                            r18 = r112;
                        } else {
                            i29 = i27;
                            aVar2 = aVar;
                            h2Var2 = h2Var;
                            b2Var = b2Var6;
                            c0Var = c0Var4;
                            r18 = r17;
                            qVar4 = qVar;
                            z28 = z15;
                            b0Var3 = b0Var;
                            obj = objQ21;
                            l0Var3 = l0Var;
                        }
                        h4.r rVarA2 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
                        if (z28 || z16) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
                        unit = Unit.INSTANCE;
                        boolean zB2 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
                        if (i28 > 32 || !r18.B(qVar4)) {
                            b2Var2 = b2Var;
                            if ((i35 & 48) != 32) {
                                z34 = false;
                            }
                            z35 = zB2 | z34;
                            objQ5 = r18.q();
                            if (z35) {
                                m0 m0Var4 = m0Var;
                                h2 h2Var5 = h2Var2;
                                q qVar7 = qVar4;
                                h2Var3 = h2Var5;
                                unit2 = unit;
                                obj2 = obj3;
                                b2Var3 = b2Var2;
                                b1Var = new b1(b2Var3, p1VarQ, m0Var4, h2Var3, qVar7, null);
                                p1Var = p1VarQ;
                                m0Var = m0Var4;
                                r18.K(b1Var);
                            } else if (objQ5 == obj3) {
                                obj3 = obj3;
                                m0 m0Var5 = m0Var;
                                h2 h2Var6 = h2Var2;
                                q qVar8 = qVar4;
                                h2Var3 = h2Var6;
                                unit2 = unit;
                                obj2 = obj3;
                                b2Var3 = b2Var2;
                                b1Var = new b1(b2Var3, p1VarQ, m0Var5, h2Var3, qVar8, null);
                                p1Var = p1VarQ;
                                m0Var = m0Var5;
                                r18.K(b1Var);
                            } else {
                                p1Var = p1VarQ;
                                h2Var3 = h2Var2;
                                unit2 = unit;
                                obj2 = obj3;
                                b1Var = objQ5;
                                b2Var3 = b2Var2;
                            }
                            p3.l0.e((e23.p) b1Var, unit2, r18);
                            zR2 = r18.r(b2Var3);
                            objQ6 = r18.q();
                            if (zR2 || objQ6 == obj2) {
                                objQ6 = new x0(b2Var3, 0);
                                r18.K(objQ6);
                            }
                            rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                            boolean zR11 = r18.r(b2Var3);
                            if (i29 == 16384) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z59 = zR11 | z36;
                            if (i26 == 2048) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            zR3 = z59 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                            objQ7 = r18.q();
                            if (!zR3 || objQ7 == obj2) {
                                h2 h2Var7 = h2Var3;
                                c0Var2 = c0Var;
                                y0 y0Var = new y0(b2Var3, b0Var2, z16, z15, h2Var7, c0Var2);
                                h2Var3 = h2Var7;
                                r18.K(y0Var);
                                objQ7 = y0Var;
                            } else {
                                c0Var2 = c0Var;
                            }
                            lVar4 = (l) objQ7;
                            if (z15) {
                                rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                            }
                            h2.a aVar6 = h2Var3.B;
                            h2.b bVar3 = h2Var3.A;
                            zR4 = r18.r(h2Var3);
                            objQ8 = r18.q();
                            if (zR4 || objQ8 == obj2) {
                                objQ8 = new g1(h2Var3);
                                r18.K(objQ8);
                            }
                            h4.r rVarThen = rVarB.then(new b5.r0(aVar6, bVar3, null, (PointerInputEventHandler) objQ8, 4, null));
                            b5.w.f15928a.getClass();
                            h4.r rVarA3 = b5.t0.a(rVarThen, b5.w.a.f15931c);
                            boolean zR12 = r18.r(b2Var3);
                            if (i36 == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            zR5 = zR12 | z38 | r18.r(c0Var2);
                            objQ9 = r18.q();
                            if (zR5 || objQ9 == obj2) {
                                objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                                r18.K(objQ9);
                            }
                            h4.r rVarD = l4.k.d(A, (l) objQ9);
                            boolean zR13 = r18.r(b2Var3);
                            if (i26 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            boolean z64 = zR13 | z39;
                            h4Var2 = h4Var;
                            boolean zB3 = z64 | r18.B(h4Var2) | r18.r(h2Var3);
                            if (i36 == 4) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            zR6 = zB3 | z44 | r18.r(c0Var2);
                            objQ10 = r18.q();
                            if (!zR6 || objQ10 == obj2) {
                                ds.e eVar = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                                h4Var3 = h4Var2;
                                r18.K(eVar);
                                objQ10 = eVar;
                            } else {
                                h4Var3 = h4Var2;
                            }
                            h4.r rVarF2 = f5.g0.f(A, (l) objQ10);
                            final x5.c0 c0Var5 = c0Var2;
                            b2 b2Var7 = b2Var3;
                            b0Var4 = b0Var3;
                            m0Var2 = m0Var;
                            h2Var4 = h2Var3;
                            v vVar = new v(q0Var, l0Var, b2Var7, z16, z15, r0Var instanceof e0, c0Var5, h2Var4, qVar, b0Var2);
                            b2Var4 = b2Var7;
                            if (!z15 && !z16 && h4Var3.a() && w0.e(((w0) b2Var4.A.getF182175a()).f157317a) && w0.e(((w0) b2Var4.B.getF182175a()).f157317a)) {
                                fb0.b bVar4 = new fb0.b(wVar, b2Var4, l0Var, c0Var5, 21);
                                b2Var4 = b2Var4;
                                rVarA = h4.k.a(A, k2.f91249a, bVar4);
                            } else {
                                rVarA = A;
                            }
                            zR7 = r18.r(h2Var4);
                            objQ11 = r18.q();
                            if (!zR7 || objQ11 == obj2) {
                                z45 = false;
                                objQ11 = new a1(h2Var4, 0);
                                r18.K(objQ11);
                            } else {
                                z45 = false;
                            }
                            p3.l0.a(h2Var4, (l) objQ11, r18);
                            boolean zR14 = r18.r(b2Var4) | r18.r(m0Var2);
                            if (i36 == 4) {
                                z46 = true;
                            } else {
                                z46 = z45;
                            }
                            z47 = zR14 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                            objQ12 = r18.q();
                            if (!z47 || objQ12 == obj2) {
                                ev2.f fVar = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                                qVar5 = qVar;
                                r18.K(fVar);
                                objQ12 = fVar;
                            } else {
                                qVar5 = qVar;
                            }
                            p3.l0.a(qVar5, (l) objQ12, r18);
                            final x0 x0Var3 = b2Var4.f108412v;
                            if (i14 == 1) {
                                z48 = true;
                            } else {
                                z48 = z45;
                            }
                            final int i38 = qVar5.f188936e;
                            z49 = true;
                            e23.q qVar9 = new e23.q() { // from class: l2.y2
                                @Override // e23.q
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    m mVar4 = (m) obj5;
                                    ((Integer) obj6).getClass();
                                    mVar4.C(851809892);
                                    x1 x1Var3 = n.f135158a;
                                    Object objQ22 = mVar4.q();
                                    m.f135153a.getClass();
                                    m.a.C2565a c2565a = m.a.f135155b;
                                    if (objQ22 == c2565a) {
                                        objQ22 = new s2();
                                        mVar4.K(objQ22);
                                    }
                                    s2 s2Var = (s2) objQ22;
                                    Object objQ23 = mVar4.q();
                                    if (objQ23 == c2565a) {
                                        objQ23 = new j1();
                                        mVar4.K(objQ23);
                                    }
                                    x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z56, z48, s2Var, c0Var5, s3Var, (j1) objQ23, null, x0Var3, i38, 512, null);
                                    h4.r.a aVar7 = h4.r.S;
                                    boolean zR15 = mVar4.r(x2Var);
                                    Object objQ24 = mVar4.q();
                                    if (zR15 || objQ24 == c2565a) {
                                        objQ24 = new z2(x2Var);
                                        mVar4.K(objQ24);
                                    }
                                    h4.r rVarB2 = z4.f.b(aVar7, (l) ((k23.g) objQ24));
                                    mVar4.f();
                                    return rVarB2;
                                }
                            };
                            aVar3 = k2.f91249a;
                            h4.r rVarA4 = h4.k.a(A, aVar3, qVar9);
                            x5.v.f188954b.getClass();
                            i30 = i24;
                            if (i30 == x5.v.f188961i && i30 != x5.v.f188962j) {
                                z54 = true;
                            } else {
                                z54 = z45;
                            }
                            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                            zH = r18.h(z54) | r18.r(b1Var2);
                            objQ13 = r18.q();
                            if (zH || objQ13 == obj2) {
                                objQ13 = new o(z54, b1Var2, 7);
                                r18.K(objQ13);
                            }
                            h4.r rVarA5 = t2.b.a(A, zBooleanValue, z54, (e23.a) objQ13);
                            wVar2 = (w) r18.A(e.f108446a);
                            j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                            if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                                t1Var = wVar2;
                            } else {
                                t1Var = new o4.t1(j14, null);
                            }
                            zR8 = r18.r(b2Var4) | r18.B(t1Var);
                            objQ14 = r18.q();
                            if (zR8 || objQ14 == obj2) {
                                objQ14 = new jt1.d(23, b2Var4, t1Var);
                                r18.K(objQ14);
                            }
                            h4.r rVarF3 = l4.k.f(A, (l) objQ14);
                            x1 x1Var3 = n.f135158a;
                            h4.r rVarThen2 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF3), b1Var2, b2Var4, h2Var4).then(rVarA5).then(rVarA2), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA4);
                            f3 f3Var2 = f3Var;
                            rVarF = f5.g0.f(h4.k.a(rVarThen2, aVar3, new p9(f3Var2, z15, jVar, 8)).then(rVarA3).then(vVar), new x0(b2Var4, 1));
                            if (g0.f167495b) {
                                rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                            }
                            if (z15 || !b2Var4.b() || !((Boolean) b2Var4.f108407q.getF182175a()).booleanValue() || !h4Var3.a()) {
                                z49 = z45;
                            }
                            if (z49) {
                                p5.j0<e23.a<n4.c>> j0Var2 = j1.f167577a;
                                A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                            }
                            ?? r24 = r18;
                            b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var2, l0Var, r0Var, rVarA, rVarD, rVarF2, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var5, cVar2), r24), r24, 384);
                            x1 x1Var4 = n.f135158a;
                            r14 = r24;
                        } else {
                            b2Var2 = b2Var;
                        }
                        z34 = true;
                        z35 = zB2 | z34;
                        objQ5 = r18.q();
                        if (z35) {
                            m0 m0Var6 = m0Var;
                            h2 h2Var8 = h2Var2;
                            q qVar10 = qVar4;
                            h2Var3 = h2Var8;
                            unit2 = unit;
                            obj2 = obj3;
                            b2Var3 = b2Var2;
                            b1Var = new b1(b2Var3, p1VarQ, m0Var6, h2Var3, qVar10, null);
                            p1Var = p1VarQ;
                            m0Var = m0Var6;
                            r18.K(b1Var);
                        } else if (objQ5 == obj3) {
                            obj3 = obj3;
                            m0 m0Var7 = m0Var;
                            h2 h2Var9 = h2Var2;
                            q qVar11 = qVar4;
                            h2Var3 = h2Var9;
                            unit2 = unit;
                            obj2 = obj3;
                            b2Var3 = b2Var2;
                            b1Var = new b1(b2Var3, p1VarQ, m0Var7, h2Var3, qVar11, null);
                            p1Var = p1VarQ;
                            m0Var = m0Var7;
                            r18.K(b1Var);
                        } else {
                            p1Var = p1VarQ;
                            h2Var3 = h2Var2;
                            unit2 = unit;
                            obj2 = obj3;
                            b1Var = objQ5;
                            b2Var3 = b2Var2;
                        }
                        p3.l0.e((e23.p) b1Var, unit2, r18);
                        zR2 = r18.r(b2Var3);
                        objQ6 = r18.q();
                        if (zR2) {
                            objQ6 = new x0(b2Var3, 0);
                            r18.K(objQ6);
                        } else {
                            objQ6 = new x0(b2Var3, 0);
                            r18.K(objQ6);
                        }
                        rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                        boolean zR15 = r18.r(b2Var3);
                        if (i29 == 16384) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z510 = zR15 | z36;
                        if (i26 == 2048) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zR3 = z510 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                        objQ7 = r18.q();
                        if (zR3) {
                            h2 h2Var10 = h2Var3;
                            c0Var2 = c0Var;
                            y0 y0Var2 = new y0(b2Var3, b0Var2, z16, z15, h2Var10, c0Var2);
                            h2Var3 = h2Var10;
                            r18.K(y0Var2);
                            objQ7 = y0Var2;
                        } else {
                            h2 h2Var11 = h2Var3;
                            c0Var2 = c0Var;
                            y0 y0Var3 = new y0(b2Var3, b0Var2, z16, z15, h2Var11, c0Var2);
                            h2Var3 = h2Var11;
                            r18.K(y0Var3);
                            objQ7 = y0Var3;
                        }
                        lVar4 = (l) objQ7;
                        if (z15) {
                            rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                        }
                        h2.a aVar7 = h2Var3.B;
                        h2.b bVar5 = h2Var3.A;
                        zR4 = r18.r(h2Var3);
                        objQ8 = r18.q();
                        if (zR4) {
                            objQ8 = new g1(h2Var3);
                            r18.K(objQ8);
                        } else {
                            objQ8 = new g1(h2Var3);
                            r18.K(objQ8);
                        }
                        h4.r rVarThen3 = rVarB.then(new b5.r0(aVar7, bVar5, null, (PointerInputEventHandler) objQ8, 4, null));
                        b5.w.f15928a.getClass();
                        h4.r rVarA6 = b5.t0.a(rVarThen3, b5.w.a.f15931c);
                        boolean zR16 = r18.r(b2Var3);
                        if (i36 == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        zR5 = zR16 | z38 | r18.r(c0Var2);
                        objQ9 = r18.q();
                        if (zR5) {
                            objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                            r18.K(objQ9);
                        } else {
                            objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                            r18.K(objQ9);
                        }
                        h4.r rVarD2 = l4.k.d(A, (l) objQ9);
                        boolean zR17 = r18.r(b2Var3);
                        if (i26 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z65 = zR17 | z39;
                        h4Var2 = h4Var;
                        boolean zB4 = z65 | r18.B(h4Var2) | r18.r(h2Var3);
                        if (i36 == 4) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        zR6 = zB4 | z44 | r18.r(c0Var2);
                        objQ10 = r18.q();
                        if (zR6) {
                            ds.e eVar2 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                            h4Var3 = h4Var2;
                            r18.K(eVar2);
                            objQ10 = eVar2;
                        } else {
                            ds.e eVar3 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                            h4Var3 = h4Var2;
                            r18.K(eVar3);
                            objQ10 = eVar3;
                        }
                        h4.r rVarF4 = f5.g0.f(A, (l) objQ10);
                        final x5.c0 c0Var6 = c0Var2;
                        b2 b2Var8 = b2Var3;
                        b0Var4 = b0Var3;
                        m0Var2 = m0Var;
                        h2Var4 = h2Var3;
                        v vVar2 = new v(q0Var, l0Var, b2Var8, z16, z15, r0Var instanceof e0, c0Var6, h2Var4, qVar, b0Var2);
                        b2Var4 = b2Var8;
                        if (!z15) {
                            rVarA = A;
                        } else {
                            rVarA = A;
                        }
                        zR7 = r18.r(h2Var4);
                        objQ11 = r18.q();
                        if (zR7) {
                            z45 = false;
                            objQ11 = new a1(h2Var4, 0);
                            r18.K(objQ11);
                        } else {
                            z45 = false;
                            objQ11 = new a1(h2Var4, 0);
                            r18.K(objQ11);
                        }
                        p3.l0.a(h2Var4, (l) objQ11, r18);
                        boolean zR18 = r18.r(b2Var4) | r18.r(m0Var2);
                        if (i36 == 4) {
                            z46 = true;
                        } else {
                            z46 = z45;
                        }
                        z47 = zR18 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                        objQ12 = r18.q();
                        if (z47) {
                            ev2.f fVar2 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                            qVar5 = qVar;
                            r18.K(fVar2);
                            objQ12 = fVar2;
                        } else {
                            ev2.f fVar3 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                            qVar5 = qVar;
                            r18.K(fVar3);
                            objQ12 = fVar3;
                        }
                        p3.l0.a(qVar5, (l) objQ12, r18);
                        final l x0Var4 = b2Var4.f108412v;
                        if (i14 == 1) {
                            z48 = true;
                        } else {
                            z48 = z45;
                        }
                        final int i39 = qVar5.f188936e;
                        z49 = true;
                        e23.q qVar12 = new e23.q() { // from class: l2.y2
                            @Override // e23.q
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                m mVar4 = (m) obj5;
                                ((Integer) obj6).getClass();
                                mVar4.C(851809892);
                                x1 x1Var5 = n.f135158a;
                                Object objQ22 = mVar4.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ22 == c2565a) {
                                    objQ22 = new s2();
                                    mVar4.K(objQ22);
                                }
                                s2 s2Var = (s2) objQ22;
                                Object objQ23 = mVar4.q();
                                if (objQ23 == c2565a) {
                                    objQ23 = new j1();
                                    mVar4.K(objQ23);
                                }
                                x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z56, z48, s2Var, c0Var6, s3Var, (j1) objQ23, null, x0Var4, i39, 512, null);
                                h4.r.a aVar8 = h4.r.S;
                                boolean zR19 = mVar4.r(x2Var);
                                Object objQ24 = mVar4.q();
                                if (zR19 || objQ24 == c2565a) {
                                    objQ24 = new z2(x2Var);
                                    mVar4.K(objQ24);
                                }
                                h4.r rVarB2 = z4.f.b(aVar8, (l) ((k23.g) objQ24));
                                mVar4.f();
                                return rVarB2;
                            }
                        };
                        aVar3 = k2.f91249a;
                        h4.r rVarA7 = h4.k.a(A, aVar3, qVar12);
                        x5.v.f188954b.getClass();
                        i30 = i24;
                        if (i30 == x5.v.f188961i) {
                            z54 = z45;
                        } else {
                            z54 = true;
                        }
                        boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                        zH = r18.h(z54) | r18.r(b1Var2);
                        objQ13 = r18.q();
                        if (zH) {
                            objQ13 = new o(z54, b1Var2, 7);
                            r18.K(objQ13);
                        } else {
                            objQ13 = new o(z54, b1Var2, 7);
                            r18.K(objQ13);
                        }
                        h4.r rVarA8 = t2.b.a(A, zBooleanValue2, z54, (e23.a) objQ13);
                        wVar2 = (w) r18.A(e.f108446a);
                        j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                        if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                            t1Var = new o4.t1(j14, null);
                        } else {
                            t1Var = wVar2;
                        }
                        zR8 = r18.r(b2Var4) | r18.B(t1Var);
                        objQ14 = r18.q();
                        if (zR8) {
                            objQ14 = new jt1.d(23, b2Var4, t1Var);
                            r18.K(objQ14);
                        } else {
                            objQ14 = new jt1.d(23, b2Var4, t1Var);
                            r18.K(objQ14);
                        }
                        h4.r rVarF5 = l4.k.f(A, (l) objQ14);
                        x1 x1Var5 = n.f135158a;
                        h4.r rVarThen4 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF5), b1Var2, b2Var4, h2Var4).then(rVarA8).then(rVarA2), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA7);
                        f3 f3Var3 = f3Var;
                        rVarF = f5.g0.f(h4.k.a(rVarThen4, aVar3, new p9(f3Var3, z15, jVar, 8)).then(rVarA6).then(vVar2), new x0(b2Var4, 1));
                        if (g0.f167495b) {
                            rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                        }
                        if (z15) {
                            z49 = z45;
                        } else {
                            z49 = z45;
                        }
                        if (z49) {
                            p5.j0<e23.a<n4.c>> j0Var3 = j1.f167577a;
                            A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                        }
                        ?? r25 = r18;
                        b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var3, l0Var, r0Var, rVarA, rVarD2, rVarF4, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var6, cVar2), r25), r25, 384);
                        x1 x1Var6 = n.f135158a;
                        r14 = r25;
                    } else {
                        lVar3.f188875b = new x5.m(cVar3, j17, (p005kotlin.jvm.internal.j) null);
                        z18 = true;
                    }
                    z19 = false;
                    if (w0Var == null) {
                        x5.m mVar4 = lVar3.f188875b;
                        mVar4.f188884d = -1;
                        mVar4.f188885e = -1;
                    } else {
                        j8 = w0Var.f157317a;
                        if (!w0.e(j8)) {
                            lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                        }
                    }
                    if (z18) {
                        x5.m mVar5 = lVar3.f188875b;
                        mVar5.f188884d = -1;
                        mVar5.f188885e = -1;
                        l0VarB = l0.b(l0Var, null, 0L, 3);
                    } else {
                        x5.m mVar6 = lVar3.f188875b;
                        mVar6.f188884d = -1;
                        mVar6.f188885e = -1;
                        l0VarB = l0.b(l0Var, null, 0L, 3);
                    }
                    l0Var2 = lVar3.f188874a;
                    lVar3.f188874a = l0VarB;
                    if (p0Var != null) {
                        p0Var.f188929b.c(l0Var2, l0VarB);
                    }
                    objQ = r110.q();
                    if (objQ == obj3) {
                        objQ = new s3(0, 1, null);
                        ?? r113 = r110;
                        r113.K(objQ);
                        r17 = r113;
                    } else {
                        r17 = r110;
                    }
                    s3Var = (s3) objQ;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (s3Var.f108789f) {
                        s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                        s3Var.a(l0Var);
                    } else {
                        l14 = s3Var.f108788e;
                        if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                            s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                            s3Var.a(l0Var);
                        }
                    }
                    objQ2 = r17.q();
                    if (objQ2 == obj3) {
                        objQ2 = p3.l0.j(t13.h.f161748a, r17);
                        r17.K(objQ2);
                    }
                    b0Var = (b0) objQ2;
                    objQ3 = r17.q();
                    if (objQ3 == obj3) {
                        objQ3 = new i2.c();
                        r17.K(objQ3);
                    }
                    aVar = (i2.a) objQ3;
                    objQ4 = r17.q();
                    if (objQ4 == obj3) {
                        objQ4 = new h2(s3Var);
                        r17.K(objQ4);
                    }
                    h2Var = (h2) objQ4;
                    h2Var.f201605b = c0Var4;
                    h2Var.f201609f = r0Var;
                    h2Var.f201606c = b2Var6.f108412v;
                    h2Var.f201607d = b2Var6;
                    h2Var.f201608e.setValue(l0Var);
                    h2Var.f201627x = w0.a(j17);
                    h2Var.f201611h = (o1) r17.A(t1.f91488f);
                    h2Var.f201612i = b0Var;
                    h2Var.f201614k = (q3) r17.A(t1.f91500r);
                    h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
                    b0Var2 = b0Var5;
                    h2Var.f201616m = b0Var2;
                    final boolean z511 = !z16;
                    h2Var.f201617n.setValue(Boolean.valueOf(z511));
                    h2Var.f201618o.setValue(Boolean.valueOf(z15));
                    if (g0.f167496c) {
                        r17.C(1966756105);
                        h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                        z24 = false;
                    } else {
                        z24 = false;
                        r17.C(1951015297);
                    }
                    r17.g0(z24);
                    b2Var6.b();
                    A = h4.r.S;
                    boolean zR19 = r17.r(b2Var6);
                    i26 = i35 & 7168;
                    if (i26 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z512 = z25 | zR19;
                    i27 = i35 & 57344;
                    if (i27 == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z513 = z26 | z512;
                    m0Var = m0Var3;
                    boolean zR110 = z513 | r17.r(m0Var);
                    if (i36 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    i28 = (i35 & 112) ^ 48;
                    zR = zR110 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
                    Object objQ22 = r17.q();
                    if (zR) {
                        ?? r114 = r17;
                        i29 = i27;
                        b2Var = b2Var6;
                        obj = new l() { // from class: l2.w0
                            /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                i3 i3VarD;
                                m4.g0 g0Var = (m4.g0) obj4;
                                b2 b2Var9 = b2Var;
                                if (b2Var9.b() == g0Var.a()) {
                                    return Unit.INSTANCE;
                                }
                                b2Var9.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                                boolean zB5 = b2Var9.b();
                                l0 l0Var4 = l0Var;
                                x5.c0 c0Var7 = c0Var4;
                                if (zB5 && z15 && !z16) {
                                    t2.a aVar8 = t2.f108797a;
                                    x5.l lVar6 = b2Var9.f108394d;
                                    x0 x0Var5 = b2Var9.f108412v;
                                    x0 x0Var6 = b2Var9.f108413w;
                                    aVar8.getClass();
                                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                    k kVar = new k(lVar6, 14, x0Var5, r0Var2);
                                    m0 m0Var8 = m0Var;
                                    x5.g0 g0Var2 = m0Var8.f188886a;
                                    g0Var2.g(l0Var4, qVar, kVar, x0Var6);
                                    ?? p0Var2 = new p0(m0Var8, g0Var2);
                                    m0Var8.f188887b.set((p0) p0Var2);
                                    r0Var2.f105810a = p0Var2;
                                    b2Var9.f108395e = p0Var2;
                                    h1.f(b2Var9, l0Var4, c0Var7);
                                } else {
                                    h1.e(b2Var9);
                                }
                                if (g0Var.a() && (i3VarD = b2Var9.d()) != null) {
                                    b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var9, i3VarD, c0Var7, null), 3);
                                }
                                if (!g0Var.a()) {
                                    h2Var.m(null);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        aVar2 = aVar;
                        b0Var3 = b0Var;
                        c0Var = c0Var4;
                        l0Var3 = l0Var;
                        h2Var2 = h2Var;
                        z28 = z15;
                        m0Var = m0Var;
                        qVar4 = qVar;
                        r114.K(obj);
                        r18 = r114;
                    } else {
                        ?? r115 = r17;
                        i29 = i27;
                        b2Var = b2Var6;
                        obj = new l() { // from class: l2.w0
                            /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                i3 i3VarD;
                                m4.g0 g0Var = (m4.g0) obj4;
                                b2 b2Var9 = b2Var;
                                if (b2Var9.b() == g0Var.a()) {
                                    return Unit.INSTANCE;
                                }
                                b2Var9.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                                boolean zB5 = b2Var9.b();
                                l0 l0Var4 = l0Var;
                                x5.c0 c0Var7 = c0Var4;
                                if (zB5 && z15 && !z16) {
                                    t2.a aVar8 = t2.f108797a;
                                    x5.l lVar6 = b2Var9.f108394d;
                                    x0 x0Var5 = b2Var9.f108412v;
                                    x0 x0Var6 = b2Var9.f108413w;
                                    aVar8.getClass();
                                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                    k kVar = new k(lVar6, 14, x0Var5, r0Var2);
                                    m0 m0Var8 = m0Var;
                                    x5.g0 g0Var2 = m0Var8.f188886a;
                                    g0Var2.g(l0Var4, qVar, kVar, x0Var6);
                                    ?? p0Var2 = new p0(m0Var8, g0Var2);
                                    m0Var8.f188887b.set((p0) p0Var2);
                                    r0Var2.f105810a = p0Var2;
                                    b2Var9.f108395e = p0Var2;
                                    h1.f(b2Var9, l0Var4, c0Var7);
                                } else {
                                    h1.e(b2Var9);
                                }
                                if (g0Var.a() && (i3VarD = b2Var9.d()) != null) {
                                    b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var9, i3VarD, c0Var7, null), 3);
                                }
                                if (!g0Var.a()) {
                                    h2Var.m(null);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        aVar2 = aVar;
                        b0Var3 = b0Var;
                        c0Var = c0Var4;
                        l0Var3 = l0Var;
                        h2Var2 = h2Var;
                        z28 = z15;
                        m0Var = m0Var;
                        qVar4 = qVar;
                        r115.K(obj);
                        r18 = r115;
                    }
                    h4.r rVarA9 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
                    if (z28) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
                    unit = Unit.INSTANCE;
                    boolean zB5 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
                    if (i28 > 32) {
                        b2Var2 = b2Var;
                        if ((i35 & 48) != 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                    } else {
                        b2Var2 = b2Var;
                        if ((i35 & 48) != 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                    }
                    z35 = zB5 | z34;
                    objQ5 = r18.q();
                    if (z35) {
                        m0 m0Var8 = m0Var;
                        h2 h2Var12 = h2Var2;
                        q qVar13 = qVar4;
                        h2Var3 = h2Var12;
                        unit2 = unit;
                        obj2 = obj3;
                        b2Var3 = b2Var2;
                        b1Var = new b1(b2Var3, p1VarQ, m0Var8, h2Var3, qVar13, null);
                        p1Var = p1VarQ;
                        m0Var = m0Var8;
                        r18.K(b1Var);
                    } else if (objQ5 == obj3) {
                        obj3 = obj3;
                        m0 m0Var9 = m0Var;
                        h2 h2Var13 = h2Var2;
                        q qVar14 = qVar4;
                        h2Var3 = h2Var13;
                        unit2 = unit;
                        obj2 = obj3;
                        b2Var3 = b2Var2;
                        b1Var = new b1(b2Var3, p1VarQ, m0Var9, h2Var3, qVar14, null);
                        p1Var = p1VarQ;
                        m0Var = m0Var9;
                        r18.K(b1Var);
                    } else {
                        p1Var = p1VarQ;
                        h2Var3 = h2Var2;
                        unit2 = unit;
                        obj2 = obj3;
                        b1Var = objQ5;
                        b2Var3 = b2Var2;
                    }
                    p3.l0.e((e23.p) b1Var, unit2, r18);
                    zR2 = r18.r(b2Var3);
                    objQ6 = r18.q();
                    if (zR2) {
                        objQ6 = new x0(b2Var3, 0);
                        r18.K(objQ6);
                    } else {
                        objQ6 = new x0(b2Var3, 0);
                        r18.K(objQ6);
                    }
                    rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                    boolean zR111 = r18.r(b2Var3);
                    if (i29 == 16384) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z514 = zR111 | z36;
                    if (i26 == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zR3 = z514 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                    objQ7 = r18.q();
                    if (zR3) {
                        h2 h2Var14 = h2Var3;
                        c0Var2 = c0Var;
                        y0 y0Var4 = new y0(b2Var3, b0Var2, z16, z15, h2Var14, c0Var2);
                        h2Var3 = h2Var14;
                        r18.K(y0Var4);
                        objQ7 = y0Var4;
                    } else {
                        h2 h2Var15 = h2Var3;
                        c0Var2 = c0Var;
                        y0 y0Var5 = new y0(b2Var3, b0Var2, z16, z15, h2Var15, c0Var2);
                        h2Var3 = h2Var15;
                        r18.K(y0Var5);
                        objQ7 = y0Var5;
                    }
                    lVar4 = (l) objQ7;
                    if (z15) {
                        rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                    }
                    h2.a aVar8 = h2Var3.B;
                    h2.b bVar6 = h2Var3.A;
                    zR4 = r18.r(h2Var3);
                    objQ8 = r18.q();
                    if (zR4) {
                        objQ8 = new g1(h2Var3);
                        r18.K(objQ8);
                    } else {
                        objQ8 = new g1(h2Var3);
                        r18.K(objQ8);
                    }
                    h4.r rVarThen5 = rVarB.then(new b5.r0(aVar8, bVar6, null, (PointerInputEventHandler) objQ8, 4, null));
                    b5.w.f15928a.getClass();
                    h4.r rVarA10 = b5.t0.a(rVarThen5, b5.w.a.f15931c);
                    boolean zR112 = r18.r(b2Var3);
                    if (i36 == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    zR5 = zR112 | z38 | r18.r(c0Var2);
                    objQ9 = r18.q();
                    if (zR5) {
                        objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                        r18.K(objQ9);
                    } else {
                        objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                        r18.K(objQ9);
                    }
                    h4.r rVarD3 = l4.k.d(A, (l) objQ9);
                    boolean zR113 = r18.r(b2Var3);
                    if (i26 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z66 = zR113 | z39;
                    h4Var2 = h4Var;
                    boolean zB6 = z66 | r18.B(h4Var2) | r18.r(h2Var3);
                    if (i36 == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    zR6 = zB6 | z44 | r18.r(c0Var2);
                    objQ10 = r18.q();
                    if (zR6) {
                        ds.e eVar4 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                        h4Var3 = h4Var2;
                        r18.K(eVar4);
                        objQ10 = eVar4;
                    } else {
                        ds.e eVar5 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                        h4Var3 = h4Var2;
                        r18.K(eVar5);
                        objQ10 = eVar5;
                    }
                    h4.r rVarF6 = f5.g0.f(A, (l) objQ10);
                    final x5.c0 c0Var7 = c0Var2;
                    b2 b2Var9 = b2Var3;
                    b0Var4 = b0Var3;
                    m0Var2 = m0Var;
                    h2Var4 = h2Var3;
                    v vVar3 = new v(q0Var, l0Var, b2Var9, z16, z15, r0Var instanceof e0, c0Var7, h2Var4, qVar, b0Var2);
                    b2Var4 = b2Var9;
                    if (!z15) {
                        rVarA = A;
                    } else {
                        rVarA = A;
                    }
                    zR7 = r18.r(h2Var4);
                    objQ11 = r18.q();
                    if (zR7) {
                        z45 = false;
                        objQ11 = new a1(h2Var4, 0);
                        r18.K(objQ11);
                    } else {
                        z45 = false;
                        objQ11 = new a1(h2Var4, 0);
                        r18.K(objQ11);
                    }
                    p3.l0.a(h2Var4, (l) objQ11, r18);
                    boolean zR114 = r18.r(b2Var4) | r18.r(m0Var2);
                    if (i36 == 4) {
                        z46 = true;
                    } else {
                        z46 = z45;
                    }
                    z47 = zR114 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                    objQ12 = r18.q();
                    if (z47) {
                        ev2.f fVar4 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                        qVar5 = qVar;
                        r18.K(fVar4);
                        objQ12 = fVar4;
                    } else {
                        ev2.f fVar5 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                        qVar5 = qVar;
                        r18.K(fVar5);
                        objQ12 = fVar5;
                    }
                    p3.l0.a(qVar5, (l) objQ12, r18);
                    final l x0Var5 = b2Var4.f108412v;
                    if (i14 == 1) {
                        z48 = true;
                    } else {
                        z48 = z45;
                    }
                    final int i310 = qVar5.f188936e;
                    z49 = true;
                    e23.q qVar15 = new e23.q() { // from class: l2.y2
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            m mVar7 = (m) obj5;
                            ((Integer) obj6).getClass();
                            mVar7.C(851809892);
                            x1 x1Var7 = n.f135158a;
                            Object objQ23 = mVar7.q();
                            m.f135153a.getClass();
                            m.a.C2565a c2565a = m.a.f135155b;
                            if (objQ23 == c2565a) {
                                objQ23 = new s2();
                                mVar7.K(objQ23);
                            }
                            s2 s2Var = (s2) objQ23;
                            Object objQ24 = mVar7.q();
                            if (objQ24 == c2565a) {
                                objQ24 = new j1();
                                mVar7.K(objQ24);
                            }
                            x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z511, z48, s2Var, c0Var7, s3Var, (j1) objQ24, null, x0Var5, i310, 512, null);
                            h4.r.a aVar9 = h4.r.S;
                            boolean zR115 = mVar7.r(x2Var);
                            Object objQ25 = mVar7.q();
                            if (zR115 || objQ25 == c2565a) {
                                objQ25 = new z2(x2Var);
                                mVar7.K(objQ25);
                            }
                            h4.r rVarB2 = z4.f.b(aVar9, (l) ((k23.g) objQ25));
                            mVar7.f();
                            return rVarB2;
                        }
                    };
                    aVar3 = k2.f91249a;
                    h4.r rVarA11 = h4.k.a(A, aVar3, qVar15);
                    x5.v.f188954b.getClass();
                    i30 = i24;
                    if (i30 == x5.v.f188961i) {
                        z54 = z45;
                    } else {
                        z54 = true;
                    }
                    boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    zH = r18.h(z54) | r18.r(b1Var2);
                    objQ13 = r18.q();
                    if (zH) {
                        objQ13 = new o(z54, b1Var2, 7);
                        r18.K(objQ13);
                    } else {
                        objQ13 = new o(z54, b1Var2, 7);
                        r18.K(objQ13);
                    }
                    h4.r rVarA12 = t2.b.a(A, zBooleanValue3, z54, (e23.a) objQ13);
                    wVar2 = (w) r18.A(e.f108446a);
                    j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                    if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                        t1Var = new o4.t1(j14, null);
                    } else {
                        t1Var = wVar2;
                    }
                    zR8 = r18.r(b2Var4) | r18.B(t1Var);
                    objQ14 = r18.q();
                    if (zR8) {
                        objQ14 = new jt1.d(23, b2Var4, t1Var);
                        r18.K(objQ14);
                    } else {
                        objQ14 = new jt1.d(23, b2Var4, t1Var);
                        r18.K(objQ14);
                    }
                    h4.r rVarF7 = l4.k.f(A, (l) objQ14);
                    x1 x1Var7 = n.f135158a;
                    h4.r rVarThen6 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF7), b1Var2, b2Var4, h2Var4).then(rVarA12).then(rVarA9), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA11);
                    f3 f3Var4 = f3Var;
                    rVarF = f5.g0.f(h4.k.a(rVarThen6, aVar3, new p9(f3Var4, z15, jVar, 8)).then(rVarA10).then(vVar3), new x0(b2Var4, 1));
                    if (g0.f167495b) {
                        rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                    }
                    if (z15) {
                        z49 = z45;
                    } else {
                        z49 = z45;
                    }
                    if (z49) {
                        p5.j0<e23.a<n4.c>> j0Var4 = j1.f167577a;
                        A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                    }
                    ?? r26 = r18;
                    b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var4, l0Var, r0Var, rVarA, rVarD3, rVarF6, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var7, cVar2), r26), r26, 384);
                    x1 x1Var8 = n.f135158a;
                    r14 = r26;
                }
                cVar2 = cVar4;
                n2Var = new n2(cVar, x0Var2, Integer.MAX_VALUE, i25, z14, i37, cVar2, bVar, j0Var, null);
                if (b2Var6.f108391a != n2Var) {
                    b2Var6.f108406p = true;
                }
                b2Var6.f108391a = n2Var;
                lVar3 = b2Var6.f108394d;
                p0Var = b2Var6.f108395e;
                lVar3.getClass();
                w0Var = l0Var.f188880c;
                boolean zG2 = s.g(w0Var, lVar3.f188875b.c());
                str = lVar3.f188874a.f188878a.f157138b;
                cVar3 = l0Var.f188878a;
                if (s.g(str, cVar3.f157138b)) {
                    lVar3.f188875b = new x5.m(cVar3, j17, (p005kotlin.jvm.internal.j) null);
                    z18 = true;
                } else {
                    if (w0.d(lVar3.f188874a.f188879b, j17)) {
                        lVar3.f188875b.h(w0.h(j17), w0.g(j17));
                        z18 = false;
                        z19 = true;
                    } else {
                        z18 = false;
                    }
                    if (w0Var == null) {
                        x5.m mVar7 = lVar3.f188875b;
                        mVar7.f188884d = -1;
                        mVar7.f188885e = -1;
                    } else {
                        j8 = w0Var.f157317a;
                        if (!w0.e(j8)) {
                            lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                        }
                    }
                    if (z18) {
                        x5.m mVar8 = lVar3.f188875b;
                        mVar8.f188884d = -1;
                        mVar8.f188885e = -1;
                        l0VarB = l0.b(l0Var, null, 0L, 3);
                    } else {
                        x5.m mVar9 = lVar3.f188875b;
                        mVar9.f188884d = -1;
                        mVar9.f188885e = -1;
                        l0VarB = l0.b(l0Var, null, 0L, 3);
                    }
                    l0Var2 = lVar3.f188874a;
                    lVar3.f188874a = l0VarB;
                    if (p0Var != null) {
                        p0Var.f188929b.c(l0Var2, l0VarB);
                    }
                    objQ = r110.q();
                    if (objQ == obj3) {
                        objQ = new s3(0, 1, null);
                        ?? r116 = r110;
                        r116.K(objQ);
                        r17 = r116;
                    } else {
                        r17 = r110;
                    }
                    s3Var = (s3) objQ;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (s3Var.f108789f) {
                        s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                        s3Var.a(l0Var);
                    } else {
                        l14 = s3Var.f108788e;
                        if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                            s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                            s3Var.a(l0Var);
                        }
                    }
                    objQ2 = r17.q();
                    if (objQ2 == obj3) {
                        objQ2 = p3.l0.j(t13.h.f161748a, r17);
                        r17.K(objQ2);
                    }
                    b0Var = (b0) objQ2;
                    objQ3 = r17.q();
                    if (objQ3 == obj3) {
                        objQ3 = new i2.c();
                        r17.K(objQ3);
                    }
                    aVar = (i2.a) objQ3;
                    objQ4 = r17.q();
                    if (objQ4 == obj3) {
                        objQ4 = new h2(s3Var);
                        r17.K(objQ4);
                    }
                    h2Var = (h2) objQ4;
                    h2Var.f201605b = c0Var4;
                    h2Var.f201609f = r0Var;
                    h2Var.f201606c = b2Var6.f108412v;
                    h2Var.f201607d = b2Var6;
                    h2Var.f201608e.setValue(l0Var);
                    h2Var.f201627x = w0.a(j17);
                    h2Var.f201611h = (o1) r17.A(t1.f91488f);
                    h2Var.f201612i = b0Var;
                    h2Var.f201614k = (q3) r17.A(t1.f91500r);
                    h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
                    b0Var2 = b0Var5;
                    h2Var.f201616m = b0Var2;
                    final boolean z515 = !z16;
                    h2Var.f201617n.setValue(Boolean.valueOf(z515));
                    h2Var.f201618o.setValue(Boolean.valueOf(z15));
                    if (g0.f167496c) {
                        r17.C(1966756105);
                        h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                        z24 = false;
                    } else {
                        z24 = false;
                        r17.C(1951015297);
                    }
                    r17.g0(z24);
                    b2Var6.b();
                    A = h4.r.S;
                    boolean zR115 = r17.r(b2Var6);
                    i26 = i35 & 7168;
                    if (i26 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z516 = z25 | zR115;
                    i27 = i35 & 57344;
                    if (i27 == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z517 = z26 | z516;
                    m0Var = m0Var3;
                    boolean zR116 = z517 | r17.r(m0Var);
                    if (i36 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    i28 = (i35 & 112) ^ 48;
                    zR = zR116 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
                    Object objQ23 = r17.q();
                    if (zR) {
                        ?? r117 = r17;
                        i29 = i27;
                        b2Var = b2Var6;
                        obj = new l() { // from class: l2.w0
                            /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                i3 i3VarD;
                                m4.g0 g0Var = (m4.g0) obj4;
                                b2 b2Var10 = b2Var;
                                if (b2Var10.b() == g0Var.a()) {
                                    return Unit.INSTANCE;
                                }
                                b2Var10.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                                boolean zB7 = b2Var10.b();
                                l0 l0Var4 = l0Var;
                                x5.c0 c0Var8 = c0Var4;
                                if (zB7 && z15 && !z16) {
                                    t2.a aVar9 = t2.f108797a;
                                    x5.l lVar6 = b2Var10.f108394d;
                                    x0 x0Var6 = b2Var10.f108412v;
                                    x0 x0Var7 = b2Var10.f108413w;
                                    aVar9.getClass();
                                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                    k kVar = new k(lVar6, 14, x0Var6, r0Var2);
                                    m0 m0Var10 = m0Var;
                                    x5.g0 g0Var2 = m0Var10.f188886a;
                                    g0Var2.g(l0Var4, qVar, kVar, x0Var7);
                                    ?? p0Var2 = new p0(m0Var10, g0Var2);
                                    m0Var10.f188887b.set((p0) p0Var2);
                                    r0Var2.f105810a = p0Var2;
                                    b2Var10.f108395e = p0Var2;
                                    h1.f(b2Var10, l0Var4, c0Var8);
                                } else {
                                    h1.e(b2Var10);
                                }
                                if (g0Var.a() && (i3VarD = b2Var10.d()) != null) {
                                    b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var10, i3VarD, c0Var8, null), 3);
                                }
                                if (!g0Var.a()) {
                                    h2Var.m(null);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        aVar2 = aVar;
                        b0Var3 = b0Var;
                        c0Var = c0Var4;
                        l0Var3 = l0Var;
                        h2Var2 = h2Var;
                        z28 = z15;
                        m0Var = m0Var;
                        qVar4 = qVar;
                        r117.K(obj);
                        r18 = r117;
                    } else {
                        ?? r118 = r17;
                        i29 = i27;
                        b2Var = b2Var6;
                        obj = new l() { // from class: l2.w0
                            /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                i3 i3VarD;
                                m4.g0 g0Var = (m4.g0) obj4;
                                b2 b2Var10 = b2Var;
                                if (b2Var10.b() == g0Var.a()) {
                                    return Unit.INSTANCE;
                                }
                                b2Var10.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                                boolean zB7 = b2Var10.b();
                                l0 l0Var4 = l0Var;
                                x5.c0 c0Var8 = c0Var4;
                                if (zB7 && z15 && !z16) {
                                    t2.a aVar9 = t2.f108797a;
                                    x5.l lVar6 = b2Var10.f108394d;
                                    x0 x0Var6 = b2Var10.f108412v;
                                    x0 x0Var7 = b2Var10.f108413w;
                                    aVar9.getClass();
                                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                    k kVar = new k(lVar6, 14, x0Var6, r0Var2);
                                    m0 m0Var10 = m0Var;
                                    x5.g0 g0Var2 = m0Var10.f188886a;
                                    g0Var2.g(l0Var4, qVar, kVar, x0Var7);
                                    ?? p0Var2 = new p0(m0Var10, g0Var2);
                                    m0Var10.f188887b.set((p0) p0Var2);
                                    r0Var2.f105810a = p0Var2;
                                    b2Var10.f108395e = p0Var2;
                                    h1.f(b2Var10, l0Var4, c0Var8);
                                } else {
                                    h1.e(b2Var10);
                                }
                                if (g0Var.a() && (i3VarD = b2Var10.d()) != null) {
                                    b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var10, i3VarD, c0Var8, null), 3);
                                }
                                if (!g0Var.a()) {
                                    h2Var.m(null);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        aVar2 = aVar;
                        b0Var3 = b0Var;
                        c0Var = c0Var4;
                        l0Var3 = l0Var;
                        h2Var2 = h2Var;
                        z28 = z15;
                        m0Var = m0Var;
                        qVar4 = qVar;
                        r118.K(obj);
                        r18 = r118;
                    }
                    h4.r rVarA13 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
                    if (z28) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
                    unit = Unit.INSTANCE;
                    boolean zB7 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
                    if (i28 > 32) {
                        b2Var2 = b2Var;
                        if ((i35 & 48) != 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                    } else {
                        b2Var2 = b2Var;
                        if ((i35 & 48) != 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                    }
                    z35 = zB7 | z34;
                    objQ5 = r18.q();
                    if (z35) {
                        m0 m0Var10 = m0Var;
                        h2 h2Var16 = h2Var2;
                        q qVar16 = qVar4;
                        h2Var3 = h2Var16;
                        unit2 = unit;
                        obj2 = obj3;
                        b2Var3 = b2Var2;
                        b1Var = new b1(b2Var3, p1VarQ, m0Var10, h2Var3, qVar16, null);
                        p1Var = p1VarQ;
                        m0Var = m0Var10;
                        r18.K(b1Var);
                    } else if (objQ5 == obj3) {
                        obj3 = obj3;
                        m0 m0Var11 = m0Var;
                        h2 h2Var17 = h2Var2;
                        q qVar17 = qVar4;
                        h2Var3 = h2Var17;
                        unit2 = unit;
                        obj2 = obj3;
                        b2Var3 = b2Var2;
                        b1Var = new b1(b2Var3, p1VarQ, m0Var11, h2Var3, qVar17, null);
                        p1Var = p1VarQ;
                        m0Var = m0Var11;
                        r18.K(b1Var);
                    } else {
                        p1Var = p1VarQ;
                        h2Var3 = h2Var2;
                        unit2 = unit;
                        obj2 = obj3;
                        b1Var = objQ5;
                        b2Var3 = b2Var2;
                    }
                    p3.l0.e((e23.p) b1Var, unit2, r18);
                    zR2 = r18.r(b2Var3);
                    objQ6 = r18.q();
                    if (zR2) {
                        objQ6 = new x0(b2Var3, 0);
                        r18.K(objQ6);
                    } else {
                        objQ6 = new x0(b2Var3, 0);
                        r18.K(objQ6);
                    }
                    rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                    boolean zR117 = r18.r(b2Var3);
                    if (i29 == 16384) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z518 = zR117 | z36;
                    if (i26 == 2048) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zR3 = z518 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                    objQ7 = r18.q();
                    if (zR3) {
                        h2 h2Var18 = h2Var3;
                        c0Var2 = c0Var;
                        y0 y0Var6 = new y0(b2Var3, b0Var2, z16, z15, h2Var18, c0Var2);
                        h2Var3 = h2Var18;
                        r18.K(y0Var6);
                        objQ7 = y0Var6;
                    } else {
                        h2 h2Var19 = h2Var3;
                        c0Var2 = c0Var;
                        y0 y0Var7 = new y0(b2Var3, b0Var2, z16, z15, h2Var19, c0Var2);
                        h2Var3 = h2Var19;
                        r18.K(y0Var7);
                        objQ7 = y0Var7;
                    }
                    lVar4 = (l) objQ7;
                    if (z15) {
                        rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                    }
                    h2.a aVar9 = h2Var3.B;
                    h2.b bVar7 = h2Var3.A;
                    zR4 = r18.r(h2Var3);
                    objQ8 = r18.q();
                    if (zR4) {
                        objQ8 = new g1(h2Var3);
                        r18.K(objQ8);
                    } else {
                        objQ8 = new g1(h2Var3);
                        r18.K(objQ8);
                    }
                    h4.r rVarThen7 = rVarB.then(new b5.r0(aVar9, bVar7, null, (PointerInputEventHandler) objQ8, 4, null));
                    b5.w.f15928a.getClass();
                    h4.r rVarA14 = b5.t0.a(rVarThen7, b5.w.a.f15931c);
                    boolean zR118 = r18.r(b2Var3);
                    if (i36 == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    zR5 = zR118 | z38 | r18.r(c0Var2);
                    objQ9 = r18.q();
                    if (zR5) {
                        objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                        r18.K(objQ9);
                    } else {
                        objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                        r18.K(objQ9);
                    }
                    h4.r rVarD4 = l4.k.d(A, (l) objQ9);
                    boolean zR119 = r18.r(b2Var3);
                    if (i26 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z67 = zR119 | z39;
                    h4Var2 = h4Var;
                    boolean zB8 = z67 | r18.B(h4Var2) | r18.r(h2Var3);
                    if (i36 == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    zR6 = zB8 | z44 | r18.r(c0Var2);
                    objQ10 = r18.q();
                    if (zR6) {
                        ds.e eVar6 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                        h4Var3 = h4Var2;
                        r18.K(eVar6);
                        objQ10 = eVar6;
                    } else {
                        ds.e eVar7 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                        h4Var3 = h4Var2;
                        r18.K(eVar7);
                        objQ10 = eVar7;
                    }
                    h4.r rVarF8 = f5.g0.f(A, (l) objQ10);
                    final x5.c0 c0Var8 = c0Var2;
                    b2 b2Var10 = b2Var3;
                    b0Var4 = b0Var3;
                    m0Var2 = m0Var;
                    h2Var4 = h2Var3;
                    v vVar4 = new v(q0Var, l0Var, b2Var10, z16, z15, r0Var instanceof e0, c0Var8, h2Var4, qVar, b0Var2);
                    b2Var4 = b2Var10;
                    if (!z15) {
                        rVarA = A;
                    } else {
                        rVarA = A;
                    }
                    zR7 = r18.r(h2Var4);
                    objQ11 = r18.q();
                    if (zR7) {
                        z45 = false;
                        objQ11 = new a1(h2Var4, 0);
                        r18.K(objQ11);
                    } else {
                        z45 = false;
                        objQ11 = new a1(h2Var4, 0);
                        r18.K(objQ11);
                    }
                    p3.l0.a(h2Var4, (l) objQ11, r18);
                    boolean zR1110 = r18.r(b2Var4) | r18.r(m0Var2);
                    if (i36 == 4) {
                        z46 = true;
                    } else {
                        z46 = z45;
                    }
                    z47 = zR1110 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                    objQ12 = r18.q();
                    if (z47) {
                        ev2.f fVar6 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                        qVar5 = qVar;
                        r18.K(fVar6);
                        objQ12 = fVar6;
                    } else {
                        ev2.f fVar7 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                        qVar5 = qVar;
                        r18.K(fVar7);
                        objQ12 = fVar7;
                    }
                    p3.l0.a(qVar5, (l) objQ12, r18);
                    final l x0Var6 = b2Var4.f108412v;
                    if (i14 == 1) {
                        z48 = true;
                    } else {
                        z48 = z45;
                    }
                    final int i311 = qVar5.f188936e;
                    z49 = true;
                    e23.q qVar18 = new e23.q() { // from class: l2.y2
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            m mVar10 = (m) obj5;
                            ((Integer) obj6).getClass();
                            mVar10.C(851809892);
                            x1 x1Var9 = n.f135158a;
                            Object objQ24 = mVar10.q();
                            m.f135153a.getClass();
                            m.a.C2565a c2565a = m.a.f135155b;
                            if (objQ24 == c2565a) {
                                objQ24 = new s2();
                                mVar10.K(objQ24);
                            }
                            s2 s2Var = (s2) objQ24;
                            Object objQ25 = mVar10.q();
                            if (objQ25 == c2565a) {
                                objQ25 = new j1();
                                mVar10.K(objQ25);
                            }
                            x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z515, z48, s2Var, c0Var8, s3Var, (j1) objQ25, null, x0Var6, i311, 512, null);
                            h4.r.a aVar10 = h4.r.S;
                            boolean zR1111 = mVar10.r(x2Var);
                            Object objQ26 = mVar10.q();
                            if (zR1111 || objQ26 == c2565a) {
                                objQ26 = new z2(x2Var);
                                mVar10.K(objQ26);
                            }
                            h4.r rVarB2 = z4.f.b(aVar10, (l) ((k23.g) objQ26));
                            mVar10.f();
                            return rVarB2;
                        }
                    };
                    aVar3 = k2.f91249a;
                    h4.r rVarA15 = h4.k.a(A, aVar3, qVar18);
                    x5.v.f188954b.getClass();
                    i30 = i24;
                    if (i30 == x5.v.f188961i) {
                        z54 = z45;
                    } else {
                        z54 = true;
                    }
                    boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    zH = r18.h(z54) | r18.r(b1Var2);
                    objQ13 = r18.q();
                    if (zH) {
                        objQ13 = new o(z54, b1Var2, 7);
                        r18.K(objQ13);
                    } else {
                        objQ13 = new o(z54, b1Var2, 7);
                        r18.K(objQ13);
                    }
                    h4.r rVarA16 = t2.b.a(A, zBooleanValue4, z54, (e23.a) objQ13);
                    wVar2 = (w) r18.A(e.f108446a);
                    j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                    if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                        t1Var = new o4.t1(j14, null);
                    } else {
                        t1Var = wVar2;
                    }
                    zR8 = r18.r(b2Var4) | r18.B(t1Var);
                    objQ14 = r18.q();
                    if (zR8) {
                        objQ14 = new jt1.d(23, b2Var4, t1Var);
                        r18.K(objQ14);
                    } else {
                        objQ14 = new jt1.d(23, b2Var4, t1Var);
                        r18.K(objQ14);
                    }
                    h4.r rVarF9 = l4.k.f(A, (l) objQ14);
                    x1 x1Var9 = n.f135158a;
                    h4.r rVarThen8 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF9), b1Var2, b2Var4, h2Var4).then(rVarA16).then(rVarA13), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA15);
                    f3 f3Var5 = f3Var;
                    rVarF = f5.g0.f(h4.k.a(rVarThen8, aVar3, new p9(f3Var5, z15, jVar, 8)).then(rVarA14).then(vVar4), new x0(b2Var4, 1));
                    if (g0.f167495b) {
                        rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                    }
                    if (z15) {
                        z49 = z45;
                    } else {
                        z49 = z45;
                    }
                    if (z49) {
                        p5.j0<e23.a<n4.c>> j0Var5 = j1.f167577a;
                        A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                    }
                    ?? r27 = r18;
                    b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var5, l0Var, r0Var, rVarA, rVarD4, rVarF8, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var8, cVar2), r27), r27, 384);
                    x1 x1Var10 = n.f135158a;
                    r14 = r27;
                }
                z19 = false;
                if (w0Var == null) {
                    x5.m mVar10 = lVar3.f188875b;
                    mVar10.f188884d = -1;
                    mVar10.f188885e = -1;
                } else {
                    j8 = w0Var.f157317a;
                    if (!w0.e(j8)) {
                        lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                    }
                }
                if (z18) {
                    x5.m mVar11 = lVar3.f188875b;
                    mVar11.f188884d = -1;
                    mVar11.f188885e = -1;
                    l0VarB = l0.b(l0Var, null, 0L, 3);
                } else {
                    x5.m mVar12 = lVar3.f188875b;
                    mVar12.f188884d = -1;
                    mVar12.f188885e = -1;
                    l0VarB = l0.b(l0Var, null, 0L, 3);
                }
                l0Var2 = lVar3.f188874a;
                lVar3.f188874a = l0VarB;
                if (p0Var != null) {
                    p0Var.f188929b.c(l0Var2, l0VarB);
                }
                objQ = r110.q();
                if (objQ == obj3) {
                    objQ = new s3(0, 1, null);
                    ?? r119 = r110;
                    r119.K(objQ);
                    r17 = r119;
                } else {
                    r17 = r110;
                }
                s3Var = (s3) objQ;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (s3Var.f108789f) {
                    s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                    s3Var.a(l0Var);
                } else {
                    l14 = s3Var.f108788e;
                    if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                        s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                        s3Var.a(l0Var);
                    }
                }
                objQ2 = r17.q();
                if (objQ2 == obj3) {
                    objQ2 = p3.l0.j(t13.h.f161748a, r17);
                    r17.K(objQ2);
                }
                b0Var = (b0) objQ2;
                objQ3 = r17.q();
                if (objQ3 == obj3) {
                    objQ3 = new i2.c();
                    r17.K(objQ3);
                }
                aVar = (i2.a) objQ3;
                objQ4 = r17.q();
                if (objQ4 == obj3) {
                    objQ4 = new h2(s3Var);
                    r17.K(objQ4);
                }
                h2Var = (h2) objQ4;
                h2Var.f201605b = c0Var4;
                h2Var.f201609f = r0Var;
                h2Var.f201606c = b2Var6.f108412v;
                h2Var.f201607d = b2Var6;
                h2Var.f201608e.setValue(l0Var);
                h2Var.f201627x = w0.a(j17);
                h2Var.f201611h = (o1) r17.A(t1.f91488f);
                h2Var.f201612i = b0Var;
                h2Var.f201614k = (q3) r17.A(t1.f91500r);
                h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
                b0Var2 = b0Var5;
                h2Var.f201616m = b0Var2;
                final boolean z519 = !z16;
                h2Var.f201617n.setValue(Boolean.valueOf(z519));
                h2Var.f201618o.setValue(Boolean.valueOf(z15));
                if (g0.f167496c) {
                    r17.C(1966756105);
                    h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                    z24 = false;
                } else {
                    z24 = false;
                    r17.C(1951015297);
                }
                r17.g0(z24);
                b2Var6.b();
                A = h4.r.S;
                boolean zR1111 = r17.r(b2Var6);
                i26 = i35 & 7168;
                if (i26 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z5110 = z25 | zR1111;
                i27 = i35 & 57344;
                if (i27 == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z5111 = z26 | z5110;
                m0Var = m0Var3;
                boolean zR1112 = z5111 | r17.r(m0Var);
                if (i36 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                i28 = (i35 & 112) ^ 48;
                zR = zR1112 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
                Object objQ24 = r17.q();
                if (zR) {
                    ?? r1110 = r17;
                    i29 = i27;
                    b2Var = b2Var6;
                    obj = new l() { // from class: l2.w0
                        /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            i3 i3VarD;
                            m4.g0 g0Var = (m4.g0) obj4;
                            b2 b2Var11 = b2Var;
                            if (b2Var11.b() == g0Var.a()) {
                                return Unit.INSTANCE;
                            }
                            b2Var11.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                            boolean zB9 = b2Var11.b();
                            l0 l0Var4 = l0Var;
                            x5.c0 c0Var9 = c0Var4;
                            if (zB9 && z15 && !z16) {
                                t2.a aVar10 = t2.f108797a;
                                x5.l lVar6 = b2Var11.f108394d;
                                x0 x0Var7 = b2Var11.f108412v;
                                x0 x0Var8 = b2Var11.f108413w;
                                aVar10.getClass();
                                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                k kVar = new k(lVar6, 14, x0Var7, r0Var2);
                                m0 m0Var12 = m0Var;
                                x5.g0 g0Var2 = m0Var12.f188886a;
                                g0Var2.g(l0Var4, qVar, kVar, x0Var8);
                                ?? p0Var2 = new p0(m0Var12, g0Var2);
                                m0Var12.f188887b.set((p0) p0Var2);
                                r0Var2.f105810a = p0Var2;
                                b2Var11.f108395e = p0Var2;
                                h1.f(b2Var11, l0Var4, c0Var9);
                            } else {
                                h1.e(b2Var11);
                            }
                            if (g0Var.a() && (i3VarD = b2Var11.d()) != null) {
                                b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var11, i3VarD, c0Var9, null), 3);
                            }
                            if (!g0Var.a()) {
                                h2Var.m(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    aVar2 = aVar;
                    b0Var3 = b0Var;
                    c0Var = c0Var4;
                    l0Var3 = l0Var;
                    h2Var2 = h2Var;
                    z28 = z15;
                    m0Var = m0Var;
                    qVar4 = qVar;
                    r1110.K(obj);
                    r18 = r1110;
                } else {
                    ?? r1111 = r17;
                    i29 = i27;
                    b2Var = b2Var6;
                    obj = new l() { // from class: l2.w0
                        /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            i3 i3VarD;
                            m4.g0 g0Var = (m4.g0) obj4;
                            b2 b2Var11 = b2Var;
                            if (b2Var11.b() == g0Var.a()) {
                                return Unit.INSTANCE;
                            }
                            b2Var11.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                            boolean zB9 = b2Var11.b();
                            l0 l0Var4 = l0Var;
                            x5.c0 c0Var9 = c0Var4;
                            if (zB9 && z15 && !z16) {
                                t2.a aVar10 = t2.f108797a;
                                x5.l lVar6 = b2Var11.f108394d;
                                x0 x0Var7 = b2Var11.f108412v;
                                x0 x0Var8 = b2Var11.f108413w;
                                aVar10.getClass();
                                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                k kVar = new k(lVar6, 14, x0Var7, r0Var2);
                                m0 m0Var12 = m0Var;
                                x5.g0 g0Var2 = m0Var12.f188886a;
                                g0Var2.g(l0Var4, qVar, kVar, x0Var8);
                                ?? p0Var2 = new p0(m0Var12, g0Var2);
                                m0Var12.f188887b.set((p0) p0Var2);
                                r0Var2.f105810a = p0Var2;
                                b2Var11.f108395e = p0Var2;
                                h1.f(b2Var11, l0Var4, c0Var9);
                            } else {
                                h1.e(b2Var11);
                            }
                            if (g0Var.a() && (i3VarD = b2Var11.d()) != null) {
                                b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var11, i3VarD, c0Var9, null), 3);
                            }
                            if (!g0Var.a()) {
                                h2Var.m(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    aVar2 = aVar;
                    b0Var3 = b0Var;
                    c0Var = c0Var4;
                    l0Var3 = l0Var;
                    h2Var2 = h2Var;
                    z28 = z15;
                    m0Var = m0Var;
                    qVar4 = qVar;
                    r1111.K(obj);
                    r18 = r1111;
                }
                h4.r rVarA17 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
                if (z28) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
                unit = Unit.INSTANCE;
                boolean zB9 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
                if (i28 > 32) {
                    b2Var2 = b2Var;
                    if ((i35 & 48) != 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                } else {
                    b2Var2 = b2Var;
                    if ((i35 & 48) != 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                }
                z35 = zB9 | z34;
                objQ5 = r18.q();
                if (z35) {
                    m0 m0Var12 = m0Var;
                    h2 h2Var110 = h2Var2;
                    q qVar19 = qVar4;
                    h2Var3 = h2Var110;
                    unit2 = unit;
                    obj2 = obj3;
                    b2Var3 = b2Var2;
                    b1Var = new b1(b2Var3, p1VarQ, m0Var12, h2Var3, qVar19, null);
                    p1Var = p1VarQ;
                    m0Var = m0Var12;
                    r18.K(b1Var);
                } else if (objQ5 == obj3) {
                    obj3 = obj3;
                    m0 m0Var13 = m0Var;
                    h2 h2Var111 = h2Var2;
                    q qVar110 = qVar4;
                    h2Var3 = h2Var111;
                    unit2 = unit;
                    obj2 = obj3;
                    b2Var3 = b2Var2;
                    b1Var = new b1(b2Var3, p1VarQ, m0Var13, h2Var3, qVar110, null);
                    p1Var = p1VarQ;
                    m0Var = m0Var13;
                    r18.K(b1Var);
                } else {
                    p1Var = p1VarQ;
                    h2Var3 = h2Var2;
                    unit2 = unit;
                    obj2 = obj3;
                    b1Var = objQ5;
                    b2Var3 = b2Var2;
                }
                p3.l0.e((e23.p) b1Var, unit2, r18);
                zR2 = r18.r(b2Var3);
                objQ6 = r18.q();
                if (zR2) {
                    objQ6 = new x0(b2Var3, 0);
                    r18.K(objQ6);
                } else {
                    objQ6 = new x0(b2Var3, 0);
                    r18.K(objQ6);
                }
                rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                boolean zR1113 = r18.r(b2Var3);
                if (i29 == 16384) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z5112 = zR1113 | z36;
                if (i26 == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zR3 = z5112 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                objQ7 = r18.q();
                if (zR3) {
                    h2 h2Var112 = h2Var3;
                    c0Var2 = c0Var;
                    y0 y0Var8 = new y0(b2Var3, b0Var2, z16, z15, h2Var112, c0Var2);
                    h2Var3 = h2Var112;
                    r18.K(y0Var8);
                    objQ7 = y0Var8;
                } else {
                    h2 h2Var113 = h2Var3;
                    c0Var2 = c0Var;
                    y0 y0Var9 = new y0(b2Var3, b0Var2, z16, z15, h2Var113, c0Var2);
                    h2Var3 = h2Var113;
                    r18.K(y0Var9);
                    objQ7 = y0Var9;
                }
                lVar4 = (l) objQ7;
                if (z15) {
                    rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                }
                h2.a aVar10 = h2Var3.B;
                h2.b bVar8 = h2Var3.A;
                zR4 = r18.r(h2Var3);
                objQ8 = r18.q();
                if (zR4) {
                    objQ8 = new g1(h2Var3);
                    r18.K(objQ8);
                } else {
                    objQ8 = new g1(h2Var3);
                    r18.K(objQ8);
                }
                h4.r rVarThen9 = rVarB.then(new b5.r0(aVar10, bVar8, null, (PointerInputEventHandler) objQ8, 4, null));
                b5.w.f15928a.getClass();
                h4.r rVarA18 = b5.t0.a(rVarThen9, b5.w.a.f15931c);
                boolean zR1114 = r18.r(b2Var3);
                if (i36 == 4) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                zR5 = zR1114 | z38 | r18.r(c0Var2);
                objQ9 = r18.q();
                if (zR5) {
                    objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                    r18.K(objQ9);
                } else {
                    objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                    r18.K(objQ9);
                }
                h4.r rVarD5 = l4.k.d(A, (l) objQ9);
                boolean zR1115 = r18.r(b2Var3);
                if (i26 == 2048) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                boolean z68 = zR1115 | z39;
                h4Var2 = h4Var;
                boolean zB10 = z68 | r18.B(h4Var2) | r18.r(h2Var3);
                if (i36 == 4) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                zR6 = zB10 | z44 | r18.r(c0Var2);
                objQ10 = r18.q();
                if (zR6) {
                    ds.e eVar8 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                    h4Var3 = h4Var2;
                    r18.K(eVar8);
                    objQ10 = eVar8;
                } else {
                    ds.e eVar9 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                    h4Var3 = h4Var2;
                    r18.K(eVar9);
                    objQ10 = eVar9;
                }
                h4.r rVarF10 = f5.g0.f(A, (l) objQ10);
                final x5.c0 c0Var9 = c0Var2;
                b2 b2Var11 = b2Var3;
                b0Var4 = b0Var3;
                m0Var2 = m0Var;
                h2Var4 = h2Var3;
                v vVar5 = new v(q0Var, l0Var, b2Var11, z16, z15, r0Var instanceof e0, c0Var9, h2Var4, qVar, b0Var2);
                b2Var4 = b2Var11;
                if (!z15) {
                    rVarA = A;
                } else {
                    rVarA = A;
                }
                zR7 = r18.r(h2Var4);
                objQ11 = r18.q();
                if (zR7) {
                    z45 = false;
                    objQ11 = new a1(h2Var4, 0);
                    r18.K(objQ11);
                } else {
                    z45 = false;
                    objQ11 = new a1(h2Var4, 0);
                    r18.K(objQ11);
                }
                p3.l0.a(h2Var4, (l) objQ11, r18);
                boolean zR1116 = r18.r(b2Var4) | r18.r(m0Var2);
                if (i36 == 4) {
                    z46 = true;
                } else {
                    z46 = z45;
                }
                z47 = zR1116 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                objQ12 = r18.q();
                if (z47) {
                    ev2.f fVar8 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                    qVar5 = qVar;
                    r18.K(fVar8);
                    objQ12 = fVar8;
                } else {
                    ev2.f fVar9 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                    qVar5 = qVar;
                    r18.K(fVar9);
                    objQ12 = fVar9;
                }
                p3.l0.a(qVar5, (l) objQ12, r18);
                final l x0Var7 = b2Var4.f108412v;
                if (i14 == 1) {
                    z48 = true;
                } else {
                    z48 = z45;
                }
                final int i312 = qVar5.f188936e;
                z49 = true;
                e23.q qVar111 = new e23.q() { // from class: l2.y2
                    @Override // e23.q
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        m mVar13 = (m) obj5;
                        ((Integer) obj6).getClass();
                        mVar13.C(851809892);
                        x1 x1Var11 = n.f135158a;
                        Object objQ25 = mVar13.q();
                        m.f135153a.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ25 == c2565a) {
                            objQ25 = new s2();
                            mVar13.K(objQ25);
                        }
                        s2 s2Var = (s2) objQ25;
                        Object objQ26 = mVar13.q();
                        if (objQ26 == c2565a) {
                            objQ26 = new j1();
                            mVar13.K(objQ26);
                        }
                        x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z519, z48, s2Var, c0Var9, s3Var, (j1) objQ26, null, x0Var7, i312, 512, null);
                        h4.r.a aVar11 = h4.r.S;
                        boolean zR1117 = mVar13.r(x2Var);
                        Object objQ27 = mVar13.q();
                        if (zR1117 || objQ27 == c2565a) {
                            objQ27 = new z2(x2Var);
                            mVar13.K(objQ27);
                        }
                        h4.r rVarB2 = z4.f.b(aVar11, (l) ((k23.g) objQ27));
                        mVar13.f();
                        return rVarB2;
                    }
                };
                aVar3 = k2.f91249a;
                h4.r rVarA19 = h4.k.a(A, aVar3, qVar111);
                x5.v.f188954b.getClass();
                i30 = i24;
                if (i30 == x5.v.f188961i) {
                    z54 = z45;
                } else {
                    z54 = true;
                }
                boolean zBooleanValue5 = ((Boolean) p1Var.getF182175a()).booleanValue();
                zH = r18.h(z54) | r18.r(b1Var2);
                objQ13 = r18.q();
                if (zH) {
                    objQ13 = new o(z54, b1Var2, 7);
                    r18.K(objQ13);
                } else {
                    objQ13 = new o(z54, b1Var2, 7);
                    r18.K(objQ13);
                }
                h4.r rVarA110 = t2.b.a(A, zBooleanValue5, z54, (e23.a) objQ13);
                wVar2 = (w) r18.A(e.f108446a);
                j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                    t1Var = new o4.t1(j14, null);
                } else {
                    t1Var = wVar2;
                }
                zR8 = r18.r(b2Var4) | r18.B(t1Var);
                objQ14 = r18.q();
                if (zR8) {
                    objQ14 = new jt1.d(23, b2Var4, t1Var);
                    r18.K(objQ14);
                } else {
                    objQ14 = new jt1.d(23, b2Var4, t1Var);
                    r18.K(objQ14);
                }
                h4.r rVarF11 = l4.k.f(A, (l) objQ14);
                x1 x1Var11 = n.f135158a;
                h4.r rVarThen10 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF11), b1Var2, b2Var4, h2Var4).then(rVarA110).then(rVarA17), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA19);
                f3 f3Var6 = f3Var;
                rVarF = f5.g0.f(h4.k.a(rVarThen10, aVar3, new p9(f3Var6, z15, jVar, 8)).then(rVarA18).then(vVar5), new x0(b2Var4, 1));
                if (g0.f167495b) {
                    rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                }
                if (z15) {
                    z49 = z45;
                } else {
                    z49 = z45;
                }
                if (z49) {
                    p5.j0<e23.a<n4.c>> j0Var6 = j1.f167577a;
                    A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                }
                ?? r28 = r18;
                b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var6, l0Var, r0Var, rVarA, rVarD5, rVarF10, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var9, cVar2), r28), r28, 384);
                x1 x1Var12 = n.f135158a;
                r14 = r28;
            } else {
                qVar3 = qVar6;
            }
            i25 = 1;
            cVar2 = cVar4;
            n2Var = new n2(cVar, x0Var2, Integer.MAX_VALUE, i25, z14, i37, cVar2, bVar, j0Var, null);
            if (b2Var6.f108391a != n2Var) {
                b2Var6.f108406p = true;
            }
            b2Var6.f108391a = n2Var;
            lVar3 = b2Var6.f108394d;
            p0Var = b2Var6.f108395e;
            lVar3.getClass();
            w0Var = l0Var.f188880c;
            boolean zG3 = s.g(w0Var, lVar3.f188875b.c());
            str = lVar3.f188874a.f188878a.f157138b;
            cVar3 = l0Var.f188878a;
            if (s.g(str, cVar3.f157138b)) {
                lVar3.f188875b = new x5.m(cVar3, j17, (p005kotlin.jvm.internal.j) null);
                z18 = true;
            } else {
                if (w0.d(lVar3.f188874a.f188879b, j17)) {
                    lVar3.f188875b.h(w0.h(j17), w0.g(j17));
                    z18 = false;
                    z19 = true;
                } else {
                    z18 = false;
                }
                if (w0Var == null) {
                    x5.m mVar13 = lVar3.f188875b;
                    mVar13.f188884d = -1;
                    mVar13.f188885e = -1;
                } else {
                    j8 = w0Var.f157317a;
                    if (!w0.e(j8)) {
                        lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                    }
                }
                if (z18) {
                    x5.m mVar14 = lVar3.f188875b;
                    mVar14.f188884d = -1;
                    mVar14.f188885e = -1;
                    l0VarB = l0.b(l0Var, null, 0L, 3);
                } else {
                    x5.m mVar15 = lVar3.f188875b;
                    mVar15.f188884d = -1;
                    mVar15.f188885e = -1;
                    l0VarB = l0.b(l0Var, null, 0L, 3);
                }
                l0Var2 = lVar3.f188874a;
                lVar3.f188874a = l0VarB;
                if (p0Var != null) {
                    p0Var.f188929b.c(l0Var2, l0VarB);
                }
                objQ = r110.q();
                if (objQ == obj3) {
                    objQ = new s3(0, 1, null);
                    ?? r1112 = r110;
                    r1112.K(objQ);
                    r17 = r1112;
                } else {
                    r17 = r110;
                }
                s3Var = (s3) objQ;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (s3Var.f108789f) {
                    s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                    s3Var.a(l0Var);
                } else {
                    l14 = s3Var.f108788e;
                    if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                        s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                        s3Var.a(l0Var);
                    }
                }
                objQ2 = r17.q();
                if (objQ2 == obj3) {
                    objQ2 = p3.l0.j(t13.h.f161748a, r17);
                    r17.K(objQ2);
                }
                b0Var = (b0) objQ2;
                objQ3 = r17.q();
                if (objQ3 == obj3) {
                    objQ3 = new i2.c();
                    r17.K(objQ3);
                }
                aVar = (i2.a) objQ3;
                objQ4 = r17.q();
                if (objQ4 == obj3) {
                    objQ4 = new h2(s3Var);
                    r17.K(objQ4);
                }
                h2Var = (h2) objQ4;
                h2Var.f201605b = c0Var4;
                h2Var.f201609f = r0Var;
                h2Var.f201606c = b2Var6.f108412v;
                h2Var.f201607d = b2Var6;
                h2Var.f201608e.setValue(l0Var);
                h2Var.f201627x = w0.a(j17);
                h2Var.f201611h = (o1) r17.A(t1.f91488f);
                h2Var.f201612i = b0Var;
                h2Var.f201614k = (q3) r17.A(t1.f91500r);
                h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
                b0Var2 = b0Var5;
                h2Var.f201616m = b0Var2;
                final boolean z5113 = !z16;
                h2Var.f201617n.setValue(Boolean.valueOf(z5113));
                h2Var.f201618o.setValue(Boolean.valueOf(z15));
                if (g0.f167496c) {
                    r17.C(1966756105);
                    h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                    z24 = false;
                } else {
                    z24 = false;
                    r17.C(1951015297);
                }
                r17.g0(z24);
                b2Var6.b();
                A = h4.r.S;
                boolean zR1117 = r17.r(b2Var6);
                i26 = i35 & 7168;
                if (i26 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z5114 = z25 | zR1117;
                i27 = i35 & 57344;
                if (i27 == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z5115 = z26 | z5114;
                m0Var = m0Var3;
                boolean zR1118 = z5115 | r17.r(m0Var);
                if (i36 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                i28 = (i35 & 112) ^ 48;
                zR = zR1118 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
                Object objQ25 = r17.q();
                if (zR) {
                    ?? r1113 = r17;
                    i29 = i27;
                    b2Var = b2Var6;
                    obj = new l() { // from class: l2.w0
                        /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            i3 i3VarD;
                            m4.g0 g0Var = (m4.g0) obj4;
                            b2 b2Var12 = b2Var;
                            if (b2Var12.b() == g0Var.a()) {
                                return Unit.INSTANCE;
                            }
                            b2Var12.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                            boolean zB11 = b2Var12.b();
                            l0 l0Var4 = l0Var;
                            x5.c0 c0Var10 = c0Var4;
                            if (zB11 && z15 && !z16) {
                                t2.a aVar11 = t2.f108797a;
                                x5.l lVar6 = b2Var12.f108394d;
                                x0 x0Var8 = b2Var12.f108412v;
                                x0 x0Var9 = b2Var12.f108413w;
                                aVar11.getClass();
                                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                k kVar = new k(lVar6, 14, x0Var8, r0Var2);
                                m0 m0Var14 = m0Var;
                                x5.g0 g0Var2 = m0Var14.f188886a;
                                g0Var2.g(l0Var4, qVar, kVar, x0Var9);
                                ?? p0Var2 = new p0(m0Var14, g0Var2);
                                m0Var14.f188887b.set((p0) p0Var2);
                                r0Var2.f105810a = p0Var2;
                                b2Var12.f108395e = p0Var2;
                                h1.f(b2Var12, l0Var4, c0Var10);
                            } else {
                                h1.e(b2Var12);
                            }
                            if (g0Var.a() && (i3VarD = b2Var12.d()) != null) {
                                b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var12, i3VarD, c0Var10, null), 3);
                            }
                            if (!g0Var.a()) {
                                h2Var.m(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    aVar2 = aVar;
                    b0Var3 = b0Var;
                    c0Var = c0Var4;
                    l0Var3 = l0Var;
                    h2Var2 = h2Var;
                    z28 = z15;
                    m0Var = m0Var;
                    qVar4 = qVar;
                    r1113.K(obj);
                    r18 = r1113;
                } else {
                    ?? r1114 = r17;
                    i29 = i27;
                    b2Var = b2Var6;
                    obj = new l() { // from class: l2.w0
                        /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            i3 i3VarD;
                            m4.g0 g0Var = (m4.g0) obj4;
                            b2 b2Var12 = b2Var;
                            if (b2Var12.b() == g0Var.a()) {
                                return Unit.INSTANCE;
                            }
                            b2Var12.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                            boolean zB11 = b2Var12.b();
                            l0 l0Var4 = l0Var;
                            x5.c0 c0Var10 = c0Var4;
                            if (zB11 && z15 && !z16) {
                                t2.a aVar11 = t2.f108797a;
                                x5.l lVar6 = b2Var12.f108394d;
                                x0 x0Var8 = b2Var12.f108412v;
                                x0 x0Var9 = b2Var12.f108413w;
                                aVar11.getClass();
                                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                                k kVar = new k(lVar6, 14, x0Var8, r0Var2);
                                m0 m0Var14 = m0Var;
                                x5.g0 g0Var2 = m0Var14.f188886a;
                                g0Var2.g(l0Var4, qVar, kVar, x0Var9);
                                ?? p0Var2 = new p0(m0Var14, g0Var2);
                                m0Var14.f188887b.set((p0) p0Var2);
                                r0Var2.f105810a = p0Var2;
                                b2Var12.f108395e = p0Var2;
                                h1.f(b2Var12, l0Var4, c0Var10);
                            } else {
                                h1.e(b2Var12);
                            }
                            if (g0Var.a() && (i3VarD = b2Var12.d()) != null) {
                                b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var12, i3VarD, c0Var10, null), 3);
                            }
                            if (!g0Var.a()) {
                                h2Var.m(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    aVar2 = aVar;
                    b0Var3 = b0Var;
                    c0Var = c0Var4;
                    l0Var3 = l0Var;
                    h2Var2 = h2Var;
                    z28 = z15;
                    m0Var = m0Var;
                    qVar4 = qVar;
                    r1114.K(obj);
                    r18 = r1114;
                }
                h4.r rVarA111 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
                if (z28) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
                unit = Unit.INSTANCE;
                boolean zB11 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
                if (i28 > 32) {
                    b2Var2 = b2Var;
                    if ((i35 & 48) != 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                } else {
                    b2Var2 = b2Var;
                    if ((i35 & 48) != 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                }
                z35 = zB11 | z34;
                objQ5 = r18.q();
                if (z35) {
                    m0 m0Var14 = m0Var;
                    h2 h2Var114 = h2Var2;
                    q qVar112 = qVar4;
                    h2Var3 = h2Var114;
                    unit2 = unit;
                    obj2 = obj3;
                    b2Var3 = b2Var2;
                    b1Var = new b1(b2Var3, p1VarQ, m0Var14, h2Var3, qVar112, null);
                    p1Var = p1VarQ;
                    m0Var = m0Var14;
                    r18.K(b1Var);
                } else if (objQ5 == obj3) {
                    obj3 = obj3;
                    m0 m0Var15 = m0Var;
                    h2 h2Var115 = h2Var2;
                    q qVar113 = qVar4;
                    h2Var3 = h2Var115;
                    unit2 = unit;
                    obj2 = obj3;
                    b2Var3 = b2Var2;
                    b1Var = new b1(b2Var3, p1VarQ, m0Var15, h2Var3, qVar113, null);
                    p1Var = p1VarQ;
                    m0Var = m0Var15;
                    r18.K(b1Var);
                } else {
                    p1Var = p1VarQ;
                    h2Var3 = h2Var2;
                    unit2 = unit;
                    obj2 = obj3;
                    b1Var = objQ5;
                    b2Var3 = b2Var2;
                }
                p3.l0.e((e23.p) b1Var, unit2, r18);
                zR2 = r18.r(b2Var3);
                objQ6 = r18.q();
                if (zR2) {
                    objQ6 = new x0(b2Var3, 0);
                    r18.K(objQ6);
                } else {
                    objQ6 = new x0(b2Var3, 0);
                    r18.K(objQ6);
                }
                rVarB = s0.b(A, 8675309, new t0((l) objQ6));
                boolean zR1119 = r18.r(b2Var3);
                if (i29 == 16384) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z5116 = zR1119 | z36;
                if (i26 == 2048) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zR3 = z5116 | z37 | r18.r(c0Var) | r18.r(h2Var3);
                objQ7 = r18.q();
                if (zR3) {
                    h2 h2Var116 = h2Var3;
                    c0Var2 = c0Var;
                    y0 y0Var10 = new y0(b2Var3, b0Var2, z16, z15, h2Var116, c0Var2);
                    h2Var3 = h2Var116;
                    r18.K(y0Var10);
                    objQ7 = y0Var10;
                } else {
                    h2 h2Var117 = h2Var3;
                    c0Var2 = c0Var;
                    y0 y0Var11 = new y0(b2Var3, b0Var2, z16, z15, h2Var117, c0Var2);
                    h2Var3 = h2Var117;
                    r18.K(y0Var11);
                    objQ7 = y0Var11;
                }
                lVar4 = (l) objQ7;
                if (z15) {
                    rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
                }
                h2.a aVar11 = h2Var3.B;
                h2.b bVar9 = h2Var3.A;
                zR4 = r18.r(h2Var3);
                objQ8 = r18.q();
                if (zR4) {
                    objQ8 = new g1(h2Var3);
                    r18.K(objQ8);
                } else {
                    objQ8 = new g1(h2Var3);
                    r18.K(objQ8);
                }
                h4.r rVarThen11 = rVarB.then(new b5.r0(aVar11, bVar9, null, (PointerInputEventHandler) objQ8, 4, null));
                b5.w.f15928a.getClass();
                h4.r rVarA112 = b5.t0.a(rVarThen11, b5.w.a.f15931c);
                boolean zR11110 = r18.r(b2Var3);
                if (i36 == 4) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                zR5 = zR11110 | z38 | r18.r(c0Var2);
                objQ9 = r18.q();
                if (zR5) {
                    objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                    r18.K(objQ9);
                } else {
                    objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                    r18.K(objQ9);
                }
                h4.r rVarD6 = l4.k.d(A, (l) objQ9);
                boolean zR11111 = r18.r(b2Var3);
                if (i26 == 2048) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                boolean z69 = zR11111 | z39;
                h4Var2 = h4Var;
                boolean zB12 = z69 | r18.B(h4Var2) | r18.r(h2Var3);
                if (i36 == 4) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                zR6 = zB12 | z44 | r18.r(c0Var2);
                objQ10 = r18.q();
                if (zR6) {
                    ds.e eVar10 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                    h4Var3 = h4Var2;
                    r18.K(eVar10);
                    objQ10 = eVar10;
                } else {
                    ds.e eVar11 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                    h4Var3 = h4Var2;
                    r18.K(eVar11);
                    objQ10 = eVar11;
                }
                h4.r rVarF12 = f5.g0.f(A, (l) objQ10);
                final x5.c0 c0Var10 = c0Var2;
                b2 b2Var12 = b2Var3;
                b0Var4 = b0Var3;
                m0Var2 = m0Var;
                h2Var4 = h2Var3;
                v vVar6 = new v(q0Var, l0Var, b2Var12, z16, z15, r0Var instanceof e0, c0Var10, h2Var4, qVar, b0Var2);
                b2Var4 = b2Var12;
                if (!z15) {
                    rVarA = A;
                } else {
                    rVarA = A;
                }
                zR7 = r18.r(h2Var4);
                objQ11 = r18.q();
                if (zR7) {
                    z45 = false;
                    objQ11 = new a1(h2Var4, 0);
                    r18.K(objQ11);
                } else {
                    z45 = false;
                    objQ11 = new a1(h2Var4, 0);
                    r18.K(objQ11);
                }
                p3.l0.a(h2Var4, (l) objQ11, r18);
                boolean zR11112 = r18.r(b2Var4) | r18.r(m0Var2);
                if (i36 == 4) {
                    z46 = true;
                } else {
                    z46 = z45;
                }
                z47 = zR11112 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
                objQ12 = r18.q();
                if (z47) {
                    ev2.f fVar10 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                    qVar5 = qVar;
                    r18.K(fVar10);
                    objQ12 = fVar10;
                } else {
                    ev2.f fVar11 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                    qVar5 = qVar;
                    r18.K(fVar11);
                    objQ12 = fVar11;
                }
                p3.l0.a(qVar5, (l) objQ12, r18);
                final l x0Var8 = b2Var4.f108412v;
                if (i14 == 1) {
                    z48 = true;
                } else {
                    z48 = z45;
                }
                final int i313 = qVar5.f188936e;
                z49 = true;
                e23.q qVar114 = new e23.q() { // from class: l2.y2
                    @Override // e23.q
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        m mVar16 = (m) obj5;
                        ((Integer) obj6).getClass();
                        mVar16.C(851809892);
                        x1 x1Var13 = n.f135158a;
                        Object objQ26 = mVar16.q();
                        m.f135153a.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ26 == c2565a) {
                            objQ26 = new s2();
                            mVar16.K(objQ26);
                        }
                        s2 s2Var = (s2) objQ26;
                        Object objQ27 = mVar16.q();
                        if (objQ27 == c2565a) {
                            objQ27 = new j1();
                            mVar16.K(objQ27);
                        }
                        x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z5113, z48, s2Var, c0Var10, s3Var, (j1) objQ27, null, x0Var8, i313, 512, null);
                        h4.r.a aVar12 = h4.r.S;
                        boolean zR11113 = mVar16.r(x2Var);
                        Object objQ28 = mVar16.q();
                        if (zR11113 || objQ28 == c2565a) {
                            objQ28 = new z2(x2Var);
                            mVar16.K(objQ28);
                        }
                        h4.r rVarB2 = z4.f.b(aVar12, (l) ((k23.g) objQ28));
                        mVar16.f();
                        return rVarB2;
                    }
                };
                aVar3 = k2.f91249a;
                h4.r rVarA113 = h4.k.a(A, aVar3, qVar114);
                x5.v.f188954b.getClass();
                i30 = i24;
                if (i30 == x5.v.f188961i) {
                    z54 = z45;
                } else {
                    z54 = true;
                }
                boolean zBooleanValue6 = ((Boolean) p1Var.getF182175a()).booleanValue();
                zH = r18.h(z54) | r18.r(b1Var2);
                objQ13 = r18.q();
                if (zH) {
                    objQ13 = new o(z54, b1Var2, 7);
                    r18.K(objQ13);
                } else {
                    objQ13 = new o(z54, b1Var2, 7);
                    r18.K(objQ13);
                }
                h4.r rVarA114 = t2.b.a(A, zBooleanValue6, z54, (e23.a) objQ13);
                wVar2 = (w) r18.A(e.f108446a);
                j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
                if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                    t1Var = new o4.t1(j14, null);
                } else {
                    t1Var = wVar2;
                }
                zR8 = r18.r(b2Var4) | r18.B(t1Var);
                objQ14 = r18.q();
                if (zR8) {
                    objQ14 = new jt1.d(23, b2Var4, t1Var);
                    r18.K(objQ14);
                } else {
                    objQ14 = new jt1.d(23, b2Var4, t1Var);
                    r18.K(objQ14);
                }
                h4.r rVarF13 = l4.k.f(A, (l) objQ14);
                x1 x1Var13 = n.f135158a;
                h4.r rVarThen12 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF13), b1Var2, b2Var4, h2Var4).then(rVarA114).then(rVarA111), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA113);
                f3 f3Var7 = f3Var;
                rVarF = f5.g0.f(h4.k.a(rVarThen12, aVar3, new p9(f3Var7, z15, jVar, 8)).then(rVarA112).then(vVar6), new x0(b2Var4, 1));
                if (g0.f167495b) {
                    rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
                }
                if (z15) {
                    z49 = z45;
                } else {
                    z49 = z45;
                }
                if (z49) {
                    p5.j0<e23.a<n4.c>> j0Var7 = j1.f167577a;
                    A = h4.k.a(A, aVar3, new t(h2Var4, 17));
                }
                ?? r29 = r18;
                b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var7, l0Var, r0Var, rVarA, rVarD6, rVarF12, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var10, cVar2), r29), r29, 384);
                x1 x1Var14 = n.f135158a;
                r14 = r29;
            }
            z19 = false;
            if (w0Var == null) {
                x5.m mVar16 = lVar3.f188875b;
                mVar16.f188884d = -1;
                mVar16.f188885e = -1;
            } else {
                j8 = w0Var.f157317a;
                if (!w0.e(j8)) {
                    lVar3.f188875b.g(w0.h(j8), w0.g(j8));
                }
            }
            if (z18) {
                x5.m mVar17 = lVar3.f188875b;
                mVar17.f188884d = -1;
                mVar17.f188885e = -1;
                l0VarB = l0.b(l0Var, null, 0L, 3);
            } else {
                x5.m mVar18 = lVar3.f188875b;
                mVar18.f188884d = -1;
                mVar18.f188885e = -1;
                l0VarB = l0.b(l0Var, null, 0L, 3);
            }
            l0Var2 = lVar3.f188874a;
            lVar3.f188874a = l0VarB;
            if (p0Var != null) {
                p0Var.f188929b.c(l0Var2, l0VarB);
            }
            objQ = r110.q();
            if (objQ == obj3) {
                objQ = new s3(0, 1, null);
                ?? r1115 = r110;
                r1115.K(objQ);
                r17 = r1115;
            } else {
                r17 = r110;
            }
            s3Var = (s3) objQ;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (s3Var.f108789f) {
                s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                s3Var.a(l0Var);
            } else {
                l14 = s3Var.f108788e;
                if (jCurrentTimeMillis > (l14 != null ? l14.longValue() : 0L) + ((long) 5000)) {
                    s3Var.f108788e = Long.valueOf(jCurrentTimeMillis);
                    s3Var.a(l0Var);
                }
            }
            objQ2 = r17.q();
            if (objQ2 == obj3) {
                objQ2 = p3.l0.j(t13.h.f161748a, r17);
                r17.K(objQ2);
            }
            b0Var = (b0) objQ2;
            objQ3 = r17.q();
            if (objQ3 == obj3) {
                objQ3 = new i2.c();
                r17.K(objQ3);
            }
            aVar = (i2.a) objQ3;
            objQ4 = r17.q();
            if (objQ4 == obj3) {
                objQ4 = new h2(s3Var);
                r17.K(objQ4);
            }
            h2Var = (h2) objQ4;
            h2Var.f201605b = c0Var4;
            h2Var.f201609f = r0Var;
            h2Var.f201606c = b2Var6.f108412v;
            h2Var.f201607d = b2Var6;
            h2Var.f201608e.setValue(l0Var);
            h2Var.f201627x = w0.a(j17);
            h2Var.f201611h = (o1) r17.A(t1.f91488f);
            h2Var.f201612i = b0Var;
            h2Var.f201614k = (q3) r17.A(t1.f91500r);
            h2Var.f201615l = (w4.a) r17.A(t1.f91494l);
            b0Var2 = b0Var5;
            h2Var.f201616m = b0Var2;
            final boolean z5117 = !z16;
            h2Var.f201617n.setValue(Boolean.valueOf(z5117));
            h2Var.f201618o.setValue(Boolean.valueOf(z15));
            if (g0.f167496c) {
                r17.C(1966756105);
                h2Var.f201613j = x.b(a0.EditableText, x0Var.f157322a.localeList, r17, 6);
                z24 = false;
            } else {
                z24 = false;
                r17.C(1951015297);
            }
            r17.g0(z24);
            b2Var6.b();
            A = h4.r.S;
            boolean zR11113 = r17.r(b2Var6);
            i26 = i35 & 7168;
            if (i26 == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z5118 = z25 | zR11113;
            i27 = i35 & 57344;
            if (i27 == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z5119 = z26 | z5118;
            m0Var = m0Var3;
            boolean zR11114 = z5119 | r17.r(m0Var);
            if (i36 == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            i28 = (i35 & 112) ^ 48;
            zR = zR11114 | z27 | ((i28 <= 32 && r17.B(qVar)) || (i35 & 48) == 32) | r17.r(c0Var4) | r17.r(b0Var) | r17.r(aVar) | r17.r(h2Var);
            Object objQ26 = r17.q();
            if (zR) {
                ?? r1116 = r17;
                i29 = i27;
                b2Var = b2Var6;
                obj = new l() { // from class: l2.w0
                    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                    @Override // e23.l
                    public final Object invoke(Object obj4) {
                        i3 i3VarD;
                        m4.g0 g0Var = (m4.g0) obj4;
                        b2 b2Var13 = b2Var;
                        if (b2Var13.b() == g0Var.a()) {
                            return Unit.INSTANCE;
                        }
                        b2Var13.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                        boolean zB13 = b2Var13.b();
                        l0 l0Var4 = l0Var;
                        x5.c0 c0Var11 = c0Var4;
                        if (zB13 && z15 && !z16) {
                            t2.a aVar12 = t2.f108797a;
                            x5.l lVar6 = b2Var13.f108394d;
                            x0 x0Var9 = b2Var13.f108412v;
                            x0 x0Var10 = b2Var13.f108413w;
                            aVar12.getClass();
                            p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                            k kVar = new k(lVar6, 14, x0Var9, r0Var2);
                            m0 m0Var16 = m0Var;
                            x5.g0 g0Var2 = m0Var16.f188886a;
                            g0Var2.g(l0Var4, qVar, kVar, x0Var10);
                            ?? p0Var2 = new p0(m0Var16, g0Var2);
                            m0Var16.f188887b.set((p0) p0Var2);
                            r0Var2.f105810a = p0Var2;
                            b2Var13.f108395e = p0Var2;
                            h1.f(b2Var13, l0Var4, c0Var11);
                        } else {
                            h1.e(b2Var13);
                        }
                        if (g0Var.a() && (i3VarD = b2Var13.d()) != null) {
                            b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var13, i3VarD, c0Var11, null), 3);
                        }
                        if (!g0Var.a()) {
                            h2Var.m(null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                aVar2 = aVar;
                b0Var3 = b0Var;
                c0Var = c0Var4;
                l0Var3 = l0Var;
                h2Var2 = h2Var;
                z28 = z15;
                m0Var = m0Var;
                qVar4 = qVar;
                r1116.K(obj);
                r18 = r1116;
            } else {
                ?? r1117 = r17;
                i29 = i27;
                b2Var = b2Var6;
                obj = new l() { // from class: l2.w0
                    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object, x5.p0] */
                    @Override // e23.l
                    public final Object invoke(Object obj4) {
                        i3 i3VarD;
                        m4.g0 g0Var = (m4.g0) obj4;
                        b2 b2Var13 = b2Var;
                        if (b2Var13.b() == g0Var.a()) {
                            return Unit.INSTANCE;
                        }
                        b2Var13.f108396f.setValue(Boolean.valueOf(g0Var.a()));
                        boolean zB13 = b2Var13.b();
                        l0 l0Var4 = l0Var;
                        x5.c0 c0Var11 = c0Var4;
                        if (zB13 && z15 && !z16) {
                            t2.a aVar12 = t2.f108797a;
                            x5.l lVar6 = b2Var13.f108394d;
                            x0 x0Var9 = b2Var13.f108412v;
                            x0 x0Var10 = b2Var13.f108413w;
                            aVar12.getClass();
                            p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                            k kVar = new k(lVar6, 14, x0Var9, r0Var2);
                            m0 m0Var16 = m0Var;
                            x5.g0 g0Var2 = m0Var16.f188886a;
                            g0Var2.g(l0Var4, qVar, kVar, x0Var10);
                            ?? p0Var2 = new p0(m0Var16, g0Var2);
                            m0Var16.f188887b.set((p0) p0Var2);
                            r0Var2.f105810a = p0Var2;
                            b2Var13.f108395e = p0Var2;
                            h1.f(b2Var13, l0Var4, c0Var11);
                        } else {
                            h1.e(b2Var13);
                        }
                        if (g0Var.a() && (i3VarD = b2Var13.d()) != null) {
                            b.T(b0Var, null, null, new d1(aVar, l0Var4, b2Var13, i3VarD, c0Var11, null), 3);
                        }
                        if (!g0Var.a()) {
                            h2Var.m(null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                aVar2 = aVar;
                b0Var3 = b0Var;
                c0Var = c0Var4;
                l0Var3 = l0Var;
                h2Var2 = h2Var;
                z28 = z15;
                m0Var = m0Var;
                qVar4 = qVar;
                r1117.K(obj);
                r18 = r1117;
            }
            h4.r rVarA115 = u1.m0.a(m4.e.b(m4.e.a(A, b0Var2), (l) obj), z28, jVar);
            if (z28) {
                z29 = false;
            } else {
                z29 = false;
            }
            p1VarQ = p3.p0.q(Boolean.valueOf(z29), r18);
            unit = Unit.INSTANCE;
            boolean zB13 = r18.B(p1VarQ) | r18.r(b2Var) | r18.r(m0Var) | r18.r(h2Var2);
            if (i28 > 32) {
                b2Var2 = b2Var;
                if ((i35 & 48) != 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
            } else {
                b2Var2 = b2Var;
                if ((i35 & 48) != 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
            }
            z35 = zB13 | z34;
            objQ5 = r18.q();
            if (z35) {
                m0 m0Var16 = m0Var;
                h2 h2Var118 = h2Var2;
                q qVar115 = qVar4;
                h2Var3 = h2Var118;
                unit2 = unit;
                obj2 = obj3;
                b2Var3 = b2Var2;
                b1Var = new b1(b2Var3, p1VarQ, m0Var16, h2Var3, qVar115, null);
                p1Var = p1VarQ;
                m0Var = m0Var16;
                r18.K(b1Var);
            } else if (objQ5 == obj3) {
                obj3 = obj3;
                m0 m0Var17 = m0Var;
                h2 h2Var119 = h2Var2;
                q qVar116 = qVar4;
                h2Var3 = h2Var119;
                unit2 = unit;
                obj2 = obj3;
                b2Var3 = b2Var2;
                b1Var = new b1(b2Var3, p1VarQ, m0Var17, h2Var3, qVar116, null);
                p1Var = p1VarQ;
                m0Var = m0Var17;
                r18.K(b1Var);
            } else {
                p1Var = p1VarQ;
                h2Var3 = h2Var2;
                unit2 = unit;
                obj2 = obj3;
                b1Var = objQ5;
                b2Var3 = b2Var2;
            }
            p3.l0.e((e23.p) b1Var, unit2, r18);
            zR2 = r18.r(b2Var3);
            objQ6 = r18.q();
            if (zR2) {
                objQ6 = new x0(b2Var3, 0);
                r18.K(objQ6);
            } else {
                objQ6 = new x0(b2Var3, 0);
                r18.K(objQ6);
            }
            rVarB = s0.b(A, 8675309, new t0((l) objQ6));
            boolean zR11115 = r18.r(b2Var3);
            if (i29 == 16384) {
                z36 = true;
            } else {
                z36 = false;
            }
            boolean z51110 = zR11115 | z36;
            if (i26 == 2048) {
                z37 = true;
            } else {
                z37 = false;
            }
            zR3 = z51110 | z37 | r18.r(c0Var) | r18.r(h2Var3);
            objQ7 = r18.q();
            if (zR3) {
                h2 h2Var1110 = h2Var3;
                c0Var2 = c0Var;
                y0 y0Var12 = new y0(b2Var3, b0Var2, z16, z15, h2Var1110, c0Var2);
                h2Var3 = h2Var1110;
                r18.K(y0Var12);
                objQ7 = y0Var12;
            } else {
                h2 h2Var1111 = h2Var3;
                c0Var2 = c0Var;
                y0 y0Var13 = new y0(b2Var3, b0Var2, z16, z15, h2Var1111, c0Var2);
                h2Var3 = h2Var1111;
                r18.K(y0Var13);
                objQ7 = y0Var13;
            }
            lVar4 = (l) objQ7;
            if (z15) {
                rVarB = h4.k.a(rVarB, k2.f91249a, new hv0.d(21, lVar4, jVar));
            }
            h2.a aVar12 = h2Var3.B;
            h2.b bVar10 = h2Var3.A;
            zR4 = r18.r(h2Var3);
            objQ8 = r18.q();
            if (zR4) {
                objQ8 = new g1(h2Var3);
                r18.K(objQ8);
            } else {
                objQ8 = new g1(h2Var3);
                r18.K(objQ8);
            }
            h4.r rVarThen13 = rVarB.then(new b5.r0(aVar12, bVar10, null, (PointerInputEventHandler) objQ8, 4, null));
            b5.w.f15928a.getClass();
            h4.r rVarA116 = b5.t0.a(rVarThen13, b5.w.a.f15931c);
            boolean zR11116 = r18.r(b2Var3);
            if (i36 == 4) {
                z38 = true;
            } else {
                z38 = false;
            }
            zR5 = zR11116 | z38 | r18.r(c0Var2);
            objQ9 = r18.q();
            if (zR5) {
                objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                r18.K(objQ9);
            } else {
                objQ9 = new k(b2Var3, 12, l0Var3, c0Var2);
                r18.K(objQ9);
            }
            h4.r rVarD7 = l4.k.d(A, (l) objQ9);
            boolean zR11117 = r18.r(b2Var3);
            if (i26 == 2048) {
                z39 = true;
            } else {
                z39 = false;
            }
            boolean z610 = zR11117 | z39;
            h4Var2 = h4Var;
            boolean zB14 = z610 | r18.B(h4Var2) | r18.r(h2Var3);
            if (i36 == 4) {
                z44 = true;
            } else {
                z44 = false;
            }
            zR6 = zB14 | z44 | r18.r(c0Var2);
            objQ10 = r18.q();
            if (zR6) {
                ds.e eVar12 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                h4Var3 = h4Var2;
                r18.K(eVar12);
                objQ10 = eVar12;
            } else {
                ds.e eVar13 = new ds.e(b2Var3, z15, h4Var2, h2Var3, l0Var, c0Var2, 4);
                h4Var3 = h4Var2;
                r18.K(eVar13);
                objQ10 = eVar13;
            }
            h4.r rVarF14 = f5.g0.f(A, (l) objQ10);
            final x5.c0 c0Var11 = c0Var2;
            b2 b2Var13 = b2Var3;
            b0Var4 = b0Var3;
            m0Var2 = m0Var;
            h2Var4 = h2Var3;
            v vVar7 = new v(q0Var, l0Var, b2Var13, z16, z15, r0Var instanceof e0, c0Var11, h2Var4, qVar, b0Var2);
            b2Var4 = b2Var13;
            if (!z15) {
                rVarA = A;
            } else {
                rVarA = A;
            }
            zR7 = r18.r(h2Var4);
            objQ11 = r18.q();
            if (zR7) {
                z45 = false;
                objQ11 = new a1(h2Var4, 0);
                r18.K(objQ11);
            } else {
                z45 = false;
                objQ11 = new a1(h2Var4, 0);
                r18.K(objQ11);
            }
            p3.l0.a(h2Var4, (l) objQ11, r18);
            boolean zR11118 = r18.r(b2Var4) | r18.r(m0Var2);
            if (i36 == 4) {
                z46 = true;
            } else {
                z46 = z45;
            }
            z47 = zR11118 | z46 | (((i28 > 32 || !r18.B(qVar)) && (i35 & 48) != 32) ? z45 : true);
            objQ12 = r18.q();
            if (z47) {
                ev2.f fVar12 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                qVar5 = qVar;
                r18.K(fVar12);
                objQ12 = fVar12;
            } else {
                ev2.f fVar13 = new ev2.f(b2Var4, m0Var2, l0Var, qVar, 22);
                qVar5 = qVar;
                r18.K(fVar13);
                objQ12 = fVar13;
            }
            p3.l0.a(qVar5, (l) objQ12, r18);
            final l x0Var9 = b2Var4.f108412v;
            if (i14 == 1) {
                z48 = true;
            } else {
                z48 = z45;
            }
            final int i314 = qVar5.f188936e;
            z49 = true;
            e23.q qVar117 = new e23.q() { // from class: l2.y2
                @Override // e23.q
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    m mVar19 = (m) obj5;
                    ((Integer) obj6).getClass();
                    mVar19.C(851809892);
                    x1 x1Var15 = n.f135158a;
                    Object objQ27 = mVar19.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ27 == c2565a) {
                        objQ27 = new s2();
                        mVar19.K(objQ27);
                    }
                    s2 s2Var = (s2) objQ27;
                    Object objQ28 = mVar19.q();
                    if (objQ28 == c2565a) {
                        objQ28 = new j1();
                        mVar19.K(objQ28);
                    }
                    x2 x2Var = new x2(b2Var4, h2Var4, l0Var, z5117, z48, s2Var, c0Var11, s3Var, (j1) objQ28, null, x0Var9, i314, 512, null);
                    h4.r.a aVar13 = h4.r.S;
                    boolean zR11119 = mVar19.r(x2Var);
                    Object objQ29 = mVar19.q();
                    if (zR11119 || objQ29 == c2565a) {
                        objQ29 = new z2(x2Var);
                        mVar19.K(objQ29);
                    }
                    h4.r rVarB2 = z4.f.b(aVar13, (l) ((k23.g) objQ29));
                    mVar19.f();
                    return rVarB2;
                }
            };
            aVar3 = k2.f91249a;
            h4.r rVarA117 = h4.k.a(A, aVar3, qVar117);
            x5.v.f188954b.getClass();
            i30 = i24;
            if (i30 == x5.v.f188961i) {
                z54 = z45;
            } else {
                z54 = true;
            }
            boolean zBooleanValue7 = ((Boolean) p1Var.getF182175a()).booleanValue();
            zH = r18.h(z54) | r18.r(b1Var2);
            objQ13 = r18.q();
            if (zH) {
                objQ13 = new o(z54, b1Var2, 7);
                r18.K(objQ13);
            } else {
                objQ13 = new o(z54, b1Var2, 7);
                r18.K(objQ13);
            }
            h4.r rVarA118 = t2.b.a(A, zBooleanValue7, z54, (e23.a) objQ13);
            wVar2 = (w) r18.A(e.f108446a);
            j14 = ((o4.d0) r18.A(e.f108447b)).f128833a;
            if (o4.d0.d(j14, o4.f0.b(1308617531))) {
                t1Var = new o4.t1(j14, null);
            } else {
                t1Var = wVar2;
            }
            zR8 = r18.r(b2Var4) | r18.B(t1Var);
            objQ14 = r18.q();
            if (zR8) {
                objQ14 = new jt1.d(23, b2Var4, t1Var);
                r18.K(objQ14);
            } else {
                objQ14 = new jt1.d(23, b2Var4, t1Var);
                r18.K(objQ14);
            }
            h4.r rVarF15 = l4.k.f(A, (l) objQ14);
            x1 x1Var15 = n.f135158a;
            h4.r rVarThen14 = z4.f.c(z4.f.c(v2.i.g(rVar.then(rVarF15), b1Var2, b2Var4, h2Var4).then(rVarA118).then(rVarA115), new v2(qVar3, b2Var4)), new i1(b2Var4, h2Var4)).then(rVarA117);
            f3 f3Var8 = f3Var;
            rVarF = f5.g0.f(h4.k.a(rVarThen14, aVar3, new p9(f3Var8, z15, jVar, 8)).then(rVarA116).then(vVar7), new x0(b2Var4, 1));
            if (g0.f167495b) {
                rVarF = r2.i.a(rVarF, new xm0.h(25, h2Var4, b0Var4));
            }
            if (z15) {
                z49 = z45;
            } else {
                z49 = z45;
            }
            if (z49) {
                p5.j0<e23.a<n4.c>> j0Var8 = j1.f167577a;
                A = h4.k.a(A, aVar3, new t(h2Var4, 17));
            }
            ?? r210 = r18;
            b(rVarF, h2Var4, z3.f.c(-814563849, new b82.j0(qVar2, b2Var4, x0Var, i15, i14, f3Var8, l0Var, r0Var, rVarA, rVarD7, rVarF14, (h4.r) A, aVar2, h2Var4, z49, z16, lVar2, c0Var11, cVar2), r210), r210, 384);
            x1 x1Var16 = n.f135158a;
            r14 = r210;
        } else {
            ?? r34 = E;
            r34.e();
            r14 = r34;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(l0Var, lVar, rVar, x0Var, r0Var, lVar2, jVar, wVar, z14, i14, i15, qVar, z1Var, z15, z16, qVar2, i16, i17);
        }
    }

    public static final void b(h4.r rVar, h2 h2Var, z3.e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(2036174316);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(h2Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            y.d(h2Var, eVar, o0VarE, (i15 >> 3) & 126);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(rVar, h2Var, eVar, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h2 h2Var, boolean z14, m mVar, int i14) {
        i3 i3VarD;
        s5.q0 q0Var;
        o0 o0VarE = mVar.E(626339208);
        int i15 = (o0VarE.r(h2Var) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(1530097388);
                b2 b2Var = h2Var.f201607d;
                s5.q0 q0Var2 = null;
                if (b2Var != null && (i3VarD = b2Var.d()) != null && (q0Var = i3VarD.f108575a) != null) {
                    b2 b2Var2 = h2Var.f201607d;
                    if (!(b2Var2 != null ? b2Var2.f108406p : true)) {
                        q0Var2 = q0Var;
                    }
                }
                if (q0Var2 == null) {
                    o0VarE.C(1530097387);
                } else {
                    o0VarE.C(1530097388);
                    if (w0.e(h2Var.u().f188879b)) {
                        o0VarE.C(2062097806);
                    } else {
                        o0VarE.C(2109807302);
                        int iB = h2Var.f201605b.b((int) (h2Var.u().f188879b >> 32));
                        int iB2 = h2Var.f201605b.b((int) (h2Var.u().f188879b & 4294967295L));
                        d6.g gVarA = q0Var2.a(iB);
                        d6.g gVarA2 = q0Var2.a(Math.max(iB2 - 1, 0));
                        b2 b2Var3 = h2Var.f201607d;
                        if (b2Var3 == null || !((Boolean) b2Var3.f108403m.getF182175a()).booleanValue()) {
                            o0VarE.C(2062097806);
                        } else {
                            o0VarE.C(2110225306);
                            m2.a(true, gVarA, h2Var, o0VarE, ((i15 << 6) & 896) | 6);
                        }
                        o0VarE.g0(false);
                        b2 b2Var4 = h2Var.f201607d;
                        if (b2Var4 == null || !((Boolean) b2Var4.f108404n.getF182175a()).booleanValue()) {
                            o0VarE.C(2062097806);
                        } else {
                            o0VarE.C(2110574459);
                            m2.a(false, gVarA2, h2Var, o0VarE, ((i15 << 6) & 896) | 6);
                        }
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    b2 b2Var5 = h2Var.f201607d;
                    if (b2Var5 != null) {
                        c2 c2Var = b2Var5.f108402l;
                        if (!s.g(h2Var.f201625v.f188878a.f157138b, h2Var.u().f188878a.f157138b)) {
                            c2Var.setValue(Boolean.FALSE);
                        }
                        if (b2Var5.b()) {
                            if (((Boolean) c2Var.getF182175a()).booleanValue()) {
                                h2Var.B();
                            } else {
                                h2Var.v();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1989076778);
                o0VarE.g0(false);
                h2Var.v();
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(h2Var, z14, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(h2 h2Var, m mVar, int i14) {
        c cVarT;
        o0 o0VarE = mVar.E(-1436003720);
        int i15 = (o0VarE.r(h2Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            b2 b2Var = h2Var.f201607d;
            if (b2Var == null || !((Boolean) b2Var.f108405o.getF182175a()).booleanValue() || (cVarT = h2Var.t()) == null || cVarT.f157138b.length() <= 0) {
                o0VarE.C(2132946858);
            } else {
                o0VarE.C(-2112351432);
                boolean zB = o0VarE.B(h2Var);
                Object objQ = o0VarE.q();
                m.a aVar = m.f135153a;
                if (zB) {
                    objQ = new d2(h2Var);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new d2(h2Var);
                        o0VarE.K(objQ);
                    }
                }
                p2 p2Var = (p2) objQ;
                g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
                x5.c0 c0Var = h2Var.f201605b;
                long j8 = h2Var.u().f188879b;
                w0.a aVar2 = w0.f157315b;
                int iB = c0Var.b((int) (j8 >> 32));
                b2 b2Var2 = h2Var.f201607d;
                i3 i3VarD = b2Var2 != null ? b2Var2.d() : null;
                i3VarD.getClass();
                s5.q0 q0Var = i3VarD.f108575a;
                n4.d dVarC = q0Var.c(j23.t.e(iB, 0, q0Var.f157280a.f157265a.f157138b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cVar.s0(r2.f108753a) / 2) + dVarC.f123547a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(dVarC.f123550d)));
                n4.c.a aVar3 = n4.c.f123541b;
                boolean zL = o0VarE.l(jFloatToRawIntBits);
                Object objQ2 = o0VarE.q();
                if (zL) {
                    objQ2 = new a(jFloatToRawIntBits);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new a(jFloatToRawIntBits);
                        o0VarE.K(objQ2);
                    }
                }
                p pVar = (p) objQ2;
                h4.r.a aVar4 = h4.r.S;
                boolean zR = o0VarE.r(p2Var) | o0VarE.r(h2Var);
                Object objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new b(p2Var, h2Var);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new b(p2Var, h2Var);
                        o0VarE.K(objQ3);
                    }
                }
                h4.r rVarB = s0.b(aVar4, p2Var, (PointerInputEventHandler) objQ3);
                boolean zL2 = o0VarE.l(jFloatToRawIntBits);
                Object objQ4 = o0VarE.q();
                if (zL2) {
                    objQ4 = new j82.d(jFloatToRawIntBits, 8);
                    o0VarE.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new j82.d(jFloatToRawIntBits, 8);
                        o0VarE.K(objQ4);
                    }
                }
                p006l2.b.a(pVar, p5.v.c((l) objQ4, rVarB, false), 0L, o0VarE, 0, 4);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kk1.h(h2Var, i14, 13);
        }
    }

    public static final void e(b2 b2Var) {
        p0 p0Var = b2Var.f108395e;
        if (p0Var != null) {
            t2.a aVar = t2.f108797a;
            x5.l lVar = b2Var.f108394d;
            x0 x0Var = b2Var.f108412v;
            aVar.getClass();
            x0Var.invoke(l0.b(lVar.f188874a, null, 0L, 3));
            m0 m0Var = p0Var.f188928a;
            AtomicReference<p0> atomicReference = m0Var.f188887b;
            while (!atomicReference.compareAndSet(p0Var, null)) {
                if (atomicReference.get() != p0Var) {
                }
            }
            m0Var.f188886a.b();
        }
        b2Var.f108395e = null;
    }

    public static final void f(b2 b2Var, l0 l0Var, x5.c0 c0Var) {
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            i3 i3VarD = b2Var.d();
            if (i3VarD == null) {
                return;
            }
            p0 p0Var = b2Var.f108395e;
            if (p0Var == null) {
                return;
            }
            f5.c0 c0VarC = b2Var.c();
            if (c0VarC == null) {
                return;
            }
            t2.a aVar = t2.f108797a;
            n2 n2Var = b2Var.f108391a;
            s5.q0 q0Var = i3VarD.f108575a;
            boolean zB = b2Var.b();
            aVar.getClass();
            t2.a.b(l0Var, n2Var, q0Var, c0VarC, p0Var, zB, c0Var);
            Unit unit = Unit.INSTANCE;
        } finally {
            f4.f.a.e(fVarA, fVarB, f68799i);
        }
    }
}
