package com.huami.assistant.ui.v2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.assistant.R;
import com.huami.assistant.ui.fragment.ReminderMinutePickerFragment;
import com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment;
import com.huami.assistant.ui.schedule.fragment.CalendarTimePickerFragment;
import com.huami.assistant.ui.schedule.fragment.EditRepeatEventOptionFragment;
import com.huami.assistant.ui.v2.AddFragment;
import com.huami.assistant.ui.v2.model.ScheduleEditType;
import com.huami.assistant.ui.v2.model.ScheduleListModel;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleResult;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.ui.v2.util.RepeatModeFormatUtil;
import com.huami.assistant.ui.v2.viewmodel.AddOrUpdateScheduleViewModel;
import com.huami.assistant.util.EventUtils;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J(\u0010\"\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\b\u0010(\u001a\u00020\u0002H\u0002J&\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u001a\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016R\u001d\u00108\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010F\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010ER\u001d\u0010I\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010ER\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/huami/assistant/ui/v2/AddFragment;", "Landroidx/fragment/app/Fragment;", "", "V", "U", "k0", "j0", "g0", "G", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "schedule", "m0", "", "allDay", "", "reminderMinute", "F", "mode", "E", "C", "minute", "", "baseTime", LogUtil.D, "isAllDay", "B", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "activity", "Lcom/huami/assistant/ui/schedule/fragment/CalendarPickerFragment;", "calendarPicker", "", "title", "tag", "l0", "Q", "R", "d0", "showLoadingDialog", "w", "v", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "a", "Lkotlin/Lazy;", "x", "()Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "editScheduleViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "c", "Z", "mIsAddMode", GoogleApiAvailabilityLight.a, "J", "mCurrentPosition", "e", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/assistant/ui/schedule/fragment/CalendarPickerFragment;", "mStartTimeCalendarPicker", "f", "y", "mEndTimeCalendarPicker", "Lcom/huami/assistant/ui/fragment/ReminderMinutePickerFragment;", "g", "z", "()Lcom/huami/assistant/ui/fragment/ReminderMinutePickerFragment;", "mReminderMinPicker", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class AddFragment extends Fragment {

    @NotNull
    public static final String ARGS_SCHEDULE = "args_schedule";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy editScheduleViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean mIsAddMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long mCurrentPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStartTimeCalendarPicker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEndTimeCalendarPicker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mReminderMinPicker;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/schedule/fragment/CalendarPickerFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CalendarPickerFragment> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalendarPickerFragment getA() {
            return new CalendarPickerFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/fragment/ReminderMinutePickerFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ReminderMinutePickerFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReminderMinutePickerFragment getA() {
            return new ReminderMinutePickerFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/schedule/fragment/CalendarPickerFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<CalendarPickerFragment> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalendarPickerFragment getA() {
            return new CalendarPickerFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "type", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ScheduleEditType, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull ScheduleEditType scheduleEditType) {
            AddFragment.this.x().delete(AddFragment.this.mCurrentPosition, scheduleEditType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScheduleEditType scheduleEditType) {
            a(scheduleEditType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "type", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ScheduleEditType, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull ScheduleEditType scheduleEditType) {
            AddFragment.this.x().save(AddFragment.this.mCurrentPosition, scheduleEditType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScheduleEditType scheduleEditType) {
            a(scheduleEditType);
            return Unit.INSTANCE;
        }
    }

    public AddFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.assistant.ui.v2.AddFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.editScheduleViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AddOrUpdateScheduleViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.assistant.ui.v2.AddFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
        this.mIsAddMode = true;
        this.mStartTimeCalendarPicker = LazyKt__LazyJVMKt.lazy(c.a);
        this.mEndTimeCalendarPicker = LazyKt__LazyJVMKt.lazy(a.a);
        this.mReminderMinPicker = LazyKt__LazyJVMKt.lazy(b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalendarPickerFragment A() {
        return (CalendarPickerFragment) this.mStartTimeCalendarPicker.getValue();
    }

    private final int B(boolean isAllDay) {
        return isAllDay ? 20 : 149;
    }

    private final void C(int mode) {
        y().setMode(mode);
    }

    private final void D(int minute, long baseTime) {
        z().setData(requireContext(), minute, baseTime);
    }

    private final void E(int mode) {
        A().setMode(mode);
    }

    private final boolean F(boolean allDay, int reminderMinute) {
        int[] intArray = getResources().getIntArray(allDay ? R.array.allday_reminder_minute : R.array.reminder_minute);
        int length = intArray.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = intArray[i2];
            i2++;
            if (i3 == reminderMinute) {
                return true;
            }
        }
        return false;
    }

    private final void G() {
        x().getScheduleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: u7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddFragment.H(this.a, (ScheduleModel) obj);
            }
        });
        x().getEditStatusLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: w7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddFragment.J(this.a, (Integer) obj);
            }
        });
        x().getProgressData().observe(getViewLifecycleOwner(), new Observer() { // from class: v7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddFragment.P(this.a, (ScheduleResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(AddFragment addFragment, ScheduleModel scheduleModel) {
        View view = addFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.reminder_all_day))).setChecked(scheduleModel.isAllDayEvent());
        View view2 = addFragment.getView();
        long j2 = 1000;
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.tv_schedule_start))).setTips(DateUtils.formatDateTime(addFragment.requireContext(), scheduleModel.getStartTime() * j2, addFragment.B(scheduleModel.isAllDayEvent())));
        boolean zIsAllDayEvent = scheduleModel.isAllDayEvent();
        long stopTime = scheduleModel.getStopTime() * j2;
        if (zIsAllDayEvent) {
            stopTime -= 86400000;
        }
        View view3 = addFragment.getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.tv_schedule_end))).setTips(DateUtils.formatDateTime(addFragment.requireContext(), stopTime, addFragment.B(scheduleModel.isAllDayEvent())));
        addFragment.E(scheduleModel.isAllDayEvent() ? 1 : 0);
        addFragment.C(scheduleModel.isAllDayEvent() ? 1 : 0);
        addFragment.D((int) scheduleModel.getAlertTime(), scheduleModel.isAllDayEvent() ? scheduleModel.getStartTime() * j2 : 0L);
        View view4 = addFragment.getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.tv_schedule_reminder_type))).setTips(RepeatModeFormatUtil.INSTANCE.formatStr(scheduleModel.getRepeatMode(), addFragment.requireContext()));
        String reminderMinute = EventUtils.formatReminderMinute(addFragment.requireContext(), (int) scheduleModel.getAlertTime(), scheduleModel.isAllDayEvent() ? scheduleModel.getStartTime() * j2 : 0L);
        if (addFragment.F(scheduleModel.isAllDayEvent(), (int) scheduleModel.getAlertTime())) {
            View view5 = addFragment.getView();
            ((ListTile) (view5 == null ? null : view5.findViewById(R.id.tv_schedule_reminder_min))).setTrailing(ContextCompat.getDrawable(addFragment.requireContext(), R.drawable.ic_arrow_forward_16));
            View view6 = addFragment.getView();
            ((ListTile) (view6 == null ? null : view6.findViewById(R.id.tv_schedule_reminder_min))).setClickable(true);
            View view7 = addFragment.getView();
            ((ListTile) (view7 == null ? null : view7.findViewById(R.id.tv_schedule_reminder_min))).setTips(reminderMinute);
        } else {
            View view8 = addFragment.getView();
            ((ListTile) (view8 == null ? null : view8.findViewById(R.id.tv_schedule_reminder_min))).setTrailing((Drawable) null);
            View view9 = addFragment.getView();
            ((ListTile) (view9 == null ? null : view9.findViewById(R.id.tv_schedule_reminder_min))).setClickable(false);
            View view10 = addFragment.getView();
            ((ListTile) (view10 == null ? null : view10.findViewById(R.id.tv_schedule_reminder_min))).setTips(addFragment.getString(R.string.event_not_editable, reminderMinute));
        }
        if (!scheduleModel.getSource().getIsUserSchedule()) {
            View view11 = addFragment.getView();
            ((RainbowTitleBar) (view11 == null ? null : view11.findViewById(R.id.action_bar))).setMenuText("");
            View view12 = addFragment.getView();
            ((RainbowTitleBar) (view12 != null ? view12.findViewById(R.id.action_bar) : null)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: c8
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view13, int i2) {
                    AddFragment.I(view13, i2);
                }
            });
        }
        addFragment.m0(scheduleModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(final AddFragment addFragment, Integer num) {
        if (num != null && num.intValue() == 0) {
            View view = addFragment.getView();
            ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.action_bar))).setNavigationText(R.string.cancel);
            View view2 = addFragment.getView();
            ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.action_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: j8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AddFragment.K(this.a, view3);
                }
            });
            View view3 = addFragment.getView();
            ((RainbowTitleBar) (view3 == null ? null : view3.findViewById(R.id.action_bar))).setMenuText(R.string.confirm);
            View view4 = addFragment.getView();
            ((RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.action_bar))).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: z7
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view5, int i2) {
                    AddFragment.L(this.a, view5, i2);
                }
            });
            View view5 = addFragment.getView();
            ((LinearLayout) (view5 == null ? null : view5.findViewById(R.id.ll_show))).setVisibility(8);
            View view6 = addFragment.getView();
            ((LinearLayout) (view6 == null ? null : view6.findViewById(R.id.ll_edit))).setVisibility(0);
            View view7 = addFragment.getView();
            ((Button) (view7 != null ? view7.findViewById(R.id.schedule_delete) : null)).setVisibility(addFragment.mIsAddMode ? 8 : 0);
            return;
        }
        View view8 = addFragment.getView();
        ((RainbowTitleBar) (view8 == null ? null : view8.findViewById(R.id.action_bar))).setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
        View view9 = addFragment.getView();
        ((RainbowTitleBar) (view9 == null ? null : view9.findViewById(R.id.action_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: g8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                AddFragment.M(this.a, view10);
            }
        });
        if (num != null && num.intValue() == 2) {
            View view10 = addFragment.getView();
            ((RainbowTitleBar) (view10 == null ? null : view10.findViewById(R.id.action_bar))).setMenuText("");
            View view11 = addFragment.getView();
            ((RainbowTitleBar) (view11 == null ? null : view11.findViewById(R.id.action_bar))).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: a8
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view12, int i2) {
                    AddFragment.N(view12, i2);
                }
            });
        } else {
            View view12 = addFragment.getView();
            ((RainbowTitleBar) (view12 == null ? null : view12.findViewById(R.id.action_bar))).setMenuText(R.string.edit);
            View view13 = addFragment.getView();
            ((RainbowTitleBar) (view13 == null ? null : view13.findViewById(R.id.action_bar))).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: y7
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view14, int i2) {
                    AddFragment.O(this.a, view14, i2);
                }
            });
        }
        View view14 = addFragment.getView();
        ((LinearLayout) (view14 == null ? null : view14.findViewById(R.id.ll_show))).setVisibility(0);
        View view15 = addFragment.getView();
        ((LinearLayout) (view15 == null ? null : view15.findViewById(R.id.ll_edit))).setVisibility(8);
        View view16 = addFragment.getView();
        ((Button) (view16 != null ? view16.findViewById(R.id.schedule_delete) : null)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(AddFragment addFragment, View view) {
        addFragment.v();
        if (addFragment.x().hasChange()) {
            addFragment.d0();
        } else {
            FragmentKt.findNavController(addFragment).navigateUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(AddFragment addFragment, View view, int i2) {
        addFragment.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(AddFragment addFragment, View view) {
        addFragment.v();
        FragmentKt.findNavController(addFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(View view, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(AddFragment addFragment, View view, int i2) {
        addFragment.x().setEditStatus(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(AddFragment addFragment, ScheduleResult scheduleResult) {
        if (scheduleResult.isFail()) {
            addFragment.w();
            Toast.makeText(addFragment.requireContext(), R.string.save_failed, 0).show();
        } else {
            if (scheduleResult.isSuccess()) {
                addFragment.w();
                Toast.makeText(addFragment.requireContext(), R.string.save_success, 0).show();
                addFragment.v();
                FragmentKt.findNavController(addFragment).navigateUp();
                return;
            }
            if (scheduleResult.isLoading()) {
                addFragment.showLoadingDialog();
            } else {
                addFragment.w();
            }
        }
    }

    private final void Q() {
        v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ScheduleModel value = x().getScheduleLiveData().getValue();
        if (value != null) {
            boolean zIsAllDayEvent = value.isAllDayEvent();
            long stopTime = value.getStopTime();
            jCurrentTimeMillis = zIsAllDayEvent ? (stopTime * ((long) 1000)) - 86400000 : stopTime * ((long) 1000);
        }
        y().show(requireActivity(), jCurrentTimeMillis, new CalendarPickerFragment.OnTimeSelectListener() { // from class: com.huami.assistant.ui.v2.AddFragment$onClickScheduleEndTime$2
            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeClick() {
                AddFragment addFragment = this.a;
                addFragment.l0(addFragment.requireActivity(), this.a.y(), this.a.getString(R.string.end_time), "Picker-EndTime");
            }

            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeSelect(long time, boolean changed) {
                if (changed) {
                    this.a.x().setEndTime(time);
                }
            }
        }, "Picker-EndDate");
    }

    private final void R() {
        v();
        z().show(requireActivity(), getString(R.string.remind), new ReminderMinutePickerFragment.MinuteSelectListener() { // from class: x7
            @Override // com.huami.assistant.ui.fragment.ReminderMinutePickerFragment.MinuteSelectListener
            public final void onItemSelect(int i2) {
                AddFragment.S(this.a, i2);
            }
        }, "reminder time");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(AddFragment addFragment, int i2) {
        addFragment.x().setAlertTime(i2);
    }

    private final void T() {
        v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ScheduleModel value = x().getScheduleLiveData().getValue();
        if (value != null) {
            jCurrentTimeMillis = value.getStartTime() * ((long) 1000);
        }
        A().show(requireActivity(), jCurrentTimeMillis, new CalendarPickerFragment.OnTimeSelectListener() { // from class: com.huami.assistant.ui.v2.AddFragment$onClickScheduleStartTime$2
            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeClick() {
                AddFragment addFragment = this.a;
                addFragment.l0(addFragment.requireActivity(), this.a.A(), this.a.getString(R.string.start_time), "Picker-StartTime");
            }

            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeSelect(long time, boolean changed) {
                if (changed) {
                    this.a.x().setStartTime(time);
                }
            }
        }, "Picker-StartDate");
    }

    private final void U() {
        if (this.mIsAddMode) {
            return;
        }
        j0();
    }

    private final void V() {
        String string;
        String string2;
        String string3;
        v();
        View view = getView();
        Editable text = ((EditText) (view == null ? null : view.findViewById(R.id.et_schedule_title))).getText();
        if (TextUtils.isEmpty(text == null ? null : text.toString())) {
            Toast.makeText(requireContext(), R.string.input_title_msg, 0).show();
            return;
        }
        AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModelX = x();
        View view2 = getView();
        Editable text2 = ((EditText) (view2 == null ? null : view2.findViewById(R.id.et_schedule_title))).getText();
        String str = "";
        if (text2 == null || (string = text2.toString()) == null) {
            string = "";
        }
        addOrUpdateScheduleViewModelX.saveTitle(string);
        AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModelX2 = x();
        View view3 = getView();
        Editable text3 = ((EditText) (view3 == null ? null : view3.findViewById(R.id.reminder_desc))).getText();
        if (text3 == null || (string2 = text3.toString()) == null) {
            string2 = "";
        }
        addOrUpdateScheduleViewModelX2.saveDesc(string2);
        AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModelX3 = x();
        View view4 = getView();
        Editable text4 = ((EditText) (view4 != null ? view4.findViewById(R.id.et_schedule_address) : null)).getText();
        if (text4 != null && (string3 = text4.toString()) != null) {
            str = string3;
        }
        addOrUpdateScheduleViewModelX3.saveAddress(str);
        if (!this.mIsAddMode) {
            k0();
        } else if (x().isScheduleOverCount()) {
            new AlertDialogFragment.Builder(requireActivity()).setMessage(getResources().getQuantityString(R.plurals.schedule_over_count, 200, 200)).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: d8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AddFragment.W(dialogInterface, i2);
                }
            }).show(getChildFragmentManager(), "schedule warn");
        } else {
            AddOrUpdateScheduleViewModel.save$default(x(), 0L, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(AddFragment addFragment, View view) {
        ScheduleModel value = addFragment.x().getScheduleLiveData().getValue();
        ScheduleRepeatMode repeatMode = value == null ? null : value.getRepeatMode();
        if (repeatMode == null) {
            repeatMode = ScheduleRepeatMode.Once.INSTANCE;
        }
        ScheduleRepeatPickerFragment.INSTANCE.show(addFragment.getChildFragmentManager(), repeatMode, ScheduleRepeatMode.INSTANCE.isSupportWorkDay(), addFragment.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(AddFragment addFragment, View view) {
        addFragment.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(AddFragment addFragment, View view) {
        addFragment.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(AddFragment addFragment, View view) {
        addFragment.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(AddFragment addFragment, CompoundButton compoundButton, boolean z) {
        addFragment.x().setAllDay(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(AddFragment addFragment, View view) {
        addFragment.U();
    }

    private final void d0() {
        v();
        new AlertDialogFragment.Builder(requireActivity()).setMessage(R.string.cancel_edit_schedule_toast).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: e8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AddFragment.e0(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: q7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AddFragment.f0(this.a, dialogInterface, i2);
            }
        }).show(getChildFragmentManager(), "schedule warn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(AddFragment addFragment, DialogInterface dialogInterface, int i2) {
        FragmentKt.findNavController(addFragment).navigateUp();
    }

    private final void g0() {
        new AlertDialogFragment.Builder(requireActivity()).setMessage(R.string.delete_update_confirm).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: f8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AddFragment.h0(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: b8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AddFragment.i0(this.a, dialogInterface, i2);
            }
        }).show(getChildFragmentManager(), "delete update confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(AddFragment addFragment, DialogInterface dialogInterface, int i2) {
        AddOrUpdateScheduleViewModel.delete$default(addFragment.x(), 0L, null, 3, null);
    }

    private final void j0() {
        if (x().needSplit()) {
            EditRepeatEventOptionFragment.INSTANCE.show(requireActivity(), true, new d());
        } else {
            g0();
        }
    }

    private final void k0() {
        if (x().needSplit()) {
            EditRepeatEventOptionFragment.INSTANCE.show(requireActivity(), false, new e());
        } else {
            AddOrUpdateScheduleViewModel.save$default(x(), 0L, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(final Activity activity, final CalendarPickerFragment calendarPicker, String title, String tag) {
        calendarPicker.dismiss();
        CalendarTimePickerFragment calendarTimePickerFragment = new CalendarTimePickerFragment();
        calendarTimePickerFragment.setMode(2);
        calendarTimePickerFragment.show(activity, title, calendarPicker.getSelectTime(), new CalendarPickerFragment.OnTimeSelectListener() { // from class: com.huami.assistant.ui.v2.AddFragment$showTimePickerDialog$1
            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeClick() {
            }

            @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
            public void onTimeSelect(long time, boolean changed) {
                if (changed) {
                    calendarPicker.setCurrentTime(time);
                }
                calendarPicker.show(activity);
            }
        }, tag);
    }

    private final void m0(ScheduleModel schedule) {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.show_schedule_title))).setText(schedule.getTitle());
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.show_reminder_desc))).setText(schedule.getDesc());
        long startTime = this.mCurrentPosition;
        if (startTime == 0) {
            startTime = schedule.getStartTime();
        }
        long j2 = this.mCurrentPosition;
        long startTime2 = j2 != 0 ? (j2 - schedule.getStartTime()) + schedule.getStopTime() : schedule.getStopTime();
        View view3 = getView();
        long j3 = 1000;
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.show_schedule_start))).setText(DateUtils.formatDateTime(requireContext(), startTime * j3, B(schedule.isAllDayEvent())));
        long j4 = startTime2 * j3;
        if (schedule.isAllDayEvent()) {
            j4 -= 86400000;
        }
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.show_schedule_end))).setText(DateUtils.formatDateTime(requireContext(), j4, B(schedule.isAllDayEvent())));
        View view5 = getView();
        ((TextView) (view5 == null ? null : view5.findViewById(R.id.show_schedule_reminder_type))).setText(RepeatModeFormatUtil.INSTANCE.formatStr(schedule.getRepeatMode(), requireContext()));
        String reminderMinute = EventUtils.formatReminderMinute(requireContext(), (int) schedule.getAlertTime(), schedule.isAllDayEvent() ? schedule.getStartTime() * j3 : 0L);
        View view6 = getView();
        ((TextView) (view6 == null ? null : view6.findViewById(R.id.show_schedule_reminder_min))).setText(reminderMinute);
        View view7 = getView();
        ((TextView) (view7 == null ? null : view7.findViewById(R.id.show_schedule_address))).setText(schedule.getAddress());
        View view8 = getView();
        ((TextView) (view8 != null ? view8.findViewById(R.id.show_schedule_address) : null)).setVisibility(TextUtils.isEmpty(schedule.getAddress()) ? 8 : 0);
    }

    private final void showLoadingDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        LoadingDialog loadingDialog2 = null;
        if (loadingDialog != null) {
            if (!loadingDialog.isShowing()) {
                loadingDialog = null;
            }
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext());
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            loadingDialog2 = loadingDialogShowDialog;
        }
        this.mLoadingDialog = loadingDialog2;
    }

    private final void v() {
        Context context = getContext();
        InputMethodManager inputMethodManager = (InputMethodManager) (context == null ? null : context.getSystemService("input_method"));
        if (inputMethodManager == null || getView() == null) {
            return;
        }
        View view = getView();
        inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
    }

    private final void w() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddOrUpdateScheduleViewModel x() {
        return (AddOrUpdateScheduleViewModel) this.editScheduleViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalendarPickerFragment y() {
        return (CalendarPickerFragment) this.mEndTimeCalendarPicker.getValue();
    }

    private final ReminderMinutePickerFragment z() {
        return (ReminderMinutePickerFragment) this.mReminderMinPicker.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_schedule, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(ARGS_SCHEDULE);
        ScheduleListModel scheduleListModel = serializable instanceof ScheduleListModel ? (ScheduleListModel) serializable : null;
        if (scheduleListModel != null) {
            this.mIsAddMode = false;
            this.mCurrentPosition = scheduleListModel.getExpandTime();
            x().setSchedule(scheduleListModel.getSchedule());
            View view2 = getView();
            ((EditText) (view2 == null ? null : view2.findViewById(R.id.et_schedule_title))).setText(scheduleListModel.getSchedule().getTitle());
            View view3 = getView();
            ((EditText) (view3 == null ? null : view3.findViewById(R.id.reminder_desc))).setText(scheduleListModel.getSchedule().getDesc());
            View view4 = getView();
            ((EditText) (view4 == null ? null : view4.findViewById(R.id.et_schedule_address))).setText(scheduleListModel.getSchedule().getAddress());
        }
        View view5 = getView();
        ((RainbowTitleBar) (view5 == null ? null : view5.findViewById(R.id.action_bar))).setTitle(getString(this.mIsAddMode ? R.string.add_schedule : R.string.edit_schedule));
        View view6 = getView();
        ((ListTile) (view6 == null ? null : view6.findViewById(R.id.tv_schedule_reminder_type))).setOnClickListener(new View.OnClickListener() { // from class: s7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                AddFragment.X(this.a, view7);
            }
        });
        View view7 = getView();
        ((ListTile) (view7 == null ? null : view7.findViewById(R.id.tv_schedule_reminder_min))).setOnClickListener(new View.OnClickListener() { // from class: h8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                AddFragment.Y(this.a, view8);
            }
        });
        View view8 = getView();
        ((ListTile) (view8 == null ? null : view8.findViewById(R.id.tv_schedule_start))).setOnClickListener(new View.OnClickListener() { // from class: i8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                AddFragment.Z(this.a, view9);
            }
        });
        View view9 = getView();
        ((ListTile) (view9 == null ? null : view9.findViewById(R.id.tv_schedule_end))).setOnClickListener(new View.OnClickListener() { // from class: k8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                AddFragment.a0(this.a, view10);
            }
        });
        View view10 = getView();
        ((ListTile) (view10 == null ? null : view10.findViewById(R.id.reminder_all_day))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddFragment.b0(this.a, compoundButton, z);
            }
        });
        View view11 = getView();
        ((Button) (view11 == null ? null : view11.findViewById(R.id.schedule_delete))).setVisibility(8);
        View view12 = getView();
        ((Button) (view12 == null ? null : view12.findViewById(R.id.schedule_delete))).setOnClickListener(new View.OnClickListener() { // from class: r7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view13) {
                AddFragment.c0(this.a, view13);
            }
        });
        View view13 = getView();
        ((EditText) (view13 != null ? view13.findViewById(R.id.et_schedule_address) : null)).setVisibility(SettingRepo.INSTANCE.loadScheduleVersion().getSupportLocation() ? 0 : 8);
        G();
    }
}
