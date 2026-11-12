package org.koin.androidx.viewmodel.ext.android;

import a11.p;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.a;
import k23.d;
import o13.l;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001a\b\u0002\u0010\r\u001a\u0014\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tj\u0004\u0018\u0001`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u008d\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\b\u0012\u00060\nj\u0002`\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tj\u0004\u0018\u0001`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Lb/g;", "Lk23/d;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Landroidx/core/bundle/Bundle;", "Lorg/koin/viewmodel/BundleDefinition;", RemoteConfigConstants.ResponseFieldKey.STATE, "", Action.KEY_ATTRIBUTE, "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "viewModelForClass", "(Lb/g;Lk23/d;Lorg/koin/core/qualifier/Qualifier;Landroidx/lifecycle/ViewModelStoreOwner;Le23/a;Ljava/lang/String;Le23/a;)Lo13/l;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lk23/d;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;Ljava/lang/String;Le23/a;)Lo13/l;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewModelLazyKt {
    public static final <T extends u1> l<T> viewModelForClass(g gVar, d<T> dVar, Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, a<Bundle> aVar, String str, a<? extends ParametersHolder> aVar2) {
        gVar.getClass();
        dVar.getClass();
        viewModelStoreOwner.getClass();
        return m.a(n.NONE, new av0.d(aVar, viewModelStoreOwner, gVar, dVar, viewModelStoreOwner.getF189591b(), str, qualifier, aVar2));
    }

    public static /* synthetic */ l viewModelForClass$default(Fragment fragment, d dVar, Qualifier qualifier, a aVar, a aVar2, String str, a aVar3, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = new ew2.a(fragment, 1);
        }
        if ((i14 & 8) != 0) {
            aVar2 = null;
        }
        if ((i14 & 16) != 0) {
            str = null;
        }
        if ((i14 & 32) != 0) {
            aVar3 = null;
        }
        return viewModelForClass(fragment, dVar, qualifier, (a<? extends ViewModelStoreOwner>) aVar, (a<Bundle>) aVar2, str, (a<? extends ParametersHolder>) aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 viewModelForClass$lambda$0(a aVar, ViewModelStoreOwner viewModelStoreOwner, g gVar, d dVar, y1 y1Var, String str, Qualifier qualifier, a aVar2) {
        CreationExtras extras;
        Bundle bundle;
        if (aVar == null || (bundle = (Bundle) aVar.invoke()) == null || (extras = org.koin.bundle.Bundle.toExtras(bundle, viewModelStoreOwner)) == null) {
            extras = CreationExtras.b.f8056c;
        }
        return GetViewModelKt.resolveViewModel(dVar, y1Var, str, extras, qualifier, AndroidKoinScopeExtKt.getKoinScope(gVar), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment viewModelForClass$lambda$1(Fragment fragment) {
        return fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 viewModelForClass$lambda$2(a aVar, a aVar2, Fragment fragment, d dVar, String str, Qualifier qualifier, a aVar3) {
        CreationExtras extras;
        Bundle bundle;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) aVar.invoke();
        y1 viewModelStore = viewModelStoreOwner.getF189591b();
        if (aVar2 == null || (bundle = (Bundle) aVar2.invoke()) == null || (extras = org.koin.bundle.Bundle.toExtras(bundle, viewModelStoreOwner)) == null) {
            extras = CreationExtras.b.f8056c;
        }
        return GetViewModelKt.resolveViewModel(dVar, viewModelStore, str, extras, qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), aVar3);
    }

    public static final <T extends u1> l<T> viewModelForClass(Fragment fragment, d<T> dVar, Qualifier qualifier, a<? extends ViewModelStoreOwner> aVar, a<Bundle> aVar2, String str, a<? extends ParametersHolder> aVar3) {
        fragment.getClass();
        dVar.getClass();
        aVar.getClass();
        return m.a(n.NONE, new p(aVar, aVar2, fragment, dVar, str, qualifier, aVar3, 5));
    }

    public static /* synthetic */ l viewModelForClass$default(g gVar, d dVar, Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, a aVar, String str, a aVar2, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            viewModelStoreOwner = gVar;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        if ((i14 & 16) != 0) {
            str = null;
        }
        if ((i14 & 32) != 0) {
            aVar2 = null;
        }
        return viewModelForClass(gVar, dVar, qualifier, viewModelStoreOwner, (a<Bundle>) aVar, str, (a<? extends ParametersHolder>) aVar2);
    }
}
