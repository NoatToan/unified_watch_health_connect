package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u0001:\u0001\u0017B5\u0012\u0006\u0010&\u001a\u00020\"\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00103\u001a\u00020/¢\u0006\u0004\b7\u00108J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u001e\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rR\u0019\u0010&\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b+\u0010)R\u001b\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b-\u0010)R\u0019\u00103\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Ljava/util/Calendar;", "initStartTime", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDay;", "f", "", "time", "", "bytesData", "", "oneItemSize", "c", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "g", GoogleApiAvailabilityLight.a, "([B)[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "e", "a", "([B)[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "index", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "b", "", "doWork", HTTP.CONTENT_RANGE_BYTES, "offset", SessionDescription.p, "bytesToInt", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Ljava/util/Calendar;", "getStartTimeAllDay", "()Ljava/util/Calendar;", "startTimeAllDay", "getStartTimeSingle", "startTimeSingle", "getStartTime80s", "startTime80s", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureProfile;", "mProfile", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/IHMBodyTemperatureDataCallback;)V", "h", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncBodyTemperatureTask extends HMBaseTask {

    @NotNull
    private static final a h = new a(null);

    @Deprecated
    @NotNull
    private static final String i = "SyncBodyTemperatureTask";

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
    @NotNull
    private final IHMBodyTemperatureDataCallback callback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HMSyncBodyTemperatureProfile mProfile;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureTask$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HMSyncBodyTemperatureTask(@NotNull GattPeripheral gattPeripheral, @Nullable Calendar calendar, @Nullable Calendar calendar2, @Nullable Calendar calendar3, @NotNull IHMBodyTemperatureDataCallback iHMBodyTemperatureDataCallback) {
        this.gattPeripheral = gattPeripheral;
        this.startTimeAllDay = calendar;
        this.startTimeSingle = calendar2;
        this.startTime80s = calendar3;
        this.callback = iHMBodyTemperatureDataCallback;
        this.mProfile = new HMSyncBodyTemperatureProfile(gattPeripheral);
    }

    private final Temperature80s[] a(byte[] bytesData) {
        int length = bytesData.length / 1291;
        Temperature80s temperature80s = new Temperature80s(0L, 0, 0, (short) 0, new Temperature80sItem[0], new byte[0]);
        Temperature80s[] temperature80sArr = new Temperature80s[length];
        for (int i2 = 0; i2 < length; i2++) {
            temperature80sArr[i2] = temperature80s;
        }
        if (length > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int i5 = i3 * 1291;
                int i6 = bytesData[i5] & 255;
                int iBytesToInt = bytesToInt(bytesData, i5 + 1, 4);
                int iBytesToInt2 = bytesToInt(bytesData, i5 + 5, 2);
                long jBytesToLong = GattUtils.bytesToLong(bytesData, i5 + 7, 4);
                Temperature80sItem temperature80sItem = new Temperature80sItem(0L, (short) 0, (short) 0, (short) 0, (short) 0, 0);
                Temperature80sItem[] temperature80sItemArr = new Temperature80sItem[80];
                for (int i7 = 0; i7 < 80; i7++) {
                    temperature80sItemArr[i7] = temperature80sItem;
                }
                int i8 = i5 + 11;
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bytesData, i8, i8 + 1280);
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    temperature80sItemArr[i9] = b(bytesData, i8 + (i9 * 16));
                    if (i10 >= 80) {
                        break;
                    }
                    i9 = i10;
                }
                temperature80sArr[i3] = new Temperature80s(jBytesToLong * ((long) 1000), i6, iBytesToInt, (short) iBytesToInt2, temperature80sItemArr, bArrCopyOfRange);
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        return temperature80sArr;
    }

    private final Temperature80sItem b(byte[] bytesData, int index) {
        int iBytesToInt = bytesToInt(bytesData, index, 2);
        int iBytesToInt2 = bytesToInt(bytesData, index + 2, 2);
        int iBytesToInt3 = bytesToInt(bytesData, index + 4, 2);
        int iBytesToInt4 = bytesToInt(bytesData, index + 6, 2);
        return new Temperature80sItem(GattUtils.bytesToLong(bytesData, index + 12, 4) * ((long) 1000), (short) iBytesToInt, (short) iBytesToInt2, (short) iBytesToInt3, (short) iBytesToInt4, bytesData[index + 8]);
    }

    private final TemperatureAllDay c(long time, byte[] bytesData, int oneItemSize) {
        Debug.fi(i, Intrinsics.stringPlus("Parse AllDayData, ByteSize/Minute: ", Integer.valueOf(oneItemSize)));
        int length = bytesData.length / oneItemSize;
        int i2 = 0;
        TemperatureAllDayItem temperatureAllDayItem = new TemperatureAllDayItem((short) 0, (short) 0, (short) 0, (short) 0);
        TemperatureAllDayItem[] temperatureAllDayItemArr = new TemperatureAllDayItem[length];
        for (int i3 = 0; i3 < length; i3++) {
            temperatureAllDayItemArr[i3] = temperatureAllDayItem;
        }
        if (length > 0) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = i2 * oneItemSize;
                temperatureAllDayItemArr[i2] = new TemperatureAllDayItem((short) bytesToInt(bytesData, i5, 2), (short) bytesToInt(bytesData, i5 + 2, 2), (short) bytesToInt(bytesData, i5 + 4, 2), (short) bytesToInt(bytesData, i5 + 6, 2));
                if (i4 >= length) {
                    break;
                }
                i2 = i4;
            }
        }
        return new TemperatureAllDay(time, temperatureAllDayItemArr, bytesData);
    }

    private final TemperatureSingle[] d(byte[] bytesData) {
        int length = bytesData.length / 8;
        int i2 = 0;
        TemperatureSingle temperatureSingle = new TemperatureSingle(0L, (short) 0, (short) 0);
        TemperatureSingle[] temperatureSingleArr = new TemperatureSingle[length];
        for (int i3 = 0; i3 < length; i3++) {
            temperatureSingleArr[i3] = temperatureSingle;
        }
        if (length > 0) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = i2 * 8;
                temperatureSingleArr[i2] = new TemperatureSingle(GattUtils.bytesToLong(bytesData, i5 + 4, 4) * ((long) 1000), (short) bytesToInt(bytesData, i5, 2), (short) bytesToInt(bytesData, i5 + 2, 2));
                if (i4 >= length) {
                    break;
                }
                i2 = i4;
            }
        }
        return temperatureSingleArr;
    }

    private final Pair<Boolean, Temperature80s[]> e(Calendar initStartTime) {
        boolean z;
        Debug.fi(i, Intrinsics.stringPlus("Sync 80sTemperature StartTime: ", initStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            z = true;
            if (i2 > 0) {
                DataHeader dataHeader80s = this.mProfile.getDataHeader80s(initStartTime);
                if (dataHeader80s != null) {
                    int i4 = dataHeader80s.size;
                    if (i4 == 0) {
                        break;
                    }
                    Pair<Boolean, byte[]> pairFetchData = this.mProfile.fetchData(i4);
                    this.mProfile.stopTransfer();
                    if (pairFetchData.getFirst().booleanValue() && pairFetchData.getSecond() != null) {
                        h.addAll(arrayList, a(pairFetchData.getSecond()));
                        Debug.fi(i, Intrinsics.stringPlus("80sTemperature Add: ", Integer.valueOf(arrayList.size())));
                        if (arrayList.size() == 0) {
                            break;
                        }
                        Temperature80s temperature80s = (Temperature80s) arrayList.get(arrayList.size() - 1);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(temperature80s.getTimeMillis());
                        calendar.add(13, 80);
                        Debug.fi(i, Intrinsics.stringPlus("Update StartTime: ", calendar.getTime()));
                        initStartTime = calendar;
                        i2 = i3;
                    }
                }
                z = false;
                break;
            }
            break;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        Object[] array = arrayList.toArray(new Temperature80s[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Pair<Boolean, Temperature80s[]> pair = new Pair<>(boolValueOf, array);
        Debug.fi(i, "Sync 80sTemperature Finish, Success: " + pair.getFirst().booleanValue() + ", " + ((Object) ArraysUtil.toString(pair.getSecond())));
        return pair;
    }

    private final Pair<Boolean, TemperatureAllDay[]> f(Calendar initStartTime) {
        boolean z;
        Debug.fi(i, Intrinsics.stringPlus("Sync AllDayTemperature StartTime: ", initStartTime.getTime()));
        ArrayList arrayList = new ArrayList();
        int i2 = 30;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                DataHeader dataHeaderAllDay = this.mProfile.getDataHeaderAllDay(initStartTime);
                if (dataHeaderAllDay != null) {
                    int i4 = dataHeaderAllDay.size;
                    if (i4 != 0) {
                        Pair<Boolean, byte[]> pairFetchData = this.mProfile.fetchData(i4);
                        this.mProfile.stopTransfer();
                        if (pairFetchData.getFirst().booleanValue() && pairFetchData.getSecond() != null) {
                            long j = 1000;
                            arrayList.add(c((dataHeaderAllDay.calendar.getTimeInMillis() / j) * j, pairFetchData.getSecond(), 8));
                            Calendar calendar = (Calendar) dataHeaderAllDay.calendar.clone();
                            calendar.add(12, dataHeaderAllDay.size / 8);
                            Debug.fi(i, Intrinsics.stringPlus("Update StartTime: ", calendar.getTime()));
                            initStartTime = calendar;
                            i2 = i3;
                        }
                    }
                }
                z = false;
                Boolean boolValueOf = Boolean.valueOf(z);
                Object[] array = arrayList.toArray(new TemperatureAllDay[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                Pair<Boolean, TemperatureAllDay[]> pair = new Pair<>(boolValueOf, array);
                Debug.fi(i, "Sync AllDayTemperature Finish, Success: " + pair.getFirst().booleanValue() + ", " + ((Object) ArraysUtil.toString(pair.getSecond())));
                return pair;
            }
            z = true;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            Object[] array2 = arrayList.toArray(new TemperatureAllDay[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            Pair<Boolean, TemperatureAllDay[]> pair2 = new Pair<>(boolValueOf2, array2);
            Debug.fi(i, "Sync AllDayTemperature Finish, Success: " + pair2.getFirst().booleanValue() + ", " + ((Object) ArraysUtil.toString(pair2.getSecond())));
            return pair2;
        }
    }

    private final Pair<Boolean, TemperatureSingle[]> g(Calendar startTime) {
        Debug.fi(i, Intrinsics.stringPlus("Sync SingleTemperature StartTime: ", startTime.getTime()));
        boolean z = false;
        TemperatureSingle[] temperatureSingleArrD = new TemperatureSingle[0];
        DataHeader dataHeaderSingle = this.mProfile.getDataHeaderSingle(startTime);
        if (dataHeaderSingle != null) {
            int i2 = dataHeaderSingle.size;
            if (i2 != 0) {
                Pair<Boolean, byte[]> pairFetchData = this.mProfile.fetchData(i2);
                this.mProfile.stopTransfer();
                if (pairFetchData.getFirst().booleanValue() && pairFetchData.getSecond() != null) {
                    temperatureSingleArrD = d(pairFetchData.getSecond());
                    z = true;
                }
            } else {
                z = true;
            }
        }
        Pair<Boolean, TemperatureSingle[]> pair = new Pair<>(Boolean.valueOf(z), temperatureSingleArrD);
        Debug.fi(i, "Sync SingleTemperature Finish, Success: " + pair.getFirst().booleanValue() + ", " + ((Object) ArraysUtil.toString(pair.getSecond())));
        return pair;
    }

    public final int bytesToInt(@NotNull byte[] bytes, int offset, int length) {
        int i2 = 0;
        if (length <= 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            i3 |= (bytes[offset + i2] & 255) << (i2 * 8);
            if (i4 >= length) {
                return i3;
            }
            i2 = i4;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        Boolean first;
        Boolean first2;
        Boolean first3;
        Debug.fi(i, "Sync BodyTemperature Start...");
        this.callback.onStart();
        if (!this.mProfile.init()) {
            Debug.fi(i, "Init Profile Fail!!");
            this.callback.onFinish(false);
            return;
        }
        Calendar calendar = this.startTimeAllDay;
        Pair<Boolean, TemperatureAllDay[]> pairF = calendar == null ? null : f(calendar);
        Calendar calendar2 = this.startTimeSingle;
        Pair<Boolean, TemperatureSingle[]> pairG = calendar2 == null ? null : g(calendar2);
        Calendar calendar3 = this.startTime80s;
        HMBodyTemperatureData hMBodyTemperatureData = new HMBodyTemperatureData(pairF, pairG, calendar3 != null ? e(calendar3) : null);
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
        Debug.fi(i, "Sync BodyTemperature Finish, Success: " + z + ", " + hMBodyTemperatureData);
        this.callback.onFinish(z);
    }

    @NotNull
    public final IHMBodyTemperatureDataCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @Nullable
    public final Calendar getStartTime80s() {
        return this.startTime80s;
    }

    @Nullable
    public final Calendar getStartTimeAllDay() {
        return this.startTimeAllDay;
    }

    @Nullable
    public final Calendar getStartTimeSingle() {
        return this.startTimeSingle;
    }
}
