package xe2;

import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.google.android.play.agesignals.AgeSignalsResult;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$evaluatePlayStoreAgeSignals$1", f = "AuthenticationActivity.kt", l = {1101, 1104, 1110}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ue2.e f190473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190475c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$evaluatePlayStoreAgeSignals$1$1$1", f = "AuthenticationActivity.kt", l = {1119}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f190476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ue2.e f190477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AgeSignalsResult f190478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AuthenticationActivity f190479d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ue2.e eVar, AgeSignalsResult ageSignalsResult, AuthenticationActivity authenticationActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f190477b = eVar;
            this.f190478c = ageSignalsResult;
            this.f190479d = authenticationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f190477b, this.f190478c, this.f190479d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Set<ve2.e> set;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190476a;
            AuthenticationActivity authenticationActivity = this.f190479d;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f190477b.getClass();
                AgeSignalsResult ageSignalsResult = this.f190478c;
                ageSignalsResult.getClass();
                Integer numAgeUpper = ageSignalsResult.ageUpper();
                if (numAgeUpper == null || numAgeUpper.intValue() >= 8) {
                    Integer numAgeUpper2 = ageSignalsResult.ageUpper();
                    if (numAgeUpper2 == null || numAgeUpper2.intValue() >= 13) {
                        AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
                        authenticationActivity.Z9().debug("evaluatePlayStoreAgeSignals: user is 13+ years old");
                        authenticationActivity.ba(false, false);
                    } else {
                        re2.b bVar = re2.b.f152215a;
                        this.f190476a = 1;
                        bVar.getClass();
                        obj = re2.b.q(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    AuthenticationActivity.a aVar3 = AuthenticationActivity.f50343v;
                    authenticationActivity.Z9().debug("evaluatePlayStoreAgeSignals: user is younger than 8");
                    authenticationActivity.aa(ue2.a.APP_DOES_NOT_SUPPORT_AGE_RANGE);
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ve2.e eVar = (ve2.e) obj;
            re2.b.f152215a.getClass();
            ve2.l lVarM = re2.b.m();
            lVarM.getClass();
            eVar.getClass();
            we2.g gVar = lVarM.f177763d;
            if ((gVar == null || (set = gVar.f184856a) == null) ? false : set.contains(eVar)) {
                AuthenticationActivity.a aVar4 = AuthenticationActivity.f50343v;
                authenticationActivity.Z9().debug("evaluatePlayStoreAgeSignals: user is younger than 13, app allows child accounts");
                authenticationActivity.ba(false, true);
            } else {
                AuthenticationActivity.a aVar5 = AuthenticationActivity.f50343v;
                authenticationActivity.Z9().debug("evaluatePlayStoreAgeSignals: user is younger than 13, app does NOT allow child accounts");
                authenticationActivity.aa(ue2.a.APP_DOES_NOT_SUPPORT_AGE_RANGE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AuthenticationActivity authenticationActivity, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f190475c = authenticationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f190475c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (ge1.b.e0(r5, r6, r8) == r0) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ue2.e eVar;
        Object objD;
        Throwable thB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190474b;
        AuthenticationActivity authenticationActivity = this.f190475c;
        if (i14 == 0) {
            o13.r.b(obj);
            ue2.e eVar2 = new ue2.e();
            this.f190473a = eVar2;
            this.f190474b = 1;
            Object objW9 = AuthenticationActivity.W9(authenticationActivity, eVar2, this);
            if (objW9 != aVar) {
                eVar = eVar2;
                obj = objW9;
            }
            return aVar;
        }
        if (i14 == 1) {
            eVar = this.f190473a;
            o13.r.b(obj);
        } else if (i14 == 2) {
            eVar = this.f190473a;
            o13.r.b(obj);
            objD = ((o13.q) obj).f128597a;
            thB = o13.q.b(objD);
            if (thB == null) {
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(eVar, (AgeSignalsResult) objD, authenticationActivity, null);
                this.f190473a = null;
                this.f190474b = 3;
            } else if (thB instanceof ue2.b) {
                ue2.a aVar3 = ((ue2.b) thB).f170260a;
                AuthenticationActivity.a aVar4 = AuthenticationActivity.f50343v;
                authenticationActivity.aa(aVar3);
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (((Boolean) obj).booleanValue()) {
            this.f190473a = eVar;
            this.f190474b = 2;
            objD = eVar.d(this);
            if (objD != aVar) {
                thB = o13.q.b(objD);
                if (thB == null) {
                    x53.c cVar2 = o53.s0.f129406a;
                    x53.b bVar2 = x53.b.f189152a;
                    a aVar5 = new a(eVar, (AgeSignalsResult) objD, authenticationActivity, null);
                    this.f190473a = null;
                    this.f190474b = 3;
                } else if (thB instanceof ue2.b) {
                    ue2.a aVar6 = ((ue2.b) thB).f170260a;
                    AuthenticationActivity.a aVar7 = AuthenticationActivity.f50343v;
                    authenticationActivity.aa(aVar6);
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
