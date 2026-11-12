package com.xiaomi.fitness.showalldata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.adapter.DragItemLongClickCallback;
import com.xiaomi.fitness.common.recycer.adapter.ItemDragLongClickHelperCallback;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cyb;
import defpackage.eri;
import defpackage.iji;
import defpackage.ili;
import defpackage.jui;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b(\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\nR$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/showalldata/ManageHealthFunctionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/showalldata/ManageHealthFunctionViewModel;", "Lcyb;", "Lcom/xiaomi/fitness/common/recycer/adapter/DragItemLongClickCallback;", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "", "refreshMargin", "()V", "saveHealthData", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "loadData", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "onBackPressed", "()Z", "", "oldPosition", "newPosition", "onMove", "(II)Z", "clearView", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;", "mAdapter", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;", "getMAdapter", "()Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;", "setMAdapter", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;)V", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nManageHealthFunctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageHealthFunctionFragment.kt\ncom/xiaomi/fitness/showalldata/ManageHealthFunctionFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,213:1\n188#2,3:214\n*S KotlinDebug\n*F\n+ 1 ManageHealthFunctionFragment.kt\ncom/xiaomi/fitness/showalldata/ManageHealthFunctionFragment\n*L\n209#1:214,3\n*E\n"})
public final class ManageHealthFunctionFragment extends Hilt_ManageHealthFunctionFragment<ManageHealthFunctionViewModel, cyb> implements DragItemLongClickCallback {

    @Nullable
    private HealthShowAllDataAdapterV4 mAdapter;

    public ManageHealthFunctionFragment() {
        super(jui.t4);
    }

    private final GridLayoutManager getLayoutManager() {
        final int i;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            i = 3;
        } else {
            Context context = getContext();
            i = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 2 : 4;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment.getLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                Logger.i(BaseFragment.TAG, "getSpanSize,position = " + position);
                HealthShowAllDataAdapterV4 mAdapter = ManageHealthFunctionFragment.this.getMAdapter();
                Integer numValueOf = mAdapter != null ? Integer.valueOf(mAdapter.getItemViewType(position)) : null;
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    return 1;
                }
                return i;
            }
        });
        return gridLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ManageHealthFunctionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4 = this$0.mAdapter;
        if (healthShowAllDataAdapterV4 != null && healthShowAllDataAdapterV4.getHasChanged()) {
            this$0.saveHealthData();
        }
        this$0.finish();
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
    public final void saveHealthData() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.89.0.1.36273"), TuplesKt.to("name", "manage_health_functions_second_page_detail_save")));
        ((ManageHealthFunctionViewModel) getMViewModel()).onSaveEdit();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ToastExtKt.toastShort(fragmentActivityRequireActivity, c0j.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$2(final ManageHealthFunctionFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.mAdapter = new HealthShowAllDataAdapterV4(list, new HealthShowAllDataAdapterV4.OnItemClickListener() { // from class: com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment$setListener$1$1
            @Override // com.xiaomi.fitness.showalldata.HealthShowAllDataAdapterV4.OnItemClickListener
            public void onItemClick(int sportType, Bundle bundle) throws Throwable {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                HealthUtil healthUtil = HealthUtil.INSTANCE;
                healthUtil.goDataPage(this.this$0.requireActivity(), this.this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_SHOW_ALL_DATA);
                healthUtil.goDataPageCheckUserInfo(this.this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_SHOW_ALL_DATA);
            }
        }, new HealthShowAllDataAdapterV4.OnSaveItemClick() { // from class: com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment$setListener$1$2
            @Override // com.xiaomi.fitness.showalldata.HealthShowAllDataAdapterV4.OnSaveItemClick
            public void onSaveItemClick(int position) {
            }
        });
        ((cyb) this$0.getMBinding()).B.setAdapter(this$0.mAdapter);
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4 = this$0.mAdapter;
        if (healthShowAllDataAdapterV4 != null) {
            healthShowAllDataAdapterV4.notifyItemRangeChanged(0, list.size());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.common.recycer.adapter.DragItemLongClickCallback
    public void clearView() {
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4 = this.mAdapter;
        if (healthShowAllDataAdapterV4 != null) {
            healthShowAllDataAdapterV4.moveItemOver();
        }
        RecyclerView recyclerView = ((cyb) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment$clearView$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                HealthShowAllDataAdapterV4 mAdapter = this.this$0.getMAdapter();
                if (mAdapter != null) {
                    mAdapter.notifyDataSetChanged();
                }
            }
        }, 100L);
    }

    @Nullable
    public final HealthShowAllDataAdapterV4 getMAdapter() {
        return this.mAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        ((ManageHealthFunctionViewModel) getMViewModel()).loadData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4 = this.mAdapter;
        if (healthShowAllDataAdapterV4 == null) {
            return false;
        }
        Intrinsics.checkNotNull(healthShowAllDataAdapterV4);
        if (!healthShowAllDataAdapterV4.getHasChanged()) {
            return false;
        }
        new CommonDialog.c("save_health_card_order").setDialogDescription(c0j.J).setPositiveText(c0j.t5).setNegativeText(c0j.I).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    ManageHealthFunctionFragment.this.saveHealthData();
                    ManageHealthFunctionFragment.this.finish();
                    return;
                }
                HealthShowAllDataAdapterV4 mAdapter = ManageHealthFunctionFragment.this.getMAdapter();
                if (mAdapter != null) {
                    mAdapter.resetSortList();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                ManageHealthFunctionFragment.this.finish();
            }
        }).show(requireActivity().getSupportFragmentManager(), "");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((cyb) getMBinding()).B.setLayoutManager(getLayoutManager());
        refreshMargin();
    }

    @Override // com.xiaomi.fitness.common.recycer.adapter.DragItemLongClickCallback
    public boolean onMove(int oldPosition, int newPosition) {
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4 = this.mAdapter;
        Integer numValueOf = healthShowAllDataAdapterV4 != null ? Integer.valueOf(healthShowAllDataAdapterV4.getItemViewType(newPosition)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return false;
        }
        HealthShowAllDataAdapterV4 healthShowAllDataAdapterV5 = this.mAdapter;
        if (healthShowAllDataAdapterV5 != null) {
            healthShowAllDataAdapterV5.moveItemPosition(oldPosition, newPosition);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        View decorView;
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Logger.i(BaseFragment.TAG, "ManageHealthFunctionFragment onViewCreated");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.89.0.1.36272"), TuplesKt.to("name", "manage_health_functions_second_page_detail")));
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(eri.common_layout)) != null) {
            viewFindViewById.setBackgroundResource(iji.T2);
        }
        setTitle(c0j.J9);
        IActionBar.DefaultImpls.setEndView$default(this, 0, pni.W0, getString(c0j.Vq), new View.OnClickListener() { // from class: x2f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ManageHealthFunctionFragment.onViewCreated$lambda$1(this.f38612a, view2);
            }
        }, 1, null);
        ((cyb) getMBinding()).B.setLayoutManager(getLayoutManager());
        new l(new ItemDragLongClickHelperCallback(this)).d(((cyb) getMBinding()).B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        ((ManageHealthFunctionViewModel) getMViewModel()).getMAllDataLiveData().observe(getViewLifecycleOwner(), new ManageHealthFunctionFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ManageHealthFunctionFragment.setListener$lambda$2(this.f37480a, (List) obj);
            }
        }));
    }

    public final void setMAdapter(@Nullable HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4) {
        this.mAdapter = healthShowAllDataAdapterV4;
    }
}
