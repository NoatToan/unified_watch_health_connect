package com.xiaomi.fitness.devicesettings.huami.typesort;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilderKt;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortBean;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortFragment;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.wha;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0007¢\u0006\u0004\b1\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\nR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortViewModel;", "Lwha;", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;", "item", "", "onItemIconClicked", "(Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;)V", "onImgBackClick", "()V", "onImgRightClick", "saveList", "", "isListChanged", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "sportTypeSortBeans", "Ljava/util/List;", "Landroidx/recyclerview/widget/l$e;", "mCallback", "Landroidx/recyclerview/widget/l$e;", "getMCallback", "()Landroidx/recyclerview/widget/l$e;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportTypeSortFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTypeSortFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n360#2,7:238\n774#2:245\n865#2,2:246\n1863#2,2:248\n*S KotlinDebug\n*F\n+ 1 SportTypeSortFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortFragment\n*L\n94#1:238,7\n218#1:245\n218#1:246,2\n221#1:248,2\n*E\n"})
public final class SportTypeSortFragment extends BaseBindingFragment<SportTypeSortViewModel, wha> {
    public static final int SPORT_TYPE_SORT_STATUS_HIDDEN = 0;
    public static final int SPORT_TYPE_SORT_STATUS_VISIBLE = 1;

    @Nullable
    private WearableDeviceModel deviceModel;
    public SportTypeSortAdapter mAdapter;

    @NotNull
    private final List<SportTypeSortBean> sportTypeSortBeans = new ArrayList();

    @NotNull
    private final l.e mCallback = new SportTypeSortFragment$mCallback$1(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SportTypeSortViewModel access$getMViewModel(SportTypeSortFragment sportTypeSortFragment) {
        return (SportTypeSortViewModel) sportTypeSortFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isListChanged() {
        return ((SportTypeSortViewModel) getMViewModel()).isListChanged(this.sportTypeSortBeans);
    }

    private final void onImgBackClick() {
        if (isListChanged()) {
            new CommonDialog.c("").setDialogDescription(wzi.Z).setPositiveText(wzi.O1).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortFragment.onImgBackClick.1
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
                        SportTypeSortFragment sportTypeSortFragment = SportTypeSortFragment.this;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        sportTypeSortFragment.finish();
                    }
                }
            }).showIfNeed(getParentFragmentManager());
        } else {
            finish();
        }
    }

    private final void onImgRightClick() {
        if (isListChanged()) {
            saveList();
        } else {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onItemIconClicked(SportTypeSortBean item) {
        Product product;
        Product product2;
        int iIndexOf = this.sportTypeSortBeans.indexOf(item);
        item.setSportTypeSort(new SportTypeItem(item.getSportTypeSort().getType(), !item.getSportTypeSort().visible() ? 1 : 0));
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        int i = 0;
        if (wearableDeviceModel == null || (product2 = wearableDeviceModel.getProduct()) == null || !DeviceModelExtKt.isPanGu(product2)) {
            item.setTargetIndex(1);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(this.sportTypeSortBeans, ((SportTypeSortViewModel) getMViewModel()).getMItemComparator());
            item.setTargetIndex(0);
        } else {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(this.sportTypeSortBeans, ((SportTypeSortViewModel) getMViewModel()).getMItemComparator());
        }
        getMAdapter().notifyItemMoved(iIndexOf, this.sportTypeSortBeans.indexOf(item));
        getMAdapter().notifyDataSetChanged();
        Iterator<SportTypeSortBean> it = this.sportTypeSortBeans.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getType() == 0) {
                break;
            } else {
                i++;
            }
        }
        getMAdapter().notifyItemChanged(i);
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        if (wearableDeviceModel2 == null || (product = wearableDeviceModel2.getProduct()) == null || !DeviceModelExtKt.isPanGu(product)) {
            return;
        }
        getMAdapter().notifyItemChanged(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SportTypeSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgBackClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SportTypeSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgRightClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SportTypeSortFragment this$0, SportTypeSortBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onItemIconClicked(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SportTypeSortFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (list != null) {
            this$0.sportTypeSortBeans.clear();
            this$0.sportTypeSortBeans.addAll(list);
            this$0.getMAdapter().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$5(SportTypeSortFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (bool.booleanValue()) {
            ((SportTypeSortViewModel) this$0.getMViewModel()).setOriginList(this$0.sportTypeSortBeans);
        }
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveList() {
        showLoading();
        ArrayList arrayList = new ArrayList();
        List<SportTypeSortBean> list = this.sportTypeSortBeans;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            SportTypeSortBean sportTypeSortBean = (SportTypeSortBean) obj;
            if (sportTypeSortBean.getType() == 1 || sportTypeSortBean.getType() == 3) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SportTypeSortBean) it.next()).getSportTypeSort());
        }
        ((SportTypeSortViewModel) getMViewModel()).setSportTypeSort(arrayList);
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.B2;
    }

    @NotNull
    public final SportTypeSortAdapter getMAdapter() {
        SportTypeSortAdapter sportTypeSortAdapter = this.mAdapter;
        if (sportTypeSortAdapter != null) {
            return sportTypeSortAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @NotNull
    public final l.e getMCallback() {
        return this.mCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        showLoading();
        ((SportTypeSortViewModel) getMViewModel()).loadSportTypeConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Product product;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        setTitle(wzi.N7);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, ActionBarParamBuilderKt.defaultActionBarParamBuilder(this).setStartView(jni.c0).setEndView(jni.f1).create(), new Function1() { // from class: f5o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSortFragment.onViewCreated$lambda$0(this.f17440a, (View) obj);
            }
        }, new Function1() { // from class: g5o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSortFragment.onViewCreated$lambda$1(this.f18630a, (View) obj);
            }
        }, null, null, 24, null);
        l lVar = new l(this.mCallback);
        lVar.d(getMBinding().A);
        setMAdapter(new SportTypeSortAdapter(this.sportTypeSortBeans, lVar));
        SportTypeSortAdapter mAdapter = getMAdapter();
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        mAdapter.setIsPangu((wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? false : DeviceModelExtKt.isPanGu(product));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        getMBinding().A.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        getMBinding().A.setAdapter(getMAdapter());
        getMAdapter().setOnItemIconClickListener(new Function1() { // from class: h5o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSortFragment.onViewCreated$lambda$2(this.f19724a, (SportTypeSortBean) obj);
            }
        });
        ((SportTypeSortViewModel) getMViewModel()).getLoadRet().observe(getViewLifecycleOwner(), new SportTypeSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i5o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSortFragment.onViewCreated$lambda$4(this.f20817a, (List) obj);
            }
        }));
        ((SportTypeSortViewModel) getMViewModel()).getSetRet().observe(getViewLifecycleOwner(), new SportTypeSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j5o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSortFragment.onViewCreated$lambda$5(this.f22446a, (Boolean) obj);
            }
        }));
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setMAdapter(@NotNull SportTypeSortAdapter sportTypeSortAdapter) {
        Intrinsics.checkNotNullParameter(sportTypeSortAdapter, "<set-?>");
        this.mAdapter = sportTypeSortAdapter;
    }
}
