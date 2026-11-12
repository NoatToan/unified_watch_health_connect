package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.WearModeBean;
import com.xiaomi.fitness.devicesettings.di.FeatureItemModule;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import defpackage.av6;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.sm6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b%\u0010\u0012J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeViewModel;", "Lsm6;", "", "mode", "", "showExistAccessoryModeFromAppDialog", "(Ljava/lang/Integer;)V", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "buildSupportWearModeList", "()Ljava/util/List;", "setCheck", "(I)V", "getCurrentMode", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "setOnSelectListener", "()V", "gotoSport", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter;", "modeAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter;", "mModeList", "Ljava/util/List;", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSwitchWearModeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchWearModeFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1863#2,2:159\n1#3:161\n*S KotlinDebug\n*F\n+ 1 SwitchWearModeFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeFragment\n*L\n109#1:159,2\n*E\n"})
public final class SwitchWearModeFragment extends BaseBindingFragment<SwitchWearModeViewModel, sm6> {

    @NotNull
    private List<WearModeBean> mModeList = new ArrayList();

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private SwitchWearModeAdapter modeAdapter;

    private final List<WearModeBean> buildSupportWearModeList() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WearModeBean(0, null));
        WearModeBean wearModeBean = new WearModeBean(1, Integer.valueOf(jni.x));
        wearModeBean.setUrl(DeviceModelExtKt.getBeanPreviewUrl(wearableDeviceModel));
        arrayList.add(wearModeBean);
        WearModeBean wearModeBean2 = new WearModeBean(2, Integer.valueOf(jni.x));
        wearModeBean2.setUrl(DeviceModelExtKt.getRingPreviewUrl(wearableDeviceModel));
        arrayList.add(wearModeBean2);
        return arrayList;
    }

    private final WearModeBean getCurrentMode() {
        Object next;
        Iterator<T> it = this.mModeList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((WearModeBean) next).getIsSelect()) {
                return (WearModeBean) next;
            }
        }
        next = null;
        return (WearModeBean) next;
    }

    private final void gotoSport() {
        new CommonDialog.c("bean wear mode to sport").setDialogTitle(wzi.A4).setPositiveText(wzi.C4).setNegativeText(wzi.B4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeFragment.gotoSport.1
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
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
                    Context context = SwitchWearModeFragment.this.getContext();
                    if (context != null) {
                        MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    }
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SwitchWearModeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.setCheck(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SwitchWearModeFragment this$0, SwitchWearModeViewModel.SetWearModeRet setWearModeRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (setWearModeRet.getSuccess()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.v9);
            }
            this$0.setCheck(setWearModeRet.getMode());
            FeatureItemModule.INSTANCE.setWearMode(Integer.valueOf(setWearModeRet.getMode()));
            if (setWearModeRet.getMode() == 1) {
                this$0.finish();
                ISportAccessApi instance = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity == null) {
                    mActivity = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(mActivity, "requireActivity(...)");
                }
                instance.launchSportBeanModeWearGuideActivity(mActivity);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.w9);
            }
            if (setWearModeRet.getMode() == 1 && setWearModeRet.getCode() == -111) {
                this$0.showExistAccessoryModeFromAppDialog(Integer.valueOf(setWearModeRet.getMode()));
            }
        }
        return Unit.INSTANCE;
    }

    private final void setCheck(int mode) {
        for (WearModeBean wearModeBean : this.mModeList) {
            wearModeBean.setSelect(wearModeBean.getMode() == mode);
        }
        SwitchWearModeAdapter switchWearModeAdapter = this.modeAdapter;
        if (switchWearModeAdapter != null) {
            switchWearModeAdapter.notifyDataSetChanged();
        }
    }

    private final void setOnSelectListener() {
        SwitchWearModeAdapter switchWearModeAdapter = this.modeAdapter;
        if (switchWearModeAdapter != null) {
            switchWearModeAdapter.setOnSelectListener(new Function1() { // from class: bso
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SwitchWearModeFragment.setOnSelectListener$lambda$7(this.f4572a, (WearModeBean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setOnSelectListener$lambda$7(SwitchWearModeFragment this$0, WearModeBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        WearModeBean currentMode = this$0.getCurrentMode();
        if (currentMode == null || currentMode.getMode() != it.getMode()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.x9);
            }
            ((SwitchWearModeViewModel) this$0.getMViewModel()).setWearMode(it);
        }
        return Unit.INSTANCE;
    }

    private final void showExistAccessoryModeFromAppDialog(Integer mode) {
        CommonDialog commonDialogCreate = new CommonDialog.c("existMode").setDialogTitle(wzi.h4).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(wzi.g4))).setNegativeText(wzi.f4).create();
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.U1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.y9);
        setActionBarNormalTitleMode();
        setTitleBackground(cji.y);
        List<WearModeBean> listBuildSupportWearModeList = buildSupportWearModeList();
        this.mModeList = listBuildSupportWearModeList;
        this.modeAdapter = new SwitchWearModeAdapter(listBuildSupportWearModeList);
        RecyclerView recyclerView = getMBinding().A;
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.modeAdapter);
        }
        ((SwitchWearModeViewModel) getMViewModel()).loadWearMode();
        ((SwitchWearModeViewModel) getMViewModel()).getWearMode().observe(getViewLifecycleOwner(), new SwitchWearModeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchWearModeFragment.onViewCreated$lambda$0(this.f41608a, (Integer) obj);
            }
        }));
        ((SwitchWearModeViewModel) getMViewModel()).getSetWearModeRet().observe(getViewLifecycleOwner(), new SwitchWearModeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: aso
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchWearModeFragment.onViewCreated$lambda$1(this.f3420a, (SwitchWearModeViewModel.SetWearModeRet) obj);
            }
        }));
        setOnSelectListener();
    }
}
