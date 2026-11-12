package org.koin.androidx.compose;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.joran.action.Action;
import e23.a;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\n\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "koinViewModel", "(Lorg/koin/core/qualifier/Qualifier;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/viewmodel/CreationExtras;Lorg/koin/core/scope/Scope;Le23/a;Lp3/m;II)Landroidx/lifecycle/u1;", "koin-androidx-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewModelKt {
    public static final <T extends u1> T koinViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, a<? extends ParametersHolder> aVar, m mVar, int i14, int i15) {
        mVar.L(-1614864554);
        if ((i15 & 2) != 0) {
            v9.a.f176280a.getClass();
            viewModelStoreOwner = v9.a.a(mVar);
            if (viewModelStoreOwner == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if ((i15 & 8) != 0) {
            CreationExtrasExtKt.defaultExtras(viewModelStoreOwner);
        }
        if ((i15 & 16) != 0) {
            KoinApplicationKt.currentKoinScope(mVar, 0);
        }
        s.l();
        throw null;
    }
}
