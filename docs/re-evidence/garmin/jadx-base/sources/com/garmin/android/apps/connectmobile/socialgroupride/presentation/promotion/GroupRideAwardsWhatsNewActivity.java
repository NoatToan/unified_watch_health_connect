package com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import i3.mc;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/socialgroupride/presentation/promotion/GroupRideAwardsWhatsNewActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Lcp1/b;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideAwardsWhatsNewActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44735b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44736a = m.a(n.NONE, new e(this, null, null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$onCreate$1$1$1$1", f = "GroupRideAwardsWhatsNewActivity.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f44738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f44738b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f44738b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44737a;
            if (i14 == 0) {
                r.b(obj);
                this.f44737a = 1;
                if (this.f44738b.g(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$onCreate$1$1$2$1$1", f = "GroupRideAwardsWhatsNewActivity.kt", l = {44}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f44740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f44740b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f44740b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44739a;
            if (i14 == 0) {
                r.b(obj);
                this.f44739a = 1;
                if (this.f44740b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$onCreate$1$1$3$1", f = "GroupRideAwardsWhatsNewActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<cp1.b> f44742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<cp1.b> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f44742b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return GroupRideAwardsWhatsNewActivity.this.new c(this.f44742b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = GroupRideAwardsWhatsNewActivity.f44735b;
            boolean z14 = this.f44742b.getF182175a().f54898a;
            GroupRideAwardsWhatsNewActivity groupRideAwardsWhatsNewActivity = GroupRideAwardsWhatsNewActivity.this;
            if (z14) {
                groupRideAwardsWhatsNewActivity.showProgressOverlay();
            } else {
                groupRideAwardsWhatsNewActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$onCreate$1$1$4$1", f = "GroupRideAwardsWhatsNewActivity.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44743a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GroupRideAwardsWhatsNewActivity f44745a;

            public a(GroupRideAwardsWhatsNewActivity groupRideAwardsWhatsNewActivity) {
                this.f44745a = groupRideAwardsWhatsNewActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                if (!s.g((com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.a) obj, com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.a.C0850a.f44750a)) {
                    u0.r();
                    return null;
                }
                int i14 = GroupRideAwardsWhatsNewActivity.f44735b;
                GroupRideAwardsWhatsNewActivity groupRideAwardsWhatsNewActivity = this.f44745a;
                groupRideAwardsWhatsNewActivity.displayFailedMessage();
                groupRideAwardsWhatsNewActivity.finish();
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return GroupRideAwardsWhatsNewActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$d for r5v1 'this'  t13.d
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
                int r1 = r5.f44743a
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
                int r6 = com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity.f44735b
                com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity r6 = com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity.this
                java.lang.Object r1 = r6.f44736a
                java.lang.Object r1 = r1.getValue()
                com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b r1 = (com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b) r1
                r53.a2 r1 = r1.f44754d
                com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$d$a r4 = new com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity$d$a
                r4.<init>(r6)
                r5.f44743a = r3
                r53.d2<T> r6 = r1.f150526a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44749d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44746a = gVar;
            this.f44747b = qualifier;
            this.f44748c = aVar;
            this.f44749d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f44746a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f44748c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.b.class), f189591b, null, defaultViewModelCreationExtras, this.f44747b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44749d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1287902986, true, new cp1.c(this, 0)));
    }
}
