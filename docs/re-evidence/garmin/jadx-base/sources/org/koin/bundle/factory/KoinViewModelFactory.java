package org.koin.bundle.factory;

import a03.e;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import ch.qos.logback.core.joran.action.Action;
import e23.a;
import k23.d;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lorg/koin/viewmodel/factory/KoinViewModelFactory;", "Landroidx/lifecycle/x1$c;", "Lk23/d;", "Landroidx/lifecycle/u1;", "kClass", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "params", "<init>", "(Lk23/d;Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Le23/a;)V", "T", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Lk23/d;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/u1;", "Lk23/d;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "Le23/a;", "koin-core-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KoinViewModelFactory implements x1.c {
    private final d<? extends u1> kClass;
    private final a<ParametersHolder> params;
    private final Qualifier qualifier;
    private final Scope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public KoinViewModelFactory(d<? extends u1> dVar, Scope scope, Qualifier qualifier, a<? extends ParametersHolder> aVar) {
        dVar.getClass();
        scope.getClass();
        this.kClass = dVar;
        this.scope = scope;
        this.qualifier = qualifier;
        this.params = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParametersHolder create$lambda$0(AndroidParametersHolder androidParametersHolder) {
        return androidParametersHolder;
    }

    @Override // androidx.lifecycle.x1.c
    public <T extends u1> T create(d<T> modelClass, CreationExtras extras) {
        modelClass.getClass();
        extras.getClass();
        return (T) this.scope.get(this.kClass, this.qualifier, new e(new AndroidParametersHolder(this.params, extras), 2));
    }

    public /* synthetic */ KoinViewModelFactory(d dVar, Scope scope, Qualifier qualifier, a aVar, int i14, j jVar) {
        this(dVar, scope, (i14 & 4) != 0 ? null : qualifier, (i14 & 8) != 0 ? null : aVar);
    }

    @Override // androidx.lifecycle.x1.c
    public /* bridge */ /* synthetic */ u1 create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.x1.c
    public /* bridge */ /* synthetic */ u1 create(Class cls) {
        super.create(cls);
        throw null;
    }
}
