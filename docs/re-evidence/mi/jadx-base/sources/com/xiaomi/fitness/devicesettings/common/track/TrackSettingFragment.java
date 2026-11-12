package com.xiaomi.fitness.devicesettings.common.track;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.track.TrackSettingFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.qyi;
import defpackage.ui6;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.yk6;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0007¢\u0006\u0004\b0\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/track/TrackSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel;", "Lui6;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackViewModel$TrackData;", "it", "", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;)V", "showEmptyView", "()V", "hideEmptyView", "initVMState", "initTitle", "initEndView", "onSelectChange", "showEndView", "hideEndView", "", "edit", "onEditModeChange", "(Z)V", "setClick", "showDelTrackConfirmDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "()Z", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter;", "adapter", "", "", "routerIds", "[Ljava/lang/String;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrackSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackSettingFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,270:1\n54#2,3:271\n24#2:274\n57#2,6:275\n63#2,2:282\n57#3:281\n*S KotlinDebug\n*F\n+ 1 TrackSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackSettingFragment\n*L\n144#1:271,3\n144#1:274\n144#1:275,6\n144#1:282,2\n144#1:281\n*E\n"})
public final class TrackSettingFragment extends BaseLoadableBindingFragment<TrackViewModel, ui6> {

    @NotNull
    public static final String TAG = "TrackSettingFragment";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kop
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrackSettingFragment.adapter_delegate$lambda$0(this.f24060a);
        }
    });

    @NotNull
    private String[] routerIds = new String[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ TrackViewModel access$getMViewModel(TrackSettingFragment trackSettingFragment) {
        return (TrackViewModel) trackSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackAdapter adapter_delegate$lambda$0(TrackSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new TrackAdapter(new TrackSettingFragment$adapter$2$1(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackAdapter getAdapter() {
        return (TrackAdapter) this.adapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideEmptyView() {
        ConstraintLayout noDataView = ((ui6) getMBinding()).A.B;
        Intrinsics.checkNotNullExpressionValue(noDataView, "noDataView");
        ViewExtKt.gone(noDataView);
        MoreRecyclerView recyclerView = ((ui6) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.visible(recyclerView);
    }

    private final void hideEndView() {
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        if (endView != null) {
            ViewExtKt.gone(endView);
        }
    }

    private final void initEndView() {
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.i0, getString(wzi.common_delete), new View.OnClickListener() { // from class: iop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackSettingFragment.initEndView$lambda$7(this.f21955a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEndView$lambda$7(TrackSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getAdapter().getIsEditing()) {
            this$0.getAdapter().selectAll(!view.isSelected());
        } else {
            this$0.getAdapter().setEditMode(true, false);
        }
    }

    private final void initTitle() {
        setTitle(wzi.C8);
        initEndView();
        IActionBar.DefaultImpls.setStartView$default(this, 0, jni.o1, getString(wzi.d), new View.OnClickListener() { // from class: jop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackSettingFragment.initTitle$lambda$6(this.f22982a, view);
            }
        }, 1, null);
        hideBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$6(TrackSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initEndView();
        this$0.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initVMState() {
        ((TrackViewModel) getMViewModel()).getViewStates().observe(requireActivity(), new TrackSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dop
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackSettingFragment.initVMState$lambda$2(this.f15749a, (StateData) obj);
            }
        }));
        ((TrackViewModel) getMViewModel()).getRouterData().observe(requireActivity(), new TrackSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: eop
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackSettingFragment.initVMState$lambda$3(this.f16892a, (String[]) obj);
            }
        }));
        ((TrackViewModel) getMViewModel()).getDeleteState().observe(requireActivity(), new TrackSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fop
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackSettingFragment.initVMState$lambda$4(this.f18020a, (StateData) obj);
            }
        }));
        ((TrackViewModel) getMViewModel()).getTracksCountOnDevice().observe(requireActivity(), new TrackSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gop
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackSettingFragment.initVMState$lambda$5(this.f19193a, (String[]) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVMState$lambda$2(TrackSettingFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "state: " + stateData);
        this$0.dismissDialog();
        if (stateData.g() || stateData.h()) {
            this$0.showEmptyView();
            this$0.hideEndView();
        } else if (stateData.j()) {
            this$0.showNoNetwork();
            this$0.hideEndView();
        } else if (stateData.k()) {
            Intrinsics.checkNotNull(stateData);
            this$0.onDataOK(stateData);
        } else if (stateData.i()) {
            String string = this$0.getString(wzi.Qa);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVMState$lambda$3(TrackSettingFragment this$0, String[] strArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "routerData: " + strArr);
        this$0.routerIds = strArr;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initVMState$lambda$4(TrackSettingFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stateData.h()) {
            this$0.dismissDialog();
            ToastUtil.INSTANCE.showToast(wzi.common_delete_failure);
            ((TrackViewModel) this$0.getMViewModel()).reqList();
        } else if (stateData.i()) {
            PageState.DefaultImpls.showLoading$default(this$0, wzi.common_deleting, false, 2, null);
        } else if (stateData.k()) {
            this$0.dismissDialog();
            Integer num = (Integer) stateData.f11668a;
            if (num != null && num.intValue() == 0) {
                ToastUtil.INSTANCE.showToast(wzi.common_delete_success);
            } else {
                TrackApi trackApiKt = TrackApiKt.getInstance(TrackApi.INSTANCE);
                T data = stateData.f11668a;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                trackApiKt.showTrackErrorToast(((Number) data).intValue());
            }
            ((TrackViewModel) this$0.getMViewModel()).reqList();
            if (this$0.getAdapter().getIsEditing()) {
                TrackAdapter.setEditMode$default(this$0.getAdapter(), false, false, 2, null);
                this$0.initEndView();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initVMState$lambda$5(TrackSettingFragment this$0, String[] strArr) {
        String bigIcon;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yk6 headerView = ((ui6) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(headerView, "headerView");
        ((TrackViewModel) this$0.getMViewModel()).getTracksCountOnDevice().getValue();
        ImageView headIcon = headerView.B;
        Intrinsics.checkNotNullExpressionValue(headIcon, "headIcon");
        TextView infoView = headerView.C;
        Intrinsics.checkNotNullExpressionValue(infoView, "infoView");
        ProgressBar progressBar = headerView.E;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (bigIcon = DeviceModelExtKt.getBigIcon(wearableDeviceModel)) == null) {
            bigIcon = "";
        }
        Coil.imageLoader(headIcon.getContext()).enqueue(new ImageRequest.Builder(headIcon.getContext()).data(bigIcon).target(headIcon).build());
        infoView.setText(this$0.getString(wzi.A8, strArr.length + "/20"));
        progressBar.setMax(20);
        progressBar.setProgress(strArr.length);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<TrackViewModel.CourseMeData> it) {
        showEndView();
        hideEmptyView();
        dismissDialog();
        showContent();
        MoreRecyclerView.setStatus$default(((ui6) getMBinding()).D, Status.DONE, false, 2, null);
        getAdapter().addData(it.f11668a.getFeeds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onEditModeChange(boolean edit) {
        ((ui6) getMBinding()).E.setText(getString(edit ? wzi.common_delete : wzi.B8));
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        wc0 miuiActionBar2 = getMiuiActionBar();
        View startView = miuiActionBar2 != null ? miuiActionBar2.getStartView() : null;
        if (!edit) {
            setTitle(wzi.C8);
            if (startView != null) {
                startView.setBackgroundResource(jni.o1);
                return;
            }
            return;
        }
        if (endView != null) {
            endView.setBackgroundResource(jni.p1);
            endView.setSelected(getAdapter().isAllChecked());
        }
        int selectedCount = getAdapter().getSelectedCount();
        String quantityString = getResources().getQuantityString(qyi.common_selected_num, selectedCount, Integer.valueOf(selectedCount));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
        if (startView != null) {
            startView.setBackgroundResource(jni.c0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectChange() {
        View endView;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setSelected(getAdapter().isAllChecked());
        }
        int selectedCount = getAdapter().getSelectedCount();
        String quantityString = getResources().getQuantityString(qyi.common_selected_num, selectedCount, Integer.valueOf(selectedCount));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TrackSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.onEditModeChange(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setClick() {
        ((ui6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: hop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackSettingFragment.setClick$lambda$9(this.f20297a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClick$lambda$9(TrackSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getAdapter().getIsEditing()) {
            TrackNetManagerKt.getInstance(TrackNet.INSTANCE).goTrackLibraryPage(this$0.routerIds);
            return;
        }
        Logger.i(TAG, "select ids is: " + this$0.getAdapter().getSelectIds());
        if (this$0.getAdapter().getSelectedCount() < 1) {
            ToastUtil.INSTANCE.showToast(wzi.E8);
        } else {
            this$0.showDelTrackConfirmDialog();
        }
    }

    private final void showDelTrackConfirmDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delTrack").setDialogTitle(wzi.z8).setDialogDescriptionString(new DialogParams.DialogDescriptionString(true, qyi.v, Integer.valueOf(getAdapter().getSelectedCount()))).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.track.TrackSettingFragment.showDelTrackConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                        ToastUtil.INSTANCE.showToast(wzi.D8);
                    } else {
                        TrackSettingFragment.access$getMViewModel(TrackSettingFragment.this).delete(TrackSettingFragment.this.getAdapter().getSelectIds());
                        TrackSettingFragment.this.onEditModeChange(false);
                    }
                }
            }
        });
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showEmptyView() {
        ConstraintLayout noDataView = ((ui6) getMBinding()).A.B;
        Intrinsics.checkNotNullExpressionValue(noDataView, "noDataView");
        ViewExtKt.visible(noDataView);
        MoreRecyclerView recyclerView = ((ui6) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    private final void showEndView() {
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        if (endView != null) {
            ViewExtKt.visible(endView);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.D0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (getAdapter().getIsEditing()) {
            TrackAdapter.setEditMode$default(getAdapter(), false, false, 2, null);
            initEndView();
            return true;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            return true;
        }
        mActivity.finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((TrackViewModel) getMViewModel()).reqList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        hideEmptyView();
        initTitle();
        setClick();
        initVMState();
        getAdapter().getEditState().observe(requireActivity(), new TrackSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lop
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackSettingFragment.onViewCreated$lambda$1(this.f25284a, (Boolean) obj);
            }
        }));
        ((ui6) getMBinding()).D.setAdapter(getAdapter());
        ((ui6) getMBinding()).D.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.devicesettings.common.track.TrackSettingFragment.onViewCreated.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                TrackSettingFragment.access$getMViewModel(TrackSettingFragment.this).reqList();
            }
        });
    }
}
