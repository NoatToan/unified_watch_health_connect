package com.garmin.android.apps.connectmobile.dogs.presentation;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import e23.p;
import lc.m0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import oe0.l;
import oe0.s;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dogs/presentation/AllDogsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AllDogsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34686g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f34691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f34692f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity$onCreate$1$1$1$1$3$2$1", f = "AllDogsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f34693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AllDogsActivity f34694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f34695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, AllDogsActivity allDogsActivity, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f34693a = z14;
            this.f34694b = allDogsActivity;
            this.f34695c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f34693a, this.f34694b, this.f34695c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f34693a) {
                a aVar2 = AllDogsActivity.f34686g;
                AllDogsActivity allDogsActivity = this.f34694b;
                ((l) allDogsActivity.f34687a.getValue()).y4();
                p2 p2Var = allDogsActivity.ea().f131292i;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                this.f34695c.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.l<String, Unit> {
        public c(Object obj) {
            super(1, obj, oe0.j.class, "onActivityTypeSelected", "onActivityTypeSelected(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            Object value;
            pe0.f fVar;
            String str2 = str;
            p2 p2Var = ((oe0.j) this.receiver).f131288e;
            do {
                value = p2Var.getValue();
                fVar = (pe0.f) value;
            } while (!p2Var.b(value, fVar != null ? pe0.f.a(fVar, null, str2, 8191) : null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/AllDogsActivity$d", "Ls9/f;", "lifecycle-runtime-compose"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements s9.f {
        public d(s9.g gVar) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/AllDogsActivity$e", "Ls9/f;", "lifecycle-runtime-compose"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements s9.f {
        public e(s9.g gVar) {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34699d;

        public f(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34696a = gVar;
            this.f34697b = qualifier;
            this.f34698c = aVar;
            this.f34699d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, oe0.l] */
        @Override // e23.a
        public final l invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34696a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f34698c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(l.class), viewModelStore, null, defaultViewModelCreationExtras, this.f34697b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34699d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<oe0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34703d;

        public g(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34700a = gVar;
            this.f34701b = qualifier;
            this.f34702c = aVar;
            this.f34703d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, oe0.d] */
        @Override // e23.a
        public final oe0.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34700a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f34702c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(oe0.d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f34701b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34703d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34707d;

        public h(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34704a = gVar;
            this.f34705b = qualifier;
            this.f34706c = aVar;
            this.f34707d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, oe0.s] */
        @Override // e23.a
        public final s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34704a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f34706c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f34705b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34707d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<oe0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34711d;

        public i(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34708a = gVar;
            this.f34709b = qualifier;
            this.f34710c = aVar;
            this.f34711d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, oe0.j] */
        @Override // e23.a
        public final oe0.j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34708a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f34710c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(oe0.j.class), viewModelStore, null, defaultViewModelCreationExtras, this.f34709b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34711d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<oe0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34715d;

        public j(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34712a = gVar;
            this.f34713b = qualifier;
            this.f34714c = aVar;
            this.f34715d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, oe0.f] */
        @Override // e23.a
        public final oe0.f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34712a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f34714c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(oe0.f.class), viewModelStore, null, defaultViewModelCreationExtras, this.f34713b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34715d, 4, null);
        }
    }

    public AllDogsActivity() {
        n nVar = n.NONE;
        this.f34687a = m.a(nVar, new f(this, null, null, null));
        this.f34688b = m.a(nVar, new g(this, null, null, null));
        this.f34689c = m.a(nVar, new h(this, null, null, null));
        this.f34690d = m.a(nVar, new i(this, null, null, null));
        this.f34691e = m.a(nVar, new j(this, null, null, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final oe0.d da() {
        return (oe0.d) this.f34688b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final oe0.j ea() {
        return (oe0.j) this.f34690d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final s fa() {
        return (s) this.f34689c.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(-1672008985, true, new vd0.q(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dogs/presentation/AllDogsActivity$a;", "", "<init>", "()V", "", "EXTRA_START_AT_ADD_DOG", "Ljava/lang/String;", "EXTRA_START_AT_DOG_PROFILE", "EXTRA_DOG_ID", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
