package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import a42.y;
import ak0.v;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c2.n3;
import c2.u;
import c2.x2;
import ck0.w;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import f5.z0;
import g02.s0;
import h5.e0;
import i3.e5;
import i3.fe;
import java.util.List;
import kotlin.t1;
import kotlin.t3;
import l72.d3;
import l72.i3;
import lc.u0;
import o53.b0;
import o72.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.k0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.x1;
import p3.x3;
import r53.p2;
import tn2.n0;
import ty1.q1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35341a = new a();

        @Override // e23.l
        public final Object invoke(Object obj) {
            throw new IllegalStateException(e5.f(obj, "Unknown screen "));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/b$b", "Ldk0/o;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0611b implements dk0.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sc.f<sc.j> f35342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k f35343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f35344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35345d;

        public C0611b(sc.f<sc.j> fVar, com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k kVar, com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, e23.a<Unit> aVar) {
            this.f35342a = fVar;
            this.f35343b = kVar;
            this.f35344c = eVar;
            this.f35345d = aVar;
        }

        @Override // dk0.o
        public final void a() {
            ht.i iVar = (ht.i) KoinJavaComponent.get$default(ht.i.class, null, null, 6, null);
            ht.i.c(iVar, ht.k.DISPLAY, ht.m.DETAILS, ht.l.PAYWALL, 8);
            iVar.a(ht.o.PAYWALL_OPEN);
        }

        public final void b() {
            this.f35344c.f35413g.a(ht.o.PAYWALL_CLOSE);
            this.f35345d.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/b$c", "", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35346a;

        public c(e23.a<Unit> aVar) {
            this.f35346a = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivityKt$NavigationView$4$4$3$1$1", f = "GCPlusHomeActivity.kt", l = {533}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f35348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f35349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<String> f35350d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fe feVar, com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, x3<String> x3Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f35348b = feVar;
            this.f35349c = eVar;
            this.f35350d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f35348b, this.f35349c, this.f35350d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35347a;
            if (i14 == 0) {
                o13.r.b(obj);
                x3<String> x3Var = this.f35350d;
                if (x3Var.getF182175a() != null) {
                    String f182175a = x3Var.getF182175a();
                    f182175a.getClass();
                    this.f35347a = 1;
                    if (d3.c(this.f35348b, f182175a, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f35349c.f35410d.f204261a.E4("FEEDBACK_SNACKBAR_MESSAGE");
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/b$e", "Lak0/v;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f35351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f35352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t3 f35353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sc.f<sc.j> f35354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ak0.a f35355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f35356f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivityKt$NavigationView$4$4$delegate$1$openSubscriptionManagement$1", f = "GCPlusHomeActivity.kt", l = {494}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35357a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f35358b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t3 f35359c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, t3 t3Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f35358b = eVar;
                this.f35359c = t3Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f35358b, this.f35359c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35357a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f35357a = 1;
                    obj = this.f35358b.B4(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                this.f35359c.a((String) obj);
                return Unit.INSTANCE;
            }
        }

        public e(b0 b0Var, com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, t3 t3Var, sc.f<sc.j> fVar, ak0.a aVar, Context context) {
            this.f35351a = b0Var;
            this.f35352b = eVar;
            this.f35353c = t3Var;
            this.f35354d = fVar;
            this.f35355e = aVar;
            this.f35356f = context;
        }

        @Override // ak0.v
        public final void a() {
            this.f35354d.a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h.INSTANCE);
        }

        @Override // ak0.v
        public final void b() {
            this.f35355e.p(this.f35356f);
        }

        @Override // ak0.v
        public final void c() {
            ge1.b.T(this.f35351a, null, null, new a(this.f35352b, this.f35353c, null), 3);
        }

        @Override // ak0.v
        public final void d(bk0.f fVar) {
            fVar.getClass();
            this.f35354d.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g(fVar.f18478a));
        }

        @Override // ak0.v
        public final void e() {
            this.f35354d.a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public f(Object obj) {
            super(0, obj, ck0.m.class, "handleOnClickReveal", "handleOnClickReveal()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            final ck0.m mVar = (ck0.m) this.receiver;
            ck0.d dVar = mVar.f27868a.f27890h;
            if (dVar == null) {
                mVar.f27870c.setValue(ck0.v.c.f27896a);
                ge1.b.T(v1.a(mVar), null, null, new ck0.n(mVar, null), 3);
            } else {
                b63.o.Companion companion = b63.o.INSTANCE;
                Integer num = dVar.f27825c;
                int iIntValue = num != null ? num.intValue() : 180;
                companion.getClass();
                b63.o oVarD = g22.l.d(companion);
                b63.i.INSTANCE.getClass();
                b63.o oVarE = b63.q.e(oVarD, iIntValue, b63.i.f16190d);
                b63.o oVar = dVar.f27824b;
                b63.o oVar2 = oVar == null ? oVarE : oVar;
                p2 p2Var = mVar.f27871d;
                int i14 = dVar.f27823a - 1;
                final int i15 = 0;
                e23.a aVar = new e23.a() { // from class: ck0.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                m mVar2 = mVar;
                                mVar2.f27871d.setValue(null);
                                mVar2.f27870c.setValue(v.c.f27896a);
                                ge1.b.T(v1.a(mVar2), null, null, new n(mVar2, null), 3);
                                break;
                            default:
                                mVar.f27871d.setValue(null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i16 = 1;
                p2Var.k(null, new w(i14, oVar2, oVarE, aVar, new e23.a() { // from class: ck0.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                m mVar2 = mVar;
                                mVar2.f27871d.setValue(null);
                                mVar2.f27870c.setValue(v.c.f27896a);
                                ge1.b.T(v1.a(mVar2), null, null, new n(mVar2, null), 3);
                                break;
                            default:
                                mVar.f27871d.setValue(null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<rj0.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ak0.a f35360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f35361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f35362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ak0.a aVar, Context context, b0 b0Var) {
            super(1, kotlin.jvm.internal.s.a.class, "navigateToDestination", "NavigationView$lambda$4$7$navigateToDestination(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusDelegate;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/garmin/android/apps/connectmobile/gcplus/data/education/GCPlusEducationDestination;)V", 0);
            this.f35360a = aVar;
            this.f35361b = context;
            this.f35362c = b0Var;
        }

        @Override // e23.l
        public final Unit invoke(rj0.b bVar) {
            rj0.b bVar2 = bVar;
            bVar2.getClass();
            int i14 = s.f35376a[bVar2.ordinal()];
            ak0.a aVar = this.f35360a;
            Context context = this.f35361b;
            switch (i14) {
                case 1:
                    aVar.j(context);
                    break;
                case 2:
                    aVar.s(context);
                    break;
                case 3:
                    aVar.b(context);
                    break;
                case 4:
                    aVar.a(context);
                    break;
                case 5:
                    aVar.t(context);
                    break;
                case 6:
                    aVar.h(context);
                    break;
                case 7:
                    ge1.b.T(this.f35362c, null, null, new ak0.s(aVar, context, null), 3);
                    break;
                case 8:
                    aVar.n(context, false);
                    break;
                default:
                    u0.r();
                    return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/b$h", "", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f35363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t3 f35364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35365c;

        public h(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, t3 t3Var, e23.a<Unit> aVar) {
            this.f35363a = eVar;
            this.f35364b = t3Var;
            this.f35365c = aVar;
        }

        public final void a() {
            this.f35365c.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.j, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f35366a = new i();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.j jVar) {
            return jVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f35367a = new j();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k kVar) {
            return kVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.l, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f35368a = new k();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.l lVar) {
            return lVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f35369a = new l();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar) {
            return aVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f35370a = new m();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i iVar) {
            return iVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f35371a = new n();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h hVar) {
            return hVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f35372a = new o();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f fVar) {
            return fVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.e, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f35373a = new p();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.e eVar) {
            return eVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f35374a = new q();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g gVar) {
            return gVar.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class r implements e23.l<com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.C0613c, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f35375a = new r();

        @Override // e23.l
        public final Object invoke(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.C0613c c0613c) {
            return c0613c.toString();
        }
    }

    public static final /* synthetic */ class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f35377b;

        static {
            int[] iArr = new int[rj0.b.values().length];
            try {
                iArr[rj0.b.LIVETRACK_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rj0.b.LIVETRACK_PROFILE_PRIVACY_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rj0.b.TRAILS_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rj0.b.CHALLENGES_HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rj0.b.EDIT_PROFILE_FRAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rj0.b.WORKOUTS_HOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rj0.b.PERFORMANCE_DASHBOARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rj0.b.NUTRITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f35376a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f35377b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, final ak0.a aVar, final ub1.i iVar, final e23.p<? super String, ? super String, Unit> pVar, final e23.a<Unit> aVar2, p3.m mVar, final int i14) {
        int i15;
        o0 o0Var;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        sc.j c0613c;
        o0 o0VarE = mVar.E(1712264759);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            t3 t3Var = (t3) o0VarE.A(t1.f91501s);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            g3 g3Var = (g3) p0.c(eVar.f35419m, o0VarE, 0).getF182175a();
            fw.p pVar3 = g3Var.f35300a;
            T t7 = g3Var.f35301b;
            int i17 = s.f35377b[pVar3.ordinal()];
            if (i17 == 1) {
                o0VarE.C(-1246639098);
                h4.r.a aVar3 = h4.r.S;
                h4.r rVarD = x2.d(aVar3, 1.0f);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                s0.b(u.f22885a.c(aVar3, h4.d.a.f81528f), 0.0f, o0VarE, 0, 2);
                o0VarE.g0(true);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 0;
                pVar2 = new e23.p() { // from class: ak0.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else if (i17 != 2) {
                o0VarE.C(-1245367075);
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.i iVar2 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i) t7;
                if (p005kotlin.jvm.internal.s.g(iVar2, com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.d.f35484a)) {
                    c0613c = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.j.INSTANCE;
                } else if (iVar2 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) {
                    t7.getClass();
                    c0613c = ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) t7).f35481a;
                } else if (iVar2 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e) {
                    t7.getClass();
                    c0613c = ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.e) t7).f35485a;
                } else if (iVar2 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.a) {
                    t7.getClass();
                    c0613c = ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.a) t7).f35479a;
                } else if (iVar2 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.b) {
                    t7.getClass();
                    c0613c = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.C0613c(((com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.b) t7).f35480a);
                } else {
                    if (iVar2 != null) {
                        u0.r();
                        return;
                    }
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "NavigationView", "homeScreenData is null. This should be impossible.");
                    aVar2.invoke();
                    o0VarE.g0(false);
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i19 = 3;
                    pVar2 = new e23.p() { // from class: ak0.f
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).intValue();
                                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                    break;
                                case 2:
                                    ((Integer) obj2).intValue();
                                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
                sc.f fVarT = oi0.c.T(new sc.j[]{c0613c}, o0VarE);
                b.u uVar = (b.u) o0VarE.A(g02.d.f74342a);
                List listK = x.k(t.W(o0VarE), w5.r.t(o0VarE));
                n0 n0Var = new n0(24);
                n0 n0Var2 = new n0(25);
                q1 q1Var = new q1(2);
                o0VarE.C(514069213);
                sc.e eVar2 = new sc.e(a.f35341a);
                z3.e eVarC = z3.f.c(888483385, new y(g3Var, fVarT, eVar, false, aVar2, 4), o0VarE);
                j jVar = j.f35367a;
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k.class), jVar, k0Var, eVarC);
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.l.class), k.f35368a, k0Var, z3.f.c(1945372305, new y(g3Var, eVar, uVar, pVar, 5), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a.class), l.f35369a, k0Var, z3.f.c(-1968024953, new y(context, aVar, eVar, false, aVar2, 6), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.class), m.f35370a, k0Var, z3.f.c(-799853827, new ak0.g(g3Var, uVar, t3Var, b0Var, eVar, fVarT, aVar, context, 0), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h.class), n.f35371a, k0Var, z3.f.c(1735172696, new y(uVar, eVar, aVar, iVar, 1), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f.class), o.f35372a, k0Var, z3.f.c(-1138893029, new ak0.h(g3Var, uVar, context, eVar, aVar, fVarT, 0), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.e.class), p.f35373a, k0Var, z3.f.c(-1974350613, new a42.a(g3Var, 2, context, uVar), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g.class), q.f35374a, k0Var, z3.f.c(468900710, new ak0.j((Object) g3Var, (Object) uVar, aVar, context, (Object) b0Var, 1), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.C0613c.class), r.f35375a, k0Var, z3.f.c(1653735793, new a42.a(eVar, t3Var, aVar2, 5), o0VarE));
                eVar2.a(t0Var.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.j.class), i.f35366a, k0Var, z3.f.c(1059096071, new ak0.p(aVar2, i16), o0VarE));
                Unit unit = Unit.INSTANCE;
                s70.b0 b0Var2 = new s70.b0(eVar2, 6);
                o0VarE.g0(false);
                sc.f.Companion companion = sc.f.INSTANCE;
                t.f(fVarT, null, null, null, listK, null, n0Var, n0Var2, q1Var, b0Var2, o0VarE, 0, 110);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0VarE.C(-1246412922);
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "NavigationView", "Error loading home screen data. Exiting activity.");
                aVar2.invoke();
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i24 = 2;
                pVar2 = new e23.p() { // from class: ak0.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i24) {
                            case 0:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar2;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i25 = 1;
            pVar2 = new e23.p() { // from class: ak0.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i25) {
                        case 0:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                            break;
                        case 2:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.a(eVar, aVar, iVar, pVar, aVar2, (p3.m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, i3 i3Var, boolean z14, boolean z15, e23.a aVar, e23.l lVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        int i17;
        int i18;
        e23.a aVar2;
        int i19;
        int i24;
        int i25;
        e23.l lVar2;
        int i26;
        int i27;
        int i28;
        boolean z17;
        boolean z18;
        boolean z19;
        e23.a aVar3;
        e23.l lVar3;
        p3.p2 p2VarI0;
        i3 i3Var2;
        boolean z24;
        boolean z25;
        e23.a aVar4;
        e23.l lVar4;
        Object objQ;
        i3 i3Var3 = i3Var;
        o0 o0VarE = mVar.E(1299420998);
        int i29 = (o0VarE.B(str) ? 4 : 2) | i14;
        int i30 = i15 & 2;
        if (i30 != 0) {
            i29 |= 48;
        } else if ((i14 & 48) == 0) {
            i29 |= (i14 & 64) == 0 ? o0VarE.B(i3Var3) : o0VarE.r(i3Var3) ? 32 : 16;
        }
        int i34 = i15 & 4;
        if (i34 == 0) {
            if ((i14 & 384) == 0) {
                z16 = z14;
                i29 |= o0VarE.h(z16) ? 256 : 128;
            }
            i16 = i15 & 8;
            if (i16 != 0) {
                if ((i14 & 3072) == 0) {
                    if (o0VarE.h(z15)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i29 |= i17;
                }
                i18 = i15 & 16;
                if (i18 != 0) {
                    i24 = i29 | 24576;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i24 = i29 | i19;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i27 = i24 | 196608;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i27 = i24 | i26;
                }
                i28 = 0;
                if ((599187 & i27) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i27 & 1, z17)) {
                    if (i30 != 0) {
                        i3Var2 = null;
                    } else {
                        i3Var2 = i3Var3;
                    }
                    if (i34 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i18 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i25 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                    }
                    fe feVar = (fe) objQ;
                    z02.d.a(false, z3.f.c(-1060460255, new ak0.n(z24, str, i3Var2, lVar4, z25, aVar4), o0VarE), z3.f.c(650190592, new ak0.o(feVar, i28), o0VarE), null, n3.f22788a, z3.f.c(1487175837, new ak0.q(eVar, feVar, 0), o0VarE), o0VarE, 197040, 9);
                    e23.a aVar5 = aVar4;
                    lVar3 = lVar4;
                    z18 = z25;
                    aVar3 = aVar5;
                    i3Var3 = i3Var2;
                    z19 = z24;
                } else {
                    o0VarE.e();
                    z18 = z15;
                    z19 = z16;
                    aVar3 = aVar2;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new ak0.r(str, i3Var3, z19, z18, aVar3, lVar3, eVar, i14, i15);
                }
            }
            i29 |= 3072;
            i18 = i15 & 16;
            if (i18 != 0) {
                i24 = i29 | 24576;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i24 = i29 | i19;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                i27 = i24 | 196608;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 = i24 | i26;
            }
            i28 = 0;
            if ((599187 & i27) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i27 & 1, z17)) {
                if (i30 != 0) {
                    i3Var2 = null;
                } else {
                    i3Var2 = i3Var3;
                }
                if (i34 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                }
                fe feVar2 = (fe) objQ;
                z02.d.a(false, z3.f.c(-1060460255, new ak0.n(z24, str, i3Var2, lVar4, z25, aVar4), o0VarE), z3.f.c(650190592, new ak0.o(feVar2, i28), o0VarE), null, n3.f22788a, z3.f.c(1487175837, new ak0.q(eVar, feVar2, 0), o0VarE), o0VarE, 197040, 9);
                e23.a aVar6 = aVar4;
                lVar3 = lVar4;
                z18 = z25;
                aVar3 = aVar6;
                i3Var3 = i3Var2;
                z19 = z24;
            } else {
                o0VarE.e();
                z18 = z15;
                z19 = z16;
                aVar3 = aVar2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(str, i3Var3, z19, z18, aVar3, lVar3, eVar, i14, i15);
            }
        }
        i29 |= 384;
        z16 = z14;
        i16 = i15 & 8;
        if (i16 != 0) {
            if ((i14 & 3072) == 0) {
                if (o0VarE.h(z15)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i29 |= i17;
            }
            i18 = i15 & 16;
            if (i18 != 0) {
                i24 = i29 | 24576;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i24 = i29 | i19;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                i27 = i24 | 196608;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 = i24 | i26;
            }
            i28 = 0;
            if ((599187 & i27) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i27 & 1, z17)) {
                if (i30 != 0) {
                    i3Var2 = null;
                } else {
                    i3Var2 = i3Var3;
                }
                if (i34 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
                }
                fe feVar3 = (fe) objQ;
                z02.d.a(false, z3.f.c(-1060460255, new ak0.n(z24, str, i3Var2, lVar4, z25, aVar4), o0VarE), z3.f.c(650190592, new ak0.o(feVar3, i28), o0VarE), null, n3.f22788a, z3.f.c(1487175837, new ak0.q(eVar, feVar3, 0), o0VarE), o0VarE, 197040, 9);
                e23.a aVar7 = aVar4;
                lVar3 = lVar4;
                z18 = z25;
                aVar3 = aVar7;
                i3Var3 = i3Var2;
                z19 = z24;
            } else {
                o0VarE.e();
                z18 = z15;
                z19 = z16;
                aVar3 = aVar2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(str, i3Var3, z19, z18, aVar3, lVar3, eVar, i14, i15);
            }
        }
        i29 |= 3072;
        i18 = i15 & 16;
        if (i18 != 0) {
            i24 = i29 | 24576;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if (o0VarE.r(aVar2)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i24 = i29 | i19;
        }
        i25 = i15 & 32;
        if (i25 != 0) {
            i27 = i24 | 196608;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if (o0VarE.r(lVar2)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i27 = i24 | i26;
        }
        i28 = 0;
        if ((599187 & i27) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i27 & 1, z17)) {
            if (i30 != 0) {
                i3Var2 = null;
            } else {
                i3Var2 = i3Var3;
            }
            if (i34 != 0) {
                z24 = true;
            } else {
                z24 = z16;
            }
            if (i16 != 0) {
                z25 = false;
            } else {
                z25 = z15;
            }
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i25 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar4 = (fe) objQ;
            z02.d.a(false, z3.f.c(-1060460255, new ak0.n(z24, str, i3Var2, lVar4, z25, aVar4), o0VarE), z3.f.c(650190592, new ak0.o(feVar4, i28), o0VarE), null, n3.f22788a, z3.f.c(1487175837, new ak0.q(eVar, feVar4, 0), o0VarE), o0VarE, 197040, 9);
            e23.a aVar8 = aVar4;
            lVar3 = lVar4;
            z18 = z25;
            aVar3 = aVar8;
            i3Var3 = i3Var2;
            z19 = z24;
        } else {
            o0VarE.e();
            z18 = z15;
            z19 = z16;
            aVar3 = aVar2;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.r(str, i3Var3, z19, z18, aVar3, lVar3, eVar, i14, i15);
        }
    }
}
