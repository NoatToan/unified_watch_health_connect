package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateBean;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import defpackage.av6;
import defpackage.eui;
import defpackage.gj6;
import defpackage.wzi;
import defpackage.zqi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetViewModel;", "Lgj6;", "", "initActionBar", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter;", "mVibrateAdapter", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVibrateModeSetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeSetFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n1872#2,3:217\n1863#2,2:220\n*S KotlinDebug\n*F\n+ 1 VibrateModeSetFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeSetFragment\n*L\n78#1:217,3\n189#1:220,2\n*E\n"})
public final class VibrateModeSetFragment extends BaseLoadableBindingFragment<VibrateModeSetViewModel, gj6> {
    public static final int ADD_VIBRATE_REQUEST_CODE = 200;

    @NotNull
    public static final String COS_ID_LIST = "ID_LIST";

    @NotNull
    public static final String INDEX = "sIndex";

    @NotNull
    public static final String MAX = "max";

    @NotNull
    public static final String MODE_ID = "sModeId";

    @NotNull
    public static final String VIBRATE = "vibrate_mode_bean";

    @Nullable
    private VibrateAdapter mVibrateAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ VibrateModeSetViewModel access$getMViewModel(VibrateModeSetFragment vibrateModeSetFragment) {
        return (VibrateModeSetViewModel) vibrateModeSetFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initActionBar() {
        VibrateModeBean mVibrateMode = ((VibrateModeSetViewModel) getMViewModel()).getMVibrateMode();
        setTitle(mVibrateMode != null ? mVibrateMode.getName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(VibrateModeSetFragment this$0, WearableDeviceModel wearableDeviceModel, VibrateModeSetViewModel.VibrateListObserver vibrateListObserver) {
        String vibrateId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((gj6) this$0.getMBinding()).A.setEnabled(true);
        ArrayList<VibrateBean> arrayList = new ArrayList<>();
        String str = "";
        arrayList.add(new VibrateBean("", "", CollectionsKt__CollectionsKt.emptyList()));
        Iterator<Integer> it = vibrateListObserver.getDefaultList().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            arrayList.add(new VibrateBean(VibrateSpUtils.INSTANCE.getDefaultName(iIntValue), String.valueOf(iIntValue), CollectionsKt__CollectionsKt.emptyList()));
        }
        arrayList.add(new VibrateBean("", "", CollectionsKt__CollectionsKt.emptyList()));
        ArrayList<VibrateBean> vibrateList = vibrateListObserver.getVibrateList();
        if (vibrateList != null && !vibrateList.isEmpty()) {
            ArrayList<VibrateBean> vibrateList2 = vibrateListObserver.getVibrateList();
            Intrinsics.checkNotNull(vibrateList2);
            arrayList.addAll(CollectionsKt___CollectionsKt.toList(vibrateList2));
        }
        VibrateAdapter vibrateAdapter = this$0.mVibrateAdapter;
        if (vibrateAdapter != null) {
            vibrateAdapter.updateData(arrayList);
        }
        Iterator<T> it2 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String id = ((VibrateBean) next).getId();
            VibrateModeBean mVibrateMode = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
            if (Intrinsics.areEqual(id, mVibrateMode != null ? mVibrateMode.getVibrateId() : null)) {
                i = i2;
            }
            i2 = i3;
        }
        ((gj6) this$0.getMBinding()).B.scrollToPosition(i);
        if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            VibrateAdapter vibrateAdapter2 = this$0.mVibrateAdapter;
            if (vibrateAdapter2 != null) {
                VibrateModeBean mVibrateMode2 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
                if (mVibrateMode2 != null && (vibrateId = mVibrateMode2.getVibrateId()) != null) {
                    str = vibrateId;
                }
                vibrateAdapter2.updateSelectId(str);
            }
        } else {
            VibrateModeBean mVibrateMode3 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
            String vibrateId2 = mVibrateMode3 != null ? mVibrateMode3.getVibrateId() : null;
            if (vibrateId2 == null || vibrateId2.length() == 0) {
                VibrateAdapter vibrateAdapter3 = this$0.mVibrateAdapter;
                if (vibrateAdapter3 != null) {
                    vibrateAdapter3.updateSelectId("");
                }
            } else {
                VibrateAdapter vibrateAdapter4 = this$0.mVibrateAdapter;
                if (vibrateAdapter4 != null) {
                    VibrateModeBean mVibrateMode4 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
                    String vibrateId3 = mVibrateMode4 != null ? mVibrateMode4.getVibrateId() : null;
                    Intrinsics.checkNotNull(vibrateId3);
                    vibrateAdapter4.updateSelectId(vibrateId3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(VibrateModeSetFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (bool.booleanValue()) {
            VibrateAdapter vibrateAdapter = this$0.mVibrateAdapter;
            if (vibrateAdapter != null) {
                VibrateModeBean mVibrateMode = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
                String vibrateId = mVibrateMode != null ? mVibrateMode.getVibrateId() : null;
                Intrinsics.checkNotNull(vibrateId);
                vibrateAdapter.updateSelectId(vibrateId);
            }
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                String string = this$0.getString(wzi.common_set_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(mActivity, string);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(VibrateModeSetFragment this$0, VibrateBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((VibrateModeSetViewModel) this$0.getMViewModel()).setVibrate(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(final VibrateModeSetFragment this$0, final VibrateBean vibrateBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vibrateBean, "vibrateBean");
        new CommonDialog.c("commonDialog").setItems(new String[]{this$0.getString(wzi.E), this$0.getString(wzi.common_delete)}).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment$onViewCreated$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -3) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != 0) {
                        if (which != 1) {
                            return;
                        }
                        VibrateModeSetFragment.access$getMViewModel(this.this$0).removeVibrate(vibrateBean);
                        return;
                    }
                    View viewInflate = LayoutInflater.from(this.this$0.getMActivity()).inflate(eui.e2, (ViewGroup) null);
                    final TextView textView = (TextView) viewInflate.findViewById(zqi.C5);
                    textView.setText(vibrateBean.getName());
                    CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setNegativeText(wzi.e).setPositiveText(wzi.g).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
                    final VibrateModeSetFragment vibrateModeSetFragment = this.this$0;
                    final VibrateBean vibrateBean2 = vibrateBean;
                    commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment$onViewCreated$4$1$onDialogClick$1
                        @Override // defpackage.av6
                        public void onDialogClick(String dialogName2, DialogInterface dialog2, int which2) {
                            super.onDialogClick(dialogName2, dialog2, which2);
                            if (which2 != -2) {
                                if (which2 == -1) {
                                    String string = textView.getText().toString();
                                    if (string.length() == 0) {
                                        FragmentActivity mActivity = vibrateModeSetFragment.getMActivity();
                                        if (mActivity != null) {
                                            ToastExtKt.toastShort(mActivity, wzi.D);
                                            return;
                                        }
                                        return;
                                    }
                                    if (VibrateModeSetFragment.access$getMViewModel(vibrateModeSetFragment).isNameHas(vibrateBean2, string)) {
                                        FragmentActivity mActivity2 = vibrateModeSetFragment.getMActivity();
                                        if (mActivity2 != null) {
                                            ToastExtKt.toastShort(mActivity2, wzi.C);
                                            return;
                                        }
                                        return;
                                    }
                                    VibrateModeSetFragment.access$getMViewModel(vibrateModeSetFragment).renameVibrate(vibrateModeSetFragment.getMActivity(), vibrateBean2, string);
                                    if (dialog2 != null) {
                                        dialog2.dismiss();
                                    }
                                }
                            } else if (dialog2 != null) {
                                dialog2.dismiss();
                            }
                            if (dialog2 != null) {
                                dialog2.dismiss();
                            }
                        }
                    }).show(this.this$0.getParentFragmentManager(), "");
                }
            }
        }).show(this$0.getParentFragmentManager(), "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(VibrateModeSetFragment this$0, View view) {
        ArrayList<VibrateBean> mDataList;
        ArrayList<VibrateBean> vibrateList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VibrateModeSetViewModel.VibrateListObserver value = ((VibrateModeSetViewModel) this$0.getMViewModel()).getVibrateListObserver().getValue();
        ArrayList<VibrateBean> vibrateList2 = value != null ? value.getVibrateList() : null;
        if (vibrateList2 != null && !vibrateList2.isEmpty()) {
            VibrateModeSetViewModel.VibrateListObserver value2 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getVibrateListObserver().getValue();
            Integer numValueOf = (value2 == null || (vibrateList = value2.getVibrateList()) == null) ? null : Integer.valueOf(vibrateList.size());
            VibrateModeSetViewModel.VibrateListObserver value3 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getVibrateListObserver().getValue();
            if (Intrinsics.areEqual(numValueOf, value3 != null ? Integer.valueOf(value3.getMax()) : null)) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastLong(mActivity, wzi.e9);
                    return;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        VibrateAdapter vibrateAdapter = this$0.mVibrateAdapter;
        if (vibrateAdapter != null && (mDataList = vibrateAdapter.getMDataList()) != null) {
            Iterator<T> it = mDataList.iterator();
            while (it.hasNext()) {
                arrayList.add(((VibrateBean) it.next()).getId());
            }
        }
        bundle.putStringArrayList(COS_ID_LIST, arrayList);
        VibrateModeBean mVibrateMode = ((VibrateModeSetViewModel) this$0.getMViewModel()).getMVibrateMode();
        Intrinsics.checkNotNull(mVibrateMode);
        bundle.putInt(INDEX, mVibrateMode.getIndex());
        VibrateModeSetViewModel.VibrateListObserver value4 = ((VibrateModeSetViewModel) this$0.getMViewModel()).getVibrateListObserver().getValue();
        bundle.putInt(MAX, value4 != null ? value4.getMax() : 50);
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) (((VibrateModeSetViewModel) this$0.getMViewModel()).getVersion() == 2 ? AddCustomVibrateModeFragment.class : AddNewVibrateModeFragment.class), bundle, 200);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == -1) {
            ((gj6) getMBinding()).A.setEnabled(false);
            VibrateModeBean mVibrateMode = ((VibrateModeSetViewModel) getMViewModel()).getMVibrateMode();
            if (mVibrateMode != null) {
                mVibrateMode.setVibrateId(data != null ? data.getStringExtra(MODE_ID) : null);
            }
            ((VibrateModeSetViewModel) getMViewModel()).getVibrateList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(VIBRATE);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeBean");
            ((VibrateModeSetViewModel) getMViewModel()).initVibrateMode((VibrateModeBean) serializable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((VibrateModeSetViewModel) getMViewModel()).stopVibrate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) && (mActivity = getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
        ((VibrateModeSetViewModel) getMViewModel()).getVibrateListObserver().observe(getViewLifecycleOwner(), new VibrateModeSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ypq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VibrateModeSetFragment.onViewCreated$lambda$1(this.f40410a, wearableDeviceModel, (VibrateModeSetViewModel.VibrateListObserver) obj);
            }
        }));
        ((VibrateModeSetViewModel) getMViewModel()).getVibrateSetObserver().observe(getViewLifecycleOwner(), new VibrateModeSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zpq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VibrateModeSetFragment.onViewCreated$lambda$2(this.f41557a, (Boolean) obj);
            }
        }));
        this.mVibrateAdapter = new VibrateAdapter(new ArrayList(), new Function1() { // from class: aqq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VibrateModeSetFragment.onViewCreated$lambda$3(this.f3366a, (VibrateBean) obj);
            }
        }, new Function1() { // from class: bqq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VibrateModeSetFragment.onViewCreated$lambda$4(this.f4490a, (VibrateBean) obj);
            }
        });
        ((gj6) getMBinding()).B.setAdapter(this.mVibrateAdapter);
        ((VibrateModeSetViewModel) getMViewModel()).getVibrateList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((gj6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: xpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VibrateModeSetFragment.setListener$lambda$6(this.f39341a, view);
            }
        });
    }
}
