package com.garmin.android.apps.connectmobile.userprofile.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.model.o;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity;
import com.google.gson.Gson;
import e23.p;
import java.io.UnsupportedEncodingException;
import m12.q;
import m12.r;
import m12.t;
import o13.m;
import o13.n;
import o53.b0;
import o53.c2;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.q0;
import r53.j;
import r53.o2;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/EditProfileActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditProfileActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46981h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46983b = m.a(n.NONE, new e(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f46984c = (r) KoinJavaComponent.get$default(r.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46985d = s3.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f46986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f46987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f46988g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46989a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f115874o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f115877r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f115878t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.f115879v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.f115880w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.f115881x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.P0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.f115872m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[t.f115882y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f46989a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$onCreate$2", f = "EditProfileActivity.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46990a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46992c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$onCreate$2$1", f = "EditProfileActivity.kt", l = {127}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f46994b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f46995c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0904a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ EditProfileActivity f46996a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f46997b;

                public C0904a(EditProfileActivity editProfileActivity, String str) {
                    this.f46996a = editProfileActivity;
                    this.f46997b = str;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    nj1.e eVar;
                    o12.d dVar2 = (o12.d) obj;
                    boolean z14 = dVar2.f128540a;
                    EditProfileActivity editProfileActivity = this.f46996a;
                    if (z14) {
                        Toast.makeText(editProfileActivity, R.string.txt_error_occurred, 0).show();
                        editProfileActivity.finish();
                        return Unit.INSTANCE;
                    }
                    if (!editProfileActivity.f46982a && !dVar2.f128541b) {
                        editProfileActivity.f46982a = true;
                        editProfileActivity.showProgressOverlay();
                        String str = t.f115874o.f115884a;
                        String str2 = this.f46997b;
                        if (s.g(str2, str)) {
                            f.c<Intent> cVar = editProfileActivity.f46986e;
                            ActivitiesPrivacySelectionActivity.a aVar = ActivitiesPrivacySelectionActivity.f47091b;
                            q qVar = (q) editProfileActivity.ea().f47032p.f150540a.getValue();
                            nj1.b activityPrivacySettings = (qVar == null || (eVar = qVar.f115857c) == null) ? null : eVar.getActivityPrivacySettings();
                            hl.a.c cVar2 = hl.a.c.f84256b;
                            aVar.getClass();
                            cVar2.getClass();
                            Intent intent = new Intent(editProfileActivity, (Class<?>) ActivitiesPrivacySelectionActivity.class);
                            intent.putExtra("GCM_extra_privacy_type", activityPrivacySettings);
                            intent.putExtra("GCM_extra_screen_access_role", cVar2);
                            cVar.a(intent, null);
                        } else {
                            t tVar = t.Q0;
                            if (s.g(str2, tVar.f115884a)) {
                                editProfileActivity.ea().x4(new f.a(tVar));
                            } else {
                                t tVar2 = t.R0;
                                if (s.g(str2, tVar2.f115884a)) {
                                    editProfileActivity.ea().x4(new f.a(tVar2));
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditProfileActivity editProfileActivity, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f46994b = editProfileActivity;
                this.f46995c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f46994b, this.f46995c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f46993a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    a aVar2 = EditProfileActivity.f46981h;
                    EditProfileActivity editProfileActivity = this.f46994b;
                    o2 o2Var = (o2) editProfileActivity.ea().f47038x.getValue();
                    C0904a c0904a = new C0904a(editProfileActivity, this.f46995c);
                    this.f46993a = 1;
                    if (o2Var.collect(c0904a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f46992c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditProfileActivity.this.new c(this.f46992c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46990a;
            if (i14 == 0) {
                o13.r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                String str = this.f46992c;
                EditProfileActivity editProfileActivity = EditProfileActivity.this;
                a aVar2 = new a(editProfileActivity, str, null);
                this.f46990a = 1;
                if (h1.b(editProfileActivity, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$onCreate$3", f = "EditProfileActivity.kt", l = {162}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46998a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$onCreate$3$1", f = "EditProfileActivity.kt", l = {163}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f47001b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0905a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ EditProfileActivity f47002a;

                public C0905a(EditProfileActivity editProfileActivity) {
                    this.f47002a = editProfileActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) throws UnsupportedEncodingException {
                    com.garmin.android.apps.connectmobile.userprofile.presentation.a aVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.a) obj;
                    boolean z14 = aVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.a.C0906a;
                    EditProfileActivity editProfileActivity = this.f47002a;
                    if (z14) {
                        editProfileActivity.hideProgressOverlay();
                    }
                    if (aVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.a.c) {
                        editProfileActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.userprofile.presentation.a.c cVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.a.c) aVar;
                        String str = cVar.f47009a;
                        String str2 = cVar.f47010b;
                        a aVar2 = EditProfileActivity.f46981h;
                        if (str2 == null) {
                            g22.a.c(editProfileActivity, Uri.parse(str));
                        } else {
                            g22.a.e(editProfileActivity, str2, str);
                        }
                        editProfileActivity.finish();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditProfileActivity editProfileActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f47001b = editProfileActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f47001b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$d$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f47000a
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
                    com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$a r6 = com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity.f46981h
                    com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity r6 = r5.f47001b
                    com.garmin.android.apps.connectmobile.userprofile.presentation.d r1 = r6.ea()
                    r53.a2 r1 = r1.f47034r
                    com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$d$a$a r4 = new com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity$d$a$a
                    r4.<init>(r6)
                    r5.f47000a = r3
                    r53.d2<T> r6 = r1.f150526a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditProfileActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46998a;
            if (i14 == 0) {
                o13.r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                EditProfileActivity editProfileActivity = EditProfileActivity.this;
                a aVar2 = new a(editProfileActivity, null);
                this.f46998a = 1;
                if (h1.b(editProfileActivity, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47006d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47003a = gVar;
            this.f47004b = qualifier;
            this.f47005c = aVar;
            this.f47006d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.d] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47003a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f47005c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.d.class), f189591b, null, defaultViewModelCreationExtras, this.f47004b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47006d, 4, null);
        }
    }

    public EditProfileActivity() {
        final int i14 = 0;
        this.f46986e = registerForActivityResult(new g.h(), new f.b(this) { // from class: o12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f128533b;

            {
                this.f128533b = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x0109  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                q qVarA;
                Object value;
                Parcelable parcelable;
                Intent intent;
                String stringExtra;
                Object value2;
                Intent intent2;
                Object value3;
                int i15 = i14;
                EditProfileActivity editProfileActivity = this.f128533b;
                q qVarA2 = null;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        EditProfileActivity.a aVar2 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        Intent intent3 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent3.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent3.getParcelableExtra("GCM_extra_privacy_type");
                                    if (!(parcelableExtra instanceof nj1.b)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (nj1.b) parcelableExtra;
                                }
                                bVar = (nj1.b) parcelable;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa = editProfileActivity.ea();
                                dVarEa.getClass();
                                q qVar = (q) dVarEa.f47032p.f150540a.getValue();
                                if (qVar != null) {
                                    dVarEa.f47022f.getClass();
                                    nj1.e eVar = qVar.f115857c;
                                    if (eVar == null) {
                                        qVarA = null;
                                    } else {
                                        m12.b.f115791a.getClass();
                                        nj1.e eVarA = m12.b.a(eVar);
                                        if (eVarA == null) {
                                            qVarA = null;
                                        } else {
                                            eVarA.h(bVar);
                                            qVarA = q.a(qVar, null, eVarA, false, 11);
                                        }
                                    }
                                    if (qVarA != null) {
                                        p2 p2Var = dVarEa.f47031o;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qVarA));
                                    }
                                }
                            }
                        }
                        String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type_message") : null;
                        if (stringExtra2 != null) {
                            q0.b bVar2 = q0.f149800b;
                            View viewFindViewById = editProfileActivity.findViewById(android.R.id.content);
                            viewFindViewById.getClass();
                            q0.b.c(bVar2, viewFindViewById, stringExtra2, null, 12).show();
                        }
                        if (s.g(editProfileActivity.getIntent().getStringExtra("EXTRA_SELECTED_ITEM"), t.f115874o.f115884a)) {
                            editProfileActivity.getOnBackPressedDispatcher().d();
                        }
                        break;
                    case 1:
                        EditProfileActivity.a aVar3 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (stringExtra = intent.getStringExtra("tagPermission")) != null) {
                            o.f46931b.getClass();
                            o oVarA = o.a.a(stringExtra);
                            if (oVarA != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa2 = editProfileActivity.ea();
                                dVarEa2.getClass();
                                q qVar2 = (q) dVarEa2.f47032p.f150540a.getValue();
                                if (qVar2 != null) {
                                    dVarEa2.f47022f.getClass();
                                    com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar2.f115856b;
                                    if (rVar != null) {
                                        m12.b.f115791a.getClass();
                                        Gson gson = m12.b.f115792b;
                                        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.r) gson.fromJson(gson.toJson(rVar, com.garmin.android.apps.connectmobile.userprofile.model.r.class), com.garmin.android.apps.connectmobile.userprofile.model.r.class);
                                        if (rVar2 != null) {
                                            rVar2.C(oVarA);
                                            qVarA2 = q.a(qVar2, rVar2, null, false, 13);
                                        }
                                    }
                                    if (qVarA2 != null) {
                                        p2 p2Var2 = dVarEa2.f47031o;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qVarA2));
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        EditProfileActivity.a aVar4 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null) {
                            boolean z14 = intent2.getIntExtra("require_review_requests", 1) == 1;
                            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa3 = editProfileActivity.ea();
                            q qVar3 = (q) dVarEa3.f47032p.f150540a.getValue();
                            if (qVar3 != null) {
                                dVarEa3.f47022f.getClass();
                                q qVarA3 = q.a(qVar3, null, null, z14, 7);
                                p2 p2Var3 = dVarEa3.f47031o;
                                do {
                                    value3 = p2Var3.getValue();
                                } while (!p2Var3.b(value3, qVarA3));
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f46987f = registerForActivityResult(new g.h(), new f.b(this) { // from class: o12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f128533b;

            {
                this.f128533b = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x0109  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                q qVarA;
                Object value;
                Parcelable parcelable;
                Intent intent;
                String stringExtra;
                Object value2;
                Intent intent2;
                Object value3;
                int i16 = i15;
                EditProfileActivity editProfileActivity = this.f128533b;
                q qVarA2 = null;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        EditProfileActivity.a aVar2 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        Intent intent3 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent3.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent3.getParcelableExtra("GCM_extra_privacy_type");
                                    if (!(parcelableExtra instanceof nj1.b)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (nj1.b) parcelableExtra;
                                }
                                bVar = (nj1.b) parcelable;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa = editProfileActivity.ea();
                                dVarEa.getClass();
                                q qVar = (q) dVarEa.f47032p.f150540a.getValue();
                                if (qVar != null) {
                                    dVarEa.f47022f.getClass();
                                    nj1.e eVar = qVar.f115857c;
                                    if (eVar == null) {
                                        qVarA = null;
                                    } else {
                                        m12.b.f115791a.getClass();
                                        nj1.e eVarA = m12.b.a(eVar);
                                        if (eVarA == null) {
                                            qVarA = null;
                                        } else {
                                            eVarA.h(bVar);
                                            qVarA = q.a(qVar, null, eVarA, false, 11);
                                        }
                                    }
                                    if (qVarA != null) {
                                        p2 p2Var = dVarEa.f47031o;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qVarA));
                                    }
                                }
                            }
                        }
                        String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type_message") : null;
                        if (stringExtra2 != null) {
                            q0.b bVar2 = q0.f149800b;
                            View viewFindViewById = editProfileActivity.findViewById(android.R.id.content);
                            viewFindViewById.getClass();
                            q0.b.c(bVar2, viewFindViewById, stringExtra2, null, 12).show();
                        }
                        if (s.g(editProfileActivity.getIntent().getStringExtra("EXTRA_SELECTED_ITEM"), t.f115874o.f115884a)) {
                            editProfileActivity.getOnBackPressedDispatcher().d();
                        }
                        break;
                    case 1:
                        EditProfileActivity.a aVar3 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (stringExtra = intent.getStringExtra("tagPermission")) != null) {
                            o.f46931b.getClass();
                            o oVarA = o.a.a(stringExtra);
                            if (oVarA != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa2 = editProfileActivity.ea();
                                dVarEa2.getClass();
                                q qVar2 = (q) dVarEa2.f47032p.f150540a.getValue();
                                if (qVar2 != null) {
                                    dVarEa2.f47022f.getClass();
                                    com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar2.f115856b;
                                    if (rVar != null) {
                                        m12.b.f115791a.getClass();
                                        Gson gson = m12.b.f115792b;
                                        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.r) gson.fromJson(gson.toJson(rVar, com.garmin.android.apps.connectmobile.userprofile.model.r.class), com.garmin.android.apps.connectmobile.userprofile.model.r.class);
                                        if (rVar2 != null) {
                                            rVar2.C(oVarA);
                                            qVarA2 = q.a(qVar2, rVar2, null, false, 13);
                                        }
                                    }
                                    if (qVarA2 != null) {
                                        p2 p2Var2 = dVarEa2.f47031o;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qVarA2));
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        EditProfileActivity.a aVar4 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null) {
                            boolean z14 = intent2.getIntExtra("require_review_requests", 1) == 1;
                            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa3 = editProfileActivity.ea();
                            q qVar3 = (q) dVarEa3.f47032p.f150540a.getValue();
                            if (qVar3 != null) {
                                dVarEa3.f47022f.getClass();
                                q qVarA3 = q.a(qVar3, null, null, z14, 7);
                                p2 p2Var3 = dVarEa3.f47031o;
                                do {
                                    value3 = p2Var3.getValue();
                                } while (!p2Var3.b(value3, qVarA3));
                            }
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f46988g = registerForActivityResult(new g.h(), new f.b(this) { // from class: o12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileActivity f128533b;

            {
                this.f128533b = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x0109  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                q qVarA;
                Object value;
                Parcelable parcelable;
                Intent intent;
                String stringExtra;
                Object value2;
                Intent intent2;
                Object value3;
                int i17 = i16;
                EditProfileActivity editProfileActivity = this.f128533b;
                q qVarA2 = null;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        EditProfileActivity.a aVar2 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        Intent intent3 = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent3.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent3.getParcelableExtra("GCM_extra_privacy_type");
                                    if (!(parcelableExtra instanceof nj1.b)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (nj1.b) parcelableExtra;
                                }
                                bVar = (nj1.b) parcelable;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa = editProfileActivity.ea();
                                dVarEa.getClass();
                                q qVar = (q) dVarEa.f47032p.f150540a.getValue();
                                if (qVar != null) {
                                    dVarEa.f47022f.getClass();
                                    nj1.e eVar = qVar.f115857c;
                                    if (eVar == null) {
                                        qVarA = null;
                                    } else {
                                        m12.b.f115791a.getClass();
                                        nj1.e eVarA = m12.b.a(eVar);
                                        if (eVarA == null) {
                                            qVarA = null;
                                        } else {
                                            eVarA.h(bVar);
                                            qVarA = q.a(qVar, null, eVarA, false, 11);
                                        }
                                    }
                                    if (qVarA != null) {
                                        p2 p2Var = dVarEa.f47031o;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qVarA));
                                    }
                                }
                            }
                        }
                        String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type_message") : null;
                        if (stringExtra2 != null) {
                            q0.b bVar2 = q0.f149800b;
                            View viewFindViewById = editProfileActivity.findViewById(android.R.id.content);
                            viewFindViewById.getClass();
                            q0.b.c(bVar2, viewFindViewById, stringExtra2, null, 12).show();
                        }
                        if (s.g(editProfileActivity.getIntent().getStringExtra("EXTRA_SELECTED_ITEM"), t.f115874o.f115884a)) {
                            editProfileActivity.getOnBackPressedDispatcher().d();
                        }
                        break;
                    case 1:
                        EditProfileActivity.a aVar3 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && (stringExtra = intent.getStringExtra("tagPermission")) != null) {
                            o.f46931b.getClass();
                            o oVarA = o.a.a(stringExtra);
                            if (oVarA != null) {
                                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa2 = editProfileActivity.ea();
                                dVarEa2.getClass();
                                q qVar2 = (q) dVarEa2.f47032p.f150540a.getValue();
                                if (qVar2 != null) {
                                    dVarEa2.f47022f.getClass();
                                    com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar2.f115856b;
                                    if (rVar != null) {
                                        m12.b.f115791a.getClass();
                                        Gson gson = m12.b.f115792b;
                                        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.r) gson.fromJson(gson.toJson(rVar, com.garmin.android.apps.connectmobile.userprofile.model.r.class), com.garmin.android.apps.connectmobile.userprofile.model.r.class);
                                        if (rVar2 != null) {
                                            rVar2.C(oVarA);
                                            qVarA2 = q.a(qVar2, rVar2, null, false, 13);
                                        }
                                    }
                                    if (qVarA2 != null) {
                                        p2 p2Var2 = dVarEa2.f47031o;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qVarA2));
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        EditProfileActivity.a aVar4 = EditProfileActivity.f46981h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null) {
                            boolean z14 = intent2.getIntExtra("require_review_requests", 1) == 1;
                            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa3 = editProfileActivity.ea();
                            q qVar3 = (q) dVarEa3.f47032p.f150540a.getValue();
                            if (qVar3 != null) {
                                dVarEa3.f47022f.getClass();
                                q qVarA3 = q.a(qVar3, null, null, z14, 7);
                                p2 p2Var3 = dVarEa3.f47031o;
                                do {
                                    value3 = p2Var3.getValue();
                                } while (!p2Var3.b(value3, qVarA3));
                            }
                        }
                        break;
                }
            }
        });
    }

    public static Unit da(EditProfileActivity editProfileActivity, b.s sVar) {
        sVar.getClass();
        c2 c2Var = editProfileActivity.ea().f47027k;
        if (c2Var != null ? c2Var.isActive() : false) {
            sVar.f(false);
            super.onBackPressed();
        } else {
            com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa = editProfileActivity.ea();
            dVarEa.getClass();
            dVarEa.f47027k = ge1.b.T(v1.a(dVarEa), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.e(dVarEa, null), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.userprofile.presentation.d ea() {
        return (com.garmin.android.apps.connectmobile.userprofile.presentation.d) this.f46983b.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0.k(getOnBackPressedDispatcher(), null, new o12.b(this, 1), 3);
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_FOCUS", false);
        String stringExtra = getIntent().getStringExtra("EXTRA_SELECTED_ITEM");
        if (s.g(stringExtra, t.f115874o.f115884a) || s.g(stringExtra, t.Q0.f115884a) || s.g(stringExtra, t.R0.f115884a)) {
            ge1.b.T(f0.w(this), null, null, new c(stringExtra, null), 3);
            ge1.b.T(f0.w(this), null, null, new d(null), 3);
        }
        initComposeScreen(new z3.e(957281002, true, new o12.c(this, booleanExtra, stringExtra != null ? new w12.d.c(stringExtra) : w12.d.b.INSTANCE, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/EditProfileActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_FOCUS", "EXTRA_SELECTED_ITEM", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, String str) {
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) EditProfileActivity.class);
            intent.putExtra("EXTRA_FOCUS", false);
            intent.putExtra("EXTRA_SELECTED_ITEM", str);
            return intent;
        }

        private a() {
        }
    }
}
