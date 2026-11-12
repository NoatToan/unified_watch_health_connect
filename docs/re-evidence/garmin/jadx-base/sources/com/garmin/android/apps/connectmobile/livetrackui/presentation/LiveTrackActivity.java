package com.garmin.android.apps.connectmobile.livetrackui.presentation;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import c22.s3;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import e23.p;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.p1;
import q92.x;
import sc.j;
import v13.i;
import z10.d2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/LiveTrackActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "Lwu0/d$a;", "<init>", "()V", "a", "", "isNavigationLoading", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveTrackActivity extends com.garmin.android.apps.connectmobile.d implements wu0.d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38637g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f38638a = m.b(new vu0.c(this, 4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f38642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f38643f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity$onCreate$1$1$1$1$1", f = "LiveTrackActivity.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38644a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bv0.a f38646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sc.f<j> f38647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f38648e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bv0.a aVar, sc.f<j> fVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f38646c = aVar;
            this.f38647d = fVar;
            this.f38648e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LiveTrackActivity.this.new b(this.f38646c, this.f38647d, this.f38648e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f38644a;
            p1<Boolean> p1Var = this.f38648e;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = LiveTrackActivity.f38637g;
                p1Var.setValue(Boolean.TRUE);
                gv0.d dVar = (gv0.d) LiveTrackActivity.this.f38639b.getValue();
                bv0.a.p pVar = bv0.a.p.INSTANCE;
                bv0.a aVar3 = this.f38646c;
                bv0.a aVar4 = s.g(aVar3, pVar) ? null : aVar3;
                this.f38644a = 1;
                obj = dVar.X4(aVar4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            bv0.a aVar5 = (bv0.a) obj;
            a aVar6 = LiveTrackActivity.f38637g;
            p1Var.setValue(Boolean.FALSE);
            boolean z14 = aVar5 instanceof bv0.a.p;
            sc.f<j> fVar = this.f38647d;
            if (z14 || (aVar5 instanceof bv0.a.k) || (aVar5 instanceof bv0.a.g) || (aVar5 instanceof bv0.a.h) || (aVar5 instanceof bv0.a.b)) {
                while (fVar.f158448a.size() > 1) {
                    fVar.remove(fVar.size() - 1);
                }
                if (!s.g(h0.n0(fVar), aVar5)) {
                    fVar.clear();
                    fVar.a(aVar5);
                }
            } else if (!s.g(h0.n0(fVar), aVar5)) {
                fVar.a(aVar5);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity$onCreate$1$1$1$2$1", f = "LiveTrackActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wu0.d.c f38649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sc.f<j> f38650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f38651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wu0.d.c cVar, sc.f<j> fVar, p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f38649a = cVar;
            this.f38650b = fVar;
            this.f38651c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f38649a, this.f38650b, this.f38651c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002d  */
        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            sc.f<j> fVar = this.f38650b;
            wu0.d.c cVar = this.f38649a;
            if (cVar != null) {
                a aVar2 = LiveTrackActivity.f38637g;
                if (!this.f38651c.getF182175a().booleanValue()) {
                    Object objN0 = h0.n0(fVar);
                    bv0.a.f fVar2 = bv0.a.f.INSTANCE;
                    if (!s.g(objN0, fVar2)) {
                        fVar.a(fVar2);
                    } else if (cVar == null && s.g(h0.n0(fVar), bv0.a.f.INSTANCE)) {
                        fVar.remove(fVar.size() - 1);
                    }
                } else if (cVar == null) {
                    fVar.remove(fVar.size() - 1);
                }
            } else if (cVar == null) {
                fVar.remove(fVar.size() - 1);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<gv0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38655d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38652a = gVar;
            this.f38653b = qualifier;
            this.f38654c = aVar;
            this.f38655d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, gv0.d] */
        @Override // e23.a
        public final gv0.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f38652a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f38654c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(gv0.d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38653b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38655d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<yu0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38659d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38656a = gVar;
            this.f38657b = qualifier;
            this.f38658c = aVar;
            this.f38659d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, yu0.f] */
        @Override // e23.a
        public final yu0.f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f38656a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f38658c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(yu0.f.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38657b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38659d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<kv0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38663d;

        public f(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38660a = gVar;
            this.f38661b = qualifier;
            this.f38662c = aVar;
            this.f38663d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, kv0.j] */
        @Override // e23.a
        public final kv0.j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f38660a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f38662c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(kv0.j.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38661b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38663d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f38664a;

        public g(b.g gVar) {
            this.f38664a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38664a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f38666b;

        public h(e23.a aVar, b.g gVar) {
            this.f38665a = aVar;
            this.f38666b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38665a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38666b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public LiveTrackActivity() {
        vu0.c cVar = new vu0.c(this, 5);
        n nVar = n.NONE;
        this.f38639b = m.a(nVar, new d(this, null, null, cVar));
        this.f38640c = m.a(nVar, new e(this, null, null, null));
        this.f38641d = m.a(nVar, new f(this, null, null, null));
        this.f38642e = new w1(s0.f105811a.b(d2.class), new g(this), new vu0.c(this, 6), new h(null, this));
        this.f38643f = m.b(new vu0.c(this, 7));
    }

    @Override // wu0.d.a
    public final void H0() {
        ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).i().getClass();
        ContactsMigrationActivity.a aVar = ContactsMigrationActivity.f32322j;
        aVar.getClass();
        startActivityForResult(ContactsMigrationActivity.a.b(aVar, this, null, null, 28), 5);
    }

    @Override // wu0.d.a
    public final LiveTrackActivity S1() {
        return this;
    }

    public final wu0.d da() {
        return (wu0.d) this.f38643f.getValue();
    }

    @Override // wu0.d.a
    public final v h7() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }

    @Override // wu0.d.a
    public final LiveTrackActivity m6() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        bv0.a aVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        wu0.d dVarDa = da();
        dVarDa.getClass();
        d2 d2Var = dVarDa.f187243a;
        d2Var.x4(x.DI_CONNECT_LIVETRACK);
        d2Var.f200958c.f(this, new wu0.d.e(new vu1.b(dVarDa, 22)));
        Intent intent = getIntent();
        if (intent == null) {
            aVar = bv0.a.p.INSTANCE;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("extra_default_destination", bv0.a.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_default_destination");
                if (!(parcelableExtra instanceof bv0.a)) {
                    parcelableExtra = null;
                }
                parcelable = (bv0.a) parcelableExtra;
            }
            aVar = (bv0.a) parcelable;
            if (aVar == null) {
                aVar = bv0.a.p.INSTANCE;
            }
        }
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildLiveTrack");
        }
        initComposeScreen(new z3.e(-2113489387, true, new vu0.d(this, aVar, 0)));
    }

    @Override // wu0.d.a
    public final View v0() {
        View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/LiveTrackActivity$a;", "", "<init>", "()V", "", "CONTACTS_MIGRATION_REQUEST_CODE", "I", "", "EXTRA_DEFAULT_DESTINATION", "Ljava/lang/String;", "EXTRA_SCREEN_ACCESS_ROLE", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, bv0.a aVar, hl.a aVar2) {
            context.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) LiveTrackActivity.class);
            if (aVar != null) {
                intent.putExtra("extra_default_destination", aVar);
            }
            intent.putExtra("extra_screen_access_role", aVar2);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, bv0.a aVar2) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            return a(context, aVar2, cVar);
        }

        public final void c(Context context, bv0.a aVar) {
            context.getClass();
            context.startActivity(b(this, context, aVar));
        }

        private a() {
        }
    }
}
