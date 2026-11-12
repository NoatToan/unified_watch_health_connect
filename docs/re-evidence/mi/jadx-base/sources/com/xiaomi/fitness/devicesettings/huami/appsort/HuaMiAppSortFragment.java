package com.xiaomi.fitness.devicesettings.huami.appsort;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilderKt;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortFragment;
import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.w8a;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b;\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\tJ!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001d\u0010\u000bR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\tR\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortViewModel;", "Lw8a;", "", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "list", "", "setAppSort", "(Ljava/util/List;)V", "onImgBackClick", "()V", "onImgRightClick", "", "isListChanged", "()Z", "saveList", "item", "isPositionFixed", "(Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;)Z", "", "widgetList", "updateList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;", "appSortBeans", "Ljava/util/List;", "getAppSortBeans", "()Ljava/util/List;", "setAppSortBeans", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;)V", "Landroidx/recyclerview/widget/l$e;", "mCallback", "Landroidx/recyclerview/widget/l$e;", "getMCallback", "()Landroidx/recyclerview/widget/l$e;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHuaMiAppSortFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiAppSortFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n774#2:249\n865#2,2:250\n1863#2,2:252\n1863#2,2:254\n*S KotlinDebug\n*F\n+ 1 HuaMiAppSortFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortFragment\n*L\n119#1:249\n119#1:250,2\n121#1:252,2\n234#1:254,2\n*E\n"})
public final class HuaMiAppSortFragment extends BaseBindingFragment<HuaMiAppSortViewModel, w8a> {

    @Nullable
    private WearableDeviceModel deviceModel;
    public HuaMiAppSortAdapter mAdapter;

    @NotNull
    private List<HuaMiAppSortBean> appSortBeans = new ArrayList();

    @NotNull
    private final l.e mCallback = new HuaMiAppSortFragment$mCallback$1(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HuaMiAppSortViewModel access$getMViewModel(HuaMiAppSortFragment huaMiAppSortFragment) {
        return (HuaMiAppSortViewModel) huaMiAppSortFragment.getMViewModel();
    }

    private final boolean isListChanged() {
        return getMAdapter().isListChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPositionFixed(AppSortItem item) {
        return item.getType() == 18;
    }

    private final void onImgBackClick() {
        if (isListChanged()) {
            new CommonDialog.c("huami app sort").setDialogDescription(wzi.Z).setPositiveText(wzi.O1).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortFragment.onImgBackClick.1
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
                        HuaMiAppSortFragment huaMiAppSortFragment = HuaMiAppSortFragment.this;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        huaMiAppSortFragment.finish();
                    }
                }
            }).showIfNeed(getParentFragmentManager());
        } else {
            finish();
        }
    }

    private final void onImgRightClick() {
        if (!isListChanged()) {
            finish();
        } else {
            PageState.DefaultImpls.showLoading$default(this, wzi.a0, false, 2, null);
            saveList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(HuaMiAppSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgBackClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(HuaMiAppSortFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onImgRightClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(HuaMiAppSortFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.setAppSort(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(HuaMiAppSortFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        this$0.hideLoading();
        this$0.getMAdapter().setOriginDataList(this$0.appSortBeans);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveList() {
        ArrayList arrayList = new ArrayList();
        ((HuaMiAppSortViewModel) getMViewModel()).mergeFilteredList(this.appSortBeans, isListChanged());
        List<HuaMiAppSortBean> list = this.appSortBeans;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            HuaMiAppSortBean huaMiAppSortBean = (HuaMiAppSortBean) obj;
            if (huaMiAppSortBean.getType() == 1 || huaMiAppSortBean.getType() == 3) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((HuaMiAppSortBean) it.next()).getAppItem());
        }
        ((HuaMiAppSortViewModel) getMViewModel()).setAppSortApp(arrayList);
    }

    private final void setAppSort(List<AppSortItem> list) {
        hideLoading();
        updateList(list);
        getMAdapter().initOriginDataList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateList(List<? extends AppSortItem> widgetList) {
        Product product;
        this.appSortBeans.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        boolean zIsKongMing = (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? true : DeviceModelExtKt.isKongMing(product);
        for (AppSortItem appSortItem : widgetList) {
            if (!appSortItem.getEnable()) {
                arrayList3.add(appSortItem);
            } else if (zIsKongMing || appSortItem.getParentType() != 7) {
                arrayList.add(appSortItem);
            } else {
                arrayList2.add(appSortItem);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.appSortBeans.add(new HuaMiAppSortBean(1, (AppSortItem) it.next()));
        }
        if (!zIsKongMing) {
            List<HuaMiAppSortBean> list = this.appSortBeans;
            String string = getString(wzi.X);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(new HuaMiAppSortBean(2, string));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.appSortBeans.add(new HuaMiAppSortBean(1, (AppSortItem) it2.next()));
            }
        }
        List<HuaMiAppSortBean> list2 = this.appSortBeans;
        String string2 = getString(wzi.a1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(new HuaMiAppSortBean(0, string2));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            this.appSortBeans.add(new HuaMiAppSortBean(3, (AppSortItem) it3.next()));
        }
        ((HuaMiAppSortViewModel) getMViewModel()).filterDataListIfNecessary(this.appSortBeans);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(this.appSortBeans, ((HuaMiAppSortViewModel) getMViewModel()).getItemComparator());
        getMAdapter().notifyDataSetChanged();
    }

    @NotNull
    public final List<HuaMiAppSortBean> getAppSortBeans() {
        return this.appSortBeans;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.u2;
    }

    @NotNull
    public final HuaMiAppSortAdapter getMAdapter() {
        HuaMiAppSortAdapter huaMiAppSortAdapter = this.mAdapter;
        if (huaMiAppSortAdapter != null) {
            return huaMiAppSortAdapter;
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
        ((HuaMiAppSortViewModel) getMViewModel()).loadData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        setTitle(wzi.W);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, ActionBarParamBuilderKt.defaultActionBarParamBuilder(this).setStartView(jni.c0).setEndView(jni.f1).create(), new Function1() { // from class: qhc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiAppSortFragment.onViewCreated$lambda$0(this.f31519a, (View) obj);
            }
        }, new Function1() { // from class: rhc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiAppSortFragment.onViewCreated$lambda$1(this.f32545a, (View) obj);
            }
        }, null, null, 24, null);
        l lVar = new l(this.mCallback);
        lVar.d(getMBinding().A);
        setMAdapter(new HuaMiAppSortAdapter(this.appSortBeans, lVar));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        getMBinding().A.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        getMBinding().A.setAdapter(getMAdapter());
        ((HuaMiAppSortViewModel) getMViewModel()).getGetAppList().observe(getViewLifecycleOwner(), new HuaMiAppSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: shc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiAppSortFragment.onViewCreated$lambda$2(this.f33638a, (List) obj);
            }
        }));
        ((HuaMiAppSortViewModel) getMViewModel()).getSetAppSortApp().observe(getViewLifecycleOwner(), new HuaMiAppSortFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: thc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiAppSortFragment.onViewCreated$lambda$3(this.f34704a, (Boolean) obj);
            }
        }));
    }

    public final void setAppSortBeans(@NotNull List<HuaMiAppSortBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.appSortBeans = list;
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setMAdapter(@NotNull HuaMiAppSortAdapter huaMiAppSortAdapter) {
        Intrinsics.checkNotNullParameter(huaMiAppSortAdapter, "<set-?>");
        this.mAdapter = huaMiAppSortAdapter;
    }
}
