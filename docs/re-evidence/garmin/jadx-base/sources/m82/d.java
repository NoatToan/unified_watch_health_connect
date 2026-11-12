package m82;

import am.i1;
import c2.h2;
import c2.t;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.g0;
import e23.l;
import e23.p;
import h2.j0;
import h4.k;
import h5.e0;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.u0;
import r1.v1;
import r53.s;
import z1.u;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.GalleryPagerKt$GalleryPager$10$1", f = "GalleryPager.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f117190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Unit> f117191c;

        /* JADX INFO: renamed from: m82.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2225a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Integer, Unit> f117192a;

            /* JADX WARN: Multi-variable type inference failed */
            public C2225a(l<? super Integer, Unit> lVar) {
                this.f117192a = lVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int iIntValue = ((Number) obj).intValue();
                l<Integer, Unit> lVar = this.f117192a;
                if (lVar != null) {
                    lVar.invoke(new Integer(iIntValue));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j0 j0Var, l<? super Integer, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f117190b = j0Var;
            this.f117191c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f117190b, this.f117191c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117189a;
            if (i14 == 0) {
                r.b(obj);
                r53.i iVarS = s.s(p0.s(new g0(this.f117190b, 8)));
                C2225a c2225a = new C2225a(this.f117191c);
                this.f117189a = 1;
                if (iVarS.collect(c2225a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements p<Integer, Integer, h2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f117193a = new b();

        public b() {
            super(2, d.class, "getDefaultContentPaddingValues", "getDefaultContentPaddingValues(II)Landroidx/compose/foundation/layout/PaddingValues;", 1);
        }

        @Override // e23.p
        public final h2 invoke(Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            if (iIntValue == 1) {
                return c2.l.c(0.0f, 0.0f, 3);
            }
            if (iIntValue2 == 0) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                return c2.l.e(0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
            }
            if (iIntValue2 == iIntValue - 1) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                return c2.l.e(j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            return c2.l.e(f14, 0.0f, f14, 0.0f, 10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.GalleryPagerKt$GalleryPager$9$1", f = "GalleryPager.kt", l = {130}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f117195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f117195b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f117195b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117194a;
            p1<Boolean> p1Var = this.f117195b;
            if (i14 == 0) {
                r.b(obj);
                p1Var.setValue(Boolean.TRUE);
                this.f117194a = 1;
                if (m0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            p1Var.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final void a(t tVar, boolean z14, j0 j0Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(-452451581);
        int i15 = (o0VarE.h(z14) ? 32 : 16) | i14 | (o0VarE.B(j0Var) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int iO = j0Var.o();
            String strD = androidx.core.view.j.d(j0Var.l() + 1, iO, "/");
            boolean z15 = z14 && iO > 5;
            v1 v1VarD = u0.d(s1.l.d(0, 500, null, 5), 2);
            r1.x1 x1VarE = u0.e(s1.l.d(300, 0, null, 6), 2);
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            c0.e(z15, tVar.c(aVar, h4.d.a.f81532j), v1VarD, x1VarE, null, z3.f.c(-2098399781, new j21.p(strD, 9), o0VarE), o0VarE, 200064, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(tVar, z14, j0Var, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:119:0x015a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0167  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x017e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:162:0x0200  */
    /* JADX WARN: Code duplicated, block: B:163:0x0202  */
    /* JADX WARN: Code duplicated, block: B:165:0x0206  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:171:0x0213  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0222  */
    /* JADX WARN: Code duplicated, block: B:178:0x0224  */
    /* JADX WARN: Code duplicated, block: B:180:0x0238  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c  */
    /* JADX WARN: Code duplicated, block: B:183:0x023e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0242  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:188:0x0248  */
    /* JADX WARN: Code duplicated, block: B:190:0x0257  */
    /* JADX WARN: Code duplicated, block: B:193:0x027a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:205:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:213:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:221:0x0344  */
    /* JADX WARN: Code duplicated, block: B:223:0x034b  */
    /* JADX WARN: Code duplicated, block: B:224:0x034f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0362  */
    /* JADX WARN: Code duplicated, block: B:229:0x0370  */
    /* JADX WARN: Code duplicated, block: B:232:0x0384  */
    /* JADX WARN: Code duplicated, block: B:234:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0396  */
    /* JADX WARN: Code duplicated, block: B:239:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:242:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:244:0x043a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0455  */
    /* JADX WARN: Code duplicated, block: B:248:0x045b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0474  */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    public static final void b(final h4.r rVar, final i53.c<? extends p<? super m, ? super Integer, Unit>> cVar, float f14, p<? super Integer, ? super Integer, ? extends h2> pVar, float f15, g6.f fVar, g6.f fVar2, l<? super Integer, Unit> lVar, j0 j0Var, int i14, boolean z14, u uVar, m mVar, final int i15, final int i16, final int i17) {
        int i18;
        float f16;
        int i19;
        p<? super Integer, ? super Integer, ? extends h2> pVar2;
        int i24;
        float f17;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        l<? super Integer, Unit> lVar2;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z15;
        final g6.f fVar3;
        final int i46;
        final l<? super Integer, Unit> lVar3;
        final float f18;
        final p<? super Integer, ? super Integer, ? extends h2> pVar3;
        final float f19;
        final g6.f fVar4;
        final j0 j0Var2;
        final boolean z16;
        final u uVar2;
        p2 p2VarI0;
        int i47;
        m.a aVar;
        p<? super Integer, ? super Integer, ? extends h2> pVar4;
        float f22;
        g6.f fVar5;
        g6.f fVar6;
        j0 j0VarB;
        int i48;
        boolean z17;
        int i49;
        u uVar3;
        boolean z18;
        Object objQ;
        int i54;
        Object objQ2;
        int size;
        Object objQ3;
        m.a.C2565a c2565a;
        p1 p1Var;
        boolean z19;
        boolean z24;
        Object objQ4;
        int i55;
        h2 h2VarInvoke;
        z zVarA;
        p<? super Integer, ? super Integer, ? extends h2> pVar5;
        int iHashCode;
        i2 i2VarA0;
        l<? super Integer, Unit> lVar4;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        c2.b0 b0Var;
        h4.r.a aVar3;
        h4.r rVarG;
        h2.j bVar2;
        j0 j0Var3;
        rVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(259230212);
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(cVar) ? 32 : 16;
        }
        int i56 = i17 & 4;
        if (i56 == 0) {
            if ((i15 & 384) == 0) {
                f16 = f14;
                i18 |= o0VarE.i(f16) ? 256 : 128;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i18 |= i24;
                }
                if ((i15 & 24576) == 0) {
                    if ((i17 & 16) == 0) {
                        f17 = f15;
                        int i57 = o0VarE.i(f17) ? 16384 : 8192;
                        i18 |= i57;
                    } else {
                        f17 = f15;
                    }
                    i18 |= i57;
                } else {
                    f17 = f15;
                }
                i25 = i17 & 32;
                if (i25 != 0) {
                    i18 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    if (o0VarE.B(fVar)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i18 |= i26;
                }
                i27 = i17 & 64;
                if (i27 != 0) {
                    i18 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (o0VarE.B(fVar2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i18 |= i28;
                }
                i29 = i17 & 128;
                if (i29 != 0) {
                    i18 |= 12582912;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i15 & 12582912) == 0) {
                        if (o0VarE.r(lVar2)) {
                            i30 = 8388608;
                        } else {
                            i30 = 4194304;
                        }
                        i18 |= i30;
                    }
                }
                i34 = i18;
                if ((i15 & 100663296) != 0) {
                    i34 |= ((i17 & 256) == 0 || !o0VarE.B(j0Var)) ? 33554432 : 67108864;
                }
                i35 = i17 & 512;
                if (i35 != 0) {
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.k(i14)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i34 |= i36;
                    }
                    i37 = i17 & 1024;
                    if (i37 != 0) {
                        i38 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (o0VarE.h(z14)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i16 | i39;
                    } else {
                        i38 = i16;
                    }
                    i44 = i17 & 2048;
                    if (i44 != 0) {
                        if ((i16 & 48) == 0) {
                            if (o0VarE.B(uVar)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        if ((i34 & 306783379) == 306783378 || (i38 & 19) != 18) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (o0VarE.n(i34 & 1, z15)) {
                            o0VarE.G0();
                            i47 = i15 & 1;
                            aVar = m.f135153a;
                            if (i47 != 0 || o0VarE.o0()) {
                                if (i56 != 0) {
                                    f18 = 1.7777778f;
                                } else {
                                    f18 = f16;
                                }
                                if (i19 != 0) {
                                    objQ2 = o0VarE.q();
                                    aVar.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = b.f117193a;
                                        o0VarE.K(objQ2);
                                    }
                                    pVar4 = (p) ((k23.g) objQ2);
                                } else {
                                    pVar4 = pVar2;
                                }
                                if ((i17 & 16) != 0) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f22 = j92.b.f97899b.f97916a;
                                    i34 &= -57345;
                                } else {
                                    f22 = f17;
                                }
                                if (i25 != 0) {
                                    fVar5 = null;
                                } else {
                                    fVar5 = fVar;
                                }
                                if (i27 != 0) {
                                    fVar6 = null;
                                } else {
                                    fVar6 = fVar2;
                                }
                                if (i29 != 0) {
                                    lVar2 = null;
                                }
                                if ((i17 & 256) != 0) {
                                    if ((i34 & 112) == 32) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    objQ = o0VarE.q();
                                    if (z18) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        aVar.getClass();
                                        if (objQ == m.a.f135155b) {
                                            i54 = 0;
                                            objQ = new m82.a(cVar, 0);
                                            o0VarE.K(objQ);
                                        } else {
                                            i54 = 0;
                                        }
                                    }
                                    j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                    i34 &= -234881025;
                                } else {
                                    j0VarB = j0Var;
                                }
                                if (i35 != 0) {
                                    i48 = 0;
                                } else {
                                    i48 = i14;
                                }
                                if (i37 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = z14;
                                }
                                if (i44 != 0) {
                                    i49 = 100663296;
                                    uVar3 = u.b.f200876a;
                                } else {
                                    i49 = 100663296;
                                    uVar3 = uVar;
                                }
                            } else {
                                o0VarE.e();
                                if ((i17 & 16) != 0) {
                                    i34 &= -57345;
                                }
                                if ((i17 & 256) != 0) {
                                    i34 &= -234881025;
                                }
                                fVar5 = fVar;
                                i48 = i14;
                                z17 = z14;
                                uVar3 = uVar;
                                f18 = f16;
                                pVar4 = pVar2;
                                i49 = 100663296;
                                fVar6 = fVar2;
                                f22 = f17;
                                j0VarB = j0Var;
                            }
                            o0VarE.h0();
                            x1 x1Var = n.f135158a;
                            size = cVar.size();
                            objQ3 = o0VarE.q();
                            aVar.getClass();
                            int i58 = i49;
                            c2565a = m.a.f135155b;
                            if (objQ3 == c2565a) {
                                objQ3 = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ3);
                            }
                            p1Var = (p1) objQ3;
                            if (size > 5 || !z17) {
                                z17 = z17;
                                o0VarE.C(377177374);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(376880425);
                                Integer numValueOf = Integer.valueOf(j0VarB.l());
                                Object objQ5 = o0VarE.q();
                                if (objQ5 == c2565a) {
                                    objQ5 = new c(p1Var, null);
                                    o0VarE.K(objQ5);
                                }
                                l0.e((p) objQ5, numValueOf, o0VarE);
                                o0VarE.g0(false);
                            }
                            boolean z25 = (((i34 & 234881024) ^ i58) <= 67108864 && o0VarE.B(j0VarB)) || (i34 & i58) == 67108864;
                            if ((i34 & 29360128) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = z25 | z19;
                            objQ4 = o0VarE.q();
                            if (z24 || objQ4 == c2565a) {
                                objQ4 = new a(j0VarB, lVar2, null);
                                o0VarE.K(objQ4);
                            }
                            i55 = (i34 >> 24) & 14;
                            l0.e((p) objQ4, j0VarB, o0VarE);
                            h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                            pVar5 = pVar4;
                            iHashCode = Long.hashCode(o0VarE.U);
                            i2VarA0 = o0VarE.a0();
                            lVar4 = lVar2;
                            rVarC = k.c(rVar, o0VarE);
                            h5.g.V.getClass();
                            aVar2 = h5.g.a.f81805b;
                            if (o0VarE.f135177b != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar2);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                            bVar = h5.g.a.f81813j;
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                            b0Var = c2.b0.f22601a;
                            aVar3 = h4.r.S;
                            h4.r rVarF = x2.f(aVar3, 1.0f);
                            if (fVar5 != null || (rVarG = x2.h(aVar3, fVar5.f75997a)) == null) {
                                rVarG = c2.l.g(aVar3, f18);
                            }
                            h4.r rVarThen = rVarF.then(rVarG);
                            if (fVar6 != null) {
                                bVar2 = new h2.j.b(fVar6.f75997a, null);
                            } else {
                                bVar2 = h2.j.a.f80923a;
                            }
                            j0Var3 = j0VarB;
                            h2.u.a(j0Var3, rVarThen, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                            int i59 = i48;
                            float f24 = f22;
                            u uVar4 = uVar3;
                            if (size > 1) {
                                o0VarE.C(-1968473706);
                                h4.r rVarB = b0Var.b(aVar3, h4.d.a.f81537o);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                p82.e.a(j0Var3, c2.l.C(rVarB, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-1968158188);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(true);
                            uVar2 = uVar4;
                            f19 = f24;
                            fVar3 = fVar5;
                            fVar4 = fVar6;
                            pVar3 = pVar5;
                            j0Var2 = j0Var3;
                            z16 = z17;
                            i46 = i59;
                            lVar3 = lVar4;
                        } else {
                            o0VarE.e();
                            fVar3 = fVar;
                            i46 = i14;
                            lVar3 = lVar2;
                            f18 = f16;
                            pVar3 = pVar2;
                            f19 = f17;
                            fVar4 = fVar2;
                            j0Var2 = j0Var;
                            z16 = z14;
                            uVar2 = uVar;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new p() { // from class: m82.c
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p0.t(i15 | 1);
                                    int iT2 = p0.t(i16);
                                    d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i38 |= 48;
                    if ((i34 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i34 & 1, z15)) {
                        o0VarE.G0();
                        i47 = i15 & 1;
                        aVar = m.f135153a;
                        if (i47 != 0) {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        } else {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var2 = n.f135158a;
                        size = cVar.size();
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        int i510 = i49;
                        c2565a = m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ3);
                        }
                        p1Var = (p1) objQ3;
                        if (size > 5) {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        } else {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        }
                        if (((i34 & 234881024) ^ i510) <= 67108864) {
                        }
                        if ((i34 & 29360128) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z25 | z19;
                        objQ4 = o0VarE.q();
                        if (z24) {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        }
                        i55 = (i34 >> 24) & 14;
                        l0.e((p) objQ4, j0VarB, o0VarE);
                        h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                        pVar5 = pVar4;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        lVar4 = lVar2;
                        rVarC = k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0Var = c2.b0.f22601a;
                        aVar3 = h4.r.S;
                        h4.r rVarF2 = x2.f(aVar3, 1.0f);
                        if (fVar5 != null) {
                            rVarG = c2.l.g(aVar3, f18);
                        } else {
                            rVarG = c2.l.g(aVar3, f18);
                        }
                        h4.r rVarThen2 = rVarF2.then(rVarG);
                        if (fVar6 != null) {
                            bVar2 = new h2.j.b(fVar6.f75997a, null);
                        } else {
                            bVar2 = h2.j.a.f80923a;
                        }
                        j0Var3 = j0VarB;
                        h2.u.a(j0Var3, rVarThen2, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                        int i511 = i48;
                        float f25 = f22;
                        u uVar5 = uVar3;
                        if (size > 1) {
                            o0VarE.C(-1968473706);
                            h4.r rVarB2 = b0Var.b(aVar3, h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            p82.e.a(j0Var3, c2.l.C(rVarB2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1968158188);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        uVar2 = uVar5;
                        f19 = f25;
                        fVar3 = fVar5;
                        fVar4 = fVar6;
                        pVar3 = pVar5;
                        j0Var2 = j0Var3;
                        z16 = z17;
                        i46 = i511;
                        lVar3 = lVar4;
                    } else {
                        o0VarE.e();
                        fVar3 = fVar;
                        i46 = i14;
                        lVar3 = lVar2;
                        f18 = f16;
                        pVar3 = pVar2;
                        f19 = f17;
                        fVar4 = fVar2;
                        j0Var2 = j0Var;
                        z16 = z14;
                        uVar2 = uVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p() { // from class: m82.c
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i15 | 1);
                                int iT2 = p0.t(i16);
                                d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i34 |= C.ENCODING_PCM_32BIT;
                i37 = i17 & 1024;
                if (i37 != 0) {
                    i38 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i16 | i39;
                } else {
                    i38 = i16;
                }
                i44 = i17 & 2048;
                if (i44 != 0) {
                    if ((i16 & 48) == 0) {
                        if (o0VarE.B(uVar)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i34 & 1, z15)) {
                        o0VarE.G0();
                        i47 = i15 & 1;
                        aVar = m.f135153a;
                        if (i47 != 0) {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        } else {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var3 = n.f135158a;
                        size = cVar.size();
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        int i512 = i49;
                        c2565a = m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ3);
                        }
                        p1Var = (p1) objQ3;
                        if (size > 5) {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        } else {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        }
                        if (((i34 & 234881024) ^ i512) <= 67108864) {
                        }
                        if ((i34 & 29360128) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z25 | z19;
                        objQ4 = o0VarE.q();
                        if (z24) {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        }
                        i55 = (i34 >> 24) & 14;
                        l0.e((p) objQ4, j0VarB, o0VarE);
                        h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                        pVar5 = pVar4;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        lVar4 = lVar2;
                        rVarC = k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0Var = c2.b0.f22601a;
                        aVar3 = h4.r.S;
                        h4.r rVarF3 = x2.f(aVar3, 1.0f);
                        if (fVar5 != null) {
                            rVarG = c2.l.g(aVar3, f18);
                        } else {
                            rVarG = c2.l.g(aVar3, f18);
                        }
                        h4.r rVarThen3 = rVarF3.then(rVarG);
                        if (fVar6 != null) {
                            bVar2 = new h2.j.b(fVar6.f75997a, null);
                        } else {
                            bVar2 = h2.j.a.f80923a;
                        }
                        j0Var3 = j0VarB;
                        h2.u.a(j0Var3, rVarThen3, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                        int i513 = i48;
                        float f26 = f22;
                        u uVar6 = uVar3;
                        if (size > 1) {
                            o0VarE.C(-1968473706);
                            h4.r rVarB3 = b0Var.b(aVar3, h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            p82.e.a(j0Var3, c2.l.C(rVarB3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1968158188);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        uVar2 = uVar6;
                        f19 = f26;
                        fVar3 = fVar5;
                        fVar4 = fVar6;
                        pVar3 = pVar5;
                        j0Var2 = j0Var3;
                        z16 = z17;
                        i46 = i513;
                        lVar3 = lVar4;
                    } else {
                        o0VarE.e();
                        fVar3 = fVar;
                        i46 = i14;
                        lVar3 = lVar2;
                        f18 = f16;
                        pVar3 = pVar2;
                        f19 = f17;
                        fVar4 = fVar2;
                        j0Var2 = j0Var;
                        z16 = z14;
                        uVar2 = uVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p() { // from class: m82.c
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i15 | 1);
                                int iT2 = p0.t(i16);
                                d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i38 |= 48;
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var4 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i514 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i514) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF4 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen4 = rVarF4.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen4, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i515 = i48;
                    float f27 = f22;
                    u uVar7 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB4 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar7;
                    f19 = f27;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i515;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i18 |= 3072;
            pVar2 = pVar;
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                    }
                    i18 |= i57;
                } else {
                    f17 = f15;
                }
                i18 |= i57;
            } else {
                f17 = f15;
            }
            i25 = i17 & 32;
            if (i25 != 0) {
                i18 |= 196608;
            } else if ((i15 & 196608) == 0) {
                if (o0VarE.B(fVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i18 |= i26;
            }
            i27 = i17 & 64;
            if (i27 != 0) {
                i18 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (o0VarE.B(fVar2)) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i18 |= i28;
            }
            i29 = i17 & 128;
            if (i29 != 0) {
                i18 |= 12582912;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i18 |= i30;
                }
            }
            i34 = i18;
            if ((i15 & 100663296) != 0) {
                i34 |= ((i17 & 256) == 0 || !o0VarE.B(j0Var)) ? 33554432 : 67108864;
            }
            i35 = i17 & 512;
            if (i35 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.k(i14)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i34 |= i36;
                }
                i37 = i17 & 1024;
                if (i37 != 0) {
                    i38 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i16 | i39;
                } else {
                    i38 = i16;
                }
                i44 = i17 & 2048;
                if (i44 != 0) {
                    if ((i16 & 48) == 0) {
                        if (o0VarE.B(uVar)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i34 & 1, z15)) {
                        o0VarE.G0();
                        i47 = i15 & 1;
                        aVar = m.f135153a;
                        if (i47 != 0) {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        } else {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var5 = n.f135158a;
                        size = cVar.size();
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        int i516 = i49;
                        c2565a = m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ3);
                        }
                        p1Var = (p1) objQ3;
                        if (size > 5) {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        } else {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        }
                        if (((i34 & 234881024) ^ i516) <= 67108864) {
                        }
                        if ((i34 & 29360128) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z25 | z19;
                        objQ4 = o0VarE.q();
                        if (z24) {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        }
                        i55 = (i34 >> 24) & 14;
                        l0.e((p) objQ4, j0VarB, o0VarE);
                        h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar5 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
                        pVar5 = pVar4;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        lVar4 = lVar2;
                        rVarC = k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0Var = c2.b0.f22601a;
                        aVar3 = h4.r.S;
                        h4.r rVarF5 = x2.f(aVar3, 1.0f);
                        if (fVar5 != null) {
                            rVarG = c2.l.g(aVar3, f18);
                        } else {
                            rVarG = c2.l.g(aVar3, f18);
                        }
                        h4.r rVarThen5 = rVarF5.then(rVarG);
                        if (fVar6 != null) {
                            bVar2 = new h2.j.b(fVar6.f75997a, null);
                        } else {
                            bVar2 = h2.j.a.f80923a;
                        }
                        j0Var3 = j0VarB;
                        h2.u.a(j0Var3, rVarThen5, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                        int i517 = i48;
                        float f28 = f22;
                        u uVar8 = uVar3;
                        if (size > 1) {
                            o0VarE.C(-1968473706);
                            h4.r rVarB5 = b0Var.b(aVar3, h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            p82.e.a(j0Var3, c2.l.C(rVarB5, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1968158188);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        uVar2 = uVar8;
                        f19 = f28;
                        fVar3 = fVar5;
                        fVar4 = fVar6;
                        pVar3 = pVar5;
                        j0Var2 = j0Var3;
                        z16 = z17;
                        i46 = i517;
                        lVar3 = lVar4;
                    } else {
                        o0VarE.e();
                        fVar3 = fVar;
                        i46 = i14;
                        lVar3 = lVar2;
                        f18 = f16;
                        pVar3 = pVar2;
                        f19 = f17;
                        fVar4 = fVar2;
                        j0Var2 = j0Var;
                        z16 = z14;
                        uVar2 = uVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p() { // from class: m82.c
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i15 | 1);
                                int iT2 = p0.t(i16);
                                d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i38 |= 48;
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var6 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i518 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i518) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar6 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar6, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF6 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen6 = rVarF6.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen6, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i519 = i48;
                    float f29 = f22;
                    u uVar9 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB6 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB6, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar9;
                    f19 = f29;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i519;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i34 |= C.ENCODING_PCM_32BIT;
            i37 = i17 & 1024;
            if (i37 != 0) {
                i38 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i16 | i39;
            } else {
                i38 = i16;
            }
            i44 = i17 & 2048;
            if (i44 != 0) {
                if ((i16 & 48) == 0) {
                    if (o0VarE.B(uVar)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var7 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i5110 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i5110) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar7 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar7, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF7 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen7 = rVarF7.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen7, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i5111 = i48;
                    float f210 = f22;
                    u uVar10 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB7 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB7, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar10;
                    f19 = f210;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i5111;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i38 |= 48;
            if ((i34 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i34 & 1, z15)) {
                o0VarE.G0();
                i47 = i15 & 1;
                aVar = m.f135153a;
                if (i47 != 0) {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                } else {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var8 = n.f135158a;
                size = cVar.size();
                objQ3 = o0VarE.q();
                aVar.getClass();
                int i5112 = i49;
                c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                if (size > 5) {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                } else {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                }
                if (((i34 & 234881024) ^ i5112) <= 67108864) {
                }
                if ((i34 & 29360128) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z25 | z19;
                objQ4 = o0VarE.q();
                if (z24) {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                }
                i55 = (i34 >> 24) & 14;
                l0.e((p) objQ4, j0VarB, o0VarE);
                h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                c2.j.f22691a.getClass();
                c2.j.k kVar8 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar8, h4.d.a.f81536n, o0VarE, 0);
                pVar5 = pVar4;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                lVar4 = lVar2;
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                aVar3 = h4.r.S;
                h4.r rVarF8 = x2.f(aVar3, 1.0f);
                if (fVar5 != null) {
                    rVarG = c2.l.g(aVar3, f18);
                } else {
                    rVarG = c2.l.g(aVar3, f18);
                }
                h4.r rVarThen8 = rVarF8.then(rVarG);
                if (fVar6 != null) {
                    bVar2 = new h2.j.b(fVar6.f75997a, null);
                } else {
                    bVar2 = h2.j.a.f80923a;
                }
                j0Var3 = j0VarB;
                h2.u.a(j0Var3, rVarThen8, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                int i5113 = i48;
                float f211 = f22;
                u uVar11 = uVar3;
                if (size > 1) {
                    o0VarE.C(-1968473706);
                    h4.r rVarB8 = b0Var.b(aVar3, h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p82.e.a(j0Var3, c2.l.C(rVarB8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1968158188);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                uVar2 = uVar11;
                f19 = f211;
                fVar3 = fVar5;
                fVar4 = fVar6;
                pVar3 = pVar5;
                j0Var2 = j0Var3;
                z16 = z17;
                i46 = i5113;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                fVar3 = fVar;
                i46 = i14;
                lVar3 = lVar2;
                f18 = f16;
                pVar3 = pVar2;
                f19 = f17;
                fVar4 = fVar2;
                j0Var2 = j0Var;
                z16 = z14;
                uVar2 = uVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: m82.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 384;
        f16 = f14;
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i18 |= i24;
            }
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                    }
                    i18 |= i57;
                } else {
                    f17 = f15;
                }
                i18 |= i57;
            } else {
                f17 = f15;
            }
            i25 = i17 & 32;
            if (i25 != 0) {
                i18 |= 196608;
            } else if ((i15 & 196608) == 0) {
                if (o0VarE.B(fVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i18 |= i26;
            }
            i27 = i17 & 64;
            if (i27 != 0) {
                i18 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (o0VarE.B(fVar2)) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i18 |= i28;
            }
            i29 = i17 & 128;
            if (i29 != 0) {
                i18 |= 12582912;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i30 = 8388608;
                    } else {
                        i30 = 4194304;
                    }
                    i18 |= i30;
                }
            }
            i34 = i18;
            if ((i15 & 100663296) != 0) {
                i34 |= ((i17 & 256) == 0 || !o0VarE.B(j0Var)) ? 33554432 : 67108864;
            }
            i35 = i17 & 512;
            if (i35 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.k(i14)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i34 |= i36;
                }
                i37 = i17 & 1024;
                if (i37 != 0) {
                    i38 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i16 | i39;
                } else {
                    i38 = i16;
                }
                i44 = i17 & 2048;
                if (i44 != 0) {
                    if ((i16 & 48) == 0) {
                        if (o0VarE.B(uVar)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarE.n(i34 & 1, z15)) {
                        o0VarE.G0();
                        i47 = i15 & 1;
                        aVar = m.f135153a;
                        if (i47 != 0) {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        } else {
                            if (i56 != 0) {
                                f18 = 1.7777778f;
                            } else {
                                f18 = f16;
                            }
                            if (i19 != 0) {
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = b.f117193a;
                                    o0VarE.K(objQ2);
                                }
                                pVar4 = (p) ((k23.g) objQ2);
                            } else {
                                pVar4 = pVar2;
                            }
                            if ((i17 & 16) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f22 = j92.b.f97899b.f97916a;
                                i34 &= -57345;
                            } else {
                                f22 = f17;
                            }
                            if (i25 != 0) {
                                fVar5 = null;
                            } else {
                                fVar5 = fVar;
                            }
                            if (i27 != 0) {
                                fVar6 = null;
                            } else {
                                fVar6 = fVar2;
                            }
                            if (i29 != 0) {
                                lVar2 = null;
                            }
                            if ((i17 & 256) != 0) {
                                if ((i34 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objQ = o0VarE.q();
                                if (z18) {
                                    aVar.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i54 = 0;
                                        objQ = new m82.a(cVar, 0);
                                        o0VarE.K(objQ);
                                    } else {
                                        i54 = 0;
                                    }
                                } else {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                }
                                j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                                i34 &= -234881025;
                            } else {
                                j0VarB = j0Var;
                            }
                            if (i35 != 0) {
                                i48 = 0;
                            } else {
                                i48 = i14;
                            }
                            if (i37 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i44 != 0) {
                                i49 = 100663296;
                                uVar3 = u.b.f200876a;
                            } else {
                                i49 = 100663296;
                                uVar3 = uVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var9 = n.f135158a;
                        size = cVar.size();
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        int i5114 = i49;
                        c2565a = m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ3);
                        }
                        p1Var = (p1) objQ3;
                        if (size > 5) {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        } else {
                            z17 = z17;
                            o0VarE.C(377177374);
                            o0VarE.g0(false);
                        }
                        if (((i34 & 234881024) ^ i5114) <= 67108864) {
                        }
                        if ((i34 & 29360128) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z25 | z19;
                        objQ4 = o0VarE.q();
                        if (z24) {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a(j0VarB, lVar2, null);
                            o0VarE.K(objQ4);
                        }
                        i55 = (i34 >> 24) & 14;
                        l0.e((p) objQ4, j0VarB, o0VarE);
                        h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar9 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(kVar9, h4.d.a.f81536n, o0VarE, 0);
                        pVar5 = pVar4;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        lVar4 = lVar2;
                        rVarC = k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        b0Var = c2.b0.f22601a;
                        aVar3 = h4.r.S;
                        h4.r rVarF9 = x2.f(aVar3, 1.0f);
                        if (fVar5 != null) {
                            rVarG = c2.l.g(aVar3, f18);
                        } else {
                            rVarG = c2.l.g(aVar3, f18);
                        }
                        h4.r rVarThen9 = rVarF9.then(rVarG);
                        if (fVar6 != null) {
                            bVar2 = new h2.j.b(fVar6.f75997a, null);
                        } else {
                            bVar2 = h2.j.a.f80923a;
                        }
                        j0Var3 = j0VarB;
                        h2.u.a(j0Var3, rVarThen9, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                        int i5115 = i48;
                        float f212 = f22;
                        u uVar12 = uVar3;
                        if (size > 1) {
                            o0VarE.C(-1968473706);
                            h4.r rVarB9 = b0Var.b(aVar3, h4.d.a.f81537o);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            p82.e.a(j0Var3, c2.l.C(rVarB9, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1968158188);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        uVar2 = uVar12;
                        f19 = f212;
                        fVar3 = fVar5;
                        fVar4 = fVar6;
                        pVar3 = pVar5;
                        j0Var2 = j0Var3;
                        z16 = z17;
                        i46 = i5115;
                        lVar3 = lVar4;
                    } else {
                        o0VarE.e();
                        fVar3 = fVar;
                        i46 = i14;
                        lVar3 = lVar2;
                        f18 = f16;
                        pVar3 = pVar2;
                        f19 = f17;
                        fVar4 = fVar2;
                        j0Var2 = j0Var;
                        z16 = z14;
                        uVar2 = uVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p() { // from class: m82.c
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i15 | 1);
                                int iT2 = p0.t(i16);
                                d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i38 |= 48;
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var10 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i5116 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i5116) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar10 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar10, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF10 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen10 = rVarF10.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen10, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i5117 = i48;
                    float f213 = f22;
                    u uVar13 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB10 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB10, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar13;
                    f19 = f213;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i5117;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i34 |= C.ENCODING_PCM_32BIT;
            i37 = i17 & 1024;
            if (i37 != 0) {
                i38 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i16 | i39;
            } else {
                i38 = i16;
            }
            i44 = i17 & 2048;
            if (i44 != 0) {
                if ((i16 & 48) == 0) {
                    if (o0VarE.B(uVar)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var11 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i5118 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i5118) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar11 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar11, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF11 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen11 = rVarF11.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen11, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i5119 = i48;
                    float f214 = f22;
                    u uVar14 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB11 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB11, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar14;
                    f19 = f214;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i5119;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i38 |= 48;
            if ((i34 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i34 & 1, z15)) {
                o0VarE.G0();
                i47 = i15 & 1;
                aVar = m.f135153a;
                if (i47 != 0) {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                } else {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var12 = n.f135158a;
                size = cVar.size();
                objQ3 = o0VarE.q();
                aVar.getClass();
                int i51110 = i49;
                c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                if (size > 5) {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                } else {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                }
                if (((i34 & 234881024) ^ i51110) <= 67108864) {
                }
                if ((i34 & 29360128) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z25 | z19;
                objQ4 = o0VarE.q();
                if (z24) {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                }
                i55 = (i34 >> 24) & 14;
                l0.e((p) objQ4, j0VarB, o0VarE);
                h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                c2.j.f22691a.getClass();
                c2.j.k kVar12 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar12, h4.d.a.f81536n, o0VarE, 0);
                pVar5 = pVar4;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                lVar4 = lVar2;
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                aVar3 = h4.r.S;
                h4.r rVarF12 = x2.f(aVar3, 1.0f);
                if (fVar5 != null) {
                    rVarG = c2.l.g(aVar3, f18);
                } else {
                    rVarG = c2.l.g(aVar3, f18);
                }
                h4.r rVarThen12 = rVarF12.then(rVarG);
                if (fVar6 != null) {
                    bVar2 = new h2.j.b(fVar6.f75997a, null);
                } else {
                    bVar2 = h2.j.a.f80923a;
                }
                j0Var3 = j0VarB;
                h2.u.a(j0Var3, rVarThen12, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                int i51111 = i48;
                float f215 = f22;
                u uVar15 = uVar3;
                if (size > 1) {
                    o0VarE.C(-1968473706);
                    h4.r rVarB12 = b0Var.b(aVar3, h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p82.e.a(j0Var3, c2.l.C(rVarB12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1968158188);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                uVar2 = uVar15;
                f19 = f215;
                fVar3 = fVar5;
                fVar4 = fVar6;
                pVar3 = pVar5;
                j0Var2 = j0Var3;
                z16 = z17;
                i46 = i51111;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                fVar3 = fVar;
                i46 = i14;
                lVar3 = lVar2;
                f18 = f16;
                pVar3 = pVar2;
                f19 = f17;
                fVar4 = fVar2;
                j0Var2 = j0Var;
                z16 = z14;
                uVar2 = uVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: m82.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 3072;
        pVar2 = pVar;
        if ((i15 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                f17 = f15;
                if (o0VarE.i(f17)) {
                }
                i18 |= i57;
            } else {
                f17 = f15;
            }
            i18 |= i57;
        } else {
            f17 = f15;
        }
        i25 = i17 & 32;
        if (i25 != 0) {
            i18 |= 196608;
        } else if ((i15 & 196608) == 0) {
            if (o0VarE.B(fVar)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i18 |= i26;
        }
        i27 = i17 & 64;
        if (i27 != 0) {
            i18 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (o0VarE.B(fVar2)) {
                i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i28 = 524288;
            }
            i18 |= i28;
        }
        i29 = i17 & 128;
        if (i29 != 0) {
            i18 |= 12582912;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i15 & 12582912) == 0) {
                if (o0VarE.r(lVar2)) {
                    i30 = 8388608;
                } else {
                    i30 = 4194304;
                }
                i18 |= i30;
            }
        }
        i34 = i18;
        if ((i15 & 100663296) != 0) {
            i34 |= ((i17 & 256) == 0 || !o0VarE.B(j0Var)) ? 33554432 : 67108864;
        }
        i35 = i17 & 512;
        if (i35 != 0) {
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.k(i14)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i34 |= i36;
            }
            i37 = i17 & 1024;
            if (i37 != 0) {
                i38 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i16 | i39;
            } else {
                i38 = i16;
            }
            i44 = i17 & 2048;
            if (i44 != 0) {
                if ((i16 & 48) == 0) {
                    if (o0VarE.B(uVar)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                if ((i34 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarE.n(i34 & 1, z15)) {
                    o0VarE.G0();
                    i47 = i15 & 1;
                    aVar = m.f135153a;
                    if (i47 != 0) {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    } else {
                        if (i56 != 0) {
                            f18 = 1.7777778f;
                        } else {
                            f18 = f16;
                        }
                        if (i19 != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = b.f117193a;
                                o0VarE.K(objQ2);
                            }
                            pVar4 = (p) ((k23.g) objQ2);
                        } else {
                            pVar4 = pVar2;
                        }
                        if ((i17 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f22 = j92.b.f97899b.f97916a;
                            i34 &= -57345;
                        } else {
                            f22 = f17;
                        }
                        if (i25 != 0) {
                            fVar5 = null;
                        } else {
                            fVar5 = fVar;
                        }
                        if (i27 != 0) {
                            fVar6 = null;
                        } else {
                            fVar6 = fVar2;
                        }
                        if (i29 != 0) {
                            lVar2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            if ((i34 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objQ = o0VarE.q();
                            if (z18) {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    i54 = 0;
                                    objQ = new m82.a(cVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    i54 = 0;
                                }
                            } else {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            }
                            j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                            i34 &= -234881025;
                        } else {
                            j0VarB = j0Var;
                        }
                        if (i35 != 0) {
                            i48 = 0;
                        } else {
                            i48 = i14;
                        }
                        if (i37 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i44 != 0) {
                            i49 = 100663296;
                            uVar3 = u.b.f200876a;
                        } else {
                            i49 = 100663296;
                            uVar3 = uVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var13 = n.f135158a;
                    size = cVar.size();
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    int i51112 = i49;
                    c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    if (size > 5) {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    } else {
                        z17 = z17;
                        o0VarE.C(377177374);
                        o0VarE.g0(false);
                    }
                    if (((i34 & 234881024) ^ i51112) <= 67108864) {
                    }
                    if ((i34 & 29360128) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z25 | z19;
                    objQ4 = o0VarE.q();
                    if (z24) {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a(j0VarB, lVar2, null);
                        o0VarE.K(objQ4);
                    }
                    i55 = (i34 >> 24) & 14;
                    l0.e((p) objQ4, j0VarB, o0VarE);
                    h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar13 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar13, h4.d.a.f81536n, o0VarE, 0);
                    pVar5 = pVar4;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    lVar4 = lVar2;
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarF13 = x2.f(aVar3, 1.0f);
                    if (fVar5 != null) {
                        rVarG = c2.l.g(aVar3, f18);
                    } else {
                        rVarG = c2.l.g(aVar3, f18);
                    }
                    h4.r rVarThen13 = rVarF13.then(rVarG);
                    if (fVar6 != null) {
                        bVar2 = new h2.j.b(fVar6.f75997a, null);
                    } else {
                        bVar2 = h2.j.a.f80923a;
                    }
                    j0Var3 = j0VarB;
                    h2.u.a(j0Var3, rVarThen13, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                    int i51113 = i48;
                    float f216 = f22;
                    u uVar16 = uVar3;
                    if (size > 1) {
                        o0VarE.C(-1968473706);
                        h4.r rVarB13 = b0Var.b(aVar3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        p82.e.a(j0Var3, c2.l.C(rVarB13, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1968158188);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    uVar2 = uVar16;
                    f19 = f216;
                    fVar3 = fVar5;
                    fVar4 = fVar6;
                    pVar3 = pVar5;
                    j0Var2 = j0Var3;
                    z16 = z17;
                    i46 = i51113;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    fVar3 = fVar;
                    i46 = i14;
                    lVar3 = lVar2;
                    f18 = f16;
                    pVar3 = pVar2;
                    f19 = f17;
                    fVar4 = fVar2;
                    j0Var2 = j0Var;
                    z16 = z14;
                    uVar2 = uVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: m82.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i15 | 1);
                            int iT2 = p0.t(i16);
                            d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i38 |= 48;
            if ((i34 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i34 & 1, z15)) {
                o0VarE.G0();
                i47 = i15 & 1;
                aVar = m.f135153a;
                if (i47 != 0) {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                } else {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var14 = n.f135158a;
                size = cVar.size();
                objQ3 = o0VarE.q();
                aVar.getClass();
                int i51114 = i49;
                c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                if (size > 5) {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                } else {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                }
                if (((i34 & 234881024) ^ i51114) <= 67108864) {
                }
                if ((i34 & 29360128) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z25 | z19;
                objQ4 = o0VarE.q();
                if (z24) {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                }
                i55 = (i34 >> 24) & 14;
                l0.e((p) objQ4, j0VarB, o0VarE);
                h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                c2.j.f22691a.getClass();
                c2.j.k kVar14 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar14, h4.d.a.f81536n, o0VarE, 0);
                pVar5 = pVar4;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                lVar4 = lVar2;
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                aVar3 = h4.r.S;
                h4.r rVarF14 = x2.f(aVar3, 1.0f);
                if (fVar5 != null) {
                    rVarG = c2.l.g(aVar3, f18);
                } else {
                    rVarG = c2.l.g(aVar3, f18);
                }
                h4.r rVarThen14 = rVarF14.then(rVarG);
                if (fVar6 != null) {
                    bVar2 = new h2.j.b(fVar6.f75997a, null);
                } else {
                    bVar2 = h2.j.a.f80923a;
                }
                j0Var3 = j0VarB;
                h2.u.a(j0Var3, rVarThen14, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                int i51115 = i48;
                float f217 = f22;
                u uVar17 = uVar3;
                if (size > 1) {
                    o0VarE.C(-1968473706);
                    h4.r rVarB14 = b0Var.b(aVar3, h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p82.e.a(j0Var3, c2.l.C(rVarB14, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1968158188);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                uVar2 = uVar17;
                f19 = f217;
                fVar3 = fVar5;
                fVar4 = fVar6;
                pVar3 = pVar5;
                j0Var2 = j0Var3;
                z16 = z17;
                i46 = i51115;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                fVar3 = fVar;
                i46 = i14;
                lVar3 = lVar2;
                f18 = f16;
                pVar3 = pVar2;
                f19 = f17;
                fVar4 = fVar2;
                j0Var2 = j0Var;
                z16 = z14;
                uVar2 = uVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: m82.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i34 |= C.ENCODING_PCM_32BIT;
        i37 = i17 & 1024;
        if (i37 != 0) {
            i38 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (o0VarE.h(z14)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i38 = i16 | i39;
        } else {
            i38 = i16;
        }
        i44 = i17 & 2048;
        if (i44 != 0) {
            if ((i16 & 48) == 0) {
                if (o0VarE.B(uVar)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            if ((i34 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i34 & 1, z15)) {
                o0VarE.G0();
                i47 = i15 & 1;
                aVar = m.f135153a;
                if (i47 != 0) {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                } else {
                    if (i56 != 0) {
                        f18 = 1.7777778f;
                    } else {
                        f18 = f16;
                    }
                    if (i19 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = b.f117193a;
                            o0VarE.K(objQ2);
                        }
                        pVar4 = (p) ((k23.g) objQ2);
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((i17 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f22 = j92.b.f97899b.f97916a;
                        i34 &= -57345;
                    } else {
                        f22 = f17;
                    }
                    if (i25 != 0) {
                        fVar5 = null;
                    } else {
                        fVar5 = fVar;
                    }
                    if (i27 != 0) {
                        fVar6 = null;
                    } else {
                        fVar6 = fVar2;
                    }
                    if (i29 != 0) {
                        lVar2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        if ((i34 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ = o0VarE.q();
                        if (z18) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                i54 = 0;
                                objQ = new m82.a(cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                i54 = 0;
                            }
                        } else {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        }
                        j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                        i34 &= -234881025;
                    } else {
                        j0VarB = j0Var;
                    }
                    if (i35 != 0) {
                        i48 = 0;
                    } else {
                        i48 = i14;
                    }
                    if (i37 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i44 != 0) {
                        i49 = 100663296;
                        uVar3 = u.b.f200876a;
                    } else {
                        i49 = 100663296;
                        uVar3 = uVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var15 = n.f135158a;
                size = cVar.size();
                objQ3 = o0VarE.q();
                aVar.getClass();
                int i51116 = i49;
                c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                if (size > 5) {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                } else {
                    z17 = z17;
                    o0VarE.C(377177374);
                    o0VarE.g0(false);
                }
                if (((i34 & 234881024) ^ i51116) <= 67108864) {
                }
                if ((i34 & 29360128) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z25 | z19;
                objQ4 = o0VarE.q();
                if (z24) {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a(j0VarB, lVar2, null);
                    o0VarE.K(objQ4);
                }
                i55 = (i34 >> 24) & 14;
                l0.e((p) objQ4, j0VarB, o0VarE);
                h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
                c2.j.f22691a.getClass();
                c2.j.k kVar15 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar15, h4.d.a.f81536n, o0VarE, 0);
                pVar5 = pVar4;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                lVar4 = lVar2;
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                aVar3 = h4.r.S;
                h4.r rVarF15 = x2.f(aVar3, 1.0f);
                if (fVar5 != null) {
                    rVarG = c2.l.g(aVar3, f18);
                } else {
                    rVarG = c2.l.g(aVar3, f18);
                }
                h4.r rVarThen15 = rVarF15.then(rVarG);
                if (fVar6 != null) {
                    bVar2 = new h2.j.b(fVar6.f75997a, null);
                } else {
                    bVar2 = h2.j.a.f80923a;
                }
                j0Var3 = j0VarB;
                h2.u.a(j0Var3, rVarThen15, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
                int i51117 = i48;
                float f218 = f22;
                u uVar18 = uVar3;
                if (size > 1) {
                    o0VarE.C(-1968473706);
                    h4.r rVarB15 = b0Var.b(aVar3, h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p82.e.a(j0Var3, c2.l.C(rVarB15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1968158188);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                uVar2 = uVar18;
                f19 = f218;
                fVar3 = fVar5;
                fVar4 = fVar6;
                pVar3 = pVar5;
                j0Var2 = j0Var3;
                z16 = z17;
                i46 = i51117;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                fVar3 = fVar;
                i46 = i14;
                lVar3 = lVar2;
                f18 = f16;
                pVar3 = pVar2;
                f19 = f17;
                fVar4 = fVar2;
                j0Var2 = j0Var;
                z16 = z14;
                uVar2 = uVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: m82.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i15 | 1);
                        int iT2 = p0.t(i16);
                        d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i38 |= 48;
        if ((i34 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i34 & 1, z15)) {
            o0VarE.G0();
            i47 = i15 & 1;
            aVar = m.f135153a;
            if (i47 != 0) {
                if (i56 != 0) {
                    f18 = 1.7777778f;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = b.f117193a;
                        o0VarE.K(objQ2);
                    }
                    pVar4 = (p) ((k23.g) objQ2);
                } else {
                    pVar4 = pVar2;
                }
                if ((i17 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f22 = j92.b.f97899b.f97916a;
                    i34 &= -57345;
                } else {
                    f22 = f17;
                }
                if (i25 != 0) {
                    fVar5 = null;
                } else {
                    fVar5 = fVar;
                }
                if (i27 != 0) {
                    fVar6 = null;
                } else {
                    fVar6 = fVar2;
                }
                if (i29 != 0) {
                    lVar2 = null;
                }
                if ((i17 & 256) != 0) {
                    if ((i34 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ = o0VarE.q();
                    if (z18) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            i54 = 0;
                        }
                    } else {
                        i54 = 0;
                        objQ = new m82.a(cVar, 0);
                        o0VarE.K(objQ);
                    }
                    j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                    i34 &= -234881025;
                } else {
                    j0VarB = j0Var;
                }
                if (i35 != 0) {
                    i48 = 0;
                } else {
                    i48 = i14;
                }
                if (i37 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i44 != 0) {
                    i49 = 100663296;
                    uVar3 = u.b.f200876a;
                } else {
                    i49 = 100663296;
                    uVar3 = uVar;
                }
            } else {
                if (i56 != 0) {
                    f18 = 1.7777778f;
                } else {
                    f18 = f16;
                }
                if (i19 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = b.f117193a;
                        o0VarE.K(objQ2);
                    }
                    pVar4 = (p) ((k23.g) objQ2);
                } else {
                    pVar4 = pVar2;
                }
                if ((i17 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f22 = j92.b.f97899b.f97916a;
                    i34 &= -57345;
                } else {
                    f22 = f17;
                }
                if (i25 != 0) {
                    fVar5 = null;
                } else {
                    fVar5 = fVar;
                }
                if (i27 != 0) {
                    fVar6 = null;
                } else {
                    fVar6 = fVar2;
                }
                if (i29 != 0) {
                    lVar2 = null;
                }
                if ((i17 & 256) != 0) {
                    if ((i34 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ = o0VarE.q();
                    if (z18) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            i54 = 0;
                            objQ = new m82.a(cVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            i54 = 0;
                        }
                    } else {
                        i54 = 0;
                        objQ = new m82.a(cVar, 0);
                        o0VarE.K(objQ);
                    }
                    j0VarB = h2.o0.b(i54, (e23.a) objQ, o0VarE, i54, 3);
                    i34 &= -234881025;
                } else {
                    j0VarB = j0Var;
                }
                if (i35 != 0) {
                    i48 = 0;
                } else {
                    i48 = i14;
                }
                if (i37 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i44 != 0) {
                    i49 = 100663296;
                    uVar3 = u.b.f200876a;
                } else {
                    i49 = 100663296;
                    uVar3 = uVar;
                }
            }
            o0VarE.h0();
            x1 x1Var16 = n.f135158a;
            size = cVar.size();
            objQ3 = o0VarE.q();
            aVar.getClass();
            int i51118 = i49;
            c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var = (p1) objQ3;
            if (size > 5) {
                z17 = z17;
                o0VarE.C(377177374);
                o0VarE.g0(false);
            } else {
                z17 = z17;
                o0VarE.C(377177374);
                o0VarE.g0(false);
            }
            if (((i34 & 234881024) ^ i51118) <= 67108864) {
            }
            if ((i34 & 29360128) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z25 | z19;
            objQ4 = o0VarE.q();
            if (z24) {
                objQ4 = new a(j0VarB, lVar2, null);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new a(j0VarB, lVar2, null);
                o0VarE.K(objQ4);
            }
            i55 = (i34 >> 24) & 14;
            l0.e((p) objQ4, j0VarB, o0VarE);
            h2VarInvoke = pVar4.invoke(Integer.valueOf(size), Integer.valueOf(j0VarB.l()));
            c2.j.f22691a.getClass();
            c2.j.k kVar16 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar16, h4.d.a.f81536n, o0VarE, 0);
            pVar5 = pVar4;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            lVar4 = lVar2;
            rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0Var = c2.b0.f22601a;
            aVar3 = h4.r.S;
            h4.r rVarF16 = x2.f(aVar3, 1.0f);
            if (fVar5 != null) {
                rVarG = c2.l.g(aVar3, f18);
            } else {
                rVarG = c2.l.g(aVar3, f18);
            }
            h4.r rVarThen16 = rVarF16.then(rVarG);
            if (fVar6 != null) {
                bVar2 = new h2.j.b(fVar6.f75997a, null);
            } else {
                bVar2 = h2.j.a.f80923a;
            }
            j0Var3 = j0VarB;
            h2.u.a(j0Var3, rVarThen16, h2VarInvoke, bVar2, i48, f22, null, null, false, null, null, uVar3, null, z3.f.c(-975612947, new m82.b(cVar, size, j0VarB, p1Var), o0VarE), o0VarE, i55 | ((i34 >> 15) & 57344) | (458752 & (i34 << 3)), ((i38 << 3) & 896) | 24576, 12224);
            int i51119 = i48;
            float f219 = f22;
            u uVar19 = uVar3;
            if (size > 1) {
                o0VarE.C(-1968473706);
                h4.r rVarB16 = b0Var.b(aVar3, h4.d.a.f81537o);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                p82.e.a(j0Var3, c2.l.C(rVarB16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), size, j0Var3.l(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, o0VarE, i55, 1008);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1968158188);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            uVar2 = uVar19;
            f19 = f219;
            fVar3 = fVar5;
            fVar4 = fVar6;
            pVar3 = pVar5;
            j0Var2 = j0Var3;
            z16 = z17;
            i46 = i51119;
            lVar3 = lVar4;
        } else {
            o0VarE.e();
            fVar3 = fVar;
            i46 = i14;
            lVar3 = lVar2;
            f18 = f16;
            pVar3 = pVar2;
            f19 = f17;
            fVar4 = fVar2;
            j0Var2 = j0Var;
            z16 = z14;
            uVar2 = uVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: m82.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i15 | 1);
                    int iT2 = p0.t(i16);
                    d.b(rVar, cVar, f18, pVar3, f19, fVar3, fVar4, lVar3, j0Var2, i46, z16, uVar2, (m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
