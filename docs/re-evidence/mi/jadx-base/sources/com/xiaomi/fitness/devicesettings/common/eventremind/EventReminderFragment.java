package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilder;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventReminderFragment;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import defpackage.av6;
import defpackage.eui;
import defpackage.jm6;
import defpackage.jni;
import defpackage.ld8;
import defpackage.m28;
import defpackage.prf;
import defpackage.qyi;
import defpackage.uno;
import defpackage.wc0;
import defpackage.wzi;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0006J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventReminderFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventRemindViewModel;", "Ljm6;", "", "showDeleteDialog", "()V", "onAllButtonClick", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "minderModel", "bindDataToView", "(Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;)V", "startTimer", "stopTimer", "checkEventMinders", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", "isEditMode", "display", "(Z)V", "onBackPressed", "()Z", "onVisible", "onInvisible", LifecycleConstantKt.ON_DESTROY, "Lprf;", "event", "onMessageEvent", "(Lprf;)V", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter;", "eventMinderAdapter", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "editMode", "Z", "", "supportMaxCount", "I", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Landroid/widget/TextView;", "eventReminderAddView", "Landroid/widget/TextView;", "eventReminderEditView", "eventReminderDeleteView", "Landroid/view/ViewGroup;", "eventMinderEditLinear", "Landroid/view/ViewGroup;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EventReminderFragment extends BaseBindingFragment<EventRemindViewModel, jm6> {

    @Nullable
    private WearableDeviceModel deviceModel;
    private boolean editMode;
    private EventMinderAdapter eventMinderAdapter;

    @Nullable
    private ViewGroup eventMinderEditLinear;

    @Nullable
    private TextView eventReminderAddView;

    @Nullable
    private TextView eventReminderDeleteView;

    @Nullable
    private TextView eventReminderEditView;
    private int supportMaxCount;

    @Nullable
    private Timer timer;

    @Nullable
    private TimerTask timerTask;

    public EventReminderFragment() {
        super(eui.P1);
        this.supportMaxCount = 50;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EventRemindViewModel access$getMViewModel(EventReminderFragment eventReminderFragment) {
        return (EventRemindViewModel) eventReminderFragment.getMViewModel();
    }

    private final void bindDataToView(EventMinderModel minderModel) {
        hideLoading();
        EventMinderAdapter eventMinderAdapter = null;
        List<EventReMinderItem> eventMinders = minderModel != null ? minderModel.getEventMinders() : null;
        Integer numValueOf = minderModel != null ? Integer.valueOf(minderModel.getSupportMaxItemCount()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.supportMaxCount = numValueOf.intValue();
        if (eventMinders == null || eventMinders.isEmpty()) {
            getMBinding().B.setVisibility(0);
            getMBinding().C.setVisibility(8);
            TextView textView = this.eventReminderEditView;
            if (textView != null) {
                textView.setEnabled(false);
            }
        } else {
            getMBinding().B.setVisibility(8);
            getMBinding().C.setVisibility(0);
            TextView textView2 = this.eventReminderEditView;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
        }
        EventMinderAdapter eventMinderAdapter2 = this.eventMinderAdapter;
        if (eventMinderAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
        } else {
            eventMinderAdapter = eventMinderAdapter2;
        }
        eventMinderAdapter.setMinderModel(minderModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkEventMinders() {
        EventMinderAdapter eventMinderAdapter = this.eventMinderAdapter;
        EventMinderAdapter eventMinderAdapter2 = null;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        if (eventMinderAdapter.getCount() > 0) {
            EventMinderAdapter eventMinderAdapter3 = this.eventMinderAdapter;
            if (eventMinderAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            } else {
                eventMinderAdapter2 = eventMinderAdapter3;
            }
            final EventMinderModel minderModel = eventMinderAdapter2.getMinderModel();
            if (minderModel != null) {
                minderModel.init(minderModel.getEventMinders());
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.runOnUiThread(new Runnable() { // from class: se8
                        @Override // java.lang.Runnable
                        public final void run() {
                            EventReminderFragment.checkEventMinders$lambda$13$lambda$12(this.f33562a, minderModel);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkEventMinders$lambda$13$lambda$12(EventReminderFragment this$0, EventMinderModel eventMinderModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderAdapter eventMinderAdapter = this$0.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        eventMinderAdapter.setMinderModel(eventMinderModel);
    }

    private final void onAllButtonClick() {
        View endView;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        EventMinderAdapter eventMinderAdapter = null;
        if (endView.isSelected()) {
            endView.setSelected(false);
            EventMinderAdapter eventMinderAdapter2 = this.eventMinderAdapter;
            if (eventMinderAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            } else {
                eventMinderAdapter = eventMinderAdapter2;
            }
            eventMinderAdapter.setSelectAll(false);
            setTitle(getString(wzi.C6));
            return;
        }
        endView.setSelected(true);
        EventMinderAdapter eventMinderAdapter3 = this.eventMinderAdapter;
        if (eventMinderAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter3 = null;
        }
        eventMinderAdapter3.setSelectAll(true);
        Resources resources = getResources();
        int i = qyi.common_selected_num;
        EventMinderAdapter eventMinderAdapter4 = this.eventMinderAdapter;
        if (eventMinderAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter4 = null;
        }
        int count = eventMinderAdapter4.getCount();
        Object[] objArr = new Object[1];
        EventMinderAdapter eventMinderAdapter5 = this.eventMinderAdapter;
        if (eventMinderAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
        } else {
            eventMinderAdapter = eventMinderAdapter5;
        }
        objArr[0] = Integer.valueOf(eventMinderAdapter.getCount());
        String quantityString = resources.getQuantityString(i, count, objArr);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(EventReminderFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EventReminderFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onAllButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(EventReminderFragment this$0, EventMinderModel eventMinderModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindDataToView(eventMinderModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$6(EventReminderFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this$0.hideLoading();
            if (zBooleanValue) {
                EventMinderAdapter eventMinderAdapter = this$0.eventMinderAdapter;
                if (eventMinderAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
                    eventMinderAdapter = null;
                }
                eventMinderAdapter.setEditMode(false);
                this$0.display(false);
                this$0.bindDataToView(((EventRemindViewModel) this$0.getMViewModel()).getCurrentModel());
            }
            ((EventRemindViewModel) this$0.getMViewModel()).getDeleteState().setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(EventReminderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderAdapter eventMinderAdapter = this$0.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        if (eventMinderAdapter.getCount() < this$0.supportMaxCount) {
            BaseFragmentExKt.gotoPage(this$0, EditEventMinderFragment.class, null);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            Resources resources = this$0.getResources();
            int i = qyi.h;
            int i2 = this$0.supportMaxCount;
            String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ToastExtKt.toastShort(mActivity, quantityString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(EventReminderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderAdapter eventMinderAdapter = this$0.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        eventMinderAdapter.setEditMode(true);
        this$0.display(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(EventReminderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EventMinderAdapter eventMinderAdapter = this$0.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        if (!eventMinderAdapter.getSelectItemList().isEmpty()) {
            this$0.showDeleteDialog();
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.m2);
        }
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete").setDialogTitle(wzi.I6).setDialogDescription(wzi.A6).setPositiveText(wzi.common_delete).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventReminderFragment.showDeleteDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    EventMinderAdapter eventMinderAdapter = null;
                    PageState.DefaultImpls.showLoading$default(EventReminderFragment.this, wzi.N1, false, 2, null);
                    EventRemindViewModel eventRemindViewModelAccess$getMViewModel = EventReminderFragment.access$getMViewModel(EventReminderFragment.this);
                    EventMinderAdapter eventMinderAdapter2 = EventReminderFragment.this.eventMinderAdapter;
                    if (eventMinderAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
                    } else {
                        eventMinderAdapter = eventMinderAdapter2;
                    }
                    eventRemindViewModelAccess$getMViewModel.deleteEventMinders(eventMinderAdapter.getSelectItemList());
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void startTimer() {
        if (this.timerTask == null) {
            this.timerTask = new TimerTask() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventReminderFragment.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    EventReminderFragment.this.checkEventMinders();
                }
            };
        }
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.scheduleAtFixedRate(this.timerTask, 10000L, 10000L);
        }
    }

    private final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timerTask = null;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.purge();
        }
        this.timer = null;
    }

    public final void display(boolean isEditMode) {
        View endView;
        View endView2;
        this.editMode = isEditMode;
        EventMinderAdapter eventMinderAdapter = null;
        if (!isEditMode) {
            setTitle(getString(wzi.e4));
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
                endView.setVisibility(8);
            }
            ViewGroup viewGroup = this.eventMinderEditLinear;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.eventReminderDeleteView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            setStartViewRes(jni.Q0, null);
            return;
        }
        ViewGroup viewGroup2 = this.eventMinderEditLinear;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView2 = this.eventReminderDeleteView;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        setTitle(getString(wzi.C6));
        setStartViewRes(jni.c0, null);
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 == null || (endView2 = miuiActionBar2.getEndView()) == null) {
            return;
        }
        endView2.setBackgroundResource(jni.Q);
        EventMinderAdapter eventMinderAdapter2 = this.eventMinderAdapter;
        if (eventMinderAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter2 = null;
        }
        int size = eventMinderAdapter2.getSelectItemList().size();
        EventMinderAdapter eventMinderAdapter3 = this.eventMinderAdapter;
        if (eventMinderAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
        } else {
            eventMinderAdapter = eventMinderAdapter3;
        }
        endView2.setSelected(size == eventMinderAdapter.getCount());
        endView2.setVisibility(0);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ld8.c().p(this);
        this.eventMinderAdapter = new EventMinderAdapter(context);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!this.editMode) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity == null) {
                return true;
            }
            mActivity.finish();
            return true;
        }
        EventMinderAdapter eventMinderAdapter = this.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        eventMinderAdapter.setEditMode(false);
        display(false);
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ld8.c().r(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        stopTimer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uno(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull prf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof m28) {
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                ((EventRemindViewModel) getMViewModel()).getDatas();
            } else {
                ((EventRemindViewModel) getMViewModel()).updateModel();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View endView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.e4);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, new ActionBarParamBuilder().setStartView(jni.Q0).setEndView(jni.Q).create(), new Function1() { // from class: qe8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EventReminderFragment.onViewCreated$lambda$0(this.f31433a, (View) obj);
            }
        }, new Function1() { // from class: re8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EventReminderFragment.onViewCreated$lambda$1(this.f32467a, (View) obj);
            }
        }, null, null, 24, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setVisibility(8);
        }
        this.eventReminderAddView = getMBinding().A.C;
        this.eventReminderDeleteView = getMBinding().A.D;
        this.eventReminderEditView = getMBinding().A.E;
        this.eventMinderEditLinear = getMBinding().A.B;
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        linearLayoutManager.setOrientation(1);
        getMBinding().C.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = getMBinding().C;
        EventMinderAdapter eventMinderAdapter = this.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        recyclerView.setAdapter(eventMinderAdapter);
        if (this.deviceModel != null) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
            ((EventRemindViewModel) getMViewModel()).getDatas();
        } else {
            ToastUtil.showShortToast(wzi.u);
            onBackPressed();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        startTimer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        EventRemindViewModel eventRemindViewModel = (EventRemindViewModel) getMViewModel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        eventRemindViewModel.observerModel(viewLifecycleOwner, new Observer() { // from class: te8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EventReminderFragment.setListener$lambda$4(this.f34620a, (EventMinderModel) obj);
            }
        });
        ((EventRemindViewModel) getMViewModel()).getDeleteState().observe(getViewLifecycleOwner(), new EventReminderFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ue8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EventReminderFragment.setListener$lambda$6(this.f35682a, (Boolean) obj);
            }
        }));
        getMBinding().A.C.setOnClickListener(new View.OnClickListener() { // from class: ve8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventReminderFragment.setListener$lambda$7(this.f36797a, view);
            }
        });
        getMBinding().A.E.setOnClickListener(new View.OnClickListener() { // from class: we8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventReminderFragment.setListener$lambda$8(this.f37892a, view);
            }
        });
        getMBinding().A.D.setOnClickListener(new View.OnClickListener() { // from class: xe8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventReminderFragment.setListener$lambda$9(this.f39042a, view);
            }
        });
        EventMinderAdapter eventMinderAdapter = this.eventMinderAdapter;
        if (eventMinderAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
            eventMinderAdapter = null;
        }
        eventMinderAdapter.setOnItemSelectListener(new EventMinderAdapter.OnItemSelectListener() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventReminderFragment.setListener.6
            @Override // com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderAdapter.OnItemSelectListener
            public void onItemSelect(List<EventReMinderItem> mindItemList) {
                View endView;
                Intrinsics.checkNotNullParameter(mindItemList, "mindItemList");
                int size = mindItemList.size();
                EventMinderAdapter eventMinderAdapter2 = EventReminderFragment.this.eventMinderAdapter;
                if (eventMinderAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventMinderAdapter");
                    eventMinderAdapter2 = null;
                }
                if (size == eventMinderAdapter2.getCount()) {
                    String quantityString = EventReminderFragment.this.getResources().getQuantityString(qyi.common_selected_num, mindItemList.size(), Integer.valueOf(mindItemList.size()));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    EventReminderFragment.this.setTitle(quantityString);
                    wc0 miuiActionBar = EventReminderFragment.this.getMiuiActionBar();
                    endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
                    Intrinsics.checkNotNull(endView);
                    endView.setSelected(true);
                    return;
                }
                if (mindItemList.size() == 0) {
                    EventReminderFragment eventReminderFragment = EventReminderFragment.this;
                    eventReminderFragment.setTitle(eventReminderFragment.getString(wzi.C6));
                } else {
                    String quantityString2 = EventReminderFragment.this.getResources().getQuantityString(qyi.common_selected_num, mindItemList.size(), Integer.valueOf(mindItemList.size()));
                    Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                    EventReminderFragment.this.setTitle(quantityString2);
                }
                wc0 miuiActionBar2 = EventReminderFragment.this.getMiuiActionBar();
                endView = miuiActionBar2 != null ? miuiActionBar2.getEndView() : null;
                Intrinsics.checkNotNull(endView);
                endView.setSelected(false);
            }
        });
    }
}
