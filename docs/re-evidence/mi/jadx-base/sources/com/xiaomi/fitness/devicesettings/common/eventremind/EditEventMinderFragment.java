package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.SubTitleDialog;
import com.xiaomi.fitness.devicesettings.common.eventremind.EditEventMinderFragment;
import com.xiaomi.fitness.devicesettings.widget.CommonThirdSetPicker;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.av6;
import defpackage.b4s;
import defpackage.eui;
import defpackage.jni;
import defpackage.lhi;
import defpackage.ljk;
import defpackage.nm6;
import defpackage.qyi;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.yaa;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import miuix.androidbasewidget.widget.EditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0006\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\bI\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0014¢\u0006\u0004\b \u0010\u0007J'\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010.R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010G¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EditEventMinderFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventRemindViewModel;", "Lnm6;", "Lyaa;", "", "onRightImageClick", "()V", "initCustomWeek", "showPeriodDialog", "showCustomDialog", "updateTimeText", "onCustomPositiveClick", "", "loop", "changePeriodTextByLoop", "(Ljava/lang/String;)V", "showRemindTimeDialog", "", "selectTime", "onRemindTimeSelected", "(J)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "", "onBackPressed", "()Z", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "mindItem", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "addMode", "Z", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lljk;", "setPickHelper", "Lljk;", "Lcom/xiaomi/fitness/devicesettings/common/SubTitleDialog;", "timeDialog", "Lcom/xiaomi/fitness/devicesettings/common/SubTitleDialog;", "Lcom/xiaomi/fitness/devicesettings/widget/CommonThirdSetPicker;", "pickView", "Lcom/xiaomi/fitness/devicesettings/widget/CommonThirdSetPicker;", "periodIndex", "I", "isSuccess", "", "weekModeArray", "[Ljava/lang/String;", "", "customWeeks", "[Z", "tempCustomWeeks", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEditEventMinderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditEventMinderFragment.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EditEventMinderFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,419:1\n37#2:420\n36#2,3:421\n*S KotlinDebug\n*F\n+ 1 EditEventMinderFragment.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EditEventMinderFragment\n*L\n266#1:420\n266#1:421,3\n*E\n"})
public final class EditEventMinderFragment extends BaseBindingFragment<EventRemindViewModel, nm6> implements yaa {
    private static final int EVENT_CONTENT_MAX_LENGTH = 25;

    @NotNull
    public static final String KEY_PARAM1 = "key_param1";
    private static final int REQ_REMIND_TIME = 1001;
    private boolean addMode;

    @NotNull
    private final boolean[] customWeeks;
    public WearableDeviceModel deviceModel;
    private boolean isSuccess;

    @Nullable
    private EventReMinderItem mindItem;
    private int periodIndex;

    @Nullable
    private CommonThirdSetPicker pickView;

    @Nullable
    private ljk setPickHelper;

    @NotNull
    private boolean[] tempCustomWeeks;

    @Nullable
    private SubTitleDialog timeDialog;

    @NotNull
    private final String[] weekModeArray;

