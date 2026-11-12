package org.koin.compose.module;

import e23.a;
import java.util.List;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.module.Module;
import p005kotlin.Metadata;
import p13.j0;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"", "unloadOnForgotten", "unloadOnAbandoned", "unloadModules", "Lkotlin/Function0;", "", "Lorg/koin/core/module/Module;", "modules", "", "rememberKoinModules", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ZLe23/a;Lp3/m;II)V", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberModulesKt {
    @KoinExperimentalAPI
    public static final void rememberKoinModules(Boolean bool, Boolean bool2, boolean z14, a<? extends List<Module>> aVar, m mVar, int i14, int i15) {
        mVar.L(-1703546888);
        if ((i15 & 1) != 0) {
            bool = null;
        }
        if ((i15 & 2) != 0) {
            bool2 = null;
        }
        if ((i15 & 4) != 0) {
            z14 = false;
        }
        if ((i15 & 8) != 0) {
            aVar = new a<List<? extends Module>>() { // from class: org.koin.compose.module.RememberModulesKt.rememberKoinModules.1
                @Override // e23.a
                public final List<? extends Module> invoke() {
                    return j0.f134944a;
                }
            };
        }
        Koin koin = KoinApplicationKt.getKoin(mVar, 0);
        mVar.L(23901297);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            List<Module> listInvoke = aVar.invoke();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : z14;
            if (bool2 != null) {
                z14 = bool2.booleanValue();
            }
            objQ = new CompositionKoinModuleLoader(listInvoke, koin, zBooleanValue, z14);
            mVar.K(objQ);
        }
        mVar.R();
        mVar.R();
    }
}
