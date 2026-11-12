package com.xiaomi.hm.health.bt.profile.menstruation;

import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000f\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006\u001a\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0002\"\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011\"\u0016\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"\u0016\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\"\u0016\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011\"\u0016\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011\"\u0016\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011\"\u0016\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\"\u0016\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011\"\u0016\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011\"\u0016\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;", "", "toByteArray", "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;)[B", "data", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "parseResponse", "totalRecord", "getMenstruationTotalRecordData", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "parseMenstruationConfig", "", "TAG", "Ljava/lang/String;", "", "TYPE_QUERY_DEVICE_DATA", "B", "TYPE_RETURN_DEVICE_DATA", "TYPE_UPDATE_DEVICE_DATA", "TYPE_UPDATE_RESULT", "TYPE_SYNC_SETTING_DATA", "TYPE_SYNC_SETTING_DATA_RESULT", "TYPE_SET_SETTING_DATA", "TYPE_SET_SETTING_DATA_RESULT", "TYPE_SET_PERIOD_DATA", "TYPE_SET_PERIOD_DATA_RESULT", "TYPE_NOTIFY_FIRST_USE_TO_APP", "TYPE_NOTIFY_DEVICE_DATA_CHANGE", "HAS_DATA", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class MenstruationHelperKt {
    public static final byte HAS_DATA = 1;

    @NotNull
    public static final String TAG = "MenstruationDataParser";
    public static final byte TYPE_NOTIFY_DEVICE_DATA_CHANGE = -1;
    public static final byte TYPE_NOTIFY_FIRST_USE_TO_APP = 15;
    public static final byte TYPE_QUERY_DEVICE_DATA = 1;
    public static final byte TYPE_RETURN_DEVICE_DATA = 2;
    public static final byte TYPE_SET_PERIOD_DATA = 9;
    public static final byte TYPE_SET_PERIOD_DATA_RESULT = 10;
    public static final byte TYPE_SET_SETTING_DATA = 7;
    public static final byte TYPE_SET_SETTING_DATA_RESULT = 8;
    public static final byte TYPE_SYNC_SETTING_DATA = 5;
    public static final byte TYPE_SYNC_SETTING_DATA_RESULT = 6;
    public static final byte TYPE_UPDATE_DEVICE_DATA = 3;
    public static final byte TYPE_UPDATE_RESULT = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parseResponse e: ", this.a);
        }
    }

    @NotNull
    public static final byte[] getMenstruationTotalRecordData(@NotNull MenstruationTotalRecord menstruationTotalRecord) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(MenstruationTotalRecordKt.toByteArray(menstruationTotalRecord));
        } catch (Exception e) {
            Debug.fi(TAG, Intrinsics.stringPlus("toByteArray exception: ", e));
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Nullable
    public static final MenstruationConfig parseMenstruationConfig(@NotNull byte[] bArr) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Byte bValueOf;
        Boolean boolValueOf3;
        Boolean bool;
        Byte bValueOf2;
        Debug.fi(TAG, Intrinsics.stringPlus("data: ", GattUtils.bytesToHexString(bArr)));
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferWrap.get();
            short s = byteBufferWrap.getShort();
            if (((short) (s & 1)) != 0) {
                boolValueOf = Boolean.valueOf(byteBufferWrap.get() == 1);
            } else {
                boolValueOf = null;
            }
            if (((short) (s & 2)) != 0) {
                boolValueOf2 = Boolean.valueOf(byteBufferWrap.get() == 1);
            } else {
                boolValueOf2 = null;
            }
            if (((short) (s & 4)) != 0) {
                byte b = byteBufferWrap.get();
                boolValueOf3 = Boolean.valueOf(((byte) (b & (-128))) != 0);
                bValueOf = Byte.valueOf((byte) (b & 127));
            } else {
                bValueOf = null;
                boolValueOf3 = null;
            }
            if (((short) (s & 8)) != 0) {
                byte b2 = byteBufferWrap.get();
                Boolean boolValueOf4 = Boolean.valueOf(((byte) (b2 & (-128))) != 0);
                bValueOf2 = Byte.valueOf((byte) (b2 & 127));
                bool = boolValueOf4;
            } else {
                bool = null;
                bValueOf2 = null;
            }
            return new MenstruationConfig(boolValueOf, boolValueOf2, boolValueOf3, bValueOf, bool, bValueOf2);
        } catch (Exception e) {
            Debug.fi(TAG, Intrinsics.stringPlus("parseMenstruationConfig: ", e));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    @Nullable
    public static final MenstruationTotalRecord parseResponse(@NotNull byte[] bArr) {
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        Object obj;
        MenstruationTotalRecord menstruationTotalRecord;
        long j;
        try {
            Result.Companion companion = Result.Companion;
            Debug.fi(TAG, Intrinsics.stringPlus("data.size: ", Integer.valueOf(bArr.length)));
            Debug.fi(TAG, Intrinsics.stringPlus("data: ", GattUtils.bytesToHexString(bArr)));
            int i = 0;
            byte b = bArr[0];
            byte b2 = bArr[1];
            if (b == 2 && b2 == 1) {
                byte b3 = bArr[2];
                byte b4 = bArr[3];
                byte b5 = bArr[4];
                long jBytesToLong = GattUtils.bytesToLong(bArr, 5, 4);
                long jBytesToLong2 = GattUtils.bytesToLong(bArr, 9, 4);
                long jBytesToLong3 = GattUtils.bytesToLong(bArr, 13, 4);
                int iBytesToInt = GattUtils.bytesToInt(bArr, 17, 2);
                int i2 = 19;
                ArrayList arrayList = new ArrayList();
                if (iBytesToInt > 0) {
                    while (true) {
                        int i3 = i + 1;
                        Calendar calendar = Calendar.getInstance();
                        j = jBytesToLong2;
                        calendar.setTimeInMillis(((long) 1000) * jBytesToLong3);
                        calendar.add(6, i);
                        int i4 = i2 + 1;
                        MenstruationState menstruationStateFromValue = MenstruationState.INSTANCE.fromValue(bArr[i2]);
                        if (menstruationStateFromValue == null) {
                            Debug.fi(TAG, "recordState no match");
                        } else {
                            long jBytesToLong4 = GattUtils.bytesToLong(bArr, i4, 4);
                            int i5 = i4 + 4;
                            arrayList.add(new MenstruationRecord(calendar, menstruationStateFromValue, jBytesToLong4));
                            if (i3 < iBytesToInt) {
                                i2 = i5;
                                i = i3;
                                jBytesToLong2 = j;
                            }
                        }
                    }
                } else {
                    j = jBytesToLong2;
                }
                menstruationTotalRecord = new MenstruationTotalRecord(b3, b4, b5, jBytesToLong, j, jBytesToLong3, iBytesToInt, arrayList);
                objM3845constructorimpl = Result.m3845constructorimpl(menstruationTotalRecord);
                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default(TAG, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    obj = null;
                } else {
                    obj = objM3845constructorimpl;
                }
                return (MenstruationTotalRecord) obj;
            }
            Debug.fi(TAG, "type or result error");
            menstruationTotalRecord = null;
            objM3845constructorimpl = Result.m3845constructorimpl(menstruationTotalRecord);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(TAG, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            obj = null;
        } else {
            obj = objM3845constructorimpl;
        }
        return (MenstruationTotalRecord) obj;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull MenstrualPeriodData[] menstrualPeriodDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(menstrualPeriodDataArr.length);
        for (MenstrualPeriodData menstrualPeriodData : menstrualPeriodDataArr) {
            byteArrayOutputStream.write(GattUtils.intToBytes((int) menstrualPeriodData.getStartTime()));
            byteArrayOutputStream.write(GattUtils.intToBytes((int) menstrualPeriodData.getStopTime()));
            byteArrayOutputStream.write(ByteUtilsKt.toByte(menstrualPeriodData.getStopped()));
        }
        return byteArrayOutputStream.toByteArray();
    }
}
