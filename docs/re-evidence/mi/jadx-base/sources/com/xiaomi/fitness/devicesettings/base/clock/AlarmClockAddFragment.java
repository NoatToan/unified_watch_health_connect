package com.xiaomi.fitness.devicesettings.base.clock;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmClockAddFragment;
import com.xiaomi.fitness.devicesettings.widget.TimePicker;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.b41;
import defpackage.eui;
import defpackage.if6;
import defpackage.jni;
import defpackage.wc0;
import defpackage.wzi;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001;B\u0007¢\u0006\u0004\b:\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\u000bJ)\u0010\u001d\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockAddFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel;", "Lif6;", "Lcom/xiaomi/fitness/devicesettings/widget/TimePicker$h;", "", "alarmType", "alarmTypeToInt", "(I)I", "", "onTypeLayoutClicked", "()V", "showCustomDialog", "onRightImageClick", "hideDelayLoading", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;", "hourOfDay", "minute", "onTimeChanged", "(Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;II)V", "mTimePicker", "Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;", "getMTimePicker", "()Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;", "setMTimePicker", "(Lcom/xiaomi/fitness/devicesettings/widget/TimePicker;)V", "Landroid/widget/TextView;", "mTimeTv", "Landroid/widget/TextView;", "getMTimeTv", "()Landroid/widget/TextView;", "setMTimeTv", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "mClockBean", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "", "supportBleIntelligence", "Z", "supportBleWorkHoliday", "mIsAdd", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "initLoadingTime", "J", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AlarmClockAddFragment extends BaseBindingFragment<AlarmClockViewModel, if6> implements TimePicker.h {

    @NotNull
    public static final String KEY_CLOCK_BEAN = "key_clock_bean";

    @NotNull
    public static final String KEY_PARAM1 = "key_param1";

    @NotNull
    public static final String KEY_SUPPORT_BLE_INTELLIGENCE = "key_support_ble_intelligence";

    @NotNull
    public static final String KEY_SUPPORT_BLE_WORK_HOLIDAY = "key_support_ble_work_holiday";

    @NotNull
    private static final String TAG = "AlarmClockAdd";

    @Nullable
    private WearableDeviceModel deviceModel;
    private long initLoadingTime;

    @Nullable
    private AlarmSettingItem mClockBean;
    private boolean mIsAdd;

    @Nullable
    private TimePicker mTimePicker;

    @Nullable
    private TextView mTimeTv;
    private boolean supportBleIntelligence;
    private boolean supportBleWorkHoliday;

    public AlarmClockAddFragment() {
        super(eui.M);
        this.mIsAdd = true;
    }

    public static final /* synthetic */ if6 access$getMBinding(AlarmClockAddFragment alarmClockAddFragment) {
        return alarmClockAddFragment.getMBinding();
    }

    private final int alarmTypeToInt(int alarmType) {
        if (alarmType == 0) {
            return 0;
        }
        int i = 1;
        if (alarmType != 1) {
            i = 2;
            if (alarmType != 2) {
                if (alarmType == 3) {
                    return 3;
                }
                if (alarmType != 5) {
                    return 0;
                }
                WearableDeviceModel wearableDeviceModel = this.deviceModel;
                Intrinsics.checkNotNull(wearableDeviceModel);
                if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel) && this.supportBleWorkHoliday) {
                    return 4;
                }
            }
        }
        return i;
    }

    private final void hideDelayLoading() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.initLoadingTime;
        if (jCurrentTimeMillis <= 700) {
            getMBinding().D.postDelayed(new Runnable() { // from class: w21
                @Override // java.lang.Runnable
                public final void run() {
                    AlarmClockAddFragment.hideDelayLoading$lambda$5(this.f37468a);
                }
            }, jCurrentTimeMillis);
        } else {
            hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideDelayLoading$lambda$5(AlarmClockAddFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRightImageClick() {
        View endView;
        AlarmSettingItem alarmSettingItem = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem);
        alarmSettingItem.setNextAlarmTimeIfReOpen();
        this.initLoadingTime = System.currentTimeMillis();
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setEnabled(false);
        }
        AlarmClockViewModel alarmClockViewModel = (AlarmClockViewModel) getMViewModel();
        AlarmSettingItem alarmSettingItem2 = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem2);
        alarmClockViewModel.addOrUpdateAlarmData(alarmSettingItem2, this.mIsAdd);
    }

    private final void onTypeLayoutClicked() {
        final String[] strArrA;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(wzi.u);
            finish();
            return;
        }
        AlarmSettingItem alarmSettingItem = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem);
        int iAlarmTypeToInt = alarmTypeToInt(alarmSettingItem.getAlarmType());
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        if (wearableDeviceModel2 == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            strArrA = b41.a(getMActivity(), this.supportBleWorkHoliday);
            Intrinsics.checkNotNull(strArrA);
        } else {
            strArrA = b41.b(getMActivity());
            Intrinsics.checkNotNull(strArrA);
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setCanceledOnTouchOutside(true).setDialogTitle(wzi.x2).setItems(strArrA).setItemsCheckedIndex(iAlarmTypeToInt).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockAddFragment.onTypeLayoutClicked.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == 0) {
                    AlarmSettingItem alarmSettingItem2 = AlarmClockAddFragment.this.mClockBean;
                    Intrinsics.checkNotNull(alarmSettingItem2);
                    alarmSettingItem2.setAlarmType(0);
                } else if (which == 1) {
                    AlarmSettingItem alarmSettingItem3 = AlarmClockAddFragment.this.mClockBean;
                    Intrinsics.checkNotNull(alarmSettingItem3);
                    alarmSettingItem3.setAlarmType(1);
                } else if (which != 2) {
                    if (which == 3) {
                        AlarmSettingItem alarmSettingItem4 = AlarmClockAddFragment.this.mClockBean;
                        Intrinsics.checkNotNull(alarmSettingItem4);
                        alarmSettingItem4.setAlarmType(3);
                    }
                } else if (strArrA.length > 3) {
                    AlarmSettingItem alarmSettingItem5 = AlarmClockAddFragment.this.mClockBean;
                    Intrinsics.checkNotNull(alarmSettingItem5);
                    alarmSettingItem5.setAlarmType(2);
                }
                if (which == strArrA.length - 1) {
                    AlarmClockAddFragment.this.showCustomDialog();
                    return;
                }
                RightArrowSingleLineTextView rightArrowSingleLineTextView = AlarmClockAddFragment.access$getMBinding(AlarmClockAddFragment.this).B;
                AlarmSettingItem alarmSettingItem6 = AlarmClockAddFragment.this.mClockBean;
                Intrinsics.checkNotNull(alarmSettingItem6);
                rightArrowSingleLineTextView.setRemindText(alarmSettingItem6.getStringRepeatType(AlarmClockAddFragment.this.getContext()));
                TextView mTimeTv = AlarmClockAddFragment.this.getMTimeTv();
                Intrinsics.checkNotNull(mTimeTv);
                AlarmSettingItem alarmSettingItem7 = AlarmClockAddFragment.this.mClockBean;
                Intrinsics.checkNotNull(alarmSettingItem7);
                mTimeTv.setText(alarmSettingItem7.getTimeString(AlarmClockAddFragment.this.getActivity()));
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(AlarmClockAddFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRightImageClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(AlarmClockAddFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTypeLayoutClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(AlarmClockAddFragment this$0, Boolean bool) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideDelayLoading();
        if (bool != null && bool.booleanValue() && (mActivity = this$0.getMActivity()) != null) {
            mActivity.lambda$onCreate$0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(AlarmClockAddFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AlarmSettingItem alarmSettingItem = this$0.mClockBean;
        if (alarmSettingItem != null) {
            alarmSettingItem.setIsSmart(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCustomDialog() {
        CommonDialog.c items = new CommonDialog.c("custom").setDialogTitle(wzi.x2).setItems(b41.f3769b);
        AlarmSettingItem alarmSettingItem = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem);
        CommonDialog commonDialogCreate = items.setItemsChoices(alarmSettingItem.getDaysState()).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockAddFragment.showCustomDialog.1
            private final HashMap<Integer, Boolean> actionMap = new HashMap<>();

            private final void handleAction() {
                Set<Map.Entry<Integer, Boolean>> setEntrySet = this.actionMap.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                AlarmClockAddFragment alarmClockAddFragment = AlarmClockAddFragment.this;
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        AlarmSettingItem alarmSettingItem2 = alarmClockAddFragment.mClockBean;
                        if (alarmSettingItem2 != null) {
                            Object key = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                            alarmSettingItem2.addRepeatItem(((Number) key).intValue());
                        }
                    } else {
                        AlarmSettingItem alarmSettingItem3 = alarmClockAddFragment.mClockBean;
                        if (alarmSettingItem3 != null) {
                            Object key2 = entry.getKey();
                            Intrinsics.checkNotNullExpressionValue(key2, "<get-key>(...)");
                            alarmSettingItem3.removeRepeatItem(((Number) key2).intValue());
                        }
                    }
                }
                AlarmSettingItem alarmSettingItem4 = AlarmClockAddFragment.this.mClockBean;
                if (alarmSettingItem4 != null) {
                    AlarmClockAddFragment alarmClockAddFragment2 = AlarmClockAddFragment.this;
                    if (alarmSettingItem4.getDays() != 0) {
                        alarmSettingItem4.setAlarmType(5);
                        AlarmClockAddFragment.access$getMBinding(alarmClockAddFragment2).B.setRemindText(alarmSettingItem4.getCustomDay(alarmClockAddFragment2.getContext()));
                        TextView mTimeTv = alarmClockAddFragment2.getMTimeTv();
                        if (mTimeTv != null) {
                            mTimeTv.setText(alarmSettingItem4.getTimeString(alarmClockAddFragment2.getActivity()));
                        }
                    } else {
                        alarmSettingItem4.setAlarmType(0);
                        AlarmClockAddFragment.access$getMBinding(alarmClockAddFragment2).B.setRemindText(alarmSettingItem4.getStringRepeatType(alarmClockAddFragment2.getContext()));
                        TextView mTimeTv2 = alarmClockAddFragment2.getMTimeTv();
                        if (mTimeTv2 != null) {
                            mTimeTv2.setText(alarmSettingItem4.getTimeString(alarmClockAddFragment2.getActivity()));
                        }
                    }
                }
                this.actionMap.clear();
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    handleAction();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                super.onDialogMultiClick(dialogName, which, isChecked);
                if (this.actionMap.containsKey(Integer.valueOf(which))) {
                    this.actionMap.remove(Integer.valueOf(which));
                    return;
                }
                this.actionMap.put(Integer.valueOf(which), Boolean.valueOf(isChecked));
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Nullable
    public final TimePicker getMTimePicker() {
        return this.mTimePicker;
    }

    @Nullable
    public final TextView getMTimeTv() {
        return this.mTimeTv;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.devicesettings.widget.TimePicker.h
    public void onTimeChanged(@Nullable TimePicker view, int hourOfDay, int minute) {
        AlarmSettingItem alarmSettingItem = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem);
        alarmSettingItem.setTime(hourOfDay, minute);
        AlarmSettingItem alarmSettingItem2 = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem2);
        alarmSettingItem2.setNextAlarmTimeNow();
        TextView textView = this.mTimeTv;
        Intrinsics.checkNotNull(textView);
        AlarmSettingItem alarmSettingItem3 = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem3);
        textView.setText(alarmSettingItem3.getTimeString(getActivity()));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.mTimePicker = getMBinding().C;
        this.mTimeTv = getMBinding().D;
        boolean z = false;
        if (getArguments() != null) {
            this.mClockBean = (AlarmSettingItem) requireArguments().getSerializable(KEY_CLOCK_BEAN);
            this.supportBleIntelligence = requireArguments().getBoolean(KEY_SUPPORT_BLE_INTELLIGENCE, false);
            this.supportBleWorkHoliday = requireArguments().getBoolean(KEY_SUPPORT_BLE_WORK_HOLIDAY, false);
        }
        setTitle(wzi.H);
        b41.e(getMActivity());
        TimePicker timePicker = this.mTimePicker;
        Intrinsics.checkNotNull(timePicker);
        timePicker.setIs24HourView(Boolean.TRUE);
        TimePicker timePicker2 = this.mTimePicker;
        Intrinsics.checkNotNull(timePicker2);
        timePicker2.setOnTimeChangedListener(this);
        TimePicker timePicker3 = this.mTimePicker;
        Intrinsics.checkNotNull(timePicker3);
        timePicker3.j(wzi.tf, wzi.uf);
        AlarmSettingItem alarmSettingItem = this.mClockBean;
        if (alarmSettingItem != null) {
            this.mIsAdd = false;
            Intrinsics.checkNotNull(alarmSettingItem);
            int hour = alarmSettingItem.getHour();
            AlarmSettingItem alarmSettingItem2 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem2);
            int minute = alarmSettingItem2.getMinute();
            Logger.d(TAG, "initView: update hour = " + hour + "; minute = " + minute);
            TimePicker timePicker4 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker4);
            timePicker4.setCurrentHour(Integer.valueOf(hour));
            TimePicker timePicker5 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker5);
            timePicker5.setCurrentMinute(Integer.valueOf(minute));
            RightArrowSingleLineTextView rightArrowSingleLineTextView = getMBinding().B;
            AlarmSettingItem alarmSettingItem3 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem3);
            rightArrowSingleLineTextView.setRemindText(alarmSettingItem3.getStringRepeatType(getContext()));
        } else {
            this.mIsAdd = true;
            AlarmSettingItem alarmSettingItem4 = new AlarmSettingItem();
            this.mClockBean = alarmSettingItem4;
            Intrinsics.checkNotNull(alarmSettingItem4);
            TimePicker timePicker6 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker6);
            Integer currentHour = timePicker6.getCurrentHour();
            Intrinsics.checkNotNullExpressionValue(currentHour, "getCurrentHour(...)");
            int iIntValue = currentHour.intValue();
            TimePicker timePicker7 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker7);
            Integer currentMinute = timePicker7.getCurrentMinute();
            Intrinsics.checkNotNullExpressionValue(currentMinute, "getCurrentMinute(...)");
            alarmSettingItem4.setTime(iIntValue, currentMinute.intValue());
            AlarmSettingItem alarmSettingItem5 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem5);
            alarmSettingItem5.setEnable(true);
            AlarmSettingItem alarmSettingItem6 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem6);
            alarmSettingItem6.setVisible(true);
            AlarmSettingItem alarmSettingItem7 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem7);
            alarmSettingItem7.setAlarmType(0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm");
            TimePicker timePicker8 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker8);
            timePicker8.setCurrentHour(Integer.valueOf(simpleDateFormat.getCalendar().get(11)));
            TimePicker timePicker9 = this.mTimePicker;
            Intrinsics.checkNotNull(timePicker9);
            timePicker9.setCurrentMinute(Integer.valueOf(simpleDateFormat.getCalendar().get(12)));
            RightArrowSingleLineTextView rightArrowSingleLineTextView2 = getMBinding().B;
            AlarmSettingItem alarmSettingItem8 = this.mClockBean;
            Intrinsics.checkNotNull(alarmSettingItem8);
            rightArrowSingleLineTextView2.setRemindText(alarmSettingItem8.getStringRepeatType(getContext()));
        }
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if ((wearableDeviceModel == null || !DeviceModelExtKt.isL66(wearableDeviceModel)) && !this.supportBleIntelligence) {
            SwitchButtonTwoLineTextView alarmSmartSwitch = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(alarmSmartSwitch, "alarmSmartSwitch");
            ViewExtKt.invisible(alarmSmartSwitch);
        } else {
            SwitchButtonTwoLineTextView alarmSmartSwitch2 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(alarmSmartSwitch2, "alarmSmartSwitch");
            ViewExtKt.visible(alarmSmartSwitch2);
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = getMBinding().A;
            AlarmSettingItem alarmSettingItem9 = this.mClockBean;
            if (alarmSettingItem9 != null && alarmSettingItem9.isIsSmart()) {
                z = true;
            }
            switchButtonTwoLineTextView.setSwitch(z);
        }
        TextView textView = this.mTimeTv;
        Intrinsics.checkNotNull(textView);
        AlarmSettingItem alarmSettingItem10 = this.mClockBean;
        Intrinsics.checkNotNull(alarmSettingItem10);
        textView.setText(alarmSettingItem10.getTimeString(getActivity()));
        TimePicker timePicker10 = this.mTimePicker;
        if (timePicker10 != null) {
            timePicker10.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockAddFragment.onViewCreated.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(event, "event");
                    super.onInitializeAccessibilityEvent(host, event);
                    TimePicker mTimePicker = AlarmClockAddFragment.this.getMTimePicker();
                    if (mTimePicker != null) {
                        mTimePicker.onPopulateAccessibilityEvent(event);
                    }
                    List<CharSequence> text = event.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    event.setContentDescription(AlarmClockAddFragment.this.getString(wzi.x, text));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, null, new View.OnClickListener() { // from class: x21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmClockAddFragment.setListener$lambda$0(this.f38595a, view);
            }
        }, 5, null);
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: y21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmClockAddFragment.setListener$lambda$1(this.f39702a, view);
            }
        });
        ((AlarmClockViewModel) getMViewModel()).getAddOrUpdateState().observe(getViewLifecycleOwner(), new AlarmClockAddFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z21
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmClockAddFragment.setListener$lambda$3(this.f40797a, (Boolean) obj);
            }
        }));
        getMBinding().A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: a31
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AlarmClockAddFragment.setListener$lambda$4(this.f564a, z, iSwitchButton);
            }
        });
        if (endView$default != null) {
            endView$default.setContentDescription(getString(wzi.T6));
        }
    }

    public final void setMTimePicker(@Nullable TimePicker timePicker) {
        this.mTimePicker = timePicker;
    }

    public final void setMTimeTv(@Nullable TextView textView) {
        this.mTimeTv = textView;
    }
}
