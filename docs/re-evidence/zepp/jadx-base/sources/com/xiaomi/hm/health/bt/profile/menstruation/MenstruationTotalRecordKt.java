package com.xiaomi.hm.health.bt.profile.menstruation;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "", "valid", "", "toByteArray", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class MenstruationTotalRecordKt {
    @NotNull
    public static final byte[] toByteArray(@NotNull MenstruationTotalRecord menstruationTotalRecord) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(menstruationTotalRecord.getVersion());
        byteArrayOutputStream.write(menstruationTotalRecord.getCyclePeriodDays());
        byteArrayOutputStream.write(menstruationTotalRecord.getMenstruationPeriodDays());
        byteArrayOutputStream.write(GattUtils.intToBytes((int) menstruationTotalRecord.getLastPeriodBeginDay()));
        byteArrayOutputStream.write(GattUtils.intToBytes((int) menstruationTotalRecord.getLastPeriodEndDay()));
        byteArrayOutputStream.write(GattUtils.intToBytes((int) menstruationTotalRecord.getRecordBeginDay()));
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) menstruationTotalRecord.getRecordCount()));
        for (MenstruationRecord menstruationRecord : menstruationTotalRecord.getRecords()) {
            byteArrayOutputStream.write(menstruationRecord.getMenstruationState().getValue());
            byteArrayOutputStream.write(GattUtils.intToBytes((int) menstruationRecord.getModifyTimeStamp()));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final boolean valid(@NotNull MenstruationTotalRecord menstruationTotalRecord) {
        if (menstruationTotalRecord.getRecordCount() != menstruationTotalRecord.getRecords().size()) {
            Debug.fi(MenstruationHelperKt.TAG, "record count not match!");
            return false;
        }
        if (menstruationTotalRecord.getMenstruationPeriodDays() <= 0) {
            Debug.fi(MenstruationHelperKt.TAG, "menstruationPeriodDays <= 0");
            return false;
        }
        if (menstruationTotalRecord.getLastPeriodBeginDay() < 0 || menstruationTotalRecord.getLastPeriodEndDay() < 0 || menstruationTotalRecord.getRecordBeginDay() < 0) {
            Debug.fi(MenstruationHelperKt.TAG, "timeStamp invalid");
            return false;
        }
        if (menstruationTotalRecord.getLastPeriodEndDay() >= menstruationTotalRecord.getLastPeriodBeginDay()) {
            return true;
        }
        Debug.fi(MenstruationHelperKt.TAG, "end < begin");
        return false;
    }
}
