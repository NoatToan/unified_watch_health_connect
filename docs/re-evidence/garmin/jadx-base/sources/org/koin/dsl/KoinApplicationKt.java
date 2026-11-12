package org.koin.dsl;

import e23.l;
import org.koin.core.KoinApplication;
import org.koin.core.module.KoinApplicationDslMarker;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u0007\u001a\u00020\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\n*\"\u0010\u000b\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\f"}, d2 = {"", "createEagerInstances", "Lkotlin/Function1;", "Lorg/koin/core/KoinApplication;", "", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "koinApplication", "(ZLe23/l;)Lorg/koin/core/KoinApplication;", "(Le23/l;)Lorg/koin/core/KoinApplication;", "(Z)Lorg/koin/core/KoinApplication;", "KoinAppDeclaration", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinApplicationKt {
    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(boolean z14, l<? super KoinApplication, Unit> lVar) {
        KoinApplication koinApplicationInit = KoinApplication.INSTANCE.init();
        if (lVar != null) {
            lVar.invoke(koinApplicationInit);
        }
        if (z14) {
            koinApplicationInit.createEagerInstances();
        }
        return koinApplicationInit;
    }

    public static /* synthetic */ KoinApplication koinApplication$default(boolean z14, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        return koinApplication(z14, lVar);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(l<? super KoinApplication, Unit> lVar) {
        return koinApplication(true, lVar);
    }

    @KoinApplicationDslMarker
    public static final KoinApplication koinApplication(boolean z14) {
        return koinApplication(z14, null);
    }
}
