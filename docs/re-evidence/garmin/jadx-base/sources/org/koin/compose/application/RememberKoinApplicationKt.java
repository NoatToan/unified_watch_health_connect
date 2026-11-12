package org.koin.compose.application;

import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import p005kotlin.Metadata;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/core/KoinApplication;", "koinApplication", "Lorg/koin/core/Koin;", "rememberKoinApplication", "(Lorg/koin/core/KoinApplication;Lp3/m;I)Lorg/koin/core/Koin;", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberKoinApplicationKt {
    public static final Koin rememberKoinApplication(KoinApplication koinApplication, m mVar, int i14) {
        koinApplication.getClass();
        mVar.L(-2079726239);
        mVar.L(219101743);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CompositionKoinApplicationLoader(koinApplication);
            mVar.K(objQ);
        }
        mVar.R();
        Koin koin = ((CompositionKoinApplicationLoader) objQ).getKoinApplication().getKoin();
        mVar.R();
        return koin;
    }
}
