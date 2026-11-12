package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import ak0.u;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.f2;
import c22.j0;
import c22.s3;
import c80.c1;
import c80.o;
import c80.q;
import ch.qos.logback.core.net.SyslogConstants;
import ck0.t;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;
import d53.k;
import dk0.m;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import lc.u0;
import n70.h7;
import n70.k1;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import r53.z1;
import yx2.l;
import zd0.j1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aBa\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/e;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "homeDestination", "", "refreshSubscriptionCache", "Ln70/k1;", "getDashboardSectionVisibilityUseCase", "Ln70/h7;", "setDashboardSectionVisibilityUseCase", "Lze0/b;", "getFeedbackSnackbarMessageUseCase", "Loj0/f;", "gcPlusRepository", "La80/b;", "gcPlusPreferences", "Lht/i;", "gcPlusAnalytics", "Lak0/a;", "gcPlusDelegate", "Lz70/j;", "exclusiveOffersRepository", "Ldj1/a;", "notificationsRepository", "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;ZLn70/k1;Ln70/h7;Lze0/b;Loj0/f;La80/b;Lht/i;Lak0/a;Lz70/j;Ldj1/a;)V", "c", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {
    public static final /* synthetic */ int D = 0;
    public final b2 A;
    public final b2 B;
    public final List<q> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCPlusHomeActivity.b f35407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7 f35409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ze0.b f35410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oj0.f f35411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a80.b f35412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ht.i f35413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ak0.a f35414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z70.j f35415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj1.a f35416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f35417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f35418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f35419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f35420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o70.f f35423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f35424r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f35425t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f35426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f35427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f35428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f35429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p2 f35430z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$1", f = "GCPlusHomeViewModel.kt", l = {171}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k1 f35432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f35433c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$1$1", f = "GCPlusHomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0615a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ boolean f35434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f35435b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0615a(e eVar, t13.d<? super C0615a> dVar) {
                super(2, dVar);
                this.f35435b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0615a c0615a = new C0615a(this.f35435b, dVar);
                c0615a.f35434a = ((Boolean) obj).booleanValue();
                return c0615a;
            }

            @Override // e23.p
            public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0615a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                boolean z14 = this.f35434a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                p2 p2Var = this.f35435b.f35424r;
                g3.a aVar2 = g3.f35298f;
                Boolean boolValueOf = Boolean.valueOf(z14);
                aVar2.getClass();
                p2Var.k(null, g3.a.d(boolValueOf));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k1 k1Var, e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f35432b = k1Var;
            this.f35433c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f35432b, this.f35433c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35431a;
            if (i14 == 0) {
                r.b(obj);
                k1 k1Var = this.f35432b;
                e eVar = this.f35433c;
                r53.i<Boolean> iVarA = k1Var.a(eVar.f35423q);
                C0615a c0615a = new C0615a(eVar, null);
                this.f35431a = 1;
                if (s.k(iVarA, c0615a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$2", f = "GCPlusHomeViewModel.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35436a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f35438a;

            public a(e eVar) {
                this.f35438a = eVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                o oVar = (o) obj;
                e eVar = this.f35438a;
                g3 g3Var = (g3) eVar.f35419m.f150540a.getValue();
                i iVar = (i) g3Var.f35301b;
                if (g3Var.f35300a == fw.p.SUCCESS && (iVar instanceof i.c)) {
                    p2 p2Var = eVar.f35418l;
                    i.c cVar = (i.c) iVar;
                    u uVar = cVar.f35482b;
                    u uVar2 = new u(uVar.f3679a, uVar.f3680b, uVar.f3681c, uVar.f3682d, uVar.f3683e, oVar != null ? h.a(oVar) : null);
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.c cVar2 = cVar.f35481a;
                    bk0.d dVar2 = cVar.f35483c;
                    cVar2.getClass();
                    p2Var.k(null, g3.a(g3Var, new i.c(cVar2, uVar2, dVar2)));
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35436a;
            if (i14 == 0) {
                r.b(obj);
                e eVar = e.this;
                p2 f202862c = eVar.f35415i.getF202862c();
                a aVar2 = new a(eVar);
                this.f35436a = 1;
                if (f202862c.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lck0/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$showExclusiveDiscountsNotificationsDialog$1", f = "GCPlusHomeViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<r53.j<? super ck0.e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f35440b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = e.this.new d(dVar);
            dVar2.f35440b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super ck0.e> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            NotificationPreferencesDTO notificationPreferencesDTO;
            r53.j jVar = (r53.j) this.f35440b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35439a;
            e eVar = e.this;
            if (i14 == 0) {
                r.b(obj);
                boolean zM = eVar.f35412f.m();
                eVar.f35412f.g(true);
                if (!zM) {
                    dj1.a aVar2 = eVar.f35416j;
                    this.f35440b = jVar;
                    this.f35439a = 1;
                    obj = aVar2.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strF = b71.i.f("Successfully got notification preferences: ", v2Var);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GCPlusHomeViewModel", strF);
                p2 p2Var = eVar.f35430z;
                do {
                    value = p2Var.getValue();
                    notificationPreferencesDTO = (NotificationPreferencesDTO) ((v2.b) v2Var).f47386a;
                } while (!p2Var.b(value, new ck0.e(false, Boolean.valueOf(notificationPreferencesDTO.N0 && notificationPreferencesDTO.Z0))));
            } else {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                String strF2 = b71.i.f("Failed to get notification preferences: ", v2Var);
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "GCPlusHomeViewModel", strF2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$updateInitialSubscription$1", f = "GCPlusHomeViewModel.kt", l = {199, 200, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 216, 221, 223, 244, 241, 256, 274, 279}, m = "invokeSuspend", v = 2)
    public static final class C0616e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f35442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f35443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f35444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f35445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f35446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f35447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public GCPlusHomeActivity.b f35448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c80.s.a f35449h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f35450i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f35451j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f35452k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f35453l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f35454m;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.e$e$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel$updateInitialSubscription$1$1", f = "GCPlusHomeViewModel.kt", l = {219}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zd0.u f35457b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zd0.u uVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f35457b = uVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f35457b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35456a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f35456a = 1;
                    if (this.f35457b.g(this) == aVar) {
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

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.e$e$b */
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f35458a;

            static {
                int[] iArr = new int[c1.values().length];
                try {
                    iArr[c1.API_ISSUE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c1.NO_PAIRED_DEVICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c1.NO_PURCHASABLE_SUBSCRIPTIONS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c1.INVALID_USER_ROLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f35458a = iArr;
            }
        }

        public C0616e(t13.d<? super C0616e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C0616e c0616e = e.this.new C0616e(dVar);
            c0616e.f35454m = obj;
            return c0616e;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0616e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0348  */
        /* JADX WARN: Code duplicated, block: B:102:0x034b  */
        /* JADX WARN: Code duplicated, block: B:106:0x0377  */
        /* JADX WARN: Code duplicated, block: B:110:0x0388 A[Catch: CancellationException -> 0x0061, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:118:0x03bd, B:119:0x03c3, B:121:0x03c9, B:124:0x03d5, B:128:0x03dc, B:129:0x0409, B:10:0x0057, B:107:0x037c, B:108:0x0382, B:110:0x0388, B:114:0x0395), top: B:155:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:117:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:121:0x03c9 A[Catch: CancellationException -> 0x0061, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:118:0x03bd, B:119:0x03c3, B:121:0x03c9, B:124:0x03d5, B:128:0x03dc, B:129:0x0409, B:10:0x0057, B:107:0x037c, B:108:0x0382, B:110:0x0388, B:114:0x0395), top: B:155:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:126:0x03d9 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:129:0x0409 A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:118:0x03bd, B:119:0x03c3, B:121:0x03c9, B:124:0x03d5, B:128:0x03dc, B:129:0x0409, B:10:0x0057, B:107:0x037c, B:108:0x0382, B:110:0x0388, B:114:0x0395), top: B:155:0x0057 }] */
        /* JADX WARN: Code duplicated, block: B:133:0x045d  */
        /* JADX WARN: Code duplicated, block: B:135:0x0461  */
        /* JADX WARN: Code duplicated, block: B:137:0x046f  */
        /* JADX WARN: Code duplicated, block: B:139:0x0472  */
        /* JADX WARN: Code duplicated, block: B:141:0x0475  */
        /* JADX WARN: Code duplicated, block: B:147:0x048d  */
        /* JADX WARN: Code duplicated, block: B:148:0x049c  */
        /* JADX WARN: Code duplicated, block: B:152:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:161:0x03d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:0: B:119:0x03c3->B:162:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x0394 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0151  */
        /* JADX WARN: Code duplicated, block: B:29:0x015e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0183 A[PHI: r1 r13 r14
          0x0183: PHI (r1v9 com.garmin.android.apps.connectmobile.g3$a) = (r1v6 com.garmin.android.apps.connectmobile.g3$a), (r1v15 com.garmin.android.apps.connectmobile.g3$a) binds: [B:31:0x017f, B:20:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          0x0183: PHI (r13v6 r53.z1) = (r13v3 r53.z1), (r13v11 r53.z1) binds: [B:31:0x017f, B:20:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          0x0183: PHI (r14v16 java.lang.Object) = (r14v9 java.lang.Object), (r14v17 java.lang.Object) binds: [B:31:0x017f, B:20:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x01a8 A[PHI: r1 r13
          0x01a8: PHI (r1v16 zd0.u) = (r1v13 zd0.u), (r1v21 zd0.u) binds: [B:34:0x01a4, B:19:0x00f1] A[DONT_GENERATE, DONT_INLINE]
          0x01a8: PHI (r13v12 java.lang.Object) = (r13v9 java.lang.Object), (r13v15 java.lang.Object) binds: [B:34:0x01a4, B:19:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:44:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:47:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:49:0x01ea A[PHI: r1 r13
          0x01ea: PHI (r1v22 zd0.u) = (r1v16 zd0.u), (r1v24 zd0.u) binds: [B:43:0x01ce, B:48:0x01e5] A[DONT_GENERATE, DONT_INLINE]
          0x01ea: PHI (r13v16 c80.s) = (r13v13 c80.s), (r13v18 c80.s) binds: [B:43:0x01ce, B:48:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:52:0x0205 A[PHI: r1 r13 r14
          0x0205: PHI (r1v27 zd0.u) = (r1v22 zd0.u), (r1v31 zd0.u) binds: [B:50:0x0201, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]
          0x0205: PHI (r13v21 c80.s) = (r13v16 c80.s), (r13v24 c80.s) binds: [B:50:0x0201, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]
          0x0205: PHI (r14v26 java.lang.Object) = (r14v25 java.lang.Object), (r14v31 java.lang.Object) binds: [B:50:0x0201, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:54:0x020d  */
        /* JADX WARN: Code duplicated, block: B:57:0x0221  */
        /* JADX WARN: Code duplicated, block: B:60:0x022c  */
        /* JADX WARN: Code duplicated, block: B:62:0x0237  */
        /* JADX WARN: Code duplicated, block: B:64:0x0247  */
        /* JADX WARN: Code duplicated, block: B:65:0x0249  */
        /* JADX WARN: Code duplicated, block: B:69:0x0263  */
        /* JADX WARN: Code duplicated, block: B:70:0x0274  */
        /* JADX WARN: Code duplicated, block: B:73:0x027c  */
        /* JADX WARN: Code duplicated, block: B:76:0x02a2  */
        /* JADX WARN: Code duplicated, block: B:80:0x02d4  */
        /* JADX WARN: Code duplicated, block: B:82:0x02df  */
        /* JADX WARN: Code duplicated, block: B:84:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:86:0x02f3  */
        /* JADX WARN: Code duplicated, block: B:89:0x0311  */
        /* JADX WARN: Code duplicated, block: B:92:0x031d  */
        /* JADX WARN: Code duplicated, block: B:93:0x031f  */
        /* JADX WARN: Code duplicated, block: B:95:0x0334  */
        /* JADX WARN: Code duplicated, block: B:97:0x0341  */
        /* JADX WARN: Instruction removed from duplicated block: B:129:0x0409, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objJ;
            z1 z1Var;
            g3.a aVar;
            v2 v2Var;
            boolean z14;
            z1 z1Var2;
            g3.a aVar2;
            Object objG;
            zd0.u uVar;
            Object objK;
            c80.s sVar;
            zd0.u uVar2;
            c80.s sVar2;
            Object objL;
            boolean zBooleanValue;
            o oVar;
            boolean z15;
            Object objD;
            zd0.u uVar3;
            z1 z1Var3;
            int i14;
            com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d dVar;
            g3 g3VarD;
            yx2.i iVar;
            int i15;
            int i16;
            z1 z1Var4;
            Object objI;
            int i17;
            int i18;
            boolean z16;
            z1 z1Var5;
            g3.a aVar3;
            Object objA;
            g3.a aVar4;
            int i19;
            g3.a aVar5;
            GCPlusHomeActivity.b bVar;
            c80.s.a aVar6;
            Object objM;
            g3.a aVar7;
            boolean z17;
            GCPlusHomeActivity.b bVar2;
            o oVar2;
            c80.s.a aVar8;
            z1 z1Var6;
            v2 v2Var2;
            boolean z18;
            o oVar3;
            Object objX4;
            z1 z1Var7;
            boolean z19;
            Iterator it;
            Object next;
            tj0.a aVar9;
            Object objJ2;
            tj0.a aVar10;
            z1 z1Var8;
            c80.s sVar3;
            uj0.a aVar11;
            b0 b0Var = (b0) this.f35454m;
            u13.a aVar12 = u13.a.COROUTINE_SUSPENDED;
            int i24 = this.f35453l;
            e eVar = e.this;
            Object obj2 = null;
            switch (i24) {
                case 0:
                    r.b(obj);
                    p2 p2Var = eVar.f35418l;
                    g3.a aVar13 = g3.f35298f;
                    p2Var.k(null, g3.a.c(aVar13));
                    p2 p2Var2 = eVar.f35426v;
                    oj0.f fVar = eVar.f35411e;
                    this.f35454m = b0Var;
                    this.f35442a = p2Var2;
                    this.f35443b = aVar13;
                    this.f35453l = 1;
                    fVar.getClass();
                    objJ = f0.J(fVar, new oj0.s(fVar, null), this);
                    if (objJ != aVar12) {
                        z1Var = p2Var2;
                        aVar = aVar13;
                        v2Var = (v2) objJ;
                        v2Var.getClass();
                        if (v2Var instanceof v2.b) {
                            z14 = Boolean.parseBoolean(((z70.u) ((v2.b) v2Var).f47386a).f202869b);
                        } else {
                            z14 = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z14);
                        aVar.getClass();
                        z1Var.setValue(g3.a.d(boolValueOf));
                        z1Var2 = eVar.f35428x;
                        aVar2 = g3.f35298f;
                        ak0.a aVar14 = eVar.f35414h;
                        this.f35454m = b0Var;
                        this.f35442a = z1Var2;
                        this.f35443b = aVar2;
                        this.f35453l = 2;
                        objG = aVar14.g(this);
                        if (objG != aVar12) {
                            aVar2.getClass();
                            z1Var2.setValue(g3.a.d(objG));
                            uVar = (zd0.u) KoinJavaComponent.get$default(zd0.u.class, null, null, 6, null);
                            boolean z24 = !eVar.f35408b;
                            this.f35454m = b0Var;
                            this.f35442a = uVar;
                            this.f35443b = null;
                            this.f35453l = 3;
                            objK = uVar.k(z24, this);
                            if (objK != aVar12) {
                                sVar = (c80.s) objK;
                                eVar.f35420n.setValue(sVar);
                                if (!s3.b() && !(sVar instanceof c80.s.a)) {
                                    p2 p2Var3 = eVar.f35418l;
                                    g3.a aVar15 = g3.f35298f;
                                    i.d dVar2 = i.d.f35484a;
                                    aVar15.getClass();
                                    p2Var3.k(null, g3.a.d(dVar2));
                                    return Unit.INSTANCE;
                                }
                                if (sVar instanceof c80.s.c) {
                                    ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                                    q qVar = q.EXCLUSIVE_OFFERS;
                                    this.f35454m = b0Var;
                                    this.f35442a = uVar;
                                    this.f35443b = sVar;
                                    this.f35453l = 5;
                                    objL = uVar.l(qVar, this);
                                    if (objL != aVar12) {
                                        zBooleanValue = ((Boolean) objL).booleanValue();
                                        if (zBooleanValue) {
                                            z70.j jVar = eVar.f35415i;
                                            this.f35454m = b0Var;
                                            this.f35442a = uVar;
                                            this.f35443b = sVar;
                                            this.f35450i = zBooleanValue;
                                            this.f35453l = 6;
                                            objD = jVar.d(this);
                                            if (objD != aVar12) {
                                                uVar3 = uVar;
                                                z15 = zBooleanValue;
                                                v2Var2 = (v2) objD;
                                                z18 = v2Var2 instanceof v2.b;
                                                if (z18) {
                                                    oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                                    if (oVar3.f25502b) {
                                                        a2 a2Var = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                        oVar = oVar3;
                                                    } else {
                                                        if (z18) {
                                                            a2 a2Var2 = a2.SUBSCRIPTIONS;
                                                            String strF = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var2, "GCPlusHomeViewModel", strF);
                                                        } else {
                                                            a2 a2Var3 = a2.SUBSCRIPTIONS;
                                                            String strF2 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var3, "GCPlusHomeViewModel", strF2);
                                                        }
                                                        oVar = null;
                                                    }
                                                } else {
                                                    if (z18) {
                                                        a2 a2Var4 = a2.SUBSCRIPTIONS;
                                                        String strF3 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var4, "GCPlusHomeViewModel", strF3);
                                                    } else {
                                                        a2 a2Var5 = a2.SUBSCRIPTIONS;
                                                        String strF4 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var5, "GCPlusHomeViewModel", strF4);
                                                    }
                                                    oVar = null;
                                                }
                                                uVar = uVar3;
                                                z1Var3 = eVar.f35418l;
                                                if (!(sVar instanceof c80.s.a)) {
                                                    if (!(sVar instanceof c80.s.b)) {
                                                        if (!(sVar instanceof c80.s.c)) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                        if (i14 == 1) {
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                        } else if (i14 == 2) {
                                                            if (i14 == 3) {
                                                            }
                                                            a2 a2Var6 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var6, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                        } else {
                                                            a2 a2Var7 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var7, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                        }
                                                        g3.a aVar16 = g3.f35298f;
                                                        i.b bVar3 = new i.b(dVar);
                                                        aVar16.getClass();
                                                        g3VarD = g3.a.d(bVar3);
                                                    } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                        aVar3 = g3.f35298f;
                                                        this.f35454m = null;
                                                        this.f35442a = null;
                                                        this.f35443b = null;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = aVar3;
                                                        this.f35450i = z15;
                                                        this.f35451j = 0;
                                                        this.f35453l = 9;
                                                        objA = wj0.d.a(this);
                                                        if (objA != aVar12) {
                                                            aVar4 = aVar3;
                                                            i19 = 0;
                                                            boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                                                            if (i19 != 0) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            i.a aVar17 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue2, false, 4, (p005kotlin.jvm.internal.j) null));
                                                            aVar4.getClass();
                                                            g3VarD = g3.a.d(aVar17);
                                                        }
                                                    } else {
                                                        iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                        if (iVar == null) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        oj0.f fVar2 = eVar.f35411e;
                                                        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = z1Var3;
                                                        this.f35450i = z15;
                                                        this.f35451j = i15;
                                                        this.f35452k = i16;
                                                        this.f35453l = 10;
                                                        objI = fVar2.i(contextC, this);
                                                        if (objI != aVar12) {
                                                            boolean z25 = z15;
                                                            i17 = i15;
                                                            i18 = i16;
                                                            z16 = z25;
                                                            z1Var5 = z1Var3;
                                                            it = ((Iterable) objI).iterator();
                                                            do {
                                                                if (it.hasNext()) {
                                                                    next = it.next();
                                                                } else {
                                                                    next = null;
                                                                }
                                                                aVar9 = (tj0.a) next;
                                                                oj0.f fVar3 = eVar.f35411e;
                                                                this.f35454m = b0Var;
                                                                this.f35442a = null;
                                                                this.f35443b = sVar;
                                                                this.f35444c = null;
                                                                this.f35445d = aVar9;
                                                                this.f35446e = z1Var5;
                                                                this.f35447f = z1Var3;
                                                                this.f35450i = z16;
                                                                this.f35451j = i17;
                                                                this.f35452k = i18;
                                                                this.f35453l = 11;
                                                                objJ2 = fVar3.j(this);
                                                                if (objJ2 != aVar12) {
                                                                    z1 z1Var9 = z1Var3;
                                                                    aVar10 = aVar9;
                                                                    z1Var8 = z1Var9;
                                                                    sVar3 = sVar;
                                                                    for (Object obj3 : (Iterable) objJ2) {
                                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                                            obj2 = obj3;
                                                                            aVar11 = (uj0.a) obj2;
                                                                            if (aVar10 != null) {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            } else {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            }
                                                                            z1Var3 = z1Var8;
                                                                        }
                                                                    }
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            } while (((tj0.a) next).f165114g != i18);
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar4 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar4.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var10 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var10;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                    }
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                                aVar5 = g3.f35298f;
                                                bVar = eVar.f35407a;
                                                aVar6 = (c80.s.a) sVar;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = oVar;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar5;
                                                this.f35447f = eVar;
                                                this.f35448g = bVar;
                                                this.f35449h = aVar6;
                                                this.f35450i = z15;
                                                this.f35453l = 7;
                                                objM = uVar.m(this);
                                                if (objM != aVar12) {
                                                    aVar7 = aVar5;
                                                    z17 = z15;
                                                    bVar2 = bVar;
                                                    oVar2 = oVar;
                                                    aVar8 = aVar6;
                                                    z1Var6 = z1Var3;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var6;
                                                    this.f35446e = aVar7;
                                                    this.f35447f = null;
                                                    this.f35448g = null;
                                                    this.f35449h = null;
                                                    this.f35450i = z17;
                                                    this.f35453l = 8;
                                                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                    if (objX4 != aVar12) {
                                                        z1Var7 = z1Var6;
                                                        aVar7.getClass();
                                                        g3VarD = g3.a.d(objX4);
                                                        z1Var3 = z1Var7;
                                                        z1Var3.setValue(g3VarD);
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        } else {
                                            oVar = null;
                                            z15 = zBooleanValue;
                                            z1Var3 = eVar.f35418l;
                                            if (!(sVar instanceof c80.s.a)) {
                                                if (!(sVar instanceof c80.s.b)) {
                                                    if (!(sVar instanceof c80.s.c)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                    if (i14 == 1) {
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                    } else if (i14 == 2) {
                                                        if (i14 == 3) {
                                                        }
                                                        a2 a2Var8 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var8, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                    } else {
                                                        a2 a2Var9 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var9, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                    }
                                                    g3.a aVar18 = g3.f35298f;
                                                    i.b bVar4 = new i.b(dVar);
                                                    aVar18.getClass();
                                                    g3VarD = g3.a.d(bVar4);
                                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                    aVar3 = g3.f35298f;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = aVar3;
                                                    this.f35450i = z15;
                                                    this.f35451j = 0;
                                                    this.f35453l = 9;
                                                    objA = wj0.d.a(this);
                                                    if (objA != aVar12) {
                                                        aVar4 = aVar3;
                                                        i19 = 0;
                                                        boolean zBooleanValue3 = ((Boolean) objA).booleanValue();
                                                        if (i19 != 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        i.a aVar19 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue3, false, 4, (p005kotlin.jvm.internal.j) null));
                                                        aVar4.getClass();
                                                        g3VarD = g3.a.d(aVar19);
                                                    }
                                                } else {
                                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                    if (iVar == null) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    if (i15 != 0) {
                                                    }
                                                    oj0.f fVar5 = eVar.f35411e;
                                                    Context contextC2 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = z1Var3;
                                                    this.f35450i = z15;
                                                    this.f35451j = i15;
                                                    this.f35452k = i16;
                                                    this.f35453l = 10;
                                                    objI = fVar5.i(contextC2, this);
                                                    if (objI != aVar12) {
                                                        boolean z26 = z15;
                                                        i17 = i15;
                                                        i18 = i16;
                                                        z16 = z26;
                                                        z1Var5 = z1Var3;
                                                        it = ((Iterable) objI).iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar6 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar6.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var11 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var11;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        } while (((tj0.a) next).f165114g != i18);
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar7 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar7.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var12 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var12;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                }
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                            aVar5 = g3.f35298f;
                                            bVar = eVar.f35407a;
                                            aVar6 = (c80.s.a) sVar;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = oVar;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar5;
                                            this.f35447f = eVar;
                                            this.f35448g = bVar;
                                            this.f35449h = aVar6;
                                            this.f35450i = z15;
                                            this.f35453l = 7;
                                            objM = uVar.m(this);
                                            if (objM != aVar12) {
                                                aVar7 = aVar5;
                                                z17 = z15;
                                                bVar2 = bVar;
                                                oVar2 = oVar;
                                                aVar8 = aVar6;
                                                z1Var6 = z1Var3;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var6;
                                                this.f35446e = aVar7;
                                                this.f35447f = null;
                                                this.f35448g = null;
                                                this.f35449h = null;
                                                this.f35450i = z17;
                                                this.f35453l = 8;
                                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                if (objX4 != aVar12) {
                                                    z1Var7 = z1Var6;
                                                    aVar7.getClass();
                                                    g3VarD = g3.a.d(objX4);
                                                    z1Var3 = z1Var7;
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f35454m = b0Var;
                                    this.f35442a = uVar;
                                    this.f35443b = sVar;
                                    this.f35453l = 4;
                                    if (f2.a("GCPlusHomeViewModel", this) != aVar12) {
                                        uVar2 = uVar;
                                        sVar2 = sVar;
                                        zd0.u uVar4 = uVar2;
                                        sVar = sVar2;
                                        uVar = uVar4;
                                        ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                                        q qVar2 = q.EXCLUSIVE_OFFERS;
                                        this.f35454m = b0Var;
                                        this.f35442a = uVar;
                                        this.f35443b = sVar;
                                        this.f35453l = 5;
                                        objL = uVar.l(qVar2, this);
                                        if (objL != aVar12) {
                                            zBooleanValue = ((Boolean) objL).booleanValue();
                                            if (zBooleanValue) {
                                                z70.j jVar2 = eVar.f35415i;
                                                this.f35454m = b0Var;
                                                this.f35442a = uVar;
                                                this.f35443b = sVar;
                                                this.f35450i = zBooleanValue;
                                                this.f35453l = 6;
                                                objD = jVar2.d(this);
                                                if (objD != aVar12) {
                                                    uVar3 = uVar;
                                                    z15 = zBooleanValue;
                                                    v2Var2 = (v2) objD;
                                                    z18 = v2Var2 instanceof v2.b;
                                                    if (z18) {
                                                        oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                                        if (oVar3.f25502b) {
                                                            a2 a2Var10 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2Var10, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                            oVar = oVar3;
                                                        } else {
                                                            if (z18 || ((o) ((v2.b) v2Var2).f47386a).f25502b) {
                                                                a2 a2Var11 = a2.SUBSCRIPTIONS;
                                                                String strF5 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var11, "GCPlusHomeViewModel", strF5);
                                                            } else {
                                                                a2 a2Var12 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var12, "GCPlusHomeViewModel", "This user has no historical exclusive offers");
                                                            }
                                                            oVar = null;
                                                        }
                                                    } else {
                                                        if (z18) {
                                                            a2 a2Var13 = a2.SUBSCRIPTIONS;
                                                            String strF6 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var13, "GCPlusHomeViewModel", strF6);
                                                        } else {
                                                            a2 a2Var14 = a2.SUBSCRIPTIONS;
                                                            String strF7 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var14, "GCPlusHomeViewModel", strF7);
                                                        }
                                                        oVar = null;
                                                    }
                                                    uVar = uVar3;
                                                    z1Var3 = eVar.f35418l;
                                                    if (!(sVar instanceof c80.s.a)) {
                                                        if (!(sVar instanceof c80.s.b)) {
                                                            if (!(sVar instanceof c80.s.c)) {
                                                                u0.r();
                                                                return null;
                                                            }
                                                            i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                            if (i14 == 1) {
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                            } else if (i14 == 2) {
                                                                a2 a2Var15 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var15, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                            } else {
                                                                if (i14 == 3 && i14 != 4) {
                                                                    u0.r();
                                                                    return null;
                                                                }
                                                                a2 a2Var16 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var16, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                            }
                                                            g3.a aVar110 = g3.f35298f;
                                                            i.b bVar5 = new i.b(dVar);
                                                            aVar110.getClass();
                                                            g3VarD = g3.a.d(bVar5);
                                                        } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                            aVar3 = g3.f35298f;
                                                            this.f35454m = null;
                                                            this.f35442a = null;
                                                            this.f35443b = null;
                                                            this.f35444c = null;
                                                            this.f35445d = z1Var3;
                                                            this.f35446e = aVar3;
                                                            this.f35450i = z15;
                                                            this.f35451j = 0;
                                                            this.f35453l = 9;
                                                            objA = wj0.d.a(this);
                                                            if (objA != aVar12) {
                                                                aVar4 = aVar3;
                                                                i19 = 0;
                                                                boolean zBooleanValue4 = ((Boolean) objA).booleanValue();
                                                                if (i19 != 0) {
                                                                    z19 = true;
                                                                } else {
                                                                    z19 = false;
                                                                }
                                                                i.a aVar111 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue4, false, 4, (p005kotlin.jvm.internal.j) null));
                                                                aVar4.getClass();
                                                                g3VarD = g3.a.d(aVar111);
                                                            }
                                                        } else {
                                                            iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                            if (iVar == null && iVar.f200098k) {
                                                                i15 = iVar.f200099l;
                                                            } else {
                                                                i15 = 0;
                                                            }
                                                            i16 = i15 != 0 ? 1 : 0;
                                                            try {
                                                                oj0.f fVar8 = eVar.f35411e;
                                                                Context contextC3 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                                this.f35454m = b0Var;
                                                                this.f35442a = null;
                                                                this.f35443b = sVar;
                                                                this.f35444c = null;
                                                                this.f35445d = z1Var3;
                                                                this.f35446e = z1Var3;
                                                                this.f35450i = z15;
                                                                this.f35451j = i15;
                                                                this.f35452k = i16;
                                                                this.f35453l = 10;
                                                                objI = fVar8.i(contextC3, this);
                                                                if (objI != aVar12) {
                                                                    boolean z27 = z15;
                                                                    i17 = i15;
                                                                    i18 = i16;
                                                                    z16 = z27;
                                                                    z1Var5 = z1Var3;
                                                                    it = ((Iterable) objI).iterator();
                                                                    do {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                        } else {
                                                                            next = null;
                                                                        }
                                                                        aVar9 = (tj0.a) next;
                                                                        oj0.f fVar9 = eVar.f35411e;
                                                                        this.f35454m = b0Var;
                                                                        this.f35442a = null;
                                                                        this.f35443b = sVar;
                                                                        this.f35444c = null;
                                                                        this.f35445d = aVar9;
                                                                        this.f35446e = z1Var5;
                                                                        this.f35447f = z1Var3;
                                                                        this.f35450i = z16;
                                                                        this.f35451j = i17;
                                                                        this.f35452k = i18;
                                                                        this.f35453l = 11;
                                                                        objJ2 = fVar9.j(this);
                                                                        if (objJ2 != aVar12) {
                                                                            z1 z1Var13 = z1Var3;
                                                                            aVar10 = aVar9;
                                                                            z1Var8 = z1Var13;
                                                                            sVar3 = sVar;
                                                                            while (r0.hasNext()) {
                                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                                    obj2 = obj3;
                                                                                    aVar11 = (uj0.a) obj2;
                                                                                    if (aVar10 != null || aVar11 == null) {
                                                                                        i2.f36769a.getClass();
                                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                                    } else {
                                                                                        i.e eVarY4 = e.y4(eVar, ((c80.s.b) sVar3).f25559a, aVar10, i17, aVar11);
                                                                                        i2.f36769a.getClass();
                                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", "Returning " + eVarY4);
                                                                                        g3.f35298f.getClass();
                                                                                        g3VarD = g3.a.d(eVarY4);
                                                                                    }
                                                                                    z1Var3 = z1Var8;
                                                                                }
                                                                            }
                                                                            aVar11 = (uj0.a) obj2;
                                                                            if (aVar10 != null) {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            } else {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            }
                                                                            z1Var3 = z1Var8;
                                                                        }
                                                                    } while (((tj0.a) next).f165114g != i18);
                                                                    aVar9 = (tj0.a) next;
                                                                    oj0.f fVar10 = eVar.f35411e;
                                                                    this.f35454m = b0Var;
                                                                    this.f35442a = null;
                                                                    this.f35443b = sVar;
                                                                    this.f35444c = null;
                                                                    this.f35445d = aVar9;
                                                                    this.f35446e = z1Var5;
                                                                    this.f35447f = z1Var3;
                                                                    this.f35450i = z16;
                                                                    this.f35451j = i17;
                                                                    this.f35452k = i18;
                                                                    this.f35453l = 11;
                                                                    objJ2 = fVar10.j(this);
                                                                    if (objJ2 != aVar12) {
                                                                        z1 z1Var14 = z1Var3;
                                                                        aVar10 = aVar9;
                                                                        z1Var8 = z1Var14;
                                                                        sVar3 = sVar;
                                                                        while (r0.hasNext()) {
                                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                                obj2 = obj3;
                                                                                aVar11 = (uj0.a) obj2;
                                                                                if (aVar10 != null) {
                                                                                    i2.f36769a.getClass();
                                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                                } else {
                                                                                    i2.f36769a.getClass();
                                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                                }
                                                                                z1Var3 = z1Var8;
                                                                            }
                                                                        }
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                            } catch (CancellationException unused) {
                                                                z1Var4 = z1Var3;
                                                                a2 a2Var17 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.k(a2Var17, "GCPlusHomeViewModel", "Paywall or plan selection request was cancelled.");
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                z1Var3 = z1Var4;
                                                            }
                                                        }
                                                        z1Var3.setValue(g3VarD);
                                                        return Unit.INSTANCE;
                                                    }
                                                    aVar5 = g3.f35298f;
                                                    bVar = eVar.f35407a;
                                                    aVar6 = (c80.s.a) sVar;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = oVar;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = aVar5;
                                                    this.f35447f = eVar;
                                                    this.f35448g = bVar;
                                                    this.f35449h = aVar6;
                                                    this.f35450i = z15;
                                                    this.f35453l = 7;
                                                    objM = uVar.m(this);
                                                    if (objM != aVar12) {
                                                        aVar7 = aVar5;
                                                        z17 = z15;
                                                        bVar2 = bVar;
                                                        oVar2 = oVar;
                                                        aVar8 = aVar6;
                                                        z1Var6 = z1Var3;
                                                        this.f35454m = null;
                                                        this.f35442a = null;
                                                        this.f35443b = null;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var6;
                                                        this.f35446e = aVar7;
                                                        this.f35447f = null;
                                                        this.f35448g = null;
                                                        this.f35449h = null;
                                                        this.f35450i = z17;
                                                        this.f35453l = 8;
                                                        objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                        if (objX4 != aVar12) {
                                                            z1Var7 = z1Var6;
                                                            aVar7.getClass();
                                                            g3VarD = g3.a.d(objX4);
                                                            z1Var3 = z1Var7;
                                                            z1Var3.setValue(g3VarD);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                            } else {
                                                oVar = null;
                                                z15 = zBooleanValue;
                                                z1Var3 = eVar.f35418l;
                                                if (!(sVar instanceof c80.s.a)) {
                                                    if (!(sVar instanceof c80.s.b)) {
                                                        if (!(sVar instanceof c80.s.c)) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                        if (i14 == 1) {
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                        } else if (i14 == 2) {
                                                            if (i14 == 3) {
                                                            }
                                                            a2 a2Var18 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var18, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                        } else {
                                                            a2 a2Var19 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var19, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                        }
                                                        g3.a aVar112 = g3.f35298f;
                                                        i.b bVar6 = new i.b(dVar);
                                                        aVar112.getClass();
                                                        g3VarD = g3.a.d(bVar6);
                                                    } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                        aVar3 = g3.f35298f;
                                                        this.f35454m = null;
                                                        this.f35442a = null;
                                                        this.f35443b = null;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = aVar3;
                                                        this.f35450i = z15;
                                                        this.f35451j = 0;
                                                        this.f35453l = 9;
                                                        objA = wj0.d.a(this);
                                                        if (objA != aVar12) {
                                                            aVar4 = aVar3;
                                                            i19 = 0;
                                                            boolean zBooleanValue5 = ((Boolean) objA).booleanValue();
                                                            if (i19 != 0) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            i.a aVar113 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue5, false, 4, (p005kotlin.jvm.internal.j) null));
                                                            aVar4.getClass();
                                                            g3VarD = g3.a.d(aVar113);
                                                        }
                                                    } else {
                                                        iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                        if (iVar == null) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        oj0.f fVar11 = eVar.f35411e;
                                                        Context contextC4 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = z1Var3;
                                                        this.f35450i = z15;
                                                        this.f35451j = i15;
                                                        this.f35452k = i16;
                                                        this.f35453l = 10;
                                                        objI = fVar11.i(contextC4, this);
                                                        if (objI != aVar12) {
                                                            boolean z28 = z15;
                                                            i17 = i15;
                                                            i18 = i16;
                                                            z16 = z28;
                                                            z1Var5 = z1Var3;
                                                            it = ((Iterable) objI).iterator();
                                                            do {
                                                                if (it.hasNext()) {
                                                                    next = it.next();
                                                                } else {
                                                                    next = null;
                                                                }
                                                                aVar9 = (tj0.a) next;
                                                                oj0.f fVar12 = eVar.f35411e;
                                                                this.f35454m = b0Var;
                                                                this.f35442a = null;
                                                                this.f35443b = sVar;
                                                                this.f35444c = null;
                                                                this.f35445d = aVar9;
                                                                this.f35446e = z1Var5;
                                                                this.f35447f = z1Var3;
                                                                this.f35450i = z16;
                                                                this.f35451j = i17;
                                                                this.f35452k = i18;
                                                                this.f35453l = 11;
                                                                objJ2 = fVar12.j(this);
                                                                if (objJ2 != aVar12) {
                                                                    z1 z1Var15 = z1Var3;
                                                                    aVar10 = aVar9;
                                                                    z1Var8 = z1Var15;
                                                                    sVar3 = sVar;
                                                                    while (r0.hasNext()) {
                                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                                            obj2 = obj3;
                                                                            aVar11 = (uj0.a) obj2;
                                                                            if (aVar10 != null) {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            } else {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            }
                                                                            z1Var3 = z1Var8;
                                                                        }
                                                                    }
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            } while (((tj0.a) next).f165114g != i18);
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar13 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar13.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var16 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var16;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                    }
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                                aVar5 = g3.f35298f;
                                                bVar = eVar.f35407a;
                                                aVar6 = (c80.s.a) sVar;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = oVar;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar5;
                                                this.f35447f = eVar;
                                                this.f35448g = bVar;
                                                this.f35449h = aVar6;
                                                this.f35450i = z15;
                                                this.f35453l = 7;
                                                objM = uVar.m(this);
                                                if (objM != aVar12) {
                                                    aVar7 = aVar5;
                                                    z17 = z15;
                                                    bVar2 = bVar;
                                                    oVar2 = oVar;
                                                    aVar8 = aVar6;
                                                    z1Var6 = z1Var3;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var6;
                                                    this.f35446e = aVar7;
                                                    this.f35447f = null;
                                                    this.f35448g = null;
                                                    this.f35449h = null;
                                                    this.f35450i = z17;
                                                    this.f35453l = 8;
                                                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                    if (objX4 != aVar12) {
                                                        z1Var7 = z1Var6;
                                                        aVar7.getClass();
                                                        g3VarD = g3.a.d(objX4);
                                                        z1Var3 = z1Var7;
                                                        z1Var3.setValue(g3VarD);
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar12;
                case 1:
                    aVar = (g3.a) this.f35443b;
                    z1Var = (z1) this.f35442a;
                    r.b(obj);
                    objJ = obj;
                    v2Var = (v2) objJ;
                    v2Var.getClass();
                    if (v2Var instanceof v2.b) {
                        z14 = Boolean.parseBoolean(((z70.u) ((v2.b) v2Var).f47386a).f202869b);
                    } else {
                        z14 = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z14);
                    aVar.getClass();
                    z1Var.setValue(g3.a.d(boolValueOf2));
                    z1Var2 = eVar.f35428x;
                    aVar2 = g3.f35298f;
                    ak0.a aVar114 = eVar.f35414h;
                    this.f35454m = b0Var;
                    this.f35442a = z1Var2;
                    this.f35443b = aVar2;
                    this.f35453l = 2;
                    objG = aVar114.g(this);
                    if (objG != aVar12) {
                        aVar2.getClass();
                        z1Var2.setValue(g3.a.d(objG));
                        uVar = (zd0.u) KoinJavaComponent.get$default(zd0.u.class, null, null, 6, null);
                        boolean z29 = !eVar.f35408b;
                        this.f35454m = b0Var;
                        this.f35442a = uVar;
                        this.f35443b = null;
                        this.f35453l = 3;
                        objK = uVar.k(z29, this);
                        if (objK != aVar12) {
                            sVar = (c80.s) objK;
                            eVar.f35420n.setValue(sVar);
                            if (!s3.b()) {
                            }
                            if (sVar instanceof c80.s.c) {
                                this.f35454m = b0Var;
                                this.f35442a = uVar;
                                this.f35443b = sVar;
                                this.f35453l = 4;
                                if (f2.a("GCPlusHomeViewModel", this) != aVar12) {
                                    uVar2 = uVar;
                                    sVar2 = sVar;
                                    zd0.u uVar5 = uVar2;
                                    sVar = sVar2;
                                    uVar = uVar5;
                                    ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                                    q qVar3 = q.EXCLUSIVE_OFFERS;
                                    this.f35454m = b0Var;
                                    this.f35442a = uVar;
                                    this.f35443b = sVar;
                                    this.f35453l = 5;
                                    objL = uVar.l(qVar3, this);
                                    if (objL != aVar12) {
                                        zBooleanValue = ((Boolean) objL).booleanValue();
                                        if (zBooleanValue) {
                                            z70.j jVar3 = eVar.f35415i;
                                            this.f35454m = b0Var;
                                            this.f35442a = uVar;
                                            this.f35443b = sVar;
                                            this.f35450i = zBooleanValue;
                                            this.f35453l = 6;
                                            objD = jVar3.d(this);
                                            if (objD != aVar12) {
                                                uVar3 = uVar;
                                                z15 = zBooleanValue;
                                                v2Var2 = (v2) objD;
                                                z18 = v2Var2 instanceof v2.b;
                                                if (z18) {
                                                    oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                                    if (oVar3.f25502b) {
                                                        a2 a2Var110 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var110, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                        oVar = oVar3;
                                                    } else {
                                                        if (z18) {
                                                            a2 a2Var111 = a2.SUBSCRIPTIONS;
                                                            String strF8 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var111, "GCPlusHomeViewModel", strF8);
                                                        } else {
                                                            a2 a2Var112 = a2.SUBSCRIPTIONS;
                                                            String strF9 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var112, "GCPlusHomeViewModel", strF9);
                                                        }
                                                        oVar = null;
                                                    }
                                                } else {
                                                    if (z18) {
                                                        a2 a2Var113 = a2.SUBSCRIPTIONS;
                                                        String strF10 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var113, "GCPlusHomeViewModel", strF10);
                                                    } else {
                                                        a2 a2Var114 = a2.SUBSCRIPTIONS;
                                                        String strF11 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var114, "GCPlusHomeViewModel", strF11);
                                                    }
                                                    oVar = null;
                                                }
                                                uVar = uVar3;
                                                z1Var3 = eVar.f35418l;
                                                if (!(sVar instanceof c80.s.a)) {
                                                    if (!(sVar instanceof c80.s.b)) {
                                                        if (!(sVar instanceof c80.s.c)) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                        if (i14 == 1) {
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                        } else if (i14 == 2) {
                                                            if (i14 == 3) {
                                                            }
                                                            a2 a2Var115 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var115, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                        } else {
                                                            a2 a2Var116 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var116, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                        }
                                                        g3.a aVar115 = g3.f35298f;
                                                        i.b bVar7 = new i.b(dVar);
                                                        aVar115.getClass();
                                                        g3VarD = g3.a.d(bVar7);
                                                        break;
                                                    } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                        aVar3 = g3.f35298f;
                                                        this.f35454m = null;
                                                        this.f35442a = null;
                                                        this.f35443b = null;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = aVar3;
                                                        this.f35450i = z15;
                                                        this.f35451j = 0;
                                                        this.f35453l = 9;
                                                        objA = wj0.d.a(this);
                                                        if (objA != aVar12) {
                                                            aVar4 = aVar3;
                                                            i19 = 0;
                                                            boolean zBooleanValue6 = ((Boolean) objA).booleanValue();
                                                            if (i19 != 0) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            i.a aVar116 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue6, false, 4, (p005kotlin.jvm.internal.j) null));
                                                            aVar4.getClass();
                                                            g3VarD = g3.a.d(aVar116);
                                                        }
                                                    } else {
                                                        iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                        if (iVar == null) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        oj0.f fVar14 = eVar.f35411e;
                                                        Context contextC5 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = z1Var3;
                                                        this.f35446e = z1Var3;
                                                        this.f35450i = z15;
                                                        this.f35451j = i15;
                                                        this.f35452k = i16;
                                                        this.f35453l = 10;
                                                        objI = fVar14.i(contextC5, this);
                                                        if (objI != aVar12) {
                                                            boolean z210 = z15;
                                                            i17 = i15;
                                                            i18 = i16;
                                                            z16 = z210;
                                                            z1Var5 = z1Var3;
                                                            it = ((Iterable) objI).iterator();
                                                            do {
                                                                if (it.hasNext()) {
                                                                    next = it.next();
                                                                } else {
                                                                    next = null;
                                                                }
                                                                aVar9 = (tj0.a) next;
                                                                oj0.f fVar15 = eVar.f35411e;
                                                                this.f35454m = b0Var;
                                                                this.f35442a = null;
                                                                this.f35443b = sVar;
                                                                this.f35444c = null;
                                                                this.f35445d = aVar9;
                                                                this.f35446e = z1Var5;
                                                                this.f35447f = z1Var3;
                                                                this.f35450i = z16;
                                                                this.f35451j = i17;
                                                                this.f35452k = i18;
                                                                this.f35453l = 11;
                                                                objJ2 = fVar15.j(this);
                                                                if (objJ2 != aVar12) {
                                                                    z1 z1Var17 = z1Var3;
                                                                    aVar10 = aVar9;
                                                                    z1Var8 = z1Var17;
                                                                    sVar3 = sVar;
                                                                    while (r0.hasNext()) {
                                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                                            obj2 = obj3;
                                                                            aVar11 = (uj0.a) obj2;
                                                                            if (aVar10 != null) {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            } else {
                                                                                i2.f36769a.getClass();
                                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                            }
                                                                            z1Var3 = z1Var8;
                                                                        }
                                                                    }
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            } while (((tj0.a) next).f165114g != i18);
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar16 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar16.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var18 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var18;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                    }
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                                aVar5 = g3.f35298f;
                                                bVar = eVar.f35407a;
                                                aVar6 = (c80.s.a) sVar;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = oVar;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar5;
                                                this.f35447f = eVar;
                                                this.f35448g = bVar;
                                                this.f35449h = aVar6;
                                                this.f35450i = z15;
                                                this.f35453l = 7;
                                                objM = uVar.m(this);
                                                if (objM != aVar12) {
                                                    aVar7 = aVar5;
                                                    z17 = z15;
                                                    bVar2 = bVar;
                                                    oVar2 = oVar;
                                                    aVar8 = aVar6;
                                                    z1Var6 = z1Var3;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var6;
                                                    this.f35446e = aVar7;
                                                    this.f35447f = null;
                                                    this.f35448g = null;
                                                    this.f35449h = null;
                                                    this.f35450i = z17;
                                                    this.f35453l = 8;
                                                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                    if (objX4 != aVar12) {
                                                        z1Var7 = z1Var6;
                                                        aVar7.getClass();
                                                        g3VarD = g3.a.d(objX4);
                                                        z1Var3 = z1Var7;
                                                        z1Var3.setValue(g3VarD);
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        } else {
                                            oVar = null;
                                            z15 = zBooleanValue;
                                            z1Var3 = eVar.f35418l;
                                            if (!(sVar instanceof c80.s.a)) {
                                                if (!(sVar instanceof c80.s.b)) {
                                                    if (!(sVar instanceof c80.s.c)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                    if (i14 == 1) {
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                    } else if (i14 == 2) {
                                                        if (i14 == 3) {
                                                        }
                                                        a2 a2Var117 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var117, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                    } else {
                                                        a2 a2Var118 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var118, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                    }
                                                    g3.a aVar117 = g3.f35298f;
                                                    i.b bVar8 = new i.b(dVar);
                                                    aVar117.getClass();
                                                    g3VarD = g3.a.d(bVar8);
                                                    break;
                                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                    aVar3 = g3.f35298f;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = aVar3;
                                                    this.f35450i = z15;
                                                    this.f35451j = 0;
                                                    this.f35453l = 9;
                                                    objA = wj0.d.a(this);
                                                    if (objA != aVar12) {
                                                        aVar4 = aVar3;
                                                        i19 = 0;
                                                        boolean zBooleanValue7 = ((Boolean) objA).booleanValue();
                                                        if (i19 != 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        i.a aVar118 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue7, false, 4, (p005kotlin.jvm.internal.j) null));
                                                        aVar4.getClass();
                                                        g3VarD = g3.a.d(aVar118);
                                                    }
                                                } else {
                                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                    if (iVar == null) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    if (i15 != 0) {
                                                    }
                                                    oj0.f fVar17 = eVar.f35411e;
                                                    Context contextC6 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = z1Var3;
                                                    this.f35450i = z15;
                                                    this.f35451j = i15;
                                                    this.f35452k = i16;
                                                    this.f35453l = 10;
                                                    objI = fVar17.i(contextC6, this);
                                                    if (objI != aVar12) {
                                                        boolean z211 = z15;
                                                        i17 = i15;
                                                        i18 = i16;
                                                        z16 = z211;
                                                        z1Var5 = z1Var3;
                                                        it = ((Iterable) objI).iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar18 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar18.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var19 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var19;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        } while (((tj0.a) next).f165114g != i18);
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar19 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar19.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var110 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var110;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                }
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                            aVar5 = g3.f35298f;
                                            bVar = eVar.f35407a;
                                            aVar6 = (c80.s.a) sVar;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = oVar;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar5;
                                            this.f35447f = eVar;
                                            this.f35448g = bVar;
                                            this.f35449h = aVar6;
                                            this.f35450i = z15;
                                            this.f35453l = 7;
                                            objM = uVar.m(this);
                                            if (objM != aVar12) {
                                                aVar7 = aVar5;
                                                z17 = z15;
                                                bVar2 = bVar;
                                                oVar2 = oVar;
                                                aVar8 = aVar6;
                                                z1Var6 = z1Var3;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var6;
                                                this.f35446e = aVar7;
                                                this.f35447f = null;
                                                this.f35448g = null;
                                                this.f35449h = null;
                                                this.f35450i = z17;
                                                this.f35453l = 8;
                                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                if (objX4 != aVar12) {
                                                    z1Var7 = z1Var6;
                                                    aVar7.getClass();
                                                    g3VarD = g3.a.d(objX4);
                                                    z1Var3 = z1Var7;
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                                q qVar4 = q.EXCLUSIVE_OFFERS;
                                this.f35454m = b0Var;
                                this.f35442a = uVar;
                                this.f35443b = sVar;
                                this.f35453l = 5;
                                objL = uVar.l(qVar4, this);
                                if (objL != aVar12) {
                                    zBooleanValue = ((Boolean) objL).booleanValue();
                                    if (zBooleanValue) {
                                        z70.j jVar4 = eVar.f35415i;
                                        this.f35454m = b0Var;
                                        this.f35442a = uVar;
                                        this.f35443b = sVar;
                                        this.f35450i = zBooleanValue;
                                        this.f35453l = 6;
                                        objD = jVar4.d(this);
                                        if (objD != aVar12) {
                                            uVar3 = uVar;
                                            z15 = zBooleanValue;
                                            v2Var2 = (v2) objD;
                                            z18 = v2Var2 instanceof v2.b;
                                            if (z18) {
                                                oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                                if (oVar3.f25502b) {
                                                    a2 a2Var119 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var119, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                    oVar = oVar3;
                                                } else {
                                                    if (z18) {
                                                        a2 a2Var1110 = a2.SUBSCRIPTIONS;
                                                        String strF12 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var1110, "GCPlusHomeViewModel", strF12);
                                                    } else {
                                                        a2 a2Var1111 = a2.SUBSCRIPTIONS;
                                                        String strF13 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var1111, "GCPlusHomeViewModel", strF13);
                                                    }
                                                    oVar = null;
                                                }
                                            } else {
                                                if (z18) {
                                                    a2 a2Var1112 = a2.SUBSCRIPTIONS;
                                                    String strF14 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1112, "GCPlusHomeViewModel", strF14);
                                                } else {
                                                    a2 a2Var1113 = a2.SUBSCRIPTIONS;
                                                    String strF15 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1113, "GCPlusHomeViewModel", strF15);
                                                }
                                                oVar = null;
                                            }
                                            uVar = uVar3;
                                            z1Var3 = eVar.f35418l;
                                            if (!(sVar instanceof c80.s.a)) {
                                                if (!(sVar instanceof c80.s.b)) {
                                                    if (!(sVar instanceof c80.s.c)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                    if (i14 == 1) {
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                    } else if (i14 == 2) {
                                                        if (i14 == 3) {
                                                        }
                                                        a2 a2Var1114 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var1114, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                    } else {
                                                        a2 a2Var1115 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var1115, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                    }
                                                    g3.a aVar119 = g3.f35298f;
                                                    i.b bVar9 = new i.b(dVar);
                                                    aVar119.getClass();
                                                    g3VarD = g3.a.d(bVar9);
                                                    break;
                                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                    aVar3 = g3.f35298f;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = aVar3;
                                                    this.f35450i = z15;
                                                    this.f35451j = 0;
                                                    this.f35453l = 9;
                                                    objA = wj0.d.a(this);
                                                    if (objA != aVar12) {
                                                        aVar4 = aVar3;
                                                        i19 = 0;
                                                        boolean zBooleanValue8 = ((Boolean) objA).booleanValue();
                                                        if (i19 != 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        i.a aVar1110 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue8, false, 4, (p005kotlin.jvm.internal.j) null));
                                                        aVar4.getClass();
                                                        g3VarD = g3.a.d(aVar1110);
                                                    }
                                                } else {
                                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                    if (iVar == null) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    if (i15 != 0) {
                                                    }
                                                    oj0.f fVar110 = eVar.f35411e;
                                                    Context contextC7 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = z1Var3;
                                                    this.f35450i = z15;
                                                    this.f35451j = i15;
                                                    this.f35452k = i16;
                                                    this.f35453l = 10;
                                                    objI = fVar110.i(contextC7, this);
                                                    if (objI != aVar12) {
                                                        boolean z212 = z15;
                                                        i17 = i15;
                                                        i18 = i16;
                                                        z16 = z212;
                                                        z1Var5 = z1Var3;
                                                        it = ((Iterable) objI).iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar111 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar111.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var111 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var111;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        } while (((tj0.a) next).f165114g != i18);
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar112 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar112.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var112 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var112;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                }
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                            aVar5 = g3.f35298f;
                                            bVar = eVar.f35407a;
                                            aVar6 = (c80.s.a) sVar;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = oVar;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar5;
                                            this.f35447f = eVar;
                                            this.f35448g = bVar;
                                            this.f35449h = aVar6;
                                            this.f35450i = z15;
                                            this.f35453l = 7;
                                            objM = uVar.m(this);
                                            if (objM != aVar12) {
                                                aVar7 = aVar5;
                                                z17 = z15;
                                                bVar2 = bVar;
                                                oVar2 = oVar;
                                                aVar8 = aVar6;
                                                z1Var6 = z1Var3;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var6;
                                                this.f35446e = aVar7;
                                                this.f35447f = null;
                                                this.f35448g = null;
                                                this.f35449h = null;
                                                this.f35450i = z17;
                                                this.f35453l = 8;
                                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                if (objX4 != aVar12) {
                                                    z1Var7 = z1Var6;
                                                    aVar7.getClass();
                                                    g3VarD = g3.a.d(objX4);
                                                    z1Var3 = z1Var7;
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    } else {
                                        oVar = null;
                                        z15 = zBooleanValue;
                                        z1Var3 = eVar.f35418l;
                                        if (!(sVar instanceof c80.s.a)) {
                                            if (!(sVar instanceof c80.s.b)) {
                                                if (!(sVar instanceof c80.s.c)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                if (i14 == 1) {
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                } else if (i14 == 2) {
                                                    if (i14 == 3) {
                                                    }
                                                    a2 a2Var1116 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1116, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                } else {
                                                    a2 a2Var1117 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1117, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                }
                                                g3.a aVar1111 = g3.f35298f;
                                                i.b bVar10 = new i.b(dVar);
                                                aVar1111.getClass();
                                                g3VarD = g3.a.d(bVar10);
                                                break;
                                            } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                aVar3 = g3.f35298f;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar3;
                                                this.f35450i = z15;
                                                this.f35451j = 0;
                                                this.f35453l = 9;
                                                objA = wj0.d.a(this);
                                                if (objA != aVar12) {
                                                    aVar4 = aVar3;
                                                    i19 = 0;
                                                    boolean zBooleanValue9 = ((Boolean) objA).booleanValue();
                                                    if (i19 != 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    i.a aVar1112 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue9, false, 4, (p005kotlin.jvm.internal.j) null));
                                                    aVar4.getClass();
                                                    g3VarD = g3.a.d(aVar1112);
                                                }
                                            } else {
                                                iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                if (iVar == null) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 != 0) {
                                                }
                                                oj0.f fVar113 = eVar.f35411e;
                                                Context contextC8 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = z1Var3;
                                                this.f35450i = z15;
                                                this.f35451j = i15;
                                                this.f35452k = i16;
                                                this.f35453l = 10;
                                                objI = fVar113.i(contextC8, this);
                                                if (objI != aVar12) {
                                                    boolean z213 = z15;
                                                    i17 = i15;
                                                    i18 = i16;
                                                    z16 = z213;
                                                    z1Var5 = z1Var3;
                                                    it = ((Iterable) objI).iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar114 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar114.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var113 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var113;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    } while (((tj0.a) next).f165114g != i18);
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar115 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar115.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var114 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var114;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                            }
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                        aVar5 = g3.f35298f;
                                        bVar = eVar.f35407a;
                                        aVar6 = (c80.s.a) sVar;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = oVar;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar5;
                                        this.f35447f = eVar;
                                        this.f35448g = bVar;
                                        this.f35449h = aVar6;
                                        this.f35450i = z15;
                                        this.f35453l = 7;
                                        objM = uVar.m(this);
                                        if (objM != aVar12) {
                                            aVar7 = aVar5;
                                            z17 = z15;
                                            bVar2 = bVar;
                                            oVar2 = oVar;
                                            aVar8 = aVar6;
                                            z1Var6 = z1Var3;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var6;
                                            this.f35446e = aVar7;
                                            this.f35447f = null;
                                            this.f35448g = null;
                                            this.f35449h = null;
                                            this.f35450i = z17;
                                            this.f35453l = 8;
                                            objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                            if (objX4 != aVar12) {
                                                z1Var7 = z1Var6;
                                                aVar7.getClass();
                                                g3VarD = g3.a.d(objX4);
                                                z1Var3 = z1Var7;
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return aVar12;
                case 2:
                    aVar2 = (g3.a) this.f35443b;
                    z1Var2 = (z1) this.f35442a;
                    r.b(obj);
                    objG = obj;
                    aVar2.getClass();
                    z1Var2.setValue(g3.a.d(objG));
                    uVar = (zd0.u) KoinJavaComponent.get$default(zd0.u.class, null, null, 6, null);
                    boolean z214 = !eVar.f35408b;
                    this.f35454m = b0Var;
                    this.f35442a = uVar;
                    this.f35443b = null;
                    this.f35453l = 3;
                    objK = uVar.k(z214, this);
                    if (objK != aVar12) {
                        sVar = (c80.s) objK;
                        eVar.f35420n.setValue(sVar);
                        if (!s3.b()) {
                        }
                        if (sVar instanceof c80.s.c) {
                            this.f35454m = b0Var;
                            this.f35442a = uVar;
                            this.f35443b = sVar;
                            this.f35453l = 4;
                            if (f2.a("GCPlusHomeViewModel", this) != aVar12) {
                                uVar2 = uVar;
                                sVar2 = sVar;
                                zd0.u uVar6 = uVar2;
                                sVar = sVar2;
                                uVar = uVar6;
                                ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                                q qVar5 = q.EXCLUSIVE_OFFERS;
                                this.f35454m = b0Var;
                                this.f35442a = uVar;
                                this.f35443b = sVar;
                                this.f35453l = 5;
                                objL = uVar.l(qVar5, this);
                                if (objL != aVar12) {
                                    zBooleanValue = ((Boolean) objL).booleanValue();
                                    if (zBooleanValue) {
                                        z70.j jVar5 = eVar.f35415i;
                                        this.f35454m = b0Var;
                                        this.f35442a = uVar;
                                        this.f35443b = sVar;
                                        this.f35450i = zBooleanValue;
                                        this.f35453l = 6;
                                        objD = jVar5.d(this);
                                        if (objD != aVar12) {
                                            uVar3 = uVar;
                                            z15 = zBooleanValue;
                                            v2Var2 = (v2) objD;
                                            z18 = v2Var2 instanceof v2.b;
                                            if (z18) {
                                                oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                                if (oVar3.f25502b) {
                                                    a2 a2Var1118 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var1118, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                    oVar = oVar3;
                                                } else {
                                                    if (z18) {
                                                        a2 a2Var1119 = a2.SUBSCRIPTIONS;
                                                        String strF16 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var1119, "GCPlusHomeViewModel", strF16);
                                                    } else {
                                                        a2 a2Var11110 = a2.SUBSCRIPTIONS;
                                                        String strF17 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var11110, "GCPlusHomeViewModel", strF17);
                                                    }
                                                    oVar = null;
                                                }
                                            } else {
                                                if (z18) {
                                                    a2 a2Var11111 = a2.SUBSCRIPTIONS;
                                                    String strF18 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11111, "GCPlusHomeViewModel", strF18);
                                                } else {
                                                    a2 a2Var11112 = a2.SUBSCRIPTIONS;
                                                    String strF19 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11112, "GCPlusHomeViewModel", strF19);
                                                }
                                                oVar = null;
                                            }
                                            uVar = uVar3;
                                            z1Var3 = eVar.f35418l;
                                            if (!(sVar instanceof c80.s.a)) {
                                                if (!(sVar instanceof c80.s.b)) {
                                                    if (!(sVar instanceof c80.s.c)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                    if (i14 == 1) {
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                    } else if (i14 == 2) {
                                                        if (i14 == 3) {
                                                        }
                                                        a2 a2Var11113 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var11113, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                    } else {
                                                        a2 a2Var11114 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.f(a2Var11114, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                    }
                                                    g3.a aVar1113 = g3.f35298f;
                                                    i.b bVar11 = new i.b(dVar);
                                                    aVar1113.getClass();
                                                    g3VarD = g3.a.d(bVar11);
                                                    break;
                                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                    aVar3 = g3.f35298f;
                                                    this.f35454m = null;
                                                    this.f35442a = null;
                                                    this.f35443b = null;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = aVar3;
                                                    this.f35450i = z15;
                                                    this.f35451j = 0;
                                                    this.f35453l = 9;
                                                    objA = wj0.d.a(this);
                                                    if (objA != aVar12) {
                                                        aVar4 = aVar3;
                                                        i19 = 0;
                                                        boolean zBooleanValue10 = ((Boolean) objA).booleanValue();
                                                        if (i19 != 0) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        i.a aVar1114 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue10, false, 4, (p005kotlin.jvm.internal.j) null));
                                                        aVar4.getClass();
                                                        g3VarD = g3.a.d(aVar1114);
                                                    }
                                                } else {
                                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                    if (iVar == null) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    if (i15 != 0) {
                                                    }
                                                    oj0.f fVar116 = eVar.f35411e;
                                                    Context contextC9 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = z1Var3;
                                                    this.f35446e = z1Var3;
                                                    this.f35450i = z15;
                                                    this.f35451j = i15;
                                                    this.f35452k = i16;
                                                    this.f35453l = 10;
                                                    objI = fVar116.i(contextC9, this);
                                                    if (objI != aVar12) {
                                                        boolean z215 = z15;
                                                        i17 = i15;
                                                        i18 = i16;
                                                        z16 = z215;
                                                        z1Var5 = z1Var3;
                                                        it = ((Iterable) objI).iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            aVar9 = (tj0.a) next;
                                                            oj0.f fVar117 = eVar.f35411e;
                                                            this.f35454m = b0Var;
                                                            this.f35442a = null;
                                                            this.f35443b = sVar;
                                                            this.f35444c = null;
                                                            this.f35445d = aVar9;
                                                            this.f35446e = z1Var5;
                                                            this.f35447f = z1Var3;
                                                            this.f35450i = z16;
                                                            this.f35451j = i17;
                                                            this.f35452k = i18;
                                                            this.f35453l = 11;
                                                            objJ2 = fVar117.j(this);
                                                            if (objJ2 != aVar12) {
                                                                z1 z1Var115 = z1Var3;
                                                                aVar10 = aVar9;
                                                                z1Var8 = z1Var115;
                                                                sVar3 = sVar;
                                                                while (r0.hasNext()) {
                                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                                        obj2 = obj3;
                                                                        aVar11 = (uj0.a) obj2;
                                                                        if (aVar10 != null) {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        } else {
                                                                            i2.f36769a.getClass();
                                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                        }
                                                                        z1Var3 = z1Var8;
                                                                    }
                                                                }
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        } while (((tj0.a) next).f165114g != i18);
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar118 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar118.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var116 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var116;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                }
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                            aVar5 = g3.f35298f;
                                            bVar = eVar.f35407a;
                                            aVar6 = (c80.s.a) sVar;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = oVar;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar5;
                                            this.f35447f = eVar;
                                            this.f35448g = bVar;
                                            this.f35449h = aVar6;
                                            this.f35450i = z15;
                                            this.f35453l = 7;
                                            objM = uVar.m(this);
                                            if (objM != aVar12) {
                                                aVar7 = aVar5;
                                                z17 = z15;
                                                bVar2 = bVar;
                                                oVar2 = oVar;
                                                aVar8 = aVar6;
                                                z1Var6 = z1Var3;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var6;
                                                this.f35446e = aVar7;
                                                this.f35447f = null;
                                                this.f35448g = null;
                                                this.f35449h = null;
                                                this.f35450i = z17;
                                                this.f35453l = 8;
                                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                                if (objX4 != aVar12) {
                                                    z1Var7 = z1Var6;
                                                    aVar7.getClass();
                                                    g3VarD = g3.a.d(objX4);
                                                    z1Var3 = z1Var7;
                                                    z1Var3.setValue(g3VarD);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    } else {
                                        oVar = null;
                                        z15 = zBooleanValue;
                                        z1Var3 = eVar.f35418l;
                                        if (!(sVar instanceof c80.s.a)) {
                                            if (!(sVar instanceof c80.s.b)) {
                                                if (!(sVar instanceof c80.s.c)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                if (i14 == 1) {
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                } else if (i14 == 2) {
                                                    if (i14 == 3) {
                                                    }
                                                    a2 a2Var11115 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11115, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                } else {
                                                    a2 a2Var11116 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11116, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                }
                                                g3.a aVar1115 = g3.f35298f;
                                                i.b bVar12 = new i.b(dVar);
                                                aVar1115.getClass();
                                                g3VarD = g3.a.d(bVar12);
                                                break;
                                            } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                aVar3 = g3.f35298f;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar3;
                                                this.f35450i = z15;
                                                this.f35451j = 0;
                                                this.f35453l = 9;
                                                objA = wj0.d.a(this);
                                                if (objA != aVar12) {
                                                    aVar4 = aVar3;
                                                    i19 = 0;
                                                    boolean zBooleanValue11 = ((Boolean) objA).booleanValue();
                                                    if (i19 != 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    i.a aVar1116 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue11, false, 4, (p005kotlin.jvm.internal.j) null));
                                                    aVar4.getClass();
                                                    g3VarD = g3.a.d(aVar1116);
                                                }
                                            } else {
                                                iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                if (iVar == null) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 != 0) {
                                                }
                                                oj0.f fVar119 = eVar.f35411e;
                                                Context contextC10 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = z1Var3;
                                                this.f35450i = z15;
                                                this.f35451j = i15;
                                                this.f35452k = i16;
                                                this.f35453l = 10;
                                                objI = fVar119.i(contextC10, this);
                                                if (objI != aVar12) {
                                                    boolean z216 = z15;
                                                    i17 = i15;
                                                    i18 = i16;
                                                    z16 = z216;
                                                    z1Var5 = z1Var3;
                                                    it = ((Iterable) objI).iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar1110 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar1110.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var117 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var117;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    } while (((tj0.a) next).f165114g != i18);
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar1111 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar1111.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var118 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var118;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                            }
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                        aVar5 = g3.f35298f;
                                        bVar = eVar.f35407a;
                                        aVar6 = (c80.s.a) sVar;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = oVar;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar5;
                                        this.f35447f = eVar;
                                        this.f35448g = bVar;
                                        this.f35449h = aVar6;
                                        this.f35450i = z15;
                                        this.f35453l = 7;
                                        objM = uVar.m(this);
                                        if (objM != aVar12) {
                                            aVar7 = aVar5;
                                            z17 = z15;
                                            bVar2 = bVar;
                                            oVar2 = oVar;
                                            aVar8 = aVar6;
                                            z1Var6 = z1Var3;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var6;
                                            this.f35446e = aVar7;
                                            this.f35447f = null;
                                            this.f35448g = null;
                                            this.f35449h = null;
                                            this.f35450i = z17;
                                            this.f35453l = 8;
                                            objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                            if (objX4 != aVar12) {
                                                z1Var7 = z1Var6;
                                                aVar7.getClass();
                                                g3VarD = g3.a.d(objX4);
                                                z1Var3 = z1Var7;
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                            q qVar6 = q.EXCLUSIVE_OFFERS;
                            this.f35454m = b0Var;
                            this.f35442a = uVar;
                            this.f35443b = sVar;
                            this.f35453l = 5;
                            objL = uVar.l(qVar6, this);
                            if (objL != aVar12) {
                                zBooleanValue = ((Boolean) objL).booleanValue();
                                if (zBooleanValue) {
                                    z70.j jVar6 = eVar.f35415i;
                                    this.f35454m = b0Var;
                                    this.f35442a = uVar;
                                    this.f35443b = sVar;
                                    this.f35450i = zBooleanValue;
                                    this.f35453l = 6;
                                    objD = jVar6.d(this);
                                    if (objD != aVar12) {
                                        uVar3 = uVar;
                                        z15 = zBooleanValue;
                                        v2Var2 = (v2) objD;
                                        z18 = v2Var2 instanceof v2.b;
                                        if (z18) {
                                            oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                            if (oVar3.f25502b) {
                                                a2 a2Var11117 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var11117, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                oVar = oVar3;
                                            } else {
                                                if (z18) {
                                                    a2 a2Var11118 = a2.SUBSCRIPTIONS;
                                                    String strF110 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11118, "GCPlusHomeViewModel", strF110);
                                                } else {
                                                    a2 a2Var11119 = a2.SUBSCRIPTIONS;
                                                    String strF111 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var11119, "GCPlusHomeViewModel", strF111);
                                                }
                                                oVar = null;
                                            }
                                        } else {
                                            if (z18) {
                                                a2 a2Var111110 = a2.SUBSCRIPTIONS;
                                                String strF112 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var111110, "GCPlusHomeViewModel", strF112);
                                            } else {
                                                a2 a2Var111111 = a2.SUBSCRIPTIONS;
                                                String strF113 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var111111, "GCPlusHomeViewModel", strF113);
                                            }
                                            oVar = null;
                                        }
                                        uVar = uVar3;
                                        z1Var3 = eVar.f35418l;
                                        if (!(sVar instanceof c80.s.a)) {
                                            if (!(sVar instanceof c80.s.b)) {
                                                if (!(sVar instanceof c80.s.c)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                if (i14 == 1) {
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                } else if (i14 == 2) {
                                                    if (i14 == 3) {
                                                    }
                                                    a2 a2Var111112 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var111112, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                } else {
                                                    a2 a2Var111113 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var111113, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                }
                                                g3.a aVar1117 = g3.f35298f;
                                                i.b bVar13 = new i.b(dVar);
                                                aVar1117.getClass();
                                                g3VarD = g3.a.d(bVar13);
                                                break;
                                            } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                aVar3 = g3.f35298f;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar3;
                                                this.f35450i = z15;
                                                this.f35451j = 0;
                                                this.f35453l = 9;
                                                objA = wj0.d.a(this);
                                                if (objA != aVar12) {
                                                    aVar4 = aVar3;
                                                    i19 = 0;
                                                    boolean zBooleanValue12 = ((Boolean) objA).booleanValue();
                                                    if (i19 != 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    i.a aVar1118 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue12, false, 4, (p005kotlin.jvm.internal.j) null));
                                                    aVar4.getClass();
                                                    g3VarD = g3.a.d(aVar1118);
                                                }
                                            } else {
                                                iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                if (iVar == null) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 != 0) {
                                                }
                                                oj0.f fVar1112 = eVar.f35411e;
                                                Context contextC11 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = z1Var3;
                                                this.f35450i = z15;
                                                this.f35451j = i15;
                                                this.f35452k = i16;
                                                this.f35453l = 10;
                                                objI = fVar1112.i(contextC11, this);
                                                if (objI != aVar12) {
                                                    boolean z217 = z15;
                                                    i17 = i15;
                                                    i18 = i16;
                                                    z16 = z217;
                                                    z1Var5 = z1Var3;
                                                    it = ((Iterable) objI).iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar1113 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar1113.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var119 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var119;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    } while (((tj0.a) next).f165114g != i18);
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar1114 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar1114.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var1110 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var1110;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                            }
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                        aVar5 = g3.f35298f;
                                        bVar = eVar.f35407a;
                                        aVar6 = (c80.s.a) sVar;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = oVar;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar5;
                                        this.f35447f = eVar;
                                        this.f35448g = bVar;
                                        this.f35449h = aVar6;
                                        this.f35450i = z15;
                                        this.f35453l = 7;
                                        objM = uVar.m(this);
                                        if (objM != aVar12) {
                                            aVar7 = aVar5;
                                            z17 = z15;
                                            bVar2 = bVar;
                                            oVar2 = oVar;
                                            aVar8 = aVar6;
                                            z1Var6 = z1Var3;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var6;
                                            this.f35446e = aVar7;
                                            this.f35447f = null;
                                            this.f35448g = null;
                                            this.f35449h = null;
                                            this.f35450i = z17;
                                            this.f35453l = 8;
                                            objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                            if (objX4 != aVar12) {
                                                z1Var7 = z1Var6;
                                                aVar7.getClass();
                                                g3VarD = g3.a.d(objX4);
                                                z1Var3 = z1Var7;
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                } else {
                                    oVar = null;
                                    z15 = zBooleanValue;
                                    z1Var3 = eVar.f35418l;
                                    if (!(sVar instanceof c80.s.a)) {
                                        if (!(sVar instanceof c80.s.b)) {
                                            if (!(sVar instanceof c80.s.c)) {
                                                u0.r();
                                                return null;
                                            }
                                            i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                            if (i14 == 1) {
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                            } else if (i14 == 2) {
                                                if (i14 == 3) {
                                                }
                                                a2 a2Var111114 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var111114, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                            } else {
                                                a2 a2Var111115 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var111115, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                            }
                                            g3.a aVar1119 = g3.f35298f;
                                            i.b bVar14 = new i.b(dVar);
                                            aVar1119.getClass();
                                            g3VarD = g3.a.d(bVar14);
                                            break;
                                        } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                            aVar3 = g3.f35298f;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar3;
                                            this.f35450i = z15;
                                            this.f35451j = 0;
                                            this.f35453l = 9;
                                            objA = wj0.d.a(this);
                                            if (objA != aVar12) {
                                                aVar4 = aVar3;
                                                i19 = 0;
                                                boolean zBooleanValue13 = ((Boolean) objA).booleanValue();
                                                if (i19 != 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i.a aVar11110 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue13, false, 4, (p005kotlin.jvm.internal.j) null));
                                                aVar4.getClass();
                                                g3VarD = g3.a.d(aVar11110);
                                            }
                                        } else {
                                            iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                            if (iVar == null) {
                                                i15 = 0;
                                            } else {
                                                i15 = 0;
                                            }
                                            if (i15 != 0) {
                                            }
                                            oj0.f fVar1115 = eVar.f35411e;
                                            Context contextC12 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = z1Var3;
                                            this.f35450i = z15;
                                            this.f35451j = i15;
                                            this.f35452k = i16;
                                            this.f35453l = 10;
                                            objI = fVar1115.i(contextC12, this);
                                            if (objI != aVar12) {
                                                boolean z218 = z15;
                                                i17 = i15;
                                                i18 = i16;
                                                z16 = z218;
                                                z1Var5 = z1Var3;
                                                it = ((Iterable) objI).iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar1116 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar1116.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var1111 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var1111;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                } while (((tj0.a) next).f165114g != i18);
                                                aVar9 = (tj0.a) next;
                                                oj0.f fVar1117 = eVar.f35411e;
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = aVar9;
                                                this.f35446e = z1Var5;
                                                this.f35447f = z1Var3;
                                                this.f35450i = z16;
                                                this.f35451j = i17;
                                                this.f35452k = i18;
                                                this.f35453l = 11;
                                                objJ2 = fVar1117.j(this);
                                                if (objJ2 != aVar12) {
                                                    z1 z1Var1112 = z1Var3;
                                                    aVar10 = aVar9;
                                                    z1Var8 = z1Var1112;
                                                    sVar3 = sVar;
                                                    while (r0.hasNext()) {
                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                            obj2 = obj3;
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                        }
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                    aVar5 = g3.f35298f;
                                    bVar = eVar.f35407a;
                                    aVar6 = (c80.s.a) sVar;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = oVar;
                                    this.f35445d = z1Var3;
                                    this.f35446e = aVar5;
                                    this.f35447f = eVar;
                                    this.f35448g = bVar;
                                    this.f35449h = aVar6;
                                    this.f35450i = z15;
                                    this.f35453l = 7;
                                    objM = uVar.m(this);
                                    if (objM != aVar12) {
                                        aVar7 = aVar5;
                                        z17 = z15;
                                        bVar2 = bVar;
                                        oVar2 = oVar;
                                        aVar8 = aVar6;
                                        z1Var6 = z1Var3;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = null;
                                        this.f35445d = z1Var6;
                                        this.f35446e = aVar7;
                                        this.f35447f = null;
                                        this.f35448g = null;
                                        this.f35449h = null;
                                        this.f35450i = z17;
                                        this.f35453l = 8;
                                        objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                        if (objX4 != aVar12) {
                                            z1Var7 = z1Var6;
                                            aVar7.getClass();
                                            g3VarD = g3.a.d(objX4);
                                            z1Var3 = z1Var7;
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return aVar12;
                case 3:
                    uVar = (zd0.u) this.f35442a;
                    r.b(obj);
                    objK = obj;
                    sVar = (c80.s) objK;
                    eVar.f35420n.setValue(sVar);
                    if (!s3.b()) {
                        break;
                    }
                    if (sVar instanceof c80.s.c) {
                        this.f35454m = b0Var;
                        this.f35442a = uVar;
                        this.f35443b = sVar;
                        this.f35453l = 4;
                        if (f2.a("GCPlusHomeViewModel", this) != aVar12) {
                            uVar2 = uVar;
                            sVar2 = sVar;
                            zd0.u uVar7 = uVar2;
                            sVar = sVar2;
                            uVar = uVar7;
                            ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                            q qVar7 = q.EXCLUSIVE_OFFERS;
                            this.f35454m = b0Var;
                            this.f35442a = uVar;
                            this.f35443b = sVar;
                            this.f35453l = 5;
                            objL = uVar.l(qVar7, this);
                            if (objL != aVar12) {
                                zBooleanValue = ((Boolean) objL).booleanValue();
                                if (zBooleanValue) {
                                    z70.j jVar7 = eVar.f35415i;
                                    this.f35454m = b0Var;
                                    this.f35442a = uVar;
                                    this.f35443b = sVar;
                                    this.f35450i = zBooleanValue;
                                    this.f35453l = 6;
                                    objD = jVar7.d(this);
                                    if (objD != aVar12) {
                                        uVar3 = uVar;
                                        z15 = zBooleanValue;
                                        v2Var2 = (v2) objD;
                                        z18 = v2Var2 instanceof v2.b;
                                        if (z18) {
                                            oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                            if (oVar3.f25502b) {
                                                a2 a2Var111116 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var111116, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                                oVar = oVar3;
                                            } else {
                                                if (z18) {
                                                    a2 a2Var111117 = a2.SUBSCRIPTIONS;
                                                    String strF114 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var111117, "GCPlusHomeViewModel", strF114);
                                                } else {
                                                    a2 a2Var111118 = a2.SUBSCRIPTIONS;
                                                    String strF115 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var111118, "GCPlusHomeViewModel", strF115);
                                                }
                                                oVar = null;
                                            }
                                        } else {
                                            if (z18) {
                                                a2 a2Var111119 = a2.SUBSCRIPTIONS;
                                                String strF116 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var111119, "GCPlusHomeViewModel", strF116);
                                            } else {
                                                a2 a2Var1111110 = a2.SUBSCRIPTIONS;
                                                String strF117 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var1111110, "GCPlusHomeViewModel", strF117);
                                            }
                                            oVar = null;
                                        }
                                        uVar = uVar3;
                                        z1Var3 = eVar.f35418l;
                                        if (!(sVar instanceof c80.s.a)) {
                                            if (!(sVar instanceof c80.s.b)) {
                                                if (!(sVar instanceof c80.s.c)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                                if (i14 == 1) {
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                                } else if (i14 == 2) {
                                                    if (i14 == 3) {
                                                    }
                                                    a2 a2Var1111111 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1111111, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                                } else {
                                                    a2 a2Var1111112 = a2.SUBSCRIPTIONS;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2Var1111112, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                                }
                                                g3.a aVar11111 = g3.f35298f;
                                                i.b bVar15 = new i.b(dVar);
                                                aVar11111.getClass();
                                                g3VarD = g3.a.d(bVar15);
                                                break;
                                            } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                                aVar3 = g3.f35298f;
                                                this.f35454m = null;
                                                this.f35442a = null;
                                                this.f35443b = null;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = aVar3;
                                                this.f35450i = z15;
                                                this.f35451j = 0;
                                                this.f35453l = 9;
                                                objA = wj0.d.a(this);
                                                if (objA != aVar12) {
                                                    aVar4 = aVar3;
                                                    i19 = 0;
                                                    boolean zBooleanValue14 = ((Boolean) objA).booleanValue();
                                                    if (i19 != 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    i.a aVar11112 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue14, false, 4, (p005kotlin.jvm.internal.j) null));
                                                    aVar4.getClass();
                                                    g3VarD = g3.a.d(aVar11112);
                                                }
                                            } else {
                                                iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                                if (iVar == null) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 != 0) {
                                                }
                                                oj0.f fVar1118 = eVar.f35411e;
                                                Context contextC13 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = z1Var3;
                                                this.f35446e = z1Var3;
                                                this.f35450i = z15;
                                                this.f35451j = i15;
                                                this.f35452k = i16;
                                                this.f35453l = 10;
                                                objI = fVar1118.i(contextC13, this);
                                                if (objI != aVar12) {
                                                    boolean z219 = z15;
                                                    i17 = i15;
                                                    i18 = i16;
                                                    z16 = z219;
                                                    z1Var5 = z1Var3;
                                                    it = ((Iterable) objI).iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        aVar9 = (tj0.a) next;
                                                        oj0.f fVar1119 = eVar.f35411e;
                                                        this.f35454m = b0Var;
                                                        this.f35442a = null;
                                                        this.f35443b = sVar;
                                                        this.f35444c = null;
                                                        this.f35445d = aVar9;
                                                        this.f35446e = z1Var5;
                                                        this.f35447f = z1Var3;
                                                        this.f35450i = z16;
                                                        this.f35451j = i17;
                                                        this.f35452k = i18;
                                                        this.f35453l = 11;
                                                        objJ2 = fVar1119.j(this);
                                                        if (objJ2 != aVar12) {
                                                            z1 z1Var1113 = z1Var3;
                                                            aVar10 = aVar9;
                                                            z1Var8 = z1Var1113;
                                                            sVar3 = sVar;
                                                            while (r0.hasNext()) {
                                                                if (((uj0.a) obj3).f171474i == i18) {
                                                                    obj2 = obj3;
                                                                    aVar11 = (uj0.a) obj2;
                                                                    if (aVar10 != null) {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    } else {
                                                                        i2.f36769a.getClass();
                                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                    }
                                                                    z1Var3 = z1Var8;
                                                                }
                                                            }
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    } while (((tj0.a) next).f165114g != i18);
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar11110 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar11110.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var1114 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var1114;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                            }
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                        aVar5 = g3.f35298f;
                                        bVar = eVar.f35407a;
                                        aVar6 = (c80.s.a) sVar;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = oVar;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar5;
                                        this.f35447f = eVar;
                                        this.f35448g = bVar;
                                        this.f35449h = aVar6;
                                        this.f35450i = z15;
                                        this.f35453l = 7;
                                        objM = uVar.m(this);
                                        if (objM != aVar12) {
                                            aVar7 = aVar5;
                                            z17 = z15;
                                            bVar2 = bVar;
                                            oVar2 = oVar;
                                            aVar8 = aVar6;
                                            z1Var6 = z1Var3;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var6;
                                            this.f35446e = aVar7;
                                            this.f35447f = null;
                                            this.f35448g = null;
                                            this.f35449h = null;
                                            this.f35450i = z17;
                                            this.f35453l = 8;
                                            objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                            if (objX4 != aVar12) {
                                                z1Var7 = z1Var6;
                                                aVar7.getClass();
                                                g3VarD = g3.a.d(objX4);
                                                z1Var3 = z1Var7;
                                                z1Var3.setValue(g3VarD);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                } else {
                                    oVar = null;
                                    z15 = zBooleanValue;
                                    z1Var3 = eVar.f35418l;
                                    if (!(sVar instanceof c80.s.a)) {
                                        if (!(sVar instanceof c80.s.b)) {
                                            if (!(sVar instanceof c80.s.c)) {
                                                u0.r();
                                                return null;
                                            }
                                            i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                            if (i14 == 1) {
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                            } else if (i14 == 2) {
                                                if (i14 == 3) {
                                                }
                                                a2 a2Var1111113 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var1111113, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                            } else {
                                                a2 a2Var1111114 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var1111114, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                            }
                                            g3.a aVar11113 = g3.f35298f;
                                            i.b bVar16 = new i.b(dVar);
                                            aVar11113.getClass();
                                            g3VarD = g3.a.d(bVar16);
                                            break;
                                        } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                            aVar3 = g3.f35298f;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar3;
                                            this.f35450i = z15;
                                            this.f35451j = 0;
                                            this.f35453l = 9;
                                            objA = wj0.d.a(this);
                                            if (objA != aVar12) {
                                                aVar4 = aVar3;
                                                i19 = 0;
                                                boolean zBooleanValue15 = ((Boolean) objA).booleanValue();
                                                if (i19 != 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i.a aVar11114 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue15, false, 4, (p005kotlin.jvm.internal.j) null));
                                                aVar4.getClass();
                                                g3VarD = g3.a.d(aVar11114);
                                            }
                                        } else {
                                            iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                            if (iVar == null) {
                                                i15 = 0;
                                            } else {
                                                i15 = 0;
                                            }
                                            if (i15 != 0) {
                                            }
                                            oj0.f fVar11111 = eVar.f35411e;
                                            Context contextC14 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = z1Var3;
                                            this.f35450i = z15;
                                            this.f35451j = i15;
                                            this.f35452k = i16;
                                            this.f35453l = 10;
                                            objI = fVar11111.i(contextC14, this);
                                            if (objI != aVar12) {
                                                boolean z2110 = z15;
                                                i17 = i15;
                                                i18 = i16;
                                                z16 = z2110;
                                                z1Var5 = z1Var3;
                                                it = ((Iterable) objI).iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar11112 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar11112.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var1115 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var1115;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                } while (((tj0.a) next).f165114g != i18);
                                                aVar9 = (tj0.a) next;
                                                oj0.f fVar11113 = eVar.f35411e;
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = aVar9;
                                                this.f35446e = z1Var5;
                                                this.f35447f = z1Var3;
                                                this.f35450i = z16;
                                                this.f35451j = i17;
                                                this.f35452k = i18;
                                                this.f35453l = 11;
                                                objJ2 = fVar11113.j(this);
                                                if (objJ2 != aVar12) {
                                                    z1 z1Var1116 = z1Var3;
                                                    aVar10 = aVar9;
                                                    z1Var8 = z1Var1116;
                                                    sVar3 = sVar;
                                                    while (r0.hasNext()) {
                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                            obj2 = obj3;
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                        }
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                    aVar5 = g3.f35298f;
                                    bVar = eVar.f35407a;
                                    aVar6 = (c80.s.a) sVar;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = oVar;
                                    this.f35445d = z1Var3;
                                    this.f35446e = aVar5;
                                    this.f35447f = eVar;
                                    this.f35448g = bVar;
                                    this.f35449h = aVar6;
                                    this.f35450i = z15;
                                    this.f35453l = 7;
                                    objM = uVar.m(this);
                                    if (objM != aVar12) {
                                        aVar7 = aVar5;
                                        z17 = z15;
                                        bVar2 = bVar;
                                        oVar2 = oVar;
                                        aVar8 = aVar6;
                                        z1Var6 = z1Var3;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = null;
                                        this.f35445d = z1Var6;
                                        this.f35446e = aVar7;
                                        this.f35447f = null;
                                        this.f35448g = null;
                                        this.f35449h = null;
                                        this.f35450i = z17;
                                        this.f35453l = 8;
                                        objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                        if (objX4 != aVar12) {
                                            z1Var7 = z1Var6;
                                            aVar7.getClass();
                                            g3VarD = g3.a.d(objX4);
                                            z1Var3 = z1Var7;
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                        q qVar8 = q.EXCLUSIVE_OFFERS;
                        this.f35454m = b0Var;
                        this.f35442a = uVar;
                        this.f35443b = sVar;
                        this.f35453l = 5;
                        objL = uVar.l(qVar8, this);
                        if (objL != aVar12) {
                            zBooleanValue = ((Boolean) objL).booleanValue();
                            if (zBooleanValue) {
                                z70.j jVar8 = eVar.f35415i;
                                this.f35454m = b0Var;
                                this.f35442a = uVar;
                                this.f35443b = sVar;
                                this.f35450i = zBooleanValue;
                                this.f35453l = 6;
                                objD = jVar8.d(this);
                                if (objD != aVar12) {
                                    uVar3 = uVar;
                                    z15 = zBooleanValue;
                                    v2Var2 = (v2) objD;
                                    z18 = v2Var2 instanceof v2.b;
                                    if (z18) {
                                        oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                        if (oVar3.f25502b) {
                                            a2 a2Var1111115 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var1111115, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                            oVar = oVar3;
                                        } else {
                                            if (z18) {
                                                a2 a2Var1111116 = a2.SUBSCRIPTIONS;
                                                String strF118 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var1111116, "GCPlusHomeViewModel", strF118);
                                            } else {
                                                a2 a2Var1111117 = a2.SUBSCRIPTIONS;
                                                String strF119 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var1111117, "GCPlusHomeViewModel", strF119);
                                            }
                                            oVar = null;
                                        }
                                    } else {
                                        if (z18) {
                                            a2 a2Var1111118 = a2.SUBSCRIPTIONS;
                                            String strF1110 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var1111118, "GCPlusHomeViewModel", strF1110);
                                        } else {
                                            a2 a2Var1111119 = a2.SUBSCRIPTIONS;
                                            String strF1111 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var1111119, "GCPlusHomeViewModel", strF1111);
                                        }
                                        oVar = null;
                                    }
                                    uVar = uVar3;
                                    z1Var3 = eVar.f35418l;
                                    if (!(sVar instanceof c80.s.a)) {
                                        if (!(sVar instanceof c80.s.b)) {
                                            if (!(sVar instanceof c80.s.c)) {
                                                u0.r();
                                                return null;
                                            }
                                            i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                            if (i14 == 1) {
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                            } else if (i14 == 2) {
                                                if (i14 == 3) {
                                                }
                                                a2 a2Var11111110 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var11111110, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                            } else {
                                                a2 a2Var11111111 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var11111111, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                            }
                                            g3.a aVar11115 = g3.f35298f;
                                            i.b bVar17 = new i.b(dVar);
                                            aVar11115.getClass();
                                            g3VarD = g3.a.d(bVar17);
                                            break;
                                        } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                            aVar3 = g3.f35298f;
                                            this.f35454m = null;
                                            this.f35442a = null;
                                            this.f35443b = null;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = aVar3;
                                            this.f35450i = z15;
                                            this.f35451j = 0;
                                            this.f35453l = 9;
                                            objA = wj0.d.a(this);
                                            if (objA != aVar12) {
                                                aVar4 = aVar3;
                                                i19 = 0;
                                                boolean zBooleanValue16 = ((Boolean) objA).booleanValue();
                                                if (i19 != 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                i.a aVar11116 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue16, false, 4, (p005kotlin.jvm.internal.j) null));
                                                aVar4.getClass();
                                                g3VarD = g3.a.d(aVar11116);
                                            }
                                        } else {
                                            iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                            if (iVar == null) {
                                                i15 = 0;
                                            } else {
                                                i15 = 0;
                                            }
                                            if (i15 != 0) {
                                            }
                                            oj0.f fVar11114 = eVar.f35411e;
                                            Context contextC15 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = z1Var3;
                                            this.f35446e = z1Var3;
                                            this.f35450i = z15;
                                            this.f35451j = i15;
                                            this.f35452k = i16;
                                            this.f35453l = 10;
                                            objI = fVar11114.i(contextC15, this);
                                            if (objI != aVar12) {
                                                boolean z2111 = z15;
                                                i17 = i15;
                                                i18 = i16;
                                                z16 = z2111;
                                                z1Var5 = z1Var3;
                                                it = ((Iterable) objI).iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    aVar9 = (tj0.a) next;
                                                    oj0.f fVar11115 = eVar.f35411e;
                                                    this.f35454m = b0Var;
                                                    this.f35442a = null;
                                                    this.f35443b = sVar;
                                                    this.f35444c = null;
                                                    this.f35445d = aVar9;
                                                    this.f35446e = z1Var5;
                                                    this.f35447f = z1Var3;
                                                    this.f35450i = z16;
                                                    this.f35451j = i17;
                                                    this.f35452k = i18;
                                                    this.f35453l = 11;
                                                    objJ2 = fVar11115.j(this);
                                                    if (objJ2 != aVar12) {
                                                        z1 z1Var1117 = z1Var3;
                                                        aVar10 = aVar9;
                                                        z1Var8 = z1Var1117;
                                                        sVar3 = sVar;
                                                        while (r0.hasNext()) {
                                                            if (((uj0.a) obj3).f171474i == i18) {
                                                                obj2 = obj3;
                                                                aVar11 = (uj0.a) obj2;
                                                                if (aVar10 != null) {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                } else {
                                                                    i2.f36769a.getClass();
                                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                                }
                                                                z1Var3 = z1Var8;
                                                            }
                                                        }
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                } while (((tj0.a) next).f165114g != i18);
                                                aVar9 = (tj0.a) next;
                                                oj0.f fVar11116 = eVar.f35411e;
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = aVar9;
                                                this.f35446e = z1Var5;
                                                this.f35447f = z1Var3;
                                                this.f35450i = z16;
                                                this.f35451j = i17;
                                                this.f35452k = i18;
                                                this.f35453l = 11;
                                                objJ2 = fVar11116.j(this);
                                                if (objJ2 != aVar12) {
                                                    z1 z1Var1118 = z1Var3;
                                                    aVar10 = aVar9;
                                                    z1Var8 = z1Var1118;
                                                    sVar3 = sVar;
                                                    while (r0.hasNext()) {
                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                            obj2 = obj3;
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                        }
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                    aVar5 = g3.f35298f;
                                    bVar = eVar.f35407a;
                                    aVar6 = (c80.s.a) sVar;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = oVar;
                                    this.f35445d = z1Var3;
                                    this.f35446e = aVar5;
                                    this.f35447f = eVar;
                                    this.f35448g = bVar;
                                    this.f35449h = aVar6;
                                    this.f35450i = z15;
                                    this.f35453l = 7;
                                    objM = uVar.m(this);
                                    if (objM != aVar12) {
                                        aVar7 = aVar5;
                                        z17 = z15;
                                        bVar2 = bVar;
                                        oVar2 = oVar;
                                        aVar8 = aVar6;
                                        z1Var6 = z1Var3;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = null;
                                        this.f35445d = z1Var6;
                                        this.f35446e = aVar7;
                                        this.f35447f = null;
                                        this.f35448g = null;
                                        this.f35449h = null;
                                        this.f35450i = z17;
                                        this.f35453l = 8;
                                        objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                        if (objX4 != aVar12) {
                                            z1Var7 = z1Var6;
                                            aVar7.getClass();
                                            g3VarD = g3.a.d(objX4);
                                            z1Var3 = z1Var7;
                                            z1Var3.setValue(g3VarD);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                oVar = null;
                                z15 = zBooleanValue;
                                z1Var3 = eVar.f35418l;
                                if (!(sVar instanceof c80.s.a)) {
                                    if (!(sVar instanceof c80.s.b)) {
                                        if (!(sVar instanceof c80.s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                        if (i14 == 1) {
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                        } else if (i14 == 2) {
                                            if (i14 == 3) {
                                            }
                                            a2 a2Var11111112 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var11111112, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                        } else {
                                            a2 a2Var11111113 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var11111113, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                        }
                                        g3.a aVar11117 = g3.f35298f;
                                        i.b bVar18 = new i.b(dVar);
                                        aVar11117.getClass();
                                        g3VarD = g3.a.d(bVar18);
                                        break;
                                    } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                        aVar3 = g3.f35298f;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = null;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar3;
                                        this.f35450i = z15;
                                        this.f35451j = 0;
                                        this.f35453l = 9;
                                        objA = wj0.d.a(this);
                                        if (objA != aVar12) {
                                            aVar4 = aVar3;
                                            i19 = 0;
                                            boolean zBooleanValue17 = ((Boolean) objA).booleanValue();
                                            if (i19 != 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            i.a aVar11118 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue17, false, 4, (p005kotlin.jvm.internal.j) null));
                                            aVar4.getClass();
                                            g3VarD = g3.a.d(aVar11118);
                                        }
                                    } else {
                                        iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                        if (iVar == null) {
                                            i15 = 0;
                                        } else {
                                            i15 = 0;
                                        }
                                        if (i15 != 0) {
                                        }
                                        oj0.f fVar11117 = eVar.f35411e;
                                        Context contextC16 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                        this.f35454m = b0Var;
                                        this.f35442a = null;
                                        this.f35443b = sVar;
                                        this.f35444c = null;
                                        this.f35445d = z1Var3;
                                        this.f35446e = z1Var3;
                                        this.f35450i = z15;
                                        this.f35451j = i15;
                                        this.f35452k = i16;
                                        this.f35453l = 10;
                                        objI = fVar11117.i(contextC16, this);
                                        if (objI != aVar12) {
                                            boolean z2112 = z15;
                                            i17 = i15;
                                            i18 = i16;
                                            z16 = z2112;
                                            z1Var5 = z1Var3;
                                            it = ((Iterable) objI).iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = null;
                                                }
                                                aVar9 = (tj0.a) next;
                                                oj0.f fVar11118 = eVar.f35411e;
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = aVar9;
                                                this.f35446e = z1Var5;
                                                this.f35447f = z1Var3;
                                                this.f35450i = z16;
                                                this.f35451j = i17;
                                                this.f35452k = i18;
                                                this.f35453l = 11;
                                                objJ2 = fVar11118.j(this);
                                                if (objJ2 != aVar12) {
                                                    z1 z1Var1119 = z1Var3;
                                                    aVar10 = aVar9;
                                                    z1Var8 = z1Var1119;
                                                    sVar3 = sVar;
                                                    while (r0.hasNext()) {
                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                            obj2 = obj3;
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            } while (((tj0.a) next).f165114g != i18);
                                            aVar9 = (tj0.a) next;
                                            oj0.f fVar11119 = eVar.f35411e;
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = aVar9;
                                            this.f35446e = z1Var5;
                                            this.f35447f = z1Var3;
                                            this.f35450i = z16;
                                            this.f35451j = i17;
                                            this.f35452k = i18;
                                            this.f35453l = 11;
                                            objJ2 = fVar11119.j(this);
                                            if (objJ2 != aVar12) {
                                                z1 z1Var11110 = z1Var3;
                                                aVar10 = aVar9;
                                                z1Var8 = z1Var11110;
                                                sVar3 = sVar;
                                                while (r0.hasNext()) {
                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                        obj2 = obj3;
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        }
                                    }
                                    z1Var3.setValue(g3VarD);
                                    return Unit.INSTANCE;
                                }
                                aVar5 = g3.f35298f;
                                bVar = eVar.f35407a;
                                aVar6 = (c80.s.a) sVar;
                                this.f35454m = null;
                                this.f35442a = null;
                                this.f35443b = null;
                                this.f35444c = oVar;
                                this.f35445d = z1Var3;
                                this.f35446e = aVar5;
                                this.f35447f = eVar;
                                this.f35448g = bVar;
                                this.f35449h = aVar6;
                                this.f35450i = z15;
                                this.f35453l = 7;
                                objM = uVar.m(this);
                                if (objM != aVar12) {
                                    aVar7 = aVar5;
                                    z17 = z15;
                                    bVar2 = bVar;
                                    oVar2 = oVar;
                                    aVar8 = aVar6;
                                    z1Var6 = z1Var3;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = null;
                                    this.f35445d = z1Var6;
                                    this.f35446e = aVar7;
                                    this.f35447f = null;
                                    this.f35448g = null;
                                    this.f35449h = null;
                                    this.f35450i = z17;
                                    this.f35453l = 8;
                                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                    if (objX4 != aVar12) {
                                        z1Var7 = z1Var6;
                                        aVar7.getClass();
                                        g3VarD = g3.a.d(objX4);
                                        z1Var3 = z1Var7;
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                    return aVar12;
                case 4:
                    sVar2 = (c80.s) this.f35443b;
                    uVar2 = (zd0.u) this.f35442a;
                    r.b(obj);
                    zd0.u uVar8 = uVar2;
                    sVar = sVar2;
                    uVar = uVar8;
                    ge1.b.T(b0Var, null, null, new a(uVar, null), 3);
                    q qVar9 = q.EXCLUSIVE_OFFERS;
                    this.f35454m = b0Var;
                    this.f35442a = uVar;
                    this.f35443b = sVar;
                    this.f35453l = 5;
                    objL = uVar.l(qVar9, this);
                    if (objL != aVar12) {
                        zBooleanValue = ((Boolean) objL).booleanValue();
                        if (zBooleanValue) {
                            z70.j jVar9 = eVar.f35415i;
                            this.f35454m = b0Var;
                            this.f35442a = uVar;
                            this.f35443b = sVar;
                            this.f35450i = zBooleanValue;
                            this.f35453l = 6;
                            objD = jVar9.d(this);
                            if (objD != aVar12) {
                                uVar3 = uVar;
                                z15 = zBooleanValue;
                                v2Var2 = (v2) objD;
                                z18 = v2Var2 instanceof v2.b;
                                if (z18) {
                                    oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                    if (oVar3.f25502b) {
                                        a2 a2Var11111114 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var11111114, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                        oVar = oVar3;
                                    } else {
                                        if (z18) {
                                            a2 a2Var11111115 = a2.SUBSCRIPTIONS;
                                            String strF1112 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var11111115, "GCPlusHomeViewModel", strF1112);
                                        } else {
                                            a2 a2Var11111116 = a2.SUBSCRIPTIONS;
                                            String strF1113 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var11111116, "GCPlusHomeViewModel", strF1113);
                                        }
                                        oVar = null;
                                    }
                                } else {
                                    if (z18) {
                                        a2 a2Var11111117 = a2.SUBSCRIPTIONS;
                                        String strF1114 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var11111117, "GCPlusHomeViewModel", strF1114);
                                    } else {
                                        a2 a2Var11111118 = a2.SUBSCRIPTIONS;
                                        String strF1115 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var11111118, "GCPlusHomeViewModel", strF1115);
                                    }
                                    oVar = null;
                                }
                                uVar = uVar3;
                                z1Var3 = eVar.f35418l;
                                if (!(sVar instanceof c80.s.a)) {
                                    if (!(sVar instanceof c80.s.b)) {
                                        if (!(sVar instanceof c80.s.c)) {
                                            u0.r();
                                            return null;
                                        }
                                        i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                        if (i14 == 1) {
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                        } else if (i14 == 2) {
                                            if (i14 == 3) {
                                            }
                                            a2 a2Var11111119 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var11111119, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                        } else {
                                            a2 a2Var111111110 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var111111110, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                            dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                        }
                                        g3.a aVar11119 = g3.f35298f;
                                        i.b bVar19 = new i.b(dVar);
                                        aVar11119.getClass();
                                        g3VarD = g3.a.d(bVar19);
                                        break;
                                    } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                        aVar3 = g3.f35298f;
                                        this.f35454m = null;
                                        this.f35442a = null;
                                        this.f35443b = null;
                                        this.f35444c = null;
                                        this.f35445d = z1Var3;
                                        this.f35446e = aVar3;
                                        this.f35450i = z15;
                                        this.f35451j = 0;
                                        this.f35453l = 9;
                                        objA = wj0.d.a(this);
                                        if (objA != aVar12) {
                                            aVar4 = aVar3;
                                            i19 = 0;
                                            boolean zBooleanValue18 = ((Boolean) objA).booleanValue();
                                            if (i19 != 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            i.a aVar111110 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue18, false, 4, (p005kotlin.jvm.internal.j) null));
                                            aVar4.getClass();
                                            g3VarD = g3.a.d(aVar111110);
                                        }
                                    } else {
                                        iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                        if (iVar == null) {
                                            i15 = 0;
                                        } else {
                                            i15 = 0;
                                        }
                                        if (i15 != 0) {
                                        }
                                        oj0.f fVar111110 = eVar.f35411e;
                                        Context contextC17 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                        this.f35454m = b0Var;
                                        this.f35442a = null;
                                        this.f35443b = sVar;
                                        this.f35444c = null;
                                        this.f35445d = z1Var3;
                                        this.f35446e = z1Var3;
                                        this.f35450i = z15;
                                        this.f35451j = i15;
                                        this.f35452k = i16;
                                        this.f35453l = 10;
                                        objI = fVar111110.i(contextC17, this);
                                        if (objI != aVar12) {
                                            boolean z2113 = z15;
                                            i17 = i15;
                                            i18 = i16;
                                            z16 = z2113;
                                            z1Var5 = z1Var3;
                                            it = ((Iterable) objI).iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = null;
                                                }
                                                aVar9 = (tj0.a) next;
                                                oj0.f fVar111111 = eVar.f35411e;
                                                this.f35454m = b0Var;
                                                this.f35442a = null;
                                                this.f35443b = sVar;
                                                this.f35444c = null;
                                                this.f35445d = aVar9;
                                                this.f35446e = z1Var5;
                                                this.f35447f = z1Var3;
                                                this.f35450i = z16;
                                                this.f35451j = i17;
                                                this.f35452k = i18;
                                                this.f35453l = 11;
                                                objJ2 = fVar111111.j(this);
                                                if (objJ2 != aVar12) {
                                                    z1 z1Var11111 = z1Var3;
                                                    aVar10 = aVar9;
                                                    z1Var8 = z1Var11111;
                                                    sVar3 = sVar;
                                                    while (r0.hasNext()) {
                                                        if (((uj0.a) obj3).f171474i == i18) {
                                                            obj2 = obj3;
                                                            aVar11 = (uj0.a) obj2;
                                                            if (aVar10 != null) {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            } else {
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                            }
                                                            z1Var3 = z1Var8;
                                                        }
                                                    }
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            } while (((tj0.a) next).f165114g != i18);
                                            aVar9 = (tj0.a) next;
                                            oj0.f fVar111112 = eVar.f35411e;
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = aVar9;
                                            this.f35446e = z1Var5;
                                            this.f35447f = z1Var3;
                                            this.f35450i = z16;
                                            this.f35451j = i17;
                                            this.f35452k = i18;
                                            this.f35453l = 11;
                                            objJ2 = fVar111112.j(this);
                                            if (objJ2 != aVar12) {
                                                z1 z1Var11112 = z1Var3;
                                                aVar10 = aVar9;
                                                z1Var8 = z1Var11112;
                                                sVar3 = sVar;
                                                while (r0.hasNext()) {
                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                        obj2 = obj3;
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        }
                                    }
                                    z1Var3.setValue(g3VarD);
                                    return Unit.INSTANCE;
                                }
                                aVar5 = g3.f35298f;
                                bVar = eVar.f35407a;
                                aVar6 = (c80.s.a) sVar;
                                this.f35454m = null;
                                this.f35442a = null;
                                this.f35443b = null;
                                this.f35444c = oVar;
                                this.f35445d = z1Var3;
                                this.f35446e = aVar5;
                                this.f35447f = eVar;
                                this.f35448g = bVar;
                                this.f35449h = aVar6;
                                this.f35450i = z15;
                                this.f35453l = 7;
                                objM = uVar.m(this);
                                if (objM != aVar12) {
                                    aVar7 = aVar5;
                                    z17 = z15;
                                    bVar2 = bVar;
                                    oVar2 = oVar;
                                    aVar8 = aVar6;
                                    z1Var6 = z1Var3;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = null;
                                    this.f35445d = z1Var6;
                                    this.f35446e = aVar7;
                                    this.f35447f = null;
                                    this.f35448g = null;
                                    this.f35449h = null;
                                    this.f35450i = z17;
                                    this.f35453l = 8;
                                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                    if (objX4 != aVar12) {
                                        z1Var7 = z1Var6;
                                        aVar7.getClass();
                                        g3VarD = g3.a.d(objX4);
                                        z1Var3 = z1Var7;
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            oVar = null;
                            z15 = zBooleanValue;
                            z1Var3 = eVar.f35418l;
                            if (!(sVar instanceof c80.s.a)) {
                                if (!(sVar instanceof c80.s.b)) {
                                    if (!(sVar instanceof c80.s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                    if (i14 == 1) {
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                    } else if (i14 == 2) {
                                        if (i14 == 3) {
                                        }
                                        a2 a2Var111111111 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111111, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                    } else {
                                        a2 a2Var111111112 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111112, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                    }
                                    g3.a aVar111111 = g3.f35298f;
                                    i.b bVar110 = new i.b(dVar);
                                    aVar111111.getClass();
                                    g3VarD = g3.a.d(bVar110);
                                    break;
                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                    aVar3 = g3.f35298f;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = null;
                                    this.f35445d = z1Var3;
                                    this.f35446e = aVar3;
                                    this.f35450i = z15;
                                    this.f35451j = 0;
                                    this.f35453l = 9;
                                    objA = wj0.d.a(this);
                                    if (objA != aVar12) {
                                        aVar4 = aVar3;
                                        i19 = 0;
                                        boolean zBooleanValue19 = ((Boolean) objA).booleanValue();
                                        if (i19 != 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        i.a aVar111112 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue19, false, 4, (p005kotlin.jvm.internal.j) null));
                                        aVar4.getClass();
                                        g3VarD = g3.a.d(aVar111112);
                                    }
                                } else {
                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                    if (iVar == null) {
                                        i15 = 0;
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i15 != 0) {
                                    }
                                    oj0.f fVar111113 = eVar.f35411e;
                                    Context contextC18 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                    this.f35454m = b0Var;
                                    this.f35442a = null;
                                    this.f35443b = sVar;
                                    this.f35444c = null;
                                    this.f35445d = z1Var3;
                                    this.f35446e = z1Var3;
                                    this.f35450i = z15;
                                    this.f35451j = i15;
                                    this.f35452k = i16;
                                    this.f35453l = 10;
                                    objI = fVar111113.i(contextC18, this);
                                    if (objI != aVar12) {
                                        boolean z2114 = z15;
                                        i17 = i15;
                                        i18 = i16;
                                        z16 = z2114;
                                        z1Var5 = z1Var3;
                                        it = ((Iterable) objI).iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            aVar9 = (tj0.a) next;
                                            oj0.f fVar111114 = eVar.f35411e;
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = aVar9;
                                            this.f35446e = z1Var5;
                                            this.f35447f = z1Var3;
                                            this.f35450i = z16;
                                            this.f35451j = i17;
                                            this.f35452k = i18;
                                            this.f35453l = 11;
                                            objJ2 = fVar111114.j(this);
                                            if (objJ2 != aVar12) {
                                                z1 z1Var11113 = z1Var3;
                                                aVar10 = aVar9;
                                                z1Var8 = z1Var11113;
                                                sVar3 = sVar;
                                                while (r0.hasNext()) {
                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                        obj2 = obj3;
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        } while (((tj0.a) next).f165114g != i18);
                                        aVar9 = (tj0.a) next;
                                        oj0.f fVar111115 = eVar.f35411e;
                                        this.f35454m = b0Var;
                                        this.f35442a = null;
                                        this.f35443b = sVar;
                                        this.f35444c = null;
                                        this.f35445d = aVar9;
                                        this.f35446e = z1Var5;
                                        this.f35447f = z1Var3;
                                        this.f35450i = z16;
                                        this.f35451j = i17;
                                        this.f35452k = i18;
                                        this.f35453l = 11;
                                        objJ2 = fVar111115.j(this);
                                        if (objJ2 != aVar12) {
                                            z1 z1Var11114 = z1Var3;
                                            aVar10 = aVar9;
                                            z1Var8 = z1Var11114;
                                            sVar3 = sVar;
                                            while (r0.hasNext()) {
                                                if (((uj0.a) obj3).f171474i == i18) {
                                                    obj2 = obj3;
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                            aVar11 = (uj0.a) obj2;
                                            if (aVar10 != null) {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            } else {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            }
                                            z1Var3 = z1Var8;
                                        }
                                    }
                                }
                                z1Var3.setValue(g3VarD);
                                return Unit.INSTANCE;
                            }
                            aVar5 = g3.f35298f;
                            bVar = eVar.f35407a;
                            aVar6 = (c80.s.a) sVar;
                            this.f35454m = null;
                            this.f35442a = null;
                            this.f35443b = null;
                            this.f35444c = oVar;
                            this.f35445d = z1Var3;
                            this.f35446e = aVar5;
                            this.f35447f = eVar;
                            this.f35448g = bVar;
                            this.f35449h = aVar6;
                            this.f35450i = z15;
                            this.f35453l = 7;
                            objM = uVar.m(this);
                            if (objM != aVar12) {
                                aVar7 = aVar5;
                                z17 = z15;
                                bVar2 = bVar;
                                oVar2 = oVar;
                                aVar8 = aVar6;
                                z1Var6 = z1Var3;
                                this.f35454m = null;
                                this.f35442a = null;
                                this.f35443b = null;
                                this.f35444c = null;
                                this.f35445d = z1Var6;
                                this.f35446e = aVar7;
                                this.f35447f = null;
                                this.f35448g = null;
                                this.f35449h = null;
                                this.f35450i = z17;
                                this.f35453l = 8;
                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                if (objX4 != aVar12) {
                                    z1Var7 = z1Var6;
                                    aVar7.getClass();
                                    g3VarD = g3.a.d(objX4);
                                    z1Var3 = z1Var7;
                                    z1Var3.setValue(g3VarD);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return aVar12;
                case 5:
                    c80.s sVar4 = (c80.s) this.f35443b;
                    zd0.u uVar9 = (zd0.u) this.f35442a;
                    r.b(obj);
                    sVar = sVar4;
                    uVar = uVar9;
                    objL = obj;
                    zBooleanValue = ((Boolean) objL).booleanValue();
                    if (zBooleanValue) {
                        z70.j jVar10 = eVar.f35415i;
                        this.f35454m = b0Var;
                        this.f35442a = uVar;
                        this.f35443b = sVar;
                        this.f35450i = zBooleanValue;
                        this.f35453l = 6;
                        objD = jVar10.d(this);
                        if (objD != aVar12) {
                            uVar3 = uVar;
                            z15 = zBooleanValue;
                            v2Var2 = (v2) objD;
                            z18 = v2Var2 instanceof v2.b;
                            if (z18) {
                                oVar3 = (o) ((v2.b) v2Var2).f47386a;
                                if (oVar3.f25502b) {
                                    a2 a2Var111111113 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var111111113, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                                    oVar = oVar3;
                                } else {
                                    if (z18) {
                                        a2 a2Var111111114 = a2.SUBSCRIPTIONS;
                                        String strF1116 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111114, "GCPlusHomeViewModel", strF1116);
                                    } else {
                                        a2 a2Var111111115 = a2.SUBSCRIPTIONS;
                                        String strF1117 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111115, "GCPlusHomeViewModel", strF1117);
                                    }
                                    oVar = null;
                                }
                            } else {
                                if (z18) {
                                    a2 a2Var111111116 = a2.SUBSCRIPTIONS;
                                    String strF1118 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var111111116, "GCPlusHomeViewModel", strF1118);
                                } else {
                                    a2 a2Var111111117 = a2.SUBSCRIPTIONS;
                                    String strF1119 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var111111117, "GCPlusHomeViewModel", strF1119);
                                }
                                oVar = null;
                            }
                            uVar = uVar3;
                            z1Var3 = eVar.f35418l;
                            if (!(sVar instanceof c80.s.a)) {
                                if (!(sVar instanceof c80.s.b)) {
                                    if (!(sVar instanceof c80.s.c)) {
                                        u0.r();
                                        return null;
                                    }
                                    i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                    if (i14 == 1) {
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                    } else if (i14 == 2) {
                                        if (i14 == 3) {
                                        }
                                        a2 a2Var111111118 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111118, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                    } else {
                                        a2 a2Var111111119 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var111111119, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                        dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                    }
                                    g3.a aVar111113 = g3.f35298f;
                                    i.b bVar111 = new i.b(dVar);
                                    aVar111113.getClass();
                                    g3VarD = g3.a.d(bVar111);
                                    break;
                                } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                    aVar3 = g3.f35298f;
                                    this.f35454m = null;
                                    this.f35442a = null;
                                    this.f35443b = null;
                                    this.f35444c = null;
                                    this.f35445d = z1Var3;
                                    this.f35446e = aVar3;
                                    this.f35450i = z15;
                                    this.f35451j = 0;
                                    this.f35453l = 9;
                                    objA = wj0.d.a(this);
                                    if (objA != aVar12) {
                                        aVar4 = aVar3;
                                        i19 = 0;
                                        boolean zBooleanValue110 = ((Boolean) objA).booleanValue();
                                        if (i19 != 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        i.a aVar111114 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue110, false, 4, (p005kotlin.jvm.internal.j) null));
                                        aVar4.getClass();
                                        g3VarD = g3.a.d(aVar111114);
                                    }
                                } else {
                                    iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                    if (iVar == null) {
                                        i15 = 0;
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i15 != 0) {
                                    }
                                    oj0.f fVar111116 = eVar.f35411e;
                                    Context contextC19 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                    this.f35454m = b0Var;
                                    this.f35442a = null;
                                    this.f35443b = sVar;
                                    this.f35444c = null;
                                    this.f35445d = z1Var3;
                                    this.f35446e = z1Var3;
                                    this.f35450i = z15;
                                    this.f35451j = i15;
                                    this.f35452k = i16;
                                    this.f35453l = 10;
                                    objI = fVar111116.i(contextC19, this);
                                    if (objI != aVar12) {
                                        boolean z2115 = z15;
                                        i17 = i15;
                                        i18 = i16;
                                        z16 = z2115;
                                        z1Var5 = z1Var3;
                                        it = ((Iterable) objI).iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            aVar9 = (tj0.a) next;
                                            oj0.f fVar111117 = eVar.f35411e;
                                            this.f35454m = b0Var;
                                            this.f35442a = null;
                                            this.f35443b = sVar;
                                            this.f35444c = null;
                                            this.f35445d = aVar9;
                                            this.f35446e = z1Var5;
                                            this.f35447f = z1Var3;
                                            this.f35450i = z16;
                                            this.f35451j = i17;
                                            this.f35452k = i18;
                                            this.f35453l = 11;
                                            objJ2 = fVar111117.j(this);
                                            if (objJ2 != aVar12) {
                                                z1 z1Var11115 = z1Var3;
                                                aVar10 = aVar9;
                                                z1Var8 = z1Var11115;
                                                sVar3 = sVar;
                                                while (r0.hasNext()) {
                                                    if (((uj0.a) obj3).f171474i == i18) {
                                                        obj2 = obj3;
                                                        aVar11 = (uj0.a) obj2;
                                                        if (aVar10 != null) {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        } else {
                                                            i2.f36769a.getClass();
                                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                        }
                                                        z1Var3 = z1Var8;
                                                    }
                                                }
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        } while (((tj0.a) next).f165114g != i18);
                                        aVar9 = (tj0.a) next;
                                        oj0.f fVar111118 = eVar.f35411e;
                                        this.f35454m = b0Var;
                                        this.f35442a = null;
                                        this.f35443b = sVar;
                                        this.f35444c = null;
                                        this.f35445d = aVar9;
                                        this.f35446e = z1Var5;
                                        this.f35447f = z1Var3;
                                        this.f35450i = z16;
                                        this.f35451j = i17;
                                        this.f35452k = i18;
                                        this.f35453l = 11;
                                        objJ2 = fVar111118.j(this);
                                        if (objJ2 != aVar12) {
                                            z1 z1Var11116 = z1Var3;
                                            aVar10 = aVar9;
                                            z1Var8 = z1Var11116;
                                            sVar3 = sVar;
                                            while (r0.hasNext()) {
                                                if (((uj0.a) obj3).f171474i == i18) {
                                                    obj2 = obj3;
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                            aVar11 = (uj0.a) obj2;
                                            if (aVar10 != null) {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            } else {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            }
                                            z1Var3 = z1Var8;
                                        }
                                    }
                                }
                                z1Var3.setValue(g3VarD);
                                return Unit.INSTANCE;
                            }
                            aVar5 = g3.f35298f;
                            bVar = eVar.f35407a;
                            aVar6 = (c80.s.a) sVar;
                            this.f35454m = null;
                            this.f35442a = null;
                            this.f35443b = null;
                            this.f35444c = oVar;
                            this.f35445d = z1Var3;
                            this.f35446e = aVar5;
                            this.f35447f = eVar;
                            this.f35448g = bVar;
                            this.f35449h = aVar6;
                            this.f35450i = z15;
                            this.f35453l = 7;
                            objM = uVar.m(this);
                            if (objM != aVar12) {
                                aVar7 = aVar5;
                                z17 = z15;
                                bVar2 = bVar;
                                oVar2 = oVar;
                                aVar8 = aVar6;
                                z1Var6 = z1Var3;
                                this.f35454m = null;
                                this.f35442a = null;
                                this.f35443b = null;
                                this.f35444c = null;
                                this.f35445d = z1Var6;
                                this.f35446e = aVar7;
                                this.f35447f = null;
                                this.f35448g = null;
                                this.f35449h = null;
                                this.f35450i = z17;
                                this.f35453l = 8;
                                objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                                if (objX4 != aVar12) {
                                    z1Var7 = z1Var6;
                                    aVar7.getClass();
                                    g3VarD = g3.a.d(objX4);
                                    z1Var3 = z1Var7;
                                    z1Var3.setValue(g3VarD);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        oVar = null;
                        z15 = zBooleanValue;
                        z1Var3 = eVar.f35418l;
                        if (!(sVar instanceof c80.s.a)) {
                            if (!(sVar instanceof c80.s.b)) {
                                if (!(sVar instanceof c80.s.c)) {
                                    u0.r();
                                    return null;
                                }
                                i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                                if (i14 == 1) {
                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                                } else if (i14 == 2) {
                                    if (i14 == 3) {
                                    }
                                    a2 a2Var1111111110 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var1111111110, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                                } else {
                                    a2 a2Var1111111111 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var1111111111, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                    dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                                }
                                g3.a aVar111115 = g3.f35298f;
                                i.b bVar112 = new i.b(dVar);
                                aVar111115.getClass();
                                g3VarD = g3.a.d(bVar112);
                                break;
                            } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                                aVar3 = g3.f35298f;
                                this.f35454m = null;
                                this.f35442a = null;
                                this.f35443b = null;
                                this.f35444c = null;
                                this.f35445d = z1Var3;
                                this.f35446e = aVar3;
                                this.f35450i = z15;
                                this.f35451j = 0;
                                this.f35453l = 9;
                                objA = wj0.d.a(this);
                                if (objA != aVar12) {
                                    aVar4 = aVar3;
                                    i19 = 0;
                                    boolean zBooleanValue111 = ((Boolean) objA).booleanValue();
                                    if (i19 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    i.a aVar111116 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue111, false, 4, (p005kotlin.jvm.internal.j) null));
                                    aVar4.getClass();
                                    g3VarD = g3.a.d(aVar111116);
                                }
                            } else {
                                iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                                if (iVar == null) {
                                    i15 = 0;
                                } else {
                                    i15 = 0;
                                }
                                if (i15 != 0) {
                                }
                                oj0.f fVar111119 = eVar.f35411e;
                                Context contextC110 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                                this.f35454m = b0Var;
                                this.f35442a = null;
                                this.f35443b = sVar;
                                this.f35444c = null;
                                this.f35445d = z1Var3;
                                this.f35446e = z1Var3;
                                this.f35450i = z15;
                                this.f35451j = i15;
                                this.f35452k = i16;
                                this.f35453l = 10;
                                objI = fVar111119.i(contextC110, this);
                                if (objI != aVar12) {
                                    boolean z2116 = z15;
                                    i17 = i15;
                                    i18 = i16;
                                    z16 = z2116;
                                    z1Var5 = z1Var3;
                                    it = ((Iterable) objI).iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        aVar9 = (tj0.a) next;
                                        oj0.f fVar1111110 = eVar.f35411e;
                                        this.f35454m = b0Var;
                                        this.f35442a = null;
                                        this.f35443b = sVar;
                                        this.f35444c = null;
                                        this.f35445d = aVar9;
                                        this.f35446e = z1Var5;
                                        this.f35447f = z1Var3;
                                        this.f35450i = z16;
                                        this.f35451j = i17;
                                        this.f35452k = i18;
                                        this.f35453l = 11;
                                        objJ2 = fVar1111110.j(this);
                                        if (objJ2 != aVar12) {
                                            z1 z1Var11117 = z1Var3;
                                            aVar10 = aVar9;
                                            z1Var8 = z1Var11117;
                                            sVar3 = sVar;
                                            while (r0.hasNext()) {
                                                if (((uj0.a) obj3).f171474i == i18) {
                                                    obj2 = obj3;
                                                    aVar11 = (uj0.a) obj2;
                                                    if (aVar10 != null) {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    } else {
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    }
                                                    z1Var3 = z1Var8;
                                                }
                                            }
                                            aVar11 = (uj0.a) obj2;
                                            if (aVar10 != null) {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            } else {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            }
                                            z1Var3 = z1Var8;
                                        }
                                    } while (((tj0.a) next).f165114g != i18);
                                    aVar9 = (tj0.a) next;
                                    oj0.f fVar1111111 = eVar.f35411e;
                                    this.f35454m = b0Var;
                                    this.f35442a = null;
                                    this.f35443b = sVar;
                                    this.f35444c = null;
                                    this.f35445d = aVar9;
                                    this.f35446e = z1Var5;
                                    this.f35447f = z1Var3;
                                    this.f35450i = z16;
                                    this.f35451j = i17;
                                    this.f35452k = i18;
                                    this.f35453l = 11;
                                    objJ2 = fVar1111111.j(this);
                                    if (objJ2 != aVar12) {
                                        z1 z1Var11118 = z1Var3;
                                        aVar10 = aVar9;
                                        z1Var8 = z1Var11118;
                                        sVar3 = sVar;
                                        while (r0.hasNext()) {
                                            if (((uj0.a) obj3).f171474i == i18) {
                                                obj2 = obj3;
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        }
                                        aVar11 = (uj0.a) obj2;
                                        if (aVar10 != null) {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        } else {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        }
                                        z1Var3 = z1Var8;
                                    }
                                }
                            }
                            z1Var3.setValue(g3VarD);
                            return Unit.INSTANCE;
                        }
                        aVar5 = g3.f35298f;
                        bVar = eVar.f35407a;
                        aVar6 = (c80.s.a) sVar;
                        this.f35454m = null;
                        this.f35442a = null;
                        this.f35443b = null;
                        this.f35444c = oVar;
                        this.f35445d = z1Var3;
                        this.f35446e = aVar5;
                        this.f35447f = eVar;
                        this.f35448g = bVar;
                        this.f35449h = aVar6;
                        this.f35450i = z15;
                        this.f35453l = 7;
                        objM = uVar.m(this);
                        if (objM != aVar12) {
                            aVar7 = aVar5;
                            z17 = z15;
                            bVar2 = bVar;
                            oVar2 = oVar;
                            aVar8 = aVar6;
                            z1Var6 = z1Var3;
                            this.f35454m = null;
                            this.f35442a = null;
                            this.f35443b = null;
                            this.f35444c = null;
                            this.f35445d = z1Var6;
                            this.f35446e = aVar7;
                            this.f35447f = null;
                            this.f35448g = null;
                            this.f35449h = null;
                            this.f35450i = z17;
                            this.f35453l = 8;
                            objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                            if (objX4 != aVar12) {
                                z1Var7 = z1Var6;
                                aVar7.getClass();
                                g3VarD = g3.a.d(objX4);
                                z1Var3 = z1Var7;
                                z1Var3.setValue(g3VarD);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar12;
                case 6:
                    z15 = this.f35450i;
                    sVar = (c80.s) this.f35443b;
                    uVar3 = (zd0.u) this.f35442a;
                    r.b(obj);
                    objD = obj;
                    v2Var2 = (v2) objD;
                    z18 = v2Var2 instanceof v2.b;
                    if (z18) {
                        oVar3 = (o) ((v2.b) v2Var2).f47386a;
                        if (oVar3.f25502b) {
                            a2 a2Var1111111112 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var1111111112, "GCPlusHomeViewModel", "Successfully fetched exclusive offers");
                            oVar = oVar3;
                        } else {
                            if (z18) {
                                a2 a2Var1111111113 = a2.SUBSCRIPTIONS;
                                String strF11110 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                i2.f36769a.getClass();
                                i2.a.f(a2Var1111111113, "GCPlusHomeViewModel", strF11110);
                            } else {
                                a2 a2Var1111111114 = a2.SUBSCRIPTIONS;
                                String strF11111 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                                i2.f36769a.getClass();
                                i2.a.f(a2Var1111111114, "GCPlusHomeViewModel", strF11111);
                            }
                            oVar = null;
                        }
                    } else {
                        if (z18) {
                            a2 a2Var1111111115 = a2.SUBSCRIPTIONS;
                            String strF11112 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                            i2.f36769a.getClass();
                            i2.a.f(a2Var1111111115, "GCPlusHomeViewModel", strF11112);
                        } else {
                            a2 a2Var1111111116 = a2.SUBSCRIPTIONS;
                            String strF11113 = b71.i.f("Failed to fetch exclusive offers: ", v2Var2);
                            i2.f36769a.getClass();
                            i2.a.f(a2Var1111111116, "GCPlusHomeViewModel", strF11113);
                        }
                        oVar = null;
                    }
                    uVar = uVar3;
                    z1Var3 = eVar.f35418l;
                    if (!(sVar instanceof c80.s.a)) {
                        if (!(sVar instanceof c80.s.b)) {
                            if (!(sVar instanceof c80.s.c)) {
                                u0.r();
                                return null;
                            }
                            i14 = b.f35458a[((c80.s.c) sVar).f25560a.ordinal()];
                            if (i14 == 1) {
                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.API;
                            } else if (i14 == 2) {
                                if (i14 == 3) {
                                }
                                a2 a2Var1111111117 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var1111111117, "GCPlusHomeViewModel", "Cannot display subscription information to ineligible user");
                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.UNAVAILABLE;
                            } else {
                                a2 a2Var1111111118 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var1111111118, "GCPlusHomeViewModel", "Cannot display subscription information to users without a paired device");
                                dVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d.NO_PAIRED_DEVICE;
                            }
                            g3.a aVar111117 = g3.f35298f;
                            i.b bVar113 = new i.b(dVar);
                            aVar111117.getClass();
                            g3VarD = g3.a.d(bVar113);
                            break;
                        } else if (eVar.f35412f.f().isAfter(DateTime.now())) {
                            aVar3 = g3.f35298f;
                            this.f35454m = null;
                            this.f35442a = null;
                            this.f35443b = null;
                            this.f35444c = null;
                            this.f35445d = z1Var3;
                            this.f35446e = aVar3;
                            this.f35450i = z15;
                            this.f35451j = 0;
                            this.f35453l = 9;
                            objA = wj0.d.a(this);
                            if (objA != aVar12) {
                                aVar4 = aVar3;
                                i19 = 0;
                                boolean zBooleanValue112 = ((Boolean) objA).booleanValue();
                                if (i19 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                i.a aVar111118 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue112, false, 4, (p005kotlin.jvm.internal.j) null));
                                aVar4.getClass();
                                g3VarD = g3.a.d(aVar111118);
                            }
                        } else {
                            iVar = (yx2.i) h0.d0(((c80.s.b) sVar).f25559a);
                            if (iVar == null) {
                                i15 = 0;
                            } else {
                                i15 = 0;
                            }
                            if (i15 != 0) {
                            }
                            oj0.f fVar1111112 = eVar.f35411e;
                            Context contextC111 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                            this.f35454m = b0Var;
                            this.f35442a = null;
                            this.f35443b = sVar;
                            this.f35444c = null;
                            this.f35445d = z1Var3;
                            this.f35446e = z1Var3;
                            this.f35450i = z15;
                            this.f35451j = i15;
                            this.f35452k = i16;
                            this.f35453l = 10;
                            objI = fVar1111112.i(contextC111, this);
                            if (objI != aVar12) {
                                boolean z2117 = z15;
                                i17 = i15;
                                i18 = i16;
                                z16 = z2117;
                                z1Var5 = z1Var3;
                                it = ((Iterable) objI).iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    aVar9 = (tj0.a) next;
                                    oj0.f fVar1111113 = eVar.f35411e;
                                    this.f35454m = b0Var;
                                    this.f35442a = null;
                                    this.f35443b = sVar;
                                    this.f35444c = null;
                                    this.f35445d = aVar9;
                                    this.f35446e = z1Var5;
                                    this.f35447f = z1Var3;
                                    this.f35450i = z16;
                                    this.f35451j = i17;
                                    this.f35452k = i18;
                                    this.f35453l = 11;
                                    objJ2 = fVar1111113.j(this);
                                    if (objJ2 != aVar12) {
                                        z1 z1Var11119 = z1Var3;
                                        aVar10 = aVar9;
                                        z1Var8 = z1Var11119;
                                        sVar3 = sVar;
                                        while (r0.hasNext()) {
                                            if (((uj0.a) obj3).f171474i == i18) {
                                                obj2 = obj3;
                                                aVar11 = (uj0.a) obj2;
                                                if (aVar10 != null) {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                } else {
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                }
                                                z1Var3 = z1Var8;
                                            }
                                        }
                                        aVar11 = (uj0.a) obj2;
                                        if (aVar10 != null) {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        } else {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        }
                                        z1Var3 = z1Var8;
                                    }
                                } while (((tj0.a) next).f165114g != i18);
                                aVar9 = (tj0.a) next;
                                oj0.f fVar1111114 = eVar.f35411e;
                                this.f35454m = b0Var;
                                this.f35442a = null;
                                this.f35443b = sVar;
                                this.f35444c = null;
                                this.f35445d = aVar9;
                                this.f35446e = z1Var5;
                                this.f35447f = z1Var3;
                                this.f35450i = z16;
                                this.f35451j = i17;
                                this.f35452k = i18;
                                this.f35453l = 11;
                                objJ2 = fVar1111114.j(this);
                                if (objJ2 != aVar12) {
                                    z1 z1Var111110 = z1Var3;
                                    aVar10 = aVar9;
                                    z1Var8 = z1Var111110;
                                    sVar3 = sVar;
                                    while (r0.hasNext()) {
                                        if (((uj0.a) obj3).f171474i == i18) {
                                            obj2 = obj3;
                                            aVar11 = (uj0.a) obj2;
                                            if (aVar10 != null) {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            } else {
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            }
                                            z1Var3 = z1Var8;
                                        }
                                    }
                                    aVar11 = (uj0.a) obj2;
                                    if (aVar10 != null) {
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    } else {
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    }
                                    z1Var3 = z1Var8;
                                }
                            }
                        }
                        z1Var3.setValue(g3VarD);
                        return Unit.INSTANCE;
                    }
                    aVar5 = g3.f35298f;
                    bVar = eVar.f35407a;
                    aVar6 = (c80.s.a) sVar;
                    this.f35454m = null;
                    this.f35442a = null;
                    this.f35443b = null;
                    this.f35444c = oVar;
                    this.f35445d = z1Var3;
                    this.f35446e = aVar5;
                    this.f35447f = eVar;
                    this.f35448g = bVar;
                    this.f35449h = aVar6;
                    this.f35450i = z15;
                    this.f35453l = 7;
                    objM = uVar.m(this);
                    if (objM != aVar12) {
                        aVar7 = aVar5;
                        z17 = z15;
                        bVar2 = bVar;
                        oVar2 = oVar;
                        aVar8 = aVar6;
                        z1Var6 = z1Var3;
                        this.f35454m = null;
                        this.f35442a = null;
                        this.f35443b = null;
                        this.f35444c = null;
                        this.f35445d = z1Var6;
                        this.f35446e = aVar7;
                        this.f35447f = null;
                        this.f35448g = null;
                        this.f35449h = null;
                        this.f35450i = z17;
                        this.f35453l = 8;
                        objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                        if (objX4 != aVar12) {
                            z1Var7 = z1Var6;
                            aVar7.getClass();
                            g3VarD = g3.a.d(objX4);
                            z1Var3 = z1Var7;
                            z1Var3.setValue(g3VarD);
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar12;
                case 7:
                    z17 = this.f35450i;
                    c80.s.a aVar20 = this.f35449h;
                    GCPlusHomeActivity.b bVar20 = this.f35448g;
                    eVar = (e) this.f35447f;
                    g3.a aVar21 = (g3.a) this.f35446e;
                    z1 z1Var20 = (z1) this.f35445d;
                    o oVar4 = this.f35444c;
                    r.b(obj);
                    z1Var6 = z1Var20;
                    oVar2 = oVar4;
                    aVar7 = aVar21;
                    bVar2 = bVar20;
                    aVar8 = aVar20;
                    objM = obj;
                    this.f35454m = null;
                    this.f35442a = null;
                    this.f35443b = null;
                    this.f35444c = null;
                    this.f35445d = z1Var6;
                    this.f35446e = aVar7;
                    this.f35447f = null;
                    this.f35448g = null;
                    this.f35449h = null;
                    this.f35450i = z17;
                    this.f35453l = 8;
                    objX4 = e.x4(eVar, bVar2, aVar8, (List) objM, oVar2, this);
                    if (objX4 != aVar12) {
                        z1Var7 = z1Var6;
                        aVar7.getClass();
                        g3VarD = g3.a.d(objX4);
                        z1Var3 = z1Var7;
                        z1Var3.setValue(g3VarD);
                        return Unit.INSTANCE;
                    }
                    return aVar12;
                case 8:
                    g3.a aVar22 = (g3.a) this.f35446e;
                    z1Var7 = (z1) this.f35445d;
                    r.b(obj);
                    aVar7 = aVar22;
                    objX4 = obj;
                    aVar7.getClass();
                    g3VarD = g3.a.d(objX4);
                    z1Var3 = z1Var7;
                    z1Var3.setValue(g3VarD);
                    return Unit.INSTANCE;
                case 9:
                    int i25 = this.f35451j;
                    g3.a aVar23 = (g3.a) this.f35446e;
                    z1 z1Var21 = (z1) this.f35445d;
                    r.b(obj);
                    z1Var3 = z1Var21;
                    aVar4 = aVar23;
                    i19 = i25;
                    objA = obj;
                    boolean zBooleanValue113 = ((Boolean) objA).booleanValue();
                    if (i19 != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    i.a aVar111119 = new i.a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z19, zBooleanValue113, false, 4, (p005kotlin.jvm.internal.j) null));
                    aVar4.getClass();
                    g3VarD = g3.a.d(aVar111119);
                    z1Var3.setValue(g3VarD);
                    return Unit.INSTANCE;
                case 10:
                    i18 = this.f35452k;
                    int i26 = this.f35451j;
                    boolean z34 = this.f35450i;
                    z1Var3 = (z1) this.f35446e;
                    z1Var5 = (z1) this.f35445d;
                    c80.s sVar5 = (c80.s) this.f35443b;
                    try {
                        r.b(obj);
                        sVar = sVar5;
                        z16 = z34;
                        i17 = i26;
                        objI = obj;
                        it = ((Iterable) objI).iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            aVar9 = (tj0.a) next;
                            oj0.f fVar1111115 = eVar.f35411e;
                            this.f35454m = b0Var;
                            this.f35442a = null;
                            this.f35443b = sVar;
                            this.f35444c = null;
                            this.f35445d = aVar9;
                            this.f35446e = z1Var5;
                            this.f35447f = z1Var3;
                            this.f35450i = z16;
                            this.f35451j = i17;
                            this.f35452k = i18;
                            this.f35453l = 11;
                            objJ2 = fVar1111115.j(this);
                            if (objJ2 != aVar12) {
                                z1 z1Var111111 = z1Var3;
                                aVar10 = aVar9;
                                z1Var8 = z1Var111111;
                                sVar3 = sVar;
                                while (r0.hasNext()) {
                                    if (((uj0.a) obj3).f171474i == i18) {
                                        obj2 = obj3;
                                        aVar11 = (uj0.a) obj2;
                                        if (aVar10 != null) {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        } else {
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        }
                                        z1Var3 = z1Var8;
                                        z1Var3.setValue(g3VarD);
                                        return Unit.INSTANCE;
                                    }
                                }
                                aVar11 = (uj0.a) obj2;
                                if (aVar10 != null) {
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                } else {
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                }
                                z1Var3 = z1Var8;
                                z1Var3.setValue(g3VarD);
                                return Unit.INSTANCE;
                            }
                            return aVar12;
                        } while (((tj0.a) next).f165114g != i18);
                        aVar9 = (tj0.a) next;
                        oj0.f fVar1111116 = eVar.f35411e;
                        this.f35454m = b0Var;
                        this.f35442a = null;
                        this.f35443b = sVar;
                        this.f35444c = null;
                        this.f35445d = aVar9;
                        this.f35446e = z1Var5;
                        this.f35447f = z1Var3;
                        this.f35450i = z16;
                        this.f35451j = i17;
                        this.f35452k = i18;
                        this.f35453l = 11;
                        objJ2 = fVar1111116.j(this);
                        if (objJ2 != aVar12) {
                            z1 z1Var111112 = z1Var3;
                            aVar10 = aVar9;
                            z1Var8 = z1Var111112;
                            sVar3 = sVar;
                            while (r0.hasNext()) {
                                if (((uj0.a) obj3).f171474i == i18) {
                                    obj2 = obj3;
                                    aVar11 = (uj0.a) obj2;
                                    if (aVar10 != null) {
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    } else {
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                        eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    }
                                    z1Var3 = z1Var8;
                                    z1Var3.setValue(g3VarD);
                                    return Unit.INSTANCE;
                                }
                            }
                            aVar11 = (uj0.a) obj2;
                            if (aVar10 != null) {
                                i2.f36769a.getClass();
                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            } else {
                                i2.f36769a.getClass();
                                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            }
                            z1Var3 = z1Var8;
                            z1Var3.setValue(g3VarD);
                            return Unit.INSTANCE;
                        }
                        return aVar12;
                    } catch (CancellationException unused2) {
                        z1Var4 = z1Var5;
                        a2 a2Var120 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var120, "GCPlusHomeViewModel", "Paywall or plan selection request was cancelled.");
                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        z1Var3 = z1Var4;
                    }
                    break;
                case 11:
                    int i27 = this.f35452k;
                    int i28 = this.f35451j;
                    z1Var8 = (z1) this.f35447f;
                    z1Var4 = (z1) this.f35446e;
                    aVar10 = (tj0.a) this.f35445d;
                    sVar3 = (c80.s) this.f35443b;
                    try {
                        r.b(obj);
                        i17 = i28;
                        i18 = i27;
                        objJ2 = obj;
                        while (r0.hasNext()) {
                            if (((uj0.a) obj3).f171474i == i18) {
                                obj2 = obj3;
                                aVar11 = (uj0.a) obj2;
                                if (aVar10 != null) {
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                } else {
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                                    eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                                    g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                }
                                z1Var3 = z1Var8;
                                z1Var3.setValue(g3VarD);
                                return Unit.INSTANCE;
                            }
                        }
                        aVar11 = (uj0.a) obj2;
                        if (aVar10 != null) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        } else {
                            i2.f36769a.getClass();
                            i2.a.b(a2.SUBSCRIPTIONS, "GCPlusHomeViewModel", aVar10 + " and " + aVar11 + " - exiting");
                            eVar.f35413g.a(ht.o.PAYWALL_ERROR);
                            g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        }
                        z1Var3 = z1Var8;
                    } catch (CancellationException unused3) {
                        a2 a2Var121 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var121, "GCPlusHomeViewModel", "Paywall or plan selection request was cancelled.");
                        g3VarD = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        z1Var3 = z1Var4;
                    }
                    z1Var3.setValue(g3VarD);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    static {
        new c(null);
    }

    public e(GCPlusHomeActivity.b bVar, boolean z14, k1 k1Var, h7 h7Var, ze0.b bVar2, oj0.f fVar, a80.b bVar3, ht.i iVar, ak0.a aVar, z70.j jVar, dj1.a aVar2) {
        k1Var.getClass();
        h7Var.getClass();
        bVar2.getClass();
        fVar.getClass();
        bVar3.getClass();
        iVar.getClass();
        aVar.getClass();
        jVar.getClass();
        aVar2.getClass();
        this.f35407a = bVar;
        this.f35408b = z14;
        this.f35409c = h7Var;
        this.f35410d = bVar2;
        this.f35411e = fVar;
        this.f35412f = bVar3;
        this.f35413g = iVar;
        this.f35414h = aVar;
        this.f35415i = jVar;
        this.f35416j = aVar2;
        GCPlusHomeActivity.b.e eVar = bVar instanceof GCPlusHomeActivity.b.e ? (GCPlusHomeActivity.b.e) bVar : null;
        this.f35417k = eVar != null ? eVar.f35333b : null;
        p2 p2VarA = q2.a(g3.a.c(g3.f35298f));
        this.f35418l = p2VarA;
        this.f35419m = s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f35420n = p2VarA2;
        s.d(p2VarA2);
        this.f35423q = o70.f.PERSONALIZED_INSIGHTS;
        p2 p2VarA3 = q2.a(g3.a.b(null));
        this.f35424r = p2VarA3;
        this.f35425t = s.d(p2VarA3);
        p2 p2VarA4 = q2.a(g3.a.b(null));
        this.f35426v = p2VarA4;
        this.f35427w = s.d(p2VarA4);
        p2 p2VarA5 = q2.a(g3.a.b(null));
        this.f35428x = p2VarA5;
        this.f35429y = s.d(p2VarA5);
        p2 p2VarA6 = q2.a(new ck0.e(false, null, 3, null));
        this.f35430z = p2VarA6;
        v vVar = new v(new d(null), p2VarA6);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        this.A = s.K(vVar, aVarA, m2Var, new ck0.e(false, null, 3, null));
        this.B = s.K(s.f(new ze0.c(bVar2, null)), v1.a(this), m2Var, null);
        this.C = x.k(q.MESSAGING_PLUS, q.NUTRITION, q.ADVANCED_REPORTING);
        C4();
        ge1.b.T(v1.a(this), null, null, new a(k1Var, this, null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:106:0x026b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x021a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0230  */
    public static final Object x4(e eVar, GCPlusHomeActivity.b bVar, c80.s.a aVar, List list, o oVar, v13.c cVar) throws Throwable {
        f fVar;
        c80.s.a aVar2;
        List<q> list2;
        GCPlusHomeActivity.b bVar2;
        o oVar2;
        rj0.a aVar3;
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.c iVar;
        Object next;
        rj0.a aVar4;
        c80.s.a aVar5;
        o oVar3;
        int i14;
        yx2.c cVar2;
        u uVar;
        boolean z14;
        zx2.a aVarA;
        int days;
        DateTimeFormatter dateTimeFormatterForPattern;
        DateTime dateTimeD;
        DateTime dateTime;
        String str;
        DateTime dateTimeD2;
        boolean z15;
        j dVar;
        j bVar3;
        i53.f fVarA;
        bk0.d dVar2;
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.c cVar3;
        u uVar2;
        q qVarA;
        boolean z16;
        eVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f35469k;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f35469k = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar, cVar);
            }
        } else {
            fVar = new f(eVar, cVar);
        }
        Object objG = fVar.f35467i;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f35469k;
        if (i16 == 0) {
            r.b(objG);
            oj0.f fVar2 = eVar.f35411e;
            fVar.f35459a = bVar;
            aVar2 = aVar;
            fVar.f35460b = aVar2;
            list2 = list;
            fVar.f35461c = list2;
            fVar.f35462d = oVar;
            fVar.f35469k = 1;
            objG = fVar2.g(fVar);
            if (objG != obj) {
                bVar2 = bVar;
                oVar2 = oVar;
            }
            return obj;
        }
        if (i16 == 1) {
            oVar2 = fVar.f35462d;
            List list3 = fVar.f35461c;
            c80.s.a aVar6 = fVar.f35460b;
            bVar2 = fVar.f35459a;
            r.b(objG);
            list2 = list3;
            aVar2 = aVar6;
        } else {
            if (i16 == 2) {
                i14 = fVar.f35466h;
                aVar4 = fVar.f35463e;
                oVar3 = fVar.f35462d;
                list2 = fVar.f35461c;
                aVar5 = fVar.f35460b;
                r.b(objG);
                boolean zBooleanValue = ((Boolean) objG).booleanValue();
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar7 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z16, zBooleanValue, true);
                aVar3 = aVar4;
                oVar2 = oVar3;
                aVar2 = aVar5;
                iVar = aVar7;
                cVar2 = aVar2.f25558a;
                cVar2.getClass();
                z14 = cVar2.f200049b;
                zx2.a.C3869a c3869a = zx2.a.f207370b;
                String str2 = cVar2.f200061n;
                c3869a.getClass();
                aVarA = zx2.a.C3869a.a(str2);
                if (aVarA == null) {
                    aVarA = zx2.a.UNKNOWN;
                }
                boolean z17 = cVar2.f200064q;
                if (z14) {
                    days = Days.daysBetween(LocalDate.now(), cVar2.b().toLocalDate()).getDays();
                } else {
                    days = 0;
                }
                DateTime dateTimeB = cVar2.b();
                dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM d, yyyy");
                dateTimeD = cVar2.d();
                if (dateTimeD == null) {
                    dateTimeD = cVar2.b();
                }
                dateTime = dateTimeD;
                str = cVar2.f200067v;
                if (str != null) {
                    dateTimeD2 = DateTime.parse(str, ISODateTimeFormat.dateTimeParser().withZoneUTC());
                } else {
                    dateTimeD2 = null;
                }
                if (dateTimeD2 == null && (dateTimeD2 = cVar2.d()) == null) {
                    dateTimeD2 = cVar2.b();
                }
                if (p005kotlin.jvm.internal.s.g(cVar2.f200051d, "OptimisticGrant")) {
                    dVar = j.c.f35497a;
                } else {
                    if (!cVar2.f200063p) {
                        z15 = cVar2.f200064q;
                        if (z14) {
                            dateTimeFormatterForPattern.getClass();
                            bVar3 = new j.b(z15, j0.h(dateTimeD2, dateTimeFormatterForPattern));
                        } else {
                            dateTimeFormatterForPattern.getClass();
                            dVar = new j.d(z15, j0.h(dateTime, dateTimeFormatterForPattern));
                        }
                        if (oVar2 != 0) {
                            fVarA = h.a(oVar2);
                        } else {
                            fVarA = null;
                        }
                        uVar = new u(aVarA, z17, days, dateTimeB, bVar3, fVarA);
                        if (aVar3 != null) {
                            arrayList = new ArrayList();
                            for (q qVar : list2) {
                                q.a aVar8 = q.f25532b;
                                String str3 = qVar.f25548a;
                                aVar8.getClass();
                                qVarA = q.a.a(str3);
                                if (qVarA != null) {
                                    arrayList.add(qVarA);
                                }
                            }
                            fVar.f35459a = null;
                            fVar.f35460b = null;
                            fVar.f35461c = null;
                            fVar.f35462d = null;
                            fVar.f35463e = null;
                            fVar.f35464f = iVar;
                            fVar.f35465g = uVar;
                            fVar.f35466h = 0;
                            fVar.f35469k = 3;
                            objG = eVar.A4(aVar3, arrayList, fVar);
                            if (objG != obj) {
                                cVar3 = iVar;
                                uVar2 = uVar;
                            }
                            return obj;
                        }
                        dVar2 = null;
                        return new i.c(iVar, uVar, dVar2);
                    }
                    dateTimeFormatterForPattern.getClass();
                    dVar = new j.a(j0.h(dateTime, dateTimeFormatterForPattern));
                }
                bVar3 = dVar;
                if (oVar2 != 0) {
                    fVarA = h.a(oVar2);
                } else {
                    fVarA = null;
                }
                uVar = new u(aVarA, z17, days, dateTimeB, bVar3, fVarA);
                if (aVar3 != null) {
                    arrayList = new ArrayList();
                    while (r5.hasNext()) {
                        q.a aVar9 = q.f25532b;
                        String str4 = qVar.f25548a;
                        aVar9.getClass();
                        qVarA = q.a.a(str4);
                        if (qVarA != null) {
                            arrayList.add(qVarA);
                        }
                    }
                    fVar.f35459a = null;
                    fVar.f35460b = null;
                    fVar.f35461c = null;
                    fVar.f35462d = null;
                    fVar.f35463e = null;
                    fVar.f35464f = iVar;
                    fVar.f35465g = uVar;
                    fVar.f35466h = 0;
                    fVar.f35469k = 3;
                    objG = eVar.A4(aVar3, arrayList, fVar);
                    if (objG != obj) {
                        cVar3 = iVar;
                        uVar2 = uVar;
                    }
                    return obj;
                }
                dVar2 = null;
                return new i.c(iVar, uVar, dVar2);
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uVar2 = fVar.f35465g;
            cVar3 = fVar.f35464f;
            r.b(objG);
        }
        dVar2 = (bk0.d) objG;
        uVar = uVar2;
        iVar = cVar3;
        return new i.c(iVar, uVar, dVar2);
        aVar3 = (rj0.a) objG;
        if (!(bVar2 instanceof GCPlusHomeActivity.b.e)) {
            if (p005kotlin.jvm.internal.s.g(bVar2, GCPlusHomeActivity.b.d.f35331a)) {
                iVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.h.INSTANCE;
            } else if (p005kotlin.jvm.internal.s.g(bVar2, GCPlusHomeActivity.b.C0609b.f35329a)) {
                if (oVar2 != null) {
                    iVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f.INSTANCE;
                } else {
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "GCPlusHomeViewModel", "User navigated to Exclusive Offers but offers could not be loaded");
                    iVar = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.SETTINGS);
                }
            } else if (!(bVar2 instanceof GCPlusHomeActivity.b.a)) {
                iVar = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i(p005kotlin.jvm.internal.s.g(bVar2, GCPlusHomeActivity.b.f.f35334a) ? com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.SETTINGS : com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.EDUCATION);
            } else if (oVar2 != null) {
                Iterator<E> it = h.a(oVar2).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((t) next).f27883a.equals(((GCPlusHomeActivity.b.a) bVar2).f35328a));
                if (((t) next) != null) {
                    iVar = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.e(((GCPlusHomeActivity.b.a) bVar2).f35328a);
                } else {
                    a2 a2Var2 = a2.SUBSCRIPTIONS;
                    String strM = am.j.m("Exclusive offer ID ", ((GCPlusHomeActivity.b.a) bVar2).f35328a, " not found, navigating to Exclusive Offers screen");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "GCPlusHomeViewModel", strM);
                    iVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.f.INSTANCE;
                }
            } else {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "GCPlusHomeViewModel", "User navigated to Exclusive Offer Details but feature is not available");
                iVar = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.SETTINGS);
            }
            cVar2 = aVar2.f25558a;
            cVar2.getClass();
            z14 = cVar2.f200049b;
            zx2.a.C3869a c3869a2 = zx2.a.f207370b;
            String str5 = cVar2.f200061n;
            c3869a2.getClass();
            aVarA = zx2.a.C3869a.a(str5);
            if (aVarA == null) {
                aVarA = zx2.a.UNKNOWN;
            }
            boolean z18 = cVar2.f200064q;
            if (z14) {
                days = Days.daysBetween(LocalDate.now(), cVar2.b().toLocalDate()).getDays();
            } else {
                days = 0;
            }
            DateTime dateTimeB2 = cVar2.b();
            dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM d, yyyy");
            dateTimeD = cVar2.d();
            if (dateTimeD == null) {
                dateTimeD = cVar2.b();
            }
            dateTime = dateTimeD;
            str = cVar2.f200067v;
            if (str != null) {
                dateTimeD2 = DateTime.parse(str, ISODateTimeFormat.dateTimeParser().withZoneUTC());
            } else {
                dateTimeD2 = null;
            }
            if (dateTimeD2 == null) {
                dateTimeD2 = cVar2.b();
            }
            if (p005kotlin.jvm.internal.s.g(cVar2.f200051d, "OptimisticGrant")) {
                dVar = j.c.f35497a;
            } else {
                if (!cVar2.f200063p) {
                    z15 = cVar2.f200064q;
                    if (z14) {
                        dateTimeFormatterForPattern.getClass();
                        bVar3 = new j.b(z15, j0.h(dateTimeD2, dateTimeFormatterForPattern));
                    } else {
                        dateTimeFormatterForPattern.getClass();
                        dVar = new j.d(z15, j0.h(dateTime, dateTimeFormatterForPattern));
                    }
                    if (oVar2 != 0) {
                        fVarA = h.a(oVar2);
                    } else {
                        fVarA = null;
                    }
                    uVar = new u(aVarA, z18, days, dateTimeB2, bVar3, fVarA);
                    if (aVar3 != null) {
                        arrayList = new ArrayList();
                        while (r5.hasNext()) {
                            q.a aVar10 = q.f25532b;
                            String str6 = qVar.f25548a;
                            aVar10.getClass();
                            qVarA = q.a.a(str6);
                            if (qVarA != null) {
                                arrayList.add(qVarA);
                            }
                        }
                        fVar.f35459a = null;
                        fVar.f35460b = null;
                        fVar.f35461c = null;
                        fVar.f35462d = null;
                        fVar.f35463e = null;
                        fVar.f35464f = iVar;
                        fVar.f35465g = uVar;
                        fVar.f35466h = 0;
                        fVar.f35469k = 3;
                        objG = eVar.A4(aVar3, arrayList, fVar);
                        if (objG != obj) {
                            cVar3 = iVar;
                            uVar2 = uVar;
                            dVar2 = (bk0.d) objG;
                            uVar = uVar2;
                            iVar = cVar3;
                        }
                    } else {
                        dVar2 = null;
                    }
                    return new i.c(iVar, uVar, dVar2);
                }
                dateTimeFormatterForPattern.getClass();
                dVar = new j.a(j0.h(dateTime, dateTimeFormatterForPattern));
            }
            bVar3 = dVar;
            if (oVar2 != 0) {
                fVarA = h.a(oVar2);
            } else {
                fVarA = null;
            }
            uVar = new u(aVarA, z18, days, dateTimeB2, bVar3, fVarA);
            if (aVar3 != null) {
                arrayList = new ArrayList();
                while (r5.hasNext()) {
                    q.a aVar11 = q.f25532b;
                    String str7 = qVar.f25548a;
                    aVar11.getClass();
                    qVarA = q.a.a(str7);
                    if (qVarA != null) {
                        arrayList.add(qVarA);
                    }
                }
                fVar.f35459a = null;
                fVar.f35460b = null;
                fVar.f35461c = null;
                fVar.f35462d = null;
                fVar.f35463e = null;
                fVar.f35464f = iVar;
                fVar.f35465g = uVar;
                fVar.f35466h = 0;
                fVar.f35469k = 3;
                objG = eVar.A4(aVar3, arrayList, fVar);
                if (objG != obj) {
                    cVar3 = iVar;
                    uVar2 = uVar;
                    dVar2 = (bk0.d) objG;
                    uVar = uVar2;
                    iVar = cVar3;
                }
            } else {
                dVar2 = null;
            }
            return new i.c(iVar, uVar, dVar2);
        }
        fVar.f35459a = null;
        fVar.f35460b = aVar2;
        fVar.f35461c = list2;
        fVar.f35462d = oVar2;
        fVar.f35463e = aVar3;
        fVar.f35466h = 1;
        fVar.f35469k = 2;
        Object objA = wj0.d.a(fVar);
        if (objA != obj) {
            aVar4 = aVar3;
            objG = objA;
            aVar5 = aVar2;
            oVar3 = oVar2;
            i14 = 1;
            boolean zBooleanValue2 = ((Boolean) objG).booleanValue();
            if (i14 != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar12 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a(z16, zBooleanValue2, true);
            aVar3 = aVar4;
            oVar2 = oVar3;
            aVar2 = aVar5;
            iVar = aVar12;
            cVar2 = aVar2.f25558a;
            cVar2.getClass();
            z14 = cVar2.f200049b;
            zx2.a.C3869a c3869a3 = zx2.a.f207370b;
            String str8 = cVar2.f200061n;
            c3869a3.getClass();
            aVarA = zx2.a.C3869a.a(str8);
            if (aVarA == null) {
                aVarA = zx2.a.UNKNOWN;
            }
            boolean z19 = cVar2.f200064q;
            if (z14) {
                days = Days.daysBetween(LocalDate.now(), cVar2.b().toLocalDate()).getDays();
            } else {
                days = 0;
            }
            DateTime dateTimeB3 = cVar2.b();
            dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM d, yyyy");
            dateTimeD = cVar2.d();
            if (dateTimeD == null) {
                dateTimeD = cVar2.b();
            }
            dateTime = dateTimeD;
            str = cVar2.f200067v;
            if (str != null) {
                dateTimeD2 = DateTime.parse(str, ISODateTimeFormat.dateTimeParser().withZoneUTC());
            } else {
                dateTimeD2 = null;
            }
            if (dateTimeD2 == null) {
                dateTimeD2 = cVar2.b();
            }
            if (p005kotlin.jvm.internal.s.g(cVar2.f200051d, "OptimisticGrant")) {
                dVar = j.c.f35497a;
            } else {
                if (!cVar2.f200063p) {
                    z15 = cVar2.f200064q;
                    if (z14) {
                        dateTimeFormatterForPattern.getClass();
                        bVar3 = new j.b(z15, j0.h(dateTimeD2, dateTimeFormatterForPattern));
                    } else {
                        dateTimeFormatterForPattern.getClass();
                        dVar = new j.d(z15, j0.h(dateTime, dateTimeFormatterForPattern));
                    }
                    if (oVar2 != 0) {
                        fVarA = h.a(oVar2);
                    } else {
                        fVarA = null;
                    }
                    uVar = new u(aVarA, z19, days, dateTimeB3, bVar3, fVarA);
                    if (aVar3 != null) {
                        arrayList = new ArrayList();
                        while (r5.hasNext()) {
                            q.a aVar13 = q.f25532b;
                            String str9 = qVar.f25548a;
                            aVar13.getClass();
                            qVarA = q.a.a(str9);
                            if (qVarA != null) {
                                arrayList.add(qVarA);
                            }
                        }
                        fVar.f35459a = null;
                        fVar.f35460b = null;
                        fVar.f35461c = null;
                        fVar.f35462d = null;
                        fVar.f35463e = null;
                        fVar.f35464f = iVar;
                        fVar.f35465g = uVar;
                        fVar.f35466h = 0;
                        fVar.f35469k = 3;
                        objG = eVar.A4(aVar3, arrayList, fVar);
                        if (objG != obj) {
                            cVar3 = iVar;
                            uVar2 = uVar;
                            dVar2 = (bk0.d) objG;
                            uVar = uVar2;
                            iVar = cVar3;
                        }
                    } else {
                        dVar2 = null;
                    }
                    return new i.c(iVar, uVar, dVar2);
                }
                dateTimeFormatterForPattern.getClass();
                dVar = new j.a(j0.h(dateTime, dateTimeFormatterForPattern));
            }
            bVar3 = dVar;
            if (oVar2 != 0) {
                fVarA = h.a(oVar2);
            } else {
                fVarA = null;
            }
            uVar = new u(aVarA, z19, days, dateTimeB3, bVar3, fVarA);
            if (aVar3 != null) {
                arrayList = new ArrayList();
                while (r5.hasNext()) {
                    q.a aVar14 = q.f25532b;
                    String str10 = qVar.f25548a;
                    aVar14.getClass();
                    qVarA = q.a.a(str10);
                    if (qVarA != null) {
                        arrayList.add(qVarA);
                    }
                }
                fVar.f35459a = null;
                fVar.f35460b = null;
                fVar.f35461c = null;
                fVar.f35462d = null;
                fVar.f35463e = null;
                fVar.f35464f = iVar;
                fVar.f35465g = uVar;
                fVar.f35466h = 0;
                fVar.f35469k = 3;
                objG = eVar.A4(aVar3, arrayList, fVar);
                if (objG != obj) {
                    cVar3 = iVar;
                    uVar2 = uVar;
                    dVar2 = (bk0.d) objG;
                    uVar = uVar2;
                    iVar = cVar3;
                }
            } else {
                dVar2 = null;
            }
            return new i.c(iVar, uVar, dVar2);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0206  */
    /* JADX WARN: Code duplicated, block: B:119:0x0218 A[LOOP:8: B:114:0x0200->B:119:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x022d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0233  */
    /* JADX WARN: Code duplicated, block: B:134:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a5 A[LOOP:10: B:146:0x029f->B:148:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x021c A[EDGE_INSN: B:180:0x021c->B:121:0x021c BREAK  A[LOOP:8: B:114:0x0200->B:119:0x0218], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    public static final i.e y4(e eVar, List list, tj0.a aVar, int i14, uj0.a aVar2) {
        Object next;
        Object next2;
        String str;
        String strV;
        String str2;
        ArrayList arrayList;
        Iterator it;
        ArrayList<uj0.b> arrayList2;
        ArrayList arrayList3;
        uj0.c cVar;
        Iterator it3;
        Object next3;
        yx2.i iVar;
        String str3;
        String strV2;
        Iterator it4;
        Object next4;
        yx2.i iVar2;
        String str4;
        Iterator it5;
        Object next5;
        yx2.i iVar3;
        String str5;
        String str6;
        boolean z14;
        String strV3;
        uj0.c cVar2;
        l lVar;
        yx2.f fVar;
        Iterator it6;
        l lVar2;
        yx2.f fVar2;
        l lVar3;
        yx2.e eVar2;
        l lVar4;
        yx2.f fVar3;
        l lVar5;
        yx2.f fVar4;
        q qVar = eVar.f35417k;
        ArrayList<yx2.h> arrayList4 = new ArrayList();
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            d0.v(arrayList4, ((yx2.i) it7.next()).f200093f);
        }
        ArrayList arrayList5 = new ArrayList();
        for (yx2.h hVar : arrayList4) {
            q.a aVar3 = q.f25532b;
            String str7 = hVar.f200084a;
            aVar3.getClass();
            q qVarA = q.a.a(str7);
            if (qVarA != null) {
                arrayList5.add(qVarA);
            }
        }
        Set setG1 = h0.g1(arrayList5);
        List<q> listC = (qVar == null || !setG1.contains(qVar)) ? eVar.C : w.c(qVar);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (tj0.b bVar : aVar.f165108a) {
            q qVar2 = bVar.f165116a;
            String str8 = bVar.f165121f;
            if (setG1.contains(qVar2)) {
                if (listC.contains(bVar.f165116a)) {
                    oj0.e eVar3 = oj0.e.f132277a;
                    String str9 = bVar.f165122g;
                    Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                    eVar3.getClass();
                    arrayList6.add(new dk0.g(oj0.e.a(contextC, str9), bVar.f165118c, bVar.f165119d, str8));
                } else {
                    arrayList7.add(new bk0.a(bVar.f165117b, bVar.f165120e, str8));
                }
            }
        }
        com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k kVar = com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.k.INSTANCE;
        i53.c cVarE = i53.a.e(arrayList6);
        i53.c cVarE2 = i53.a.e(arrayList7);
        i53.c cVarE3 = i53.a.e(list);
        Iterator it8 = list.iterator();
        do {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
        } while (((yx2.i) next).b() != zx2.a.YEARLY);
        yx2.i iVar4 = (yx2.i) next;
        String str10 = (iVar4 == null || (lVar5 = iVar4.f200097j) == null || (fVar4 = lVar5.f200118b) == null) ? null : fVar4.f200079b;
        Iterator it9 = list.iterator();
        do {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
        } while (((yx2.i) next2).b() != zx2.a.MONTHLY);
        yx2.i iVar5 = (yx2.i) next2;
        String str11 = (iVar5 == null || (lVar4 = iVar5.f200097j) == null || (fVar3 = lVar4.f200118b) == null) ? null : fVar3.f200079b;
        if (str10 == null || str11 == null) {
            if (str10 == null) {
                if (str11 != null) {
                    str = aVar.f165112e;
                } else {
                    strV = null;
                }
                str2 = aVar.f165113f;
                dk0.f fVarZ4 = z4(aVar.f165109b);
                List<uj0.c> list2 = aVar2.f171469d;
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    cVar = (uj0.c) it.next();
                    it3 = list.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((yx2.i) next3).f200091d, cVar.f171482b));
                    iVar = (yx2.i) next3;
                    if (iVar != null) {
                        str3 = cVar.f171483c;
                        if (str3 != null) {
                            lVar3 = iVar.f200097j;
                            if (lVar3 != null || (eVar2 = lVar3.f200119c) == null) {
                                str2 = str2;
                                it = it;
                                cVar2 = null;
                                z14 = false;
                            } else {
                                strV2 = d53.u.v(str3, "(discountPercent)", String.valueOf(eVar2.f200074a), false);
                            }
                        } else {
                            strV2 = null;
                        }
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it4.next();
                        } while (((yx2.i) next4).b() != zx2.a.YEARLY);
                        iVar2 = (yx2.i) next4;
                        if (iVar2 != null || (lVar2 = iVar2.f200097j) == null || (fVar2 = lVar2.f200118b) == null || (str4 = fVar2.f200079b) == null) {
                            str4 = "";
                        }
                        it5 = list.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it5.next();
                            it6 = it5;
                            if (((yx2.i) next5).b() == zx2.a.MONTHLY) {
                                break;
                            }
                            it5 = it6;
                        }
                        iVar3 = (yx2.i) next5;
                        if (iVar3 != null || (lVar = iVar3.f200097j) == null || (fVar = lVar.f200118b) == null || (str5 = fVar.f200079b) == null) {
                            str5 = "";
                        }
                        str6 = cVar.f171485e;
                        z14 = false;
                        if (str6 != null) {
                            strV3 = d53.u.v(d53.u.v(d53.u.v(str6, "(yearlyPrice)", str4, false), "(monthlyPrice)", str5, false), "(trialDuration)", String.valueOf(i14), false);
                        } else {
                            strV3 = null;
                        }
                        cVar2 = new uj0.c(cVar.f171481a, cVar.f171482b, strV2, cVar.f171484d, strV3);
                    } else {
                        str2 = str2;
                        it = it;
                        cVar2 = null;
                        z14 = false;
                    }
                    if (cVar2 != null) {
                        arrayList.add(cVar2);
                    }
                    it = it;
                    str2 = str2;
                }
                String str12 = str2;
                List<uj0.b> list3 = aVar2.f171471f;
                arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (setG1.contains(((uj0.b) obj).f171476a)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList3 = new ArrayList(y.r(arrayList2, 10));
                for (uj0.b bVar2 : arrayList2) {
                    arrayList3.add(new bk0.a(bVar2.f171477b, bVar2.f171478c, bVar2.f171479d));
                }
                return new i.e(kVar, cVarE, cVarE2, cVarE3, i14, strV, str12, fVarZ4, new m(aVar2.f171466a, aVar2.f171467b, aVar2.f171468c, i53.a.e(arrayList), aVar2.f171470e, i53.a.e(arrayList3), z4(aVar2.f171473h), aVar2.f171472g));
            }
            str = aVar.f165111d;
        } else {
            str = aVar.f165110c;
        }
        if (str != null) {
            if (str10 == null) {
                str10 = "";
            }
            String strV4 = d53.u.v(str, "(yearlyPrice)", str10, false);
            if (str11 == null) {
                str11 = "";
            }
            strV = d53.u.v(d53.u.v(strV4, "(monthlyPrice)", str11, false), "(trialDaysFree)", String.valueOf(i14), false);
        } else {
            strV = null;
        }
        str2 = aVar.f165113f;
        dk0.f fVarZ5 = z4(aVar.f165109b);
        List<uj0.c> list4 = aVar2.f171469d;
        arrayList = new ArrayList();
        it = list4.iterator();
        while (it.hasNext()) {
            cVar = (uj0.c) it.next();
            it3 = list.iterator();
            do {
                if (it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((yx2.i) next3).f200091d, cVar.f171482b));
            iVar = (yx2.i) next3;
            if (iVar != null) {
                str3 = cVar.f171483c;
                if (str3 != null) {
                    lVar3 = iVar.f200097j;
                    if (lVar3 != null) {
                    }
                    str2 = str2;
                    it = it;
                    cVar2 = null;
                    z14 = false;
                } else {
                    strV2 = null;
                }
                it4 = list.iterator();
                do {
                    if (it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (((yx2.i) next4).b() != zx2.a.YEARLY);
                iVar2 = (yx2.i) next4;
                if (iVar2 != null) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                it5 = list.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                    it6 = it5;
                    if (((yx2.i) next5).b() == zx2.a.MONTHLY) {
                        break;
                        break;
                    }
                    it5 = it6;
                }
                iVar3 = (yx2.i) next5;
                if (iVar3 != null) {
                    str5 = "";
                } else {
                    str5 = "";
                }
                str6 = cVar.f171485e;
                z14 = false;
                if (str6 != null) {
                    strV3 = d53.u.v(d53.u.v(d53.u.v(str6, "(yearlyPrice)", str4, false), "(monthlyPrice)", str5, false), "(trialDuration)", String.valueOf(i14), false);
                } else {
                    strV3 = null;
                }
                cVar2 = new uj0.c(cVar.f171481a, cVar.f171482b, strV2, cVar.f171484d, strV3);
            } else {
                str2 = str2;
                it = it;
                cVar2 = null;
                z14 = false;
            }
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
            it = it;
            str2 = str2;
        }
        String str13 = str2;
        List<uj0.b> list5 = aVar2.f171471f;
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            if (setG1.contains(((uj0.b) obj).f171476a)) {
                arrayList2.add(obj);
            }
        }
        arrayList3 = new ArrayList(y.r(arrayList2, 10));
        while (r1.hasNext()) {
            arrayList3.add(new bk0.a(bVar2.f171477b, bVar2.f171478c, bVar2.f171479d));
        }
        return new i.e(kVar, cVarE, cVarE2, cVarE3, i14, strV, str13, fVarZ5, new m(aVar2.f171466a, aVar2.f171467b, aVar2.f171468c, i53.a.e(arrayList), aVar2.f171470e, i53.a.e(arrayList3), z4(aVar2.f171473h), aVar2.f171472g));
    }

    public static dk0.f z4(pj0.a aVar) {
        String str;
        String str2 = aVar.f137876a;
        k kVar = new k("\\[(.*?)\\]");
        d53.j jVarB = new k("\\[(.*?)\\]").b(0, str2);
        if (jVarB == null || (str = (String) ((d53.j.a) jVarB.a()).get(1)) == null) {
            str = "";
        }
        return new dk0.f(d53.w.i0(kVar.f(str2, "")).toString(), str, aVar.f137877b);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:30:0x011e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0147  */
    /* JADX WARN: Code duplicated, block: B:33:0x0159  */
    /* JADX WARN: Code duplicated, block: B:36:0x0169  */
    /* JADX WARN: Code duplicated, block: B:38:0x0175  */
    /* JADX WARN: Code duplicated, block: B:40:0x0185  */
    /* JADX WARN: Code duplicated, block: B:41:0x0187  */
    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00de -> B:27:0x00e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A4(rj0.a r27, java.util.ArrayList r28, v13.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.gcplus.presentation.home.e.A4(rj0.a, java.util.ArrayList, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(v13.c cVar) {
        ak0.b0 b0Var;
        if (cVar instanceof ak0.b0) {
            b0Var = (ak0.b0) cVar;
            int i14 = b0Var.f3588c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f3588c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new ak0.b0(this, cVar);
            }
        } else {
            b0Var = new ak0.b0(this, cVar);
        }
        Object objH = b0Var.f3586a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f3588c;
        if (i15 == 0) {
            r.b(objH);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            b0Var.f3588c = 1;
            objH = j1Var.h(b0Var);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH);
        }
        String string = ((Uri) objH).toString();
        string.getClass();
        return string;
    }

    public final void C4() {
        ge1.b.T(v1.a(this), null, null, new C0616e(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/e$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
