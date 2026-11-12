package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.temp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.dialog.PickerStringDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.temp.TemperatureSettingFragment;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.view.setting.temperature.TemperatureSettingViewModel;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.pu9;
import defpackage.wzi;
import defpackage.xka;
import defpackage.yaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002()B\u0007¢\u0006\u0004\b'\u0010\u0013J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0013R\u001b\u0010\u0016\u001a\u00060\u0015R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/view/setting/temperature/TemperatureSettingViewModel;", "Lxka;", "Lyaa;", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/os/Bundle;", "data", "", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "updateAllDaySwitch", "()V", "showTemperatureSelectDialog", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter;", "adapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter;", "", "noticeClickable", "Z", "getNoticeClickable", "()Z", "setNoticeClickable", "(Z)V", "warningTemp", "I", "getWarningTemp", "()I", "setWarningTemp", "(I)V", "<init>", "Companion", "TemperatureSelectAdapter", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureSettingFragment extends BaseBindingFragment<TemperatureSettingViewModel, xka> implements yaa {

    @NotNull
    public static final String CURRENT_TEMPERATURE = "current_temperature";

    @NotNull
    public static final String TAG = "TemperatureSettingFragment";
    public static final int TEMP_SELECT = 1;

    @NotNull
    private final TemperatureSelectAdapter adapter;
    private boolean noticeClickable;
    private int warningTemp;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerStringDialog$a;", "", "getCount", "()I", "index", "", "getValue", "(I)Ljava/lang/String;", "", "temperatureList", "Ljava/util/List;", "getTemperatureList", "()Ljava/util/List;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTemperatureSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1557#2:156\n1628#2,3:157\n*S KotlinDebug\n*F\n+ 1 TemperatureSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/temp/TemperatureSettingFragment$TemperatureSelectAdapter\n*L\n140#1:156\n140#1:157,3\n*E\n"})
    public final class TemperatureSelectAdapter implements PickerStringDialog.a {

        @NotNull
        private final List<String> temperatureList;

        public TemperatureSelectAdapter() {
            IntRange intRange = new IntRange(373, 420);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) iNextInt) / 10.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                arrayList.add(str);
            }
            ListExtKt.add(arrayList, 0, ApplicationExtKt.getApplication().getString(wzi.ke));
            this.temperatureList = arrayList;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.PickerStringDialog.a
        public int getCount() {
            return this.temperatureList.size();
        }

        @NotNull
        public final List<String> getTemperatureList() {
            return this.temperatureList;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.PickerStringDialog.a
        @NotNull
        public String getValue(int index) {
            return this.temperatureList.get(index);
        }
    }

    public TemperatureSettingFragment() {
        super(eui.C2);
        this.adapter = new TemperatureSelectAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(final TemperatureSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
            this$0.getMBinding().A.setSwitch(!z);
        } else if (z) {
            this$0.updateAllDaySwitch();
        } else {
            new CommonDialog.c("temperatureMonitorOff").setDialogTitle(wzi.ie).setPositiveText(wzi.g).setNegativeText(wzi.common_cancel).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.temp.TemperatureSettingFragment$onViewCreated$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (which == -1) {
                        this.this$0.updateAllDaySwitch();
                    }
                    if (which == -2) {
                        this.this$0.getMBinding().A.setSwitch(true);
                    }
                }
            }).showIfNeed(this$0.getFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(TemperatureSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.noticeClickable) {
            if (UtilsKt.isDeviceNotConnection()) {
                ToastUtil.showShortToast(wzi.u);
            } else {
                this$0.showTemperatureSelectDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(TemperatureSettingFragment this$0, pu9 pu9Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "temperatureSettings:" + pu9Var);
        if (pu9Var != null) {
            this$0.getMBinding().A.setSwitch(pu9Var.c);
            this$0.warningTemp = pu9Var.d;
            this$0.noticeClickable = pu9Var.c;
            this$0.getMBinding().B.setRemindText(String.valueOf(pu9Var.d / 10.0f));
            this$0.getMBinding().B.setClickable(this$0.noticeClickable);
            if (this$0.warningTemp == 0) {
                this$0.getMBinding().B.setRemindText(this$0.getString(wzi.ke));
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final TemperatureSelectAdapter getAdapter() {
        return this.adapter;
    }

    public final boolean getNoticeClickable() {
        return this.noticeClickable;
    }

    public final int getWarningTemp() {
        return this.warningTemp;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode == -1 && requestCode == 1) {
            int i = data.getInt(PickerDialog.KEY_SELECTED_VALUE, -1);
            String value = this.adapter.getValue(i);
            getMBinding().B.setRemindText(value);
            if (i == 0) {
                this.warningTemp = 0;
            } else {
                this.warningTemp = (int) (Float.parseFloat(value) * 10);
            }
            updateAllDaySwitch();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(wzi.he));
        getMBinding().A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: v3p
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                TemperatureSettingFragment.onViewCreated$lambda$0(this.f36450a, z, iSwitchButton);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: w3p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TemperatureSettingFragment.onViewCreated$lambda$1(this.f37518a, view2);
            }
        });
        ((TemperatureSettingViewModel) getMViewModel()).getTemperatureSettingLiveData().observe(requireActivity(), new TemperatureSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: x3p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TemperatureSettingFragment.onViewCreated$lambda$3(this.f38655a, (pu9) obj);
            }
        }));
        ((TemperatureSettingViewModel) getMViewModel()).getDeviceTemperatureSetting();
    }

    public final void setNoticeClickable(boolean z) {
        this.noticeClickable = z;
    }

    public final void setWarningTemp(int i) {
        this.warningTemp = i;
    }

    public final void showTemperatureSelectDialog() {
        PickerStringDialog pickerStringDialogCreate = new PickerStringDialog.b("temperature_select").setCustomLayoutId(eui.M2).setPositiveText(wzi.g).setNegativeText(wzi.e).setCancelable(false).setDialogTitle(wzi.je).create();
        pickerStringDialogCreate.buildUpon().c(this.adapter).create();
        pickerStringDialogCreate.setPickerHintText("°C");
        pickerStringDialogCreate.setRequestCode(1);
        pickerStringDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateAllDaySwitch() {
        this.noticeClickable = getMBinding().A.getSwitch();
        getMBinding().B.setClickable(this.noticeClickable);
        ((TemperatureSettingViewModel) getMViewModel()).setTemperatureSetting(this.noticeClickable, this.warningTemp);
    }
}
