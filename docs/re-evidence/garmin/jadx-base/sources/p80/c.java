package p80;

import aa2.g;
import android.content.Context;
import android.content.IntentSender;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.room.a0;
import b50.o;
import c.q;
import c.w;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h4.k;
import h5.e0;
import i3.fe;
import i3.mh;
import l72.f0;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import u1.a2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkScreenKt$CompanionDeviceLinkScreen$1$1", f = "CompanionDeviceLinkScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntentSender f136345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f136346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<f.i, f.a> f136347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IntentSender intentSender, f fVar, q<f.i, f.a> qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f136345a = intentSender;
            this.f136346b = fVar;
            this.f136347c = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f136345a, this.f136346b, this.f136347c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            IntentSender intentSender = this.f136345a;
            if (intentSender != null) {
                f.i iVarA = new f.i.a(intentSender).a();
                p2 p2Var = this.f136346b.f136372e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, null, false, false, 0, 25)));
                this.f136347c.a(iVarA, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkScreenKt$CompanionDeviceLinkScreen$2$1", f = "CompanionDeviceLinkScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f136348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f136349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<d> f136350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f136351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f136352e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkScreenKt$CompanionDeviceLinkScreen$2$1$1", f = "CompanionDeviceLinkScreen.kt", l = {81}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f136353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fe f136354b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f136355c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fe feVar, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f136354b = feVar;
                this.f136355c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f136354b, this.f136355c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f136353a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f136353a = 1;
                    if (fe.b(this.f136354b, this.f136355c, null, null, this, 14) == aVar) {
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
        public b(f fVar, b0 b0Var, x3<d> x3Var, fe feVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f136348a = fVar;
            this.f136349b = b0Var;
            this.f136350c = x3Var;
            this.f136351d = feVar;
            this.f136352e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f136348a, this.f136349b, this.f136350c, this.f136351d, this.f136352e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f136350c.getF182175a().f136361d) {
                p2 p2Var = this.f136348a.f136372e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, null, false, false, 0, 23)));
                ge1.b.T(this.f136349b, null, null, new a(this.f136351d, this.f136352e, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkScreenKt$CompanionDeviceLinkScreen$3$1$1", f = "CompanionDeviceLinkScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2583c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f136356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f136357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2583c(f fVar, Context context, t13.d<? super C2583c> dVar) {
            super(2, dVar);
            this.f136356a = fVar;
            this.f136357b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2583c(this.f136356a, this.f136357b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2583c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f136356a.x4(this.f136357b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n80.a aVar, l<? super Boolean, Unit> lVar, e23.a<Unit> aVar2, boolean z14, m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        p3.p2 p2VarI0;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objQ;
        m.a aVar3;
        e23.a aVar4;
        ViewModelStoreOwner viewModelStoreOwnerA;
        f fVar;
        p1 p1VarC;
        boolean zR;
        Object objQ2;
        q qVarC;
        IntentSender intentSender;
        boolean zR2;
        Object objQ3;
        Object objQ4;
        m.a.C2565a c2565a;
        b0 b0Var;
        Object objQ5;
        fe feVar;
        String strQ;
        boolean zB;
        Object objQ6;
        f fVar2;
        p1 p1Var;
        o0 o0VarP = a0.p(lVar, aVar2, mVar, -1506831689);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarP.B(aVar) : o0VarP.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarP.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarP.r(aVar2) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarP.h(z15) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarP.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                if ((i16 & 14) != 4 || ((i16 & 8) != 0 && o0VarP.r(aVar))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i16 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z19 | z24;
                objQ = o0VarP.q();
                aVar3 = m.f135153a;
                if (z25) {
                    objQ = new o(aVar, z18, 9);
                    o0VarP.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o(aVar, z18, 9);
                        o0VarP.K(objQ);
                    }
                }
                aVar4 = (e23.a) objQ;
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA != null) {
                    h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), aVar4);
                o0VarP.g0(false);
                fVar = (f) u1VarResolveViewModel;
                p1VarC = s9.c.c(fVar.f136373f, o0VarP);
                g.i iVar = new g.i();
                zR = o0VarP.r(fVar) | ((i16 & 112) == 32);
                objQ2 = o0VarP.q();
                if (zR) {
                    objQ2 = new o50.a(25, fVar, lVar);
                    o0VarP.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new o50.a(25, fVar, lVar);
                        o0VarP.K(objQ2);
                    }
                }
                qVarC = w.c(iVar, (l) objQ2, o0VarP, 0);
                intentSender = ((d) p1VarC.getF182175a()).f136359b;
                zR2 = o0VarP.r(intentSender) | o0VarP.r(fVar) | o0VarP.r(qVarC);
                objQ3 = o0VarP.q();
                if (zR2) {
                    objQ3 = new a(intentSender, fVar, qVarC, null);
                    o0VarP.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a(intentSender, fVar, qVarC, null);
                        o0VarP.K(objQ3);
                    }
                }
                l0.e((p) objQ3, intentSender, o0VarP);
                objQ4 = o0VarP.q();
                aVar3.getClass();
                c2565a = m.a.f135155b;
                if (objQ4 == c2565a) {
                    objQ4 = l0.j(t13.h.f161748a, o0VarP);
                    o0VarP.K(objQ4);
                }
                b0Var = (b0) objQ4;
                objQ5 = o0VarP.q();
                if (objQ5 == c2565a) {
                    objQ5 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarP);
                }
                feVar = (fe) objQ5;
                strQ = y.Q(o0VarP, R.string.lbl_error_occurred);
                Boolean boolValueOf = Boolean.valueOf(((d) p1VarC.getF182175a()).f136361d);
                zB = o0VarP.B(p1VarC) | o0VarP.r(fVar) | o0VarP.r(b0Var) | o0VarP.B(strQ);
                objQ6 = o0VarP.q();
                if (!zB || objQ6 == c2565a) {
                    fVar2 = fVar;
                    b bVar = new b(fVar2, b0Var, p1VarC, feVar, strQ, null);
                    p1Var = p1VarC;
                    o0VarP.K(bVar);
                    objQ6 = bVar;
                } else {
                    fVar2 = fVar;
                    p1Var = p1VarC;
                }
                l0.e((p) objQ6, boolValueOf, o0VarP);
                z02.b.a(false, null, null, null, false, z3.f.c(-1493317907, new ck0.h(fVar2, (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b), z18, aVar2, feVar, p1Var), o0VarP), o0VarP, 196608, 31);
                z17 = z18;
            } else {
                o0VarP.e();
                z17 = z15;
            }
            p2VarI0 = o0VarP.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g(aVar, lVar, aVar2, z17, i14, i15, 14);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarP.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            if ((i16 & 14) != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            if ((i16 & 7168) == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z19 | z24;
            objQ = o0VarP.q();
            aVar3 = m.f135153a;
            if (z25) {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o(aVar, z18, 9);
                    o0VarP.K(objQ);
                }
            } else {
                objQ = new o(aVar, z18, 9);
                o0VarP.K(objQ);
            }
            aVar4 = (e23.a) objQ;
            o0VarP.L(-1614864554);
            v9.a.f176280a.getClass();
            viewModelStoreOwnerA = v9.a.a(o0VarP);
            if (viewModelStoreOwnerA != null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), aVar4);
            o0VarP.g0(false);
            fVar = (f) u1VarResolveViewModel2;
            p1VarC = s9.c.c(fVar.f136373f, o0VarP);
            g.i iVar2 = new g.i();
            zR = o0VarP.r(fVar) | ((i16 & 112) == 32);
            objQ2 = o0VarP.q();
            if (zR) {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new o50.a(25, fVar, lVar);
                    o0VarP.K(objQ2);
                }
            } else {
                objQ2 = new o50.a(25, fVar, lVar);
                o0VarP.K(objQ2);
            }
            qVarC = w.c(iVar2, (l) objQ2, o0VarP, 0);
            intentSender = ((d) p1VarC.getF182175a()).f136359b;
            zR2 = o0VarP.r(intentSender) | o0VarP.r(fVar) | o0VarP.r(qVarC);
            objQ3 = o0VarP.q();
            if (zR2) {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a(intentSender, fVar, qVarC, null);
                    o0VarP.K(objQ3);
                }
            } else {
                objQ3 = new a(intentSender, fVar, qVarC, null);
                o0VarP.K(objQ3);
            }
            l0.e((p) objQ3, intentSender, o0VarP);
            objQ4 = o0VarP.q();
            aVar3.getClass();
            c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ4);
            }
            b0Var = (b0) objQ4;
            objQ5 = o0VarP.q();
            if (objQ5 == c2565a) {
                objQ5 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarP);
            }
            feVar = (fe) objQ5;
            strQ = y.Q(o0VarP, R.string.lbl_error_occurred);
            Boolean boolValueOf2 = Boolean.valueOf(((d) p1VarC.getF182175a()).f136361d);
            zB = o0VarP.B(p1VarC) | o0VarP.r(fVar) | o0VarP.r(b0Var) | o0VarP.B(strQ);
            objQ6 = o0VarP.q();
            if (zB) {
                fVar2 = fVar;
                b bVar2 = new b(fVar2, b0Var, p1VarC, feVar, strQ, null);
                p1Var = p1VarC;
                o0VarP.K(bVar2);
                objQ6 = bVar2;
            } else {
                fVar2 = fVar;
                b bVar3 = new b(fVar2, b0Var, p1VarC, feVar, strQ, null);
                p1Var = p1VarC;
                o0VarP.K(bVar3);
                objQ6 = bVar3;
            }
            l0.e((p) objQ6, boolValueOf2, o0VarP);
            z02.b.a(false, null, null, null, false, z3.f.c(-1493317907, new ck0.h(fVar2, (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b), z18, aVar2, feVar, p1Var), o0VarP), o0VarP, 196608, 31);
            z17 = z18;
        } else {
            o0VarP.e();
            z17 = z15;
        }
        p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, lVar, aVar2, z17, i14, i15, 14);
        }
    }

    public static final void b(fe feVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, int i14, m mVar, int i15) {
        o0 o0VarE = mVar.E(206156660);
        int i16 = (o0VarE.r(aVar) ? 32 : 16) | i15 | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            z02.d.a(false, z3.f.c(2141242703, new p40.r(aVar2, 3), o0VarE), z3.f.c(-443073746, new p21.b(feVar, 5), o0VarE), null, null, z3.f.c(393911499, new at1.c(i14, aVar, 9), o0VarE), o0VarE, 197040, 25);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(feVar, (e23.a) aVar, (e23.a) aVar2, i14, i15);
        }
    }

    public static final void c(e23.a<Unit> aVar, e23.a<Unit> aVar2, int i14, m mVar, int i15) {
        o0 o0VarE = mVar.E(-483152600);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i15 | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h4.r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar3, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(y.P(i14, new Object[]{y.Q(o0VarE, R.string.app_name_garmin_connect)}, o0VarE), rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarX = x2.x(x2.f(aVar3, 1.0f), null, 3);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarX, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            fVar.getClass();
            mh.c(y.Q(o0VarE, R.string.msg_recommended_permission_skip), rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            bVar.getClass();
            f0Var.i(y.Q(o0VarE, R.string.lbl_skip_button), c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), false, aVar2, o0VarE, (i16 << 6) & 7168, 4);
            o0VarE = o0VarE;
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            bVar.getClass();
            f0Var.d((i16 << 12) & 57344, 9, aVar, c2.l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), y.Q(o0VarE, R.string.lbl_link_device), o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, i15);
        }
    }
}
