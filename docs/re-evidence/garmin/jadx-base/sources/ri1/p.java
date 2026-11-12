package ri1;

import android.app.Application;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.Serializable;
import java.util.List;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import pc0.n0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import ui1.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lri1/p;", "Landroidx/lifecycle/u1;", "", "unitId", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(JLandroid/app/Application;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f152857l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f152859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f152860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f152861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f152862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f152863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f152864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f152865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f152866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f152867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f152868k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lti1/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationViewModel$activationScreenFlow$1", f = "InReachLTEActivationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super ti1.a>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super ti1.a> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = p.f152857l;
            p.this.y4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationViewModel$initActivationScreen$1", f = "InReachLTEActivationViewModel.kt", l = {123, 126, 130, 145, SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f152870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f152871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r0 f152872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Serializable f152873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f152874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f152875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f152876g;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f152878a;

            static {
                int[] iArr = new int[si1.w.values().length];
                try {
                    iArr[si1.w.PROCESSING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[si1.w.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f152878a = iArr;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:35:0x010f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0116  */
        /* JADX WARN: Code duplicated, block: B:40:0x011b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0129  */
        /* JADX WARN: Code duplicated, block: B:44:0x013a  */
        /* JADX WARN: Code duplicated, block: B:45:0x013d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0140  */
        /* JADX WARN: Code duplicated, block: B:49:0x014c  */
        /* JADX WARN: Code duplicated, block: B:60:0x0194  */
        /* JADX WARN: Code duplicated, block: B:63:0x0199  */
        /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:71:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:72:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:79:0x01db  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v42, types: [T, si1.w] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objA;
            int i14;
            Object objC;
            Integer num;
            i0 i0Var;
            String strD;
            r0 r0Var;
            Integer num2;
            r0 r0Var2;
            Object objL;
            r0 r0Var3;
            T t7;
            r0 r0Var4;
            Object objC2;
            Long lA;
            si1.w wVar;
            int i15;
            ui1.j jVar;
            boolean z14;
            int i16;
            ui1.j jVar2;
            boolean z15;
            ui1.j jVar3;
            r0 r0Var5;
            Integer num3;
            int i17;
            p2 p2Var;
            Object value2;
            boolean z16;
            long j8;
            boolean z17;
            boolean z18;
            si1.w wVar2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = this.f152876g;
            p pVar = p.this;
            if (i18 == 0) {
                o13.r.b(obj);
                p2 p2Var2 = pVar.f152867j;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, new ti1.a(true, false, 0L, false, false, null, false, null, 254, null)));
                ui1.l lVar = (ui1.l) pVar.f152860c.getValue();
                long j14 = pVar.f152858a;
                this.f152876g = 1;
                objA = lVar.a(j14, this);
                if (objA != aVar) {
                }
                return aVar;
            }
            if (i18 == 1) {
                o13.r.b(obj);
                objA = obj;
            } else {
                if (i18 == 2) {
                    int i19 = this.f152874e;
                    Integer num4 = this.f152870a;
                    o13.r.b(obj);
                    num = num4;
                    i14 = i19;
                    objC = obj;
                    i0Var = (i0) objC;
                    int i24 = p.f152857l;
                    strD = pVar.x4().d(pVar.f152858a);
                    r0Var = new r0();
                    if (strD != null) {
                        ui1.l lVar2 = (ui1.l) pVar.f152860c.getValue();
                        this.f152870a = num;
                        this.f152871b = i0Var;
                        this.f152872c = r0Var;
                        this.f152873d = r0Var;
                        this.f152874e = i14;
                        this.f152876g = 3;
                        objL = lVar2.l(strD, this);
                        if (objL != aVar) {
                            r0Var3 = r0Var;
                            if (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b) objL) == com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FINISHED) {
                                wVar = si1.w.SUCCESS;
                            } else {
                                int i25 = p.f152857l;
                                lA = pVar.x4().a(pVar.f152858a);
                                if (lA != null) {
                                    if (System.currentTimeMillis() - lA.longValue() <= 3600000) {
                                        wVar = si1.w.PROCESSING;
                                    } else {
                                        wVar = si1.w.FAILED;
                                    }
                                } else {
                                    wVar = si1.w.FAILED;
                                }
                            }
                            r0Var2 = r0Var3;
                            num2 = num;
                            t7 = wVar;
                            r0Var2.f105810a = t7;
                            if (r0Var.f105810a == si1.w.SUCCESS) {
                            }
                            r0Var4 = r0Var;
                            i15 = i14;
                            jVar = i0Var.f171293a;
                            z14 = i0Var.f171294b;
                            i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                            if (i16 != 1) {
                                jVar2 = null;
                            } else {
                                jVar2 = null;
                            }
                            p2 p2Var3 = pVar.f152863f;
                            this.f152870a = num2;
                            this.f152871b = null;
                            this.f152872c = r0Var4;
                            this.f152873d = jVar;
                            this.f152874e = i15;
                            this.f152875f = z14;
                            this.f152876g = 5;
                            p2Var3.setValue(jVar2);
                            if (Unit.INSTANCE != aVar) {
                                z15 = z14;
                                jVar3 = jVar;
                                r0Var5 = r0Var4;
                                num3 = num2;
                                i17 = i15;
                            }
                        }
                    } else {
                        num2 = num;
                        r0Var2 = r0Var;
                        t7 = si1.w.UNKNOWN;
                        r0Var2.f105810a = t7;
                        if (r0Var.f105810a == si1.w.SUCCESS) {
                        }
                        r0Var4 = r0Var;
                        i15 = i14;
                        jVar = i0Var.f171293a;
                        z14 = i0Var.f171294b;
                        i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                        if (i16 != 1) {
                            jVar2 = null;
                        } else {
                            jVar2 = null;
                        }
                        p2 p2Var4 = pVar.f152863f;
                        this.f152870a = num2;
                        this.f152871b = null;
                        this.f152872c = r0Var4;
                        this.f152873d = jVar;
                        this.f152874e = i15;
                        this.f152875f = z14;
                        this.f152876g = 5;
                        p2Var4.setValue(jVar2);
                        if (Unit.INSTANCE != aVar) {
                            z15 = z14;
                            jVar3 = jVar;
                            r0Var5 = r0Var4;
                            num3 = num2;
                            i17 = i15;
                        }
                    }
                    return aVar;
                }
                if (i18 == 3) {
                    int i26 = this.f152874e;
                    r0Var3 = (r0) this.f152873d;
                    r0 r0Var6 = this.f152872c;
                    i0Var = this.f152871b;
                    num = this.f152870a;
                    o13.r.b(obj);
                    r0Var = r0Var6;
                    i14 = i26;
                    objL = obj;
                    if (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b) objL) == com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FINISHED) {
                        wVar = si1.w.SUCCESS;
                    } else {
                        int i27 = p.f152857l;
                        lA = pVar.x4().a(pVar.f152858a);
                        if (lA != null) {
                            if (System.currentTimeMillis() - lA.longValue() <= 3600000) {
                                wVar = si1.w.PROCESSING;
                            } else {
                                wVar = si1.w.FAILED;
                            }
                        } else {
                            wVar = si1.w.FAILED;
                        }
                    }
                    r0Var2 = r0Var3;
                    num2 = num;
                    t7 = wVar;
                    r0Var2.f105810a = t7;
                    if (r0Var.f105810a == si1.w.SUCCESS || i0Var.f171295c) {
                        r0Var4 = r0Var;
                        i15 = i14;
                        jVar = i0Var.f171293a;
                        z14 = i0Var.f171294b;
                        i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                        if (i16 != 1) {
                            jVar2 = null;
                        } else {
                            jVar2 = null;
                        }
                        p2 p2Var5 = pVar.f152863f;
                        this.f152870a = num2;
                        this.f152871b = null;
                        this.f152872c = r0Var4;
                        this.f152873d = jVar;
                        this.f152874e = i15;
                        this.f152875f = z14;
                        this.f152876g = 5;
                        p2Var5.setValue(jVar2);
                        if (Unit.INSTANCE != aVar) {
                            z15 = z14;
                            jVar3 = jVar;
                            r0Var5 = r0Var4;
                            num3 = num2;
                            i17 = i15;
                        }
                    } else {
                        int i28 = p.f152857l;
                        n0 n0VarX4 = pVar.x4();
                        long j15 = pVar.f152858a;
                        n0VarX4.b(j15);
                        ui1.l lVar3 = (ui1.l) pVar.f152860c.getValue();
                        this.f152870a = num2;
                        this.f152871b = null;
                        this.f152872c = r0Var;
                        this.f152873d = null;
                        this.f152874e = i14;
                        this.f152876g = 4;
                        objC2 = lVar3.c(j15, this);
                        if (objC2 != aVar) {
                            r0Var4 = r0Var;
                            i0Var = (i0) objC2;
                            r0Var4.f105810a = si1.w.UNKNOWN;
                            i15 = i14;
                            jVar = i0Var.f171293a;
                            z14 = i0Var.f171294b;
                            i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                            if (i16 != 1) {
                                jVar2 = null;
                            } else {
                                jVar2 = null;
                            }
                            p2 p2Var6 = pVar.f152863f;
                            this.f152870a = num2;
                            this.f152871b = null;
                            this.f152872c = r0Var4;
                            this.f152873d = jVar;
                            this.f152874e = i15;
                            this.f152875f = z14;
                            this.f152876g = 5;
                            p2Var6.setValue(jVar2);
                            if (Unit.INSTANCE != aVar) {
                                z15 = z14;
                                jVar3 = jVar;
                                r0Var5 = r0Var4;
                                num3 = num2;
                                i17 = i15;
                            }
                        }
                    }
                    return aVar;
                }
                if (i18 == 4) {
                    int i29 = this.f152874e;
                    r0Var4 = this.f152872c;
                    num2 = this.f152870a;
                    o13.r.b(obj);
                    i14 = i29;
                    objC2 = obj;
                    i0Var = (i0) objC2;
                    r0Var4.f105810a = si1.w.UNKNOWN;
                    i15 = i14;
                    jVar = i0Var.f171293a;
                    z14 = i0Var.f171294b;
                    i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                    if (i16 != 1 || i16 == 2) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    p2 p2Var7 = pVar.f152863f;
                    this.f152870a = num2;
                    this.f152871b = null;
                    this.f152872c = r0Var4;
                    this.f152873d = jVar;
                    this.f152874e = i15;
                    this.f152875f = z14;
                    this.f152876g = 5;
                    p2Var7.setValue(jVar2);
                    if (Unit.INSTANCE != aVar) {
                        z15 = z14;
                        jVar3 = jVar;
                        r0Var5 = r0Var4;
                        num3 = num2;
                        i17 = i15;
                    }
                    return aVar;
                }
                if (i18 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z19 = this.f152875f;
                int i30 = this.f152874e;
                ui1.j jVar4 = (ui1.j) this.f152873d;
                r0 r0Var7 = this.f152872c;
                Integer num5 = this.f152870a;
                o13.r.b(obj);
                z15 = z19;
                jVar3 = jVar4;
                i17 = i30;
                r0Var5 = r0Var7;
                num3 = num5;
            }
            p2Var = pVar.f152867j;
            do {
                value2 = p2Var.getValue();
                ti1.a aVar2 = (ti1.a) value2;
                if (jVar3 == ui1.j.ERROR) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                j8 = pVar.f152858a;
                if (jVar3 == ui1.j.GO_TO_PLAN_MANAGEMENT) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                wVar2 = (si1.w) r0Var5.f105810a;
                aVar2.getClass();
                wVar2.getClass();
            } while (!p2Var.b(value2, new ti1.a(false, z16, j8, z17, z18, num3, z15, wVar2)));
            return Unit.INSTANCE;
            List list = (List) objA;
            i14 = !list.isEmpty() ? 1 : 0;
            yx2.i iVar = (yx2.i) h0.e0(0, list);
            Integer num6 = iVar != null ? new Integer(iVar.f200099l) : null;
            ui1.l lVar4 = (ui1.l) pVar.f152860c.getValue();
            long j16 = pVar.f152858a;
            this.f152870a = num6;
            this.f152874e = i14;
            this.f152876g = 2;
            objC = lVar4.c(j16, this);
            if (objC != aVar) {
                num = num6;
                i0Var = (i0) objC;
                int i210 = p.f152857l;
                strD = pVar.x4().d(pVar.f152858a);
                r0Var = new r0();
                if (strD != null) {
                    ui1.l lVar5 = (ui1.l) pVar.f152860c.getValue();
                    this.f152870a = num;
                    this.f152871b = i0Var;
                    this.f152872c = r0Var;
                    this.f152873d = r0Var;
                    this.f152874e = i14;
                    this.f152876g = 3;
                    objL = lVar5.l(strD, this);
                    if (objL != aVar) {
                        r0Var3 = r0Var;
                        if (((com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b) objL) == com.garmin.android.apps.connectmobile.device.setup.domain.model.a.b.FINISHED) {
                            wVar = si1.w.SUCCESS;
                        } else {
                            int i211 = p.f152857l;
                            lA = pVar.x4().a(pVar.f152858a);
                            if (lA != null) {
                                if (System.currentTimeMillis() - lA.longValue() <= 3600000) {
                                    wVar = si1.w.PROCESSING;
                                } else {
                                    wVar = si1.w.FAILED;
                                }
                            } else {
                                wVar = si1.w.FAILED;
                            }
                        }
                        r0Var2 = r0Var3;
                        num2 = num;
                        t7 = wVar;
                        r0Var2.f105810a = t7;
                        if (r0Var.f105810a == si1.w.SUCCESS) {
                        }
                        r0Var4 = r0Var;
                        i15 = i14;
                        jVar = i0Var.f171293a;
                        z14 = i0Var.f171294b;
                        i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                        if (i16 != 1) {
                            jVar2 = null;
                        } else {
                            jVar2 = null;
                        }
                        p2 p2Var8 = pVar.f152863f;
                        this.f152870a = num2;
                        this.f152871b = null;
                        this.f152872c = r0Var4;
                        this.f152873d = jVar;
                        this.f152874e = i15;
                        this.f152875f = z14;
                        this.f152876g = 5;
                        p2Var8.setValue(jVar2);
                        if (Unit.INSTANCE != aVar) {
                            z15 = z14;
                            jVar3 = jVar;
                            r0Var5 = r0Var4;
                            num3 = num2;
                            i17 = i15;
                            p2Var = pVar.f152867j;
                            do {
                                value2 = p2Var.getValue();
                                ti1.a aVar3 = (ti1.a) value2;
                                if (jVar3 == ui1.j.ERROR) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                j8 = pVar.f152858a;
                                if (jVar3 == ui1.j.GO_TO_PLAN_MANAGEMENT) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (i17 != 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                wVar2 = (si1.w) r0Var5.f105810a;
                                aVar3.getClass();
                                wVar2.getClass();
                            } while (!p2Var.b(value2, new ti1.a(false, z16, j8, z17, z18, num3, z15, wVar2)));
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    num2 = num;
                    r0Var2 = r0Var;
                    t7 = si1.w.UNKNOWN;
                    r0Var2.f105810a = t7;
                    if (r0Var.f105810a == si1.w.SUCCESS) {
                    }
                    r0Var4 = r0Var;
                    i15 = i14;
                    jVar = i0Var.f171293a;
                    z14 = i0Var.f171294b;
                    i16 = a.f152878a[((si1.w) r0Var4.f105810a).ordinal()];
                    if (i16 != 1) {
                        jVar2 = null;
                    } else {
                        jVar2 = null;
                    }
                    p2 p2Var9 = pVar.f152863f;
                    this.f152870a = num2;
                    this.f152871b = null;
                    this.f152872c = r0Var4;
                    this.f152873d = jVar;
                    this.f152874e = i15;
                    this.f152875f = z14;
                    this.f152876g = 5;
                    p2Var9.setValue(jVar2);
                    if (Unit.INSTANCE != aVar) {
                        z15 = z14;
                        jVar3 = jVar;
                        r0Var5 = r0Var4;
                        num3 = num2;
                        i17 = i15;
                        p2Var = pVar.f152867j;
                        do {
                            value2 = p2Var.getValue();
                            ti1.a aVar4 = (ti1.a) value2;
                            if (jVar3 == ui1.j.ERROR) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            j8 = pVar.f152858a;
                            if (jVar3 == ui1.j.GO_TO_PLAN_MANAGEMENT) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i17 != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            wVar2 = (si1.w) r0Var5.f105810a;
                            aVar4.getClass();
                            wVar2.getClass();
                        } while (!p2Var.b(value2, new ti1.a(false, z16, j8, z17, z18, num3, z15, wVar2)));
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        }
    }

    static {
        new a(null);
    }

    public p(long j8, Application application) {
        application.getClass();
        this.f152858a = j8;
        this.f152859b = application;
        this.f152860c = o13.m.b(new ri1.b(4));
        this.f152861d = o13.m.b(new ri1.b(5));
        this.f152862e = o13.m.b(new ri1.b(6));
        p2 p2VarA = q2.a(null);
        this.f152863f = p2VarA;
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f152864g = r53.s.K(p2VarA, aVarA, k2.a.a(aVar, 2), null);
        p2 p2VarA2 = q2.a(new ti1.b(0L, false, false, false, false, false, 63, null));
        this.f152865h = p2VarA2;
        this.f152866i = r53.s.K(p2VarA2, v1.a(this), k2.a.a(aVar, 2), new ti1.b(0L, false, false, false, false, false, 63, null));
        p2 p2VarA3 = q2.a(new ti1.a(false, false, 0L, false, false, null, false, null, 255, null));
        this.f152867j = p2VarA3;
        this.f152868k = r53.s.K(new r53.v(new b(null), p2VarA3), v1.a(this), k2.a.a(aVar, 2), new ti1.a(false, false, 0L, false, false, null, false, null, 255, null));
    }

    public final n0 x4() {
        return (n0) this.f152862e.getValue();
    }

    public final void y4() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new c(null), 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lri1/p$a;", "", "<init>", "()V", "", "ONE_HOUR_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
