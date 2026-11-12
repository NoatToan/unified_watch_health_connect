package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.AddNewVibrateModeFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.b1e;
import defpackage.cn6;
import defpackage.eui;
import defpackage.gf6;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0007J#\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/AddNewVibrateModeFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel;", "Lgf6;", "Landroid/view/View$OnTouchListener;", "", "initActionBar", "()V", "", VibrateModeSetFragment.MAX, "returnNewID", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "setListener", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "index", "I", "isSaveMode", "Z", "Ljava/util/ArrayList;", "", "mCustomerIDList", "Ljava/util/ArrayList;", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddNewVibrateModeFragment extends BaseLoadableBindingFragment<VibrateModeAddViewModel, gf6> implements View.OnTouchListener {
    private int index;
    private boolean isSaveMode;

    @NotNull
    private ArrayList<String> mCustomerIDList = new ArrayList<>();
    private int max;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ gf6 access$getMBinding(AddNewVibrateModeFragment addNewVibrateModeFragment) {
        return (gf6) addNewVibrateModeFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ VibrateModeAddViewModel access$getMViewModel(AddNewVibrateModeFragment addNewVibrateModeFragment) {
        return (VibrateModeAddViewModel) addNewVibrateModeFragment.getMViewModel();
    }

    private final void initActionBar() {
        View startView;
        View endView;
        View endView2;
        wc0 actionBar = getActionBar();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        Intrinsics.checkNotNull(actionBar);
        l5g.d(mActivity, actionBar, wzi.B, new l5g.a() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddNewVibrateModeFragment.initActionBar.1
            @Override // l5g.a
            public void onCancelClicked(View view) {
                AddNewVibrateModeFragment.this.finish();
            }

            @Override // l5g.a
            public void onSaveClicked(View view) {
                cn6 cn6VarA0 = cn6.A0(AddNewVibrateModeFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(cn6VarA0, "inflate(...)");
                CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(wzi.A).setCustomView(cn6VarA0.getRoot()).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create();
                commonDialogCreate.addDialogCallback(new AddNewVibrateModeFragment$initActionBar$1$onSaveClicked$1(commonDialogCreate, AddNewVibrateModeFragment.this, cn6VarA0)).show(AddNewVibrateModeFragment.this.getParentFragmentManager(), "");
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
    public static final Unit onViewCreated$lambda$0(AddNewVibrateModeFragment this$0, VibrateModeAddViewModel.VibrateObserver vibrateObserver) {
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
    public static final void setListener$lambda$4(AddNewVibrateModeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showToast(ApplicationExtKt.getApplication().getString(wzi.h3));
        } else {
            ((VibrateModeAddViewModel) this$0.getMViewModel()).testVibrate(((gf6) this$0.getMBinding()).E.getVibrateTimes());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(AddNewVibrateModeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = ((gf6) this$0.getMBinding()).H.getText().toString();
        if (Intrinsics.areEqual(string, this$0.getString(wzi.F))) {
            ((gf6) this$0.getMBinding()).I.setOnTouchListener(this$0);
            ((gf6) this$0.getMBinding()).E.reset();
        } else if (Intrinsics.areEqual(string, this$0.getString(wzi.G))) {
            ((gf6) this$0.getMBinding()).I.setOnTouchListener(null);
            ((gf6) this$0.getMBinding()).E.stop();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.K;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((VibrateModeAddViewModel) getMViewModel()).stopVibrate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v, @Nullable MotionEvent event) {
        if (event == null || event.getPointerCount() < 2) {
            return ((gf6) getMBinding()).E.touch(event);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity mActivity;
        View endView;
        View startView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) && (mActivity = getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
        ((gf6) getMBinding()).D.show(wearableDeviceModel);
        ((VibrateModeAddViewModel) getMViewModel()).getVibrateObserver().observe(getViewLifecycleOwner(), new AddNewVibrateModeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: et0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddNewVibrateModeFragment.onViewCreated$lambda$0(this.f17035a, (VibrateModeAddViewModel.VibrateObserver) obj);
            }
        }));
        if (!((VibrateModeAddViewModel) getMViewModel()).getVibrateData().isEmpty()) {
            ((gf6) getMBinding()).E.setData(((VibrateModeAddViewModel) getMViewModel()).getVibrateData(), ((VibrateModeAddViewModel) getMViewModel()).getVibrateProgress(), ((VibrateModeAddViewModel) getMViewModel()).getVibrateEndProgress());
            ((gf6) getMBinding()).H.setText(wzi.F);
            ((gf6) getMBinding()).H.setEnabled(true);
            ((gf6) getMBinding()).K.setEnabled(true);
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
        ((gf6) getMBinding()).I.setOnTouchListener(this);
        ((gf6) getMBinding()).E.setOnProgressBarChangeListener(new VibrateModeProgressBar.OnProgressBarChangeListener() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.AddNewVibrateModeFragment.setListener.1
            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressReset() {
                View startView;
                View endView;
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).H.setEnabled(false);
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).K.setEnabled(false);
                wc0 miuiActionBar = AddNewVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
                    ViewExtKt.setVisible(endView, false);
                }
                wc0 miuiActionBar2 = AddNewVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar2 != null && (startView = miuiActionBar2.getStartView()) != null) {
                    AddNewVibrateModeFragment addNewVibrateModeFragment = AddNewVibrateModeFragment.this;
                    startView.setBackgroundResource(jni.a0);
                    startView.setContentDescription(addNewVibrateModeFragment.getString(wzi.d));
                }
                TextView battryAlertView = AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).A;
                Intrinsics.checkNotNullExpressionValue(battryAlertView, "battryAlertView");
                ViewExtKt.setVisible(battryAlertView, false);
                AddNewVibrateModeFragment.this.isSaveMode = false;
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateData(new ArrayList<>());
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateProgress(0.0f);
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateEndProgress(0.0f);
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressStart() {
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).H.setText(wzi.G);
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).H.setEnabled(true);
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onProgressStop() {
                View endView;
                View startView;
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).H.setText(wzi.F);
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).K.setEnabled(true);
                wc0 miuiActionBar = AddNewVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
                    AddNewVibrateModeFragment addNewVibrateModeFragment = AddNewVibrateModeFragment.this;
                    startView.setBackgroundResource(jni.d0);
                    startView.setContentDescription(addNewVibrateModeFragment.getString(wzi.e));
                }
                wc0 miuiActionBar2 = AddNewVibrateModeFragment.this.getMiuiActionBar();
                if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                    ViewExtKt.setVisible(endView, true);
                }
                AddNewVibrateModeFragment.this.isSaveMode = true;
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateData(AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).E.getData());
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateProgress(AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).E.getProgress());
                AddNewVibrateModeFragment.access$getMViewModel(AddNewVibrateModeFragment.this).setVibrateEndProgress(AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).E.getEndProgress());
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onToLong() {
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).A.setVisibility(0);
            }

            @Override // com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar.OnProgressBarChangeListener
            public void onVibrateStatusChange(boolean isVibrate) {
                AddNewVibrateModeFragment.access$getMBinding(AddNewVibrateModeFragment.this).J.setVisibility(isVibrate ? 0 : 8);
            }
        });
        ((gf6) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: ct0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewVibrateModeFragment.setListener$lambda$4(this.f14690a, view);
            }
        });
        ((gf6) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: dt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewVibrateModeFragment.setListener$lambda$5(this.f15906a, view);
            }
        });
    }
}
