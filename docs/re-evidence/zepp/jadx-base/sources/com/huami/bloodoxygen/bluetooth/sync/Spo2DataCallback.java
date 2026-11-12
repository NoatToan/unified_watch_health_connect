package com.huami.bloodoxygen.bluetooth.sync;

import android.annotation.SuppressLint;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaEventData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaEventYorkData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2PointData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2OsaDataExtends;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2PointDataExtends;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001(B+\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002JJ\u0010\u0012\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0003J\u0018\u0010\u0014\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001f\u0010%\u001a\u0004\u0018\u00010!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$¨\u0006)"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DataCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "dataFragments", "", "b", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "clickSpo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "osaProcesses", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "osaEvents", "", "clickSpo2Time", "osaProcessTime", "osaEventTime", "", "c", "data", "onFinish", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "a", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "syncTime", "", "Ljava/lang/String;", "userId", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", GoogleApiAvailabilityLight.a, "snFromSnService", "Lcom/huami/bloodoxygen/bluetooth/usecase/other/SaveBleDataUseCase;", "e", "Lkotlin/Lazy;", "()Lcom/huami/bloodoxygen/bluetooth/usecase/other/SaveBleDataUseCase;", "saveBleDataUseCase", "<init>", "(Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;Ljava/lang/String;Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2DataCallback extends HMCallback<List<? extends Spo2Data>> {

    @NotNull
    private static final String f = "Spo2DataCallback";
    private static final long g = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenSyncTime syncTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String snFromSnService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveBleDataUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Spo2Data a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Spo2Data spo2Data, long j) {
            super(0);
            this.a = spo2Data;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dataFragments item time invalid " + this.a.getTimeStamp() + " " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Spo2DataCallback handleData OutOfMemoryError";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Spo2Data> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Spo2Data> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<Spo2Data> list = this.a;
            return "onFinish 数据完成:" + (list == null ? null : Integer.valueOf(list.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/usecase/other/SaveBleDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SaveBleDataUseCase> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SaveBleDataUseCase invoke() {
            return (SaveBleDataUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(SaveBleDataUseCase.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveBleDataUseCase is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public /* synthetic */ Spo2DataCallback(BloodOxygenSyncTime bloodOxygenSyncTime, String str, DeviceInfo deviceInfo, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bloodOxygenSyncTime, str, deviceInfo, (i & 8) != 0 ? null : str2);
    }

    private final SaveBleDataUseCase a() {
        return (SaveBleDataUseCase) this.saveBleDataUseCase.getValue();
    }

    private final int b(List<? extends Spo2Data> dataFragments) {
        int i;
        String str;
        Object next;
        Object next2;
        Object next3;
        long j;
        int size = dataFragments.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int value = this.deviceInfo.getDeviceSource().getValue();
        String serialNumber = this.snFromSnService;
        if (serialNumber == null) {
            serialNumber = this.deviceInfo.getSerialNumber();
        }
        String deviceID = this.deviceInfo.getDeviceID();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        try {
            for (Spo2Data spo2Data : dataFragments) {
                if (spo2Data.getTimeStamp() > jCurrentTimeMillis) {
                    HMLog.info(f, new a(spo2Data, jCurrentTimeMillis));
                } else {
                    if (spo2Data instanceof Spo2PointDataExtends) {
                        HMLog.i(f, "spo2point:" + spo2Data, new Object[0]);
                        int spo2 = ((Spo2PointDataExtends) spo2Data).getSpo2();
                        if (80 <= spo2 && spo2 <= 100) {
                            String str2 = this.userId;
                            long timeStamp = spo2Data.getTimeStamp() * 1000;
                            int spo3 = ((Spo2PointDataExtends) spo2Data).getSpo2();
                            byte[] spo2History = ((Spo2PointDataExtends) spo2Data).getSpo2History();
                            j = jCurrentTimeMillis;
                            ArrayList arrayList4 = new ArrayList(spo2History.length);
                            int i2 = 0;
                            for (int length = spo2History.length; i2 < length; length = length) {
                                arrayList4.add(Integer.valueOf(spo2History[i2]));
                                i2++;
                            }
                            i = size;
                            try {
                                arrayList.add(new ClickMeasuredSpo2(str2, timeStamp, spo3, value, deviceID, serialNumber, arrayList4, null, null, false, 896, null));
                            } catch (OutOfMemoryError unused) {
                                str = null;
                                HMLog.info$default(str, b.a, 1, str);
                                return i;
                            }
                        } else {
                            j = jCurrentTimeMillis;
                            i = size;
                        }
                    } else {
                        j = jCurrentTimeMillis;
                        i = size;
                        if (spo2Data instanceof Spo2PointData) {
                            int spo4 = ((Spo2PointData) spo2Data).getSpo2();
                            if (80 <= spo4 && spo4 <= 100) {
                                arrayList.add(new ClickMeasuredSpo2(this.userId, spo2Data.getTimeStamp() * 1000, ((Spo2PointData) spo2Data).getSpo2(), value, deviceID, serialNumber, null, null, null, false, 960, null));
                            }
                        } else if (spo2Data instanceof Spo2OsaDataExtends) {
                            String str3 = this.userId;
                            long timeStamp2 = spo2Data.getTimeStamp() * 1000;
                            int spo5 = ((Spo2OsaDataExtends) spo2Data).getSpo2();
                            byte time = ((Spo2OsaDataExtends) spo2Data).getTime();
                            byte[] spo2High = ((Spo2OsaDataExtends) spo2Data).getSpo2High();
                            try {
                                ArrayList arrayList5 = new ArrayList(spo2High.length);
                                for (byte b2 : spo2High) {
                                    arrayList5.add(Integer.valueOf(b2));
                                }
                                byte[] spo2Low = ((Spo2OsaDataExtends) spo2Data).getSpo2Low();
                                ArrayList arrayList6 = new ArrayList(spo2Low.length);
                                int length2 = spo2Low.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    arrayList6.add(Integer.valueOf(spo2Low[i3]));
                                    i3++;
                                    spo2Low = spo2Low;
                                }
                                byte[] signalQuality = ((Spo2OsaDataExtends) spo2Data).getSignalQuality();
                                ArrayList arrayList7 = new ArrayList(signalQuality.length);
                                int length3 = signalQuality.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    arrayList7.add(Integer.valueOf(signalQuality[i4]));
                                    i4++;
                                    signalQuality = signalQuality;
                                }
                                byte[] extend = ((Spo2OsaDataExtends) spo2Data).getExtend();
                                ArrayList arrayList8 = new ArrayList(extend.length);
                                int length4 = extend.length;
                                int i5 = 0;
                                while (i5 < length4) {
                                    arrayList8.add(Integer.valueOf(extend[i5]));
                                    i5++;
                                    extend = extend;
                                }
                                arrayList2.add(new OriginOsaProcess(str3, timeStamp2, spo5, time, null, value, deviceID, serialNumber, arrayList5, arrayList6, arrayList7, arrayList8, null, false, 12304, null));
                            } catch (OutOfMemoryError unused2) {
                                str = null;
                                HMLog.info$default(str, b.a, 1, str);
                                return i;
                            }
                        } else if (spo2Data instanceof Spo2OsaData) {
                            arrayList2.add(new OriginOsaProcess(this.userId, spo2Data.getTimeStamp() * 1000, ((Spo2OsaData) spo2Data).getSpo2(), ((Spo2OsaData) spo2Data).getTime(), null, value, deviceID, serialNumber, null, null, null, null, null, false, 16144, null));
                        } else if (spo2Data instanceof Spo2OsaEventData) {
                            String str4 = this.userId;
                            long timeStamp3 = spo2Data.getTimeStamp() * 1000;
                            byte[] spo6 = ((Spo2OsaEventData) spo2Data).getSpo2();
                            ArrayList arrayList9 = new ArrayList(spo6.length);
                            for (byte b3 : spo6) {
                                arrayList9.add(Integer.valueOf(b3));
                            }
                            byte[] bArr = ((Spo2OsaEventData) spo2Data).getCom.huami.mifit.sportlib.common.Constants.DATA_KEY_HR java.lang.String();
                            ArrayList arrayList10 = new ArrayList(bArr.length);
                            int length5 = bArr.length;
                            int i6 = 0;
                            while (i6 < length5) {
                                arrayList10.add(Integer.valueOf(bArr[i6]));
                                i6++;
                                bArr = bArr;
                            }
                            arrayList3.add(new OriginOsaEvent(str4, timeStamp3, arrayList9, arrayList10, ((Spo2OsaEventData) spo2Data).getSpo2Decrease(), null, value, deviceID, serialNumber, null, false, 1568, null));
                        } else if (spo2Data instanceof Spo2OsaEventYorkData) {
                            arrayList3.add(new OriginOsaEvent(this.userId, spo2Data.getTimeStamp() * 1000, null, null, 0, null, value, deviceID, serialNumber, null, false, 1596, null));
                        } else {
                            HMLog.e(f, "error data type", new Object[0]);
                        }
                    }
                    jCurrentTimeMillis = j;
                    size = i;
                }
            }
            i = size;
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long utcTimestamp = ((ClickMeasuredSpo2) next).getUtcTimestamp();
                    do {
                        Object next4 = it2.next();
                        long utcTimestamp2 = ((ClickMeasuredSpo2) next4).getUtcTimestamp();
                        if (utcTimestamp < utcTimestamp2) {
                            next = next4;
                            utcTimestamp = utcTimestamp2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            ClickMeasuredSpo2 clickMeasuredSpo2 = (ClickMeasuredSpo2) next;
            Long lValueOf = clickMeasuredSpo2 == null ? null : Long.valueOf((clickMeasuredSpo2.getUtcTimestamp() / 1000) + 1);
            long clickSpo2Time = lValueOf == null ? this.syncTime.getClickSpo2Time() : lValueOf.longValue();
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    long utcTimestamp3 = ((OriginOsaProcess) next2).getUtcTimestamp();
                    do {
                        Object next5 = it3.next();
                        long utcTimestamp4 = ((OriginOsaProcess) next5).getUtcTimestamp();
                        if (utcTimestamp3 < utcTimestamp4) {
                            next2 = next5;
                            utcTimestamp3 = utcTimestamp4;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next2 = null;
            }
            OriginOsaProcess originOsaProcess = (OriginOsaProcess) next2;
            Long lValueOf2 = originOsaProcess == null ? null : Long.valueOf((originOsaProcess.getUtcTimestamp() / 1000) + 1);
            long osaProcessTime = lValueOf2 == null ? this.syncTime.getOsaProcessTime() : lValueOf2.longValue();
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                next3 = it4.next();
                if (it4.hasNext()) {
                    long utcTimestamp5 = ((OriginOsaEvent) next3).getUtcTimestamp();
                    do {
                        Object next6 = it4.next();
                        long utcTimestamp6 = ((OriginOsaEvent) next6).getUtcTimestamp();
                        if (utcTimestamp5 < utcTimestamp6) {
                            next3 = next6;
                            utcTimestamp5 = utcTimestamp6;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next3 = null;
            }
            OriginOsaEvent originOsaEvent = (OriginOsaEvent) next3;
            Long lValueOf3 = originOsaEvent == null ? null : Long.valueOf((originOsaEvent.getUtcTimestamp() / 1000) + 1);
            str = null;
            try {
                c(arrayList, arrayList2, arrayList3, clickSpo2Time, osaProcessTime, lValueOf3 == null ? this.syncTime.getOsaEventTime() : lValueOf3.longValue());
            } catch (OutOfMemoryError unused3) {
                HMLog.info$default(str, b.a, 1, str);
            }
        } catch (OutOfMemoryError unused4) {
            i = size;
        }
        return i;
    }

    @SuppressLint({"CheckResult"})
    private final void c(List<ClickMeasuredSpo2> clickSpo2s, List<OriginOsaProcess> osaProcesses, List<OriginOsaEvent> osaEvents, long clickSpo2Time, long osaProcessTime, long osaEventTime) {
        if (a() == null) {
            HMLog.info(f, e.a);
        }
        BloodOxygenSyncTime bloodOxygenSyncTime = new BloodOxygenSyncTime(clickSpo2Time, osaProcessTime, osaEventTime);
        SaveBleDataUseCase saveBleDataUseCaseA = a();
        if (saveBleDataUseCaseA == null) {
            return;
        }
        if (Intrinsics.areEqual(bloodOxygenSyncTime, this.syncTime)) {
            bloodOxygenSyncTime = null;
        }
        saveBleDataUseCaseA.execute(clickSpo2s, osaProcesses, osaEvents, bloodOxygenSyncTime, f.a, g.a);
    }

    public Spo2DataCallback(@NotNull BloodOxygenSyncTime bloodOxygenSyncTime, @NotNull String str, @NotNull DeviceInfo deviceInfo, @Nullable String str2) {
        this.syncTime = bloodOxygenSyncTime;
        this.userId = str;
        this.deviceInfo = deviceInfo;
        this.snFromSnService = str2;
        this.saveBleDataUseCase = LazyKt__LazyJVMKt.lazy(d.a);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(@Nullable List<? extends Spo2Data> data) {
        HMLog.info(f, new c(data));
        if (data == null) {
            return;
        }
        b(data);
    }
}
