package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.fragment.RemindOpenBusCardFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.viewmodel.RemindOpenBusCardViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001d\u0010&\u001a\u00020#8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/huami/wallet/ui/fragment/RemindOpenBusCardFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "e", "initViews", "initViewModel", "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/huami/wallet/ui/resource/IWalletRes;", "b", "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "Lkotlin/Lazy;", "f", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/repository/NoticeRepo;", GoogleApiAvailabilityLight.a, "g", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "mNoticeRepo", "Lcom/huami/wallet/ui/fragment/RemindOpenBusCardFragment$a;", "Lcom/huami/wallet/ui/fragment/RemindOpenBusCardFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/RemindOpenBusCardViewModel;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/RemindOpenBusCardViewModel;", "viewModel", "<init>", "()V", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemindOpenBusCardFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes = KoinModuleKt.deviceRes();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoticeRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final a mViewHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"com/huami/wallet/ui/fragment/RemindOpenBusCardFragment$a", "", "Landroid/view/View;", "a", "Landroid/view/View;", "()Landroid/view/View;", GoogleApiAvailabilityLight.a, "(Landroid/view/View;)V", "setupButton", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "f", "(Landroid/widget/TextView;)V", "title", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "e", "(Landroid/widget/ImageView;)V", "tipImageView", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private View setupButton;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private TextView title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private ImageView tipImageView;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getSetupButton() {
            return this.setupButton;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getTipImageView() {
            return this.tipImageView;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getTitle() {
            return this.title;
        }

        public final void d(@Nullable View view) {
            this.setupButton = view;
        }

        public final void e(@Nullable ImageView imageView) {
            this.tipImageView = imageView;
        }

        public final void f(@Nullable TextView textView) {
            this.title = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ImageView tipImageView = RemindOpenBusCardFragment.this.mViewHolder.getTipImageView();
            if (tipImageView == null) {
                return;
            }
            ViewExtensionKt.loadImage$default(tipImageView, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemindOpenBusCardFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RemindOpenBusCardFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mNoticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.RemindOpenBusCardFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.repository.NoticeRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NoticeRepo invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr2, objArr3);
            }
        });
        this.mViewHolder = new a();
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RemindOpenBusCardFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<RemindOpenBusCardViewModel>() { // from class: com.huami.wallet.ui.fragment.RemindOpenBusCardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.RemindOpenBusCardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RemindOpenBusCardViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(RemindOpenBusCardViewModel.class), function0, objArr5);
            }
        });
    }

    private final void e(View view) {
        this.mViewHolder.d(view.findViewById(R.id.setup_button));
        this.mViewHolder.e((ImageView) view.findViewById(R.id.tip_iv));
        this.mViewHolder.f((TextView) view.findViewById(R.id.wl_title));
    }

    private final NavigationController f() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final NoticeRepo g() {
        return (NoticeRepo) this.mNoticeRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(RemindOpenBusCardFragment remindOpenBusCardFragment, View view) {
        remindOpenBusCardFragment.i();
    }

    private final void i() {
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.wl_open_card_tips_title).setMessage(this.iWalletRes.getOpenCardTipsRes()).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: ab6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RemindOpenBusCardFragment.j(this.a, dialogInterface, i);
            }
        }).setCancelable(false).create().show(getChildFragmentManager());
    }

    private final void initViewModel() throws Exception {
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getBusImageUrlLiveData(), this, new b());
        getViewModel().getBusImageUrl(this.iWalletRes.getSwipingRes());
    }

    private final void initViews() {
        this.mViewHolder.getSetupButton().setOnClickListener(new View.OnClickListener() { // from class: bb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindOpenBusCardFragment.h(this.a, view);
            }
        });
        this.mViewHolder.getTitle().setText(this.iWalletRes.getRemindTitleRes());
        g().preLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RemindOpenBusCardFragment remindOpenBusCardFragment, DialogInterface dialogInterface, int i) {
        remindOpenBusCardFragment.f().navigateToBusCardList(remindOpenBusCardFragment.getContext(), null);
        remindOpenBusCardFragment.f().finishCurrentPage(remindOpenBusCardFragment.getContext());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final RemindOpenBusCardViewModel getViewModel() {
        return (RemindOpenBusCardViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_remind_open_bus_card, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        super.onViewCreated(view, savedInstanceState);
        e(view);
        initViews();
        initViewModel();
    }
}
