package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.core.dao.BloodPressureDecoration;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.view.TimePickerDialog;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.g9;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.k;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0014R\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R'\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u000f0\u000f0#8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001fR\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010&R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&R\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010!R*\u0010E\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B\u0018\u00010A0@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR*\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B\u0018\u00010A0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010$¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/AddHealthDataViewModel;", "Lcom/xiaomi/hm/health/healthdata/core/AbstractHealthDataViewModel;", "", "c", "b", "", "e", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "eventType", "", "time", "g", "h", "timeMillis", "setCurrentTime", "", "value", "setData", "Lcom/xiaomi/hm/health/healthdata/ui/view/TimePickerDialog$Mode;", "mode", "setTimePickerMode", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "setDataType", "sbp", "inputSbp", "dbp", "inputDbp", "postData", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getCurrentTimeMillis", "()Landroidx/lifecycle/MutableLiveData;", "currentTimeMillis", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getDateValue", "()Landroidx/lifecycle/LiveData;", "dateValue", "i", "dataValue", z.j, "sbpValue", hl.k, "dbpValue", "l", "getTimePickerTrigger", "timePickerTrigger", "kotlin.jvm.PlatformType", "m", "getTimeValue", "timeValue", GoogleApiAvailabilityLight.b, "dataType", "o", "getDataUnit", "dataUnit", b.r, "getDataName", "dataName", DTransferConstants.SEARCH_KEY, "getEnableSave", "enableSave", "Landroidx/lifecycle/Observer;", "Lkotlin/Pair;", "", "r", "Landroidx/lifecycle/Observer;", "dataRangeObserver", SOAP.XMLNS, "dataRange", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "coreDataRepo", "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "addManualTempUseCase", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AddHealthDataViewModel extends AbstractHealthDataViewModel {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> currentTimeMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dateValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dataValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> sbpValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dbpValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimePickerDialog.Mode> timePickerTrigger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> timeValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DataType> dataType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataUnit;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> enableSave;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Observer<Pair<Float, Float>> dataRangeObserver;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Float, Float>> dataRange;

    public AddHealthDataViewModel(@NotNull HealthCoreDataRepo healthCoreDataRepo, @NotNull AddManualTempUseCase addManualTempUseCase) {
        super(healthCoreDataRepo, null, addManualTempUseCase, 2, null);
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.currentTimeMillis = mutableLiveData;
        this.dateValue = Transformations.map(mutableLiveData, new Function<Long, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(Long l) {
                return TimeUtils.formatDate(BraceletApp.getContext(), new Date(l.longValue()), true);
            }
        });
        this.dataValue = new MutableLiveData<>();
        this.sbpValue = new MutableLiveData<>();
        this.dbpValue = new MutableLiveData<>();
        this.timePickerTrigger = new MutableLiveData<>();
        this.timeValue = Transformations.map(mutableLiveData, new Function<Long, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final String apply(Long l) {
                return TimeUtils.formatTime(BraceletApp.getContext(), new Date(l.longValue()), true);
            }
        });
        MutableLiveData<DataType> mutableLiveData2 = new MutableLiveData<>();
        this.dataType = mutableLiveData2;
        this.dataUnit = Transformations.map(mutableLiveData2, new Function<DataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final String apply(DataType dataType) {
                return HealthDataUtils.INSTANCE.getHealthDataUnit(dataType);
            }
        });
        this.dataName = Transformations.map(mutableLiveData2, new Function<DataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final String apply(DataType dataType) {
                return HealthDataUtils.INSTANCE.getHealthDataName(dataType);
            }
        });
        this.enableSave = new MutableLiveData<>();
        g9 g9Var = new Observer() { // from class: g9
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddHealthDataViewModel.f((Pair) obj);
            }
        };
        this.dataRangeObserver = g9Var;
        LiveData<Pair<Float, Float>> map = Transformations.map(mutableLiveData2, new Function<DataType, Pair<? extends Float, ? extends Float>>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends Float, ? extends Float> apply(DataType dataType) {
                return HealthDataUtils.INSTANCE.getHealthDataRange(dataType);
            }
        });
        map.observeForever(g9Var);
        Unit unit = Unit.INSTANCE;
        this.dataRange = map;
        setCurrentTime(System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    private final void b() {
        boolean z;
        boolean z2;
        String value = this.sbpValue.getValue();
        Float floatOrNull = value == null ? null : k.toFloatOrNull(value);
        String value2 = this.dbpValue.getValue();
        Float floatOrNull2 = value2 != null ? k.toFloatOrNull(value2) : null;
        if (floatOrNull == null) {
            z = false;
        } else {
            float fFloatValue = floatOrNull.floatValue();
            if (40.0f > fFloatValue || fFloatValue > 300.0f) {
                z = false;
            } else {
                z = true;
            }
        }
        if (floatOrNull2 == null) {
            z2 = false;
        } else {
            float fFloatValue2 = floatOrNull2.floatValue();
            if (30.0f > fFloatValue2 || fFloatValue2 > 200.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.enableSave.setValue(Boolean.valueOf(z && z2 && e()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    private final void c() {
        String value;
        boolean z;
        DataType value2 = this.dataType.getValue();
        if (value2 == null) {
            return;
        }
        if (value2 == HealthDataType.BLOOD_PRESSURE) {
            b();
            return;
        }
        Pair<Float, Float> value3 = this.dataRange.getValue();
        if (value3 == null || (value = this.dataValue.getValue()) == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = !m.endsWith$default(value, ".", false, 2, null);
        Float floatOrNull = k.toFloatOrNull(value);
        if (floatOrNull == null) {
            z = false;
        } else {
            float fFloatValue = floatOrNull.floatValue();
            float fFloatValue2 = value3.getFirst().floatValue();
            if (fFloatValue > value3.getSecond().floatValue() || fFloatValue2 > fFloatValue) {
                z = false;
            } else {
                z = true;
            }
        }
        MutableLiveData<Boolean> enableSave = getEnableSave();
        if (z3 && z && e()) {
            z2 = true;
        }
        enableSave.setValue(Boolean.valueOf(z2));
    }

    private final boolean e() {
        Long value = this.currentTimeMillis.getValue();
        return value != null && value.longValue() <= System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Pair pair) {
    }

    private final void g(HealthDataType eventType, long time) {
        UserDataEntity userDataEntity;
        Float floatOrNull;
        if (eventType == HealthDataType.BLOOD_PRESSURE) {
            String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time);
            Unit unit = Unit.INSTANCE;
            BloodPressureDecoration bloodPressureDecoration = new BloodPressureDecoration(new UserDataEntity(null, userid, eventType, calendar.getTime(), null, null, null, null, 241, null));
            String value = this.sbpValue.getValue();
            if (value == null) {
                value = "";
            }
            String value2 = this.dbpValue.getValue();
            userDataEntity = bloodPressureDecoration.setLowAndHeight(value, value2 != null ? value2 : "");
        } else {
            String value3 = this.dataValue.getValue();
            float fFloatValue = 0.0f;
            if (value3 != null && (floatOrNull = k.toFloatOrNull(value3)) != null) {
                fFloatValue = floatOrNull.floatValue();
            }
            float withDecimalFloat = DataExKt.formatWithDecimalFloat(Float.valueOf(fFloatValue), 1);
            if (eventType == HealthDataType.MUSCLE || eventType == HealthDataType.BONE) {
                withDecimalFloat = DataExKt.formatWithDecimalFloat(Float.valueOf(BodyCompositionUtilsKt.weightToKg(fFloatValue)), 2);
            }
            String userid2 = HMPersonInfo.getInstance().getUserInfo().getUserid();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(time);
            Unit unit2 = Unit.INSTANCE;
            userDataEntity = new UserDataEntity(null, userid2, eventType, calendar2.getTime(), null, String.valueOf(withDecimalFloat), null, null, com.baseflow.permissionhandler.m.c, null);
        }
        insert(userDataEntity);
    }

    private final void h(long time) {
        String value = this.dataValue.getValue();
        insertTemp(new ManualTempEntity(time, DataExKt.formatWithDecimalFloat(Float.valueOf(TempUtils.INSTANCE.getTempInUnitC(value == null ? 0.0f : Float.parseFloat(value))), 1), String.valueOf(HMLoginManager.getValidUid()), "com.huami.midong"));
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentTimeMillis() {
        return this.currentTimeMillis;
    }

    @NotNull
    public final LiveData<String> getDataName() {
        return this.dataName;
    }

    @NotNull
    public final LiveData<String> getDataUnit() {
        return this.dataUnit;
    }

    @NotNull
    public final LiveData<String> getDateValue() {
        return this.dateValue;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEnableSave() {
        return this.enableSave;
    }

    @NotNull
    public final MutableLiveData<TimePickerDialog.Mode> getTimePickerTrigger() {
        return this.timePickerTrigger;
    }

    @NotNull
    public final LiveData<String> getTimeValue() {
        return this.timeValue;
    }

    public final void inputDbp(@NotNull String dbp) {
        this.dbpValue.setValue(dbp);
        c();
    }

    public final void inputSbp(@NotNull String sbp) {
        this.sbpValue.setValue(sbp);
        c();
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.dataRange.removeObserver(this.dataRangeObserver);
    }

    public final void postData() {
        DataType value = this.dataType.getValue();
        Long value2 = this.currentTimeMillis.getValue();
        if (value == null || value2 == null) {
            return;
        }
        if (value instanceof HealthDataType) {
            g((HealthDataType) value, value2.longValue());
        } else if (value instanceof TemperatureDataType) {
            h(value2.longValue());
        }
    }

    public final void setCurrentTime(long timeMillis) {
        this.currentTimeMillis.setValue(Long.valueOf(timeMillis));
        c();
    }

    public final void setData(@NotNull String value) {
        this.dataValue.setValue(value);
        c();
    }

    public final void setDataType(@NotNull DataType type) {
        this.dataType.setValue(type);
    }

    public final void setTimePickerMode(@NotNull TimePickerDialog.Mode mode) {
        this.timePickerTrigger.setValue(mode);
    }
}
