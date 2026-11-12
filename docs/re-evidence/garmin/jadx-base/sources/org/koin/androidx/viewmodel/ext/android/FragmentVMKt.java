package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import o13.l;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ai\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\n\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\n\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "Lorg/koin/core/parameter/ParametersHolder;", "parameters", "Lo13/l;", "viewModel", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;Le23/a;)Lo13/l;", "getViewModel", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;Le23/a;)Landroidx/lifecycle/u1;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FragmentVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentVMKt$viewModel$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2<T> implements a<T> {
        final /* synthetic */ a<CreationExtras> $extrasProducer;
        final /* synthetic */ a<ViewModelStoreOwner> $ownerProducer;
        final /* synthetic */ a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, a<? extends ViewModelStoreOwner> aVar, a<? extends CreationExtras> aVar2, a<? extends ParametersHolder> aVar3) {
            this.$this_viewModel = fragment;
            this.$qualifier = qualifier;
            this.$ownerProducer = aVar;
            this.$extrasProducer = aVar2;
            this.$parameters = aVar3;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // e23.a
        public final u1 invoke() {
            Fragment fragment = this.$this_viewModel;
            a<ViewModelStoreOwner> aVar = this.$ownerProducer;
            a<CreationExtras> aVar2 = this.$extrasProducer;
            aVar.invoke().getF189591b();
            if (aVar2 == null || aVar2.invoke() == null) {
                fragment.getDefaultViewModelCreationExtras().getClass();
            }
            AndroidKoinScopeExtKt.getKoinScope(fragment);
            s.l();
            throw null;
        }
    }

    public static final <T extends u1> T getViewModel(Fragment fragment, Qualifier qualifier, a<? extends ViewModelStoreOwner> aVar, a<? extends CreationExtras> aVar2, a<? extends ParametersHolder> aVar3) {
        fragment.getClass();
        aVar.getClass();
        aVar.invoke().getF189591b();
        if (aVar2 == null || aVar2.invoke() == null) {
            fragment.getDefaultViewModelCreationExtras().getClass();
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        s.l();
        throw null;
    }

    public static u1 getViewModel$default(final Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = new a<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt.getViewModel.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // e23.a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i14 & 4) != 0) {
            aVar2 = null;
        }
        fragment.getClass();
        aVar.getClass();
        ((ViewModelStoreOwner) aVar.invoke()).getF189591b();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            fragment.getDefaultViewModelCreationExtras().getClass();
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        s.l();
        throw null;
    }

    public static final <T extends u1> l<T> viewModel(Fragment fragment, Qualifier qualifier, a<? extends ViewModelStoreOwner> aVar, a<? extends CreationExtras> aVar2, a<? extends ParametersHolder> aVar3) {
        fragment.getClass();
        aVar.getClass();
        n nVar = n.SYNCHRONIZED;
        s.l();
        throw null;
    }

    public static l viewModel$default(final Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = new a<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt.viewModel.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // e23.a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        fragment.getClass();
        aVar.getClass();
        n nVar = n.SYNCHRONIZED;
        s.l();
        throw null;
    }
}
