package av0;

import ak0.z;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import androidx.lifecycle.v1;
import c.q;
import c.w;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import gl1.y;
import gv0.n;
import java.util.ArrayList;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.compose.InjectKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f13201a;

        public a(x3 x3Var) {
            this.f13201a = x3Var;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            ParametersHolder parametersHolder;
            e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f13201a);
            return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.messenger.InviteToMessengerScreenKt$InviteToMessengerScreen$1$1", f = "InviteToMessengerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f13202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f13202a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f13202a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f13202a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.messenger.InviteToMessengerScreenKt$InviteToMessengerScreen$3$1", f = "InviteToMessengerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f13203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f13204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gv0.d dVar, String str, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f13203a = dVar;
            this.f13204b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f13203a, this.f13204b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            gv0.d dVar = this.f13203a;
            dVar.getClass();
            String str = this.f13204b;
            str.getClass();
            ge1.b.T(v1.a(dVar), null, null, new n(dVar, str, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.messenger.InviteToMessengerScreenKt$InviteToMessengerScreen$4$1", f = "InviteToMessengerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f13205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f13206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g3<pu0.b>> f13207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f13208d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13209a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f13209a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.g gVar, e23.a<Unit> aVar, x3<g3<pu0.b>> x3Var, p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f13205a = gVar;
            this.f13206b = aVar;
            this.f13207c = x3Var;
            this.f13208d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f13205a, this.f13206b, this.f13207c, this.f13208d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f13209a[this.f13207c.getF182175a().f35300a.ordinal()];
            if (i14 != 1) {
                p1<Boolean> p1Var = this.f13208d;
                if (i14 == 2) {
                    h.b(p1Var, true);
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    h.b(p1Var, false);
                }
            } else {
                Toast.makeText(this.f13205a, R.string.txt_error_occurred, 0).show();
                this.f13206b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.messenger.InviteToMessengerScreenKt$InviteToMessengerScreen$5$1$1$1", f = "InviteToMessengerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f13210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f13211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<Intent, f.a> f13212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f13213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pu0.b f13214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gv0.d f13215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f13216g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.g gVar, String str, q<Intent, f.a> qVar, e23.a<Unit> aVar, pu0.b bVar, gv0.d dVar, p1<Boolean> p1Var, t13.d<? super e> dVar2) {
            super(2, dVar2);
            this.f13210a = gVar;
            this.f13211b = str;
            this.f13212c = qVar;
            this.f13213d = aVar;
            this.f13214e = bVar;
            this.f13215f = dVar;
            this.f13216g = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f13210a, this.f13211b, this.f13212c, this.f13213d, this.f13214e, this.f13215f, this.f13216g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            av0.e eVar = new av0.e(this.f13214e, this.f13215f, 2);
            p1<Boolean> p1Var = this.f13216g;
            h.c(this.f13210a, this.f13211b, this.f13212c, eVar, new z(p1Var, 13), new z(p1Var, 14), this.f13213d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gv0.d dVar, final String str, final boolean z14, final e23.a<Unit> aVar, m mVar, final int i14) {
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        b.g gVar;
        p1 p1Var;
        p1 p1Var2;
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1274416283);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objA = o0VarE.A(c.n.f22332a);
            b.g gVar2 = objA instanceof b.g ? (b.g) objA : null;
            if (gVar2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new p(dVar, str, z14, aVar, i14, i16) { // from class: av0.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f13185a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ gv0.d f13186b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f13187c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ boolean f13188d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f13189e;

                    {
                        this.f13185a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f13185a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT3 = p0.t(1);
                                h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                o0VarE.L(414512006);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
                p1 p1VarQ = p0.q(null, o0VarE);
                o0VarE.L(855641119);
                boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
                Object objQ = o0VarE.q();
                m.a aVar2 = m.f135153a;
                if (zB) {
                    objQ = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                        o0VarE.K(objQ);
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
                uu0.c cVar = (uu0.c) objQ;
                Object objQ2 = o0VarE.q();
                aVar2.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1 p1Var3 = (p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n("");
                    o0VarE.K(objQ3);
                }
                p1 p1Var4 = (p1) objQ3;
                p1 p1VarC = s9.c.c(dVar.f79195l, o0VarE);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1 p1Var5 = (p1) objQ4;
                if (str == null) {
                    o0VarE.C(-1374761761);
                    Unit unit = Unit.INSTANCE;
                    boolean z15 = (i15 & 7168) == 2048;
                    Object objQ5 = o0VarE.q();
                    if (z15 || objQ5 == c2565a) {
                        objQ5 = new b(aVar, null);
                        o0VarE.K(objQ5);
                    }
                    l0.e((p) objQ5, unit, o0VarE);
                    o0VarE.g0(false);
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i17 = 1;
                    pVar = new p(dVar, str, z14, aVar, i14, i17) { // from class: av0.f

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f13185a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ gv0.d f13186b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f13187c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ boolean f13188d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ e23.a f13189e;

                        {
                            this.f13185a = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f13185a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iT = p0.t(1);
                                    h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iT2 = p0.t(1);
                                    h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iT3 = p0.t(1);
                                    h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    o0VarE.C(-1374682649);
                    int i18 = i15 & 112;
                    boolean zR = o0VarE.r(dVar) | (i18 == 32);
                    Object objQ6 = o0VarE.q();
                    if (zR || objQ6 == c2565a) {
                        objQ6 = new c(dVar, str, null);
                        o0VarE.K(objQ6);
                    }
                    l0.e((p) objQ6, str, o0VarE);
                    o0VarE.g0(false);
                    g.h hVar = new g.h();
                    boolean zR2 = (i18 == 32) | o0VarE.r(dVar);
                    Object objQ7 = o0VarE.q();
                    if (zR2 || objQ7 == c2565a) {
                        objQ7 = new a42.i(17, dVar, str);
                        o0VarE.K(objQ7);
                    }
                    q qVarC = w.c(hVar, (l) objQ7, o0VarE, 0);
                    fw.p pVar2 = ((g3) p1VarC.getF182175a()).f35300a;
                    boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(gVar2) | ((i15 & 7168) == 2048);
                    Object objQ8 = o0VarE.q();
                    if (zB2 || objQ8 == c2565a) {
                        gVar = gVar2;
                        p1Var = p1VarC;
                        p1Var2 = p1Var5;
                        d dVar2 = new d(gVar, aVar, p1Var, p1Var2, null);
                        o0VarE.K(dVar2);
                        objQ8 = dVar2;
                    } else {
                        gVar = gVar2;
                        p1Var = p1VarC;
                        p1Var2 = p1Var5;
                    }
                    l0.e((p) objQ8, pVar2, o0VarE);
                    o0Var = o0VarE;
                    gl1.d.b(y.Q(o0VarE, R.string.lbl_invite_to_messenger), aVar, ((Boolean) p1Var2.getF182175a()).booleanValue(), null, null, null, z3.f.c(-1797401907, new g(p1Var, dVar, aVar, z14, gVar, qVarC, cVar, p1Var2, p1Var4, p1Var3), o0VarE), o0Var, ((i15 >> 6) & 112) | 1572864, 56);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i19 = 2;
            pVar = new p(dVar, str, z14, aVar, i14, i19) { // from class: av0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f13185a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gv0.d f13186b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f13187c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f13188d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f13189e;

                {
                    this.f13185a = i19;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f13185a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT3 = p0.t(1);
                            h.a(this.f13186b, this.f13187c, this.f13188d, this.f13189e, (m) obj, iT3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void b(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final boolean c(Context context, String str, q<Intent, f.a> qVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
        Integer numValueOf;
        SmsManager smsManagerForSubscriptionId;
        context.getClass();
        str.getClass();
        qVar.getClass();
        aVar4.getClass();
        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96724m, j22.a.f96723l};
        bVar.getClass();
        if (!j22.b.k(aVarArr)) {
            return d(context, userFullName, str, qVar);
        }
        aVar2.invoke();
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        p0Var.f105807a = 1;
        p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
        p0Var2.f105807a = 1;
        i iVar = new i(p0Var2, p0Var, aVar, aVar3, aVar4, userFullName, str, qVar);
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, new Intent("BROADCAST_SMS_SENT").setPackage(context.getPackageName()), 201326592);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            SmsManager smsManager = (SmsManager) a7.b.getSystemService(contextC, SmsManager.class);
            numValueOf = smsManager != null ? Integer.valueOf(smsManager.getSubscriptionId()) : null;
        } else {
            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
        }
        wx2.b bVar2 = new wx2.b(contextC);
        if (numValueOf == null || numValueOf.intValue() == -1) {
            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
        }
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        int simState = ((TelephonyManager) systemService).getSimState();
        Integer num = numValueOf;
        if (num.intValue() == -1 || simState == 1) {
            return d(context, userFullName, str, qVar);
        }
        if (i14 >= 31) {
            SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(contextC, SmsManager.class);
            smsManagerForSubscriptionId = smsManager2 != null ? smsManager2.createForSubscriptionId(num.intValue()) : null;
        } else {
            smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(num.intValue());
        }
        String string = context.getString(R.string.lbl_invite_to_garmin_messenger, "https://messenger.garmin.com/invite", userFullName);
        string.getClass();
        if (smsManagerForSubscriptionId == null) {
            return false;
        }
        if (!iVar.f13217a) {
            a7.b.registerReceiver(context, iVar, new IntentFilter("BROADCAST_SMS_SENT"), 2);
            iVar.f13217a = true;
        }
        int size = smsManagerForSubscriptionId.divideMessage(string).size();
        p0Var.f105807a = size;
        if (size <= 1) {
            return bVar2.c(str, string, broadcast).f188010a;
        }
        ArrayList arrayList = new ArrayList(p0Var.f105807a);
        int i15 = p0Var.f105807a;
        for (int i16 = 0; i16 < i15; i16++) {
            arrayList.add(broadcast);
        }
        try {
            return bVar2.b(str, string, arrayList).f188010a;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final boolean d(Context context, String str, String str2, q<Intent, f.a> qVar) {
        String string = context.getString(R.string.lbl_invite_to_garmin_messenger, "https://messenger.garmin.com/invite", str);
        string.getClass();
        if (Telephony.Sms.getDefaultSmsPackage(context) == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + str2));
        intent.putExtra("sms_body", string);
        intent.putExtra("exit_on_sent", true);
        qVar.a(intent, null);
        return true;
    }
}
