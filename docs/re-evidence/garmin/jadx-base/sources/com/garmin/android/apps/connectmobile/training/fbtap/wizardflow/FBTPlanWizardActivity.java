package com.garmin.android.apps.connectmobile.training.fbtap.wizardflow;

import am.a2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import aw1.k0;
import aw1.o0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity;
import com.google.mlkit.common.MlKitException;
import e23.l;
import ew1.a1;
import ew1.b3;
import ew1.c1;
import ew1.d2;
import ew1.d3;
import ew1.e1;
import ew1.f1;
import ew1.h2;
import ew1.i1;
import ew1.j2;
import ew1.m2;
import ew1.o2;
import ew1.q1;
import ew1.q2;
import ew1.s1;
import ew1.s2;
import ew1.u2;
import ew1.w0;
import ew1.x2;
import ew1.y0;
import fg0.j;
import fg0.k;
import fw.p;
import jv1.m;
import jv1.s;
import o13.r;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import v13.i;
import vt1.o;
import ww1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/wizardflow/FBTPlanWizardActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTPlanWizardActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45530e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45531a = new w1(s0.f105811a.b(aw1.h.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw1.b f45532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw1.b f45533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aw1.b f45534d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45535a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f45535a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$onCreate$1", f = "FBTPlanWizardActivity.kt", l = {164}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45536a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$onCreate$1$1", f = "FBTPlanWizardActivity.kt", l = {165}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f45538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTPlanWizardActivity f45539b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$onCreate$1$1$1", f = "FBTPlanWizardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0875a extends i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f45540a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FBTPlanWizardActivity f45541b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0875a(FBTPlanWizardActivity fBTPlanWizardActivity, t13.d<? super C0875a> dVar) {
                    super(2, dVar);
                    this.f45541b = fBTPlanWizardActivity;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C0875a c0875a = new C0875a(this.f45541b, dVar);
                    c0875a.f45540a = obj;
                    return c0875a;
                }

                @Override // e23.p
                public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                    return ((C0875a) create(bool, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    m mVar;
                    j eventCustomization;
                    gg0.f eventType;
                    Boolean bool = (Boolean) this.f45540a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        a aVar2 = FBTPlanWizardActivity.f45530e;
                        FBTPlanWizardActivity fBTPlanWizardActivity = this.f45541b;
                        fBTPlanWizardActivity.getClass();
                        Intent intent = new Intent();
                        Bundle bundle = new Bundle();
                        intent.putExtra("extras_is_event_training_plan_navigation", true);
                        if (zBooleanValue) {
                            intent.putExtra("extra_continue_with_goal_setup", true);
                            aw1.h hVarCa = fBTPlanWizardActivity.ca();
                            s sVarI6 = hVarCa.i6();
                            Parcelable parcelableB = null;
                            k kVar = sVarI6 != null ? sVarI6.f101124c : null;
                            if (kVar == null || (eventType = kVar.getEventType()) == null || !eventType.g()) {
                                j jVar = (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? new j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : eventCustomization;
                                s sVarI7 = hVarCa.i6();
                                if (sVarI7 != null && (mVar = sVarI7.f101129h) != null) {
                                    parcelableB = mVar.c();
                                }
                                parcelableB = j.b(jVar, parcelableB, null, null, null, null, null, 8190);
                            } else {
                                s sVarI8 = hVarCa.i6();
                                if (sVarI8 != null) {
                                    parcelableB = sVarI8.H;
                                }
                            }
                            a2.b(bundle, "extras_event_customization", parcelableB);
                            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                        } else {
                            intent.putExtras(bundle).getClass();
                        }
                        fBTPlanWizardActivity.setResult(-1, intent);
                        fBTPlanWizardActivity.finish();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FBTPlanWizardActivity fBTPlanWizardActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f45539b = fBTPlanWizardActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f45539b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f45538a;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = FBTPlanWizardActivity.f45530e;
                    FBTPlanWizardActivity fBTPlanWizardActivity = this.f45539b;
                    b2 b2Var = fBTPlanWizardActivity.ca().H5().f61436b;
                    C0875a c0875a = new C0875a(fBTPlanWizardActivity, null);
                    this.f45538a = 1;
                    if (r53.s.k(b2Var, c0875a, this) == aVar) {
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

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FBTPlanWizardActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45536a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                FBTPlanWizardActivity fBTPlanWizardActivity = FBTPlanWizardActivity.this;
                a aVar2 = new a(fBTPlanWizardActivity, null);
                this.f45536a = 1;
                if (h1.b(fBTPlanWizardActivity, bVar, aVar2, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$onCreate$2", f = "FBTPlanWizardActivity.kt", l = {173}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45542a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$onCreate$2$1", f = "FBTPlanWizardActivity.kt", l = {174}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f45544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTPlanWizardActivity f45545b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0876a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FBTPlanWizardActivity f45546a;

                public C0876a(FBTPlanWizardActivity fBTPlanWizardActivity) {
                    this.f45546a = fBTPlanWizardActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    mv1.e eVar = (mv1.e) obj;
                    if (eVar != null) {
                        tu1.i.a aVar = tu1.i.f166483a;
                        FBTPlanWizardActivity fBTPlanWizardActivity = this.f45546a;
                        aw1.a aVar2 = new aw1.a(fBTPlanWizardActivity, 1);
                        aVar.getClass();
                        tu1.i.a.o(fBTPlanWizardActivity, eVar, aVar2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FBTPlanWizardActivity fBTPlanWizardActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f45545b = fBTPlanWizardActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f45545b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$d$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f45544a
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
                    com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$a r6 = com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity.f45530e
                    com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity r6 = r5.f45545b
                    aw1.h r1 = r6.ca()
                    r53.b2 r1 = r1.R1
                    com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$d$a$a r4 = new com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity$d$a$a
                    r4.<init>(r6)
                    r5.f45544a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FBTPlanWizardActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45542a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                FBTPlanWizardActivity fBTPlanWizardActivity = FBTPlanWizardActivity.this;
                a aVar2 = new a(fBTPlanWizardActivity, null);
                this.f45542a = 1;
                if (h1.b(fBTPlanWizardActivity, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45547a;

        public e(l lVar) {
            lVar.getClass();
            this.f45547a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45547a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45547a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45548a;

        public f(b.g gVar) {
            this.f45548a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45548a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45549a;

        public g(b.g gVar) {
            this.f45549a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45549a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45551b;

        public h(e23.a aVar, b.g gVar) {
            this.f45550a = aVar;
            this.f45551b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45550a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45551b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aw1.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aw1.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aw1.b] */
    public FBTPlanWizardActivity() {
        final int i14 = 0;
        this.f45532b = new z0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTPlanWizardActivity f13328b;

            {
                this.f13328b = this;
            }

            /* JADX WARN: Code duplicated, block: B:168:0x03fa  */
            /* JADX WARN: Code duplicated, block: B:186:0x0437  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean z14;
                String strR;
                int i15 = i14;
                FBTPlanWizardActivity fBTPlanWizardActivity = this.f13328b;
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        FBTPlanWizardActivity.a aVar = FBTPlanWizardActivity.f45530e;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        FBTPlanWizardActivity fBTPlanWizardActivity2 = this.f13328b;
                        switch (iHashCode) {
                            case -2104826316:
                                if (str.equals("FBTElevationProfileFragment")) {
                                    ew1.k0.f66545d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.k0(), str);
                                }
                                break;
                            case -1981189786:
                                if (str.equals("FBTSelectTrainingLevelFragment")) {
                                    s2.f66742d.getClass();
                                    fBTPlanWizardActivity2.ea(new s2(), str);
                                }
                                break;
                            case -1581111839:
                                if (str.equals("FBTHowToEndPlanFragment")) {
                                    y0.f66855c.getClass();
                                    fBTPlanWizardActivity2.ea(new y0(), str);
                                }
                                break;
                            case -1402751305:
                                if (str.equals("FBTReviewScheduleFragment")) {
                                    s1.f66734c.getClass();
                                    fBTPlanWizardActivity2.ea(new s1(), str);
                                }
                                break;
                            case -1286700189:
                                if (str.equals("navigate_to_event_search")) {
                                    fg0.k kVarB5 = fBTPlanWizardActivity2.ca().B5();
                                    o13.p<DateTime, DateTime> pVarN5 = fBTPlanWizardActivity2.ca().N5();
                                    DateTime dateTime = pVarN5.f128594a;
                                    DateTime dateTime2 = pVarN5.f128595b;
                                    String strT5 = fBTPlanWizardActivity2.ca().t5(fBTPlanWizardActivity2, false);
                                    Double dF6 = fBTPlanWizardActivity2.ca().e7() ? fBTPlanWizardActivity2.ca().f6() : fBTPlanWizardActivity2.ca().P5();
                                    zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
                                    int iOrdinal = fBTPlanWizardActivity2.ca().I5().ordinal();
                                    DateTime dateTimeAtCurrentTime = fBTPlanWizardActivity2.ca().D5().toDateTimeAtCurrentTime();
                                    h hVarCa = fBTPlanWizardActivity2.ca();
                                    if (hVarCa.V6() && hVarCa.b7() && hVarCa.d7()) {
                                        z14 = true;
                                    } else {
                                        h hVarCa2 = fBTPlanWizardActivity2.ca();
                                        if (hVarCa2.V6() && hVarCa2.O6() && hVarCa2.d7()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                    jv1.s sVar = (jv1.s) fBTPlanWizardActivity2.ca().j6().d();
                                    jv1.h hVar = sVar != null ? sVar.f101127f : null;
                                    Double dValueOf = hVar instanceof jv1.i ? Double.valueOf(((jv1.i) hVar).f101059c) : null;
                                    boolean z15 = kVarB5 != null;
                                    if (kVarB5 != null) {
                                        Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                        strR = kVarB5.r(false);
                                        if (strR == null) {
                                            strR = "";
                                        }
                                    } else {
                                        strR = "";
                                    }
                                    String str2 = strR;
                                    boolean z16 = !fBTPlanWizardActivity2.ca().R6();
                                    int iC5 = fBTPlanWizardActivity2.ca().C5("TI_EVENT_SEARCH_SCREEN_TAG");
                                    int iY5 = fBTPlanWizardActivity2.ca().Y5();
                                    boolean zP6 = fBTPlanWizardActivity2.ca().P6();
                                    jv1.s sVarI6 = fBTPlanWizardActivity2.ca().i6();
                                    cVar.f(fBTPlanWizardActivity2, iOrdinal, dateTime, dateTime2, dateTimeAtCurrentTime, z14, dF6, dValueOf, strT5, z15, str2, z16, iC5, iY5, zP6, sVarI6 != null ? sVarI6.G : null);
                                }
                                break;
                            case -1179753275:
                                if (str.equals("FBTItpHoursPerWeekSelectionFragmentCompose")) {
                                    a1.f66302e.getClass();
                                    fBTPlanWizardActivity2.ea(new a1(), str);
                                }
                                break;
                            case -1176794338:
                                if (str.equals("FBTSelectSwimAbilityFragment")) {
                                    q2.f66691d.getClass();
                                    fBTPlanWizardActivity2.ea(new q2(), str);
                                }
                                break;
                            case -985909676:
                                if (str.equals("FBTAddCourseFragment")) {
                                    ew1.g.f66460d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.g(), str);
                                }
                                break;
                            case -956599071:
                                if (str.equals("FBTNameYourPlanFragCompose")) {
                                    f1.f66451c.getClass();
                                    fBTPlanWizardActivity2.ea(new f1(), str);
                                }
                                break;
                            case -681760690:
                                if (str.equals("FBTRunningWeeklyAvgDistancePaceFragCompose")) {
                                    ew1.a2.f66311e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.a2(), str);
                                }
                                break;
                            case -671727673:
                                if (str.equals("FBTSelectPlanTypeFragment")) {
                                    j2.f66533d.getClass();
                                    fBTPlanWizardActivity2.ea(new j2(), str);
                                }
                                break;
                            case -478050581:
                                if (str.equals("FBTSwimDaysSelectionFragCompose")) {
                                    u2.f66789c.getClass();
                                    fBTPlanWizardActivity2.ea(new u2(), str);
                                }
                                break;
                            case -303210716:
                                if (str.equals("FBTReviewInformationFragCompose")) {
                                    if (fBTPlanWizardActivity2.getSupportFragmentManager().G("FBTReviewInformationFragCompose") == null) {
                                        q1.f66677f.getClass();
                                        fBTPlanWizardActivity2.ea(new q1(), str);
                                    } else {
                                        fBTPlanWizardActivity2.getSupportFragmentManager().a0(0, "FBTReviewInformationFragCompose");
                                    }
                                }
                                break;
                            case -161404576:
                                if (str.equals("FBTFindRaceFragmentCompose")) {
                                    ew1.m0.f66573c.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.m0(), str);
                                }
                                break;
                            case -156813218:
                                if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                                    ew1.r.f66699d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.r(), str);
                                }
                                break;
                            case 5428568:
                                if (str.equals("FBTCoachSelectionComposeFragment")) {
                                    ew1.d0.f66371e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.d0(), str);
                                }
                                break;
                            case 34354408:
                                if (str.equals("FBTUserUpcomingEventsFragCompose")) {
                                    b3.f66335d.getClass();
                                    fBTPlanWizardActivity2.ea(new b3(), str);
                                }
                                break;
                            case 163527705:
                                if (str.equals("FBTWorkoutsPerWeekSelectionFragment")) {
                                    d3.f66394d.getClass();
                                    fBTPlanWizardActivity2.ea(new d3(), str);
                                }
                                break;
                            case 339378477:
                                if (str.equals("FBTNoCompatiblePlansFragment")) {
                                    i1.f66514e.getClass();
                                    fBTPlanWizardActivity2.ea(new i1(), str);
                                }
                                break;
                            case 389455378:
                                if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                                    o2.f66641d.getClass();
                                    fBTPlanWizardActivity2.ea(new o2(), str);
                                }
                                break;
                            case 580514214:
                                if (str.equals("FBTItpPlanTypeSelectionFragmentCompose")) {
                                    c1.f66352d.getClass();
                                    fBTPlanWizardActivity2.ea(new c1(), str);
                                }
                                break;
                            case 617385903:
                                if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                                    ew1.q0.f66666g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.q0(), str);
                                }
                                break;
                            case 624879919:
                                if (str.equals("FBTTriathlonTrainingHistoryFragCompose")) {
                                    x2.f66834d.getClass();
                                    fBTPlanWizardActivity2.ea(new x2(), str);
                                }
                                break;
                            case 662259589:
                                if (str.equals("FBTCoachRecommendationFragCompose")) {
                                    ew1.y.f66842g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.y(), str);
                                }
                                break;
                            case 988364009:
                                if (str.equals("FBTSelectDistanceOrTimeFragmentCompose")) {
                                    h2.f66500d.getClass();
                                    fBTPlanWizardActivity2.ea(new h2(), str);
                                }
                                break;
                            case 1025935190:
                                if (str.equals("FBTAddGoalDataFragment")) {
                                    ew1.n.C.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.n(), str);
                                }
                                break;
                            case 1118780127:
                                if (str.equals("FBTSelectCourseFragment")) {
                                    d2.f66384d.getClass();
                                    fBTPlanWizardActivity2.ea(new d2(), str);
                                }
                                break;
                            case 1195863826:
                                if (str.equals("FBTRideWeeklyAvgHoursFragCompose")) {
                                    ew1.w1.f66814e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.w1(), str);
                                }
                                break;
                            case 1691565655:
                                if (str.equals("FBTGoalTypeSelectionFragment")) {
                                    ew1.t0.f66754g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.t0(), str);
                                }
                                break;
                            case 1935580895:
                                if (str.equals("FBTLongDaysSelectionFragCompose")) {
                                    e1.f66409d.getClass();
                                    fBTPlanWizardActivity2.ea(new e1(), str);
                                }
                                break;
                            case 2074589026:
                                if (str.equals("FBTSelectSportFragmentCompose")) {
                                    m2.f66581d.getClass();
                                    fBTPlanWizardActivity2.ea(new m2(), str);
                                }
                                break;
                            case 2110650307:
                                if (str.equals("FBTHillTypeFragment")) {
                                    w0.f66806d.getClass();
                                    fBTPlanWizardActivity2.ea(new w0(), str);
                                }
                                break;
                        }
                        fBTPlanWizardActivity2.focusTitle();
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        FBTPlanWizardActivity.a aVar2 = FBTPlanWizardActivity.f45530e;
                        if (!zBooleanValue) {
                            fBTPlanWizardActivity.showActionBar();
                        } else {
                            fBTPlanWizardActivity.hideActionBar();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        FBTPlanWizardActivity.a aVar3 = FBTPlanWizardActivity.f45530e;
                        g3Var.getClass();
                        if (FBTPlanWizardActivity.b.f45535a[g3Var.f35300a.ordinal()] != 1) {
                            fBTPlanWizardActivity.hideProgressOverlay();
                            h hVarCa3 = fBTPlanWizardActivity.ca();
                            jv1.s sVarI7 = hVarCa3.i6();
                            if ((sVarI7 != null ? sVarI7.f101124c : null) != null) {
                                hVarCa3.H6();
                            } else if (!hVarCa3.R6()) {
                                hVarCa3.C7(vt1.e.ACHIEVE_A_MILESTONE);
                                if (!hVarCa3.O6()) {
                                    hVarCa3.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                } else {
                                    hVarCa3.s6().j("FBTSelectSportFragmentCompose");
                                }
                            } else if (hVarCa3.S5() == vt1.o.f180181l || hVarCa3.S5() == vt1.o.f180179j || hVarCa3.S5() == vt1.o.f180180k) {
                                hVarCa3.C7(vt1.e.IMPROVE_FITNESS);
                                hVarCa3.h7();
                            } else {
                                hVarCa3.s6().j("FBTSelectPlanTypeFragment");
                            }
                        } else {
                            fBTPlanWizardActivity.showProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f45533c = new z0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTPlanWizardActivity f13328b;

            {
                this.f13328b = this;
            }

            /* JADX WARN: Code duplicated, block: B:168:0x03fa  */
            /* JADX WARN: Code duplicated, block: B:186:0x0437  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean z14;
                String strR;
                int i16 = i15;
                FBTPlanWizardActivity fBTPlanWizardActivity = this.f13328b;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        FBTPlanWizardActivity.a aVar = FBTPlanWizardActivity.f45530e;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        FBTPlanWizardActivity fBTPlanWizardActivity2 = this.f13328b;
                        switch (iHashCode) {
                            case -2104826316:
                                if (str.equals("FBTElevationProfileFragment")) {
                                    ew1.k0.f66545d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.k0(), str);
                                }
                                break;
                            case -1981189786:
                                if (str.equals("FBTSelectTrainingLevelFragment")) {
                                    s2.f66742d.getClass();
                                    fBTPlanWizardActivity2.ea(new s2(), str);
                                }
                                break;
                            case -1581111839:
                                if (str.equals("FBTHowToEndPlanFragment")) {
                                    y0.f66855c.getClass();
                                    fBTPlanWizardActivity2.ea(new y0(), str);
                                }
                                break;
                            case -1402751305:
                                if (str.equals("FBTReviewScheduleFragment")) {
                                    s1.f66734c.getClass();
                                    fBTPlanWizardActivity2.ea(new s1(), str);
                                }
                                break;
                            case -1286700189:
                                if (str.equals("navigate_to_event_search")) {
                                    fg0.k kVarB5 = fBTPlanWizardActivity2.ca().B5();
                                    o13.p<DateTime, DateTime> pVarN5 = fBTPlanWizardActivity2.ca().N5();
                                    DateTime dateTime = pVarN5.f128594a;
                                    DateTime dateTime2 = pVarN5.f128595b;
                                    String strT5 = fBTPlanWizardActivity2.ca().t5(fBTPlanWizardActivity2, false);
                                    Double dF6 = fBTPlanWizardActivity2.ca().e7() ? fBTPlanWizardActivity2.ca().f6() : fBTPlanWizardActivity2.ca().P5();
                                    zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
                                    int iOrdinal = fBTPlanWizardActivity2.ca().I5().ordinal();
                                    DateTime dateTimeAtCurrentTime = fBTPlanWizardActivity2.ca().D5().toDateTimeAtCurrentTime();
                                    h hVarCa = fBTPlanWizardActivity2.ca();
                                    if (hVarCa.V6() && hVarCa.b7() && hVarCa.d7()) {
                                        z14 = true;
                                    } else {
                                        h hVarCa2 = fBTPlanWizardActivity2.ca();
                                        if (hVarCa2.V6() && hVarCa2.O6() && hVarCa2.d7()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                    jv1.s sVar = (jv1.s) fBTPlanWizardActivity2.ca().j6().d();
                                    jv1.h hVar = sVar != null ? sVar.f101127f : null;
                                    Double dValueOf = hVar instanceof jv1.i ? Double.valueOf(((jv1.i) hVar).f101059c) : null;
                                    boolean z15 = kVarB5 != null;
                                    if (kVarB5 != null) {
                                        Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                        strR = kVarB5.r(false);
                                        if (strR == null) {
                                            strR = "";
                                        }
                                    } else {
                                        strR = "";
                                    }
                                    String str2 = strR;
                                    boolean z16 = !fBTPlanWizardActivity2.ca().R6();
                                    int iC5 = fBTPlanWizardActivity2.ca().C5("TI_EVENT_SEARCH_SCREEN_TAG");
                                    int iY5 = fBTPlanWizardActivity2.ca().Y5();
                                    boolean zP6 = fBTPlanWizardActivity2.ca().P6();
                                    jv1.s sVarI6 = fBTPlanWizardActivity2.ca().i6();
                                    cVar.f(fBTPlanWizardActivity2, iOrdinal, dateTime, dateTime2, dateTimeAtCurrentTime, z14, dF6, dValueOf, strT5, z15, str2, z16, iC5, iY5, zP6, sVarI6 != null ? sVarI6.G : null);
                                }
                                break;
                            case -1179753275:
                                if (str.equals("FBTItpHoursPerWeekSelectionFragmentCompose")) {
                                    a1.f66302e.getClass();
                                    fBTPlanWizardActivity2.ea(new a1(), str);
                                }
                                break;
                            case -1176794338:
                                if (str.equals("FBTSelectSwimAbilityFragment")) {
                                    q2.f66691d.getClass();
                                    fBTPlanWizardActivity2.ea(new q2(), str);
                                }
                                break;
                            case -985909676:
                                if (str.equals("FBTAddCourseFragment")) {
                                    ew1.g.f66460d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.g(), str);
                                }
                                break;
                            case -956599071:
                                if (str.equals("FBTNameYourPlanFragCompose")) {
                                    f1.f66451c.getClass();
                                    fBTPlanWizardActivity2.ea(new f1(), str);
                                }
                                break;
                            case -681760690:
                                if (str.equals("FBTRunningWeeklyAvgDistancePaceFragCompose")) {
                                    ew1.a2.f66311e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.a2(), str);
                                }
                                break;
                            case -671727673:
                                if (str.equals("FBTSelectPlanTypeFragment")) {
                                    j2.f66533d.getClass();
                                    fBTPlanWizardActivity2.ea(new j2(), str);
                                }
                                break;
                            case -478050581:
                                if (str.equals("FBTSwimDaysSelectionFragCompose")) {
                                    u2.f66789c.getClass();
                                    fBTPlanWizardActivity2.ea(new u2(), str);
                                }
                                break;
                            case -303210716:
                                if (str.equals("FBTReviewInformationFragCompose")) {
                                    if (fBTPlanWizardActivity2.getSupportFragmentManager().G("FBTReviewInformationFragCompose") == null) {
                                        q1.f66677f.getClass();
                                        fBTPlanWizardActivity2.ea(new q1(), str);
                                    } else {
                                        fBTPlanWizardActivity2.getSupportFragmentManager().a0(0, "FBTReviewInformationFragCompose");
                                    }
                                }
                                break;
                            case -161404576:
                                if (str.equals("FBTFindRaceFragmentCompose")) {
                                    ew1.m0.f66573c.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.m0(), str);
                                }
                                break;
                            case -156813218:
                                if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                                    ew1.r.f66699d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.r(), str);
                                }
                                break;
                            case 5428568:
                                if (str.equals("FBTCoachSelectionComposeFragment")) {
                                    ew1.d0.f66371e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.d0(), str);
                                }
                                break;
                            case 34354408:
                                if (str.equals("FBTUserUpcomingEventsFragCompose")) {
                                    b3.f66335d.getClass();
                                    fBTPlanWizardActivity2.ea(new b3(), str);
                                }
                                break;
                            case 163527705:
                                if (str.equals("FBTWorkoutsPerWeekSelectionFragment")) {
                                    d3.f66394d.getClass();
                                    fBTPlanWizardActivity2.ea(new d3(), str);
                                }
                                break;
                            case 339378477:
                                if (str.equals("FBTNoCompatiblePlansFragment")) {
                                    i1.f66514e.getClass();
                                    fBTPlanWizardActivity2.ea(new i1(), str);
                                }
                                break;
                            case 389455378:
                                if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                                    o2.f66641d.getClass();
                                    fBTPlanWizardActivity2.ea(new o2(), str);
                                }
                                break;
                            case 580514214:
                                if (str.equals("FBTItpPlanTypeSelectionFragmentCompose")) {
                                    c1.f66352d.getClass();
                                    fBTPlanWizardActivity2.ea(new c1(), str);
                                }
                                break;
                            case 617385903:
                                if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                                    ew1.q0.f66666g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.q0(), str);
                                }
                                break;
                            case 624879919:
                                if (str.equals("FBTTriathlonTrainingHistoryFragCompose")) {
                                    x2.f66834d.getClass();
                                    fBTPlanWizardActivity2.ea(new x2(), str);
                                }
                                break;
                            case 662259589:
                                if (str.equals("FBTCoachRecommendationFragCompose")) {
                                    ew1.y.f66842g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.y(), str);
                                }
                                break;
                            case 988364009:
                                if (str.equals("FBTSelectDistanceOrTimeFragmentCompose")) {
                                    h2.f66500d.getClass();
                                    fBTPlanWizardActivity2.ea(new h2(), str);
                                }
                                break;
                            case 1025935190:
                                if (str.equals("FBTAddGoalDataFragment")) {
                                    ew1.n.C.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.n(), str);
                                }
                                break;
                            case 1118780127:
                                if (str.equals("FBTSelectCourseFragment")) {
                                    d2.f66384d.getClass();
                                    fBTPlanWizardActivity2.ea(new d2(), str);
                                }
                                break;
                            case 1195863826:
                                if (str.equals("FBTRideWeeklyAvgHoursFragCompose")) {
                                    ew1.w1.f66814e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.w1(), str);
                                }
                                break;
                            case 1691565655:
                                if (str.equals("FBTGoalTypeSelectionFragment")) {
                                    ew1.t0.f66754g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.t0(), str);
                                }
                                break;
                            case 1935580895:
                                if (str.equals("FBTLongDaysSelectionFragCompose")) {
                                    e1.f66409d.getClass();
                                    fBTPlanWizardActivity2.ea(new e1(), str);
                                }
                                break;
                            case 2074589026:
                                if (str.equals("FBTSelectSportFragmentCompose")) {
                                    m2.f66581d.getClass();
                                    fBTPlanWizardActivity2.ea(new m2(), str);
                                }
                                break;
                            case 2110650307:
                                if (str.equals("FBTHillTypeFragment")) {
                                    w0.f66806d.getClass();
                                    fBTPlanWizardActivity2.ea(new w0(), str);
                                }
                                break;
                        }
                        fBTPlanWizardActivity2.focusTitle();
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        FBTPlanWizardActivity.a aVar2 = FBTPlanWizardActivity.f45530e;
                        if (!zBooleanValue) {
                            fBTPlanWizardActivity.showActionBar();
                        } else {
                            fBTPlanWizardActivity.hideActionBar();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        FBTPlanWizardActivity.a aVar3 = FBTPlanWizardActivity.f45530e;
                        g3Var.getClass();
                        if (FBTPlanWizardActivity.b.f45535a[g3Var.f35300a.ordinal()] != 1) {
                            fBTPlanWizardActivity.hideProgressOverlay();
                            h hVarCa3 = fBTPlanWizardActivity.ca();
                            jv1.s sVarI7 = hVarCa3.i6();
                            if ((sVarI7 != null ? sVarI7.f101124c : null) != null) {
                                hVarCa3.H6();
                            } else if (!hVarCa3.R6()) {
                                hVarCa3.C7(vt1.e.ACHIEVE_A_MILESTONE);
                                if (!hVarCa3.O6()) {
                                    hVarCa3.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                } else {
                                    hVarCa3.s6().j("FBTSelectSportFragmentCompose");
                                }
                            } else if (hVarCa3.S5() == vt1.o.f180181l || hVarCa3.S5() == vt1.o.f180179j || hVarCa3.S5() == vt1.o.f180180k) {
                                hVarCa3.C7(vt1.e.IMPROVE_FITNESS);
                                hVarCa3.h7();
                            } else {
                                hVarCa3.s6().j("FBTSelectPlanTypeFragment");
                            }
                        } else {
                            fBTPlanWizardActivity.showProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f45534d = new z0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FBTPlanWizardActivity f13328b;

            {
                this.f13328b = this;
            }

            /* JADX WARN: Code duplicated, block: B:168:0x03fa  */
            /* JADX WARN: Code duplicated, block: B:186:0x0437  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean z14;
                String strR;
                int i17 = i16;
                FBTPlanWizardActivity fBTPlanWizardActivity = this.f13328b;
                switch (i17) {
                    case 0:
                        String str = (String) obj;
                        FBTPlanWizardActivity.a aVar = FBTPlanWizardActivity.f45530e;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        FBTPlanWizardActivity fBTPlanWizardActivity2 = this.f13328b;
                        switch (iHashCode) {
                            case -2104826316:
                                if (str.equals("FBTElevationProfileFragment")) {
                                    ew1.k0.f66545d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.k0(), str);
                                }
                                break;
                            case -1981189786:
                                if (str.equals("FBTSelectTrainingLevelFragment")) {
                                    s2.f66742d.getClass();
                                    fBTPlanWizardActivity2.ea(new s2(), str);
                                }
                                break;
                            case -1581111839:
                                if (str.equals("FBTHowToEndPlanFragment")) {
                                    y0.f66855c.getClass();
                                    fBTPlanWizardActivity2.ea(new y0(), str);
                                }
                                break;
                            case -1402751305:
                                if (str.equals("FBTReviewScheduleFragment")) {
                                    s1.f66734c.getClass();
                                    fBTPlanWizardActivity2.ea(new s1(), str);
                                }
                                break;
                            case -1286700189:
                                if (str.equals("navigate_to_event_search")) {
                                    fg0.k kVarB5 = fBTPlanWizardActivity2.ca().B5();
                                    o13.p<DateTime, DateTime> pVarN5 = fBTPlanWizardActivity2.ca().N5();
                                    DateTime dateTime = pVarN5.f128594a;
                                    DateTime dateTime2 = pVarN5.f128595b;
                                    String strT5 = fBTPlanWizardActivity2.ca().t5(fBTPlanWizardActivity2, false);
                                    Double dF6 = fBTPlanWizardActivity2.ca().e7() ? fBTPlanWizardActivity2.ca().f6() : fBTPlanWizardActivity2.ca().P5();
                                    zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
                                    int iOrdinal = fBTPlanWizardActivity2.ca().I5().ordinal();
                                    DateTime dateTimeAtCurrentTime = fBTPlanWizardActivity2.ca().D5().toDateTimeAtCurrentTime();
                                    h hVarCa = fBTPlanWizardActivity2.ca();
                                    if (hVarCa.V6() && hVarCa.b7() && hVarCa.d7()) {
                                        z14 = true;
                                    } else {
                                        h hVarCa2 = fBTPlanWizardActivity2.ca();
                                        if (hVarCa2.V6() && hVarCa2.O6() && hVarCa2.d7()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                    jv1.s sVar = (jv1.s) fBTPlanWizardActivity2.ca().j6().d();
                                    jv1.h hVar = sVar != null ? sVar.f101127f : null;
                                    Double dValueOf = hVar instanceof jv1.i ? Double.valueOf(((jv1.i) hVar).f101059c) : null;
                                    boolean z15 = kVarB5 != null;
                                    if (kVarB5 != null) {
                                        Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                        strR = kVarB5.r(false);
                                        if (strR == null) {
                                            strR = "";
                                        }
                                    } else {
                                        strR = "";
                                    }
                                    String str2 = strR;
                                    boolean z16 = !fBTPlanWizardActivity2.ca().R6();
                                    int iC5 = fBTPlanWizardActivity2.ca().C5("TI_EVENT_SEARCH_SCREEN_TAG");
                                    int iY5 = fBTPlanWizardActivity2.ca().Y5();
                                    boolean zP6 = fBTPlanWizardActivity2.ca().P6();
                                    jv1.s sVarI6 = fBTPlanWizardActivity2.ca().i6();
                                    cVar.f(fBTPlanWizardActivity2, iOrdinal, dateTime, dateTime2, dateTimeAtCurrentTime, z14, dF6, dValueOf, strT5, z15, str2, z16, iC5, iY5, zP6, sVarI6 != null ? sVarI6.G : null);
                                }
                                break;
                            case -1179753275:
                                if (str.equals("FBTItpHoursPerWeekSelectionFragmentCompose")) {
                                    a1.f66302e.getClass();
                                    fBTPlanWizardActivity2.ea(new a1(), str);
                                }
                                break;
                            case -1176794338:
                                if (str.equals("FBTSelectSwimAbilityFragment")) {
                                    q2.f66691d.getClass();
                                    fBTPlanWizardActivity2.ea(new q2(), str);
                                }
                                break;
                            case -985909676:
                                if (str.equals("FBTAddCourseFragment")) {
                                    ew1.g.f66460d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.g(), str);
                                }
                                break;
                            case -956599071:
                                if (str.equals("FBTNameYourPlanFragCompose")) {
                                    f1.f66451c.getClass();
                                    fBTPlanWizardActivity2.ea(new f1(), str);
                                }
                                break;
                            case -681760690:
                                if (str.equals("FBTRunningWeeklyAvgDistancePaceFragCompose")) {
                                    ew1.a2.f66311e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.a2(), str);
                                }
                                break;
                            case -671727673:
                                if (str.equals("FBTSelectPlanTypeFragment")) {
                                    j2.f66533d.getClass();
                                    fBTPlanWizardActivity2.ea(new j2(), str);
                                }
                                break;
                            case -478050581:
                                if (str.equals("FBTSwimDaysSelectionFragCompose")) {
                                    u2.f66789c.getClass();
                                    fBTPlanWizardActivity2.ea(new u2(), str);
                                }
                                break;
                            case -303210716:
                                if (str.equals("FBTReviewInformationFragCompose")) {
                                    if (fBTPlanWizardActivity2.getSupportFragmentManager().G("FBTReviewInformationFragCompose") == null) {
                                        q1.f66677f.getClass();
                                        fBTPlanWizardActivity2.ea(new q1(), str);
                                    } else {
                                        fBTPlanWizardActivity2.getSupportFragmentManager().a0(0, "FBTReviewInformationFragCompose");
                                    }
                                }
                                break;
                            case -161404576:
                                if (str.equals("FBTFindRaceFragmentCompose")) {
                                    ew1.m0.f66573c.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.m0(), str);
                                }
                                break;
                            case -156813218:
                                if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                                    ew1.r.f66699d.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.r(), str);
                                }
                                break;
                            case 5428568:
                                if (str.equals("FBTCoachSelectionComposeFragment")) {
                                    ew1.d0.f66371e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.d0(), str);
                                }
                                break;
                            case 34354408:
                                if (str.equals("FBTUserUpcomingEventsFragCompose")) {
                                    b3.f66335d.getClass();
                                    fBTPlanWizardActivity2.ea(new b3(), str);
                                }
                                break;
                            case 163527705:
                                if (str.equals("FBTWorkoutsPerWeekSelectionFragment")) {
                                    d3.f66394d.getClass();
                                    fBTPlanWizardActivity2.ea(new d3(), str);
                                }
                                break;
                            case 339378477:
                                if (str.equals("FBTNoCompatiblePlansFragment")) {
                                    i1.f66514e.getClass();
                                    fBTPlanWizardActivity2.ea(new i1(), str);
                                }
                                break;
                            case 389455378:
                                if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                                    o2.f66641d.getClass();
                                    fBTPlanWizardActivity2.ea(new o2(), str);
                                }
                                break;
                            case 580514214:
                                if (str.equals("FBTItpPlanTypeSelectionFragmentCompose")) {
                                    c1.f66352d.getClass();
                                    fBTPlanWizardActivity2.ea(new c1(), str);
                                }
                                break;
                            case 617385903:
                                if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                                    ew1.q0.f66666g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.q0(), str);
                                }
                                break;
                            case 624879919:
                                if (str.equals("FBTTriathlonTrainingHistoryFragCompose")) {
                                    x2.f66834d.getClass();
                                    fBTPlanWizardActivity2.ea(new x2(), str);
                                }
                                break;
                            case 662259589:
                                if (str.equals("FBTCoachRecommendationFragCompose")) {
                                    ew1.y.f66842g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.y(), str);
                                }
                                break;
                            case 988364009:
                                if (str.equals("FBTSelectDistanceOrTimeFragmentCompose")) {
                                    h2.f66500d.getClass();
                                    fBTPlanWizardActivity2.ea(new h2(), str);
                                }
                                break;
                            case 1025935190:
                                if (str.equals("FBTAddGoalDataFragment")) {
                                    ew1.n.C.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.n(), str);
                                }
                                break;
                            case 1118780127:
                                if (str.equals("FBTSelectCourseFragment")) {
                                    d2.f66384d.getClass();
                                    fBTPlanWizardActivity2.ea(new d2(), str);
                                }
                                break;
                            case 1195863826:
                                if (str.equals("FBTRideWeeklyAvgHoursFragCompose")) {
                                    ew1.w1.f66814e.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.w1(), str);
                                }
                                break;
                            case 1691565655:
                                if (str.equals("FBTGoalTypeSelectionFragment")) {
                                    ew1.t0.f66754g.getClass();
                                    fBTPlanWizardActivity2.ea(new ew1.t0(), str);
                                }
                                break;
                            case 1935580895:
                                if (str.equals("FBTLongDaysSelectionFragCompose")) {
                                    e1.f66409d.getClass();
                                    fBTPlanWizardActivity2.ea(new e1(), str);
                                }
                                break;
                            case 2074589026:
                                if (str.equals("FBTSelectSportFragmentCompose")) {
                                    m2.f66581d.getClass();
                                    fBTPlanWizardActivity2.ea(new m2(), str);
                                }
                                break;
                            case 2110650307:
                                if (str.equals("FBTHillTypeFragment")) {
                                    w0.f66806d.getClass();
                                    fBTPlanWizardActivity2.ea(new w0(), str);
                                }
                                break;
                        }
                        fBTPlanWizardActivity2.focusTitle();
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        FBTPlanWizardActivity.a aVar2 = FBTPlanWizardActivity.f45530e;
                        if (!zBooleanValue) {
                            fBTPlanWizardActivity.showActionBar();
                        } else {
                            fBTPlanWizardActivity.hideActionBar();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        FBTPlanWizardActivity.a aVar3 = FBTPlanWizardActivity.f45530e;
                        g3Var.getClass();
                        if (FBTPlanWizardActivity.b.f45535a[g3Var.f35300a.ordinal()] != 1) {
                            fBTPlanWizardActivity.hideProgressOverlay();
                            h hVarCa3 = fBTPlanWizardActivity.ca();
                            jv1.s sVarI7 = hVarCa3.i6();
                            if ((sVarI7 != null ? sVarI7.f101124c : null) != null) {
                                hVarCa3.H6();
                            } else if (!hVarCa3.R6()) {
                                hVarCa3.C7(vt1.e.ACHIEVE_A_MILESTONE);
                                if (!hVarCa3.O6()) {
                                    hVarCa3.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                } else {
                                    hVarCa3.s6().j("FBTSelectSportFragmentCompose");
                                }
                            } else if (hVarCa3.S5() == vt1.o.f180181l || hVarCa3.S5() == vt1.o.f180179j || hVarCa3.S5() == vt1.o.f180180k) {
                                hVarCa3.C7(vt1.e.IMPROVE_FITNESS);
                                hVarCa3.h7();
                            } else {
                                hVarCa3.s6().j("FBTSelectPlanTypeFragment");
                            }
                        } else {
                            fBTPlanWizardActivity.showProgressOverlay();
                        }
                        break;
                }
            }
        };
    }

    public final aw1.h ca() {
        return (aw1.h) this.f45531a.getValue();
    }

    public final void da() {
        if (ca().f13385r1) {
            return;
        }
        aw1.h hVarCa = ca();
        s sVarI6 = hVarCa.i6();
        hVarCa.k8(sVarI6 != null ? s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 509) : null);
        aw1.h.n7(ca(), this);
    }

    public final void ea(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        fg0.p pVar;
        k kVar;
        Parcelable parcelable;
        Bundle extras;
        Parcelable parcelable2;
        Bundle extras2;
        Parcelable parcelable3;
        w wVar;
        Parcelable parcelable4;
        k kVar2;
        Parcelable parcelable5;
        k kVar3;
        Parcelable parcelable6;
        k kVar4;
        Parcelable parcelable7;
        k kVar5;
        Parcelable parcelable8;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 101) {
            if (i15 == -1) {
                ca().p7();
                return;
            }
            return;
        }
        ww1.v vVar = null;
        if (i14 == 151) {
            if (i15 != -1) {
                if (i15 != 2) {
                    return;
                }
                setResult(i15);
                finish();
                return;
            }
            if (intent != null && (extras2 = intent.getExtras()) != null && extras2.getBoolean("extra_fbt_navigate_event_creation_flow")) {
                ca().s6().j("FBTNameYourPlanFragCompose");
                return;
            }
            if (intent == null || (extras = intent.getExtras()) == null) {
                pVar = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_sharable_event_search_dto", fg0.p.class);
                } else {
                    Parcelable parcelable9 = extras.getParcelable("GCM_extra_sharable_event_search_dto");
                    if (!(parcelable9 instanceof fg0.p)) {
                        parcelable9 = null;
                    }
                    parcelable2 = (fg0.p) parcelable9;
                }
                pVar = (fg0.p) parcelable2;
            }
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            if (bundleA != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_sharable_event_dto", k.class);
                } else {
                    Parcelable parcelable10 = bundleA.getParcelable("GCM_extra_sharable_event_dto");
                    if (!(parcelable10 instanceof k)) {
                        parcelable10 = null;
                    }
                    parcelable = (k) parcelable10;
                }
                kVar = (k) parcelable;
            } else {
                kVar = null;
            }
            aw1.h hVarCa = ca();
            if (pVar == null && kVar == null) {
                return;
            }
            s sVarI6 = hVarCa.i6();
            fg0.p pVar2 = pVar;
            hVarCa.k8(sVarI6 != null ? s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, pVar, kVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165829, 511) : null);
            if (pVar2 == null) {
                hVarCa.p5();
                return;
            } else {
                ge1.b.T(v1.a(hVarCa), null, null, new o0(hVarCa, pVar2, null), 3);
                return;
            }
        }
        if (i14 == 200) {
            if (i15 != -1) {
                if (i15 == 0) {
                    ca().M7(null);
                    return;
                } else {
                    if (i15 != 2) {
                        return;
                    }
                    setResult(i15);
                    finish();
                    return;
                }
            }
            if (intent != null) {
                showProgressOverlay();
                l2.f37135b.getClass();
                Bundle bundleA2 = l2.a.a(intent);
                if (bundleA2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable3 = (Parcelable) bundleA2.getParcelable("extra_fbt_location_time_dto", ww1.v.class);
                    } else {
                        Parcelable parcelable11 = bundleA2.getParcelable("extra_fbt_location_time_dto");
                        parcelable3 = (ww1.v) (parcelable11 instanceof ww1.v ? parcelable11 : null);
                    }
                    vVar = (ww1.v) parcelable3;
                }
                fy1.c cVar = fy1.c.f73884a;
                boolean z14 = vVar != null && vVar.f187881e;
                cVar.getClass();
                fy1.c.b(z14 ? "GarminCoachLocationSelected" : "GarminCoachLocationNotSelected");
                ca().M7(vVar);
                if (ca().N6()) {
                    ca().s6().j("FBTGoalDateSelectionFragmentCompose");
                    return;
                } else {
                    ca().k7();
                    return;
                }
            }
            return;
        }
        switch (i14) {
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                if (i15 == -1) {
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA3 = l2.a.a(intent);
                        if (bundleA3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable4 = (Parcelable) bundleA3.getParcelable("extra_fbt_triathlon_leg_targets", w.class);
                            } else {
                                Parcelable parcelable12 = bundleA3.getParcelable("extra_fbt_triathlon_leg_targets");
                                if (!(parcelable12 instanceof w)) {
                                    parcelable12 = null;
                                }
                                parcelable4 = (w) parcelable12;
                            }
                            wVar = (w) parcelable4;
                        } else {
                            wVar = null;
                        }
                        aw1.h hVarCa2 = ca();
                        s sVarI7 = hVarCa2.i6();
                        hVarCa2.k8(sVarI7 != null ? s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wVar, null, null, null, null, null, null, null, null, -1, 510) : null);
                        if (!hVarCa2.k5()) {
                            hVarCa2.m7(this);
                        } else {
                            hVarCa2.g7();
                        }
                    }
                    break;
                } else if (i15 == 0) {
                    ca().x7();
                    break;
                } else if (i15 == 2) {
                    setResult(i15);
                    finish();
                    break;
                }
                break;
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                if (i15 == -1) {
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA4 = l2.a.a(intent);
                        if (bundleA4 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable5 = (Parcelable) bundleA4.getParcelable("GCM_extra_sharable_event_dto", k.class);
                            } else {
                                Parcelable parcelable13 = bundleA4.getParcelable("GCM_extra_sharable_event_dto");
                                if (!(parcelable13 instanceof k)) {
                                    parcelable13 = null;
                                }
                                parcelable5 = (k) parcelable13;
                            }
                            kVar2 = (k) parcelable5;
                        } else {
                            kVar2 = null;
                        }
                        ca().V7(kVar2 != null ? kVar2.getEventCustomization() : null);
                    }
                    break;
                } else if (i15 == 0) {
                    da();
                    break;
                } else if (i15 == 2) {
                    setResult(i15);
                    finish();
                    break;
                }
                break;
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                if (i15 == -1) {
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA5 = l2.a.a(intent);
                        if (bundleA5 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable6 = (Parcelable) bundleA5.getParcelable("GCM_extra_sharable_event_dto", k.class);
                            } else {
                                Parcelable parcelable14 = bundleA5.getParcelable("GCM_extra_sharable_event_dto");
                                if (!(parcelable14 instanceof k)) {
                                    parcelable14 = null;
                                }
                                parcelable6 = (k) parcelable14;
                            }
                            kVar3 = (k) parcelable6;
                        } else {
                            kVar3 = null;
                        }
                        ca().V7(kVar3 != null ? kVar3.getEventCustomization() : null);
                    }
                    break;
                } else if (i15 == 0) {
                    da();
                    break;
                } else if (i15 == 2) {
                    setResult(i15);
                    finish();
                    break;
                }
                break;
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                if (i15 == -1) {
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA6 = l2.a.a(intent);
                        if (bundleA6 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable7 = (Parcelable) bundleA6.getParcelable("GCM_extra_sharable_event_dto", k.class);
                            } else {
                                Parcelable parcelable15 = bundleA6.getParcelable("GCM_extra_sharable_event_dto");
                                if (!(parcelable15 instanceof k)) {
                                    parcelable15 = null;
                                }
                                parcelable7 = (k) parcelable15;
                            }
                            kVar4 = (k) parcelable7;
                        } else {
                            kVar4 = null;
                        }
                        ca().V7(kVar4 != null ? kVar4.getEventCustomization() : null);
                    }
                    break;
                } else if (i15 == 0) {
                    da();
                    break;
                } else if (i15 == 2) {
                    setResult(i15);
                    finish();
                    break;
                }
                break;
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                if (i15 == -1) {
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA7 = l2.a.a(intent);
                        if (bundleA7 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable8 = (Parcelable) bundleA7.getParcelable("GCM_extra_sharable_event_dto", k.class);
                            } else {
                                Parcelable parcelable16 = bundleA7.getParcelable("GCM_extra_sharable_event_dto");
                                if (!(parcelable16 instanceof k)) {
                                    parcelable16 = null;
                                }
                                parcelable8 = (k) parcelable16;
                            }
                            kVar5 = (k) parcelable8;
                        } else {
                            kVar5 = null;
                        }
                        ca().V7(kVar5 != null ? kVar5.getEventCustomization() : null);
                    }
                    break;
                } else if (i15 == 0) {
                    da();
                    break;
                } else if (i15 == 2) {
                    setResult(i15);
                    finish();
                    break;
                }
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        if (getSupportFragmentManager().M() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        Bundle extras = getIntent().getExtras();
        k kVar = (k) a2.c(extras, "GCM_extra_event");
        if (kVar != null) {
            ca().C7(vt1.e.TRAIN_FOR_A_RACE);
            if (kVar.getEventType() == gg0.f.f77136l) {
                ca().R7(k.d(kVar, null, null, null, null, null, null, null, -1));
            } else {
                ca().K7(k.d(kVar, null, null, null, null, null, null, null, -1));
            }
        }
        if (extras != null && extras.containsKey("extra_selected_training_type")) {
            o oVar = (o) o.f180183n.get(extras.getInt("extra_selected_training_type"));
            vt1.d dVar = oVar == o.f180176g ? vt1.d.f180090c : null;
            aw1.h hVarCa = ca();
            oVar.getClass();
            hVarCa.f13391x1 = oVar;
            ca().S7(oVar, dVar);
        }
        ca().H5().f61437c = extras != null ? extras.getBoolean("extra_is_from_event_tp_flow") : false;
        ca().H5().f61442h = extras != null ? Boolean.valueOf(extras.getBoolean("extras_launch_event_details")) : null;
        ca().H5().f61441g = extras != null ? Boolean.valueOf(extras.getBoolean("extras_navigating_from_event_creation")) : null;
        ca().H5().f61438d = (ww1.g) a2.c(extras, "extras_active_plan_linked_event");
        initActionBar(true, R.string.train_for_an_event);
        aw1.h hVarCa2 = ca();
        ((androidx.lifecycle.y0) hVarCa2.A1.getValue()).j(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(hVarCa2), null, null, new k0(hVarCa2, null), 3);
        ca().B1.f(this, this.f45534d);
        ca().f13377k0.f(this, this.f45532b);
        ca().f13371e1.f(this, this.f45533c);
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
        ge1.b.T(f0.w(this), null, null, new d(null), 3);
        ca().f13375i1.f(this, new e(new a03.f(this, 22)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_exit, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_exit) {
            return super.onOptionsItemSelected(menuItem);
        }
        fy1.i.a aVar = fy1.i.f73924a;
        aw1.a aVar2 = new aw1.a(this, 0);
        aVar.getClass();
        fy1.i.a.u(this, aVar2);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/wizardflow/FBTPlanWizardActivity$a;", "", "<init>", "()V", "", "NAVIGATE_TO_EVENT_SEARCH", "Ljava/lang/String;", "EXTRA_SELECTED_TRAINING_TYPE", "EXTRA_IS_FROM_EVENT_TP_FLOW", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, o oVar, k kVar, ww1.g gVar, boolean z15, boolean z16) {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_is_from_event_tp_flow", z14);
            if (oVar != null) {
                bundle.putInt("extra_selected_training_type", oVar.ordinal());
            }
            bundle.putBoolean("extras_launch_event_details", z15);
            bundle.putBoolean("extras_navigating_from_event_creation", z16);
            a2.b(bundle, "GCM_extra_event", kVar);
            a2.b(bundle, "extras_active_plan_linked_event", gVar);
            Intent intent = new Intent(context, (Class<?>) FBTPlanWizardActivity.class);
            intent.putExtras(bundle);
            return intent;
        }

        private a() {
        }
    }
}
