package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.adapter.SearchCommunityListAdapter;
import com.huami.wallet.accessdoor.databinding.FragmentSearchCommunityBinding;
import com.huami.wallet.accessdoor.fragment.SearchCommunityFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.viewmodel.SearchCommunityViewModel;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$¨\u0006("}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SearchCommunityFragment;", "Landroidx/fragment/app/Fragment;", "", z.j, "h", hl.k, GoogleApiAvailabilityLight.a, "m", "Lcom/huami/wallet/accessdoor/helper/Resource;", "integerResource", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/wallet/accessdoor/databinding/FragmentSearchCommunityBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/wallet/accessdoor/databinding/FragmentSearchCommunityBinding;", "binding", "Lcom/huami/wallet/accessdoor/adapter/SearchCommunityListAdapter;", "b", "Lcom/huami/wallet/accessdoor/adapter/SearchCommunityListAdapter;", "mAdapter", "Lcom/huami/wallet/accessdoor/viewmodel/SearchCommunityViewModel;", "Lkotlin/Lazy;", "g", "()Lcom/huami/wallet/accessdoor/viewmodel/SearchCommunityViewModel;", "searchCommunityViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", "Ljava/lang/String;", "type", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SearchCommunityFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SearchCommunityListAdapter mAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchCommunityViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(SearchCommunityFragment.this.getActivity(), SearchCommunityFragment.this.getResources().getString(R.string.access_door_search_tip));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchCommunityFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentSearchCommunityBinding;"));
        f = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCommunityFragment() {
        super(R.layout.fragment_search_community);
        this.binding = FragmentViewBindingKt.viewBinding(new SearchCommunityFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSearchCommunityBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.SearchCommunityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.searchCommunityViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SearchCommunityViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.SearchCommunityFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.SearchCommunityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SearchCommunityViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SearchCommunityViewModel.class), function0, objArr);
            }
        });
        this.mLoadingDialog = LazyKt__LazyJVMKt.lazy(new a());
        this.type = "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Resource<?> integerResource) {
        if (TextUtils.equals(integerResource.code, PayResponse.CODE_NETWORK_ERROR)) {
            IconToastHelper.showOrError(requireContext(), getResources().getString(R.string.access_no_network), integerResource);
            d();
        } else {
            IconToastHelper.showOrError(requireContext(), getResources().getString(R.string.access_access_door_loading_failure), integerResource);
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (f().isShowing()) {
            f().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSearchCommunityBinding e() {
        return (FragmentSearchCommunityBinding) this.binding.getValue(this, f[0]);
    }

    private final LoadingDialog f() {
        return (LoadingDialog) this.mLoadingDialog.getValue();
    }

    private final SearchCommunityViewModel g() {
        return (SearchCommunityViewModel) this.searchCommunityViewModel.getValue();
    }

    private final void h() {
        e().tvSearch.setOnClickListener(new View.OnClickListener() { // from class: bl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                SearchCommunityFragment.i(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SearchCommunityFragment searchCommunityFragment, View view) throws Exception {
        searchCommunityFragment.g().getSupportCommunity(searchCommunityFragment.type, StringsKt__StringsKt.trim(searchCommunityFragment.e().etSearch.getText()).toString());
    }

    private final void j() {
        LiveDataExtensionKt.observeResourceWithNotNull(g().getSearchCommunityLiveData(), this, new Function1<Resource<List<CommunityNameEntity>>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.SearchCommunityFragment$initObserver$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    iArr[Status.SUCCESS.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(@NotNull Resource<List<CommunityNameEntity>> resource) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i == 1) {
                    this.a.m();
                    return;
                }
                if (i != 2) {
                    this.a.c(resource);
                    return;
                }
                this.a.d();
                List<CommunityNameEntity> list = resource.data;
                if (list == null || list.size() != 0) {
                    TextView textView = this.a.e().tvCommunityCount;
                    Resources resources = this.a.getResources();
                    int i2 = R.plurals.access_door_search_count_tip;
                    List<CommunityNameEntity> list2 = resource.data;
                    int size = list2 == null ? 0 : list2.size();
                    Object[] objArr = new Object[1];
                    List<CommunityNameEntity> list3 = resource.data;
                    objArr[0] = Integer.valueOf(list3 == null ? 0 : list3.size());
                    SpannableString spannableString = new SpannableString(resources.getQuantityString(i2, size, objArr));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.a.requireActivity(), R.color.text_red));
                    List<CommunityNameEntity> list4 = resource.data;
                    spannableString.setSpan(foregroundColorSpan, 4, String.valueOf(list4 == null ? null : Integer.valueOf(list4.size())).length() + 4, 33);
                    Unit unit = Unit.INSTANCE;
                    textView.setText(spannableString);
                } else {
                    this.a.e().tvCommunityCount.setText(this.a.getResources().getString(R.string.access_door_not_support_community_tip));
                }
                SearchCommunityListAdapter searchCommunityListAdapter = this.a.mAdapter;
                Objects.requireNonNull(searchCommunityListAdapter);
                searchCommunityListAdapter.setNewData(resource.data);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<List<CommunityNameEntity>> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    private final void k() {
        e().recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        SearchCommunityListAdapter searchCommunityListAdapter = new SearchCommunityListAdapter();
        this.mAdapter = searchCommunityListAdapter;
        Objects.requireNonNull(searchCommunityListAdapter);
        searchCommunityListAdapter.bindToRecyclerView(e().recyclerview);
        SearchCommunityListAdapter searchCommunityListAdapter2 = this.mAdapter;
        Objects.requireNonNull(searchCommunityListAdapter2);
        searchCommunityListAdapter2.setNewData(new ArrayList());
        SearchCommunityListAdapter searchCommunityListAdapter3 = this.mAdapter;
        Objects.requireNonNull(searchCommunityListAdapter3);
        searchCommunityListAdapter3.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: cl6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                SearchCommunityFragment.l(this.a, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SearchCommunityFragment searchCommunityFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        FragmentActivity fragmentActivityRequireActivity = searchCommunityFragment.requireActivity();
        Intent intent = new Intent();
        SearchCommunityListAdapter searchCommunityListAdapter = searchCommunityFragment.mAdapter;
        Objects.requireNonNull(searchCommunityListAdapter);
        CommunityNameEntity item = searchCommunityListAdapter.getItem(i);
        fragmentActivityRequireActivity.setResult(1000, intent.putExtra("communityName", item == null ? null : item.getName()));
        searchCommunityFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (f().isShowing()) {
            return;
        }
        f().show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String stringExtra = requireActivity().getIntent().getStringExtra("communityType");
        if (stringExtra == null) {
            stringExtra = "1";
        }
        this.type = stringExtra;
        k();
        h();
        j();
    }
}
