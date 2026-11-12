package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data.TodoRemindItem;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.av6;
import defpackage.b1e;
import defpackage.eui;
import defpackage.jni;
import defpackage.lhi;
import defpackage.qyi;
import defpackage.wc0;
import defpackage.wm6;
import defpackage.wzi;
import defpackage.yaa;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0014¢\u0006\u0004\b'\u0010\u0007J'\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindEditFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModel;", "Lwm6;", "Lyaa;", "", "initRemindTimeView", "()V", "initRemindPeriodView", "initSwitchView", "", "checked", "onSwitchUpdate", "(Z)V", "initEditView", "onSaveRecord", "initCustomWeek", "showPeriodDialog", "updateCustomWeekDay", "showCustomDialog", "refreshRemindTimeText", "onCustomWeekDialogPositiveClick", "", "repeatCode", "changePeriodTextByRepeat", "(I)V", "showRemindTimeDialog", "", "selectTimeMillis", "onRemindTimeSelected", "(J)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "onBackPressed", "()Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "todoRemindItem", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "addMode", "Z", "isSuccess", "", "", "weekModeArray", "[Ljava/lang/String;", "", "customWeeks", "[Z", "tempCustomWeeks", "Landroid/widget/EditText;", "tvEditContent", "Landroid/widget/EditText;", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "switchView", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodoRemindEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoRemindEditFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindEditFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,446:1\n37#2:447\n36#2,3:448\n*S KotlinDebug\n*F\n+ 1 TodoRemindEditFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindEditFragment\n*L\n296#1:447\n296#1:448,3\n*E\n"})
public final class TodoRemindEditFragment extends BaseBindingFragment<TodoRemindViewModel, wm6> implements yaa {
    private static final int EVENT_CONTENT_MAX_LENGTH = 30;

    @NotNull
    public static final String KEY_REMIND_ADD_STATUS = "is_add";

    @NotNull
    public static final String KEY_REMIND_PARAM = "todo_remind";
    private static final int REQ_REMIND_TIME = 1001;

    @NotNull
    public static final String TAG = "TodoRemindUiLog";
    private boolean addMode;

    @NotNull
    private final boolean[] customWeeks;
    private boolean isSuccess;
    private SwitchButtonTwoLineTextView switchView;

    @NotNull
    private boolean[] tempCustomWeeks;

    @Nullable
    private TodoRemindItem todoRemindItem;
    private EditText tvEditContent;

    @NotNull
    private final String[] weekModeArray;

