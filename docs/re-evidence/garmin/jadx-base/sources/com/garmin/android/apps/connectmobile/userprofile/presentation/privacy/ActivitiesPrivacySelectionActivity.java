package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/ActivitiesPrivacySelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesPrivacySelectionActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47091b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47092a = m.a(n.NONE, new c(this, null, null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$onCreate$3", f = "ActivitiesPrivacySelectionActivity.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47093a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$onCreate$3$1", f = "ActivitiesPrivacySelectionActivity.kt", l = {66}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivitiesPrivacySelectionActivity f47096b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0909a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivitiesPrivacySelectionActivity f47097a;

                public C0909a(ActivitiesPrivacySelectionActivity activitiesPrivacySelectionActivity) {
                    this.f47097a = activitiesPrivacySelectionActivity;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    Parcelable parcelable;
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b abstractC0915b = (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b) obj;
                    if (abstractC0915b instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.C0916b) {
                        String str = ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.AbstractC0915b.C0916b) abstractC0915b).f47164a;
                        a aVar = ActivitiesPrivacySelectionActivity.f47091b;
                        ActivitiesPrivacySelectionActivity activitiesPrivacySelectionActivity = this.f47097a;
                        nj1.b bVar = (nj1.b) ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) activitiesPrivacySelectionActivity.f47092a.getValue()).f47154h.d();
                        Bundle extras = activitiesPrivacySelectionActivity.getIntent().getExtras();
                        Parcelable parcelable2 = null;
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_privacy_type", nj1.b.class);
                            } else {
                                Parcelable parcelable3 = extras.getParcelable("GCM_extra_privacy_type");
                                parcelable = (nj1.b) (parcelable3 instanceof nj1.b ? parcelable3 : null);
                            }
                            parcelable2 = (nj1.b) parcelable;
                        }
                        if (s.g(bVar, parcelable2)) {
                            Intent intent = new Intent();
                            intent.putExtra("GCM_extra_privacy_type_message", str);
                            activitiesPrivacySelectionActivity.setResult(0, intent);
                        } else {
                            Intent intent2 = new Intent();
                            intent2.putExtra("GCM_extra_privacy_type", bVar);
                            activitiesPrivacySelectionActivity.setResult(-1, intent2);
                        }
                        activitiesPrivacySelectionActivity.finish();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivitiesPrivacySelectionActivity activitiesPrivacySelectionActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f47096b = activitiesPrivacySelectionActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f47096b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$b$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f47095a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L35
                L14:
                    o13.r.b(r6)
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$a r6 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity.f47091b
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity r6 = r5.f47096b
                    java.lang.Object r1 = r6.f47092a
                    java.lang.Object r1 = r1.getValue()
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b r1 = (com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) r1
                    r53.a2 r1 = r1.f47153g
                    com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$b$a$a r4 = new com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity$b$a$a
                    r4.<init>(r6)
                    r5.f47095a = r3
                    r53.d2<T> r6 = r1.f150526a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L35
                    return r0
                L35:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivitiesPrivacySelectionActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47093a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                ActivitiesPrivacySelectionActivity activitiesPrivacySelectionActivity = ActivitiesPrivacySelectionActivity.this;
                a aVar2 = new a(activitiesPrivacySelectionActivity, null);
                this.f47093a = 1;
                if (h1.b(activitiesPrivacySelectionActivity, bVar, aVar2, this) == aVar) {
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
    public static final class c implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47101d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47098a = gVar;
            this.f47099b = qualifier;
            this.f47100c = aVar;
            this.f47101d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47098a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f47100c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f47099b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47101d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.concept_activities);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_privacy_type", nj1.b.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_privacy_type");
                if (!(parcelable2 instanceof nj1.b)) {
                    parcelable2 = null;
                }
                parcelable = (nj1.b) parcelable2;
            }
            nj1.b bVar = (nj1.b) parcelable;
            if (bVar != null) {
                ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) this.f47092a.getValue()).x4(bVar);
            }
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (extras2.getBoolean("GCM_extra_update_past_activities")) {
                v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                aVarB.l(R.id.content_frame_layout, new v12.v(), null);
                aVarB.e();
            } else {
                v supportFragmentManager2 = getSupportFragmentManager();
                androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                aVarB2.m(R.id.content_frame_layout, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.class, getIntent().getExtras());
                aVarB2.e();
            }
        }
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/ActivitiesPrivacySelectionActivity$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
