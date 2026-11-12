package org.koin.dsl;

import e23.l;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\n"}, d2 = {"", "createdAtStart", "Lkotlin/Function1;", "Lorg/koin/core/module/Module;", "", "Lorg/koin/dsl/ModuleDeclaration;", "moduleDeclaration", "module", "(ZLe23/l;)Lorg/koin/core/module/Module;", "ModuleDeclaration", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModuleDSLKt {
    @KoinDslMarker
    public static final Module module(boolean z14, l<? super Module, Unit> lVar) {
        lVar.getClass();
        Module module = new Module(z14);
        lVar.invoke(module);
        return module;
    }

    public static /* synthetic */ Module module$default(boolean z14, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        return module(z14, lVar);
    }
}
