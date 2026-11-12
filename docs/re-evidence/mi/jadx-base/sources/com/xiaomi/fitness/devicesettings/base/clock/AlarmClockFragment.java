package com.xiaomi.fitness.devicesettings.base.clock;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilderKt;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment;
import com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment;
import com.xiaomi.fitness.devicesettings.common.extensions.ContextExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManager;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmNotifyEnabled;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.BaseSwitchButton;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.kf6;
import defpackage.ld8;
import defpackage.prf;
import defpackage.qyi;
import defpackage.uno;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.y08;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0091\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0091\u0001B\b¢\u0006\u0005\b\u0090\u0001\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J%\u0010\"\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010\u0007J\u001f\u0010+\u001a\u00020\u00052\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b+\u0010\u0018J!\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0014¢\u0006\u0004\b6\u0010\u0007J\u0019\u00109\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0005H\u0014¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\u0005H\u0014¢\u0006\u0004\b<\u0010\u0007J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\nJ-\u0010B\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010>2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020>0@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0005H\u0016¢\u0006\u0004\bF\u0010\u0007R\u0014\u0010G\u001a\u00020>8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010Q\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010W\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010K\u001a\u0004\bX\u0010M\"\u0004\bY\u0010OR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`R$\u0010d\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010\\\u001a\u0004\be\u0010^\"\u0004\bf\u0010`R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020i0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010HR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010,8Â\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u00010,8Â\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008c\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel;", "Lkf6;", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateSettingInfoListener;", "", "loadAlarmNotifyView", "()V", "", "isUnlockScreenSet", "()Z", "enable", "bindDataToView", "(Z)V", "isChecked", "handleAlarmNotifyCheck", "handleHuamiAlarmNotifyCheck", "handleBleAlarmNotifyCheck", "isDeviceConnected", "setHuamiAlarmAlertEnable", "", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "selectBeanList", "updateEditTitle", "(Ljava/util/List;)V", "isEditMode", "display", "showDataListView", "", "getNextClockId", "()I", "onAllButtonClick", "deleteList", "clockBean", "isExist", "(Ljava/util/List;Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;)Z", "startTimer", "stopTimer", "", "getCheckedList", "()Ljava/util/List;", "checkAlarmClocks", "list", "updateViewAfterDelete", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "setListener", "Lprf;", "event", "onDataEvent", "(Lprf;)V", "onVisible", "onInvisible", "onBackPressed", "", "did", "Ljava/util/HashMap;", "settingMap", "onSettingValueUpdate", "(Ljava/lang/String;Ljava/util/HashMap;)V", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "TAG", "Ljava/lang/String;", "Landroid/widget/LinearLayout;", "emptyLinear", "Landroid/widget/LinearLayout;", "getEmptyLinear", "()Landroid/widget/LinearLayout;", "setEmptyLinear", "(Landroid/widget/LinearLayout;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "alarmClockEditLinear", "getAlarmClockEditLinear", "setAlarmClockEditLinear", "Landroid/widget/TextView;", "addTv", "Landroid/widget/TextView;", "getAddTv", "()Landroid/widget/TextView;", "setAddTv", "(Landroid/widget/TextView;)V", "deleteTv", "getDeleteTv", "setDeleteTv", "mMaxTv", "getMMaxTv", "setMMaxTv", "alarmClockBeanList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel$AlarmClockList;", "alarmClockBeanBindingList", "Lcom/xiaomi/fitness/devicesettings/base/clock/a;", "adapter", "Lcom/xiaomi/fitness/devicesettings/base/clock/a;", "editMode", "Z", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "switchButton", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "currentDid", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "miBleDeviceManager", "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "immediateAlertAlarmEnabled", "Ljava/lang/Boolean;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onCheckedChangeCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "Ljava/util/Comparator;", "comparator", "Ljava/util/Comparator;", "getStartView", "()Landroid/view/View;", "startView", "getEndView", "endView", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAlarmClockFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmClockFragment.kt\ncom/xiaomi/fitness/devicesettings/base/clock/AlarmClockFragment\n*L\n1#1,687:1\n77#1:688\n76#1:689\n77#1:690\n77#1:691\n77#1:692\n76#1:693\n76#1:694\n77#1:695\n76#1:696\n76#1:697\n77#1:698\n*S KotlinDebug\n*F\n+ 1 AlarmClockFragment.kt\ncom/xiaomi/fitness/devicesettings/base/clock/AlarmClockFragment\n*L\n95#1:688\n114#1:689\n423#1:690\n435#1:691\n444#1:692\n452#1:693\n453#1:694\n456#1:695\n459#1:696\n460#1:697\n501#1:698\n*E\n"})
public final class AlarmClockFragment extends BaseBindingFragment<AlarmClockViewModel, kf6> implements DeviceSettingManager.UpdateSettingInfoListener {
    public static final int UPDATE_MSG_WHAT = 1;

    @NotNull
    private final String TAG;

    @Nullable
    private a adapter;

    @Nullable
    private TextView addTv;

    @NotNull
    private final List<AlarmClockViewModel.AlarmClockList> alarmClockBeanBindingList;

    @NotNull
    private final List<AlarmSettingItem> alarmClockBeanList;

    @Nullable
    private LinearLayout alarmClockEditLinear;

    @NotNull
    private final Comparator<AlarmSettingItem> comparator;

    @Nullable
    private String currentDid;

    @Nullable
    private TextView deleteTv;

    @Nullable
    private WearableDeviceModel deviceModel;
    private boolean editMode;

    @Nullable
    private LinearLayout emptyLinear;

    @Nullable
    private Boolean immediateAlertAlarmEnabled;

    @Nullable
    private TextView mMaxTv;

    @NotNull
    private final Handler mainHandler;

    @Nullable
    private MiBleDeviceManager miBleDeviceManager;

    @NotNull
    private final ISwitchButton.a onCheckedChangeCallback;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private ISwitchButton switchButton;

    @Nullable
    private Timer timer;

    @Nullable
    private TimerTask timerTask;

    public AlarmClockFragment() {
        super(eui.L);
        this.TAG = "AlarmClockFragment";
        this.alarmClockBeanList = new ArrayList();
        this.alarmClockBeanBindingList = new ArrayList();
        this.immediateAlertAlarmEnabled = Boolean.FALSE;
        this.mainHandler = new Handler(new Handler.Callback() { // from class: j31
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return AlarmClockFragment.mainHandler$lambda$1(this.f22366a, message);
            }
        });
        this.onCheckedChangeCallback = new ISwitchButton.a() { // from class: k31
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AlarmClockFragment.onCheckedChangeCallback$lambda$14(this.f23372a, z, iSwitchButton);
            }
        };
        this.comparator = new Comparator() { // from class: l31
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AlarmClockFragment.comparator$lambda$19((AlarmSettingItem) obj, (AlarmSettingItem) obj2);
            }
        };
    }

    public static final /* synthetic */ kf6 access$getMBinding(AlarmClockFragment alarmClockFragment) {
        return alarmClockFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDataToView(boolean enable) {
        SwitchButtonTwoLineTextView alarmNotifyView = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(alarmNotifyView, "alarmNotifyView");
        ViewExtKt.visible(alarmNotifyView);
        BaseSwitchButton.j(getMBinding().B.getSwitchButton(), enable, this.onCheckedChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAlarmClocks() {
        a aVar = this.adapter;
        Intrinsics.checkNotNull(aVar);
        if (aVar.l() != null) {
            a aVar2 = this.adapter;
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.l().size() > 0) {
                a aVar3 = this.adapter;
                Intrinsics.checkNotNull(aVar3);
                boolean z = false;
                for (AlarmSettingItem alarmSettingItem : new ArrayList(aVar3.l())) {
                    Intrinsics.checkNotNull(alarmSettingItem);
                    if (alarmSettingItem.getAlarmType() == 0 && System.currentTimeMillis() >= alarmSettingItem.getNextAlarmTimeLong() && alarmSettingItem.isEnable()) {
                        alarmSettingItem.setEnable(false);
                        z = true;
                    }
                }
                if (z) {
                    this.mainHandler.sendEmptyMessage(1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparator$lambda$19(AlarmSettingItem alarmSettingItem, AlarmSettingItem alarmSettingItem2) {
        return alarmSettingItem.getTime() - alarmSettingItem2.getTime();
    }

    private final void display(boolean isEditMode) {
        View startView;
        this.editMode = isEditMode;
        if (!isEditMode) {
            setTitle(getString(wzi.C1));
            wc0 miuiActionBar = getMiuiActionBar();
            View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
            if (endView != null) {
                endView.setVisibility(8);
            }
            LinearLayout linearLayout = this.alarmClockEditLinear;
            Intrinsics.checkNotNull(linearLayout);
            linearLayout.setVisibility(8);
            TextView textView = this.addTv;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            wc0 miuiActionBar2 = getMiuiActionBar();
            View startView2 = miuiActionBar2 != null ? miuiActionBar2.getStartView() : null;
            if (startView2 != null) {
                startView2.setBackgroundResource(jni.Q0);
            }
            wc0 miuiActionBar3 = getMiuiActionBar();
            startView = miuiActionBar3 != null ? miuiActionBar3.getStartView() : null;
            if (startView != null) {
                startView.setContentDescription(getString(wzi.d));
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.alarmClockEditLinear;
        Intrinsics.checkNotNull(linearLayout2);
        linearLayout2.setVisibility(0);
        TextView textView2 = this.addTv;
        Intrinsics.checkNotNull(textView2);
        textView2.setVisibility(8);
        wc0 miuiActionBar4 = getMiuiActionBar();
        View endView2 = miuiActionBar4 != null ? miuiActionBar4.getEndView() : null;
        if (endView2 != null) {
            endView2.setVisibility(0);
            endView2.setBackgroundResource(jni.Q);
            a aVar = this.adapter;
            Intrinsics.checkNotNull(aVar);
            endView2.setSelected(aVar.getSelectItemList().size() == this.alarmClockBeanList.size());
            endView2.setOnClickListener(new View.OnClickListener() { // from class: c31
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlarmClockFragment.display$lambda$17$lambda$16(this.f4877a, view);
                }
            });
        }
        String quantityString = getResources().getQuantityString(qyi.common_selected_num, 1, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
        wc0 miuiActionBar5 = getMiuiActionBar();
        View startView3 = miuiActionBar5 != null ? miuiActionBar5.getStartView() : null;
        if (startView3 != null) {
            startView3.setBackgroundResource(jni.c0);
        }
        wc0 miuiActionBar6 = getMiuiActionBar();
        startView = miuiActionBar6 != null ? miuiActionBar6.getStartView() : null;
        if (startView != null) {
            startView.setContentDescription(getString(wzi.common_cancel));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void display$lambda$17$lambda$16(AlarmClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAllButtonClick();
    }

    private final List<AlarmSettingItem> getCheckedList() {
        a aVar = this.adapter;
        Intrinsics.checkNotNull(aVar);
        return aVar.getSelectItemList();
    }

    private final View getEndView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            return miuiActionBar.getEndView();
        }
        return null;
    }

    private final int getNextClockId() {
        if (this.alarmClockBeanList.size() == 0) {
            return 1;
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(this.alarmClockBeanList);
        int id = 1;
        for (int i = 0; i < this.alarmClockBeanList.size(); i++) {
            AlarmSettingItem alarmSettingItem = this.alarmClockBeanList.get(i);
            if (id < alarmSettingItem.getId()) {
                break;
            }
            id = alarmSettingItem.getId() + 1;
        }
        return id;
    }

    private final View getStartView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            return miuiActionBar.getStartView();
        }
        return null;
    }

    private final void handleAlarmNotifyCheck(boolean isChecked) {
        WearableDeviceModel wearableDeviceModel;
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        if ((wearableDeviceModel2 == null || !DeviceModelExtKt.isKongMing(wearableDeviceModel2)) && ((wearableDeviceModel = this.deviceModel) == null || !DeviceModelExtKt.isPanGu(wearableDeviceModel))) {
            handleBleAlarmNotifyCheck(isChecked);
        } else {
            handleHuamiAlarmNotifyCheck(isChecked);
        }
    }

    private final void handleBleAlarmNotifyCheck(boolean isChecked) {
        DeviceSettingsPreference.INSTANCE.setKEY_SYNC_MIUI_ALARM(isChecked);
    }

    private final void handleHuamiAlarmNotifyCheck(boolean isChecked) {
        if (!isChecked) {
            setHuamiAlarmAlertEnable(false);
        } else if (isUnlockScreenSet()) {
            setHuamiAlarmAlertEnable(true);
        } else {
            new CommonDialog.c("turn on unlock phone").setDialogTitle(wzi.d2).setDialogDescription(wzi.c6).setCancelable(false).setPositiveText(wzi.b6).setNegativeText(wzi.U5).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment.handleHuamiAlarmNotifyCheck.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        AlarmClockFragment.this.bindDataToView(false);
                    } else {
                        if (which != -1) {
                            return;
                        }
                        Context context = AlarmClockFragment.this.getContext();
                        if (context != null) {
                            ContextExtKt.gotoPage(context, UnlockPhoneFragment.class, null);
                        }
                        AlarmClockFragment.this.bindDataToView(false);
                    }
                }

                @Override // defpackage.av6
                public void onDialogEvent(String dialogName, DialogInterface dialog, int what) {
                    super.onDialogEvent(dialogName, dialog, what);
                    if (what == 3) {
                        AlarmClockFragment alarmClockFragment = AlarmClockFragment.this;
                        Boolean bool = alarmClockFragment.immediateAlertAlarmEnabled;
                        alarmClockFragment.bindDataToView(bool != null ? bool.booleanValue() : false);
                    }
                }
            }).showIfNeed(getParentFragmentManager());
        }
    }

    private final boolean isDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            return true;
        }
        Context context = getContext();
        if (context == null) {
            return false;
        }
        ToastExtKt.toastShort(context, wzi.u);
        return false;
    }

    private final boolean isExist(List<? extends AlarmSettingItem> deleteList, AlarmSettingItem clockBean) {
        Iterator<? extends AlarmSettingItem> it = deleteList.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == clockBean.getId()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isUnlockScreenSet() {
        if (!((AlarmClockViewModel) getMViewModel()).hasScreenLockPwd(getActivity())) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (Settings.Secure.getInt(activity != null ? activity.getContentResolver() : null, "bluetooth_unlock_status", 0) == 0) {
            return false;
        }
        FragmentActivity activity2 = getActivity();
        String string = Settings.Secure.getString(activity2 != null ? activity2.getContentResolver() : null, "bluetooth_address_to_unlock");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        return Intrinsics.areEqual(string, wearableDeviceModel != null ? DeviceModelExtKt.getMac(wearableDeviceModel) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadAlarmNotifyView() {
        WearableDeviceModel wearableDeviceModel;
        AlarmClockViewModel alarmClockViewModel = (AlarmClockViewModel) getMViewModel();
        PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        if (!alarmClockViewModel.hasClockInstalled(packageManager)) {
            SwitchButtonTwoLineTextView alarmNotifyView = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(alarmNotifyView, "alarmNotifyView");
            ViewExtKt.gone(alarmNotifyView);
            View singleLine = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(singleLine, "singleLine");
            ViewExtKt.gone(singleLine);
            return;
        }
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        if ((wearableDeviceModel2 != null && DeviceModelExtKt.isPanGu(wearableDeviceModel2)) || ((wearableDeviceModel = this.deviceModel) != null && DeviceModelExtKt.isKongMing(wearableDeviceModel))) {
            this.miBleDeviceManager = MiBleDeviceManager.INSTANCE.createManager(ApplicationExtKt.getApplication(), new MiBleDeviceManagerListener() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment.loadAlarmNotifyView.1
                @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
                public void onDestroy() {
                    Logger.i(AlarmClockFragment.this.TAG, "MiBleDeviceManagerHelper onDestroy");
                    AlarmClockFragment.this.miBleDeviceManager = null;
                }

                @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
                public void onInit(MiBleDeviceManager manager) {
                    Intrinsics.checkNotNullParameter(manager, "manager");
                    Logger.i(AlarmClockFragment.this.TAG, "MiBleDeviceManagerHelper onInit true");
                    try {
                        AlarmClockFragment alarmClockFragment = AlarmClockFragment.this;
                        WearableDeviceModel wearableDeviceModel3 = alarmClockFragment.deviceModel;
                        Intrinsics.checkNotNull(wearableDeviceModel3);
                        alarmClockFragment.immediateAlertAlarmEnabled = Boolean.valueOf(manager.getSettingsBoolean(DeviceModelExtKt.getMac(wearableDeviceModel3), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED));
                        Logger.i(AlarmClockFragment.this.TAG, "MiBleDeviceManager alarmEnabled : " + AlarmClockFragment.this.immediateAlertAlarmEnabled);
                        if (!AlarmClockFragment.this.isUnlockScreenSet()) {
                            AlarmClockFragment.this.bindDataToView(false);
                            AlarmClockFragment.this.setHuamiAlarmAlertEnable(false);
                        } else {
                            AlarmClockFragment alarmClockFragment2 = AlarmClockFragment.this;
                            Boolean bool = alarmClockFragment2.immediateAlertAlarmEnabled;
                            alarmClockFragment2.bindDataToView(bool != null ? bool.booleanValue() : false);
                        }
                    } catch (Exception e) {
                        Logger.i(AlarmClockFragment.this.TAG, "MiBleDeviceManager alarmEnabled false: " + e);
                        SwitchButtonTwoLineTextView alarmNotifyView2 = AlarmClockFragment.access$getMBinding(AlarmClockFragment.this).B;
                        Intrinsics.checkNotNullExpressionValue(alarmNotifyView2, "alarmNotifyView");
                        ViewExtKt.gone(alarmNotifyView2);
                    }
                }
            });
            return;
        }
        WearableDeviceModel wearableDeviceModel3 = this.deviceModel;
        if (wearableDeviceModel3 != null && DeviceModelExtKt.isL66(wearableDeviceModel3)) {
            ((AlarmClockViewModel) getMViewModel()).supportLinkageMiuiAlarm(new Function1() { // from class: n31
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AlarmClockFragment.loadAlarmNotifyView$lambda$13(this.f27497a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        WearableDeviceModel wearableDeviceModel4 = this.deviceModel;
        if (wearableDeviceModel4 == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel4, "miui_clock_alert")) {
            getMBinding().B.setVisibility(8);
            getMBinding().F.setVisibility(8);
        } else {
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            bindDataToView(deviceSettingsPreference.getKEY_SYNC_MIUI_ALARM());
            deviceSettingsPreference.setKEY_SYNC_MIUI_ALARM(getMBinding().B.getSwitch());
        }
        WearableDeviceModel wearableDeviceModel5 = this.deviceModel;
        if (wearableDeviceModel5 != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel5, Feature.CLOCK)) {
            FrameLayout alarmClockBottomView = getMBinding().D.B;
            Intrinsics.checkNotNullExpressionValue(alarmClockBottomView, "alarmClockBottomView");
            ViewExtKt.visible(alarmClockBottomView);
        } else {
            FrameLayout alarmClockBottomView2 = getMBinding().D.B;
            Intrinsics.checkNotNullExpressionValue(alarmClockBottomView2, "alarmClockBottomView");
            ViewExtKt.gone(alarmClockBottomView2);
            LinearLayout alarmClockEmptyLinear = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(alarmClockEmptyLinear, "alarmClockEmptyLinear");
            ViewExtKt.gone(alarmClockEmptyLinear);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAlarmNotifyView$lambda$13(AlarmClockFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            this$0.bindDataToView(deviceSettingsPreference.getKEY_SYNC_MIUI_ALARM());
            deviceSettingsPreference.setKEY_SYNC_MIUI_ALARM(this$0.getMBinding().B.getSwitch());
        } else {
            this$0.getMBinding().B.setVisibility(8);
            this$0.getMBinding().F.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mainHandler$lambda$1(AlarmClockFragment this$0, Message message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == 1) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AlarmSettingItem alarmSettingItem : this$0.alarmClockBeanList) {
                if (alarmSettingItem.isIsSmart()) {
                    arrayList.add(alarmSettingItem);
                } else {
                    arrayList2.add(alarmSettingItem);
                }
            }
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, this$0.comparator);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, this$0.comparator);
            this$0.alarmClockBeanBindingList.clear();
            if (arrayList.size() > 0) {
                this$0.alarmClockBeanBindingList.add(new AlarmClockViewModel.AlarmClockList(2, null));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this$0.alarmClockBeanBindingList.add(new AlarmClockViewModel.AlarmClockList(1, (AlarmSettingItem) it.next()));
                }
            }
            if (arrayList2.size() > 0) {
                this$0.alarmClockBeanBindingList.add(new AlarmClockViewModel.AlarmClockList(3, null));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    this$0.alarmClockBeanBindingList.add(new AlarmClockViewModel.AlarmClockList(1, (AlarmSettingItem) it2.next()));
                }
            }
            try {
                this$0.showDataListView();
                a aVar = this$0.adapter;
                Intrinsics.checkNotNull(aVar);
                aVar.notifyDataSetChanged();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    private final void onAllButtonClick() {
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        if (endView != null) {
            if (endView.isSelected()) {
                endView.setSelected(false);
                a aVar = this.adapter;
                Intrinsics.checkNotNull(aVar);
                aVar.setSelectAll(false);
                setTitle(getString(wzi.O));
                return;
            }
            endView.setSelected(true);
            a aVar2 = this.adapter;
            Intrinsics.checkNotNull(aVar2);
            aVar2.setSelectAll(true);
            String quantityString = getResources().getQuantityString(qyi.common_selected_num, this.alarmClockBeanList.size(), Integer.valueOf(this.alarmClockBeanList.size()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            setTitle(quantityString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCheckedChangeCallback$lambda$14(AlarmClockFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDeviceConnected()) {
            this$0.handleAlarmNotifyCheck(z);
        } else {
            this$0.bindDataToView(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHuamiAlarmAlertEnable(boolean enable) {
        MiBleDeviceManager miBleDeviceManager;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || (miBleDeviceManager = this.miBleDeviceManager) == null) {
            return;
        }
        Intrinsics.checkNotNull(wearableDeviceModel);
        boolean settings = miBleDeviceManager.setSettings(DeviceModelExtKt.getMac(wearableDeviceModel), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED, enable);
        Logger.d("MiBleDeviceManager setAlertAlarmResult " + enable + ": " + settings, new Object[0]);
        if (settings) {
            this.immediateAlertAlarmEnabled = Boolean.valueOf(enable);
            AlarmNotifyEnabled alarmNotifyEnabled = new AlarmNotifyEnabled();
            alarmNotifyEnabled.setEnable(enable);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel2);
            companion.sendSettingItem(wearableDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_ALARM_NOTIFY_ENABLED, alarmNotifyEnabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$10(AlarmClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.alarmClockBeanList.size() < ((AlarmClockViewModel) this$0.getMViewModel()).getSupportMax()) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22824"), "name", "add_alarm_btn");
            Bundle bundle = new Bundle();
            bundle.putInt("key_param1", this$0.getNextClockId());
            bundle.putBoolean(AlarmClockAddFragment.KEY_SUPPORT_BLE_INTELLIGENCE, ((AlarmClockViewModel) this$0.getMViewModel()).getSupportBleIntelligence());
            bundle.putBoolean(AlarmClockAddFragment.KEY_SUPPORT_BLE_WORK_HOLIDAY, ((AlarmClockViewModel) this$0.getMViewModel()).getSupportBleWorkHoliday());
            BaseFragmentExKt.gotoPage(this$0, AlarmClockAddFragment.class, bundle);
            return;
        }
        int supportMax = ((AlarmClockViewModel) this$0.getMViewModel()).getSupportMax();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            String quantityString = this$0.getResources().getQuantityString(qyi.f31972a, supportMax, Integer.valueOf(supportMax));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ToastExtKt.toastShort(mActivity, quantityString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$12(final AlarmClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.adapter;
        Intrinsics.checkNotNull(aVar);
        List<AlarmSettingItem> selectItemList = aVar.getSelectItemList();
        if (!selectItemList.isEmpty()) {
            this$0.getMBinding().D.C.setEnabled(false);
            AlarmClockViewModel alarmClockViewModel = (AlarmClockViewModel) this$0.getMViewModel();
            Intrinsics.checkNotNull(selectItemList);
            alarmClockViewModel.deleteAlarms(selectItemList, new Function1() { // from class: m31
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AlarmClockFragment.setListener$lambda$12$lambda$11(this.f25698a, (List) obj);
                }
            });
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            String string = this$0.getString(wzi.N);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(mActivity, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$12$lambda$11(AlarmClockFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AlarmClockFragment$setListener$10$1$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(AlarmClockFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.lambda$onCreate$0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(AlarmClockFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onAllButtonClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4(AlarmClockFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.alarmClockBeanList.clear();
        List<AlarmSettingItem> list2 = this$0.alarmClockBeanList;
        Intrinsics.checkNotNull(list);
        list2.addAll(list);
        this$0.mainHandler.sendEmptyMessage(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$5(AlarmClockFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (num != null && num.intValue() == 1) {
            a aVar = this$0.adapter;
            Intrinsics.checkNotNull(aVar);
            aVar.n(this$0.switchButton);
        } else if (num != null && num.intValue() == 2) {
            this$0.stopTimer();
        } else if (num != null && num.intValue() == 3) {
            this$0.startTimer();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(AlarmClockFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.display(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$7(AlarmClockFragment this$0, ISwitchButton iSwitchButton, AlarmSettingItem alarmSettingItem, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        this$0.switchButton = iSwitchButton;
        AlarmClockViewModel alarmClockViewModel = (AlarmClockViewModel) this$0.getMViewModel();
        Intrinsics.checkNotNull(alarmSettingItem);
        alarmClockViewModel.syncRemoteAlarmData(z, alarmSettingItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(AlarmClockFragment this$0, CompoundButton compoundButton, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.updateEditTitle(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$9(AlarmClockFragment this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.alarmClockBeanBindingList.get(i).getItem() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        AlarmSettingItem item = this$0.alarmClockBeanBindingList.get(i).getItem();
        Intrinsics.checkNotNull(item);
        bundle.putInt("key_param1", item.getId());
        bundle.putSerializable(AlarmClockAddFragment.KEY_CLOCK_BEAN, this$0.alarmClockBeanBindingList.get(i).getItem());
        bundle.putBoolean(AlarmClockAddFragment.KEY_SUPPORT_BLE_INTELLIGENCE, ((AlarmClockViewModel) this$0.getMViewModel()).getSupportBleIntelligence());
        bundle.putBoolean(AlarmClockAddFragment.KEY_SUPPORT_BLE_WORK_HOLIDAY, ((AlarmClockViewModel) this$0.getMViewModel()).getSupportBleWorkHoliday());
        BaseFragmentExKt.gotoPage(this$0, AlarmClockAddFragment.class, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDataListView() {
        if (this.alarmClockBeanList.size() > 0) {
            LinearLayout linearLayout = this.emptyLinear;
            Intrinsics.checkNotNull(linearLayout);
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.emptyLinear;
        Intrinsics.checkNotNull(linearLayout2);
        linearLayout2.setVisibility(0);
        String quantityString = getResources().getQuantityString(qyi.f31973b, ((AlarmClockViewModel) getMViewModel()).getSupportMax(), Integer.valueOf(((AlarmClockViewModel) getMViewModel()).getSupportMax()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        TextView textView = this.mMaxTv;
        Intrinsics.checkNotNull(textView);
        textView.setText(getString(wzi.K, quantityString));
        RecyclerView recyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setVisibility(8);
    }

    private final void startTimer() {
        if (this.timerTask == null) {
            this.timerTask = new TimerTask() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    AlarmClockFragment.this.checkAlarmClocks();
                }
            };
        }
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            Intrinsics.checkNotNull(timer);
            timer.scheduleAtFixedRate(this.timerTask, 1000L, VibrateModeProgressBar.sLongToLong);
        }
    }

    private final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            Intrinsics.checkNotNull(timerTask);
            timerTask.cancel();
            this.timerTask = null;
        }
        Timer timer = this.timer;
        if (timer != null) {
            Intrinsics.checkNotNull(timer);
            timer.cancel();
            Timer timer2 = this.timer;
            Intrinsics.checkNotNull(timer2);
            timer2.purge();
            this.timer = null;
        }
    }

    private final void updateEditTitle(List<? extends AlarmSettingItem> selectBeanList) {
        View endView;
        if (this.editMode) {
            if (this.alarmClockBeanList.size() == 0) {
                a aVar = this.adapter;
                Intrinsics.checkNotNull(aVar);
                aVar.setEditMode(false);
                display(false);
                return;
            }
            if (selectBeanList.size() == this.alarmClockBeanList.size()) {
                String quantityString = getResources().getQuantityString(qyi.common_selected_num, selectBeanList.size(), Integer.valueOf(selectBeanList.size()));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                setTitle(quantityString);
                wc0 miuiActionBar = getMiuiActionBar();
                endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
                if (endView != null) {
                    endView.setSelected(true);
                    return;
                }
                return;
            }
            if (selectBeanList.isEmpty()) {
                setTitle(getString(wzi.O));
            } else {
                String quantityString2 = getResources().getQuantityString(qyi.common_selected_num, selectBeanList.size(), Integer.valueOf(selectBeanList.size()));
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                setTitle(quantityString2);
            }
            wc0 miuiActionBar2 = getMiuiActionBar();
            endView = miuiActionBar2 != null ? miuiActionBar2.getEndView() : null;
            if (endView != null) {
                endView.setSelected(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewAfterDelete(List<? extends AlarmSettingItem> list) {
        hideLoading();
        if (!(!list.isEmpty())) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_delete_failure);
                return;
            }
            return;
        }
        Iterator<AlarmSettingItem> it = this.alarmClockBeanList.iterator();
        while (it.hasNext()) {
            AlarmSettingItem next = it.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem");
            if (list.contains(next)) {
                it.remove();
            }
        }
        List<AlarmSettingItem> checkedList = getCheckedList();
        if (checkedList != null) {
            Iterator<AlarmSettingItem> it2 = checkedList.iterator();
            while (it2.hasNext()) {
                if (list.contains(it2.next())) {
                    it2.remove();
                }
            }
            updateEditTitle(checkedList);
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    @Nullable
    public final TextView getAddTv() {
        return this.addTv;
    }

    @Nullable
    public final LinearLayout getAlarmClockEditLinear() {
        return this.alarmClockEditLinear;
    }

    @Nullable
    public final TextView getDeleteTv() {
        return this.deleteTv;
    }

    @Nullable
    public final LinearLayout getEmptyLinear() {
        return this.emptyLinear;
    }

    @Nullable
    public final TextView getMMaxTv() {
        return this.mMaxTv;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            this.currentDid = wearableDeviceModel.getDid();
            this.deviceModel = wearableDeviceModel;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!this.editMode) {
            return false;
        }
        a aVar = this.adapter;
        Intrinsics.checkNotNull(aVar);
        aVar.setEditMode(false);
        display(false);
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        DeviceSettingManager.INSTANCE.getInstance().addUpdateListener(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@Nullable prf event) {
        if (event instanceof y08) {
            y08 y08Var = (y08) event;
            if (y08Var.b() != null) {
                this.alarmClockBeanList.clear();
                List<AlarmSettingItem> list = this.alarmClockBeanList;
                List<AlarmSettingItem> listB = y08Var.b();
                Intrinsics.checkNotNullExpressionValue(listB, "getList(...)");
                list.addAll(listB);
                this.mainHandler.sendEmptyMessage(1);
                return;
            }
            AlarmSettingItem alarmSettingItemA = y08Var.a();
            Intrinsics.checkNotNullExpressionValue(alarmSettingItemA, "getAlarmClockItem(...)");
            if (isExist(this.alarmClockBeanList, alarmSettingItemA)) {
                int size = this.alarmClockBeanList.size();
                for (int i = 0; i < size; i++) {
                    if (alarmSettingItemA.getId() == this.alarmClockBeanList.get(i).getId()) {
                        this.alarmClockBeanList.set(i, alarmSettingItemA);
                        break;
                    }
                }
            } else {
                this.alarmClockBeanList.add(0, alarmSettingItemA);
            }
            this.mainHandler.sendEmptyMessage(1);
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ld8.c().r(this);
        DeviceSettingManager.INSTANCE.getInstance().removeUpdateListener(this);
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        stopTimer();
    }

    @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateSettingInfoListener
    public void onSettingValueUpdate(@Nullable String did, @NotNull HashMap<String, String> settingMap) {
        String str;
        Intrinsics.checkNotNullParameter(settingMap, "settingMap");
        if (Intrinsics.areEqual(this.currentDid, did) && settingMap.containsKey(DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK) && (str = settingMap.get(DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK)) != null) {
            Object objFromJson = new Gson().fromJson(str, (Class<Object>) AlarmSetting.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            AlarmSetting alarmSetting = (AlarmSetting) objFromJson;
            this.alarmClockBeanList.clear();
            if (alarmSetting.getAlarmItems() != null) {
                List<AlarmSettingItem> list = this.alarmClockBeanList;
                List<AlarmSettingItem> alarmItems = alarmSetting.getAlarmItems();
                Intrinsics.checkNotNullExpressionValue(alarmItems, "getAlarmItems(...)");
                list.addAll(alarmItems);
            }
            this.mainHandler.sendEmptyMessage(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.adapter = new a(getActivity(), this.alarmClockBeanBindingList);
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.I);
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        if (endView != null) {
            endView.setVisibility(8);
        }
        this.emptyLinear = getMBinding().A;
        this.recyclerView = getMBinding().C;
        this.mMaxTv = getMBinding().E;
        this.addTv = getMBinding().D.A;
        this.alarmClockEditLinear = getMBinding().D.D;
        this.deleteTv = getMBinding().D.C;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.adapter);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.CLOCK)) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            ((AlarmClockViewModel) getMViewModel()).getAlarms();
        }
        loadAlarmNotifyView();
        wc0 miuiActionBar2 = getMiuiActionBar();
        View startView = miuiActionBar2 != null ? miuiActionBar2.getStartView() : null;
        if (startView != null) {
            startView.setContentDescription(getString(wzi.d));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        startTimer();
    }

    public final void setAddTv(@Nullable TextView textView) {
        this.addTv = textView;
    }

    public final void setAlarmClockEditLinear(@Nullable LinearLayout linearLayout) {
        this.alarmClockEditLinear = linearLayout;
    }

    public final void setDeleteTv(@Nullable TextView textView) {
        this.deleteTv = textView;
    }

    public final void setEmptyLinear(@Nullable LinearLayout linearLayout) {
        this.emptyLinear = linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, ActionBarParamBuilderKt.defaultActionBarParamBuilder(this).setEndView(jni.Q).create(), new Function1() { // from class: o31
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmClockFragment.setListener$lambda$2(this.f28685a, (View) obj);
            }
        }, new Function1() { // from class: p31
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmClockFragment.setListener$lambda$3(this.f29951a, (View) obj);
            }
        }, null, null, 24, null);
        ((AlarmClockViewModel) getMViewModel()).getAlarmList().observe(getViewLifecycleOwner(), new AlarmClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q31
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmClockFragment.setListener$lambda$4(this.f31033a, (List) obj);
            }
        }));
        ((AlarmClockViewModel) getMViewModel()).getSwitchStatus().observe(getViewLifecycleOwner(), new AlarmClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r31
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmClockFragment.setListener$lambda$5(this.f32127a, (Integer) obj);
            }
        }));
        a aVar = this.adapter;
        Intrinsics.checkNotNull(aVar);
        aVar.setOnEditModeChageListener(new a.e() { // from class: d31
            @Override // com.xiaomi.fitness.devicesettings.base.clock.a.e
            public final void a(boolean z) {
                AlarmClockFragment.setListener$lambda$6(this.f15023a, z);
            }
        });
        a aVar2 = this.adapter;
        Intrinsics.checkNotNull(aVar2);
        aVar2.setOnItemCheckChangeLister(new a.f() { // from class: e31
            @Override // com.xiaomi.fitness.devicesettings.base.clock.a.f
            public final void a(ISwitchButton iSwitchButton, AlarmSettingItem alarmSettingItem, boolean z) {
                AlarmClockFragment.setListener$lambda$7(this.f16206a, iSwitchButton, alarmSettingItem, z);
            }
        });
        a aVar3 = this.adapter;
        Intrinsics.checkNotNull(aVar3);
        aVar3.setOnItemSelectListener(new a.g() { // from class: f31
            @Override // com.xiaomi.fitness.devicesettings.base.clock.a.g
            public final void a(CompoundButton compoundButton, List list) {
                AlarmClockFragment.setListener$lambda$8(this.f17349a, compoundButton, list);
            }
        });
        a aVar4 = this.adapter;
        Intrinsics.checkNotNull(aVar4);
        aVar4.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: g31
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AlarmClockFragment.setListener$lambda$9(this.f18536a, adapterView, view, i, j);
            }
        });
        getMBinding().D.A.setOnClickListener(new View.OnClickListener() { // from class: h31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmClockFragment.setListener$lambda$10(this.f19638a, view);
            }
        });
        getMBinding().D.C.setOnClickListener(new View.OnClickListener() { // from class: i31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmClockFragment.setListener$lambda$12(this.f20724a, view);
            }
        });
    }

    public final void setMMaxTv(@Nullable TextView textView) {
        this.mMaxTv = textView;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }
}
