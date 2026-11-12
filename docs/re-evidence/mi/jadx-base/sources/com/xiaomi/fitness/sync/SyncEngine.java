package com.xiaomi.fitness.sync;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ILocationListener;
import com.xiaomi.fitness.common.utils.Location;
import com.xiaomi.fitness.common.utils.LocationRequest;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactExtKt;
import com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactSyncHelper;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.db.StockDatabase;
import com.xiaomi.fitness.sync.export.db.StockInfoEntity;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.StockModel;
import com.xiaomi.fitness.sync.model.CalendarModel;
import com.xiaomi.fitness.sync.net.SyncRequest;
import com.xiaomi.fitness.sync.util.BlueToothSender;
import com.xiaomi.fitness.sync.util.CalendarUtils;
import com.xiaomi.fitness.sync.util.MyAction0;
import com.xiaomi.fitness.sync.util.SyncUtil;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.HuamiDataWrapperKt;
import com.xiaomi.wearable.hm.q;
import defpackage.aa3;
import defpackage.be1;
import defpackage.bg4;
import defpackage.eu6;
import defpackage.jz6;
import defpackage.na4;
import defpackage.ni4;
import defpackage.o4h;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vwo;
import defpackage.ygo;
import defpackage.z5h;
import defpackage.zgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 _2\u00020\u0001:\u0005`ab_cB\u001b\b\u0007\u0012\u0006\u0010[\u001a\u00020Z\u0012\b\b\u0002\u0010\\\u001a\u00020\n¢\u0006\u0004\b]\u0010^J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010 \u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010&J-\u0010'\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0002¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b)\u0010\u0014J5\u0010*\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010-\u001a\u00020,H\u0003¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b0\u0010\u0014J\u001f\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104J7\u00109\u001a\u00020\u00122\u0006\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\n2\u0006\u00107\u001a\u0002052\u0006\u00102\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b;\u0010\u0014J5\u0010<\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b<\u0010+J'\u0010=\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0002¢\u0006\u0004\b=\u0010\u0014J\r\u0010>\u001a\u00020\u0012¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010@¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\fJ-\u0010D\u001a\u00020\u00122\u0006\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0004\bD\u0010EJ=\u0010D\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018¢\u0006\u0004\bD\u0010FJ\u0015\u0010G\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bG\u0010\u0016J+\u0010'\u001a\u00020\u00122\u0006\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b'\u0010EJ%\u0010H\u001a\u00020\u00122\u0006\u00106\u001a\u0002052\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0004\bH\u0010IJY\u0010O\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00101\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u00032\b\u0010K\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010N\u001a\u00020M2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010X\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine;", "", "", "", "types", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getNeedSyncDevices", "([I)Ljava/util/List;", "model", "", "isSyncStock", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "deviceModel", "isSyncCalendar", "force", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "", "syncCalendarToConnectedAllDevices", "(ZLcom/xiaomi/fitness/sync/export/MyAction1;)V", "requestBattery", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", TSMAuthContants.PARAM_DEVICE_MODELS, "Leu6;", "deviceTaskCallBack", "syncCalendarToDevices", "(Ljava/util/List;ZLcom/xiaomi/fitness/sync/export/MyAction1;Leu6;)V", "", "Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;", "calendarEvents", "callBack", "postCalendarList", "(Ljava/util/List;Ljava/util/List;Leu6;)V", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "queryData", "phoneData", "isDupEvent", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;)Z", "syncStockToDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZLcom/xiaomi/fitness/sync/export/MyAction1;)V", "syncStockToConnectedBleDevices", "syncStockToDevices", "(Ljava/util/List;ZLcom/xiaomi/fitness/sync/export/MyAction1;)V", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;", b.I, "postStockInfo", "(Ljava/util/List;Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;)V", "syncTimeToConnectedDevices", "online", "subType", "getGNSSFileSubType", "(ZI)I", "", "did", "filePath", "segmentLength", "postAgpsData", "(Ljava/lang/String;ZLjava/lang/String;II)V", "syncSleepModelToConnectedDevice", "syncSleepModelToDevice", "syncEmergencyContactToConnectedDevice", "destroy", "()V", "Lcom/xiaomi/fitness/sync/util/MyAction0;", "syncAll", "(Lcom/xiaomi/fitness/sync/util/MyAction0;)V", "isSyncSleepModel", "syncCalendarToDevice", "(Ljava/lang/String;ZLcom/xiaomi/fitness/sync/export/MyAction1;)V", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZLcom/xiaomi/fitness/sync/export/MyAction1;Leu6;)V", "clearAllCalendars", "syncLocationToDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/sync/export/MyAction1;)V", "days", "source", "type", "Lcom/xiaomi/fitness/sync/SyncEngine$SyncEngineTask;", "syncEngineTask", "syncAgpsDataToDevice", "(Ljava/lang/String;ZILjava/lang/String;IILcom/xiaomi/fitness/sync/SyncEngine$SyncEngineTask;Lcom/xiaomi/fitness/sync/export/MyAction1;)V", "mMapHighAccuracy", "Z", "Lna4;", "mComposite", "Lna4;", "isHyperOS$delegate", "Lkotlin/Lazy;", "isHyperOS", "()Z", "Landroid/content/Context;", "context", "mapHighAccuracy", "<init>", "(Landroid/content/Context;Z)V", "Companion", "MyCountDown", "ScheduleModelWrapper", "CalendarEventWrapper", "SyncEngineTask", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSyncEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncEngine.kt\ncom/xiaomi/fitness/sync/SyncEngine\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,884:1\n37#2:885\n36#2,3:886\n*S KotlinDebug\n*F\n+ 1 SyncEngine.kt\ncom/xiaomi/fitness/sync/SyncEngine\n*L\n603#1:885\n603#1:886,3\n*E\n"})
public final class SyncEngine {
    private static final int BLUETOOTH_SYNC_COUNT = 6;
    private static final int HUAMI_SYNC_COUNT = 2;
    public static final long SYNC_CALENDAR_DURATION = 600000;
    public static final long SYNC_STOCK_DURATION = 600000;
    public static final long SYNC_TIME_DURATION = 21600000;
    public static final long SYNC_WEATHER_DURATION = 1800000;
    public static final long SYNC_WEATHER_LOCATION_DURATION = 3600000;
    public static final int TYPE_CALENDAR = 3;
    public static final int TYPE_SLEEP_MODEL = 4;
    public static final int TYPE_STOCK = 2;
    public static final int TYPE_TIME = 5;
    public static final int TYPE_WEATHER = 0;
    public static final int TYPE_WEATHER_LOCATION = 6;
    public static final int TYPE_WEATHER_PRESSURE = 1;

    @NotNull
    public static final String WEATHERTAG = "Wearable.weather";

    /* JADX INFO: renamed from: isHyperOS$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isHyperOS;

    @NotNull
    private final na4 mComposite;
    private final boolean mMapHighAccuracy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = SyncEngine.class.getSimpleName();

    @NotNull
    private static final List<SyncEngineTask> syncList = new ArrayList();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine$CalendarEventWrapper;", "", "phoneData", "Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;", "isDup", "", "<init>", "(Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;Z)V", "getPhoneData", "()Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;", "()Z", "setDup", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarEventWrapper {
        private boolean isDup;

        @NotNull
        private final CalendarModel.CalendarEvent phoneData;

        public CalendarEventWrapper(@NotNull CalendarModel.CalendarEvent phoneData, boolean z) {
            Intrinsics.checkNotNullParameter(phoneData, "phoneData");
            this.phoneData = phoneData;
            this.isDup = z;
        }

        public static /* synthetic */ CalendarEventWrapper copy$default(CalendarEventWrapper calendarEventWrapper, CalendarModel.CalendarEvent calendarEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                calendarEvent = calendarEventWrapper.phoneData;
            }
            if ((i & 2) != 0) {
                z = calendarEventWrapper.isDup;
            }
            return calendarEventWrapper.copy(calendarEvent, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CalendarModel.CalendarEvent getPhoneData() {
            return this.phoneData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDup() {
            return this.isDup;
        }

        @NotNull
        public final CalendarEventWrapper copy(@NotNull CalendarModel.CalendarEvent phoneData, boolean isDup) {
            Intrinsics.checkNotNullParameter(phoneData, "phoneData");
            return new CalendarEventWrapper(phoneData, isDup);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarEventWrapper)) {
                return false;
            }
            CalendarEventWrapper calendarEventWrapper = (CalendarEventWrapper) other;
            return Intrinsics.areEqual(this.phoneData, calendarEventWrapper.phoneData) && this.isDup == calendarEventWrapper.isDup;
        }

        @NotNull
        public final CalendarModel.CalendarEvent getPhoneData() {
            return this.phoneData;
        }

        public int hashCode() {
            return (this.phoneData.hashCode() * 31) + Boolean.hashCode(this.isDup);
        }

        public final boolean isDup() {
            return this.isDup;
        }

        public final void setDup(boolean z) {
            this.isDup = z;
        }

        @NotNull
        public String toString() {
            return "CalendarEventWrapper(phoneData=" + this.phoneData + ", isDup=" + this.isDup + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine$MyCountDown;", "", "count", "", "<init>", "(I)V", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "countDown", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MyCountDown {

        @NotNull
        private final AtomicInteger counter;

        public MyCountDown(int i) {
            this.counter = new AtomicInteger(i);
        }

        public final int countDown() {
            return this.counter.decrementAndGet();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine$ScheduleModelWrapper;", "", "queryData", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "isDup", "", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Z)V", "getQueryData", "()Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "()Z", "setDup", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScheduleModelWrapper {
        private boolean isDup;

        @NotNull
        private final ScheduleModel queryData;

        public ScheduleModelWrapper(@NotNull ScheduleModel queryData, boolean z) {
            Intrinsics.checkNotNullParameter(queryData, "queryData");
            this.queryData = queryData;
            this.isDup = z;
        }

        public static /* synthetic */ ScheduleModelWrapper copy$default(ScheduleModelWrapper scheduleModelWrapper, ScheduleModel scheduleModel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                scheduleModel = scheduleModelWrapper.queryData;
            }
            if ((i & 2) != 0) {
                z = scheduleModelWrapper.isDup;
            }
            return scheduleModelWrapper.copy(scheduleModel, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ScheduleModel getQueryData() {
            return this.queryData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDup() {
            return this.isDup;
        }

        @NotNull
        public final ScheduleModelWrapper copy(@NotNull ScheduleModel queryData, boolean isDup) {
            Intrinsics.checkNotNullParameter(queryData, "queryData");
            return new ScheduleModelWrapper(queryData, isDup);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScheduleModelWrapper)) {
                return false;
            }
            ScheduleModelWrapper scheduleModelWrapper = (ScheduleModelWrapper) other;
            return Intrinsics.areEqual(this.queryData, scheduleModelWrapper.queryData) && this.isDup == scheduleModelWrapper.isDup;
        }

        @NotNull
        public final ScheduleModel getQueryData() {
            return this.queryData;
        }

        public int hashCode() {
            return (this.queryData.hashCode() * 31) + Boolean.hashCode(this.isDup);
        }

        public final boolean isDup() {
            return this.isDup;
        }

        public final void setDup(boolean z) {
            this.isDup = z;
        }

        @NotNull
        public String toString() {
            return "ScheduleModelWrapper(queryData=" + this.queryData + ", isDup=" + this.isDup + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine$SyncEngineTask;", "", "typeName", "", "<init>", "(Ljava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SyncEngineTask {

        @NotNull
        private final String typeName;

        /* JADX WARN: Multi-variable type inference failed */
        public SyncEngineTask() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SyncEngineTask copy$default(SyncEngineTask syncEngineTask, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncEngineTask.typeName;
            }
            return syncEngineTask.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        @NotNull
        public final SyncEngineTask copy(@NotNull String typeName) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            return new SyncEngineTask(typeName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SyncEngineTask) && Intrinsics.areEqual(this.typeName, ((SyncEngineTask) other).typeName);
        }

        @NotNull
        public final String getTypeName() {
            return this.typeName;
        }

        public int hashCode() {
            return this.typeName.hashCode();
        }

        @NotNull
        public String toString() {
            return "SyncEngineTask(typeName=" + this.typeName + ")";
        }

        public SyncEngineTask(@NotNull String typeName) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            this.typeName = typeName;
        }

        public /* synthetic */ SyncEngineTask(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "default" : str);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.SyncEngine$syncCalendarToDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.SyncEngine$syncCalendarToDevices$1", f = "SyncEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSyncEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncEngine.kt\ncom/xiaomi/fitness/sync/SyncEngine$syncCalendarToDevices$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,884:1\n37#2:885\n36#2,3:886\n*S KotlinDebug\n*F\n+ 1 SyncEngine.kt\ncom/xiaomi/fitness/sync/SyncEngine$syncCalendarToDevices$1\n*L\n287#1:885\n287#1:886,3\n*E\n"})
    public static final class C32251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MyAction1<Boolean> $callback;
        final /* synthetic */ List<WearableDeviceModel> $deviceModels;
        final /* synthetic */ eu6<Boolean> $deviceTaskCallBack;
        int label;
        final /* synthetic */ SyncEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32251(List<WearableDeviceModel> list, SyncEngine syncEngine, eu6<Boolean> eu6Var, MyAction1<Boolean> myAction1, Continuation<? super C32251> continuation) {
            super(2, continuation);
            this.$deviceModels = list;
            this.this$0 = syncEngine;
            this.$deviceTaskCallBack = eu6Var;
            this.$callback = myAction1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32251(this.$deviceModels, this.this$0, this.$deviceTaskCallBack, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List<CalendarModel.CalendarEvent> listGenCalendarEvents = CalendarUtils.INSTANCE.genCalendarEvents(ApplicationExtKt.getApplication());
                Iterator<WearableDeviceModel> it = this.$deviceModels.iterator();
                while (it.hasNext()) {
                    SyncUtil.INSTANCE.setSyncTimeLong(3, it.next().getDid(), System.currentTimeMillis());
                }
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                String string = Arrays.toString(listGenCalendarEvents != null ? (CalendarModel.CalendarEvent[]) listGenCalendarEvents.toArray(new CalendarModel.CalendarEvent[0]) : null);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Logger.i(tag, "genCalendarEvents calendarEvents :" + string);
                this.this$0.postCalendarList(this.$deviceModels, listGenCalendarEvents, this.$deviceTaskCallBack);
                MyAction1<Boolean> myAction1 = this.$callback;
                if (myAction1 != null) {
                    myAction1.call(Boxing.boxBoolean(true));
                }
            } catch (Exception e) {
                e.printStackTrace();
                MyAction1<Boolean> myAction2 = this.$callback;
                if (myAction2 != null) {
                    myAction2.call(Boxing.boxBoolean(false));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.SyncEngine$syncSleepModelToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.SyncEngine$syncSleepModelToDevice$1", f = "SyncEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MyAction1<Boolean> $callback;
        final /* synthetic */ List<WearableDeviceModel> $deviceModels;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32271(List<? extends WearableDeviceModel> list, MyAction1<Boolean> myAction1, Continuation<? super C32271> continuation) {
            super(2, continuation);
            this.$deviceModels = list;
            this.$callback = myAction1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32271(this.$deviceModels, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (WearableDeviceModel wearableDeviceModel : this.$deviceModels) {
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.i(tag, "support sync sleep model deviceModel: " + DeviceModelExtKt.isBluetooth(wearableDeviceModel) + " " + DeviceModelExtKt.getName(wearableDeviceModel) + " " + DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL());
                if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                    SyncUtil.INSTANCE.refreshScheduleTimeZone();
                }
            }
            MyAction1<Boolean> myAction1 = this.$callback;
            if (myAction1 != null) {
                myAction1.call(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SyncEngine(@NotNull Context context) {
        this(context, false, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getGNSSFileSubType(boolean online, int subType) {
        if (1 == subType) {
            return online ? 0 : 1;
        }
        if (2 == subType) {
            return online ? 2 : 3;
        }
        if (3 == subType) {
            return online ? 4 : 5;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    private final List<WearableDeviceModel> getNeedSyncDevices(int... types) {
        ArrayList arrayList = new ArrayList();
        List<T> deviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels();
        if (!deviceModels.isEmpty()) {
            for (T t : deviceModels) {
                if (DeviceModelExtKt.isBluetooth(t) && t.getIsDeviceConnected()) {
                    boolean z = false;
                    for (int i : types) {
                        if (i == 0) {
                            boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(t, "weather");
                            Logger.i("Wearable.weather", "getNeedSyncDevices isSyncWeather:" + zIsSupportFeature);
                            if (zIsSupportFeature) {
                                z = true;
                            }
                        } else if (i == 1 || (i == 2 ? isSyncStock(t) : !(i == 3 ? !DeviceModelExtKt.isSupportFeature(t, "calendar") : i == 4 ? !isSyncSleepModel(t) : i != 5))) {
                            z = true;
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(t);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDupEvent(ScheduleModel queryData, CalendarModel.CalendarEvent phoneData) {
        String description;
        String title;
        if ((queryData.getTitle().length() != 0 || ((title = phoneData.getTitle()) != null && title.length() != 0)) && !Intrinsics.areEqual(queryData.getTitle(), phoneData.getTitle())) {
            return false;
        }
        if ((queryData.getDescription().length() != 0 || ((description = phoneData.getDescription()) != null && description.length() != 0)) && !Intrinsics.areEqual(queryData.getDescription(), phoneData.getDescription())) {
            return false;
        }
        long j = 1000;
        if (queryData.getStartTime() == phoneData.getStart() / j && queryData.getStopTime() == phoneData.getEnd() / j && queryData.getAlertTime() == phoneData.getReminderMinutes()) {
            return queryData.isAllDay() == (phoneData.getAllday() == 1);
        }
        return false;
    }

    private final boolean isHyperOS() {
        return ((Boolean) this.isHyperOS.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isHyperOS_delegate$lambda$0() {
        return RomUtils.isHyperOS(ApplicationExtKt.getApplication());
    }

    private final boolean isSyncCalendar(WearableDeviceModel deviceModel) {
        return DeviceModelExtKt.isSupportFeature(deviceModel, "calendar") && SyncPreference.INSTANCE.isNeedSyncSchedule(deviceModel.getDid());
    }

    private final boolean isSyncStock(WearableDeviceModel model) {
        return DeviceModelExtKt.isSupportFeature(model, "stock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postAgpsData(String did, boolean online, String filePath, int subType, int segmentLength) {
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) != null) {
            int gNSSFileSubType = getGNSSFileSubType(online, subType);
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            Logger.i(TAG2, "sendAgpsToDevice , did:" + did + " , filePath:" + filePath + " , subType:" + subType + " , segmentLen:" + segmentLength);
            DeviceContact.DefaultImpls.sendFile$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, 0, gNSSFileSubType, filePath, segmentLength, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.util.ArrayList] */
    public final void postCalendarList(List<? extends WearableDeviceModel> deviceModels, final List<CalendarModel.CalendarEvent> calendarEvents, eu6<Boolean> callBack) {
        if (calendarEvents == null) {
            return;
        }
        for (WearableDeviceModel wearableDeviceModel : deviceModels) {
            if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                if (SyncPreference.INSTANCE.isNeedSyncSchedule(wearableDeviceModel.getDid())) {
                    aa3.a aVar = new aa3.a();
                    aVar.c = new aa3[calendarEvents.size()];
                    List<CalendarModel.CalendarEvent> list = calendarEvents;
                    if (!list.isEmpty()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            CalendarModel.CalendarEvent calendarEvent = calendarEvents.get(i);
                            aa3 aa3Var = new aa3();
                            SyncUtil syncUtil = SyncUtil.INSTANCE;
                            aa3Var.c = syncUtil.getNonNullString(calendarEvent.getTitle());
                            aa3Var.d = syncUtil.getNonNullString(calendarEvent.getDescription());
                            aa3Var.e = syncUtil.getNonNullString(calendarEvent.getLocation());
                            long j = 1000;
                            aa3Var.f = (int) (calendarEvent.getStart() / j);
                            aa3Var.g = (int) (calendarEvent.getEnd() / j);
                            aa3Var.h = calendarEvent.getAllday() == 1;
                            aa3Var.i = calendarEvent.getReminderMinutes();
                            aVar.c[i] = aa3Var;
                        }
                    }
                    BlueToothSender.INSTANCE.handleCalendar(wearableDeviceModel.getDid(), aVar, callBack);
                } else {
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    Logger.i(TAG2, "genCalendarEvents finish but switch off yet: " + wearableDeviceModel.getDid());
                    BlueToothSender.INSTANCE.clearCalendar(wearableDeviceModel.getDid());
                }
            } else if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                final HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
                final Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = SyncPreference.INSTANCE.getLAST_SYNC_CALENDAR_ID();
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                Logger.i(TAG3, "sync calendar start id");
                final ArrayList arrayList = new ArrayList();
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new ArrayList();
                if (huaMiApiCaller != null) {
                    huaMiApiCaller.queryData(new long[0], new q.a() { // from class: com.xiaomi.fitness.sync.SyncEngine.postCalendarList.1
                        @Override // com.xiaomi.wearable.hm.q
                        public void onFailure(int code, String msg) {
                            String tag = SyncEngine.INSTANCE.getTAG();
                            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                            Logger.i(tag, "query huami schedule fail code: " + code + " msg: " + msg);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.xiaomi.wearable.hm.q
                        public void onSuccess(List<HuamiDataWrapper> var1) {
                            if (var1 != null) {
                                Ref.ObjectRef<List<ScheduleModel>> objectRef2 = objectRef;
                                List listAsData = HuamiDataWrapperKt.asData(var1);
                                objectRef2.element = listAsData != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) listAsData) : 0;
                                String tag = SyncEngine.INSTANCE.getTAG();
                                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                                Logger.i(tag, "query huami schedule success: " + objectRef2.element);
                            } else {
                                String tag2 = SyncEngine.INSTANCE.getTAG();
                                Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
                                Logger.i(tag2, "query huami schedule success but null");
                            }
                            List<ScheduleModel> list2 = objectRef.element;
                            if (list2 == null || list2.isEmpty()) {
                                String tag3 = SyncEngine.INSTANCE.getTAG();
                                Intrinsics.checkNotNullExpressionValue(tag3, "<get-TAG>(...)");
                                Logger.i(tag3, "query huami schedule success but asData null");
                            }
                            ArrayList<CalendarEventWrapper> arrayList2 = new ArrayList();
                            Iterator<CalendarModel.CalendarEvent> it = calendarEvents.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new CalendarEventWrapper(it.next(), false));
                            }
                            ArrayList<ScheduleModelWrapper> arrayList3 = new ArrayList();
                            List<ScheduleModel> list3 = objectRef.element;
                            if (list3 != null && !list3.isEmpty()) {
                                List<ScheduleModel> list4 = objectRef.element;
                                Intrinsics.checkNotNull(list4);
                                Iterator<ScheduleModel> it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(new ScheduleModelWrapper(it2.next(), false));
                                }
                            }
                            String tag4 = SyncEngine.INSTANCE.getTAG();
                            Intrinsics.checkNotNullExpressionValue(tag4, "<get-TAG>(...)");
                            Logger.i(tag4, "sync calendar from phone: " + calendarEvents);
                            for (ScheduleModelWrapper scheduleModelWrapper : arrayList3) {
                                for (CalendarEventWrapper calendarEventWrapper : arrayList2) {
                                    if (this.isDupEvent(scheduleModelWrapper.getQueryData(), calendarEventWrapper.getPhoneData())) {
                                        String tag5 = SyncEngine.INSTANCE.getTAG();
                                        Intrinsics.checkNotNullExpressionValue(tag5, "<get-TAG>(...)");
                                        Logger.i(tag5, "event isDup : " + scheduleModelWrapper.getQueryData().getTitle());
                                        scheduleModelWrapper.setDup(true);
                                        calendarEventWrapper.setDup(true);
                                        break;
                                    }
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                CalendarEventWrapper calendarEventWrapper2 = (CalendarEventWrapper) it3.next();
                                if (!calendarEventWrapper2.isDup()) {
                                    CalendarModel.CalendarEvent phoneData = calendarEventWrapper2.getPhoneData();
                                    Ref.LongRef longRef2 = longRef;
                                    long j2 = longRef2.element + 1;
                                    longRef2.element = j2;
                                    String title = phoneData.getTitle();
                                    String str = title == null ? "" : title;
                                    String description = phoneData.getDescription();
                                    long j3 = 1000;
                                    Iterator it4 = it3;
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList.add(new ScheduleModel(j2, str, description == null ? "" : description, phoneData.getStart() / j3, phoneData.getEnd() / j3, phoneData.getReminderMinutes(), 0L, 0L, phoneData.getAllday() == 1, null, 130, 0L, null, 6848, null));
                                    arrayList3 = arrayList4;
                                    it3 = it4;
                                }
                            }
                            String tag6 = SyncEngine.INSTANCE.getTAG();
                            Intrinsics.checkNotNullExpressionValue(tag6, "<get-TAG>(...)");
                            Logger.i(tag6, "need sync event after filter already synced: " + arrayList);
                            for (ScheduleModelWrapper scheduleModelWrapper2 : arrayList3) {
                                if (!scheduleModelWrapper2.isDup()) {
                                    huaMiApiCaller.delete(scheduleModelWrapper2.getQueryData().getId());
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator<ScheduleModel> it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    huaMiApiCaller.addOrUpdate(it5.next());
                                }
                            }
                            SyncPreference.INSTANCE.setLAST_SYNC_CALENDAR_ID(longRef.element);
                        }

                        @Override // com.xiaomi.wearable.hm.q
                        public void onTimeout(List<HuamiDataWrapper> var1) {
                            String tag = SyncEngine.INSTANCE.getTAG();
                            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                            Logger.i(tag, "query huami schedule timeout");
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void postStockInfo(List<? extends WearableDeviceModel> deviceModels, final StockModel.StockInfo response) {
        List<StockModel.StockInfo.Item> list = response.items;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (final WearableDeviceModel wearableDeviceModel : deviceModels) {
            o4h<List<zgo>> stockSymbolList = BlueToothSender.INSTANCE.getStockSymbolList(wearableDeviceModel.getDid());
            final Function1 function1 = new Function1() { // from class: rso
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncEngine.postStockInfo$lambda$2(response, wearableDeviceModel, (List) obj);
                }
            };
            bg4<? super List<zgo>> bg4Var = new bg4() { // from class: sso
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    SyncEngine.postStockInfo$lambda$3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: tso
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncEngine.postStockInfo$lambda$4((Throwable) obj);
                }
            };
            stockSymbolList.O(bg4Var, new bg4() { // from class: uso
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    SyncEngine.postStockInfo$lambda$5(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postStockInfo$lambda$2(StockModel.StockInfo response, WearableDeviceModel deviceModel, List list) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                zgo zgoVar = (zgo) it.next();
                for (StockModel.StockInfo.Item item : response.items) {
                    if (zgoVar.c.equals(item.symbol)) {
                        ygo ygoVar = new ygo();
                        ygoVar.c = SyncUtil.INSTANCE.getNonNullString(item.symbol);
                        Float latestPrice = item.latestPrice;
                        float fFloatValue2 = 0.0f;
                        if (latestPrice == null) {
                            fFloatValue = 0.0f;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(latestPrice, "latestPrice");
                            fFloatValue = latestPrice.floatValue();
                        }
                        ygoVar.f = fFloatValue;
                        Float preClose = item.preClose;
                        if (preClose != null) {
                            Intrinsics.checkNotNullExpressionValue(preClose, "preClose");
                            fFloatValue2 = preClose.floatValue();
                        }
                        ygoVar.g = fFloatValue2;
                        Float f = item.halted;
                        ygoVar.h = f == null ? 0 : (int) f.floatValue();
                        Long l = item.timestamp;
                        ygoVar.i = l == null ? 0 : (int) (l.longValue() / ((long) 1000));
                        Integer delay = item.delay;
                        if (delay != null) {
                            Intrinsics.checkNotNullExpressionValue(delay, "delay");
                            iIntValue = delay.intValue();
                        }
                        ygoVar.j = iIntValue;
                        arrayList.add(ygoVar);
                        break;
                    }
                }
            }
            if (arrayList.size() > 0) {
                ygo.a aVar = new ygo.a();
                aVar.c = (ygo[]) arrayList.toArray(new ygo[0]);
                BlueToothSender.INSTANCE.handleStockInfo(deviceModel.getDid(), aVar);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postStockInfo$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postStockInfo$lambda$4(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postStockInfo$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final void requestBattery(final WearableDeviceModel deviceModel) {
        if (!DeviceModelExtKt.isHuaMi(deviceModel)) {
            if (DeviceModelExtKt.isWearOS(deviceModel)) {
                return;
            }
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 1;
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(deviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.SyncEngine.requestBattery.2
                private int battery;

                public final int getBattery() {
                    return this.battery;
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    String tag = SyncEngine.INSTANCE.getTAG();
                    Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                    Logger.i(tag, "sync battery by SyncEngine error, did=" + did + ", type=" + type + ", code=" + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    txo txoVarE;
                    vwo vwoVarS;
                    vwo.a aVar;
                    this.battery = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (vwoVarS = txoVarE.s()) == null || (aVar = vwoVarS.c) == null) ? -1 : aVar.c;
                    String tag = SyncEngine.INSTANCE.getTAG();
                    Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                    Logger.i(tag, "sync battery by SyncEngine success, battery=" + this.battery);
                    if (this.battery >= 0) {
                        deviceModel.getDeviceInfo().setBattery(this.battery);
                    }
                }

                public final void setBattery(int i) {
                    this.battery = i;
                }
            }, 6000);
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        DeviceBatteryInfo batteryLevel = huaMiApiCaller != null ? huaMiApiCaller.getBatteryLevel() : null;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "sync huami by SyncEngin success, battery = " + (batteryLevel != null ? Integer.valueOf(batteryLevel.getLevel()) : null));
        if (batteryLevel != null) {
            deviceModel.getDeviceInfo().setBattery(batteryLevel.getLevel());
        }
    }

    private final void syncCalendarToConnectedAllDevices(boolean force, MyAction1<Boolean> callback) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            arrayList.addAll(getNeedSyncDevices(3));
        } else if (isSyncCalendar(wearableDeviceModel)) {
            arrayList.add(wearableDeviceModel);
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.d(TAG2, "syncCalendarToConnectedAllDevices deviceModels size  is " + arrayList.size());
        if (!arrayList.isEmpty()) {
            syncCalendarToDevices(arrayList, force, callback, null);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private final void syncCalendarToDevices(List<WearableDeviceModel> deviceModels, boolean force, MyAction1<Boolean> callback, eu6<Boolean> deviceTaskCallBack) {
        if (!deviceModels.isEmpty()) {
            AnyExtKt.io$default(null, new C32251(deviceModels, this, deviceTaskCallBack, callback, null), 1, null);
            return;
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "no fit device");
        if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    private final void syncEmergencyContactToConnectedDevice(boolean force, MyAction1<Boolean> callback) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        AppUtil appUtil = AppUtil.INSTANCE;
        boolean zIsPlayChannel = appUtil.isPlayChannel();
        SystemProperties systemProperties = SystemProperties.INSTANCE;
        boolean zIsGlobalMiuiRom = systemProperties.isGlobalMiuiRom();
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "channel: " + zIsPlayChannel + " global: " + zIsGlobalMiuiRom);
        if (!appUtil.isPlayChannel() && !systemProperties.isGlobalMiuiRom()) {
            EmergencyContactExtKt.getInstance(EmergencyContactSyncHelper.INSTANCE).syncEmergencyContacts(wearableDeviceModel);
        }
        if (callback != null) {
            callback.call(Boolean.TRUE);
        }
    }

    private final void syncSleepModelToConnectedDevice(boolean force, MyAction1<Boolean> callback) {
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "syncSleepModelToConnectedDevice deviceModels size: " + arrayList.size());
        if (!arrayList.isEmpty()) {
            syncSleepModelToDevice(arrayList, force, callback);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    private final void syncSleepModelToDevice(List<? extends WearableDeviceModel> deviceModels, boolean force, MyAction1<Boolean> callback) {
        if (!deviceModels.isEmpty()) {
            AnyExtKt.io$default(null, new C32271(deviceModels, callback, null), 1, null);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    private final void syncStockToConnectedBleDevices(boolean force, MyAction1<Boolean> callback) {
        List<WearableDeviceModel> needSyncDevices = getNeedSyncDevices(2);
        if (!needSyncDevices.isEmpty()) {
            syncStockToDevices(needSyncDevices, force, callback);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    private final void syncStockToDevices(final List<WearableDeviceModel> deviceModels, boolean force, final MyAction1<Boolean> callback) {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        Iterator<WearableDeviceModel> it = deviceModels.iterator();
        while (it.hasNext()) {
            long syncTimeLong = SyncUtil.INSTANCE.getSyncTimeLong(2, it.next().getDid());
            if (!force && syncTimeLong > 0 && System.currentTimeMillis() - syncTimeLong < 600000) {
                it.remove();
            }
        }
        if (deviceModels.isEmpty()) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WearableDeviceModel wearableDeviceModel : deviceModels) {
            if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                arrayList.add(BlueToothSender.INSTANCE.getStockSymbolList(wearableDeviceModel.getDid()));
            }
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.d(TAG2, "syncStockToDevices observables:" + arrayList.size());
        o4h.G(arrayList).a(new z5h<List<? extends zgo>>() { // from class: com.xiaomi.fitness.sync.SyncEngine.syncStockToDevices.1
            private List<String> symbols = new ArrayList();

            public final List<String> getSymbols() {
                return this.symbols;
            }

            @Override // defpackage.z5h
            public void onComplete() {
                if (this.symbols.size() <= 0) {
                    MyAction1<Boolean> myAction1 = callback;
                    if (myAction1 != null) {
                        myAction1.call(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                SyncRequest syncRequest = SyncRequest.INSTANCE;
                List<String> list = this.symbols;
                final MyAction1<Boolean> myAction2 = callback;
                final List<WearableDeviceModel> list2 = deviceModels;
                final SyncEngine syncEngine = this;
                syncRequest.requestStockInfo(true, list, new be1<StockModel.StockInfo>() { // from class: com.xiaomi.fitness.sync.SyncEngine$syncStockToDevices$1$onComplete$1
                    @Override // defpackage.be1
                    public void onFailure() {
                        String tag = SyncEngine.INSTANCE.getTAG();
                        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                        Logger.d(tag, "requestStockInfo failure");
                        MyAction1<Boolean> myAction3 = myAction2;
                        if (myAction3 != null) {
                            myAction3.call(Boolean.FALSE);
                        }
                    }

                    @Override // defpackage.be1
                    public void onResponse(StockModel.StockInfo response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        Iterator<WearableDeviceModel> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            SyncUtil.INSTANCE.setSyncTimeLong(2, it2.next().getDid(), System.currentTimeMillis());
                        }
                        List<StockModel.StockInfo.Item> list3 = response.items;
                        if (list3 != null) {
                            for (StockModel.StockInfo.Item item : list3) {
                                String symbol = item.symbol;
                                Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
                                String market = item.market;
                                Intrinsics.checkNotNullExpressionValue(market, "market");
                                String str = item.nameCN;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                Float latestPrice = item.latestPrice;
                                Intrinsics.checkNotNullExpressionValue(latestPrice, "latestPrice");
                                float fFloatValue = latestPrice.floatValue();
                                Float preClose = item.preClose;
                                Intrinsics.checkNotNullExpressionValue(preClose, "preClose");
                                float fFloatValue2 = preClose.floatValue();
                                Float f = item.halted;
                                int iFloatValue = f != null ? (int) f.floatValue() : 0;
                                Integer delay = item.delay;
                                Intrinsics.checkNotNullExpressionValue(delay, "delay");
                                int iIntValue = delay.intValue();
                                Long timestamp = item.timestamp;
                                Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
                                StockDatabase.INSTANCE.getInstance().getStockDao().insertOrUpdate(new StockInfoEntity(symbol, market, str2, fFloatValue, fFloatValue2, iFloatValue, iIntValue, timestamp.longValue(), System.currentTimeMillis()));
                            }
                        }
                        String tag = SyncEngine.INSTANCE.getTAG();
                        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                        Logger.d(tag, "requestStockInfo success " + response);
                        syncEngine.postStockInfo(list2, response);
                        MyAction1<Boolean> myAction3 = myAction2;
                        if (myAction3 != null) {
                            myAction3.call(Boolean.TRUE);
                        }
                    }
                });
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                e.printStackTrace();
                Logger.d(tag, "syncStockToDevices error " + Unit.INSTANCE);
                MyAction1<Boolean> myAction1 = callback;
                if (myAction1 != null) {
                    myAction1.call(Boolean.FALSE);
                }
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(List<? extends zgo> list) {
                onNext2((List<zgo>) list);
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            public final void setSymbols(List<String> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.symbols = list;
            }

            /* JADX INFO: renamed from: onNext, reason: avoid collision after fix types in other method */
            public void onNext2(List<zgo> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.d(tag, "syncStockToDevices stockSymbol list:" + list);
                if (!list.isEmpty()) {
                    for (zgo zgoVar : list) {
                        List<String> list2 = this.symbols;
                        String symbol = zgoVar.c;
                        Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
                        list2.add(symbol);
                    }
                }
            }
        });
    }

    private final void syncTimeToConnectedDevices(boolean force, MyAction1<Boolean> callback) {
        Logger.i("Wearable.weather", "syncTimeToConnectedDevices");
        List<WearableDeviceModel> needSyncDevices = getNeedSyncDevices(5);
        if (needSyncDevices.isEmpty()) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        Iterator<WearableDeviceModel> it = needSyncDevices.iterator();
        while (it.hasNext()) {
            long syncTimeLong = SyncUtil.INSTANCE.getSyncTimeLong(5, it.next().getDid());
            if (!force && syncTimeLong > 0 && System.currentTimeMillis() - syncTimeLong < SYNC_TIME_DURATION) {
                it.remove();
            }
        }
        if (needSyncDevices.isEmpty()) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
                return;
            }
            return;
        }
        Iterator<WearableDeviceModel> it2 = needSyncDevices.iterator();
        while (it2.hasNext()) {
            if (DeviceModelExtKt.isBluetooth(it2.next())) {
                Logger.i("Wearable.weather", "syncTimeToConnectedDevices  syncTime");
                BlueToothSender.INSTANCE.syncTime();
            }
        }
        Iterator<WearableDeviceModel> it3 = needSyncDevices.iterator();
        while (it3.hasNext()) {
            SyncUtil.INSTANCE.setSyncTimeLong(5, it3.next().getDid(), System.currentTimeMillis());
        }
        if (callback != null) {
            callback.call(Boolean.TRUE);
        }
    }

    public final void clearAllCalendars(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!DeviceModelExtKt.isHuaMi(deviceModel)) {
            BlueToothSender.INSTANCE.clearCalendar(deviceModel.getDid());
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        int[] iArr = {130};
        if (huaMiApiCaller != null) {
            huaMiApiCaller.deleteBySource(iArr);
        }
    }

    public final void destroy() {
        String str = TAG;
        List<SyncEngineTask> list = syncList;
        Logger.i("Wearable.weather", str + " destroy , syncList size:" + list.size());
        if (list.isEmpty()) {
            Logger.i("Wearable.weather", str + " destroy");
            this.mComposite.d();
            SyncRequest.INSTANCE.destroy();
        }
    }

    public final boolean isSyncSleepModel(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return DeviceModelExtKt.isSupportFeature(deviceModel, "bedtime_clock") && DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL();
    }

    public final void syncAgpsDataToDevice(@Nullable final String did, final boolean online, int days, @Nullable String source, final int type, final int segmentLength, @NotNull final SyncEngineTask syncEngineTask, @NotNull final MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(syncEngineTask, "syncEngineTask");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (TextUtils.isEmpty(did) || !NetworkExtKt.isNetworkAvailable()) {
            callback.call(Boolean.FALSE);
            return;
        }
        if (source == null) {
            callback.call(Boolean.FALSE);
            return;
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.d(TAG2, "agps  start");
        syncList.add(syncEngineTask);
        SyncRequest.INSTANCE.performAgpsRequest(source, type, online, days, new be1<String>() { // from class: com.xiaomi.fitness.sync.SyncEngine.syncAgpsDataToDevice.1
            @Override // defpackage.be1
            public void onFailure() {
                Companion companion = SyncEngine.INSTANCE;
                String tag = companion.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.i(tag, "performAgpsRequest onFail");
                companion.getSyncList().remove(syncEngineTask);
                callback.call(Boolean.FALSE);
            }

            @Override // defpackage.be1
            public void onResponse(String filePath) {
                Companion companion = SyncEngine.INSTANCE;
                companion.getSyncList().remove(syncEngineTask);
                String tag = companion.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                FitnessLogUtils.i(tag, "agps filepath : " + filePath);
                callback.call(Boolean.TRUE);
                SyncEngine syncEngine = this;
                String str = did;
                Intrinsics.checkNotNull(str);
                boolean z = online;
                Intrinsics.checkNotNull(filePath);
                syncEngine.postAgpsData(str, z, filePath, type, segmentLength);
            }
        });
    }

    public final void syncAll(@Nullable final MyAction0 callback) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            if (callback != null) {
                callback.call();
                return;
            }
            return;
        }
        boolean z = !DeviceModelExtKt.isHuaMi(wearableDeviceModel);
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "syncAll isBle: " + z);
        int i = z ? 6 : 2;
        final MyCountDown myCountDown = new MyCountDown(i);
        MyAction1<Boolean> myAction1 = new MyAction1<Boolean>() { // from class: com.xiaomi.fitness.sync.SyncEngine$syncAll$action$1
            @Override // com.xiaomi.fitness.sync.export.MyAction1
            public /* bridge */ /* synthetic */ void call(Boolean bool) {
                call(bool.booleanValue());
            }

            public void call(boolean var1) {
                MyAction0 myAction0;
                if (myCountDown.countDown() > 0 || (myAction0 = callback) == null) {
                    return;
                }
                myAction0.call();
            }
        };
        Logger.i("Wearable.weather", "syncAll all isBleDevice:" + z + " countDown:" + i);
        if (z) {
            syncStockToConnectedBleDevices(false, myAction1);
            syncSleepModelToConnectedDevice(false, myAction1);
            syncTimeToConnectedDevices(false, myAction1);
            syncEmergencyContactToConnectedDevice(false, myAction1);
        }
        syncCalendarToConnectedAllDevices(false, myAction1);
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).syncWeatherToConnectedDevices(false, myAction1, this.mMapHighAccuracy);
        if (isHyperOS()) {
            requestBattery(wearableDeviceModel);
        }
    }

    public final void syncCalendarToDevice(@NotNull WearableDeviceModel deviceModel, boolean force, @Nullable MyAction1<Boolean> callback, @Nullable eu6<Boolean> deviceTaskCallBack) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (isSyncCalendar(deviceModel)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(deviceModel);
            syncCalendarToDevices(arrayList, force, callback, deviceTaskCallBack);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }

    public final void syncLocationToDevice(@NotNull final String did, @NotNull final MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application application = ApplicationExtKt.getApplication();
        if (ni4.a(application, "android.permission.ACCESS_FINE_LOCATION") == 0 || ni4.a(application, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            new LocationRequest().requestLocation("GNSS", new ILocationListener() { // from class: com.xiaomi.fitness.sync.SyncEngine.syncLocationToDevice.1
                private boolean isHasCallback;

                /* JADX INFO: renamed from: isHasCallback, reason: from getter */
                public final boolean getIsHasCallback() {
                    return this.isHasCallback;
                }

                @Override // com.xiaomi.fitness.common.utils.ILocationListener
                public void onFail(String msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Logger.i("Wearable.weather", "Location errorMsg " + msg);
                    if (!this.isHasCallback) {
                        callback.call(Boolean.FALSE);
                    }
                    this.isHasCallback = true;
                }

                @Override // com.xiaomi.fitness.common.utils.ILocationListener
                public void onSuccess(Location location) {
                    if (location != null) {
                        if (!this.isHasCallback) {
                            BlueToothSender.INSTANCE.postLocation(did, location.getAltitude(), location.getLat(), location.getLon(), callback);
                        }
                        this.isHasCallback = true;
                    }
                }

                public final void setHasCallback(boolean z) {
                    this.isHasCallback = z;
                }
            });
            return;
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "syncLocationToDevice: no permission");
        callback.call(Boolean.FALSE);
    }

    public final void syncStockToDevice(@NotNull String did, boolean force, @NotNull MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            callback.call(Boolean.FALSE);
        } else {
            syncStockToDevice(wearableDeviceModel, force, callback);
        }
    }

    @JvmOverloads
    public SyncEngine(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mMapHighAccuracy = z;
        this.mComposite = new na4();
        this.isHyperOS = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vso
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SyncEngine.isHyperOS_delegate$lambda$0());
            }
        });
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005R\u001b\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncEngine$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "Ljava/lang/String;", "WEATHERTAG", "SYNC_CALENDAR_DURATION", "", "SYNC_STOCK_DURATION", "SYNC_WEATHER_DURATION", "SYNC_WEATHER_LOCATION_DURATION", "SYNC_TIME_DURATION", "TYPE_WEATHER", "", "TYPE_WEATHER_PRESSURE", "TYPE_STOCK", "TYPE_CALENDAR", "TYPE_SLEEP_MODEL", "TYPE_TIME", "TYPE_WEATHER_LOCATION", "BLUETOOTH_SYNC_COUNT", "HUAMI_SYNC_COUNT", "clearSyncKey", "", "did", "syncList", "", "Lcom/xiaomi/fitness/sync/SyncEngine$SyncEngineTask;", "getSyncList", "()Ljava/util/List;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearSyncKey() {
            Iterator it = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().iterator();
            while (it.hasNext()) {
                clearSyncKey(((WearableDeviceModel) it.next()).getDid());
            }
        }

        @NotNull
        public final List<SyncEngineTask> getSyncList() {
            return SyncEngine.syncList;
        }

        public final String getTAG() {
            return SyncEngine.TAG;
        }

        public final void clearSyncKey(@Nullable String did) {
            if (did != null) {
                SyncUtil syncUtil = SyncUtil.INSTANCE;
                syncUtil.setSyncTimeLong(0, did, 0L);
                syncUtil.setSyncTimeLong(1, did, 0L);
                syncUtil.setSyncTimeLong(2, did, 0L);
                syncUtil.setSyncTimeLong(3, did, 0L);
                syncUtil.setSyncTimeLong(5, did, 0L);
                syncUtil.setSyncTimeLong(6, did, 0L);
            }
        }
    }

    private final void syncStockToDevice(WearableDeviceModel deviceModel, boolean force, MyAction1<Boolean> callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(deviceModel);
        syncStockToDevices(arrayList, force, callback);
    }

    public /* synthetic */ SyncEngine(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    public final void syncCalendarToDevice(@NotNull String did, boolean force, @Nullable MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return;
        }
        if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            if (callback != null) {
                callback.call(Boolean.FALSE);
            }
        } else if (isSyncCalendar(wearableDeviceModel)) {
            syncCalendarToDevice(wearableDeviceModel, force, callback, null);
        } else if (callback != null) {
            callback.call(Boolean.FALSE);
        }
    }
}
