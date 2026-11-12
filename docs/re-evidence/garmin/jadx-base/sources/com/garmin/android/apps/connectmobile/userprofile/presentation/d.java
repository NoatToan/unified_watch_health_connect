package com.garmin.android.apps.connectmobile.userprofile.presentation;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.presentation.d.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m12.m;
import m12.n;
import m12.o;
import m12.q;
import m12.s;
import m12.v;
import m12.y;
import o13.r;
import o13.t;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/d;", "Landroidx/lifecycle/u1;", "Loo1/b;", "getUserProfileImageDataUseCase", "Lm12/n;", "getProfileItemsUseCase", "Lm12/d;", "fetchProfileDataUseCase", "Lm12/m;", "getLoginTokenUseCase", "Lm12/v;", "saveProfileChangesUseCase", "Lm12/y;", "updateProfileItemUseCase", "Lm12/o;", "getProfileNavigationUseCase", "Lm12/a;", "checkGraduationEligibilityUseCase", "Lf12/b;", "gcmUserAccount", "<init>", "(Loo1/b;Lm12/n;Lm12/d;Lm12/m;Lm12/v;Lm12/y;Lm12/o;Lm12/a;Lf12/b;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {
    public final b2 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oo1.b f47017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f47018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m12.d f47019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f47020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f47021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f47022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f47023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m12.a f47024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f47026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f47027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f47028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f47029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f47030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f47031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f47032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e2 f47033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f47034r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47035t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f47036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f47037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f47038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f47039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f47040z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lm12/q;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$profileData$1", f = "EditProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super q>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super q> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            d dVar = d.this;
            dVar.getClass();
            ge1.b.T(v1.a(dVar), null, null, new o12.f(dVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<List<? extends s>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f47042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f47043b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f47044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f47045b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.d$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$profileItems_delegate$lambda$0$$inlined$map$1$2", f = "EditProfileViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0907a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f47046a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f47047b;

                public C0907a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f47046a = obj;
                    this.f47047b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, d dVar) {
                this.f47044a = jVar;
                this.f47045b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0907a c0907a;
                if (dVar instanceof C0907a) {
                    c0907a = (C0907a) dVar;
                    int i14 = c0907a.f47047b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0907a.f47047b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0907a = new C0907a(dVar);
                    }
                } else {
                    c0907a = new C0907a(dVar);
                }
                Object obj2 = c0907a.f47046a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0907a.f47047b;
                if (i15 == 0) {
                    r.b(obj2);
                    q qVar = (q) obj;
                    n nVar = this.f47045b.f47018b;
                    nVar.getClass();
                    List listK = x.k(m12.t.T0, m12.t.U0, m12.t.V0, m12.t.W0);
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listK.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(nVar.a((m12.t) it.next(), qVar));
                    }
                    c0907a.f47047b = 1;
                    if (this.f47044a.emit(arrayList, c0907a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar, d dVar) {
            this.f47042a = iVar;
            this.f47043b = dVar;
        }

        @Override // r53.i
        public final Object collect(j<? super List<? extends s>> jVar, t13.d dVar) {
            Object objCollect = this.f47042a.collect(new a(jVar, this.f47043b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm12/q;", "data", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lo12/i;", "<anonymous>", "(Lm12/q;ZZ)Lo12/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$special$$inlined$createPrivacyUiState$1", f = "EditProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.r<q, Boolean, Boolean, t13.d<? super o12.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ q f47049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m12.t f47052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f47053e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m12.t tVar, t13.d dVar, d dVar2) {
            super(4, dVar);
            this.f47052d = tVar;
            this.f47053e = dVar2;
        }

        @Override // e23.r
        public final Object invoke(q qVar, Boolean bool, Boolean bool2, t13.d<? super o12.i> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            c cVar = new c(this.f47052d, dVar, this.f47053e);
            cVar.f47049a = qVar;
            cVar.f47050b = zBooleanValue;
            cVar.f47051c = zBooleanValue2;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w12.a aVar;
            q qVar = this.f47049a;
            boolean z14 = this.f47050b;
            boolean z15 = this.f47051c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            nj1.e eVar = qVar != null ? qVar.f115857c : null;
            if (eVar != null) {
                this.f47053e.f47023g.getClass();
                aVar = new w12.a(Integer.valueOf(R.string.profile_privacy_steps_description), m12.t.f115875p, eVar.g(), (List) null, (List) null, 24, (p005kotlin.jvm.internal.j) null);
            } else {
                aVar = new w12.a((Integer) null, this.f47052d, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null);
            }
            return new o12.i(z15, z14, aVar);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm12/q;", "data", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lo12/i;", "<anonymous>", "(Lm12/q;ZZ)Lo12/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$special$$inlined$createPrivacyUiState$2", f = "EditProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0908d extends i implements e23.r<q, Boolean, Boolean, t13.d<? super o12.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ q f47054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m12.t f47057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f47058e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0908d(m12.t tVar, t13.d dVar, d dVar2) {
            super(4, dVar);
            this.f47057d = tVar;
            this.f47058e = dVar2;
        }

        @Override // e23.r
        public final Object invoke(q qVar, Boolean bool, Boolean bool2, t13.d<? super o12.i> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            C0908d c0908d = new C0908d(this.f47057d, dVar, this.f47058e);
            c0908d.f47054a = qVar;
            c0908d.f47055b = zBooleanValue;
            c0908d.f47056c = zBooleanValue2;
            return c0908d.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w12.a aVar;
            q qVar = this.f47054a;
            boolean z14 = this.f47055b;
            boolean z15 = this.f47056c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar != null ? qVar.f115856b : null;
            if (rVar != null) {
                this.f47058e.f47023g.getClass();
                m12.t tVar = m12.t.f115876q;
                PrivacyType.Companion companion = PrivacyType.INSTANCE;
                String str = rVar.d().f74886a;
                PrivacyType privacyType = PrivacyType.ONLY_ME;
                companion.getClass();
                aVar = new w12.a((Integer) null, tVar, PrivacyType.Companion.c(str, privacyType), (List) null, (List) null, 24, (p005kotlin.jvm.internal.j) null);
            } else {
                aVar = new w12.a((Integer) null, this.f47057d, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null);
            }
            return new o12.i(z15, z14, aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm12/q;", "data", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lo12/i;", "<anonymous>", "(Lm12/q;ZZ)Lo12/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$special$$inlined$createPrivacyUiState$3", f = "EditProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements e23.r<q, Boolean, Boolean, t13.d<? super o12.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ q f47059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m12.t f47062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f47063e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m12.t tVar, t13.d dVar, d dVar2) {
            super(4, dVar);
            this.f47062d = tVar;
            this.f47063e = dVar2;
        }

        @Override // e23.r
        public final Object invoke(q qVar, Boolean bool, Boolean bool2, t13.d<? super o12.i> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            e eVar = new e(this.f47062d, dVar, this.f47063e);
            eVar.f47059a = qVar;
            eVar.f47060b = zBooleanValue;
            eVar.f47061c = zBooleanValue2;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w12.a aVar;
            q qVar = this.f47059a;
            boolean z14 = this.f47060b;
            boolean z15 = this.f47061c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            nj1.e eVar = qVar != null ? qVar.f115857c : null;
            if (eVar != null) {
                this.f47063e.f47023g.getClass();
                aVar = new w12.a(Integer.valueOf(R.string.msg_implicit_consent_who_can_view_profile), m12.t.f115873n, eVar.f(), (List) null, (List) null, 24, (p005kotlin.jvm.internal.j) null);
            } else {
                aVar = new w12.a((Integer) null, this.f47062d, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null);
            }
            return new o12.i(z15, z14, aVar);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lm12/s;", FirebaseAnalytics.Param.ITEMS, "Lb12/b;", "imageData", "", "isLoading", "isError", "Lo12/d;", "<anonymous>", "(Ljava/util/List;Lb12/b;ZZ)Lo12/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$uiState$2$1", f = "EditProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements e23.s<List<? extends s>, b12.b, Boolean, Boolean, t13.d<? super o12.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f47064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b12.b f47065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f47066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f47067d;

        public f(t13.d<? super f> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(List<? extends s> list, b12.b bVar, Boolean bool, Boolean bool2, t13.d<? super o12.d> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            f fVar = d.this.new f(dVar);
            fVar.f47064a = list;
            fVar.f47065b = bVar;
            fVar.f47066c = zBooleanValue;
            fVar.f47067d = zBooleanValue2;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int iU;
            List list = this.f47064a;
            b12.b bVar = this.f47065b;
            boolean z14 = this.f47066c;
            boolean z15 = this.f47067d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            m12.a aVar2 = d.this.f47024h;
            boolean z16 = false;
            if (!aVar2.f115789c.invoke().booleanValue()) {
                s3.f23252a.getClass();
                if (s3.a("ROLE_MBTESTER")) {
                    if (s3.b() && (iU = aVar2.f115788b.u()) >= 0 && aVar2.f115787a.b() <= iU && iU < 18) {
                        z16 = true;
                    }
                }
            } else if (s3.b()) {
                z16 = true;
            }
            return new o12.d(z15, z14, bVar, list, z16);
        }
    }

    public d(oo1.b bVar, n nVar, m12.d dVar, m mVar, v vVar, y yVar, o oVar, m12.a aVar, f12.b bVar2) {
        bVar.getClass();
        nVar.getClass();
        dVar.getClass();
        mVar.getClass();
        vVar.getClass();
        yVar.getClass();
        oVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        this.f47017a = bVar;
        this.f47018b = nVar;
        this.f47019c = dVar;
        this.f47020d = mVar;
        this.f47021e = vVar;
        this.f47022f = yVar;
        this.f47023g = oVar;
        this.f47024h = aVar;
        this.f47025i = bVar2.getUserDisplayName();
        this.f47026j = s3.b();
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f47028l = p2VarA;
        p2 p2VarA2 = q2.a(bool);
        this.f47029m = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f47031o = p2VarA3;
        r53.v vVar2 = new r53.v(new a(null), p2VarA3);
        w9.a aVarA = v1.a(this);
        k2.a aVar2 = k2.f150703a;
        aVar2.getClass();
        b2 b2VarK = r53.s.K(vVar2, aVarA, k2.a.f150705b, null);
        this.f47032p = b2VarK;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f47033q = e2VarB;
        this.f47034r = r53.s.c(e2VarB);
        final int i14 = 0;
        this.f47036v = o13.m.b(new e23.a(this) { // from class: o12.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128546b;

            {
                this.f128546b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar2 = this.f128546b;
                switch (i15) {
                    case 0:
                        p2 p2VarA4 = dVar2.f47017a.a(k.PREMIUM_FRIEND);
                        x53.c cVar = s0.f129406a;
                        r53.i iVarA = r53.s.A(p2VarA4, x53.b.f189152a);
                        w9.a aVarA2 = v1.a(dVar2);
                        k2.f150703a.getClass();
                        return r53.s.K(iVarA, aVarA2, k2.a.f150705b, b12.b.f14386g);
                    case 1:
                        return new com.garmin.android.apps.connectmobile.userprofile.presentation.d.b(dVar2.f47032p, dVar2);
                    default:
                        return r53.s.K(r53.s.m((r53.i) dVar2.f47037w.getValue(), (r53.i) dVar2.f47036v.getValue(), dVar2.f47028l, dVar2.f47029m, dVar2.new f(null)), v1.a(dVar2), k2.a.a(k2.f150703a, 2), new d(false, true, null, null, false, 29, null));
                }
            }
        });
        final int i15 = 1;
        this.f47037w = o13.m.b(new e23.a(this) { // from class: o12.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128546b;

            {
                this.f128546b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar2 = this.f128546b;
                switch (i16) {
                    case 0:
                        p2 p2VarA4 = dVar2.f47017a.a(k.PREMIUM_FRIEND);
                        x53.c cVar = s0.f129406a;
                        r53.i iVarA = r53.s.A(p2VarA4, x53.b.f189152a);
                        w9.a aVarA2 = v1.a(dVar2);
                        k2.f150703a.getClass();
                        return r53.s.K(iVarA, aVarA2, k2.a.f150705b, b12.b.f14386g);
                    case 1:
                        return new com.garmin.android.apps.connectmobile.userprofile.presentation.d.b(dVar2.f47032p, dVar2);
                    default:
                        return r53.s.K(r53.s.m((r53.i) dVar2.f47037w.getValue(), (r53.i) dVar2.f47036v.getValue(), dVar2.f47028l, dVar2.f47029m, dVar2.new f(null)), v1.a(dVar2), k2.a.a(k2.f150703a, 2), new d(false, true, null, null, false, 29, null));
                }
            }
        });
        final int i16 = 2;
        this.f47038x = o13.m.b(new e23.a(this) { // from class: o12.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128546b;

            {
                this.f128546b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar2 = this.f128546b;
                switch (i17) {
                    case 0:
                        p2 p2VarA4 = dVar2.f47017a.a(k.PREMIUM_FRIEND);
                        x53.c cVar = s0.f129406a;
                        r53.i iVarA = r53.s.A(p2VarA4, x53.b.f189152a);
                        w9.a aVarA2 = v1.a(dVar2);
                        k2.f150703a.getClass();
                        return r53.s.K(iVarA, aVarA2, k2.a.f150705b, b12.b.f14386g);
                    case 1:
                        return new com.garmin.android.apps.connectmobile.userprofile.presentation.d.b(dVar2.f47032p, dVar2);
                    default:
                        return r53.s.K(r53.s.m((r53.i) dVar2.f47037w.getValue(), (r53.i) dVar2.f47036v.getValue(), dVar2.f47028l, dVar2.f47029m, dVar2.new f(null)), v1.a(dVar2), k2.a.a(k2.f150703a, 2), new d(false, true, null, null, false, 29, null));
                }
            }
        });
        m12.t tVar = m12.t.f115875p;
        this.f47039y = r53.s.K(r53.s.l(b2VarK, p2VarA, p2VarA2, new c(tVar, null, this)), v1.a(this), k2.a.a(aVar2, 2), new o12.i(false, true, new w12.a((Integer) null, tVar, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null), 1, null));
        m12.t tVar2 = m12.t.f115876q;
        this.f47040z = r53.s.K(r53.s.l(b2VarK, p2VarA, p2VarA2, new C0908d(tVar2, null, this)), v1.a(this), k2.a.a(aVar2, 2), new o12.i(false, true, new w12.a((Integer) null, tVar2, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null), 1, null));
        m12.t tVar3 = m12.t.f115873n;
        this.A = r53.s.K(r53.s.l(b2VarK, p2VarA, p2VarA2, new e(tVar3, null, this)), v1.a(this), k2.a.a(aVar2, 2), new o12.i(false, true, new w12.a((Integer) null, tVar3, (PrivacyType) null, (List) null, (List) null, 29, (p005kotlin.jvm.internal.j) null), 1, null));
    }

    public final void x4(com.garmin.android.apps.connectmobile.userprofile.presentation.f fVar) {
        Object value;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVarB;
        Object value2;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVarB2;
        Object value3;
        fVar.getClass();
        boolean z14 = fVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.f.d;
        p2 p2Var = this.f47031o;
        y yVar = this.f47022f;
        b2 b2Var = this.f47032p;
        q qVarA = null;
        if (z14) {
            com.garmin.android.apps.connectmobile.userprofile.presentation.f.d dVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.f.d) fVar;
            m12.t tVar = dVar.f47077b;
            String str = dVar.f47078c;
            q qVar = (q) b2Var.f150540a.getValue();
            if (qVar == null) {
                return;
            }
            yVar.getClass();
            tVar.getClass();
            str.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar.f115856b;
            if (rVar != null) {
                int i14 = y.a.f115913a[tVar.ordinal()];
                if (i14 == 1) {
                    rVarB2 = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar, str, null, null, null, null, null, null, null, null, null, null, null, null, 2097147);
                } else if (i14 == 2) {
                    rVarB2 = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar, null, str, null, null, null, null, null, null, null, null, null, null, null, 2097143);
                }
                qVarA = q.a(qVar, rVarB2, null, false, 13);
            }
            q qVar2 = qVarA;
            if (qVar2 == null) {
                return;
            }
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, qVar2));
            return;
        }
        if (fVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.f.c) {
            com.garmin.android.apps.connectmobile.userprofile.presentation.f.c cVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.f.c) fVar;
            m12.t tVar2 = cVar.f47075b;
            boolean z15 = cVar.f47076c;
            q qVar3 = (q) b2Var.f150540a.getValue();
            if (qVar3 == null) {
                return;
            }
            yVar.getClass();
            tVar2.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = qVar3.f115856b;
            if (rVar2 != null) {
                switch (y.a.f115913a[tVar2.ordinal()]) {
                    case 3:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, null, null, 2088959);
                        break;
                    case 4:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, null, null, null, 2093055);
                        break;
                    case 5:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, null, null, null, null, 2095103);
                        break;
                    case 6:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, Boolean.valueOf(z15), null, null, null, null, null, null, null, null, null, 2096127);
                        break;
                    case 7:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, null, 2080767);
                        break;
                    case 8:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, 2064383);
                        break;
                    case 9:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, 1966079);
                        break;
                    case 10:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, 2031615);
                        break;
                    case 11:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z15), 1572863);
                        break;
                    case 12:
                        rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(rVar2, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z15), null, 1835007);
                        break;
                }
                qVarA = q.a(qVar3, rVarB, null, false, 13);
            }
            q qVar4 = qVarA;
            if (qVar4 == null) {
                return;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, qVar4));
            return;
        }
        if (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.f.b)) {
            if (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.presentation.f.a)) {
                u0.r();
                return;
            } else {
                ge1.b.T(v1.a(this), null, null, new com.garmin.android.apps.connectmobile.userprofile.presentation.c(this, ((com.garmin.android.apps.connectmobile.userprofile.presentation.f.a) fVar).f47072b, null), 3);
                return;
            }
        }
        com.garmin.android.apps.connectmobile.userprofile.presentation.f.b bVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.f.b) fVar;
        m12.t tVar3 = bVar.f47073b;
        PrivacyType privacyType = bVar.f47074c;
        q qVar5 = (q) b2Var.f150540a.getValue();
        if (qVar5 == null) {
            return;
        }
        yVar.getClass();
        nj1.e eVar = qVar5.f115857c;
        tVar3.getClass();
        privacyType.getClass();
        switch (y.a.f115913a[tVar3.ordinal()]) {
            case 13:
                if (eVar != null) {
                    m12.b.f115791a.getClass();
                    nj1.e eVarA = m12.b.a(eVar);
                    if (eVarA != null) {
                        eVarA.i(privacyType);
                        qVarA = q.a(qVar5, null, eVarA, false, 11);
                    }
                }
                break;
            case 14:
                if (eVar != null) {
                    m12.b.f115791a.getClass();
                    nj1.e eVarA2 = m12.b.a(eVar);
                    if (eVarA2 != null) {
                        eVarA2.j(privacyType);
                        qVarA = q.a(qVar5, null, eVarA2, false, 11);
                    }
                }
                break;
            case 15:
                com.garmin.android.apps.connectmobile.userprofile.model.r rVar3 = qVar5.f115856b;
                if (rVar3 != null) {
                    m12.b.f115791a.getClass();
                    Gson gson = m12.b.f115792b;
                    com.garmin.android.apps.connectmobile.userprofile.model.r rVar4 = (com.garmin.android.apps.connectmobile.userprofile.model.r) gson.fromJson(gson.toJson(rVar3, com.garmin.android.apps.connectmobile.userprofile.model.r.class), com.garmin.android.apps.connectmobile.userprofile.model.r.class);
                    if (rVar4 != null) {
                        rVar4.z(PrivacyType.Companion.b(PrivacyType.INSTANCE, privacyType.getCategoryAccessRule()).getBadgesCategoryAccessRule());
                        qVarA = q.a(qVar5, rVar4, null, false, 13);
                    }
                }
                break;
        }
        q qVar6 = qVarA;
        if (qVar6 == null) {
            return;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, qVar6));
    }
}
