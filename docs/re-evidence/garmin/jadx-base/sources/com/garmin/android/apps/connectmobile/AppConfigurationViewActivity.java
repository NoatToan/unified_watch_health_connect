package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.actions.SearchIntents;
import i3.mh;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f²\u0006\u001e\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/AppConfigurationViewActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "Ljava/util/Observer;", "<init>", "()V", "b", "a", "", "Landroid/util/Pair;", "", "values", "searchText", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppConfigurationViewActivity extends z1 implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28625b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.w1 f28626a = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(a.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/AppConfigurationViewActivity$a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.lifecycle.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r53.p2 f28627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r53.b2 f28628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r53.p2 f28629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r53.b2 f28630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r53.p2 f28631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r53.p2 f28632f;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroid/util/Pair;", "", "values", SearchIntents.EXTRA_QUERY}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$AppConfigurationViewModel$appConfigValues$1", f = "AppConfigurationViewActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0438a extends v13.i implements e23.q<Pair<String, String>[], String, t13.d<? super Pair<String, String>[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Pair[] f28633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ String f28634b;

            public C0438a(t13.d<? super C0438a> dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(Pair<String, String>[] pairArr, String str, t13.d<? super Pair<String, String>[]> dVar) {
                C0438a c0438a = new C0438a(dVar);
                c0438a.f28633a = pairArr;
                c0438a.f28634b = str;
                return c0438a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Pair[] pairArr = this.f28633a;
                String str = this.f28634b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                if (d53.w.J(str)) {
                    return pairArr;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair pair : pairArr) {
                    String str2 = (String) pair.first;
                    if (d53.w.z(str2, str, true)) {
                        arrayList.add(pair);
                    }
                }
                return (Pair[]) arrayList.toArray(new Pair[0]);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "", "Landroid/util/Pair;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$AppConfigurationViewModel$appConfigValues$2", f = "AppConfigurationViewActivity.kt", l = {200}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<r53.j<? super Pair<String, String>[]>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r53.z1 f28635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public a f28636b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f28637c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f28638d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f28639e;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return a.this.new b(dVar);
            }

            @Override // e23.p
            public final Object invoke(r53.j<? super Pair<String, String>[]> jVar, t13.d<? super Unit> dVar) {
                return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
            
                if (r6.b(r4, (android.util.Pair[]) r9) != false) goto L16;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:14:0x0056). Please report as a decompilation issue!!! */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                r53.z1 z1Var;
                int i14;
                Object value;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f28639e;
                if (i15 == 0) {
                    o13.r.b(obj);
                    a aVar3 = a.this;
                    if (((Object[]) aVar3.f28629c.getValue()).length == 0) {
                        aVar = aVar3;
                        z1Var = aVar3.f28629c;
                        i14 = 0;
                        value = z1Var.getValue();
                        this.f28635a = z1Var;
                        this.f28636b = aVar;
                        this.f28637c = value;
                        this.f28638d = i14;
                        this.f28639e = 1;
                        aVar.getClass();
                        x53.c cVar = o53.s0.f129406a;
                        obj = ge1.b.e0(x53.b.f189152a, new n(aVar, null), this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = this.f28638d;
                    value = this.f28637c;
                    aVar = this.f28636b;
                    z1Var = this.f28635a;
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            r53.p2 p2VarA = r53.q2.a("");
            this.f28627a = p2VarA;
            this.f28628b = r53.s.d(p2VarA);
            r53.p2 p2VarA2 = r53.q2.a(new Pair[0]);
            this.f28629c = p2VarA2;
            r53.v vVar = new r53.v(new b(null), new r53.u1(p2VarA2, p2VarA, new C0438a(null)));
            w9.a aVarA = androidx.lifecycle.v1.a(this);
            r53.k2.f150703a.getClass();
            this.f28630d = r53.s.K(vVar, aVarA, r53.k2.a.f150706c, new Pair[0]);
            r53.p2 p2VarA3 = r53.q2.a(null);
            this.f28631e = p2VarA3;
            this.f28632f = p2VarA3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$onCreate$1", f = "AppConfigurationViewActivity.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28641a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$onCreate$1$1", f = "AppConfigurationViewActivity.kt", l = {88}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f28643a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppConfigurationViewActivity f28644b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0439a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AppConfigurationViewActivity f28645a;

                public C0439a(AppConfigurationViewActivity appConfigurationViewActivity) {
                    this.f28645a = appConfigurationViewActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    Long l14 = (Long) obj;
                    if (l14 != null) {
                        this.f28645a.setSubtitle("Last Server Fetch " + new SimpleDateFormat("EEE, MMM d @ hh:mm aa", Locale.ENGLISH).format(l14));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AppConfigurationViewActivity appConfigurationViewActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f28644b = appConfigurationViewActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f28644b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f28643a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    int i15 = AppConfigurationViewActivity.f28625b;
                    AppConfigurationViewActivity appConfigurationViewActivity = this.f28644b;
                    r53.p2 p2Var = appConfigurationViewActivity.ba().f28632f;
                    C0439a c0439a = new C0439a(appConfigurationViewActivity);
                    this.f28643a = 1;
                    if (p2Var.collect(c0439a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AppConfigurationViewActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f28641a;
            if (i14 == 0) {
                o13.r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                AppConfigurationViewActivity appConfigurationViewActivity = AppConfigurationViewActivity.this;
                a aVar2 = new a(appConfigurationViewActivity, null);
                this.f28641a = 1;
                if (androidx.lifecycle.h1.b(appConfigurationViewActivity, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f28646a;

        public d(b.g gVar) {
            this.f28646a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f28646a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f28647a;

        public e(b.g gVar) {
            this.f28647a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f28647a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f28648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f28649b;

        public f(e23.a aVar, b.g gVar) {
            this.f28648a = aVar;
            this.f28649b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f28648a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f28649b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new b(null);
    }

    public final void aa(int i14, h4.r rVar, String str, String str2, p3.m mVar) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1438172285);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            k2.h hVarA = k2.i.a(5);
            float f14 = 1;
            d92.b.f58623a.getClass();
            h4.r rVarE = u1.n.e(u1.q.b(f14, d92.b.a(o0VarE).j().a(), rVar, hVarA), d92.b.a(o0VarE).c().e(), hVarA);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97918c);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97931h;
            gl.c.f77766a.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, gl.c.f77767b.O, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, i15 & 14, 0, 131070);
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            bVar.getClass();
            h4.r rVarE2 = u1.n.e(u1.q.b(f14, d92.b.a(o0VarE).j().b(), c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), hVarA), d92.b.a(o0VarE).c().c(), hVarA);
            bVar.getClass();
            h4.r rVarY2 = c2.l.y(rVarE2, eVar.f97920e);
            fVar.getClass();
            mh.c(str2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(this, str, str2, rVar, i14, 23);
        }
    }

    public final a ba() {
        return (a) this.f28626a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(false, "Remote Config - " + gh2.i.f77458c.f77459a);
        ge1.b.T(o53.f0.w(this), null, null, new c(null), 3);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(637396417, true, new m(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.app_configuration_view_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_refresh) {
            finish();
            return true;
        }
        a aVarBa = ba();
        ge1.b.T(androidx.lifecycle.v1.a(aVarBa), null, null, new o(aVarBa, null), 3);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        l.g().getClass();
        gh2.i.f77458c.a().addObserver(this);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        l.g().getClass();
        gh2.i.f77458c.a().deleteObserver(this);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        a aVarBa = ba();
        ge1.b.T(androidx.lifecycle.v1.a(aVarBa), null, null, new o(aVarBa, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/AppConfigurationViewActivity$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
