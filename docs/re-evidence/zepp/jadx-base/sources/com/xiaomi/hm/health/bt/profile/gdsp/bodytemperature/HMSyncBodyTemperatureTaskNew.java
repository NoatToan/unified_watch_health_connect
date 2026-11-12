package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GDSPErrorCodeExtKt;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspParamFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.IGdspCancelApi;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001\u000eB=\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureTaskNew;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/IGdspCancelApi;", "Ljava/util/Calendar;", "initStartTime", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "b", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "a", "", "doWork", "stopSync", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/Calendar;", "startTimeAllDay", GoogleApiAvailabilityLight.a, "startTimeSingle", "e", "startTime80s", "", "f", LogUtil.I, "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;", "g", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/GdspDataSyncUnit;", "syncUnit", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "mProfile", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;)V", z.j, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMSyncBodyTemperatureTaskNew extends HMBaseTask implements IGdspCancelApi {

    @NotNull
    private static final a j = new a(null);

    @Deprecated
    @NotNull
    private static final String k = "SyncBodyTemperatureTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Calendar startTimeAllDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Calendar startTimeSingle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Calendar startTime80s;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final IHMBodyTemperatureDataCallback callback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private GdspDataSyncUnit syncUnit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final GdspSyncProfile mProfile;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureTaskNew$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HMSyncBodyTemperatureTaskNew(@NotNull GattPeripheral gattPeripheral, @Nullable Calendar calendar, @Nullable Calendar calendar2, @Nullable Calendar calendar3, int i, @NotNull IHMBodyTemperatureDataCallback iHMBodyTemperatureDataCallback) {
        this.gattPeripheral = gattPeripheral;
        this.startTimeAllDay = calendar;
        this.startTimeSingle = calendar2;
        this.startTime80s = calendar3;
        this.version = i;
        this.callback = iHMBodyTemperatureDataCallback;
        this.mProfile = GdspFactory.INSTANCE.getGdspSyncProfile(gattPeripheral, i);
    }

    private final Pair<Boolean, Temperature80s[]> a(Calendar initStartTime) {
        Debug.fi(k, Intrinsics.stringPlus("Sync 80sTemperature StartTime: ", initStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        Calendar calendar = (Calendar) initStartTime.clone();
        BaseGdspSyncParam<List<Temperature80s>> bodyTemperature80sParam = GdspParamFactory.INSTANCE.getBodyTemperature80sParam(initStartTime, this.version);
        int i = 100;
        Calendar startSyncTime = calendar;
        boolean z = false;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || startSyncTime == null) {
                break;
            }
            GdspDataSyncUnit gdspDataSyncUnit = new GdspDataSyncUnit(this.mProfile, this.version);
            this.syncUnit = gdspDataSyncUnit;
            GDSPErrorCode gDSPErrorCodeSync$default = GdspDataSyncUnit.sync$default(gdspDataSyncUnit, bodyTemperature80sParam.getType(), startSyncTime, bodyTemperature80sParam.getDataReceiver2(), null, null, 24, null);
            boolean zIsSyncSuccess = GDSPErrorCodeExtKt.isSyncSuccess(gDSPErrorCodeSync$default);
            if (gDSPErrorCodeSync$default != GDSPErrorCode.SUCCESS) {
                z = zIsSyncSuccess;
                break;
            }
            List<Temperature80s> detail = bodyTemperature80sParam.getDataReceiver2().getDetail();
            arrayList.addAll(detail);
            startSyncTime = bodyTemperature80sParam.getStartSyncTime(bodyTemperature80sParam.getDataReceiver2().getMDataHeader(), detail);
            i = i2 - 1;
            z = zIsSyncSuccess;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        Object[] array = arrayList.toArray(new Temperature80s[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new Pair<>(boolValueOf, array);
    }

    private final Pair<Boolean, TemperatureAllDay[]> b(Calendar initStartTime) {
        Debug.fi(k, Intrinsics.stringPlus("Sync AllDayTemperature StartTime: ", initStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        BaseGdspSyncParam<List<TemperatureAllDay>> bodyTemperatureAllParam = GdspParamFactory.INSTANCE.getBodyTemperatureAllParam(initStartTime, this.version);
        int i = 30;
        Calendar startSyncTime = (Calendar) initStartTime.clone();
        boolean z = false;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || startSyncTime == null) {
                break;
            }
            GdspDataSyncUnit gdspDataSyncUnit = new GdspDataSyncUnit(this.mProfile, this.version);
            this.syncUnit = gdspDataSyncUnit;
            GDSPErrorCode gDSPErrorCodeSync$default = GdspDataSyncUnit.sync$default(gdspDataSyncUnit, bodyTemperatureAllParam.getType(), startSyncTime, bodyTemperatureAllParam.getDataReceiver2(), null, null, 24, null);
            boolean zIsSyncSuccess = GDSPErrorCodeExtKt.isSyncSuccess(gDSPErrorCodeSync$default);
            if (gDSPErrorCodeSync$default != GDSPErrorCode.SUCCESS) {
                z = zIsSyncSuccess;
                break;
            }
            List<TemperatureAllDay> detail = bodyTemperatureAllParam.getDataReceiver2().getDetail();
            arrayList.addAll(detail);
            startSyncTime = bodyTemperatureAllParam.getStartSyncTime(bodyTemperatureAllParam.getDataReceiver2().getMDataHeader(), detail);
            i = i2 - 1;
            z = zIsSyncSuccess;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        Object[] array = arrayList.toArray(new TemperatureAllDay[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new Pair<>(boolValueOf, array);
    }

    private final Pair<Boolean, TemperatureSingle[]> c(Calendar startTime) {
        Debug.fi(k, Intrinsics.stringPlus("Sync SingleTemperature StartTime: ", startTime.getTime()));
        ArrayList arrayList = new ArrayList();
        BaseGdspSyncParam<List<TemperatureSingle>> bodyTemperatureSingleParam = GdspParamFactory.INSTANCE.getBodyTemperatureSingleParam(startTime, this.version);
        GdspDataSyncUnit gdspDataSyncUnit = new GdspDataSyncUnit(this.mProfile, this.version);
        this.syncUnit = gdspDataSyncUnit;
        GDSPErrorCode gDSPErrorCodeSync$default = GdspDataSyncUnit.sync$default(gdspDataSyncUnit, bodyTemperatureSingleParam.getType(), (Calendar) startTime.clone(), bodyTemperatureSingleParam.getDataReceiver2(), null, null, 24, null);
        boolean zIsSyncSuccess = GDSPErrorCodeExtKt.isSyncSuccess(gDSPErrorCodeSync$default);
        if (gDSPErrorCodeSync$default == GDSPErrorCode.SUCCESS) {
            arrayList.addAll(bodyTemperatureSingleParam.getDataReceiver2().getDetail());
        }
        Boolean boolValueOf = Boolean.valueOf(zIsSyncSuccess);
        Object[] array = arrayList.toArray(new TemperatureSingle[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new Pair<>(boolValueOf, array);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        Boolean first;
        Boolean first2;
        Boolean first3;
        Debug.fi(k, "Sync BodyTemperature Start...");
        this.callback.onStart();
        if (!this.mProfile.init()) {
            Debug.fi(k, "init BodyTemperature data profile failed!!!");
            this.callback.onFinish(false);
            return;
        }
        Calendar calendar = this.startTimeAllDay;
        Pair<Boolean, TemperatureAllDay[]> pairB = calendar == null ? null : b(calendar);
        Calendar calendar2 = this.startTimeSingle;
        Pair<Boolean, TemperatureSingle[]> pairC = calendar2 == null ? null : c(calendar2);
        Calendar calendar3 = this.startTime80s;
        HMBodyTemperatureData hMBodyTemperatureData = new HMBodyTemperatureData(pairB, pairC, calendar3 != null ? a(calendar3) : null);
        this.callback.onTemperatureData(hMBodyTemperatureData);
        Pair<Boolean, TemperatureAllDay[]> allDay = hMBodyTemperatureData.getAllDay();
        boolean zBooleanValue = true;
        boolean zBooleanValue2 = (allDay == null || (first = allDay.getFirst()) == null) ? true : first.booleanValue();
        Pair<Boolean, TemperatureSingle[]> single = hMBodyTemperatureData.getSingle();
        boolean zBooleanValue3 = zBooleanValue2 & ((single == null || (first2 = single.getFirst()) == null) ? true : first2.booleanValue());
        Pair<Boolean, Temperature80s[]> eightySeconds = hMBodyTemperatureData.getEightySeconds();
        if (eightySeconds != null && (first3 = eightySeconds.getFirst()) != null) {
            zBooleanValue = first3.booleanValue();
        }
        boolean z = zBooleanValue3 & zBooleanValue;
        Debug.fi(k, "Sync BodyTemperature Finish, Success: " + z + ", " + hMBodyTemperatureData);
        this.callback.onFinish(z);
        this.mProfile.deInit();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.IGdspCancelApi
    public void stopSync() {
        GdspDataSyncUnit gdspDataSyncUnit = this.syncUnit;
        if (gdspDataSyncUnit == null) {
            return;
        }
        gdspDataSyncUnit.stop();
    }
}
