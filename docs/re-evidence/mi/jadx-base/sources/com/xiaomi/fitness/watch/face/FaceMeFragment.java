package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.memory.MemoryCache;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.watch.face.FaceMeFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment;
import com.xiaomi.fitness.watch.face.event.FaceDeleteEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListFragment;
import com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.av6;
import defpackage.ld8;
import defpackage.orf;
import defpackage.p1j;
import defpackage.so8;
import defpackage.t6a;
import defpackage.xli;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\ba\u0010\tJ\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0014¢\u0006\u0004\b,\u0010\tJ\u000f\u0010-\u001a\u00020\u0007H\u0014¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\tJ\u000f\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010\tR\u0014\u00103\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D\"\u0004\bE\u0010\u0017R$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\bO\u0010PR!\u0010V\u001a\b\u0012\u0004\u0012\u0002020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0016\u0010^\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010J¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceMeFragment;", "Lcom/xiaomi/fitness/watch/face/StateFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceMeViewModel;", "", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "Landroid/view/View$OnLongClickListener;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$OnCheckChangeListener;", "", "onWhiteListEntranceClick", "()V", "onDeleteClick", "delete", PluginDeviceInfo.FICONOFF, "onDataOk", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "selectAll", "(Z)V", "Lorf;", "event", "onMessageEvent", "(Lorf;)V", "v", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "edit", "resetEdit", "onChanged", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onVisible", "onInvisible", "viewModel", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceMeViewModel;", LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "getMAdapter", "()Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter;", "mAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "isInEdit", "Z", "()Z", "setInEdit", "Lt6a;", "_binding", "Lt6a;", "get_binding", "()Lt6a;", "set_binding", "(Lt6a;)V", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose", "Ljava/util/ArrayList;", "checkedIds$delegate", "getCheckedIds", "()Ljava/util/ArrayList;", "checkedIds", "", "mFaceMeVisibleTime", "J", "hasExecuted", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "getBinding", "binding", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceMeFragment extends Hilt_FaceMeFragment<FaceMeViewModel, List<? extends WatchFace>> implements View.OnLongClickListener, FaceAdapter.OnCheckChangeListener {

    @Nullable
    private t6a _binding;
    private boolean hasExecuted;
    private boolean isInEdit;
    private long mFaceMeVisibleTime;
    public RecyclerView mRecyclerView;

    @NotNull
    private final String TAG = "FaceMeFragment";

    /* JADX INFO: renamed from: mAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r39
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeFragment.mAdapter_delegate$lambda$0(this.f32137a);
        }
    });

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t39
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeFragment.trackExpose_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: checkedIds$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkedIds = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u39
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeFragment.checkedIds_delegate$lambda$11();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList checkedIds_delegate$lambda$11() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void delete() {
        showLoading();
        ((FaceMeViewModel) getViewModel()).delete(getCheckedIds());
    }

    private final t6a getBinding() {
        t6a t6aVar = this._binding;
        Intrinsics.checkNotNull(t6aVar);
        return t6aVar;
    }

    private final ArrayList<String> getCheckedIds() {
        return (ArrayList) this.checkedIds.getValue();
    }

    private final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceAdapter mAdapter_delegate$lambda$0(FaceMeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new FaceAdapter(this$0.getMActivity(), 1);
    }

    private final void onDeleteClick() {
        getCheckedIds().clear();
        int itemCount = getMAdapter().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (getMAdapter().getCheckedState().get(i)) {
                getCheckedIds().add(getMAdapter().getFaceId(i));
            }
        }
        if (!getCheckedIds().isEmpty()) {
            new CommonDialog.c("face_delete").setDialogDescription(p1j.z).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceMeFragment.onDeleteClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    if (which == -2) {
                        dialog.dismiss();
                    } else {
                        if (which != -1) {
                            return;
                        }
                        dialog.dismiss();
                        FaceMeFragment.this.delete();
                    }
                }
            }).showIfNeed(requireActivity().getSupportFragmentManager());
            return;
        }
        Context context = getContext();
        if (context != null) {
            String string = getString(p1j.b1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(context, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$2(FaceMeFragment this$0, Boolean bool) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Fragment fragmentRequireParentFragment = this$0.requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.FaceFragment");
        ((FaceFragment) fragmentRequireParentFragment).setEditMode(false);
        Iterator<String> it = this$0.getCheckedIds().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            FaceManager.INSTANCE.delete(next);
        }
        FaceMeViewModel faceMeViewModel = (FaceMeViewModel) this$0.getViewModel();
        WearableDeviceModel device = this$0.getDevice();
        FaceMeViewModel.requestData$default(faceMeViewModel, (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getModel(), false, 2, null);
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, p1j.common_delete_success);
        }
        ld8.c().l(new FaceDeleteEvent());
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(FaceMeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            this$0.hasExecuted = true;
        }
        Intrinsics.checkNotNull(list);
        this$0.onDataOk((List<WatchFace>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FaceMeFragment this$0, StateData.Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this$0.getBinding().J.showContent();
        } else if (i == 2) {
            StateLayout.showLoading$default(this$0.getBinding().J, 0, null, 3, null);
        } else if (i != 3) {
            StateLayout.showError$default(this$0.getBinding().J, null, 1, null);
        } else {
            StateLayout.showEmpty$default(this$0.getBinding().J, 0, null, 0, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(FaceMeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView designerEntrance = this$0.getBinding().F;
        Intrinsics.checkNotNullExpressionValue(designerEntrance, "designerEntrance");
        Intrinsics.checkNotNull(bool);
        ViewExtKt.setVisible(designerEntrance, bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(FaceMeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, FacePaidListFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(FaceMeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, FaceDesignerFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(FaceMeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onWhiteListEntranceClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(FaceMeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDeleteClick();
    }

    private final void onWhiteListEntranceClick() {
        Bundle bundle = new Bundle();
        bundle.putInt(FaceTabListFragment.TAB_TYPE, 5);
        bundle.putString(FaceTabListFragment.TAB_ID, "WhiteListType");
        Context context = getContext();
        if (context != null) {
            FaceExtKt.gotoPage(context, FaceTabListFragment.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$1() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    @NotNull
    public final FaceAdapter getMAdapter() {
        return (FaceAdapter) this.mAdapter.getValue();
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    @Nullable
    public final t6a get_binding() {
        return this._binding;
    }

    /* JADX INFO: renamed from: isInEdit, reason: from getter */
    public final boolean getIsInEdit() {
        return this.isInEdit;
    }

    @Override // com.xiaomi.fitness.watch.face.adapter.FaceAdapter.OnCheckChangeListener
    public void onChanged() {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.FaceFragment");
        ((FaceFragment) fragmentRequireParentFragment).onCheckChanged();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FaceIcon.syncConfiguration();
        getMRecyclerView().invalidateItemDecorations();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getTrackExpose().endTrackItemExpose(getMRecyclerView());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = t6a.A0(inflater, container, false);
        setMRecyclerView(getBinding().H);
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        String model;
        String firmwareVersion;
        super.onInvisible();
        if (this.mFaceMeVisibleTime <= 0) {
            Logger.i("FaceMeFragment startTime <= 0", new Object[0]);
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mFaceMeVisibleTime) / ((long) 1000);
        this.mFaceMeVisibleTime = 0L;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.47.1.1.19538");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "my_watchface_page";
        objArr[2] = "duration_sec";
        objArr[3] = Long.valueOf(jCurrentTimeMillis);
        objArr[4] = "device_model";
        WearableDeviceModel device = getDevice();
        String str = "";
        if (device == null || (model = DeviceModelExtKt.getModel(device)) == null) {
            model = "";
        }
        objArr[5] = model;
        objArr[6] = "device_version";
        WearableDeviceModel device2 = getDevice();
        if (device2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(device2)) != null) {
            str = firmwareVersion;
        }
        objArr[7] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@Nullable View v) {
        Logger.d(this.TAG, "onLongClick: " + this.isInEdit);
        if (this.isInEdit) {
            return false;
        }
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.FaceFragment");
        ((FaceFragment) fragmentRequireParentFragment).setEditMode(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.StateFragment
    public void onMessageEvent(@NotNull orf event) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(event, "event");
        if (getDevice() == null) {
            return;
        }
        if ((event instanceof FaceReSycEvent) || (event instanceof FaceDeleteEvent)) {
            Logger.d(this.TAG, "onMessageEvent: " + event);
            FaceMeViewModel faceMeViewModel = (FaceMeViewModel) getViewModel();
            WearableDeviceModel device = getDevice();
            faceMeViewModel.requestData((device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getModel(), false);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            MemoryCache memoryCache = Coil.imageLoader(ApplicationExtKt.getApplication()).getMemoryCache();
            if (memoryCache != null) {
                memoryCache.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.watch.face.StateFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getDevice() == null) {
            onError(p1j.common_hint_unkonwn_error);
            return;
        }
        boolean z = false;
        setActionBarDisplayable(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), FaceManager.getListCount());
        getMRecyclerView().addItemDecoration(new so8(FaceIcon.LIST_SPACE, 1, false).c(ExtUtilsKt.getDp(22)));
        getMRecyclerView().setLayoutManager(gridLayoutManager);
        getMRecyclerView().setAdapter(getMAdapter());
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(getTrackExpose(), getMRecyclerView(), 0, null, 6, null);
        WearableDeviceModel device = getDevice();
        if (device != null && DeviceModelExtKt.isHuaMi(device)) {
            getMAdapter().setOnLongClickListener(this, this);
        }
        ((FaceMeViewModel) getViewModel()).getDeleteLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: v39
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FaceMeFragment.onViewCreated$lambda$2(this.f36432a, (Boolean) obj);
            }
        });
        ((FaceMeViewModel) getViewModel()).getFaceMeData().observe(getViewLifecycleOwner(), new FaceMeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w39
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceMeFragment.onViewCreated$lambda$3(this.f37508a, (List) obj);
            }
        }));
        ((FaceMeViewModel) getViewModel()).getPageLiveData().observe(getViewLifecycleOwner(), new FaceMeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: x39
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceMeFragment.onViewCreated$lambda$4(this.f38636a, (StateData.Status) obj);
            }
        }));
        ((FaceMeViewModel) getViewModel()).getDesignerWhiteList().observe(getViewLifecycleOwner(), new FaceMeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y39
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceMeFragment.onViewCreated$lambda$5(this.f39745a, (Boolean) obj);
            }
        }));
        View root = getBinding().I.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        if (ConfigPreference.INSTANCE.getSHOW_WATCH_FACE_PRICE() && !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            z = true;
        }
        ViewExtKt.setVisible(root, z);
        getBinding().I.getRoot().setOnClickListener(new View.OnClickListener() { // from class: z39
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceMeFragment.onViewCreated$lambda$6(this.f40833a, view2);
            }
        });
        getBinding().F.setOnClickListener(new View.OnClickListener() { // from class: a49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceMeFragment.onViewCreated$lambda$7(this.f598a, view2);
            }
        });
        TextView whiteListEntrance = getBinding().K;
        Intrinsics.checkNotNullExpressionValue(whiteListEntrance, "whiteListEntrance");
        ViewExtKt.setVisible(whiteListEntrance, FacePreference.INSTANCE.getFACE_USER_IN_WHITE_LIST());
        getBinding().K.setOnClickListener(new View.OnClickListener() { // from class: b49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceMeFragment.onViewCreated$lambda$8(this.f3782a, view2);
            }
        });
        getBinding().E.setOnClickListener(new View.OnClickListener() { // from class: s39
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceMeFragment.onViewCreated$lambda$9(this.f33234a, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        WearableDeviceInfo deviceInfo;
        super.onVisible();
        this.mFaceMeVisibleTime = System.currentTimeMillis();
        if (getDevice() == null) {
            onError(p1j.common_hint_unkonwn_error);
        } else {
            if (this.hasExecuted) {
                return;
            }
            FaceMeViewModel faceMeViewModel = (FaceMeViewModel) getViewModel();
            WearableDeviceModel device = getDevice();
            FaceMeViewModel.requestData$default(faceMeViewModel, (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getModel(), false, 2, null);
            ((FaceMeViewModel) getViewModel()).checkDesignerWhiteList();
        }
    }

    public final void resetEdit(boolean edit) {
        ConstraintLayout deleteView = getBinding().E;
        Intrinsics.checkNotNullExpressionValue(deleteView, "deleteView");
        ViewExtKt.setVisible(deleteView, edit);
        this.isInEdit = edit;
        getMAdapter().setEditMode(edit);
        getMAdapter().selectAll(false);
        ViewGroup.LayoutParams layoutParams = getMRecyclerView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin = edit ? ExtUtilsKt.getDimension(xli.f39246b) : 0;
    }

    public final void selectAll(boolean selectAll) {
        getMAdapter().selectAll(selectAll);
    }

    public final void setInEdit(boolean z) {
        this.isInEdit = z;
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void set_binding(@Nullable t6a t6aVar) {
        this._binding = t6aVar;
    }

    @Override // com.xiaomi.fitness.watch.face.StateFragment
    public void onDataOk(@NotNull List<WatchFace> d) {
        Intrinsics.checkNotNullParameter(d, "d");
        getMAdapter().submitList(CollectionsKt___CollectionsKt.toList(d));
    }

    @Override // com.xiaomi.fitness.watch.face.StateFragment
    @NotNull
    public FaceMeViewModel viewModel() {
        return (FaceMeViewModel) new ViewModelProvider(this).get(FaceMeViewModel.class);
    }
}
