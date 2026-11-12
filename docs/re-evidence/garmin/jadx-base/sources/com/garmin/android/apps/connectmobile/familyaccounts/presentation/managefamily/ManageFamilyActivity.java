package com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import e23.p;
import i3.mc;
import java.util.List;
import lc.m0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import sg0.e1;
import sg0.f0;
import sg0.r0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/managefamily/ManageFamilyActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ManageFamilyActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f35178j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.b f35181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0 f35182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f35183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f35184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f35185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f35186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f35187i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity$onCreate$1$1$1$1$1", f = "ManageFamilyActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f35189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f35190c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity$onCreate$1$1$1$1$1$1", f = "ManageFamilyActivity.kt", l = {118}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mc f35192b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mc mcVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f35192b = mcVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f35192b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35191a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f35191a = 1;
                    if (this.f35192b.g(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, b0 b0Var, mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f35188a = str;
            this.f35189b = b0Var;
            this.f35190c = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f35188a, this.f35189b, this.f35190c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f35188a != null) {
                ge1.b.T(this.f35189b, null, null, new a(this.f35190c, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity$onCreate$1$1$1$2$1$2$1", f = "ManageFamilyActivity.kt", l = {131}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f35194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f35194b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f35194b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35193a;
            if (i14 == 0) {
                r.b(obj);
                this.f35193a = 1;
                if (this.f35194b.g(this) == aVar) {
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
    public static final class d implements e23.a<e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35198d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35195a = gVar;
            this.f35196b = qualifier;
            this.f35197c = aVar;
            this.f35198d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, sg0.e1] */
        @Override // e23.a
        public final e1 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f35195a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f35197c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(e1.class), viewModelStore, null, defaultViewModelCreationExtras, this.f35196b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35198d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35202d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35199a = gVar;
            this.f35200b = qualifier;
            this.f35201c = aVar;
            this.f35202d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, sg0.f0] */
        @Override // e23.a
        public final f0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f35199a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f35201c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f35200b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35202d, 4, null);
        }
    }

    public ManageFamilyActivity() {
        n nVar = n.NONE;
        this.f35179a = m.a(nVar, new d(this, null, null, null));
        this.f35180b = m.a(nVar, new e(this, null, null, null));
        this.f35181c = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        final int i14 = 0;
        this.f35183e = registerForActivityResult(new g.h(), new f.b(this) { // from class: sg0.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageFamilyActivity f159155b;

            {
                this.f159155b = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                Object value;
                nj1.b bVar2;
                Object value2;
                Object value3;
                Object value4;
                Parcelable parcelable;
                boolean z14;
                int i15 = i14;
                nj1.b bVar3 = null;
                ManageFamilyActivity manageFamilyActivity = this.f159155b;
                switch (i15) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            PrivacyType.Companion companion = PrivacyType.INSTANCE;
                            Intent intent = aVar.f67586b;
                            PrivacyType privacyTypeB = PrivacyType.Companion.b(companion, intent != null ? intent.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa = manageFamilyActivity.da();
                            f0VarDa.getClass();
                            p2 p2Var = f0VarDa.f159087f;
                            nj1.b bVar4 = ((u) r53.s.d(p2Var).f150540a.getValue()).f159157b;
                            if (bVar4 != null) {
                                nj1.a aVarB = nj1.a.b(bVar4.getCategoryDetails());
                                List listB1 = p13.h0.b1(bVar4.d());
                                listB1.getClass();
                                bVar = new nj1.b(aVarB, listB1);
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.f(privacyTypeB);
                            }
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, u.b((u) p2Var.getValue(), bVar, null, null, null, false, null, false, false, false, null, null, 8189)));
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                            Intent intent2 = aVar3.f67586b;
                            PrivacyType privacyTypeB2 = PrivacyType.Companion.b(companion2, intent2 != null ? intent2.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa2 = manageFamilyActivity.da();
                            f0VarDa2.getClass();
                            p2 p2Var2 = f0VarDa2.f159087f;
                            nj1.b bVar5 = ((u) r53.s.d(p2Var2).f150540a.getValue()).f159158c;
                            if (bVar5 != null) {
                                nj1.a aVarB2 = nj1.a.b(bVar5.getCategoryDetails());
                                List listB2 = p13.h0.b1(bVar5.d());
                                listB2.getClass();
                                bVar2 = new nj1.b(aVarB2, listB2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar2.f(privacyTypeB2);
                            }
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, u.b((u) p2Var2.getValue(), null, bVar2, null, null, false, null, false, false, false, null, null, 8187)));
                            return;
                        }
                        return;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1) {
                            PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                            Intent intent3 = aVar5.f67586b;
                            PrivacyType privacyTypeB3 = PrivacyType.Companion.b(companion3, intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null);
                            p2 p2Var3 = manageFamilyActivity.da().f159087f;
                            do {
                                value3 = p2Var3.getValue();
                            } while (!p2Var3.b(value3, u.b((u) p2Var3.getValue(), null, null, privacyTypeB3, null, false, null, false, false, false, null, null, 8183)));
                            return;
                        }
                        return;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent4 = aVar7.f67586b;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_privacy_type");
                                    parcelable = (nj1.b) (parcelableExtra instanceof nj1.b ? parcelableExtra : null);
                                }
                                bVar3 = (nj1.b) parcelable;
                            }
                            nj1.b bVar6 = bVar3;
                            if (bVar6 != null) {
                                f0 f0VarDa3 = manageFamilyActivity.da();
                                f0VarDa3.getClass();
                                p2 p2Var4 = f0VarDa3.f159087f;
                                do {
                                    value4 = p2Var4.getValue();
                                } while (!p2Var4.b(value4, u.b((u) p2Var4.getValue(), null, null, null, bVar6, false, null, false, false, false, null, null, 8175)));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar9 = (f.a) obj;
                        ManageFamilyActivity.a aVar10 = ManageFamilyActivity.f35178j;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            z14 = intent5.getBooleanExtra("GCM_extra_privacy_policy_declined", false);
                        }
                        ue0.l lVar = ((u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159156a;
                        Long userId = lVar != null ? lVar.getUserId() : null;
                        int i16 = aVar9.f67585a;
                        if (i16 == 0 && z14) {
                            lc.m0 m0Var = manageFamilyActivity.f35182d;
                            if (m0Var == null) {
                                p005kotlin.jvm.internal.s.m("navController");
                                throw null;
                            }
                            m0Var.m();
                        } else if (i16 == -1 && userId != null && intent5 != null) {
                            boolean booleanExtra = intent5.getBooleanExtra("hasChildIncompleteConsentsKey", false);
                            f0 f0VarDa4 = manageFamilyActivity.da();
                            f0VarDa4.getClass();
                            ge1.b.T(v1.a(f0VarDa4), null, null, new n0(f0VarDa4, booleanExtra, null), 3);
                        }
                        if (userId != null) {
                            manageFamilyActivity.da().x4(userId.longValue());
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f35184f = registerForActivityResult(new g.h(), new f.b(this) { // from class: sg0.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageFamilyActivity f159155b;

            {
                this.f159155b = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                Object value;
                nj1.b bVar2;
                Object value2;
                Object value3;
                Object value4;
                Parcelable parcelable;
                boolean z14;
                int i16 = i15;
                nj1.b bVar3 = null;
                ManageFamilyActivity manageFamilyActivity = this.f159155b;
                switch (i16) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            PrivacyType.Companion companion = PrivacyType.INSTANCE;
                            Intent intent = aVar.f67586b;
                            PrivacyType privacyTypeB = PrivacyType.Companion.b(companion, intent != null ? intent.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa = manageFamilyActivity.da();
                            f0VarDa.getClass();
                            p2 p2Var = f0VarDa.f159087f;
                            nj1.b bVar4 = ((u) r53.s.d(p2Var).f150540a.getValue()).f159157b;
                            if (bVar4 != null) {
                                nj1.a aVarB = nj1.a.b(bVar4.getCategoryDetails());
                                List listB1 = p13.h0.b1(bVar4.d());
                                listB1.getClass();
                                bVar = new nj1.b(aVarB, listB1);
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.f(privacyTypeB);
                            }
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, u.b((u) p2Var.getValue(), bVar, null, null, null, false, null, false, false, false, null, null, 8189)));
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                            Intent intent2 = aVar3.f67586b;
                            PrivacyType privacyTypeB2 = PrivacyType.Companion.b(companion2, intent2 != null ? intent2.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa2 = manageFamilyActivity.da();
                            f0VarDa2.getClass();
                            p2 p2Var2 = f0VarDa2.f159087f;
                            nj1.b bVar5 = ((u) r53.s.d(p2Var2).f150540a.getValue()).f159158c;
                            if (bVar5 != null) {
                                nj1.a aVarB2 = nj1.a.b(bVar5.getCategoryDetails());
                                List listB2 = p13.h0.b1(bVar5.d());
                                listB2.getClass();
                                bVar2 = new nj1.b(aVarB2, listB2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar2.f(privacyTypeB2);
                            }
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, u.b((u) p2Var2.getValue(), null, bVar2, null, null, false, null, false, false, false, null, null, 8187)));
                            return;
                        }
                        return;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1) {
                            PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                            Intent intent3 = aVar5.f67586b;
                            PrivacyType privacyTypeB3 = PrivacyType.Companion.b(companion3, intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null);
                            p2 p2Var3 = manageFamilyActivity.da().f159087f;
                            do {
                                value3 = p2Var3.getValue();
                            } while (!p2Var3.b(value3, u.b((u) p2Var3.getValue(), null, null, privacyTypeB3, null, false, null, false, false, false, null, null, 8183)));
                            return;
                        }
                        return;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent4 = aVar7.f67586b;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_privacy_type");
                                    parcelable = (nj1.b) (parcelableExtra instanceof nj1.b ? parcelableExtra : null);
                                }
                                bVar3 = (nj1.b) parcelable;
                            }
                            nj1.b bVar6 = bVar3;
                            if (bVar6 != null) {
                                f0 f0VarDa3 = manageFamilyActivity.da();
                                f0VarDa3.getClass();
                                p2 p2Var4 = f0VarDa3.f159087f;
                                do {
                                    value4 = p2Var4.getValue();
                                } while (!p2Var4.b(value4, u.b((u) p2Var4.getValue(), null, null, null, bVar6, false, null, false, false, false, null, null, 8175)));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar9 = (f.a) obj;
                        ManageFamilyActivity.a aVar10 = ManageFamilyActivity.f35178j;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            z14 = intent5.getBooleanExtra("GCM_extra_privacy_policy_declined", false);
                        }
                        ue0.l lVar = ((u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159156a;
                        Long userId = lVar != null ? lVar.getUserId() : null;
                        int i17 = aVar9.f67585a;
                        if (i17 == 0 && z14) {
                            lc.m0 m0Var = manageFamilyActivity.f35182d;
                            if (m0Var == null) {
                                p005kotlin.jvm.internal.s.m("navController");
                                throw null;
                            }
                            m0Var.m();
                        } else if (i17 == -1 && userId != null && intent5 != null) {
                            boolean booleanExtra = intent5.getBooleanExtra("hasChildIncompleteConsentsKey", false);
                            f0 f0VarDa4 = manageFamilyActivity.da();
                            f0VarDa4.getClass();
                            ge1.b.T(v1.a(f0VarDa4), null, null, new n0(f0VarDa4, booleanExtra, null), 3);
                        }
                        if (userId != null) {
                            manageFamilyActivity.da().x4(userId.longValue());
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        this.f35185g = registerForActivityResult(new g.h(), new f.b(this) { // from class: sg0.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageFamilyActivity f159155b;

            {
                this.f159155b = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                Object value;
                nj1.b bVar2;
                Object value2;
                Object value3;
                Object value4;
                Parcelable parcelable;
                boolean z14;
                int i17 = i16;
                nj1.b bVar3 = null;
                ManageFamilyActivity manageFamilyActivity = this.f159155b;
                switch (i17) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            PrivacyType.Companion companion = PrivacyType.INSTANCE;
                            Intent intent = aVar.f67586b;
                            PrivacyType privacyTypeB = PrivacyType.Companion.b(companion, intent != null ? intent.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa = manageFamilyActivity.da();
                            f0VarDa.getClass();
                            p2 p2Var = f0VarDa.f159087f;
                            nj1.b bVar4 = ((u) r53.s.d(p2Var).f150540a.getValue()).f159157b;
                            if (bVar4 != null) {
                                nj1.a aVarB = nj1.a.b(bVar4.getCategoryDetails());
                                List listB1 = p13.h0.b1(bVar4.d());
                                listB1.getClass();
                                bVar = new nj1.b(aVarB, listB1);
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.f(privacyTypeB);
                            }
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, u.b((u) p2Var.getValue(), bVar, null, null, null, false, null, false, false, false, null, null, 8189)));
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                            Intent intent2 = aVar3.f67586b;
                            PrivacyType privacyTypeB2 = PrivacyType.Companion.b(companion2, intent2 != null ? intent2.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa2 = manageFamilyActivity.da();
                            f0VarDa2.getClass();
                            p2 p2Var2 = f0VarDa2.f159087f;
                            nj1.b bVar5 = ((u) r53.s.d(p2Var2).f150540a.getValue()).f159158c;
                            if (bVar5 != null) {
                                nj1.a aVarB2 = nj1.a.b(bVar5.getCategoryDetails());
                                List listB2 = p13.h0.b1(bVar5.d());
                                listB2.getClass();
                                bVar2 = new nj1.b(aVarB2, listB2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar2.f(privacyTypeB2);
                            }
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, u.b((u) p2Var2.getValue(), null, bVar2, null, null, false, null, false, false, false, null, null, 8187)));
                            return;
                        }
                        return;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1) {
                            PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                            Intent intent3 = aVar5.f67586b;
                            PrivacyType privacyTypeB3 = PrivacyType.Companion.b(companion3, intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null);
                            p2 p2Var3 = manageFamilyActivity.da().f159087f;
                            do {
                                value3 = p2Var3.getValue();
                            } while (!p2Var3.b(value3, u.b((u) p2Var3.getValue(), null, null, privacyTypeB3, null, false, null, false, false, false, null, null, 8183)));
                            return;
                        }
                        return;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent4 = aVar7.f67586b;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_privacy_type");
                                    parcelable = (nj1.b) (parcelableExtra instanceof nj1.b ? parcelableExtra : null);
                                }
                                bVar3 = (nj1.b) parcelable;
                            }
                            nj1.b bVar6 = bVar3;
                            if (bVar6 != null) {
                                f0 f0VarDa3 = manageFamilyActivity.da();
                                f0VarDa3.getClass();
                                p2 p2Var4 = f0VarDa3.f159087f;
                                do {
                                    value4 = p2Var4.getValue();
                                } while (!p2Var4.b(value4, u.b((u) p2Var4.getValue(), null, null, null, bVar6, false, null, false, false, false, null, null, 8175)));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar9 = (f.a) obj;
                        ManageFamilyActivity.a aVar10 = ManageFamilyActivity.f35178j;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            z14 = intent5.getBooleanExtra("GCM_extra_privacy_policy_declined", false);
                        }
                        ue0.l lVar = ((u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159156a;
                        Long userId = lVar != null ? lVar.getUserId() : null;
                        int i18 = aVar9.f67585a;
                        if (i18 == 0 && z14) {
                            lc.m0 m0Var = manageFamilyActivity.f35182d;
                            if (m0Var == null) {
                                p005kotlin.jvm.internal.s.m("navController");
                                throw null;
                            }
                            m0Var.m();
                        } else if (i18 == -1 && userId != null && intent5 != null) {
                            boolean booleanExtra = intent5.getBooleanExtra("hasChildIncompleteConsentsKey", false);
                            f0 f0VarDa4 = manageFamilyActivity.da();
                            f0VarDa4.getClass();
                            ge1.b.T(v1.a(f0VarDa4), null, null, new n0(f0VarDa4, booleanExtra, null), 3);
                        }
                        if (userId != null) {
                            manageFamilyActivity.da().x4(userId.longValue());
                            return;
                        }
                        return;
                }
            }
        });
        final int i17 = 3;
        this.f35186h = registerForActivityResult(new g.h(), new f.b(this) { // from class: sg0.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageFamilyActivity f159155b;

            {
                this.f159155b = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                Object value;
                nj1.b bVar2;
                Object value2;
                Object value3;
                Object value4;
                Parcelable parcelable;
                boolean z14;
                int i18 = i17;
                nj1.b bVar3 = null;
                ManageFamilyActivity manageFamilyActivity = this.f159155b;
                switch (i18) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            PrivacyType.Companion companion = PrivacyType.INSTANCE;
                            Intent intent = aVar.f67586b;
                            PrivacyType privacyTypeB = PrivacyType.Companion.b(companion, intent != null ? intent.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa = manageFamilyActivity.da();
                            f0VarDa.getClass();
                            p2 p2Var = f0VarDa.f159087f;
                            nj1.b bVar4 = ((u) r53.s.d(p2Var).f150540a.getValue()).f159157b;
                            if (bVar4 != null) {
                                nj1.a aVarB = nj1.a.b(bVar4.getCategoryDetails());
                                List listB1 = p13.h0.b1(bVar4.d());
                                listB1.getClass();
                                bVar = new nj1.b(aVarB, listB1);
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.f(privacyTypeB);
                            }
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, u.b((u) p2Var.getValue(), bVar, null, null, null, false, null, false, false, false, null, null, 8189)));
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                            Intent intent2 = aVar3.f67586b;
                            PrivacyType privacyTypeB2 = PrivacyType.Companion.b(companion2, intent2 != null ? intent2.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa2 = manageFamilyActivity.da();
                            f0VarDa2.getClass();
                            p2 p2Var2 = f0VarDa2.f159087f;
                            nj1.b bVar5 = ((u) r53.s.d(p2Var2).f150540a.getValue()).f159158c;
                            if (bVar5 != null) {
                                nj1.a aVarB2 = nj1.a.b(bVar5.getCategoryDetails());
                                List listB2 = p13.h0.b1(bVar5.d());
                                listB2.getClass();
                                bVar2 = new nj1.b(aVarB2, listB2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar2.f(privacyTypeB2);
                            }
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, u.b((u) p2Var2.getValue(), null, bVar2, null, null, false, null, false, false, false, null, null, 8187)));
                            return;
                        }
                        return;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1) {
                            PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                            Intent intent3 = aVar5.f67586b;
                            PrivacyType privacyTypeB3 = PrivacyType.Companion.b(companion3, intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null);
                            p2 p2Var3 = manageFamilyActivity.da().f159087f;
                            do {
                                value3 = p2Var3.getValue();
                            } while (!p2Var3.b(value3, u.b((u) p2Var3.getValue(), null, null, privacyTypeB3, null, false, null, false, false, false, null, null, 8183)));
                            return;
                        }
                        return;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent4 = aVar7.f67586b;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_privacy_type");
                                    parcelable = (nj1.b) (parcelableExtra instanceof nj1.b ? parcelableExtra : null);
                                }
                                bVar3 = (nj1.b) parcelable;
                            }
                            nj1.b bVar6 = bVar3;
                            if (bVar6 != null) {
                                f0 f0VarDa3 = manageFamilyActivity.da();
                                f0VarDa3.getClass();
                                p2 p2Var4 = f0VarDa3.f159087f;
                                do {
                                    value4 = p2Var4.getValue();
                                } while (!p2Var4.b(value4, u.b((u) p2Var4.getValue(), null, null, null, bVar6, false, null, false, false, false, null, null, 8175)));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar9 = (f.a) obj;
                        ManageFamilyActivity.a aVar10 = ManageFamilyActivity.f35178j;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            z14 = intent5.getBooleanExtra("GCM_extra_privacy_policy_declined", false);
                        }
                        ue0.l lVar = ((u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159156a;
                        Long userId = lVar != null ? lVar.getUserId() : null;
                        int i19 = aVar9.f67585a;
                        if (i19 == 0 && z14) {
                            lc.m0 m0Var = manageFamilyActivity.f35182d;
                            if (m0Var == null) {
                                p005kotlin.jvm.internal.s.m("navController");
                                throw null;
                            }
                            m0Var.m();
                        } else if (i19 == -1 && userId != null && intent5 != null) {
                            boolean booleanExtra = intent5.getBooleanExtra("hasChildIncompleteConsentsKey", false);
                            f0 f0VarDa4 = manageFamilyActivity.da();
                            f0VarDa4.getClass();
                            ge1.b.T(v1.a(f0VarDa4), null, null, new n0(f0VarDa4, booleanExtra, null), 3);
                        }
                        if (userId != null) {
                            manageFamilyActivity.da().x4(userId.longValue());
                            return;
                        }
                        return;
                }
            }
        });
        final int i18 = 4;
        this.f35187i = registerForActivityResult(new g.h(), new f.b(this) { // from class: sg0.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageFamilyActivity f159155b;

            {
                this.f159155b = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // f.b
            public final void a(Object obj) {
                nj1.b bVar;
                Object value;
                nj1.b bVar2;
                Object value2;
                Object value3;
                Object value4;
                Parcelable parcelable;
                boolean z14;
                int i19 = i18;
                nj1.b bVar3 = null;
                ManageFamilyActivity manageFamilyActivity = this.f159155b;
                switch (i19) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            PrivacyType.Companion companion = PrivacyType.INSTANCE;
                            Intent intent = aVar.f67586b;
                            PrivacyType privacyTypeB = PrivacyType.Companion.b(companion, intent != null ? intent.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa = manageFamilyActivity.da();
                            f0VarDa.getClass();
                            p2 p2Var = f0VarDa.f159087f;
                            nj1.b bVar4 = ((u) r53.s.d(p2Var).f150540a.getValue()).f159157b;
                            if (bVar4 != null) {
                                nj1.a aVarB = nj1.a.b(bVar4.getCategoryDetails());
                                List listB1 = p13.h0.b1(bVar4.d());
                                listB1.getClass();
                                bVar = new nj1.b(aVarB, listB1);
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.f(privacyTypeB);
                            }
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, u.b((u) p2Var.getValue(), bVar, null, null, null, false, null, false, false, false, null, null, 8189)));
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                            Intent intent2 = aVar3.f67586b;
                            PrivacyType privacyTypeB2 = PrivacyType.Companion.b(companion2, intent2 != null ? intent2.getStringExtra("GCM_extra_privacy_type") : null);
                            f0 f0VarDa2 = manageFamilyActivity.da();
                            f0VarDa2.getClass();
                            p2 p2Var2 = f0VarDa2.f159087f;
                            nj1.b bVar5 = ((u) r53.s.d(p2Var2).f150540a.getValue()).f159158c;
                            if (bVar5 != null) {
                                nj1.a aVarB2 = nj1.a.b(bVar5.getCategoryDetails());
                                List listB2 = p13.h0.b1(bVar5.d());
                                listB2.getClass();
                                bVar2 = new nj1.b(aVarB2, listB2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar2.f(privacyTypeB2);
                            }
                            do {
                                value2 = p2Var2.getValue();
                            } while (!p2Var2.b(value2, u.b((u) p2Var2.getValue(), null, bVar2, null, null, false, null, false, false, false, null, null, 8187)));
                            return;
                        }
                        return;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1) {
                            PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                            Intent intent3 = aVar5.f67586b;
                            PrivacyType privacyTypeB3 = PrivacyType.Companion.b(companion3, intent3 != null ? intent3.getStringExtra("GCM_extra_privacy_type") : null);
                            p2 p2Var3 = manageFamilyActivity.da().f159087f;
                            do {
                                value3 = p2Var3.getValue();
                            } while (!p2Var3.b(value3, u.b((u) p2Var3.getValue(), null, null, privacyTypeB3, null, false, null, false, false, false, null, null, 8183)));
                            return;
                        }
                        return;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent4 = aVar7.f67586b;
                            if (intent4 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_privacy_type", nj1.b.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_privacy_type");
                                    parcelable = (nj1.b) (parcelableExtra instanceof nj1.b ? parcelableExtra : null);
                                }
                                bVar3 = (nj1.b) parcelable;
                            }
                            nj1.b bVar6 = bVar3;
                            if (bVar6 != null) {
                                f0 f0VarDa3 = manageFamilyActivity.da();
                                f0VarDa3.getClass();
                                p2 p2Var4 = f0VarDa3.f159087f;
                                do {
                                    value4 = p2Var4.getValue();
                                } while (!p2Var4.b(value4, u.b((u) p2Var4.getValue(), null, null, null, bVar6, false, null, false, false, false, null, null, 8175)));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar9 = (f.a) obj;
                        ManageFamilyActivity.a aVar10 = ManageFamilyActivity.f35178j;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            z14 = intent5.getBooleanExtra("GCM_extra_privacy_policy_declined", false);
                        }
                        ue0.l lVar = ((u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159156a;
                        Long userId = lVar != null ? lVar.getUserId() : null;
                        int i110 = aVar9.f67585a;
                        if (i110 == 0 && z14) {
                            lc.m0 m0Var = manageFamilyActivity.f35182d;
                            if (m0Var == null) {
                                p005kotlin.jvm.internal.s.m("navController");
                                throw null;
                            }
                            m0Var.m();
                        } else if (i110 == -1 && userId != null && intent5 != null) {
                            boolean booleanExtra = intent5.getBooleanExtra("hasChildIncompleteConsentsKey", false);
                            f0 f0VarDa4 = manageFamilyActivity.da();
                            f0VarDa4.getClass();
                            ge1.b.T(v1.a(f0VarDa4), null, null, new n0(f0VarDa4, booleanExtra, null), 3);
                        }
                        if (userId != null) {
                            manageFamilyActivity.da().x4(userId.longValue());
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final f0 da() {
        return (f0) this.f35180b.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(1643820943, true, new r0(this, getIntent().getStringExtra("extraRequestId"), 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/managefamily/ManageFamilyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_REQUEST_ID", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
