package te2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lte2/j2;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f164115a = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f164116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f164117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f164118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f164119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f164120f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lte2/j2$a;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        ENV,
        /* JADX INFO: Fake field, exist only in values array */
        CUST_GUID,
        /* JADX INFO: Fake field, exist only in values array */
        CUST_NAME,
        /* JADX INFO: Fake field, exist only in values array */
        CUST_IMG_URL,
        /* JADX INFO: Fake field, exist only in values array */
        CUST_AGE_STATUS_RESPONSE,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECT_USR_PROFILE_ID,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECT_USR_DISPLAYNAME_ID,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECT_USR_HAS_MBTESTER_ROLE,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECT_USR_ROLES,
        /* JADX INFO: Fake field, exist only in values array */
        SIGNED_IN_PACKAGES,
        /* JADX INFO: Fake field, exist only in values array */
        MFA_TOK,
        /* JADX INFO: Fake field, exist only in values array */
        MFA_TOK_EXP_UTC,
        OAUTH1_CONNECT_USR_TOK,
        OAUTH1_CONNECT_USR_SEC,
        OAUTH2_IT_ACS_TOK,
        OAUTH2_IT_ACS_TOK_EXP_UTC,
        OAUTH2_IT_RFRSH_TOK,
        OAUTH2_DI_SCOPES,
        OAUTH2_DI_ACS_TOK,
        OAUTH2_DI_RFRSH_TOK,
        OAUTH2_DI_ACS_TOK_EXP_UTC,
        OAUTH2_DI_RFRSH_TOK_EXP_UTC
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.biz.SystemAcctMgr$isUserSignedIn$isSignInFallback$1", f = "SystemAcctMgr.kt", l = {251}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f164132a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f164132a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            re2.l0 l0Var = re2.l0.f152316a;
            this.f164132a = 1;
            l0Var.getClass();
            Object objF = re2.l0.f(this);
            return objF == aVar ? aVar : objF;
        }
    }

    static {
        re2.l0.f152316a.getClass();
        f164116b = re2.l0.c("SysAcctMgr");
        f164117c = new AtomicLong(-1L);
    }

    private j2() {
    }

    public static sc2.j b(Context context, AccountManager accountManager, Account account, String str) {
        String strConcat;
        String strConcat2;
        j2 j2Var = f164115a;
        if (str == null) {
            a aVar = a.OAUTH1_CONNECT_USR_TOK;
            j2Var.getClass();
            strConcat = e(context, aVar);
        } else {
            strConcat = str.concat(".OAUTH1_CONNECT_USR_TOK");
        }
        String userData = accountManager.getUserData(account, strConcat);
        if (str != null && userData == null) {
            return null;
        }
        if (str == null) {
            a aVar2 = a.OAUTH1_CONNECT_USR_SEC;
            j2Var.getClass();
            strConcat2 = e(context, aVar2);
        } else {
            strConcat2 = str.concat(".OAUTH1_CONNECT_USR_SEC");
        }
        String userData2 = accountManager.getUserData(account, strConcat2);
        if (TextUtils.isEmpty(userData) || TextUtils.isEmpty(userData2)) {
            return null;
        }
        userData.getClass();
        userData2.getClass();
        return new sc2.j(userData, userData2);
    }

    @SuppressLint({"VisibleForTests"})
    public static sc2.m c(Context context, AccountManager accountManager, Account account, String str) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        String strConcat4;
        j2 j2Var = f164115a;
        if (str == null) {
            a aVar = a.OAUTH2_DI_ACS_TOK;
            j2Var.getClass();
            strConcat = e(context, aVar);
        } else {
            strConcat = str.concat(".OAUTH2_DI_ACS_TOK");
        }
        String userData = accountManager.getUserData(account, strConcat);
        Set setB = null;
        if (str == null || userData != null) {
            if (str == null) {
                a aVar2 = a.OAUTH2_DI_RFRSH_TOK;
                j2Var.getClass();
                strConcat2 = e(context, aVar2);
            } else {
                strConcat2 = str.concat(".OAUTH2_DI_RFRSH_TOK");
            }
            String userData2 = accountManager.getUserData(account, strConcat2);
            if (str == null) {
                a aVar3 = a.OAUTH2_DI_ACS_TOK_EXP_UTC;
                j2Var.getClass();
                strConcat3 = e(context, aVar3);
            } else {
                strConcat3 = str.concat(".OAUTH2_DI_ACS_TOK_EXP_UTC");
            }
            String userData3 = accountManager.getUserData(account, strConcat3);
            if (str == null) {
                a aVar4 = a.OAUTH2_DI_RFRSH_TOK_EXP_UTC;
                j2Var.getClass();
                strConcat4 = e(context, aVar4);
            } else {
                strConcat4 = str.concat(".OAUTH2_DI_RFRSH_TOK_EXP_UTC");
            }
            String userData4 = accountManager.getUserData(account, strConcat4);
            if (!TextUtils.isEmpty(userData) && !TextUtils.isEmpty(userData2) && !TextUtils.isEmpty(userData3) && !TextUtils.isEmpty(userData4)) {
                a aVar5 = a.OAUTH2_DI_SCOPES;
                j2Var.getClass();
                String userData5 = accountManager.getUserData(account, e(context, aVar5));
                if (userData5 != null) {
                    sc2.n.f158540c.getClass();
                    setB = sc2.n.a.b("^", userData5);
                }
                userData.getClass();
                userData2.getClass();
                userData3.getClass();
                long j8 = Long.parseLong(userData3);
                userData4.getClass();
                return new sc2.m(setB, userData, userData2, j8, Long.parseLong(userData4));
            }
        }
        return null;
    }

    public static sc2.o d(Context context, AccountManager accountManager, Account account, String str) {
        String strConcat;
        String strConcat2;
        String strConcat3;
        j2 j2Var = f164115a;
        if (str == null) {
            a aVar = a.OAUTH2_IT_ACS_TOK;
            j2Var.getClass();
            strConcat = e(context, aVar);
        } else {
            strConcat = str.concat(".OAUTH2_IT_ACS_TOK");
        }
        String userData = accountManager.getUserData(account, strConcat);
        if (str != null && userData == null) {
            return null;
        }
        if (str == null) {
            a aVar2 = a.OAUTH2_IT_ACS_TOK_EXP_UTC;
            j2Var.getClass();
            strConcat2 = e(context, aVar2);
        } else {
            strConcat2 = str.concat(".OAUTH2_IT_ACS_TOK_EXP_UTC");
        }
        String userData2 = accountManager.getUserData(account, strConcat2);
        if (str == null) {
            a aVar3 = a.OAUTH2_IT_RFRSH_TOK;
            j2Var.getClass();
            strConcat3 = e(context, aVar3);
        } else {
            strConcat3 = str.concat(".OAUTH2_IT_RFRSH_TOK");
        }
        String userData3 = accountManager.getUserData(account, strConcat3);
        if (TextUtils.isEmpty(userData) || TextUtils.isEmpty(userData2) || TextUtils.isEmpty(userData3)) {
            return null;
        }
        userData.getClass();
        userData2.getClass();
        long j8 = Long.parseLong(userData2);
        userData3.getClass();
        j2Var.getClass();
        String userData4 = accountManager.getUserData(account, "CUST_GUID");
        if (userData4 == null) {
            userData4 = "";
        }
        return new sc2.o(userData, j8, userData3, userData4);
    }

    public static String e(Context context, a aVar) {
        return e5.g(context.getPackageName(), ".", aVar.name());
    }

    public static Bundle f(Context context, ve2.d dVar) {
        sc2.o oVar;
        sc2.m mVar;
        sc2.j jVar;
        Bundle bundle = new Bundle();
        bundle.putString("ENV", dVar.f177690a.name());
        bundle.putString("CUST_GUID", dVar.f177691b);
        bundle.putString("CUST_NAME", dVar.f177692c);
        String str = dVar.f177693d;
        if (str == null) {
            str = "";
        }
        bundle.putString("CUST_IMG_URL", str);
        bundle.putString("SIGNED_IN_PACKAGES", context.getPackageName());
        ve2.a aVar = dVar.f177694e;
        if (aVar != null) {
            bundle.putString("CONNECT_USR_PROFILE_ID", String.valueOf(aVar.f177677a));
            bundle.putString("CONNECT_USR_DISPLAYNAME_ID", aVar.f177678b);
            bundle.putString("CONNECT_USR_HAS_MBTESTER_ROLE", aVar.f177679c ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            Set<String> set = aVar.f177680d;
            bundle.putString("CONNECT_USR_ROLES", set.isEmpty() ? "" : p13.h0.k0(set, "^", null, null, null, 62));
        }
        ve2.k kVar = dVar.f177697h;
        if (kVar != null) {
            if (!kVar.a()) {
                kVar = null;
            }
            if (kVar != null) {
                bundle.putString("MFA_TOK", kVar.f177753a);
                bundle.putString("MFA_TOK_EXP_UTC", String.valueOf(kVar.f177754b));
            }
        }
        dd2.a aVar2 = dVar.f177695f;
        j2 j2Var = f164115a;
        if (aVar2 != null && (jVar = aVar2.f59204a) != null) {
            a aVar3 = a.OAUTH1_CONNECT_USR_TOK;
            j2Var.getClass();
            bundle.putString(e(context, aVar3), jVar.f158514a);
            bundle.putString(e(context, a.OAUTH1_CONNECT_USR_SEC), jVar.f158515b);
        }
        dd2.a aVar4 = dVar.f177695f;
        if (aVar4 != null && (mVar = aVar4.f59206c) != null) {
            String strB = mVar.b();
            if (strB != null) {
                a aVar5 = a.OAUTH2_DI_SCOPES;
                j2Var.getClass();
                bundle.putString(e(context, aVar5), strB);
            }
            a aVar6 = a.OAUTH2_DI_ACS_TOK;
            j2Var.getClass();
            bundle.putString(e(context, aVar6), mVar.f158528b);
            bundle.putString(e(context, a.OAUTH2_DI_RFRSH_TOK), mVar.f158529c);
            bundle.putString(e(context, a.OAUTH2_DI_ACS_TOK_EXP_UTC), String.valueOf(mVar.f158530d));
            bundle.putString(e(context, a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), String.valueOf(mVar.f158531e));
        }
        dd2.a aVar7 = dVar.f177695f;
        if (aVar7 != null && (oVar = aVar7.f59205b) != null) {
            a aVar8 = a.OAUTH2_IT_ACS_TOK;
            j2Var.getClass();
            bundle.putString(e(context, aVar8), oVar.f158544a);
            bundle.putString(e(context, a.OAUTH2_IT_RFRSH_TOK), oVar.f158546c);
            bundle.putString(e(context, a.OAUTH2_IT_ACS_TOK_EXP_UTC), String.valueOf(oVar.f158545b));
        }
        return bundle;
    }

    public static void i(Context context, ve2.d dVar, re2.b.d dVar2) {
        String str;
        Logger logger = f164116b;
        dVar.getClass();
        dVar2.getClass();
        try {
            g2.f164047a.getClass();
            g2.c(dVar);
            com.garmin.android.library.mobileauth.ui.e.f50426m.getClass();
            if (com.garmin.android.library.mobileauth.ui.e.f50427n) {
                str = "forced by easter egg";
            } else {
                try {
                    AccountManager accountManager = AccountManager.get(context);
                    if (accountManager != null) {
                        f164117c.set(0L);
                        String str2 = f164120f;
                        if (str2 == null) {
                            p005kotlin.jvm.internal.s.m("systemAccountName");
                            throw null;
                        }
                        String str3 = f164119e;
                        if (str3 == null) {
                            p005kotlin.jvm.internal.s.m("systemAccountPackageName");
                            throw null;
                        }
                        if (accountManager.addAccountExplicitly(new Account(str2, str3), String.valueOf(System.currentTimeMillis()), f(context, dVar))) {
                            String str4 = f164120f;
                            if (str4 == null) {
                                p005kotlin.jvm.internal.s.m("systemAccountName");
                                throw null;
                            }
                            logger.debug(str4.concat(" system account created successfully"));
                            re2.b.f152215a.getClass();
                            re2.b.c cVar = re2.b.c.DEFAULT;
                            re2.b.K("onSystemAccountCreated", cVar, null);
                            dVar.f177696g = true;
                            re2.b.K("onUserSignedIn", cVar, null);
                            new Handler(Looper.getMainLooper()).post(new r0.h(5, dVar, dVar2));
                            str = null;
                        } else {
                            str = "android.accounts.AccountManager.addAccountExplicitly returned FALSE";
                        }
                    } else {
                        str = "android.accounts.AccountManager instance is NULL";
                    }
                } catch (Throwable th3) {
                    String localizedMessage = th3.getLocalizedMessage();
                    logger.error("createAccount", th3);
                    str = localizedMessage;
                }
            }
            if (str != null) {
                g2.f164047a.getClass();
                SharedPreferences sharedPreferences = g2.f164049c;
                if (sharedPreferences == null) {
                    p005kotlin.jvm.internal.s.m("prefs");
                    throw null;
                }
                sharedPreferences.edit().putInt("is.signin.fallback", 1).commit();
                logger.warn("createAccount: app using 'signin fallback' due to ->\n".concat(str));
                re2.b.f152215a.getClass();
                re2.b.c cVar2 = re2.b.c.DEFAULT;
                re2.b.K("onSignInFallback", cVar2, null);
                dVar.f177696g = false;
                re2.b.K("onUserSignedIn", cVar2, null);
                new Handler(Looper.getMainLooper()).post(new r0.h(5, dVar, dVar2));
                se2.c.a(se2.b.SIGNIN_FALLBACK, p13.t0.b(new o13.p(se2.a.REASON, str)));
            }
        } catch (Throwable th4) {
            logger.error("createAccount", th4);
            throw th4;
        }
    }

    public static void j(Context context) {
        context.getClass();
        Account accountK = k(context);
        if (accountK != null) {
            AccountManager accountManager = AccountManager.get(context);
            accountManager.getClass();
            f164115a.getClass();
            f164117c.set(0L);
            f164116b.debug("removing system account...");
            accountManager.removeAccountExplicitly(accountK);
        }
    }

    public static Account k(Context context) {
        context.getClass();
        AccountManager accountManager = AccountManager.get(context);
        String str = f164119e;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("systemAccountPackageName");
            throw null;
        }
        Account[] accountsByType = accountManager.getAccountsByType(str);
        accountsByType.getClass();
        if (!(accountsByType.length == 0)) {
            return accountsByType[0];
        }
        return null;
    }

    public static ve2.e l(AccountManager accountManager, Account account) {
        String userData = accountManager.getUserData(account, "ENV");
        if (userData != null) {
            ve2.e eVarValueOf = !d53.w.J(userData) ? ve2.e.valueOf(userData) : ve2.e.f177704d;
            if (eVarValueOf != null) {
                return eVarValueOf;
            }
        }
        return ve2.e.f177704d;
    }

    public static HashMap m(Context context) {
        context.getClass();
        String[] strArrN = n(context, true, null);
        if (strArrN == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArrN) {
            if (!p005kotlin.jvm.internal.s.g(str, context.getPackageName())) {
                arrayList.add(str);
            }
        }
        f164115a.getClass();
        Account accountK = k(context);
        accountK.getClass();
        AccountManager accountManager = AccountManager.get(context);
        HashMap map = new HashMap(arrayList.size());
        for (String str2 : arrayList) {
            accountManager.getClass();
            sc2.j jVarB = b(context, accountManager, accountK, str2);
            sc2.m mVarC = c(context, accountManager, accountK, str2);
            sc2.o oVarD = d(context, accountManager, accountK, str2);
            if (jVarB != null || mVarC != null || oVarD != null) {
                map.put(str2, new dd2.a(jVarB, oVarD, mVarC));
            }
        }
        return map;
    }

    public static String[] n(Context context, boolean z14, Account account) {
        context.getClass();
        if (account == null) {
            account = k(context);
        }
        Logger logger = f164116b;
        if (account == null) {
            logger.debug("getSignedInPackageNames: none");
            return null;
        }
        String userData = AccountManager.get(context).getUserData(account, "SIGNED_IN_PACKAGES");
        if (userData == null) {
            logger.debug("getSignedInPackageNames: none");
            return null;
        }
        if (z14) {
            logger.debug("getSignedInPackageNames: ".concat(userData));
        }
        return (String[]) d53.w.W(userData, new String[]{":"}).toArray(new String[0]);
    }

    public static final void p(String str, boolean z14, boolean z15) {
        if ((!z14 || z15) && str != null) {
            String strValueOf = String.valueOf(z14);
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = strValueOf.toUpperCase(locale);
            upperCase.getClass();
            f164116b.debug("isUserSignedIn: " + upperCase + StringUtils.SPACE + str);
        }
        f164118d = Boolean.valueOf(z14);
        f164117c.set(SystemClock.elapsedRealtime());
    }

    public static /* synthetic */ void q(int i14, String str, boolean z14) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        p(str, z14, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static void r(String str, AccountManager accountManager, Account account, ve2.k kVar) {
        String strValueOf;
        String str2;
        String strConcat;
        String userData = accountManager.getUserData(account, "MFA_TOK");
        String str3 = null;
        if (userData == null || d53.w.J(userData)) {
            userData = null;
        }
        String userData2 = accountManager.getUserData(account, "MFA_TOK_EXP_UTC");
        Long lValueOf = (userData2 == null || d53.w.J(userData2)) ? null : Long.valueOf(Long.parseLong(userData2));
        if (kVar == null) {
            strValueOf = null;
            str2 = null;
        } else {
            if (!kVar.a()) {
                kVar = null;
            }
            if (kVar != null) {
                str2 = kVar.f177753a;
                strValueOf = String.valueOf(kVar.f177754b);
            } else {
                strValueOf = null;
                str2 = null;
            }
        }
        accountManager.setUserData(account, "MFA_TOK", str2);
        accountManager.setUserData(account, "MFA_TOK_EXP_UTC", strValueOf);
        String strConcat2 = "not blank but length not at least 12 chars";
        if (userData != null) {
            try {
                if (d53.w.J(userData)) {
                    strConcat = null;
                } else {
                    strConcat = userData.length() >= 12 ? d53.y.s0(12, userData).concat("...") : "not blank but length not at least 12 chars";
                }
                if (strConcat == null) {
                    strConcat = null;
                }
            } catch (Throwable unused) {
                return;
            }
        } else {
            strConcat = null;
        }
        if (str2 != null) {
            if (d53.w.J(str2)) {
                strConcat2 = null;
            } else if (str2.length() >= 12) {
                strConcat2 = d53.y.s0(12, str2).concat("...");
            }
            if (strConcat2 != null) {
                str3 = strConcat2;
            }
        }
        String str4 = "setMFADataTokenData: called by '" + str + "'\n  tok:    [" + strConcat + "] -> [" + str3 + "]\n  tokExp: [" + lValueOf + "] -> [" + ((Object) strValueOf) + "]";
        Logger logger = f164116b;
        if ((userData == null || str2 != null) && (lValueOf == null || strValueOf != null)) {
            logger.debug(str4);
        } else {
            logger.warn(str4);
        }
    }

    public static void s(Account account, AccountManager accountManager, ve2.a aVar) {
        if (aVar != null) {
            accountManager.setUserData(account, "CONNECT_USR_PROFILE_ID", String.valueOf(aVar.f177677a));
            accountManager.setUserData(account, "CONNECT_USR_DISPLAYNAME_ID", aVar.f177678b);
            accountManager.setUserData(account, "CONNECT_USR_HAS_MBTESTER_ROLE", aVar.f177679c ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            Set<String> set = aVar.f177680d;
            accountManager.setUserData(account, "CONNECT_USR_ROLES", set.isEmpty() ? "" : p13.h0.k0(set, "^", null, null, null, 62));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(Context context, v13.c cVar) {
        k2 k2Var;
        Long lValueOf;
        ve2.a aVar;
        Set setG1;
        if (cVar instanceof k2) {
            k2Var = (k2) cVar;
            int i14 = k2Var.f164153c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k2Var.f164153c = i14 - Integer.MIN_VALUE;
            } else {
                k2Var = new k2(this, cVar);
            }
        } else {
            k2Var = new k2(this, cVar);
        }
        Object objF = k2Var.f164151a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = k2Var.f164153c;
        ve2.k kVar = null;
        if (i15 == 0) {
            o13.r.b(objF);
            Account accountK = k(context);
            if (accountK != null) {
                AccountManager accountManager = AccountManager.get(context);
                accountManager.getClass();
                f164115a.getClass();
                ve2.e eVarL = l(accountManager, accountK);
                String userData = accountManager.getUserData(accountK, "CUST_GUID");
                String str = userData == null ? "" : userData;
                String userData2 = accountManager.getUserData(accountK, "CUST_NAME");
                String str2 = userData2 == null ? "" : userData2;
                String userData3 = accountManager.getUserData(accountK, "CUST_IMG_URL");
                String userData4 = accountManager.getUserData(accountK, "CONNECT_USR_PROFILE_ID");
                if (TextUtils.isEmpty(userData4)) {
                    lValueOf = null;
                } else {
                    userData4.getClass();
                    lValueOf = Long.valueOf(Long.parseLong(userData4));
                }
                String userData5 = accountManager.getUserData(accountK, "CONNECT_USR_DISPLAYNAME_ID");
                String str3 = TextUtils.isEmpty(userData5) ? null : userData5;
                if (lValueOf == null || str3 == null) {
                    aVar = null;
                } else {
                    String userData6 = accountManager.getUserData(accountK, "CONNECT_USR_ROLES");
                    if (userData6 == null) {
                        setG1 = p13.l0.f134950a;
                    } else {
                        if (d53.w.J(userData6)) {
                            userData6 = null;
                        }
                        if (userData6 == null || (setG1 = p13.h0.g1(d53.w.W(userData6, new String[]{"^"}))) == null) {
                            setG1 = p13.l0.f134950a;
                        }
                    }
                    Set set = setG1;
                    long jLongValue = lValueOf.longValue();
                    String userData7 = accountManager.getUserData(accountK, "CONNECT_USR_HAS_MBTESTER_ROLE");
                    aVar = new ve2.a(jLongValue, str3, !TextUtils.isEmpty(userData7) && p005kotlin.jvm.internal.s.g(userData7, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), set);
                }
                sc2.j jVarB = b(context, accountManager, accountK, null);
                sc2.m mVarC = c(context, accountManager, accountK, null);
                sc2.o oVarD = d(context, accountManager, accountK, null);
                dd2.a aVar3 = (jVarB == null && mVarC == null && oVarD == null) ? null : new dd2.a(jVarB, oVarD, mVarC);
                String userData8 = accountManager.getUserData(accountK, "MFA_TOK");
                if (userData8 == null || d53.w.J(userData8)) {
                    userData8 = null;
                }
                String userData9 = accountManager.getUserData(accountK, "MFA_TOK_EXP_UTC");
                Long lValueOf2 = (userData9 == null || d53.w.J(userData9)) ? null : Long.valueOf(Long.parseLong(userData9));
                if (userData8 != null && lValueOf2 != null) {
                    kVar = new ve2.k(userData8, lValueOf2);
                }
                return new ve2.d(eVarL, str, str2, userData3, aVar, aVar3, true, kVar);
            }
            re2.l0 l0Var = re2.l0.f152316a;
            k2Var.f164153c = 1;
            l0Var.getClass();
            objF = re2.l0.f(k2Var);
            if (objF == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        if (((Boolean) objF).booleanValue()) {
            g2.f164047a.getClass();
            ve2.d dVarA = g2.a();
            if (dVarA != null) {
                dVarA.f177696g = false;
                return dVarA;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (r7.G(r0) == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, boolean z14, v13.c cVar) {
        l2 l2Var;
        sc2.j jVarB;
        dd2.a aVar;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i14 = l2Var.f164167c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l2Var.f164167c = i14 - Integer.MIN_VALUE;
            } else {
                l2Var = new l2(this, cVar);
            }
        } else {
            l2Var = new l2(this, cVar);
        }
        Object objA = l2Var.f164165a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l2Var.f164167c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objA);
        Account accountK = k(context);
        if (accountK == null) {
            l2Var.f164167c = 1;
            objA = a(context, l2Var);
            if (objA != obj) {
            }
            return obj;
        }
        AccountManager accountManager = AccountManager.get(context);
        Logger logger = f164116b;
        if (z14) {
            String[] strArrN = n(context, false, null);
            if (strArrN != null) {
                p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(strArrN);
                while (bVar.hasNext()) {
                    if (!p005kotlin.jvm.internal.s.g((String) bVar.next(), context.getPackageName())) {
                    }
                }
                accountManager.getClass();
                jVarB = b(context, accountManager, accountK, null);
                sc2.m mVarC = c(context, accountManager, accountK, null);
                if (jVarB == null && mVarC == null) {
                    logger.debug("clearOAuth2ITData: deleting system account because no other credentials for this app exists and not signed in to any other app");
                    j(context);
                    return Unit.INSTANCE;
                }
            } else {
                accountManager.getClass();
                jVarB = b(context, accountManager, accountK, null);
                sc2.m mVarC2 = c(context, accountManager, accountK, null);
                if (jVarB == null) {
                    logger.debug("clearOAuth2ITData: deleting system account because no other credentials for this app exists and not signed in to any other app");
                    j(context);
                    return Unit.INSTANCE;
                }
            }
        }
        logger.debug("clearOAuth2ITData: clearing 'OAuth2ITData' data only");
        a aVar2 = a.OAUTH2_IT_ACS_TOK;
        f164115a.getClass();
        accountManager.setUserData(accountK, e(context, aVar2), "");
        accountManager.setUserData(accountK, e(context, a.OAUTH2_IT_ACS_TOK_EXP_UTC), "");
        accountManager.setUserData(accountK, e(context, a.OAUTH2_IT_RFRSH_TOK), "");
        return Unit.INSTANCE;
        ve2.d dVar = (ve2.d) objA;
        if (dVar != null && (aVar = dVar.f177695f) != null) {
            if (aVar.f59204a == null && aVar.f59206c == null) {
                re2.b bVar2 = re2.b.f152215a;
                l2Var.f164167c = 2;
            } else {
                aVar.f59205b = null;
                g2.f164047a.getClass();
                g2.c(dVar);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(Context context, ve2.d dVar, Account account, AccountManager accountManager, v13.c cVar) {
        m2 m2Var;
        sc2.o oVar;
        sc2.m mVar;
        sc2.j jVar;
        if (cVar instanceof m2) {
            m2Var = (m2) cVar;
            int i14 = m2Var.f164191c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m2Var.f164191c = i14 - Integer.MIN_VALUE;
            } else {
                m2Var = new m2(this, cVar);
            }
        } else {
            m2Var = new m2(this, cVar);
        }
        Object obj = m2Var.f164189a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m2Var.f164191c;
        Logger logger = f164116b;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                logger.debug("continueAsAccount");
                g2.f164047a.getClass();
                g2.c(dVar);
                String userData = accountManager.getUserData(account, "SIGNED_IN_PACKAGES");
                if (userData == null || d53.w.J(userData)) {
                    accountManager.setUserData(account, "SIGNED_IN_PACKAGES", context.getPackageName());
                } else {
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    if (!d53.w.z(userData, packageName, false)) {
                        accountManager.setUserData(account, "SIGNED_IN_PACKAGES", userData + ":" + context.getPackageName());
                    }
                }
                accountManager.setUserData(account, "ENV", dVar.f177690a.name());
                accountManager.setUserData(account, "CUST_GUID", dVar.f177691b);
                accountManager.setUserData(account, "CUST_NAME", dVar.f177692c);
                accountManager.setUserData(account, "CUST_IMG_URL", dVar.f177693d);
                j2 j2Var = f164115a;
                ve2.k kVar = dVar.f177697h;
                j2Var.getClass();
                r("continueAsAccount", accountManager, account, kVar);
                s(account, accountManager, dVar.f177694e);
                dd2.a aVar2 = dVar.f177695f;
                if (aVar2 != null && (jVar = aVar2.f59204a) != null) {
                    accountManager.setUserData(account, e(context, a.OAUTH1_CONNECT_USR_TOK), jVar.f158514a);
                    accountManager.setUserData(account, e(context, a.OAUTH1_CONNECT_USR_SEC), jVar.f158515b);
                }
                dd2.a aVar3 = dVar.f177695f;
                if (aVar3 != null && (mVar = aVar3.f59206c) != null) {
                    String strB = mVar.b();
                    if (strB != null) {
                        accountManager.setUserData(account, e(context, a.OAUTH2_DI_SCOPES), strB);
                    }
                    accountManager.setUserData(account, e(context, a.OAUTH2_DI_ACS_TOK), mVar.f158528b);
                    accountManager.setUserData(account, e(context, a.OAUTH2_DI_RFRSH_TOK), mVar.f158529c);
                    accountManager.setUserData(account, e(context, a.OAUTH2_DI_ACS_TOK_EXP_UTC), String.valueOf(mVar.f158530d));
                    accountManager.setUserData(account, e(context, a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), String.valueOf(mVar.f158531e));
                }
                dd2.a aVar4 = dVar.f177695f;
                if (aVar4 != null && (oVar = aVar4.f59205b) != null) {
                    accountManager.setUserData(account, e(context, a.OAUTH2_IT_ACS_TOK), oVar.f158544a);
                    accountManager.setUserData(account, e(context, a.OAUTH2_IT_RFRSH_TOK), oVar.f158546c);
                    accountManager.setUserData(account, e(context, a.OAUTH2_IT_ACS_TOK_EXP_UTC), String.valueOf(oVar.f158545b));
                }
                m2Var.f164191c = 1;
                if (o53.m0.b(2000L, m2Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            logger.error("continueAsAccount", th3);
            throw th3;
        }
    }

    public final boolean o(Context context, ve2.l lVar, boolean z14) {
        lVar.getClass();
        ve2.q qVar = lVar.f177761b;
        Boolean bool = f164118d;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (SystemClock.elapsedRealtime() - f164117c.get() <= 1000) {
                return zBooleanValue;
            }
        }
        Account accountK = k(context);
        if (accountK == null) {
            if (((Boolean) ge1.b.W(t13.h.f161748a, new b(null))).booleanValue()) {
                p(z14 ? "(signin fallback)" : null, true, true);
                return true;
            }
            q(2, "no sys acct", false);
            return false;
        }
        String[] strArrN = n(context, false, accountK);
        if (strArrN == null || !p13.u.z(strArrN, context.getPackageName())) {
            q(2, "not present [" + context.getPackageName() + "]", false);
            return false;
        }
        AccountManager accountManager = AccountManager.get(context);
        accountManager.getClass();
        sc2.j jVarB = b(context, accountManager, accountK, null);
        sc2.o oVarD = d(context, accountManager, accountK, null);
        sc2.m mVarC = c(context, accountManager, accountK, null);
        if (jVarB == null && oVarD == null && mVarC == null) {
            q(2, "oAuth1GCData, oAuth2ITData, oAuth2DIData all null", false);
            return false;
        }
        if (qVar.a(sc2.a.f158478d) && !qVar.a(sc2.a.f158476b) && !qVar.a(sc2.a.f158477c) && oVarD == null) {
            q(2, "no 'oAuth2ITData' for oAuth2IT only app", false);
            return false;
        }
        g2.f164047a.getClass();
        ve2.d dVarA = g2.a();
        if (dVarA == null) {
            q(2, "no 'garminAccountFromPrefs'", false);
            return false;
        }
        String str = dVarA.f177691b;
        String userData = accountManager.getUserData(accountK, "CUST_GUID");
        if (userData == null) {
            userData = "";
        }
        if (TextUtils.isEmpty(userData)) {
            q(2, "no customer GUID", false);
            return false;
        }
        if (userData.equals(str)) {
            q(6, null, true);
            return true;
        }
        q(2, v.e0.g("sysAcctCustomerGUID [", userData, "] != garminAccountFromPrefsGUID [", str, "]"), false);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:32:0x0093, B:34:0x009b, B:37:0x00b2, B:20:0x0042, B:26:0x0056, B:28:0x005a, B:39:0x00c3, B:40:0x00ca, B:23:0x0049), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(Context context, sc2.b bVar, v13.c cVar) {
        o2 o2Var;
        Context context2;
        ve2.d dVar;
        String str;
        if (cVar instanceof o2) {
            o2Var = (o2) cVar;
            int i14 = o2Var.f164219e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o2Var.f164219e = i14 - Integer.MIN_VALUE;
            } else {
                o2Var = new o2(this, cVar);
            }
        } else {
            o2Var = new o2(this, cVar);
        }
        Object objA = o2Var.f164217c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = o2Var.f164219e;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                o2Var.f164215a = context;
                o2Var.f164216b = bVar;
                o2Var.f164219e = 1;
                objA = a(context, o2Var);
                if (objA == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                bVar = (sc2.b) o2Var.f164216b;
                context = o2Var.f164215a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (ve2.d) o2Var.f164216b;
                context2 = o2Var.f164215a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                Account accountK = k(context2);
                AccountManager accountManager = AccountManager.get(context2);
                accountManager.setUserData(accountK, "CUST_NAME", dVar.f177692c);
                str = dVar.f177693d;
                if (str == null) {
                    str = "";
                }
                accountManager.setUserData(accountK, "CUST_IMG_URL", str);
                j2 j2Var = f164115a;
                accountK.getClass();
                ve2.a aVar = dVar.f177694e;
                j2Var.getClass();
                s(accountK, accountManager, aVar);
            }
            return dVar;
            ve2.d dVar2 = (ve2.d) objA;
            if (dVar2 == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            String str2 = bVar.f158483b;
            Set<String> set = bVar.f158487f;
            dVar2.f177692c = str2;
            dVar2.f177693d = bVar.f158486e;
            dVar2.f177694e = new ve2.a(bVar.f158484c, bVar.f158485d, set.contains("ROLE_MBTESTER"), set);
            g2.f164047a.getClass();
            g2.c(dVar2);
            re2.l0 l0Var = re2.l0.f152316a;
            o2Var.f164215a = context;
            o2Var.f164216b = dVar2;
            o2Var.f164219e = 2;
            l0Var.getClass();
            Object objF = re2.l0.f(o2Var);
            if (objF != obj) {
                context2 = context;
                dVar = dVar2;
                objA = objF;
                if (!((Boolean) objA).booleanValue()) {
                    Account accountK2 = k(context2);
                    AccountManager accountManager2 = AccountManager.get(context2);
                    accountManager2.setUserData(accountK2, "CUST_NAME", dVar.f177692c);
                    str = dVar.f177693d;
                    if (str == null) {
                        str = "";
                    }
                    accountManager2.setUserData(accountK2, "CUST_IMG_URL", str);
                    j2 j2Var2 = f164115a;
                    accountK2.getClass();
                    ve2.a aVar2 = dVar.f177694e;
                    j2Var2.getClass();
                    s(accountK2, accountManager2, aVar2);
                }
                return dVar;
            }
            return obj;
        } catch (Throwable th3) {
            f164116b.error("updateUserProfile(GCSocialProfileDTO)", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:30:0x007a, B:32:0x0082, B:26:0x005c), top: B:38:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(Context context, sc2.e eVar, v13.c cVar) throws Throwable {
        p2 p2Var;
        Context context2;
        ve2.d dVar;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i14 = p2Var.f164243e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p2Var.f164243e = i14 - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(this, cVar);
            }
        } else {
            p2Var = new p2(this, cVar);
        }
        Object objA = p2Var.f164241c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = p2Var.f164243e;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                p2Var.f164239a = context;
                p2Var.f164240b = eVar;
                p2Var.f164243e = 1;
                objA = a(context, p2Var);
                if (objA != obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                eVar = (sc2.e) p2Var.f164240b;
                context = p2Var.f164239a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (ve2.d) p2Var.f164240b;
                context2 = p2Var.f164239a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                AccountManager.get(context2).setUserData(k(context2), "CUST_NAME", dVar.f177692c);
            }
            return dVar;
            ve2.d dVar2 = (ve2.d) objA;
            if (dVar2 == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            dVar2.f177692c = eVar.f158496a;
            g2.f164047a.getClass();
            g2.c(dVar2);
            re2.l0 l0Var = re2.l0.f152316a;
            p2Var.f164239a = context;
            p2Var.f164240b = dVar2;
            p2Var.f164243e = 2;
            l0Var.getClass();
            Object objF = re2.l0.f(p2Var);
            if (objF != obj) {
                context2 = context;
                dVar = dVar2;
                objA = objF;
                if (!((Boolean) objA).booleanValue()) {
                    AccountManager.get(context2).setUserData(k(context2), "CUST_NAME", dVar.f177692c);
                }
                return dVar;
            }
            return obj;
        } catch (Throwable th3) {
            f164116b.error("updateUserProfile(ITBasicCustomerInfoDTO)", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:36:0x0090, B:38:0x0098, B:42:0x00af, B:25:0x005b, B:28:0x0060, B:30:0x0066, B:32:0x0070), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(Context context, zc2.a aVar, v13.c cVar) throws Throwable {
        n2 n2Var;
        Context context2;
        ve2.d dVar;
        String str;
        if (cVar instanceof n2) {
            n2Var = (n2) cVar;
            int i14 = n2Var.f164205e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n2Var.f164205e = i14 - Integer.MIN_VALUE;
            } else {
                n2Var = new n2(this, cVar);
            }
        } else {
            n2Var = new n2(this, cVar);
        }
        Object objA = n2Var.f164203c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = n2Var.f164205e;
        String str2 = "";
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                n2Var.f164201a = context;
                n2Var.f164202b = aVar;
                n2Var.f164205e = 1;
                objA = a(context, n2Var);
                if (objA != obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                aVar = (zc2.a) n2Var.f164202b;
                context = n2Var.f164201a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (ve2.d) n2Var.f164202b;
                context2 = n2Var.f164201a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                Account accountK = k(context2);
                AccountManager accountManager = AccountManager.get(context2);
                accountManager.setUserData(accountK, "CUST_NAME", dVar.f177692c);
                str = dVar.f177693d;
                if (str == null) {
                    str2 = str;
                }
                accountManager.setUserData(accountK, "CUST_IMG_URL", str2);
            }
            return dVar;
            ve2.d dVar2 = (ve2.d) objA;
            if (dVar2 == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            String str3 = aVar.f203967d;
            if (str3 == null) {
                str3 = "";
            }
            dVar2.f177692c = str3;
            Map<String, String> map = aVar.f203970g;
            dVar2.f177693d = map != null ? map.get("PROFILE") : null;
            g2.f164047a.getClass();
            g2.c(dVar2);
            re2.l0 l0Var = re2.l0.f152316a;
            n2Var.f164201a = context;
            n2Var.f164202b = dVar2;
            n2Var.f164205e = 2;
            l0Var.getClass();
            Object objF = re2.l0.f(n2Var);
            if (objF != obj) {
                context2 = context;
                dVar = dVar2;
                objA = objF;
                if (!((Boolean) objA).booleanValue()) {
                    Account accountK2 = k(context2);
                    AccountManager accountManager2 = AccountManager.get(context2);
                    accountManager2.setUserData(accountK2, "CUST_NAME", dVar.f177692c);
                    str = dVar.f177693d;
                    if (str == null) {
                        str2 = str;
                    }
                    accountManager2.setUserData(accountK2, "CUST_IMG_URL", str2);
                }
                return dVar;
            }
            return obj;
        } catch (Throwable th3) {
            f164116b.error("updateUserProfile(GarminUserProfile)", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0086, B:38:0x008e, B:41:0x009e, B:42:0x00aa, B:44:0x00f6, B:20:0x003f, B:26:0x0054, B:28:0x0058, B:30:0x005c, B:32:0x006a, B:31:0x005f, B:47:0x0114, B:48:0x011b, B:23:0x0047), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0086, B:38:0x008e, B:41:0x009e, B:42:0x00aa, B:44:0x00f6, B:20:0x003f, B:26:0x0054, B:28:0x0058, B:30:0x005c, B:32:0x006a, B:31:0x005f, B:47:0x0114, B:48:0x011b, B:23:0x0047), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0086, B:38:0x008e, B:41:0x009e, B:42:0x00aa, B:44:0x00f6, B:20:0x003f, B:26:0x0054, B:28:0x0058, B:30:0x005c, B:32:0x006a, B:31:0x005f, B:47:0x0114, B:48:0x011b, B:23:0x0047), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00f6, please report this as an issue */
    public final Object w(Context context, sc2.m mVar, v13.c cVar) {
        q2 q2Var;
        Context context2;
        sc2.m mVar2;
        Account accountK;
        AccountManager accountManager;
        String strB;
        j2 j2Var;
        String userData;
        String packageName;
        if (cVar instanceof q2) {
            q2Var = (q2) cVar;
            int i14 = q2Var.f164263e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q2Var.f164263e = i14 - Integer.MIN_VALUE;
            } else {
                q2Var = new q2(this, cVar);
            }
        } else {
            q2Var = new q2(this, cVar);
        }
        Object objA = q2Var.f164261c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = q2Var.f164263e;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                q2Var.f164259a = context;
                q2Var.f164260b = mVar;
                q2Var.f164263e = 1;
                objA = a(context, q2Var);
                if (objA == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                mVar = q2Var.f164260b;
                context = q2Var.f164259a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar2 = q2Var.f164260b;
                context2 = q2Var.f164259a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                accountK = k(context2);
                accountManager = AccountManager.get(context2);
                strB = mVar2.b();
                j2Var = f164115a;
                if (strB != null) {
                    a aVar = a.OAUTH2_DI_SCOPES;
                    j2Var.getClass();
                    accountManager.setUserData(accountK, e(context2, aVar), strB);
                }
                a aVar2 = a.OAUTH2_DI_ACS_TOK;
                j2Var.getClass();
                accountManager.setUserData(accountK, e(context2, aVar2), mVar2.f158528b);
                accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_RFRSH_TOK), mVar2.f158529c);
                accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_ACS_TOK_EXP_UTC), String.valueOf(mVar2.f158530d));
                accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), String.valueOf(mVar2.f158531e));
                userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                userData.getClass();
                packageName = context2.getPackageName();
                packageName.getClass();
                if (!d53.w.z(userData, packageName, false)) {
                    accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                }
            }
            return Unit.INSTANCE;
            sc2.m mVar3 = mVar;
            ve2.d dVar = (ve2.d) objA;
            if (dVar == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            dd2.a aVar3 = dVar.f177695f;
            if (aVar3 != null) {
                aVar3.f59206c = mVar3;
            } else {
                dVar.f177695f = new dd2.a(null, null, mVar3, 3, null);
            }
            g2.f164047a.getClass();
            g2.c(dVar);
            re2.l0 l0Var = re2.l0.f152316a;
            q2Var.f164259a = context;
            q2Var.f164260b = mVar3;
            q2Var.f164263e = 2;
            l0Var.getClass();
            objA = re2.l0.f(q2Var);
            if (objA != obj) {
                context2 = context;
                mVar2 = mVar3;
                if (!((Boolean) objA).booleanValue()) {
                    accountK = k(context2);
                    accountManager = AccountManager.get(context2);
                    strB = mVar2.b();
                    j2Var = f164115a;
                    if (strB != null) {
                        a aVar4 = a.OAUTH2_DI_SCOPES;
                        j2Var.getClass();
                        accountManager.setUserData(accountK, e(context2, aVar4), strB);
                    }
                    a aVar5 = a.OAUTH2_DI_ACS_TOK;
                    j2Var.getClass();
                    accountManager.setUserData(accountK, e(context2, aVar5), mVar2.f158528b);
                    accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_RFRSH_TOK), mVar2.f158529c);
                    accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_ACS_TOK_EXP_UTC), String.valueOf(mVar2.f158530d));
                    accountManager.setUserData(accountK, e(context2, a.OAUTH2_DI_RFRSH_TOK_EXP_UTC), String.valueOf(mVar2.f158531e));
                    userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                    userData.getClass();
                    packageName = context2.getPackageName();
                    packageName.getClass();
                    if (!d53.w.z(userData, packageName, false)) {
                        accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                    }
                }
                return Unit.INSTANCE;
            }
            return obj;
        } catch (Throwable th3) {
            f164116b.error("updateWithDI", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:36:0x00aa, B:38:0x00b2, B:40:0x00de, B:41:0x00e3, B:43:0x00f8, B:20:0x004b, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:32:0x008a, B:31:0x007d, B:46:0x0116, B:47:0x011d, B:23:0x0059), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:36:0x00aa, B:38:0x00b2, B:40:0x00de, B:41:0x00e3, B:43:0x00f8, B:20:0x004b, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:32:0x008a, B:31:0x007d, B:46:0x0116, B:47:0x011d, B:23:0x0059), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:36:0x00aa, B:38:0x00b2, B:40:0x00de, B:41:0x00e3, B:43:0x00f8, B:20:0x004b, B:26:0x006c, B:28:0x0070, B:30:0x0078, B:32:0x008a, B:31:0x007d, B:46:0x0116, B:47:0x011d, B:23:0x0059), top: B:50:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00f8, please report this as an issue */
    public final Object x(Context context, sc2.k kVar, boolean z14, v13.c cVar) {
        r2 r2Var;
        sc2.k kVar2;
        boolean z15;
        Object objA;
        sc2.k kVar3;
        Context context2;
        boolean z16;
        Account accountK;
        AccountManager accountManager;
        String userData;
        String packageName;
        Context context3 = context;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i14 = r2Var.f164283f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r2Var.f164283f = i14 - Integer.MIN_VALUE;
            } else {
                r2Var = new r2(this, cVar);
            }
        } else {
            r2Var = new r2(this, cVar);
        }
        Object obj = r2Var.f164281d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = r2Var.f164283f;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                r2Var.f164278a = context3;
                kVar2 = kVar;
                r2Var.f164279b = kVar2;
                z15 = z14;
                r2Var.f164280c = z15;
                r2Var.f164283f = 1;
                objA = a(context3, r2Var);
                if (objA == obj2) {
                }
                return obj2;
            }
            if (i15 == 1) {
                boolean z17 = r2Var.f164280c;
                sc2.k kVar4 = r2Var.f164279b;
                Context context4 = r2Var.f164278a;
                o13.r.b(obj);
                z15 = z17;
                context3 = context4;
                objA = obj;
                kVar2 = kVar4;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z16 = r2Var.f164280c;
                kVar3 = r2Var.f164279b;
                context2 = r2Var.f164278a;
                o13.r.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                accountK = k(context2);
                accountK.getClass();
                accountManager = AccountManager.get(context2);
                j2 j2Var = f164115a;
                a aVar = a.OAUTH1_CONNECT_USR_TOK;
                j2Var.getClass();
                accountManager.setUserData(accountK, e(context2, aVar), kVar3.f158523b.f158514a);
                accountManager.setUserData(accountK, e(context2, a.OAUTH1_CONNECT_USR_SEC), kVar3.f158523b.f158515b);
                if (z16) {
                    r("updateWithGC", accountManager, accountK, kVar3.f158522a);
                }
                userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                userData.getClass();
                packageName = context2.getPackageName();
                packageName.getClass();
                if (!d53.w.z(userData, packageName, false)) {
                    accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                }
            }
            return Unit.INSTANCE;
            ve2.d dVar = (ve2.d) objA;
            if (dVar == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            dVar.f177697h = kVar2.f158522a;
            dd2.a aVar2 = dVar.f177695f;
            if (aVar2 != null) {
                aVar2.f59204a = kVar2.f158523b;
            } else {
                dVar.f177695f = new dd2.a(kVar2.f158523b, null, null, 6, null);
            }
            g2.f164047a.getClass();
            g2.c(dVar);
            re2.l0 l0Var = re2.l0.f152316a;
            r2Var.f164278a = context3;
            r2Var.f164279b = kVar2;
            r2Var.f164280c = z15;
            r2Var.f164283f = 2;
            l0Var.getClass();
            Object objF = re2.l0.f(r2Var);
            if (objF != obj2) {
                kVar3 = kVar2;
                obj = objF;
                context2 = context3;
                z16 = z15;
                if (!((Boolean) obj).booleanValue()) {
                    accountK = k(context2);
                    accountK.getClass();
                    accountManager = AccountManager.get(context2);
                    j2 j2Var2 = f164115a;
                    a aVar3 = a.OAUTH1_CONNECT_USR_TOK;
                    j2Var2.getClass();
                    accountManager.setUserData(accountK, e(context2, aVar3), kVar3.f158523b.f158514a);
                    accountManager.setUserData(accountK, e(context2, a.OAUTH1_CONNECT_USR_SEC), kVar3.f158523b.f158515b);
                    if (z16) {
                        r("updateWithGC", accountManager, accountK, kVar3.f158522a);
                    }
                    userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                    userData.getClass();
                    packageName = context2.getPackageName();
                    packageName.getClass();
                    if (!d53.w.z(userData, packageName, false)) {
                        accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                    }
                }
                return Unit.INSTANCE;
            }
            return obj2;
        } catch (Throwable th3) {
            f164116b.error("updateWithGC", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0086, B:38:0x008e, B:40:0x00d5, B:20:0x003f, B:26:0x0054, B:28:0x0058, B:30:0x005c, B:32:0x006a, B:31:0x005f, B:43:0x00f3, B:44:0x00fa, B:23:0x0047), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0086, B:38:0x008e, B:40:0x00d5, B:20:0x003f, B:26:0x0054, B:28:0x0058, B:30:0x005c, B:32:0x006a, B:31:0x005f, B:43:0x00f3, B:44:0x00fa, B:23:0x0047), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00d5, please report this as an issue */
    public final Object y(Context context, sc2.o oVar, v13.c cVar) {
        s2 s2Var;
        Context context2;
        sc2.o oVar2;
        Account accountK;
        AccountManager accountManager;
        String userData;
        String packageName;
        if (cVar instanceof s2) {
            s2Var = (s2) cVar;
            int i14 = s2Var.f164299e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s2Var.f164299e = i14 - Integer.MIN_VALUE;
            } else {
                s2Var = new s2(this, cVar);
            }
        } else {
            s2Var = new s2(this, cVar);
        }
        Object objA = s2Var.f164297c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = s2Var.f164299e;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                s2Var.f164295a = context;
                s2Var.f164296b = oVar;
                s2Var.f164299e = 1;
                objA = a(context, s2Var);
                if (objA == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                oVar = s2Var.f164296b;
                context = s2Var.f164295a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar2 = s2Var.f164296b;
                context2 = s2Var.f164295a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                accountK = k(context2);
                accountManager = AccountManager.get(context2);
                j2 j2Var = f164115a;
                a aVar = a.OAUTH2_IT_ACS_TOK;
                j2Var.getClass();
                accountManager.setUserData(accountK, e(context2, aVar), oVar2.f158544a);
                accountManager.setUserData(accountK, e(context2, a.OAUTH2_IT_RFRSH_TOK), oVar2.f158546c);
                accountManager.setUserData(accountK, e(context2, a.OAUTH2_IT_ACS_TOK_EXP_UTC), String.valueOf(oVar2.f158545b));
                userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                userData.getClass();
                packageName = context2.getPackageName();
                packageName.getClass();
                if (!d53.w.z(userData, packageName, false)) {
                    accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                }
            }
            return Unit.INSTANCE;
            sc2.o oVar3 = oVar;
            ve2.d dVar = (ve2.d) objA;
            if (dVar == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            dd2.a aVar2 = dVar.f177695f;
            if (aVar2 != null) {
                aVar2.f59205b = oVar3;
            } else {
                dVar.f177695f = new dd2.a(null, oVar3, null, 5, null);
            }
            g2.f164047a.getClass();
            g2.c(dVar);
            re2.l0 l0Var = re2.l0.f152316a;
            s2Var.f164295a = context;
            s2Var.f164296b = oVar3;
            s2Var.f164299e = 2;
            l0Var.getClass();
            objA = re2.l0.f(s2Var);
            if (objA != obj) {
                context2 = context;
                oVar2 = oVar3;
                if (!((Boolean) objA).booleanValue()) {
                    accountK = k(context2);
                    accountManager = AccountManager.get(context2);
                    j2 j2Var2 = f164115a;
                    a aVar3 = a.OAUTH2_IT_ACS_TOK;
                    j2Var2.getClass();
                    accountManager.setUserData(accountK, e(context2, aVar3), oVar2.f158544a);
                    accountManager.setUserData(accountK, e(context2, a.OAUTH2_IT_RFRSH_TOK), oVar2.f158546c);
                    accountManager.setUserData(accountK, e(context2, a.OAUTH2_IT_ACS_TOK_EXP_UTC), String.valueOf(oVar2.f158545b));
                    userData = accountManager.getUserData(accountK, "SIGNED_IN_PACKAGES");
                    userData.getClass();
                    packageName = context2.getPackageName();
                    packageName.getClass();
                    if (!d53.w.z(userData, packageName, false)) {
                        accountManager.setUserData(accountK, "SIGNED_IN_PACKAGES", userData + ":" + context2.getPackageName());
                    }
                }
                return Unit.INSTANCE;
            }
            return obj;
        } catch (Throwable th3) {
            f164116b.error("updateWithIT", th3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:32:0x007d, B:34:0x0085, B:20:0x0042, B:26:0x0058, B:28:0x005c, B:37:0x009e, B:38:0x00a5, B:23:0x0049), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(Context context, ve2.k kVar, boolean z14, v13.c cVar) {
        t2 t2Var;
        Context context2;
        ve2.k kVar2;
        if (cVar instanceof t2) {
            t2Var = (t2) cVar;
            int i14 = t2Var.f164313f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t2Var.f164313f = i14 - Integer.MIN_VALUE;
            } else {
                t2Var = new t2(this, cVar);
            }
        } else {
            t2Var = new t2(this, cVar);
        }
        Object objA = t2Var.f164311d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = t2Var.f164313f;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                t2Var.f164308a = context;
                t2Var.f164309b = kVar;
                t2Var.f164310c = z14;
                t2Var.f164313f = 1;
                objA = a(context, t2Var);
                if (objA == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                z14 = t2Var.f164310c;
                kVar = t2Var.f164309b;
                context = t2Var.f164308a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z15 = t2Var.f164310c;
                kVar2 = t2Var.f164309b;
                context2 = t2Var.f164308a;
                o13.r.b(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                Account accountK = k(context2);
                accountK.getClass();
                AccountManager accountManager = AccountManager.get(context2);
                j2 j2Var = f164115a;
                accountManager.getClass();
                j2Var.getClass();
                r("updateWithMFA", accountManager, accountK, kVar2);
            }
            return Unit.INSTANCE;
            ve2.d dVar = (ve2.d) objA;
            if (dVar == null) {
                throw new Throwable("account does not exist and not in signin fallback mode");
            }
            dVar.f177697h = kVar;
            g2.f164047a.getClass();
            g2.c(dVar);
            re2.l0 l0Var = re2.l0.f152316a;
            t2Var.f164308a = context;
            t2Var.f164309b = kVar;
            t2Var.f164310c = z14;
            t2Var.f164313f = 2;
            l0Var.getClass();
            objA = re2.l0.f(t2Var);
            if (objA != obj) {
                ve2.k kVar3 = kVar;
                context2 = context;
                kVar2 = kVar3;
                if (!((Boolean) objA).booleanValue()) {
                    Account accountK2 = k(context2);
                    accountK2.getClass();
                    AccountManager accountManager2 = AccountManager.get(context2);
                    j2 j2Var2 = f164115a;
                    accountManager2.getClass();
                    j2Var2.getClass();
                    r("updateWithMFA", accountManager2, accountK2, kVar2);
                }
                return Unit.INSTANCE;
            }
            return obj;
        } catch (Throwable th3) {
            if (z14) {
                f164116b.error("updateWithMFA", th3);
            }
            throw th3;
        }
    }
}
