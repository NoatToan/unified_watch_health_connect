package com.xiaomi.phonenum.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, AccountCertification> f14016a = new HashMap();

    public static synchronized AccountCertification a(int i) {
        AccountCertification accountCertification = f14016a.get(Integer.valueOf(i));
        if (accountCertification == null) {
            return null;
        }
        return new AccountCertification(accountCertification.f14010a, accountCertification.f14011b, accountCertification.c, null);
    }

    public static synchronized void b(AccountCertification accountCertification) {
        f14016a.put(Integer.valueOf(accountCertification.f14010a), accountCertification);
    }

    public static synchronized void c(AccountCertification accountCertification) {
        AccountCertification accountCertificationA = a(accountCertification.f14010a);
        if (accountCertificationA == null) {
            return;
        }
        if (accountCertificationA.equals(accountCertification)) {
            f14016a.remove(Integer.valueOf(accountCertification.f14010a));
        }
    }
}
