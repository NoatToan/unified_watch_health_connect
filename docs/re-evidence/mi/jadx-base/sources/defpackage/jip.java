package defpackage;

import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.account.token.TokenManagerImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class jip {
    public static void a(TokenManagerImpl tokenManagerImpl, IMiAccountManager iMiAccountManager) {
        tokenManagerImpl.mAccessManager = iMiAccountManager;
    }
}