    public EditEventMinderFragment() {
        super(eui.R1);
        this.addMode = true;
        this.weekModeArray = new String[]{"1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP};
        this.customWeeks = new boolean[]{false, false, false, false, false, false, false};
        this.tempCustomWeeks = new boolean[]{false, false, false, false, false, false, false};
    }

    public static final /* synthetic */ nm6 access$getMBinding(EditEventMinderFragment editEventMinderFragment) {
        return editEventMinderFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePeriodTextByLoop(String loop) {
        String weekStrByLoop;
        int iHashCode = loop.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 1567) {
                if (iHashCode != 56) {
                    if (iHashCode == 57 && loop.equals(UserConfig.KEY_LITE_SCENE_ORDER)) {
                        int i = wzi.E6;
                        EventReMinderItem eventReMinderItem = this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem);
                        String string = getString(i, TimeDateUtil.getDateMMddSimpleFormat(TimeDateUtil.timestampToLocalDate(eventReMinderItem.getStartDateLong() / ((long) 1000))));
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        getMBinding().C.setRemindText(string);
                        this.periodIndex = 4;
                        return;
                    }
                } else if (loop.equals(UserConfig.KEY_MI_BRAIN_SETTING)) {
                    int i2 = wzi.B6;
                    EventReMinderItem eventReMinderItem2 = this.mindItem;
                    Intrinsics.checkNotNull(eventReMinderItem2);
                    String string2 = getString(i2, TimeDateUtil.getDayFormat(TimeDateUtil.timestampToLocalDate(eventReMinderItem2.getStartDateLong() / ((long) 1000))));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    getMBinding().C.setRemindText(string2);
                    this.periodIndex = 3;
                    return;
                }
            } else if (loop.equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                getMBinding().C.setRemindText(getString(wzi.K6));
                this.periodIndex = 0;
                return;
            }
        } else if (loop.equals("0")) {
            getMBinding().C.setRemindText(getString(wzi.S1));
            this.periodIndex = 1;
            return;
        }
        String str = null;
        if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.isEmpty()) {
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
                    return;
                }
                return;
            }
            EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
            FragmentActivity mActivity2 = getMActivity();
            Intrinsics.checkNotNull(mActivity2);
            weekStrByLoop = eventMinderUtil.getWeekStrByLoop(mActivity2, listSplit$default);
            this.periodIndex = 5;
        } else {
            int i3 = Integer.parseInt(loop);
            String[] stringArray = getResources().getStringArray(lhi.f);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            weekStrByLoop = stringArray[i3 % 7];
            this.periodIndex = 2;
        }
        RightArrowTwoLineTextView rightArrowTwoLineTextView = getMBinding().C;
        if (weekStrByLoop == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        } else {
            str = weekStrByLoop;
        }
        rightArrowTwoLineTextView.setRemindText(str);
    }

    private final void initCustomWeek() {
        if (this.periodIndex == 5) {
            EventReMinderItem eventReMinderItem = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem);
            String loop = eventReMinderItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.isEmpty()) {
                return;
            }
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                this.customWeeks[Integer.parseInt((String) it.next()) - 1] = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomPositiveClick() {
        StringBuilder sb = new StringBuilder();
        int length = this.tempCustomWeeks.length;
        for (int i = 0; i < length; i++) {
            boolean[] zArr = this.customWeeks;
            boolean z = this.tempCustomWeeks[i];
            zArr[i] = z;
            if (z) {
                sb.append(i + 1);
                sb.append(",");
            }
        }
        String[] strArr = new String[0];
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        }
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        eventReMinderItem.setRepeat(5);
        if (strArr.length == 0) {
            EventReMinderItem eventReMinderItem2 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem2);
            eventReMinderItem2.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
        } else if (strArr.length == 7) {
            EventReMinderItem eventReMinderItem3 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem3);
            eventReMinderItem3.setLoop("0");
        } else if (strArr.length == 1) {
            EventReMinderItem eventReMinderItem4 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem4);
            eventReMinderItem4.setLoop(strArr[0]);
            Calendar calendar = Calendar.getInstance();
            EventReMinderItem eventReMinderItem5 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem5);
            calendar.setTimeInMillis(eventReMinderItem5.getStartDateLong());
            calendar.set(7, EventMinderUtil.INSTANCE.getCalendarWeekByLoop(strArr[0]));
            EventReMinderItem eventReMinderItem6 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem6);
            eventReMinderItem6.setStartDateLong(calendar.getTimeInMillis());
            updateTimeText();
        } else {
            EventReMinderItem eventReMinderItem7 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem7);
            eventReMinderItem7.setLoop(sb.toString());
        }
        EventReMinderItem eventReMinderItem8 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem8);
        String loop = eventReMinderItem8.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
        changePeriodTextByLoop(loop);
    }

    private final void onRemindTimeSelected(long selectTime) {
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        if (selectTime == eventReMinderItem.getStartDateLong()) {
            return;
        }
        EventReMinderItem eventReMinderItem2 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem2);
        eventReMinderItem2.setStartDateLong(selectTime);
        updateTimeText();
        EventReMinderItem eventReMinderItem3 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem3);
        if (Intrinsics.areEqual(eventReMinderItem3.getLoop(), b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
            return;
        }
        EventReMinderItem eventReMinderItem4 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem4);
        if (Intrinsics.areEqual(eventReMinderItem4.getLoop(), "0")) {
            return;
        }
        EventReMinderItem eventReMinderItem5 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem5);
        String loop = eventReMinderItem5.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
        if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
            return;
        }
        String[] strArr = this.weekModeArray;
        EventReMinderItem eventReMinderItem6 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem6);
        if (ArraysKt___ArraysKt.contains(strArr, eventReMinderItem6.getLoop())) {
            Calendar calendar = Calendar.getInstance();
            EventReMinderItem eventReMinderItem7 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem7);
            calendar.setTimeInMillis(eventReMinderItem7.getStartDateLong());
            int i = calendar.get(7);
            EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
            EventReMinderItem eventReMinderItem8 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem8);
            String loop2 = eventReMinderItem8.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
            if (i != eventMinderUtil.getCalendarWeekByLoop(loop2)) {
                EventReMinderItem eventReMinderItem9 = this.mindItem;
                Intrinsics.checkNotNull(eventReMinderItem9);
                eventReMinderItem9.setLoop(eventMinderUtil.calendarWeekToLoop(i));
            }
        }
        EventReMinderItem eventReMinderItem10 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem10);
        String loop3 = eventReMinderItem10.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop3, "getLoop(...)");
        changePeriodTextByLoop(loop3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRightImageClick() {
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(getMBinding().B.getText())).toString();
        if (string.length() == 0) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.k2);
                return;
            }
            return;
        }
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        if (Intrinsics.areEqual(eventReMinderItem.getLoop(), b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            EventReMinderItem eventReMinderItem2 = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem2);
            if (jCurrentTimeMillis - eventReMinderItem2.getStartDateLong() >= 0) {
                FragmentActivity mActivity2 = getMActivity();
                if (mActivity2 != null) {
                    ToastExtKt.toastShort(mActivity2, wzi.D6);
                    return;
                }
                return;
            }
        }
        EventReMinderItem eventReMinderItem3 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem3);
        eventReMinderItem3.setTitle(string);
        EventReMinderItem eventReMinderItem4 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem4);
        eventReMinderItem4.setCreateDateLong(System.currentTimeMillis());
        showLoading();
        EventRemindViewModel eventRemindViewModel = (EventRemindViewModel) getMViewModel();
        EventReMinderItem eventReMinderItem5 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem5);
        eventRemindViewModel.addOrUpdateEventMinder(eventReMinderItem5, this.addMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(EditEventMinderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRightImageClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4(EditEventMinderFragment this$0, Boolean bool) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        this$0.isSuccess = zBooleanValue;
        if (zBooleanValue && (mActivity = this$0.getMActivity()) != null) {
            mActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(EditEventMinderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showPeriodDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(EditEventMinderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(EditEventMinderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(EditEventMinderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRightImageClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCustomDialog() {
        boolean[] zArr = this.customWeeks;
        ArraysKt___ArraysJvmKt.copyInto(zArr, this.tempCustomWeeks, 0, 0, zArr.length);
        String[] stringArray = getResources().getStringArray(lhi.h);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.x2).setItems(stringArray).setPositiveText(wzi.g).setNegativeText(wzi.e).setItemsChoices(this.tempCustomWeeks).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EditEventMinderFragment.showCustomDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                Logger.d("showCustomDialog " + which, new Object[0]);
                if (which == -1) {
                    EditEventMinderFragment.this.onCustomPositiveClick();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                super.onDialogMultiClick(dialogName, which, isChecked);
                Logger.d("showCustomDialog onDialogMultiClick " + which + " " + isChecked, new Object[0]);
                if (which < 0 || which >= EditEventMinderFragment.this.tempCustomWeeks.length) {
                    return;
                }
                EditEventMinderFragment.this.tempCustomWeeks[which] = isChecked;
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showPeriodDialog() {
        String[] stringArray = getResources().getStringArray(lhi.m);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (this.periodIndex == 5) {
            EventReMinderItem eventReMinderItem = this.mindItem;
            Intrinsics.checkNotNull(eventReMinderItem);
            String loop = eventReMinderItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null);
            EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            String weekStrByLoop = eventMinderUtil.getWeekStrByLoop(mActivity, listSplit$default);
            stringArray[5] = stringArray[5] + " (" + weekStrByLoop + ")";
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.r2).setItems(stringArray).setItemsCheckedIndex(this.periodIndex).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EditEventMinderFragment.showPeriodDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == 5 || which != EditEventMinderFragment.this.periodIndex) {
                    if (which == 0) {
                        EventReMinderItem eventReMinderItem2 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem2);
                        eventReMinderItem2.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                        EditEventMinderFragment editEventMinderFragment = EditEventMinderFragment.this;
                        EventReMinderItem eventReMinderItem3 = editEventMinderFragment.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem3);
                        String loop2 = eventReMinderItem3.getLoop();
                        Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
                        editEventMinderFragment.changePeriodTextByLoop(loop2);
                        return;
                    }
                    if (which == 1) {
                        EventReMinderItem eventReMinderItem4 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem4);
                        eventReMinderItem4.setLoop("0");
                        EditEventMinderFragment editEventMinderFragment2 = EditEventMinderFragment.this;
                        EventReMinderItem eventReMinderItem5 = editEventMinderFragment2.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem5);
                        String loop3 = eventReMinderItem5.getLoop();
                        Intrinsics.checkNotNullExpressionValue(loop3, "getLoop(...)");
                        editEventMinderFragment2.changePeriodTextByLoop(loop3);
                        return;
                    }
                    if (which == 2) {
                        EventReMinderItem eventReMinderItem6 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem6);
                        eventReMinderItem6.setRepeat(6);
                        EventReMinderItem eventReMinderItem7 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem7);
                        EventMinderUtil eventMinderUtil2 = EventMinderUtil.INSTANCE;
                        EventReMinderItem eventReMinderItem8 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem8);
                        eventReMinderItem7.setLoop(eventMinderUtil2.getLoopByStartDate(eventReMinderItem8));
                        EditEventMinderFragment editEventMinderFragment3 = EditEventMinderFragment.this;
                        EventReMinderItem eventReMinderItem9 = editEventMinderFragment3.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem9);
                        String loop4 = eventReMinderItem9.getLoop();
                        Intrinsics.checkNotNullExpressionValue(loop4, "getLoop(...)");
                        editEventMinderFragment3.changePeriodTextByLoop(loop4);
                        return;
                    }
                    if (which == 3) {
                        EventReMinderItem eventReMinderItem10 = EditEventMinderFragment.this.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem10);
                        eventReMinderItem10.setLoop(UserConfig.KEY_MI_BRAIN_SETTING);
                        EditEventMinderFragment editEventMinderFragment4 = EditEventMinderFragment.this;
                        EventReMinderItem eventReMinderItem11 = editEventMinderFragment4.mindItem;
                        Intrinsics.checkNotNull(eventReMinderItem11);
                        String loop5 = eventReMinderItem11.getLoop();
                        Intrinsics.checkNotNullExpressionValue(loop5, "getLoop(...)");
                        editEventMinderFragment4.changePeriodTextByLoop(loop5);
                        return;
                    }
                    if (which != 4) {
                        if (which != 5) {
                            return;
                        }
                        EditEventMinderFragment.this.showCustomDialog();
                        return;
                    }
                    EventReMinderItem eventReMinderItem12 = EditEventMinderFragment.this.mindItem;
                    Intrinsics.checkNotNull(eventReMinderItem12);
                    eventReMinderItem12.setLoop(UserConfig.KEY_LITE_SCENE_ORDER);
                    EditEventMinderFragment editEventMinderFragment5 = EditEventMinderFragment.this;
                    EventReMinderItem eventReMinderItem13 = editEventMinderFragment5.mindItem;
                    Intrinsics.checkNotNull(eventReMinderItem13);
                    String loop6 = eventReMinderItem13.getLoop();
                    Intrinsics.checkNotNullExpressionValue(loop6, "getLoop(...)");
                    editEventMinderFragment5.changePeriodTextByLoop(loop6);
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRemindTimeDialog() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("").setDialogTitle(wzi.e4).setCustomLayoutId(eui.r1).setPositiveText(wzi.g).setNegativeText(wzi.e).setCancelable(true).c(new DateTimePickerDialog.b() { // from class: w18
            @Override // com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog.b
            public final String a(long j) {
                return EditEventMinderFragment.showRemindTimeDialog$lambda$9(this.f37437a, j);
            }
        }).create();
        dateTimePickerDialogCreate.setRequestCode(1001);
        dateTimePickerDialogCreate.B(((EventRemindViewModel) getMViewModel()).getEventRemindRange().getFirst().longValue());
        dateTimePickerDialogCreate.A(((EventRemindViewModel) getMViewModel()).getEventRemindRange().getSecond().longValue());
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        dateTimePickerDialogCreate.y(eventReMinderItem.getStartDateLong());
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String showRemindTimeDialog$lambda$9(EditEventMinderFragment this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return this$0.getString(wzi.G6, eventMinderUtil.getEventMinderYearMonthDayTime(contextRequireContext, j, true));
    }

    private final void updateTimeText() {
        Context context = getContext();
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        String dateTime = DateUtils.formatDateTime(context, eventReMinderItem.getStartDateLong(), 65552);
        EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
        EventReMinderItem eventReMinderItem2 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem2);
        String eventMinderTime = eventMinderUtil.getEventMinderTime(eventReMinderItem2.getStartDateLong(), true);
        getMBinding().D.setRemindText(dateTime + " " + eventMinderTime);
    }

    @NotNull
    public final WearableDeviceModel getDeviceModel() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            return wearableDeviceModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceModel");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null && (serializable = arguments.getSerializable("key_param1")) != null) {
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem");
            EventReMinderItem eventReMinderItem = (EventReMinderItem) serializable;
            this.mindItem = eventReMinderItem;
            Intrinsics.checkNotNull(eventReMinderItem);
            eventReMinderItem.setOp(1);
            this.addMode = false;
        }
        if (this.mindItem == null) {
            EventReMinderItem eventReMinderItem2 = new EventReMinderItem();
            eventReMinderItem2.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
            eventReMinderItem2.setOp(1);
            eventReMinderItem2.setStartDateLong(System.currentTimeMillis() + ((long) 60000));
            this.addMode = true;
            this.mindItem = eventReMinderItem2;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.isSuccess) {
            return false;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.g2).setNegativeText(wzi.e).setPositiveText(wzi.O1).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EditEventMinderFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                FragmentActivity mActivity;
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1 || (mActivity = EditEventMinderFragment.this.getMActivity()) == null) {
                    return;
                }
                mActivity.finish();
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        return true;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 1001 && resultCode == -1) {
            onRemindTimeSelected(data.getLong("key_select_mills", System.currentTimeMillis()));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.J6);
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, null, new View.OnClickListener() { // from class: x18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditEventMinderFragment.onViewCreated$lambda$3(this.f38572a, view2);
            }
        }, 5, null);
        getMBinding().C.getMTvFeatureItemRemind().setMaxWidth(ExtUtilsKt.getDp(200));
        EditText editText = getMBinding().B;
        EventReMinderItem eventReMinderItem = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem);
        editText.setText(eventReMinderItem.getTitle());
        getMBinding().B.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(25)});
        getMBinding().A.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.g, 25, 25));
        EventReMinderItem eventReMinderItem2 = this.mindItem;
        Intrinsics.checkNotNull(eventReMinderItem2);
        String loop = eventReMinderItem2.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
        changePeriodTextByLoop(loop);
        initCustomWeek();
        updateTimeText();
    }

    public final void setDeviceModel(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<set-?>");
        this.deviceModel = wearableDeviceModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        View endView;
        View startView;
        super.setListener();
        ((EventRemindViewModel) getMViewModel()).getAddOrUpdateState().observe(getViewLifecycleOwner(), new EditEventMinderFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y18
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditEventMinderFragment.setListener$lambda$4(this.f39680a, (Boolean) obj);
            }
        }));
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: z18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditEventMinderFragment.setListener$lambda$5(this.f40774a, view);
            }
        });
        getMBinding().D.setOnClickListener(new View.OnClickListener() { // from class: a28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditEventMinderFragment.setListener$lambda$6(this.f546a, view);
            }
        });
        getMBinding().B.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EditEventMinderFragment.setListener.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                EditEventMinderFragment.access$getMBinding(EditEventMinderFragment.this).A.setVisibility((s == null || s.length() < 25) ? 8 : 0);
            }
        });
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
            startView.setOnClickListener(new View.OnClickListener() { // from class: b28
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditEventMinderFragment.setListener$lambda$7(this.f3708a, view);
                }
            });
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 == null || (endView = miuiActionBar2.getEndView()) == null) {
            return;
        }
        endView.setOnClickListener(new View.OnClickListener() { // from class: c28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditEventMinderFragment.setListener$lambda$8(this.f4855a, view);
            }
        });
    }
}
