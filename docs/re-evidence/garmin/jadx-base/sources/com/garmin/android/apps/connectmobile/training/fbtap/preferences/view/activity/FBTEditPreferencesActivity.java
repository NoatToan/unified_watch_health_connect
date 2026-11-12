package com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import iz1.g;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import pv1.f;
import r53.j;
import tw1.k;
import v13.i;
import vb.h;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/preferences/view/activity/FBTEditPreferencesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTEditPreferencesActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45500c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45501a = new w1(s0.f105811a.b(pv1.b.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f45502b = new g(this, 11);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$onCreate$3", f = "FBTEditPreferencesActivity.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45503a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$onCreate$3$1", f = "FBTEditPreferencesActivity.kt", l = {81}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f45505a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTEditPreferencesActivity f45506b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0874a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FBTEditPreferencesActivity f45507a;

                public C0874a(FBTEditPreferencesActivity fBTEditPreferencesActivity) {
                    this.f45507a = fBTEditPreferencesActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    mv1.e eVar = (mv1.e) obj;
                    if (eVar != null) {
                        tu1.i.a aVar = tu1.i.f166483a;
                        FBTEditPreferencesActivity fBTEditPreferencesActivity = this.f45507a;
                        n82.i iVar = new n82.i(fBTEditPreferencesActivity, 10);
                        aVar.getClass();
                        tu1.i.a.o(fBTEditPreferencesActivity, eVar, iVar);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FBTEditPreferencesActivity fBTEditPreferencesActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f45506b = fBTEditPreferencesActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f45506b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$b$a for r5v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r5.f45505a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L31
                L14:
                    o13.r.b(r6)
                    com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$a r6 = com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity.f45500c
                    com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity r6 = r5.f45506b
                    pv1.b r1 = r6.ca()
                    r53.b2 r1 = r1.f141492d1
                    com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$b$a$a r4 = new com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity$b$a$a
                    r4.<init>(r6)
                    r5.f45505a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FBTEditPreferencesActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45503a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                FBTEditPreferencesActivity fBTEditPreferencesActivity = FBTEditPreferencesActivity.this;
                a aVar2 = new a(fBTEditPreferencesActivity, null);
                this.f45503a = 1;
                if (h1.b(fBTEditPreferencesActivity, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45508a;

        public c(b.g gVar) {
            this.f45508a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45508a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45509a;

        public d(b.g gVar) {
            this.f45509a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45509a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45511b;

        public e(e23.a aVar, b.g gVar) {
            this.f45510a = aVar;
            this.f45511b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45510a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45511b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final pv1.b ca() {
        return (pv1.b) this.f45501a.getValue();
    }

    @SuppressLint({"CommitTransaction"})
    public final void da(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView();
        pv1.b bVarCa = ca();
        Bundle extras = getIntent().getExtras();
        bVarCa.T = extras != null ? extras.getLong("EXTRA_ATHLETE_PLAN_ID") : 0L;
        pv1.b bVarCa2 = ca();
        Bundle extras2 = getIntent().getExtras();
        bVarCa2.Y = (extras2 == null || (string = extras2.getString("EXTRA_PLAN_TYPE")) == null) ? null : o.valueOf(string);
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            int i14 = extras3.getInt("EXTRA_TRAINING_LEVEL");
            ca();
            k.f166742d.getClass();
            k.a.a(i14).getClass();
        }
        initActionBar(R.string.running_preferences, 3);
        pv1.b bVarCa3 = ca();
        if (bVarCa3.p5()) {
            ge1.b.T(v1.a(bVarCa3), null, null, new pv1.g(bVarCa3, null), 3);
        } else if (bVarCa3.Y == o.f180179j) {
            ge1.b.T(v1.a(bVarCa3), null, null, new pv1.e(bVarCa3, null), 3);
        } else if (bVarCa3.n5()) {
            ge1.b.T(v1.a(bVarCa3), null, null, new pv1.d(bVarCa3, null), 3);
        } else {
            ge1.b.T(v1.a(bVarCa3), null, null, new f(bVarCa3, null), 3);
        }
        ca().J0.f(this, this.f45502b);
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/preferences/view/activity/FBTEditPreferencesActivity$a;", "", "<init>", "()V", "", "EXTRA_ATHLETE_PLAN_ID", "Ljava/lang/String;", "EXTRA_PLAN_TYPE", "EXTRA_TRAINING_LEVEL", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
