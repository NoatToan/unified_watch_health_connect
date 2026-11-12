package in1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import cn1.t;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.g1;
import gl1.y;
import ho.d0;
import i3.mc;
import i3.ye;
import java.util.Locale;
import km1.v;
import l72.h1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepEditKt$SleepEditModal$1$1$1", f = "SleepEdit.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f94507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94507b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94507b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94506a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f94506a = 1;
                if (this.f94507b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: in1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepEditKt$SleepEditModal$4$5$1", f = "SleepEdit.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1804b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DateTime f94508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<DateTime> f94509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<DateTime> f94510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1804b(DateTime dateTime, p1<DateTime> p1Var, p1<DateTime> p1Var2, t13.d<? super C1804b> dVar) {
            super(2, dVar);
            this.f94508a = dateTime;
            this.f94509b = p1Var;
            this.f94510c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1804b(this.f94508a, this.f94509b, this.f94510c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1804b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<DateTime> p1Var = this.f94509b;
            DateTime dateTimeWithTime = this.f94508a.withTime(p1Var.getF182175a().getHourOfDay(), p1Var.getF182175a().getMinuteOfHour(), 0, 0);
            dateTimeWithTime.getClass();
            if (dateTimeWithTime.isAfter(this.f94510c.getF182175a())) {
                dateTimeWithTime = dateTimeWithTime.minusDays(1);
                dateTimeWithTime.getClass();
            }
            p1Var.setValue(dateTimeWithTime);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0159  */
    /* JADX WARN: Code duplicated, block: B:105:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0184  */
    /* JADX WARN: Code duplicated, block: B:110:0x0199  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x020b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0219  */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:139:0x0249  */
    /* JADX WARN: Code duplicated, block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0257  */
    /* JADX WARN: Code duplicated, block: B:146:0x0268  */
    /* JADX WARN: Code duplicated, block: B:147:0x026c  */
    /* JADX WARN: Code duplicated, block: B:150:0x028b  */
    /* JADX WARN: Code duplicated, block: B:151:0x028e  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x02de  */
    /* JADX WARN: Code duplicated, block: B:170:0x030c  */
    /* JADX WARN: Code duplicated, block: B:173:0x031b  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, boolean z15, v vVar, b0 b0Var, mc mcVar, e23.a<Unit> aVar, e23.l<? super v, Unit> lVar, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        e23.a<Unit> aVar2;
        boolean z17;
        o0 o0Var;
        boolean z18;
        e23.a<Unit> aVar3;
        boolean z19;
        p2 p2VarI0;
        int i17;
        p3.m.a aVar4;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ;
        int i18;
        Context context;
        DateTime dateTimeR;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ3;
        p1 p1Var2;
        DateTime dateTime;
        int millis;
        String strC;
        boolean zB;
        Object objQ4;
        boolean z28;
        boolean zK;
        Object objQ5;
        int i19;
        int i24;
        e23.a aVar5;
        int i25;
        int i26;
        int i27;
        Object objQ6;
        c.q qVarC;
        int i28;
        int i29;
        boolean z29;
        Object d0Var;
        int i30;
        Object objQ7;
        DateTime dateTimeC;
        int i34;
        int i35;
        int i36;
        boolean zR;
        int i37;
        b0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1971705334);
        int i38 = i15 & 1;
        if (i38 != 0) {
            i16 = i14 | 6;
            z16 = z14;
        } else if ((i14 & 6) == 0) {
            z16 = z14;
            i16 = (o0VarE.h(z16) ? 4 : 2) | i14;
        } else {
            z16 = z14;
            i16 = i14;
        }
        int i39 = i15 & 2;
        if (i39 == 0) {
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.h(z15) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zR = o0VarE.B(vVar);
                } else {
                    zR = o0VarE.r(vVar);
                }
                if (zR) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i16 |= i37;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(b0Var)) {
                    i36 = 2048;
                } else {
                    i36 = 1024;
                }
                i16 |= i36;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(mcVar)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i16 |= i35;
            }
            if ((i14 & 196608) == 0) {
                if ((i15 & 32) == 0) {
                    aVar2 = aVar;
                    int i44 = o0VarE.r(aVar2) ? 131072 : 65536;
                    i16 |= i44;
                } else {
                    aVar2 = aVar;
                }
                i16 |= i44;
            } else {
                aVar2 = aVar;
            }
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(lVar)) {
                    i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i34 = 524288;
                }
                i16 |= i34;
            }
            if ((i16 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                o0VarE.G0();
                i17 = i14 & 1;
                aVar4 = p3.m.f135153a;
                if (i17 != 0 || o0VarE.o0()) {
                    if (i38 != 0) {
                        z16 = true;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if ((i15 & 32) != 0) {
                        boolean zR2 = o0VarE.r(b0Var);
                        if ((57344 & i16) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zR2 | z26;
                        objQ = o0VarE.q();
                        if (z27) {
                            objQ = new t(b0Var, mcVar, 22);
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new t(b0Var, mcVar, 22);
                                o0VarE.K(objQ);
                            }
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ;
                        z25 = z24;
                        z18 = z16;
                        i18 = i16 & (-458753);
                        aVar2 = aVar6;
                    } else {
                        z25 = z24;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    b10.c cVar = new b10.c(new l22.a(context));
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                    dateTimeR = v.r(vVar);
                    if (dateTimeR == null) {
                        dateTimeR = DateTime.now();
                    }
                    DateTime dateTime2 = dateTimeR;
                    objQ2 = o0VarE.q();
                    aVar4.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        sn1.a.f160413a.getClass();
                        objQ2 = p0.n(sn1.a.b(vVar));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p1) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        sn1.a.f160413a.getClass();
                        dateTimeC = sn1.a.c(vVar);
                        if (dateTimeC.isAfter((DateTime) p1Var.getF182175a())) {
                            dateTimeC = dateTimeC.minusDays(1);
                            dateTimeC.getClass();
                        }
                        objQ3 = p0.n(dateTimeC);
                        o0VarE.K(objQ3);
                    }
                    p1Var2 = (p1) objQ3;
                    dateTime = (DateTime) p1Var2.getF182175a();
                    DateTime dateTime3 = (DateTime) p1Var.getF182175a();
                    if (dateTime != null || dateTime3 == null) {
                        millis = 0;
                    } else {
                        millis = (int) ((dateTime3.getMillis() - dateTime.getMillis()) / ((long) 1000));
                    }
                    strC = cVar.f14213c.c(millis);
                    zB = o0VarE.B((DateTime) p1Var2.getF182175a()) | o0VarE.B((DateTime) p1Var.getF182175a());
                    objQ4 = o0VarE.q();
                    if (zB || objQ4 == c2565a) {
                        objQ4 = p0.n(strC);
                        o0VarE.K(objQ4);
                    }
                    p1 p1Var3 = (p1) objQ4;
                    if ((i18 & 896) != 256 || ((i18 & 512) != 0 && o0VarE.r(vVar))) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zK = z28 | o0VarE.k(millis);
                    objQ5 = o0VarE.q();
                    if (!zK || objQ5 == c2565a) {
                        i19 = 0;
                        i24 = 1;
                        b21.k kVar = new b21.k((Object) vVar, millis, p1Var2, p1Var, 5);
                        o0VarE.K(kVar);
                        objQ5 = kVar;
                    } else {
                        i19 = 0;
                        i24 = 1;
                    }
                    aVar5 = (e23.a) objQ5;
                    g.h hVar = new g.h();
                    i25 = 3670016 & i18;
                    if (i25 == 1048576) {
                        i26 = i24;
                    } else {
                        i26 = i19;
                    }
                    i27 = (o0VarE.B(aVar5) ? 1 : 0) | i26;
                    objQ6 = o0VarE.q();
                    if (i27 == 0 || objQ6 == c2565a) {
                        objQ6 = new g1(2, aVar5, lVar);
                        o0VarE.K(objQ6);
                    }
                    qVarC = w.c(hVar, (e23.l) objQ6, o0VarE, i19);
                    if (z18) {
                        i28 = R.string.lbl_edit_sleep_times;
                    } else {
                        i28 = R.string.lbl_add_sleep_times;
                    }
                    String strQ = y.Q(o0VarE, i28);
                    String upperCase = y.Q(o0VarE, R.string.lbl_save).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    boolean zR3 = o0VarE.r(context);
                    if (i25 == 1048576) {
                        i29 = i24;
                    } else {
                        i29 = i19;
                    }
                    z29 = ((((zR3 ? 1 : 0) | i29) | (o0VarE.B(aVar5) ? 1 : 0)) == true ? 1 : 0) | (o0VarE.r(qVarC) ? 1 : 0);
                    Object objQ8 = o0VarE.q();
                    if (z29 == 0 || objQ8 == c2565a) {
                        o0Var = o0VarE;
                        i30 = 131072;
                        d0Var = new d0((Object) context, (Object) lVar, (Object) aVar5, false, (Object) qVarC, 9);
                        o0Var.K(d0Var);
                    } else {
                        o0Var = o0VarE;
                        i30 = 131072;
                        d0Var = objQ8;
                    }
                    e23.a aVar7 = (e23.a) d0Var;
                    if ((((458752 & i18) ^ 196608) <= i30 && o0Var.B(aVar2)) || (i18 & 196608) == i30) {
                    }
                    objQ7 = o0Var.q();
                    if (i19 == 0 || objQ7 == c2565a) {
                        objQ7 = new ii0.h(aVar2, 15);
                        o0Var.K(objQ7);
                    }
                    h1.a(strQ, upperCase, mcVar, false, aVar7, (e23.a) objQ7, z3.f.c(-470355398, new ye(z25, z18, dateTime2, cVar, zIs24HourFormat, p1Var3, millis, p1Var2, p1Var), o0Var), o0Var, ((i18 >> 6) & 896) | 1572864, 8);
                    aVar3 = aVar2;
                    z19 = z25;
                } else {
                    o0VarE.e();
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                    }
                    z25 = z15;
                }
                z18 = z16;
                i18 = i16;
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                b10.c cVar2 = new b10.c(new l22.a(context));
                boolean zIs24HourFormat2 = DateFormat.is24HourFormat(context);
                dateTimeR = v.r(vVar);
                if (dateTimeR == null) {
                    dateTimeR = DateTime.now();
                }
                DateTime dateTime4 = dateTimeR;
                objQ2 = o0VarE.q();
                aVar4.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    sn1.a.f160413a.getClass();
                    objQ2 = p0.n(sn1.a.b(vVar));
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    sn1.a.f160413a.getClass();
                    dateTimeC = sn1.a.c(vVar);
                    if (dateTimeC.isAfter((DateTime) p1Var.getF182175a())) {
                        dateTimeC = dateTimeC.minusDays(1);
                        dateTimeC.getClass();
                    }
                    objQ3 = p0.n(dateTimeC);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p1) objQ3;
                dateTime = (DateTime) p1Var2.getF182175a();
                DateTime dateTime5 = (DateTime) p1Var.getF182175a();
                if (dateTime != null) {
                    millis = 0;
                } else {
                    millis = 0;
                }
                strC = cVar2.f14213c.c(millis);
                zB = o0VarE.B((DateTime) p1Var2.getF182175a()) | o0VarE.B((DateTime) p1Var.getF182175a());
                objQ4 = o0VarE.q();
                if (zB) {
                    objQ4 = p0.n(strC);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = p0.n(strC);
                    o0VarE.K(objQ4);
                }
                p1 p1Var4 = (p1) objQ4;
                if ((i18 & 896) != 256) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                zK = z28 | o0VarE.k(millis);
                objQ5 = o0VarE.q();
                if (zK) {
                    i19 = 0;
                    i24 = 1;
                    b21.k kVar2 = new b21.k((Object) vVar, millis, p1Var2, p1Var, 5);
                    o0VarE.K(kVar2);
                    objQ5 = kVar2;
                } else {
                    i19 = 0;
                    i24 = 1;
                    b21.k kVar3 = new b21.k((Object) vVar, millis, p1Var2, p1Var, 5);
                    o0VarE.K(kVar3);
                    objQ5 = kVar3;
                }
                aVar5 = (e23.a) objQ5;
                g.h hVar2 = new g.h();
                i25 = 3670016 & i18;
                if (i25 == 1048576) {
                    i26 = i24;
                } else {
                    i26 = i19;
                }
                i27 = (o0VarE.B(aVar5) ? 1 : 0) | i26;
                objQ6 = o0VarE.q();
                if (i27 == 0) {
                    objQ6 = new g1(2, aVar5, lVar);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new g1(2, aVar5, lVar);
                    o0VarE.K(objQ6);
                }
                qVarC = w.c(hVar2, (e23.l) objQ6, o0VarE, i19);
                if (z18) {
                    i28 = R.string.lbl_edit_sleep_times;
                } else {
                    i28 = R.string.lbl_add_sleep_times;
                }
                String strQ2 = y.Q(o0VarE, i28);
                String upperCase2 = y.Q(o0VarE, R.string.lbl_save).toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                boolean zR4 = o0VarE.r(context);
                if (i25 == 1048576) {
                    i29 = i24;
                } else {
                    i29 = i19;
                }
                z29 = ((((zR4 ? 1 : 0) | i29) | (o0VarE.B(aVar5) ? 1 : 0)) == true ? 1 : 0) | (o0VarE.r(qVarC) ? 1 : 0);
                Object objQ9 = o0VarE.q();
                if (z29 == 0) {
                    o0Var = o0VarE;
                    i30 = 131072;
                    d0Var = new d0((Object) context, (Object) lVar, (Object) aVar5, false, (Object) qVarC, 9);
                    o0Var.K(d0Var);
                } else {
                    o0Var = o0VarE;
                    i30 = 131072;
                    d0Var = new d0((Object) context, (Object) lVar, (Object) aVar5, false, (Object) qVarC, 9);
                    o0Var.K(d0Var);
                }
                e23.a aVar8 = (e23.a) d0Var;
                i19 = ((458752 & i18) ^ 196608) <= i30 ? i24 : i24;
                objQ7 = o0Var.q();
                if (i19 == 0) {
                    objQ7 = new ii0.h(aVar2, 15);
                    o0Var.K(objQ7);
                } else {
                    objQ7 = new ii0.h(aVar2, 15);
                    o0Var.K(objQ7);
                }
                h1.a(strQ2, upperCase2, mcVar, false, aVar8, (e23.a) objQ7, z3.f.c(-470355398, new ye(z25, z18, dateTime4, cVar2, zIs24HourFormat2, p1Var4, millis, p1Var2, p1Var), o0Var), o0Var, ((i18 >> 6) & 896) | 1572864, 8);
                aVar3 = aVar2;
                z19 = z25;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z16;
                aVar3 = aVar2;
                z19 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(z18, z19, vVar, b0Var, mcVar, aVar3, lVar, i14, i15);
            }
        }
        i16 |= 48;
        if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zR = o0VarE.B(vVar);
            } else {
                zR = o0VarE.r(vVar);
            }
            if (zR) {
                i37 = 256;
            } else {
                i37 = 128;
            }
            i16 |= i37;
        }
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(b0Var)) {
                i36 = 2048;
            } else {
                i36 = 1024;
            }
            i16 |= i36;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(mcVar)) {
                i35 = 16384;
            } else {
                i35 = 8192;
            }
            i16 |= i35;
        }
        if ((i14 & 196608) == 0) {
            if ((i15 & 32) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                }
                i16 |= i44;
            } else {
                aVar2 = aVar;
            }
            i16 |= i44;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 1572864) == 0) {
            if (o0VarE.r(lVar)) {
                i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i34 = 524288;
            }
            i16 |= i34;
        }
        if ((i16 & 599187) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i16 & 1, z17)) {
            o0VarE.G0();
            i17 = i14 & 1;
            aVar4 = p3.m.f135153a;
            if (i17 != 0) {
                if (i38 != 0) {
                    z16 = true;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if ((i15 & 32) != 0) {
                    boolean zR5 = o0VarE.r(b0Var);
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zR5 | z26;
                    objQ = o0VarE.q();
                    if (z27) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t(b0Var, mcVar, 22);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new t(b0Var, mcVar, 22);
                        o0VarE.K(objQ);
                    }
                    e23.a<Unit> aVar9 = (e23.a) objQ;
                    z25 = z24;
                    z18 = z16;
                    i18 = i16 & (-458753);
                    aVar2 = aVar9;
                } else {
                    z25 = z24;
                    z18 = z16;
                    i18 = i16;
                }
            } else {
                if (i38 != 0) {
                    z16 = true;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if ((i15 & 32) != 0) {
                    boolean zR6 = o0VarE.r(b0Var);
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zR6 | z26;
                    objQ = o0VarE.q();
                    if (z27) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t(b0Var, mcVar, 22);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new t(b0Var, mcVar, 22);
                        o0VarE.K(objQ);
                    }
                    e23.a<Unit> aVar10 = (e23.a) objQ;
                    z25 = z24;
                    z18 = z16;
                    i18 = i16 & (-458753);
                    aVar2 = aVar10;
                } else {
                    z25 = z24;
                    z18 = z16;
                    i18 = i16;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b10.c cVar3 = new b10.c(new l22.a(context));
            boolean zIs24HourFormat3 = DateFormat.is24HourFormat(context);
            dateTimeR = v.r(vVar);
            if (dateTimeR == null) {
                dateTimeR = DateTime.now();
            }
            DateTime dateTime6 = dateTimeR;
            objQ2 = o0VarE.q();
            aVar4.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                sn1.a.f160413a.getClass();
                objQ2 = p0.n(sn1.a.b(vVar));
                o0VarE.K(objQ2);
            }
            p1Var = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                sn1.a.f160413a.getClass();
                dateTimeC = sn1.a.c(vVar);
                if (dateTimeC.isAfter((DateTime) p1Var.getF182175a())) {
                    dateTimeC = dateTimeC.minusDays(1);
                    dateTimeC.getClass();
                }
                objQ3 = p0.n(dateTimeC);
                o0VarE.K(objQ3);
            }
            p1Var2 = (p1) objQ3;
            dateTime = (DateTime) p1Var2.getF182175a();
            DateTime dateTime7 = (DateTime) p1Var.getF182175a();
            if (dateTime != null) {
                millis = 0;
            } else {
                millis = 0;
            }
            strC = cVar3.f14213c.c(millis);
            zB = o0VarE.B((DateTime) p1Var2.getF182175a()) | o0VarE.B((DateTime) p1Var.getF182175a());
            objQ4 = o0VarE.q();
            if (zB) {
                objQ4 = p0.n(strC);
                o0VarE.K(objQ4);
            } else {
                objQ4 = p0.n(strC);
                o0VarE.K(objQ4);
            }
            p1 p1Var5 = (p1) objQ4;
            if ((i18 & 896) != 256) {
                z28 = true;
            } else {
                z28 = true;
            }
            zK = z28 | o0VarE.k(millis);
            objQ5 = o0VarE.q();
            if (zK) {
                i19 = 0;
                i24 = 1;
                b21.k kVar4 = new b21.k((Object) vVar, millis, p1Var2, p1Var, 5);
                o0VarE.K(kVar4);
                objQ5 = kVar4;
            } else {
                i19 = 0;
                i24 = 1;
                b21.k kVar5 = new b21.k((Object) vVar, millis, p1Var2, p1Var, 5);
                o0VarE.K(kVar5);
                objQ5 = kVar5;
            }
            aVar5 = (e23.a) objQ5;
            g.h hVar3 = new g.h();
            i25 = 3670016 & i18;
            if (i25 == 1048576) {
                i26 = i24;
            } else {
                i26 = i19;
            }
            i27 = (o0VarE.B(aVar5) ? 1 : 0) | i26;
            objQ6 = o0VarE.q();
            if (i27 == 0) {
                objQ6 = new g1(2, aVar5, lVar);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new g1(2, aVar5, lVar);
                o0VarE.K(objQ6);
            }
            qVarC = w.c(hVar3, (e23.l) objQ6, o0VarE, i19);
            if (z18) {
                i28 = R.string.lbl_edit_sleep_times;
            } else {
                i28 = R.string.lbl_add_sleep_times;
            }
            String strQ3 = y.Q(o0VarE, i28);
            String upperCase3 = y.Q(o0VarE, R.string.lbl_save).toUpperCase(Locale.ROOT);
            upperCase3.getClass();
            boolean zR7 = o0VarE.r(context);
            if (i25 == 1048576) {
                i29 = i24;
            } else {
                i29 = i19;
            }
            z29 = ((((zR7 ? 1 : 0) | i29) | (o0VarE.B(aVar5) ? 1 : 0)) == true ? 1 : 0) | (o0VarE.r(qVarC) ? 1 : 0);
            Object objQ10 = o0VarE.q();
            if (z29 == 0) {
                o0Var = o0VarE;
                i30 = 131072;
                d0Var = new d0((Object) context, (Object) lVar, (Object) aVar5, false, (Object) qVarC, 9);
                o0Var.K(d0Var);
            } else {
                o0Var = o0VarE;
                i30 = 131072;
                d0Var = new d0((Object) context, (Object) lVar, (Object) aVar5, false, (Object) qVarC, 9);
                o0Var.K(d0Var);
            }
            e23.a aVar11 = (e23.a) d0Var;
            if (((458752 & i18) ^ 196608) <= i30) {
            }
            objQ7 = o0Var.q();
            if (i19 == 0) {
                objQ7 = new ii0.h(aVar2, 15);
                o0Var.K(objQ7);
            } else {
                objQ7 = new ii0.h(aVar2, 15);
                o0Var.K(objQ7);
            }
            h1.a(strQ3, upperCase3, mcVar, false, aVar11, (e23.a) objQ7, z3.f.c(-470355398, new ye(z25, z18, dateTime6, cVar3, zIs24HourFormat3, p1Var5, millis, p1Var2, p1Var), o0Var), o0Var, ((i18 >> 6) & 896) | 1572864, 8);
            aVar3 = aVar2;
            z19 = z25;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z18 = z16;
            aVar3 = aVar2;
            z19 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.r(z18, z19, vVar, b0Var, mcVar, aVar3, lVar, i14, i15);
        }
    }
}
