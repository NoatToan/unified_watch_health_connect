package vx;

import am.j;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cr.t;
import d62.o;
import e23.l;
import e23.p;
import gl1.y;
import i3.b3;
import i3.bc;
import i3.c5;
import i3.d3;
import i3.k3;
import i3.k4;
import i3.m4;
import java.util.Iterator;
import java.util.Locale;
import o13.r;
import o4.d0;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.n2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.x3;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calendar.CalendarDatePickerKt$CalendarDatePicker$2$1$1", f = "CalendarDatePicker.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<Long> f180634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f180635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x3<Long> x3Var, l<? super Long, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180634a = x3Var;
            this.f180635b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180634a, this.f180635b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Long f182175a = this.f180634a.getF182175a();
            if (f182175a != null) {
                this.f180635b.invoke(new Long(f182175a.longValue()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef A[PHI: r4 r6
      0x00ef: PHI (r4v10 java.lang.Long) = (r4v4 java.lang.Long), (r4v2 java.lang.Long) binds: [B:90:0x00fd, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r6v8 int) = (r6v5 int), (r6v2 int) binds: [B:90:0x00fd, B:83:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, Long l14, int i14, final bc bcVar, final j23.l lVar, boolean z14, long j8, final l<? super Long, Unit> lVar2, m mVar, int i15, int i16) {
        h4.r rVar2;
        int i17;
        Long l15;
        int i18;
        int i19;
        int i24;
        boolean z15;
        long j14;
        boolean z16;
        Long l16;
        long j15;
        int i25;
        p2 p2VarI0;
        final long jC;
        final Long l17;
        int i26;
        int i27;
        int i28;
        int i29;
        bcVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1267775071);
        if ((i15 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        } else {
            rVar2 = rVar;
            i17 = i15;
        }
        int i30 = i16 & 2;
        if (i30 == 0) {
            if ((i15 & 48) == 0) {
                l15 = l14;
                i17 |= o0VarE.B(l15) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & 384) == 0) {
                    i19 = i14;
                    if (o0VarE.k(i19)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i17 |= i24;
                }
                if ((i15 & 3072) == 0) {
                    if (o0VarE.B(bcVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i17 |= i29;
                }
                if ((i15 & 24576) == 0) {
                    if (o0VarE.r(lVar)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i17 |= i28;
                }
                if ((196608 & i15) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                } else {
                    z15 = z14;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        j14 = j8;
                        int i34 = o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        i17 |= i34;
                    } else {
                        j14 = j8;
                    }
                    i17 |= i34;
                } else {
                    j14 = j8;
                }
                if ((12582912 & i15) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i17 |= i26;
                }
                if ((4793491 & i17) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0 || o0VarE.o0()) {
                        if (i30 != 0) {
                            l15 = null;
                        }
                        if (i18 != 0) {
                            i19 = 1;
                        }
                        if ((i16 & 64) != 0) {
                            jC = j.c(d92.b.f58623a, o0VarE);
                            l17 = l15;
                        }
                        o0VarE.h0();
                        x1 x1Var = n.f135158a;
                        Configuration configurationG = g(o0VarE, i19);
                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                        Context contextCreateConfigurationContext = ((Context) o0VarE.A(y3Var)).createConfigurationContext(configurationG);
                        contextCreateConfigurationContext.getClass();
                        final h4.r rVar3 = rVar2;
                        final boolean z17 = z15;
                        v.b(new n2[]{y3Var.c(contextCreateConfigurationContext), AndroidCompositionLocals_androidKt.f6041a.c(configurationG)}, z3.f.c(-705230433, new p() { // from class: vx.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                m mVar2 = (m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = n.f135158a;
                                    m4 m4VarP = i3.x3.p(l17, lVar, bcVar, mVar2, 0, 10);
                                    Object objQ = mVar2.q();
                                    m.f135153a.getClass();
                                    m.a.C2565a c2565a = m.a.f135155b;
                                    if (objQ == c2565a) {
                                        objQ = p0.f(new r11.b(m4VarP, 1));
                                        mVar2.K(objQ);
                                    }
                                    x3 x3Var = (x3) objQ;
                                    Long l18 = (Long) x3Var.getF182175a();
                                    l lVar3 = lVar2;
                                    boolean zB = mVar2.B(lVar3);
                                    Object objQ2 = mVar2.q();
                                    if (zB || objQ2 == c2565a) {
                                        objQ2 = new c.a(x3Var, lVar3, null);
                                        mVar2.K(objQ2);
                                    }
                                    l0.e((p) objQ2, l18, mVar2);
                                    m1.a aVar = m1.f128891a;
                                    h4.r rVar4 = rVar3;
                                    long j16 = jC;
                                    c.d(u1.n.e(rVar4, j16, aVar), m4VarP, j16, z17, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 56);
                        l16 = l17;
                        j15 = jC;
                    } else {
                        o0VarE.e();
                    }
                    l17 = l15;
                    jC = j14;
                    o0VarE.h0();
                    x1 x1Var2 = n.f135158a;
                    Configuration configurationG2 = g(o0VarE, i19);
                    y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
                    Context contextCreateConfigurationContext2 = ((Context) o0VarE.A(y3Var2)).createConfigurationContext(configurationG2);
                    contextCreateConfigurationContext2.getClass();
                    final h4.r rVar4 = rVar2;
                    final boolean z18 = z15;
                    v.b(new n2[]{y3Var2.c(contextCreateConfigurationContext2), AndroidCompositionLocals_androidKt.f6041a.c(configurationG2)}, z3.f.c(-705230433, new p() { // from class: vx.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                m4 m4VarP = i3.x3.p(l17, lVar, bcVar, mVar2, 0, 10);
                                Object objQ = mVar2.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p0.f(new r11.b(m4VarP, 1));
                                    mVar2.K(objQ);
                                }
                                x3 x3Var = (x3) objQ;
                                Long l18 = (Long) x3Var.getF182175a();
                                l lVar3 = lVar2;
                                boolean zB = mVar2.B(lVar3);
                                Object objQ2 = mVar2.q();
                                if (zB || objQ2 == c2565a) {
                                    objQ2 = new c.a(x3Var, lVar3, null);
                                    mVar2.K(objQ2);
                                }
                                l0.e((p) objQ2, l18, mVar2);
                                m1.a aVar = m1.f128891a;
                                h4.r rVar5 = rVar4;
                                long j16 = jC;
                                c.d(u1.n.e(rVar5, j16, aVar), m4VarP, j16, z18, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 56);
                    l16 = l17;
                    j15 = jC;
                } else {
                    o0VarE.e();
                    l16 = l15;
                    j15 = j14;
                }
                i25 = i19;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new ky0.n(rVar, l16, i25, bcVar, lVar, z14, j15, lVar2, i15, i16);
                }
            }
            i17 |= 384;
            i19 = i14;
            if ((i15 & 3072) == 0) {
                if (o0VarE.B(bcVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i17 |= i29;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(lVar)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i17 |= i28;
            }
            if ((196608 & i15) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i17 |= i27;
            } else {
                z15 = z14;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    j14 = j8;
                    if (o0VarE.l(j14)) {
                    }
                    i17 |= i34;
                } else {
                    j14 = j8;
                }
                i17 |= i34;
            } else {
                j14 = j8;
            }
            if ((12582912 & i15) == 0) {
                if (o0VarE.r(lVar2)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((4793491 & i17) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i30 != 0) {
                        l15 = null;
                    }
                    if (i18 != 0) {
                        i19 = 1;
                    }
                    if ((i16 & 64) != 0) {
                        jC = j.c(d92.b.f58623a, o0VarE);
                        l17 = l15;
                    } else {
                        l17 = l15;
                        jC = j14;
                    }
                } else {
                    if (i30 != 0) {
                        l15 = null;
                    }
                    if (i18 != 0) {
                        i19 = 1;
                    }
                    if ((i16 & 64) != 0) {
                        jC = j.c(d92.b.f58623a, o0VarE);
                        l17 = l15;
                    } else {
                        l17 = l15;
                        jC = j14;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                Configuration configurationG3 = g(o0VarE, i19);
                y3 y3Var3 = AndroidCompositionLocals_androidKt.f6042b;
                Context contextCreateConfigurationContext3 = ((Context) o0VarE.A(y3Var3)).createConfigurationContext(configurationG3);
                contextCreateConfigurationContext3.getClass();
                final h4.r rVar5 = rVar2;
                final boolean z19 = z15;
                v.b(new n2[]{y3Var3.c(contextCreateConfigurationContext3), AndroidCompositionLocals_androidKt.f6041a.c(configurationG3)}, z3.f.c(-705230433, new p() { // from class: vx.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        m mVar2 = (m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var4 = n.f135158a;
                            m4 m4VarP = i3.x3.p(l17, lVar, bcVar, mVar2, 0, 10);
                            Object objQ = mVar2.q();
                            m.f135153a.getClass();
                            m.a.C2565a c2565a = m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = p0.f(new r11.b(m4VarP, 1));
                                mVar2.K(objQ);
                            }
                            x3 x3Var = (x3) objQ;
                            Long l18 = (Long) x3Var.getF182175a();
                            l lVar3 = lVar2;
                            boolean zB = mVar2.B(lVar3);
                            Object objQ2 = mVar2.q();
                            if (zB || objQ2 == c2565a) {
                                objQ2 = new c.a(x3Var, lVar3, null);
                                mVar2.K(objQ2);
                            }
                            l0.e((p) objQ2, l18, mVar2);
                            m1.a aVar = m1.f128891a;
                            h4.r rVar6 = rVar5;
                            long j16 = jC;
                            c.d(u1.n.e(rVar6, j16, aVar), m4VarP, j16, z19, mVar2, 0);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                l16 = l17;
                j15 = jC;
            } else {
                o0VarE.e();
                l16 = l15;
                j15 = j14;
            }
            i25 = i19;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ky0.n(rVar, l16, i25, bcVar, lVar, z14, j15, lVar2, i15, i16);
            }
        }
        i17 |= 48;
        l15 = l14;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & 384) == 0) {
                i19 = i14;
                if (o0VarE.k(i19)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i17 |= i24;
            }
            if ((i15 & 3072) == 0) {
                if (o0VarE.B(bcVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i17 |= i29;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(lVar)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i17 |= i28;
            }
            if ((196608 & i15) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i17 |= i27;
            } else {
                z15 = z14;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    j14 = j8;
                    if (o0VarE.l(j14)) {
                    }
                    i17 |= i34;
                } else {
                    j14 = j8;
                }
                i17 |= i34;
            } else {
                j14 = j8;
            }
            if ((12582912 & i15) == 0) {
                if (o0VarE.r(lVar2)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((4793491 & i17) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i30 != 0) {
                        l15 = null;
                    }
                    if (i18 != 0) {
                        i19 = 1;
                    }
                    if ((i16 & 64) != 0) {
                        jC = j.c(d92.b.f58623a, o0VarE);
                        l17 = l15;
                    } else {
                        l17 = l15;
                        jC = j14;
                    }
                } else {
                    if (i30 != 0) {
                        l15 = null;
                    }
                    if (i18 != 0) {
                        i19 = 1;
                    }
                    if ((i16 & 64) != 0) {
                        jC = j.c(d92.b.f58623a, o0VarE);
                        l17 = l15;
                    } else {
                        l17 = l15;
                        jC = j14;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                Configuration configurationG4 = g(o0VarE, i19);
                y3 y3Var4 = AndroidCompositionLocals_androidKt.f6042b;
                Context contextCreateConfigurationContext4 = ((Context) o0VarE.A(y3Var4)).createConfigurationContext(configurationG4);
                contextCreateConfigurationContext4.getClass();
                final h4.r rVar6 = rVar2;
                final boolean z110 = z15;
                v.b(new n2[]{y3Var4.c(contextCreateConfigurationContext4), AndroidCompositionLocals_androidKt.f6041a.c(configurationG4)}, z3.f.c(-705230433, new p() { // from class: vx.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        m mVar2 = (m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var5 = n.f135158a;
                            m4 m4VarP = i3.x3.p(l17, lVar, bcVar, mVar2, 0, 10);
                            Object objQ = mVar2.q();
                            m.f135153a.getClass();
                            m.a.C2565a c2565a = m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = p0.f(new r11.b(m4VarP, 1));
                                mVar2.K(objQ);
                            }
                            x3 x3Var = (x3) objQ;
                            Long l18 = (Long) x3Var.getF182175a();
                            l lVar3 = lVar2;
                            boolean zB = mVar2.B(lVar3);
                            Object objQ2 = mVar2.q();
                            if (zB || objQ2 == c2565a) {
                                objQ2 = new c.a(x3Var, lVar3, null);
                                mVar2.K(objQ2);
                            }
                            l0.e((p) objQ2, l18, mVar2);
                            m1.a aVar = m1.f128891a;
                            h4.r rVar7 = rVar6;
                            long j16 = jC;
                            c.d(u1.n.e(rVar7, j16, aVar), m4VarP, j16, z110, mVar2, 0);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 56);
                l16 = l17;
                j15 = jC;
            } else {
                o0VarE.e();
                l16 = l15;
                j15 = j14;
            }
            i25 = i19;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ky0.n(rVar, l16, i25, bcVar, lVar, z14, j15, lVar2, i15, i16);
            }
        }
        i17 |= 384;
        i19 = i14;
        if ((i15 & 3072) == 0) {
            if (o0VarE.B(bcVar)) {
                i29 = 2048;
            } else {
                i29 = 1024;
            }
            i17 |= i29;
        }
        if ((i15 & 24576) == 0) {
            if (o0VarE.r(lVar)) {
                i28 = 16384;
            } else {
                i28 = 8192;
            }
            i17 |= i28;
        }
        if ((196608 & i15) == 0) {
            z15 = z14;
            if (o0VarE.h(z15)) {
                i27 = 131072;
            } else {
                i27 = 65536;
            }
            i17 |= i27;
        } else {
            z15 = z14;
        }
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                j14 = j8;
                if (o0VarE.l(j14)) {
                }
                i17 |= i34;
            } else {
                j14 = j8;
            }
            i17 |= i34;
        } else {
            j14 = j8;
        }
        if ((12582912 & i15) == 0) {
            if (o0VarE.r(lVar2)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i17 |= i26;
        }
        if ((4793491 & i17) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i30 != 0) {
                    l15 = null;
                }
                if (i18 != 0) {
                    i19 = 1;
                }
                if ((i16 & 64) != 0) {
                    jC = j.c(d92.b.f58623a, o0VarE);
                    l17 = l15;
                } else {
                    l17 = l15;
                    jC = j14;
                }
            } else {
                if (i30 != 0) {
                    l15 = null;
                }
                if (i18 != 0) {
                    i19 = 1;
                }
                if ((i16 & 64) != 0) {
                    jC = j.c(d92.b.f58623a, o0VarE);
                    l17 = l15;
                } else {
                    l17 = l15;
                    jC = j14;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = n.f135158a;
            Configuration configurationG5 = g(o0VarE, i19);
            y3 y3Var5 = AndroidCompositionLocals_androidKt.f6042b;
            Context contextCreateConfigurationContext5 = ((Context) o0VarE.A(y3Var5)).createConfigurationContext(configurationG5);
            contextCreateConfigurationContext5.getClass();
            final h4.r rVar7 = rVar2;
            final boolean z111 = z15;
            v.b(new n2[]{y3Var5.c(contextCreateConfigurationContext5), AndroidCompositionLocals_androidKt.f6041a.c(configurationG5)}, z3.f.c(-705230433, new p() { // from class: vx.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var6 = n.f135158a;
                        m4 m4VarP = i3.x3.p(l17, lVar, bcVar, mVar2, 0, 10);
                        Object objQ = mVar2.q();
                        m.f135153a.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = p0.f(new r11.b(m4VarP, 1));
                            mVar2.K(objQ);
                        }
                        x3 x3Var = (x3) objQ;
                        Long l18 = (Long) x3Var.getF182175a();
                        l lVar3 = lVar2;
                        boolean zB = mVar2.B(lVar3);
                        Object objQ2 = mVar2.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new c.a(x3Var, lVar3, null);
                            mVar2.K(objQ2);
                        }
                        l0.e((p) objQ2, l18, mVar2);
                        m1.a aVar = m1.f128891a;
                        h4.r rVar8 = rVar7;
                        long j16 = jC;
                        c.d(u1.n.e(rVar8, j16, aVar), m4VarP, j16, z111, mVar2, 0);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            l16 = l17;
            j15 = jC;
        } else {
            o0VarE.e();
            l16 = l15;
            j15 = j14;
        }
        i25 = i19;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ky0.n(rVar, l16, i25, bcVar, lVar, z14, j15, lVar2, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00dd A[SYNTHETIC] */
    public static final void b(h4.r rVar, final Long l14, final int i14, final i53.c cVar, long j8, final l lVar, m mVar, final int i15, final int i16) {
        final h4.r rVar2;
        int i17;
        final long j14;
        h4.r rVar3;
        long jC;
        int i18;
        Iterator<E> it;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        int year;
        Iterator<E> it3;
        int year2;
        Integer numValueOf4;
        lVar.getClass();
        o0 o0VarE = mVar.E(925823834);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i15 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i24 = i17 | (o0VarE.B(l14) ? 32 : 16) | (o0VarE.B(cVar) ? 2048 : 1024) | 90112;
        if ((i15 & 1572864) == 0) {
            i24 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i24 & 1, (599187 & i24) != 599186)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                rVar3 = i19 != 0 ? h4.r.S : rVar2;
                jC = j.c(d92.b.f58623a, o0VarE);
                i18 = i24 & (-458753);
            } else {
                o0VarE.e();
                h4.r rVar4 = rVar2;
                i18 = i24 & (-458753);
                rVar3 = rVar4;
                jC = j8;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            d dVar = new d(cVar);
            boolean z14 = (i18 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                it = cVar.iterator();
                numValueOf = null;
                if (it.hasNext()) {
                    numValueOf2 = Integer.valueOf(new DateTime(((Number) it.next()).longValue(), DateTimeZone.UTC).getYear());
                    while (it.hasNext()) {
                        numValueOf3 = Integer.valueOf(new DateTime(((Number) it.next()).longValue(), DateTimeZone.UTC).getYear());
                        if (numValueOf2.compareTo(numValueOf3) > 0) {
                            numValueOf2 = numValueOf3;
                        }
                    }
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    year = numValueOf2.intValue();
                } else {
                    year = DateTime.now(DateTimeZone.UTC).getYear();
                }
                it3 = cVar.iterator();
                if (it3.hasNext()) {
                    numValueOf = Integer.valueOf(new DateTime(((Number) it3.next()).longValue(), DateTimeZone.UTC).getYear());
                    while (it3.hasNext()) {
                        numValueOf4 = Integer.valueOf(new DateTime(((Number) it3.next()).longValue(), DateTimeZone.UTC).getYear());
                        if (numValueOf.compareTo(numValueOf4) < 0) {
                            numValueOf = numValueOf4;
                        }
                    }
                }
                if (numValueOf != null) {
                    year2 = numValueOf.intValue();
                } else {
                    year2 = DateTime.now(DateTimeZone.UTC).getYear();
                }
                j23.l lVar2 = new j23.l(year, year2);
                o0VarE.K(lVar2);
                objQ = lVar2;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    it = cVar.iterator();
                    numValueOf = null;
                    if (it.hasNext()) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(new DateTime(((Number) it.next()).longValue(), DateTimeZone.UTC).getYear());
                        while (it.hasNext()) {
                            numValueOf3 = Integer.valueOf(new DateTime(((Number) it.next()).longValue(), DateTimeZone.UTC).getYear());
                            if (numValueOf2.compareTo(numValueOf3) > 0) {
                                numValueOf2 = numValueOf3;
                            }
                        }
                    }
                    if (numValueOf2 != null) {
                        year = numValueOf2.intValue();
                    } else {
                        year = DateTime.now(DateTimeZone.UTC).getYear();
                    }
                    it3 = cVar.iterator();
                    if (it3.hasNext()) {
                        numValueOf = Integer.valueOf(new DateTime(((Number) it3.next()).longValue(), DateTimeZone.UTC).getYear());
                        while (it3.hasNext()) {
                            numValueOf4 = Integer.valueOf(new DateTime(((Number) it3.next()).longValue(), DateTimeZone.UTC).getYear());
                            if (numValueOf.compareTo(numValueOf4) < 0) {
                                numValueOf = numValueOf4;
                            }
                        }
                    }
                    if (numValueOf != null) {
                        year2 = numValueOf.intValue();
                    } else {
                        year2 = DateTime.now(DateTimeZone.UTC).getYear();
                    }
                    j23.l lVar3 = new j23.l(year, year2);
                    o0VarE.K(lVar3);
                    objQ = lVar3;
                }
            }
            h4.r rVar5 = rVar3;
            a(rVar5, l14, i14, dVar, (j23.l) objQ, false, jC, lVar, o0VarE, (i18 & 1022) | 196608 | ((i18 << 3) & 29360128), 0);
            x1 x1Var2 = n.f135158a;
            rVar2 = rVar5;
            j14 = jC;
        } else {
            o0VarE.e();
            j14 = j8;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: vx.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.b(rVar2, l14, i14, cVar, j14, lVar, (m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void c(k4 k4Var, String str, l<? super Long, Unit> lVar, String str2, e23.a<Unit> aVar, boolean z14, m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        String str3;
        String str4;
        boolean z17;
        p2 p2VarI0;
        String strQ;
        int i17;
        String str5;
        boolean z18;
        z3.e eVarC;
        boolean z19;
        Object objQ;
        k4Var.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1174637482);
        int i18 = 2;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(k4Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        int i19 = i15 & 32;
        if (i19 == 0) {
            if ((196608 & i14) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
                    strQ = y.Q(o0VarE, R.string.lbl_cancel);
                    i17 = i16 & (-7281);
                    str5 = strQ2;
                    if (i19 != 0) {
                        str4 = strQ;
                        z18 = true;
                    } else {
                        str4 = strQ;
                        z18 = z15;
                    }
                } else {
                    o0VarE.e();
                    str4 = str2;
                    i17 = i16 & (-7281);
                    z18 = z15;
                    str5 = str;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                b3 b3VarF = f(j.A(d92.b.f58623a, o0VarE), z18, k4Var.e(), o0VarE, (i17 >> 12) & 112);
                boolean z24 = z18;
                if (str4 == null) {
                    o0VarE.C(-1767204021);
                    o0VarE.g0(false);
                    eVarC = null;
                } else {
                    o0VarE.C(-1767204020);
                    eVarC = z3.f.c(853207718, new uu1.i(str4, aVar, i18), o0VarE);
                    o0VarE.g0(false);
                }
                z3.e eVar = eVarC;
                z19 = (i17 & 57344) == 16384;
                objQ = o0VarE.q();
                if (z19) {
                    objQ = new ux1.g(aVar, 24);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ux1.g(aVar, 24);
                        o0VarE.K(objQ);
                    }
                }
                k3.a((e23.a) objQ, z3.f.c(371502140, new tb0.h(str5, lVar, k4Var), o0VarE), null, eVar, null, 0.0f, b3VarF, null, z3.f.c(-961518637, new vv0.e(i18, k4Var, b3VarF), o0VarE), o0VarE, 100663344);
                o0VarE = o0VarE;
                str3 = str5;
                z17 = z24;
            } else {
                o0VarE.e();
                str3 = str;
                str4 = str2;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(k4Var, str3, lVar, str4, aVar, z17, i14, i15);
            }
        }
        i16 |= 196608;
        z15 = z14;
        if ((74899 & i16) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
                strQ = y.Q(o0VarE, R.string.lbl_cancel);
                i17 = i16 & (-7281);
                str5 = strQ3;
                if (i19 != 0) {
                    str4 = strQ;
                    z18 = true;
                } else {
                    str4 = strQ;
                    z18 = z15;
                }
            } else {
                String strQ4 = y.Q(o0VarE, R.string.lbl_ok);
                strQ = y.Q(o0VarE, R.string.lbl_cancel);
                i17 = i16 & (-7281);
                str5 = strQ4;
                if (i19 != 0) {
                    str4 = strQ;
                    z18 = true;
                } else {
                    str4 = strQ;
                    z18 = z15;
                }
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            b3 b3VarF2 = f(j.A(d92.b.f58623a, o0VarE), z18, k4Var.e(), o0VarE, (i17 >> 12) & 112);
            boolean z25 = z18;
            if (str4 == null) {
                o0VarE.C(-1767204021);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(-1767204020);
                eVarC = z3.f.c(853207718, new uu1.i(str4, aVar, i18), o0VarE);
                o0VarE.g0(false);
            }
            z3.e eVar2 = eVarC;
            if ((i17 & 57344) == 16384) {
            }
            objQ = o0VarE.q();
            if (z19) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ux1.g(aVar, 24);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ux1.g(aVar, 24);
                o0VarE.K(objQ);
            }
            k3.a((e23.a) objQ, z3.f.c(371502140, new tb0.h(str5, lVar, k4Var), o0VarE), null, eVar2, null, 0.0f, b3VarF2, null, z3.f.c(-961518637, new vv0.e(i18, k4Var, b3VarF2), o0VarE), o0VarE, 100663344);
            o0VarE = o0VarE;
            str3 = str5;
            z17 = z25;
        } else {
            o0VarE.e();
            str3 = str;
            str4 = str2;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(k4Var, str3, lVar, str4, aVar, z17, i14, i15);
        }
    }

    public static final void d(h4.r rVar, k4 k4Var, long j8, boolean z14, m mVar, int i14) {
        k4Var.getClass();
        o0 o0VarE = mVar.E(-875387023);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(k4Var) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            i3.x3.b(k4Var, rVar, null, f(j8, z14, k4Var.e(), o0VarE, (i15 >> 6) & 126), null, null, false, null, o0VarE, ((i15 >> 3) & 14) | 1794048 | ((i15 << 3) & 112), 132);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(rVar, k4Var, j8, z14, i14);
        }
    }

    public static final void e(h4.r rVar, int i14, c5 c5Var, long j8, l lVar, l lVar2, m mVar, int i15) {
        c5Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1627698564);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2);
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        int i17 = i16 | (o0VarE.B(c5Var) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            Configuration configurationG = g(o0VarE, i14);
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context contextCreateConfigurationContext = ((Context) o0VarE.A(y3Var)).createConfigurationContext(configurationG);
            contextCreateConfigurationContext.getClass();
            v.b(new n2[]{y3Var.c(contextCreateConfigurationContext), AndroidCompositionLocals_androidKt.f6041a.c(configurationG)}, z3.f.c(-597813052, new c42.e(c5Var, lVar, lVar2, j8, rVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.a(rVar, i14, c5Var, j8, lVar, lVar2, i15);
        }
    }

    public static final b3 f(long j8, boolean z14, bc bcVar, m mVar, int i14) {
        long jA;
        long jD;
        x1 x1Var = n.f135158a;
        d3 d3Var = d3.f87817a;
        long jA2 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
        long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
        long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
        long jA3 = zl.a.a(mVar);
        long jA4 = zl.a.a(mVar);
        long jA5 = zl.a.a(mVar);
        long jA6 = zl.a.a(mVar);
        long j14 = d92.b.a(mVar).k().f63527d;
        long jB = d92.b.a(mVar).i().a().b();
        long jA7 = zl.a.a(mVar);
        long jX3 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
        long jC = d92.b.a(mVar).k().c();
        long jE = d92.b.a(mVar).e().e();
        if (z14) {
            mVar.C(-23632362);
            jA = d92.b.a(mVar).j().a();
            mVar.f();
        } else {
            mVar.C(-23579011);
            mVar.f();
            d0.f128823b.getClass();
            jA = d0.f128831j;
        }
        long j15 = jA;
        if (bcVar.a(DateTime.now(DateTimeZone.UTC).withTimeAtStartOfDay().getMillis())) {
            mVar.C(-23409193);
            jD = d92.b.a(mVar).k().b();
            mVar.f();
        } else {
            mVar.C(-23356555);
            jD = d92.b.a(mVar).k().d();
            mVar.f();
        }
        d3Var.getClass();
        return d3.b(j8, jA2, jX, jA3, jX2, jA4, jA5, jA6, j14, jB, jA7, jX3, jC, jE, jD, j15, mVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final Configuration g(m mVar, int i14) {
        String str;
        Object obj;
        x1 x1Var = n.f135158a;
        Configuration configuration = (Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a);
        boolean zB = mVar.B(configuration);
        Object objQ = mVar.q();
        if (zB) {
            obj = objQ;
            if (i14 != 6) {
                str = "sat";
            } else if (i14 != 7) {
                str = "mon";
            } else {
                str = "sun";
            }
            Configuration configuration2 = new Configuration();
            configuration2.updateFrom(configuration);
            Locale[] localeArr = {new Locale.Builder().setLocale(Locale.getDefault()).setUnicodeLocaleKeyword("fw", str).build()};
            h7.g gVar = h7.g.f82327b;
            configuration2.setLocales(h7.g.b(new LocaleList(localeArr)).f82328a.getLocaleList());
            mVar.K(configuration2);
            obj = configuration2;
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                obj = objQ;
                if (i14 != 6) {
                    str = "sat";
                } else if (i14 != 7) {
                    str = "mon";
                } else {
                    str = "sun";
                }
                Configuration configuration3 = new Configuration();
                configuration3.updateFrom(configuration);
                Locale[] localeArr2 = {new Locale.Builder().setLocale(Locale.getDefault()).setUnicodeLocaleKeyword("fw", str).build()};
                h7.g gVar2 = h7.g.f82327b;
                configuration3.setLocales(h7.g.b(new LocaleList(localeArr2)).f82328a.getLocaleList());
                mVar.K(configuration3);
                obj = configuration3;
            }
        }
        obj = objQ;
        return (Configuration) obj;
    }
}
