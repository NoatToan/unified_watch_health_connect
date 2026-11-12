package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.a0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.p;
import e23.q;
import f12.u;
import java.io.Serializable;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;
import r53.q2;
import ue0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$a;", "inviteData", "Lre0/h;", "mAccountSharingService", "Lte0/e;", "generateAuthorizedUri", "Lc22/a0;", "mDispatchProvider", "Lte0/d;", "fetchViewableAccountsUseCase", "<init>", "(Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$a;Lre0/h;Lte0/e;Lc22/a0;Lte0/d;)V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.h f35036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.e f35037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f35038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te0.d f35039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f35040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f35041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f35042h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$b;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$a;", "mInitialState", "Lhl/a;", "screenAccessRole", "<init>", "(Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$a;Lhl/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f35051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hl.a f35052b;

        public b(a aVar, hl.a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            this.f35051a = aVar;
            this.f35052b = aVar2;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (!cls.isAssignableFrom(d.class)) {
                vb.h.z("UnKnown ViewModel class");
                return null;
            }
            re0.h.f152133t0.getClass();
            return new d(this.f35051a, re0.h.a.a(this.f35052b), null, null, null, 28, null);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f35054b;

        static {
            int[] iArr = new int[ue0.c.values().length];
            try {
                iArr[ue0.c.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.c.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35053a = iArr;
            int[] iArr2 = new int[AuthorizedViewerDetailActivity.b.values().length];
            try {
                iArr2[AuthorizedViewerDetailActivity.b.ViewableAccount.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AuthorizedViewerDetailActivity.b.ManagedAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AuthorizedViewerDetailActivity.b.ViewerOfThisAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AuthorizedViewerDetailActivity.b.ManagedByThisAccount.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f35054b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailViewModel$revokeAccountAccess$1$1", f = "AuthorizedViewerDetailViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
    public static final class C0600d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35055a;

        public C0600d(t13.d<? super C0600d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C0600d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0600d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            if (r9.a(r8) == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35055a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                re0.h hVar = dVar.f35036b;
                long jLongValue = dVar.f35035a.f35043a.longValue();
                this.f35055a = 1;
                obj = hVar.c(jLongValue, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            dVar.f35041g.k(null, fw.m.a.g(fw.m.f73767e, null, 3));
            return Unit.INSTANCE;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                te0.d dVar2 = dVar.f35039e;
                this.f35055a = 2;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                dVar.f35041g.k(null, fw.m.a.d(fw.m.f73767e, ((v2.a) v2Var).f47383a));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f35057a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<fw.m<? extends Object>[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f35058a;

            public a(r53.i[] iVarArr) {
                this.f35058a = iVarArr;
            }

            @Override // e23.a
            public final fw.m<? extends Object>[] invoke() {
                return new fw.m[this.f35058a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailViewModel$special$$inlined$combine$1$3", f = "AuthorizedViewerDetailViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements q<r53.j<? super Boolean>, fw.m<? extends Object>[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f35059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f35060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f35061c;

            public b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super Boolean> jVar, fw.m<? extends Object>[] mVarArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f35060b = jVar;
                bVar.f35061c = mVarArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f35059a;
                if (i14 == 0) {
                    r.b(obj);
                    r53.j jVar = this.f35060b;
                    fw.m[] mVarArr = (fw.m[]) this.f35061c;
                    int length = mVarArr.length;
                    boolean z14 = false;
                    for (int i15 = 0; i15 < length; i15++) {
                        fw.m mVar = mVarArr[i15];
                        if ((mVar != null ? mVar.f73769b : null) == fw.p.LOADING) {
                            z14 = true;
                            break;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    this.f35060b = null;
                    this.f35061c = null;
                    this.f35059a = 1;
                    if (jVar.emit(boolValueOf, this) == aVar) {
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

        public e(r53.i[] iVarArr) {
            this.f35057a = iVarArr;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f35057a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(a aVar, re0.h hVar, te0.e eVar, a0 a0Var, te0.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, hVar, (i14 & 4) != 0 ? (te0.e) KoinJavaComponent.get$default(te0.e.class, null, null, 6, null) : eVar, (i14 & 8) != 0 ? new a0(null, null, null, 7, null) : a0Var, (i14 & 16) != 0 ? (te0.d) KoinJavaComponent.get$default(te0.d.class, null, null, 6, null) : dVar);
    }

    public final void x4() {
        if (this.f35035a.f35043a != null) {
            this.f35041g.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), this.f35038d.f22991c, null, new C0600d(null), 2);
        }
    }

    public d(a aVar, re0.h hVar, te0.e eVar, a0 a0Var, te0.d dVar) {
        aVar.getClass();
        hVar.getClass();
        eVar.getClass();
        a0Var.getClass();
        dVar.getClass();
        this.f35035a = aVar;
        this.f35036b = hVar;
        this.f35037c = eVar;
        this.f35038d = a0Var;
        this.f35039e = dVar;
        p2 p2VarA = q2.a(null);
        this.f35040f = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f35041g = p2VarA2;
        this.f35042h = new e(new r53.i[]{p2VarA, p2VarA2});
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/d$a;", "Ljava/io/Serializable;", "", "inviteId", "userId", "Lue0/c;", "authorizedViewerStatus", "", "name", FirebaseAnalytics.Param.LOCATION, "Lorg/joda/time/DateTime;", "inviteDate", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewerDetailActivity$b;", "viewMode", "Lb12/b;", "userProfileImageData", "<init>", "(Ljava/lang/Long;JLue0/c;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewerDetailActivity$b;Lb12/b;)V", "Lue0/d;", "invite", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "simplePublicSocialProfileDTO", "(Lue0/d;Lcom/garmin/android/apps/connectmobile/userprofile/model/l;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f35043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ue0.c f35045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f35046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f35047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final DateTime f35048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AuthorizedViewerDetailActivity.b f35049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b12.b f35050h;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(ue0.d dVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
            Long l14;
            AuthorizedViewerDetailActivity.b bVar;
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
            dVar.getClass();
            boolean z14 = dVar instanceof ue0.l;
            String str = null;
            if (z14) {
                l14 = null;
            } else {
                Long inviteId = dVar.getInviteId();
                if (inviteId == null) {
                    vb.h.z("Invite ID cannot be null");
                    throw null;
                }
                l14 = inviteId;
            }
            Long userId = dVar.getUserId();
            if (userId == null) {
                vb.h.z("User ID cannot be null");
                throw null;
            }
            long jLongValue = userId.longValue();
            ue0.c status = dVar.getStatus();
            if (status == null) {
                vb.h.z("Invite status cannot be null");
                throw null;
            }
            String name = dVar.getName();
            String location = dVar.getLocation();
            DateTime acceptedDate = dVar.getAcceptedDate();
            DateTime inviteDate = acceptedDate == null ? dVar.getInviteDate() : acceptedDate;
            if (dVar instanceof ue0.j) {
                bVar = AuthorizedViewerDetailActivity.b.ViewerOfThisAccount;
            } else if (dVar instanceof n) {
                bVar = AuthorizedViewerDetailActivity.b.ViewableAccount;
            } else {
                if (!z14) {
                    vb.h.z("Invalid AccountInviteRepresentable");
                    throw null;
                }
                bVar = ((ue0.l) dVar).getMemberRole() == ue0.m.CHILD ? AuthorizedViewerDetailActivity.b.ManagedAccount : AuthorizedViewerDetailActivity.b.ManagedByThisAccount;
            }
            AuthorizedViewerDetailActivity.b bVar2 = bVar;
            if (lVar != null && (profileImageUrls = lVar.getProfileImageUrls()) != null) {
                str = profileImageUrls.f46878g;
            }
            String str2 = str;
            Long userLevel = dVar.getUserLevel();
            this(l14, jLongValue, status, name, location, inviteDate, bVar2, new b12.b(str2, null, u.a(userLevel != null ? (int) userLevel.longValue() : 0), null, null, 26, null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f35043a, aVar.f35043a) && this.f35044b == aVar.f35044b && this.f35045c == aVar.f35045c && s.g(this.f35046d, aVar.f35046d) && s.g(this.f35047e, aVar.f35047e) && s.g(this.f35048f, aVar.f35048f) && this.f35049g == aVar.f35049g && s.g(this.f35050h, aVar.f35050h);
        }

        public final int hashCode() {
            Long l14 = this.f35043a;
            int iHashCode = (this.f35045c.hashCode() + q6.f.e((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f35044b)) * 31;
            String str = this.f35046d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35047e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DateTime dateTime = this.f35048f;
            return this.f35050h.hashCode() + ((this.f35049g.hashCode() + ((iHashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "AuthorizedViewerDetailModel(inviteId=" + this.f35043a + ", userId=" + this.f35044b + ", authorizedViewerStatus=" + this.f35045c + ", name=" + this.f35046d + ", location=" + this.f35047e + ", inviteDate=" + this.f35048f + ", viewMode=" + this.f35049g + ", userProfileImageData=" + this.f35050h + ")";
        }

        public a(Long l14, long j8, ue0.c cVar, String str, String str2, DateTime dateTime, AuthorizedViewerDetailActivity.b bVar, b12.b bVar2) {
            cVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f35043a = l14;
            this.f35044b = j8;
            this.f35045c = cVar;
            this.f35046d = str;
            this.f35047e = str2;
            this.f35048f = dateTime;
            this.f35049g = bVar;
            this.f35050h = bVar2;
        }
    }
}
