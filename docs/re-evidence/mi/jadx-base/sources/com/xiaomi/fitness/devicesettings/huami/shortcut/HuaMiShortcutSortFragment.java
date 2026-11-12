package com.xiaomi.fitness.devicesettings.huami.shortcut;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilderKt;
import com.xiaomi.fitness.devicesettings.common.extensions.ListExtensionKt;
import com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutSortFragment;
import com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListItem;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.naa;
import defpackage.nuf;
import defpackage.wzi;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u001e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b%\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u000bR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutSortFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutViewModel;", "Lnaa;", "", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "data", "", "bindData", "(Ljava/util/List;)V", "onImgRightClick", "()V", "onImgBackClick", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mHuaMiDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter;", "mShortcutAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter;", "com/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutSortFragment$mItemTouchCallback$1", "mItemTouchCallback", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/HuaMiShortcutSortFragment$mItemTouchCallback$1;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiShortcutSortFragment extends BaseBindingFragment<HuaMiShortcutViewModel, naa> {

    @Nullable
    private WearableDeviceModel mHuaMiDeviceModel;

    @NotNull
    private final HuaMiShortcutSortFragment$mItemTouchCallback$1 mItemTouchCallback = new l.h() { // from class: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutSortFragment$mItemTouchCallback$1
        {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(target, "target");
            ShortcutListAdapter shortcutListAdapter = this.this$0.mShortcutAdapter;
            if (shortcutListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
                shortcutListAdapter = null;
            }
            List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            int bindingAdapterPosition = target.getBindingAdapterPosition();
            ShortcutListItem shortcutListItem = currentList.get(current.getBindingAdapterPosition());
            ShortcutListItem shortcutListItem2 = currentList.get(bindingAdapterPosition);
            if (bindingAdapterPosition == 0 || Intrinsics.areEqual(shortcutListItem, shortcutListItem2)) {
                return false;
            }
            if (!shortcutListItem.isAlwaysShown() || shortcutListItem2.getEnable()) {
                return (shortcutListItem2.getType() != 0 || shortcutListItem2.getEnable() || shortcutListItem.getTargetIndex() >= shortcutListItem2.getTargetIndex()) && !shortcutListItem2.isAlwaysShown();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.l.e
        public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            super.clearView(recyclerView, viewHolder);
            nuf.c(viewHolder.itemView);
            if (recyclerView.isComputingLayout()) {
                return;
            }
            ShortcutListAdapter shortcutListAdapter = this.this$0.mShortcutAdapter;
            if (shortcutListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
                shortcutListAdapter = null;
            }
            List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            List<ShortcutListItem> listDeepCopy = ListExtensionKt.deepCopy(currentList);
            listDeepCopy.get(viewHolder.getBindingAdapterPosition()).setDragging(false);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(listDeepCopy, HuaMiShortcutSortFragment.access$getMViewModel(this.this$0).getShortcutItemComparator());
            this.this$0.bindData(listDeepCopy);
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean isLongPressDragEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            int bindingAdapterPosition2 = target.getBindingAdapterPosition();
            ShortcutListAdapter shortcutListAdapter = this.this$0.mShortcutAdapter;
            ShortcutListAdapter shortcutListAdapter2 = null;
            if (shortcutListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
                shortcutListAdapter = null;
            }
            List<ShortcutListItem> currentMutableList = shortcutListAdapter.getCurrentMutableList();
            if (currentMutableList == null) {
                return true;
            }
            currentMutableList.get(bindingAdapterPosition).setDragging(true);
            if (bindingAdapterPosition >= bindingAdapterPosition2) {
                int i = bindingAdapterPosition2 + 1;
                if (i <= bindingAdapterPosition) {
                    int i2 = bindingAdapterPosition;
                    while (true) {
                        int i3 = i2 - 1;
                        if (currentMutableList.get(i3).getType() == 1) {
                            currentMutableList.get(i2).setEnable(true);
                        }
                        Collections.swap(currentMutableList, i2, i3);
                        if (i2 == i) {
                            break;
                        }
                        i2--;
                    }
                }
            } else {
                int i4 = bindingAdapterPosition;
                while (i4 < bindingAdapterPosition2) {
                    int i5 = i4 + 1;
                    if (currentMutableList.get(i5).getType() == 1) {
                        currentMutableList.get(i4).setEnable(false);
                    }
                    Collections.swap(currentMutableList, i4, i5);
                    i4 = i5;
                }
            }
            if (!recyclerView.isComputingLayout()) {
                ShortcutListAdapter shortcutListAdapter3 = this.this$0.mShortcutAdapter;
                if (shortcutListAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
                } else {
                    shortcutListAdapter2 = shortcutListAdapter3;
                }
                shortcutListAdapter2.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onSwiped(RecyclerView.d0 viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    };
    private ShortcutListAdapter mShortcutAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HuaMiShortcutViewModel access$getMViewModel(HuaMiShortcutSortFragment huaMiShortcutSortFragment) {
        return (HuaMiShortcutViewModel) huaMiShortcutSortFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData(List<ShortcutListItem> data) {
        hideLoading();
        ShortcutListAdapter shortcutListAdapter = this.mShortcutAdapter;
        if (shortcutListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
            shortcutListAdapter = null;
        }
        shortcutListAdapter.submitList(data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onImgBackClick() {
        HuaMiShortcutViewModel huaMiShortcutViewModel = (HuaMiShortcutViewModel) getMViewModel();
        ShortcutListAdapter shortcutListAdapter = this.mShortcutAdapter;
        if (shortcutListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
            shortcutListAdapter = null;
        }
        List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (huaMiShortcutViewModel.isListChanged(currentList)) {
            new CommonDialog.c("huami shortcut exit").setDialogDescription(wzi.Z).setPositiveText(wzi.O1).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.shortcut.HuaMiShortcutSortFragment.onImgBackClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else {
                        if (which != -1) {
                            return;
                        }
                        HuaMiShortcutSortFragment huaMiShortcutSortFragment = HuaMiShortcutSortFragment.this;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        huaMiShortcutSortFragment.finish();
                    }
                }
            }).showIfNeed(getParentFragmentManager());
        } else {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onImgRightClick() {
        HuaMiShortcutViewModel huaMiShortcutViewModel = (HuaMiShortcutViewModel) getMViewModel();
        ShortcutListAdapter shortcutListAdapter = this.mShortcutAdapter;
        ShortcutListAdapter shortcutListAdapter2 = null;
        if (shortcutListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
            shortcutListAdapter = null;
        }
        List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (!huaMiShortcutViewModel.isListChanged(currentList)) {
            finish();
            return;
        }
        PageState.DefaultImpls.showLoading$default(this, wzi.a0, false, 2, null);
        HuaMiShortcutViewModel huaMiShortcutViewModel2 = (HuaMiShortcutViewModel) getMViewModel();
        ShortcutListAdapter shortcutListAdapter3 = this.mShortcutAdapter;
        if (shortcutListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
        } else {
            shortcutListAdapter2 = shortcutListAdapter3;
        }
        List<ShortcutListItem> currentList2 = shortcutListAdapter2.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
        huaMiShortcutViewModel2.saveList(currentList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(HuaMiShortcutSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgBackClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(HuaMiShortcutSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgRightClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(HuaMiShortcutSortFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.bindData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(HuaMiShortcutSortFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        if (bool.booleanValue()) {
            HuaMiShortcutViewModel huaMiShortcutViewModel = (HuaMiShortcutViewModel) this$0.getMViewModel();
            ShortcutListAdapter shortcutListAdapter = this$0.mShortcutAdapter;
            if (shortcutListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
                shortcutListAdapter = null;
            }
            List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            huaMiShortcutViewModel.setDisplayDataList(currentList);
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$4(HuaMiShortcutSortFragment this$0, ShortcutListItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        HuaMiShortcutViewModel huaMiShortcutViewModel = (HuaMiShortcutViewModel) this$0.getMViewModel();
        ShortcutListAdapter shortcutListAdapter = this$0.mShortcutAdapter;
        if (shortcutListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
            shortcutListAdapter = null;
        }
        List<ShortcutListItem> currentList = shortcutListAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        huaMiShortcutViewModel.handleItemIconClicked(ListExtensionKt.deepCopy(currentList), it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.w2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        showLoading();
        ((HuaMiShortcutViewModel) getMViewModel()).loadData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.mHuaMiDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.ia);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, ActionBarParamBuilderKt.defaultActionBarParamBuilder(this).setStartView(jni.c0).setEndView(jni.f1).create(), new Function1() { // from class: ajc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiShortcutSortFragment.onViewCreated$lambda$0(this.f1088a, (View) obj);
            }
        }, new Function1() { // from class: bjc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiShortcutSortFragment.onViewCreated$lambda$1(this.f4282a, (View) obj);
            }
        }, null, null, 24, null);
        RecyclerView recyclerView = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        l lVar = new l(this.mItemTouchCallback);
        lVar.d(recyclerView);
        ShortcutListAdapter shortcutListAdapter = new ShortcutListAdapter(lVar);
        this.mShortcutAdapter = shortcutListAdapter;
        recyclerView.setAdapter(shortcutListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ((HuaMiShortcutViewModel) getMViewModel()).getLoadRet().observe(getViewLifecycleOwner(), new HuaMiShortcutSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cjc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiShortcutSortFragment.onViewCreated$lambda$2(this.f5399a, (List) obj);
            }
        }));
        ((HuaMiShortcutViewModel) getMViewModel()).getSaveRet().observe(getViewLifecycleOwner(), new HuaMiShortcutSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: djc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiShortcutSortFragment.onViewCreated$lambda$3(this.f15587a, (Boolean) obj);
            }
        }));
        ShortcutListAdapter shortcutListAdapter2 = this.mShortcutAdapter;
        if (shortcutListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShortcutAdapter");
            shortcutListAdapter2 = null;
        }
        shortcutListAdapter2.setOnItemIconClickListener(new Function1() { // from class: ejc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiShortcutSortFragment.onViewCreated$lambda$4(this.f16701a, (ShortcutListItem) obj);
            }
        });
    }
}
