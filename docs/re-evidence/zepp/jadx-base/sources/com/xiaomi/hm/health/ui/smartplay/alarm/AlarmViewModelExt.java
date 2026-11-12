package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.app.Application;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 O2\u00020\u0001:\u0001OB\u000f\u0012\u0006\u0010(\u001a\u00020#¢\u0006\u0004\bM\u0010NJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0018\u0010\u0015\u001a\u00020\u00072\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00070\u0012j\u0002`\u0013J\u0018\u0010\u0016\u001a\u00020\u00072\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00070\u0012j\u0002`\u0013J\u0006\u0010\u0017\u001a\u00020\u0007J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0007J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0019\u0010(\u001a\u00020#8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\t0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00106\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\t0\t0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+R*\u00109\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t070)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010+R\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0C8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER!\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020C8F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010ER!\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020C8F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010ER\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0C8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010ER'\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t070C8F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u001b\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0C8F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010E¨\u0006P"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmViewModelExt;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmViewModel;", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarms", "", "operation", "", "a", "", "result", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "setUp", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "hmDeviceType", "prepareAlarmAction", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmChangeListener;", "alarmChangeListener", "registerAlarmChangeListener", "unRegisterAlarmChangeListener", "loadAlarmData", "isEdit", "setAlarms", "queryDeviceAlarm", "enable", "setEnable", "setIsEdit", "alarm", "deleteAlarm", "doneEditSource", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmItem;", "alarmList2AlarmItemList", "Landroid/app/Application;", GoogleApiAvailabilityLight.a, "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Landroidx/lifecycle/MutableLiveData;", "e", "Landroidx/lifecycle/MutableLiveData;", "_alarmClocks", "f", "_editAlarmClocks", "g", "_isEdit", "h", "Ljava/lang/Integer;", "_operatorInEditStatus", "kotlin.jvm.PlatformType", "i", "_enable", "Lkotlin/Pair;", z.j, "_result", hl.k, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "l", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "m", "_alarmVersionInfo", "Landroidx/lifecycle/LiveData;", "getEnable", "()Landroidx/lifecycle/LiveData;", "getAlarmClocks", "alarmClocks", "getEditAlarmClocks", "editAlarmClocks", "getResult", "getAlarmVersionInfo", "alarmVersionInfo", "<init>", "(Landroid/app/Application;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmViewModelExt extends AlarmViewModel {
    public static final int ALARM_DELETE = 1;
    public static final int ALARM_DONE = 255;
    public static final int ALARM_NULL = 0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Alarm>> _alarmClocks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Alarm>> _editAlarmClocks;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isEdit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Integer _operatorInEditStatus;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _enable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Boolean>> _result;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType hmDeviceType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<AlarmVersionInfo> _alarmVersionInfo;

    public AlarmViewModelExt(@NotNull Application application) {
        super(application);
        this.app = application;
        this._alarmClocks = new MutableLiveData<>();
        this._editAlarmClocks = new MutableLiveData<>(new ArrayList());
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        this._isEdit = mutableLiveData;
        this._operatorInEditStatus = 0;
        this._enable = new MutableLiveData<>(Boolean.TRUE);
        this._result = new MutableLiveData<>(new Pair(0, null));
        this.hmDeviceType = HMDeviceType.MILI;
        this.deviceSource = HMDeviceSource.VDEVICE;
        this._alarmVersionInfo = new MutableLiveData<>(null);
    }

    private final void a(final List<Alarm> alarms, final int operation) {
        List<Alarm> value;
        List<? extends Alarm> mutableList;
        if (alarms == null) {
            return;
        }
        int size = alarms.size();
        List<Alarm> value2 = this._alarmClocks.getValue();
        if (size == (value2 == null ? 0 : value2.size())) {
            return;
        }
        this._result.setValue(new Pair<>(Integer.valueOf(operation), null));
        if (operation == 1 || operation == 255) {
            int size2 = alarms.size();
            List<Alarm> value3 = this._alarmClocks.getValue();
            if (size2 >= (value3 != null ? value3.size() : 0) || (value = this._alarmClocks.getValue()) == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value)) == null) {
                return;
            }
            List<? extends Alarm> list = alarms.size() != 0 ? mutableList.removeAll(alarms) : true ? mutableList : null;
            if (list == null) {
                return;
            }
            deleteAlarm(list, new IAlarmCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModelExt$handleAlarmAction$2$1
                @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
                public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                    onResult(bool.booleanValue());
                }

                public void onResult(boolean result) {
                    this.a.b(result, alarms, operation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean result, List<Alarm> alarms, int operation) {
        List mutableList;
        this._result.setValue(new Pair<>(Integer.valueOf(operation), Boolean.valueOf(result)));
        if (!result) {
            List<Alarm> value = this._alarmClocks.getValue();
            if (value == null) {
                return;
            }
            List<Alarm> value2 = this._editAlarmClocks.getValue();
            if (value2 != null) {
                value2.clear();
            }
            List<Alarm> value3 = this._editAlarmClocks.getValue();
            if (value3 == null) {
                return;
            }
            value3.addAll(value);
            return;
        }
        ArrayList arrayList = new ArrayList();
        setAlarms$default(this, CollectionsKt___CollectionsKt.toMutableList((Collection) alarms), false, 2, null);
        List<Alarm> value4 = this._alarmClocks.getValue();
        if (value4 != null && (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value4)) != null) {
            List<Alarm> list = mutableList.removeAll(alarms) ? mutableList : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Alarm alarm : list) {
                    Boolean bool = Boolean.FALSE;
                    alarm.setVisible(bool);
                    alarm.setEnabled(bool);
                    alarm.setIsSmart(bool);
                    arrayList2.add(alarm);
                }
                arrayList.addAll(arrayList2);
            }
        }
        arrayList.addAll(alarms);
        getAlarmManager().saveVisibleAlarm(arrayList);
    }

    public static /* synthetic */ void setAlarms$default(AlarmViewModelExt alarmViewModelExt, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        alarmViewModelExt.setAlarms(list, z);
    }

    @NotNull
    public final List<AlarmItem> alarmList2AlarmItemList(@NotNull List<Alarm> alarms) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        arrayList2.addAll(alarms);
        Collections.sort(arrayList2, new AlarmClockManager.SortBySmart());
        int size = arrayList2.size();
        Alarm alarm = null;
        int i = 0;
        while (i < size) {
            Alarm alarm2 = (Alarm) arrayList2.get(i);
            if (alarm2.getIsSmart().booleanValue() && i == 0) {
                arrayList.add(new AlarmItem(getApp().getString(R.string.smart_alarm), 3));
            }
            if (alarm != null && alarm.getIsSmart().booleanValue() && !alarm2.getIsSmart().booleanValue()) {
                arrayList.add(new AlarmItem(getApp().getString(R.string.normal_alarm), 2));
            }
            arrayList.add(new AlarmItem(alarm2));
            i++;
            alarm = alarm2;
        }
        return arrayList;
    }

    public final void deleteAlarm(@NotNull Alarm alarm) {
        Integer numValueOf;
        List<Alarm> value = this._editAlarmClocks.getValue();
        if (value == null) {
            numValueOf = null;
        } else {
            int i = 0;
            Iterator<Alarm> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(alarm.getIndex(), it2.next().getIndex())) {
                    break;
                } else {
                    i++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf == null) {
            return;
        }
        value.remove(numValueOf.intValue());
        if (!Intrinsics.areEqual(this._isEdit.getValue(), Boolean.TRUE)) {
            a(value, 1);
        } else {
            setAlarms(value, true);
            this._operatorInEditStatus = 1;
        }
    }

    public final void doneEditSource() {
        this._isEdit.setValue(Boolean.FALSE);
        Integer num = this._operatorInEditStatus;
        if (num != null && num.intValue() == 0) {
            return;
        }
        this._operatorInEditStatus = 0;
        a(this._editAlarmClocks.getValue(), 255);
    }

    @NotNull
    public final LiveData<List<Alarm>> getAlarmClocks() {
        return this._alarmClocks;
    }

    @NotNull
    public final LiveData<AlarmVersionInfo> getAlarmVersionInfo() {
        return this._alarmVersionInfo;
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @NotNull
    public final LiveData<List<Alarm>> getEditAlarmClocks() {
        return this._editAlarmClocks;
    }

    @NotNull
    public final LiveData<Boolean> getEnable() {
        return this._enable;
    }

    @NotNull
    public final LiveData<Pair<Integer, Boolean>> getResult() {
        return this._result;
    }

    @NotNull
    public final LiveData<Boolean> isEdit() {
        return this._isEdit;
    }

    public final void loadAlarmData() {
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, this.deviceSource)) {
            setIsEdit(false);
            queryDeviceAlarm();
        }
    }

    public final void prepareAlarmAction(@NotNull HMDeviceType hmDeviceType) {
        getAlarmManager().correctAlarmWhenDoFree(HMDeviceManager.getInstance().getBoundDeviceSource(hmDeviceType), HMDeviceManager.getInstance().getDevice(hmDeviceType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void queryDeviceAlarm() {
        queryAlarm(new IAlarmCallback<List<? extends AlarmClockExt>>() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModelExt.queryDeviceAlarm.1
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public void onResult(@Nullable List<? extends AlarmClockExt> result) {
                List<Alarm> showAlarm;
                if (result == null) {
                    return;
                }
                AlarmViewModelExt alarmViewModelExt = AlarmViewModelExt.this;
                AlarmClockManager.updateAlarmsFromDevice(result);
                AlarmClockManager alarmManager = alarmViewModelExt.getAlarmManager();
                if (alarmManager == null || (showAlarm = alarmManager.getShowAlarm()) == null) {
                    return;
                }
                List list = (List) alarmViewModelExt._editAlarmClocks.getValue();
                if (list != null) {
                    list.clear();
                    list.addAll(showAlarm);
                }
                AlarmViewModelExt.setAlarms$default(alarmViewModelExt, CollectionsKt___CollectionsKt.toMutableList((Collection) showAlarm), false, 2, null);
            }
        });
    }

    public final void registerAlarmChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        IAlarmDevice alarmDevice = getAlarmDevice();
        if (alarmDevice == null) {
            return;
        }
        alarmDevice.registerChangeListener(alarmChangeListener);
    }

    public final synchronized void setAlarms(@Nullable List<Alarm> alarms, boolean isEdit) {
        if (alarms == null) {
            return;
        }
        try {
            if (isEdit) {
                this._editAlarmClocks.postValue(alarms);
            } else {
                this._alarmClocks.postValue(alarms);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setEnable(boolean enable) {
        this._enable.setValue(Boolean.valueOf(enable));
    }

    public final void setIsEdit(boolean isEdit) {
        List<Alarm> value = this._alarmClocks.getValue();
        if (value != null) {
            List<Alarm> value2 = this._editAlarmClocks.getValue();
            if (value2 != null) {
                value2.clear();
            }
            List<Alarm> value3 = this._editAlarmClocks.getValue();
            if (value3 != null) {
                value3.addAll(value);
            }
        }
        if (!isEdit && Intrinsics.areEqual(this._isEdit.getValue(), Boolean.TRUE)) {
            this._result.setValue(new Pair<>(0, Boolean.FALSE));
        }
        this._isEdit.setValue(Boolean.valueOf(isEdit));
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModel
    public void setUp(@Nullable HMBaseDevice device) {
        super.setUp(device);
        HMDeviceSource mDeviceSource = device == null ? null : device.getMDeviceSource();
        if (mDeviceSource == null) {
            mDeviceSource = HMDeviceSource.VDEVICE;
        }
        this.deviceSource = mDeviceSource;
        HMDeviceType deviceType = device != null ? device.getDeviceType() : null;
        if (deviceType == null) {
            deviceType = HMDeviceType.MILI;
        }
        this.hmDeviceType = deviceType;
        queryVersion(new IAlarmCallback<AlarmVersionInfo>() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModelExt.setUp.1
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public void onResult(@Nullable AlarmVersionInfo result) {
                AlarmViewModelExt.this._alarmVersionInfo.setValue(result);
            }
        });
    }

    public final void unRegisterAlarmChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        IAlarmDevice alarmDevice = getAlarmDevice();
        if (alarmDevice == null) {
            return;
        }
        alarmDevice.unRegisterChangeListener(alarmChangeListener);
    }
}
