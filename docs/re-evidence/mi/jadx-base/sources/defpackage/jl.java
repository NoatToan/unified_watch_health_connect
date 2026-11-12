package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationState;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;", "", PluginDeviceInfo.FMODEL, "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;)[B", "data", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", PluginDeviceInfo.FDESC, "totalRecord", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class jl {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.t = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "parseResponse e: " + this.t;
        }
    }

    @NotNull
    public static final byte[] a(@NotNull MenstrualPeriodData[] menstrualPeriodDataArr) throws IOException {
        Intrinsics.checkNotNullParameter(menstrualPeriodDataArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(menstrualPeriodDataArr.length);
        for (MenstrualPeriodData menstrualPeriodData : menstrualPeriodDataArr) {
            byteArrayOutputStream.write(tet.p((int) menstrualPeriodData.getStartTime()));
            byteArrayOutputStream.write(tet.p((int) menstrualPeriodData.getStopTime()));
            byteArrayOutputStream.write(c3.a(menstrualPeriodData.getStopped()));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f3  */
    @Nullable
    public static final MenstruationTotalRecord b(@NotNull byte[] data) {
        Object objM886constructorimpl;
        Throwable thM889exceptionOrNullimpl;
        Object obj;
        MenstruationTotalRecord menstruationTotalRecord;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.Companion;
            t5t.d("MenstruationDataParser", "data.size: " + data.length);
            t5t.d("MenstruationDataParser", "data: " + tet.x(data));
            int i = 0;
            byte b2 = data[0];
            byte b3 = data[1];
            if (b2 == 2 && b3 == 1) {
                byte b4 = data[2];
                byte b5 = data[3];
                byte b6 = data[4];
                long jV = tet.v(data, 5, 4);
                long jV2 = tet.v(data, 9, 4);
                long jV3 = tet.v(data, 13, 4);
                int iD = tet.d(data, 17, 2);
                ArrayList arrayList = new ArrayList();
                int i2 = 19;
                while (true) {
                    if (i >= iD) {
                        menstruationTotalRecord = new MenstruationTotalRecord(b4, b5, b6, jV, jV2, jV3, iD, arrayList);
                        break;
                    }
                    Calendar calendar = Calendar.getInstance();
                    int i3 = iD;
                    calendar.setTimeInMillis(((long) 1000) * jV3);
                    calendar.add(6, i);
                    int i4 = i2 + 1;
                    MenstruationState menstruationStateA = MenstruationState.INSTANCE.a(data[i2]);
                    if (menstruationStateA == null) {
                        t5t.d("MenstruationDataParser", "recordState no match");
                    } else {
                        long j = jV2;
                        long jV4 = tet.v(data, i4, 4);
                        i2 += 5;
                        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
                        arrayList.add(new MenstruationRecord(calendar, menstruationStateA, jV4));
                        i++;
                        iD = i3;
                        jV2 = j;
                    }
                }
                objM886constructorimpl = Result.m886constructorimpl(menstruationTotalRecord);
                thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    le.a("MenstruationDataParser", null, null, new a(thM889exceptionOrNullimpl), 6, null);
                }
                if (Result.m892isFailureimpl(objM886constructorimpl)) {
                    obj = null;
                } else {
                    obj = objM886constructorimpl;
                }
                return (MenstruationTotalRecord) obj;
            }
            t5t.d("MenstruationDataParser", "type or result error");
            menstruationTotalRecord = null;
            objM886constructorimpl = Result.m886constructorimpl(menstruationTotalRecord);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            le.a("MenstruationDataParser", null, null, new a(thM889exceptionOrNullimpl), 6, null);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            obj = null;
        } else {
            obj = objM886constructorimpl;
        }
        return (MenstruationTotalRecord) obj;
    }

    @NotNull
    public static final byte[] a(@NotNull MenstruationTotalRecord totalRecord) {
        Intrinsics.checkNotNullParameter(totalRecord, "totalRecord");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(kl.a(totalRecord));
        } catch (Exception e) {
            t5t.d("MenstruationDataParser", "toByteArray exception: " + e);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    @Nullable
    public static final MenstruationConfig a(@NotNull byte[] data) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Byte bValueOf;
        Boolean boolValueOf3;
        Boolean bool;
        Byte bValueOf2;
        Intrinsics.checkNotNullParameter(data, "data");
        t5t.d("MenstruationDataParser", "data: " + tet.x(data));
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
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
                byte b2 = byteBufferWrap.get();
                boolValueOf3 = Boolean.valueOf(((byte) (b2 & (-128))) != 0);
                bValueOf = Byte.valueOf((byte) (b2 & 127));
            } else {
                bValueOf = null;
                boolValueOf3 = null;
            }
            if (((short) (s & 8)) != 0) {
                byte b3 = byteBufferWrap.get();
                Boolean boolValueOf4 = Boolean.valueOf(((byte) (b3 & (-128))) != 0);
                bValueOf2 = Byte.valueOf((byte) (b3 & 127));
                bool = boolValueOf4;
            } else {
                bool = null;
                bValueOf2 = null;
            }
            return new MenstruationConfig(boolValueOf, boolValueOf2, boolValueOf3, bValueOf, bool, bValueOf2);
        } catch (Exception e) {
            t5t.d("MenstruationDataParser", "parseMenstruationConfig: " + e);
            return null;
        }
    }
}
