package com.xiaomi.fitness.showalldata;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.showalldata.HealthShowAllDataFragment;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.cyb;
import defpackage.eri;
import defpackage.iji;
import defpackage.ili;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataViewModel;", "Lcyb;", "", "onRightImageClick", "()V", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "refreshMargin", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "loadData", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;", "mAdapter", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;)V", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthShowAllDataFragment extends Hilt_HealthShowAllDataFragment<HealthShowAllDataViewModel, cyb> {

    @Nullable
    private HealthShowAllDataAdapter mAdapter;

    public HealthShowAllDataFragment() {
        super(jui.t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HealthShowAllDataViewModel access$getMViewModel(HealthShowAllDataFragment healthShowAllDataFragment) {
        return (HealthShowAllDataViewModel) healthShowAllDataFragment.getMViewModel();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private final GridLayoutManager getLayoutManager() {
        int i;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            i = 2;
        } else {
            Context context = getContext();
            i = 1;
            if (context != null && UIUtils.INSTANCE.isTabletAndLandscape(context)) {
                i = 2;
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.showalldata.HealthShowAllDataFragment.getLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        return gridLayoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRightImageClick() {
        ((HealthShowAllDataViewModel) getMViewModel()).onSaveEdit();
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, c0j.common_set_success);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshMargin() {
        int dimen = (int) BaseFragmentExtKt.getDimen(this, ili.j);
        int dimen2 = (int) BaseFragmentExtKt.getDimen(this, ili.f21276k);
        ViewGroup.LayoutParams layoutParams = ((cyb) getMBinding()).A.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen2, marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$0(final HealthShowAllDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.mAdapter = new HealthShowAllDataAdapter(list, new HealthShowAllDataAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.showalldata.HealthShowAllDataFragment$setListener$1$1
            @Override // com.xiaomi.fitness.showalldata.HealthShowAllDataAdapter.OnItemClickListener
            public void onItemClick(int sportType, Bundle bundle) throws Throwable {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                HealthUtil healthUtil = HealthUtil.INSTANCE;
                healthUtil.goDataPage(this.this$0.requireActivity(), this.this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_SHOW_ALL_DATA);
                healthUtil.goDataPageCheckUserInfo(this.this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_SHOW_ALL_DATA);
            }
        }, new HealthShowAllDataAdapter.OnSaveItemClick() { // from class: com.xiaomi.fitness.showalldata.HealthShowAllDataFragment$setListener$1$2
            @Override // com.xiaomi.fitness.showalldata.HealthShowAllDataAdapter.OnSaveItemClick
            public void onSaveItemClick(int position) {
                HealthShowAllDataFragment.access$getMViewModel(this.this$0).onSaveEdit();
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.89.0.1.36273"), TuplesKt.to("name", "manage_health_functions_second_page_detail_save")));
            }
        });
        ((cyb) this$0.getMBinding()).B.setAdapter(this$0.mAdapter);
        HealthShowAllDataAdapter healthShowAllDataAdapter = this$0.mAdapter;
        if (healthShowAllDataAdapter != null) {
            healthShowAllDataAdapter.notifyItemRangeChanged(0, list.size());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final HealthShowAllDataAdapter getMAdapter() {
        return this.mAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        ((HealthShowAllDataViewModel) getMViewModel()).loadData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((cyb) getMBinding()).B.setLayoutManager(getLayoutManager());
        refreshMargin();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        View decorView;
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(eri.common_layout)) != null) {
            viewFindViewById.setBackgroundResource(iji.T2);
        }
        setTitle(c0j.N);
        ((cyb) getMBinding()).B.setLayoutManager(getLayoutManager());
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.89.0.1.36272"), TuplesKt.to("name", "manage_health_functions_second_page_detail")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        ((HealthShowAllDataViewModel) getMViewModel()).getMAllDataLiveData().observe(getViewLifecycleOwner(), new HealthShowAllDataFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e1c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthShowAllDataFragment.setListener$lambda$0(this.f16151a, (List) obj);
            }
        }));
    }

    public final void setMAdapter(@Nullable HealthShowAllDataAdapter healthShowAllDataAdapter) {
        this.mAdapter = healthShowAllDataAdapter;
    }
}
