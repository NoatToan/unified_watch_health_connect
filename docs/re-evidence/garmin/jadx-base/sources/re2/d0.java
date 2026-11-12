package re2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.lib.networking.authentication.diapi.DI2RevokeAccessAndRefreshTokensWorker;
import com.garmin.android.lib.networking.authentication.itapi.IT2RevokeAccessAndRefreshTokensWorker;
import o53.s0;
import o53.v1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.e2;
import te2.g2;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$signOut$2", f = "AuthenticationHelper.kt", l = {823}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152275a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$signOut$2$1", f = "AuthenticationHelper.kt", l = {824, 833, 849, 869}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ve2.d f152276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ve2.e f152277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public dd2.a f152278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f152279d;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Object> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:50:0x00fd A[Catch: Exception -> 0x0107, TRY_LEAVE, TryCatch #3 {Exception -> 0x0107, blocks: (B:47:0x00b8, B:50:0x00fd), top: B:97:0x00b8 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0103  */
        /* JADX WARN: Code duplicated, block: B:59:0x0111 A[PHI: r9
          0x0111: PHI (r9v5 ve2.d) = (r9v1 ve2.d), (r9v3 ve2.d), (r9v6 ve2.d) binds: [B:30:0x0062, B:46:0x00b6, B:58:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:61:0x0125  */
        /* JADX WARN: Code duplicated, block: B:63:0x0135  */
        /* JADX WARN: Code duplicated, block: B:65:0x0142  */
        /* JADX WARN: Code duplicated, block: B:67:0x015e  */
        /* JADX WARN: Code duplicated, block: B:70:0x0169  */
        /* JADX WARN: Code duplicated, block: B:73:0x0173  */
        /* JADX WARN: Code duplicated, block: B:74:0x017c  */
        /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:80:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:89:0x0233  */
        /* JADX WARN: Code duplicated, block: B:97:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x021b, code lost:
        
            if (r0.c(r3, r4, r9, r21) == r2) goto L84;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:74:0x017c, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objJ;
            ve2.d dVar;
            ve2.e eVar;
            dd2.a aVar;
            dd2.a aVar2;
            sc2.m mVar;
            ve2.d dVar2;
            Object objE0;
            b bVar;
            Context contextB;
            Logger logger;
            Account accountK;
            boolean z14;
            ve2.k kVar;
            AccountManager accountManager;
            String userData;
            String packageName;
            String strV;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152279d;
            boolean z15 = true;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar2 = b.f152215a;
                this.f152279d = 1;
                bVar2.getClass();
                objJ = b.j(this);
                if (objJ != aVar3) {
                }
                return aVar3;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objJ = obj;
            } else {
                if (i14 == 2) {
                    aVar2 = this.f152278c;
                    eVar = this.f152277b;
                    dVar = this.f152276a;
                    try {
                        o13.r.b(obj);
                    } catch (Exception e4) {
                        e = e4;
                        b.f152216b.error("signOut: scheduling ITRevokeTokensWorker", (Throwable) e);
                    }
                    aVar = aVar2;
                    mVar = aVar.f59206c;
                    if (mVar != null) {
                        try {
                            DI2RevokeAccessAndRefreshTokensWorker.a aVar4 = DI2RevokeAccessAndRefreshTokensWorker.f50061e;
                            Context contextB2 = b.f152215a.b();
                            String strD = ve2.f.d(eVar);
                            String str = (String) b.f152225k.getValue();
                            String strK = b.k();
                            sc2.l lVarB = b.m().b(eVar);
                            lVarB.getClass();
                            String str2 = mVar.f158528b;
                            String str3 = mVar.f158529c;
                            this.f152276a = dVar;
                            this.f152277b = null;
                            this.f152278c = null;
                            this.f152279d = 3;
                            aVar4.getClass();
                            objE0 = ge1.b.e0(s0.f129406a, new com.garmin.android.lib.networking.authentication.diapi.a(str2, str3, strD, str, strK, lVarB, contextB2, null), this);
                            if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                                objE0 = Unit.INSTANCE;
                            }
                            if (objE0 != aVar3) {
                                dVar2 = dVar;
                                dVar = dVar2;
                                j2 j2Var = j2.f164115a;
                                bVar = b.f152215a;
                                contextB = bVar.b();
                                j2Var.getClass();
                                logger = j2.f164116b;
                                accountK = j2.k(contextB);
                                z14 = false;
                                if (accountK != null) {
                                    accountManager = AccountManager.get(contextB);
                                    userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                                    if (userData != null) {
                                        packageName = contextB.getPackageName();
                                        packageName.getClass();
                                        if (d53.w.z(userData, packageName, false)) {
                                            String packageName2 = contextB.getPackageName();
                                            packageName2.getClass();
                                            strV = d53.u.v(userData, packageName2, "", false);
                                            com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                            if (d53.u.y(strV, ":", false)) {
                                                strV = strV.substring(1);
                                            }
                                            userData = strV;
                                            if (d53.u.p(userData, ":", false)) {
                                                userData = fb1.c.m(1, 0, userData);
                                            }
                                        }
                                    }
                                    if (TextUtils.isEmpty(userData)) {
                                        logger.debug("signOut: no other apps signed in, removing system account...");
                                        j2.j(contextB);
                                    } else {
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                                        accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                                        logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                                        z15 = false;
                                    }
                                    z14 = z15;
                                }
                                j2.f164117c.set(0L);
                                if (z14) {
                                    b.f(bVar);
                                    return Unit.INSTANCE;
                                }
                                kVar = dVar.f177697h;
                                if (kVar != null) {
                                    e2 e2Var = new e2();
                                    Context contextB3 = bVar.b();
                                    ve2.l lVarM = b.m();
                                    this.f152276a = null;
                                    this.f152277b = null;
                                    this.f152278c = null;
                                    this.f152279d = 4;
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            dVar2 = dVar;
                            b.f152216b.error("signOut: scheduling DIRevokeOAuth2TokensWorker", (Throwable) e);
                        }
                    } else {
                        j2 j2Var2 = j2.f164115a;
                        bVar = b.f152215a;
                        contextB = bVar.b();
                        j2Var2.getClass();
                        logger = j2.f164116b;
                        accountK = j2.k(contextB);
                        z14 = false;
                        if (accountK != null) {
                            accountManager = AccountManager.get(contextB);
                            userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                            if (userData != null) {
                                packageName = contextB.getPackageName();
                                packageName.getClass();
                                if (d53.w.z(userData, packageName, false)) {
                                    String packageName3 = contextB.getPackageName();
                                    packageName3.getClass();
                                    strV = d53.u.v(userData, packageName3, "", false);
                                    com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                    if (d53.u.y(strV, ":", false)) {
                                        strV = strV.substring(1);
                                    }
                                    userData = strV;
                                    if (d53.u.p(userData, ":", false)) {
                                        userData = fb1.c.m(1, 0, userData);
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(userData)) {
                                logger.debug("signOut: no other apps signed in, removing system account...");
                                j2.j(contextB);
                            } else {
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                                accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                                accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                                logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                                z15 = false;
                            }
                            z14 = z15;
                        }
                        j2.f164117c.set(0L);
                        if (z14) {
                            b.f(bVar);
                            return Unit.INSTANCE;
                        }
                        kVar = dVar.f177697h;
                        if (kVar != null) {
                            e2 e2Var2 = new e2();
                            Context contextB4 = bVar.b();
                            ve2.l lVarM2 = b.m();
                            this.f152276a = null;
                            this.f152277b = null;
                            this.f152278c = null;
                            this.f152279d = 4;
                        }
                    }
                    return aVar3;
                }
                if (i14 == 3) {
                    dVar2 = this.f152276a;
                    try {
                        o13.r.b(obj);
                    } catch (Exception e15) {
                        e = e15;
                        b.f152216b.error("signOut: scheduling DIRevokeOAuth2TokensWorker", (Throwable) e);
                    }
                    dVar = dVar2;
                    j2 j2Var3 = j2.f164115a;
                    bVar = b.f152215a;
                    contextB = bVar.b();
                    j2Var3.getClass();
                    logger = j2.f164116b;
                    accountK = j2.k(contextB);
                    z14 = false;
                    if (accountK != null) {
                        accountManager = AccountManager.get(contextB);
                        userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                        if (userData != null) {
                            packageName = contextB.getPackageName();
                            packageName.getClass();
                            if (d53.w.z(userData, packageName, false)) {
                                String packageName4 = contextB.getPackageName();
                                packageName4.getClass();
                                strV = d53.u.v(userData, packageName4, "", false);
                                com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                if (d53.u.y(strV, ":", false)) {
                                    strV = strV.substring(1);
                                }
                                userData = strV;
                                if (d53.u.p(userData, ":", false)) {
                                    userData = fb1.c.m(1, 0, userData);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(userData)) {
                            logger.debug("signOut: no other apps signed in, removing system account...");
                            j2.j(contextB);
                        } else {
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                            logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                            z15 = false;
                        }
                        z14 = z15;
                    }
                    j2.f164117c.set(0L);
                    if (z14) {
                        b.f(bVar);
                        return Unit.INSTANCE;
                    }
                    kVar = dVar.f177697h;
                    if (kVar != null && kVar.f177753a != null) {
                        e2 e2Var3 = new e2();
                        Context contextB5 = bVar.b();
                        ve2.l lVarM3 = b.m();
                        this.f152276a = null;
                        this.f152277b = null;
                        this.f152278c = null;
                        this.f152279d = 4;
                    }
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            try {
                g2.f164047a.getClass();
                return g2.b();
            } catch (Exception e16) {
                b.f152216b.error("signOut: deleting shared prefs", (Throwable) e16);
                return Unit.INSTANCE;
            }
            dVar = (ve2.d) objJ;
            if (dVar == null) {
                b.f(b.f152215a);
                return Unit.INSTANCE;
            }
            eVar = dVar.f177690a;
            aVar = dVar.f177695f;
            if (aVar == null) {
                j2 j2Var4 = j2.f164115a;
                bVar = b.f152215a;
                contextB = bVar.b();
                j2Var4.getClass();
                logger = j2.f164116b;
                accountK = j2.k(contextB);
                z14 = false;
                if (accountK != null) {
                    accountManager = AccountManager.get(contextB);
                    userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                    if (userData != null) {
                        packageName = contextB.getPackageName();
                        packageName.getClass();
                        if (d53.w.z(userData, packageName, false)) {
                            String packageName5 = contextB.getPackageName();
                            packageName5.getClass();
                            strV = d53.u.v(userData, packageName5, "", false);
                            com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                            if (d53.u.y(strV, ":", false)) {
                                strV = strV.substring(1);
                            }
                            userData = strV;
                            if (d53.u.p(userData, ":", false)) {
                                userData = fb1.c.m(1, 0, userData);
                            }
                        }
                    }
                    if (TextUtils.isEmpty(userData)) {
                        logger.debug("signOut: no other apps signed in, removing system account...");
                        j2.j(contextB);
                    } else {
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                        accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                        accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                        logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                        z15 = false;
                    }
                    z14 = z15;
                }
                j2.f164117c.set(0L);
                if (z14) {
                    b.f(bVar);
                    return Unit.INSTANCE;
                }
                kVar = dVar.f177697h;
                if (kVar != null) {
                    e2 e2Var4 = new e2();
                    Context contextB6 = bVar.b();
                    ve2.l lVarM4 = b.m();
                    this.f152276a = null;
                    this.f152277b = null;
                    this.f152278c = null;
                    this.f152279d = 4;
                }
                g2.f164047a.getClass();
                return g2.b();
            }
            sc2.o oVar = aVar.f59205b;
            if (oVar != null) {
                try {
                    IT2RevokeAccessAndRefreshTokensWorker.a aVar5 = IT2RevokeAccessAndRefreshTokensWorker.f50076e;
                    Context contextB7 = b.f152215a.b();
                    String strK2 = b.k();
                    String str4 = eVar.f177721c;
                    String str5 = oVar.f158544a;
                    String str6 = oVar.f158546c;
                    String strD2 = b.m().d();
                    this.f152276a = dVar;
                    this.f152277b = eVar;
                    this.f152278c = aVar;
                    this.f152279d = 2;
                    aVar5.getClass();
                    Object objE1 = ge1.b.e0(s0.f129406a, new com.garmin.android.lib.networking.authentication.itapi.a(str4, str5, strK2, strD2, str6, contextB7, null), this);
                    if (objE1 != aVar3) {
                        objE1 = Unit.INSTANCE;
                    }
                    if (objE1 != aVar3) {
                        aVar2 = aVar;
                        aVar = aVar2;
                        mVar = aVar.f59206c;
                        if (mVar != null) {
                            j2 j2Var5 = j2.f164115a;
                            bVar = b.f152215a;
                            contextB = bVar.b();
                            j2Var5.getClass();
                            logger = j2.f164116b;
                            accountK = j2.k(contextB);
                            z14 = false;
                            if (accountK != null) {
                                accountManager = AccountManager.get(contextB);
                                userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                                if (userData != null) {
                                    packageName = contextB.getPackageName();
                                    packageName.getClass();
                                    if (d53.w.z(userData, packageName, false)) {
                                        String packageName6 = contextB.getPackageName();
                                        packageName6.getClass();
                                        strV = d53.u.v(userData, packageName6, "", false);
                                        com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                        if (d53.u.y(strV, ":", false)) {
                                            strV = strV.substring(1);
                                        }
                                        userData = strV;
                                        if (d53.u.p(userData, ":", false)) {
                                            userData = fb1.c.m(1, 0, userData);
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(userData)) {
                                    logger.debug("signOut: no other apps signed in, removing system account...");
                                    j2.j(contextB);
                                } else {
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                                    accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                                    logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                                    z15 = false;
                                }
                                z14 = z15;
                            }
                            j2.f164117c.set(0L);
                            if (z14) {
                                b.f(bVar);
                                return Unit.INSTANCE;
                            }
                            kVar = dVar.f177697h;
                            if (kVar != null) {
                                e2 e2Var5 = new e2();
                                Context contextB8 = bVar.b();
                                ve2.l lVarM5 = b.m();
                                this.f152276a = null;
                                this.f152277b = null;
                                this.f152278c = null;
                                this.f152279d = 4;
                            }
                            g2.f164047a.getClass();
                            return g2.b();
                        }
                        DI2RevokeAccessAndRefreshTokensWorker.a aVar6 = DI2RevokeAccessAndRefreshTokensWorker.f50061e;
                        Context contextB9 = b.f152215a.b();
                        String strD3 = ve2.f.d(eVar);
                        String str7 = (String) b.f152225k.getValue();
                        String strK3 = b.k();
                        sc2.l lVarB2 = b.m().b(eVar);
                        lVarB2.getClass();
                        String str8 = mVar.f158528b;
                        String str9 = mVar.f158529c;
                        this.f152276a = dVar;
                        this.f152277b = null;
                        this.f152278c = null;
                        this.f152279d = 3;
                        aVar6.getClass();
                        objE0 = ge1.b.e0(s0.f129406a, new com.garmin.android.lib.networking.authentication.diapi.a(str8, str9, strD3, str7, strK3, lVarB2, contextB9, null), this);
                        if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                            objE0 = Unit.INSTANCE;
                        }
                        if (objE0 != aVar3) {
                            dVar2 = dVar;
                            dVar = dVar2;
                            j2 j2Var6 = j2.f164115a;
                            bVar = b.f152215a;
                            contextB = bVar.b();
                            j2Var6.getClass();
                            logger = j2.f164116b;
                            accountK = j2.k(contextB);
                            z14 = false;
                            if (accountK != null) {
                                accountManager = AccountManager.get(contextB);
                                userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                                if (userData != null) {
                                    packageName = contextB.getPackageName();
                                    packageName.getClass();
                                    if (d53.w.z(userData, packageName, false)) {
                                        String packageName7 = contextB.getPackageName();
                                        packageName7.getClass();
                                        strV = d53.u.v(userData, packageName7, "", false);
                                        com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                        if (d53.u.y(strV, ":", false)) {
                                            strV = strV.substring(1);
                                        }
                                        userData = strV;
                                        if (d53.u.p(userData, ":", false)) {
                                            userData = fb1.c.m(1, 0, userData);
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(userData)) {
                                    logger.debug("signOut: no other apps signed in, removing system account...");
                                    j2.j(contextB);
                                } else {
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                                    accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                                    accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                                    logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                                    z15 = false;
                                }
                                z14 = z15;
                            }
                            j2.f164117c.set(0L);
                            if (z14) {
                                b.f(bVar);
                                return Unit.INSTANCE;
                            }
                            kVar = dVar.f177697h;
                            if (kVar != null) {
                                e2 e2Var6 = new e2();
                                Context contextB10 = bVar.b();
                                ve2.l lVarM6 = b.m();
                                this.f152276a = null;
                                this.f152277b = null;
                                this.f152278c = null;
                                this.f152279d = 4;
                            }
                            g2.f164047a.getClass();
                            return g2.b();
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    aVar2 = aVar;
                    b.f152216b.error("signOut: scheduling ITRevokeTokensWorker", (Throwable) e);
                }
            } else {
                mVar = aVar.f59206c;
                if (mVar != null) {
                    j2 j2Var7 = j2.f164115a;
                    bVar = b.f152215a;
                    contextB = bVar.b();
                    j2Var7.getClass();
                    logger = j2.f164116b;
                    accountK = j2.k(contextB);
                    z14 = false;
                    if (accountK != null) {
                        accountManager = AccountManager.get(contextB);
                        userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                        if (userData != null) {
                            packageName = contextB.getPackageName();
                            packageName.getClass();
                            if (d53.w.z(userData, packageName, false)) {
                                String packageName8 = contextB.getPackageName();
                                packageName8.getClass();
                                strV = d53.u.v(userData, packageName8, "", false);
                                com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                if (d53.u.y(strV, ":", false)) {
                                    strV = strV.substring(1);
                                }
                                userData = strV;
                                if (d53.u.p(userData, ":", false)) {
                                    userData = fb1.c.m(1, 0, userData);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(userData)) {
                            logger.debug("signOut: no other apps signed in, removing system account...");
                            j2.j(contextB);
                        } else {
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                            logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                            z15 = false;
                        }
                        z14 = z15;
                    }
                    j2.f164117c.set(0L);
                    if (z14) {
                        b.f(bVar);
                        return Unit.INSTANCE;
                    }
                    kVar = dVar.f177697h;
                    if (kVar != null) {
                        e2 e2Var7 = new e2();
                        Context contextB11 = bVar.b();
                        ve2.l lVarM7 = b.m();
                        this.f152276a = null;
                        this.f152277b = null;
                        this.f152278c = null;
                        this.f152279d = 4;
                    }
                    g2.f164047a.getClass();
                    return g2.b();
                }
                DI2RevokeAccessAndRefreshTokensWorker.a aVar7 = DI2RevokeAccessAndRefreshTokensWorker.f50061e;
                Context contextB12 = b.f152215a.b();
                String strD4 = ve2.f.d(eVar);
                String str10 = (String) b.f152225k.getValue();
                String strK4 = b.k();
                sc2.l lVarB3 = b.m().b(eVar);
                lVarB3.getClass();
                String str11 = mVar.f158528b;
                String str12 = mVar.f158529c;
                this.f152276a = dVar;
                this.f152277b = null;
                this.f152278c = null;
                this.f152279d = 3;
                aVar7.getClass();
                objE0 = ge1.b.e0(s0.f129406a, new com.garmin.android.lib.networking.authentication.diapi.a(str11, str12, strD4, str10, strK4, lVarB3, contextB12, null), this);
                if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != aVar3) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    j2 j2Var8 = j2.f164115a;
                    bVar = b.f152215a;
                    contextB = bVar.b();
                    j2Var8.getClass();
                    logger = j2.f164116b;
                    accountK = j2.k(contextB);
                    z14 = false;
                    if (accountK != null) {
                        accountManager = AccountManager.get(contextB);
                        userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                        if (userData != null) {
                            packageName = contextB.getPackageName();
                            packageName.getClass();
                            if (d53.w.z(userData, packageName, false)) {
                                String packageName9 = contextB.getPackageName();
                                packageName9.getClass();
                                strV = d53.u.v(userData, packageName9, "", false);
                                com.airbnb.lottie.animation.keyframe.a.u("signOut: removed package [", contextB.getPackageName(), "]", logger);
                                if (d53.u.y(strV, ":", false)) {
                                    strV = strV.substring(1);
                                }
                                userData = strV;
                                if (d53.u.p(userData, ":", false)) {
                                    userData = fb1.c.m(1, 0, userData);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(userData)) {
                            logger.debug("signOut: no other apps signed in, removing system account...");
                            j2.j(contextB);
                        } else {
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH1_CONNECT_USR_SEC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_SCOPES), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
                            accountManager.setUserData(accountK, j2.e(contextB, j2.a.OAUTH2_IT_RFRSH_TOK), "");
                            accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData);
                            logger.debug("signOut: remaining packages [" + ((Object) userData) + "]");
                            z15 = false;
                        }
                        z14 = z15;
                    }
                    j2.f164117c.set(0L);
                    if (z14) {
                        b.f(bVar);
                        return Unit.INSTANCE;
                    }
                    kVar = dVar.f177697h;
                    if (kVar != null) {
                        e2 e2Var8 = new e2();
                        Context contextB13 = bVar.b();
                        ve2.l lVarM8 = b.m();
                        this.f152276a = null;
                        this.f152277b = null;
                        this.f152278c = null;
                        this.f152279d = 4;
                    }
                    g2.f164047a.getClass();
                    return g2.b();
                }
            }
            return aVar3;
        }
    }

    public d0(t13.d<? super d0> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Object> dVar) {
        return new d0(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152275a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        v1 v1Var = v1.f129418a;
        a aVar2 = new a(null);
        this.f152275a = 1;
        Object objE0 = ge1.b.e0(v1Var, aVar2, this);
        return objE0 == aVar ? aVar : objE0;
    }
}