    public TodoRemindEditFragment() {
        super(eui.W1);
        this.addMode = true;
        this.weekModeArray = new String[]{"1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP};
        this.customWeeks = new boolean[]{false, false, false, false, false, false, false};
        this.tempCustomWeeks = new boolean[]{false, false, false, false, false, false, false};
    }

    public static final /* synthetic */ wm6 access$getMBinding(TodoRemindEditFragment todoRemindEditFragment) {
        return todoRemindEditFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePeriodTextByRepeat(int repeatCode) {
        if (repeatCode == 0) {
            getMBinding().E.setRemindText(getString(wzi.K6));
            return;
        }
        if (repeatCode == 1) {
            getMBinding().E.setRemindText(getString(wzi.S1));
            return;
        }
        String str = null;
        if (repeatCode == 2) {
            TodoRemindItem todoRemindItem = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem);
            String customDayStr = todoRemindItem.getCustomDayStr();
            if (customDayStr == null || StringsKt__StringsKt.contains$default((CharSequence) customDayStr, (CharSequence) ",", false, 2, (Object) null)) {
                return;
            }
            int i = Integer.parseInt(customDayStr);
            String[] stringArray = getResources().getStringArray(lhi.f);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            getMBinding().E.setRemindText(stringArray[i % 7]);
            return;
        }
        if (repeatCode == 3) {
            int i2 = wzi.B6;
            TodoRemindItem todoRemindItem2 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem2);
            String string = getString(i2, TimeDateUtil.getDayFormat(TimeDateUtil.timestampToLocalDate(todoRemindItem2.getRemindTimeSecond())));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            getMBinding().E.setRemindText(string);
            return;
        }
        if (repeatCode == 4) {
            int i3 = wzi.E6;
            TodoRemindItem todoRemindItem3 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem3);
            String string2 = getString(i3, TimeDateUtil.getDateMMddSimpleFormat(TimeDateUtil.timestampToLocalDate(todoRemindItem3.getRemindTimeSecond())));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            getMBinding().E.setRemindText(string2);
            return;
        }
        if (repeatCode != 5) {
            return;
        }
        TodoRemindItem todoRemindItem4 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem4);
        String customDayStr2 = todoRemindItem4.getCustomDayStr();
        if (customDayStr2 == null || !StringsKt__StringsKt.contains$default((CharSequence) customDayStr2, (CharSequence) ",", false, 2, (Object) null)) {
            return;
        }
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) customDayStr2, new String[]{","}, false, 0, 6, (Object) null);
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
        String weekStrByLoop = eventMinderUtil.getWeekStrByLoop(mActivity2, listSplit$default);
        RightArrowTwoLineTextView rightArrowTwoLineTextView = getMBinding().E;
        if (weekStrByLoop == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        } else {
            str = weekStrByLoop;
        }
        rightArrowTwoLineTextView.setRemindText(str);
    }

    private final void initCustomWeek() {
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        if (todoRemindItem.getRepeatMode() == 5) {
            TodoRemindItem todoRemindItem2 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem2);
            String customDayStr = todoRemindItem2.getCustomDayStr();
            List listSplit$default = customDayStr != null ? StringsKt__StringsKt.split$default((CharSequence) customDayStr, new String[]{","}, false, 0, 6, (Object) null) : null;
            List list = listSplit$default;
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                this.customWeeks[Integer.parseInt((String) it.next()) - 1] = true;
            }
        }
    }

    private final void initEditView() {
        miuix.androidbasewidget.widget.EditText editText = getMBinding().B;
        this.tvEditContent = editText;
        EditText editText2 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvEditContent");
            editText = null;
        }
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        editText.setText(todoRemindItem != null ? todoRemindItem.getContent() : null);
        EditText editText3 = this.tvEditContent;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvEditContent");
        } else {
            editText2 = editText3;
        }
        editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
        getMBinding().C.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.g, 30, 30));
    }

    private final void initRemindPeriodView() {
        getMBinding().E.getMTvFeatureItemRemind().setMaxWidth(ExtUtilsKt.getDp(200));
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        changePeriodTextByRepeat(todoRemindItem.getRepeatMode());
        initCustomWeek();
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: lhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoRemindEditFragment.initRemindPeriodView$lambda$5(this.f25086a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRemindPeriodView$lambda$5(TodoRemindEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showPeriodDialog();
    }

    private final void initRemindTimeView() {
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: nhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoRemindEditFragment.initRemindTimeView$lambda$4(this.f27945a, view);
            }
        });
        refreshRemindTimeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRemindTimeView$lambda$4(TodoRemindEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRemindTimeDialog();
    }

    private final void initSwitchView() {
        this.switchView = getMBinding().G;
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        boolean remindEnable = todoRemindItem.getRemindEnable();
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.switchView;
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = null;
        if (switchButtonTwoLineTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
            switchButtonTwoLineTextView = null;
        }
        switchButtonTwoLineTextView.setSwitch(remindEnable);
        onSwitchUpdate(remindEnable);
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView3 = this.switchView;
        if (switchButtonTwoLineTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchView");
        } else {
            switchButtonTwoLineTextView2 = switchButtonTwoLineTextView3;
        }
        switchButtonTwoLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rhp
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                TodoRemindEditFragment.initSwitchView$lambda$6(this.f32556a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSwitchView$lambda$6(TodoRemindEditFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSwitchUpdate(z);
        TodoRemindItem todoRemindItem = this$0.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        todoRemindItem.setRemindEnable(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomWeekDialogPositiveClick() {
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
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        todoRemindItem.setRepeatMode(5);
        if (strArr.length == 0) {
            TodoRemindItem todoRemindItem2 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem2);
            todoRemindItem2.setRepeatMode(0);
        } else if (strArr.length == 7) {
            TodoRemindItem todoRemindItem3 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem3);
            todoRemindItem3.setRepeatMode(1);
        } else if (strArr.length == 1) {
            TodoRemindItem todoRemindItem4 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem4);
            todoRemindItem4.setRepeatMode(2);
            TodoRemindItem todoRemindItem5 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem5);
            todoRemindItem5.setCustomDayStr(strArr[0]);
            Calendar calendar = Calendar.getInstance();
            TodoRemindItem todoRemindItem6 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem6);
            long j = 1000;
            calendar.setTimeInMillis(todoRemindItem6.getRemindTimeSecond() * j);
            calendar.set(7, EventMinderUtil.INSTANCE.getCalendarWeekByLoop(strArr[0]));
            TodoRemindItem todoRemindItem7 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem7);
            todoRemindItem7.setRemindTimeSecond(calendar.getTimeInMillis() / j);
            refreshRemindTimeText();
        } else {
            TodoRemindItem todoRemindItem8 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem8);
            todoRemindItem8.setCustomDayStr(sb.toString());
        }
        TodoRemindItem todoRemindItem9 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem9);
        changePeriodTextByRepeat(todoRemindItem9.getRepeatMode());
    }

    private final void onRemindTimeSelected(long selectTimeMillis) {
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        long j = 1000;
        if (selectTimeMillis == todoRemindItem.getRemindTimeSecond() * j) {
            return;
        }
        TodoRemindItem todoRemindItem2 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem2);
        todoRemindItem2.setRemindTimeSecond(selectTimeMillis / j);
        refreshRemindTimeText();
        TodoRemindItem todoRemindItem3 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem3);
        if (todoRemindItem3.getRepeatMode() != 2) {
            return;
        }
        String[] strArr = this.weekModeArray;
        TodoRemindItem todoRemindItem4 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem4);
        if (ArraysKt___ArraysKt.contains(strArr, todoRemindItem4.getCustomDayStr())) {
            Calendar calendar = Calendar.getInstance();
            TodoRemindItem todoRemindItem5 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem5);
            calendar.setTimeInMillis(todoRemindItem5.getRemindTimeSecond() * j);
            int i = calendar.get(7);
            TodoRemindItem todoRemindItem6 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem6);
            todoRemindItem6.setCustomDayStr(EventMinderUtil.INSTANCE.calendarWeekToLoop(i));
        }
        TodoRemindItem todoRemindItem7 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem7);
        changePeriodTextByRepeat(todoRemindItem7.getRepeatMode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSaveRecord() {
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(getMBinding().B.getText())).toString();
        if (string.length() == 0) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.k2);
                return;
            }
            return;
        }
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        if (todoRemindItem.getRemindEnable()) {
            TodoRemindItem todoRemindItem2 = this.todoRemindItem;
            Intrinsics.checkNotNull(todoRemindItem2);
            if (todoRemindItem2.getRepeatMode() == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                TodoRemindItem todoRemindItem3 = this.todoRemindItem;
                Intrinsics.checkNotNull(todoRemindItem3);
                if (jCurrentTimeMillis - todoRemindItem3.getRemindTimeSecond() >= 0) {
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        ToastExtKt.toastShort(mActivity2, wzi.D6);
                        return;
                    }
                    return;
                }
            }
        }
        TodoRemindItem todoRemindItem4 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem4);
        todoRemindItem4.setContent(string);
        TodoRemindItem todoRemindItem5 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem5);
        todoRemindItem5.setUpdateTimeSecond(System.currentTimeMillis() / ((long) 1000));
        b1e.b(getMBinding().B);
        if (!((TodoRemindViewModel) getMViewModel()).getDeviceConnected()) {
            FragmentActivity mActivity3 = getMActivity();
            if (mActivity3 != null) {
                ToastExtKt.toastShort(mActivity3, wzi.v);
                return;
            }
            return;
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        TodoRemindViewModel todoRemindViewModel = (TodoRemindViewModel) getMViewModel();
        TodoRemindItem todoRemindItem6 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem6);
        todoRemindViewModel.addOrUpdateTodoRemind(todoRemindItem6, this.addMode);
    }

    private final void onSwitchUpdate(boolean checked) {
        RightArrowTwoLineTextView editTodoPeriodView = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(editTodoPeriodView, "editTodoPeriodView");
        ViewExtKt.setVisible(editTodoPeriodView, checked);
        RightArrowTwoLineTextView editTodoTimeView = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(editTodoTimeView, "editTodoTimeView");
        ViewExtKt.setVisible(editTodoTimeView, checked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(TodoRemindEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(TodoRemindEditFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSaveRecord();
    }

    private final void refreshRemindTimeText() {
        RightArrowTwoLineTextView rightArrowTwoLineTextView = getMBinding().F;
        String string = getString(wzi.m);
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        rightArrowTwoLineTextView.setRemindText(TimeUtils.formatDate(string, Long.valueOf(todoRemindItem.getRemindTimeSecond() * ((long) 1000))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7(TodoRemindEditFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        TodoRemindItem todoRemindItem = (TodoRemindItem) pair.getSecond();
        if (zBooleanValue) {
            Intent intent = new Intent();
            intent.putExtra(KEY_REMIND_PARAM, todoRemindItem);
            intent.putExtra(KEY_REMIND_ADD_STATUS, this$0.addMode);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activity.setResult(10, intent);
            }
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCustomDialog() {
        boolean[] zArr = this.customWeeks;
        ArraysKt___ArraysJvmKt.copyInto(zArr, this.tempCustomWeeks, 0, 0, zArr.length);
        String[] stringArray = getResources().getStringArray(lhi.h);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.x2).setItems(stringArray).setPositiveText(wzi.g).setNegativeText(wzi.e).setItemsChoices(this.tempCustomWeeks).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment.showCustomDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                Logger.d("TodoRemindUiLog", "showCustomDialog " + which);
                if (which == -1) {
                    TodoRemindEditFragment.this.onCustomWeekDialogPositiveClick();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                super.onDialogMultiClick(dialogName, which, isChecked);
                Logger.d("TodoRemindUiLog", "showCustomDialog onDialogMultiClick " + which + " " + isChecked);
                if (which < 0 || which >= TodoRemindEditFragment.this.tempCustomWeeks.length) {
                    return;
                }
                TodoRemindEditFragment.this.tempCustomWeeks[which] = isChecked;
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showPeriodDialog() {
        String[] stringArray = getResources().getStringArray(lhi.m);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        CommonDialog.c items = new CommonDialog.c("").setDialogTitle(wzi.r2).setItems(stringArray);
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        CommonDialog commonDialogCreate = items.setItemsCheckedIndex(todoRemindItem.getRepeatMode()).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment.showPeriodDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != 5) {
                    TodoRemindItem todoRemindItem2 = TodoRemindEditFragment.this.todoRemindItem;
                    Intrinsics.checkNotNull(todoRemindItem2);
                    if (which == todoRemindItem2.getRepeatMode()) {
                        return;
                    }
                }
                if (which != 0 && which != 1) {
                    if (which == 2) {
                        TodoRemindItem todoRemindItem3 = TodoRemindEditFragment.this.todoRemindItem;
                        Intrinsics.checkNotNull(todoRemindItem3);
                        todoRemindItem3.setRepeatMode(2);
                        TodoRemindEditFragment.this.updateCustomWeekDay();
                        TodoRemindEditFragment.this.changePeriodTextByRepeat(which);
                        return;
                    }
                    if (which != 3 && which != 4) {
                        if (which != 5) {
                            return;
                        }
                        TodoRemindEditFragment.this.showCustomDialog();
                        return;
                    }
                }
                TodoRemindItem todoRemindItem4 = TodoRemindEditFragment.this.todoRemindItem;
                Intrinsics.checkNotNull(todoRemindItem4);
                todoRemindItem4.setRepeatMode(which);
                TodoRemindEditFragment.this.changePeriodTextByRepeat(which);
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showRemindTimeDialog() {
        DateTimePickerDialog dateTimePickerDialogCreate = new DateTimePickerDialog.a("").setDialogTitle(wzi.y8).setCustomLayoutId(eui.r1).setPositiveText(wzi.g).setNegativeText(wzi.e).setCancelable(true).c(new DateTimePickerDialog.b() { // from class: mhp
            @Override // com.xiaomi.fitness.baseui.dialog.DateTimePickerDialog.b
            public final String a(long j) {
                return TodoRemindEditFragment.showRemindTimeDialog$lambda$8(this.f26198a, j);
            }
        }).create();
        dateTimePickerDialogCreate.setRequestCode(1001);
        Pair<Long, Long> pairCreateRemindDateRange = EventMinderUtil.INSTANCE.createRemindDateRange();
        dateTimePickerDialogCreate.B(pairCreateRemindDateRange.getFirst().longValue());
        dateTimePickerDialogCreate.A(pairCreateRemindDateRange.getSecond().longValue());
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        dateTimePickerDialogCreate.y(todoRemindItem.getRemindTimeSecond() * ((long) 1000));
        dateTimePickerDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String showRemindTimeDialog$lambda$8(TodoRemindEditFragment this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return this$0.getString(wzi.G6, eventMinderUtil.getEventMinderYearMonthDayTime(contextRequireContext, j, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCustomWeekDay() {
        Calendar calendar = Calendar.getInstance();
        TodoRemindItem todoRemindItem = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem);
        calendar.setTimeInMillis(todoRemindItem.getRemindTimeSecond() * ((long) 1000));
        int i = calendar.get(7);
        TodoRemindItem todoRemindItem2 = this.todoRemindItem;
        Intrinsics.checkNotNull(todoRemindItem2);
        todoRemindItem2.setCustomDayStr(EventMinderUtil.INSTANCE.calendarWeekToLoop(i));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.isSuccess) {
            return false;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.g2).setNegativeText(wzi.e).setPositiveText(wzi.O1).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                FragmentActivity mActivity;
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1 || (mActivity = TodoRemindEditFragment.this.getMActivity()) == null) {
                    return;
                }
                mActivity.finish();
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Serializable serializable;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (serializable = arguments.getSerializable(KEY_REMIND_PARAM)) != null && (serializable instanceof TodoRemindItem)) {
            this.todoRemindItem = (TodoRemindItem) serializable;
            this.addMode = false;
        }
        if (this.todoRemindItem == null) {
            this.todoRemindItem = new TodoRemindItem(0, 0, 0, false, 0, null, (System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1L)) / ((long) 1000), null, 0L, 447, null);
            this.addMode = true;
        }
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
        View startView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.p8);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
            startView.setOnClickListener(new View.OnClickListener() { // from class: php
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TodoRemindEditFragment.onViewCreated$lambda$2(this.f30405a, view2);
                }
            });
        }
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, null, new View.OnClickListener() { // from class: qhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TodoRemindEditFragment.onViewCreated$lambda$3(this.f31531a, view2);
            }
        }, 5, null);
        initEditView();
        initSwitchView();
        initRemindPeriodView();
        initRemindTimeView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((TodoRemindViewModel) getMViewModel()).getAddOrUpdateResultLiveData().observe(getViewLifecycleOwner(), new TodoRemindEditFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ohp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindEditFragment.setListener$lambda$7(this.f29187a, (Pair) obj);
            }
        }));
        getMBinding().B.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment.setListener.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TodoRemindEditFragment.access$getMBinding(TodoRemindEditFragment.this).C.setVisibility((s == null || s.length() < 30) ? 8 : 0);
            }
        });
    }
}
