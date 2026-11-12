package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.b1e;
import defpackage.cji;
import defpackage.cn6;
import defpackage.ef6;
import defpackage.eui;
import defpackage.jni;
import defpackage.l5g;
import defpackage.wc0;
import defpackage.wzi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\t*\u0001 \b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/AddCustomVibrateModeFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel;", "Lef6;", "", "initActionBar", "()V", "showGuide", "", VibrateModeSetFragment.MAX, "returnNewID", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "setListener", LifecycleConstantKt.ON_DESTROY, "index", "I", "", "isSaveMode", "Z", "Ljava/util/ArrayList;", "", "mCustomerIDList", "Ljava/util/ArrayList;", "com/xiaomi/fitness/devicesettings/huami/vibratemode/AddCustomVibrateModeFragment$onDeviceStatusListener$1", "onDeviceStatusListener", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/AddCustomVibrateModeFragment$onDeviceStatusListener$1;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddCustomVibrateModeFragment extends Hilt_AddCustomVibrateModeFragment<VibrateModeAddViewModel, ef6> {

    @NotNull
    private static final String TAG = "AddCustomVibrateModeFragment";
    private int index;
    private boolean isSaveMode;
    private int max;

    @NotNull
    private ArrayList<String> mCustomerIDList = new ArrayList<>();

    @NotNull
    private final AddCustomVibrateModeFragment$onDeviceStatusListener$1 onDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment$onDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            AddCustomVibrateModeFragment.access$getMBinding(this.this$0).C.pause();
            ToastUtil.showToast(this.this$0.getString(wzi.h3));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ef6 access$getMBinding(AddCustomVibrateModeFragment addCustomVibrateModeFragment) {
        return (ef6) addCustomVibrateModeFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ VibrateModeAddViewModel access$getMViewModel(AddCustomVibrateModeFragment addCustomVibrateModeFragment) {
        return (VibrateModeAddViewModel) addCustomVibrateModeFragment.getMViewModel();
    }

    private final void initActionBar() {
        View startView;
        View endView;
        View endView2;
        setTitleBackground(cji.f5403a);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        wc0 actionBar = getActionBar();
        Intrinsics.checkNotNull(actionBar);
        l5g.d(mActivity, actionBar, wzi.B, new l5g.a() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment.initActionBar.1
            @Override // l5g.a
            public void onCancelClicked(View view) {
                AddCustomVibrateModeFragment.this.finish();
            }

            @Override // l5g.a
            public void onSaveClicked(View view) {
                cn6 cn6VarA0 = cn6.A0(AddCustomVibrateModeFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(cn6VarA0, "inflate(...)");
                CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(wzi.A).setCustomView(cn6VarA0.getRoot()).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create();
                commonDialogCreate.addDialogCallback(new AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1(commonDialogCreate, AddCustomVibrateModeFragment.this, cn6VarA0)).show(AddCustomVibrateModeFragment.this.getParentFragmentManager(), "");
                cn6VarA0.A.requestFocus();
                b1e.d(cn6VarA0.A);
            }
        });
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
            ViewExtKt.setVisible(endView2, false);
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
            endView.setBackgroundResource(jni.j0);
            endView.setContentDescription(getString(wzi.sf));
        }
        wc0 miuiActionBar3 = getMiuiActionBar();
        if (miuiActionBar3 == null || (startView = miuiActionBar3.getStartView()) == null) {
            return;
        }
        startView.setBackgroundResource(jni.a0);
        startView.setContentDescription(getString(wzi.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AddCustomVibrateModeFragment this$0, VibrateModeAddViewModel.VibrateObserver vibrateObserver) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (vibrateObserver.getSuccess()) {
            Intent intent = new Intent();
            intent.putExtra(VibrateModeSetFragment.MODE_ID, vibrateObserver.getVibrateBean().getId());
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1, intent);
            }
            this$0.finish();
        } else {
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                String string = this$0.getString(wzi.common_set_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(mActivity2, string);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int returnNewID(int max) {
        int i = 1;
        if (1 > max) {
            return 0;
        }
        while (this.mCustomerIDList.contains(String.valueOf(i))) {
            if (i == max) {
                return 0;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(AddCustomVibrateModeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && !wearableDeviceModel.isDeviceConnected()) {
            ToastUtil.showToast(ApplicationExtKt.getApplication().getString(wzi.h3));
            return;
        }
        ((ef6) this$0.getMBinding()).F.setEnabled(false);
        ((VibrateModeAddViewModel) this$0.getMViewModel()).testVibrate(((ef6) this$0.getMBinding()).C.getVibrateTimes());
        ((ef6) this$0.getMBinding()).C.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(AddCustomVibrateModeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = ((ef6) this$0.getMBinding()).D.getText().toString();
        if (Intrinsics.areEqual(string, this$0.getString(wzi.F))) {
            ((ef6) this$0.getMBinding()).B.setCanAnimate(true);
            ((ef6) this$0.getMBinding()).E.setCanCustom(true);
            ((ef6) this$0.getMBinding()).C.reset();
            ((ef6) this$0.getMBinding()).D.setText(wzi.G);
            return;
        }
        if (Intrinsics.areEqual(string, this$0.getString(wzi.G))) {
            ((ef6) this$0.getMBinding()).B.setCanAnimate(false);
            ((ef6) this$0.getMBinding()).E.setCanCustom(false);
            ((ef6) this$0.getMBinding()).C.stop();
        }
    }

    private final void showGuide() {
        Window window;
        Window window2;
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        if (deviceSettingsPreference.getDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE()) {
            deviceSettingsPreference.setDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE(false);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            VibrateGuideView vibrateGuideView = new VibrateGuideView(contextRequireContext, null, 0, 6, null);
            FragmentActivity activity = getActivity();
            View decorView = (activity == null || (window2 = activity.getWindow()) == null) ? null : window2.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.addView(vibrateGuideView, new ViewGroup.LayoutParams(-1, -1));
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || (window = activity2.getWindow()) == null) {
                return;
            }
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(0);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.J;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.index = arguments.getInt(VibrateModeSetFragment.INDEX, 0);
            this.max = arguments.getInt(VibrateModeSetFragment.MAX, 50);
            ArrayList<String> stringArrayList = arguments.getStringArrayList(VibrateModeSetFragment.COS_ID_LIST);
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            this.mCustomerIDList = stringArrayList;
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onDeviceStatusListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.onDeviceStatusListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((VibrateModeAddViewModel) getMViewModel()).stopVibrate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View endView;
        View startView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        showGuide();
        ((ef6) getMBinding()).C.setSupportCustom(true);
        ((VibrateModeAddViewModel) getMViewModel()).getVibrateObserver().observe(getViewLifecycleOwner(), new AddCustomVibrateModeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: aq0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddCustomVibrateModeFragment.onViewCreated$lambda$0(this.f3345a, (VibrateModeAddViewModel.VibrateObserver) obj);
            }
        }));
        if (!((VibrateModeAddViewModel) getMViewModel()).getVibrateData().isEmpty()) {
            ((ef6) getMBinding()).C.setData(((VibrateModeAddViewModel) getMViewModel()).getVibrateData(), ((VibrateModeAddViewModel) getMViewModel()).getVibrateProgress(), ((VibrateModeAddViewModel) getMViewModel()).getVibrateEndProgress());
            ((ef6) getMBinding()).D.setText(wzi.F);
            ((ef6) getMBinding()).D.setEnabled(true);
            ((ef6) getMBinding()).F.setEnabled(true);
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
                startView.setBackgroundResource(jni.d0);
                startView.setContentDescription(getString(wzi.e));
            }
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                ViewExtKt.setVisible(endView, true);
            }
            this.isSaveMode = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ef6) getMBinding()).B.setCanAnimate(true);
        ((ef6) getMBinding()).E.setCanCustom(true);
        ((ef6) getMBinding()).C.setOnProgressBarChangeListener(new VibrateModeProgressBar.OnProgressBarChangeListener() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment.setListener.1
            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressReset() {
                View startView;
                View endView;
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).D.setEnabled(false);
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).F.setEnabled(false);
                wc0 miuiActionBar = AddCustomVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
                    ViewExtKt.setVisible(endView, false);
                }
                wc0 miuiActionBar2 = AddCustomVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar2 != null && (startView = miuiActionBar2.getStartView()) != null) {
                    startView.setBackgroundResource(jni.a0);
                }
                AddCustomVibrateModeFragment.this.isSaveMode = false;
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateData(new ArrayList<>());
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateProgress(0.0f);
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateEndProgress(0.0f);
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressStart() {
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).D.setText(wzi.G);
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).D.setEnabled(true);
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressStop() {
                View endView;
                View startView;
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).D.setText(wzi.F);
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).F.setEnabled(true);
                wc0 miuiActionBar = AddCustomVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
                    AddCustomVibrateModeFragment addCustomVibrateModeFragment = AddCustomVibrateModeFragment.this;
                    startView.setBackgroundResource(jni.d0);
                    startView.setContentDescription(addCustomVibrateModeFragment.getString(wzi.e));
                }
                wc0 miuiActionBar2 = AddCustomVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                    ViewExtKt.setVisible(endView, true);
                }
                AddCustomVibrateModeFragment.this.isSaveMode = true;
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateData(AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).C.getData());
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateProgress(AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).C.getProgress());
                AddCustomVibrateModeFragment.access$getMViewModel(AddCustomVibrateModeFragment.this).setVibrateEndProgress(AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).C.getEndProgress());
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onToLong() {
                Context context = AddCustomVibrateModeFragment.this.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, wzi.z);
                }
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onVibrateStatusChange(boolean isVibrate) {
            }
        });
        ((ef6) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: bq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCustomVibrateModeFragment.setListener$lambda$5(this.f4476a, view);
            }
        });
        ((ef6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: cq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCustomVibrateModeFragment.setListener$lambda$6(this.f14608a, view);
            }
        });
        ((ef6) getMBinding()).E.setOnVibrateIntensityChangeListener(new VibrateCustomTouchView.OnVibrateIntensityChangeListener() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment.setListener.4
            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateCustomTouchView.OnVibrateIntensityChangeListener
            public void onIntensityChange(int intensity) {
                Logger.d(AddCustomVibrateModeFragment.TAG, "onIntensityChange: " + intensity);
                AddCustomVibrateModeFragment.access$getMBinding(AddCustomVibrateModeFragment.this).C.touch(intensity);
            }
        });
    }
}
