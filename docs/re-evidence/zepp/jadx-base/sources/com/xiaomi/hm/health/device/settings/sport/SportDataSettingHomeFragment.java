package com.xiaomi.hm.health.device.settings.sport;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.settings.sport.SportDataSettingHomeFragment;
import com.xiaomi.hm.health.device.settings.sport.model.SportCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onActivityCreated", "onResume", "Lcom/xiaomi/hm/health/device/settings/sport/SportSettingViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/settings/sport/SportSettingViewModel;", "mViewModel", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment$a;", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment$a;", "mAdapter", "<init>", "()V", "CategoryHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportDataSettingHomeFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SportSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.settings.sport.SportDataSettingHomeFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.settings.sport.SportDataSettingHomeFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a mAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment$CategoryHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "category", "", "b", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "txtName", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class CategoryHolder extends RecyclerView.ViewHolder implements KoinComponent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy deviceXNavigator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView txtName;

        /* JADX WARN: Multi-variable type inference failed */
        public CategoryHolder(@NotNull View view) {
            super(view);
            LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
            final Qualifier qualifier = null;
            final Object[] objArr = 0 == true ? 1 : 0;
            this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.settings.sport.SportDataSettingHomeFragment$CategoryHolder$special$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final DeviceXNavigator getA() {
                    KoinComponent koinComponent = this;
                    return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
                }
            });
            this.txtName = (TextView) this.itemView.findViewById(R.id.text1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SportCategory sportCategory, CategoryHolder categoryHolder, View view) {
            Log.d("SportDataSettingHomeFragment", "To Category: " + sportCategory + ", SportTypes: " + ArraysUtil.toString(sportCategory.getSportTypes()), new Object[0]);
            categoryHolder.d().startMiliSportSettingActivity(categoryHolder.itemView.getContext(), sportCategory);
        }

        private final DeviceXNavigator d() {
            return (DeviceXNavigator) this.deviceXNavigator.getValue();
        }

        public final void b(@NotNull final SportCategory category) {
            this.txtName.setTextColor(-16777216);
            this.txtName.setText(category.getNameResId());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.settings.sport.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDataSettingHomeFragment.CategoryHolder.c(category, this, view);
                }
            });
        }

        @Override // org.koin.core.component.KoinComponent
        @NotNull
        public Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment$a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataSettingHomeFragment$CategoryHolder;", "", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "c", "holder", "position", "", "b", "", "Lcom/xiaomi/hm/health/device/settings/sport/model/SportCategory;", "a", "Ljava/util/List;", "()Ljava/util/List;", GoogleApiAvailabilityLight.a, "(Ljava/util/List;)V", "mCategories", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a extends RecyclerView.Adapter<CategoryHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private List<? extends SportCategory> mCategories = new ArrayList();

        @NotNull
        public final List<SportCategory> a() {
            return this.mCategories;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull CategoryHolder holder, int position) {
            holder.b(this.mCategories.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CategoryHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new CategoryHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item_1, parent, false));
        }

        public final void d(@NotNull List<? extends SportCategory> list) {
            this.mCategories = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.mCategories.size();
        }
    }

    private final SportSettingViewModel b() {
        return (SportSettingViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SportDataSettingHomeFragment sportDataSettingHomeFragment, List list) {
        a aVar = sportDataSettingHomeFragment.mAdapter;
        Objects.requireNonNull(aVar);
        aVar.d(list);
        a aVar2 = sportDataSettingHomeFragment.mAdapter;
        Objects.requireNonNull(aVar2);
        aVar2.notifyDataSetChanged();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mAdapter = new a();
        View view = getView();
        RecyclerView recyclerView = view == null ? null : (RecyclerView) view.findViewById(com.huami.devicex.R.id.recycler_view);
        if (recyclerView != null) {
            a aVar = this.mAdapter;
            Objects.requireNonNull(aVar);
            recyclerView.setAdapter(aVar);
        }
        b().getSportCategories().observe(getViewLifecycleOwner(), new Observer() { // from class: b87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDataSettingHomeFragment.c(this.a, (List) obj);
            }
        });
        b().loadCategories();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.devicex.R.layout.fragment_sport_data_setting_home, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof SportSettingHomeActivity)) {
            ((SportSettingHomeActivity) activity).setTitleText(com.huami.devicex.R.string.widget_sport_order);
        }
    }
}
