package re2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import o53.s0;
import org.slf4j.Logger;
import te2.g2;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements OnAccountsUpdateListener {
    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] accountArr) throws Throwable {
        Logger logger = b.f152216b;
        p005kotlin.jvm.internal.b bVarB = p005kotlin.jvm.internal.i.b(accountArr);
        while (bVarB.hasNext()) {
            Account account = (Account) bVarB.next();
            j2 j2Var = j2.f164115a;
            account.getClass();
            j2Var.getClass();
            String str = account.name;
            String str2 = j2.f164120f;
            if (str2 == null) {
                p005kotlin.jvm.internal.s.m("systemAccountName");
                throw null;
            }
            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                String str3 = account.type;
                String str4 = j2.f164119e;
                if (str4 == null) {
                    p005kotlin.jvm.internal.s.m("systemAccountPackageName");
                    throw null;
                }
                if (p005kotlin.jvm.internal.s.g(str3, str4)) {
                    Context contextB = b.f152215a.b();
                    ve2.l lVarM = b.m();
                    Logger logger2 = j2.f164116b;
                    lVarM.getClass();
                    boolean zO = j2Var.o(contextB, lVarM, true);
                    g2.f164047a.getClass();
                    ve2.d dVarA = g2.a();
                    if (zO || dVarA == null) {
                        if (dVarA != null) {
                            AccountManager accountManager = AccountManager.get(contextB);
                            accountManager.getClass();
                            String userData = accountManager.getUserData(account, "CUST_GUID");
                            if (userData == null) {
                                userData = "";
                            }
                            String str5 = dVarA.f177691b;
                            if (userData.equals(str5)) {
                                ve2.e eVarL = j2.l(accountManager, account);
                                ve2.e eVar = dVarA.f177690a;
                                if (eVarL != eVar) {
                                    logger2.debug("isAccountTransition: TRUE (environment mismatch -> sys acct " + eVarL + " != app " + eVar + ")");
                                }
                            } else {
                                logger2.debug(v.e0.g("isAccountTransition: TRUE (customer GUID mismatch -> sys acct ", userData, " != app ", str5, ")"));
                            }
                        }
                        logger.debug("sysAcctUpdateListener -> account transition false, nothing to do");
                        return;
                    }
                    logger2.debug("isAccountTransition: TRUE (user not signed in, but 'garminAccountFromPrefs' exists)");
                    logger.debug("sysAcctUpdateListener -> account transition true, calling 'signOut'...");
                    x53.c cVar = s0.f129406a;
                    ge1.b.W(x53.b.f189152a, new b.m(null));
                    return;
                }
            }
        }
        logger.debug("sysAcctUpdateListener -> no GARMIN system account available, calling 'signOut'...");
        x53.c cVar2 = s0.f129406a;
        ge1.b.W(x53.b.f189152a, new b.n(null));
    }
}
